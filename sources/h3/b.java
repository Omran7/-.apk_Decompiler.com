package H3;

import J2.o;
import R2.i;
import android.content.Context;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import g3.d;
import g3.p;
import java.util.concurrent.Executor;

public final /* synthetic */ class b implements d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1004a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ p f1005b;

    public /* synthetic */ b(p pVar, int i2) {
        this.f1004a = i2;
        this.f1005b = pVar;
    }

    public final Object f(o oVar) {
        switch (this.f1004a) {
            case 0:
                return new e((Context) oVar.a(Context.class), ((i) oVar.a(i.class)).g(), oVar.d(p.a(f.class)), oVar.c(U3.b.class), (Executor) oVar.e(this.f1005b));
            default:
                return FirebaseMessagingRegistrar.lambda$getComponents$0(this.f1005b, oVar);
        }
    }
}
