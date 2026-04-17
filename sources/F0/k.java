package F0;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final Map f693a;

    static {
        String property = System.getProperty("http.agent");
        if (!TextUtils.isEmpty(property)) {
            int length = property.length();
            StringBuilder sb = new StringBuilder(property.length());
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = property.charAt(i2);
                if ((charAt > 31 || charAt == 9) && charAt < 127) {
                    sb.append(charAt);
                } else {
                    sb.append('?');
                }
            }
            property = sb.toString();
        }
        HashMap hashMap = new HashMap(2);
        if (!TextUtils.isEmpty(property)) {
            hashMap.put("User-Agent", Collections.singletonList(new l(property)));
        }
        f693a = Collections.unmodifiableMap(hashMap);
    }
}
