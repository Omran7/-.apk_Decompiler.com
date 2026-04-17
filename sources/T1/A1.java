package T1;

public final class A1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2800a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f2801b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ E1 f2802c;

    public /* synthetic */ A1(E1 e12, long j6, int i2) {
        this.f2800a = i2;
        this.f2801b = j6;
        this.f2802c = e12;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00ad, code lost:
        if (r1.f3313C.b() != false) goto L_0x00af;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r12 = this;
            int r0 = r12.f2800a
            switch(r0) {
                case 0: goto L_0x0058;
                default: goto L_0x0005;
            }
        L_0x0005:
            T1.E1 r0 = r12.f2802c
            r0.o()
            r0.s()
            java.lang.Object r1 = r0.f398a
            T1.u0 r1 = (T1.C0212u0) r1
            T1.Z r2 = r1.f3496r
            T1.C0212u0.k(r2)
            long r7 = r12.f2801b
            java.lang.Long r3 = java.lang.Long.valueOf(r7)
            T1.X r2 = r2.f3180w
            java.lang.String r4 = "Activity paused, time"
            r2.b(r3, r4)
            T1.B1 r2 = new T1.B1
            I3.h r10 = r0.f2829p
            java.lang.Object r3 = r10.f1180c
            r11 = r3
            T1.E1 r11 = (T1.E1) r11
            java.lang.Object r3 = r11.f398a
            T1.u0 r3 = (T1.C0212u0) r3
            G1.b r3 = r3.f3501w
            r3.getClass()
            long r5 = java.lang.System.currentTimeMillis()
            r9 = 0
            r3 = r2
            r4 = r10
            r3.<init>(r4, r5, r7, r9)
            r10.f1179b = r2
            com.google.android.gms.internal.measurement.zzcr r3 = r11.f2826c
            r4 = 2000(0x7d0, double:9.88E-321)
            r3.postDelayed(r2, r4)
            T1.g r1 = r1.f3494p
            boolean r1 = r1.C()
            if (r1 == 0) goto L_0x0057
            T1.D1 r0 = r0.f2828f
            T1.C1 r0 = r0.f2823c
            r0.a()
        L_0x0057:
            return
        L_0x0058:
            T1.E1 r0 = r12.f2802c
            r0.o()
            r0.s()
            java.lang.Object r1 = r0.f398a
            T1.u0 r1 = (T1.C0212u0) r1
            T1.Z r2 = r1.f3496r
            T1.C0212u0.k(r2)
            long r3 = r12.f2801b
            java.lang.Long r5 = java.lang.Long.valueOf(r3)
            T1.X r2 = r2.f3180w
            java.lang.String r6 = "Activity resumed, time"
            r2.b(r5, r6)
            T1.G r2 = T1.H.f2894a1
            T1.g r5 = r1.f3494p
            r6 = 0
            boolean r2 = r5.B(r6, r2)
            T1.D1 r7 = r0.f2828f
            if (r2 == 0) goto L_0x009c
            boolean r1 = r5.C()
            if (r1 != 0) goto L_0x008d
            boolean r1 = r0.d
            if (r1 == 0) goto L_0x00bd
        L_0x008d:
            T1.E1 r1 = r7.d
            r1.o()
            T1.C1 r1 = r7.f2823c
            r1.a()
            r7.f2821a = r3
            r7.f2822b = r3
            goto L_0x00bd
        L_0x009c:
            boolean r2 = r5.C()
            if (r2 != 0) goto L_0x00af
            T1.h0 r1 = r1.f3495q
            T1.C0212u0.i(r1)
            T1.f0 r1 = r1.f3313C
            boolean r1 = r1.b()
            if (r1 == 0) goto L_0x00bd
        L_0x00af:
            T1.E1 r1 = r7.d
            r1.o()
            T1.C1 r1 = r7.f2823c
            r1.a()
            r7.f2821a = r3
            r7.f2822b = r3
        L_0x00bd:
            I3.h r1 = r0.f2829p
            java.lang.Object r2 = r1.f1180c
            T1.E1 r2 = (T1.E1) r2
            r2.o()
            java.lang.Object r1 = r1.f1179b
            T1.B1 r1 = (T1.B1) r1
            if (r1 == 0) goto L_0x00d1
            com.google.android.gms.internal.measurement.zzcr r3 = r2.f2826c
            r3.removeCallbacks(r1)
        L_0x00d1:
            java.lang.Object r1 = r2.f398a
            T1.u0 r1 = (T1.C0212u0) r1
            T1.h0 r3 = r1.f3495q
            T1.C0212u0.i(r3)
            T1.f0 r3 = r3.f3313C
            r4 = 0
            r3.a(r4)
            r2.o()
            r2.d = r4
            T1.G r2 = T1.H.f2891Z0
            T1.g r3 = r1.f3494p
            boolean r2 = r3.B(r6, r2)
            if (r2 == 0) goto L_0x010a
            T1.b1 r2 = r1.f3503y
            T1.C0212u0.j(r2)
            boolean r3 = r2.f3254w
            if (r3 == 0) goto L_0x010a
            T1.Z r1 = r1.f3496r
            T1.C0212u0.k(r1)
            java.lang.String r3 = "Retrying trigger URI registration in foreground"
            T1.X r1 = r1.f3180w
            r1.a(r3)
            T1.C0212u0.j(r2)
            r2.C()
        L_0x010a:
            T1.A r0 = r0.f2827e
            java.lang.Object r1 = r0.f2796b
            T1.E1 r1 = (T1.E1) r1
            r1.o()
            java.lang.Object r1 = r1.f398a
            T1.u0 r1 = (T1.C0212u0) r1
            boolean r2 = r1.a()
            if (r2 != 0) goto L_0x011e
            goto L_0x012a
        L_0x011e:
            G1.b r1 = r1.f3501w
            r1.getClass()
            long r1 = java.lang.System.currentTimeMillis()
            r0.w(r1, r4)
        L_0x012a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.A1.run():void");
    }
}
