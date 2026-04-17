package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import h0.C0552a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzagl  reason: invalid package */
public class zzagl implements zzaer<zzagl> {
    private static final String zza = "com.google.android.gms.internal.firebase-auth-api.zzagl";
    private String zzb;

    /* access modifiers changed from: private */
    /* renamed from: zzb */
    public final zzagl zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(new JSONObject(str).getString("error"));
            jSONObject.getInt("code");
            this.zzb = jSONObject.getString("message");
            return this;
        } catch (NullPointerException | JSONException e6) {
            String str2 = zza;
            String message = e6.getMessage();
            Log.e(str2, "Failed to parse error for string [" + str + "] with exception: " + message);
            throw new zzaci(C0552a.o("Failed to parse error for string [", str, "]"), e6);
        }
    }

    public final String zza() {
        return this.zzb;
    }

    public final boolean zzb() {
        return !TextUtils.isEmpty(this.zzb);
    }
}
