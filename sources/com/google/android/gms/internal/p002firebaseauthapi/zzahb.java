package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.I;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzahb  reason: invalid package */
public final class zzahb implements zzaes {
    private String zza = zzagz.REFRESH_TOKEN.toString();
    private String zzb;

    public zzahb(String str) {
        I.d(str);
        this.zzb = str;
    }

    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("grantType", this.zza);
        jSONObject.put("refreshToken", this.zzb);
        return jSONObject.toString();
    }
}
