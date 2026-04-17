package com.google.android.gms.internal.p002firebaseauthapi;

import G1.f;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzahj  reason: invalid package */
public class zzahj implements zzaer<zzahj> {
    private static final String zza = "zzahj";
    private String zzb;

    public zzahj() {
    }

    /* access modifiers changed from: private */
    /* renamed from: zzb */
    public final zzahj zza(String str) {
        try {
            this.zzb = f.a(new JSONObject(str).optString("producerProjectNumber"));
            return this;
        } catch (NullPointerException | JSONException e6) {
            throw zzajc.zza(e6, zza, str);
        }
    }

    public zzahj(String str) {
        this.zzb = str;
    }

    public final String zza() {
        return this.zzb;
    }
}
