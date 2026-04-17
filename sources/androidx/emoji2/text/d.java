package androidx.emoji2.text;

import android.text.TextPaint;

public final class d {

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadLocal f4923b = new ThreadLocal();

    /* renamed from: a  reason: collision with root package name */
    public final TextPaint f4924a;

    public d() {
        TextPaint textPaint = new TextPaint();
        this.f4924a = textPaint;
        textPaint.setTextSize(10.0f);
    }
}
