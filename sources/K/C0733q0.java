package k;

import D.a;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* renamed from: k.q0  reason: case insensitive filesystem */
public final class C0733q0 extends Drawable implements Drawable.Callback {

    /* renamed from: a  reason: collision with root package name */
    public Drawable f9362a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f9363b;

    public final void a(Canvas canvas) {
        this.f9362a.draw(canvas);
    }

    public final void b(float f6, float f7) {
        a.e(this.f9362a, f6, f7);
    }

    public final void c(int i2, int i5, int i6, int i7) {
        a.f(this.f9362a, i2, i5, i6, i7);
    }

    public final boolean d(boolean z3, boolean z4) {
        if (super.setVisible(z3, z4) || this.f9362a.setVisible(z3, z4)) {
            return true;
        }
        return false;
    }

    public final void draw(Canvas canvas) {
        if (this.f9363b) {
            a(canvas);
        }
    }

    public final int getChangingConfigurations() {
        return this.f9362a.getChangingConfigurations();
    }

    public final Drawable getCurrent() {
        return this.f9362a.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f9362a.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f9362a.getIntrinsicWidth();
    }

    public final int getMinimumHeight() {
        return this.f9362a.getMinimumHeight();
    }

    public final int getMinimumWidth() {
        return this.f9362a.getMinimumWidth();
    }

    public final int getOpacity() {
        return this.f9362a.getOpacity();
    }

    public final boolean getPadding(Rect rect) {
        return this.f9362a.getPadding(rect);
    }

    public final int[] getState() {
        return this.f9362a.getState();
    }

    public final Region getTransparentRegion() {
        return this.f9362a.getTransparentRegion();
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public final boolean isAutoMirrored() {
        return this.f9362a.isAutoMirrored();
    }

    public final boolean isStateful() {
        return this.f9362a.isStateful();
    }

    public final void jumpToCurrentState() {
        this.f9362a.jumpToCurrentState();
    }

    public final void onBoundsChange(Rect rect) {
        this.f9362a.setBounds(rect);
    }

    public final boolean onLevelChange(int i2) {
        return this.f9362a.setLevel(i2);
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j6) {
        scheduleSelf(runnable, j6);
    }

    public final void setAlpha(int i2) {
        this.f9362a.setAlpha(i2);
    }

    public final void setAutoMirrored(boolean z3) {
        this.f9362a.setAutoMirrored(z3);
    }

    public final void setChangingConfigurations(int i2) {
        this.f9362a.setChangingConfigurations(i2);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f9362a.setColorFilter(colorFilter);
    }

    public final void setDither(boolean z3) {
        this.f9362a.setDither(z3);
    }

    public final void setFilterBitmap(boolean z3) {
        this.f9362a.setFilterBitmap(z3);
    }

    public final void setHotspot(float f6, float f7) {
        if (this.f9363b) {
            b(f6, f7);
        }
    }

    public final void setHotspotBounds(int i2, int i5, int i6, int i7) {
        if (this.f9363b) {
            c(i2, i5, i6, i7);
        }
    }

    public final boolean setState(int[] iArr) {
        if (this.f9363b) {
            return this.f9362a.setState(iArr);
        }
        return false;
    }

    public final void setTint(int i2) {
        a.g(this.f9362a, i2);
    }

    public final void setTintList(ColorStateList colorStateList) {
        a.h(this.f9362a, colorStateList);
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        a.i(this.f9362a, mode);
    }

    public final boolean setVisible(boolean z3, boolean z4) {
        if (this.f9363b) {
            return d(z3, z4);
        }
        return false;
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
