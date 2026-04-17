package S3;

import F3.k;
import I3.e;
import J2.o;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.firebase.messaging.FirebaseMessaging;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledThreadPoolExecutor;

public final /* synthetic */ class E implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f2615a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ScheduledThreadPoolExecutor f2616b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f2617c;
    public final /* synthetic */ e d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ o f2618e;

    public /* synthetic */ E(Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, FirebaseMessaging firebaseMessaging, e eVar, o oVar) {
        this.f2615a = context;
        this.f2616b = scheduledThreadPoolExecutor;
        this.f2617c = firebaseMessaging;
        this.d = eVar;
        this.f2618e = oVar;
    }

    public final Object call() {
        D d6;
        Context context = this.f2615a;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f2616b;
        FirebaseMessaging firebaseMessaging = this.f2617c;
        e eVar = this.d;
        o oVar = this.f2618e;
        synchronized (D.class) {
            try {
                WeakReference weakReference = D.f2612c;
                if (weakReference != null) {
                    d6 = (D) weakReference.get();
                } else {
                    d6 = null;
                }
                if (d6 == null) {
                    SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
                    D d7 = new D(sharedPreferences, scheduledThreadPoolExecutor);
                    synchronized (d7) {
                        d7.f2613a = k.c(sharedPreferences, scheduledThreadPoolExecutor);
                    }
                    D.f2612c = new WeakReference(d7);
                    d6 = d7;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return new F(firebaseMessaging, eVar, d6, oVar, context, scheduledThreadPoolExecutor);
    }
}
