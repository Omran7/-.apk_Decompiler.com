package T1;

import com.google.android.gms.common.internal.I;
import n.e;

/* renamed from: T1.a  reason: case insensitive filesystem */
public final class C0152a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3217a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f3218b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f3219c;
    public final /* synthetic */ C0226z d;

    public /* synthetic */ C0152a(C0226z zVar, String str, long j6, int i2) {
        this.f3217a = i2;
        this.f3218b = str;
        this.f3219c = j6;
        this.d = zVar;
    }

    public final void run() {
        switch (this.f3217a) {
            case 0:
                C0226z zVar = this.d;
                zVar.o();
                String str = this.f3218b;
                I.d(str);
                e eVar = zVar.f3551c;
                boolean isEmpty = eVar.isEmpty();
                long j6 = this.f3219c;
                if (isEmpty) {
                    zVar.d = j6;
                }
                Integer num = (Integer) eVar.get(str);
                if (num != null) {
                    eVar.put(str, Integer.valueOf(num.intValue() + 1));
                    return;
                } else if (eVar.f10226c >= 100) {
                    Z z3 = ((C0212u0) zVar.f398a).f3496r;
                    C0212u0.k(z3);
                    z3.f3175r.a("Too many ads visible");
                    return;
                } else {
                    eVar.put(str, 1);
                    zVar.f3550b.put(str, Long.valueOf(j6));
                    return;
                }
            default:
                C0226z zVar2 = this.d;
                zVar2.o();
                String str2 = this.f3218b;
                I.d(str2);
                e eVar2 = zVar2.f3551c;
                Integer num2 = (Integer) eVar2.get(str2);
                C0212u0 u0Var = (C0212u0) zVar2.f398a;
                if (num2 != null) {
                    C0190m1 m1Var = u0Var.f3502x;
                    C0212u0.j(m1Var);
                    C0181j1 v6 = m1Var.v(false);
                    int intValue = num2.intValue() - 1;
                    if (intValue == 0) {
                        eVar2.remove(str2);
                        e eVar3 = zVar2.f3550b;
                        Long l6 = (Long) eVar3.get(str2);
                        long j7 = this.f3219c;
                        Z z4 = u0Var.f3496r;
                        if (l6 == null) {
                            C0212u0.k(z4);
                            z4.f3172f.a("First ad unit exposure time was never set");
                        } else {
                            eVar3.remove(str2);
                            zVar2.t(str2, j7 - l6.longValue(), v6);
                        }
                        if (eVar2.isEmpty()) {
                            long j8 = zVar2.d;
                            if (j8 == 0) {
                                C0212u0.k(z4);
                                z4.f3172f.a("First ad exposure time was never set");
                                return;
                            }
                            zVar2.s(j7 - j8, v6);
                            zVar2.d = 0;
                            return;
                        }
                        return;
                    }
                    eVar2.put(str2, Integer.valueOf(intValue));
                    return;
                }
                Z z5 = u0Var.f3496r;
                C0212u0.k(z5);
                z5.f3172f.b(str2, "Call to endAdUnitExposure for unknown ad unit id");
                return;
        }
    }
}
