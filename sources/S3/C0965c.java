package s3;

import i3.C0587c;
import n3.C0865f;
import n3.C0866g;
import o3.d;
import v3.m;

/* renamed from: s3.c  reason: case insensitive filesystem */
public final class C0965c implements C0966d {

    /* renamed from: a  reason: collision with root package name */
    public final int f11529a;

    /* renamed from: b  reason: collision with root package name */
    public final C0865f f11530b;

    /* renamed from: c  reason: collision with root package name */
    public final C0587c f11531c;

    public C0965c(int i2, C0865f fVar, C0587c cVar, String str) {
        this.f11529a = i2;
        this.f11530b = fVar;
        this.f11531c = cVar;
    }

    public final void a() {
        this.f11530b.d(this);
    }

    public final String toString() {
        C0587c cVar = this.f11531c;
        m mVar = cVar.f8278a;
        int i2 = this.f11529a;
        if (i2 == 5) {
            StringBuilder sb = new StringBuilder();
            C0866g gVar = (C0866g) cVar.f8279b.f2695c;
            if (i2 != 5) {
                gVar = gVar.A();
            }
            sb.append(gVar);
            sb.append(": ");
            sb.append(d.k(i2));
            sb.append(": ");
            sb.append(mVar.f12296a.o(true));
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        C0866g gVar2 = (C0866g) cVar.f8279b.f2695c;
        if (i2 != 5) {
            gVar2 = gVar2.A();
        }
        sb2.append(gVar2);
        sb2.append(": ");
        sb2.append(d.k(i2));
        sb2.append(": { ");
        sb2.append(cVar.f8279b.F());
        sb2.append(": ");
        sb2.append(mVar.f12296a.o(true));
        sb2.append(" }");
        return sb2.toString();
    }
}
