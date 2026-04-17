package com.mtma.criminal.city.utils;

import R2.b;
import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import d5.o;

public final class d0 implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7399a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ K f7400b;

    public d0(int i2, K k6) {
        this.f7400b = k6;
        this.f7399a = i2;
    }

    public final void onComplete(Task task) {
        o.getMainStatesObject().setGender(this.f7399a);
        b.w(false);
        b.M0(R.raw.add_new_item);
        a.k(MyApplication.f7090a, R.string.toast_successfully, ((e0) this.f7400b.f7360b).d);
    }
}
