package androidx.activity;

import android.window.OnBackInvokedCallback;
import f.z;
import kotlin.jvm.internal.j;
import x5.a;

public final /* synthetic */ class v implements OnBackInvokedCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4670a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f4671b;

    public /* synthetic */ v(Object obj, int i2) {
        this.f4670a = i2;
        this.f4671b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f4670a) {
            case 0:
                a aVar = (a) this.f4671b;
                j.e(aVar, "$onBackInvoked");
                aVar.invoke();
                return;
            case 1:
                ((z) this.f4671b).C();
                return;
            default:
                ((Runnable) this.f4671b).run();
                return;
        }
    }
}
