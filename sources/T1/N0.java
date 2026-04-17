package T1;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.measurement.zzdh;

public final class N0 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f2990a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2991b;

    /* renamed from: c  reason: collision with root package name */
    public final String f2992c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final Boolean f2993e;

    /* renamed from: f  reason: collision with root package name */
    public final long f2994f;
    public final zzdh g;
    public final boolean h = true;

    /* renamed from: i  reason: collision with root package name */
    public final Long f2995i;

    /* renamed from: j  reason: collision with root package name */
    public final String f2996j;

    public N0(Context context, zzdh zzdh, Long l6) {
        I.g(context);
        Context applicationContext = context.getApplicationContext();
        I.g(applicationContext);
        this.f2990a = applicationContext;
        this.f2995i = l6;
        if (zzdh != null) {
            this.g = zzdh;
            this.f2991b = zzdh.zzf;
            this.f2992c = zzdh.zze;
            this.d = zzdh.zzd;
            this.h = zzdh.zzc;
            this.f2994f = zzdh.zzb;
            this.f2996j = zzdh.zzh;
            Bundle bundle = zzdh.zzg;
            if (bundle != null) {
                this.f2993e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
