package c4;

import Z3.d;
import Z3.p;
import Z3.q;
import g4.C0551a;
import java.util.Calendar;
import java.util.GregorianCalendar;

public final class f implements q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5638a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ p f5639b;

    public /* synthetic */ f(p pVar, int i2) {
        this.f5638a = i2;
        this.f5639b = pVar;
    }

    public final p a(d dVar, C0551a aVar) {
        switch (this.f5638a) {
            case 0:
                if (aVar.f8044a == Number.class) {
                    return (g) this.f5639b;
                }
                return null;
            default:
                Class<Calendar> cls = Calendar.class;
                Class<GregorianCalendar> cls2 = aVar.f8044a;
                if (cls2 == cls || cls2 == GregorianCalendar.class) {
                    return (g) this.f5639b;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f5638a) {
            case 1:
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + ((g) this.f5639b) + "]";
            default:
                return super.toString();
        }
    }
}
