package v2;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;

public final class o extends View.AccessibilityDelegate {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ p f12224a;

    public o(p pVar) {
        this.f12224a = pVar;
    }

    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        EditText editText = this.f12224a.h.getEditText();
        if (editText != null) {
            accessibilityNodeInfo.setLabeledBy(editText);
        }
    }
}
