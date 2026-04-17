package S3;

import P4.a;
import U3.c;
import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Executor;

public final class J extends Binder {

    /* renamed from: a  reason: collision with root package name */
    public final c f2638a;

    public J(c cVar) {
        this.f2638a = cVar;
    }

    /* JADX WARNING: type inference failed for: r1v6, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final void a(K k6) {
        if (Binder.getCallingUid() == Process.myUid()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "service received new intent via bind strategy");
            }
            Intent intent = k6.f2639a;
            C0148i iVar = (C0148i) this.f2638a.f3713b;
            iVar.getClass();
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            iVar.f2672a.execute(new C0147h((Object) iVar, (Object) intent, (Object) taskCompletionSource, 0));
            taskCompletionSource.getTask().addOnCompleteListener((Executor) new Object(), new a(k6, 2));
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
