package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.mtma.criminal.city.R;

@Deprecated
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public final int f4834a = getResources().getDimensionPixelOffset(R.dimen.browser_actions_context_menu_min_padding);

    /* renamed from: b  reason: collision with root package name */
    public final int f4835b = getResources().getDimensionPixelOffset(R.dimen.browser_actions_context_menu_max_width);

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void onMeasure(int i2, int i5) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f4834a * 2), this.f4835b), 1073741824), i5);
    }
}
