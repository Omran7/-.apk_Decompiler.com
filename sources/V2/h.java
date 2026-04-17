package v2;

import android.widget.AutoCompleteTextView;

public final /* synthetic */ class h implements AutoCompleteTextView.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ i f12181a;

    public /* synthetic */ h(i iVar) {
        this.f12181a = iVar;
    }

    public final void onDismiss() {
        i iVar = this.f12181a;
        iVar.f12188m = true;
        iVar.f12190o = System.currentTimeMillis();
        iVar.t(false);
    }
}
