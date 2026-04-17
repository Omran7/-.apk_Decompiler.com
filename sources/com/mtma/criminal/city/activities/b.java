package com.mtma.criminal.city.activities;

import android.content.SharedPreferences;

public final /* synthetic */ class b implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MainActivity f7049a;

    public /* synthetic */ b(MainActivity mainActivity) {
        this.f7049a = mainActivity;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0104, code lost:
        if (r10.equals("Gym") == false) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onSharedPreferenceChanged(android.content.SharedPreferences r10, java.lang.String r11) {
        /*
            r9 = this;
            r0 = 8
            r1 = 2
            r2 = -1
            r3 = 0
            r4 = 1
            int r5 = com.mtma.criminal.city.activities.MainActivity.L0
            com.mtma.criminal.city.activities.MainActivity r5 = r9.f7049a
            r5.getClass()
            if (r11 == 0) goto L_0x0305
            java.lang.String r6 = "clicked_building"
            boolean r7 = r11.equals(r6)
            if (r7 == 0) goto L_0x02ec
            d5.j r11 = d5.o.getLocationObject()
            int r11 = r11.getCurrentPlace()
            java.lang.String r7 = "unknown"
            if (r11 != 0) goto L_0x02dd
            java.lang.String r10 = r10.getString(r6, r7)
            r10.getClass()
            r11 = 0
            int r8 = r10.hashCode()
            switch(r8) {
                case -2140707773: goto L_0x015c;
                case -2096357177: goto L_0x0150;
                case -1896111701: goto L_0x0144;
                case -1824110700: goto L_0x0138;
                case -1674581596: goto L_0x012c;
                case -1002141676: goto L_0x0120;
                case -238984614: goto L_0x0114;
                case -5708289: goto L_0x0108;
                case 72091: goto L_0x00fe;
                case 2062940: goto L_0x00f0;
                case 467764221: goto L_0x00e2;
                case 648960198: goto L_0x00d4;
                case 672986283: goto L_0x00c6;
                case 968785229: goto L_0x00b8;
                case 1231996966: goto L_0x00aa;
                case 1264401565: goto L_0x009d;
                case 1498895617: goto L_0x0090;
                case 1528166823: goto L_0x0083;
                case 1654722127: goto L_0x0076;
                case 1691917683: goto L_0x0069;
                case 1897954555: goto L_0x005c;
                case 2011265045: goto L_0x004f;
                case 2018500369: goto L_0x0042;
                case 2085169004: goto L_0x0035;
                default: goto L_0x0032;
            }
        L_0x0032:
            r0 = r2
            goto L_0x0167
        L_0x0035:
            java.lang.String r0 = "Estate"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x003e
            goto L_0x0032
        L_0x003e:
            r0 = 23
            goto L_0x0167
        L_0x0042:
            java.lang.String r0 = "Cinema"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x004b
            goto L_0x0032
        L_0x004b:
            r0 = 22
            goto L_0x0167
        L_0x004f:
            java.lang.String r0 = "Casino"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0058
            goto L_0x0032
        L_0x0058:
            r0 = 21
            goto L_0x0167
        L_0x005c:
            java.lang.String r0 = "BlackMarket"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0065
            goto L_0x0032
        L_0x0065:
            r0 = 20
            goto L_0x0167
        L_0x0069:
            java.lang.String r0 = "LuckyWheel"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0072
            goto L_0x0032
        L_0x0072:
            r0 = 19
            goto L_0x0167
        L_0x0076:
            java.lang.String r0 = "GangMarket"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x007f
            goto L_0x0032
        L_0x007f:
            r0 = 18
            goto L_0x0167
        L_0x0083:
            java.lang.String r0 = "CityMarket"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x008c
            goto L_0x0032
        L_0x008c:
            r0 = 17
            goto L_0x0167
        L_0x0090:
            java.lang.String r0 = "MummyTomb"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0099
            goto L_0x0032
        L_0x0099:
            r0 = 16
            goto L_0x0167
        L_0x009d:
            java.lang.String r0 = "SecretLab"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x00a6
            goto L_0x0032
        L_0x00a6:
            r0 = 15
            goto L_0x0167
        L_0x00aa:
            java.lang.String r0 = "CityDatabase"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x00b4
            goto L_0x0032
        L_0x00b4:
            r0 = 14
            goto L_0x0167
        L_0x00b8:
            java.lang.String r0 = "WorkOffice"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x00c2
            goto L_0x0032
        L_0x00c2:
            r0 = 13
            goto L_0x0167
        L_0x00c6:
            java.lang.String r0 = "Airport"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x00d0
            goto L_0x0032
        L_0x00d0:
            r0 = 12
            goto L_0x0167
        L_0x00d4:
            java.lang.String r0 = "FightClub"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x00de
            goto L_0x0032
        L_0x00de:
            r0 = 11
            goto L_0x0167
        L_0x00e2:
            java.lang.String r0 = "SkyScraper"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x00ec
            goto L_0x0032
        L_0x00ec:
            r0 = 10
            goto L_0x0167
        L_0x00f0:
            java.lang.String r0 = "Bank"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x00fa
            goto L_0x0032
        L_0x00fa:
            r0 = 9
            goto L_0x0167
        L_0x00fe:
            java.lang.String r8 = "Gym"
            boolean r8 = r10.equals(r8)
            if (r8 != 0) goto L_0x0167
            goto L_0x0032
        L_0x0108:
            java.lang.String r0 = "UpgradeLap"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0112
            goto L_0x0032
        L_0x0112:
            r0 = 7
            goto L_0x0167
        L_0x0114:
            java.lang.String r0 = "Hospital"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x011e
            goto L_0x0032
        L_0x011e:
            r0 = 6
            goto L_0x0167
        L_0x0120:
            java.lang.String r0 = "WarBanner"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x012a
            goto L_0x0032
        L_0x012a:
            r0 = 5
            goto L_0x0167
        L_0x012c:
            java.lang.String r0 = "GangBase"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0136
            goto L_0x0032
        L_0x0136:
            r0 = 4
            goto L_0x0167
        L_0x0138:
            java.lang.String r0 = "School"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0142
            goto L_0x0032
        L_0x0142:
            r0 = 3
            goto L_0x0167
        L_0x0144:
            java.lang.String r0 = "Prison"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x014e
            goto L_0x0032
        L_0x014e:
            r0 = r1
            goto L_0x0167
        L_0x0150:
            java.lang.String r0 = "MercenaryBase"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x015a
            goto L_0x0032
        L_0x015a:
            r0 = r4
            goto L_0x0167
        L_0x015c:
            java.lang.String r0 = "Hangar"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0166
            goto L_0x0032
        L_0x0166:
            r0 = r3
        L_0x0167:
            switch(r0) {
                case 0: goto L_0x02d4;
                case 1: goto L_0x02cb;
                case 2: goto L_0x02c0;
                case 3: goto L_0x02a3;
                case 4: goto L_0x027d;
                case 5: goto L_0x0274;
                case 6: goto L_0x0268;
                case 7: goto L_0x025c;
                case 8: goto L_0x0250;
                case 9: goto L_0x0244;
                case 10: goto L_0x023b;
                case 11: goto L_0x022f;
                case 12: goto L_0x0223;
                case 13: goto L_0x0201;
                case 14: goto L_0x01f5;
                case 15: goto L_0x01ed;
                case 16: goto L_0x01e5;
                case 17: goto L_0x01d9;
                case 18: goto L_0x01cd;
                case 19: goto L_0x01b0;
                case 20: goto L_0x01a4;
                case 21: goto L_0x019c;
                case 22: goto L_0x0190;
                case 23: goto L_0x0184;
                default: goto L_0x016a;
            }
        L_0x016a:
            boolean r10 = r10.equals(r7)
            if (r10 != 0) goto L_0x02e2
            com.mtma.criminal.city.activities.MainActivity r10 = r5.f6979I
            com.mtma.criminal.city.app.MyApplication r11 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r11 = r11.getApplicationContext()
            r0 = 2131888147(0x7f120813, float:1.9410921E38)
            java.lang.String r11 = r11.getString(r0)
            com.mtma.criminal.city.utils.v0.e(r10, r11)
            goto L_0x02e2
        L_0x0184:
            p4.b r10 = new p4.b
            com.mtma.criminal.city.activities.MainActivity r11 = r5.f6979I
            r10.<init>(r11, r4)
            r5.r(r10)
            goto L_0x02e2
        L_0x0190:
            com.mtma.criminal.city.activities.MainActivity r10 = r5.f6979I
            com.mtma.criminal.city.app.MyApplication r0 = com.mtma.criminal.city.app.MyApplication.f7090a
            r1 = 2131888112(0x7f1207f0, float:1.941085E38)
        L_0x0197:
            com.google.android.gms.internal.measurement.a.p(r0, r1, r10, r11)
            goto L_0x02e2
        L_0x019c:
            com.mtma.criminal.city.activities.MainActivity r10 = r5.f6979I
            com.mtma.criminal.city.app.MyApplication r0 = com.mtma.criminal.city.app.MyApplication.f7090a
            r1 = 2131888111(0x7f1207ef, float:1.9410848E38)
            goto L_0x0197
        L_0x01a4:
            p4.b r10 = new p4.b
            com.mtma.criminal.city.activities.MainActivity r11 = r5.f6979I
            r10.<init>(r11, r3)
            r5.r(r10)
            goto L_0x02e2
        L_0x01b0:
            y4.e r10 = new y4.e
            com.mtma.criminal.city.activities.MainActivity r0 = r5.f6979I
            r10.<init>(r0)
            androidx.fragment.app.I r0 = r5.l()
            androidx.fragment.app.a r0 = o3.d.b(r0, r0)
            r1 = 2131296336(0x7f090050, float:1.8210586E38)
            r0.f(r1, r10, r11, r4)
            r0.e(r3)
            R2.b.N0()
            goto L_0x02e2
        L_0x01cd:
            p4.a r10 = new p4.a
            com.mtma.criminal.city.activities.MainActivity r11 = r5.f6979I
            r10.<init>(r11)
            r5.r(r10)
            goto L_0x02e2
        L_0x01d9:
            p4.b r10 = new p4.b
            com.mtma.criminal.city.activities.MainActivity r11 = r5.f6979I
            r10.<init>(r11, r1)
            r5.r(r10)
            goto L_0x02e2
        L_0x01e5:
            com.mtma.criminal.city.activities.MainActivity r10 = r5.f6979I
            com.mtma.criminal.city.app.MyApplication r0 = com.mtma.criminal.city.app.MyApplication.f7090a
            r1 = 2131888117(0x7f1207f5, float:1.941086E38)
            goto L_0x0197
        L_0x01ed:
            com.mtma.criminal.city.activities.MainActivity r10 = r5.f6979I
            com.mtma.criminal.city.app.MyApplication r0 = com.mtma.criminal.city.app.MyApplication.f7090a
            r1 = 2131888125(0x7f1207fd, float:1.9410876E38)
            goto L_0x0197
        L_0x01f5:
            P4.s r10 = new P4.s
            com.mtma.criminal.city.activities.MainActivity r11 = r5.f6979I
            r10.<init>(r11)
            r5.r(r10)
            goto L_0x02e2
        L_0x0201:
            d5.v r10 = d5.o.getWorkObject()
            int r10 = r10.getJobType()
            if (r10 != r2) goto L_0x0217
            W4.h r10 = new W4.h
            com.mtma.criminal.city.activities.MainActivity r11 = r5.f6979I
            r10.<init>(r11)
            r5.r(r10)
            goto L_0x02e2
        L_0x0217:
            W4.g r10 = new W4.g
            com.mtma.criminal.city.activities.MainActivity r11 = r5.f6979I
            r10.<init>(r11)
            r5.r(r10)
            goto L_0x02e2
        L_0x0223:
            C4.a r10 = new C4.a
            com.mtma.criminal.city.activities.MainActivity r11 = r5.f6979I
            r10.<init>((com.mtma.criminal.city.activities.MainActivity) r11)
            r5.r(r10)
            goto L_0x02e2
        L_0x022f:
            u4.b r10 = new u4.b
            com.mtma.criminal.city.activities.MainActivity r11 = r5.f6979I
            r10.<init>(r11)
            r5.r(r10)
            goto L_0x02e2
        L_0x023b:
            com.mtma.criminal.city.activities.MainActivity r10 = r5.f6979I
            com.mtma.criminal.city.app.MyApplication r0 = com.mtma.criminal.city.app.MyApplication.f7090a
            r1 = 2131888126(0x7f1207fe, float:1.9410879E38)
            goto L_0x0197
        L_0x0244:
            o4.e r10 = new o4.e
            com.mtma.criminal.city.activities.MainActivity r11 = r5.f6979I
            r10.<init>(r11)
            r5.r(r10)
            goto L_0x02e2
        L_0x0250:
            w4.d r10 = new w4.d
            com.mtma.criminal.city.activities.MainActivity r11 = r5.f6979I
            r10.<init>(r11)
            r5.r(r10)
            goto L_0x02e2
        L_0x025c:
            V4.h r10 = new V4.h
            com.mtma.criminal.city.activities.MainActivity r11 = r5.f6979I
            r10.<init>(r11)
            r5.r(r10)
            goto L_0x02e2
        L_0x0268:
            x4.d r10 = new x4.d
            com.mtma.criminal.city.activities.MainActivity r11 = r5.f6979I
            r10.<init>(r11)
            r5.r(r10)
            goto L_0x02e2
        L_0x0274:
            com.mtma.criminal.city.activities.MainActivity r10 = r5.f6979I
            com.mtma.criminal.city.app.MyApplication r0 = com.mtma.criminal.city.app.MyApplication.f7090a
            r1 = 2131888128(0x7f120800, float:1.9410883E38)
            goto L_0x0197
        L_0x027d:
            d5.g r10 = d5.o.getGangObject()
            java.lang.String r10 = r10.getId()
            java.lang.String r11 = "not_in_gang"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x0298
            com.mtma.criminal.city.fragments.gangBase.y r10 = new com.mtma.criminal.city.fragments.gangBase.y
            com.mtma.criminal.city.activities.MainActivity r11 = r5.f6979I
            r10.<init>(r11)
            r5.r(r10)
            goto L_0x02e2
        L_0x0298:
            com.mtma.criminal.city.fragments.gangBase.i r10 = new com.mtma.criminal.city.fragments.gangBase.i
            com.mtma.criminal.city.activities.MainActivity r11 = r5.f6979I
            r10.<init>(r11)
            r5.r(r10)
            goto L_0x02e2
        L_0x02a3:
            d5.q r10 = d5.o.getSchoolObject()
            boolean r10 = r10.isStudying()
            if (r10 == 0) goto L_0x02b5
            O4.b r10 = new O4.b
            com.mtma.criminal.city.activities.MainActivity r11 = r5.f6979I
            r10.<init>(r11)
            goto L_0x02bc
        L_0x02b5:
            J4.a r10 = new J4.a
            com.mtma.criminal.city.activities.MainActivity r11 = r5.f6979I
            r10.<init>(r11, r4)
        L_0x02bc:
            r5.r(r10)
            goto L_0x02e2
        L_0x02c0:
            I4.h r10 = new I4.h
            com.mtma.criminal.city.activities.MainActivity r11 = r5.f6979I
            r10.<init>(r11)
            r5.r(r10)
            goto L_0x02e2
        L_0x02cb:
            com.mtma.criminal.city.activities.MainActivity r10 = r5.f6979I
            com.mtma.criminal.city.app.MyApplication r0 = com.mtma.criminal.city.app.MyApplication.f7090a
            r1 = 2131888116(0x7f1207f4, float:1.9410858E38)
            goto L_0x0197
        L_0x02d4:
            com.mtma.criminal.city.activities.MainActivity r10 = r5.f6979I
            com.mtma.criminal.city.app.MyApplication r0 = com.mtma.criminal.city.app.MyApplication.f7090a
            r1 = 2131888114(0x7f1207f2, float:1.9410854E38)
            goto L_0x0197
        L_0x02dd:
            com.mtma.criminal.city.activities.MainActivity r10 = r5.f6979I
            com.bumptech.glide.c.E0(r10)
        L_0x02e2:
            android.content.SharedPreferences$Editor r10 = r5.f6983K
            android.content.SharedPreferences$Editor r10 = r10.putString(r6, r7)
            r10.apply()
            goto L_0x0305
        L_0x02ec:
            java.lang.String r1 = "progressbar_visibility"
            boolean r11 = r11.equals(r1)
            if (r11 == 0) goto L_0x0305
            boolean r10 = r10.getBoolean(r1, r3)
            if (r10 == 0) goto L_0x0300
            android.widget.LinearLayout r10 = r5.f6994U
            r10.setVisibility(r3)
            goto L_0x0305
        L_0x0300:
            android.widget.LinearLayout r10 = r5.f6994U
            r10.setVisibility(r0)
        L_0x0305:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mtma.criminal.city.activities.b.onSharedPreferenceChanged(android.content.SharedPreferences, java.lang.String):void");
    }
}
