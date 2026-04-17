package com.google.android.gms.internal.p002firebaseauthapi;

import android.util.Log;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaho  reason: invalid package */
public final class zzaho {
    private Long zza;
    private Long zzb;

    public static zzaho zza(String str) {
        try {
            zzaho zzaho = new zzaho();
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.optString("iss");
            jSONObject.optString("aud");
            jSONObject.optString("sub");
            zzaho.zza = Long.valueOf(jSONObject.optLong("iat"));
            zzaho.zzb = Long.valueOf(jSONObject.optLong("exp"));
            jSONObject.optBoolean("is_anonymous");
            return zzaho;
        } catch (JSONException e6) {
            if (Log.isLoggable("JwtToken", 3)) {
                Log.d("JwtToken", "Failed to read JwtToken from JSONObject. ".concat(String.valueOf(e6)));
            }
            throw new UnsupportedEncodingException("Failed to read JwtToken from JSONObject. ".concat(String.valueOf(e6)));
        }
    }

    public final Long zzb() {
        return this.zza;
    }

    public final Long zza() {
        return this.zzb;
    }
}
