package b4;

import Z3.d;
import Z3.p;
import Z3.q;
import g4.C0551a;
import h4.C0566a;
import h4.C0567b;
import java.util.List;

/* renamed from: b4.e  reason: case insensitive filesystem */
public final class C0322e extends p {

    /* renamed from: a  reason: collision with root package name */
    public p f5520a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f5521b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f5522c;
    public final /* synthetic */ d d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ C0551a f5523e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ C0323f f5524f;

    public C0322e(C0323f fVar, boolean z3, boolean z4, d dVar, C0551a aVar) {
        this.f5524f = fVar;
        this.f5521b = z3;
        this.f5522c = z4;
        this.d = dVar;
        this.f5523e = aVar;
    }

    public final Object a(C0566a aVar) {
        if (this.f5521b) {
            aVar.I();
            return null;
        }
        p pVar = this.f5520a;
        if (pVar == null) {
            C0551a aVar2 = this.f5523e;
            d dVar = this.d;
            List<q> list = dVar.f4523e;
            q qVar = this.f5524f;
            if (!list.contains(qVar)) {
                qVar = dVar.d;
            }
            boolean z3 = false;
            for (q qVar2 : list) {
                if (z3) {
                    p a6 = qVar2.a(dVar, aVar2);
                    if (a6 != null) {
                        this.f5520a = a6;
                        pVar = a6;
                    }
                } else if (qVar2 == qVar) {
                    z3 = true;
                }
            }
            throw new IllegalArgumentException("GSON cannot serialize " + aVar2);
        }
        return pVar.a(aVar);
    }

    public final void b(C0567b bVar, Object obj) {
        if (this.f5522c) {
            bVar.p();
            return;
        }
        p pVar = this.f5520a;
        if (pVar == null) {
            C0551a aVar = this.f5523e;
            d dVar = this.d;
            List<q> list = dVar.f4523e;
            q qVar = this.f5524f;
            if (!list.contains(qVar)) {
                qVar = dVar.d;
            }
            boolean z3 = false;
            for (q qVar2 : list) {
                if (z3) {
                    p a6 = qVar2.a(dVar, aVar);
                    if (a6 != null) {
                        this.f5520a = a6;
                        pVar = a6;
                    }
                } else if (qVar2 == qVar) {
                    z3 = true;
                }
            }
            throw new IllegalArgumentException("GSON cannot serialize " + aVar);
        }
        pVar.b(bVar, obj);
    }
}
