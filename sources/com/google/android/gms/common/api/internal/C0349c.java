package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.common.api.internal.c  reason: case insensitive filesystem */
public final class C0349c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: e  reason: collision with root package name */
    public static final C0349c f6081e = new C0349c();

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f6082a = new AtomicBoolean();

    /* renamed from: b  reason: collision with root package name */
    public final AtomicBoolean f6083b = new AtomicBoolean();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f6084c = new ArrayList();
    public boolean d = false;

    public static void b(Application application) {
        C0349c cVar = f6081e;
        synchronized (cVar) {
            try {
                if (!cVar.d) {
                    application.registerActivityLifecycleCallbacks(cVar);
                    application.registerComponentCallbacks(cVar);
                    cVar.d = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(C0348b bVar) {
        synchronized (f6081e) {
            this.f6084c.add(bVar);
        }
    }

    public final void c(boolean z3) {
        synchronized (f6081e) {
            try {
                Iterator it2 = this.f6084c.iterator();
                while (it2.hasNext()) {
                    ((C0348b) it2.next()).a(z3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AtomicBoolean atomicBoolean = this.f6083b;
        boolean compareAndSet = this.f6082a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            c(false);
        }
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
        AtomicBoolean atomicBoolean = this.f6083b;
        boolean compareAndSet = this.f6082a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            c(false);
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i2) {
        if (i2 == 20 && this.f6082a.compareAndSet(false, true)) {
            this.f6083b.set(true);
            c(true);
        }
    }
}
