package H5;

import B2.a;
import G5.J;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.k;
import m5.C0849h;
import p.i;
import x5.l;

public final class d extends k implements l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1068a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f1069b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f1070c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, Object obj2, int i2) {
        super(1);
        this.f1068a = i2;
        this.f1069b = obj;
        this.f1070c = obj2;
    }

    public final Object invoke(Object obj) {
        switch (this.f1068a) {
            case 0:
                Throwable th = (Throwable) obj;
                ((e) this.f1069b).f1071c.removeCallbacks((a) this.f1070c);
                return C0849h.f10203c;
            default:
                Throwable th2 = (Throwable) obj;
                i iVar = (i) this.f1069b;
                if (th2 == null) {
                    Object p6 = ((J) this.f1070c).p();
                    iVar.d = true;
                    p.k kVar = iVar.f10963b;
                    if (kVar != null && kVar.f10967b.x(p6)) {
                        iVar.f10962a = null;
                        iVar.f10963b = null;
                        iVar.f10964c = null;
                    }
                } else if (th2 instanceof CancellationException) {
                    iVar.d = true;
                    p.k kVar2 = iVar.f10963b;
                    if (kVar2 != null && kVar2.f10967b.cancel(true)) {
                        iVar.f10962a = null;
                        iVar.f10963b = null;
                        iVar.f10964c = null;
                    }
                } else {
                    iVar.d = true;
                    p.k kVar3 = iVar.f10963b;
                    if (kVar3 != null && kVar3.f10967b.y(th2)) {
                        iVar.f10962a = null;
                        iVar.f10963b = null;
                        iVar.f10964c = null;
                    }
                }
                return C0849h.f10203c;
        }
    }
}
