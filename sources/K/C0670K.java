package k;

import B0.l;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
import f.C0511b;
import f.C0515f;

/* renamed from: k.K  reason: case insensitive filesystem */
public final class C0670K implements C0680P, DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public C0515f f9192a;

    /* renamed from: b  reason: collision with root package name */
    public C0672L f9193b;

    /* renamed from: c  reason: collision with root package name */
    public CharSequence f9194c;
    public final /* synthetic */ C0682Q d;

    public C0670K(C0682Q q6) {
        this.d = q6;
    }

    public final int a() {
        return 0;
    }

    public final boolean b() {
        C0515f fVar = this.f9192a;
        if (fVar != null) {
            return fVar.isShowing();
        }
        return false;
    }

    public final Drawable d() {
        return null;
    }

    public final void dismiss() {
        C0515f fVar = this.f9192a;
        if (fVar != null) {
            fVar.dismiss();
            this.f9192a = null;
        }
    }

    public final void e(CharSequence charSequence) {
        this.f9194c = charSequence;
    }

    public final void h(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    public final void i(int i2) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    public final void j(int i2) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    public final void l(int i2) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    public final void m(int i2, int i5) {
        if (this.f9193b != null) {
            C0682Q q6 = this.d;
            l lVar = new l(q6.getPopupContext());
            CharSequence charSequence = this.f9194c;
            C0511b bVar = (C0511b) lVar.f247c;
            if (charSequence != null) {
                bVar.d = charSequence;
            }
            C0672L l6 = this.f9193b;
            int selectedItemPosition = q6.getSelectedItemPosition();
            bVar.f7754i = l6;
            bVar.f7755j = this;
            bVar.f7757l = selectedItemPosition;
            bVar.f7756k = true;
            C0515f a6 = lVar.a();
            this.f9192a = a6;
            AlertController$RecycleListView alertController$RecycleListView = a6.f7781f.f7763e;
            alertController$RecycleListView.setTextDirection(i2);
            alertController$RecycleListView.setTextAlignment(i5);
            this.f9192a.show();
        }
    }

    public final int n() {
        return 0;
    }

    public final CharSequence o() {
        return this.f9194c;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        C0682Q q6 = this.d;
        q6.setSelection(i2);
        if (q6.getOnItemClickListener() != null) {
            q6.performItemClick((View) null, i2, this.f9193b.getItemId(i2));
        }
        dismiss();
    }

    public final void p(ListAdapter listAdapter) {
        this.f9193b = (C0672L) listAdapter;
    }
}
