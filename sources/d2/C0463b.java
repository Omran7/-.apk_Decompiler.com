package d2;

import R2.b;
import android.view.View;
import android.view.ViewGroup;
import com.bumptech.glide.d;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import x.C1089a;

/* renamed from: d2.b  reason: case insensitive filesystem */
public final class C0463b extends b {

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ int f7517t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ C1089a f7518u;

    public /* synthetic */ C0463b(C1089a aVar, int i2) {
        this.f7517t = i2;
        this.f7518u = aVar;
    }

    public final boolean X0(View view, int i2) {
        View view2;
        WeakReference weakReference;
        switch (this.f7517t) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f7518u;
                int i5 = bottomSheetBehavior.f6299L;
                if (i5 == 1 || bottomSheetBehavior.f6315a0) {
                    return false;
                }
                if (i5 == 3 && bottomSheetBehavior.f6312Y == i2) {
                    WeakReference weakReference2 = bottomSheetBehavior.f6309V;
                    if (weakReference2 != null) {
                        view2 = (View) weakReference2.get();
                    } else {
                        view2 = null;
                    }
                    if (view2 != null && view2.canScrollVertically(-1)) {
                        return false;
                    }
                }
                System.currentTimeMillis();
                WeakReference weakReference3 = bottomSheetBehavior.f6308U;
                if (weakReference3 == null || weakReference3.get() != view) {
                    return false;
                }
                return true;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f7518u;
                if (sideSheetBehavior.h == 1 || (weakReference = sideSheetBehavior.f6496p) == null || weakReference.get() != view) {
                    return false;
                }
                return true;
        }
    }

    public int d0(View view) {
        switch (this.f7517t) {
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f7518u;
                return sideSheetBehavior.f6492l + sideSheetBehavior.f6495o;
            default:
                return super.d0(view);
        }
    }

    public int e0() {
        switch (this.f7517t) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f7518u;
                if (bottomSheetBehavior.f6296I) {
                    return bottomSheetBehavior.f6307T;
                }
                return bottomSheetBehavior.f6294G;
            default:
                return super.e0();
        }
    }

    public final int i(View view, int i2) {
        switch (this.f7517t) {
            case 0:
                return view.getLeft();
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f7518u;
                return d.h(i2, sideSheetBehavior.f6484a.R(), sideSheetBehavior.f6484a.P());
        }
    }

    public final int j(View view, int i2) {
        switch (this.f7517t) {
            case 0:
                return d.h(i2, ((BottomSheetBehavior) this.f7518u).x(), e0());
            default:
                return view.getTop();
        }
    }

    public final void r0(int i2) {
        switch (this.f7517t) {
            case 0:
                if (i2 == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f7518u;
                    if (bottomSheetBehavior.f6298K) {
                        bottomSheetBehavior.C(1);
                        return;
                    }
                    return;
                }
                return;
            default:
                if (i2 == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f7518u;
                    if (sideSheetBehavior.g) {
                        sideSheetBehavior.r(1);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public final void s0(View view, int i2, int i5) {
        View view2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.f7517t) {
            case 0:
                ((BottomSheetBehavior) this.f7518u).u(i5);
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f7518u;
                WeakReference weakReference = sideSheetBehavior.f6497q;
                if (weakReference != null) {
                    view2 = (View) weakReference.get();
                } else {
                    view2 = null;
                }
                if (!(view2 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) == null)) {
                    sideSheetBehavior.f6484a.J0(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.f6501u;
                if (!linkedHashSet.isEmpty()) {
                    sideSheetBehavior.f6484a.l(i2);
                    Iterator it2 = linkedHashSet.iterator();
                    if (it2.hasNext()) {
                        throw o3.d.e(it2);
                    }
                    return;
                }
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005b, code lost:
        if (java.lang.Math.abs(r7 - r0.f6484a.H()) < java.lang.Math.abs(r7 - r0.f6484a.M())) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0080, code lost:
        if (r7 > r4.f6293E) goto L_0x0145;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d0, code lost:
        if (java.lang.Math.abs(r6.getTop() - r4.x()) < java.lang.Math.abs(r6.getTop() - r4.f6293E)) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x011b, code lost:
        if (java.lang.Math.abs(r7 - r4.f6292D) < java.lang.Math.abs(r7 - r4.f6294G)) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002a, code lost:
        if (r0.f6484a.q0(r6) == false) goto L_0x005d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void t0(android.view.View r6, float r7, float r8) {
        /*
            r5 = this;
            int r0 = r5.f7517t
            switch(r0) {
                case 0: goto L_0x0062;
                default: goto L_0x0005;
            }
        L_0x0005:
            x.a r0 = r5.f7518u
            com.google.android.material.sidesheet.SideSheetBehavior r0 = (com.google.android.material.sidesheet.SideSheetBehavior) r0
            I1.b r1 = r0.f6484a
            boolean r1 = r1.m0(r7)
            r2 = 3
            if (r1 == 0) goto L_0x0013
            goto L_0x005d
        L_0x0013:
            I1.b r1 = r0.f6484a
            boolean r1 = r1.E0(r6, r7)
            r3 = 5
            if (r1 == 0) goto L_0x002e
            I1.b r1 = r0.f6484a
            boolean r7 = r1.r0(r7, r8)
            if (r7 != 0) goto L_0x002c
            I1.b r7 = r0.f6484a
            boolean r7 = r7.q0(r6)
            if (r7 == 0) goto L_0x005d
        L_0x002c:
            r2 = r3
            goto L_0x005d
        L_0x002e:
            r1 = 0
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x0040
            float r7 = java.lang.Math.abs(r7)
            float r8 = java.lang.Math.abs(r8)
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 <= 0) goto L_0x0040
            goto L_0x002c
        L_0x0040:
            int r7 = r6.getLeft()
            I1.b r8 = r0.f6484a
            int r8 = r8.H()
            int r8 = r7 - r8
            int r8 = java.lang.Math.abs(r8)
            I1.b r1 = r0.f6484a
            int r1 = r1.M()
            int r7 = r7 - r1
            int r7 = java.lang.Math.abs(r7)
            if (r8 >= r7) goto L_0x002c
        L_0x005d:
            r7 = 1
            r0.t(r6, r2, r7)
            return
        L_0x0062:
            r0 = 0
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r2 = 6
            r3 = 3
            x.a r4 = r5.f7518u
            com.google.android.material.bottomsheet.BottomSheetBehavior r4 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r4
            if (r1 >= 0) goto L_0x0084
            boolean r7 = r4.f6316b
            if (r7 == 0) goto L_0x0074
        L_0x0071:
            r2 = r3
            goto L_0x0145
        L_0x0074:
            int r7 = r6.getTop()
            java.lang.System.currentTimeMillis()
            r4.getClass()
            int r8 = r4.f6293E
            if (r7 <= r8) goto L_0x0071
            goto L_0x0145
        L_0x0084:
            boolean r1 = r4.f6296I
            if (r1 == 0) goto L_0x00d3
            boolean r1 = r4.D(r6, r8)
            if (r1 == 0) goto L_0x00d3
            float r7 = java.lang.Math.abs(r7)
            float r0 = java.lang.Math.abs(r8)
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 >= 0) goto L_0x00a1
            int r7 = r4.d
            float r7 = (float) r7
            int r7 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r7 > 0) goto L_0x00b0
        L_0x00a1:
            int r7 = r6.getTop()
            int r8 = r4.f6307T
            int r0 = r4.x()
            int r0 = r0 + r8
            int r0 = r0 / 2
            if (r7 <= r0) goto L_0x00b3
        L_0x00b0:
            r2 = 5
            goto L_0x0145
        L_0x00b3:
            boolean r7 = r4.f6316b
            if (r7 == 0) goto L_0x00b8
            goto L_0x0071
        L_0x00b8:
            int r7 = r6.getTop()
            int r8 = r4.x()
            int r7 = r7 - r8
            int r7 = java.lang.Math.abs(r7)
            int r8 = r6.getTop()
            int r0 = r4.f6293E
            int r8 = r8 - r0
            int r8 = java.lang.Math.abs(r8)
            if (r7 >= r8) goto L_0x0145
            goto L_0x0071
        L_0x00d3:
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r1 = 4
            if (r0 == 0) goto L_0x0104
            float r7 = java.lang.Math.abs(r7)
            float r8 = java.lang.Math.abs(r8)
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 <= 0) goto L_0x00e5
            goto L_0x0104
        L_0x00e5:
            boolean r7 = r4.f6316b
            if (r7 == 0) goto L_0x00eb
        L_0x00e9:
            r2 = r1
            goto L_0x0145
        L_0x00eb:
            int r7 = r6.getTop()
            int r8 = r4.f6293E
            int r8 = r7 - r8
            int r8 = java.lang.Math.abs(r8)
            int r0 = r4.f6294G
            int r7 = r7 - r0
            int r7 = java.lang.Math.abs(r7)
            if (r8 >= r7) goto L_0x00e9
            r4.getClass()
            goto L_0x0145
        L_0x0104:
            int r7 = r6.getTop()
            boolean r8 = r4.f6316b
            if (r8 == 0) goto L_0x011f
            int r8 = r4.f6292D
            int r8 = r7 - r8
            int r8 = java.lang.Math.abs(r8)
            int r0 = r4.f6294G
            int r7 = r7 - r0
            int r7 = java.lang.Math.abs(r7)
            if (r8 >= r7) goto L_0x00e9
            goto L_0x0071
        L_0x011f:
            int r8 = r4.f6293E
            if (r7 >= r8) goto L_0x0133
            int r8 = r4.f6294G
            int r8 = r7 - r8
            int r8 = java.lang.Math.abs(r8)
            if (r7 >= r8) goto L_0x012f
            goto L_0x0071
        L_0x012f:
            r4.getClass()
            goto L_0x0145
        L_0x0133:
            int r8 = r7 - r8
            int r8 = java.lang.Math.abs(r8)
            int r0 = r4.f6294G
            int r7 = r7 - r0
            int r7 = java.lang.Math.abs(r7)
            if (r8 >= r7) goto L_0x00e9
            r4.getClass()
        L_0x0145:
            r4.getClass()
            r7 = 1
            r4.E(r6, r2, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.C0463b.t0(android.view.View, float, float):void");
    }
}
