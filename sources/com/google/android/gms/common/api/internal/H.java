package com.google.android.gms.common.api.internal;

import B0.C0004c;
import H.a;
import T1.A;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.internal.C0380i;
import com.google.android.gms.common.internal.C0390t;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.tasks.TaskCompletionSource;
import h0.C0552a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import o3.d;
import z1.C1132b;
import z1.e;

public final class H implements m, n {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedList f6028a = new LinkedList();

    /* renamed from: b  reason: collision with root package name */
    public final g f6029b;

    /* renamed from: c  reason: collision with root package name */
    public final C0347a f6030c;
    public final D d;

    /* renamed from: e  reason: collision with root package name */
    public final HashSet f6031e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    public final HashMap f6032f = new HashMap();
    public final int h;

    /* renamed from: i  reason: collision with root package name */
    public final Q f6033i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f6034j;

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList f6035k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    public C1132b f6036l = null;

    /* renamed from: m  reason: collision with root package name */
    public int f6037m = 0;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ C0354h f6038n;

    public H(C0354h hVar, l lVar) {
        this.f6038n = hVar;
        g zab = lVar.zab(hVar.f6103n.getLooper(), this);
        this.f6029b = zab;
        this.f6030c = lVar.getApiKey();
        this.d = new D();
        this.h = lVar.zaa();
        if (zab.requiresSignIn()) {
            this.f6033i = lVar.zac(hVar.f6096e, hVar.f6103n);
            return;
        }
        this.f6033i = null;
    }

    public final void a(int i2) {
        Looper myLooper = Looper.myLooper();
        C0354h hVar = this.f6038n;
        if (myLooper == hVar.f6103n.getLooper()) {
            h(i2);
        } else {
            hVar.f6103n.post(new a((Object) this, i2, 2));
        }
    }

    public final void b(C1132b bVar) {
        p(bVar, (RuntimeException) null);
    }

    public final void c(C1132b bVar) {
        HashSet hashSet = this.f6031e;
        Iterator it2 = hashSet.iterator();
        if (!it2.hasNext()) {
            hashSet.clear();
        } else if (it2.next() == null) {
            if (I.j(bVar, C1132b.f12799e)) {
                this.f6029b.getEndpointPackageName();
            }
            throw null;
        } else {
            throw new ClassCastException();
        }
    }

    public final void d(Status status) {
        I.c(this.f6038n.f6103n);
        e(status, (RuntimeException) null, false);
    }

    public final void e(Status status, RuntimeException runtimeException, boolean z3) {
        boolean z4;
        I.c(this.f6038n.f6103n);
        boolean z5 = true;
        if (status != null) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (runtimeException != null) {
            z5 = false;
        }
        if (z4 != z5) {
            Iterator it2 = this.f6028a.iterator();
            while (it2.hasNext()) {
                Z z6 = (Z) it2.next();
                if (!z3 || z6.f6072a == 2) {
                    if (status != null) {
                        z6.a(status);
                    } else {
                        z6.b(runtimeException);
                    }
                    it2.remove();
                }
            }
            return;
        }
        throw new IllegalArgumentException("Status XOR exception should be null");
    }

