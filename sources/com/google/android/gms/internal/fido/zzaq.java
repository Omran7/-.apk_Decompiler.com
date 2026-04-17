package com.google.android.gms.internal.fido;

import h0.C0552a;
import java.util.logging.Level;
import java.util.logging.Logger;
import o3.d;

public final class zzaq {
    public static String zza(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String str2;
        int i2 = 0;
        int i5 = 0;
        while (true) {
            length = objArr.length;
            if (i5 >= length) {
                break;
            }
            Object obj = objArr[i5];
            if (obj == null) {
                str2 = "null";
            } else {
                try {
                    str2 = obj.toString();
                } catch (Exception e6) {
                    String g = d.g(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(g), e6);
                    str2 = C0552a.q("<", g, " threw ", e6.getClass().getName(), ">");
                }
            }
            objArr[i5] = str2;
            i5++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i6 = 0;
        while (true) {
            length2 = objArr.length;
            if (i2 >= length2 || (indexOf = str.indexOf("%s", i6)) == -1) {
                sb.append(str, i6, str.length());
            } else {
                sb.append(str, i6, indexOf);
                sb.append(objArr[i2]);
                i6 = indexOf + 2;
                i2++;
            }
        }
        sb.append(str, i6, str.length());
        if (i2 < length2) {
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
}
