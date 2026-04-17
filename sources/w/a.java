package W;

import android.text.Editable;
import androidx.emoji2.text.s;

public final class a extends Editable.Factory {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f3853a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static volatile a f3854b;

    /* renamed from: c  reason: collision with root package name */
    public static Class f3855c;

    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f3855c;
        if (cls != null) {
            return new s(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
