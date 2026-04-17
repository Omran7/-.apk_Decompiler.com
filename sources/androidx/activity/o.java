package androidx.activity;

import B0.C0009h;
import J.a;
import android.app.Application;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.B;
import androidx.lifecycle.C0298i;
import androidx.lifecycle.C0309u;
import androidx.lifecycle.E;
import androidx.lifecycle.G;
import androidx.lifecycle.J;
import androidx.lifecycle.P;
import androidx.lifecycle.T;
import androidx.lifecycle.U;
import b.C0310a;
import c.C0327b;
import c.C0328c;
import c0.C0337c;
import com.bumptech.glide.d;
import com.mtma.criminal.city.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import k.C0738t;
import m5.C0848g;
import n0.C0853c;
import z.C1120B;
import z.h;
import z1.j;

public abstract class o extends h implements U, C0298i, C0853c {

    /* renamed from: B  reason: collision with root package name */
    public static final /* synthetic */ int f4641B = 0;

    /* renamed from: A  reason: collision with root package name */
    public final C0848g f4642A;

    /* renamed from: b  reason: collision with root package name */
    public final j f4643b = new j();

    /* renamed from: c  reason: collision with root package name */
    public final C0009h f4644c = new C0009h((Runnable) new d(this, 0));
    public final com.bumptech.glide.manager.o d;

    /* renamed from: e  reason: collision with root package name */
    public T f4645e;

    /* renamed from: f  reason: collision with root package name */
    public final k f4646f;

    /* renamed from: p  reason: collision with root package name */
    public final C0848g f4647p;

    /* renamed from: q  reason: collision with root package name */
    public final AtomicInteger f4648q;

    /* renamed from: r  reason: collision with root package name */
    public final m f4649r;

    /* renamed from: s  reason: collision with root package name */
    public final CopyOnWriteArrayList f4650s;

    /* renamed from: t  reason: collision with root package name */
    public final CopyOnWriteArrayList f4651t;

    /* renamed from: u  reason: collision with root package name */
    public final CopyOnWriteArrayList f4652u;

    /* renamed from: v  reason: collision with root package name */
    public final CopyOnWriteArrayList f4653v;

    /* renamed from: w  reason: collision with root package name */
    public final CopyOnWriteArrayList f4654w;

    /* renamed from: x  reason: collision with root package name */
    public final CopyOnWriteArrayList f4655x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f4656y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f4657z;

