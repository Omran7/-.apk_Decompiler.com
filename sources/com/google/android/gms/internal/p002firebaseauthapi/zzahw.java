package com.google.android.gms.internal.p002firebaseauthapi;

import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzahw  reason: invalid package */
public abstract class zzahw implements zzaes {
    public static zzahz zzg() {
        return new zzagj();
    }

    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", zzc());
        jSONObject.put("token", zzf());
        jSONObject.put("providerId", zzd());
        jSONObject.put("tokenType", zzb().toString());
        jSONObject.put("tenantId", zze());
        return jSONObject.toString();
    }

    public abstract zzagy zzb();

    public abstract String zzc();

    public abstract String zzd();

    public abstract String zze();

    public abstract String zzf();
}
