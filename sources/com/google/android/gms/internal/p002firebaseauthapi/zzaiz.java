package com.google.android.gms.internal.p002firebaseauthapi;

import G1.f;
import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaiz  reason: invalid package */
public class zzaiz implements zzaer<zzaiz> {
    private static final String zza = "zzaiz";
    private String zzb;
    private String zzc;
    private long zzd;
    private List<zzahq> zze;
    private String zzf;

    /* access modifiers changed from: private */
    /* renamed from: zzb */
    public final zzaiz zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            f.a(jSONObject.optString("localId", (String) null));
            f.a(jSONObject.optString("email", (String) null));
            f.a(jSONObject.optString("displayName", (String) null));
            this.zzb = f.a(jSONObject.optString("idToken", (String) null));
            f.a(jSONObject.optString("photoUrl", (String) null));
            this.zzc = f.a(jSONObject.optString("refreshToken", (String) null));
            this.zzd = jSONObject.optLong("expiresIn", 0);
            this.zze = zzahq.zza(jSONObject.optJSONArray("mfaInfo"));
            this.zzf = jSONObject.optString("mfaPendingCredential", (String) null);
            return this;
        } catch (NullPointerException | JSONException e6) {
            throw zzajc.zza(e6, zza, str);
        }
    }

    public final long zza() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zzf;
    }

    public final String zzd() {
        return this.zzc;
    }

    public final List<zzahq> zze() {
        return this.zze;
    }

    public final boolean zzf() {
        if (!TextUtils.isEmpty(this.zzf)) {
            return true;
        }
        return false;
    }

    public final String zzb() {
        return this.zzb;
    }
}
