package F5;

import C5.d;
import h0.C0552a;
import kotlin.jvm.internal.j;

public abstract class i extends h {
    public static final int S0(int i2, String str, String str2, boolean z3) {
        boolean z4;
        j.e(str, "<this>");
        j.e(str2, "string");
        if (!z3) {
            return str.indexOf(str2, i2);
        }
        int length = str.length();
        if (i2 < 0) {
            i2 = 0;
        }
        int length2 = str.length();
        if (length > length2) {
            length = length2;
        }
        d dVar = new d(i2, length, 1);
        int i5 = dVar.f482c;
        int i6 = dVar.f481b;
        if ((i5 > 0 && i2 <= i6) || (i5 < 0 && i6 <= i2)) {
            while (true) {
                int length3 = str2.length();
                if (!z3) {
                    z4 = str2.regionMatches(0, str, i2, length3);
                } else {
                    z4 = str2.regionMatches(z3, 0, str, i2, length3);
                }
                if (!z4) {
                    if (i2 == i6) {
                        break;
                    }
                    i2 += i5;
                } else {
                    return i2;
                }
            }
        }
        return -1;
    }

    public static /* synthetic */ int T0(int i2, String str, String str2, boolean z3) {
        if ((i2 & 4) != 0) {
            z3 = false;
        }
        return S0(0, str, str2, z3);
    }

    public static String U0(int i2, String str) {
        CharSequence charSequence;
        j.e(str, "<this>");
        if (i2 >= 0) {
            if (i2 <= str.length()) {
                charSequence = str.subSequence(0, str.length());
            } else {
                StringBuilder sb = new StringBuilder(i2);
                sb.append(str);
                int length = i2 - str.length();
                int i5 = 1;
                if (1 <= length) {
                    while (true) {
                        sb.append(' ');
                        if (i5 == length) {
                            break;
                        }
                        i5++;
                    }
                }
                charSequence = sb;
            }
            return charSequence.toString();
        }
        throw new IllegalArgumentException(C0552a.k(i2, "Desired length ", " is less than zero."));
    }

    public static String V0(String str, String str2, String str3) {
        j.e(str, "<this>");
        j.e(str3, "newValue");
        int S02 = S0(0, str, str2, false);
        if (S02 < 0) {
            return str;
        }
        int length = str2.length();
        int i2 = 1;
        if (length >= 1) {
            i2 = length;
        }
        int length2 = str3.length() + (str.length() - length);
        if (length2 >= 0) {
            StringBuilder sb = new StringBuilder(length2);
            int i5 = 0;
            do {
                sb.append(str, i5, S02);
                sb.append(str3);
                i5 = S02 + length;
                if (S02 >= str.length() || (S02 = S0(S02 + i2, str, str2, false)) <= 0) {
                    sb.append(str, i5, str.length());
                    String sb2 = sb.toString();
                    j.d(sb2, "toString(...)");
                }
                sb.append(str, i5, S02);
                sb.append(str3);
                i5 = S02 + length;
                break;
            } while ((S02 = S0(S02 + i2, str, str2, false)) <= 0);
            sb.append(str, i5, str.length());
            String sb22 = sb.toString();
            j.d(sb22, "toString(...)");
            return sb22;
        }
        throw new OutOfMemoryError();
    }

    public static boolean W0(String str, String str2) {
        j.e(str, "<this>");
        j.e(str2, "prefix");
        return str.startsWith(str2);
    }

    public static String X0(String str, String str2, String str3) {
        j.e(str2, "delimiter");
        j.e(str3, "missingDelimiterValue");
        int T02 = T0(6, str, str2, false);
        if (T02 == -1) {
            return str3;
        }
        String substring = str.substring(str2.length() + T02, str.length());
        j.d(substring, "substring(...)");
        return substring;
    }

    public static String Y0(String str) {
        j.e(str, "<this>");
        j.e(str, "missingDelimiterValue");
        j.e(str, "<this>");
        int lastIndexOf = str.lastIndexOf(46, str.length() - 1);
        if (lastIndexOf == -1) {
            return str;
        }
        String substring = str.substring(lastIndexOf + 1, str.length());
        j.d(substring, "substring(...)");
        return substring;
    }
}
