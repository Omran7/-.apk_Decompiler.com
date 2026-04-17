package K4;

import android.view.ViewTreeObserver;

public final class e implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1511a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f1512b;

    public /* synthetic */ e(Object obj, int i2) {
        this.f1511a = i2;
        this.f1512b = obj;
    }

    /* JADX WARNING: type inference failed for: r0v11, types: [androidx.fragment.app.s, e5.d] */
    /* JADX WARNING: type inference failed for: r0v12, types: [androidx.fragment.app.s, e5.d] */
    /* JADX WARNING: type inference failed for: r0v13, types: [androidx.fragment.app.s, e5.d] */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x007a, code lost:
        if (r4 != 2) goto L_0x0106;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onGlobalLayout() {
        /*
            r12 = this;
            int r0 = r12.f1511a
            switch(r0) {
                case 0: goto L_0x028c;
                case 1: goto L_0x0276;
                case 2: goto L_0x025d;
                case 3: goto L_0x0235;
                case 4: goto L_0x01d8;
                case 5: goto L_0x0194;
                case 6: goto L_0x0171;
                case 7: goto L_0x014c;
                case 8: goto L_0x012a;
                case 9: goto L_0x0051;
                case 10: goto L_0x003b;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r12.f1512b
            w4.d r0 = (w4.C1088d) r0
            android.widget.ImageView r1 = r0.f12456F0
            android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
            r1.removeOnGlobalLayoutListener(r12)
            android.widget.ImageView r1 = r0.f12456F0
            int r1 = r1.getMeasuredWidth()
            r0.f12466R0 = r1
            d5.h r1 = d5.o.getGymObject()
            int r1 = r1.getSelectedGymLesson()
            int r1 = r1 + 1
            boolean r1 = I1.b.n0(r1)
            if (r1 == 0) goto L_0x0031
            android.widget.LinearLayout r0 = r0.f12455E0
            r1 = 4
            r0.setVisibility(r1)
            goto L_0x003a
        L_0x0031:
            android.widget.LinearLayout r1 = r0.f12455E0
            r2 = 0
            r1.setVisibility(r2)
            r0.W()
        L_0x003a:
            return
        L_0x003b:
            java.lang.Object r0 = r12.f1512b
            u4.g r0 = (u4.g) r0
            android.widget.ImageView r1 = r0.f11882F0
            android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
            r1.removeOnGlobalLayoutListener(r12)
            android.widget.ImageView r1 = r0.f11882F0
            int r1 = r1.getMeasuredHeight()
            r0.f11900a1 = r1
            return
        L_0x0051:
            java.lang.Object r0 = r12.f1512b
            m4.b r0 = (m4.C0840b) r0
            it.sephiroth.android.library.widget.HListView r1 = r0.f10178p0
            android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
            r1.removeOnGlobalLayoutListener(r12)
            it.sephiroth.android.library.widget.HListView r1 = r0.f10178p0
            int r1 = r1.getWidth()
            r0.f10181t0 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 2
            r3 = 0
            int r4 = r0.f10167e0
            r5 = 2131166507(0x7f07052b, float:1.7947261E38)
            r6 = 2131887491(0x7f120583, float:1.940959E38)
            if (r4 == 0) goto L_0x00b5
            r7 = 1
            if (r4 == r7) goto L_0x007e
            if (r4 == r2) goto L_0x00b5
            goto L_0x0106
        L_0x007e:
            Y4.D r8 = new Y4.D
            r9 = 2131166196(0x7f0703f4, float:1.794663E38)
            r10 = 2131887699(0x7f120653, float:1.9410012E38)
            r11 = 2131887737(0x7f120679, float:1.941009E38)
            r8.<init>(r10, r11, r9)
            r1.add(r8)
            Y4.D r8 = new Y4.D
            r9 = 2131887492(0x7f120584, float:1.9409593E38)
            r8.<init>(r6, r9, r5)
            r1.add(r8)
            Y4.D r5 = new Y4.D
            r6 = 2131166500(0x7f070524, float:1.7947247E38)
            r8 = 2131886416(0x7f120150, float:1.940741E38)
            r9 = 2131886417(0x7f120151, float:1.9407412E38)
            r5.<init>(r8, r9, r6)
            r1.add(r5)
            r5 = 3001(0xbb9, float:4.205E-42)
            Y4.D r5 = Y4.D.s(r5, r3, r7)
            r1.add(r5)
            goto L_0x0106
        L_0x00b5:
            Y4.D r7 = new Y4.D
            r8 = 2131886133(0x7f120035, float:1.9406836E38)
            r9 = 2131166505(0x7f070529, float:1.7947257E38)
            r7.<init>(r6, r8, r9)
            r1.add(r7)
            Y4.D r7 = new Y4.D
            r8 = 2131886134(0x7f120036, float:1.9406838E38)
            r9 = 2131166506(0x7f07052a, float:1.794726E38)
            r7.<init>(r6, r8, r9)
            r1.add(r7)
            Y4.D r7 = new Y4.D
            r8 = 2131886135(0x7f120037, float:1.940684E38)
            r7.<init>(r6, r8, r5)
            r1.add(r7)
            Y4.D r5 = new Y4.D
            r7 = 2131886136(0x7f120038, float:1.9406842E38)
            r8 = 2131166508(0x7f07052c, float:1.7947263E38)
            r5.<init>(r6, r7, r8)
            r1.add(r5)
            Y4.D r5 = new Y4.D
            r7 = 2131886137(0x7f120039, float:1.9406844E38)
            r8 = 2131166509(0x7f07052d, float:1.7947265E38)
            r5.<init>(r6, r7, r8)
            r1.add(r5)
            Y4.D r5 = new Y4.D
            r7 = 2131886138(0x7f12003a, float:1.9406846E38)
            r8 = 2131166510(0x7f07052e, float:1.7947267E38)
            r5.<init>(r6, r7, r8)
            r1.add(r5)
        L_0x0106:
            boolean r5 = r1.isEmpty()
            if (r5 != 0) goto L_0x0129
            androidx.constraintlayout.widget.ConstraintLayout r5 = r0.f10179q0
            r5.setVisibility(r3)
            j4.e0 r5 = new j4.e0
            if (r4 == 0) goto L_0x0118
            if (r4 == r2) goto L_0x0118
            goto L_0x011a
        L_0x0118:
            r3 = 20
        L_0x011a:
            int r2 = r0.f10181t0
            com.mtma.criminal.city.activities.MainActivity r4 = r0.f10166d0
            r5.<init>((com.mtma.criminal.city.activities.MainActivity) r4, (java.util.ArrayList) r1, (int) r3, (int) r2)
            it.sephiroth.android.library.widget.HListView r0 = r0.f10178p0
            r0.setAdapter((android.widget.ListAdapter) r5)
            r5.notifyDataSetChanged()
        L_0x0129:
            return
        L_0x012a:
            java.lang.Object r0 = r12.f1512b
            k.N r0 = (k.C0676N) r0
            k.Q r1 = r0.f9213P
            r0.getClass()
            boolean r2 = r1.isAttachedToWindow()
            if (r2 == 0) goto L_0x0148
            android.graphics.Rect r2 = r0.f9211N
            boolean r1 = r1.getGlobalVisibleRect(r2)
            if (r1 == 0) goto L_0x0148
            r0.s()
            r0.c()
            goto L_0x014b
        L_0x0148:
            r0.dismiss()
        L_0x014b:
            return
        L_0x014c:
            java.lang.Object r0 = r12.f1512b
            k.Q r0 = (k.C0682Q) r0
            k.P r1 = r0.getInternalPopup()
            boolean r1 = r1.b()
            if (r1 != 0) goto L_0x0167
            int r1 = r0.getTextDirection()
            int r2 = r0.getTextAlignment()
            k.P r3 = r0.f9225f
            r3.m(r1, r2)
        L_0x0167:
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            if (r0 == 0) goto L_0x0170
            r0.removeOnGlobalLayoutListener(r12)
        L_0x0170:
            return
        L_0x0171:
            java.lang.Object r0 = r12.f1512b
            j.B r0 = (j.C0599B) r0
            boolean r1 = r0.b()
            if (r1 == 0) goto L_0x0193
            k.I0 r1 = r0.f8652q
            boolean r2 = r1.f9160H
            if (r2 != 0) goto L_0x0193
            android.view.View r2 = r0.f8657v
            if (r2 == 0) goto L_0x0190
            boolean r2 = r2.isShown()
            if (r2 != 0) goto L_0x018c
            goto L_0x0190
        L_0x018c:
            r1.c()
            goto L_0x0193
        L_0x0190:
            r0.dismiss()
        L_0x0193:
            return
        L_0x0194:
            java.lang.Object r0 = r12.f1512b
            j.e r0 = (j.e) r0
            boolean r1 = r0.b()
            if (r1 == 0) goto L_0x01d7
            java.util.ArrayList r1 = r0.f8697q
            int r2 = r1.size()
            if (r2 <= 0) goto L_0x01d7
            r2 = 0
            java.lang.Object r2 = r1.get(r2)
            j.d r2 = (j.d) r2
            k.I0 r2 = r2.f8681a
            boolean r2 = r2.f9160H
            if (r2 != 0) goto L_0x01d7
            android.view.View r2 = r0.f8704x
            if (r2 == 0) goto L_0x01d4
            boolean r2 = r2.isShown()
            if (r2 != 0) goto L_0x01be
            goto L_0x01d4
        L_0x01be:
            java.util.Iterator r0 = r1.iterator()
        L_0x01c2:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01d7
            java.lang.Object r1 = r0.next()
            j.d r1 = (j.d) r1
            k.I0 r1 = r1.f8681a
            r1.c()
            goto L_0x01c2
        L_0x01d4:
            r0.dismiss()
        L_0x01d7:
            return
        L_0x01d8:
            java.lang.Object r0 = r12.f1512b
            e5.e r0 = (e5.C0508e) r0
            r0.getClass()
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            androidx.fragment.app.v r2 = r0.d
            android.view.WindowManager r3 = r2.getWindowManager()
            android.view.Display r3 = r3.getDefaultDisplay()
            r3.getSize(r1)
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            android.view.View r4 = r0.f7697b
            r4.getWindowVisibleDisplayFrame(r3)
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
            int r2 = r2.orientation
            int r1 = r1.y
            int r3 = r3.bottom
            int r4 = r0.f7700f
            int r4 = r4 + r3
            int r4 = r1 - r4
            int r5 = r0.f7699e
            if (r5 != 0) goto L_0x0217
            r0.f7699e = r3
            int r3 = r3 - r1
            r0.f7700f = r3
        L_0x0217:
            if (r4 != 0) goto L_0x0222
            androidx.fragment.app.s r0 = r0.f7696a
            if (r0 == 0) goto L_0x0234
            r1 = 0
            r0.f(r1)
            goto L_0x0234
        L_0x0222:
            r1 = 1
            if (r2 != r1) goto L_0x022d
            androidx.fragment.app.s r0 = r0.f7696a
            if (r0 == 0) goto L_0x0234
            r0.f(r4)
            goto L_0x0234
        L_0x022d:
            androidx.fragment.app.s r0 = r0.f7696a
            if (r0 == 0) goto L_0x0234
            r0.f(r4)
        L_0x0234:
            return
        L_0x0235:
            java.lang.Object r0 = r12.f1512b
            com.mtma.criminal.city.activities.StartActivity r0 = (com.mtma.criminal.city.activities.StartActivity) r0
            android.widget.ImageView r1 = r0.f7032M
            int r1 = r1.getMeasuredWidth()
            r0.f7034O = r1
            int r1 = r0.f7034O
            if (r1 == 0) goto L_0x025c
            android.widget.ImageView r1 = r0.f7032M
            android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
            r1.removeOnGlobalLayoutListener(r12)
            r0.t()
            android.widget.TextView r1 = r0.f7030K
            r2 = 2131886439(0x7f120167, float:1.9407457E38)
            r1.setText(r2)
            r0.p()
        L_0x025c:
            return
        L_0x025d:
            java.lang.Object r0 = r12.f1512b
            V4.h r0 = (V4.h) r0
            android.widget.ImageView r1 = r0.f3808D0
            android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
            r1.removeOnGlobalLayoutListener(r12)
            android.widget.ImageView r1 = r0.f3808D0
            int r1 = r1.getMeasuredWidth()
            r0.f3828a1 = r1
            V4.h.V(r0)
            return
        L_0x0276:
            java.lang.Object r0 = r12.f1512b
            T4.d r0 = (T4.d) r0
            it.sephiroth.android.library.widget.HListView r1 = r0.f3590g0
            android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
            r1.removeOnGlobalLayoutListener(r12)
            it.sephiroth.android.library.widget.HListView r1 = r0.f3590g0
            int r1 = r1.getWidth()
            r0.f3600q0 = r1
            return
        L_0x028c:
            java.lang.Object r0 = r12.f1512b
            K4.k r0 = (K4.k) r0
            it.sephiroth.android.library.widget.HListView r1 = r0.f1566q0
            android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
            r1.removeOnGlobalLayoutListener(r12)
            it.sephiroth.android.library.widget.HListView r1 = r0.f1566q0
            int r1 = r1.getWidth()
            r0.f1548U0 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: K4.e.onGlobalLayout():void");
    }
}
