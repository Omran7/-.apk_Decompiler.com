package com.google.android.gms.internal.play_billing;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.android.billingclient.api.Purchase;
import com.mtma.criminal.city.utils.N;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import w0.C1056c;
import w0.C1057d;

public final class zze {
    public static final int zza = Runtime.getRuntime().availableProcessors();

    public static int zza(Intent intent, String str) {
        if (intent != null) {
            return zzp(intent.getExtras(), "ProxyBillingActivity");
        }
        zzl("ProxyBillingActivity", "Got null intent!");
        return 0;
    }

    public static int zzb(Bundle bundle, String str) {
        if (bundle == null) {
            zzl(str, "Unexpected null bundle received!");
            return 6;
        }
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            zzk(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        } else if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        } else {
            zzl(str, "Unexpected type for bundle response code: ".concat(obj.getClass().getName()));
            return 6;
        }
    }

    public static Bundle zzc(Bundle bundle, String str, long j6) {
        bundle.putString("playBillingLibraryVersion", str);
        bundle.putLong("billingClientSessionId", j6);
        return bundle;
    }

    public static Bundle zzd(boolean z3, boolean z4, boolean z5, boolean z6, String str, long j6) {
        Bundle bundle = new Bundle();
        zzc(bundle, str, j6);
        if (z3 && z5) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        if (z4 && z6) {
            bundle.putBoolean("enablePendingPurchaseForSubscriptions", true);
        }
        return bundle;
    }

    public static Bundle zze(String str, long j6) {
        Bundle bundle = new Bundle();
        zzc(bundle, str, j6);
        return bundle;
    }

    public static C1056c zzf(Intent intent, String str) {
        if (intent == null) {
            zzl("BillingHelper", "Got null intent!");
            N a6 = C1056c.a();
            a6.f7367a = 6;
            a6.f7368b = "An internal error occurred.";
            return a6.a();
        }
        N a7 = C1056c.a();
        a7.f7367a = zzb(intent.getExtras(), str);
        a7.f7368b = zzh(intent.getExtras(), str);
        return a7.a();
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [w0.d, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v1, types: [w0.d, java.lang.Object] */
    public static C1057d zzg(Bundle bundle, String str) {
        if (bundle == null) {
            return new Object();
        }
        zzp(bundle, "BillingClient");
        bundle.getString("IN_APP_MESSAGE_PURCHASE_TOKEN");
        return new Object();
    }

    public static String zzh(Bundle bundle, String str) {
        if (bundle == null) {
            zzl(str, "Unexpected null bundle received!");
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            zzk(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        } else if (obj instanceof String) {
            return (String) obj;
        } else {
            zzl(str, "Unexpected type for debug message: ".concat(obj.getClass().getName()));
            return "";
        }
    }

    public static String zzi(int i2) {
        return zzd.zza(i2).toString();
    }

    public static List zzj(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList arrayList = new ArrayList();
        if (stringArrayList == null || stringArrayList2 == null) {
            Purchase zzq = zzq(bundle.getString("INAPP_PURCHASE_DATA"), bundle.getString("INAPP_DATA_SIGNATURE"));
            if (zzq == null) {
                zzk("BillingHelper", "Couldn't find single purchase data as well.");
                return null;
            }
            arrayList.add(zzq);
        } else {
            int size = stringArrayList.size();
            zzk("BillingHelper", "Found purchase list of " + size + " items");
            int i2 = 0;
            while (i2 < stringArrayList.size() && i2 < stringArrayList2.size()) {
                Purchase zzq2 = zzq(stringArrayList.get(i2), stringArrayList2.get(i2));
                if (zzq2 != null) {
                    arrayList.add(zzq2);
                }
                i2++;
            }
        }
        return arrayList;
    }

    public static void zzk(String str, String str2) {
        if (!Log.isLoggable(str, 2)) {
            return;
        }
        if (!str2.isEmpty()) {
            int i2 = 40000;
            while (!str2.isEmpty() && i2 > 0) {
                int min = Math.min(str2.length(), Math.min(4000, i2));
                Log.v(str, str2.substring(0, min));
                str2 = str2.substring(min);
                i2 -= min;
            }
            return;
        }
        Log.v(str, str2);
    }

    public static void zzl(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }

    public static void zzm(String str, String str2, Throwable th) {
        try {
            if (Log.isLoggable(str, 5)) {
                if (th == null) {
                    Log.w(str, str2);
                } else {
                    Log.w(str, str2, th);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static Bundle zzn(C1056c cVar, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("RESPONSE_CODE", cVar.f12358a);
        bundle.putString("DEBUG_MESSAGE", cVar.f12359b);
        bundle.putInt("LOG_REASON", i2 - 1);
        return bundle;
    }

    public static Bundle zzo(C1056c cVar, int i2, String str) {
        Bundle zzn = zzn(cVar, 5);
        if (str != null) {
            zzn.putString("ADDITIONAL_LOG_DETAILS", str);
        }
        return zzn;
    }

    private static int zzp(Bundle bundle, String str) {
        if (bundle != null) {
            return bundle.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
        }
        zzl(str, "Unexpected null bundle received!");
        return 0;
    }

    private static Purchase zzq(String str, String str2) {
        if (str == null || str2 == null) {
            zzk("BillingHelper", "Received a null purchase data.");
            return null;
        }
        try {
            return new Purchase(str, str2);
        } catch (JSONException e6) {
            zzl("BillingHelper", "Got JSONException while parsing purchase data: ".concat(e6.toString()));
            return null;
        }
    }
}
