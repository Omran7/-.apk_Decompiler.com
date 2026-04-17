package Q0;

import B0.p;
import I0.C0058e;
import I0.t;
import M0.c;
import T0.b;
import U0.d;
import U0.g;
import U0.o;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.f;
import n.j;
import z0.C1130f;
import z0.h;
import z0.i;
import z0.m;

public abstract class a implements Cloneable {

    /* renamed from: A  reason: collision with root package name */
    public boolean f2338A;

    /* renamed from: a  reason: collision with root package name */
    public int f2339a;

    /* renamed from: b  reason: collision with root package name */
    public float f2340b = 1.0f;

    /* renamed from: c  reason: collision with root package name */
    public p f2341c = p.d;
    public f d = f.f5768c;

    /* renamed from: e  reason: collision with root package name */
    public int f2342e;

    /* renamed from: f  reason: collision with root package name */
    public int f2343f;

    /* renamed from: p  reason: collision with root package name */
    public boolean f2344p = true;

    /* renamed from: q  reason: collision with root package name */
    public int f2345q = -1;

    /* renamed from: r  reason: collision with root package name */
    public int f2346r = -1;

    /* renamed from: s  reason: collision with root package name */
    public C1130f f2347s = T0.a.f2793b;

    /* renamed from: t  reason: collision with root package name */
    public boolean f2348t;

    /* renamed from: u  reason: collision with root package name */
    public i f2349u = new i();

    /* renamed from: v  reason: collision with root package name */
    public d f2350v = new j(0);

    /* renamed from: w  reason: collision with root package name */
    public Class f2351w = Object.class;

    /* renamed from: x  reason: collision with root package name */
    public boolean f2352x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f2353y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f2354z = true;

    public static boolean g(int i2, int i5) {
        if ((i2 & i5) != 0) {
            return true;
        }
        return false;
    }

    public a a(a aVar) {
        if (this.f2353y) {
            return clone().a(aVar);
        }
        if (g(aVar.f2339a, 2)) {
            this.f2340b = aVar.f2340b;
        }
        if (g(aVar.f2339a, 1048576)) {
            this.f2338A = aVar.f2338A;
        }
        if (g(aVar.f2339a, 4)) {
            this.f2341c = aVar.f2341c;
        }
        if (g(aVar.f2339a, 8)) {
            this.d = aVar.d;
        }
        if (g(aVar.f2339a, 16)) {
            this.f2342e = 0;
            this.f2339a &= -33;
        }
        if (g(aVar.f2339a, 32)) {
            this.f2342e = aVar.f2342e;
            this.f2339a &= -17;
        }
        if (g(aVar.f2339a, 64)) {
            this.f2343f = 0;
            this.f2339a &= -129;
        }
        if (g(aVar.f2339a, 128)) {
            this.f2343f = aVar.f2343f;
            this.f2339a &= -65;
        }
        if (g(aVar.f2339a, 256)) {
            this.f2344p = aVar.f2344p;
        }
        if (g(aVar.f2339a, 512)) {
            this.f2346r = aVar.f2346r;
            this.f2345q = aVar.f2345q;
        }
        if (g(aVar.f2339a, 1024)) {
            this.f2347s = aVar.f2347s;
        }
        if (g(aVar.f2339a, 4096)) {
            this.f2351w = aVar.f2351w;
        }
        if (g(aVar.f2339a, 8192)) {
            this.f2339a &= -16385;
        }
        if (g(aVar.f2339a, 16384)) {
            this.f2339a &= -8193;
        }
        if (g(aVar.f2339a, 131072)) {
            this.f2348t = aVar.f2348t;
        }
        if (g(aVar.f2339a, 2048)) {
            this.f2350v.putAll(aVar.f2350v);
            this.f2354z = aVar.f2354z;
        }
        this.f2339a |= aVar.f2339a;
        this.f2349u.f12794b.g(aVar.f2349u.f12794b);
        m();
        return this;
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [n.e, U0.d, n.j] */
    /* renamed from: b */
    public a clone() {
        try {
            a aVar = (a) super.clone();
            i iVar = new i();
            aVar.f2349u = iVar;
            iVar.f12794b.g(this.f2349u.f12794b);
            ? jVar = new j(0);
            aVar.f2350v = jVar;
            jVar.putAll(this.f2350v);
            aVar.f2352x = false;
            aVar.f2353y = false;
            return aVar;
        } catch (CloneNotSupportedException e6) {
            throw new RuntimeException(e6);
        }
    }

    public final a c(Class cls) {
        if (this.f2353y) {
            return clone().c(cls);
        }
        this.f2351w = cls;
        this.f2339a |= 4096;
        m();
        return this;
    }

    public final a d(p pVar) {
        if (this.f2353y) {
            return clone().d(pVar);
        }
        this.f2341c = pVar;
        this.f2339a |= 4;
        m();
        return this;
    }

    public final a e(int i2) {
        if (this.f2353y) {
            return clone().e(i2);
        }
        this.f2342e = i2;
        this.f2339a = (this.f2339a | 32) & -17;
        m();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            return f((a) obj);
        }
        return false;
    }

