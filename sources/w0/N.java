package W0;

import android.graphics.PointF;
import android.graphics.RectF;

public final class N {

    /* renamed from: a  reason: collision with root package name */
    public final M f3905a;

    /* renamed from: b  reason: collision with root package name */
    public final float f3906b;

    /* renamed from: c  reason: collision with root package name */
    public final float f3907c;
    public final float d;

    /* renamed from: e  reason: collision with root package name */
    public final float f3908e;

    /* renamed from: f  reason: collision with root package name */
    public final PointF f3909f;

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0061, code lost:
        r7 = r7 - r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0068, code lost:
        r1 = r7 - r9;
        r7 = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008f, code lost:
        r0.x = r1;
        r0.y = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0093, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public N(W0.M r7, W0.L r8, float r9, float r10) {
        /*
            r6 = this;
            java.lang.String r0 = "cropWindowHandler"
            kotlin.jvm.internal.j.e(r8, r0)
            r6.<init>()
            r6.f3905a = r7
            float r0 = r8.f3889c
            float r1 = r8.g
            float r2 = r8.f3894k
            float r1 = r1 / r2
            int r3 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r3 >= 0) goto L_0x0016
            r0 = r1
        L_0x0016:
            r6.f3906b = r0
            float r0 = r8.d
            float r1 = r8.h
            float r3 = r8.f3895l
            float r1 = r1 / r3
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 >= 0) goto L_0x0024
            r0 = r1
        L_0x0024:
            r6.f3907c = r0
            float r0 = r8.f3890e
            float r1 = r8.f3892i
            float r1 = r1 / r2
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 <= 0) goto L_0x0030
            r0 = r1
        L_0x0030:
            r6.d = r0
            float r0 = r8.f3891f
            float r1 = r8.f3893j
            float r1 = r1 / r3
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 <= 0) goto L_0x003c
            r0 = r1
        L_0x003c:
            r6.f3908e = r0
            android.graphics.PointF r0 = new android.graphics.PointF
            r1 = 0
            r0.<init>(r1, r1)
            r6.f3909f = r0
            android.graphics.RectF r8 = r8.c()
            int r7 = r7.ordinal()
            switch(r7) {
                case 0: goto L_0x0088;
                case 1: goto L_0x0081;
                case 2: goto L_0x007a;
                case 3: goto L_0x0073;
                case 4: goto L_0x0070;
                case 5: goto L_0x006d;
                case 6: goto L_0x0066;
                case 7: goto L_0x0063;
                case 8: goto L_0x0057;
                default: goto L_0x0051;
            }
        L_0x0051:
            G5.w r7 = new G5.w
            r7.<init>()
            throw r7
        L_0x0057:
            float r7 = r8.centerX()
            float r1 = r7 - r9
            float r7 = r8.centerY()
        L_0x0061:
            float r7 = r7 - r10
            goto L_0x008f
        L_0x0063:
            float r7 = r8.bottom
            goto L_0x0061
        L_0x0066:
            float r7 = r8.right
        L_0x0068:
            float r7 = r7 - r9
            r5 = r1
            r1 = r7
            r7 = r5
            goto L_0x008f
        L_0x006d:
            float r7 = r8.top
            goto L_0x0061
        L_0x0070:
            float r7 = r8.left
            goto L_0x0068
        L_0x0073:
            float r7 = r8.right
            float r1 = r7 - r9
            float r7 = r8.bottom
            goto L_0x0061
        L_0x007a:
            float r7 = r8.left
            float r1 = r7 - r9
            float r7 = r8.bottom
            goto L_0x0061
        L_0x0081:
            float r7 = r8.right
            float r1 = r7 - r9
            float r7 = r8.top
            goto L_0x0061
        L_0x0088:
            float r7 = r8.left
            float r1 = r7 - r9
            float r7 = r8.top
            goto L_0x0061
        L_0x008f:
            r0.x = r1
            r0.y = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: W0.N.<init>(W0.M, W0.L, float, float):void");
    }

    public static void c(RectF rectF, RectF rectF2, float f6) {
        rectF.inset((rectF.width() - (rectF.height() * f6)) / ((float) 2), 0.0f);
        float f7 = rectF.left;
        float f8 = rectF2.left;
        if (f7 < f8) {
            rectF.offset(f8 - f7, 0.0f);
        }
        float f9 = rectF.right;
        float f10 = rectF2.right;
        if (f9 > f10) {
            rectF.offset(f10 - f9, 0.0f);
        }
    }

    public static void f(RectF rectF, RectF rectF2, float f6) {
        rectF.inset(0.0f, (rectF.height() - (rectF.width() / f6)) / ((float) 2));
        float f7 = rectF.top;
        float f8 = rectF2.top;
        if (f7 < f8) {
            rectF.offset(0.0f, f8 - f7);
        }
        float f9 = rectF.bottom;
        float f10 = rectF2.bottom;
        if (f9 > f10) {
            rectF.offset(0.0f, f10 - f9);
        }
    }

    public final void a(RectF rectF, float f6, RectF rectF2, int i2, float f7, float f8, boolean z3, boolean z4) {
        float f9 = (float) i2;
        int i5 = (f6 > f9 ? 1 : (f6 == f9 ? 0 : -1));
        PointF pointF = this.f3909f;
        if (i5 > 0) {
            f6 = ((f6 - f9) / 1.05f) + f9;
            pointF.y -= (f6 - f9) / 1.1f;
        }
        float f10 = rectF2.bottom;
        if (f6 > f10) {
            pointF.y -= (f6 - f10) / 2.0f;
        }
        if (f10 - f6 < f7) {
            f6 = f10;
        }
        float f11 = rectF.top;
        float f12 = this.f3907c;
        if (f6 - f11 < f12) {
            f6 = f11 + f12;
        }
        float f13 = this.f3908e;
        if (f6 - f11 > f13) {
            f6 = f11 + f13;
        }
        if (f10 - f6 < f7) {
            f6 = f10;
        }
        if (f8 > 0.0f) {
            float f14 = (f6 - f11) * f8;
            float f15 = this.f3906b;
            if (f14 < f15) {
                f6 = Math.min(f10, (f15 / f8) + f11);
                f14 = (f6 - rectF.top) * f8;
            }
            float f16 = this.d;
            if (f14 > f16) {
                f6 = Math.min(rectF2.bottom, (f16 / f8) + rectF.top);
                f14 = (f6 - rectF.top) * f8;
            }
            if (!z3 || !z4) {
                if (z3) {
                    float f17 = rectF.right;
                    float f18 = rectF2.left;
                    if (f17 - f14 < f18) {
                        f6 = Math.min(rectF2.bottom, ((f17 - f18) / f8) + rectF.top);
                        f14 = (f6 - rectF.top) * f8;
                    }
                }
                if (z4) {
                    float f19 = rectF.left;
                    float f20 = rectF2.right;
                    if (f14 + f19 > f20) {
                        f6 = Math.min(f6, Math.min(rectF2.bottom, ((f20 - f19) / f8) + rectF.top));
                    }
                }
            } else {
                f6 = Math.min(f6, Math.min(rectF2.bottom, (rectF2.width() / f8) + rectF.top));
            }
        }
        rectF.bottom = f6;
    }

    public final void b(RectF rectF, float f6, RectF rectF2, float f7, float f8, boolean z3, boolean z4) {
        int i2 = (f6 > 0.0f ? 1 : (f6 == 0.0f ? 0 : -1));
        PointF pointF = this.f3909f;
        if (i2 < 0) {
            f6 /= 1.05f;
            pointF.x -= f6 / 1.1f;
        }
        float f9 = rectF2.left;
        if (f6 < f9) {
            pointF.x -= (f6 - f9) / 2.0f;
        }
        if (f6 - f9 < f7) {
            f6 = f9;
        }
        float f10 = rectF.right;
        float f11 = this.f3906b;
        if (f10 - f6 < f11) {
            f6 = f10 - f11;
        }
        float f12 = this.d;
        if (f10 - f6 > f12) {
            f6 = f10 - f12;
        }
        if (f6 - f9 < f7) {
            f6 = f9;
        }
        if (f8 > 0.0f) {
            float f13 = (f10 - f6) / f8;
            float f14 = this.f3907c;
            if (f13 < f14) {
                f6 = Math.max(f9, f10 - (f14 * f8));
                f13 = (rectF.right - f6) / f8;
            }
            float f15 = this.f3908e;
            if (f13 > f15) {
                f6 = Math.max(rectF2.left, rectF.right - (f15 * f8));
                f13 = (rectF.right - f6) / f8;
            }
            if (!z3 || !z4) {
                if (z3) {
                    float f16 = rectF.bottom;
                    float f17 = rectF2.top;
                    if (f16 - f13 < f17) {
                        f6 = Math.max(rectF2.left, rectF.right - ((f16 - f17) * f8));
                        f13 = (rectF.right - f6) / f8;
                    }
                }
                if (z4) {
                    float f18 = rectF.top;
                    float f19 = rectF2.bottom;
                    if (f13 + f18 > f19) {
                        f6 = Math.max(f6, Math.max(rectF2.left, rectF.right - ((f19 - f18) * f8)));
                    }
                }
            } else {
                f6 = Math.max(f6, Math.max(rectF2.left, rectF.right - (rectF2.height() * f8)));
            }
        }
        rectF.left = f6;
    }

    public final void d(RectF rectF, float f6, RectF rectF2, int i2, float f7, float f8, boolean z3, boolean z4) {
        float f9 = (float) i2;
        int i5 = (f6 > f9 ? 1 : (f6 == f9 ? 0 : -1));
        PointF pointF = this.f3909f;
        if (i5 > 0) {
            f6 = ((f6 - f9) / 1.05f) + f9;
            pointF.x -= (f6 - f9) / 1.1f;
        }
        float f10 = rectF2.right;
        if (f6 > f10) {
            pointF.x -= (f6 - f10) / 2.0f;
        }
        if (f10 - f6 < f7) {
            f6 = f10;
        }
        float f11 = rectF.left;
        float f12 = this.f3906b;
        if (f6 - f11 < f12) {
            f6 = f11 + f12;
        }
        float f13 = this.d;
        if (f6 - f11 > f13) {
            f6 = f11 + f13;
        }
        if (f10 - f6 < f7) {
            f6 = f10;
        }
        if (f8 > 0.0f) {
            float f14 = (f6 - f11) / f8;
            float f15 = this.f3907c;
            if (f14 < f15) {
                f6 = Math.min(f10, (f15 * f8) + f11);
                f14 = (f6 - rectF.left) / f8;
            }
            float f16 = this.f3908e;
            if (f14 > f16) {
                f6 = Math.min(rectF2.right, (f16 * f8) + rectF.left);
                f14 = (f6 - rectF.left) / f8;
            }
            if (!z3 || !z4) {
                if (z3) {
                    float f17 = rectF.bottom;
                    float f18 = rectF2.top;
                    if (f17 - f14 < f18) {
                        f6 = Math.min(rectF2.right, ((f17 - f18) * f8) + rectF.left);
                        f14 = (f6 - rectF.left) / f8;
                    }
                }
                if (z4) {
                    float f19 = rectF.top;
                    float f20 = rectF2.bottom;
                    if (f14 + f19 > f20) {
                        f6 = Math.min(f6, Math.min(rectF2.right, ((f20 - f19) * f8) + rectF.left));
                    }
                }
            } else {
                f6 = Math.min(f6, Math.min(rectF2.right, (rectF2.height() * f8) + rectF.left));
            }
        }
        rectF.right = f6;
    }

    public final void e(RectF rectF, float f6, RectF rectF2, float f7, float f8, boolean z3, boolean z4) {
        int i2 = (f6 > 0.0f ? 1 : (f6 == 0.0f ? 0 : -1));
        PointF pointF = this.f3909f;
        if (i2 < 0) {
            f6 /= 1.05f;
            pointF.y -= f6 / 1.1f;
        }
        float f9 = rectF2.top;
        if (f6 < f9) {
            pointF.y -= (f6 - f9) / 2.0f;
        }
        if (f6 - f9 < f7) {
            f6 = f9;
        }
        float f10 = rectF.bottom;
        float f11 = this.f3907c;
        if (f10 - f6 < f11) {
            f6 = f10 - f11;
        }
        float f12 = this.f3908e;
        if (f10 - f6 > f12) {
            f6 = f10 - f12;
        }
        if (f6 - f9 < f7) {
            f6 = f9;
        }
        if (f8 > 0.0f) {
            float f13 = (f10 - f6) * f8;
            float f14 = this.f3906b;
            if (f13 < f14) {
                f6 = Math.max(f9, f10 - (f14 / f8));
                f13 = (rectF.bottom - f6) * f8;
            }
            float f15 = this.d;
            if (f13 > f15) {
                f6 = Math.max(rectF2.top, rectF.bottom - (f15 / f8));
                f13 = (rectF.bottom - f6) * f8;
            }
            if (!z3 || !z4) {
                if (z3) {
                    float f16 = rectF.right;
                    float f17 = rectF2.left;
                    if (f16 - f13 < f17) {
                        f6 = Math.max(rectF2.top, rectF.bottom - ((f16 - f17) / f8));
                        f13 = (rectF.bottom - f6) * f8;
                    }
                }
                if (z4) {
                    float f18 = rectF.left;
                    float f19 = rectF2.right;
                    if (f13 + f18 > f19) {
                        f6 = Math.max(f6, Math.max(rectF2.top, rectF.bottom - ((f19 - f18) / f8)));
                    }
                }
            } else {
                f6 = Math.max(f6, Math.max(rectF2.top, rectF.bottom - (rectF2.width() / f8)));
            }
        }
        rectF.top = f6;
    }
}
