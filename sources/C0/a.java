package C0;

import F0.C;
import F0.C0013c;
import F0.s;
import F0.t;
import F0.y;
import S3.z;
import T1.C0203r0;
import T1.C0212u0;
import T1.F0;
import T1.Z;
import android.content.Context;
import com.google.android.gms.common.internal.I;
import com.google.crypto.tink.shaded.protobuf.C0396a;
import com.google.crypto.tink.shaded.protobuf.C0404i;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Map;
import s2.e;

public abstract class a implements t, F0 {

    /* renamed from: a  reason: collision with root package name */
    public Object f398a;

    public /* synthetic */ a(Object obj) {
        this.f398a = obj;
    }

    public e b() {
        throw null;
    }

    public Z c() {
        throw null;
    }

    public Context d() {
        throw null;
    }

    public s e(y yVar) {
        return new C0013c((C) this.f398a, 2);
    }

    public C0203r0 f() {
        throw null;
    }

    public G1.a g() {
        throw null;
    }

    public abstract void h(z zVar);

    public abstract C0396a i(C0396a aVar);

    public abstract String j();

    public Map k() {
        return Collections.emptyMap();
    }

    public void l(j jVar) {
        ArrayDeque arrayDeque = (ArrayDeque) this.f398a;
        if (arrayDeque.size() < 20) {
            arrayDeque.offer(jVar);
        }
    }

    public abstract C0396a m(C0404i iVar);

    public abstract void n(C0396a aVar);

    public void o() {
        C0203r0 r0Var = ((C0212u0) this.f398a).f3497s;
        C0212u0.k(r0Var);
        r0Var.o();
    }

    public a(C0212u0 u0Var) {
        I.g(u0Var);
        this.f398a = u0Var;
    }
}
