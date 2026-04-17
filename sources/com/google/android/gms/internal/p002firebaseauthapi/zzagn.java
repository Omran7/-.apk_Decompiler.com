package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzagn  reason: invalid package */
public class zzagn implements zzaer<zzagn> {
    private static final String zza = "zzagn";
    private List<String> zzb;

    public zzagn() {
        zzaio.zza();
    }

    /* access modifiers changed from: private */
    /* renamed from: zzb */
    public final zzagn zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.optString("authUri", (String) null);
            jSONObject.optBoolean("registered", false);
            jSONObject.optString("providerId", (String) null);
            jSONObject.optBoolean("forExistingProvider", false);
            if (!jSONObject.has("allProviders")) {
                zzaio.zza();
            } else {
                new zzaio(1, zzajc.zza(jSONObject.optJSONArray("allProviders")));
            }
            this.zzb = zzajc.zza(jSONObject.optJSONArray("signinMethods"));
            return this;
        } catch (JSONException e6) {
            e = e6;
            throw zzajc.zza(e, zza, str);
        } catch (NullPointerException e7) {
            e = e7;
            throw zzajc.zza(e, zza, str);
        }
    }

    public final List<String> zza() {
        return this.zzb;
    }
}