    public o() {
        com.bumptech.glide.manager.o oVar = new com.bumptech.glide.manager.o((C0853c) this);
        this.d = oVar;
        this.f4646f = new k(this);
        this.f4647p = d.N0(new n(this, 2));
        this.f4648q = new AtomicInteger();
        this.f4649r = new m(this);
        this.f4650s = new CopyOnWriteArrayList();
        this.f4651t = new CopyOnWriteArrayList();
        this.f4652u = new CopyOnWriteArrayList();
        this.f4653v = new CopyOnWriteArrayList();
        this.f4654w = new CopyOnWriteArrayList();
        this.f4655x = new CopyOnWriteArrayList();
        C0309u uVar = this.f12758a;
        if (uVar != null) {
            uVar.a(new e(this, 0));
            this.f12758a.a(new e(this, 1));
            this.f12758a.a(new ComponentActivity$4(this));
            oVar.d();
            J.d(this);
            ((C0738t) oVar.d).f("android:support:activity-result", new f(this, 0));
            g(new g(this, 0));
            d.N0(new n(this, 0));
            this.f4642A = d.N0(new n(this, 3));
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    public final C0738t a() {
        return (C0738t) this.d.d;
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        j();
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.j.d(decorView, "window.decorView");
        this.f4646f.a(decorView);
        super.addContentView(view, layoutParams);
    }

    public final C0337c c() {
        Bundle bundle;
        C0337c cVar = new C0337c(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = cVar.f5577a;
        if (application != null) {
            P p6 = P.f5248a;
            Application application2 = getApplication();
            kotlin.jvm.internal.j.d(application2, "application");
            linkedHashMap.put(p6, application2);
        }
        linkedHashMap.put(J.f5229a, this);
        linkedHashMap.put(J.f5230b, this);
        Intent intent = getIntent();
        if (intent != null) {
            bundle = intent.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            linkedHashMap.put(J.f5231c, bundle);
        }
        return cVar;
    }

    public final T e() {
        if (getApplication() != null) {
            if (this.f4645e == null) {
                j jVar = (j) getLastNonConfigurationInstance();
                if (jVar != null) {
                    this.f4645e = jVar.f4627a;
                }
                if (this.f4645e == null) {
                    this.f4645e = new T();
                }
            }
            T t6 = this.f4645e;
            kotlin.jvm.internal.j.b(t6);
            return t6;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public final void f(a aVar) {
        kotlin.jvm.internal.j.e(aVar, "listener");
        this.f4650s.add(aVar);
    }

    public final void g(C0310a aVar) {
        j jVar = this.f4643b;
        jVar.getClass();
        o oVar = (o) jVar.f12820b;
        if (oVar != null) {
            aVar.a(oVar);
        }
        ((CopyOnWriteArraySet) jVar.f12819a).add(aVar);
    }

    public final C0309u h() {
        return this.f12758a;
    }

    public final B i() {
        return (B) this.f4642A.a();
    }

    public final void j() {
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.j.d(decorView, "window.decorView");
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        kotlin.jvm.internal.j.d(decorView2, "window.decorView");
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        kotlin.jvm.internal.j.d(decorView3, "window.decorView");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        kotlin.jvm.internal.j.d(decorView4, "window.decorView");
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        kotlin.jvm.internal.j.d(decorView5, "window.decorView");
        decorView5.setTag(R.id.report_drawn, this);
    }

    public final C0328c k(android.support.v4.media.session.a aVar, C0327b bVar) {
        m mVar = this.f4649r;
        kotlin.jvm.internal.j.e(mVar, "registry");
        return mVar.d("activity_rq#" + this.f4648q.getAndIncrement(), this, aVar, bVar);
    }

    public void onActivityResult(int i2, int i5, Intent intent) {
        if (!this.f4649r.a(i2, i5, intent)) {
            super.onActivityResult(i2, i5, intent);
        }
    }

    public final void onBackPressed() {
        i().d();
    }

    public void onConfigurationChanged(Configuration configuration) {
        kotlin.jvm.internal.j.e(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Iterator it2 = this.f4650s.iterator();
        while (it2.hasNext()) {
            ((a) it2.next()).accept(configuration);
        }
    }

    public void onCreate(Bundle bundle) {
        this.d.e(bundle);
        j jVar = this.f4643b;
        jVar.getClass();
        jVar.f12820b = this;
        Iterator it2 = ((CopyOnWriteArraySet) jVar.f12819a).iterator();
        while (it2.hasNext()) {
            ((C0310a) it2.next()).a(this);
        }
        super.onCreate(bundle);
        int i2 = G.f5221b;
        E.b(this);
    }

    public final boolean onCreatePanelMenu(int i2, Menu menu) {
        kotlin.jvm.internal.j.e(menu, "menu");
        if (i2 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i2, menu);
        getMenuInflater();
        Iterator it2 = ((CopyOnWriteArrayList) this.f4644c.f229c).iterator();
        while (it2.hasNext()) {
            ((B) it2.next()).f4973a.j();
        }
        return true;
    }

    public boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        kotlin.jvm.internal.j.e(menuItem, "item");
        boolean z3 = true;
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        if (i2 != 0) {
            return false;
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.f4644c.f229c).iterator();
        while (true) {
            if (it2.hasNext()) {
                if (((B) it2.next()).f4973a.o()) {
                    break;
                }
            } else {
                z3 = false;
                break;
            }
        }
        return z3;
    }

    public final void onMultiWindowModeChanged(boolean z3) {
        if (!this.f4656y) {
            Iterator it2 = this.f4653v.iterator();
            while (it2.hasNext()) {
                ((a) it2.next()).accept(new z.j(z3));
            }
        }
    }

    public void onNewIntent(Intent intent) {
        kotlin.jvm.internal.j.e(intent, "intent");
        super.onNewIntent(intent);
        Iterator it2 = this.f4652u.iterator();
        while (it2.hasNext()) {
            ((a) it2.next()).accept(intent);
        }
    }

    public void onPanelClosed(int i2, Menu menu) {
        kotlin.jvm.internal.j.e(menu, "menu");
        Iterator it2 = ((CopyOnWriteArrayList) this.f4644c.f229c).iterator();
        while (it2.hasNext()) {
            ((B) it2.next()).f4973a.p();
        }
        super.onPanelClosed(i2, menu);
    }

    public final void onPictureInPictureModeChanged(boolean z3) {
        if (!this.f4657z) {
            Iterator it2 = this.f4654w.iterator();
            while (it2.hasNext()) {
                ((a) it2.next()).accept(new C1120B(z3));
            }
        }
    }

    public final boolean onPreparePanel(int i2, View view, Menu menu) {
        kotlin.jvm.internal.j.e(menu, "menu");
        if (i2 != 0) {
            return true;
        }
        super.onPreparePanel(i2, view, menu);
        Iterator it2 = ((CopyOnWriteArrayList) this.f4644c.f229c).iterator();
        while (it2.hasNext()) {
            ((B) it2.next()).f4973a.s();
        }
        return true;
    }

    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        kotlin.jvm.internal.j.e(strArr, "permissions");
        kotlin.jvm.internal.j.e(iArr, "grantResults");
        if (!this.f4649r.a(i2, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            super.onRequestPermissionsResult(i2, strArr, iArr);
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [androidx.activity.j, java.lang.Object] */
    public final Object onRetainNonConfigurationInstance() {
        j jVar;
        T t6 = this.f4645e;
        if (t6 == null && (jVar = (j) getLastNonConfigurationInstance()) != null) {
            t6 = jVar.f4627a;
        }
        if (t6 == null) {
            return null;
        }
        ? obj = new Object();
        obj.f4627a = t6;
        return obj;
    }

    public void onSaveInstanceState(Bundle bundle) {
        kotlin.jvm.internal.j.e(bundle, "outState");
        C0309u uVar = this.f12758a;
        if (uVar != null) {
            uVar.g();
        }
        super.onSaveInstanceState(bundle);
        this.d.g(bundle);
    }

    public final void onTrimMemory(int i2) {
        super.onTrimMemory(i2);
        Iterator it2 = this.f4651t.iterator();
        while (it2.hasNext()) {
            ((a) it2.next()).accept(Integer.valueOf(i2));
        }
    }

    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it2 = this.f4655x.iterator();
        while (it2.hasNext()) {
            ((Runnable) it2.next()).run();
        }
    }

    public final void reportFullyDrawn() {
        try {
            if (d.K0()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            q qVar = (q) this.f4647p.a();
            synchronized (qVar.f4662b) {
                qVar.f4663c = true;
                Iterator it2 = qVar.d.iterator();
                while (it2.hasNext()) {
                    ((x5.a) it2.next()).invoke();
                }
                qVar.d.clear();
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public void setContentView(int i2) {
        j();
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.j.d(decorView, "window.decorView");
        this.f4646f.a(decorView);
        super.setContentView(i2);
    }

    public final void startActivityForResult(Intent intent, int i2) {
        kotlin.jvm.internal.j.e(intent, "intent");
        super.startActivityForResult(intent, i2);
    }

    public final void startIntentSenderForResult(IntentSender intentSender, int i2, Intent intent, int i5, int i6, int i7) {
        kotlin.jvm.internal.j.e(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i2, intent, i5, i6, i7);
    }

    public final void startActivityForResult(Intent intent, int i2, Bundle bundle) {
        kotlin.jvm.internal.j.e(intent, "intent");
        super.startActivityForResult(intent, i2, bundle);
    }

    public final void startIntentSenderForResult(IntentSender intentSender, int i2, Intent intent, int i5, int i6, int i7, Bundle bundle) {
        kotlin.jvm.internal.j.e(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i2, intent, i5, i6, i7, bundle);
    }

    /* JADX INFO: finally extract failed */
    public final void onMultiWindowModeChanged(boolean z3, Configuration configuration) {
        kotlin.jvm.internal.j.e(configuration, "newConfig");
        this.f4656y = true;
        try {
            super.onMultiWindowModeChanged(z3, configuration);
            this.f4656y = false;
            Iterator it2 = this.f4653v.iterator();
            while (it2.hasNext()) {
                ((a) it2.next()).accept(new z.j(z3));
            }
        } catch (Throwable th) {
            this.f4656y = false;
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public final void onPictureInPictureModeChanged(boolean z3, Configuration configuration) {
        kotlin.jvm.internal.j.e(configuration, "newConfig");
        this.f4657z = true;
        try {
            super.onPictureInPictureModeChanged(z3, configuration);
            this.f4657z = false;
            Iterator it2 = this.f4654w.iterator();
            while (it2.hasNext()) {
                ((a) it2.next()).accept(new C1120B(z3));
            }
        } catch (Throwable th) {
            this.f4657z = false;
            throw th;
        }
    }

    public void setContentView(View view) {
        j();
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.j.d(decorView, "window.decorView");
        this.f4646f.a(decorView);
        super.setContentView(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        j();
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.j.d(decorView, "window.decorView");
        this.f4646f.a(decorView);
        super.setContentView(view, layoutParams);
    }
}
