package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.internal.I;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaiy  reason: invalid package */
public final class zzaiy implements zzaes {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private boolean zzf;

    private zzaiy() {
    }

    public static zzaiy zza(String str, String str2, boolean z3) {
        zzaiy zzaiy = new zzaiy();
        I.d(str);
        zzaiy.zzb = str;
        I.d(str2);
        zzaiy.zzc = str2;
        zzaiy.zzf = z3;
        return zzaiy;
    }

    public static zzaiy zzb(String str, String str2, boolean z3) {
        zzaiy zzaiy = new zzaiy();
        I.d(str);
        zzaiy.zza = str;
        I.d(str2);
        zzaiy.zzd = str2;
        zzaiy.zzf = z3;
        return zzaiy;
    }

    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(this.zzd)) {
            jSONObject.put("phoneNumber", this.zza);
            jSONObject.put("temporaryProof", this.zzd);
        } else {
            jSONObject.put("sessionInfo", this.zzb);
            jSONObject.put("code", this.zzc);
        }
        String str = this.zze;
        if (str != null) {
            jSONObject.put("idToken", str);
        }
        if (!this.zzf) {
            jSONObject.put("operation", 2);
        }
        return jSONObject.toString();
    }

    public final void zza(String str) {
        this.zze = str;
    }
}
