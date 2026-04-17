package H;

import B0.C0003b;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import n.i;
import n.j;

public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    public static final i f976a = new i(16);

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadPoolExecutor f977b;

    /* renamed from: c  reason: collision with root package name */
    public static final Object f978c = new Object();
    public static final j d = new j(0);

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, (long) 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new C0003b(1));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f977b = threadPoolExecutor;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static H.f a(java.lang.String r6, android.content.Context r7, F3.k r8, int r9) {
        /*
            n.i r0 = f976a
            java.lang.Object r1 = r0.get(r6)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L_0x0010
            H.f r6 = new H.f
            r6.<init>((android.graphics.Typeface) r1)
            return r6
        L_0x0010:
            B0.l r8 = H.c.a(r7, r8)     // Catch:{ NameNotFoundException -> 0x005c }
            r1 = 1
            r2 = -3
            java.lang.Object r3 = r8.f247c
            H.h[] r3 = (H.h[]) r3
            int r8 = r8.f246b
            if (r8 == 0) goto L_0x0024
            if (r8 == r1) goto L_0x0022
        L_0x0020:
            r1 = r2
            goto L_0x003d
        L_0x0022:
            r1 = -2
            goto L_0x003d
        L_0x0024:
            if (r3 == 0) goto L_0x003d
            int r8 = r3.length
            if (r8 != 0) goto L_0x002a
            goto L_0x003d
        L_0x002a:
            int r8 = r3.length
            r1 = 0
            r4 = r1
        L_0x002d:
            if (r4 >= r8) goto L_0x003d
            r5 = r3[r4]
            int r5 = r5.f982e
            if (r5 == 0) goto L_0x003a
            if (r5 >= 0) goto L_0x0038
            goto L_0x0020
        L_0x0038:
            r1 = r5
            goto L_0x003d
        L_0x003a:
            int r4 = r4 + 1
            goto L_0x002d
        L_0x003d:
            if (r1 == 0) goto L_0x0045
            H.f r6 = new H.f
            r6.<init>((int) r1)
            return r6
        L_0x0045:
            com.bumptech.glide.d r8 = C.k.f380a
            android.graphics.Typeface r7 = r8.l(r7, r3, r9)
            if (r7 == 0) goto L_0x0056
            r0.put(r6, r7)
            H.f r6 = new H.f
            r6.<init>((android.graphics.Typeface) r7)
            return r6
        L_0x0056:
            H.f r6 = new H.f
            r6.<init>((int) r2)
            return r6
        L_0x005c:
            H.f r6 = new H.f
            r7 = -1
            r6.<init>((int) r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: H.g.a(java.lang.String, android.content.Context, F3.k, int):H.f");
    }
}
