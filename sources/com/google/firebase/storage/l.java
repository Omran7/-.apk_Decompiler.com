package com.google.firebase.storage;

import java.lang.ref.WeakReference;
import java.util.HashMap;

public final class l {

    /* renamed from: c  reason: collision with root package name */
    public static final l f6940c = new l();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f6941a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Object f6942b = new Object();

    public final void a(k kVar) {
        k kVar2;
        synchronized (this.f6942b) {
            try {
                String fVar = ((q) kVar).f6955k.toString();
                WeakReference weakReference = (WeakReference) this.f6941a.get(fVar);
                if (weakReference != null) {
                    kVar2 = (k) weakReference.get();
                } else {
                    kVar2 = null;
                }
                if (kVar2 == null || kVar2 == kVar) {
                    this.f6941a.remove(fVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
