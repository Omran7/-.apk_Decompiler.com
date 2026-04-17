package com.google.crypto.tink.shaded.protobuf;

import sun.misc.Unsafe;

public final class m0 extends o0 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f6838b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(Unsafe unsafe, int i2) {
        super(unsafe);
        this.f6838b = i2;
    }

    public final boolean c(Object obj, long j6) {
        switch (this.f6838b) {
            case 0:
                if (p0.g) {
                    if (p0.h(obj, j6) == 0) {
                        return false;
                    }
                } else if (p0.i(obj, j6) == 0) {
                    return false;
                }
                return true;
            default:
                if (p0.g) {
                    if (p0.h(obj, j6) == 0) {
                        return false;
                    }
                } else if (p0.i(obj, j6) == 0) {
                    return false;
                }
                return true;
        }
    }

    public final byte d(Object obj, long j6) {
        switch (this.f6838b) {
            case 0:
                if (p0.g) {
                    return p0.h(obj, j6);
                }
                return p0.i(obj, j6);
            default:
                if (p0.g) {
                    return p0.h(obj, j6);
                }
                return p0.i(obj, j6);
        }
    }

    public final double e(Object obj, long j6) {
        switch (this.f6838b) {
            case 0:
                return Double.longBitsToDouble(h(obj, j6));
            default:
                return Double.longBitsToDouble(h(obj, j6));
        }
    }

    public final float f(Object obj, long j6) {
        switch (this.f6838b) {
            case 0:
                return Float.intBitsToFloat(g(obj, j6));
            default:
                return Float.intBitsToFloat(g(obj, j6));
        }
    }

    public final void k(Object obj, long j6, boolean z3) {
        switch (this.f6838b) {
            case 0:
                if (p0.g) {
                    p0.p(obj, j6, z3 ? (byte) 1 : 0);
                    return;
                } else {
                    p0.q(obj, j6, z3 ? (byte) 1 : 0);
                    return;
                }
            default:
                if (p0.g) {
                    p0.p(obj, j6, z3 ? (byte) 1 : 0);
                    return;
                } else {
                    p0.q(obj, j6, z3 ? (byte) 1 : 0);
                    return;
                }
        }
    }

    public final void l(Object obj, long j6, byte b6) {
        switch (this.f6838b) {
            case 0:
                if (p0.g) {
                    p0.p(obj, j6, b6);
                    return;
                } else {
                    p0.q(obj, j6, b6);
                    return;
                }
            default:
                if (p0.g) {
                    p0.p(obj, j6, b6);
                    return;
                } else {
                    p0.q(obj, j6, b6);
                    return;
                }
        }
    }

    public final void m(Object obj, long j6, double d) {
        switch (this.f6838b) {
            case 0:
                p(obj, j6, Double.doubleToLongBits(d));
                return;
            default:
                p(obj, j6, Double.doubleToLongBits(d));
                return;
        }
    }

    public final void n(Object obj, long j6, float f6) {
        switch (this.f6838b) {
            case 0:
                o(j6, obj, Float.floatToIntBits(f6));
                return;
            default:
                o(j6, obj, Float.floatToIntBits(f6));
                return;
        }
    }

    public final boolean s() {
        switch (this.f6838b) {
            case 0:
                return false;
            default:
                return false;
        }
    }
}
