package W0;

import android.graphics.RectF;
import android.view.ScaleGestureDetector;
import com.canhub.cropper.CropOverlayView;
import kotlin.jvm.internal.j;

public final class J extends ScaleGestureDetector.SimpleOnScaleGestureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CropOverlayView f3884a;

    public J(CropOverlayView cropOverlayView) {
        this.f3884a = cropOverlayView;
    }

    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        j.e(scaleGestureDetector, "detector");
        CropOverlayView cropOverlayView = this.f3884a;
        RectF c3 = cropOverlayView.f5917p.c();
        float focusX = scaleGestureDetector.getFocusX();
        float focusY = scaleGestureDetector.getFocusY();
        float f6 = (float) 2;
        float currentSpanY = scaleGestureDetector.getCurrentSpanY() / f6;
        float currentSpanX = scaleGestureDetector.getCurrentSpanX() / f6;
        float f7 = focusY - currentSpanY;
        float f8 = focusX - currentSpanX;
        float f9 = focusX + currentSpanX;
        float f10 = focusY + currentSpanY;
        if (f8 >= f9 || f7 > f10 || f8 < 0.0f) {
            return true;
        }
        L l6 = cropOverlayView.f5917p;
        float f11 = l6.f3890e;
        float f12 = l6.f3892i / l6.f3894k;
        if (f11 > f12) {
            f11 = f12;
        }
        if (f9 > f11 || f7 < 0.0f) {
            return true;
        }
        float f13 = l6.f3891f;
        float f14 = l6.f3893j / l6.f3895l;
        if (f13 > f14) {
            f13 = f14;
        }
        if (f10 > f13) {
            return true;
        }
        c3.set(f8, f7, f9, f10);
        l6.e(c3);
        cropOverlayView.invalidate();
        return true;
    }
}
