package k;

import android.text.StaticLayout;
import android.widget.TextView;

/* renamed from: k.g0  reason: case insensitive filesystem */
public abstract class C0713g0 {
    public abstract void a(StaticLayout.Builder builder, TextView textView);

    public boolean b(TextView textView) {
        return ((Boolean) C0715h0.e("getHorizontallyScrolling", textView, Boolean.FALSE)).booleanValue();
    }
}
