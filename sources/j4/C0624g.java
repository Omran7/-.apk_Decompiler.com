package j4;

import b5.j;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import com.google.android.gms.tasks.OnSuccessListener;
import d5.o;
import i3.C0590f;

/* renamed from: j4.g  reason: case insensitive filesystem */
public final class C0624g implements OnSuccessListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f9010a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0590f f9011b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f9012c;
    public final /* synthetic */ C0626h d;

    public C0624g(C0626h hVar, String str, C0590f fVar, String str2) {
        this.d = hVar;
        this.f9010a = str;
        this.f9011b = fVar;
        this.f9012c = str2;
    }

    public final void onSuccess(Object obj) {
        Void voidR = (Void) obj;
        j jVar = new j(o.getAccountObject().getId(), this.f9010a, false, d.I0());
        StringBuilder sb = new StringBuilder();
        sb.append(c.f5744o);
        C0590f fVar = this.f9011b;
        C0590f E6 = fVar.E("chatMessages");
        String str = this.f9012c;
        sb.append(E6.E(str).G().F());
        String sb2 = sb.toString();
        fVar.E("chatMessages").E(str).E(sb2).I(jVar).addOnCompleteListener(new B4.d((Object) this, (Object) sb2, (Object) jVar, 7));
    }
}
