package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.C0298i;
import androidx.lifecycle.C0302m;
import androidx.lifecycle.C0309u;
import androidx.lifecycle.J;
import androidx.lifecycle.P;
import androidx.lifecycle.T;
import androidx.lifecycle.U;
import c0.C0337c;
import com.bumptech.glide.manager.o;
import java.util.LinkedHashMap;
import k.C0738t;
import n0.C0853c;

public final class Q implements C0298i, C0853c, U {

    /* renamed from: a  reason: collision with root package name */
    public final C0286s f5056a;

    /* renamed from: b  reason: collision with root package name */
    public final T f5057b;

    /* renamed from: c  reason: collision with root package name */
    public C0309u f5058c = null;
    public o d = null;

    public Q(C0286s sVar, T t6) {
        this.f5056a = sVar;
        this.f5057b = t6;
    }

    public final C0738t a() {
        d();
        return (C0738t) this.d.d;
    }

    public final void b(C0302m mVar) {
        this.f5058c.d(mVar);
    }

    public final C0337c c() {
        Application application;
        C0286s sVar = this.f5056a;
        Context applicationContext = sVar.Q().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            } else if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            } else {
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
        }
        C0337c cVar = new C0337c(0);
        LinkedHashMap linkedHashMap = cVar.f5577a;
        if (application != null) {
            linkedHashMap.put(P.f5248a, application);
        }
        linkedHashMap.put(J.f5229a, this);
        linkedHashMap.put(J.f5230b, this);
        Bundle bundle = sVar.f5178f;
        if (bundle != null) {
            linkedHashMap.put(J.f5231c, bundle);
        }
        return cVar;
    }

    public final void d() {
        if (this.f5058c == null) {
            this.f5058c = new C0309u(this);
            o oVar = new o((C0853c) this);
            this.d = oVar;
            oVar.d();
            J.d(this);
        }
    }

    public final T e() {
        d();
        return this.f5057b;
    }

    public final C0309u h() {
        d();
        return this.f5058c;
    }
}
