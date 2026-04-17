package n3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;
import o3.e;
import o3.f;
import q3.l;
import v3.s;

public final class t implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f10330a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0866g f10331b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ s f10332c;
    public final /* synthetic */ long d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ s f10333e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ boolean f10334f;
    public final /* synthetic */ y g;

    public t(y yVar, boolean z3, C0866g gVar, s sVar, long j6, s sVar2, boolean z4) {
        this.g = yVar;
        this.f10330a = z3;
        this.f10331b = gVar;
        this.f10332c = sVar;
        this.d = j6;
        this.f10333e = sVar2;
        this.f10334f = z4;
    }

    public final Object call() {
        boolean z3;
        boolean z4 = this.f10330a;
        C0866g gVar = this.f10331b;
        y yVar = this.g;
        if (z4) {
            yVar.f10351f.e();
        }
        G g5 = yVar.f10348b;
        long j6 = this.d;
        Long valueOf = Long.valueOf(j6);
        g5.getClass();
        if (j6 > ((Long) g5.f10252c).longValue()) {
            z3 = true;
        } else {
            z3 = false;
        }
        l.c(z3);
        C0866g gVar2 = this.f10331b;
        s sVar = this.f10333e;
        boolean z5 = this.f10334f;
        ((ArrayList) g5.f10251b).add(new C0857B(j6, gVar2, sVar, z5));
        if (z5) {
            g5.f10250a = ((C0861b) g5.f10250a).k(gVar2, sVar);
        }
        g5.f10252c = valueOf;
        if (!this.f10334f) {
            return Collections.emptyList();
        }
        return y.a(yVar, new f(e.d, gVar, this.f10333e));
    }
}
