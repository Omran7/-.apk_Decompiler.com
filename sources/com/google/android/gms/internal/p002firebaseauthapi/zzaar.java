package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.common.internal.I;
import e3.F;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaar  reason: invalid package */
final class zzaar implements zzafn<zzaic> {
    private final /* synthetic */ zzaid zza;
    private final /* synthetic */ zzahc zzb;
    private final /* synthetic */ zzaeg zzc;
    private final /* synthetic */ zzahn zzd;
    private final /* synthetic */ zzafk zze;
    private final /* synthetic */ zzaam zzf;

    public zzaar(zzaam zzaam, zzaid zzaid, zzahc zzahc, zzaeg zzaeg, zzahn zzahn, zzafk zzafk) {
        this.zza = zzaid;
        this.zzb = zzahc;
        this.zzc = zzaeg;
        this.zzd = zzahn;
        this.zze = zzafk;
        this.zzf = zzaam;
    }

    public final void zza(String str) {
        this.zze.zza(str);
    }

    public final void zza(Object obj) {
        zzaic zzaic = (zzaic) obj;
        String str = null;
        if (this.zza.zzi("EMAIL")) {
            this.zzb.zzb((String) null);
        } else if (this.zza.zzc() != null) {
            this.zzb.zzb(this.zza.zzc());
        }
        if (this.zza.zzi("DISPLAY_NAME")) {
            this.zzb.zza((String) null);
        } else if (this.zza.zzb() != null) {
            this.zzb.zza(this.zza.zzb());
        }
        if (this.zza.zzi("PHOTO_URL")) {
            this.zzb.zzc((String) null);
        } else if (this.zza.zze() != null) {
            this.zzb.zzc(this.zza.zze());
        }
        if (!TextUtils.isEmpty(this.zza.zzd())) {
            byte[] bytes = "redacted".getBytes();
            if (bytes != null) {
                str = Base64.encodeToString(bytes, 0);
            }
            I.d(str);
        }
        if (this.zza.zzi("delete_passkey")) {
            this.zzb.zza((zzaj<F>) zzaj.zzh());
        }
        List zze2 = zzaic.zze();
        if (zze2 == null) {
            zze2 = new ArrayList();
        }
        this.zzb.zza((List<zzaht>) zze2);
        zzaeg zzaeg = this.zzc;
        zzahn zzahn = this.zzd;
        I.g(zzahn);
        String zzc2 = zzaic.zzc();
        String zzd2 = zzaic.zzd();
        if (!TextUtils.isEmpty(zzc2) && !TextUtils.isEmpty(zzd2)) {
            zzahn = new zzahn(zzd2, zzc2, Long.valueOf(zzaic.zza()), zzahn.zze());
        }
        zzaeg.zza(zzahn, this.zzb);
    }
}
