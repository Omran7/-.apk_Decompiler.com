package L3;

import M3.b;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class h implements j {

    /* renamed from: a  reason: collision with root package name */
    public final TaskCompletionSource f1728a;

    public h(TaskCompletionSource taskCompletionSource) {
        this.f1728a = taskCompletionSource;
    }

    public final boolean a(Exception exc) {
        return false;
    }

    public final boolean b(b bVar) {
        int i2 = bVar.f1830b;
        if (i2 != 3 && i2 != 4 && i2 != 5) {
            return false;
        }
        this.f1728a.trySetResult(bVar.f1829a);
        return true;
    }
}
