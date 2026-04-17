package z1;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.gms.common.internal.I;

/* renamed from: z1.c  reason: case insensitive filesystem */
public class C1133c extends DialogFragment {

    /* renamed from: a  reason: collision with root package name */
    public AlertDialog f12803a;

    /* renamed from: b  reason: collision with root package name */
    public DialogInterface.OnCancelListener f12804b;

    /* renamed from: c  reason: collision with root package name */
    public AlertDialog f12805c;

    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f12804b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        AlertDialog alertDialog = this.f12803a;
        if (alertDialog != null) {
            return alertDialog;
        }
        setShowsDialog(false);
        if (this.f12805c == null) {
            Activity activity = getActivity();
            I.g(activity);
            this.f12805c = new AlertDialog.Builder(activity).create();
        }
        return this.f12805c;
    }
}
