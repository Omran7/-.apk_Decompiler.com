package G1;

import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.text.PrecomputedText;
import android.text.TextPaint;

public abstract /* synthetic */ class e {
    public static /* bridge */ /* synthetic */ ImageDecoder.Source f(Object obj) {
        return (ImageDecoder.Source) obj;
    }

    public static /* bridge */ /* synthetic */ AnimatedImageDrawable h(Drawable drawable) {
        return (AnimatedImageDrawable) drawable;
    }

    public static /* synthetic */ PrecomputedText.Params.Builder l(TextPaint textPaint) {
        return new PrecomputedText.Params.Builder(textPaint);
    }

    public static /* bridge */ /* synthetic */ void x(Object obj) {
        ImageDecoder.Source source = (ImageDecoder.Source) obj;
    }

    public static /* bridge */ /* synthetic */ boolean z(Drawable drawable) {
        return drawable instanceof AnimatedImageDrawable;
    }
}
