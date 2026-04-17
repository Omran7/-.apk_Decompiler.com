package I;

import G1.e;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import java.util.Objects;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final TextPaint f1082a;

    /* renamed from: b  reason: collision with root package name */
    public final TextDirectionHeuristic f1083b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1084c;
    public final int d;

    public d(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i2, int i5) {
        if (Build.VERSION.SDK_INT >= 29) {
            e.l(textPaint).setBreakStrategy(i2).setHyphenationFrequency(i5).setTextDirection(textDirectionHeuristic).build();
        }
        this.f1082a = textPaint;
        this.f1083b = textDirectionHeuristic;
        this.f1084c = i2;
        this.d = i5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r7 = (I.d) r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r7 instanceof I.d
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            I.d r7 = (I.d) r7
            int r1 = r7.f1084c
            int r3 = r6.f1084c
            if (r3 == r1) goto L_0x0014
            goto L_0x0099
        L_0x0014:
            int r1 = r6.d
            int r3 = r7.d
            if (r1 == r3) goto L_0x001c
            goto L_0x0099
        L_0x001c:
            android.text.TextPaint r1 = r6.f1082a
            float r3 = r1.getTextSize()
            android.text.TextPaint r4 = r7.f1082a
            float r5 = r4.getTextSize()
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x002e
            goto L_0x0099
        L_0x002e:
            float r3 = r1.getTextScaleX()
            float r5 = r4.getTextScaleX()
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x003b
            goto L_0x0099
        L_0x003b:
            float r3 = r1.getTextSkewX()
            float r5 = r4.getTextSkewX()
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x0048
            goto L_0x0099
        L_0x0048:
            float r3 = r1.getLetterSpacing()
            float r5 = r4.getLetterSpacing()
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x0055
            goto L_0x0099
        L_0x0055:
            java.lang.String r3 = r1.getFontFeatureSettings()
            java.lang.String r5 = r4.getFontFeatureSettings()
            boolean r3 = android.text.TextUtils.equals(r3, r5)
            if (r3 != 0) goto L_0x0064
            goto L_0x0099
        L_0x0064:
            int r3 = r1.getFlags()
            int r5 = r4.getFlags()
            if (r3 == r5) goto L_0x006f
            goto L_0x0099
        L_0x006f:
            android.os.LocaleList r3 = r1.getTextLocales()
            android.os.LocaleList r5 = r4.getTextLocales()
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x007e
            goto L_0x0099
        L_0x007e:
            android.graphics.Typeface r3 = r1.getTypeface()
            if (r3 != 0) goto L_0x008b
            android.graphics.Typeface r1 = r4.getTypeface()
            if (r1 == 0) goto L_0x009a
            goto L_0x0099
        L_0x008b:
            android.graphics.Typeface r1 = r1.getTypeface()
            android.graphics.Typeface r3 = r4.getTypeface()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x009a
        L_0x0099:
            return r2
        L_0x009a:
            android.text.TextDirectionHeuristic r1 = r6.f1083b
            android.text.TextDirectionHeuristic r7 = r7.f1083b
            if (r1 != r7) goto L_0x00a1
            goto L_0x00a2
        L_0x00a1:
            r0 = r2
        L_0x00a2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: I.d.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        TextPaint textPaint = this.f1082a;
        return Objects.hash(new Object[]{Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.f1083b, Integer.valueOf(this.f1084c), Integer.valueOf(this.d)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f1082a;
        sb2.append(textPaint.getTextSize());
        sb.append(sb2.toString());
        sb.append(", textScaleX=" + textPaint.getTextScaleX());
        sb.append(", textSkewX=" + textPaint.getTextSkewX());
        int i2 = Build.VERSION.SDK_INT;
        sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        sb.append(", textLocale=" + textPaint.getTextLocales());
        sb.append(", typeface=" + textPaint.getTypeface());
        if (i2 >= 26) {
            sb.append(", variationSettings=" + textPaint.getFontVariationSettings());
        }
        sb.append(", textDir=" + this.f1083b);
        sb.append(", breakStrategy=" + this.f1084c);
        sb.append(", hyphenationFrequency=" + this.d);
        sb.append("}");
        return sb.toString();
    }

    public d(PrecomputedText.Params params) {
        this.f1082a = params.getTextPaint();
        this.f1083b = params.getTextDirection();
        this.f1084c = params.getBreakStrategy();
        this.d = params.getHyphenationFrequency();
    }
}
