package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzahi  reason: invalid package */
public class zzahi implements zzaer<zzahi> {
    private static final String zza = "zzahi";
    private List<String> zzb;

    /* access modifiers changed from: private */
    /* renamed from: zzb */
    public final zzahi zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("authorizedDomains");
            if (optJSONArray != null) {
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    this.zzb.add(optJSONArray.getString(i2));
                }
            }
            return this;
        } catch (JSONException e6) {
            throw zzajc.zza((Exception) e6, zza, str);
        }
    }

    public final List<String> zza() {
        return this.zzb;
    }
}
