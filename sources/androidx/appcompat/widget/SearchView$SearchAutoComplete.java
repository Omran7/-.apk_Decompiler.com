package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import k.C0679O0;
import k.C0728o;
import k.C0737s0;

public class SearchView$SearchAutoComplete extends C0728o {

    /* renamed from: e  reason: collision with root package name */
    public int f4787e = getThreshold();

    /* renamed from: f  reason: collision with root package name */
    public boolean f4788f;

    /* renamed from: p  reason: collision with root package name */
    public final C0737s0 f4789p = new C0737s0(this, 1);

    public SearchView$SearchAutoComplete(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private int getSearchViewTextMinWidthDp() {
        Configuration configuration = getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i5 = configuration.screenHeightDp;
        if (i2 >= 960 && i5 >= 720 && configuration.orientation == 2) {
            return 256;
        }
        if (i2 >= 600) {
            return 192;
        }
        if (i2 < 640 || i5 < 480) {
            return 160;
        }
        return 192;
    }

    public final boolean enoughToFilter() {
        if (this.f4787e <= 0 || super.enoughToFilter()) {
            return true;
        }
        return false;
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (this.f4788f) {
            C0737s0 s0Var = this.f4789p;
            removeCallbacks(s0Var);
            post(s0Var);
        }
        return onCreateInputConnection;
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
    }

    public final void onFocusChanged(boolean z3, int i2, Rect rect) {
        super.onFocusChanged(z3, i2, rect);
        throw null;
    }

    public final boolean onKeyPreIme(int i2, KeyEvent keyEvent) {
        if (i2 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                if (keyDispatcherState != null) {
                    keyDispatcherState.startTracking(keyEvent, this);
                }
                return true;
            } else if (keyEvent.getAction() == 1) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.handleUpEvent(keyEvent);
                }
                if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                    throw null;
                }
            }
        }
        return super.onKeyPreIme(i2, keyEvent);
    }

    public final void onWindowFocusChanged(boolean z3) {
        super.onWindowFocusChanged(z3);
        if (z3) {
            throw null;
        }
    }

    public final void performCompletion() {
    }

    public final void replaceText(CharSequence charSequence) {
    }

    public void setImeVisibility(boolean z3) {
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        C0737s0 s0Var = this.f4789p;
        if (!z3) {
            this.f4788f = false;
            removeCallbacks(s0Var);
            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        } else if (inputMethodManager.isActive(this)) {
            this.f4788f = false;
            removeCallbacks(s0Var);
            inputMethodManager.showSoftInput(this, 0);
        } else {
            this.f4788f = true;
        }
    }

    public void setThreshold(int i2) {
        super.setThreshold(i2);
        this.f4787e = i2;
    }

    public void setSearchView(C0679O0 o02) {
    }
}
