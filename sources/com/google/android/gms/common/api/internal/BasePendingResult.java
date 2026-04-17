package com.google.android.gms.common.api.internal;

import A5.b;
import android.os.Looper;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.p;
import com.google.android.gms.common.api.q;
import com.google.android.gms.common.api.s;
import com.google.android.gms.common.api.t;
import com.google.android.gms.common.api.u;
import com.google.android.gms.common.api.v;
import com.google.android.gms.common.internal.C0387p;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.base.zau;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public abstract class BasePendingResult<R extends s> extends q {
    static final ThreadLocal zaa = new b(8);
    public static final /* synthetic */ int zad = 0;
    private c0 resultGuardian;
    protected final C0352f zab;
    protected final WeakReference zac;
    private final Object zae = new Object();
    private final CountDownLatch zaf = new CountDownLatch(1);
    private final ArrayList zag = new ArrayList();
    private t zah;
    private final AtomicReference zai = new AtomicReference();
    /* access modifiers changed from: private */
    public s zaj;
    private Status zak;
    private volatile boolean zal;
    private boolean zam;
    private boolean zan;
    private C0387p zao;
    private volatile U zap;
    private boolean zaq = false;

    /* JADX WARNING: type inference failed for: r1v1, types: [com.google.android.gms.internal.base.zau, com.google.android.gms.common.api.internal.f] */
    public BasePendingResult(o oVar) {
        Looper looper;
        if (oVar != null) {
            looper = ((K) oVar).f6046b.getLooper();
        } else {
            looper = Looper.getMainLooper();
        }
        this.zab = new zau(looper);
        this.zac = new WeakReference(oVar);
    }

    public static void zal(s sVar) {
    }

    public final s a() {
        s sVar;
        synchronized (this.zae) {
            I.i("Result has already been consumed.", !this.zal);
            I.i("Result is not ready.", isReady());
            sVar = this.zaj;
            this.zaj = null;
            this.zah = null;
            this.zal = true;
        }
        if (this.zai.getAndSet((Object) null) == null) {
            I.g(sVar);
            return sVar;
        }
        throw new ClassCastException();
    }

    public final void addStatusListener(p pVar) {
        boolean z3;
        if (pVar != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        I.a("Callback cannot be null.", z3);
        synchronized (this.zae) {
            try {
                if (isReady()) {
                    pVar.a(this.zak);
                } else {
                    this.zag.add(pVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @ResultIgnorabilityUnspecified
    public final R await() {
        I.f("await must not be called on the UI thread");
        boolean z3 = true;
        I.i("Result has already been consumed", !this.zal);
        if (this.zap != null) {
            z3 = false;
        }
        I.i("Cannot await if then() has been called.", z3);
        try {
            this.zaf.await();
        } catch (InterruptedException unused) {
            forceFailureUnlessReady(Status.f6003f);
        }
        I.i("Result is not ready.", isReady());
        return a();
    }

    public final void b(s sVar) {
        this.zaj = sVar;
        this.zak = sVar.getStatus();
        this.zaf.countDown();
        if (this.zam) {
            this.zah = null;
        } else {
            t tVar = this.zah;
            if (tVar != null) {
                this.zab.removeMessages(2);
                this.zab.a(tVar, a());
            }
        }
        ArrayList arrayList = this.zag;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((p) arrayList.get(i2)).a(this.zak);
        }
        this.zag.clear();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0022, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void cancel() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.zae
            monitor-enter(r0)
            boolean r1 = r2.zam     // Catch:{ all -> 0x001f }
            if (r1 != 0) goto L_0x0021
            boolean r1 = r2.zal     // Catch:{ all -> 0x001f }
            if (r1 == 0) goto L_0x000c
            goto L_0x0021
        L_0x000c:
            com.google.android.gms.common.api.s r1 = r2.zaj     // Catch:{ all -> 0x001f }
            zal(r1)     // Catch:{ all -> 0x001f }
            r1 = 1
            r2.zam = r1     // Catch:{ all -> 0x001f }
            com.google.android.gms.common.api.Status r1 = com.google.android.gms.common.api.Status.f6006r     // Catch:{ all -> 0x001f }
            com.google.android.gms.common.api.s r1 = r2.createFailedResult(r1)     // Catch:{ all -> 0x001f }
            r2.b(r1)     // Catch:{ all -> 0x001f }
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            return
        L_0x001f:
            r1 = move-exception
            goto L_0x0023
        L_0x0021:
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            return
        L_0x0023:
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.cancel():void");
    }

    public abstract R createFailedResult(Status status);

    @Deprecated
    public final void forceFailureUnlessReady(Status status) {
        synchronized (this.zae) {
            try {
                if (!isReady()) {
                    setResult(createFailedResult(status));
                    this.zan = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean isCanceled() {
        boolean z3;
        synchronized (this.zae) {
            z3 = this.zam;
        }
        return z3;
    }

    public final boolean isReady() {
        if (this.zaf.getCount() == 0) {
            return true;
        }
        return false;
    }

    public final void setCancelToken(C0387p pVar) {
        synchronized (this.zae) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setResultCallback(com.google.android.gms.common.api.t r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.zae
            monitor-enter(r0)
            if (r5 != 0) goto L_0x000c
            r5 = 0
            r4.zah = r5     // Catch:{ all -> 0x000a }
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            return
        L_0x000a:
            r5 = move-exception
            goto L_0x003c
        L_0x000c:
            boolean r1 = r4.zal     // Catch:{ all -> 0x000a }
            r2 = 1
            r1 = r1 ^ r2
            java.lang.String r3 = "Result has already been consumed."
            com.google.android.gms.common.internal.I.i(r3, r1)     // Catch:{ all -> 0x000a }
            com.google.android.gms.common.api.internal.U r1 = r4.zap     // Catch:{ all -> 0x000a }
            if (r1 != 0) goto L_0x001a
            goto L_0x001b
        L_0x001a:
            r2 = 0
        L_0x001b:
            java.lang.String r1 = "Cannot set callbacks if then() has been called."
            com.google.android.gms.common.internal.I.i(r1, r2)     // Catch:{ all -> 0x000a }
            boolean r1 = r4.isCanceled()     // Catch:{ all -> 0x000a }
            if (r1 == 0) goto L_0x0028
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            return
        L_0x0028:
            boolean r1 = r4.isReady()     // Catch:{ all -> 0x000a }
            if (r1 == 0) goto L_0x0038
            com.google.android.gms.common.api.internal.f r1 = r4.zab     // Catch:{ all -> 0x000a }
            com.google.android.gms.common.api.s r2 = r4.a()     // Catch:{ all -> 0x000a }
            r1.a(r5, r2)     // Catch:{ all -> 0x000a }
            goto L_0x003a
        L_0x0038:
            r4.zah = r5     // Catch:{ all -> 0x000a }
        L_0x003a:
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            return
        L_0x003c:
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.setResultCallback(com.google.android.gms.common.api.t):void");
    }

    public final <S extends s> v then(u uVar) {
        boolean z3;
        U u6;
        I.i("Result has already been consumed.", !this.zal);
        synchronized (this.zae) {
            try {
                boolean z4 = false;
                if (this.zap == null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                I.i("Cannot call then() twice.", z3);
                if (this.zah == null) {
                    z4 = true;
                }
                I.i("Cannot call then() if callbacks are set.", z4);
                I.i("Cannot call then() if result was canceled.", !this.zam);
                this.zaq = true;
                this.zap = new U(this.zac);
                U u7 = this.zap;
                synchronized (u7.f6065b) {
                    u6 = new U(u7.f6066c);
                    u7.f6064a = u6;
                }
                if (isReady()) {
                    this.zab.a(this.zap, a());
                } else {
                    this.zah = this.zap;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return u6;
    }

    public final void zak() {
        boolean z3 = true;
        if (!this.zaq && !((Boolean) zaa.get()).booleanValue()) {
            z3 = false;
        }
        this.zaq = z3;
    }

    public final boolean zam() {
        boolean isCanceled;
        synchronized (this.zae) {
            try {
                if (((o) this.zac.get()) != null) {
                    if (!this.zaq) {
                    }
                    isCanceled = isCanceled();
                }
                cancel();
                isCanceled = isCanceled();
            } catch (Throwable th) {
                throw th;
            }
        }
        return isCanceled;
    }

    public final void zan(V v6) {
        this.zai.set(v6);
    }

    public final void setResult(R r6) {
        synchronized (this.zae) {
            try {
                if (this.zan || this.zam) {
                    zal(r6);
                    return;
                }
                isReady();
                I.i("Results have already been set", !isReady());
                I.i("Result has already been consumed", !this.zal);
                b(r6);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @ResultIgnorabilityUnspecified
    public final R await(long j6, TimeUnit timeUnit) {
        if (j6 > 0) {
            I.f("await must not be called on the UI thread when time is greater than zero.");
        }
        boolean z3 = true;
        I.i("Result has already been consumed.", !this.zal);
        if (this.zap != null) {
            z3 = false;
        }
        I.i("Cannot await if then() has been called.", z3);
        try {
            if (!this.zaf.await(j6, timeUnit)) {
                forceFailureUnlessReady(Status.f6005q);
            }
        } catch (InterruptedException unused) {
            forceFailureUnlessReady(Status.f6003f);
        }
        I.i("Result is not ready.", isReady());
        return a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0049, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setResultCallback(com.google.android.gms.common.api.t r5, long r6, java.util.concurrent.TimeUnit r8) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.zae
            monitor-enter(r0)
            if (r5 != 0) goto L_0x000c
            r5 = 0
            r4.zah = r5     // Catch:{ all -> 0x000a }
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            return
        L_0x000a:
            r5 = move-exception
            goto L_0x004a
        L_0x000c:
            boolean r1 = r4.zal     // Catch:{ all -> 0x000a }
            r2 = 1
            r1 = r1 ^ r2
            java.lang.String r3 = "Result has already been consumed."
            com.google.android.gms.common.internal.I.i(r3, r1)     // Catch:{ all -> 0x000a }
            com.google.android.gms.common.api.internal.U r1 = r4.zap     // Catch:{ all -> 0x000a }
            if (r1 != 0) goto L_0x001a
            goto L_0x001b
        L_0x001a:
            r2 = 0
        L_0x001b:
            java.lang.String r1 = "Cannot set callbacks if then() has been called."
            com.google.android.gms.common.internal.I.i(r1, r2)     // Catch:{ all -> 0x000a }
            boolean r1 = r4.isCanceled()     // Catch:{ all -> 0x000a }
            if (r1 == 0) goto L_0x0028
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            return
        L_0x0028:
            boolean r1 = r4.isReady()     // Catch:{ all -> 0x000a }
            if (r1 == 0) goto L_0x0038
            com.google.android.gms.common.api.internal.f r6 = r4.zab     // Catch:{ all -> 0x000a }
            com.google.android.gms.common.api.s r7 = r4.a()     // Catch:{ all -> 0x000a }
            r6.a(r5, r7)     // Catch:{ all -> 0x000a }
            goto L_0x0048
        L_0x0038:
            r4.zah = r5     // Catch:{ all -> 0x000a }
            com.google.android.gms.common.api.internal.f r5 = r4.zab     // Catch:{ all -> 0x000a }
            long r6 = r8.toMillis(r6)     // Catch:{ all -> 0x000a }
            r8 = 2
            android.os.Message r8 = r5.obtainMessage(r8, r4)     // Catch:{ all -> 0x000a }
            r5.sendMessageDelayed(r8, r6)     // Catch:{ all -> 0x000a }
        L_0x0048:
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            return
        L_0x004a:
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.setResultCallback(com.google.android.gms.common.api.t, long, java.util.concurrent.TimeUnit):void");
    }
}
