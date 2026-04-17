package x1;

import C1.a;
import android.content.Context;
import com.google.android.gms.common.api.internal.C0354h;
import com.google.android.gms.common.api.o;
import java.util.Iterator;
import java.util.Set;

public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    public static final a f12550a = new a("GoogleSignInCommon", new String[0]);

    public static void a(Context context) {
        i.H(context).I();
        Set set = o.f6122a;
        synchronized (set) {
        }
        Iterator it2 = set.iterator();
        if (!it2.hasNext()) {
            C0354h.a();
        } else {
            ((o) it2.next()).getClass();
            throw new UnsupportedOperationException();
        }
    }
}
