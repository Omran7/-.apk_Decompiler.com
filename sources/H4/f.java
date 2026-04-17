package H4;

import K4.k;
import S3.t;
import b5.j;
import b5.l;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.tasks.OnSuccessListener;
import d5.o;
import i3.C0590f;
import i3.C0592h;

public final class f implements OnSuccessListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1027a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f1028b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f1029c;
    public final /* synthetic */ Object d;

    public /* synthetic */ f(Object obj, String str, Object obj2, int i2) {
        this.f1027a = i2;
        this.d = obj;
        this.f1028b = str;
        this.f1029c = obj2;
    }

    public final void onSuccess(Object obj) {
        switch (this.f1027a) {
            case 0:
                Void voidR = (Void) obj;
                g gVar = (g) this.d;
                h hVar = (h) ((g) gVar.f1032c).f1032c;
                a.v(a.x(C0592h.d().e(), "messages"), "chatData").E(((h) ((g) gVar.f1032c).f1032c).f1046p0).I(new l(hVar.f1046p0, hVar.f1047q0.getNickName(), true)).addOnSuccessListener(new e(this, 0));
                return;
            case 1:
                Void voidR2 = (Void) obj;
                j jVar = new j(o.getAccountObject().getId(), this.f1028b, false, d.I0());
                StringBuilder sb = new StringBuilder();
                sb.append(c.f5744o);
                C0590f fVar = (C0590f) this.f1029c;
                C0590f E6 = fVar.E("chatMessages");
                k kVar = (k) this.d;
                sb.append(E6.E(kVar.f1554e0).G().F());
                String sb2 = sb.toString();
                fVar.E("chatMessages").E(kVar.f1554e0).E(sb2).I(jVar).addOnCompleteListener(new B4.d((Object) this, (Object) sb2, (Object) jVar, 2));
                return;
            default:
                Void voidR3 = (Void) obj;
                C0592h.b().e().E("Servers").E(this.f1028b).E("players").E((String) this.f1029c).d(new t(this, 12));
                return;
        }
    }
}
