package com.google.android.gms.internal.p002firebaseauthapi;

import G1.f;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzail  reason: invalid package */
public class zzail implements zzaer<zzail> {
    private static final String zza = "zzail";
    private String zzb;

    /* access modifiers changed from: private */
    /* renamed from: zzb */
    public final zzail zza(String str) {
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("phoneResponseInfo");
            if (optJSONObject != null) {
                this.zzb = f.a(optJSONObject.optString("sessionInfo"));
            }
            return this;
        } catch (NullPointerException | JSONException e6) {
            throw zzajc.zza(e6, zza, str);
        }
    }

    public final String zza() {
        return this.zzb;
    }
}
