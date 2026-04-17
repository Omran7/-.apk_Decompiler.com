package com.google.android.gms.internal.p002firebaseauthapi;

import G1.f;
import com.google.android.gms.common.internal.I;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzahk  reason: invalid package */
public class zzahk implements zzaer<zzahk> {
    private static final String zza = "zzahk";
    private String zzb;
    private zzaj<zzahv> zzc;

    /* access modifiers changed from: private */
    /* renamed from: zzd */
    public final zzahk zza(String str) {
        zzaj<zzahv> zzaj;
        zzahv zzahv;
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = f.a(jSONObject.optString("recaptchaKey"));
            if (jSONObject.has("recaptchaEnforcementState")) {
                JSONArray optJSONArray = jSONObject.optJSONArray("recaptchaEnforcementState");
                if (optJSONArray != null) {
                    if (optJSONArray.length() != 0) {
                        zzam zzg = zzaj.zzg();
                        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                            JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
                            if (jSONObject2 == null) {
                                zzahv = zzahv.zza((String) null, (String) null);
                            } else {
                                zzahv = zzahv.zza(f.a(jSONObject2.optString("provider")), f.a(jSONObject2.optString("enforcementState")));
                            }
                            zzg.zza(zzahv);
                        }
                        zzaj = zzg.zza();
                        this.zzc = zzaj;
                    }
                }
                zzaj = zzaj.zza(new ArrayList());
                this.zzc = zzaj;
            }
            return this;
        } catch (JSONException e6) {
            e = e6;
            throw zzajc.zza(e, zza, str);
        } catch (NullPointerException e7) {
            e = e7;
            throw zzajc.zza(e, zza, str);
        }
    }

    public final String zzb(String str) {
        I.d(str);
        zzaj<zzahv> zzaj = this.zzc;
        if (zzaj != null && !zzaj.isEmpty()) {
            zzaj<zzahv> zzaj2 = this.zzc;
            int size = zzaj2.size();
            int i2 = 0;
            while (i2 < size) {
                zzahv zzahv = zzaj2.get(i2);
                i2++;
                zzahv zzahv2 = zzahv;
                String zza2 = zzahv2.zza();
                String zzb2 = zzahv2.zzb();
                if (zza2 != null && zzb2 != null && zzb2.equals(str)) {
                    return zzahv2.zza();
                }
            }
        }
        return null;
    }

    public final boolean zzc(String str) {
        String zzb2 = zzb(str);
        if (zzb2 == null) {
            return false;
        }
        if (zzb2.equals("ENFORCE") || zzb2.equals("AUDIT")) {
            return true;
        }
        return false;
    }

    public final String zza() {
        return this.zzb;
    }
}
