package com.google.android.gms.internal.p002firebaseauthapi;

import A1.a;
import G1.f;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.I;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzahn  reason: invalid package */
public class zzahn extends a implements zzaer<zzahn> {
    public static final Parcelable.Creator<zzahn> CREATOR = new zzahm();
    private static final String zza = "zzahn";
    private String zzb;
    private String zzc;
    private Long zzd;
    private String zze;
    private Long zzf;

    public zzahn() {
        this.zzf = Long.valueOf(System.currentTimeMillis());
    }

    /* access modifiers changed from: private */
    /* renamed from: zzd */
    public final zzahn zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = f.a(jSONObject.optString("refresh_token"));
            this.zzc = f.a(jSONObject.optString("access_token"));
            this.zzd = Long.valueOf(jSONObject.optLong("expires_in", 0));
            this.zze = f.a(jSONObject.optString("token_type"));
            this.zzf = Long.valueOf(System.currentTimeMillis());
            return this;
        } catch (NullPointerException | JSONException e6) {
            throw zzajc.zza(e6, zza, str);
        }
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.R0(parcel, 2, this.zzb, false);
        android.support.v4.media.session.a.R0(parcel, 3, this.zzc, false);
        android.support.v4.media.session.a.P0(parcel, 4, Long.valueOf(zza()));
        android.support.v4.media.session.a.R0(parcel, 5, this.zze, false);
        Long l6 = this.zzf;
        l6.getClass();
        android.support.v4.media.session.a.P0(parcel, 6, l6);
        android.support.v4.media.session.a.X0(W02, parcel);
    }

    public final long zza() {
        Long l6 = this.zzd;
        if (l6 == null) {
            return 0;
        }
        return l6.longValue();
    }

    public final long zzb() {
        return this.zzf.longValue();
    }

    public final String zzc() {
        return this.zzc;
    }

    public final String zze() {
        return this.zze;
    }

    public final String zzf() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("refresh_token", this.zzb);
            jSONObject.put("access_token", this.zzc);
            jSONObject.put("expires_in", this.zzd);
            jSONObject.put("token_type", this.zze);
            jSONObject.put("issued_at", this.zzf);
            return jSONObject.toString();
        } catch (JSONException e6) {
            Log.d(zza, "Failed to convert GetTokenResponse to JSON");
            throw new zzaag(e6);
        }
    }

    public final boolean zzg() {
        if (System.currentTimeMillis() + 300000 < (this.zzd.longValue() * 1000) + this.zzf.longValue()) {
            return true;
        }
        return false;
    }

    public static zzahn zzb(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            zzahn zzahn = new zzahn();
            zzahn.zzb = jSONObject.optString("refresh_token", (String) null);
            zzahn.zzc = jSONObject.optString("access_token", (String) null);
            zzahn.zzd = Long.valueOf(jSONObject.optLong("expires_in"));
            zzahn.zze = jSONObject.optString("token_type", (String) null);
            zzahn.zzf = Long.valueOf(jSONObject.optLong("issued_at"));
            return zzahn;
        } catch (JSONException e6) {
            Log.d(zza, "Failed to read GetTokenResponse from JSONObject");
            throw new zzaag(e6);
        }
    }

    public final void zzc(String str) {
        I.d(str);
        this.zzb = str;
    }

    public zzahn(String str, String str2, Long l6, String str3, Long l7) {
        this.zzb = str;
        this.zzc = str2;
        this.zzd = l6;
        this.zze = str3;
        this.zzf = l7;
    }

    public final String zzd() {
        return this.zzb;
    }

    public zzahn(String str, String str2, Long l6, String str3) {
        this(str, str2, l6, str3, Long.valueOf(System.currentTimeMillis()));
    }
}
