package n3;

import i3.C0588d;
import l3.q;
import q3.k;

/* renamed from: n3.h  reason: case insensitive filesystem */
public final class C0867h implements q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10279a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0866g f10280b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f10281c;
    public final /* synthetic */ k d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ m f10282e;

    public /* synthetic */ C0867h(m mVar, C0866g gVar, long j6, k kVar, int i2) {
        this.f10279a = i2;
        this.f10282e = mVar;
        this.f10280b = gVar;
        this.f10281c = j6;
        this.d = kVar;
    }

    public final void c(String str, String str2) {
        C0588d dVar;
        C0588d dVar2;
        switch (this.f10279a) {
            case 0:
                if (str != null) {
                    dVar = C0588d.b(str, str2);
                } else {
                    dVar = null;
                }
                m mVar = this.f10282e;
                C0866g gVar = this.f10280b;
                m.c(mVar, "updateChildren", gVar, dVar);
                m.d(mVar, this.f10281c, gVar, dVar);
                mVar.h(this.d, dVar, gVar);
                return;
            default:
                if (str != null) {
                    dVar2 = C0588d.b(str, str2);
                } else {
                    dVar2 = null;
                }
                m mVar2 = this.f10282e;
                C0866g gVar2 = this.f10280b;
                m.c(mVar2, "setValue", gVar2, dVar2);
                m.d(mVar2, this.f10281c, gVar2, dVar2);
                mVar2.h(this.d, dVar2, gVar2);
                return;
        }
    }
}
