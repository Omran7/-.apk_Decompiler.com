package W1;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.internal.C0380i;
import com.google.android.gms.common.internal.C0383l;
import com.google.android.gms.internal.base.zaa;

public final class a extends C0383l implements g {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f4061a = true;

    /* renamed from: b  reason: collision with root package name */
    public final C0380i f4062b;

    /* renamed from: c  reason: collision with root package name */
    public final Bundle f4063c;
    public final Integer d;

    public a(Context context, Looper looper, C0380i iVar, Bundle bundle, m mVar, n nVar) {
        super(context, looper, 44, iVar, mVar, nVar);
        this.f4062b = iVar;
        this.f4063c = bundle;
        this.d = iVar.g;
    }

    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if (queryLocalInterface instanceof d) {
            return (d) queryLocalInterface;
        }
        return new zaa(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final Bundle getGetServiceRequestExtraArgs() {
        C0380i iVar = this.f4062b;
        boolean equals = getContext().getPackageName().equals(iVar.d);
        Bundle bundle = this.f4063c;
        if (!equals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", iVar.d);
        }
        return bundle;
    }

    public final int getMinApkVersion() {
        return 12451000;
    }

    public final String getServiceDescriptor() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    public final String getStartServiceAction() {
        return "com.google.android.gms.signin.service.START";
    }

    public final boolean requiresSignIn() {
        return this.f4061a;
    }
}
