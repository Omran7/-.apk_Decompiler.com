package T1;

import A2.i;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public final class F1 {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f2830a;

    public F1(Map map) {
        HashMap hashMap = new HashMap();
        this.f2830a = hashMap;
        hashMap.putAll(map);
    }

    public final Bundle a() {
        String str;
        String str2;
        G g = H.f2917j1;
        boolean booleanValue = ((Boolean) g.a((Object) null)).booleanValue();
        HashMap hashMap = this.f2830a;
        if (!booleanValue ? !(!"1".equals(hashMap.get("GoogleConsent")) || !"1".equals(hashMap.get("gdprApplies")) || !"1".equals(hashMap.get("EnableAdvertiserConsentMode"))) : !(!"1".equals(hashMap.get("gdprApplies")) || !"1".equals(hashMap.get("EnableAdvertiserConsentMode")))) {
            if (!((Boolean) g.a((Object) null)).booleanValue()) {
                return e();
            }
            if (hashMap.get("Version") == null) {
                return e();
            }
            if (d() >= 0) {
                Bundle bundle = new Bundle();
                String str3 = "granted";
                if (true != Objects.equals(hashMap.get("AuthorizePurpose1"), "1")) {
                    str = "denied";
                } else {
                    str = str3;
                }
                bundle.putString("ad_storage", str);
                if (!Objects.equals(hashMap.get("AuthorizePurpose3"), "1") || !Objects.equals(hashMap.get("AuthorizePurpose4"), "1")) {
                    str2 = "denied";
                } else {
                    str2 = str3;
                }
                bundle.putString("ad_personalization", str2);
                if (d() >= 4) {
                    if (!Objects.equals(hashMap.get("AuthorizePurpose1"), "1") || !Objects.equals(hashMap.get("AuthorizePurpose7"), "1")) {
                        str3 = "denied";
                    }
                    bundle.putString("ad_user_data", str3);
                }
                return bundle;
            }
        }
        return Bundle.EMPTY;
    }

    public final String b() {
        int i2;
        HashMap hashMap = this.f2830a;
        StringBuilder sb = new StringBuilder("1");
        int i5 = -1;
        try {
            String str = (String) hashMap.get("CmpSdkID");
            if (!TextUtils.isEmpty(str)) {
                i5 = Integer.parseInt(str);
            }
        } catch (NumberFormatException unused) {
        }
        if (i5 < 0 || i5 > 4095) {
            sb.append("00");
        } else {
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i5 >> 6));
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i5 & 63));
        }
        int d = d();
        if (d < 0 || d > 63) {
            sb.append("0");
        } else {
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(d));
        }
        if (true != "1".equals(hashMap.get("gdprApplies"))) {
            i2 = 0;
        } else {
            i2 = 2;
        }
        int i6 = i2 | 4;
        if ("1".equals(hashMap.get("EnableAdvertiserConsentMode"))) {
            i6 = i2 | 12;
        }
        sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i6));
        return sb.toString();
    }

    public final String c() {
        StringBuilder sb = new StringBuilder();
        i iVar = H1.f2960a;
        int i2 = iVar.d;
        for (int i5 = 0; i5 < i2; i5++) {
            String str = (String) iVar.get(i5);
            HashMap hashMap = this.f2830a;
            if (hashMap.containsKey(str)) {
                if (sb.length() > 0) {
                    sb.append(";");
                }
                sb.append(str);
                sb.append("=");
                sb.append((String) hashMap.get(str));
            }
        }
        return sb.toString();
    }

    public final int d() {
        try {
            String str = (String) this.f2830a.get("PolicyVersion");
            if (!TextUtils.isEmpty(str)) {
                return Integer.parseInt(str);
            }
            return -1;
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public final Bundle e() {
        int d;
        String str;
        String str2;
        HashMap hashMap = this.f2830a;
        if ("1".equals(hashMap.get("GoogleConsent")) && (d = d()) >= 0) {
            String str3 = (String) hashMap.get("PurposeConsents");
            if (!TextUtils.isEmpty(str3)) {
                Bundle bundle = new Bundle();
                String str4 = "denied";
                if (str3.length() > 0) {
                    if (str3.charAt(0) == '1') {
                        str2 = "granted";
                    } else {
                        str2 = str4;
                    }
                    bundle.putString("ad_storage", str2);
                }
                if (str3.length() > 3) {
                    if (str3.charAt(2) == '1' && str3.charAt(3) == '1') {
                        str = "granted";
                    } else {
                        str = str4;
                    }
                    bundle.putString("ad_personalization", str);
                }
                if (str3.length() > 6 && d >= 4) {
                    if (str3.charAt(0) == '1' && str3.charAt(6) == '1') {
                        str4 = "granted";
                    }
                    bundle.putString("ad_user_data", str4);
                }
                return bundle;
            }
        }
        return Bundle.EMPTY;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof F1)) {
            return false;
        }
        return c().equalsIgnoreCase(((F1) obj).c());
    }

    public final int hashCode() {
        return c().hashCode();
    }

    public final String toString() {
        return c();
    }
}
