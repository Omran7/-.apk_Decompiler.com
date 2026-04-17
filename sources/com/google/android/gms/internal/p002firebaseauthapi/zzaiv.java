package com.google.android.gms.internal.p002firebaseauthapi;

import G1.f;
import android.text.TextUtils;
import com.google.android.gms.common.internal.I;
import e3.G;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaiv  reason: invalid package */
public class zzaiv implements zzaer<zzaiv> {
    private static final String zza = "zzaiv";
    private boolean zzb;
    private String zzc;
    private String zzd;
    private long zze;
    private String zzf;
    private String zzg;
    private String zzh;
    private boolean zzi;
    private String zzj;
    private String zzk;
    private String zzl;
    private String zzm;
    private String zzn;
    private String zzo;
    private List<zzahq> zzp;
    private String zzq;

    public final long zza() {
        return this.zze;
    }

    public final G zzb() {
        if (TextUtils.isEmpty(this.zzj) && TextUtils.isEmpty(this.zzk)) {
            return null;
        }
        String str = this.zzg;
        String str2 = this.zzk;
        String str3 = this.zzj;
        String str4 = this.zzn;
        String str5 = this.zzl;
        I.e(str, "Must specify a non-empty providerId");
        if (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3)) {
            return new G(str, str2, str3, (zzait) null, str4, str5, (String) null);
        }
        throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
    }

    public final String zzc() {
        return this.zzf;
    }

    public final String zzd() {
        return this.zzm;
    }

    public final String zze() {
        return this.zzc;
    }

    public final String zzf() {
        return this.zzq;
    }

    public final String zzg() {
        return this.zzg;
    }

    public final String zzh() {
        return this.zzh;
    }

    public final String zzi() {
        return this.zzd;
    }

    public final String zzj() {
        return this.zzo;
    }

    public final List<zzahq> zzk() {
        return this.zzp;
    }

    public final boolean zzl() {
        if (!TextUtils.isEmpty(this.zzq)) {
            return true;
        }
        return false;
    }

    public final boolean zzm() {
        return this.zzb;
    }

    public final boolean zzn() {
        return this.zzi;
    }

    public final boolean zzo() {
        if (this.zzb || !TextUtils.isEmpty(this.zzm)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: zzb */
    public final zzaiv zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = jSONObject.optBoolean("needConfirmation", false);
            jSONObject.optBoolean("needEmail", false);
            this.zzc = f.a(jSONObject.optString("idToken", (String) null));
            this.zzd = f.a(jSONObject.optString("refreshToken", (String) null));
            this.zze = jSONObject.optLong("expiresIn", 0);
            f.a(jSONObject.optString("localId", (String) null));
            this.zzf = f.a(jSONObject.optString("email", (String) null));
            f.a(jSONObject.optString("displayName", (String) null));
            f.a(jSONObject.optString("photoUrl", (String) null));
            this.zzg = f.a(jSONObject.optString("providerId", (String) null));
            this.zzh = f.a(jSONObject.optString("rawUserInfo", (String) null));
            this.zzi = jSONObject.optBoolean("isNewUser", false);
            this.zzj = jSONObject.optString("oauthAccessToken", (String) null);
            this.zzk = jSONObject.optString("oauthIdToken", (String) null);
            this.zzm = f.a(jSONObject.optString("errorMessage", (String) null));
            this.zzn = f.a(jSONObject.optString("pendingToken", (String) null));
            this.zzo = f.a(jSONObject.optString("tenantId", (String) null));
            this.zzp = zzahq.zza(jSONObject.optJSONArray("mfaInfo"));
            this.zzq = f.a(jSONObject.optString("mfaPendingCredential", (String) null));
            this.zzl = f.a(jSONObject.optString("oauthTokenSecret", (String) null));
            return this;
        } catch (NullPointerException | JSONException e6) {
            throw zzajc.zza(e6, zza, str);
        }
    }
}
