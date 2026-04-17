package com.google.android.gms.internal.p002firebaseauthapi;

import G1.f;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaia  reason: invalid package */
public class zzaia implements zzaer<zzaia> {
    private static final String zza = "zzaia";
    private String zzb;

    /* access modifiers changed from: private */
    /* renamed from: zzb */
    public final zzaia zza(String str) {
        try {
            this.zzb = f.a(new JSONObject(str).optString("sessionInfo", (String) null));
            return this;
        } catch (NullPointerException | JSONException e6) {
            throw zzajc.zza(e6, zza, str);
        }
    }

    public final String zza() {
        return this.zzb;
    }
}
