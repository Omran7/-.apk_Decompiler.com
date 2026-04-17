package k;

import D.a;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.bumptech.glide.c;
import com.mtma.criminal.city.R;
import j.C0602b;

/* renamed from: k.i  reason: case insensitive filesystem */
public final class C0716i extends C0750z implements C0720k {
    public final /* synthetic */ C0718j d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0716i(C0718j jVar, Context context) {
        super(context, (AttributeSet) null, R.attr.actionOverflowButtonStyle);
        this.d = jVar;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        c.o0(this, getContentDescription());
        setOnTouchListener(new C0602b(this, this));
    }

    public final boolean a() {
        return false;
    }

    public final boolean c() {
        return false;
    }

    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.d.l();
        return true;
    }

    public final boolean setFrame(int i2, int i5, int i6, int i7) {
        boolean frame = super.setFrame(i2, i5, i6, i7);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (!(drawable == null || background == null)) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            a.f(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
