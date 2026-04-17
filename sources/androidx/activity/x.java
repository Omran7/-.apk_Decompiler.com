package androidx.activity;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import kotlin.jvm.internal.j;
import x5.a;
import x5.l;

public final class x implements OnBackAnimationCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l f4673a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ l f4674b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ a f4675c;
    public final /* synthetic */ a d;

    public x(l lVar, l lVar2, a aVar, a aVar2) {
        this.f4673a = lVar;
        this.f4674b = lVar2;
        this.f4675c = aVar;
        this.d = aVar2;
    }

    public final void onBackCancelled() {
        this.d.invoke();
    }

    public final void onBackInvoked() {
        this.f4675c.invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        j.e(backEvent, "backEvent");
        this.f4674b.invoke(new C0267b(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        j.e(backEvent, "backEvent");
        this.f4673a.invoke(new C0267b(backEvent));
    }
}
