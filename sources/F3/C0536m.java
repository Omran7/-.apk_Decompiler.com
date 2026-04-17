package f3;

import C1.a;
import com.google.android.gms.internal.p002firebaseauthapi.zzaag;
import e3.n;
import java.util.HashMap;
import java.util.Map;

/* renamed from: f3.m  reason: case insensitive filesystem */
public abstract class C0536m {

    /* renamed from: a  reason: collision with root package name */
    public static final a f7945a = new a("GetTokenResultFactory", new String[0]);

    /* JADX WARNING: type inference failed for: r1v0, types: [e3.n, java.lang.Object] */
    public static n a(String str) {
        Map map;
        try {
            map = C0535l.b(str);
        } catch (zzaag e6) {
            f7945a.b("Error parsing token claims", e6, new Object[0]);
            map = new HashMap();
        }
        ? obj = new Object();
        obj.f7649a = str;
        obj.f7650b = map;
        return obj;
    }
}
