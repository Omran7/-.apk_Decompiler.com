package C;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import com.bumptech.glide.d;
import java.lang.reflect.Method;
import n.i;

public abstract class k {

    /* renamed from: a  reason: collision with root package name */
    public static final d f380a;

    /* renamed from: b  reason: collision with root package name */
    public static final i f381b = new i(16);

    static {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            f380a = new d();
        } else if (i2 >= 28) {
            f380a = new n();
        } else if (i2 >= 26) {
            f380a = new n();
        } else {
            Method method = m.f389l;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                f380a = new d();
            } else {
                f380a = new d();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002e, code lost:
        if (r4.equals(r5) == false) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface a(android.content.Context r16, B.e r17, android.content.res.Resources r18, int r19, java.lang.String r20, int r21, int r22, B.b r23, boolean r24) {
        /*
            r0 = r16
            r1 = r17
            r7 = r22
            r2 = r23
            r3 = 3
            r8 = 1
            r9 = 0
            boolean r4 = r1 instanceof B.h
            r10 = -3
            if (r4 == 0) goto L_0x018a
            B.h r1 = (B.h) r1
            java.lang.String r4 = r1.d
            r11 = 0
            if (r4 == 0) goto L_0x0031
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L_0x001e
            goto L_0x0031
        L_0x001e:
            android.graphics.Typeface r4 = android.graphics.Typeface.create(r4, r9)
            android.graphics.Typeface r5 = android.graphics.Typeface.DEFAULT
            android.graphics.Typeface r5 = android.graphics.Typeface.create(r5, r9)
            if (r4 == 0) goto L_0x0031
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0031
            goto L_0x0032
        L_0x0031:
            r4 = r11
        L_0x0032:
            if (r4 == 0) goto L_0x0048
            if (r2 == 0) goto L_0x0047
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            B.m r1 = new B.m
            r1.<init>(r2, r4, r9)
            r0.post(r1)
        L_0x0047:
            return r4
        L_0x0048:
            if (r24 == 0) goto L_0x0052
            int r4 = r1.f152c
            if (r4 != 0) goto L_0x0050
        L_0x004e:
            r4 = r8
            goto L_0x0055
        L_0x0050:
            r4 = r9
            goto L_0x0055
        L_0x0052:
            if (r2 != 0) goto L_0x0050
            goto L_0x004e
        L_0x0055:
            r5 = -1
            if (r24 == 0) goto L_0x005c
            int r6 = r1.f151b
            r12 = r6
            goto L_0x005d
        L_0x005c:
            r12 = r5
        L_0x005d:
            android.os.Handler r6 = new android.os.Handler
            android.os.Looper r13 = android.os.Looper.getMainLooper()
            r6.<init>(r13)
            x1.i r13 = new x1.i
            r14 = 2
            r13.<init>((int) r14)
            r13.f12553b = r2
            F3.k r14 = r1.f150a
            I3.h r15 = new I3.h
            r1 = 7
            r15.<init>(r13, r6, r1, r9)
            if (r4 == 0) goto L_0x00fb
            n.i r1 = H.g.f976a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Object r2 = r14.f772f
            java.lang.String r2 = (java.lang.String) r2
            r1.append(r2)
            java.lang.String r2 = "-"
            r1.append(r2)
            r1.append(r7)
            java.lang.String r2 = r1.toString()
            n.i r1 = H.g.f976a
            java.lang.Object r1 = r1.get(r2)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L_0x00a7
            B2.a r0 = new B2.a
            r0.<init>((java.lang.Object) r13, (java.lang.Object) r1, (int) r3)
            r6.post(r0)
        L_0x00a4:
            r11 = r1
            goto L_0x0185
        L_0x00a7:
            if (r12 != r5) goto L_0x00b4
            H.f r0 = H.g.a(r2, r0, r14, r7)
            r15.D(r0)
            android.graphics.Typeface r11 = r0.f974a
            goto L_0x0185
        L_0x00b4:
            H.d r8 = new H.d
            r6 = 0
            r1 = r8
            r3 = r16
            r4 = r14
            r5 = r22
            r1.<init>(r2, r3, r4, r5, r6)
            java.util.concurrent.ThreadPoolExecutor r0 = H.g.f977b     // Catch:{ InterruptedException -> 0x00e9 }
            java.util.concurrent.Future r0 = r0.submit(r8)     // Catch:{ InterruptedException -> 0x00e9 }
            long r1 = (long) r12
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ ExecutionException -> 0x00d8, InterruptedException -> 0x00d6, TimeoutException -> 0x00da }
            java.lang.Object r0 = r0.get(r1, r3)     // Catch:{ ExecutionException -> 0x00d8, InterruptedException -> 0x00d6, TimeoutException -> 0x00da }
            H.f r0 = (H.f) r0     // Catch:{ InterruptedException -> 0x00e9 }
            r15.D(r0)     // Catch:{ InterruptedException -> 0x00e9 }
            android.graphics.Typeface r11 = r0.f974a     // Catch:{ InterruptedException -> 0x00e9 }
            goto L_0x0185
        L_0x00d6:
            r0 = move-exception
            goto L_0x00e2
        L_0x00d8:
            r0 = move-exception
            goto L_0x00e3
        L_0x00da:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException     // Catch:{ InterruptedException -> 0x00e9 }
            java.lang.String r1 = "timeout"
            r0.<init>(r1)     // Catch:{ InterruptedException -> 0x00e9 }
            throw r0     // Catch:{ InterruptedException -> 0x00e9 }
        L_0x00e2:
            throw r0     // Catch:{ InterruptedException -> 0x00e9 }
        L_0x00e3:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ InterruptedException -> 0x00e9 }
            r1.<init>(r0)     // Catch:{ InterruptedException -> 0x00e9 }
            throw r1     // Catch:{ InterruptedException -> 0x00e9 }
        L_0x00e9:
            H.a r0 = new H.a
            java.lang.Object r1 = r15.f1179b
            x1.i r1 = (x1.i) r1
            r0.<init>((java.lang.Object) r1, (int) r10, (int) r9)
            java.lang.Object r1 = r15.f1180c
            android.os.Handler r1 = (android.os.Handler) r1
            r1.post(r0)
            goto L_0x0185
        L_0x00fb:
            n.i r1 = H.g.f976a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Object r2 = r14.f772f
            java.lang.String r2 = (java.lang.String) r2
            r1.append(r2)
            java.lang.String r2 = "-"
            r1.append(r2)
            r1.append(r7)
            java.lang.String r10 = r1.toString()
            n.i r1 = H.g.f976a
            java.lang.Object r1 = r1.get(r10)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L_0x0129
            B2.a r0 = new B2.a
            r0.<init>((java.lang.Object) r13, (java.lang.Object) r1, (int) r3)
            r6.post(r0)
            goto L_0x00a4
        L_0x0129:
            H.e r1 = new H.e
            r1.<init>(r15, r9)
            java.lang.Object r3 = H.g.f978c
            monitor-enter(r3)
            n.j r2 = H.g.d     // Catch:{ all -> 0x0140 }
            java.lang.Object r4 = r2.get(r10)     // Catch:{ all -> 0x0140 }
            java.util.ArrayList r4 = (java.util.ArrayList) r4     // Catch:{ all -> 0x0140 }
            if (r4 == 0) goto L_0x0142
            r4.add(r1)     // Catch:{ all -> 0x0140 }
            monitor-exit(r3)     // Catch:{ all -> 0x0140 }
            goto L_0x0185
        L_0x0140:
            r0 = move-exception
            goto L_0x0188
        L_0x0142:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0140 }
            r4.<init>()     // Catch:{ all -> 0x0140 }
            r4.add(r1)     // Catch:{ all -> 0x0140 }
            r2.put(r10, r4)     // Catch:{ all -> 0x0140 }
            monitor-exit(r3)     // Catch:{ all -> 0x0140 }
            H.d r12 = new H.d
            r6 = 1
            r1 = r12
            r2 = r10
            r3 = r16
            r4 = r14
            r5 = r22
            r1.<init>(r2, r3, r4, r5, r6)
            java.util.concurrent.ThreadPoolExecutor r0 = H.g.f977b
            H.e r1 = new H.e
            r1.<init>(r10, r8)
            android.os.Looper r2 = android.os.Looper.myLooper()
            if (r2 != 0) goto L_0x0172
            android.os.Handler r2 = new android.os.Handler
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            r2.<init>(r3)
            goto L_0x0177
        L_0x0172:
            android.os.Handler r2 = new android.os.Handler
            r2.<init>()
        L_0x0177:
            H.j r3 = new H.j
            r3.<init>(r9)
            r3.f985b = r12
            r3.f986c = r1
            r3.d = r2
            r0.execute(r3)
        L_0x0185:
            r4 = r18
            goto L_0x01ad
        L_0x0188:
            monitor-exit(r3)     // Catch:{ all -> 0x0140 }
            throw r0
        L_0x018a:
            com.bumptech.glide.d r3 = f380a
            B.f r1 = (B.f) r1
            r4 = r18
            android.graphics.Typeface r11 = r3.k(r0, r1, r4, r7)
            if (r2 == 0) goto L_0x01ad
            if (r11 == 0) goto L_0x01aa
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            B.m r1 = new B.m
            r1.<init>(r2, r11, r9)
            r0.post(r1)
            goto L_0x01ad
        L_0x01aa:
            r2.a(r10)
        L_0x01ad:
            if (r11 == 0) goto L_0x01b8
            n.i r0 = f381b
            java.lang.String r1 = b(r18, r19, r20, r21, r22)
            r0.put(r1, r11)
        L_0x01b8:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: C.k.a(android.content.Context, B.e, android.content.res.Resources, int, java.lang.String, int, int, B.b, boolean):android.graphics.Typeface");
    }

    public static String b(Resources resources, int i2, String str, int i5, int i6) {
        return resources.getResourcePackageName(i2) + '-' + str + '-' + i5 + '-' + i2 + '-' + i6;
    }
}
