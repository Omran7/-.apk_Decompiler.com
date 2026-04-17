package com.mtma.criminal.city.activities;

import i3.C0585a;

public final class p implements C0585a {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(i3.C0587c r5) {
        /*
            r4 = this;
            i3.f r5 = r5.f8279b     // Catch:{ Exception -> 0x001d }
            java.lang.String r5 = r5.F()     // Catch:{ Exception -> 0x001d }
            if (r5 == 0) goto L_0x0084
            int r0 = r5.hashCode()     // Catch:{ Exception -> 0x001d }
            r1 = 3
            r2 = 1
            r3 = 2
            switch(r0) {
                case -1755775097: goto L_0x0033;
                case 1150977784: goto L_0x0029;
                case 1291580368: goto L_0x001f;
                case 1964807059: goto L_0x0013;
                default: goto L_0x0012;
            }     // Catch:{ Exception -> 0x001d }
        L_0x0012:
            goto L_0x003d
        L_0x0013:
            java.lang.String r0 = "othersBlockedMap"
            boolean r5 = r5.equals(r0)     // Catch:{ Exception -> 0x001d }
            if (r5 == 0) goto L_0x003d
            r5 = r3
            goto L_0x003e
        L_0x001d:
            r5 = move-exception
            goto L_0x007b
        L_0x001f:
            java.lang.String r0 = "blockedMap"
            boolean r5 = r5.equals(r0)     // Catch:{ Exception -> 0x001d }
            if (r5 == 0) goto L_0x003d
            r5 = r2
            goto L_0x003e
        L_0x0029:
            java.lang.String r0 = "requestsMap"
            boolean r5 = r5.equals(r0)     // Catch:{ Exception -> 0x001d }
            if (r5 == 0) goto L_0x003d
            r5 = r1
            goto L_0x003e
        L_0x0033:
            java.lang.String r0 = "friendsMap"
            boolean r5 = r5.equals(r0)     // Catch:{ Exception -> 0x001d }
            if (r5 == 0) goto L_0x003d
            r5 = 0
            goto L_0x003e
        L_0x003d:
            r5 = -1
        L_0x003e:
            if (r5 == 0) goto L_0x006e
            if (r5 == r2) goto L_0x0061
            if (r5 == r3) goto L_0x0054
            if (r5 == r1) goto L_0x0047
            goto L_0x0084
        L_0x0047:
            d5.d r5 = d5.o.getContactsObject()     // Catch:{ Exception -> 0x001d }
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ Exception -> 0x001d }
            r0.<init>()     // Catch:{ Exception -> 0x001d }
            r5.setRequestsMap(r0)     // Catch:{ Exception -> 0x001d }
            goto L_0x0084
        L_0x0054:
            d5.d r5 = d5.o.getContactsObject()     // Catch:{ Exception -> 0x001d }
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ Exception -> 0x001d }
            r0.<init>()     // Catch:{ Exception -> 0x001d }
            r5.setOthersBlockedMap(r0)     // Catch:{ Exception -> 0x001d }
            goto L_0x0084
        L_0x0061:
            d5.d r5 = d5.o.getContactsObject()     // Catch:{ Exception -> 0x001d }
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ Exception -> 0x001d }
            r0.<init>()     // Catch:{ Exception -> 0x001d }
            r5.setBlockedMap(r0)     // Catch:{ Exception -> 0x001d }
            goto L_0x0084
        L_0x006e:
            d5.d r5 = d5.o.getContactsObject()     // Catch:{ Exception -> 0x001d }
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ Exception -> 0x001d }
            r0.<init>()     // Catch:{ Exception -> 0x001d }
            r5.setFriendsMap(r0)     // Catch:{ Exception -> 0x001d }
            goto L_0x0084
        L_0x007b:
            int r0 = com.mtma.criminal.city.activities.MainActivity.L0
            java.lang.String r0 = "Exception from try-catch block inside MainActivity in addListenerToContacts method."
            java.lang.String r1 = "MainActivity"
            h0.C0552a.x(r5, r0, r1)
        L_0x0084:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mtma.criminal.city.activities.p.i(i3.c):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void k(i3.C0587c r6) {
        /*
            r5 = this;
            i3.f r0 = r6.f8279b     // Catch:{ Exception -> 0x001d }
            java.lang.String r0 = r0.F()     // Catch:{ Exception -> 0x001d }
            if (r0 == 0) goto L_0x009d
            int r1 = r0.hashCode()     // Catch:{ Exception -> 0x001d }
            r2 = 3
            r3 = 1
            r4 = 2
            switch(r1) {
                case -1755775097: goto L_0x0034;
                case 1150977784: goto L_0x002a;
                case 1291580368: goto L_0x0020;
                case 1964807059: goto L_0x0013;
                default: goto L_0x0012;
            }     // Catch:{ Exception -> 0x001d }
        L_0x0012:
            goto L_0x003e
        L_0x0013:
            java.lang.String r1 = "othersBlockedMap"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x001d }
            if (r0 == 0) goto L_0x003e
            r0 = r4
            goto L_0x003f
        L_0x001d:
            r6 = move-exception
            goto L_0x0094
        L_0x0020:
            java.lang.String r1 = "blockedMap"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x001d }
            if (r0 == 0) goto L_0x003e
            r0 = r3
            goto L_0x003f
        L_0x002a:
            java.lang.String r1 = "requestsMap"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x001d }
            if (r0 == 0) goto L_0x003e
            r0 = r2
            goto L_0x003f
        L_0x0034:
            java.lang.String r1 = "friendsMap"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x001d }
            if (r0 == 0) goto L_0x003e
            r0 = 0
            goto L_0x003f
        L_0x003e:
            r0 = -1
        L_0x003f:
            if (r0 == 0) goto L_0x0081
            if (r0 == r3) goto L_0x006e
            if (r0 == r4) goto L_0x005b
            if (r0 == r2) goto L_0x0048
            goto L_0x009d
        L_0x0048:
            com.mtma.criminal.city.activities.MainActivity$5$4 r0 = new com.mtma.criminal.city.activities.MainActivity$5$4     // Catch:{ Exception -> 0x001d }
            r0.<init>(r5)     // Catch:{ Exception -> 0x001d }
            java.lang.Object r6 = r6.e(r0)     // Catch:{ Exception -> 0x001d }
            java.util.Map r6 = (java.util.Map) r6     // Catch:{ Exception -> 0x001d }
            d5.d r0 = d5.o.getContactsObject()     // Catch:{ Exception -> 0x001d }
            r0.setRequestsMap(r6)     // Catch:{ Exception -> 0x001d }
            goto L_0x009d
        L_0x005b:
            com.mtma.criminal.city.activities.MainActivity$5$3 r0 = new com.mtma.criminal.city.activities.MainActivity$5$3     // Catch:{ Exception -> 0x001d }
            r0.<init>(r5)     // Catch:{ Exception -> 0x001d }
            java.lang.Object r6 = r6.e(r0)     // Catch:{ Exception -> 0x001d }
            java.util.Map r6 = (java.util.Map) r6     // Catch:{ Exception -> 0x001d }
            d5.d r0 = d5.o.getContactsObject()     // Catch:{ Exception -> 0x001d }
            r0.setOthersBlockedMap(r6)     // Catch:{ Exception -> 0x001d }
            goto L_0x009d
        L_0x006e:
            com.mtma.criminal.city.activities.MainActivity$5$2 r0 = new com.mtma.criminal.city.activities.MainActivity$5$2     // Catch:{ Exception -> 0x001d }
            r0.<init>(r5)     // Catch:{ Exception -> 0x001d }
            java.lang.Object r6 = r6.e(r0)     // Catch:{ Exception -> 0x001d }
            java.util.Map r6 = (java.util.Map) r6     // Catch:{ Exception -> 0x001d }
            d5.d r0 = d5.o.getContactsObject()     // Catch:{ Exception -> 0x001d }
            r0.setBlockedMap(r6)     // Catch:{ Exception -> 0x001d }
            goto L_0x009d
        L_0x0081:
            com.mtma.criminal.city.activities.MainActivity$5$1 r0 = new com.mtma.criminal.city.activities.MainActivity$5$1     // Catch:{ Exception -> 0x001d }
            r0.<init>(r5)     // Catch:{ Exception -> 0x001d }
            java.lang.Object r6 = r6.e(r0)     // Catch:{ Exception -> 0x001d }
            java.util.Map r6 = (java.util.Map) r6     // Catch:{ Exception -> 0x001d }
            d5.d r0 = d5.o.getContactsObject()     // Catch:{ Exception -> 0x001d }
            r0.setFriendsMap(r6)     // Catch:{ Exception -> 0x001d }
            goto L_0x009d
        L_0x0094:
            int r0 = com.mtma.criminal.city.activities.MainActivity.L0
            java.lang.String r0 = "Exception from try-catch block inside MainActivity in addListenerToContacts method."
            java.lang.String r1 = "MainActivity"
            h0.C0552a.x(r6, r0, r1)
        L_0x009d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mtma.criminal.city.activities.p.k(i3.c):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q(i3.C0587c r6) {
        /*
            r5 = this;
            i3.f r0 = r6.f8279b     // Catch:{ Exception -> 0x001d }
            java.lang.String r0 = r0.F()     // Catch:{ Exception -> 0x001d }
            if (r0 == 0) goto L_0x009d
            int r1 = r0.hashCode()     // Catch:{ Exception -> 0x001d }
            r2 = 3
            r3 = 1
            r4 = 2
            switch(r1) {
                case -1755775097: goto L_0x0034;
                case 1150977784: goto L_0x002a;
                case 1291580368: goto L_0x0020;
                case 1964807059: goto L_0x0013;
                default: goto L_0x0012;
            }     // Catch:{ Exception -> 0x001d }
        L_0x0012:
            goto L_0x003e
        L_0x0013:
            java.lang.String r1 = "othersBlockedMap"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x001d }
            if (r0 == 0) goto L_0x003e
            r0 = r4
            goto L_0x003f
        L_0x001d:
            r6 = move-exception
            goto L_0x0094
        L_0x0020:
            java.lang.String r1 = "blockedMap"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x001d }
            if (r0 == 0) goto L_0x003e
            r0 = r3
            goto L_0x003f
        L_0x002a:
            java.lang.String r1 = "requestsMap"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x001d }
            if (r0 == 0) goto L_0x003e
            r0 = r2
            goto L_0x003f
        L_0x0034:
            java.lang.String r1 = "friendsMap"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x001d }
            if (r0 == 0) goto L_0x003e
            r0 = 0
            goto L_0x003f
        L_0x003e:
            r0 = -1
        L_0x003f:
            if (r0 == 0) goto L_0x0081
            if (r0 == r3) goto L_0x006e
            if (r0 == r4) goto L_0x005b
            if (r0 == r2) goto L_0x0048
            goto L_0x009d
        L_0x0048:
            com.mtma.criminal.city.activities.MainActivity$5$8 r0 = new com.mtma.criminal.city.activities.MainActivity$5$8     // Catch:{ Exception -> 0x001d }
            r0.<init>(r5)     // Catch:{ Exception -> 0x001d }
            java.lang.Object r6 = r6.e(r0)     // Catch:{ Exception -> 0x001d }
            java.util.Map r6 = (java.util.Map) r6     // Catch:{ Exception -> 0x001d }
            d5.d r0 = d5.o.getContactsObject()     // Catch:{ Exception -> 0x001d }
            r0.setRequestsMap(r6)     // Catch:{ Exception -> 0x001d }
            goto L_0x009d
        L_0x005b:
            com.mtma.criminal.city.activities.MainActivity$5$7 r0 = new com.mtma.criminal.city.activities.MainActivity$5$7     // Catch:{ Exception -> 0x001d }
            r0.<init>(r5)     // Catch:{ Exception -> 0x001d }
            java.lang.Object r6 = r6.e(r0)     // Catch:{ Exception -> 0x001d }
            java.util.Map r6 = (java.util.Map) r6     // Catch:{ Exception -> 0x001d }
            d5.d r0 = d5.o.getContactsObject()     // Catch:{ Exception -> 0x001d }
            r0.setOthersBlockedMap(r6)     // Catch:{ Exception -> 0x001d }
            goto L_0x009d
        L_0x006e:
            com.mtma.criminal.city.activities.MainActivity$5$6 r0 = new com.mtma.criminal.city.activities.MainActivity$5$6     // Catch:{ Exception -> 0x001d }
            r0.<init>(r5)     // Catch:{ Exception -> 0x001d }
            java.lang.Object r6 = r6.e(r0)     // Catch:{ Exception -> 0x001d }
            java.util.Map r6 = (java.util.Map) r6     // Catch:{ Exception -> 0x001d }
            d5.d r0 = d5.o.getContactsObject()     // Catch:{ Exception -> 0x001d }
            r0.setBlockedMap(r6)     // Catch:{ Exception -> 0x001d }
            goto L_0x009d
        L_0x0081:
            com.mtma.criminal.city.activities.MainActivity$5$5 r0 = new com.mtma.criminal.city.activities.MainActivity$5$5     // Catch:{ Exception -> 0x001d }
            r0.<init>(r5)     // Catch:{ Exception -> 0x001d }
            java.lang.Object r6 = r6.e(r0)     // Catch:{ Exception -> 0x001d }
            java.util.Map r6 = (java.util.Map) r6     // Catch:{ Exception -> 0x001d }
            d5.d r0 = d5.o.getContactsObject()     // Catch:{ Exception -> 0x001d }
            r0.setFriendsMap(r6)     // Catch:{ Exception -> 0x001d }
            goto L_0x009d
        L_0x0094:
            int r0 = com.mtma.criminal.city.activities.MainActivity.L0
            java.lang.String r0 = "Exception from try-catch block inside MainActivity in addListenerToContacts method."
            java.lang.String r1 = "MainActivity"
            h0.C0552a.x(r6, r0, r1)
        L_0x009d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mtma.criminal.city.activities.p.q(i3.c):void");
    }
}
