package B0;

import U0.d;
import U0.g;
import java.security.MessageDigest;
import z0.C1130f;
import z0.i;

public final class v implements C1130f {

    /* renamed from: b  reason: collision with root package name */
    public final Object f319b;

    /* renamed from: c  reason: collision with root package name */
    public final int f320c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final Class f321e;

    /* renamed from: f  reason: collision with root package name */
    public final Class f322f;
    public final C1130f g;
    public final d h;

    /* renamed from: i  reason: collision with root package name */
    public final i f323i;

    /* renamed from: j  reason: collision with root package name */
    public int f324j;

    public v(Object obj, C1130f fVar, int i2, int i5, d dVar, Class cls, Class cls2, i iVar) {
        g.c(obj, "Argument must not be null");
        this.f319b = obj;
        this.g = fVar;
        this.f320c = i2;
        this.d = i5;
        g.c(dVar, "Argument must not be null");
        this.h = dVar;
        g.c(cls, "Resource class must not be null");
        this.f321e = cls;
        g.c(cls2, "Transcode class must not be null");
        this.f322f = cls2;
        g.c(iVar, "Argument must not be null");
        this.f323i = iVar;
    }

    public final void a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (!this.f319b.equals(vVar.f319b) || !this.g.equals(vVar.g) || this.d != vVar.d || this.f320c != vVar.f320c || !this.h.equals(vVar.h) || !this.f321e.equals(vVar.f321e) || !this.f322f.equals(vVar.f322f) || !this.f323i.equals(vVar.f323i)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.f324j == 0) {
            int hashCode = this.f319b.hashCode();
            this.f324j = hashCode;
            int hashCode2 = ((((this.g.hashCode() + (hashCode * 31)) * 31) + this.f320c) * 31) + this.d;
            this.f324j = hashCode2;
            int hashCode3 = this.h.hashCode() + (hashCode2 * 31);
            this.f324j = hashCode3;
            int hashCode4 = this.f321e.hashCode() + (hashCode3 * 31);
            this.f324j = hashCode4;
            int hashCode5 = this.f322f.hashCode() + (hashCode4 * 31);
            this.f324j = hashCode5;
            this.f324j = this.f323i.f12794b.hashCode() + (hashCode5 * 31);
        }
        return this.f324j;
    }

    public final String toString() {
        return "EngineKey{model=" + this.f319b + ", width=" + this.f320c + ", height=" + this.d + ", resourceClass=" + this.f321e + ", transcodeClass=" + this.f322f + ", signature=" + this.g + ", hashCode=" + this.f324j + ", transformations=" + this.h + ", options=" + this.f323i + '}';
    }
}
