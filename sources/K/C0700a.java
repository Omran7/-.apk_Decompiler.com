package k;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* renamed from: k.a  reason: case insensitive filesystem */
public final class C0700a extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public final ActionBarContainer f9256a;

    public C0700a(ActionBarContainer actionBarContainer) {
        this.f9256a = actionBarContainer;
    }

    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f9256a;
        if (actionBarContainer.f4715p) {
            Drawable drawable = actionBarContainer.f4714f;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = actionBarContainer.f4713e;
        if (drawable3 != null && actionBarContainer.f4716q) {
            drawable3.draw(canvas);
        }
    }

    public final int getOpacity() {
        return 0;
    }

    public final void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f9256a;
        if (!actionBarContainer.f4715p) {
            Drawable drawable = actionBarContainer.d;
            if (drawable != null) {
                drawable.getOutline(outline);
            }
        } else if (actionBarContainer.f4714f != null) {
            actionBarContainer.d.getOutline(outline);
        }
    }

    public final void setAlpha(int i2) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
