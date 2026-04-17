package k;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.Log;
import android.widget.TextView;
import com.google.android.gms.common.api.f;

/* renamed from: k.c0  reason: case insensitive filesystem */
public abstract class C0705c0 {
    public static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i2, int i5, TextView textView, TextPaint textPaint, C0713g0 g0Var) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i2);
        StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
        if (i5 == -1) {
            i5 = f.API_PRIORITY_OTHER;
        }
        hyphenationFrequency.setMaxLines(i5);
        try {
            g0Var.a(obtain, textView);
        } catch (ClassCastException unused) {
            Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
        }
        return obtain.build();
    }
}
