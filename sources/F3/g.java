package F3;

import android.content.Context;

public final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f744a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f745b;

    public /* synthetic */ g(Context context, int i2) {
        this.f744a = i2;
        this.f745b = context;
    }

    /* JADX WARNING: type inference failed for: r2v5, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0087, code lost:
        if (r3 != null) goto L_0x008c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0096  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r11 = this;
            r0 = 0
            android.content.Context r1 = r11.f745b
            int r2 = r11.f744a
            switch(r2) {
                case 0: goto L_0x00b1;
                case 1: goto L_0x002e;
                case 2: goto L_0x0013;
                default: goto L_0x0008;
            }
        L_0x0008:
            j0.c r2 = new j0.c
            r2.<init>()
            androidx.emoji2.text.v r3 = k0.C0755d.f9442a
            k0.C0755d.t(r1, r2, r3, r0)
            return
        L_0x0013:
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.LinkedBlockingQueue r10 = new java.util.concurrent.LinkedBlockingQueue
            r10.<init>()
            r6 = 1
            r7 = 0
            r5 = 0
            r4 = r0
            r4.<init>(r5, r6, r7, r9, r10)
            F3.g r2 = new F3.g
            r3 = 3
            r2.<init>(r1, r3)
            r0.execute(r2)
            return
        L_0x002e:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 1
            r3 = 33
            if (r0 < r3) goto L_0x00ae
            android.content.ComponentName r4 = new android.content.ComponentName
            java.lang.String r5 = "androidx.appcompat.app.AppLocalesMetadataHolderService"
            r4.<init>(r1, r5)
            android.content.pm.PackageManager r5 = r1.getPackageManager()
            int r5 = r5.getComponentEnabledSetting(r4)
            if (r5 == r2) goto L_0x00ae
            java.lang.String r5 = "locale"
            if (r0 < r3) goto L_0x0085
            n.f r0 = f.n.f7794p
            r0.getClass()
            n.a r3 = new n.a
            r3.<init>((n.f) r0)
        L_0x0054:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0073
            java.lang.Object r0 = r3.next()
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            java.lang.Object r0 = r0.get()
            f.n r0 = (f.n) r0
            if (r0 == 0) goto L_0x0054
            f.z r0 = (f.z) r0
            android.content.Context r0 = r0.f7867t
            if (r0 == 0) goto L_0x0054
            java.lang.Object r0 = r0.getSystemService(r5)
            goto L_0x0074
        L_0x0073:
            r0 = 0
        L_0x0074:
            if (r0 == 0) goto L_0x008a
            android.os.LocaleList r0 = f.l.a(r0)
            G.j r3 = new G.j
            G.k r6 = new G.k
            r6.<init>(r0)
            r3.<init>(r6)
            goto L_0x008c
        L_0x0085:
            G.j r3 = f.n.f7791c
            if (r3 == 0) goto L_0x008a
            goto L_0x008c
        L_0x008a:
            G.j r3 = G.j.f804b
        L_0x008c:
            G.k r0 = r3.f805a
            android.os.LocaleList r0 = r0.f806a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00a7
            java.lang.String r0 = z.e.e(r1)
            java.lang.Object r3 = r1.getSystemService(r5)
            if (r3 == 0) goto L_0x00a7
            android.os.LocaleList r0 = f.k.a(r0)
            f.l.b(r3, r0)
        L_0x00a7:
            android.content.pm.PackageManager r0 = r1.getPackageManager()
            r0.setComponentEnabledSetting(r4, r2, r2)
        L_0x00ae:
            f.n.f7793f = r2
            return
        L_0x00b1:
            java.lang.String r2 = "$context"
            kotlin.jvm.internal.j.e(r1, r2)
            s2.e r2 = new s2.e
            r3 = 5
            r2.<init>((int) r3)
            z1.f r3 = U1.a.f3700a
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            android.os.Looper r4 = android.os.Looper.myLooper()
            if (r3 != r4) goto L_0x00d3
            U1.b r3 = new U1.b
            r3.<init>(r1, r2)
            java.lang.Void[] r0 = new java.lang.Void[r0]
            r3.execute(r0)
            return
        L_0x00d3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Must be called on the UI thread"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: F3.g.run():void");
    }
}
