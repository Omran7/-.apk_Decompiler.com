package androidx.emoji2.text;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

public final class r implements TextWatcher, SpanWatcher {

    /* renamed from: a  reason: collision with root package name */
    public final Object f4956a;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicInteger f4957b = new AtomicInteger(0);

    public r(Object obj) {
        this.f4956a = obj;
    }

    public final void afterTextChanged(Editable editable) {
        ((TextWatcher) this.f4956a).afterTextChanged(editable);
    }

    public final void beforeTextChanged(CharSequence charSequence, int i2, int i5, int i6) {
        ((TextWatcher) this.f4956a).beforeTextChanged(charSequence, i2, i5, i6);
    }

    public final void onSpanAdded(Spannable spannable, Object obj, int i2, int i5) {
        if (this.f4957b.get() <= 0 || !(obj instanceof u)) {
            ((SpanWatcher) this.f4956a).onSpanAdded(spannable, obj, i2, i5);
        }
    }

    public final void onSpanChanged(Spannable spannable, Object obj, int i2, int i5, int i6, int i7) {
        int i8;
        int i9;
        if (this.f4957b.get() <= 0 || !(obj instanceof u)) {
            if (Build.VERSION.SDK_INT < 28) {
                if (i2 > i5) {
                    i2 = 0;
                }
                if (i6 > i7) {
                    i9 = i2;
                    i8 = 0;
                    ((SpanWatcher) this.f4956a).onSpanChanged(spannable, obj, i9, i5, i8, i7);
                }
            }
            i9 = i2;
            i8 = i6;
            ((SpanWatcher) this.f4956a).onSpanChanged(spannable, obj, i9, i5, i8, i7);
        }
    }

    public final void onSpanRemoved(Spannable spannable, Object obj, int i2, int i5) {
        if (this.f4957b.get() <= 0 || !(obj instanceof u)) {
            ((SpanWatcher) this.f4956a).onSpanRemoved(spannable, obj, i2, i5);
        }
    }

    public final void onTextChanged(CharSequence charSequence, int i2, int i5, int i6) {
        ((TextWatcher) this.f4956a).onTextChanged(charSequence, i2, i5, i6);
    }
}
