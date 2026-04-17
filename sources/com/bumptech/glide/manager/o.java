package com.bumptech.glide.manager;

import F0.C0015e;
import Q0.c;
import S3.r;
import U0.h;
import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import androidx.activity.e;
import androidx.lifecycle.C0303n;
import androidx.lifecycle.C0309u;
import androidx.savedstate.Recreator;
import com.bumptech.glide.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import k.C0738t;
import m.d;
import m.f;
import n0.C0852b;
import n0.C0853c;
import n3.C0857B;
import n3.C0866g;
import z1.j;

public final class o implements h, q3.h {

    /* renamed from: e  reason: collision with root package name */
    public static volatile o f5841e;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5842a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f5843b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f5844c;
    public final Object d;

    public o() {
        this.f5842a = 2;
        this.f5844c = Collections.newSetFromMap(new WeakHashMap());
        this.d = new HashSet();
    }

    public static o b(Context context) {
        if (f5841e == null) {
            synchronized (o.class) {
                try {
                    if (f5841e == null) {
                        f5841e = new o(context.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f5841e;
    }

    public boolean a(c cVar) {
        boolean z3 = true;
        if (cVar == null) {
            return true;
        }
        boolean remove = ((Set) this.f5844c).remove(cVar);
        if (!((HashSet) this.d).remove(cVar) && !remove) {
            z3 = false;
        }
        if (z3) {
            cVar.clear();
        }
        return z3;
    }

    public void c() {
        boolean z3;
        if (!this.f5843b && !((HashSet) this.d).isEmpty()) {
            r rVar = (r) this.f5844c;
            j jVar = (j) rVar.f2695c;
            boolean z4 = false;
            if (((ConnectivityManager) jVar.get()).getActiveNetwork() != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            rVar.f2693a = z3;
            try {
                ((ConnectivityManager) jVar.get()).registerDefaultNetworkCallback((n) rVar.d);
                z4 = true;
            } catch (RuntimeException e6) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register callback", e6);
                }
            }
            this.f5843b = z4;
        }
    }

    public void d() {
        C0853c cVar = (C0853c) this.f5844c;
        C0309u h = cVar.h();
        if (h.f5278c == C0303n.f5269b) {
            h.a(new Recreator(cVar));
            C0738t tVar = (C0738t) this.d;
            tVar.getClass();
            if (!tVar.f9375c) {
                h.a(new e(tVar, 2));
                tVar.f9375c = true;
                this.f5843b = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    public void e(Bundle bundle) {
        Bundle bundle2;
        if (!this.f5843b) {
            d();
        }
        C0309u h = ((C0853c) this.f5844c).h();
        if (h.f5278c.compareTo(C0303n.d) < 0) {
            C0738t tVar = (C0738t) this.d;
            if (!tVar.f9375c) {
                throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
            } else if (!tVar.d) {
                if (bundle != null) {
                    bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
                } else {
                    bundle2 = null;
                }
                tVar.f9373a = bundle2;
                tVar.d = true;
            } else {
                throw new IllegalStateException("SavedStateRegistry was already restored.");
            }
        } else {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + h.f5278c).toString());
        }
    }

    public boolean f(Object obj) {
        C0857B b6 = (C0857B) obj;
        if (b6.f10242e || this.f5843b) {
            if (!((List) this.f5844c).contains(Long.valueOf(b6.f10239a))) {
                C0866g gVar = b6.f10240b;
                C0866g gVar2 = (C0866g) this.d;
                if (gVar.x(gVar2) || gVar2.x(gVar)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void g(Bundle bundle) {
        kotlin.jvm.internal.j.e(bundle, "outBundle");
        C0738t tVar = (C0738t) this.d;
        tVar.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = (Bundle) tVar.f9373a;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        f fVar = (f) tVar.f9377f;
        fVar.getClass();
        d dVar = new d(fVar);
        fVar.f9840c.put(dVar, Boolean.FALSE);
        while (dVar.hasNext()) {
            Map.Entry entry = (Map.Entry) dVar.next();
            bundle2.putBundle((String) entry.getKey(), ((C0852b) entry.getValue()).a());
        }
        if (!bundle2.isEmpty()) {
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
        }
    }

    public Object get() {
        if (!this.f5843b) {
            Trace.beginSection("Glide registry");
            this.f5843b = true;
            try {
                return K1.e.h((b) this.f5844c, (ArrayList) this.d);
            } finally {
                this.f5843b = false;
                Trace.endSection();
            }
        } else {
            throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
        }
    }

    public String toString() {
        String str;
        switch (this.f5842a) {
            case 2:
                return super.toString() + "{numRequests=" + ((Set) this.f5844c).size() + ", isPaused=" + this.f5843b + "}";
            case 3:
                StringBuilder sb = new StringBuilder("http");
                if (this.f5843b) {
                    str = "s";
                } else {
                    str = "";
                }
                sb.append(str);
                sb.append("://");
                sb.append((String) this.f5844c);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public o(String str, String str2, boolean z3) {
        this.f5842a = 3;
        this.f5844c = str;
        this.d = str2;
        this.f5843b = z3;
    }

    public o(C0853c cVar) {
        this.f5842a = 4;
        this.f5844c = cVar;
        this.d = new C0738t();
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [S3.r, java.lang.Object] */
    public o(Context context) {
        this.f5842a = 0;
        this.d = new HashSet();
        j jVar = new j((Object) new C0015e(context, 5));
        m mVar = new m(this);
        ? obj = new Object();
        obj.d = new n(obj, 0);
        obj.f2695c = jVar;
        obj.f2694b = mVar;
        this.f5844c = obj;
    }

    public o(b bVar, ArrayList arrayList, R2.b bVar2) {
        this.f5842a = 1;
        this.f5844c = bVar;
        this.d = arrayList;
    }

    public o(boolean z3, List list, C0866g gVar) {
        this.f5842a = 5;
        this.f5843b = z3;
        this.f5844c = list;
        this.d = gVar;
    }
}
