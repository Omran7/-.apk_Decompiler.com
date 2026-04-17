package com.google.crypto.tink.shaded.protobuf;

import E2.d;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.f;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import m0.C0804F;

/* renamed from: com.google.crypto.tink.shaded.protobuf.l  reason: case insensitive filesystem */
public final class C0407l {

    /* renamed from: a  reason: collision with root package name */
    public int f6829a;

    /* renamed from: b  reason: collision with root package name */
    public int f6830b;

    /* renamed from: c  reason: collision with root package name */
    public int f6831c = 0;
    public Object d;

    public C0407l(d dVar) {
        B.a(dVar, "input");
        this.d = dVar;
        dVar.f618b = this;
    }

    public static void y(int i2) {
        if ((i2 & 3) != 0) {
            throw D.f();
        }
    }

    public static void z(int i2) {
        if ((i2 & 7) != 0) {
            throw D.f();
        }
    }

    public void a(int i2, int i5) {
        if (i2 < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        } else if (i5 >= 0) {
            int i6 = this.f6831c;
            int i7 = i6 * 2;
            int[] iArr = (int[]) this.d;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.d = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i7 >= iArr.length) {
                int[] iArr3 = new int[(i6 * 4)];
                this.d = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = (int[]) this.d;
            iArr4[i7] = i2;
            iArr4[i7 + 1] = i5;
            this.f6831c++;
        } else {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
    }

    public void b(RecyclerView recyclerView, boolean z3) {
        this.f6831c = 0;
        int[] iArr = (int[]) this.d;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        C0804F f6 = recyclerView.f5378u;
        if (recyclerView.f5376t != null && f6 != null && f6.f9854i) {
            if (z3) {
                if (!recyclerView.d.k()) {
                    f6.i(recyclerView.f5376t.a(), this);
                }
            } else if (!recyclerView.K()) {
                f6.h(this.f6829a, this.f6830b, recyclerView.f5365l0, this);
            }
            int i2 = this.f6831c;
            if (i2 > f6.f9855j) {
                f6.f9855j = i2;
                f6.f9856k = z3;
                recyclerView.f5351b.p();
            }
        }
    }

    public int c() {
        int i2 = this.f6831c;
        if (i2 != 0) {
            this.f6829a = i2;
            this.f6831c = 0;
        } else {
            this.f6829a = ((d) this.d).B();
        }
        int i5 = this.f6829a;
        if (i5 == 0 || i5 == this.f6830b) {
            return f.API_PRIORITY_OTHER;
        }
        return i5 >>> 3;
    }

    public void d(Object obj, d0 d0Var, C0411p pVar) {
        int i2 = this.f6830b;
        this.f6830b = ((this.f6829a >>> 3) << 3) | 4;
        try {
            d0Var.f(obj, this, pVar);
            if (this.f6829a != this.f6830b) {
                throw D.f();
            }
        } finally {
            this.f6830b = i2;
        }
    }

    public void e(Object obj, d0 d0Var, C0411p pVar) {
        d dVar = (d) this.d;
        int C6 = dVar.C();
        if (dVar.f617a < 100) {
            int l6 = dVar.l(C6);
            dVar.f617a++;
            d0Var.f(obj, this, pVar);
            dVar.b(0);
            dVar.f617a--;
            dVar.j(l6);
            return;
        }
        throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public void f(List list) {
        int B6;
        int B7;
        boolean z3 = list instanceof C0399d;
        d dVar = (d) this.d;
        if (z3) {
            C0399d dVar2 = (C0399d) list;
            int i2 = this.f6829a & 7;
            if (i2 == 0) {
                do {
                    dVar2.v(dVar.m());
                    if (!dVar.g()) {
                        B7 = dVar.B();
                    } else {
                        return;
                    }
                } while (B7 == this.f6829a);
                this.f6831c = B7;
            } else if (i2 == 2) {
                int f6 = dVar.f() + dVar.C();
                do {
                    dVar2.v(dVar.m());
                } while (dVar.f() < f6);
                w(f6);
            } else {
                throw D.c();
            }
        } else {
            int i5 = this.f6829a & 7;
            if (i5 == 0) {
                do {
                    list.add(Boolean.valueOf(dVar.m()));
                    if (!dVar.g()) {
                        B6 = dVar.B();
                    } else {
                        return;
                    }
                } while (B6 == this.f6829a);
                this.f6831c = B6;
            } else if (i5 == 2) {
                int f7 = dVar.f() + dVar.C();
                do {
                    list.add(Boolean.valueOf(dVar.m()));
                } while (dVar.f() < f7);
                w(f7);
            } else {
                throw D.c();
            }
        }
    }

    public C0404i g() {
        x(2);
        return ((d) this.d).n();
    }

    public void h(List list) {
        int B6;
        if ((this.f6829a & 7) == 2) {
            do {
                list.add(g());
                d dVar = (d) this.d;
                if (!dVar.g()) {
                    B6 = dVar.B();
                } else {
                    return;
                }
            } while (B6 == this.f6829a);
            this.f6831c = B6;
            return;
        }
        throw D.c();
    }

    public void i(List list) {
        int B6;
        int B7;
        boolean z3 = list instanceof C0409n;
        d dVar = (d) this.d;
        if (z3) {
            C0409n nVar = (C0409n) list;
            int i2 = this.f6829a & 7;
            if (i2 == 1) {
                do {
                    nVar.v(dVar.o());
                    if (!dVar.g()) {
                        B7 = dVar.B();
                    } else {
                        return;
                    }
                } while (B7 == this.f6829a);
                this.f6831c = B7;
            } else if (i2 == 2) {
                int C6 = dVar.C();
                z(C6);
                int f6 = dVar.f() + C6;
                do {
                    nVar.v(dVar.o());
                } while (dVar.f() < f6);
            } else {
                throw D.c();
            }
        } else {
            int i5 = this.f6829a & 7;
            if (i5 == 1) {
                do {
                    list.add(Double.valueOf(dVar.o()));
                    if (!dVar.g()) {
                        B6 = dVar.B();
                    } else {
                        return;
                    }
                } while (B6 == this.f6829a);
                this.f6831c = B6;
            } else if (i5 == 2) {
                int C7 = dVar.C();
                z(C7);
                int f7 = dVar.f() + C7;
                do {
                    list.add(Double.valueOf(dVar.o()));
                } while (dVar.f() < f7);
            } else {
                throw D.c();
            }
        }
    }

    public void j(List list) {
        int B6;
        int B7;
        boolean z3 = list instanceof C0419y;
        d dVar = (d) this.d;
        if (z3) {
            C0419y yVar = (C0419y) list;
            int i2 = this.f6829a & 7;
            if (i2 == 0) {
                do {
                    yVar.v(dVar.p());
                    if (!dVar.g()) {
                        B7 = dVar.B();
                    } else {
                        return;
                    }
                } while (B7 == this.f6829a);
                this.f6831c = B7;
            } else if (i2 == 2) {
                int f6 = dVar.f() + dVar.C();
                do {
                    yVar.v(dVar.p());
                } while (dVar.f() < f6);
                w(f6);
            } else {
                throw D.c();
            }
        } else {
            int i5 = this.f6829a & 7;
            if (i5 == 0) {
                do {
                    list.add(Integer.valueOf(dVar.p()));
                    if (!dVar.g()) {
                        B6 = dVar.B();
                    } else {
                        return;
                    }
                } while (B6 == this.f6829a);
                this.f6831c = B6;
            } else if (i5 == 2) {
                int f7 = dVar.f() + dVar.C();
                do {
                    list.add(Integer.valueOf(dVar.p()));
                } while (dVar.f() < f7);
                w(f7);
            } else {
                throw D.c();
            }
        }
    }

    public void k(List list) {
        int B6;
        int B7;
        boolean z3 = list instanceof C0419y;
        d dVar = (d) this.d;
        if (z3) {
            C0419y yVar = (C0419y) list;
            int i2 = this.f6829a & 7;
            if (i2 == 2) {
                int C6 = dVar.C();
                y(C6);
                int f6 = dVar.f() + C6;
                do {
                    yVar.v(dVar.q());
                } while (dVar.f() < f6);
            } else if (i2 == 5) {
                do {
                    yVar.v(dVar.q());
                    if (!dVar.g()) {
                        B7 = dVar.B();
                    } else {
                        return;
                    }
                } while (B7 == this.f6829a);
                this.f6831c = B7;
            } else {
                throw D.c();
            }
        } else {
            int i5 = this.f6829a & 7;
            if (i5 == 2) {
                int C7 = dVar.C();
                y(C7);
                int f7 = dVar.f() + C7;
                do {
                    list.add(Integer.valueOf(dVar.q()));
                } while (dVar.f() < f7);
            } else if (i5 == 5) {
                do {
                    list.add(Integer.valueOf(dVar.q()));
                    if (!dVar.g()) {
                        B6 = dVar.B();
                    } else {
                        return;
                    }
                } while (B6 == this.f6829a);
                this.f6831c = B6;
            } else {
                throw D.c();
            }
        }
    }

    public void l(List list) {
        int B6;
        int B7;
        boolean z3 = list instanceof K;
        d dVar = (d) this.d;
        if (z3) {
            K k6 = (K) list;
            int i2 = this.f6829a & 7;
            if (i2 == 1) {
                do {
                    k6.v(dVar.r());
                    if (!dVar.g()) {
                        B7 = dVar.B();
                    } else {
                        return;
                    }
                } while (B7 == this.f6829a);
                this.f6831c = B7;
            } else if (i2 == 2) {
                int C6 = dVar.C();
                z(C6);
                int f6 = dVar.f() + C6;
                do {
                    k6.v(dVar.r());
                } while (dVar.f() < f6);
            } else {
                throw D.c();
            }
        } else {
            int i5 = this.f6829a & 7;
            if (i5 == 1) {
                do {
                    list.add(Long.valueOf(dVar.r()));
                    if (!dVar.g()) {
                        B6 = dVar.B();
                    } else {
                        return;
                    }
                } while (B6 == this.f6829a);
                this.f6831c = B6;
            } else if (i5 == 2) {
                int C7 = dVar.C();
                z(C7);
                int f7 = dVar.f() + C7;
                do {
                    list.add(Long.valueOf(dVar.r()));
                } while (dVar.f() < f7);
            } else {
                throw D.c();
            }
        }
    }

    public void m(List list) {
        int B6;
        int B7;
        boolean z3 = list instanceof C0414t;
        d dVar = (d) this.d;
        if (z3) {
            C0414t tVar = (C0414t) list;
            int i2 = this.f6829a & 7;
            if (i2 == 2) {
                int C6 = dVar.C();
                y(C6);
                int f6 = dVar.f() + C6;
                do {
                    tVar.v(dVar.s());
                } while (dVar.f() < f6);
            } else if (i2 == 5) {
                do {
                    tVar.v(dVar.s());
                    if (!dVar.g()) {
                        B7 = dVar.B();
                    } else {
                        return;
                    }
                } while (B7 == this.f6829a);
                this.f6831c = B7;
            } else {
                throw D.c();
            }
        } else {
            int i5 = this.f6829a & 7;
            if (i5 == 2) {
                int C7 = dVar.C();
                y(C7);
                int f7 = dVar.f() + C7;
                do {
                    list.add(Float.valueOf(dVar.s()));
                } while (dVar.f() < f7);
            } else if (i5 == 5) {
                do {
                    list.add(Float.valueOf(dVar.s()));
                    if (!dVar.g()) {
                        B6 = dVar.B();
                    } else {
                        return;
                    }
                } while (B6 == this.f6829a);
                this.f6831c = B6;
            } else {
                throw D.c();
            }
        }
    }

    public void n(List list) {
        int B6;
        int B7;
        boolean z3 = list instanceof C0419y;
        d dVar = (d) this.d;
        if (z3) {
            C0419y yVar = (C0419y) list;
            int i2 = this.f6829a & 7;
            if (i2 == 0) {
                do {
                    yVar.v(dVar.t());
                    if (!dVar.g()) {
                        B7 = dVar.B();
                    } else {
                        return;
                    }
                } while (B7 == this.f6829a);
                this.f6831c = B7;
            } else if (i2 == 2) {
                int f6 = dVar.f() + dVar.C();
                do {
                    yVar.v(dVar.t());
                } while (dVar.f() < f6);
                w(f6);
            } else {
                throw D.c();
            }
        } else {
            int i5 = this.f6829a & 7;
            if (i5 == 0) {
                do {
                    list.add(Integer.valueOf(dVar.t()));
                    if (!dVar.g()) {
                        B6 = dVar.B();
                    } else {
                        return;
                    }
                } while (B6 == this.f6829a);
                this.f6831c = B6;
            } else if (i5 == 2) {
                int f7 = dVar.f() + dVar.C();
                do {
                    list.add(Integer.valueOf(dVar.t()));
                } while (dVar.f() < f7);
                w(f7);
            } else {
                throw D.c();
            }
        }
    }

    public void o(List list) {
        int B6;
        int B7;
        boolean z3 = list instanceof K;
        d dVar = (d) this.d;
        if (z3) {
            K k6 = (K) list;
            int i2 = this.f6829a & 7;
            if (i2 == 0) {
                do {
                    k6.v(dVar.u());
                    if (!dVar.g()) {
                        B7 = dVar.B();
                    } else {
                        return;
                    }
                } while (B7 == this.f6829a);
                this.f6831c = B7;
            } else if (i2 == 2) {
                int f6 = dVar.f() + dVar.C();
                do {
                    k6.v(dVar.u());
                } while (dVar.f() < f6);
                w(f6);
            } else {
                throw D.c();
            }
        } else {
            int i5 = this.f6829a & 7;
            if (i5 == 0) {
                do {
                    list.add(Long.valueOf(dVar.u()));
                    if (!dVar.g()) {
                        B6 = dVar.B();
                    } else {
                        return;
                    }
                } while (B6 == this.f6829a);
                this.f6831c = B6;
            } else if (i5 == 2) {
                int f7 = dVar.f() + dVar.C();
                do {
                    list.add(Long.valueOf(dVar.u()));
                } while (dVar.f() < f7);
                w(f7);
            } else {
                throw D.c();
            }
        }
    }

    public void p(List list) {
        int B6;
        int B7;
        boolean z3 = list instanceof C0419y;
        d dVar = (d) this.d;
        if (z3) {
            C0419y yVar = (C0419y) list;
            int i2 = this.f6829a & 7;
            if (i2 == 2) {
                int C6 = dVar.C();
                y(C6);
                int f6 = dVar.f() + C6;
                do {
                    yVar.v(dVar.v());
                } while (dVar.f() < f6);
            } else if (i2 == 5) {
                do {
                    yVar.v(dVar.v());
                    if (!dVar.g()) {
                        B7 = dVar.B();
                    } else {
                        return;
                    }
                } while (B7 == this.f6829a);
                this.f6831c = B7;
            } else {
                throw D.c();
            }
        } else {
            int i5 = this.f6829a & 7;
            if (i5 == 2) {
                int C7 = dVar.C();
                y(C7);
                int f7 = dVar.f() + C7;
                do {
                    list.add(Integer.valueOf(dVar.v()));
                } while (dVar.f() < f7);
            } else if (i5 == 5) {
                do {
                    list.add(Integer.valueOf(dVar.v()));
                    if (!dVar.g()) {
                        B6 = dVar.B();
                    } else {
                        return;
                    }
                } while (B6 == this.f6829a);
                this.f6831c = B6;
            } else {
                throw D.c();
            }
        }
    }

    public void q(List list) {
        int B6;
        int B7;
        boolean z3 = list instanceof K;
        d dVar = (d) this.d;
        if (z3) {
            K k6 = (K) list;
            int i2 = this.f6829a & 7;
            if (i2 == 1) {
                do {
                    k6.v(dVar.w());
                    if (!dVar.g()) {
                        B7 = dVar.B();
                    } else {
                        return;
                    }
                } while (B7 == this.f6829a);
                this.f6831c = B7;
            } else if (i2 == 2) {
                int C6 = dVar.C();
                z(C6);
                int f6 = dVar.f() + C6;
                do {
                    k6.v(dVar.w());
                } while (dVar.f() < f6);
            } else {
                throw D.c();
            }
        } else {
            int i5 = this.f6829a & 7;
            if (i5 == 1) {
                do {
                    list.add(Long.valueOf(dVar.w()));
                    if (!dVar.g()) {
                        B6 = dVar.B();
                    } else {
                        return;
                    }
                } while (B6 == this.f6829a);
                this.f6831c = B6;
            } else if (i5 == 2) {
                int C7 = dVar.C();
                z(C7);
                int f7 = dVar.f() + C7;
                do {
                    list.add(Long.valueOf(dVar.w()));
                } while (dVar.f() < f7);
            } else {
                throw D.c();
            }
        }
    }

    public void r(List list) {
        int B6;
        int B7;
        boolean z3 = list instanceof C0419y;
        d dVar = (d) this.d;
        if (z3) {
            C0419y yVar = (C0419y) list;
            int i2 = this.f6829a & 7;
            if (i2 == 0) {
                do {
                    yVar.v(dVar.x());
                    if (!dVar.g()) {
                        B7 = dVar.B();
                    } else {
                        return;
                    }
                } while (B7 == this.f6829a);
                this.f6831c = B7;
            } else if (i2 == 2) {
                int f6 = dVar.f() + dVar.C();
                do {
                    yVar.v(dVar.x());
                } while (dVar.f() < f6);
                w(f6);
            } else {
                throw D.c();
            }
        } else {
            int i5 = this.f6829a & 7;
            if (i5 == 0) {
                do {
                    list.add(Integer.valueOf(dVar.x()));
                    if (!dVar.g()) {
                        B6 = dVar.B();
                    } else {
                        return;
                    }
                } while (B6 == this.f6829a);
                this.f6831c = B6;
            } else if (i5 == 2) {
                int f7 = dVar.f() + dVar.C();
                do {
                    list.add(Integer.valueOf(dVar.x()));
                } while (dVar.f() < f7);
                w(f7);
            } else {
                throw D.c();
            }
        }
    }

    public void s(List list) {
        int B6;
        int B7;
        boolean z3 = list instanceof K;
        d dVar = (d) this.d;
        if (z3) {
            K k6 = (K) list;
            int i2 = this.f6829a & 7;
            if (i2 == 0) {
                do {
                    k6.v(dVar.y());
                    if (!dVar.g()) {
                        B7 = dVar.B();
                    } else {
                        return;
                    }
                } while (B7 == this.f6829a);
                this.f6831c = B7;
            } else if (i2 == 2) {
                int f6 = dVar.f() + dVar.C();
                do {
                    k6.v(dVar.y());
                } while (dVar.f() < f6);
                w(f6);
            } else {
                throw D.c();
            }
        } else {
            int i5 = this.f6829a & 7;
            if (i5 == 0) {
                do {
                    list.add(Long.valueOf(dVar.y()));
                    if (!dVar.g()) {
                        B6 = dVar.B();
                    } else {
                        return;
                    }
                } while (B6 == this.f6829a);
                this.f6831c = B6;
            } else if (i5 == 2) {
                int f7 = dVar.f() + dVar.C();
                do {
                    list.add(Long.valueOf(dVar.y()));
                } while (dVar.f() < f7);
                w(f7);
            } else {
                throw D.c();
            }
        }
    }

    public void t(List list, boolean z3) {
        String str;
        int B6;
        int B7;
        if ((this.f6829a & 7) == 2) {
            boolean z4 = list instanceof G;
            d dVar = (d) this.d;
            if (!z4 || z3) {
                do {
                    if (z3) {
                        x(2);
                        str = dVar.A();
                    } else {
                        x(2);
                        str = dVar.z();
                    }
                    list.add(str);
                    if (!dVar.g()) {
                        B6 = dVar.B();
                    } else {
                        return;
                    }
                } while (B6 == this.f6829a);
                this.f6831c = B6;
                return;
            }
            G g = (G) list;
            do {
                g.e(g());
                if (!dVar.g()) {
                    B7 = dVar.B();
                } else {
                    return;
                }
            } while (B7 == this.f6829a);
            this.f6831c = B7;
            return;
        }
        throw D.c();
    }

    public void u(List list) {
        int B6;
        int B7;
        boolean z3 = list instanceof C0419y;
        d dVar = (d) this.d;
        if (z3) {
            C0419y yVar = (C0419y) list;
            int i2 = this.f6829a & 7;
            if (i2 == 0) {
                do {
                    yVar.v(dVar.C());
                    if (!dVar.g()) {
                        B7 = dVar.B();
                    } else {
                        return;
                    }
                } while (B7 == this.f6829a);
                this.f6831c = B7;
            } else if (i2 == 2) {
                int f6 = dVar.f() + dVar.C();
                do {
                    yVar.v(dVar.C());
                } while (dVar.f() < f6);
                w(f6);
            } else {
                throw D.c();
            }
        } else {
            int i5 = this.f6829a & 7;
            if (i5 == 0) {
                do {
                    list.add(Integer.valueOf(dVar.C()));
                    if (!dVar.g()) {
                        B6 = dVar.B();
                    } else {
                        return;
                    }
                } while (B6 == this.f6829a);
                this.f6831c = B6;
            } else if (i5 == 2) {
                int f7 = dVar.f() + dVar.C();
                do {
                    list.add(Integer.valueOf(dVar.C()));
                } while (dVar.f() < f7);
                w(f7);
            } else {
                throw D.c();
            }
        }
    }

    public void v(List list) {
        int B6;
        int B7;
        boolean z3 = list instanceof K;
        d dVar = (d) this.d;
        if (z3) {
            K k6 = (K) list;
            int i2 = this.f6829a & 7;
            if (i2 == 0) {
                do {
                    k6.v(dVar.D());
                    if (!dVar.g()) {
                        B7 = dVar.B();
                    } else {
                        return;
                    }
                } while (B7 == this.f6829a);
                this.f6831c = B7;
            } else if (i2 == 2) {
                int f6 = dVar.f() + dVar.C();
                do {
                    k6.v(dVar.D());
                } while (dVar.f() < f6);
                w(f6);
            } else {
                throw D.c();
            }
        } else {
            int i5 = this.f6829a & 7;
            if (i5 == 0) {
                do {
                    list.add(Long.valueOf(dVar.D()));
                    if (!dVar.g()) {
                        B6 = dVar.B();
                    } else {
                        return;
                    }
                } while (B6 == this.f6829a);
                this.f6831c = B6;
            } else if (i5 == 2) {
                int f7 = dVar.f() + dVar.C();
                do {
                    list.add(Long.valueOf(dVar.D()));
                } while (dVar.f() < f7);
                w(f7);
            } else {
                throw D.c();
            }
        }
    }

    public void w(int i2) {
        if (((d) this.d).f() != i2) {
            throw D.g();
        }
    }

    public void x(int i2) {
        if ((this.f6829a & 7) != i2) {
            throw D.c();
        }
    }
}
