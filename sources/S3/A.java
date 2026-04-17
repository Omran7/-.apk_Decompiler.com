package S3;

import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public final class A {
    public static final long d = TimeUnit.DAYS.toMillis(7);

    /* renamed from: a  reason: collision with root package name */
    public final String f2603a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2604b;

    /* renamed from: c  reason: collision with root package name */
    public final long f2605c;

    public A(long j6, String str, String str2) {
        this.f2603a = str;
        this.f2604b = str2;
        this.f2605c = j6;
    }

    public static String a(long j6, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j6);
            return jSONObject.toString();
        } catch (JSONException e6) {
            Log.w("FirebaseMessaging", "Failed to encode token: " + e6);
            return null;
        }
    }

    public static A b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new A(0, str, (String) null);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new A(jSONObject.getLong("timestamp"), jSONObject.getString("token"), jSONObject.getString("appVersion"));
        } catch (JSONException e6) {
            Log.w("FirebaseMessaging", "Failed to parse token: " + e6);
            return null;
        }
    }
}
