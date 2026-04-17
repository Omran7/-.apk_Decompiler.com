package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public final class m<S> extends t {

    /* renamed from: e0  reason: collision with root package name */
    public int f6445e0;

    /* renamed from: f0  reason: collision with root package name */
    public b f6446f0;

    public final void B(Bundle bundle) {
        super.B(bundle);
        if (bundle == null) {
            bundle = this.f5178f;
        }
        this.f6445e0 = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") == null) {
            this.f6446f0 = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
            return;
        }
        throw new ClassCastException();
    }

    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(n(), this.f6445e0));
        throw null;
    }

    public final void J(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f6445e0);
        bundle.putParcelable("DATE_SELECTOR_KEY", (Parcelable) null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f6446f0);
    }
}
