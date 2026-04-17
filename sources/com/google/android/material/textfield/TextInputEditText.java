package com.google.android.material.textfield;

import Y1.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.mtma.criminal.city.R;
import java.util.Locale;
import k.C0744w;
import m2.k;
import x2.C1097a;

public class TextInputEditText extends C0744w {

    /* renamed from: p  reason: collision with root package name */
    public final Rect f6506p = new Rect();

    /* renamed from: q  reason: collision with root package name */
    public boolean f6507q;

    public TextInputEditText(Context context, AttributeSet attributeSet) {
        super(C1097a.a(context, attributeSet, R.attr.editTextStyle, 0), attributeSet);
        int[] iArr = a.f4269z;
        k.a(context, attributeSet, R.attr.editTextStyle, 2131952452);
        k.b(context, attributeSet, iArr, R.attr.editTextStyle, 2131952452, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.editTextStyle, 2131952452);
        setTextInputLayoutFocusedRectEnabled(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
    }

    private CharSequence getHintFromLayout() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }

    private TextInputLayout getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public final void getFocusedRect(Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.f6507q && rect != null) {
            Rect rect2 = this.f6506p;
            textInputLayout.getFocusedRect(rect2);
            rect.bottom = rect2.bottom;
        }
    }

    public final boolean getGlobalVisibleRect(Rect rect, Point point) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout == null || !this.f6507q) {
            return super.getGlobalVisibleRect(rect, point);
        }
        boolean globalVisibleRect = textInputLayout.getGlobalVisibleRect(rect, point);
        if (globalVisibleRect && point != null) {
            point.offset(-getScrollX(), -getScrollY());
        }
        return globalVisibleRect;
    }

    public CharSequence getHint() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout == null || !textInputLayout.f6531N) {
            return super.getHint();
        }
        return textInputLayout.getHint();
    }

    public final void onAttachedToWindow() {
        String str;
        super.onAttachedToWindow();
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.f6531N && super.getHint() == null) {
            String str2 = Build.MANUFACTURER;
            if (str2 != null) {
                str = str2.toLowerCase(Locale.ENGLISH);
            } else {
                str = "";
            }
            if (str.equals("meizu")) {
                setHint("");
            }
        }
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return onCreateInputConnection;
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        getTextInputLayout();
    }

    public final boolean requestRectangleOnScreen(Rect rect) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout == null || !this.f6507q || rect == null) {
            return super.requestRectangleOnScreen(rect);
        }
        int height = textInputLayout.getHeight() - getHeight();
        int i2 = rect.left;
        int i5 = rect.top;
        int i6 = rect.right;
        int i7 = rect.bottom + height;
        Rect rect2 = this.f6506p;
        rect2.set(i2, i5, i6, i7);
        return super.requestRectangleOnScreen(rect2);
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z3) {
        this.f6507q = z3;
    }
}
