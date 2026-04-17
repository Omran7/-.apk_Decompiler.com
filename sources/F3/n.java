package F3;

import J2.o;
import R2.i;
import com.google.firebase.functions.FunctionsRegistrar;
import d3.C0467c;
import g3.d;
import g3.p;
import java.util.concurrent.Executor;

public final /* synthetic */ class n implements d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f776a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ p f777b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ p f778c;

    public /* synthetic */ n(p pVar, p pVar2, int i2) {
        this.f776a = i2;
        this.f777b = pVar;
        this.f778c = pVar2;
    }

    public final Object f(o oVar) {
        switch (this.f776a) {
            case 0:
                return FunctionsRegistrar.getComponents$lambda$0(this.f777b, this.f778c, oVar);
            default:
                return new C0467c((i) oVar.a(i.class), (Executor) oVar.e(this.f777b), (Executor) oVar.e(this.f778c));
        }
    }
}
