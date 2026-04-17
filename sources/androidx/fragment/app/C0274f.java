package androidx.fragment.app;

import E2.f;
import X4.d;

/* renamed from: androidx.fragment.app.f  reason: case insensitive filesystem */
public final class C0274f extends f {

    /* renamed from: c  reason: collision with root package name */
    public boolean f5107c;
    public boolean d;

    /* renamed from: e  reason: collision with root package name */
    public d f5108e;

    /* JADX WARNING: Missing exception handler attribute for start block: B:73:0x00e0 */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00e0 A[SYNTHETIC, Splitter:B:73:0x00e0] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X4.d o(android.content.Context r9) {
        /*
            r8 = this;
            boolean r0 = r8.d
            if (r0 == 0) goto L_0x0007
            X4.d r9 = r8.f5108e
            return r9
        L_0x0007:
            java.lang.Object r0 = r8.f620a
            androidx.fragment.app.U r0 = (androidx.fragment.app.U) r0
            int r1 = r0.f5064a
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 != r3) goto L_0x0014
            r1 = r4
            goto L_0x0015
        L_0x0014:
            r1 = r2
        L_0x0015:
            androidx.fragment.app.s r0 = r0.f5066c
            androidx.fragment.app.q r3 = r0.f5162Q
            if (r3 != 0) goto L_0x001d
            r5 = r2
            goto L_0x001f
        L_0x001d:
            int r5 = r3.f5142f
        L_0x001f:
            boolean r6 = r8.f5107c
            if (r6 == 0) goto L_0x0032
            if (r1 == 0) goto L_0x002c
            if (r3 != 0) goto L_0x0029
        L_0x0027:
            r3 = r2
            goto L_0x003f
        L_0x0029:
            int r3 = r3.d
            goto L_0x003f
        L_0x002c:
            if (r3 != 0) goto L_0x002f
            goto L_0x0027
        L_0x002f:
            int r3 = r3.f5141e
            goto L_0x003f
        L_0x0032:
            if (r1 == 0) goto L_0x003a
            if (r3 != 0) goto L_0x0037
            goto L_0x0027
        L_0x0037:
            int r3 = r3.f5139b
            goto L_0x003f
        L_0x003a:
            if (r3 != 0) goto L_0x003d
            goto L_0x0027
        L_0x003d:
            int r3 = r3.f5140c
        L_0x003f:
            r0.S(r2, r2, r2, r2)
            android.view.ViewGroup r2 = r0.f5158M
            r6 = 0
            if (r2 == 0) goto L_0x0055
            r7 = 2131298564(0x7f090904, float:1.8215105E38)
            java.lang.Object r2 = r2.getTag(r7)
            if (r2 == 0) goto L_0x0055
            android.view.ViewGroup r2 = r0.f5158M
            r2.setTag(r7, r6)
        L_0x0055:
            android.view.ViewGroup r0 = r0.f5158M
            if (r0 == 0) goto L_0x0061
            android.animation.LayoutTransition r0 = r0.getLayoutTransition()
            if (r0 == 0) goto L_0x0061
            goto L_0x00fd
        L_0x0061:
            if (r3 != 0) goto L_0x00be
            if (r5 == 0) goto L_0x00be
            r0 = 4097(0x1001, float:5.741E-42)
            if (r5 == r0) goto L_0x00b4
            r0 = 8194(0x2002, float:1.1482E-41)
            if (r5 == r0) goto L_0x00aa
            r0 = 8197(0x2005, float:1.1486E-41)
            if (r5 == r0) goto L_0x0098
            r0 = 4099(0x1003, float:5.744E-42)
            if (r5 == r0) goto L_0x008e
            r0 = 4100(0x1004, float:5.745E-42)
            if (r5 == r0) goto L_0x007c
            r0 = -1
        L_0x007a:
            r3 = r0
            goto L_0x00be
        L_0x007c:
            if (r1 == 0) goto L_0x0086
            r0 = 16842936(0x10100b8, float:2.3694074E-38)
            int r0 = com.bumptech.glide.d.e1(r9, r0)
            goto L_0x007a
        L_0x0086:
            r0 = 16842937(0x10100b9, float:2.3694076E-38)
            int r0 = com.bumptech.glide.d.e1(r9, r0)
            goto L_0x007a
        L_0x008e:
            if (r1 == 0) goto L_0x0094
            r0 = 2130837509(0x7f020005, float:1.7279974E38)
            goto L_0x007a
        L_0x0094:
            r0 = 2130837510(0x7f020006, float:1.7279976E38)
            goto L_0x007a
        L_0x0098:
            if (r1 == 0) goto L_0x00a2
            r0 = 16842938(0x10100ba, float:2.369408E-38)
            int r0 = com.bumptech.glide.d.e1(r9, r0)
            goto L_0x007a
        L_0x00a2:
            r0 = 16842939(0x10100bb, float:2.3694082E-38)
            int r0 = com.bumptech.glide.d.e1(r9, r0)
            goto L_0x007a
        L_0x00aa:
            if (r1 == 0) goto L_0x00b0
            r0 = 2130837507(0x7f020003, float:1.727997E38)
            goto L_0x007a
        L_0x00b0:
            r0 = 2130837508(0x7f020004, float:1.7279972E38)
            goto L_0x007a
        L_0x00b4:
            if (r1 == 0) goto L_0x00ba
            r0 = 2130837511(0x7f020007, float:1.7279978E38)
            goto L_0x007a
        L_0x00ba:
            r0 = 2130837512(0x7f020008, float:1.727998E38)
            goto L_0x007a
        L_0x00be:
            if (r3 == 0) goto L_0x00fd
            android.content.res.Resources r0 = r9.getResources()
            java.lang.String r0 = r0.getResourceTypeName(r3)
            java.lang.String r1 = "anim"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00e0
            android.view.animation.Animation r1 = android.view.animation.AnimationUtils.loadAnimation(r9, r3)     // Catch:{ NotFoundException -> 0x00de, RuntimeException -> 0x00e0 }
            if (r1 == 0) goto L_0x00fd
            X4.d r2 = new X4.d     // Catch:{ NotFoundException -> 0x00de, RuntimeException -> 0x00e0 }
            r5 = 3
            r2.<init>((java.lang.Object) r1, (int) r5)     // Catch:{ NotFoundException -> 0x00de, RuntimeException -> 0x00e0 }
        L_0x00dc:
            r6 = r2
            goto L_0x00fd
        L_0x00de:
            r9 = move-exception
            throw r9
        L_0x00e0:
            android.animation.Animator r1 = android.animation.AnimatorInflater.loadAnimator(r9, r3)     // Catch:{ RuntimeException -> 0x00ec }
            if (r1 == 0) goto L_0x00fd
            X4.d r2 = new X4.d     // Catch:{ RuntimeException -> 0x00ec }
            r2.<init>((android.animation.Animator) r1)     // Catch:{ RuntimeException -> 0x00ec }
            goto L_0x00dc
        L_0x00ec:
            r1 = move-exception
            if (r0 != 0) goto L_0x00fc
            android.view.animation.Animation r9 = android.view.animation.AnimationUtils.loadAnimation(r9, r3)
            if (r9 == 0) goto L_0x00fd
            X4.d r6 = new X4.d
            r0 = 3
            r6.<init>((java.lang.Object) r9, (int) r0)
            goto L_0x00fd
        L_0x00fc:
            throw r1
        L_0x00fd:
            r8.f5108e = r6
            r8.d = r4
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0274f.o(android.content.Context):X4.d");
    }
}
