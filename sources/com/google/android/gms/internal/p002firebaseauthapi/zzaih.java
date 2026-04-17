package com.google.android.gms.internal.p002firebaseauthapi;

import G1.f;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaih  reason: invalid package */
public class zzaih implements zzaer<zzaih> {
    private static final String zza = "zzaih";
    private String zzb;
    private String zzc;
    private long zzd;

    /* access modifiers changed from: private */
    /* renamed from: zzb */
    public final zzaih zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = f.a(jSONObject.optString("idToken", (String) null));
            f.a(jSONObject.optString("displayName", (String) null));
            f.a(jSONObject.optString("email", (String) null));
            this.zzc = f.a(jSONObject.optString("refreshToken", (String) null));
            this.zzd = jSONObject.optLong("expiresIn", 0);
            return this;
        } catch (NullPointerException | JSONException e6) {
            throw zzajc.zza(e6, zza, str);
        }
    }

    public final long zza() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final String zzb() {
        return this.zzb;
    }
}
