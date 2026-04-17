package w0;

import I5.u;
import java.util.ArrayList;
import java.util.function.Consumer;
import m0.a0;
import q4.C0937a;

/* renamed from: w0.k  reason: case insensitive filesystem */
public final /* synthetic */ class C1064k implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12380a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f12381b;

    public /* synthetic */ C1064k(u uVar, a0 a0Var) {
        this.f12381b = a0Var;
    }

    public final void accept(Object obj) {
        C1056c cVar = (C1056c) obj;
        switch (this.f12380a) {
            case 0:
                ((C0937a) this.f12381b).a(cVar, new ArrayList());
                return;
            default:
                ((a0) this.f12381b).p(cVar);
                return;
        }
    }

    public /* synthetic */ C1064k(C0937a aVar) {
        this.f12381b = aVar;
    }
}
