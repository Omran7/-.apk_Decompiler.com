package androidx.activity;

import A4.a;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;

public final class k implements ViewTreeObserver.OnDrawListener, Runnable, Executor {

    /* renamed from: a  reason: collision with root package name */
    public final long f4628a = (SystemClock.uptimeMillis() + ((long) 10000));

    /* renamed from: b  reason: collision with root package name */
    public Runnable f4629b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f4630c;
    public final /* synthetic */ o d;

    public k(o oVar) {
        this.d = oVar;
    }

    public final void a(View view) {
        if (!this.f4630c) {
            this.f4630c = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }
    }

    public final void execute(Runnable runnable) {
        j.e(runnable, "runnable");
        this.f4629b = runnable;
        View decorView = this.d.getWindow().getDecorView();
        j.d(decorView, "window.decorView");
        if (!this.f4630c) {
            decorView.postOnAnimation(new a(this, 5));
        } else if (j.a(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    public final void onDraw() {
        boolean z3;
        Runnable runnable = this.f4629b;
        if (runnable != null) {
            runnable.run();
            this.f4629b = null;
            q qVar = (q) this.d.f4647p.a();
            synchronized (qVar.f4662b) {
                z3 = qVar.f4663c;
            }
            if (z3) {
                this.f4630c = false;
                this.d.getWindow().getDecorView().post(this);
            }
        } else if (SystemClock.uptimeMillis() > this.f4628a) {
            this.f4630c = false;
            this.d.getWindow().getDecorView().post(this);
        }
    }

    public final void run() {
        this.d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
