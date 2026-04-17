package com.google.android.gms.internal.p002firebaseauthapi;

import h0.C0552a;
import java.util.logging.Level;
import java.util.logging.Logger;
import o3.d;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzae  reason: invalid package */
public final class zzae {
    public static String zza(String str) {
        return zzr.zzb(str);
    }

    public static String zzb(String str) {
        return zzr.zzc(str);
    }

    public static boolean zzc(String str) {
        return zzr.zzd(str);
    }

    public static String zza(String str, Object... objArr) {
        int indexOf;
        String valueOf = String.valueOf(str);
        int i2 = 0;
        if (objArr == null) {
            objArr = new Object[]{"(Object[])null"};
        } else {
            for (int i5 = 0; i5 < objArr.length; i5++) {
                objArr[i5] = zza(objArr[i5]);
            }
        }
        StringBuilder sb = new StringBuilder((objArr.length * 16) + valueOf.length());
        int i6 = 0;
        while (i2 < objArr.length && (indexOf = valueOf.indexOf("%s", i6)) != -1) {
            sb.append(valueOf, i6, indexOf);
            sb.append(objArr[i2]);
            i6 = indexOf + 2;
            i2++;
        }
        sb.append(valueOf, i6, valueOf.length());
        if (i2 < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i2]);
            for (int i7 = i2 + 1; i7 < objArr.length; i7++) {
                sb.append(", ");
                sb.append(objArr[i7]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    private static String zza(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e6) {
            String g = d.g(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", d.i("Exception during lenientFormat for ", g), e6);
            return C0552a.q("<", g, " threw ", e6.getClass().getName(), ">");
        }
    }
}
