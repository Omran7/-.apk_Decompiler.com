package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;
import kotlin.jvm.internal.j;
import n5.C0883o;
import p0.C0905a;
import p0.C0906b;

public final class ProcessLifecycleInitializer implements C0906b {
    public final List a() {
        return C0883o.f10398a;
    }

    public final Object b(Context context) {
        j.e(context, "context");
        C0905a c3 = C0905a.c(context);
        j.d(c3, "getInstance(context)");
        if (c3.f10970b.contains(ProcessLifecycleInitializer.class)) {
            if (!C0305p.f5273a.getAndSet(true)) {
                Context applicationContext = context.getApplicationContext();
                j.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
                ((Application) applicationContext).registerActivityLifecycleCallbacks(new C0304o());
            }
            D d = D.f5211r;
            d.getClass();
            d.f5215e = new Handler();
            d.f5216f.d(C0302m.ON_CREATE);
            Context applicationContext2 = context.getApplicationContext();
            j.c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext2).registerActivityLifecycleCallbacks(new C(d));
            return d;
        }
        throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
    }
}
