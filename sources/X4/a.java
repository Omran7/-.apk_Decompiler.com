package X4;

import T1.A;
import com.google.android.gms.tasks.OnFailureListener;

public final class a implements OnFailureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f4189a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c f4190b;

    public a(c cVar, String str) {
        this.f4190b = cVar;
        this.f4189a = str;
    }

    public final void onFailure(Exception exc) {
        this.f4190b.f4204n0.q("email").i(this.f4189a).d(new A((Object) this, 9));
    }
}
