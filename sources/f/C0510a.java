package f;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* renamed from: f.a  reason: case insensitive filesystem */
public final class C0510a implements AdapterView.OnItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0514e f7747a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0511b f7748b;

    public C0510a(C0511b bVar, C0514e eVar) {
        this.f7748b = bVar;
        this.f7747a = eVar;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i2, long j6) {
        C0511b bVar = this.f7748b;
        DialogInterface.OnClickListener onClickListener = bVar.f7755j;
        C0514e eVar = this.f7747a;
        onClickListener.onClick(eVar.f7761b, i2);
        if (!bVar.f7756k) {
            eVar.f7761b.dismiss();
        }
    }
}
