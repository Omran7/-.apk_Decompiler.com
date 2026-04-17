package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzagj  reason: invalid package */
final class zzagj extends zzahz {
    private String zza;
    private String zzb;
    private String zzc;
    private zzagy zzd;
    private String zze;

    public final zzahz zza(String str) {
        if (str != null) {
            this.zze = str;
            return this;
        }
        throw new NullPointerException("Null idToken");
    }

    public final zzahz zzb(String str) {
        if (str != null) {
            this.zza = str;
            return this;
        }
        throw new NullPointerException("Null providerId");
    }

    public final zzahz zzc(String str) {
        this.zzb = str;
        return this;
    }

    public final zzahz zzd(String str) {
        if (str != null) {
            this.zzc = str;
            return this;
        }
        throw new NullPointerException("Null token");
    }

    public final zzahz zza(zzagy zzagy) {
        if (zzagy != null) {
            this.zzd = zzagy;
            return this;
        }
        throw new NullPointerException("Null tokenType");
    }

    public final zzahw zza() {
        String str;
        zzagy zzagy;
        String str2;
        String str3 = this.zza;
        if (str3 != null && (str = this.zzc) != null && (zzagy = this.zzd) != null && (str2 = this.zze) != null) {
            return new zzagg(str3, this.zzb, str, zzagy, str2);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(" providerId");
        }
        if (this.zzc == null) {
            sb.append(" token");
        }
        if (this.zzd == null) {
            sb.append(" tokenType");
        }
        if (this.zze == null) {
            sb.append(" idToken");
        }
        throw new IllegalStateException("Missing required properties:".concat(String.valueOf(sb)));
    }
}
