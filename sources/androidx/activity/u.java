package androidx.activity;

import androidx.lifecycle.J;
import androidx.lifecycle.U;
import kotlin.jvm.internal.k;
import m5.C0849h;
import x5.a;

public final class u extends k implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4668a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f4669b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(Object obj, int i2) {
        super(0);
        this.f4668a = i2;
        this.f4669b = obj;
    }

    public final Object invoke() {
        switch (this.f4668a) {
            case 0:
                ((B) this.f4669b).d();
                return C0849h.f10203c;
            case 1:
                ((B) this.f4669b).c();
                return C0849h.f10203c;
            case 2:
                ((B) this.f4669b).d();
                return C0849h.f10203c;
            default:
                return J.e((U) this.f4669b);
        }
    }
}
