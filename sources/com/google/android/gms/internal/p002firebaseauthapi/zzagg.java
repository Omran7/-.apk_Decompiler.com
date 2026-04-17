package com.google.android.gms.internal.p002firebaseauthapi;

import h0.C0552a;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzagg  reason: invalid package */
final class zzagg extends zzahw {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final zzagy zzd;
    private final String zze;

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzahw) {
            zzahw zzahw = (zzahw) obj;
            if (!this.zza.equals(zzahw.zzd()) || ((str = this.zzb) != null ? !str.equals(zzahw.zze()) : zzahw.zze() != null) || !this.zzc.equals(zzahw.zzf()) || !this.zzd.equals(zzahw.zzb()) || !this.zze.equals(zzahw.zzc())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        int hashCode = (this.zza.hashCode() ^ 1000003) * 1000003;
        String str = this.zzb;
        if (str == null) {
            i2 = 0;
        } else {
            i2 = str.hashCode();
        }
        return ((((((hashCode ^ i2) * 1000003) ^ this.zzc.hashCode()) * 1000003) ^ this.zzd.hashCode()) * 1000003) ^ this.zze.hashCode();
    }

    public final String toString() {
        String str = this.zza;
        String str2 = this.zzb;
        String str3 = this.zzc;
        String valueOf = String.valueOf(this.zzd);
        String str4 = this.zze;
        StringBuilder u6 = C0552a.u("RevokeTokenRequest{providerId=", str, ", tenantId=", str2, ", token=");
        u6.append(str3);
        u6.append(", tokenType=");
        u6.append(valueOf);
        u6.append(", idToken=");
        return C0552a.r(u6, str4, "}");
    }

    public final zzagy zzb() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zze;
    }

    public final String zzd() {
        return this.zza;
    }

    public final String zze() {
        return this.zzb;
    }

    public final String zzf() {
        return this.zzc;
    }

    private zzagg(String str, String str2, String str3, zzagy zzagy, String str4) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = zzagy;
        this.zze = str4;
    }
}
