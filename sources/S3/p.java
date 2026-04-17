package S3;

import I1.b;
import I3.g;
import J3.a;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import com.bumptech.glide.d;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.Executor;
import y1.k;
import y1.l;

public final /* synthetic */ class p implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2689a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f2690b;

    public /* synthetic */ p(FirebaseMessaging firebaseMessaging, int i2) {
        this.f2689a = i2;
        this.f2690b = firebaseMessaging;
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final void run() {
        Task task;
        int i2;
        switch (this.f2689a) {
            case 0:
                FirebaseMessaging firebaseMessaging = this.f2690b;
                if (firebaseMessaging.f6908f.n()) {
                    a aVar = firebaseMessaging.f6905b;
                    if (aVar != null) {
                        ((g) aVar).f1177a.f();
                        return;
                    } else if (firebaseMessaging.i(firebaseMessaging.d())) {
                        synchronized (firebaseMessaging) {
                            if (!firebaseMessaging.f6910j) {
                                firebaseMessaging.h(0);
                            }
                        }
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            default:
                FirebaseMessaging firebaseMessaging2 = this.f2690b;
                Context context = firebaseMessaging2.f6906c;
                d.H0(context);
                boolean g = firebaseMessaging2.g();
                if (Build.VERSION.SDK_INT >= 29) {
                    SharedPreferences X3 = b.X(context);
                    if (!X3.contains("proxy_retention") || X3.getBoolean("proxy_retention", false) != g) {
                        y1.b bVar = (y1.b) firebaseMessaging2.d.f1319c;
                        if (bVar.f12653c.b() >= 241100000) {
                            Bundle bundle = new Bundle();
                            bundle.putBoolean("proxy_retention", g);
                            l a6 = l.a(bVar.f12652b);
                            synchronized (a6) {
                                i2 = a6.f12677a;
                                a6.f12677a = i2 + 1;
                            }
                            task = a6.b(new k(i2, 4, bundle, 0));
                        } else {
                            task = Tasks.forException(new IOException("SERVICE_NOT_AVAILABLE"));
                        }
                        task.addOnSuccessListener((Executor) new Object(), new w(context, g));
                    }
                }
                if (firebaseMessaging2.g()) {
                    firebaseMessaging2.e();
                    return;
                }
                return;
        }
    }
}
