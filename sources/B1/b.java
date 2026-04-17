package B1;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.C0353g;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.internal.C0380i;
import com.google.android.gms.common.internal.C0393w;
import com.google.android.gms.internal.auth.zzam;
import com.google.android.gms.internal.auth.zzbe;
import com.google.android.gms.internal.location.zzaz;
import com.google.android.gms.internal.p000authapiphone.zzw;
import com.google.android.gms.internal.p001authapi.zbo;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import n.j;
import q1.C0931a;
import q1.C0934d;
import z1.e;

public final class b extends a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f338a;

    public /* synthetic */ b(int i2) {
        this.f338a = i2;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [n.e, n.j] */
    public g buildClient(Context context, Looper looper, C0380i iVar, Object obj, m mVar, n nVar) {
        switch (this.f338a) {
            case 1:
                d dVar = (d) obj;
                HashSet hashSet = new HashSet();
                new HashSet();
                ? jVar = new j(0);
                j jVar2 = new j(0);
                Object obj2 = e.f12809c;
                b bVar = V1.b.f3760a;
                new ArrayList();
                new ArrayList();
                context.getMainLooper();
                String packageName = context.getPackageName();
                String name = context.getClass().getName();
                V1.a aVar = V1.a.f3759a;
                i iVar2 = V1.b.f3761b;
                if (jVar2.containsKey(iVar2)) {
                    aVar = (V1.a) jVar2.get(iVar2);
                }
                return new zzaz(context, looper, mVar, nVar, "activity_recognition", new C0380i(hashSet, jVar, packageName, name, aVar));
            case 2:
                d dVar2 = (d) obj;
                return new zzaz(context, looper, mVar, nVar, "locationServices", iVar);
            case 3:
                V1.a aVar2 = (V1.a) obj;
                iVar.getClass();
                Integer num = iVar.g;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", (Parcelable) null);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", (String) null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", (String) null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", (String) null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new W1.a(context, looper, iVar, bundle, mVar, nVar);
            case 4:
                obj.getClass();
                throw new ClassCastException();
            case 5:
                d dVar3 = (d) obj;
                return new zzam(context, looper, iVar, mVar, nVar);
            case zzaky.zzf.zzf /*6*/:
                return new zbo(context, looper, iVar, (C0931a) obj, mVar, nVar);
            case zzaky.zzf.zzg /*7*/:
                return new x1.e(context, looper, iVar, (GoogleSignInOptions) obj, mVar, nVar);
            default:
                return super.buildClient(context, looper, iVar, obj, mVar, nVar);
        }
    }

    public List getImpliedScopes(Object obj) {
        switch (this.f338a) {
            case zzaky.zzf.zzg /*7*/:
                GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
                if (googleSignInOptions == null) {
                    return Collections.emptyList();
                }
                return new ArrayList(googleSignInOptions.f5979b);
            default:
                return super.getImpliedScopes(obj);
        }
    }

    public /* synthetic */ g buildClient(Context context, Looper looper, C0380i iVar, Object obj, C0353g gVar, r rVar) {
        switch (this.f338a) {
            case 0:
                return new d(context, looper, iVar, (C0393w) obj, gVar, rVar);
            case 8:
                return new zzbe(context, looper, iVar, (C0934d) obj, gVar, rVar);
            case 9:
                d dVar = (d) obj;
                return new zzw(context, looper, iVar, gVar, rVar);
            default:
                return super.buildClient(context, looper, iVar, obj, gVar, rVar);
        }
    }
}
