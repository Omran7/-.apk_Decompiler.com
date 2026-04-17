package e3;

import A1.a;
import I1.b;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import f3.C0527d;
import f3.t;

public final class H extends b {

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ int f7623p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ Object f7624q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ a f7625r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f7626s;

    public /* synthetic */ H(FirebaseAuth firebaseAuth, Object obj, a aVar, int i2) {
        this.f7623p = i2;
        this.f7624q = obj;
        this.f7625r = aVar;
        this.f7626s = firebaseAuth;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [e3.g, f3.t] */
    public final Task R0(String str) {
        switch (this.f7623p) {
            case 0:
                if (TextUtils.isEmpty(str)) {
                    Log.i("FirebaseAuth", "Linking email account with empty reCAPTCHA token");
                } else {
                    Log.i("FirebaseAuth", "Got reCAPTCHA token for linking email account");
                }
                C0527d dVar = (C0527d) this.f7626s;
                ? gVar = new C0499g(dVar, 0);
                return dVar.f6865e.zza(dVar.f6862a, (m) this.f7624q, (C0495c) (C0496d) this.f7625r, str, (t) gVar);
            default:
                boolean isEmpty = TextUtils.isEmpty(str);
                String str2 = (String) this.f7624q;
                if (isEmpty) {
                    Log.i("FirebaseAuth", "Password reset request " + str2 + " with empty reCAPTCHA token");
                } else {
                    Log.i("FirebaseAuth", "Got reCAPTCHA token for password reset of email " + str2);
                }
                FirebaseAuth firebaseAuth = this.f7626s;
                return firebaseAuth.f6865e.zza(firebaseAuth.f6862a, (String) this.f7624q, (C0493a) this.f7625r, firebaseAuth.f6867i, str);
        }
    }
}
