package c4;

import Z3.d;
import Z3.p;
import androidx.emoji2.text.v;
import b4.m;
import com.google.android.gms.internal.measurement.a;
import h4.C0566a;
import h4.C0567b;
import java.lang.reflect.Type;
import java.util.Map;

public final class e extends p {

    /* renamed from: a  reason: collision with root package name */
    public final n f5635a;

    /* renamed from: b  reason: collision with root package name */
    public final n f5636b;

    /* renamed from: c  reason: collision with root package name */
    public final m f5637c;
    public final /* synthetic */ c d;

    public e(c cVar, d dVar, Type type, p pVar, Type type2, p pVar2, m mVar) {
        this.d = cVar;
        this.f5635a = new n(dVar, pVar, type);
        this.f5636b = new n(dVar, pVar2, type2);
        this.f5637c = mVar;
    }

    public final Object a(C0566a aVar) {
        int C6 = aVar.C();
        if (C6 == 9) {
            aVar.y();
            return null;
        }
        Map map = (Map) this.f5637c.n();
        n nVar = this.f5636b;
        n nVar2 = this.f5635a;
        p pVar = (p) nVar.f5664c;
        p pVar2 = (p) nVar2.f5664c;
        if (C6 == 1) {
            aVar.c();
            while (aVar.p()) {
                aVar.c();
                Object a6 = pVar2.a(aVar);
                if (map.put(a6, pVar.a(aVar)) == null) {
                    aVar.l();
                } else {
                    throw new RuntimeException("duplicate key: " + a6);
                }
            }
            aVar.l();
        } else {
            aVar.d();
            while (aVar.p()) {
                v.f4967b.getClass();
                int i2 = aVar.f8159q;
                if (i2 == 0) {
                    i2 = aVar.k();
                }
                if (i2 == 13) {
                    aVar.f8159q = 9;
                } else if (i2 == 12) {
                    aVar.f8159q = 8;
                } else if (i2 == 14) {
                    aVar.f8159q = 10;
                } else {
                    throw new IllegalStateException("Expected a name but was " + a.y(aVar.C()) + aVar.r());
                }
                Object a7 = pVar2.a(aVar);
                if (map.put(a7, pVar.a(aVar)) != null) {
                    throw new RuntimeException("duplicate key: " + a7);
                }
            }
            aVar.m();
        }
        return map;
    }

    public final void b(C0567b bVar, Object obj) {
        Map map = (Map) obj;
        if (map == null) {
            bVar.p();
            return;
        }
        this.d.getClass();
        n nVar = this.f5636b;
        bVar.j();
        for (Map.Entry entry : map.entrySet()) {
            bVar.n(String.valueOf(entry.getKey()));
            nVar.b(bVar, entry.getValue());
        }
        bVar.m();
    }
}
