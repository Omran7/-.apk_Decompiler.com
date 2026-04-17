package i3;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: i3.d  reason: case insensitive filesystem */
public final class C0588d {

    /* renamed from: c  reason: collision with root package name */
    public static final HashMap f8280c;
    public static final HashMap d;

    /* renamed from: a  reason: collision with root package name */
    public final int f8281a;

    /* renamed from: b  reason: collision with root package name */
    public final String f8282b;

    static {
        HashMap hashMap = new HashMap();
        f8280c = hashMap;
        hashMap.put(-1, "The transaction needs to be run again with current data");
        hashMap.put(-2, "The server indicated that this operation failed");
        hashMap.put(-3, "This client does not have permission to perform this operation");
        hashMap.put(-4, "The operation had to be aborted due to a network disconnect");
        hashMap.put(-6, "The supplied auth token has expired");
        hashMap.put(-7, "The supplied auth token was invalid");
        hashMap.put(-8, "The transaction had too many retries");
        hashMap.put(-9, "The transaction was overridden by a subsequent set");
        hashMap.put(-10, "The service is unavailable");
        hashMap.put(-11, "User code called from the Firebase Database runloop threw an exception:\n");
        hashMap.put(-24, "The operation could not be performed due to a network error");
        hashMap.put(-25, "The write was canceled by the user.");
        hashMap.put(-999, "An unknown error occurred");
        HashMap hashMap2 = new HashMap();
        d = hashMap2;
        hashMap2.put("datastale", -1);
        hashMap2.put("failure", -2);
        hashMap2.put("permission_denied", -3);
        hashMap2.put("disconnected", -4);
        hashMap2.put("expired_token", -6);
        hashMap2.put("invalid_token", -7);
        hashMap2.put("maxretries", -8);
        hashMap2.put("overriddenbyset", -9);
        hashMap2.put("unavailable", -10);
        hashMap2.put("network_error", -24);
        hashMap2.put("write_canceled", -25);
    }

    public C0588d(int i2, String str) {
        this.f8281a = i2;
        this.f8282b = str;
    }

    public static C0588d a(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return new C0588d(-11, ((String) f8280c.get(-11)) + stringWriter.toString());
    }

    public static C0588d b(String str, String str2) {
        Integer num = (Integer) d.get(str.toLowerCase(Locale.US));
        if (num == null) {
            num = -999;
        }
        if (str2 == null) {
            str2 = (String) f8280c.get(num);
        }
        return new C0588d(num.intValue(), str2);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [i3.e, java.lang.RuntimeException] */
    public final C0589e c() {
        return new RuntimeException("Firebase Database error: " + this.f8282b);
    }

    public final String toString() {
        return "DatabaseError: " + this.f8282b;
    }
}
