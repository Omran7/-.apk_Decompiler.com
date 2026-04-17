package W0;

import android.graphics.RectF;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ImageView;
import com.canhub.cropper.CropOverlayView;
import kotlin.jvm.internal.j;
import o3.d;

public final class t extends Animation implements Animation.AnimationListener {

    /* renamed from: a  reason: collision with root package name */
    public final ImageView f3973a;

    /* renamed from: b  reason: collision with root package name */
    public final CropOverlayView f3974b;

    /* renamed from: c  reason: collision with root package name */
    public final float[] f3975c = new float[8];
    public final float[] d = new float[8];

    /* renamed from: e  reason: collision with root package name */
    public final RectF f3976e = new RectF();

    /* renamed from: f  reason: collision with root package name */
    public final RectF f3977f = new RectF();

    /* renamed from: p  reason: collision with root package name */
    public final float[] f3978p = new float[9];

    /* renamed from: q  reason: collision with root package name */
    public final float[] f3979q = new float[9];

    public t(ImageView imageView, CropOverlayView cropOverlayView) {
        j.e(imageView, "imageView");
        j.e(cropOverlayView, "cropOverlayView");
        this.f3973a = imageView;
        this.f3974b = cropOverlayView;
        setDuration(300);
        setFillAfter(true);
        setInterpolator(new AccelerateDecelerateInterpolator());
        setAnimationListener(this);
    }

    public final void applyTransformation(float f6, Transformation transformation) {
        j.e(transformation, "t");
        RectF rectF = new RectF();
        RectF rectF2 = this.f3976e;
        float f7 = rectF2.left;
        RectF rectF3 = this.f3977f;
        rectF.left = d.a(rectF3.left, f7, f6, f7);
        float f8 = rectF2.top;
        rectF.top = d.a(rectF3.top, f8, f6, f8);
        float f9 = rectF2.right;
        rectF.right = d.a(rectF3.right, f9, f6, f9);
        float f10 = rectF2.bottom;
        rectF.bottom = d.a(rectF3.bottom, f10, f6, f10);
        float[] fArr = new float[8];
        for (int i2 = 0; i2 < 8; i2++) {
            float f11 = this.f3975c[i2];
            fArr[i2] = d.a(this.d[i2], f11, f6, f11);
        }
        CropOverlayView cropOverlayView = this.f3974b;
        cropOverlayView.setCropWindowRect(rectF);
        ImageView imageView = this.f3973a;
        cropOverlayView.h(fArr, imageView.getWidth(), imageView.getHeight());
        cropOverlayView.invalidate();
        float[] fArr2 = new float[9];
        for (int i5 = 0; i5 < 9; i5++) {
            float f12 = this.f3978p[i5];
            fArr2[i5] = d.a(this.f3979q[i5], f12, f6, f12);
        }
        imageView.getImageMatrix().setValues(fArr2);
        imageView.invalidate();
    }

    public final void onAnimationEnd(Animation animation) {
        j.e(animation, "animation");
        this.f3973a.clearAnimation();
    }

    public final void onAnimationRepeat(Animation animation) {
        j.e(animation, "animation");
    }

    public final void onAnimationStart(Animation animation) {
        j.e(animation, "animation");
    }
}
