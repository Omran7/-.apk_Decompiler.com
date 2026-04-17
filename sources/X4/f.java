package X4;

import android.widget.CompoundButton;

public final class f implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4213a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ h f4214b;

    public /* synthetic */ f(h hVar, int i2) {
        this.f4213a = i2;
        this.f4214b = hVar;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
        switch (this.f4213a) {
            case 0:
                if (z3) {
                    h hVar = this.f4214b;
                    hVar.f4224j0.setChecked(false);
                    hVar.f4222h0.setError((CharSequence) null);
                    hVar.s0 = 0;
                    return;
                }
                return;
            case 1:
                if (z3) {
                    h hVar2 = this.f4214b;
                    hVar2.f4223i0.setChecked(false);
                    hVar2.f4222h0.setError((CharSequence) null);
                    hVar2.s0 = 1;
                    return;
                }
                return;
            default:
                if (z3) {
                    this.f4214b.f4227m0.setError((CharSequence) null);
                    return;
                }
                return;
        }
    }
}
