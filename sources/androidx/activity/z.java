package androidx.activity;

import kotlin.jvm.internal.j;
import n5.C0873e;

public final class z implements C0268c {

    /* renamed from: a  reason: collision with root package name */
    public final C f4677a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ B f4678b;

    public z(B b6, C c3) {
        j.e(c3, "onBackPressedCallback");
        this.f4678b = b6;
        this.f4677a = c3;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [x5.a, kotlin.jvm.internal.i] */
    public final void cancel() {
        B b6 = this.f4678b;
        C0873e eVar = b6.f4600b;
        C c3 = this.f4677a;
        eVar.remove((Object) c3);
        if (j.a(b6.f4601c, c3)) {
            c3.getClass();
            b6.f4601c = null;
        }
        c3.f4605b.remove(this);
        ? r02 = c3.f4606c;
        if (r02 != 0) {
            r02.invoke();
        }
        c3.f4606c = null;
    }
}
