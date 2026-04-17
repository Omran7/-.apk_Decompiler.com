package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;
import m0.C0804F;

public final class f implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6404a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ s f6405b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ k f6406c;

    public /* synthetic */ f(k kVar, s sVar, int i2) {
        this.f6404a = i2;
        this.f6406c = kVar;
        this.f6405b = sVar;
    }

    public final void onClick(View view) {
        int i2;
        switch (this.f6404a) {
            case 0:
                k kVar = this.f6406c;
                int K02 = ((LinearLayoutManager) kVar.f6419k0.getLayoutManager()).K0() - 1;
                if (K02 >= 0) {
                    Calendar a6 = w.a(this.f6405b.f6462c.f6392a.f6448a);
                    a6.add(2, K02);
                    kVar.V(new o(a6));
                    return;
                }
                return;
            default:
                k kVar2 = this.f6406c;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) kVar2.f6419k0.getLayoutManager();
                View M02 = linearLayoutManager.M0(0, linearLayoutManager.v(), false);
                if (M02 == null) {
                    i2 = -1;
                } else {
                    i2 = C0804F.H(M02);
                }
                int i5 = i2 + 1;
                if (i5 < kVar2.f6419k0.getAdapter().a()) {
                    Calendar a7 = w.a(this.f6405b.f6462c.f6392a.f6448a);
                    a7.add(2, i5);
                    kVar2.V(new o(a7));
                    return;
                }
                return;
        }
    }
}
