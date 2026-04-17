package T1;

public final class V0 extends C0194o {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f3126e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ C0157b1 f3127f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ V0(C0157b1 b1Var, F0 f02, int i2) {
        super(f02);
        this.f3126e = i2;
        this.f3127f = b1Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0123, code lost:
        if (r0.v0() >= 234200) goto L_0x0125;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x02a9  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x02c6  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x02e8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r16 = this;
            r1 = r16
            int r0 = r1.f3126e
            switch(r0) {
                case 0: goto L_0x02fc;
                case 1: goto L_0x02f6;
                case 2: goto L_0x02f0;
                default: goto L_0x0007;
            }
        L_0x0007:
            T1.b1 r2 = r1.f3127f
            java.lang.Object r0 = r2.f398a
            r3 = r0
            T1.u0 r3 = (T1.C0212u0) r3
            T1.r0 r0 = r3.f3497s
            T1.C0212u0.k(r0)
            r0.o()
            T1.f1 r5 = r3.f3474A
            T1.C0212u0.k(r5)
            T1.C0212u0.k(r5)
            T1.O r0 = r3.n()
            java.lang.String r6 = r0.u()
            java.lang.String r0 = "google_analytics_adid_collection_enabled"
            T1.g r4 = r3.f3494p
            java.lang.Boolean r0 = r4.z(r0)
            r11 = 0
            r4 = 1
            if (r0 == 0) goto L_0x003b
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0039
            goto L_0x003b
        L_0x0039:
            r0 = r11
            goto L_0x003c
        L_0x003b:
            r0 = r4
        L_0x003c:
            T1.Z r7 = r3.f3496r
            if (r0 == 0) goto L_0x02dc
            T1.h0 r8 = r3.f3495q
            T1.C0212u0.i(r8)
            r8.o()
            T1.J0 r0 = r8.v()
            T1.I0 r9 = T1.I0.AD_STORAGE
            boolean r0 = r0.k(r9)
            java.lang.String r9 = ""
            if (r0 == 0) goto L_0x00ba
            java.lang.Object r0 = r8.f398a
            r10 = r0
            T1.u0 r10 = (T1.C0212u0) r10
            G1.b r0 = r10.f3501w
            r0.getClass()
            long r12 = android.os.SystemClock.elapsedRealtime()
            java.lang.String r0 = r8.f3324r
            if (r0 == 0) goto L_0x007b
            long r14 = r8.f3326t
            int r14 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r14 < 0) goto L_0x006f
            goto L_0x007b
        L_0x006f:
            android.util.Pair r9 = new android.util.Pair
            boolean r10 = r8.f3325s
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r9.<init>(r0, r10)
            goto L_0x00c2
        L_0x007b:
            T1.G r0 = T1.H.f2895b
            T1.g r14 = r10.f3494p
            long r14 = r14.w(r6, r0)
            long r14 = r14 + r12
            r8.f3326t = r14
            android.content.Context r0 = r10.f3489a     // Catch:{ Exception -> 0x0097 }
            B0.H r0 = n1.C0854a.a(r0)     // Catch:{ Exception -> 0x0097 }
            r8.f3324r = r9     // Catch:{ Exception -> 0x0097 }
            java.lang.Object r12 = r0.f201c     // Catch:{ Exception -> 0x0097 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ Exception -> 0x0097 }
            if (r12 == 0) goto L_0x0099
            r8.f3324r = r12     // Catch:{ Exception -> 0x0097 }
            goto L_0x0099
        L_0x0097:
            r0 = move-exception
            goto L_0x009e
        L_0x0099:
            boolean r0 = r0.f200b     // Catch:{ Exception -> 0x0097 }
            r8.f3325s = r0     // Catch:{ Exception -> 0x0097 }
            goto L_0x00ac
        L_0x009e:
            T1.Z r10 = r10.f3496r
            T1.C0212u0.k(r10)
            java.lang.String r12 = "Unable to get advertising id"
            T1.X r10 = r10.f3179v
            r10.b(r0, r12)
            r8.f3324r = r9
        L_0x00ac:
            android.util.Pair r9 = new android.util.Pair
            java.lang.String r0 = r8.f3324r
            boolean r10 = r8.f3325s
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r9.<init>(r0, r10)
            goto L_0x00c2
        L_0x00ba:
            android.util.Pair r0 = new android.util.Pair
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            r0.<init>(r9, r10)
            r9 = r0
        L_0x00c2:
            java.lang.Object r0 = r9.second
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x02d1
            java.lang.Object r0 = r9.first
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00d8
            goto L_0x02d1
        L_0x00d8:
            T1.C0212u0.k(r5)
            r5.q()
            java.lang.Object r0 = r5.f398a
            r10 = r0
            T1.u0 r10 = (T1.C0212u0) r10
            android.content.Context r0 = r10.f3489a
            java.lang.String r12 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r12)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            if (r0 == 0) goto L_0x00f4
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch:{ SecurityException -> 0x00f4 }
            goto L_0x00f5
        L_0x00f4:
            r0 = 0
        L_0x00f5:
            if (r0 == 0) goto L_0x02c6
            boolean r0 = r0.isConnected()
            if (r0 == 0) goto L_0x02c6
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            T1.w1 r0 = r3.r()
            r0.o()
            r0.p()
            boolean r14 = r0.B()
            if (r14 != 0) goto L_0x0113
            goto L_0x0125
        L_0x0113:
            java.lang.Object r0 = r0.f398a
            T1.u0 r0 = (T1.C0212u0) r0
            T1.Y1 r0 = r0.f3499u
            T1.C0212u0.i(r0)
            int r0 = r0.v0()
            r14 = 234200(0x392d8, float:3.28184E-40)
            if (r0 < r14) goto L_0x01f9
        L_0x0125:
            T1.b1 r0 = r3.f3503y
            T1.C0212u0.j(r0)
            r0.o()
            java.lang.Object r0 = r0.f398a
            T1.u0 r0 = (T1.C0212u0) r0
            T1.w1 r0 = r0.r()
            r0.o()
            r0.p()
            T1.J r14 = r0.d
            java.lang.Object r15 = r0.f398a
            T1.u0 r15 = (T1.C0212u0) r15
            if (r14 != 0) goto L_0x0154
            r0.s()
            T1.Z r0 = r15.f3496r
            T1.C0212u0.k(r0)
            java.lang.String r14 = "Failed to get consents; not connected to service yet."
            T1.X r0 = r0.f3179v
            r0.a(r14)
        L_0x0152:
            r12 = 0
            goto L_0x016e
        L_0x0154:
            T1.Z1 r12 = r0.C(r11)
            T1.i r12 = r14.o(r12)     // Catch:{ RemoteException -> 0x0160 }
            r0.E()     // Catch:{ RemoteException -> 0x0160 }
            goto L_0x016e
        L_0x0160:
            r0 = move-exception
            T1.Z r12 = r15.f3496r
            T1.C0212u0.k(r12)
            java.lang.String r14 = "Failed to get consents; remote exception"
            T1.X r12 = r12.f3172f
            r12.b(r0, r14)
            goto L_0x0152
        L_0x016e:
            if (r12 == 0) goto L_0x0173
            android.os.Bundle r0 = r12.f3338a
            goto L_0x0174
        L_0x0173:
            r0 = 0
        L_0x0174:
            if (r0 != 0) goto L_0x01a5
            int r0 = r3.f3486N
            int r5 = r0 + 1
            r3.f3486N = r5
            r5 = 10
            if (r0 >= r5) goto L_0x0181
            r11 = r4
        L_0x0181:
            T1.C0212u0.k(r7)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "Failed to retrieve DMA consent from the service, "
            r4.<init>(r6)
            if (r0 >= r5) goto L_0x0190
            java.lang.String r0 = "Retrying."
            goto L_0x0192
        L_0x0190:
            java.lang.String r0 = "Skipping."
        L_0x0192:
            java.lang.String r5 = " retryCount"
            java.lang.String r0 = h0.C0552a.r(r4, r0, r5)
            int r3 = r3.f3486N
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            T1.X r4 = r7.f3179v
            r4.b(r3, r0)
            goto L_0x02e6
        L_0x01a5:
            r12 = 100
            T1.J0 r14 = T1.J0.d(r12, r0)
            java.lang.String r15 = "&gcs="
            r13.append(r15)
            java.lang.String r14 = r14.i()
            r13.append(r14)
            T1.p r12 = T1.C0197p.a(r12, r0)
            java.lang.String r14 = "&dma="
            r13.append(r14)
            java.lang.Boolean r14 = java.lang.Boolean.FALSE
            java.lang.Boolean r15 = r12.f3427c
            boolean r14 = java.util.Objects.equals(r15, r14)
            r14 = r14 ^ r4
            r13.append(r14)
            java.lang.String r12 = r12.d
            boolean r14 = android.text.TextUtils.isEmpty(r12)
            if (r14 != 0) goto L_0x01dc
            java.lang.String r14 = "&dma_cps="
            r13.append(r14)
            r13.append(r12)
        L_0x01dc:
            java.lang.Boolean r0 = T1.C0197p.d(r0)
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            boolean r0 = java.util.Objects.equals(r0, r12)
            r0 = r0 ^ r4
            java.lang.String r4 = "&npa="
            r13.append(r4)
            r13.append(r0)
            T1.C0212u0.k(r7)
            java.lang.String r0 = "Consent query parameters to Bow"
            T1.X r4 = r7.f3180w
            r4.b(r13, r0)
        L_0x01f9:
            T1.Y1 r0 = r3.f3499u
            T1.C0212u0.i(r0)
            T1.O r4 = r3.n()
            java.lang.Object r4 = r4.f398a
            T1.u0 r4 = (T1.C0212u0) r4
            T1.g r4 = r4.f3494p
            r4.v()
            java.lang.Object r4 = r9.first
            java.lang.String r4 = (java.lang.String) r4
            T1.g0 r7 = r8.f3315E
            long r7 = r7.a()
            r14 = -1
            long r7 = r7 + r14
            java.lang.String r9 = r13.toString()
            java.lang.Object r12 = r0.f398a
            T1.u0 r12 = (T1.C0212u0) r12
            java.lang.String r13 = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version="
            java.lang.String r14 = "v119002."
            com.google.android.gms.common.internal.I.d(r4)     // Catch:{ MalformedURLException -> 0x0275, IllegalArgumentException -> 0x0273 }
            com.google.android.gms.common.internal.I.d(r6)     // Catch:{ MalformedURLException -> 0x0275, IllegalArgumentException -> 0x0273 }
            int r0 = r0.v0()     // Catch:{ MalformedURLException -> 0x0275, IllegalArgumentException -> 0x0273 }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ MalformedURLException -> 0x0275, IllegalArgumentException -> 0x0273 }
            r15.<init>(r14)     // Catch:{ MalformedURLException -> 0x0275, IllegalArgumentException -> 0x0273 }
            r15.append(r0)     // Catch:{ MalformedURLException -> 0x0275, IllegalArgumentException -> 0x0273 }
            java.lang.String r0 = r15.toString()     // Catch:{ MalformedURLException -> 0x0275, IllegalArgumentException -> 0x0273 }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ MalformedURLException -> 0x0275, IllegalArgumentException -> 0x0273 }
            r14.<init>(r13)     // Catch:{ MalformedURLException -> 0x0275, IllegalArgumentException -> 0x0273 }
            r14.append(r0)     // Catch:{ MalformedURLException -> 0x0275, IllegalArgumentException -> 0x0273 }
            java.lang.String r0 = "&rdid="
            r14.append(r0)     // Catch:{ MalformedURLException -> 0x0275, IllegalArgumentException -> 0x0273 }
            r14.append(r4)     // Catch:{ MalformedURLException -> 0x0275, IllegalArgumentException -> 0x0273 }
            java.lang.String r0 = "&bundleid="
            r14.append(r0)     // Catch:{ MalformedURLException -> 0x0275, IllegalArgumentException -> 0x0273 }
            r14.append(r6)     // Catch:{ MalformedURLException -> 0x0275, IllegalArgumentException -> 0x0273 }
            java.lang.String r0 = "&retry="
            r14.append(r0)     // Catch:{ MalformedURLException -> 0x0275, IllegalArgumentException -> 0x0273 }
            r14.append(r7)     // Catch:{ MalformedURLException -> 0x0275, IllegalArgumentException -> 0x0273 }
            java.lang.String r0 = r14.toString()     // Catch:{ MalformedURLException -> 0x0275, IllegalArgumentException -> 0x0273 }
            T1.g r4 = r12.f3494p     // Catch:{ MalformedURLException -> 0x0275, IllegalArgumentException -> 0x0273 }
            java.lang.String r7 = "debug.deferred.deeplink"
            java.lang.String r4 = r4.s(r7)     // Catch:{ MalformedURLException -> 0x0275, IllegalArgumentException -> 0x0273 }
            boolean r4 = r6.equals(r4)     // Catch:{ MalformedURLException -> 0x0275, IllegalArgumentException -> 0x0273 }
            if (r4 == 0) goto L_0x0277
            java.lang.String r4 = "&ddl_test=1"
            java.lang.String r0 = r0.concat(r4)     // Catch:{ MalformedURLException -> 0x0275, IllegalArgumentException -> 0x0273 }
            goto L_0x0277
        L_0x0273:
            r0 = move-exception
            goto L_0x0296
        L_0x0275:
            r0 = move-exception
            goto L_0x0296
        L_0x0277:
            boolean r4 = r9.isEmpty()     // Catch:{ MalformedURLException -> 0x0275, IllegalArgumentException -> 0x0273 }
            if (r4 != 0) goto L_0x028f
            char r4 = r9.charAt(r11)     // Catch:{ MalformedURLException -> 0x0275, IllegalArgumentException -> 0x0273 }
            r7 = 38
            if (r4 == r7) goto L_0x028b
            java.lang.String r4 = "&"
            java.lang.String r0 = r0.concat(r4)     // Catch:{ MalformedURLException -> 0x0275, IllegalArgumentException -> 0x0273 }
        L_0x028b:
            java.lang.String r0 = r0.concat(r9)     // Catch:{ MalformedURLException -> 0x0275, IllegalArgumentException -> 0x0273 }
        L_0x028f:
            java.net.URL r4 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0275, IllegalArgumentException -> 0x0273 }
            r4.<init>(r0)     // Catch:{ MalformedURLException -> 0x0275, IllegalArgumentException -> 0x0273 }
            r7 = r4
            goto L_0x02a7
        L_0x0296:
            T1.Z r4 = r12.f3496r
            T1.C0212u0.k(r4)
            java.lang.String r0 = r0.getMessage()
            T1.X r4 = r4.f3172f
            java.lang.String r7 = "Failed to create BOW URL for Deferred Deep Link. exception"
            r4.b(r0, r7)
            r7 = 0
        L_0x02a7:
            if (r7 == 0) goto L_0x02e6
            T1.C0212u0.k(r5)
            T1.s0 r0 = new T1.s0
            r0.<init>(r3)
            r5.q()
            T1.r0 r3 = r10.f3497s
            T1.C0212u0.k(r3)
            T1.c0 r12 = new T1.c0
            r8 = 0
            r9 = 0
            r4 = r12
            r10 = r0
            r4.<init>((T1.C0169f1) r5, (java.lang.String) r6, (java.net.URL) r7, (byte[]) r8, (java.util.HashMap) r9, (T1.C0163d1) r10)
            r3.x(r12)
            goto L_0x02e6
        L_0x02c6:
            T1.C0212u0.k(r7)
            java.lang.String r0 = "Network is not available for Deferred Deep Link request. Skipping"
            T1.X r3 = r7.f3175r
            r3.a(r0)
            goto L_0x02e6
        L_0x02d1:
            T1.C0212u0.k(r7)
            java.lang.String r0 = "ADID unavailable to retrieve Deferred Deep Link. Skipping"
            T1.X r3 = r7.f3180w
            r3.a(r0)
            goto L_0x02e6
        L_0x02dc:
            T1.C0212u0.k(r7)
            java.lang.String r0 = "ADID collection is disabled from Manifest. Skipping"
            T1.X r3 = r7.f3180w
            r3.a(r0)
        L_0x02e6:
            if (r11 == 0) goto L_0x02ef
            T1.V0 r0 = r2.f3241C
            r2 = 2000(0x7d0, double:9.88E-321)
            r0.c(r2)
        L_0x02ef:
            return
        L_0x02f0:
            T1.b1 r0 = r1.f3127f
            r0.x()
            return
        L_0x02f6:
            T1.b1 r0 = r1.f3127f
            r0.C()
            return
        L_0x02fc:
            java.lang.Thread r0 = new java.lang.Thread
            T1.b1 r2 = r1.f3127f
            java.lang.Object r2 = r2.f398a
            T1.u0 r2 = (T1.C0212u0) r2
            T1.b1 r2 = r2.f3503y
            T1.C0212u0.j(r2)
            T1.T0 r3 = new T1.T0
            r4 = 1
            r3.<init>(r2, r4)
            r0.<init>(r3)
            r0.start()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.V0.b():void");
    }
}
