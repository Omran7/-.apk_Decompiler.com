package u0;

import D.a;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* renamed from: u0.f  reason: case insensitive filesystem */
public abstract class C1019f extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public Drawable f11788a;

    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f11788a;
        if (drawable != null) {
            a.a(drawable, theme);
        }
    }

    public final void clearColorFilter() {
        Drawable drawable = this.f11788a;
        if (drawable != null) {
            drawable.clearColorFilter();
        } else {
            super.clearColorFilter();
        }
    }

    public final Drawable getCurrent() {
        Drawable drawable = this.f11788a;
        if (drawable != null) {
            return drawable.getCurrent();
        }
        return super.getCurrent();
    }

    public final int getMinimumHeight() {
        Drawable drawable = this.f11788a;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return super.getMinimumHeight();
    }

    public final int getMinimumWidth() {
        Drawable drawable = this.f11788a;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return super.getMinimumWidth();
    }

    public final boolean getPadding(Rect rect) {
        Drawable drawable = this.f11788a;
        if (drawable != null) {
            return drawable.getPadding(rect);
        }
        return super.getPadding(rect);
    }

    public final int[] getState() {
        Drawable drawable = this.f11788a;
        if (drawable != null) {
            return drawable.getState();
        }
        return super.getState();
    }

    public final Region getTransparentRegion() {
        Drawable drawable = this.f11788a;
        if (drawable != null) {
            return drawable.getTransparentRegion();
        }
        return super.getTransparentRegion();
    }

    public final void jumpToCurrentState() {
        Drawable drawable = this.f11788a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public boolean onLevelChange(int i2) {
        Drawable drawable = this.f11788a;
        if (drawable != null) {
            return drawable.setLevel(i2);
        }
        return super.onLevelChange(i2);
    }

    public final void setChangingConfigurations(int i2) {
        Drawable drawable = this.f11788a;
        if (drawable != null) {
            drawable.setChangingConfigurations(i2);
        } else {
            super.setChangingConfigurations(i2);
        }
    }

    public final void setColorFilter(int i2, PorterDuff.Mode mode) {
        Drawable drawable = this.f11788a;
        if (drawable != null) {
            drawable.setColorFilter(i2, mode);
        } else {
            super.setColorFilter(i2, mode);
        }
    }

    public final void setFilterBitmap(boolean z3) {
        Drawable drawable = this.f11788a;
        if (drawable != null) {
            drawable.setFilterBitmap(z3);
        }
    }

    public final void setHotspot(float f6, float f7) {
        Drawable drawable = this.f11788a;
        if (drawable != null) {
            a.e(drawable, f6, f7);
        }
    }

    public final void setHotspotBounds(int i2, int i5, int i6, int i7) {
        Drawable drawable = this.f11788a;
        if (drawable != null) {
            a.f(drawable, i2, i5, i6, i7);
        }
    }

    public final boolean setState(int[] iArr) {
        Drawable drawable = this.f11788a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return super.setState(iArr);
    }
}
