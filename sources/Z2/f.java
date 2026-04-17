package Z2;

import A4.a;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;

public final /* synthetic */ class f implements OnFailureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4499a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f4500b;

    public /* synthetic */ f(Object obj, int i2) {
        this.f4499a = i2;
        this.f4500b = obj;
    }

    public final void onFailure(Exception exc) {
        long j6;
        switch (this.f4499a) {
            case 0:
                g gVar = (g) this.f4500b;
                gVar.a();
                if (gVar.f4504e == -1) {
                    j6 = 30;
                } else if (gVar.f4504e * 2 < 960) {
                    j6 = gVar.f4504e * 2;
                } else {
                    j6 = 960;
                }
                gVar.f4504e = j6;
                gVar.d = gVar.f4503c.schedule(new a(gVar, 4), gVar.f4504e, TimeUnit.SECONDS);
                return;
            default:
                ((TaskCompletionSource) this.f4500b).setException(exc);
                return;
        }
    }
}
