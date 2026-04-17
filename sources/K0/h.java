package k0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.fragment.app.D;
import p.l;

public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    public static final l f9454a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final Object f9455b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static D f9456c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            return f.a(packageManager, context).lastUpdateTime;
        }
        return packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static D b() {
        D d = new D(20);
        f9456c = d;
        f9454a.x(d);
        return f9456c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00b1, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x00ad */
    /* JADX WARNING: Missing exception handler attribute for start block: B:98:0x00fa */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void c(android.content.Context r19, boolean r20) {
        /*
            if (r20 != 0) goto L_0x0007
            androidx.fragment.app.D r0 = f9456c
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            java.lang.Object r1 = f9455b
            monitor-enter(r1)
            if (r20 != 0) goto L_0x0015
            androidx.fragment.app.D r0 = f9456c     // Catch:{ all -> 0x0012 }
            if (r0 == 0) goto L_0x0015
            monitor-exit(r1)     // Catch:{ all -> 0x0012 }
            return
        L_0x0012:
            r0 = move-exception
            goto L_0x0109
        L_0x0015:
            r2 = 0
            r4 = 1
            r5 = 0
            android.content.res.AssetManager r0 = r19.getAssets()     // Catch:{ IOException -> 0x0040 }
            java.lang.String r6 = "dexopt/baseline.prof"
            android.content.res.AssetFileDescriptor r6 = r0.openFd(r6)     // Catch:{ IOException -> 0x0040 }
            long r7 = r6.getLength()     // Catch:{ all -> 0x0032 }
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x002d
            r0 = r4
            goto L_0x002e
        L_0x002d:
            r0 = r5
        L_0x002e:
            r6.close()     // Catch:{ IOException -> 0x0040 }
            goto L_0x0041
        L_0x0032:
            r0 = move-exception
            r7 = r0
            if (r6 == 0) goto L_0x003f
            r6.close()     // Catch:{ all -> 0x003a }
            goto L_0x003f
        L_0x003a:
            r0 = move-exception
            r6 = r0
            r7.addSuppressed(r6)     // Catch:{ IOException -> 0x0040 }
        L_0x003f:
            throw r7     // Catch:{ IOException -> 0x0040 }
        L_0x0040:
            r0 = r5
        L_0x0041:
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0012 }
            r7 = 28
            if (r6 < r7) goto L_0x0104
            r7 = 30
            if (r6 != r7) goto L_0x004d
            goto L_0x0104
        L_0x004d:
            java.io.File r6 = new java.io.File     // Catch:{ all -> 0x0012 }
            java.io.File r7 = new java.io.File     // Catch:{ all -> 0x0012 }
            java.lang.String r8 = "/data/misc/profiles/ref/"
            java.lang.String r9 = r19.getPackageName()     // Catch:{ all -> 0x0012 }
            r7.<init>(r8, r9)     // Catch:{ all -> 0x0012 }
            java.lang.String r8 = "primary.prof"
            r6.<init>(r7, r8)     // Catch:{ all -> 0x0012 }
            long r7 = r6.length()     // Catch:{ all -> 0x0012 }
            boolean r6 = r6.exists()     // Catch:{ all -> 0x0012 }
            if (r6 == 0) goto L_0x006f
            int r6 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r6 <= 0) goto L_0x006f
            r6 = r4
            goto L_0x0070
        L_0x006f:
            r6 = r5
        L_0x0070:
            java.io.File r9 = new java.io.File     // Catch:{ all -> 0x0012 }
            java.io.File r10 = new java.io.File     // Catch:{ all -> 0x0012 }
            java.lang.String r11 = "/data/misc/profiles/cur/0/"
            java.lang.String r12 = r19.getPackageName()     // Catch:{ all -> 0x0012 }
            r10.<init>(r11, r12)     // Catch:{ all -> 0x0012 }
            java.lang.String r11 = "primary.prof"
            r9.<init>(r10, r11)     // Catch:{ all -> 0x0012 }
            long r17 = r9.length()     // Catch:{ all -> 0x0012 }
            boolean r9 = r9.exists()     // Catch:{ all -> 0x0012 }
            if (r9 == 0) goto L_0x0092
            int r2 = (r17 > r2 ? 1 : (r17 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x0092
            r2 = r4
            goto L_0x0093
        L_0x0092:
            r2 = r5
        L_0x0093:
            long r15 = a(r19)     // Catch:{ NameNotFoundException -> 0x00ff }
            java.io.File r3 = new java.io.File     // Catch:{ all -> 0x0012 }
            java.io.File r9 = r19.getFilesDir()     // Catch:{ all -> 0x0012 }
            java.lang.String r10 = "profileInstalled"
            r3.<init>(r9, r10)     // Catch:{ all -> 0x0012 }
            boolean r9 = r3.exists()     // Catch:{ all -> 0x0012 }
            if (r9 == 0) goto L_0x00b2
            k0.g r9 = k0.g.a(r3)     // Catch:{ IOException -> 0x00ad }
            goto L_0x00b3
        L_0x00ad:
            b()     // Catch:{ all -> 0x0012 }
            monitor-exit(r1)     // Catch:{ all -> 0x0012 }
            return
        L_0x00b2:
            r9 = 0
        L_0x00b3:
            r10 = 2
            if (r9 == 0) goto L_0x00c3
            long r11 = r9.f9453c     // Catch:{ all -> 0x0012 }
            int r11 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r11 != 0) goto L_0x00c3
            int r11 = r9.f9452b     // Catch:{ all -> 0x0012 }
            if (r11 != r10) goto L_0x00c1
            goto L_0x00c3
        L_0x00c1:
            r5 = r11
            goto L_0x00cf
        L_0x00c3:
            if (r0 != 0) goto L_0x00c8
            r5 = 327680(0x50000, float:4.59177E-40)
            goto L_0x00cf
        L_0x00c8:
            if (r6 == 0) goto L_0x00cc
            r5 = r4
            goto L_0x00cf
        L_0x00cc:
            if (r2 == 0) goto L_0x00cf
            r5 = r10
        L_0x00cf:
            if (r20 == 0) goto L_0x00d6
            if (r2 == 0) goto L_0x00d6
            if (r5 == r4) goto L_0x00d6
            r5 = r10
        L_0x00d6:
            if (r9 == 0) goto L_0x00e7
            int r0 = r9.f9452b     // Catch:{ all -> 0x0012 }
            if (r0 != r10) goto L_0x00e7
            if (r5 != r4) goto L_0x00e7
            long r10 = r9.d     // Catch:{ all -> 0x0012 }
            int r0 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r0 >= 0) goto L_0x00e7
            r0 = 3
            r14 = r0
            goto L_0x00e8
        L_0x00e7:
            r14 = r5
        L_0x00e8:
            k0.g r0 = new k0.g     // Catch:{ all -> 0x0012 }
            r13 = 1
            r12 = r0
            r12.<init>(r13, r14, r15, r17)     // Catch:{ all -> 0x0012 }
            if (r9 == 0) goto L_0x00f7
            boolean r2 = r9.equals(r0)     // Catch:{ all -> 0x0012 }
            if (r2 != 0) goto L_0x00fa
        L_0x00f7:
            r0.b(r3)     // Catch:{ IOException -> 0x00fa }
        L_0x00fa:
            b()     // Catch:{ all -> 0x0012 }
            monitor-exit(r1)     // Catch:{ all -> 0x0012 }
            return
        L_0x00ff:
            b()     // Catch:{ all -> 0x0012 }
            monitor-exit(r1)     // Catch:{ all -> 0x0012 }
            return
        L_0x0104:
            b()     // Catch:{ all -> 0x0012 }
            monitor-exit(r1)     // Catch:{ all -> 0x0012 }
            return
        L_0x0109:
            monitor-exit(r1)     // Catch:{ all -> 0x0012 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.h.c(android.content.Context, boolean):void");
    }
}
