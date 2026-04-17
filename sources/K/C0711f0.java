package k;

import android.text.StaticLayout;
import android.widget.TextView;

/* renamed from: k.f0  reason: case insensitive filesystem */
public final class C0711f0 extends C0707d0 {
    public void a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    public boolean b(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}
