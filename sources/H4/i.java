package H4;

import java.util.Comparator;

public final class i implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1052a;

    public /* synthetic */ i(int i2) {
        this.f1052a = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0057, code lost:
        if (r3 == null) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0062, code lost:
        if (r3 != false) goto L_0x005a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int compare(java.lang.Object r7, java.lang.Object r8) {
        /*
            r6 = this;
            r0 = 0
            r1 = 1
            r2 = -1
            int r3 = r6.f1052a
            switch(r3) {
                case 0: goto L_0x0119;
                case 1: goto L_0x00f7;
                case 2: goto L_0x00df;
                case 3: goto L_0x00c7;
                case 4: goto L_0x00b6;
                case 5: goto L_0x00ad;
                case 6: goto L_0x00a0;
                case 7: goto L_0x0093;
                case 8: goto L_0x0086;
                case 9: goto L_0x0077;
                case 10: goto L_0x0043;
                case 11: goto L_0x0035;
                case 12: goto L_0x002b;
                case 13: goto L_0x0022;
                default: goto L_0x0008;
            }
        L_0x0008:
            android.view.View r7 = (android.view.View) r7
            android.view.View r8 = (android.view.View) r8
            java.util.WeakHashMap r3 = K.O.f1352a
            float r7 = K.D.m(r7)
            float r8 = K.D.m(r8)
            int r3 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r3 <= 0) goto L_0x001c
            r0 = r2
            goto L_0x0021
        L_0x001c:
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 >= 0) goto L_0x0021
            r0 = r1
        L_0x0021:
            return r0
        L_0x0022:
            v3.c r7 = (v3.C1048c) r7
            v3.c r8 = (v3.C1048c) r8
            int r7 = r7.compareTo(r8)
            return r7
        L_0x002b:
            q.f r7 = (q.C0929f) r7
            q.f r8 = (q.C0929f) r8
            int r7 = r7.f11064b
            int r8 = r8.f11064b
            int r7 = r7 - r8
            return r7
        L_0x0035:
            android.view.View r7 = (android.view.View) r7
            android.view.View r8 = (android.view.View) r8
            int r7 = r7.getTop()
            int r8 = r8.getTop()
            int r7 = r7 - r8
            return r7
        L_0x0043:
            m0.l r7 = (m0.C0820l) r7
            m0.l r8 = (m0.C0820l) r8
            androidx.recyclerview.widget.RecyclerView r3 = r7.d
            if (r3 != 0) goto L_0x004d
            r4 = r1
            goto L_0x004e
        L_0x004d:
            r4 = r0
        L_0x004e:
            androidx.recyclerview.widget.RecyclerView r5 = r8.d
            if (r5 != 0) goto L_0x0054
            r5 = r1
            goto L_0x0055
        L_0x0054:
            r5 = r0
        L_0x0055:
            if (r4 == r5) goto L_0x005c
            if (r3 != 0) goto L_0x005a
            goto L_0x006c
        L_0x005a:
            r0 = r2
            goto L_0x0076
        L_0x005c:
            boolean r3 = r7.f10014a
            boolean r4 = r8.f10014a
            if (r3 == r4) goto L_0x0065
            if (r3 == 0) goto L_0x006c
            goto L_0x005a
        L_0x0065:
            int r1 = r8.f10015b
            int r2 = r7.f10015b
            int r1 = r1 - r2
            if (r1 == 0) goto L_0x006e
        L_0x006c:
            r0 = r1
            goto L_0x0076
        L_0x006e:
            int r7 = r7.f10016c
            int r8 = r8.f10016c
            int r7 = r7 - r8
            if (r7 == 0) goto L_0x0076
            r0 = r7
        L_0x0076:
            return r0
        L_0x0077:
            Y4.h r7 = (Y4.h) r7
            Y4.h r8 = (Y4.h) r8
            int r8 = r8.f4356c
            long r0 = (long) r8
            int r7 = r7.f4356c
            long r7 = (long) r7
            int r7 = java.lang.Long.compare(r0, r7)
            return r7
        L_0x0086:
            Y4.D r7 = (Y4.D) r7
            Y4.D r8 = (Y4.D) r8
            int r7 = r7.f4293a
            int r8 = r8.f4293a
            int r7 = java.lang.Integer.compare(r7, r8)
            return r7
        L_0x0093:
            c5.b r7 = (c5.C0343b) r7
            c5.b r8 = (c5.C0343b) r8
            int r7 = r7.f5700e
            int r8 = r8.f5700e
            int r7 = java.lang.Integer.compare(r7, r8)
            return r7
        L_0x00a0:
            Y4.l r7 = (Y4.l) r7
            Y4.l r8 = (Y4.l) r8
            long r0 = r7.f4393l
            long r7 = r8.f4393l
            int r7 = java.lang.Long.compare(r0, r7)
            return r7
        L_0x00ad:
            java.lang.Comparable r7 = (java.lang.Comparable) r7
            java.lang.Comparable r8 = (java.lang.Comparable) r8
            int r7 = r7.compareTo(r8)
            return r7
        L_0x00b6:
            java.lang.Long r7 = (java.lang.Long) r7
            java.lang.Long r8 = (java.lang.Long) r8
            long r0 = r7.longValue()
            long r7 = r8.longValue()
            int r7 = java.lang.Long.compare(r0, r7)
            return r7
        L_0x00c7:
            Y4.D r7 = (Y4.D) r7
            Y4.D r8 = (Y4.D) r8
            int r0 = r7.f4298i
            int r1 = r8.f4298i
            if (r0 != r1) goto L_0x00da
            int r8 = r8.f4293a
            int r7 = r7.f4293a
            int r7 = java.lang.Integer.compare(r8, r7)
            goto L_0x00de
        L_0x00da:
            int r7 = java.lang.Integer.compare(r1, r0)
        L_0x00de:
            return r7
        L_0x00df:
            Y4.D r7 = (Y4.D) r7
            Y4.D r8 = (Y4.D) r8
            int r0 = r7.f4298i
            int r1 = r8.f4298i
            if (r0 != r1) goto L_0x00f2
            int r8 = r8.f4293a
            int r7 = r7.f4293a
            int r7 = java.lang.Integer.compare(r8, r7)
            goto L_0x00f6
        L_0x00f2:
            int r7 = java.lang.Integer.compare(r1, r0)
        L_0x00f6:
            return r7
        L_0x00f7:
            Q1.b r7 = (Q1.C0137b) r7
            Q1.b r8 = (Q1.C0137b) r8
            com.google.android.gms.common.internal.I.g(r7)
            com.google.android.gms.common.internal.I.g(r8)
            int r3 = r7.f2404a
            int r4 = r8.f2404a
            if (r3 == r4) goto L_0x010a
            if (r3 < r4) goto L_0x0118
            goto L_0x0114
        L_0x010a:
            int r7 = r7.f2405b
            int r8 = r8.f2405b
            if (r7 != r8) goto L_0x0111
            goto L_0x0117
        L_0x0111:
            if (r7 >= r8) goto L_0x0116
            r1 = r2
        L_0x0114:
            r2 = r1
            goto L_0x0118
        L_0x0116:
            r0 = r1
        L_0x0117:
            r2 = r0
        L_0x0118:
            return r2
        L_0x0119:
            b5.l r7 = (b5.l) r7
            b5.l r8 = (b5.l) r8
            java.lang.Object r8 = r8.getLastMessageTimeInMilli()
            java.lang.Long r8 = (java.lang.Long) r8
            long r0 = r8.longValue()
            java.lang.Object r7 = r7.getLastMessageTimeInMilli()
            java.lang.Long r7 = (java.lang.Long) r7
            long r7 = r7.longValue()
            int r7 = java.lang.Long.compare(r0, r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: H4.i.compare(java.lang.Object, java.lang.Object):int");
    }
}
