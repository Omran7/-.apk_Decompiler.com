package com.google.android.gms.internal.p002firebaseauthapi;

import G1.f;
import e3.F;
import e3.G;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzahd  reason: invalid package */
public class zzahd implements zzaer<zzahd> {
    private static final String zza = "zzahd";
    private zzahf zzb;

    /* access modifiers changed from: private */
    /* renamed from: zzb */
    public final zzahd zza(String str) {
        zzahf zzahf;
        int i2;
        zzahc zzahc;
        String str2 = str;
        try {
            JSONObject jSONObject = new JSONObject(str2);
            if (!jSONObject.has("users")) {
                zzahf = new zzahf();
            } else {
                JSONArray optJSONArray = jSONObject.optJSONArray("users");
                if (optJSONArray != null) {
                    if (optJSONArray.length() != 0) {
                        ArrayList arrayList = new ArrayList(optJSONArray.length());
                        boolean z3 = false;
                        int i5 = 0;
                        while (i5 < optJSONArray.length()) {
                            JSONObject jSONObject2 = optJSONArray.getJSONObject(i5);
                            if (jSONObject2 == null) {
                                zzahc = new zzahc();
                                i2 = i5;
                            } else {
                                i2 = i5;
                                zzahc = new zzahc(f.a(jSONObject2.optString("localId", (String) null)), f.a(jSONObject2.optString("email", (String) null)), jSONObject2.optBoolean("emailVerified", z3), f.a(jSONObject2.optString("displayName", (String) null)), f.a(jSONObject2.optString("photoUrl", (String) null)), zzahs.zza(jSONObject2.optJSONArray("providerUserInfo")), f.a(jSONObject2.optString("rawPassword", (String) null)), f.a(jSONObject2.optString("phoneNumber", (String) null)), jSONObject2.optLong("createdAt", 0), jSONObject2.optLong("lastLoginAt", 0), false, (G) null, zzahq.zza(jSONObject2.optJSONArray("mfaInfo")), F.v(jSONObject2.optJSONArray("passkeyInfo")));
                            }
                            arrayList.add(zzahc);
                            i5 = i2 + 1;
                            z3 = false;
                        }
                        zzahf = new zzahf(arrayList);
                    }
                }
                zzahf = new zzahf(new ArrayList());
            }
            this.zzb = zzahf;
            return this;
        } catch (JSONException e6) {
            e = e6;
            throw zzajc.zza(e, zza, str2);
        } catch (NullPointerException e7) {
            e = e7;
            throw zzajc.zza(e, zza, str2);
        }
    }

    public final List<zzahc> zza() {
        return this.zzb.zza();
    }
}
