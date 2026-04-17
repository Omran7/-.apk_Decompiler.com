package k;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: k.z0  reason: case insensitive filesystem */
public final class C0751z0 implements AdapterView.OnItemSelectedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0657D0 f9430a;

    public C0751z0(C0657D0 d02) {
        this.f9430a = d02;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i2, long j6) {
        C0739t0 t0Var;
        if (i2 != -1 && (t0Var = this.f9430a.f9164c) != null) {
            t0Var.setListSelectionHidden(false);
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }
}
