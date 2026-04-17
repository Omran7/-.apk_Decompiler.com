package com.google.android.gms.internal.p002firebaseauthapi;

import G1.f;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaic  reason: invalid package */
public class zzaic implements zzaer<zzaic> {
    private static final String zza = "zzaic";
    private String zzb;
    private zzahs zzc;
    private String zzd;
    private String zze;
    private long zzf;

    /* access modifiers changed from: private */
    /* renamed from: zzb */
    public final zzaic zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = f.a(jSONObject.optString("email"));
            f.a(jSONObject.optString("passwordHash"));
            jSONObject.optBoolean("emailVerified", false);
            f.a(jSONObject.optString("displayName"));
            f.a(jSONObject.optString("photoUrl"));
            this.zzc = zzahs.zza(jSONObject.optJSONArray("providerUserInfo"));
            this.zzd = f.a(jSONObject.optString("idToken"));
            this.zze = f.a(jSONObject.optString("refreshToken"));
            this.zzf = jSONObject.optLong("expiresIn", 0);
            return this;
        } catch (NullPointerException | JSONException e6) {
            throw zzajc.zza(e6, zza, str);
        }
    }

    public final long zza() {
        return this.zzf;
    }

    public final String zzc() {
        return this.zzd;
    }

    public final String zzd() {
        return this.zze;
    }

    public final List<zzaht> zze() {
        zzahs zzahs = this.zzc;
        if (zzahs != null) {
            return zzahs.zza();
        }
        return null;
    }

    public final String zzb() {
        return this.zzb;
    }
}
