package S3;

import K3.b;
import U3.c;
import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.messaging.FirebaseMessaging;
import g3.l;
import h3.C0557a;
import h3.C0563g;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public final /* synthetic */ class n implements b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2687a;

    public /* synthetic */ n(int i2) {
        this.f2687a = i2;
    }

    public final Object get() {
        switch (this.f2687a) {
            case 0:
                c cVar = FirebaseMessaging.f6901l;
                return null;
            case 1:
                return Collections.emptySet();
            case 2:
                return null;
            case 3:
                l lVar = ExecutorsRegistrar.f6886a;
                StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                int i2 = Build.VERSION.SDK_INT;
                detectNetwork.detectResourceMismatches();
                if (i2 >= 26) {
                    detectNetwork.detectUnbufferedIo();
                }
                return new C0563g(Executors.newFixedThreadPool(4, new C0557a("Firebase Background", 10, detectNetwork.penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 4:
                l lVar2 = ExecutorsRegistrar.f6886a;
                return new C0563g(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new C0557a("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 5:
                l lVar3 = ExecutorsRegistrar.f6886a;
                return new C0563g(Executors.newCachedThreadPool(new C0557a("Firebase Blocking", 11, (StrictMode.ThreadPolicy) null)), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            default:
                l lVar4 = ExecutorsRegistrar.f6886a;
                return Executors.newSingleThreadScheduledExecutor(new C0557a("Firebase Scheduler", 0, (StrictMode.ThreadPolicy) null));
        }
    }
}
