package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.I;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzage  reason: invalid package */
public final class zzage {
    private final String zza;

    public zzage(String str) {
        I.d(str);
        this.zza = str;
    }

    public final JSONObject zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("appSignatureHash", this.zza);
        return jSONObject;
    }
}
