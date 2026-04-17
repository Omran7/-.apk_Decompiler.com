package G4;

import android.widget.AdapterView;

public final /* synthetic */ class a implements AdapterView.OnItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f841a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f842b;

    public /* synthetic */ a(Object obj, int i2) {
        this.f841a = i2;
        this.f842b = obj;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onItemClick(android.widget.AdapterView r24, android.view.View r25, int r26, long r27) {
        /*
            r23 = this;
            r0 = r23
            r1 = r26
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 2131296333(0x7f09004d, float:1.821058E38)
            java.lang.Object r7 = r0.f842b
            r8 = 0
            r9 = 1
            int r10 = r0.f841a
            switch(r10) {
                case 0: goto L_0x02a8;
                case 1: goto L_0x004b;
                default: goto L_0x0014;
            }
        L_0x0014:
            j4.p0 r7 = (j4.p0) r7
            java.lang.Object r2 = r7.f9075b
            P4.i r2 = (P4.i) r2
            java.lang.Object r3 = r2.f2231k0
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.lang.Object r1 = r3.get(r1)
            b5.a r1 = (b5.C0325a) r1
            androidx.fragment.app.I r3 = r2.p()
            androidx.fragment.app.a r4 = new androidx.fragment.app.a
            r4.<init>(r3)
            m4.b r3 = new m4.b
            int r12 = r1.getActivityId()
            long r13 = r1.getStartTimeInMilli()
            long r15 = r1.getEndTimeInMilli()
            android.content.Context r1 = r2.f2228h0
            r11 = r1
            com.mtma.criminal.city.activities.MainActivity r11 = (com.mtma.criminal.city.activities.MainActivity) r11
            r10 = r3
            r10.<init>(r11, r12, r13, r15)
            r4.f(r6, r3, r5, r9)
            com.google.android.gms.internal.measurement.a.j(r4, r8)
            return
        L_0x004b:
            r5 = r7
            com.mtma.criminal.city.fragments.gangBase.D r5 = (com.mtma.criminal.city.fragments.gangBase.D) r5
            java.util.ArrayList r6 = r5.f7119n0
            java.lang.Object r7 = r6.get(r1)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            android.content.Context r10 = r5.f7109d0
            if (r7 != r9) goto L_0x0068
            com.mtma.criminal.city.fragments.gangBase.H r1 = new com.mtma.criminal.city.fragments.gangBase.H
            r1.<init>(r10, r8)
            r5.V(r1)
            goto L_0x02a7
        L_0x0068:
            java.lang.Object r7 = r6.get(r1)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            if (r7 != 0) goto L_0x007e
            com.mtma.criminal.city.fragments.gangBase.J r1 = new com.mtma.criminal.city.fragments.gangBase.J
            r1.<init>(r10)
            r5.V(r1)
            goto L_0x02a7
        L_0x007e:
            java.lang.Object r7 = r6.get(r1)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            if (r7 != r4) goto L_0x0110
            boolean r1 = r5.f7121p0
            if (r1 == 0) goto L_0x0090
            goto L_0x02a7
        L_0x0090:
            r5.f7121p0 = r9
            e5.b r1 = new e5.b
            r2 = 2131492934(0x7f0c0046, float:1.8609334E38)
            r1.<init>(r10, r2)
            r2 = 2131296688(0x7f0901b0, float:1.82113E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r3 = 2131296679(0x7f0901a7, float:1.8211281E38)
            android.view.View r3 = r1.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r6 = 2131296685(0x7f0901ad, float:1.8211294E38)
            android.view.View r6 = r1.findViewById(r6)
            android.widget.EditText r6 = (android.widget.EditText) r6
            r7 = 2131296680(0x7f0901a8, float:1.8211284E38)
            android.view.View r7 = r1.findViewById(r7)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r10 = 2131296687(0x7f0901af, float:1.8211298E38)
            android.view.View r10 = r1.findViewById(r10)
            android.widget.RelativeLayout r10 = (android.widget.RelativeLayout) r10
            r11 = 2131888568(0x7f1209b8, float:1.9411775E38)
            r2.setText(r11)
            r2 = 2131886314(0x7f1200ea, float:1.9407203E38)
            r3.setText(r2)
            r2 = 2131887548(0x7f1205bc, float:1.9409706E38)
            r6.setHint(r2)
            android.text.InputFilter$LengthFilter r2 = new android.text.InputFilter$LengthFilter
            r3 = 300(0x12c, float:4.2E-43)
            r2.<init>(r3)
            android.text.InputFilter[] r3 = new android.text.InputFilter[r9]
            r3[r8] = r2
            r6.setFilters(r3)
            K4.c r2 = new K4.c
            r2.<init>(r5, r6, r9)
            r6.addTextChangedListener(r2)
            com.mtma.criminal.city.fragments.gangBase.C r2 = new com.mtma.criminal.city.fragments.gangBase.C
            r2.<init>(r5, r7, r1, r4)
            r7.setOnClickListener(r2)
            A4.i r2 = new A4.i
            r22 = 4
            r17 = r2
            r18 = r5
            r19 = r10
            r20 = r6
            r21 = r1
            r17.<init>(r18, r19, r20, r21, r22)
            r10.setOnClickListener(r2)
            r1.show()
            goto L_0x02a7
        L_0x0110:
            java.lang.Object r4 = r6.get(r1)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r4 != r3) goto L_0x0205
            boolean r1 = r5.f7120o0
            if (r1 == 0) goto L_0x0122
            goto L_0x02a7
        L_0x0122:
            r5.f7120o0 = r9
            e5.b r1 = new e5.b
            r2 = 2131492923(0x7f0c003b, float:1.8609312E38)
            r1.<init>(r10, r2)
            r2 = 2131296578(0x7f090142, float:1.8211077E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r3 = 2131296580(0x7f090144, float:1.821108E38)
            android.view.View r3 = r1.findViewById(r3)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r4 = 2131296579(0x7f090143, float:1.8211079E38)
            android.view.View r4 = r1.findViewById(r4)
            android.widget.RelativeLayout r4 = (android.widget.RelativeLayout) r4
            r6 = 2131296581(0x7f090145, float:1.8211083E38)
            android.view.View r6 = r1.findViewById(r6)
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            r7 = 2131296586(0x7f09014a, float:1.8211093E38)
            android.view.View r7 = r1.findViewById(r7)
            androidx.constraintlayout.widget.ConstraintLayout r7 = (androidx.constraintlayout.widget.ConstraintLayout) r7
            r11 = 2131296585(0x7f090149, float:1.821109E38)
            android.view.View r11 = r1.findViewById(r11)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r12 = 2131296583(0x7f090147, float:1.8211087E38)
            android.view.View r12 = r1.findViewById(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            r13 = 2131296588(0x7f09014c, float:1.8211097E38)
            android.view.View r13 = r1.findViewById(r13)
            android.widget.TextView r13 = (android.widget.TextView) r13
            r14 = 2131296576(0x7f090140, float:1.8211073E38)
            android.view.View r14 = r1.findViewById(r14)
            android.widget.TextView r14 = (android.widget.TextView) r14
            r15 = r8
        L_0x017e:
            int r8 = r5.f7110e0
            if (r15 >= r8) goto L_0x01af
            android.widget.ImageView r8 = new android.widget.ImageView
            r8.<init>(r10)
            android.widget.LinearLayout$LayoutParams r9 = new android.widget.LinearLayout$LayoutParams
            r0 = -2
            r9.<init>(r0, r0)
            r16 = 4611686018427387904(0x4000000000000000, double:2.0)
            int r0 = K1.e.m(r16)
            r9.setMarginStart(r0)
            int r0 = K1.e.m(r16)
            r9.setMarginEnd(r0)
            r8.setLayoutParams(r9)
            r0 = 2131165670(0x7f0701e6, float:1.7945564E38)
            r8.setImageResource(r0)
            r6.addView(r8)
            r0 = 1
            int r15 = r15 + r0
            r9 = r0
            r0 = r23
            goto L_0x017e
        L_0x01af:
            r0 = 6
            if (r8 < r0) goto L_0x01bd
            r0 = 0
            r11.setVisibility(r0)
            r6 = 2131165371(0x7f0700bb, float:1.7944957E38)
            r3.setImageResource(r6)
            goto L_0x01ee
        L_0x01bd:
            r0 = 0
            r7.setVisibility(r0)
            r0 = 2131165341(0x7f07009d, float:1.7944896E38)
            r3.setImageResource(r0)
            int r0 = r5.f7110e0
            int r0 = com.bumptech.glide.d.t0(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r12.setText(r0)
            int r0 = r5.f7110e0
            long r6 = com.bumptech.glide.d.u0(r0)
            java.lang.String r0 = com.mtma.criminal.city.utils.U.a(r6)
            r13.setText(r0)
            int r0 = r5.f7110e0
            long r6 = com.bumptech.glide.d.s0(r0)
            java.lang.String r0 = com.mtma.criminal.city.utils.U.a(r6)
            r14.setText(r0)
        L_0x01ee:
            com.mtma.criminal.city.fragments.gangBase.C r0 = new com.mtma.criminal.city.fragments.gangBase.C
            r3 = 0
            r0.<init>(r5, r2, r1, r3)
            r2.setOnClickListener(r0)
            com.mtma.criminal.city.fragments.gangBase.C r0 = new com.mtma.criminal.city.fragments.gangBase.C
            r7 = 1
            r0.<init>(r5, r4, r1, r7)
            r4.setOnClickListener(r0)
            r1.show()
            goto L_0x02a7
        L_0x0205:
            r7 = r9
            java.lang.Object r0 = r6.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r0 != r2) goto L_0x021c
            com.mtma.criminal.city.fragments.gangBase.H r0 = new com.mtma.criminal.city.fragments.gangBase.H
            r0.<init>(r10, r7)
            r5.V(r0)
            goto L_0x02a7
        L_0x021c:
            java.lang.Object r0 = r6.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r1 = 5
            if (r0 != r1) goto L_0x02a7
            boolean r0 = r5.f7122q0
            if (r0 == 0) goto L_0x022e
            goto L_0x02a7
        L_0x022e:
            r5.f7122q0 = r7
            e5.b r0 = new e5.b
            r1 = 2131492929(0x7f0c0041, float:1.8609324E38)
            r0.<init>(r10, r1)
            r1 = 2131296625(0x7f090171, float:1.8211172E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r4 = 2131296626(0x7f090172, float:1.8211174E38)
            android.view.View r4 = r0.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r6 = 2131296615(0x7f090167, float:1.8211152E38)
            android.view.View r6 = r0.findViewById(r6)
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            r7 = 2131296620(0x7f09016c, float:1.8211162E38)
            android.view.View r7 = r0.findViewById(r7)
            android.widget.RelativeLayout r7 = (android.widget.RelativeLayout) r7
            r8 = 2131296617(0x7f090169, float:1.8211156E38)
            android.view.View r8 = r0.findViewById(r8)
            android.widget.RelativeLayout r8 = (android.widget.RelativeLayout) r8
            r9 = 2131296622(0x7f09016e, float:1.8211166E38)
            android.view.View r9 = r0.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r11 = 0
            r6.setVisibility(r11)
            r6 = 2131886160(0x7f120050, float:1.940689E38)
            r4.setText(r6)
            com.mtma.criminal.city.app.MyApplication r6 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r6 = r6.getApplicationContext()
            android.content.res.Resources r6 = r6.getResources()
            r11 = 2131034840(0x7f0502d8, float:1.7680209E38)
            com.google.android.gms.internal.measurement.a.i(r10, r6, r11, r4)
            r4 = 2131886267(0x7f1200bb, float:1.9407108E38)
            r9.setText(r4)
            r4 = 2131887028(0x7f1203b4, float:1.9408652E38)
            r1.setText(r4)
            com.mtma.criminal.city.fragments.gangBase.C r1 = new com.mtma.criminal.city.fragments.gangBase.C
            r1.<init>(r5, r7, r0, r3)
            r7.setOnClickListener(r1)
            com.mtma.criminal.city.fragments.gangBase.C r1 = new com.mtma.criminal.city.fragments.gangBase.C
            r1.<init>(r5, r8, r0, r2)
            r8.setOnClickListener(r1)
            r0.show()
        L_0x02a7:
            return
        L_0x02a8:
            G4.c r7 = (G4.c) r7
            java.util.ArrayList r0 = r7.f851j0
            java.lang.Object r2 = r0.get(r1)
            b5.k r2 = (b5.k) r2
            int r2 = r2.getType()
            java.lang.Object r0 = r0.get(r1)
            b5.k r0 = (b5.k) r0
            java.lang.String r0 = r0.getIdString()
            android.content.Context r1 = r7.f845d0
            switch(r2) {
                case 0: goto L_0x030c;
                case 1: goto L_0x0306;
                case 2: goto L_0x0306;
                case 3: goto L_0x0306;
                case 4: goto L_0x02c5;
                case 5: goto L_0x02c5;
                case 6: goto L_0x02e9;
                case 7: goto L_0x02e3;
                case 8: goto L_0x02e3;
                case 9: goto L_0x02e3;
                case 10: goto L_0x02e3;
                case 11: goto L_0x02e3;
                case 12: goto L_0x02e3;
                case 13: goto L_0x02e3;
                case 14: goto L_0x02e3;
                case 15: goto L_0x02cc;
                case 16: goto L_0x02cc;
                case 17: goto L_0x02cc;
                case 18: goto L_0x02cc;
                case 19: goto L_0x02cc;
                case 20: goto L_0x02cc;
                case 21: goto L_0x02c5;
                case 22: goto L_0x02c5;
                case 23: goto L_0x02c5;
                case 24: goto L_0x02e3;
                case 25: goto L_0x02cc;
                case 26: goto L_0x02c5;
                case 27: goto L_0x02c6;
                case 28: goto L_0x02c6;
                case 29: goto L_0x02c5;
                case 30: goto L_0x02e3;
                case 31: goto L_0x02e3;
                case 32: goto L_0x02c5;
                case 33: goto L_0x02e3;
                case 34: goto L_0x02e3;
                default: goto L_0x02c5;
            }
        L_0x02c5:
            goto L_0x0304
        L_0x02c6:
            com.mtma.criminal.city.fragments.gangBase.v r2 = new com.mtma.criminal.city.fragments.gangBase.v
            r2.<init>(r1, r0)
            goto L_0x0311
        L_0x02cc:
            java.lang.String r2 = "player_not_visible"
            boolean r2 = java.util.Objects.equals(r0, r2)
            if (r2 == 0) goto L_0x02dd
            com.mtma.criminal.city.app.MyApplication r0 = com.mtma.criminal.city.app.MyApplication.f7090a
            r2 = 2131887061(0x7f1203d5, float:1.9408718E38)
            com.google.android.gms.internal.measurement.a.n(r0, r2, r1, r5)
            goto L_0x0304
        L_0x02dd:
            K4.k r2 = new K4.k
            r2.<init>(r1, r0)
            goto L_0x0311
        L_0x02e3:
            K4.k r2 = new K4.k
            r2.<init>(r1, r0)
            goto L_0x0311
        L_0x02e9:
            d5.j r0 = d5.o.getLocationObject()
            int r0 = r0.getCurrentCity()
            if (r0 != 0) goto L_0x0304
            d5.j r0 = d5.o.getLocationObject()
            int r0 = r0.getCurrentPlace()
            if (r0 != 0) goto L_0x0304
            J4.a r2 = new J4.a
            r0 = 1
            r2.<init>(r1, r0)
            goto L_0x0311
        L_0x0304:
            r2 = r5
            goto L_0x0311
        L_0x0306:
            t4.a r2 = new t4.a
            r2.<init>(r1)
            goto L_0x0311
        L_0x030c:
            N4.a r2 = new N4.a
            r2.<init>(r1)
        L_0x0311:
            if (r2 == 0) goto L_0x032a
            androidx.fragment.app.I r0 = r7.p()
            androidx.fragment.app.a r1 = new androidx.fragment.app.a
            r1.<init>(r0)
            r0 = 1
            r1.f(r6, r2, r5, r0)
            r1.c()
            r0 = 0
            r1.e(r0)
            R2.b.N0()
        L_0x032a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: G4.a.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
    }
}
