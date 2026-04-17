package H3;

import G.m;
import K3.b;
import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Set;
import java.util.concurrent.Executor;

public final class e implements g, h {

    /* renamed from: a  reason: collision with root package name */
    public final c f1011a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f1012b;

    /* renamed from: c  reason: collision with root package name */
    public final b f1013c;
    public final Set d;

    /* renamed from: e  reason: collision with root package name */
    public final Executor f1014e;

    public e(Context context, String str, Set set, b bVar, Executor executor) {
        this.f1011a = new c(0, context, str);
        this.d = set;
        this.f1014e = executor;
        this.f1013c = bVar;
        this.f1012b = context;
    }

    public final synchronized int a() {
        boolean g;
        long currentTimeMillis = System.currentTimeMillis();
        i iVar = (i) this.f1011a.get();
        synchronized (iVar) {
            g = iVar.g(currentTimeMillis);
        }
        if (!g) {
            return 1;
        }
        synchronized (iVar) {
            String d6 = iVar.d(System.currentTimeMillis());
            iVar.f1017a.edit().putString("last-used-date", d6).commit();
            iVar.f(d6);
        }
        return 3;
    }

    public final Task b() {
        if (!m.a(this.f1012b)) {
            return Tasks.forResult("");
        }
        return Tasks.call(this.f1014e, new d(this, 0));
    }

    public final void c() {
        if (this.d.size() <= 0) {
            Tasks.forResult(null);
        } else if (!m.a(this.f1012b)) {
            Tasks.forResult(null);
        } else {
            Tasks.call(this.f1014e, new d(this, 1));
        }
    }
}
