package n3;

import R2.b;
import android.support.v4.media.session.a;
import java.util.HashMap;
import k.C0724m;
import v3.C1048c;
import v3.C1050e;
import v3.s;

public final class p extends C1050e {

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ a f10316p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ HashMap f10317q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ C0724m f10318r;

    public p(a aVar, HashMap hashMap, C0724m mVar) {
        this.f10316p = aVar;
        this.f10317q = hashMap;
        this.f10318r = mVar;
    }

    public final void S0(C1048c cVar, s sVar) {
        s I02 = b.I0(sVar, this.f10316p.Q(cVar), this.f10317q);
        if (I02 != sVar) {
            C0866g gVar = new C0866g(cVar.f12280a);
            C0724m mVar = this.f10318r;
            mVar.f9345b = ((s) mVar.f9345b).q(gVar, I02);
        }
    }
}
