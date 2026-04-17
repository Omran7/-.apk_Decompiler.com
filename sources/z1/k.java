package z1;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.C0280l;
import com.google.android.gms.common.internal.I;

public class k extends C0280l {

    /* renamed from: r0  reason: collision with root package name */
    public AlertDialog f12821r0;
    public DialogInterface.OnCancelListener s0;

    /* renamed from: t0  reason: collision with root package name */
    public AlertDialog f12822t0;

    public final Dialog V() {
        AlertDialog alertDialog = this.f12821r0;
        if (alertDialog != null) {
            return alertDialog;
        }
        this.f5122i0 = false;
        if (this.f12822t0 == null) {
            Context n2 = n();
            I.g(n2);
            this.f12822t0 = new AlertDialog.Builder(n2).create();
        }
        return this.f12822t0;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.s0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
