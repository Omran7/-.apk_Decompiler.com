package p;

import B2.b;
import G.g;
import android.support.v4.media.session.a;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import o3.d;

public abstract class h implements b {
    public static final boolean d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e  reason: collision with root package name */
    public static final Logger f10956e;

    /* renamed from: f  reason: collision with root package name */
    public static final a f10957f;

    /* renamed from: p  reason: collision with root package name */
    public static final Object f10958p = new Object();

    /* renamed from: a  reason: collision with root package name */
    public volatile Object f10959a;

    /* renamed from: b  reason: collision with root package name */
    public volatile C0901d f10960b;

    /* renamed from: c  reason: collision with root package name */
    public volatile C0904g f10961c;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: p.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: p.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: p.e} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.String r0 = "b"
            java.lang.String r1 = "a"
            java.lang.Class<p.g> r2 = p.C0904g.class
            java.lang.String r3 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r4 = "false"
            java.lang.String r3 = java.lang.System.getProperty(r3, r4)
            boolean r3 = java.lang.Boolean.parseBoolean(r3)
            d = r3
            java.lang.Class<p.h> r3 = p.h.class
            java.lang.String r4 = r3.getName()
            java.util.logging.Logger r4 = java.util.logging.Logger.getLogger(r4)
            f10956e = r4
            p.e r4 = new p.e     // Catch:{ all -> 0x0044 }
            java.lang.Class<java.lang.Thread> r5 = java.lang.Thread.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r5, r1)     // Catch:{ all -> 0x0044 }
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r2, r0)     // Catch:{ all -> 0x0044 }
            java.lang.String r5 = "c"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r3, r2, r5)     // Catch:{ all -> 0x0044 }
            java.lang.Class<p.d> r2 = p.C0901d.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r9 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r3, r2, r0)     // Catch:{ all -> 0x0044 }
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r10 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r3, r0, r1)     // Catch:{ all -> 0x0044 }
            r5 = r4
            r5.<init>(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0044 }
            r0 = 0
            goto L_0x004a
        L_0x0044:
            r0 = move-exception
            p.f r4 = new p.f
            r4.<init>()
        L_0x004a:
            f10957f = r4
            if (r0 == 0) goto L_0x0057
            java.util.logging.Logger r1 = f10956e
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "SafeAtomicHelper is broken!"
            r1.log(r2, r3, r0)
        L_0x0057:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            f10958p = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p.h.<clinit>():void");
    }

    public static void k(h hVar) {
        C0904g gVar;
        C0901d dVar;
        C0901d dVar2;
        C0901d dVar3;
        do {
            gVar = hVar.f10961c;
        } while (!f10957f.f(hVar, gVar, C0904g.f10953c));
        while (true) {
            dVar = null;
            if (gVar == null) {
                break;
            }
            Thread thread = gVar.f10954a;
            if (thread != null) {
                gVar.f10954a = null;
                LockSupport.unpark(thread);
            }
            gVar = gVar.f10955b;
        }
        hVar.j();
        do {
            dVar2 = hVar.f10960b;
        } while (!f10957f.d(hVar, dVar2, C0901d.d));
        while (true) {
            dVar3 = dVar;
            dVar = dVar2;
            if (dVar == null) {
                break;
            }
            dVar2 = dVar.f10948c;
            dVar.f10948c = dVar3;
        }
        while (dVar3 != null) {
            C0901d dVar4 = dVar3.f10948c;
            m(dVar3.f10946a, dVar3.f10947b);
            dVar3 = dVar4;
        }
    }

    public static void m(B2.a aVar, g gVar) {
        try {
            gVar.execute(aVar);
        } catch (RuntimeException e6) {
            Level level = Level.SEVERE;
            f10956e.log(level, "RuntimeException while executing runnable " + aVar + " with executor " + gVar, e6);
        }
    }

    public static Object n(Object obj) {
        if (obj instanceof C0898a) {
            CancellationException cancellationException = ((C0898a) obj).f10943b;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        } else if (obj instanceof C0900c) {
            throw new ExecutionException(((C0900c) obj).f10945a);
        } else if (obj == f10958p) {
            return null;
        } else {
            return obj;
        }
    }

    public static Object t(h hVar) {
        Object obj;
        boolean z3 = false;
        while (true) {
            try {
                obj = hVar.get();
                break;
            } catch (InterruptedException unused) {
                z3 = true;
            } catch (Throwable th) {
                if (z3) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z3) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public final void a(B2.a aVar, g gVar) {
        C0901d dVar = this.f10960b;
        C0901d dVar2 = C0901d.d;
        if (dVar != dVar2) {
            C0901d dVar3 = new C0901d(aVar, gVar);
            do {
                dVar3.f10948c = dVar;
                if (!f10957f.d(this, dVar, dVar3)) {
                    dVar = this.f10960b;
                } else {
                    return;
                }
            } while (dVar != dVar2);
        }
        m(aVar, gVar);
    }

    public final boolean cancel(boolean z3) {
        C0898a aVar;
        Object obj = this.f10959a;
        if (obj != null) {
            return false;
        }
        if (d) {
            aVar = new C0898a(z3, new CancellationException("Future.cancel() was called."));
        } else if (z3) {
            aVar = C0898a.f10941c;
        } else {
            aVar = C0898a.d;
        }
        if (!f10957f.e(this, obj, aVar)) {
            return false;
        }
        k(this);
        return true;
    }

    public final void e(StringBuilder sb) {
        String str;
        try {
            Object t6 = t(this);
            sb.append("SUCCESS, result=[");
            if (t6 == this) {
                str = "this future";
            } else {
                str = String.valueOf(t6);
            }
            sb.append(str);
            sb.append("]");
        } catch (ExecutionException e6) {
            sb.append("FAILURE, cause=[");
            sb.append(e6.getCause());
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e7) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e7.getClass());
            sb.append(" thrown from get()]");
        }
    }

    public final Object get(long j6, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j6);
        if (!Thread.interrupted()) {
            Object obj = this.f10959a;
            if (obj != null) {
                return n(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                C0904g gVar = this.f10961c;
                C0904g gVar2 = C0904g.f10953c;
                if (gVar != gVar2) {
                    C0904g gVar3 = new C0904g();
                    do {
                        a aVar = f10957f;
                        aVar.r0(gVar3, gVar);
                        if (aVar.f(this, gVar, gVar3)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f10959a;
                                    if (obj2 != null) {
                                        return n(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    w(gVar3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            w(gVar3);
                        } else {
                            gVar = this.f10961c;
                        }
                    } while (gVar != gVar2);
                }
                return n(this.f10959a);
            }
            while (nanos > 0) {
                Object obj3 = this.f10959a;
                if (obj3 != null) {
                    return n(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String hVar = toString();
            String obj4 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj4.toLowerCase(locale);
            String str = "Waited " + j6 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String f6 = d.f(str, " (plus ");
                long j7 = -nanos;
                long convert = timeUnit.convert(j7, TimeUnit.NANOSECONDS);
                long nanos2 = j7 - timeUnit.toNanos(convert);
                int i2 = (convert > 0 ? 1 : (convert == 0 ? 0 : -1));
                boolean z3 = i2 == 0 || nanos2 > 1000;
                if (i2 > 0) {
                    String str2 = f6 + convert + " " + lowerCase;
                    if (z3) {
                        str2 = d.f(str2, ",");
                    }
                    f6 = d.f(str2, " ");
                }
                if (z3) {
                    f6 = f6 + nanos2 + " nanoseconds ";
                }
                str = d.f(f6, "delay)");
            }
            if (isDone()) {
                throw new TimeoutException(d.f(str, " but future completed as timeout expired"));
            }
            throw new TimeoutException(d.g(str, " for ", hVar));
        }
        throw new InterruptedException();
    }

    public final boolean isCancelled() {
        return this.f10959a instanceof C0898a;
    }

    public final boolean isDone() {
        if (this.f10959a != null) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f10959a instanceof C0898a) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            e(sb);
        } else {
            try {
                str = v();
            } catch (RuntimeException e6) {
                str = "Exception thrown from implementation: " + e6.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                e(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public String v() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void w(C0904g gVar) {
        gVar.f10954a = null;
        while (true) {
            C0904g gVar2 = this.f10961c;
            if (gVar2 != C0904g.f10953c) {
                C0904g gVar3 = null;
                while (gVar2 != null) {
                    C0904g gVar4 = gVar2.f10955b;
                    if (gVar2.f10954a != null) {
                        gVar3 = gVar2;
                    } else if (gVar3 != null) {
                        gVar3.f10955b = gVar4;
                        if (gVar3.f10954a == null) {
                        }
                    } else if (!f10957f.f(this, gVar2, gVar4)) {
                    }
                    gVar2 = gVar4;
                }
                return;
            }
            return;
        }
    }

    public boolean x(Object obj) {
        if (obj == null) {
            obj = f10958p;
        }
        if (!f10957f.e(this, (Object) null, obj)) {
            return false;
        }
        k(this);
        return true;
    }

    public boolean y(Throwable th) {
        th.getClass();
        if (!f10957f.e(this, (Object) null, new C0900c(th))) {
            return false;
        }
        k(this);
        return true;
    }

    public void j() {
    }

    public final Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f10959a;
            if (obj2 != null) {
                return n(obj2);
            }
            C0904g gVar = this.f10961c;
            C0904g gVar2 = C0904g.f10953c;
            if (gVar != gVar2) {
                C0904g gVar3 = new C0904g();
                do {
                    a aVar = f10957f;
                    aVar.r0(gVar3, gVar);
                    if (aVar.f(this, gVar, gVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f10959a;
                            } else {
                                w(gVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return n(obj);
                    }
                    gVar = this.f10961c;
                } while (gVar != gVar2);
            }
            return n(this.f10959a);
        }
        throw new InterruptedException();
    }
}
