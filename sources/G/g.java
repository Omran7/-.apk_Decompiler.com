package G;

import B0.C0002a;
import T1.C0157b1;
import T1.C0203r0;
import T1.C0212u0;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.internal.common.zzh;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;

public final class g implements Executor {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f801a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f802b;

    public /* synthetic */ g(Object obj, int i2) {
        this.f801a = i2;
        this.f802b = obj;
    }

    public final void execute(Runnable runnable) {
        switch (this.f801a) {
            case 0:
                runnable.getClass();
                Handler handler = (Handler) this.f802b;
                if (!handler.post(runnable)) {
                    throw new RejectedExecutionException(handler + " is shutting down");
                }
                return;
            case 1:
                ((zzh) this.f802b).post(runnable);
                return;
            case 2:
                C0203r0 r0Var = ((C0212u0) ((C0157b1) this.f802b).f398a).f3497s;
                C0212u0.k(r0Var);
                r0Var.y(runnable);
                return;
            case 3:
                ((ExecutorService) this.f802b).execute(new C0002a(runnable, 2));
                return;
            default:
                ((zau) this.f802b).post(runnable);
                return;
        }
    }

    public g(Looper looper) {
        this.f801a = 1;
        this.f802b = new zzh(looper);
    }
}
