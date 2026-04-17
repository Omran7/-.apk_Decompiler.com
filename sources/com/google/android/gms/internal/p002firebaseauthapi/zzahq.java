package com.google.android.gms.internal.p002firebaseauthapi;

import G1.f;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.I;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzahq  reason: invalid package */
public final class zzahq {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final long zzd;
    private final zzair zze;

    private zzahq(String str, String str2, String str3, long j6, zzair zzair) {
        if (TextUtils.isEmpty(str) || zzair == null) {
            this.zza = str;
            I.d(str2);
            this.zzb = str2;
            this.zzc = str3;
            this.zzd = j6;
            this.zze = zzair;
            return;
        }
        Log.e("MfaInfo", "Cannot have both MFA phone_info and totp_info");
        throw new IllegalArgumentException("Cannot have both MFA phone_info and totp_info");
    }

    private static long zza(String str) {
        try {
            return zzaoe.zza(zzaoe.zza(str));
        } catch (ParseException e6) {
            Log.w("MfaInfo", "Could not parse timestamp as ISOString. Invalid ISOString \"" + str + "\"", e6);
            return 0;
        }
    }

    public final zzair zzb() {
        return this.zze;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final String zze() {
        return this.zza;
    }

    public final long zza() {
        return this.zzd;
    }

    public static zzahq zza(JSONObject jSONObject) {
        zzahq zzahq = new zzahq(f.a(jSONObject.optString("phoneInfo")), f.a(jSONObject.optString("mfaEnrollmentId")), f.a(jSONObject.optString("displayName")), zza(jSONObject.optString("enrolledAt", "")), jSONObject.opt("totpInfo") != null ? new zzair() : null);
        jSONObject.optString("unobfuscatedPhoneInfo");
        return zzahq;
    }

    public static List<zzahq> zza(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            arrayList.add(zza(jSONArray.getJSONObject(i2)));
        }
        return arrayList;
    }
}
