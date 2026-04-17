package l3;

import c1.i;
import com.google.android.gms.tasks.OnFailureListener;

/* renamed from: l3.d  reason: case insensitive filesystem */
public final /* synthetic */ class C0785d implements OnFailureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f9675a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f9676b;

    public /* synthetic */ C0785d(o oVar, long j6) {
        this.f9675a = oVar;
        this.f9676b = j6;
    }

    public final void onFailure(Exception exc) {
        o oVar = this.f9675a;
        int i2 = (this.f9676b > oVar.f9701A ? 1 : (this.f9676b == oVar.f9701A ? 0 : -1));
        i iVar = oVar.f9726x;
        if (i2 == 0) {
            oVar.h = C0792k.f9688a;
            iVar.d("Error fetching token: " + exc, (Throwable) null, new Object[0]);
            oVar.n();
            return;
        }
        iVar.d("Ignoring getToken error, because this was not the latest attempt.", (Throwable) null, new Object[0]);
    }
}
