package e2;

import D.a;
import K.O;
import K1.e;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import com.mtma.criminal.city.R;
import java.util.WeakHashMap;
import q2.C0935a;
import s2.f;
import s2.g;
import s2.k;
import s2.v;

/* renamed from: e2.c  reason: case insensitive filesystem */
public final class C0487c {

    /* renamed from: a  reason: collision with root package name */
    public final MaterialButton f7575a;

    /* renamed from: b  reason: collision with root package name */
    public k f7576b;

    /* renamed from: c  reason: collision with root package name */
    public int f7577c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public int f7578e;

    /* renamed from: f  reason: collision with root package name */
    public int f7579f;
    public int g;
    public int h;

    /* renamed from: i  reason: collision with root package name */
    public PorterDuff.Mode f7580i;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f7581j;

    /* renamed from: k  reason: collision with root package name */
    public ColorStateList f7582k;

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f7583l;

    /* renamed from: m  reason: collision with root package name */
    public g f7584m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f7585n = false;

    /* renamed from: o  reason: collision with root package name */
    public boolean f7586o = false;

    /* renamed from: p  reason: collision with root package name */
    public boolean f7587p = false;

    /* renamed from: q  reason: collision with root package name */
    public boolean f7588q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f7589r = true;

    /* renamed from: s  reason: collision with root package name */
    public RippleDrawable f7590s;

    /* renamed from: t  reason: collision with root package name */
    public int f7591t;

    public C0487c(MaterialButton materialButton, k kVar) {
        this.f7575a = materialButton;
        this.f7576b = kVar;
    }

    public final v a() {
        RippleDrawable rippleDrawable = this.f7590s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        if (this.f7590s.getNumberOfLayers() > 2) {
            return (v) this.f7590s.getDrawable(2);
        }
        return (v) this.f7590s.getDrawable(1);
    }

    public final g b(boolean z3) {
        RippleDrawable rippleDrawable = this.f7590s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (g) ((LayerDrawable) ((InsetDrawable) this.f7590s.getDrawable(0)).getDrawable()).getDrawable(z3 ^ true ? 1 : 0);
    }

    public final void c(k kVar) {
        this.f7576b = kVar;
        if (b(false) != null) {
            b(false).setShapeAppearanceModel(kVar);
        }
        if (b(true) != null) {
            b(true).setShapeAppearanceModel(kVar);
        }
        if (a() != null) {
            a().setShapeAppearanceModel(kVar);
        }
    }

    public final void d(int i2, int i5) {
        WeakHashMap weakHashMap = O.f1352a;
        MaterialButton materialButton = this.f7575a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i6 = this.f7578e;
        int i7 = this.f7579f;
        this.f7579f = i5;
        this.f7578e = i2;
        if (!this.f7586o) {
            e();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i2) - i6, paddingEnd, (paddingBottom + i5) - i7);
    }

    public final void e() {
        int i2;
        g gVar = new g(this.f7576b);
        MaterialButton materialButton = this.f7575a;
        gVar.h(materialButton.getContext());
        a.h(gVar, this.f7581j);
        PorterDuff.Mode mode = this.f7580i;
        if (mode != null) {
            a.i(gVar, mode);
        }
        ColorStateList colorStateList = this.f7582k;
        gVar.f11459a.f11447j = (float) this.h;
        gVar.invalidateSelf();
        f fVar = gVar.f11459a;
        if (fVar.d != colorStateList) {
            fVar.d = colorStateList;
            gVar.onStateChange(gVar.getState());
        }
        g gVar2 = new g(this.f7576b);
        gVar2.setTint(0);
        float f6 = (float) this.h;
        if (this.f7585n) {
            i2 = e.t(materialButton, R.attr.colorSurface);
        } else {
            i2 = 0;
        }
        gVar2.f11459a.f11447j = f6;
        gVar2.invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(i2);
        f fVar2 = gVar2.f11459a;
        if (fVar2.d != valueOf) {
            fVar2.d = valueOf;
            gVar2.onStateChange(gVar2.getState());
        }
        g gVar3 = new g(this.f7576b);
        this.f7584m = gVar3;
        a.g(gVar3, -1);
        RippleDrawable rippleDrawable = new RippleDrawable(C0935a.a(this.f7583l), new InsetDrawable(new LayerDrawable(new Drawable[]{gVar2, gVar}), this.f7577c, this.f7578e, this.d, this.f7579f), this.f7584m);
        this.f7590s = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        g b6 = b(false);
        if (b6 != null) {
            b6.i((float) this.f7591t);
            b6.setState(materialButton.getDrawableState());
        }
    }

    public final void f() {
        int i2 = 0;
        g b6 = b(false);
        g b7 = b(true);
        if (b6 != null) {
            ColorStateList colorStateList = this.f7582k;
            b6.f11459a.f11447j = (float) this.h;
            b6.invalidateSelf();
            f fVar = b6.f11459a;
            if (fVar.d != colorStateList) {
                fVar.d = colorStateList;
                b6.onStateChange(b6.getState());
            }
            if (b7 != null) {
                float f6 = (float) this.h;
                if (this.f7585n) {
                    i2 = e.t(this.f7575a, R.attr.colorSurface);
                }
                b7.f11459a.f11447j = f6;
                b7.invalidateSelf();
                ColorStateList valueOf = ColorStateList.valueOf(i2);
                f fVar2 = b7.f11459a;
                if (fVar2.d != valueOf) {
                    fVar2.d = valueOf;
                    b7.onStateChange(b7.getState());
                }
            }
        }
    }
}
