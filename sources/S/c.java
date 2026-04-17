package s;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import o3.d;
import q.C0928e;
import q.C0929f;
import t.h;
import t.n;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public HashSet f11283a = null;

    /* renamed from: b  reason: collision with root package name */
    public int f11284b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f11285c;
    public final d d;

    /* renamed from: e  reason: collision with root package name */
    public final int f11286e;

    /* renamed from: f  reason: collision with root package name */
    public c f11287f;
    public int g = 0;
    public int h = Integer.MIN_VALUE;

    /* renamed from: i  reason: collision with root package name */
    public C0929f f11288i;

    public c(d dVar, int i2) {
        this.d = dVar;
        this.f11286e = i2;
    }

    public final void a(c cVar, int i2) {
        b(cVar, i2, Integer.MIN_VALUE, false);
    }

    public final boolean b(c cVar, int i2, int i5, boolean z3) {
        if (cVar == null) {
            j();
            return true;
        } else if (!z3 && !i(cVar)) {
            return false;
        } else {
            this.f11287f = cVar;
            if (cVar.f11283a == null) {
                cVar.f11283a = new HashSet();
            }
            HashSet hashSet = this.f11287f.f11283a;
            if (hashSet != null) {
                hashSet.add(this);
            }
            this.g = i2;
            this.h = i5;
            return true;
        }
    }

    public final void c(int i2, ArrayList arrayList, n nVar) {
        HashSet hashSet = this.f11283a;
        if (hashSet != null) {
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                h.b(((c) it2.next()).d, i2, arrayList, nVar);
            }
        }
    }

    public final int d() {
        if (!this.f11285c) {
            return 0;
        }
        return this.f11284b;
    }

    public final int e() {
        c cVar;
        if (this.d.f11325g0 == 8) {
            return 0;
        }
        int i2 = this.h;
        if (i2 == Integer.MIN_VALUE || (cVar = this.f11287f) == null || cVar.d.f11325g0 != 8) {
            return this.g;
        }
        return i2;
    }

    public final c f() {
        int i2 = this.f11286e;
        int c3 = C0928e.c(i2);
        d dVar = this.d;
        switch (c3) {
            case 0:
            case 5:
            case zzaky.zzf.zzf:
            case zzaky.zzf.zzg:
            case 8:
                return null;
            case 1:
                return dVar.f11298K;
            case 2:
                return dVar.f11299L;
            case 3:
                return dVar.f11296I;
            case 4:
                return dVar.f11297J;
            default:
                throw new AssertionError(d.j(i2));
        }
    }

    public final boolean g() {
        HashSet hashSet = this.f11283a;
        if (hashSet == null) {
            return false;
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            if (((c) it2.next()).f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        if (this.f11287f != null) {
            return true;
        }
        return false;
    }

    public final boolean i(c cVar) {
        boolean z3;
        boolean z4;
        boolean z5 = false;
        if (cVar == null) {
            return false;
        }
        int i2 = this.f11286e;
        d dVar = cVar.d;
        int i5 = cVar.f11286e;
        if (i5 != i2) {
            switch (C0928e.c(i2)) {
                case 0:
                case zzaky.zzf.zzg:
                case 8:
                    return false;
                case 1:
                case 3:
                    if (i5 == 2 || i5 == 4) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!(dVar instanceof h)) {
                        return z3;
                    }
                    if (z3 || i5 == 8) {
                        z5 = true;
                    }
                    return z5;
                case 2:
                case 4:
                    if (i5 == 3 || i5 == 5) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!(dVar instanceof h)) {
                        return z4;
                    }
                    if (z4 || i5 == 9) {
                        z5 = true;
                    }
                    return z5;
                case 5:
                    if (i5 == 2 || i5 == 4) {
                        return false;
                    }
                    return true;
                case zzaky.zzf.zzf:
                    if (i5 == 6 || i5 == 8 || i5 == 9) {
                        return false;
                    }
                    return true;
                default:
                    throw new AssertionError(d.j(i2));
            }
        } else if (i2 != 6 || (dVar.f11293E && this.d.f11293E)) {
            return true;
        } else {
            return false;
        }
    }

    public final void j() {
        HashSet hashSet;
        c cVar = this.f11287f;
        if (!(cVar == null || (hashSet = cVar.f11283a) == null)) {
            hashSet.remove(this);
            if (this.f11287f.f11283a.size() == 0) {
                this.f11287f.f11283a = null;
            }
        }
        this.f11283a = null;
        this.f11287f = null;
        this.g = 0;
        this.h = Integer.MIN_VALUE;
        this.f11285c = false;
        this.f11284b = 0;
    }

    public final void k() {
        C0929f fVar = this.f11288i;
        if (fVar == null) {
            this.f11288i = new C0929f(1);
        } else {
            fVar.j();
        }
    }

    public final void l(int i2) {
        this.f11284b = i2;
        this.f11285c = true;
    }

    public final String toString() {
        return this.d.f11326h0 + ":" + d.j(this.f11286e);
    }
}
