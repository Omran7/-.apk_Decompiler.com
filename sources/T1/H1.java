package T1;

import A2.b;
import A2.d;
import A2.i;
import A2.n;
import A2.r;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzkl;
import com.google.android.gms.internal.measurement.zzkm;

public abstract class H1 {

    /* renamed from: a  reason: collision with root package name */
    public static final i f2960a;

    static {
        b bVar = d.f24b;
        Object[] objArr = new Object[24];
        objArr[0] = "Version";
        objArr[1] = "GoogleConsent";
        objArr[2] = "VendorConsent";
        objArr[3] = "VendorLegitimateInterest";
        objArr[4] = "gdprApplies";
        objArr[5] = "EnableAdvertiserConsentMode";
        objArr[6] = "PolicyVersion";
        objArr[7] = "PurposeConsents";
        objArr[8] = "PurposeOneTreatment";
        objArr[9] = "Purpose1";
        objArr[10] = "Purpose3";
        objArr[11] = "Purpose4";
        System.arraycopy(new String[]{"Purpose7", "CmpSdkID", "PublisherCC", "PublisherRestrictions1", "PublisherRestrictions3", "PublisherRestrictions4", "PublisherRestrictions7", "AuthorizePurpose1", "AuthorizePurpose3", "AuthorizePurpose4", "AuthorizePurpose7", "PurposeDiagnostics"}, 0, objArr, 12, 12);
        R2.b.h(24, objArr);
        f2960a = d.x(24, objArr);
    }

    public static int a(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getInt(str, -1);
        } catch (ClassCastException unused) {
            return -1;
        }
    }

    public static String b(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, "");
        } catch (ClassCastException unused) {
            return "";
        }
    }

    public static final boolean c(zzkl zzkl, n nVar, n nVar2, r rVar, char[] cArr, int i2, int i5, int i6, int i7, int i8, String str, String str2, String str3, boolean z3, boolean z4) {
        int i9;
        int i10;
        char c3;
        int i11;
        G1 g1;
        zzkl zzkl2 = zzkl;
        n nVar3 = nVar;
        n nVar4 = nVar2;
        int d = d(zzkl);
        if (d > 0) {
            i10 = i6;
            if (i10 == 1) {
                i9 = i5;
                if (i9 != 1) {
                    i10 = 1;
                } else {
                    i10 = 1;
                    i9 = 1;
                }
            } else {
                i9 = i5;
            }
            cArr[d] = '2';
        } else {
            i9 = i5;
            i10 = i6;
        }
        if (e(zzkl, nVar2) == zzkm.PURPOSE_RESTRICTION_NOT_ALLOWED) {
            c3 = '3';
        } else {
            if (zzkl2 == zzkl.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
                i11 = i8;
                if (i11 == 1) {
                    if (rVar.d.equals(str)) {
                        if (d > 0 && cArr[d] != '2') {
                            cArr[d] = '1';
                        }
                        return true;
                    }
                    i11 = 1;
                }
            } else {
                i11 = i8;
            }
            if (nVar.containsKey(zzkl) && (g1 = (G1) nVar.get(zzkl)) != null) {
                int ordinal = g1.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal == 3) {
                                if (e(zzkl, nVar2) == zzkm.PURPOSE_RESTRICTION_REQUIRE_CONSENT) {
                                    return g(zzkl, cArr, i2, i9, i10, i7, i11, str2, z3, z4);
                                }
                                return h(zzkl, cArr, i2, i9, i10, i7, i11, str3, z3, z4);
                            }
                        } else if (e(zzkl, nVar2) == zzkm.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST) {
                            return h(zzkl, cArr, i2, i9, i10, i7, i11, str3, z3, z4);
                        } else {
                            return g(zzkl, cArr, i2, i9, i10, i7, i11, str2, z3, z4);
                        }
                    } else if (e(zzkl, nVar2) != zzkm.PURPOSE_RESTRICTION_REQUIRE_CONSENT) {
                        return h(zzkl, cArr, i2, i9, i10, i7, i11, str3, z3, z4);
                    }
                } else if (e(zzkl, nVar2) != zzkm.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST) {
                    return g(zzkl, cArr, i2, i9, i10, i7, i11, str2, z3, z4);
                }
                c3 = '8';
            }
            c3 = '0';
        }
        if (d <= 0 || cArr[d] == '2') {
            return false;
        }
        cArr[d] = c3;
        return false;
    }

    public static final int d(zzkl zzkl) {
        if (zzkl == zzkl.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
            return 1;
        }
        if (zzkl == zzkl.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE) {
            return 2;
        }
        if (zzkl == zzkl.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS) {
            return 3;
        }
        if (zzkl == zzkl.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE) {
            return 4;
        }
        return -1;
    }

    public static final zzkm e(zzkl zzkl, n nVar) {
        Object obj = zzkm.PURPOSE_RESTRICTION_UNDEFINED;
        Object obj2 = nVar.get(zzkl);
        if (obj2 != null) {
            obj = obj2;
        }
        return (zzkm) obj;
    }

    public static final String f(zzkl zzkl, String str, String str2) {
        String str3;
        String str4 = "0";
        if (TextUtils.isEmpty(str) || str.length() < zzkl.zza()) {
            str3 = str4;
        } else {
            str3 = String.valueOf(str.charAt(zzkl.zza() - 1));
        }
        if (!TextUtils.isEmpty(str2) && str2.length() >= zzkl.zza()) {
            str4 = String.valueOf(str2.charAt(zzkl.zza() - 1));
        }
        return String.valueOf(str3).concat(String.valueOf(str4));
    }

    public static final boolean g(zzkl zzkl, char[] cArr, int i2, int i5, int i6, int i7, int i8, String str, boolean z3, boolean z4) {
        char c3;
        int d = d(zzkl);
        boolean z5 = false;
        if (!z3) {
            c3 = '4';
        } else if (str.length() < zzkl.zza()) {
            c3 = '0';
        } else {
            char charAt = str.charAt(zzkl.zza() - 1);
            char c6 = '1';
            if (charAt == '1') {
                z5 = true;
            }
            if (d > 0 && cArr[d] != '2') {
                if (charAt != '1') {
                    c6 = '6';
                }
                cArr[d] = c6;
            }
            return z5;
        }
        if (d > 0 && cArr[d] != '2') {
            cArr[d] = c3;
        }
        return false;
    }

    public static final boolean h(zzkl zzkl, char[] cArr, int i2, int i5, int i6, int i7, int i8, String str, boolean z3, boolean z4) {
        char c3;
        int d = d(zzkl);
        boolean z5 = false;
        if (!z4) {
            c3 = '5';
        } else if (str.length() < zzkl.zza()) {
            c3 = '0';
        } else {
            char charAt = str.charAt(zzkl.zza() - 1);
            char c6 = '1';
            if (charAt == '1') {
                z5 = true;
            }
            if (d > 0 && cArr[d] != '2') {
                if (charAt != '1') {
                    c6 = '7';
                }
                cArr[d] = c6;
            }
            return z5;
        }
        if (d > 0 && cArr[d] != '2') {
            cArr[d] = c3;
        }
        return false;
    }
}
