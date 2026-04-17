package q3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o3.d;
import q.C0928e;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f11097a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public List f11098b;

    public final String a(String str) {
        StringBuilder b6 = C0928e.b(str, "<value>: ");
        b6.append(this.f11098b);
        b6.append("\n");
        String sb = b6.toString();
        HashMap hashMap = this.f11097a;
        if (hashMap.isEmpty()) {
            return d.g(sb, str, "<empty>");
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            StringBuilder b7 = C0928e.b(sb, str);
            b7.append(entry.getKey());
            b7.append(":\n");
            b7.append(((j) entry.getValue()).a(str + "\t"));
            b7.append("\n");
            sb = b7.toString();
        }
        return sb;
    }
}
