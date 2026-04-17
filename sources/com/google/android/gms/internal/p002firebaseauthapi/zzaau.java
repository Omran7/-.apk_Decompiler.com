package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import e3.G;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaau  reason: invalid package */
final class zzaau implements zzafn<zzahd> {
    private final /* synthetic */ zzafk zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ Boolean zzd;
    private final /* synthetic */ G zze;
    private final /* synthetic */ zzaeg zzf;
    private final /* synthetic */ zzahn zzg;

    public zzaau(zzaam zzaam, zzafk zzafk, String str, String str2, Boolean bool, G g, zzaeg zzaeg, zzahn zzahn) {
        this.zza = zzafk;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = bool;
        this.zze = g;
        this.zzf = zzaeg;
        this.zzg = zzahn;
    }

    public final void zza(String str) {
        this.zza.zza(str);
    }

    public final /* synthetic */ void zza(Object obj) {
        List<zzahc> zza2 = ((zzahd) obj).zza();
        if (zza2 == null || zza2.isEmpty()) {
            this.zza.zza("No users.");
            return;
        }
        boolean z3 = false;
        zzahc zzahc = zza2.get(0);
        zzahs zzf2 = zzahc.zzf();
        List<zzaht> zza3 = zzf2 != null ? zzf2.zza() : null;
        if (zza3 != null && !zza3.isEmpty()) {
            if (!TextUtils.isEmpty(this.zzb)) {
                int i2 = 0;
                while (true) {
                    if (i2 >= zza3.size()) {
                        break;
                    } else if (zza3.get(i2).zzf().equals(this.zzb)) {
                        zza3.get(i2).zza(this.zzc);
                        break;
                    } else {
                        i2++;
                    }
                }
            } else {
                zza3.get(0).zza(this.zzc);
            }
        }
        Boolean bool = this.zzd;
        if (bool != null) {
            zzahc.zza(bool.booleanValue());
        } else {
            if (zzahc.zzb() - zzahc.zza() < 1000) {
                z3 = true;
            }
            zzahc.zza(z3);
        }
        zzahc.zza(this.zze);
        this.zzf.zza(this.zzg, zzahc);
    }
}
