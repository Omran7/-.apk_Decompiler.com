package v2;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;

public final class g extends s2.g {

    /* renamed from: H  reason: collision with root package name */
    public static final /* synthetic */ int f12179H = 0;

    /* renamed from: G  reason: collision with root package name */
    public f f12180G;

    public final void e(Canvas canvas) {
        if (this.f12180G.f12178q.isEmpty()) {
            super.e(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(this.f12180G.f12178q);
        } else {
            canvas.clipRect(this.f12180G.f12178q, Region.Op.DIFFERENCE);
        }
        super.e(canvas);
        canvas.restore();
    }

    public final Drawable mutate() {
        this.f12180G = new f(this.f12180G);
        return this;
    }

    public final void n(float f6, float f7, float f8, float f9) {
        RectF rectF = this.f12180G.f12178q;
        if (f6 != rectF.left || f7 != rectF.top || f8 != rectF.right || f9 != rectF.bottom) {
            rectF.set(f6, f7, f8, f9);
            invalidateSelf();
        }
    }
}
