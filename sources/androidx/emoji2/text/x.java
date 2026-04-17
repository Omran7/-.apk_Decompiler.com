package androidx.emoji2.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

public final class x implements Spannable {

    /* renamed from: a  reason: collision with root package name */
    public boolean f4969a = false;

    /* renamed from: b  reason: collision with root package name */
    public Spannable f4970b;

    public x(Spannable spannable) {
        this.f4970b = spannable;
    }

    public final void a() {
        v vVar;
        Spannable spannable = this.f4970b;
        if (!this.f4969a) {
            if (Build.VERSION.SDK_INT < 28) {
                vVar = new v(0);
            } else {
                vVar = new v(0);
            }
            if (vVar.o(spannable)) {
                this.f4970b = new SpannableString(spannable);
            }
        }
        this.f4969a = true;
    }

    public final char charAt(int i2) {
        return this.f4970b.charAt(i2);
    }

    public final IntStream chars() {
        return this.f4970b.chars();
    }

    public final IntStream codePoints() {
        return this.f4970b.codePoints();
    }

    public final int getSpanEnd(Object obj) {
        return this.f4970b.getSpanEnd(obj);
    }

    public final int getSpanFlags(Object obj) {
        return this.f4970b.getSpanFlags(obj);
    }

    public final int getSpanStart(Object obj) {
        return this.f4970b.getSpanStart(obj);
    }

    public final Object[] getSpans(int i2, int i5, Class cls) {
        return this.f4970b.getSpans(i2, i5, cls);
    }

    public final int length() {
        return this.f4970b.length();
    }

    public final int nextSpanTransition(int i2, int i5, Class cls) {
        return this.f4970b.nextSpanTransition(i2, i5, cls);
    }

    public final void removeSpan(Object obj) {
        a();
        this.f4970b.removeSpan(obj);
    }

    public final void setSpan(Object obj, int i2, int i5, int i6) {
        a();
        this.f4970b.setSpan(obj, i2, i5, i6);
    }

    public final CharSequence subSequence(int i2, int i5) {
        return this.f4970b.subSequence(i2, i5);
    }

    public final String toString() {
        return this.f4970b.toString();
    }
}
