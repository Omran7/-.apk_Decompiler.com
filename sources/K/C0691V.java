package k;

import android.widget.TextView;

/* renamed from: k.V  reason: case insensitive filesystem */
public abstract class C0691V {
    public static int a(TextView textView) {
        return textView.getAutoSizeStepGranularity();
    }

    public static void b(TextView textView, int i2, int i5, int i6, int i7) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(i2, i5, i6, i7);
    }

    public static void c(TextView textView, int[] iArr, int i2) {
        textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
    }

    public static boolean d(TextView textView, String str) {
        return textView.setFontVariationSettings(str);
    }
}
