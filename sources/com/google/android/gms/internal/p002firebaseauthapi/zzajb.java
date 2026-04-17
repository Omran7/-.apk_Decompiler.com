package com.google.android.gms.internal.p002firebaseauthapi;

import G1.f;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzajb  reason: invalid package */
public class zzajb implements zzaer<zzajb> {
    private static final String zza = "zzajb";
    private String zzb;
    private String zzc;
    private long zzd;
    private boolean zze;
    private String zzf;
    private String zzg;

    /* access modifiers changed from: private */
    /* renamed from: zzb */
    public final zzajb zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = f.a(jSONObject.optString("idToken", (String) null));
            this.zzc = f.a(jSONObject.optString("refreshToken", (String) null));
            this.zzd = jSONObject.optLong("expiresIn", 0);
            f.a(jSONObject.optString("localId", (String) null));
            this.zze = jSONObject.optBoolean("isNewUser", false);
            this.zzf = f.a(jSONObject.optString("temporaryProof", (String) null));
            this.zzg = f.a(jSONObject.optString("phoneNumber", (String) null));
            return this;
        } catch (NullPointerException | JSONException e6) {
            throw zzajc.zza(e6, zza, str);
        }
    }

    public final long zza() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zzg;
    }

    public final String zzd() {
        return this.zzc;
    }

    public final String zze() {
        return this.zzf;
    }

    public final boolean zzf() {
        return this.zze;
    }

    public final String zzb() {
        return this.zzb;
    }
}
