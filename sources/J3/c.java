package j3;

import com.google.android.gms.tasks.OnSuccessListener;
import e3.n;
import m0.a0;

public final /* synthetic */ class c implements OnSuccessListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8823a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a0 f8824b;

    public /* synthetic */ c(a0 a0Var, int i2) {
        this.f8823a = i2;
        this.f8824b = a0Var;
    }

    public final void onSuccess(Object obj) {
        switch (this.f8823a) {
            case 0:
                this.f8824b.q(((Z2.c) obj).f4483a);
                return;
            default:
                this.f8824b.q(((n) obj).f7649a);
                return;
        }
    }
}
