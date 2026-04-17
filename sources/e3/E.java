package e3;

import I1.b;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.p002firebaseauthapi.zzach;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public final class E extends b {

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ String f7608p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ boolean f7609q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ m f7610r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ String f7611s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ String f7612t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f7613u;

    public E(FirebaseAuth firebaseAuth, String str, boolean z3, m mVar, String str2, String str3) {
        this.f7608p = str;
        this.f7609q = z3;
        this.f7610r = mVar;
        this.f7611s = str2;
        this.f7612t = str3;
        this.f7613u = firebaseAuth;
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [e3.g, f3.t] */
    public final Task R0(String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        String str2 = this.f7608p;
        if (isEmpty) {
            Log.i("FirebaseAuth", "Logging in as " + str2 + " with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for login with email " + str2);
        }
        boolean z3 = this.f7609q;
        FirebaseAuth firebaseAuth = this.f7613u;
        if (z3) {
            zzach zzach = firebaseAuth.f6865e;
            m mVar = this.f7610r;
            I.g(mVar);
            ? gVar = new C0499g(firebaseAuth, 0);
            return zzach.zzb(firebaseAuth.f6862a, mVar, this.f7608p, this.f7611s, this.f7612t, str, gVar);
        }
        zzach zzach2 = firebaseAuth.f6865e;
        C0500h hVar = new C0500h(firebaseAuth);
        return zzach2.zzb(firebaseAuth.f6862a, this.f7608p, this.f7611s, this.f7612t, str, hVar);
    }
}
