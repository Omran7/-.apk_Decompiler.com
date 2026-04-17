package com.google.android.gms.internal.p002firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaij  reason: invalid package */
public class zzaij implements zzaer<zzaij> {
    private static final String zza = "zzaij";

    public String zza() {
        return null;
    }

    /* renamed from: zzb */
    public zzaij zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optJSONObject("phoneSessionInfo") != null) {
                return (zzain) ((zzaij) new zzain().zza(str));
            }
            if (jSONObject.optJSONObject("totpSessionInfo") != null) {
                return (zzaip) ((zzaij) new zzaip().zza(str));
            }
            throw new IllegalArgumentException("Missing phoneSessionInfo or totpSessionInfo.");
        } catch (JSONException e6) {
            e = e6;
            throw zzajc.zza(e, zza, str);
        } catch (NullPointerException e7) {
            e = e7;
            throw zzajc.zza(e, zza, str);
        }
    }
}
