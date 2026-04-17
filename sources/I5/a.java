package I5;

import G5.C0;
import H5.b;
import com.bumptech.glide.c;
import com.google.android.gms.common.api.f;
import h0.C0552a;
import kotlin.jvm.internal.j;
import o5.i;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final u f1244a = new u("NO_DECISION", 0);

    /* renamed from: b  reason: collision with root package name */
    public static final u f1245b = new u("CLOSED", 0);

    /* renamed from: c  reason: collision with root package name */
    public static final u f1246c = new u("UNDEFINED", 0);
    public static final u d = new u("REUSABLE_CLAIMED", 0);

    /* renamed from: e  reason: collision with root package name */
    public static final u f1247e = new u("CONDITION_FALSE", 0);

    /* renamed from: f  reason: collision with root package name */
    public static final u f1248f = new u("NO_THREAD_ELEMENTS", 0);

    /* JADX WARNING: Incorrect type for immutable var: ssa=M5.k, code=I5.t, for r4v0, types: [M5.k] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(I5.t r4, long r5, x5.p r7) {
        /*
        L_0x0000:
            long r0 = r4.f1278c
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x000e
            boolean r0 = r4.b()
            if (r0 == 0) goto L_0x000d
            goto L_0x000e
        L_0x000d:
            return r4
        L_0x000e:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = I5.d.f1251a
            java.lang.Object r0 = r0.get(r4)
            I5.u r1 = f1245b
            if (r0 != r1) goto L_0x0019
            return r1
        L_0x0019:
            I5.d r0 = (I5.d) r0
            I5.t r0 = (I5.t) r0
            if (r0 == 0) goto L_0x0021
        L_0x001f:
            r4 = r0
            goto L_0x0000
        L_0x0021:
            long r0 = r4.f1278c
            r2 = 1
            long r0 = r0 + r2
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object r0 = r7.invoke(r0, r4)
            I5.t r0 = (I5.t) r0
        L_0x0030:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = I5.d.f1251a
            r2 = 0
            boolean r2 = r1.compareAndSet(r4, r2, r0)
            if (r2 == 0) goto L_0x0043
            boolean r1 = r4.b()
            if (r1 == 0) goto L_0x001f
            r4.c()
            goto L_0x001f
        L_0x0043:
            java.lang.Object r1 = r1.get(r4)
            if (r1 == 0) goto L_0x0030
            goto L_0x0000
        */
        throw new UnsupportedOperationException("Method not decompiled: I5.a.a(M5.k, long, x5.p):java.lang.Object");
    }

    public static final t b(Object obj) {
        if (obj != f1245b) {
            return (t) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void c(i iVar, Throwable th) {
        Throwable th2;
        for (b j6 : f.f1254a) {
            try {
                j6.j(iVar, th);
            } catch (Throwable th3) {
                if (th == th3) {
                    th2 = th;
                } else {
                    th2 = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                    c.a(th2, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th2);
            }
        }
        try {
            c.a(th, new g(iVar));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static final void d(i iVar, Object obj) {
        if (obj != f1248f) {
            if (obj instanceof y) {
                y yVar = (y) obj;
                C0[] c0Arr = yVar.f1288b;
                int length = c0Arr.length - 1;
                if (length >= 0) {
                    C0 c02 = c0Arr[length];
                    j.b((Object) null);
                    Object obj2 = yVar.f1287a[length];
                    throw null;
                }
                return;
            }
            Object fold = iVar.fold((Object) null, w.f1283c);
            j.c(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            C0552a.y(fold);
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a1, code lost:
        if (r4.M() != false) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b7, code lost:
        if (r4.M() != false) goto L_0x00b9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(o5.d r8, java.lang.Object r9, x5.l r10) {
        /*
            boolean r0 = r8 instanceof I5.h
            if (r0 == 0) goto L_0x00c6
            I5.h r8 = (I5.h) r8
            java.lang.Throwable r0 = m5.C0847f.a(r9)
            if (r0 != 0) goto L_0x0016
            if (r10 == 0) goto L_0x0014
            G5.v r0 = new G5.v
            r0.<init>(r9, r10)
            goto L_0x001d
        L_0x0014:
            r0 = r9
            goto L_0x001d
        L_0x0016:
            G5.u r10 = new G5.u
            r1 = 0
            r10.<init>(r1, r0)
            r0 = r10
        L_0x001d:
            q5.c r10 = r8.f1257e
            r10.getContext()
            G5.A r1 = r8.d
            boolean r2 = r1.k()
            r3 = 1
            if (r2 == 0) goto L_0x0038
            r8.f1258f = r0
            r8.f876c = r3
            o5.i r9 = r10.getContext()
            r1.j(r9, r8)
            goto L_0x00c9
        L_0x0038:
            G5.Y r1 = G5.D0.a()
            long r4 = r1.f891c
            r6 = 4294967296(0x100000000, double:2.121995791E-314)
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L_0x005b
            r8.f1258f = r0
            r8.f876c = r3
            n5.e r9 = r1.f892e
            if (r9 != 0) goto L_0x0056
            n5.e r9 = new n5.e
            r9.<init>()
            r1.f892e = r9
        L_0x0056:
            r9.addLast(r8)
            goto L_0x00c9
        L_0x005b:
            r1.n(r3)
            r2 = 0
            o5.i r3 = r10.getContext()     // Catch:{ all -> 0x0082 }
            G5.B r4 = G5.B.f856b     // Catch:{ all -> 0x0082 }
            o5.g r3 = r3.get(r4)     // Catch:{ all -> 0x0082 }
            G5.h0 r3 = (G5.C0034h0) r3     // Catch:{ all -> 0x0082 }
            if (r3 == 0) goto L_0x0084
            boolean r4 = r3.isActive()     // Catch:{ all -> 0x0082 }
            if (r4 != 0) goto L_0x0084
            java.util.concurrent.CancellationException r9 = r3.getCancellationException()     // Catch:{ all -> 0x0082 }
            r8.e(r0, r9)     // Catch:{ all -> 0x0082 }
            m5.e r9 = I1.b.r(r9)     // Catch:{ all -> 0x0082 }
            r8.resumeWith(r9)     // Catch:{ all -> 0x0082 }
            goto L_0x00a6
        L_0x0082:
            r9 = move-exception
            goto L_0x00bd
        L_0x0084:
            java.lang.Object r0 = r8.f1259p     // Catch:{ all -> 0x0082 }
            o5.i r3 = r10.getContext()     // Catch:{ all -> 0x0082 }
            java.lang.Object r0 = i(r3, r0)     // Catch:{ all -> 0x0082 }
            I5.u r4 = f1248f     // Catch:{ all -> 0x0082 }
            if (r0 == r4) goto L_0x0097
            G5.H0 r4 = G5.F.v(r10, r3, r0)     // Catch:{ all -> 0x0082 }
            goto L_0x0098
        L_0x0097:
            r4 = r2
        L_0x0098:
            r10.resumeWith(r9)     // Catch:{ all -> 0x00b0 }
            if (r4 == 0) goto L_0x00a3
            boolean r9 = r4.M()     // Catch:{ all -> 0x0082 }
            if (r9 == 0) goto L_0x00a6
        L_0x00a3:
            d(r3, r0)     // Catch:{ all -> 0x0082 }
        L_0x00a6:
            boolean r9 = r1.o()     // Catch:{ all -> 0x0082 }
            if (r9 != 0) goto L_0x00a6
        L_0x00ac:
            r1.l()
            goto L_0x00c9
        L_0x00b0:
            r9 = move-exception
            if (r4 == 0) goto L_0x00b9
            boolean r10 = r4.M()     // Catch:{ all -> 0x0082 }
            if (r10 == 0) goto L_0x00bc
        L_0x00b9:
            d(r3, r0)     // Catch:{ all -> 0x0082 }
        L_0x00bc:
            throw r9     // Catch:{ all -> 0x0082 }
        L_0x00bd:
            r8.i(r9, r2)     // Catch:{ all -> 0x00c1 }
            goto L_0x00ac
        L_0x00c1:
            r8 = move-exception
            r1.l()
            throw r8
        L_0x00c6:
            r8.resumeWith(r9)
        L_0x00c9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: I5.a.e(o5.d, java.lang.Object, x5.l):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0091 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long g(java.lang.String r23, long r24, long r26, long r28) {
        /*
            r0 = r23
            r1 = r26
            r3 = r28
            r5 = 1
            int r6 = I5.v.f1281a
            java.lang.String r7 = java.lang.System.getProperty(r23)     // Catch:{ SecurityException -> 0x000e }
            goto L_0x000f
        L_0x000e:
            r7 = 0
        L_0x000f:
            if (r7 != 0) goto L_0x0015
            r8 = r24
            goto L_0x00ae
        L_0x0015:
            int r8 = r7.length()
            if (r8 != 0) goto L_0x001f
        L_0x001b:
            r15 = r7
        L_0x001c:
            r6 = 0
            goto L_0x009c
        L_0x001f:
            r9 = 0
            char r10 = r7.charAt(r9)
            r11 = 48
            if (r10 >= r11) goto L_0x002a
            r11 = -1
            goto L_0x002f
        L_0x002a:
            if (r10 != r11) goto L_0x002e
            r11 = r9
            goto L_0x002f
        L_0x002e:
            r11 = r5
        L_0x002f:
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r11 >= 0) goto L_0x0040
            if (r8 != r5) goto L_0x0039
            goto L_0x001b
        L_0x0039:
            r11 = 45
            if (r10 != r11) goto L_0x0042
            r12 = -9223372036854775808
            r9 = r5
        L_0x0040:
            r10 = r9
            goto L_0x0048
        L_0x0042:
            r11 = 43
            if (r10 != r11) goto L_0x001b
            r10 = r9
            r9 = r5
        L_0x0048:
            r16 = 0
            r5 = r16
            r17 = -256204778801521550(0xfc71c71c71c71c72, double:-2.772000429909333E291)
        L_0x0051:
            if (r9 >= r8) goto L_0x0091
            char r11 = r7.charAt(r9)
            r14 = 10
            int r11 = java.lang.Character.digit(r11, r14)
            if (r11 >= 0) goto L_0x0060
            goto L_0x001b
        L_0x0060:
            int r15 = (r5 > r17 ? 1 : (r5 == r17 ? 0 : -1))
            if (r15 >= 0) goto L_0x0078
            r19 = -256204778801521550(0xfc71c71c71c71c72, double:-2.772000429909333E291)
            int r15 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r15 != 0) goto L_0x001b
            r15 = r7
            r25 = r8
            long r7 = (long) r14
            long r17 = r12 / r7
            int r7 = (r5 > r17 ? 1 : (r5 == r17 ? 0 : -1))
            if (r7 >= 0) goto L_0x0080
        L_0x0077:
            goto L_0x001c
        L_0x0078:
            r15 = r7
            r25 = r8
            r19 = -256204778801521550(0xfc71c71c71c71c72, double:-2.772000429909333E291)
        L_0x0080:
            long r7 = (long) r14
            long r5 = r5 * r7
            long r7 = (long) r11
            long r21 = r12 + r7
            int r11 = (r5 > r21 ? 1 : (r5 == r21 ? 0 : -1))
            if (r11 >= 0) goto L_0x008a
            goto L_0x0077
        L_0x008a:
            long r5 = r5 - r7
            r7 = 1
            int r9 = r9 + r7
            r8 = r25
            r7 = r15
            goto L_0x0051
        L_0x0091:
            r15 = r7
            if (r10 == 0) goto L_0x009a
        L_0x0094:
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r6 = r5
            goto L_0x009c
        L_0x009a:
            long r5 = -r5
            goto L_0x0094
        L_0x009c:
            r5 = 39
            java.lang.String r7 = "System property '"
            if (r6 == 0) goto L_0x00e0
            long r8 = r6.longValue()
            int r6 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r6 > 0) goto L_0x00af
            int r6 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r6 > 0) goto L_0x00af
        L_0x00ae:
            return r8
        L_0x00af:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r7)
            r10.append(r0)
            java.lang.String r0 = "' should be in range "
            r10.append(r0)
            r10.append(r1)
            java.lang.String r0 = ".."
            r10.append(r0)
            r10.append(r3)
            java.lang.String r0 = ", but is '"
            r10.append(r0)
            r10.append(r8)
            r10.append(r5)
            java.lang.String r0 = r10.toString()
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L_0x00e0:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r7)
            r2.append(r0)
            java.lang.String r0 = "' has unrecognized value '"
            r2.append(r0)
            r6 = r15
            r2.append(r6)
            r2.append(r5)
            java.lang.String r0 = r2.toString()
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: I5.a.g(java.lang.String, long, long, long):long");
    }

    public static int h(String str, int i2, int i5, int i6, int i7) {
        if ((i7 & 4) != 0) {
            i5 = 1;
        }
        if ((i7 & 8) != 0) {
            i6 = f.API_PRIORITY_OTHER;
        }
        return (int) g(str, (long) i2, (long) i5, (long) i6);
    }

    public static final Object i(i iVar, Object obj) {
        if (obj == null) {
            obj = iVar.fold(0, w.f1282b);
            j.b(obj);
        }
        if (obj == 0) {
            return f1248f;
        }
        if (obj instanceof Integer) {
            return iVar.fold(new y(iVar, ((Number) obj).intValue()), w.d);
        }
        C0552a.y(obj);
        throw null;
    }
}
