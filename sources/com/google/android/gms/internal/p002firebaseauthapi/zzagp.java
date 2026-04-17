package com.google.android.gms.internal.p002firebaseauthapi;

import android.util.Log;
import com.google.android.gms.common.internal.I;
import e3.C0494b;
import e3.C0496d;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzagp  reason: invalid package */
public class zzagp implements zzaes {
    private static final String zza = "zzagp";
    private final String zzb;
    private final String zzc;
    private final C0496d zzd;
    private final String zze;
    private final String zzf;

    static {
        if (r2 != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (String str : new String[0]) {
                if (sb.length() > 1) {
                    sb.append(",");
                }
                sb.append(str);
            }
            sb.append("] ");
        }
        int i2 = 2;
        while (i2 <= 7 && !Log.isLoggable(zza, i2)) {
            i2++;
        }
    }

    public zzagp(C0496d dVar, String str, String str2) {
        I.g(dVar);
        this.zzd = dVar;
        String str3 = dVar.f7640a;
        I.d(str3);
        this.zzb = str3;
        String str4 = dVar.f7642c;
        I.d(str4);
        this.zzc = str4;
        this.zze = str;
        this.zzf = str2;
    }

    public final String zza() {
        C0494b bVar;
        String str;
        String str2 = this.zzc;
        int i2 = C0494b.f7637c;
        I.d(str2);
        String str3 = null;
        try {
            bVar = new C0494b(str2);
        } catch (IllegalArgumentException unused) {
            bVar = null;
        }
        if (bVar != null) {
            str = bVar.f7638a;
        } else {
            str = null;
        }
        if (bVar != null) {
            str3 = bVar.f7639b;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("email", this.zzb);
        if (str != null) {
            jSONObject.put("oobCode", str);
        }
        if (str3 != null) {
            jSONObject.put("tenantId", str3);
        }
        String str4 = this.zze;
        if (str4 != null) {
            jSONObject.put("idToken", str4);
        }
        String str5 = this.zzf;
        if (str5 != null) {
            zzajc.zza(jSONObject, "captchaResp", str5);
        } else {
            zzajc.zza(jSONObject);
        }
        return jSONObject.toString();
    }

    public final C0496d zzb() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zzf;
    }
}
