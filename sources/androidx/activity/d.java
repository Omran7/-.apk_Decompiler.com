package androidx.activity;

import kotlin.jvm.internal.j;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4616a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ o f4617b;

    public /* synthetic */ d(o oVar, int i2) {
        this.f4616a = i2;
        this.f4617b = oVar;
    }

    public final void run() {
        switch (this.f4616a) {
            case 0:
                o oVar = this.f4617b;
                j.e(oVar, "this$0");
                oVar.invalidateOptionsMenu();
                return;
            default:
                try {
                    d.super.onBackPressed();
                    return;
                } catch (IllegalStateException e6) {
                    if (!j.a(e6.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e6;
                    }
                    return;
                } catch (NullPointerException e7) {
                    if (!j.a(e7.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e7;
                    }
                    return;
                }
        }
    }
}
