package v2;

import K.C0062b;
import L.j;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import k.C0703b0;

public final class v extends C0062b {
    public final TextInputLayout d;

    public v(TextInputLayout textInputLayout) {
        this.d = textInputLayout;
    }

    public final void d(View view, j jVar) {
        Editable editable;
        boolean z3;
        String str;
        j jVar2 = jVar;
        View.AccessibilityDelegate accessibilityDelegate = this.f1369a;
        AccessibilityNodeInfo accessibilityNodeInfo = jVar2.f1702a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.d;
        EditText editText = textInputLayout.getEditText();
        if (editText != null) {
            editable = editText.getText();
        } else {
            editable = null;
        }
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean isEmpty = TextUtils.isEmpty(editable);
        boolean isEmpty2 = TextUtils.isEmpty(hint);
        boolean z4 = textInputLayout.f6515D0;
        boolean isEmpty3 = TextUtils.isEmpty(error);
        if (!isEmpty3 || !TextUtils.isEmpty(counterOverflowDescription)) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!isEmpty2) {
            str = hint.toString();
        } else {
            str = "";
        }
        t tVar = textInputLayout.f6543b;
        C0703b0 b0Var = tVar.f12264b;
        if (b0Var.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(b0Var);
            accessibilityNodeInfo.setTraversalAfter(b0Var);
        } else {
            accessibilityNodeInfo.setTraversalAfter(tVar.d);
        }
        if (!isEmpty) {
            jVar2.k(editable);
        } else if (!TextUtils.isEmpty(str)) {
            jVar2.k(str);
            if (!z4 && placeholderText != null) {
                jVar2.k(str + ", " + placeholderText);
            }
        } else if (placeholderText != null) {
            jVar2.k(placeholderText);
        }
        if (!TextUtils.isEmpty(str)) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 26) {
                jVar2.j(str);
            } else {
                if (!isEmpty) {
                    str = editable + ", " + str;
                }
                jVar2.k(str);
            }
            if (i2 >= 26) {
                accessibilityNodeInfo.setShowingHintText(isEmpty);
            } else {
                jVar2.h(4, isEmpty);
            }
        }
        if (editable == null || editable.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z3) {
            if (isEmpty3) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
        }
        C0703b0 b0Var2 = textInputLayout.f6567s.f12248y;
        if (b0Var2 != null) {
            accessibilityNodeInfo.setLabelFor(b0Var2);
        }
        textInputLayout.f6545c.b().n(jVar2);
    }

    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        this.d.f6545c.b().o(accessibilityEvent);
    }
}
