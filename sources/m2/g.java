package m2;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.android.gms.common.api.f;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public CharSequence f10135a;

    /* renamed from: b  reason: collision with root package name */
    public final TextPaint f10136b;

    /* renamed from: c  reason: collision with root package name */
    public final int f10137c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public Layout.Alignment f10138e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f  reason: collision with root package name */
    public int f10139f = f.API_PRIORITY_OTHER;
    public float g = 1.0f;
    public int h = 1;

    /* renamed from: i  reason: collision with root package name */
    public boolean f10140i = true;

    /* renamed from: j  reason: collision with root package name */
    public boolean f10141j;

    /* renamed from: k  reason: collision with root package name */
    public TextUtils.TruncateAt f10142k = null;

    public g(CharSequence charSequence, TextPaint textPaint, int i2) {
        this.f10135a = charSequence;
        this.f10136b = textPaint;
        this.f10137c = i2;
        this.d = charSequence.length();
    }

    public final StaticLayout a() {
        TextDirectionHeuristic textDirectionHeuristic;
        if (this.f10135a == null) {
            this.f10135a = "";
        }
        int max = Math.max(0, this.f10137c);
        CharSequence charSequence = this.f10135a;
        int i2 = this.f10139f;
        TextPaint textPaint = this.f10136b;
        if (i2 == 1) {
            charSequence = TextUtils.ellipsize(charSequence, textPaint, (float) max, this.f10142k);
        }
        int min = Math.min(charSequence.length(), this.d);
        this.d = min;
        if (this.f10141j && this.f10139f == 1) {
            this.f10138e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, textPaint, max);
        obtain.setAlignment(this.f10138e);
        obtain.setIncludePad(this.f10140i);
        if (this.f10141j) {
            textDirectionHeuristic = TextDirectionHeuristics.RTL;
        } else {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        }
        obtain.setTextDirection(textDirectionHeuristic);
        TextUtils.TruncateAt truncateAt = this.f10142k;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f10139f);
        float f6 = this.g;
        if (f6 != 1.0f) {
            obtain.setLineSpacing(0.0f, f6);
        }
        if (this.f10139f > 1) {
            obtain.setHyphenationFrequency(this.h);
        }
        return obtain.build();
    }
}
