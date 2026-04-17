package k;

import android.content.Context;
import android.view.View;
import android.view.Window;
import j.C0601a;

public final class Z0 implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final C0601a f9254a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a1 f9255b;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, j.a] */
    public Z0(a1 a1Var) {
        this.f9255b = a1Var;
        Context context = a1Var.f9257a.getContext();
        CharSequence charSequence = a1Var.h;
        ? obj = new Object();
        obj.f8667e = 4096;
        obj.f8669p = 4096;
        obj.f8674u = null;
        obj.f8675v = null;
        obj.f8676w = false;
        obj.f8677x = false;
        obj.f8678y = 16;
        obj.f8671r = context;
        obj.f8664a = charSequence;
        this.f9254a = obj;
    }

    public final void onClick(View view) {
        a1 a1Var = this.f9255b;
        Window.Callback callback = a1Var.f9264k;
        if (callback != null && a1Var.f9265l) {
            callback.onMenuItemSelected(0, this.f9254a);
        }
    }
}
