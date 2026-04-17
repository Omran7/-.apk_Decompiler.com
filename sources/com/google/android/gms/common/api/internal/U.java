package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.t;
import com.google.android.gms.common.api.v;
import com.google.android.gms.common.internal.I;
import java.lang.ref.WeakReference;

public final class U extends v implements t {

    /* renamed from: a  reason: collision with root package name */
    public U f6064a = null;

    /* renamed from: b  reason: collision with root package name */
    public final Object f6065b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final WeakReference f6066c;

    public U(WeakReference weakReference) {
        Looper looper;
        I.h(weakReference, "GoogleApiClient reference must not be null");
        this.f6066c = weakReference;
        o oVar = (o) weakReference.get();
        if (oVar != null) {
            looper = ((K) oVar).f6046b.getLooper();
        } else {
            looper = Looper.getMainLooper();
        }
        new T(this, looper);
    }

    public final void a(Status status) {
        synchronized (this.f6065b) {
            synchronized (this.f6065b) {
                o oVar = (o) this.f6066c.get();
            }
        }
    }
}
