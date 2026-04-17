package e0;

import T1.C0186l0;
import android.util.Log;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* renamed from: e0.c  reason: case insensitive filesystem */
public final class C0479c extends FutureTask {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0477a f7566a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0479c(C0477a aVar, C0186l0 l0Var) {
        super(l0Var);
        this.f7566a = aVar;
    }

    public final void done() {
        C0477a aVar = this.f7566a;
        try {
            Object obj = get();
            if (!aVar.f7561e.get()) {
                aVar.a(obj);
            }
        } catch (InterruptedException e6) {
            Log.w("AsyncTask", e6);
        } catch (ExecutionException e7) {
            throw new RuntimeException("An error occurred while executing doInBackground()", e7.getCause());
        } catch (CancellationException unused) {
            if (!aVar.f7561e.get()) {
                aVar.a((Object) null);
            }
        } catch (Throwable th) {
            throw new RuntimeException("An error occurred while executing doInBackground()", th);
        }
    }
}
