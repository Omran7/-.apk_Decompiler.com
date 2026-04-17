package com.google.android.gms.internal.p002firebaseauthapi;

import G1.f;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzajd  reason: invalid package */
public class zzajd implements zzaer<zzajd> {
    private static final String zza = "zzajd";
    private String zzb;
    private String zzc;

    /* access modifiers changed from: private */
    /* renamed from: zzb */
    public final zzajd zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = f.a(jSONObject.optString("idToken"));
            this.zzc = f.a(jSONObject.optString("refreshToken"));
            return this;
        } catch (NullPointerException | JSONException e6) {
            throw zzajc.zza(e6, zza, str);
        }
    }

    public final String zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zzc;
    }
}
