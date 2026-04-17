package com.google.android.material.internal;

import K.O;
import T.c;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import com.google.android.material.datepicker.i;
import com.mtma.criminal.city.R;
import k.C0748y;
import m2.C0835a;

public class CheckableImageButton extends C0748y implements Checkable {

    /* renamed from: p  reason: collision with root package name */
    public static final int[] f6469p = {16842912};
    public boolean d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f6470e = true;

    /* renamed from: f  reason: collision with root package name */
    public boolean f6471f = true;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.imageButtonStyle);
        O.l(this, new i(this, 3));
    }

    public final boolean isChecked() {
        return this.d;
    }

    public final int[] onCreateDrawableState(int i2) {
        if (this.d) {
            return View.mergeDrawableStates(super.onCreateDrawableState(i2 + 1), f6469p);
        }
        return super.onCreateDrawableState(i2);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0835a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0835a aVar = (C0835a) parcelable;
        super.onRestoreInstanceState(aVar.f2792a);
        setChecked(aVar.f10072c);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.os.Parcelable, T.c, m2.a] */
    public final Parcelable onSaveInstanceState() {
        ? cVar = new c(super.onSaveInstanceState());
        cVar.f10072c = this.d;
        return cVar;
    }

    public void setCheckable(boolean z3) {
        if (this.f6470e != z3) {
            this.f6470e = z3;
            sendAccessibilityEvent(0);
        }
    }

    public void setChecked(boolean z3) {
        if (this.f6470e && this.d != z3) {
            this.d = z3;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void setPressable(boolean z3) {
        this.f6471f = z3;
    }

    public void setPressed(boolean z3) {
        if (this.f6471f) {
            super.setPressed(z3);
        }
    }

    public final void toggle() {
        setChecked(!this.d);
    }
}
