package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.I;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaiw  reason: invalid package */
public final class zzaiw implements zzaes {
    private String zza;
    private String zzb;
    private final String zzc;
    private final String zzd;
    private boolean zze = true;

    public zzaiw(String str, String str2, String str3, String str4) {
        I.d(str);
        this.zza = str;
        I.d(str2);
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
    }

    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("email", this.zza);
        jSONObject.put("password", this.zzb);
        jSONObject.put("returnSecureToken", this.zze);
        String str = this.zzc;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        String str2 = this.zzd;
        if (str2 != null) {
            zzajc.zza(jSONObject, "captchaResponse", str2);
        } else {
            zzajc.zza(jSONObject);
        }
        return jSONObject.toString();
    }
}
