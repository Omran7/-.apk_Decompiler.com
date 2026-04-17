package com.google.android.gms.internal.p002firebaseauthapi;

import android.util.Log;
import h0.C0552a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzajc  reason: invalid package */
public final class zzajc {
    public static zzaci zza(Exception exc, String str, String str2) {
        String message = exc.getMessage();
        StringBuilder u6 = C0552a.u("Failed to parse ", str, " for string [", str2, "] with exception: ");
        u6.append(message);
        Log.e(str, u6.toString());
        return new zzaci(C0552a.q("Failed to parse ", str, " for string [", str2, "]"), exc);
    }

    public static List<String> zza(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (!(jSONArray == null || jSONArray.length() == 0)) {
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                arrayList.add(jSONArray.getString(i2));
            }
        }
        return arrayList;
    }

    public static void zza(JSONObject jSONObject) {
        jSONObject.put("clientType", "CLIENT_TYPE_ANDROID");
    }

    public static void zza(JSONObject jSONObject, String str, String str2) {
        jSONObject.put(str, str2);
        jSONObject.put("recaptchaVersion", "RECAPTCHA_ENTERPRISE");
        jSONObject.put("clientType", "CLIENT_TYPE_ANDROID");
    }
}
