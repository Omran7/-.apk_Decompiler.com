package x1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.internal.C0380i;
import com.google.android.gms.common.internal.C0383l;
import com.google.android.gms.internal.p001authapi.zba;
import com.google.android.gms.internal.p001authapi.zbbj;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import w1.C1076b;

public final class e extends C0383l {

    /* renamed from: a  reason: collision with root package name */
    public final GoogleSignInOptions f12546a;

    /* JADX WARNING: type inference failed for: r1v3, types: [w1.b, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v4, types: [w1.b, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(Context context, Looper looper, C0380i iVar, GoogleSignInOptions googleSignInOptions, m mVar, n nVar) {
        super(context, looper, 91, iVar, mVar, nVar);
        C1076b bVar;
        GoogleSignInOptions googleSignInOptions2 = googleSignInOptions;
        if (googleSignInOptions2 != null) {
            ? obj = new Object();
            obj.f12408a = new HashSet();
            obj.h = new HashMap();
            obj.f12408a = new HashSet(googleSignInOptions2.f5979b);
            obj.f12409b = googleSignInOptions2.f5981e;
            obj.f12410c = googleSignInOptions2.f5982f;
            obj.d = googleSignInOptions2.d;
            obj.f12411e = googleSignInOptions2.f5983p;
            obj.f12412f = googleSignInOptions2.f5980c;
            obj.g = googleSignInOptions2.f5984q;
            obj.h = GoogleSignInOptions.w(googleSignInOptions2.f5985r);
            obj.f12413i = googleSignInOptions2.f5986s;
            bVar = obj;
        } else {
            ? obj2 = new Object();
            obj2.f12408a = new HashSet();
            obj2.h = new HashMap();
            bVar = obj2;
        }
        bVar.f12413i = zbbj.zba();
        Set<Scope> set = iVar.f6174b;
        if (!set.isEmpty()) {
            for (Scope add : set) {
                HashSet hashSet = bVar.f12408a;
                hashSet.add(add);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        Scope scope = GoogleSignInOptions.f5976w;
        HashSet hashSet2 = bVar.f12408a;
        if (hashSet2.contains(scope)) {
            Scope scope2 = GoogleSignInOptions.f5975v;
            if (hashSet2.contains(scope2)) {
                hashSet2.remove(scope2);
            }
        }
        if (bVar.d && (bVar.f12412f == null || !hashSet2.isEmpty())) {
            bVar.f12408a.add(GoogleSignInOptions.f5974u);
        }
        this.f12546a = new GoogleSignInOptions(3, new ArrayList(hashSet2), bVar.f12412f, bVar.d, bVar.f12409b, bVar.f12410c, bVar.f12411e, bVar.g, bVar.h, bVar.f12413i);
    }

    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        if (queryLocalInterface instanceof k) {
            return (k) queryLocalInterface;
        }
        return new zba(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    public final int getMinApkVersion() {
        return 12451000;
    }

    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    public final Intent getSignInIntent() {
        Context context = getContext();
        h.f12550a.a("getSignInIntent()", new Object[0]);
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), this.f12546a);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("config", signInConfiguration);
        intent.putExtra("config", bundle);
        return intent;
    }

    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    public final boolean providesSignIn() {
        return true;
    }
}
