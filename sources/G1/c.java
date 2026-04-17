package G1;

import D0.e;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import z1.i;
import z1.j;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f824a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b  reason: collision with root package name */
    public static final char[] f825b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: c  reason: collision with root package name */
    public static Boolean f826c;
    public static Boolean d;

    /* renamed from: e  reason: collision with root package name */
    public static Boolean f827e;

    /* renamed from: f  reason: collision with root package name */
    public static Boolean f828f;
    public static String g;
    public static int h;

    /* renamed from: i  reason: collision with root package name */
    public static Boolean f829i;

    public static String a(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (int i2 = 0; i2 < length; i2++) {
            char[] cArr = f824a;
            sb.append(cArr[(bArr[i2] & 240) >>> 4]);
            sb.append(cArr[bArr[i2] & 15]);
        }
        return sb.toString();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v1 */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r2v4, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: type inference failed for: r2v8 */
    /* JADX WARNING: type inference failed for: r2v9 */
    /* JADX WARNING: type inference failed for: r2v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005e A[SYNTHETIC, Splitter:B:28:0x005e] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0065 A[SYNTHETIC, Splitter:B:36:0x0065] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String b() {
        /*
            java.lang.String r0 = "/proc/"
            java.lang.String r1 = g
            if (r1 != 0) goto L_0x006a
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L_0x0013
            java.lang.String r0 = android.app.Application.getProcessName()
            g = r0
            goto L_0x006a
        L_0x0013:
            int r1 = h
            if (r1 != 0) goto L_0x001d
            int r1 = android.os.Process.myPid()
            h = r1
        L_0x001d:
            r2 = 0
            if (r1 > 0) goto L_0x0021
            goto L_0x0068
        L_0x0021:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0062, all -> 0x0055 }
            r3.<init>(r0)     // Catch:{ IOException -> 0x0062, all -> 0x0055 }
            r3.append(r1)     // Catch:{ IOException -> 0x0062, all -> 0x0055 }
            java.lang.String r0 = "/cmdline"
            r3.append(r0)     // Catch:{ IOException -> 0x0062, all -> 0x0055 }
            java.lang.String r0 = r3.toString()     // Catch:{ IOException -> 0x0062, all -> 0x0055 }
            android.os.StrictMode$ThreadPolicy r1 = android.os.StrictMode.allowThreadDiskReads()     // Catch:{ IOException -> 0x0062, all -> 0x0055 }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ all -> 0x0057 }
            java.io.FileReader r4 = new java.io.FileReader     // Catch:{ all -> 0x0057 }
            r4.<init>(r0)     // Catch:{ all -> 0x0057 }
            r3.<init>(r4)     // Catch:{ all -> 0x0057 }
            android.os.StrictMode.setThreadPolicy(r1)     // Catch:{ IOException -> 0x0062, all -> 0x0055 }
            java.lang.String r0 = r3.readLine()     // Catch:{ IOException -> 0x0063, all -> 0x0052 }
            com.google.android.gms.common.internal.I.g(r0)     // Catch:{ IOException -> 0x0063, all -> 0x0052 }
            java.lang.String r2 = r0.trim()     // Catch:{ IOException -> 0x0063, all -> 0x0052 }
            r3.close()     // Catch:{ IOException -> 0x0068 }
            goto L_0x0068
        L_0x0052:
            r0 = move-exception
            r2 = r3
            goto L_0x005c
        L_0x0055:
            r0 = move-exception
            goto L_0x005c
        L_0x0057:
            r0 = move-exception
            android.os.StrictMode.setThreadPolicy(r1)     // Catch:{ IOException -> 0x0062, all -> 0x0055 }
            throw r0     // Catch:{ IOException -> 0x0062, all -> 0x0055 }
        L_0x005c:
            if (r2 == 0) goto L_0x0061
            r2.close()     // Catch:{ IOException -> 0x0061 }
        L_0x0061:
            throw r0
        L_0x0062:
            r3 = r2
        L_0x0063:
            if (r3 == 0) goto L_0x0068
            r3.close()     // Catch:{ IOException -> 0x0068 }
        L_0x0068:
            g = r2
        L_0x006a:
            java.lang.String r0 = g
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: G1.c.b():java.lang.String");
    }

    public static byte[] c(Context context, String str) {
        MessageDigest messageDigest;
        PackageInfo i2 = I1.c.a(context).i(64, str);
        Signature[] signatureArr = i2.signatures;
        if (signatureArr != null && signatureArr.length == 1) {
            int i5 = 0;
            while (true) {
                if (i5 >= 2) {
                    messageDigest = null;
                    break;
                }
                try {
                    messageDigest = MessageDigest.getInstance("SHA1");
                    if (messageDigest != null) {
                        break;
                    }
                    i5++;
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            if (messageDigest != null) {
                return messageDigest.digest(i2.signatures[0].toByteArray());
            }
        }
        return null;
    }

    public static boolean d() {
        if (Build.VERSION.SDK_INT >= 26) {
            return true;
        }
        return false;
    }

    public static boolean e(Context context, int i2) {
        if (g(i2, context, "com.google.android.gms")) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                j b6 = j.b(context);
                b6.getClass();
                if (packageInfo == null) {
                    return false;
                }
                if (!j.e(packageInfo, false)) {
                    if (!j.e(packageInfo, true)) {
                        return false;
                    }
                    if (!i.a((Context) b6.f12819a)) {
                        Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                        return false;
                    }
                }
                return true;
            } catch (PackageManager.NameNotFoundException unused) {
                if (Log.isLoggable("UidVerifier", 3)) {
                    Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
                }
            }
        }
        return false;
    }

    public static boolean f(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f826c == null) {
            f826c = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        f826c.booleanValue();
        if (d == null) {
            d = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        if (!d.booleanValue()) {
            return false;
        }
        if (!d() || Build.VERSION.SDK_INT >= 30) {
            return true;
        }
        return false;
    }

    public static boolean g(int i2, Context context, String str) {
        e a6 = I1.c.a(context);
        a6.getClass();
        try {
            AppOpsManager appOpsManager = (AppOpsManager) a6.f494b.getSystemService("appops");
            if (appOpsManager != null) {
                appOpsManager.checkPackage(i2, str);
                return true;
            }
            throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
        } catch (SecurityException unused) {
            return false;
        }
    }

    public static void h(StringBuilder sb, HashMap hashMap) {
        sb.append("{");
        boolean z3 = true;
        for (String str : hashMap.keySet()) {
            if (!z3) {
                sb.append(",");
            }
            String str2 = (String) hashMap.get(str);
            sb.append("\"");
            sb.append(str);
            sb.append("\":");
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append("\"");
                sb.append(str2);
                sb.append("\"");
            }
            z3 = false;
        }
        sb.append("}");
    }
}