    public final boolean f(a aVar) {
        if (Float.compare(aVar.f2340b, this.f2340b) != 0 || this.f2342e != aVar.f2342e || !o.b((Object) null, (Object) null) || this.f2343f != aVar.f2343f || !o.b((Object) null, (Object) null) || !o.b((Object) null, (Object) null) || this.f2344p != aVar.f2344p || this.f2345q != aVar.f2345q || this.f2346r != aVar.f2346r || this.f2348t != aVar.f2348t || !this.f2341c.equals(aVar.f2341c) || this.d != aVar.d || !this.f2349u.equals(aVar.f2349u) || !this.f2350v.equals(aVar.f2350v) || !this.f2351w.equals(aVar.f2351w) || !this.f2347s.equals(aVar.f2347s) || !o.b((Object) null, (Object) null)) {
            return false;
        }
        return true;
    }

    public final a h(I0.o oVar, C0058e eVar) {
        if (this.f2353y) {
            return clone().h(oVar, eVar);
        }
        n(I0.o.g, oVar);
        return s(eVar, false);
    }

    public int hashCode() {
        float f6 = this.f2340b;
        char[] cArr = o.f3697a;
        return o.h(o.h(o.h(o.h(o.h(o.h(o.h(o.g(0, o.g(0, o.g(1, o.g(this.f2348t ? 1 : 0, o.g(this.f2346r, o.g(this.f2345q, o.g(this.f2344p ? 1 : 0, o.h(o.g(0, o.h(o.g(this.f2343f, o.h(o.g(this.f2342e, o.g(Float.floatToIntBits(f6), 17)), (Object) null)), (Object) null)), (Object) null)))))))), this.f2341c), this.d), this.f2349u), this.f2350v), this.f2351w), this.f2347s), (Object) null);
    }

    public final a i(int i2, int i5) {
        if (this.f2353y) {
            return clone().i(i2, i5);
        }
        this.f2346r = i2;
        this.f2345q = i5;
        this.f2339a |= 512;
        m();
        return this;
    }

    public final a j(int i2) {
        if (this.f2353y) {
            return clone().j(i2);
        }
        this.f2343f = i2;
        this.f2339a = (this.f2339a | 128) & -65;
        m();
        return this;
    }

    public final a l() {
        f fVar = f.d;
        if (this.f2353y) {
            return clone().l();
        }
        this.d = fVar;
        this.f2339a |= 8;
        m();
        return this;
    }

    public final void m() {
        if (this.f2352x) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
    }

    public final a n(h hVar, I0.o oVar) {
        if (this.f2353y) {
            return clone().n(hVar, oVar);
        }
        g.b(hVar);
        this.f2349u.f12794b.put(hVar, oVar);
        m();
        return this;
    }

    public final a o(b bVar) {
        if (this.f2353y) {
            return clone().o(bVar);
        }
        this.f2347s = bVar;
        this.f2339a |= 1024;
        m();
        return this;
    }

    public final a p(float f6) {
        if (this.f2353y) {
            return clone().p(f6);
        }
        if (f6 < 0.0f || f6 > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f2340b = f6;
        this.f2339a |= 2;
        m();
        return this;
    }

    public final a q() {
        if (this.f2353y) {
            return clone().q();
        }
        this.f2344p = false;
        this.f2339a |= 256;
        m();
        return this;
    }

    public final a r(Class cls, m mVar, boolean z3) {
        if (this.f2353y) {
            return clone().r(cls, mVar, z3);
        }
        g.b(mVar);
        this.f2350v.put(cls, mVar);
        int i2 = this.f2339a;
        this.f2339a = 67584 | i2;
        this.f2354z = false;
        if (z3) {
            this.f2339a = i2 | 198656;
            this.f2348t = true;
        }
        m();
        return this;
    }

    public final a s(m mVar, boolean z3) {
        if (this.f2353y) {
            return clone().s(mVar, z3);
        }
        t tVar = new t(mVar, z3);
        r(Bitmap.class, mVar, z3);
        r(Drawable.class, tVar, z3);
        r(BitmapDrawable.class, tVar, z3);
        r(c.class, new M0.d(mVar), z3);
        m();
        return this;
    }

    public final a t() {
        if (this.f2353y) {
            return clone().t();
        }
        this.f2338A = true;
        this.f2339a |= 1048576;
        m();
        return this;
    }
}
