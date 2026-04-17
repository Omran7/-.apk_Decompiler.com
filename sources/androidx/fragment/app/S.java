package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

public final class S extends Writer {

    /* renamed from: a  reason: collision with root package name */
    public final String f5059a = "FragmentManager";

    /* renamed from: b  reason: collision with root package name */
    public final StringBuilder f5060b = new StringBuilder(128);

    public final void c() {
        StringBuilder sb = this.f5060b;
        if (sb.length() > 0) {
            Log.d(this.f5059a, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    public final void close() {
        c();
    }

    public final void flush() {
        c();
    }

    public final void write(char[] cArr, int i2, int i5) {
        for (int i6 = 0; i6 < i5; i6++) {
            char c3 = cArr[i2 + i6];
            if (c3 == 10) {
                c();
            } else {
                this.f5060b.append(c3);
            }
        }
    }
}
