package o2;

import K1.e;
import Q.b;
import android.content.res.ColorStateList;
import com.mtma.criminal.city.R;
import k.C0656D;

/* renamed from: o2.a  reason: case insensitive filesystem */
public final class C0895a extends C0656D {

    /* renamed from: p  reason: collision with root package name */
    public static final int[][] f10437p = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: e  reason: collision with root package name */
    public ColorStateList f10438e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f10439f;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f10438e == null) {
            int t6 = e.t(this, R.attr.colorControlActivated);
            int t7 = e.t(this, R.attr.colorOnSurface);
            int t8 = e.t(this, R.attr.colorSurface);
            this.f10438e = new ColorStateList(f10437p, new int[]{e.h0(t8, t6, 1.0f), e.h0(t8, t7, 0.54f), e.h0(t8, t7, 0.38f), e.h0(t8, t7, 0.38f)});
        }
        return this.f10438e;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f10439f && b.a(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z3) {
        this.f10439f = z3;
        if (z3) {
            b.c(this, getMaterialThemeColorsTintList());
        } else {
            b.c(this, (ColorStateList) null);
        }
    }
}
