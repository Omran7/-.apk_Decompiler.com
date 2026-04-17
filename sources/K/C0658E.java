package k;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AbsSeekBar;
import android.widget.RatingBar;
import com.mtma.criminal.city.R;

/* renamed from: k.E  reason: case insensitive filesystem */
public final class C0658E extends RatingBar {

    /* renamed from: a  reason: collision with root package name */
    public final C0654C f9178a;

    public C0658E(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        C0681P0.a(this, getContext());
        C0654C c3 = new C0654C((AbsSeekBar) this);
        this.f9178a = c3;
        c3.b(attributeSet, R.attr.ratingBarStyle);
    }

    public final synchronized void onMeasure(int i2, int i5) {
        super.onMeasure(i2, i5);
        Bitmap bitmap = (Bitmap) this.f9178a.f9146c;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i2, 0), getMeasuredHeight());
        }
    }
}
