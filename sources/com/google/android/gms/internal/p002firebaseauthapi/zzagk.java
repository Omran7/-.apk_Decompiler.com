package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.I;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzagk  reason: invalid package */
public final class zzagk implements zzaes {
    private String zza;
    private String zzb = "http://localhost";
    private final String zzc;

    public zzagk(String str, String str2) {
        I.d(str);
        this.zza = str;
        this.zzc = str2;
    }

    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("identifier", this.zza);
        jSONObject.put("continueUri", this.zzb);
        String str = this.zzc;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        return jSONObject.toString();
    }
}
