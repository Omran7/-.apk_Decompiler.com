package A4;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f63a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f64b;

    public /* synthetic */ a(Object obj, int i2) {
        this.f63a = i2;
        this.f64b = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r2 = r0.c();
        r3 = r2.f982e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001b, code lost:
        if (r3 != 2) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        r4 = r0.d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001f, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0025, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0028, code lost:
        if (r3 != 0) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r3 = G.l.f807a;
        android.os.Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
        r1 = r0.f4949c;
        r3 = r0.f4947a;
        r1.getClass();
        r1 = C.k.f380a.l(r3, new H.h[]{r2}, 0);
        r2 = I1.b.u0(r0.f4947a, r2.f979a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004b, code lost:
        if (r2 == null) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004d, code lost:
        if (r1 == null) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        android.os.Trace.beginSection("EmojiCompat.MetadataRepo.create");
        r3 = new S3.z(r1, com.bumptech.glide.c.g0(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        android.os.Trace.endSection();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        android.os.Trace.endSection();
        r1 = r0.d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0065, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r2 = r0.f4953q;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0068, code lost:
        if (r2 == null) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x006a, code lost:
        r2.p0(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x006e, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0070, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r0.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0077, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r2 = G.l.f807a;
        android.os.Trace.endSection();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x007d, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0085, code lost:
        throw new java.lang.RuntimeException("Unable to open file.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0086, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        r2 = G.l.f807a;
        android.os.Trace.endSection();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x008c, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00a3, code lost:
        throw new java.lang.RuntimeException("fetchFonts result is not OK. (" + r3 + ")");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00a6, code lost:
        monitor-enter(r0.d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        r2 = r0.f4953q;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00a9, code lost:
        if (r2 != null) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00ab, code lost:
        r2.o0(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00af, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00b2, code lost:
        r0.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00b7, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f64b
            androidx.emoji2.text.o r0 = (androidx.emoji2.text.o) r0
            java.lang.String r1 = "fetchFonts result is not OK. ("
            java.lang.Object r2 = r0.d
            monitor-enter(r2)
            R2.b r3 = r0.f4953q     // Catch:{ all -> 0x0010 }
            if (r3 != 0) goto L_0x0013
            monitor-exit(r2)     // Catch:{ all -> 0x0010 }
            goto L_0x00b5
        L_0x0010:
            r0 = move-exception
            goto L_0x00b8
        L_0x0013:
            monitor-exit(r2)     // Catch:{ all -> 0x0010 }
            H.h r2 = r0.c()     // Catch:{ all -> 0x0025 }
            int r3 = r2.f982e     // Catch:{ all -> 0x0025 }
            r4 = 2
            if (r3 != r4) goto L_0x0028
            java.lang.Object r4 = r0.d     // Catch:{ all -> 0x0025 }
            monitor-enter(r4)     // Catch:{ all -> 0x0025 }
            monitor-exit(r4)     // Catch:{ all -> 0x0022 }
            goto L_0x0028
        L_0x0022:
            r1 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0022 }
            throw r1     // Catch:{ all -> 0x0025 }
        L_0x0025:
            r1 = move-exception
            goto L_0x00a4
        L_0x0028:
            if (r3 != 0) goto L_0x008d
            java.lang.String r1 = "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface"
            int r3 = G.l.f807a     // Catch:{ all -> 0x0086 }
            android.os.Trace.beginSection(r1)     // Catch:{ all -> 0x0086 }
            T1.C r1 = r0.f4949c     // Catch:{ all -> 0x0086 }
            android.content.Context r3 = r0.f4947a     // Catch:{ all -> 0x0086 }
            r1.getClass()     // Catch:{ all -> 0x0086 }
            H.h[] r1 = new H.h[]{r2}     // Catch:{ all -> 0x0086 }
            com.bumptech.glide.d r4 = C.k.f380a     // Catch:{ all -> 0x0086 }
            r5 = 0
            android.graphics.Typeface r1 = r4.l(r3, r1, r5)     // Catch:{ all -> 0x0086 }
            android.content.Context r3 = r0.f4947a     // Catch:{ all -> 0x0086 }
            android.net.Uri r2 = r2.f979a     // Catch:{ all -> 0x0086 }
            java.nio.MappedByteBuffer r2 = I1.b.u0(r3, r2)     // Catch:{ all -> 0x0086 }
            if (r2 == 0) goto L_0x007e
            if (r1 == 0) goto L_0x007e
            java.lang.String r3 = "EmojiCompat.MetadataRepo.create"
            android.os.Trace.beginSection(r3)     // Catch:{ all -> 0x0077 }
            S3.z r3 = new S3.z     // Catch:{ all -> 0x0077 }
            V.b r2 = com.bumptech.glide.c.g0(r2)     // Catch:{ all -> 0x0077 }
            r3.<init>((android.graphics.Typeface) r1, (V.b) r2)     // Catch:{ all -> 0x0077 }
            android.os.Trace.endSection()     // Catch:{ all -> 0x0086 }
            android.os.Trace.endSection()     // Catch:{ all -> 0x0025 }
            java.lang.Object r1 = r0.d     // Catch:{ all -> 0x0025 }
            monitor-enter(r1)     // Catch:{ all -> 0x0025 }
            R2.b r2 = r0.f4953q     // Catch:{ all -> 0x006e }
            if (r2 == 0) goto L_0x0070
            r2.p0(r3)     // Catch:{ all -> 0x006e }
            goto L_0x0070
        L_0x006e:
            r2 = move-exception
            goto L_0x0075
        L_0x0070:
            monitor-exit(r1)     // Catch:{ all -> 0x006e }
            r0.b()     // Catch:{ all -> 0x0025 }
            goto L_0x00b5
        L_0x0075:
            monitor-exit(r1)     // Catch:{ all -> 0x006e }
            throw r2     // Catch:{ all -> 0x0025 }
        L_0x0077:
            r1 = move-exception
            int r2 = G.l.f807a     // Catch:{ all -> 0x0086 }
            android.os.Trace.endSection()     // Catch:{ all -> 0x0086 }
            throw r1     // Catch:{ all -> 0x0086 }
        L_0x007e:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x0086 }
            java.lang.String r2 = "Unable to open file."
            r1.<init>(r2)     // Catch:{ all -> 0x0086 }
            throw r1     // Catch:{ all -> 0x0086 }
        L_0x0086:
            r1 = move-exception
            int r2 = G.l.f807a     // Catch:{ all -> 0x0025 }
            android.os.Trace.endSection()     // Catch:{ all -> 0x0025 }
            throw r1     // Catch:{ all -> 0x0025 }
        L_0x008d:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ all -> 0x0025 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0025 }
            r4.<init>(r1)     // Catch:{ all -> 0x0025 }
            r4.append(r3)     // Catch:{ all -> 0x0025 }
            java.lang.String r1 = ")"
            r4.append(r1)     // Catch:{ all -> 0x0025 }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x0025 }
            r2.<init>(r1)     // Catch:{ all -> 0x0025 }
            throw r2     // Catch:{ all -> 0x0025 }
        L_0x00a4:
            java.lang.Object r3 = r0.d
            monitor-enter(r3)
            R2.b r2 = r0.f4953q     // Catch:{ all -> 0x00af }
            if (r2 == 0) goto L_0x00b1
            r2.o0(r1)     // Catch:{ all -> 0x00af }
            goto L_0x00b1
        L_0x00af:
            r0 = move-exception
            goto L_0x00b6
        L_0x00b1:
            monitor-exit(r3)     // Catch:{ all -> 0x00af }
            r0.b()
        L_0x00b5:
            return
        L_0x00b6:
            monitor-exit(r3)     // Catch:{ all -> 0x00af }
            throw r0
        L_0x00b8:
            monitor-exit(r2)     // Catch:{ all -> 0x0010 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: A4.a.a():void");
    }

    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r6v18 */
    /* JADX WARNING: type inference failed for: r7v7 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: type inference failed for: r7v12 */
    /* JADX WARNING: type inference failed for: r6v23 */
    /* JADX WARNING: type inference failed for: r5v12 */
    /* JADX WARNING: type inference failed for: r6v26 */
    /* JADX WARNING: type inference failed for: r7v15 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r19 = this;
            r1 = r19
            r0 = 2
            r2 = 18
            r3 = 0
            r4 = 0
            r5 = 1
            int r6 = r1.f63a
            switch(r6) {
                case 0: goto L_0x038c;
                case 1: goto L_0x0369;
                case 2: goto L_0x0320;
                case 3: goto L_0x02f8;
                case 4: goto L_0x02d5;
                case 5: goto L_0x02c2;
                case 6: goto L_0x02ba;
                case 7: goto L_0x02b6;
                case 8: goto L_0x0290;
                case 9: goto L_0x0288;
                case 10: goto L_0x0276;
                case 11: goto L_0x024c;
                case 12: goto L_0x022f;
                case 13: goto L_0x0227;
                case 14: goto L_0x0211;
                case 15: goto L_0x01fd;
                case 16: goto L_0x01d2;
                case 17: goto L_0x01ae;
                case 18: goto L_0x00ed;
                case 19: goto L_0x00da;
                case 20: goto L_0x00d2;
                case 21: goto L_0x00c2;
                case 22: goto L_0x00b8;
                default: goto L_0x000d;
            }
        L_0x000d:
            java.lang.Object r0 = r1.f64b
            r3 = r0
            android.app.Activity r3 = (android.app.Activity) r3
            boolean r0 = r3.isFinishing()
            if (r0 != 0) goto L_0x00b7
            int r0 = android.os.Build.VERSION.SDK_INT
            r6 = 28
            if (r0 < r6) goto L_0x0025
            java.lang.Class r0 = z.C1124d.f12752a
            r3.recreate()
            goto L_0x00b7
        L_0x0025:
            java.lang.Class r6 = z.C1124d.f12752a
            r6 = 27
            r7 = 26
            if (r0 == r7) goto L_0x0032
            if (r0 != r6) goto L_0x0030
            goto L_0x0032
        L_0x0030:
            r8 = r4
            goto L_0x0033
        L_0x0032:
            r8 = r5
        L_0x0033:
            java.lang.reflect.Method r9 = z.C1124d.f12756f
            if (r8 == 0) goto L_0x003b
            if (r9 != 0) goto L_0x003b
            goto L_0x00b4
        L_0x003b:
            java.lang.reflect.Method r8 = z.C1124d.f12755e
            if (r8 != 0) goto L_0x0045
            java.lang.reflect.Method r8 = z.C1124d.d
            if (r8 != 0) goto L_0x0045
            goto L_0x00b4
        L_0x0045:
            java.lang.reflect.Field r8 = z.C1124d.f12754c     // Catch:{ all -> 0x00b4 }
            java.lang.Object r10 = r8.get(r3)     // Catch:{ all -> 0x00b4 }
            if (r10 != 0) goto L_0x004f
            goto L_0x00b4
        L_0x004f:
            java.lang.reflect.Field r8 = z.C1124d.f12753b     // Catch:{ all -> 0x00b4 }
            java.lang.Object r8 = r8.get(r3)     // Catch:{ all -> 0x00b4 }
            if (r8 != 0) goto L_0x0059
            goto L_0x00b4
        L_0x0059:
            android.app.Application r15 = r3.getApplication()     // Catch:{ all -> 0x00b4 }
            z.c r14 = new z.c     // Catch:{ all -> 0x00b4 }
            r14.<init>(r3)     // Catch:{ all -> 0x00b4 }
            r15.registerActivityLifecycleCallbacks(r14)     // Catch:{ all -> 0x00b4 }
            android.os.Handler r13 = z.C1124d.g
            j3.g r11 = new j3.g     // Catch:{ all -> 0x00b4 }
            r12 = 17
            r11.<init>(r14, r10, r12)     // Catch:{ all -> 0x00b4 }
            r13.post(r11)     // Catch:{ all -> 0x00b4 }
            if (r0 == r7) goto L_0x0077
            if (r0 != r6) goto L_0x0076
            goto L_0x0077
        L_0x0076:
            r5 = r4
        L_0x0077:
            if (r5 == 0) goto L_0x009c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0097 }
            java.lang.Boolean r18 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0097 }
            r11 = 0
            r12 = 0
            r4 = 0
            r16 = 0
            r5 = r13
            r13 = r0
            r6 = r14
            r14 = r18
            r7 = r15
            r15 = r4
            r17 = r18
            java.lang.Object[] r0 = new java.lang.Object[]{r10, r11, r12, r13, r14, r15, r16, r17, r18}     // Catch:{ all -> 0x0095 }
            r9.invoke(r8, r0)     // Catch:{ all -> 0x0095 }
            goto L_0x00a2
        L_0x0095:
            r0 = move-exception
            goto L_0x00ab
        L_0x0097:
            r0 = move-exception
            r5 = r13
            r6 = r14
            r7 = r15
            goto L_0x00ab
        L_0x009c:
            r5 = r13
            r6 = r14
            r7 = r15
            r3.recreate()     // Catch:{ all -> 0x0095 }
        L_0x00a2:
            j3.g r0 = new j3.g     // Catch:{ all -> 0x00b4 }
            r0.<init>(r7, r6, r2)     // Catch:{ all -> 0x00b4 }
            r5.post(r0)     // Catch:{ all -> 0x00b4 }
            goto L_0x00b7
        L_0x00ab:
            j3.g r4 = new j3.g     // Catch:{ all -> 0x00b4 }
            r4.<init>(r7, r6, r2)     // Catch:{ all -> 0x00b4 }
            r5.post(r4)     // Catch:{ all -> 0x00b4 }
            throw r0     // Catch:{ all -> 0x00b4 }
        L_0x00b4:
            r3.recreate()
        L_0x00b7:
            return
        L_0x00b8:
            java.lang.Object r0 = r1.f64b
            com.google.android.material.textfield.TextInputLayout r0 = (com.google.android.material.textfield.TextInputLayout) r0
            android.widget.EditText r0 = r0.d
            r0.requestLayout()
            return
        L_0x00c2:
            java.lang.Object r0 = r1.f64b
            v2.i r0 = (v2.i) r0
            android.widget.AutoCompleteTextView r2 = r0.h
            boolean r2 = r2.isPopupShowing()
            r0.t(r2)
            r0.f12188m = r2
            return
        L_0x00d2:
            java.lang.Object r0 = r1.f64b
            v2.d r0 = (v2.C1045d) r0
            r0.t(r5)
            return
        L_0x00da:
            java.lang.Object r0 = r1.f64b
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            android.graphics.drawable.Drawable r2 = r0.getDrawable()
            android.graphics.drawable.AnimationDrawable r2 = (android.graphics.drawable.AnimationDrawable) r2
            r2.stop()
            r2 = 8
            r0.setVisibility(r2)
            return
        L_0x00ed:
            java.lang.Object r2 = r1.f64b
            u4.g r2 = (u4.g) r2
            android.view.View r4 = r2.f11907f0
            boolean r4 = r4.isShown()
            if (r4 == 0) goto L_0x01ad
            boolean r4 = r2.f11929q1
            if (r4 == 0) goto L_0x0107
            e5.b r0 = r2.f11927p1
            r0.dismiss()
            r2.a0()
            goto L_0x01ad
        L_0x0107:
            int r4 = r2.f11917k1
            if (r4 != r5) goto L_0x0110
            r2.a0()
            goto L_0x01ad
        L_0x0110:
            long r4 = r2.f11913i1
            d5.u r6 = r2.f11908f1
            d5.k r6 = r6.getMainStatesObject()
            long r6 = r6.getHealthCurrent()
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            java.lang.String r5 = r2.f11905e0
            if (r4 >= 0) goto L_0x0127
            long r6 = r2.f11913i1
            com.bumptech.glide.d.j1(r6, r5, r3)
        L_0x0127:
            long r6 = r2.g1
            d5.u r4 = r2.f11906e1
            d5.k r4 = r4.getMainStatesObject()
            long r8 = r4.getHealthCurrent()
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 >= 0) goto L_0x014a
            d5.a r0 = d5.o.getAccountObject()
            java.lang.String r0 = r0.getId()
            long r3 = r2.g1
            u4.c r5 = new u4.c
            r5.<init>(r2)
            com.bumptech.glide.d.j1(r3, r0, r5)
            goto L_0x01ad
        L_0x014a:
            com.mtma.criminal.city.app.MyApplication r4 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r4 = r4.getApplicationContext()
            d5.u r6 = r2.f11908f1
            d5.k r6 = r6.getMainStatesObject()
            java.lang.String r6 = r6.getNickName()
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            r7 = 2131887322(0x7f1204da, float:1.9409248E38)
            java.lang.String r4 = r4.getString(r7, r6)
            d5.a r6 = d5.o.getAccountObject()
            java.lang.String r6 = r6.getId()
            r7 = 300(0x12c, double:1.48E-321)
            K1.e.b(r6, r7, r4, r3)
            int r2 = r2.f11917k1
            if (r2 != 0) goto L_0x0191
            b5.k r0 = new b5.k
            d5.a r2 = d5.o.getAccountObject()
            java.lang.String r2 = r2.getId()
            d5.k r3 = d5.o.getMainStatesObject()
            java.lang.String r3 = r3.getNickName()
            r4 = 20
            r0.<init>((int) r4, (java.lang.String) r2, (java.lang.String) r3)
            com.bumptech.glide.c.k0(r5, r0)
            goto L_0x01ad
        L_0x0191:
            if (r2 != r0) goto L_0x01ad
            b5.k r0 = new b5.k
            d5.a r2 = d5.o.getAccountObject()
            java.lang.String r2 = r2.getId()
            d5.k r3 = d5.o.getMainStatesObject()
            java.lang.String r3 = r3.getNickName()
            r4 = 19
            r0.<init>((int) r4, (java.lang.String) r2, (java.lang.String) r3)
            com.bumptech.glide.c.k0(r5, r0)
        L_0x01ad:
            return
        L_0x01ae:
            java.lang.Object r2 = r1.f64b
            com.google.android.gms.common.api.internal.y r2 = (com.google.android.gms.common.api.internal.C0370y) r2
            r2.f6114c = r4
            java.lang.Object r3 = r2.f6115e
            com.google.android.material.sidesheet.SideSheetBehavior r3 = (com.google.android.material.sidesheet.SideSheetBehavior) r3
            U.e r4 = r3.f6489i
            if (r4 == 0) goto L_0x01c8
            boolean r4 = r4.f()
            if (r4 == 0) goto L_0x01c8
            int r0 = r2.f6113b
            r2.c(r0)
            goto L_0x01d1
        L_0x01c8:
            int r4 = r3.h
            if (r4 != r0) goto L_0x01d1
            int r0 = r2.f6113b
            r3.r(r0)
        L_0x01d1:
            return
        L_0x01d2:
            java.lang.Object r0 = r1.f64b
            P4.i r0 = (P4.i) r0
            android.view.View r2 = r0.f2230j0
            android.widget.TextView r2 = (android.widget.TextView) r2
            boolean r2 = r2.isShown()
            if (r2 == 0) goto L_0x01fc
            long r2 = com.bumptech.glide.c.f5744o
            r4 = -111(0xffffffffffffff91, double:NaN)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x01f3
            android.view.View r0 = r0.f2230j0
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r2 = com.bumptech.glide.c.v()
            r0.setText(r2)
        L_0x01f3:
            android.os.Handler r0 = P4.i.f2222m0
            A4.a r2 = P4.i.f2223n0
            r3 = 1000(0x3e8, double:4.94E-321)
            r0.postDelayed(r2, r3)
        L_0x01fc:
            return
        L_0x01fd:
            java.lang.Object r0 = r1.f64b
            android.view.View r0 = (android.view.View) r0
            android.content.Context r2 = r0.getContext()
            java.lang.Class<android.view.inputmethod.InputMethodManager> r3 = android.view.inputmethod.InputMethodManager.class
            java.lang.Object r2 = A.h.getSystemService(r2, r3)
            android.view.inputmethod.InputMethodManager r2 = (android.view.inputmethod.InputMethodManager) r2
            r2.showSoftInput(r0, r5)
            return
        L_0x0211:
            java.lang.Object r0 = r1.f64b
            i1.j r0 = (i1.j) r0
            r0.getClass()
            F3.e r2 = new F3.e
            r3 = 15
            r2.<init>((java.lang.Object) r0, (int) r3)
            k1.c r0 = r0.d
            j1.g r0 = (j1.g) r0
            r0.m(r2)
            return
        L_0x0227:
            java.lang.Object r0 = r1.f64b
            com.google.android.material.carousel.CarouselLayoutManager r0 = (com.google.android.material.carousel.CarouselLayoutManager) r0
            r0.l0()
            return
        L_0x022f:
            int r0 = com.mtma.criminal.city.views.CustomProgressBar.f7493c
            java.lang.Object r0 = r1.f64b
            com.mtma.criminal.city.views.CustomProgressBar r0 = (com.mtma.criminal.city.views.CustomProgressBar) r0
            int r2 = r0.getWidth()
            android.widget.ImageView r3 = r0.f7494a
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            float r2 = (float) r2
            float r4 = r0.f7495b
            float r2 = r2 * r4
            int r2 = (int) r2
            r3.width = r2
            android.widget.ImageView r0 = r0.f7494a
            r0.setLayoutParams(r3)
            return
        L_0x024c:
            java.lang.Object r0 = r1.f64b
            com.mtma.criminal.city.fragments.gangBase.r r0 = (com.mtma.criminal.city.fragments.gangBase.r) r0
            j4.H r2 = r0.f7261m0
            r2.notifyDataSetChanged()
            j4.H r2 = r0.f7261m0
            int r2 = r2.f8884c
            if (r2 != 0) goto L_0x026d
            android.os.Handler r2 = new android.os.Handler
            r2.<init>()
            A4.a r3 = new A4.a
            r4 = 11
            r3.<init>(r0, r4)
            r4 = 100
            r2.postDelayed(r3, r4)
            goto L_0x0275
        L_0x026d:
            android.widget.ListView r0 = r0.f7258j0
            r0.setVisibility(r4)
            R2.b.w(r4)
        L_0x0275:
            return
        L_0x0276:
            java.lang.Object r0 = r1.f64b
            r2 = r0
            com.google.firebase.storage.q r2 = (com.google.firebase.storage.q) r2
            r2.k()     // Catch:{ all -> 0x0282 }
            r2.b()
            return
        L_0x0282:
            r0 = move-exception
            r3 = r0
            r2.b()
            throw r3
        L_0x0288:
            java.lang.Object r0 = r1.f64b
            com.google.android.material.timepicker.e r0 = (com.google.android.material.timepicker.e) r0
            r0.l()
            return
        L_0x0290:
            java.lang.Object r0 = r1.f64b
            androidx.lifecycle.D r0 = (androidx.lifecycle.D) r0
            java.lang.String r2 = "this$0"
            kotlin.jvm.internal.j.e(r0, r2)
            int r2 = r0.f5213b
            androidx.lifecycle.u r3 = r0.f5216f
            if (r2 != 0) goto L_0x02a6
            r0.f5214c = r5
            androidx.lifecycle.m r2 = androidx.lifecycle.C0302m.ON_PAUSE
            r3.d(r2)
        L_0x02a6:
            int r2 = r0.f5212a
            if (r2 != 0) goto L_0x02b5
            boolean r2 = r0.f5214c
            if (r2 == 0) goto L_0x02b5
            androidx.lifecycle.m r2 = androidx.lifecycle.C0302m.ON_STOP
            r3.d(r2)
            r0.d = r5
        L_0x02b5:
            return
        L_0x02b6:
            r19.a()
            return
        L_0x02ba:
            java.lang.Object r0 = r1.f64b
            androidx.activity.p r0 = (androidx.activity.p) r0
            androidx.activity.p.b(r0)
            return
        L_0x02c2:
            java.lang.String r0 = "this$0"
            java.lang.Object r2 = r1.f64b
            androidx.activity.k r2 = (androidx.activity.k) r2
            kotlin.jvm.internal.j.e(r2, r0)
            java.lang.Runnable r0 = r2.f4629b
            if (r0 == 0) goto L_0x02d4
            r0.run()
            r2.f4629b = r3
        L_0x02d4:
            return
        L_0x02d5:
            java.lang.Object r0 = r1.f64b
            Z2.g r0 = (Z2.g) r0
            Z2.e r2 = r0.f4501a
            W2.a r3 = r2.f4496l
            com.google.android.gms.tasks.Task r3 = r3.a()
            F3.e r5 = new F3.e
            r6 = 5
            r5.<init>((java.lang.Object) r2, (int) r6)
            java.util.concurrent.Executor r2 = r2.g
            com.google.android.gms.tasks.Task r2 = r3.onSuccessTask(r2, r5)
            Z2.f r3 = new Z2.f
            r3.<init>(r0, r4)
            java.util.concurrent.Executor r0 = r0.f4502b
            r2.addOnFailureListener((java.util.concurrent.Executor) r0, (com.google.android.gms.tasks.OnFailureListener) r3)
            return
        L_0x02f8:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Service took too long to process intent: "
            r0.<init>(r2)
            java.lang.Object r2 = r1.f64b
            S3.K r2 = (S3.K) r2
            android.content.Intent r4 = r2.f2639a
            java.lang.String r4 = r4.getAction()
            r0.append(r4)
            java.lang.String r4 = " finishing."
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "FirebaseMessaging"
            android.util.Log.w(r4, r0)
            com.google.android.gms.tasks.TaskCompletionSource r0 = r2.f2640b
            r0.trySetResult(r3)
            return
        L_0x0320:
            java.lang.Object r0 = r1.f64b
            F3.k r0 = (F3.k) r0
            java.lang.Object r2 = r0.f771e
            java.util.ArrayDeque r2 = (java.util.ArrayDeque) r2
            monitor-enter(r2)
            java.lang.Object r3 = r0.f769b     // Catch:{ all -> 0x0366 }
            android.content.SharedPreferences r3 = (android.content.SharedPreferences) r3     // Catch:{ all -> 0x0366 }
            android.content.SharedPreferences$Editor r3 = r3.edit()     // Catch:{ all -> 0x0366 }
            java.lang.Object r4 = r0.f770c     // Catch:{ all -> 0x0366 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0366 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0366 }
            r5.<init>()     // Catch:{ all -> 0x0366 }
            java.lang.Object r6 = r0.f771e     // Catch:{ all -> 0x0366 }
            java.util.ArrayDeque r6 = (java.util.ArrayDeque) r6     // Catch:{ all -> 0x0366 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0366 }
        L_0x0342:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x0366 }
            if (r7 == 0) goto L_0x0359
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x0366 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0366 }
            r5.append(r7)     // Catch:{ all -> 0x0366 }
            java.lang.Object r7 = r0.d     // Catch:{ all -> 0x0366 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0366 }
            r5.append(r7)     // Catch:{ all -> 0x0366 }
            goto L_0x0342
        L_0x0359:
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x0366 }
            android.content.SharedPreferences$Editor r0 = r3.putString(r4, r0)     // Catch:{ all -> 0x0366 }
            r0.commit()     // Catch:{ all -> 0x0366 }
            monitor-exit(r2)     // Catch:{ all -> 0x0366 }
            return
        L_0x0366:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0366 }
            throw r0
        L_0x0369:
            java.lang.Object r0 = r1.f64b
            I4.h r0 = (I4.h) r0
            android.view.View r2 = r0.f1219e0
            boolean r2 = r2.isShown()
            if (r2 == 0) goto L_0x038b
            java.util.ArrayList r2 = r0.f1224j0
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x038b
            j4.m0 r2 = r0.f1225k0
            r2.notifyDataSetChanged()
            android.os.Handler r2 = r0.f1231q0
            A4.a r0 = r0.f1232r0
            r3 = 3000(0xbb8, double:1.482E-320)
            r2.postDelayed(r0, r3)
        L_0x038b:
            return
        L_0x038c:
            java.lang.Object r0 = r1.f64b
            A4.j r0 = (A4.j) r0
            android.widget.TextView r2 = r0.f120q0
            boolean r2 = r2.isShown()
            if (r2 == 0) goto L_0x039b
            r0.X()
        L_0x039b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: A4.a.run():void");
    }
}
