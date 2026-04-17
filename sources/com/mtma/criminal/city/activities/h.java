package com.mtma.criminal.city.activities;

import i3.C0585a;

public final class h implements C0585a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MainActivity f7061a;

    public h(MainActivity mainActivity) {
        this.f7061a = mainActivity;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0031 A[Catch:{ Exception -> 0x0022 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004b A[Catch:{ Exception -> 0x0022 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(i3.C0587c r4) {
        /*
            r3 = this;
            i3.f r4 = r4.f8279b     // Catch:{ Exception -> 0x0022 }
            java.lang.String r4 = r4.F()     // Catch:{ Exception -> 0x0022 }
            if (r4 == 0) goto L_0x0061
            int r0 = r4.hashCode()     // Catch:{ Exception -> 0x0022 }
            r1 = -157999563(0xfffffffff6951e35, float:-1.5122361E33)
            r2 = 1
            if (r0 == r1) goto L_0x0024
            r1 = 114308720(0x6d03670, float:7.832089E-35)
            if (r0 == r1) goto L_0x0018
            goto L_0x002e
        L_0x0018:
            java.lang.String r0 = "meritsSkills"
            boolean r4 = r4.equals(r0)     // Catch:{ Exception -> 0x0022 }
            if (r4 == 0) goto L_0x002e
            r4 = 0
            goto L_0x002f
        L_0x0022:
            r4 = move-exception
            goto L_0x0058
        L_0x0024:
            java.lang.String r0 = "gangSkills"
            boolean r4 = r4.equals(r0)     // Catch:{ Exception -> 0x0022 }
            if (r4 == 0) goto L_0x002e
            r4 = r2
            goto L_0x002f
        L_0x002e:
            r4 = -1
        L_0x002f:
            if (r4 == 0) goto L_0x004b
            if (r4 == r2) goto L_0x0034
            goto L_0x0061
        L_0x0034:
            d5.r r4 = d5.o.getSkillsObject()     // Catch:{ Exception -> 0x0022 }
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ Exception -> 0x0022 }
            r0.<init>()     // Catch:{ Exception -> 0x0022 }
            r4.setGangSkills(r0)     // Catch:{ Exception -> 0x0022 }
            android.support.v4.media.session.a.t0()     // Catch:{ Exception -> 0x0022 }
            com.mtma.criminal.city.activities.MainActivity r4 = r3.f7061a     // Catch:{ Exception -> 0x0022 }
            l4.i r4 = r4.f7024z0     // Catch:{ Exception -> 0x0022 }
            r4.d0()     // Catch:{ Exception -> 0x0022 }
            goto L_0x0061
        L_0x004b:
            d5.r r4 = d5.o.getSkillsObject()     // Catch:{ Exception -> 0x0022 }
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ Exception -> 0x0022 }
            r0.<init>()     // Catch:{ Exception -> 0x0022 }
            r4.setMeritsSkills(r0)     // Catch:{ Exception -> 0x0022 }
            goto L_0x0061
        L_0x0058:
            int r0 = com.mtma.criminal.city.activities.MainActivity.L0
            java.lang.String r0 = "MainActivity"
            java.lang.String r1 = "Exception from try-catch inside MainActivity class in addListenerToSkills method."
            android.util.Log.e(r0, r1, r4)
        L_0x0061:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mtma.criminal.city.activities.h.i(i3.c):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void k(i3.C0587c r3) {
        /*
            r2 = this;
            i3.f r0 = r3.f8279b     // Catch:{ Exception -> 0x001a }
            java.lang.String r0 = r0.F()     // Catch:{ Exception -> 0x001a }
            if (r0 == 0) goto L_0x0119
            int r1 = r0.hashCode()     // Catch:{ Exception -> 0x001a }
            switch(r1) {
                case -1438166781: goto L_0x0059;
                case -390211014: goto L_0x004f;
                case -157999563: goto L_0x0045;
                case 114308720: goto L_0x003b;
                case 605883228: goto L_0x0031;
                case 851737556: goto L_0x0027;
                case 884244991: goto L_0x001d;
                case 2127931298: goto L_0x0010;
                default: goto L_0x000f;
            }     // Catch:{ Exception -> 0x001a }
        L_0x000f:
            goto L_0x0063
        L_0x0010:
            java.lang.String r1 = "strengthCards"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x001a }
            if (r0 == 0) goto L_0x0063
            r0 = 4
            goto L_0x0064
        L_0x001a:
            r3 = move-exception
            goto L_0x0110
        L_0x001d:
            java.lang.String r1 = "dexterityCards"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x001a }
            if (r0 == 0) goto L_0x0063
            r0 = 7
            goto L_0x0064
        L_0x0027:
            java.lang.String r1 = "meritsFromMedals"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x001a }
            if (r0 == 0) goto L_0x0063
            r0 = 1
            goto L_0x0064
        L_0x0031:
            java.lang.String r1 = "speedCards"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x001a }
            if (r0 == 0) goto L_0x0063
            r0 = 6
            goto L_0x0064
        L_0x003b:
            java.lang.String r1 = "meritsSkills"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x001a }
            if (r0 == 0) goto L_0x0063
            r0 = 2
            goto L_0x0064
        L_0x0045:
            java.lang.String r1 = "gangSkills"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x001a }
            if (r0 == 0) goto L_0x0063
            r0 = 3
            goto L_0x0064
        L_0x004f:
            java.lang.String r1 = "meritsFromChecksOrItems"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x001a }
            if (r0 == 0) goto L_0x0063
            r0 = 0
            goto L_0x0064
        L_0x0059:
            java.lang.String r1 = "defenseCards"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x001a }
            if (r0 == 0) goto L_0x0063
            r0 = 5
            goto L_0x0064
        L_0x0063:
            r0 = -1
        L_0x0064:
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            switch(r0) {
                case 0: goto L_0x00fc;
                case 1: goto L_0x00e8;
                case 2: goto L_0x00d3;
                case 3: goto L_0x00be;
                case 4: goto L_0x00aa;
                case 5: goto L_0x0095;
                case 6: goto L_0x0080;
                case 7: goto L_0x006b;
                default: goto L_0x0069;
            }
        L_0x0069:
            goto L_0x0119
        L_0x006b:
            java.lang.Object r3 = r3.f(r1)     // Catch:{ Exception -> 0x001a }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ Exception -> 0x001a }
            if (r3 == 0) goto L_0x0119
            d5.r r0 = d5.o.getSkillsObject()     // Catch:{ Exception -> 0x001a }
            int r3 = r3.intValue()     // Catch:{ Exception -> 0x001a }
            r0.setDexterityCards(r3)     // Catch:{ Exception -> 0x001a }
            goto L_0x0119
        L_0x0080:
            java.lang.Object r3 = r3.f(r1)     // Catch:{ Exception -> 0x001a }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ Exception -> 0x001a }
            if (r3 == 0) goto L_0x0119
            d5.r r0 = d5.o.getSkillsObject()     // Catch:{ Exception -> 0x001a }
            int r3 = r3.intValue()     // Catch:{ Exception -> 0x001a }
            r0.setSpeedCards(r3)     // Catch:{ Exception -> 0x001a }
            goto L_0x0119
        L_0x0095:
            java.lang.Object r3 = r3.f(r1)     // Catch:{ Exception -> 0x001a }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ Exception -> 0x001a }
            if (r3 == 0) goto L_0x0119
            d5.r r0 = d5.o.getSkillsObject()     // Catch:{ Exception -> 0x001a }
            int r3 = r3.intValue()     // Catch:{ Exception -> 0x001a }
            r0.setDefenseCards(r3)     // Catch:{ Exception -> 0x001a }
            goto L_0x0119
        L_0x00aa:
            java.lang.Object r3 = r3.f(r1)     // Catch:{ Exception -> 0x001a }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ Exception -> 0x001a }
            if (r3 == 0) goto L_0x0119
            d5.r r0 = d5.o.getSkillsObject()     // Catch:{ Exception -> 0x001a }
            int r3 = r3.intValue()     // Catch:{ Exception -> 0x001a }
            r0.setStrengthCards(r3)     // Catch:{ Exception -> 0x001a }
            goto L_0x0119
        L_0x00be:
            com.mtma.criminal.city.activities.MainActivity$12$2 r0 = new com.mtma.criminal.city.activities.MainActivity$12$2     // Catch:{ Exception -> 0x001a }
            r0.<init>(r2)     // Catch:{ Exception -> 0x001a }
            java.lang.Object r3 = r3.e(r0)     // Catch:{ Exception -> 0x001a }
            java.util.Map r3 = (java.util.Map) r3     // Catch:{ Exception -> 0x001a }
            if (r3 == 0) goto L_0x0119
            d5.r r0 = d5.o.getSkillsObject()     // Catch:{ Exception -> 0x001a }
            r0.setGangSkills(r3)     // Catch:{ Exception -> 0x001a }
            goto L_0x0119
        L_0x00d3:
            com.mtma.criminal.city.activities.MainActivity$12$1 r0 = new com.mtma.criminal.city.activities.MainActivity$12$1     // Catch:{ Exception -> 0x001a }
            r0.<init>(r2)     // Catch:{ Exception -> 0x001a }
            java.lang.Object r3 = r3.e(r0)     // Catch:{ Exception -> 0x001a }
            java.util.Map r3 = (java.util.Map) r3     // Catch:{ Exception -> 0x001a }
            if (r3 == 0) goto L_0x0119
            d5.r r0 = d5.o.getSkillsObject()     // Catch:{ Exception -> 0x001a }
            r0.setMeritsSkills(r3)     // Catch:{ Exception -> 0x001a }
            goto L_0x0119
        L_0x00e8:
            java.lang.Object r3 = r3.f(r1)     // Catch:{ Exception -> 0x001a }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ Exception -> 0x001a }
            if (r3 == 0) goto L_0x0119
            d5.r r0 = d5.o.getSkillsObject()     // Catch:{ Exception -> 0x001a }
            int r3 = r3.intValue()     // Catch:{ Exception -> 0x001a }
            r0.setMeritsFromMedals(r3)     // Catch:{ Exception -> 0x001a }
            goto L_0x0119
        L_0x00fc:
            java.lang.Object r3 = r3.f(r1)     // Catch:{ Exception -> 0x001a }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ Exception -> 0x001a }
            if (r3 == 0) goto L_0x0119
            d5.r r0 = d5.o.getSkillsObject()     // Catch:{ Exception -> 0x001a }
            int r3 = r3.intValue()     // Catch:{ Exception -> 0x001a }
            r0.setMeritsFromChecksOrItems(r3)     // Catch:{ Exception -> 0x001a }
            goto L_0x0119
        L_0x0110:
            int r0 = com.mtma.criminal.city.activities.MainActivity.L0
            java.lang.String r0 = "MainActivity"
            java.lang.String r1 = "Exception from try-catch inside MainActivity class in addListenerToSkills method."
            android.util.Log.e(r0, r1, r3)
        L_0x0119:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mtma.criminal.city.activities.h.k(i3.c):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q(i3.C0587c r3) {
        /*
            r2 = this;
            i3.f r0 = r3.f8279b     // Catch:{ Exception -> 0x001a }
            java.lang.String r0 = r0.F()     // Catch:{ Exception -> 0x001a }
            if (r0 == 0) goto L_0x0123
            int r1 = r0.hashCode()     // Catch:{ Exception -> 0x001a }
            switch(r1) {
                case -1438166781: goto L_0x0059;
                case -390211014: goto L_0x004f;
                case -157999563: goto L_0x0045;
                case 114308720: goto L_0x003b;
                case 605883228: goto L_0x0031;
                case 851737556: goto L_0x0027;
                case 884244991: goto L_0x001d;
                case 2127931298: goto L_0x0010;
                default: goto L_0x000f;
            }     // Catch:{ Exception -> 0x001a }
        L_0x000f:
            goto L_0x0063
        L_0x0010:
            java.lang.String r1 = "strengthCards"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x001a }
            if (r0 == 0) goto L_0x0063
            r0 = 4
            goto L_0x0064
        L_0x001a:
            r3 = move-exception
            goto L_0x011a
        L_0x001d:
            java.lang.String r1 = "dexterityCards"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x001a }
            if (r0 == 0) goto L_0x0063
            r0 = 7
            goto L_0x0064
        L_0x0027:
            java.lang.String r1 = "meritsFromMedals"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x001a }
            if (r0 == 0) goto L_0x0063
            r0 = 1
            goto L_0x0064
        L_0x0031:
            java.lang.String r1 = "speedCards"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x001a }
            if (r0 == 0) goto L_0x0063
            r0 = 6
            goto L_0x0064
        L_0x003b:
            java.lang.String r1 = "meritsSkills"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x001a }
            if (r0 == 0) goto L_0x0063
            r0 = 2
            goto L_0x0064
        L_0x0045:
            java.lang.String r1 = "gangSkills"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x001a }
            if (r0 == 0) goto L_0x0063
            r0 = 3
            goto L_0x0064
        L_0x004f:
            java.lang.String r1 = "meritsFromChecksOrItems"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x001a }
            if (r0 == 0) goto L_0x0063
            r0 = 0
            goto L_0x0064
        L_0x0059:
            java.lang.String r1 = "defenseCards"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x001a }
            if (r0 == 0) goto L_0x0063
            r0 = 5
            goto L_0x0064
        L_0x0063:
            r0 = -1
        L_0x0064:
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            switch(r0) {
                case 0: goto L_0x0106;
                case 1: goto L_0x00f2;
                case 2: goto L_0x00dd;
                case 3: goto L_0x00be;
                case 4: goto L_0x00aa;
                case 5: goto L_0x0095;
                case 6: goto L_0x0080;
                case 7: goto L_0x006b;
                default: goto L_0x0069;
            }
        L_0x0069:
            goto L_0x0123
        L_0x006b:
            java.lang.Object r3 = r3.f(r1)     // Catch:{ Exception -> 0x001a }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ Exception -> 0x001a }
            if (r3 == 0) goto L_0x0123
            d5.r r0 = d5.o.getSkillsObject()     // Catch:{ Exception -> 0x001a }
            int r3 = r3.intValue()     // Catch:{ Exception -> 0x001a }
            r0.setDexterityCards(r3)     // Catch:{ Exception -> 0x001a }
            goto L_0x0123
        L_0x0080:
            java.lang.Object r3 = r3.f(r1)     // Catch:{ Exception -> 0x001a }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ Exception -> 0x001a }
            if (r3 == 0) goto L_0x0123
            d5.r r0 = d5.o.getSkillsObject()     // Catch:{ Exception -> 0x001a }
            int r3 = r3.intValue()     // Catch:{ Exception -> 0x001a }
            r0.setSpeedCards(r3)     // Catch:{ Exception -> 0x001a }
            goto L_0x0123
        L_0x0095:
            java.lang.Object r3 = r3.f(r1)     // Catch:{ Exception -> 0x001a }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ Exception -> 0x001a }
            if (r3 == 0) goto L_0x0123
            d5.r r0 = d5.o.getSkillsObject()     // Catch:{ Exception -> 0x001a }
            int r3 = r3.intValue()     // Catch:{ Exception -> 0x001a }
            r0.setDefenseCards(r3)     // Catch:{ Exception -> 0x001a }
            goto L_0x0123
        L_0x00aa:
            java.lang.Object r3 = r3.f(r1)     // Catch:{ Exception -> 0x001a }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ Exception -> 0x001a }
            if (r3 == 0) goto L_0x0123
            d5.r r0 = d5.o.getSkillsObject()     // Catch:{ Exception -> 0x001a }
            int r3 = r3.intValue()     // Catch:{ Exception -> 0x001a }
            r0.setStrengthCards(r3)     // Catch:{ Exception -> 0x001a }
            goto L_0x0123
        L_0x00be:
            com.mtma.criminal.city.activities.MainActivity$12$4 r0 = new com.mtma.criminal.city.activities.MainActivity$12$4     // Catch:{ Exception -> 0x001a }
            r0.<init>(r2)     // Catch:{ Exception -> 0x001a }
            java.lang.Object r3 = r3.e(r0)     // Catch:{ Exception -> 0x001a }
            java.util.Map r3 = (java.util.Map) r3     // Catch:{ Exception -> 0x001a }
            if (r3 == 0) goto L_0x00d2
            d5.r r0 = d5.o.getSkillsObject()     // Catch:{ Exception -> 0x001a }
            r0.setGangSkills(r3)     // Catch:{ Exception -> 0x001a }
        L_0x00d2:
            android.support.v4.media.session.a.t0()     // Catch:{ Exception -> 0x001a }
            com.mtma.criminal.city.activities.MainActivity r3 = r2.f7061a     // Catch:{ Exception -> 0x001a }
            l4.i r3 = r3.f7024z0     // Catch:{ Exception -> 0x001a }
            r3.d0()     // Catch:{ Exception -> 0x001a }
            goto L_0x0123
        L_0x00dd:
            com.mtma.criminal.city.activities.MainActivity$12$3 r0 = new com.mtma.criminal.city.activities.MainActivity$12$3     // Catch:{ Exception -> 0x001a }
            r0.<init>(r2)     // Catch:{ Exception -> 0x001a }
            java.lang.Object r3 = r3.e(r0)     // Catch:{ Exception -> 0x001a }
            java.util.Map r3 = (java.util.Map) r3     // Catch:{ Exception -> 0x001a }
            if (r3 == 0) goto L_0x0123
            d5.r r0 = d5.o.getSkillsObject()     // Catch:{ Exception -> 0x001a }
            r0.setMeritsSkills(r3)     // Catch:{ Exception -> 0x001a }
            goto L_0x0123
        L_0x00f2:
            java.lang.Object r3 = r3.f(r1)     // Catch:{ Exception -> 0x001a }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ Exception -> 0x001a }
            if (r3 == 0) goto L_0x0123
            d5.r r0 = d5.o.getSkillsObject()     // Catch:{ Exception -> 0x001a }
            int r3 = r3.intValue()     // Catch:{ Exception -> 0x001a }
            r0.setMeritsFromMedals(r3)     // Catch:{ Exception -> 0x001a }
            goto L_0x0123
        L_0x0106:
            java.lang.Object r3 = r3.f(r1)     // Catch:{ Exception -> 0x001a }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ Exception -> 0x001a }
            if (r3 == 0) goto L_0x0123
            d5.r r0 = d5.o.getSkillsObject()     // Catch:{ Exception -> 0x001a }
            int r3 = r3.intValue()     // Catch:{ Exception -> 0x001a }
            r0.setMeritsFromChecksOrItems(r3)     // Catch:{ Exception -> 0x001a }
            goto L_0x0123
        L_0x011a:
            int r0 = com.mtma.criminal.city.activities.MainActivity.L0
            java.lang.String r0 = "MainActivity"
            java.lang.String r1 = "Exception from try-catch inside MainActivity class in addListenerToSkills method."
            android.util.Log.e(r0, r1, r3)
        L_0x0123:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mtma.criminal.city.activities.h.q(i3.c):void");
    }
}
