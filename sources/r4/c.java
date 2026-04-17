package R4;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class c implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2513a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f2514b;

    public /* synthetic */ c(TaskCompletionSource taskCompletionSource, int i2) {
        this.f2513a = i2;
        this.f2514b = taskCompletionSource;
    }

    public final void onComplete(Task task) {
        switch (this.f2513a) {
            case 0:
                this.f2514b.setResult(Boolean.TRUE);
                return;
            default:
                this.f2514b.setResult(Boolean.TRUE);
                return;
        }
    }
}
