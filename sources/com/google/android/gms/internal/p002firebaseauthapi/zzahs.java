package com.google.android.gms.internal.p002firebaseauthapi;

import G1.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzahs  reason: invalid package */
public final class zzahs {
    private List<zzaht> zza;

    public zzahs() {
        this.zza = new ArrayList();
    }

    public static zzahs zza(JSONArray jSONArray) {
        zzaht zzaht;
        if (jSONArray == null || jSONArray.length() == 0) {
            return new zzahs(new ArrayList());
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i2);
            if (jSONObject == null) {
                zzaht = new zzaht();
            } else {
                zzaht = new zzaht(f.a(jSONObject.optString("federatedId")), f.a(jSONObject.optString("displayName")), f.a(jSONObject.optString("photoUrl")), f.a(jSONObject.optString("providerId")), (String) null, f.a(jSONObject.optString("phoneNumber")), f.a(jSONObject.optString("email")));
            }
            arrayList.add(zzaht);
        }
        return new zzahs(arrayList);
    }

    private zzahs(List<zzaht> list) {
        if (!list.isEmpty()) {
            this.zza = Collections.unmodifiableList(list);
        } else {
            this.zza = Collections.emptyList();
        }
    }

    public final List<zzaht> zza() {
        return this.zza;
    }
}
