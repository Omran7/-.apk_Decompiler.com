package e3;

import I1.b;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.p002firebaseauthapi.zzach;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import f3.t;
import f3.v;

public final class D extends b {

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ int f7603p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ boolean f7604q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ m f7605r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ C0496d f7606s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f7607t;

    public /* synthetic */ D(FirebaseAuth firebaseAuth, boolean z3, m mVar, C0496d dVar, int i2) {
        this.f7603p = i2;
        this.f7604q = z3;
        this.f7605r = mVar;
        this.f7606s = dVar;
        this.f7607t = firebaseAuth;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [e3.g, f3.t] */
    /* JADX WARNING: type inference failed for: r7v1, types: [e3.g, f3.t] */
    /* JADX WARNING: type inference failed for: r6v2, types: [e3.g, f3.t] */
    public final Task R0(String str) {
        switch (this.f7603p) {
            case 0:
                if (TextUtils.isEmpty(str)) {
                    Log.i("FirebaseAuth", "Email link login/reauth with empty reCAPTCHA token");
                } else {
                    Log.i("FirebaseAuth", "Got reCAPTCHA token for login/reauth with email link");
                }
                C0496d dVar = this.f7606s;
                boolean z3 = this.f7604q;
                FirebaseAuth firebaseAuth = this.f7607t;
                if (z3) {
                    zzach zzach = firebaseAuth.f6865e;
                    m mVar = this.f7605r;
                    I.g(mVar);
                    return zzach.zzb(firebaseAuth.f6862a, mVar, dVar, str, (t) new C0499g(firebaseAuth, 0));
                }
                return firebaseAuth.f6865e.zza(firebaseAuth.f6862a, dVar, str, (v) new C0500h(firebaseAuth));
            default:
                C0496d dVar2 = this.f7606s;
                boolean z4 = this.f7604q;
                FirebaseAuth firebaseAuth2 = this.f7607t;
                if (z4) {
                    if (TextUtils.isEmpty(str)) {
                        Log.i("FirebaseAuth", " Email link reauth with empty reCAPTCHA token");
                    } else {
                        Log.i("FirebaseAuth", "Got reCAPTCHA token for reauth with email link");
                    }
                    zzach zzach2 = firebaseAuth2.f6865e;
                    ? gVar = new C0499g(firebaseAuth2, 0);
                    m mVar2 = this.f7605r;
                    return zzach2.zza(firebaseAuth2.f6862a, mVar2, dVar2, str, (t) gVar);
                }
                String str2 = dVar2.f7640a;
                String str3 = dVar2.f7641b;
                if (TextUtils.isEmpty(str)) {
                    Log.i("FirebaseAuth", "Reauthenticating " + str2 + " with empty reCAPTCHA token");
                } else {
                    Log.i("FirebaseAuth", "Got reCAPTCHA token for reauth with " + str2);
                }
                zzach zzach3 = firebaseAuth2.f6865e;
                I.d(str3);
                String v6 = this.f7605r.v();
                ? gVar2 = new C0499g(firebaseAuth2, 0);
                return zzach3.zza(firebaseAuth2.f6862a, this.f7605r, str2, str3, v6, str, gVar2);
        }
    }
}
