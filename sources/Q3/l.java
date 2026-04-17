package q3;

import android.net.Uri;
import android.util.Base64;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import n3.C0866g;
import o3.d;

public abstract class l {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f11100a = "0123456789abcdef".toCharArray();

    public static String a(double d) {
        StringBuilder sb = new StringBuilder(16);
        long doubleToLongBits = Double.doubleToLongBits(d);
        for (int i2 = 7; i2 >= 0; i2--) {
            int i5 = (int) ((doubleToLongBits >>> (i2 * 8)) & 255);
            char[] cArr = f11100a;
            sb.append(cArr[(i5 >> 4) & 15]);
            sb.append(cArr[i5 & 15]);
        }
        return sb.toString();
    }

    public static void b(String str, boolean z3) {
        if (!z3) {
            Log.w("FirebaseDatabase", "Assertion failed: " + str);
        }
    }

    public static void c(boolean z3) {
        b("", z3);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [n3.n, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v8, types: [java.lang.Object, q3.g] */
    public static g d(String str) {
        String str2;
        try {
            Uri parse = Uri.parse(str);
            String scheme = parse.getScheme();
            if (scheme != null) {
                String host = parse.getHost();
                if (host != null) {
                    String queryParameter = parse.getQueryParameter("ns");
                    boolean z3 = false;
                    if (queryParameter == null) {
                        queryParameter = host.split("\\.", -1)[0].toLowerCase(Locale.US);
                    }
                    ? obj = new Object();
                    obj.f10311a = host.toLowerCase(Locale.US);
                    int port = parse.getPort();
                    if (port != -1) {
                        if (scheme.equals("https") || scheme.equals("wss")) {
                            z3 = true;
                        }
                        obj.f10312b = z3;
                        obj.f10311a += ":" + port;
                    } else {
                        obj.f10312b = true;
                    }
                    obj.f10313c = queryParameter;
                    int indexOf = str.indexOf("//");
                    if (indexOf != -1) {
                        String substring = str.substring(indexOf + 2);
                        int indexOf2 = substring.indexOf("/");
                        if (indexOf2 != -1) {
                            int indexOf3 = substring.indexOf("?");
                            if (indexOf3 != -1) {
                                str2 = substring.substring(indexOf2 + 1, indexOf3);
                            } else {
                                str2 = substring.substring(indexOf2 + 1);
                            }
                        } else {
                            str2 = "";
                        }
                        String replace = str2.replace("+", " ");
                        m.c(replace);
                        ? obj2 = new Object();
                        obj2.f11093b = new C0866g(replace);
                        obj2.f11092a = obj;
                        return obj2;
                    }
                    throw new RuntimeException("Firebase Database URL is missing URL scheme");
                }
                throw new IllegalArgumentException("Database URL does not specify a valid host");
            }
            throw new IllegalArgumentException("Database URL does not specify a URL scheme");
        } catch (Exception e6) {
            throw new RuntimeException(d.i("Invalid Firebase Database url specified: ", str), e6);
        }
    }

    public static String e(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-1");
            instance.update(str.getBytes("UTF-8"));
            return Base64.encodeToString(instance.digest(), 2);
        } catch (NoSuchAlgorithmException e6) {
            throw new RuntimeException("Missing SHA-1 MessageDigest provider.", e6);
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException("UTF-8 encoding is required for Firebase Database to run!");
        }
    }

    public static String f(String str) {
        String str2;
        if (str.indexOf(92) != -1) {
            str2 = str.replace("\\", "\\\\");
        } else {
            str2 = str;
        }
        if (str.indexOf(34) != -1) {
            str2 = str2.replace("\"", "\\\"");
        }
        return "\"" + str2 + '\"';
    }

    public static Integer g(String str) {
        boolean z3;
        if (str.length() > 11 || str.length() == 0) {
            return null;
        }
        int i2 = 0;
        if (str.charAt(0) == '-') {
            z3 = true;
            if (str.length() == 1) {
                return null;
            }
            i2 = 1;
        } else {
            z3 = false;
        }
        long j6 = 0;
        while (i2 < str.length()) {
            char charAt = str.charAt(i2);
            if (charAt < '0' || charAt > '9') {
                return null;
            }
            j6 = (j6 * 10) + ((long) (charAt - '0'));
            i2++;
        }
        if (z3) {
            long j7 = -j6;
            if (j7 < -2147483648L) {
                return null;
            }
            return Integer.valueOf((int) j7);
        } else if (j6 > 2147483647L) {
            return null;
        } else {
            return Integer.valueOf((int) j6);
        }
    }
}
