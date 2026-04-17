package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.I;
import e3.C0493a;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzahe  reason: invalid package */
public final class zzahe implements zzaes {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private C0493a zze;
    private String zzf;
    private String zzg;

    public zzahe(int i2) {
        this.zza = zza(i2);
    }

    public static zzahe zza(C0493a aVar, String str, String str2) {
        I.d(str);
        I.d(str2);
        I.g(aVar);
        return new zzahe(7, aVar, (String) null, str2, str, (String) null, (String) null);
    }

    public final C0493a zzb() {
        return this.zze;
    }

    public final zzahe zzc(String str) {
        this.zzf = str;
        return this;
    }

    public final zzahe zzd(String str) {
        I.d(str);
        this.zzd = str;
        return this;
    }

    public final zzahe zzb(String str) {
        I.d(str);
        this.zzb = str;
        return this;
    }

    public final String zzc() {
        return this.zzb;
    }

    public final String zzd() {
        return this.zzd;
    }

    private zzahe(int i2, C0493a aVar, String str, String str2, String str3, String str4, String str5) {
        this.zza = zza(7);
        I.g(aVar);
        this.zze = aVar;
        this.zzb = null;
        this.zzc = str2;
        this.zzd = str3;
        this.zzf = null;
        this.zzg = null;
    }

    public final zzahe zza(C0493a aVar) {
        I.g(aVar);
        this.zze = aVar;
        return this;
    }

    public final zzahe zza(String str) {
        this.zzg = str;
        return this;
    }

    private static String zza(int i2) {
        if (i2 == 1) {
            return "PASSWORD_RESET";
        }
        if (i2 == 4) {
            return "VERIFY_EMAIL";
        }
        if (i2 == 6) {
            return "EMAIL_SIGNIN";
        }
        if (i2 != 7) {
            return "REQUEST_TYPE_UNSET_ENUM_VALUE";
        }
        return "VERIFY_AND_CHANGE_EMAIL";
    }

    public final String zza() {
        int i2 = 1;
        JSONObject jSONObject = new JSONObject();
        String str = this.zza;
        str.getClass();
        char c3 = 65535;
        switch (str.hashCode()) {
            case -1452371317:
                if (str.equals("PASSWORD_RESET")) {
                    c3 = 0;
                    break;
                }
                break;
            case -1341836234:
                if (str.equals("VERIFY_EMAIL")) {
                    c3 = 1;
                    break;
                }
                break;
            case -1099157829:
                if (str.equals("VERIFY_AND_CHANGE_EMAIL")) {
                    c3 = 2;
                    break;
                }
                break;
            case 870738373:
                if (str.equals("EMAIL_SIGNIN")) {
                    c3 = 3;
                    break;
                }
                break;
        }
        switch (c3) {
            case 0:
                break;
            case 1:
                i2 = 4;
                break;
            case 2:
                i2 = 7;
                break;
            case 3:
                i2 = 6;
                break;
            default:
                i2 = 0;
                break;
        }
        jSONObject.put("requestType", i2);
        String str2 = this.zzb;
        if (str2 != null) {
            jSONObject.put("email", str2);
        }
        String str3 = this.zzc;
        if (str3 != null) {
            jSONObject.put("newEmail", str3);
        }
        String str4 = this.zzd;
        if (str4 != null) {
            jSONObject.put("idToken", str4);
        }
        C0493a aVar = this.zze;
        if (aVar != null) {
            jSONObject.put("androidInstallApp", aVar.f7630e);
            jSONObject.put("canHandleCodeInApp", this.zze.f7632p);
            String str5 = this.zze.f7627a;
            if (str5 != null) {
                jSONObject.put("continueUrl", str5);
            }
            String str6 = this.zze.f7628b;
            if (str6 != null) {
                jSONObject.put("iosBundleId", str6);
            }
            String str7 = this.zze.f7629c;
            if (str7 != null) {
                jSONObject.put("iosAppStoreId", str7);
            }
            String str8 = this.zze.d;
            if (str8 != null) {
                jSONObject.put("androidPackageName", str8);
            }
            String str9 = this.zze.f7631f;
            if (str9 != null) {
                jSONObject.put("androidMinimumVersion", str9);
            }
            String str10 = this.zze.f7635s;
            if (str10 != null) {
                jSONObject.put("dynamicLinkDomain", str10);
            }
            String str11 = this.zze.f7636t;
            if (str11 != null) {
                jSONObject.put("linkDomain", str11);
            }
        }
        String str12 = this.zzf;
        if (str12 != null) {
            jSONObject.put("tenantId", str12);
        }
        String str13 = this.zzg;
        if (str13 != null) {
            zzajc.zza(jSONObject, "captchaResp", str13);
        } else {
            zzajc.zza(jSONObject);
        }
        return jSONObject.toString();
    }
}
