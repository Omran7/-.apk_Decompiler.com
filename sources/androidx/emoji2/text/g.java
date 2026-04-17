package androidx.emoji2.text;

import android.graphics.Rect;
import android.view.View;
import m0.C0804F;
import m0.C0828u;
import n3.C0866g;
import o3.e;
import v3.C1048c;

public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    public int f4929a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f4930b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f4931c;

    public g(int i2, e eVar, C0866g gVar) {
        this.f4929a = i2;
        this.f4930b = eVar;
        this.f4931c = gVar;
    }

    public static g a(C0804F f6, int i2) {
        if (i2 == 0) {
            return new C0828u(f6, 0);
        }
        if (i2 == 1) {
            return new C0828u(f6, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public int m() {
        if (Integer.MIN_VALUE == this.f4929a) {
            return 0;
        }
        return l() - this.f4929a;
    }

    public abstract int n(View view);

    public abstract int o(View view);

    public abstract void p(int i2);

    public abstract g q(C1048c cVar);

    public g(C0804F f6) {
        this.f4929a = Integer.MIN_VALUE;
        this.f4931c = new Rect();
        this.f4930b = f6;
    }

    public g(i iVar) {
        this.f4929a = 0;
        this.f4931c = new d();
        this.f4930b = iVar;
    }
}
