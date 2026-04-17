package Z3;

import h4.C0566a;
import h4.C0567b;

public final class a extends p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4516a;

    public /* synthetic */ a(int i2) {
        this.f4516a = i2;
    }

    public final Object a(C0566a aVar) {
        switch (this.f4516a) {
            case 0:
                if (aVar.C() != 9) {
                    return Double.valueOf(aVar.t());
                }
                aVar.y();
                return null;
            default:
                if (aVar.C() != 9) {
                    return Float.valueOf((float) aVar.t());
                }
                aVar.y();
                return null;
        }
    }

    public final void b(C0567b bVar, Object obj) {
        switch (this.f4516a) {
            case 0:
                Number number = (Number) obj;
                if (number == null) {
                    bVar.p();
                    return;
                }
                double doubleValue = number.doubleValue();
                d.a(doubleValue);
                bVar.s(doubleValue);
                return;
            default:
                Number number2 = (Number) obj;
                if (number2 == null) {
                    bVar.p();
                    return;
                }
                float floatValue = number2.floatValue();
                d.a((double) floatValue);
                if (!(number2 instanceof Float)) {
                    number2 = Float.valueOf(floatValue);
                }
                bVar.u(number2);
                return;
        }
    }
}
