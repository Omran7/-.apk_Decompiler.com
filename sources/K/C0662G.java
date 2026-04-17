package k;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.mtma.criminal.city.R;

/* renamed from: k.G  reason: case insensitive filesystem */
public final class C0662G extends SeekBar {

    /* renamed from: a  reason: collision with root package name */
    public final C0664H f9179a;

    public C0662G(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        C0681P0.a(this, getContext());
        C0664H h = new C0664H(this);
        this.f9179a = h;
        h.b(attributeSet, R.attr.seekBarStyle);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0664H h = this.f9179a;
        Drawable drawable = h.f9181f;
        if (drawable != null && drawable.isStateful()) {
            C0662G g = h.f9180e;
            if (drawable.setState(g.getDrawableState())) {
                g.invalidateDrawable(drawable);
            }
        }
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f9179a.f9181f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f9179a.g(canvas);
    }
}
