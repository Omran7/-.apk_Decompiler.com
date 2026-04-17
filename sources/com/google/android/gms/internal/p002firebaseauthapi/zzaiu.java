package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.I;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaiu  reason: invalid package */
public final class zzaiu implements zzaes {
    private String zza;
    private String zzb;

    public zzaiu(String str, String str2) {
        I.d(str);
        this.zza = str;
        this.zzb = str2;
    }

    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("token", this.zza);
        jSONObject.put("returnSecureToken", true);
        String str = this.zzb;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        return jSONObject.toString();
    }
}
