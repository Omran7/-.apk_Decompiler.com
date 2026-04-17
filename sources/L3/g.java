package L3;

import M3.b;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class g implements j {

    /* renamed from: a  reason: collision with root package name */
    public final k f1726a;

    /* renamed from: b  reason: collision with root package name */
    public final TaskCompletionSource f1727b;

    public g(k kVar, TaskCompletionSource taskCompletionSource) {
        this.f1726a = kVar;
        this.f1727b = taskCompletionSource;
    }

    public final boolean a(Exception exc) {
        this.f1727b.trySetException(exc);
        return true;
    }

    public final boolean b(b bVar) {
        if (bVar.f1830b != 4 || this.f1726a.a(bVar)) {
            return false;
        }
        String str = bVar.f1831c;
        if (str != null) {
            this.f1727b.setResult(new a(str, bVar.f1832e, bVar.f1833f));
            return true;
        }
        throw new NullPointerException("Null token");
    }
}
