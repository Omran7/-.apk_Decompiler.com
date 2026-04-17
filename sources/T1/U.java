package T1;

import B0.C0009h;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.concurrent.atomic.AtomicLong;

public final /* synthetic */ class U implements OnFailureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0009h f3076a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f3077b;

    public /* synthetic */ U(C0009h hVar, long j6) {
        this.f3076a = hVar;
        this.f3077b = j6;
    }

    public final void onFailure(Exception exc) {
        ((AtomicLong) this.f3076a.d).set(this.f3077b);
    }
}
