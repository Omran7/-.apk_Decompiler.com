package k;

import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.widget.TextView;

/* renamed from: k.d0  reason: case insensitive filesystem */
public class C0707d0 extends C0713g0 {
    public void a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection((TextDirectionHeuristic) C0715h0.e("getTextDirectionHeuristic", textView, TextDirectionHeuristics.FIRSTSTRONG_LTR));
    }
}
