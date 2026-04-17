package B1;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.internal.C0353g;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.internal.C0380i;
import com.google.android.gms.common.internal.C0383l;
import com.google.android.gms.common.internal.C0393w;
import com.google.android.gms.internal.base.zaa;
import com.google.android.gms.internal.base.zaf;

public final class d extends C0383l {

    /* renamed from: a  reason: collision with root package name */
    public final C0393w f340a;

    public d(Context context, Looper looper, C0380i iVar, C0393w wVar, C0353g gVar, r rVar) {
        super(context, looper, 270, iVar, gVar, rVar);
        this.f340a = wVar;
    }

    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        if (queryLocalInterface instanceof a) {
            return (a) queryLocalInterface;
        }
        return new zaa(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    public final z1.d[] getApiFeatures() {
        return zaf.zab;
    }

    public final Bundle getGetServiceRequestExtraArgs() {
        C0393w wVar = this.f340a;
        wVar.getClass();
        Bundle bundle = new Bundle();
        String str = wVar.f6224a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final int getMinApkVersion() {
        return 203400000;
    }

    public final String getServiceDescriptor() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    public final String getStartServiceAction() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    public final boolean getUseDynamicLookup() {
        return true;
    }
}
