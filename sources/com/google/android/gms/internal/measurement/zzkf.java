package com.google.android.gms.internal.measurement;

import android.net.Uri;
import z2.C1135b;

public final class zzkf {
    final Uri zza;
    final String zzb;
    final String zzc;
    final boolean zzd;
    final boolean zze;

    private zzkf(String str, Uri uri, String str2, String str3, boolean z3, boolean z4, boolean z5, boolean z6, C1135b bVar) {
        this.zza = uri;
        this.zzb = "";
        this.zzc = "";
        this.zzd = z3;
        this.zze = z5;
    }

    public final zzkf zza() {
        return new zzkf((String) null, this.zza, this.zzb, this.zzc, this.zzd, false, true, false, (C1135b) null);
    }

    public final zzkf zzb() {
        String str = this.zzb;
        if (str.isEmpty()) {
            return new zzkf((String) null, this.zza, str, this.zzc, true, false, this.zze, false, (C1135b) null);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    public final zzki zzc(String str, double d) {
        Double valueOf = Double.valueOf(-3.0d);
        int i2 = zzki.zzc;
        return new zzkd(this, "measurement.test.double_flag", valueOf, true);
    }

    public final zzki zzd(String str, long j6) {
        Long valueOf = Long.valueOf(j6);
        int i2 = zzki.zzc;
        return new zzkb(this, str, valueOf, true);
    }

    public final zzki zze(String str, String str2) {
        int i2 = zzki.zzc;
        return new zzke(this, str, str2, true);
    }

    public final zzki zzf(String str, boolean z3) {
        Boolean valueOf = Boolean.valueOf(z3);
        int i2 = zzki.zzc;
        return new zzkc(this, str, valueOf, true);
    }

    public zzkf(Uri uri) {
        this((String) null, uri, "", "", false, false, false, false, (C1135b) null);
    }
}
