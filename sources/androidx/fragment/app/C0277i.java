package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: androidx.fragment.app.i  reason: case insensitive filesystem */
public final class C0277i implements DialogInterface.OnCancelListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0280l f5113a;

    public C0277i(C0280l lVar) {
        this.f5113a = lVar;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        C0280l lVar = this.f5113a;
        Dialog dialog = lVar.f5126m0;
        if (dialog != null) {
            lVar.onCancel(dialog);
        }
    }
}
