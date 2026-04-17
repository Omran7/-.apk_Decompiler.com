package W;

import android.widget.EditText;
import java.lang.ref.WeakReference;

public final class h extends androidx.emoji2.text.h {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference f3868a;

    public h(EditText editText) {
        this.f3868a = new WeakReference(editText);
    }

    public final void a() {
        i.a(1, (EditText) this.f3868a.get());
    }
}