    public final void f() {
        LinkedList linkedList = this.f6028a;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Z z3 = (Z) arrayList.get(i2);
            if (this.f6029b.isConnected()) {
                if (k(z3)) {
                    linkedList.remove(z3);
                }
                i2++;
            } else {
                return;
            }
        }
    }

    public final void g() {
        C0354h hVar = this.f6038n;
        I.c(hVar.f6103n);
        this.f6036l = null;
        c(C1132b.f12799e);
        if (this.f6034j) {
            zau zau = hVar.f6103n;
            C0347a aVar = this.f6030c;
            zau.removeMessages(11, aVar);
            hVar.f6103n.removeMessages(9, aVar);
            this.f6034j = false;
        }
        Iterator it2 = this.f6032f.values().iterator();
        if (!it2.hasNext()) {
            f();
            i();
            return;
        }
        throw d.e(it2);
    }

    public final void h(int i2) {
        C0354h hVar = this.f6038n;
        I.c(hVar.f6103n);
        this.f6036l = null;
        this.f6034j = true;
        String lastDisconnectMessage = this.f6029b.getLastDisconnectMessage();
        D d6 = this.d;
        d6.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i2 == 1) {
            sb.append(" due to service disconnection.");
        } else if (i2 == 3) {
            sb.append(" due to dead object exception.");
        }
        if (lastDisconnectMessage != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(lastDisconnectMessage);
        }
        d6.a(new Status(20, sb.toString(), (PendingIntent) null, (C1132b) null), true);
        zau zau = hVar.f6103n;
        C0347a aVar = this.f6030c;
        zau.sendMessageDelayed(Message.obtain(zau, 9, aVar), 5000);
        zau zau2 = hVar.f6103n;
        zau2.sendMessageDelayed(Message.obtain(zau2, 11, aVar), 120000);
        ((SparseIntArray) hVar.g.f4209b).clear();
        Iterator it2 = this.f6032f.values().iterator();
        if (it2.hasNext()) {
            C0552a.y(it2.next());
            throw null;
        }
    }

    public final void i() {
        C0354h hVar = this.f6038n;
        zau zau = hVar.f6103n;
        C0347a aVar = this.f6030c;
        zau.removeMessages(12, aVar);
        zau zau2 = hVar.f6103n;
        zau2.sendMessageDelayed(zau2.obtainMessage(12, aVar), hVar.f6093a);
    }

    public final void j() {
        Looper myLooper = Looper.myLooper();
        C0354h hVar = this.f6038n;
        if (myLooper == hVar.f6103n.getLooper()) {
            g();
        } else {
            hVar.f6103n.post(new C0004c((Object) this, 21));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean k(com.google.android.gms.common.api.internal.Z r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof com.google.android.gms.common.api.internal.M
            java.lang.String r1 = "DeadObjectException thrown while running ApiCallRunner."
            r2 = 1
            if (r0 != 0) goto L_0x001d
            com.google.android.gms.common.api.g r0 = r14.f6029b
            boolean r3 = r0.requiresSignIn()
            com.google.android.gms.common.api.internal.D r4 = r14.d
            r15.d(r4, r3)
            r15.c(r14)     // Catch:{ DeadObjectException -> 0x0016 }
            goto L_0x001c
        L_0x0016:
            r14.a(r2)
            r0.disconnect(r1)
        L_0x001c:
            return r2
        L_0x001d:
            r0 = r15
            com.google.android.gms.common.api.internal.M r0 = (com.google.android.gms.common.api.internal.M) r0
            z1.d[] r3 = r0.g(r14)
            r4 = 0
            r5 = 0
            if (r3 == 0) goto L_0x0072
            int r6 = r3.length
            if (r6 != 0) goto L_0x002c
            goto L_0x0072
        L_0x002c:
            com.google.android.gms.common.api.g r6 = r14.f6029b
            z1.d[] r6 = r6.getAvailableFeatures()
            if (r6 != 0) goto L_0x0036
            z1.d[] r6 = new z1.d[r4]
        L_0x0036:
            n.e r7 = new n.e
            int r8 = r6.length
            r7.<init>(r8)
            r8 = r4
        L_0x003d:
            int r9 = r6.length
            if (r8 >= r9) goto L_0x0052
            r9 = r6[r8]
            java.lang.String r10 = r9.f12806a
            long r11 = r9.v()
            java.lang.Long r9 = java.lang.Long.valueOf(r11)
            r7.put(r10, r9)
            int r8 = r8 + 1
            goto L_0x003d
        L_0x0052:
            int r6 = r3.length
            r8 = r4
        L_0x0054:
            if (r8 >= r6) goto L_0x0072
            r9 = r3[r8]
            java.lang.String r10 = r9.f12806a
            java.lang.Object r10 = r7.get(r10)
            java.lang.Long r10 = (java.lang.Long) r10
            if (r10 == 0) goto L_0x0073
            long r10 = r10.longValue()
            long r12 = r9.v()
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L_0x006f
            goto L_0x0073
        L_0x006f:
            int r8 = r8 + 1
            goto L_0x0054
        L_0x0072:
            r9 = r5
        L_0x0073:
            if (r9 != 0) goto L_0x008b
            com.google.android.gms.common.api.g r0 = r14.f6029b
            boolean r3 = r0.requiresSignIn()
            com.google.android.gms.common.api.internal.D r4 = r14.d
            r15.d(r4, r3)
            r15.c(r14)     // Catch:{ DeadObjectException -> 0x0084 }
            goto L_0x008a
        L_0x0084:
            r14.a(r2)
            r0.disconnect(r1)
        L_0x008a:
            return r2
        L_0x008b:
            com.google.android.gms.common.api.g r15 = r14.f6029b
            java.lang.Class r15 = r15.getClass()
            java.lang.String r15 = r15.getName()
            java.lang.String r1 = r9.f12806a
            long r6 = r9.v()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r15)
            java.lang.String r15 = " could not execute call because it requires feature ("
            r3.append(r15)
            r3.append(r1)
            java.lang.String r15 = ", "
            r3.append(r15)
            r3.append(r6)
            java.lang.String r15 = ")."
            r3.append(r15)
            java.lang.String r15 = r3.toString()
            java.lang.String r1 = "GoogleApiManager"
            android.util.Log.w(r1, r15)
            com.google.android.gms.common.api.internal.h r15 = r14.f6038n
            boolean r15 = r15.f6104o
            if (r15 == 0) goto L_0x012f
            boolean r15 = r0.f(r14)
            if (r15 == 0) goto L_0x012f
            com.google.android.gms.common.api.internal.a r15 = r14.f6030c
            com.google.android.gms.common.api.internal.I r0 = new com.google.android.gms.common.api.internal.I
            r0.<init>(r15, r9)
            java.util.ArrayList r15 = r14.f6035k
            int r15 = r15.indexOf(r0)
            r1 = 5000(0x1388, double:2.4703E-320)
            r3 = 15
            if (r15 < 0) goto L_0x00fb
            java.util.ArrayList r0 = r14.f6035k
            java.lang.Object r15 = r0.get(r15)
            com.google.android.gms.common.api.internal.I r15 = (com.google.android.gms.common.api.internal.I) r15
            com.google.android.gms.common.api.internal.h r0 = r14.f6038n
            com.google.android.gms.internal.base.zau r0 = r0.f6103n
            r0.removeMessages(r3, r15)
            com.google.android.gms.common.api.internal.h r0 = r14.f6038n
            com.google.android.gms.internal.base.zau r0 = r0.f6103n
            android.os.Message r15 = android.os.Message.obtain(r0, r3, r15)
            r0.sendMessageDelayed(r15, r1)
            goto L_0x012e
        L_0x00fb:
            java.util.ArrayList r15 = r14.f6035k
            r15.add(r0)
            com.google.android.gms.common.api.internal.h r15 = r14.f6038n
            com.google.android.gms.internal.base.zau r15 = r15.f6103n
            android.os.Message r3 = android.os.Message.obtain(r15, r3, r0)
            r15.sendMessageDelayed(r3, r1)
            com.google.android.gms.common.api.internal.h r15 = r14.f6038n
            com.google.android.gms.internal.base.zau r15 = r15.f6103n
            r1 = 16
            android.os.Message r0 = android.os.Message.obtain(r15, r1, r0)
            r1 = 120000(0x1d4c0, double:5.9288E-319)
            r15.sendMessageDelayed(r0, r1)
            z1.b r15 = new z1.b
            r0 = 2
            r15.<init>(r0, r5)
            boolean r0 = r14.l(r15)
            if (r0 != 0) goto L_0x012e
            com.google.android.gms.common.api.internal.h r0 = r14.f6038n
            int r1 = r14.h
            r0.d(r15, r1)
        L_0x012e:
            return r4
        L_0x012f:
            com.google.android.gms.common.api.w r15 = new com.google.android.gms.common.api.w
            r15.<init>(r9)
            r0.b(r15)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.H.k(com.google.android.gms.common.api.internal.Z):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0043, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0048, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean l(z1.C1132b r6) {
        /*
            r5 = this;
            java.lang.Object r0 = com.google.android.gms.common.api.internal.C0354h.f6091r
            monitor-enter(r0)
            com.google.android.gms.common.api.internal.h r1 = r5.f6038n     // Catch:{ all -> 0x0045 }
            com.google.android.gms.common.api.internal.E r2 = r1.f6100k     // Catch:{ all -> 0x0045 }
            if (r2 == 0) goto L_0x0047
            n.f r1 = r1.f6101l     // Catch:{ all -> 0x0045 }
            com.google.android.gms.common.api.internal.a r2 = r5.f6030c     // Catch:{ all -> 0x0045 }
            boolean r1 = r1.contains(r2)     // Catch:{ all -> 0x0045 }
            if (r1 == 0) goto L_0x0047
            com.google.android.gms.common.api.internal.h r1 = r5.f6038n     // Catch:{ all -> 0x0045 }
            com.google.android.gms.common.api.internal.E r1 = r1.f6100k     // Catch:{ all -> 0x0045 }
            int r2 = r5.h     // Catch:{ all -> 0x0045 }
            r1.getClass()     // Catch:{ all -> 0x0045 }
            com.google.android.gms.common.api.internal.a0 r3 = new com.google.android.gms.common.api.internal.a0     // Catch:{ all -> 0x0045 }
            r3.<init>(r6, r2)     // Catch:{ all -> 0x0045 }
        L_0x0021:
            java.util.concurrent.atomic.AtomicReference r6 = r1.f6020b     // Catch:{ all -> 0x0045 }
        L_0x0023:
            r2 = 0
            boolean r2 = r6.compareAndSet(r2, r3)     // Catch:{ all -> 0x0045 }
            if (r2 == 0) goto L_0x0036
            com.google.android.gms.internal.base.zau r6 = r1.f6021c     // Catch:{ all -> 0x0045 }
            com.google.android.gms.common.api.internal.b0 r2 = new com.google.android.gms.common.api.internal.b0     // Catch:{ all -> 0x0045 }
            r4 = 0
            r2.<init>(r1, r3, r4)     // Catch:{ all -> 0x0045 }
            r6.post(r2)     // Catch:{ all -> 0x0045 }
            goto L_0x0042
        L_0x0036:
            java.lang.Object r2 = r6.get()     // Catch:{ all -> 0x0045 }
            if (r2 == 0) goto L_0x0023
            java.lang.Object r6 = r6.get()     // Catch:{ all -> 0x0045 }
            if (r6 == 0) goto L_0x0021
        L_0x0042:
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            r6 = 1
            return r6
        L_0x0045:
            r6 = move-exception
            goto L_0x004a
        L_0x0047:
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            r6 = 0
            return r6
        L_0x004a:
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.H.l(z1.b):boolean");
    }

    public final boolean m(boolean z3) {
        I.c(this.f6038n.f6103n);
        g gVar = this.f6029b;
        if (!gVar.isConnected() || !this.f6032f.isEmpty()) {
            return false;
        }
        D d6 = this.d;
        if (((Map) d6.f6017a).isEmpty() && ((Map) d6.f6018b).isEmpty()) {
            gVar.disconnect("Timing out service connection.");
            return true;
        } else if (!z3) {
            return false;
        } else {
            i();
            return false;
        }
    }

    public final void n() {
        C0354h hVar = this.f6038n;
        I.c(hVar.f6103n);
        g gVar = this.f6029b;
        if (!gVar.isConnected() && !gVar.isConnecting()) {
            try {
                X4.d dVar = hVar.g;
                Context context = hVar.f6096e;
                dVar.getClass();
                I.g(context);
                int i2 = 0;
                if (gVar.requiresGooglePlayServices()) {
                    int minApkVersion = gVar.getMinApkVersion();
                    SparseIntArray sparseIntArray = (SparseIntArray) dVar.f4209b;
                    int i5 = sparseIntArray.get(minApkVersion, -1);
                    if (i5 != -1) {
                        i2 = i5;
                    } else {
                        int i6 = 0;
                        while (true) {
                            if (i6 >= sparseIntArray.size()) {
                                i2 = -1;
                                break;
                            }
                            int keyAt = sparseIntArray.keyAt(i6);
                            if (keyAt > minApkVersion && sparseIntArray.get(keyAt) == 0) {
                                break;
                            }
                            i6++;
                        }
                        if (i2 == -1) {
                            i2 = ((e) dVar.f4210c).c(context, minApkVersion);
                        }
                        sparseIntArray.put(minApkVersion, i2);
                    }
                }
                if (i2 != 0) {
                    C1132b bVar = new C1132b(i2, (PendingIntent) null);
                    Log.w("GoogleApiManager", "The service for " + gVar.getClass().getName() + " is not available: " + bVar.toString());
                    p(bVar, (RuntimeException) null);
                    return;
                }
                J j6 = new J(hVar, gVar, this.f6030c);
                if (gVar.requiresSignIn()) {
                    Q q6 = this.f6033i;
                    I.g(q6);
                    W1.a aVar = q6.f6062f;
                    if (aVar != null) {
                        aVar.disconnect();
                    }
                    Integer valueOf = Integer.valueOf(System.identityHashCode(q6));
                    C0380i iVar = q6.f6061e;
                    iVar.g = valueOf;
                    Handler handler = q6.f6059b;
                    q6.f6062f = (W1.a) q6.f6060c.buildClient(q6.f6058a, handler.getLooper(), iVar, (Object) iVar.f6177f, (m) q6, (n) q6);
                    q6.h = j6;
                    Set set = q6.d;
                    if (set == null || set.isEmpty()) {
                        handler.post(new C0004c((Object) q6, 23));
                    } else {
                        W1.a aVar2 = q6.f6062f;
                        aVar2.getClass();
                        aVar2.connect(new C0390t(aVar2));
                    }
                }
                try {
                    gVar.connect(j6);
                } catch (SecurityException e6) {
                    p(new C1132b(10), e6);
                }
            } catch (IllegalStateException e7) {
                p(new C1132b(10), e7);
            }
        }
    }

    public final void o(Z z3) {
        I.c(this.f6038n.f6103n);
        boolean isConnected = this.f6029b.isConnected();
        LinkedList linkedList = this.f6028a;
        if (!isConnected) {
            linkedList.add(z3);
            C1132b bVar = this.f6036l;
            if (bVar == null || bVar.f12801b == 0 || bVar.f12802c == null) {
                n();
            } else {
                p(bVar, (RuntimeException) null);
            }
        } else if (k(z3)) {
            i();
        } else {
            linkedList.add(z3);
        }
    }

    public final void p(C1132b bVar, RuntimeException runtimeException) {
        W1.a aVar;
        I.c(this.f6038n.f6103n);
        Q q6 = this.f6033i;
        if (!(q6 == null || (aVar = q6.f6062f) == null)) {
            aVar.disconnect();
        }
        I.c(this.f6038n.f6103n);
        this.f6036l = null;
        ((SparseIntArray) this.f6038n.g.f4209b).clear();
        c(bVar);
        if ((this.f6029b instanceof B1.d) && bVar.f12801b != 24) {
            C0354h hVar = this.f6038n;
            hVar.f6094b = true;
            zau zau = hVar.f6103n;
            zau.sendMessageDelayed(zau.obtainMessage(19), 300000);
        }
        if (bVar.f12801b == 4) {
            d(C0354h.f6090q);
        } else if (this.f6028a.isEmpty()) {
            this.f6036l = bVar;
        } else if (runtimeException != null) {
            I.c(this.f6038n.f6103n);
            e((Status) null, runtimeException, false);
        } else if (this.f6038n.f6104o) {
            e(C0354h.e(this.f6030c, bVar), (RuntimeException) null, true);
            if (!this.f6028a.isEmpty() && !l(bVar) && !this.f6038n.d(bVar, this.h)) {
                if (bVar.f12801b == 18) {
                    this.f6034j = true;
                }
                if (this.f6034j) {
                    C0354h hVar2 = this.f6038n;
                    C0347a aVar2 = this.f6030c;
                    zau zau2 = hVar2.f6103n;
                    zau2.sendMessageDelayed(Message.obtain(zau2, 9, aVar2), 5000);
                    return;
                }
                d(C0354h.e(this.f6030c, bVar));
            }
        } else {
            d(C0354h.e(this.f6030c, bVar));
        }
    }

    public final void q(C1132b bVar) {
        I.c(this.f6038n.f6103n);
        g gVar = this.f6029b;
        String name = gVar.getClass().getName();
        String valueOf = String.valueOf(bVar);
        gVar.disconnect("onSignInFailed for " + name + " with " + valueOf);
        p(bVar, (RuntimeException) null);
    }

    public final void r() {
        I.c(this.f6038n.f6103n);
        Status status = C0354h.f6089p;
        d(status);
        this.d.a(status, false);
        for (C0360n y6 : (C0360n[]) this.f6032f.keySet().toArray(new C0360n[0])) {
            o(new Y(y6, new TaskCompletionSource()));
        }
        c(new C1132b(4));
        g gVar = this.f6029b;
        if (gVar.isConnected()) {
            gVar.onUserSignOut(new A((Object) this, 21));
        }
    }
}
