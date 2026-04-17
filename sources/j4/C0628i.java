package j4;

import android.view.View;
import android.widget.ArrayAdapter;
import e5.C0509f;

/* renamed from: j4.i  reason: case insensitive filesystem */
public final class C0628i extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9023a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f9024b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ArrayAdapter f9025c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0628i(ArrayAdapter arrayAdapter, View view, int i2, int i5) {
        super(view);
        this.f9023a = i5;
        this.f9025c = arrayAdapter;
        this.f9024b = i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:138:0x03aa  */
    /* JADX WARNING: Removed duplicated region for block: B:167:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r12) {
        /*
            r11 = this;
            int r0 = r11.f9023a
            switch(r0) {
                case 0: goto L_0x0417;
                case 1: goto L_0x03c3;
                case 2: goto L_0x0316;
                case 3: goto L_0x0277;
                case 4: goto L_0x024a;
                case 5: goto L_0x023d;
                case 6: goto L_0x01f6;
                case 7: goto L_0x0180;
                case 8: goto L_0x00a8;
                case 9: goto L_0x0018;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.onClick(r12)
            android.widget.ArrayAdapter r12 = r11.f9025c
            j4.q r12 = (j4.C0641q) r12
            int r0 = r12.f9078c
            int r1 = r11.f9024b
            if (r1 == r0) goto L_0x0017
            r12.f9078c = r1
            r12.notifyDataSetChanged()
        L_0x0017:
            return
        L_0x0018:
            super.onClick(r12)
            android.widget.ArrayAdapter r12 = r11.f9025c
            j4.h r12 = (j4.C0626h) r12
            boolean r0 = r12.f9019c
            if (r0 == 0) goto L_0x0025
            goto L_0x00a7
        L_0x0025:
            r0 = 1
            r12.f9019c = r0
            e5.b r6 = new e5.b
            android.content.Context r0 = r12.f9018b
            r1 = 2131492929(0x7f0c0041, float:1.8609324E38)
            r6.<init>(r0, r1)
            r0 = 2131296625(0x7f090171, float:1.8211172E38)
            android.view.View r0 = r6.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 2131296615(0x7f090167, float:1.8211152E38)
            android.view.View r1 = r6.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r2 = 2131296620(0x7f09016c, float:1.8211162E38)
            android.view.View r2 = r6.findViewById(r2)
            r7 = r2
            android.widget.RelativeLayout r7 = (android.widget.RelativeLayout) r7
            r2 = 2131296617(0x7f090169, float:1.8211156E38)
            android.view.View r2 = r6.findViewById(r2)
            r8 = r2
            android.widget.RelativeLayout r8 = (android.widget.RelativeLayout) r8
            r2 = 2131296622(0x7f09016e, float:1.8211166E38)
            android.view.View r2 = r6.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            com.mtma.criminal.city.app.MyApplication r3 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r3 = r3.getApplicationContext()
            int r4 = r11.f9024b
            java.lang.Object r5 = r12.getItem(r4)
            b5.l r5 = (b5.l) r5
            java.lang.String r5 = r5.getPlayerName()
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            r9 = 2131886816(0x7f1202e0, float:1.9408222E38)
            java.lang.String r3 = r3.getString(r9, r5)
            r0.setText(r3)
            r0 = 0
            r1.setVisibility(r0)
            r0 = 2131886300(0x7f1200dc, float:1.9407175E38)
            r2.setText(r0)
            K4.j r9 = new K4.j
            r5 = 12
            r0 = r9
            r1 = r12
            r2 = r7
            r3 = r4
            r4 = r6
            r0.<init>((java.lang.Object) r1, (android.widget.RelativeLayout) r2, (int) r3, (java.lang.Object) r4, (int) r5)
            r7.setOnClickListener(r9)
            j4.f0 r0 = new j4.f0
            r1 = 9
            r0.<init>(r12, r8, r6, r1)
            r8.setOnClickListener(r0)
            r6.show()
        L_0x00a7:
            return
        L_0x00a8:
            super.onClick(r12)
            android.widget.ArrayAdapter r12 = r11.f9025c
            j4.b r12 = (j4.C0614b) r12
            android.content.Context r0 = r12.f8975b
            int r1 = r11.f9024b
            r2 = 0
            java.lang.String r3 = "android.intent.action.VIEW"
            r4 = 0
            switch(r1) {
                case 0: goto L_0x0161;
                case 1: goto L_0x015b;
                case 2: goto L_0x0151;
                case 3: goto L_0x0125;
                case 4: goto L_0x0104;
                case 5: goto L_0x00e1;
                case 6: goto L_0x00c3;
                case 7: goto L_0x00bc;
                default: goto L_0x00ba;
            }
        L_0x00ba:
            goto L_0x0159
        L_0x00bc:
            P4.s r1 = new P4.s
            r1.<init>(r0)
            goto L_0x0166
        L_0x00c3:
            java.lang.String r1 = "https://www.criminalcitygame.com"
            android.content.Intent r5 = new android.content.Intent     // Catch:{ Exception -> 0x00d3 }
            android.net.Uri r6 = android.net.Uri.parse(r1)     // Catch:{ Exception -> 0x00d3 }
            r5.<init>(r3, r6)     // Catch:{ Exception -> 0x00d3 }
            r0.startActivity(r5)     // Catch:{ Exception -> 0x00d3 }
            goto L_0x0159
        L_0x00d3:
            android.content.Intent r5 = new android.content.Intent
            android.net.Uri r1 = android.net.Uri.parse(r1)
            r5.<init>(r3, r1)
            r0.startActivity(r5)
            goto L_0x0159
        L_0x00e1:
            java.lang.String r1 = "http://instagram.com/_u/criminalcitygame"
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch:{ Exception -> 0x00f5 }
            android.content.Intent r5 = new android.content.Intent     // Catch:{ Exception -> 0x00f5 }
            r5.<init>(r3, r1)     // Catch:{ Exception -> 0x00f5 }
            java.lang.String r1 = "com.instagram.android"
            r5.setPackage(r1)     // Catch:{ Exception -> 0x00f5 }
            r0.startActivity(r5)     // Catch:{ Exception -> 0x00f5 }
            goto L_0x0159
        L_0x00f5:
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r5 = "http://instagram.com/criminalcitygame"
            android.net.Uri r5 = android.net.Uri.parse(r5)
            r1.<init>(r3, r5)
            r0.startActivity(r1)
            goto L_0x0159
        L_0x0104:
            java.lang.String r1 = "fb://facewebmodal/f?href=https://www.facebook.com/CriminalCityAr"
            android.content.Intent r5 = new android.content.Intent     // Catch:{ Exception -> 0x0116 }
            r5.<init>(r3)     // Catch:{ Exception -> 0x0116 }
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch:{ Exception -> 0x0116 }
            r5.setData(r1)     // Catch:{ Exception -> 0x0116 }
            r0.startActivity(r5)     // Catch:{ Exception -> 0x0116 }
            goto L_0x0159
        L_0x0116:
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r5 = "https://www.facebook.com/CriminalCityAr"
            android.net.Uri r5 = android.net.Uri.parse(r5)
            r1.<init>(r3, r5)
            r0.startActivity(r1)
            goto L_0x0159
        L_0x0125:
            android.content.pm.PackageManager r1 = r0.getPackageManager()     // Catch:{ Exception -> 0x0142 }
            java.lang.String r5 = "com.twitter.android"
            r1.getPackageInfo(r5, r2)     // Catch:{ Exception -> 0x0142 }
            android.content.Intent r1 = new android.content.Intent     // Catch:{ Exception -> 0x0142 }
            java.lang.String r5 = "twitter://user?screen_name=CriminalCity_Ar"
            android.net.Uri r5 = android.net.Uri.parse(r5)     // Catch:{ Exception -> 0x0142 }
            r1.<init>(r3, r5)     // Catch:{ Exception -> 0x0142 }
            r5 = 268435456(0x10000000, float:2.5243549E-29)
            r1.addFlags(r5)     // Catch:{ Exception -> 0x0142 }
            r0.startActivity(r1)     // Catch:{ Exception -> 0x0142 }
            goto L_0x0159
        L_0x0142:
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r5 = "https://twitter.com/CriminalCity_Ar"
            android.net.Uri r5 = android.net.Uri.parse(r5)
            r1.<init>(r3, r5)
            r0.startActivity(r1)
            goto L_0x0159
        L_0x0151:
            com.mtma.criminal.city.app.MyApplication r1 = com.mtma.criminal.city.app.MyApplication.f7090a
            r3 = 2131888127(0x7f1207ff, float:1.941088E38)
            com.google.android.gms.internal.measurement.a.n(r1, r3, r0, r4)
        L_0x0159:
            r1 = r4
            goto L_0x0166
        L_0x015b:
            H4.j r1 = new H4.j
            r1.<init>(r0)
            goto L_0x0166
        L_0x0161:
            G4.c r1 = new G4.c
            r1.<init>(r0)
        L_0x0166:
            r12.notifyDataSetChanged()
            if (r1 == 0) goto L_0x017f
            f.i r0 = (f.C0518i) r0
            androidx.fragment.app.I r12 = r0.l()
            androidx.fragment.app.a r12 = o3.d.b(r12, r12)
            r0 = 1
            r3 = 2131296333(0x7f09004d, float:1.821058E38)
            r12.f(r3, r1, r4, r0)
            com.google.android.gms.internal.measurement.a.j(r12, r2)
        L_0x017f:
            return
        L_0x0180:
            super.onClick(r12)
            r0 = 2
            int[] r0 = new int[r0]
            r12.getLocationInWindow(r0)
            r12 = 1
            r0 = r0[r12]
            android.widget.ArrayAdapter r1 = r11.f9025c
            j4.b r1 = (j4.C0614b) r1
            android.content.Context r2 = r1.f8975b
            int r3 = r11.f9024b
            java.lang.Object r4 = r1.getItem(r3)
            Y4.d r4 = (Y4.C0247d) r4
            int r4 = r4.f4337a
            r5 = -100
            if (r4 != r5) goto L_0x01af
            Y4.D r12 = new Y4.D
            r1 = 2131887491(0x7f120583, float:1.940959E38)
            r3 = 2131887492(0x7f120584, float:1.9409593E38)
            r4 = 2131166508(0x7f07052c, float:1.7947263E38)
            r12.<init>(r1, r3, r4)
            goto L_0x01f2
        L_0x01af:
            java.lang.Object r4 = r1.getItem(r3)
            Y4.d r4 = (Y4.C0247d) r4
            int r4 = r4.f4337a
            r5 = -101(0xffffffffffffff9b, float:NaN)
            if (r4 != r5) goto L_0x01ca
            Y4.D r12 = new Y4.D
            r1 = 2131886416(0x7f120150, float:1.940741E38)
            r3 = 2131886417(0x7f120151, float:1.9407412E38)
            r4 = 2131166498(0x7f070522, float:1.7947243E38)
            r12.<init>(r1, r3, r4)
            goto L_0x01f2
        L_0x01ca:
            java.lang.Object r4 = r1.getItem(r3)
            Y4.d r4 = (Y4.C0247d) r4
            int r4 = r4.f4337a
            r5 = -102(0xffffffffffffff9a, float:NaN)
            if (r4 != r5) goto L_0x01e5
            Y4.D r12 = new Y4.D
            r1 = 2131886436(0x7f120164, float:1.940745E38)
            r3 = 2131886434(0x7f120162, float:1.9407447E38)
            r4 = 2131166511(0x7f07052f, float:1.794727E38)
            r12.<init>(r1, r3, r4)
            goto L_0x01f2
        L_0x01e5:
            java.lang.Object r1 = r1.getItem(r3)
            Y4.d r1 = (Y4.C0247d) r1
            int r1 = r1.f4337a
            r3 = 0
            Y4.D r12 = Y4.D.s(r1, r3, r12)
        L_0x01f2:
            com.mtma.criminal.city.utils.v0.a(r12, r2, r0)
            return
        L_0x01f6:
            super.onClick(r12)
            android.widget.ArrayAdapter r0 = r11.f9025c
            j4.a r0 = (j4.C0612a) r0
            com.mtma.criminal.city.activities.MainActivity r0 = r0.f8970b
            com.mtma.criminal.city.app.MyApplication r1 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r1 = r1.getApplicationContext()
            com.mtma.criminal.city.app.MyApplication r2 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r2 = r2.getApplicationContext()
            r3 = 1
            int r4 = r11.f9024b
            if (r4 == r3) goto L_0x0227
            r3 = 2
            if (r4 == r3) goto L_0x0223
            r3 = 3
            if (r4 == r3) goto L_0x021f
            r3 = 4
            if (r4 == r3) goto L_0x021b
            r3 = -1
            goto L_0x022a
        L_0x021b:
            r3 = 2131887002(0x7f12039a, float:1.9408599E38)
            goto L_0x022a
        L_0x021f:
            r3 = 2131888919(0x7f120b17, float:1.9412487E38)
            goto L_0x022a
        L_0x0223:
            r3 = 2131886997(0x7f120395, float:1.9408589E38)
            goto L_0x022a
        L_0x0227:
            r3 = 2131888932(0x7f120b24, float:1.9412513E38)
        L_0x022a:
            java.lang.String r2 = r2.getString(r3)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            r3 = 2131888967(0x7f120b47, float:1.9412584E38)
            java.lang.String r1 = r1.getString(r3, r2)
            com.mtma.criminal.city.utils.v0.c(r0, r12, r1)
            return
        L_0x023d:
            super.onClick(r12)
            android.widget.ArrayAdapter r12 = r11.f9025c
            j4.D r12 = (j4.D) r12
            int r0 = r11.f9024b
            j4.D.a(r12, r0)
            return
        L_0x024a:
            super.onClick(r12)
            p4.f r0 = new p4.f
            android.widget.ArrayAdapter r1 = r11.f9025c
            j4.q r1 = (j4.C0641q) r1
            android.content.Context r2 = r1.f9077b
            int r3 = r11.f9024b
            int r1 = r1.f9078c
            r0.<init>(r1, r3, r2)
            android.content.Context r12 = r12.getContext()
            f.i r12 = (f.C0518i) r12
            androidx.fragment.app.I r12 = r12.l()
            androidx.fragment.app.a r12 = o3.d.b(r12, r12)
            r1 = 2131296333(0x7f09004d, float:1.821058E38)
            r2 = 0
            r3 = 1
            r12.f(r1, r0, r2, r3)
            r0 = 0
            com.google.android.gms.internal.measurement.a.j(r12, r0)
            return
        L_0x0277:
            super.onClick(r12)
            android.widget.ArrayAdapter r0 = r11.f9025c
            j4.p r0 = (j4.C0640p) r0
            android.content.Context r1 = r0.f9072b
            r2 = 0
            r3 = 1
            r4 = 0
            int r5 = r11.f9024b
            int r6 = r0.d
            r7 = 2
            if (r6 != r7) goto L_0x0292
            p4.a r0 = new p4.a
            r6 = 0
            r0.<init>(r5, r6, r1)
            goto L_0x02fc
        L_0x0292:
            r8 = 3
            if (r6 != r8) goto L_0x02cd
            if (r5 != 0) goto L_0x029e
            q4.e r0 = new q4.e
            r0.<init>(r1, r2)
            goto L_0x02fc
        L_0x029e:
            if (r5 != r3) goto L_0x02a6
            q4.e r0 = new q4.e
            r0.<init>(r1, r3)
            goto L_0x02fc
        L_0x02a6:
            if (r5 != r7) goto L_0x02ae
            q4.e r0 = new q4.e
            r0.<init>(r1, r7)
            goto L_0x02fc
        L_0x02ae:
            r0 = 5
            if (r5 != r0) goto L_0x02ba
            com.mtma.criminal.city.app.MyApplication r0 = com.mtma.criminal.city.app.MyApplication.f7090a
            r5 = 2131888119(0x7f1207f7, float:1.9410864E38)
            com.google.android.gms.internal.measurement.a.n(r0, r5, r1, r4)
            goto L_0x02fb
        L_0x02ba:
            r0 = 8
            if (r5 != r0) goto L_0x02c7
            com.mtma.criminal.city.app.MyApplication r0 = com.mtma.criminal.city.app.MyApplication.f7090a
            r5 = 2131888120(0x7f1207f8, float:1.9410866E38)
            com.google.android.gms.internal.measurement.a.n(r0, r5, r1, r4)
            goto L_0x02fb
        L_0x02c7:
            Q4.a r0 = new Q4.a
            r0.<init>(r1, r5)
            goto L_0x02fc
        L_0x02cd:
            if (r6 != 0) goto L_0x02f0
            if (r5 == 0) goto L_0x02e9
            if (r5 == r7) goto L_0x02e9
            r0 = 10
            if (r5 == r0) goto L_0x02e9
            r0 = 15
            if (r5 == r0) goto L_0x02e9
            r0 = 6
            if (r5 == r0) goto L_0x02e9
            r0 = 7
            if (r5 == r0) goto L_0x02e9
            E4.e r0 = new E4.e
            r6 = 1
            r7 = 0
            r0.<init>(r1, r5, r6, r7)
            goto L_0x02fc
        L_0x02e9:
            p4.a r0 = new p4.a
            r6 = 1
            r0.<init>(r5, r6, r1)
            goto L_0x02fc
        L_0x02f0:
            if (r6 != r3) goto L_0x02fb
            E4.e r6 = new E4.e
            int r0 = r0.f9073c
            r6.<init>(r0, r5, r1)
            r0 = r6
            goto L_0x02fc
        L_0x02fb:
            r0 = r4
        L_0x02fc:
            if (r0 == 0) goto L_0x0315
            android.content.Context r12 = r12.getContext()
            f.i r12 = (f.C0518i) r12
            androidx.fragment.app.I r12 = r12.l()
            androidx.fragment.app.a r12 = o3.d.b(r12, r12)
            r1 = 2131296333(0x7f09004d, float:1.821058E38)
            r12.f(r1, r0, r4, r3)
            com.google.android.gms.internal.measurement.a.j(r12, r2)
        L_0x0315:
            return
        L_0x0316:
            super.onClick(r12)
            android.widget.ArrayAdapter r0 = r11.f9025c
            j4.p r0 = (j4.C0640p) r0
            android.content.Context r1 = r0.f9072b
            r2 = 1
            r3 = 0
            int r4 = r11.f9024b
            r5 = 3
            r6 = 2
            int r7 = r0.f9073c
            if (r7 != 0) goto L_0x0350
            if (r4 == 0) goto L_0x0349
            if (r4 == r2) goto L_0x0341
            if (r4 == r6) goto L_0x0339
            if (r4 == r5) goto L_0x0332
            goto L_0x035a
        L_0x0332:
            t4.a r0 = new t4.a
            r0.<init>(r1)
            goto L_0x03a8
        L_0x0339:
            t4.c r0 = new t4.c
            r4 = 0
            r0.<init>(r1, r4)
            goto L_0x03a8
        L_0x0341:
            t4.c r0 = new t4.c
            r4 = 1
            r0.<init>(r1, r4)
            goto L_0x03a8
        L_0x0349:
            J4.a r0 = new J4.a
            r4 = 4
            r0.<init>(r1, r4)
            goto L_0x03a8
        L_0x0350:
            if (r7 != r2) goto L_0x035c
            com.mtma.criminal.city.app.MyApplication r0 = com.mtma.criminal.city.app.MyApplication.f7090a
            r4 = 2131888118(0x7f1207f6, float:1.9410862E38)
            com.google.android.gms.internal.measurement.a.n(r0, r4, r1, r3)
        L_0x035a:
            r0 = r3
            goto L_0x03a8
        L_0x035c:
            if (r7 != r6) goto L_0x0367
            com.mtma.criminal.city.app.MyApplication r0 = com.mtma.criminal.city.app.MyApplication.f7090a
            r4 = 2131888122(0x7f1207fa, float:1.941087E38)
            com.google.android.gms.internal.measurement.a.n(r0, r4, r1, r3)
            goto L_0x035a
        L_0x0367:
            if (r7 != r5) goto L_0x0373
            if (r4 == 0) goto L_0x036c
            goto L_0x035a
        L_0x036c:
            J4.a r0 = new J4.a
            r4 = 0
            r0.<init>(r1, r4)
            goto L_0x03a8
        L_0x0373:
            r5 = 5
            if (r7 != r5) goto L_0x037d
            p4.a r0 = new p4.a
            r5 = 2
            r0.<init>(r4, r5, r1)
            goto L_0x03a8
        L_0x037d:
            r5 = 6
            if (r7 != r5) goto L_0x0387
            p4.a r0 = new p4.a
            r5 = 0
            r0.<init>(r4, r5, r1)
            goto L_0x03a8
        L_0x0387:
            r5 = 7
            if (r7 != r5) goto L_0x0392
            E4.e r0 = new E4.e
            r5 = 0
            r6 = 0
            r0.<init>(r1, r4, r5, r6)
            goto L_0x03a8
        L_0x0392:
            r5 = 8
            if (r7 != r5) goto L_0x039f
            E4.d r5 = new E4.d
            int r0 = r0.d
            r5.<init>(r0, r4, r1)
            r0 = r5
            goto L_0x03a8
        L_0x039f:
            r0 = 9
            if (r7 != r0) goto L_0x035a
            W4.g r0 = new W4.g
            r0.<init>(r1, r4)
        L_0x03a8:
            if (r0 == 0) goto L_0x03c2
            android.content.Context r12 = r12.getContext()
            f.i r12 = (f.C0518i) r12
            androidx.fragment.app.I r12 = r12.l()
            androidx.fragment.app.a r12 = o3.d.b(r12, r12)
            r1 = 2131296333(0x7f09004d, float:1.821058E38)
            r12.f(r1, r0, r3, r2)
            r0 = 0
            com.google.android.gms.internal.measurement.a.j(r12, r0)
        L_0x03c2:
            return
        L_0x03c3:
            super.onClick(r12)
            int r0 = j4.C0641q.d
            android.widget.ArrayAdapter r1 = r11.f9025c
            j4.q r1 = (j4.C0641q) r1
            int r2 = r11.f9024b
            r3 = 0
            if (r0 != 0) goto L_0x03e8
            int r0 = r1.f9078c
            if (r2 <= r0) goto L_0x03e8
            com.mtma.criminal.city.app.MyApplication r12 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r12 = r12.getApplicationContext()
            r0 = 2131886978(0x7f120382, float:1.940855E38)
            java.lang.String r12 = r12.getString(r0)
            android.content.Context r0 = r1.f9077b
            com.bumptech.glide.c.s0(r0, r12, r3)
            goto L_0x0416
        L_0x03e8:
            android.content.Context r12 = r12.getContext()
            f.i r12 = (f.C0518i) r12
            androidx.fragment.app.I r12 = r12.l()
            androidx.fragment.app.a r12 = o3.d.b(r12, r12)
            int r0 = j4.C0641q.d
            android.content.Context r1 = r1.f9077b
            r4 = 1
            if (r0 != 0) goto L_0x0403
            s4.b r0 = new s4.b
            r0.<init>(r1, r2)
            goto L_0x040c
        L_0x0403:
            if (r0 != r4) goto L_0x040b
            O4.b r0 = new O4.b
            r0.<init>(r1, r2)
            goto L_0x040c
        L_0x040b:
            r0 = r3
        L_0x040c:
            r1 = 2131296333(0x7f09004d, float:1.821058E38)
            r12.f(r1, r0, r3, r4)
            r0 = 0
            com.google.android.gms.internal.measurement.a.j(r12, r0)
        L_0x0416:
            return
        L_0x0417:
            super.onClick(r12)
            android.widget.ArrayAdapter r12 = r11.f9025c
            j4.j r12 = (j4.C0630j) r12
            boolean r0 = r12.f9033c
            if (r0 == 0) goto L_0x0424
            goto L_0x0501
        L_0x0424:
            r0 = 1
            r12.f9033c = r0
            e5.b r6 = new e5.b
            com.mtma.criminal.city.activities.MainActivity r0 = r12.f9031a
            r1 = 2131492929(0x7f0c0041, float:1.8609324E38)
            r6.<init>(r0, r1)
            r1 = 2131296625(0x7f090171, float:1.8211172E38)
            android.view.View r1 = r6.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2 = 2131296615(0x7f090167, float:1.8211152E38)
            android.view.View r2 = r6.findViewById(r2)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r3 = 2131296620(0x7f09016c, float:1.8211162E38)
            android.view.View r3 = r6.findViewById(r3)
            r7 = r3
            android.widget.RelativeLayout r7 = (android.widget.RelativeLayout) r7
            r3 = 2131296617(0x7f090169, float:1.8211156E38)
            android.view.View r3 = r6.findViewById(r3)
            r8 = r3
            android.widget.RelativeLayout r8 = (android.widget.RelativeLayout) r8
            r3 = 2131296622(0x7f09016e, float:1.8211166E38)
            android.view.View r3 = r6.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            d5.j r4 = d5.o.getLocationObject()
            boolean r4 = r4.isNeedFreeBag()
            int r5 = r11.f9024b
            java.util.ArrayList r9 = r12.f9032b
            if (r4 == 0) goto L_0x04b1
            com.mtma.criminal.city.app.MyApplication r4 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r4 = r4.getApplicationContext()
            android.content.res.Resources r4 = r4.getResources()
            r10 = 2131034840(0x7f0502d8, float:1.7680209E38)
            android.content.res.Resources$Theme r0 = r0.getTheme()
            int r0 = r4.getColor(r10, r0)
            r1.setTextColor(r0)
            com.mtma.criminal.city.app.MyApplication r0 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r0 = r0.getApplicationContext()
            com.mtma.criminal.city.app.MyApplication r4 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r4 = r4.getApplicationContext()
            java.lang.Object r9 = r9.get(r5)
            Y4.w r9 = (Y4.w) r9
            int r9 = r9.f4443a
            int r9 = I1.b.D(r9)
            java.lang.String r4 = r4.getString(r9)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            r9 = 2131887066(0x7f1203da, float:1.9408729E38)
            java.lang.String r0 = r0.getString(r9, r4)
            r1.setText(r0)
            goto L_0x04db
        L_0x04b1:
            com.mtma.criminal.city.app.MyApplication r0 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r0 = r0.getApplicationContext()
            com.mtma.criminal.city.app.MyApplication r4 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r4 = r4.getApplicationContext()
            java.lang.Object r9 = r9.get(r5)
            Y4.w r9 = (Y4.w) r9
            int r9 = r9.f4443a
            int r9 = I1.b.D(r9)
            java.lang.String r4 = r4.getString(r9)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            r9 = 2131887065(0x7f1203d9, float:1.9408727E38)
            java.lang.String r0 = r0.getString(r9, r4)
            r1.setText(r0)
        L_0x04db:
            r0 = 0
            r2.setVisibility(r0)
            r0 = 2131886300(0x7f1200dc, float:1.9407175E38)
            r3.setText(r0)
            K4.j r9 = new K4.j
            r10 = 2
            r0 = r9
            r1 = r12
            r2 = r7
            r3 = r5
            r4 = r6
            r5 = r10
            r0.<init>((java.lang.Object) r1, (android.widget.RelativeLayout) r2, (int) r3, (java.lang.Object) r4, (int) r5)
            r7.setOnClickListener(r9)
            A4.h r0 = new A4.h
            r1 = 13
            r0.<init>(r12, r8, r6, r1)
            r8.setOnClickListener(r0)
            r6.show()
        L_0x0501:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.C0628i.onClick(android.view.View):void");
    }
}
