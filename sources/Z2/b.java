package Z2;

import android.util.Log;
import com.bumptech.glide.d;
import com.google.android.gms.common.internal.I;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f4480a;

    /* renamed from: b  reason: collision with root package name */
    public final long f4481b;

    /* renamed from: c  reason: collision with root package name */
    public final long f4482c;

    public b(String str, long j6, long j7) {
        I.d(str);
        this.f4480a = str;
        this.f4482c = j6;
        this.f4481b = j7;
    }

    public static b a(a aVar) {
        long d;
        I.g(aVar);
        try {
            d = (long) (Double.parseDouble(aVar.f4479b.replace("s", "")) * 1000.0d);
        } catch (NumberFormatException unused) {
            Map T02 = d.T0(aVar.f4478a);
            d = 1000 * (d(T02, "exp") - d(T02, "iat"));
        }
        return new b(aVar.f4478a, d, System.currentTimeMillis());
    }

    public static b b(String str) {
        I.g(str);
        Map T02 = d.T0(str);
        long d = d(T02, "iat");
        return new b(str, (d(T02, "exp") - d) * 1000, d * 1000);
    }

    public static b c(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new b(jSONObject.getString("token"), jSONObject.getLong("expiresIn"), jSONObject.getLong("receivedAt"));
        } catch (JSONException e6) {
            Log.e("Z2.b", "Could not deserialize token: " + e6.getMessage());
            return null;
        }
    }

    public static long d(Map map, String str) {
        I.g(map);
        I.d(str);
        Integer num = (Integer) map.get(str);
        if (num == null) {
            return 0;
        }
        return num.longValue();
    }
}
