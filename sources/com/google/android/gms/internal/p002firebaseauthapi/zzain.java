package com.google.android.gms.internal.p002firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzain  reason: invalid package */
public final class zzain extends zzaij {
    private static final String zza = "zzain";
    private String zzb;

    /* access modifiers changed from: private */
    /* renamed from: zzc */
    public final zzain zzb(String str) {
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("phoneSessionInfo");
            if (optJSONObject != null) {
                this.zzb = zzae.zza(optJSONObject.optString("sessionInfo"));
            }
            return this;
        } catch (NullPointerException | JSONException e6) {
            throw zzajc.zza(e6, zza, str);
        }
    }

    public final /* synthetic */ zzaer zza(String str) {
        return (zzain) zzb(str);
    }

    public final String zza() {
        return this.zzb;
    }
}
