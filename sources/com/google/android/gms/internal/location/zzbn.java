package com.google.android.gms.internal.location;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class zzbn {
    public static String zza(@NullableDecl String str, @NullableDecl Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String str2;
        String str3;
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
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    StringBuilder sb = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
                    sb.append(name);
                    sb.append('@');
                    sb.append(hexString);
                    String sb2 = sb.toString();
                    Logger logger = Logger.getLogger("com.google.common.base.Strings");
                    Level level = Level.WARNING;
                    String valueOf = String.valueOf(sb2);
                    if (valueOf.length() != 0) {
                        str3 = "Exception during lenientFormat for ".concat(valueOf);
                    } else {
                        str3 = new String("Exception during lenientFormat for ");
                    }
                    logger.logp(level, "com.google.common.base.Strings", "lenientToString", str3, e6);
                    String name2 = e6.getClass().getName();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 9 + name2.length());
                    sb3.append("<");
                    sb3.append(sb2);
                    sb3.append(" threw ");
                    sb3.append(name2);
                    sb3.append(">");
                    str2 = sb3.toString();
                }
            }
            objArr[i5] = str2;
            i5++;
        }
        StringBuilder sb4 = new StringBuilder((length * 16) + str.length());
        int i6 = 0;
        while (true) {
            length2 = objArr.length;
            if (i2 >= length2 || (indexOf = str.indexOf("%s", i6)) == -1) {
                sb4.append(str, i6, str.length());
            } else {
                sb4.append(str, i6, indexOf);
                sb4.append(objArr[i2]);
                i6 = indexOf + 2;
                i2++;
            }
        }
        sb4.append(str, i6, str.length());
        if (i2 < length2) {
            sb4.append(" [");
            sb4.append(objArr[i2]);
            for (int i7 = i2 + 1; i7 < objArr.length; i7++) {
                sb4.append(", ");
                sb4.append(objArr[i7]);
            }
            sb4.append(']');
        }
        return sb4.toString();
    }
}
