package androidx.activity;

import W0.p;
import android.os.Build;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.fragment.app.I;
import androidx.lifecycle.C0303n;
import androidx.lifecycle.C0307s;
import androidx.lifecycle.C0309u;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.activities.MainActivity;
import com.mtma.criminal.city.activities.l;
import com.mtma.criminal.city.activities.m;
import e5.C0505b;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.j;
import n5.C0873e;

public final class B {

    /* renamed from: a  reason: collision with root package name */
    public final Runnable f4599a;

    /* renamed from: b  reason: collision with root package name */
    public final C0873e f4600b = new C0873e();

    /* renamed from: c  reason: collision with root package name */
    public C f4601c;
    public final OnBackInvokedCallback d;

    /* renamed from: e  reason: collision with root package name */
    public OnBackInvokedDispatcher f4602e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f4603f;
    public boolean g;

    public B(Runnable runnable) {
        OnBackInvokedCallback onBackInvokedCallback;
        this.f4599a = runnable;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            if (i2 >= 34) {
                onBackInvokedCallback = y.f4676a.a(new t(this, 0), new t(this, 1), new u(this, 0), new u(this, 1));
            } else {
                onBackInvokedCallback = w.f4672a.a(new u(this, 2));
            }
            this.d = onBackInvokedCallback;
        }
    }

    public final void a(C0307s sVar, C c3) {
        j.e(c3, "onBackPressedCallback");
        C0309u h = sVar.h();
        if (h.f5278c != C0303n.f5268a) {
            c3.f4605b.add(new OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(this, h, c3));
            f();
            c3.f4606c = new A(0, this, B.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 0);
        }
    }

    public final z b(C c3) {
        j.e(c3, "onBackPressedCallback");
        this.f4600b.addLast(c3);
        z zVar = new z(this, c3);
        c3.f4605b.add(zVar);
        f();
        c3.f4606c = new A(0, this, B.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 1);
        return zVar;
    }

    public final void c() {
        Object obj;
        if (this.f4601c == null) {
            C0873e eVar = this.f4600b;
            ListIterator listIterator = eVar.listIterator(eVar.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                }
                obj = listIterator.previous();
                if (((C) obj).f4604a) {
                    break;
                }
            }
            C c3 = (C) obj;
        }
        this.f4601c = null;
    }

    public final void d() {
        Object obj;
        C c3 = this.f4601c;
        if (c3 == null) {
            C0873e eVar = this.f4600b;
            eVar.getClass();
            ListIterator listIterator = eVar.listIterator(eVar.f10396c);
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                }
                obj = listIterator.previous();
                if (((C) obj).f4604a) {
                    break;
                }
            }
            c3 = (C) obj;
        }
        this.f4601c = null;
        if (c3 != null) {
            switch (c3.d) {
                case 0:
                    ((p) c3.f4607e).invoke(c3);
                    return;
                case 1:
                    I i2 = (I) c3.f4607e;
                    i2.x(true);
                    if (i2.h.f4604a) {
                        i2.L();
                        return;
                    } else {
                        i2.g.d();
                        return;
                    }
                default:
                    int i5 = MainActivity.L0;
                    MainActivity mainActivity = (MainActivity) c3.f4607e;
                    mainActivity.getClass();
                    C0505b bVar = new C0505b(mainActivity.f6979I, R.layout.dialog_ok_cancle);
                    RelativeLayout relativeLayout = (RelativeLayout) bVar.findViewById(R.id.dialog_ok_cancel_confirm_button);
                    RelativeLayout relativeLayout2 = (RelativeLayout) bVar.findViewById(R.id.dialog_ok_cancel_cancel_button);
                    ((TextView) bVar.findViewById(R.id.dialog_ok_cancel_text)).setText(R.string.exit_from_game);
                    ((LinearLayout) bVar.findViewById(R.id.dialog_ok_cancel_buttons_confirm_cancel_layout)).setVisibility(0);
                    ((TextView) bVar.findViewById(R.id.dialog_ok_cancel_confirm_button_text)).setText(R.string.button_ok);
                    relativeLayout.setOnClickListener(new l(mainActivity, relativeLayout, bVar));
                    relativeLayout2.setOnClickListener(new m(relativeLayout2, bVar, 0));
                    bVar.show();
                    return;
            }
        } else {
            this.f4599a.run();
        }
    }

    public final void e(boolean z3) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f4602e;
        OnBackInvokedCallback onBackInvokedCallback = this.d;
        if (onBackInvokedDispatcher != null && onBackInvokedCallback != null) {
            w wVar = w.f4672a;
            if (z3 && !this.f4603f) {
                wVar.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
                this.f4603f = true;
            } else if (!z3 && this.f4603f) {
                wVar.c(onBackInvokedDispatcher, onBackInvokedCallback);
                this.f4603f = false;
            }
        }
    }

    public final void f() {
        boolean z3 = this.g;
        boolean z4 = false;
        C0873e eVar = this.f4600b;
        if (eVar == null || !eVar.isEmpty()) {
            Iterator it2 = eVar.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (((C) it2.next()).f4604a) {
                        z4 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        this.g = z4;
        if (z4 != z3 && Build.VERSION.SDK_INT >= 33) {
            e(z4);
        }
    }
}
