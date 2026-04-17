package e3;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.p002firebaseauthapi.zzahn;
import com.google.firebase.auth.FirebaseAuth;
import f3.C0528e;
import f3.C0533j;
import f3.v;

/* renamed from: e3.g  reason: case insensitive filesystem */
public final class C0499g implements C0533j, v {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7645a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f7646b;

    public /* synthetic */ C0499g(FirebaseAuth firebaseAuth, int i2) {
        this.f7645a = i2;
        this.f7646b = firebaseAuth;
    }

    public final void a(zzahn zzahn, m mVar) {
        switch (this.f7645a) {
            case 0:
                I.g(zzahn);
                I.g(mVar);
                ((C0528e) mVar).f7920a = zzahn;
                FirebaseAuth firebaseAuth = this.f7646b;
                firebaseAuth.getClass();
                FirebaseAuth.e(firebaseAuth, mVar, zzahn, true, true);
                return;
            default:
                FirebaseAuth firebaseAuth2 = this.f7646b;
                firebaseAuth2.getClass();
                FirebaseAuth.e(firebaseAuth2, mVar, zzahn, true, true);
                return;
        }
    }

    public final void zza(Status status) {
        switch (this.f7645a) {
            case 0:
                int i2 = status.f6007a;
                if (i2 == 17011 || i2 == 17021 || i2 == 17005 || i2 == 17091) {
                    this.f7646b.b();
                    return;
                }
                return;
            default:
                int i5 = status.f6007a;
                if (i5 == 17011 || i5 == 17021 || i5 == 17005) {
                    this.f7646b.b();
                    return;
                }
                return;
        }
    }
}
