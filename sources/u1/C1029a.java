package u1;

import B1.b;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;

/* renamed from: u1.a  reason: case insensitive filesystem */
public abstract class C1029a extends l {
    private static final h zza;
    private static final a zzb;
    private static final i zzc;

    /* JADX WARNING: type inference failed for: r0v0, types: [com.google.android.gms.common.api.h, java.lang.Object] */
    static {
        ? obj = new Object();
        zza = obj;
        b bVar = new b(9);
        zzb = bVar;
        zzc = new i("SmsRetriever.API", bVar, obj);
    }

    public C1029a(Activity activity) {
        super(activity, activity, zzc, e.g, k.f6119c);
    }

    public C1029a(Context context) {
        super(context, (Activity) null, zzc, e.g, k.f6119c);
    }
}
