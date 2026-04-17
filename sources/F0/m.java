package F0;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class m implements j {

    /* renamed from: b  reason: collision with root package name */
    public final Map f695b;

    /* renamed from: c  reason: collision with root package name */
    public volatile Map f696c;

    public m(Map map) {
        this.f695b = Collections.unmodifiableMap(map);
    }

    public final HashMap a() {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f695b.entrySet()) {
            List list = (List) entry.getValue();
            StringBuilder sb = new StringBuilder();
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                String str = ((l) list.get(i2)).f694a;
                if (!TextUtils.isEmpty(str)) {
                    sb.append(str);
                    if (i2 != list.size() - 1) {
                        sb.append(',');
                    }
                }
            }
            String sb2 = sb.toString();
            if (!TextUtils.isEmpty(sb2)) {
                hashMap.put(entry.getKey(), sb2);
            }
        }
        return hashMap;
    }

    public final Map b() {
        if (this.f696c == null) {
            synchronized (this) {
                try {
                    if (this.f696c == null) {
                        this.f696c = Collections.unmodifiableMap(a());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f696c;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return this.f695b.equals(((m) obj).f695b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f695b.hashCode();
    }

    public final String toString() {
        return "LazyHeaders{headers=" + this.f695b + '}';
    }
}
