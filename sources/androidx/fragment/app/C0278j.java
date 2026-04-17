package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: androidx.fragment.app.j  reason: case insensitive filesystem */
public final class C0278j implements DialogInterface.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0280l f5114a;

    public C0278j(C0280l lVar) {
        this.f5114a = lVar;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C0280l lVar = this.f5114a;
        Dialog dialog = lVar.f5126m0;
        if (dialog != null) {
            lVar.onDismiss(dialog);
        }
    }
}
