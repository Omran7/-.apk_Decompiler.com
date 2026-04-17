package com.google.android.gms.internal.auth;

import android.net.Uri;

public final class zzcz {
    final String zza;
    final Uri zzb;
    final String zzc;
    final String zzd;
    final boolean zze;
    final boolean zzf;
    final boolean zzg;
    final boolean zzh;
    final zzdg zzi;

    private zzcz(String str, Uri uri, String str2, String str3, boolean z3, boolean z4, boolean z5, boolean z6, zzdg zzdg) {
        this.zza = null;
        this.zzb = uri;
        this.zzc = "";
        this.zzd = "";
        this.zze = z3;
        this.zzf = false;
        this.zzg = z5;
        this.zzh = false;
        this.zzi = null;
    }

    public final zzcz zza() {
        return new zzcz((String) null, this.zzb, this.zzc, this.zzd, this.zze, false, true, false, (zzdg) null);
    }

    public final zzcz zzb() {
        if (this.zzc.isEmpty()) {
            return new zzcz((String) null, this.zzb, this.zzc, this.zzd, true, false, this.zzg, false, (zzdg) null);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    public final zzdc zzc(String str, double d) {
        return new zzcx(this, str, Double.valueOf(0.0d), true);
    }

    public final zzdc zzd(String str, long j6) {
        return new zzcv(this, str, Long.valueOf(j6), true);
    }

    public final zzdc zze(String str, boolean z3) {
        return new zzcw(this, str, Boolean.valueOf(z3), true);
    }

    public final zzdc zzf(String str, Object obj, zzhu zzhu) {
        return new zzcy(this, "getTokenRefactor__blocked_packages", obj, true, zzhu, (byte[]) null);
    }

    public zzcz(Uri uri) {
        this((String) null, uri, "", "", false, false, false, false, (zzdg) null);
    }
}
