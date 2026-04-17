package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.I;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaid  reason: invalid package */
public final class zzaid implements zzaes {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private zzaio zzg = new zzaio();
    private boolean zzh = true;
    private zzaio zzi = new zzaio();
    private String zzj;

    public final zzaid zza(String str) {
        I.d(str);
        this.zzi.zzb().add(str);
        return this;
    }

    public final zzaid zzb(String str) {
        if (str == null) {
            this.zzg.zzb().add("DISPLAY_NAME");
        } else {
            this.zzb = str;
        }
        return this;
    }

    public final zzaid zzc(String str) {
        if (str == null) {
            this.zzg.zzb().add("EMAIL");
        } else {
            this.zzc = str;
        }
        return this;
    }

    public final zzaid zzd(String str) {
        I.d(str);
        this.zza = str;
        return this;
    }

    public final zzaid zze(String str) {
        I.d(str);
        this.zze = str;
        return this;
    }

    public final zzaid zzf(String str) {
        if (str == null) {
            this.zzg.zzb().add("PASSWORD");
        } else {
            this.zzd = str;
        }
        return this;
    }

    public final zzaid zzg(String str) {
        if (str == null) {
            this.zzg.zzb().add("PHOTO_URL");
        } else {
            this.zzf = str;
        }
        return this;
    }

    public final zzaid zzh(String str) {
        this.zzj = str;
        return this;
    }

    public final boolean zzi(String str) {
        I.d(str);
        return this.zzg.zzb().contains(str);
    }

    public final String zzd() {
        return this.zzd;
    }

    public final String zze() {
        return this.zzf;
    }

    public final String zza() {
        int i2;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("returnSecureToken", this.zzh);
        if (!this.zzi.zzb().isEmpty()) {
            List<String> zzb2 = this.zzi.zzb();
            JSONArray jSONArray = new JSONArray();
            for (int i5 = 0; i5 < zzb2.size(); i5++) {
                jSONArray.put(zzb2.get(i5));
            }
            jSONObject.put("deleteProvider", jSONArray);
        }
        List<String> zzb3 = this.zzg.zzb();
        int size = zzb3.size();
        int[] iArr = new int[size];
        for (int i6 = 0; i6 < zzb3.size(); i6++) {
            String str = zzb3.get(i6);
            str.getClass();
            char c3 = 65535;
            switch (str.hashCode()) {
                case -333046776:
                    if (str.equals("DISPLAY_NAME")) {
                        c3 = 0;
                        break;
                    }
                    break;
                case 66081660:
                    if (str.equals("EMAIL")) {
                        c3 = 1;
                        break;
                    }
                    break;
                case 1939891618:
                    if (str.equals("PHOTO_URL")) {
                        c3 = 2;
                        break;
                    }
                    break;
                case 1999612571:
                    if (str.equals("PASSWORD")) {
                        c3 = 3;
                        break;
                    }
                    break;
            }
            switch (c3) {
                case 0:
                    i2 = 2;
                    break;
                case 1:
                    i2 = 1;
                    break;
                case 2:
                    i2 = 4;
                    break;
                case 3:
                    i2 = 5;
                    break;
                default:
                    i2 = 0;
                    break;
            }
            iArr[i6] = i2;
        }
        if (size > 0) {
            JSONArray jSONArray2 = new JSONArray();
            for (int i7 = 0; i7 < size; i7++) {
                jSONArray2.put(iArr[i7]);
            }
            jSONObject.put("deleteAttribute", jSONArray2);
        }
        String str2 = this.zza;
        if (str2 != null) {
            jSONObject.put("idToken", str2);
        }
        String str3 = this.zzc;
        if (str3 != null) {
            jSONObject.put("email", str3);
        }
        String str4 = this.zzd;
        if (str4 != null) {
            jSONObject.put("password", str4);
        }
        String str5 = this.zzb;
        if (str5 != null) {
            jSONObject.put("displayName", str5);
        }
        String str6 = this.zzf;
        if (str6 != null) {
            jSONObject.put("photoUrl", str6);
        }
        String str7 = this.zze;
        if (str7 != null) {
            jSONObject.put("oobCode", str7);
        }
        String str8 = this.zzj;
        if (str8 != null) {
            jSONObject.put("tenantId", str8);
        }
        return jSONObject.toString();
    }

    public final String zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzc;
    }
}
