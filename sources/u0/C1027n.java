package u0;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* renamed from: u0.n  reason: case insensitive filesystem */
public final class C1027n extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    public final Drawable.ConstantState f11830a;

    public C1027n(Drawable.ConstantState constantState) {
        this.f11830a = constantState;
    }

    public final boolean canApplyTheme() {
        return this.f11830a.canApplyTheme();
    }

    public int getChangingConfigurations() {
        return this.f11830a.getChangingConfigurations();
    }

    public final Drawable newDrawable() {
        C1028o oVar = new C1028o();
        oVar.f11788a = (VectorDrawable) this.f11830a.newDrawable();
        return oVar;
    }

    public final Drawable newDrawable(Resources resources) {
        C1028o oVar = new C1028o();
        oVar.f11788a = (VectorDrawable) this.f11830a.newDrawable(resources);
        return oVar;
    }

    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C1028o oVar = new C1028o();
        oVar.f11788a = (VectorDrawable) this.f11830a.newDrawable(resources, theme);
        return oVar;
    }
}
