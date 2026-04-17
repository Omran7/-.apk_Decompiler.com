package e3;

import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.p002firebaseauthapi.zzahn;
import com.google.firebase.auth.FirebaseAuth;
import f3.C0528e;
import f3.v;

/* renamed from: e3.h  reason: case insensitive filesystem */
public final class C0500h implements v {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f7647a;

    public C0500h(FirebaseAuth firebaseAuth) {
        this.f7647a = firebaseAuth;
    }

    public final void a(zzahn zzahn, m mVar) {
        I.g(zzahn);
        I.g(mVar);
        ((C0528e) mVar).f7920a = zzahn;
        FirebaseAuth firebaseAuth = this.f7647a;
        firebaseAuth.getClass();
        FirebaseAuth.e(firebaseAuth, mVar, zzahn, true, false);
    }
}
