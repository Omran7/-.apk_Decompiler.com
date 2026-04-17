package I3;

import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public final class i {
    public static final long d = TimeUnit.DAYS.toMillis(7);

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ int f1181e = 0;

    /* renamed from: a  reason: collision with root package name */
    public final String f1182a;

    /* renamed from: b  reason: collision with root package name */
    public final String f1183b;

    /* renamed from: c  reason: collision with root package name */
    public final long f1184c;

    public i(long j6, String str, String str2) {
        this.f1182a = str;
        this.f1183b = str2;
        this.f1184c = j6;
    }

    public static String a(long j6, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j6);
            return jSONObject.toString();
        } catch (JSONException e6) {
            String valueOf = String.valueOf(e6);
            StringBuilder sb = new StringBuilder(valueOf.length() + 24);
            sb.append("Failed to encode token: ");
            sb.append(valueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }

    public static i b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new i(0, str, (String) null);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new i(jSONObject.getLong("timestamp"), jSONObject.getString("token"), jSONObject.getString("appVersion"));
        } catch (JSONException e6) {
            String valueOf = String.valueOf(e6);
            StringBuilder sb = new StringBuilder(valueOf.length() + 23);
            sb.append("Failed to parse token: ");
            sb.append(valueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }
}
