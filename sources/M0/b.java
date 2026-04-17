package M0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import u0.C1018e;

public final class b extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1781a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f1782b;

    public /* synthetic */ b(Object obj, int i2) {
        this.f1781a = i2;
        this.f1782b = obj;
    }

    public boolean canApplyTheme() {
        switch (this.f1781a) {
            case 1:
                return ((Drawable.ConstantState) this.f1782b).canApplyTheme();
            default:
                return super.canApplyTheme();
        }
    }

    public final int getChangingConfigurations() {
        switch (this.f1781a) {
            case 0:
                return 0;
            default:
                return ((Drawable.ConstantState) this.f1782b).getChangingConfigurations();
        }
    }

    public final Drawable newDrawable() {
        switch (this.f1781a) {
            case 0:
                return new c(this);
            default:
                C1018e eVar = new C1018e((Context) null);
                Drawable newDrawable = ((Drawable.ConstantState) this.f1782b).newDrawable();
                eVar.f11788a = newDrawable;
                newDrawable.setCallback(eVar.f11787f);
                return eVar;
        }
    }

    public final Drawable newDrawable(Resources resources) {
        switch (this.f1781a) {
            case 0:
                return new c(this);
            default:
                C1018e eVar = new C1018e((Context) null);
                Drawable newDrawable = ((Drawable.ConstantState) this.f1782b).newDrawable(resources);
                eVar.f11788a = newDrawable;
                newDrawable.setCallback(eVar.f11787f);
                return eVar;
        }
    }

    public Drawable newDrawable(Resources resources, Resources.Theme theme) {
        switch (this.f1781a) {
            case 1:
                C1018e eVar = new C1018e((Context) null);
                Drawable newDrawable = ((Drawable.ConstantState) this.f1782b).newDrawable(resources, theme);
                eVar.f11788a = newDrawable;
                newDrawable.setCallback(eVar.f11787f);
                return eVar;
            default:
                return super.newDrawable(resources, theme);
        }
    }
}
