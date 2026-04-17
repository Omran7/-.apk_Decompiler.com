package s3;

import java.util.HashMap;
import q.C0928e;
import v3.C1048c;
import v3.l;
import v3.s;
import v3.u;

/* renamed from: s3.f  reason: case insensitive filesystem */
public final class C0968f {
    public static final C0968f h = new C0968f();

    /* renamed from: a  reason: collision with root package name */
    public Integer f11533a;

    /* renamed from: b  reason: collision with root package name */
    public int f11534b;

    /* renamed from: c  reason: collision with root package name */
    public s f11535c = null;
    public C1048c d = null;

    /* renamed from: e  reason: collision with root package name */
    public s f11536e = null;

    /* renamed from: f  reason: collision with root package name */
    public C1048c f11537f = null;
    public l g = u.f12308a;

    public final C0968f a() {
        C0968f fVar = new C0968f();
        fVar.f11533a = this.f11533a;
        fVar.f11535c = this.f11535c;
        fVar.d = this.d;
        fVar.f11536e = this.f11536e;
        fVar.f11537f = this.f11537f;
        fVar.f11534b = this.f11534b;
        fVar.g = this.g;
        return fVar;
    }

    public final HashMap b() {
        HashMap hashMap = new HashMap();
        if (e()) {
            hashMap.put("sp", this.f11535c.getValue());
            C1048c cVar = this.d;
            if (cVar != null) {
                hashMap.put("sn", cVar.f12280a);
            }
        }
        if (c()) {
            hashMap.put("ep", this.f11536e.getValue());
            C1048c cVar2 = this.f11537f;
            if (cVar2 != null) {
                hashMap.put("en", cVar2.f12280a);
            }
        }
        Integer num = this.f11533a;
        if (num != null) {
            hashMap.put("l", num);
            int i2 = this.f11534b;
            if (i2 == 0) {
                if (e()) {
                    i2 = 1;
                } else {
                    i2 = 2;
                }
            }
            int c3 = C0928e.c(i2);
            if (c3 == 0) {
                hashMap.put("vf", "l");
            } else if (c3 == 1) {
                hashMap.put("vf", "r");
            }
        }
        if (!this.g.equals(u.f12308a)) {
            hashMap.put("i", this.g.a());
        }
        return hashMap;
    }

    public final boolean c() {
        if (this.f11536e != null) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.f11533a != null) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if (this.f11535c != null) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0968f.class != obj.getClass()) {
            return false;
        }
        C0968f fVar = (C0968f) obj;
        Integer num = this.f11533a;
        if (num == null ? fVar.f11533a != null : !num.equals(fVar.f11533a)) {
            return false;
        }
        l lVar = this.g;
        if (lVar == null ? fVar.g != null : !lVar.equals(fVar.g)) {
            return false;
        }
        C1048c cVar = this.f11537f;
        if (cVar == null ? fVar.f11537f != null : !cVar.equals(fVar.f11537f)) {
            return false;
        }
        s sVar = this.f11536e;
        if (sVar == null ? fVar.f11536e != null : !sVar.equals(fVar.f11536e)) {
            return false;
        }
        C1048c cVar2 = this.d;
        if (cVar2 == null ? fVar.d != null : !cVar2.equals(fVar.d)) {
            return false;
        }
        s sVar2 = this.f11535c;
        if (sVar2 == null ? fVar.f11535c != null : !sVar2.equals(fVar.f11535c)) {
            return false;
        }
        if (g() != fVar.g()) {
            return false;
        }
        return true;
    }

    public final boolean f() {
        if (!e() || !c() || !d() || (d() && this.f11534b != 0)) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        int i2 = this.f11534b;
        if (i2 == 0) {
            return e();
        }
        if (i2 == 1) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        if (e() || c() || d()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        Integer num = this.f11533a;
        int i10 = 0;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        int i11 = i2 * 31;
        if (g()) {
            i5 = 1231;
        } else {
            i5 = 1237;
        }
        int i12 = (i11 + i5) * 31;
        s sVar = this.f11535c;
        if (sVar != null) {
            i6 = sVar.hashCode();
        } else {
            i6 = 0;
        }
        int i13 = (i12 + i6) * 31;
        C1048c cVar = this.d;
        if (cVar != null) {
            i7 = cVar.f12280a.hashCode();
        } else {
            i7 = 0;
        }
        int i14 = (i13 + i7) * 31;
        s sVar2 = this.f11536e;
        if (sVar2 != null) {
            i8 = sVar2.hashCode();
        } else {
            i8 = 0;
        }
        int i15 = (i14 + i8) * 31;
        C1048c cVar2 = this.f11537f;
        if (cVar2 != null) {
            i9 = cVar2.f12280a.hashCode();
        } else {
            i9 = 0;
        }
        int i16 = (i15 + i9) * 31;
        l lVar = this.g;
        if (lVar != null) {
            i10 = lVar.hashCode();
        }
        return i16 + i10;
    }

    public final String toString() {
        return b().toString();
    }
}
