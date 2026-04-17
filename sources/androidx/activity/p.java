package androidx.activity;

import A4.a;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.C0302m;
import androidx.lifecycle.C0307s;
import androidx.lifecycle.C0309u;
import com.bumptech.glide.manager.o;
import com.mtma.criminal.city.R;
import k.C0738t;
import kotlin.jvm.internal.j;
import n0.C0853c;

public class p extends Dialog implements C0307s, C0853c {

    /* renamed from: a  reason: collision with root package name */
    public C0309u f4658a;

    /* renamed from: b  reason: collision with root package name */
    public final o f4659b = new o((C0853c) this);

    /* renamed from: c  reason: collision with root package name */
    public final B f4660c = new B(new a(this, 6));

    public p(Context context, int i2) {
        super(context, i2);
    }

    public static void b(p pVar) {
        j.e(pVar, "this$0");
        super.onBackPressed();
    }

    public final C0738t a() {
        return (C0738t) this.f4659b.d;
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        j.e(view, "view");
        d();
        super.addContentView(view, layoutParams);
    }

    public final C0309u c() {
        C0309u uVar = this.f4658a;
        if (uVar != null) {
            return uVar;
        }
        C0309u uVar2 = new C0309u(this);
        this.f4658a = uVar2;
        return uVar2;
    }

    public final void d() {
        Window window = getWindow();
        j.b(window);
        View decorView = window.getDecorView();
        j.d(decorView, "window!!.decorView");
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        j.b(window2);
        View decorView2 = window2.getDecorView();
        j.d(decorView2, "window!!.decorView");
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        j.b(window3);
        View decorView3 = window3.getDecorView();
        j.d(decorView3, "window!!.decorView");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    public final C0309u h() {
        return c();
    }

    public final void onBackPressed() {
        this.f4660c.d();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher j6 = getOnBackInvokedDispatcher();
            j.d(j6, "onBackInvokedDispatcher");
            B b6 = this.f4660c;
            b6.getClass();
            b6.f4602e = j6;
            b6.e(b6.g);
        }
        this.f4659b.e(bundle);
        c().d(C0302m.ON_CREATE);
    }

    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        j.d(onSaveInstanceState, "super.onSaveInstanceState()");
        this.f4659b.g(onSaveInstanceState);
        return onSaveInstanceState;
    }

    public final void onStart() {
        super.onStart();
        c().d(C0302m.ON_RESUME);
    }

    public void onStop() {
        c().d(C0302m.ON_DESTROY);
        this.f4658a = null;
        super.onStop();
    }

    public void setContentView(int i2) {
        d();
        super.setContentView(i2);
    }

    public void setContentView(View view) {
        j.e(view, "view");
        d();
        super.setContentView(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        j.e(view, "view");
        d();
        super.setContentView(view, layoutParams);
    }
}
