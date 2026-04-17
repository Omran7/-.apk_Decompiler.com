package B;

import C.d;
import android.graphics.Color;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final float f133a;

    /* renamed from: b  reason: collision with root package name */
    public final float f134b;

    /* renamed from: c  reason: collision with root package name */
    public final float f135c;
    public final float d;

    /* renamed from: e  reason: collision with root package name */
    public final float f136e;

    /* renamed from: f  reason: collision with root package name */
    public final float f137f;

    public a(float f6, float f7, float f8, float f9, float f10, float f11) {
        this.f133a = f6;
        this.f134b = f7;
        this.f135c = f8;
        this.d = f9;
        this.f136e = f10;
        this.f137f = f11;
    }

    public static a a(int i2) {
        float f6;
        q qVar = q.f167k;
        float e6 = b.e(Color.red(i2));
        float e7 = b.e(Color.green(i2));
        float e8 = b.e(Color.blue(i2));
        float[][] fArr = b.d;
        float[] fArr2 = fArr[0];
        float f7 = fArr2[1] * e7;
        float f8 = (fArr2[2] * e8) + f7 + (fArr2[0] * e6);
        float[] fArr3 = fArr[1];
        float f9 = fArr3[1] * e7;
        float f10 = (fArr3[2] * e8) + f9 + (fArr3[0] * e6);
        float[] fArr4 = fArr[2];
        float f11 = (e8 * fArr4[2]) + (e7 * fArr4[1]) + (e6 * fArr4[0]);
        float[][] fArr5 = b.f138a;
        float[] fArr6 = fArr5[0];
        float f12 = fArr6[1] * f10;
        float f13 = (fArr6[2] * f11) + f12 + (fArr6[0] * f8);
        float[] fArr7 = fArr5[1];
        float f14 = fArr7[1] * f10;
        float f15 = fArr7[2] * f11;
        float[] fArr8 = fArr5[2];
        float f16 = f8 * fArr8[0];
        float f17 = f11 * fArr8[2];
        float[] fArr9 = qVar.g;
        float f18 = fArr9[0] * f13;
        float f19 = fArr9[1] * (f15 + f14 + (fArr7[0] * f8));
        float f20 = fArr9[2] * (f17 + (f10 * fArr8[1]) + f16);
        float abs = Math.abs(f18);
        float f21 = qVar.h;
        float pow = (float) Math.pow(((double) (abs * f21)) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow(((double) (Math.abs(f19) * f21)) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow(((double) (Math.abs(f20) * f21)) / 100.0d, 0.42d);
        float signum = ((Math.signum(f18) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f19) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f20) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d6 = (double) signum3;
        float f22 = ((float) (((((double) signum2) * -12.0d) + (((double) signum) * 11.0d)) + d6)) / 11.0f;
        float f23 = ((float) (((double) (signum + signum2)) - (d6 * 2.0d))) / 9.0f;
        float f24 = signum2 * 20.0f;
        float f25 = ((21.0f * signum3) + ((signum * 20.0f) + f24)) / 20.0f;
        float f26 = (((signum * 40.0f) + f24) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2((double) f23, (double) f22)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f27 = atan2;
        float f28 = (3.1415927f * f27) / 180.0f;
        float f29 = f26 * qVar.f169b;
        float f30 = qVar.f168a;
        float f31 = qVar.d;
        float pow4 = ((float) Math.pow((double) (f29 / f30), (double) (qVar.f174j * f31))) * 100.0f;
        Math.sqrt((double) (pow4 / 100.0f));
        float f32 = f30 + 4.0f;
        if (((double) f27) < 20.14d) {
            f6 = 360.0f + f27;
        } else {
            f6 = f27;
        }
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, (double) qVar.f172f), 0.73d)) * ((float) Math.pow((double) ((((((((float) (Math.cos(((((double) f6) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * qVar.f171e) * qVar.f170c) * ((float) Math.sqrt((double) ((f23 * f23) + (f22 * f22))))) / (f25 + 0.305f)), 0.9d));
        float sqrt = pow5 * ((float) Math.sqrt(((double) pow4) / 100.0d));
        Math.sqrt((double) ((pow5 * f31) / f32));
        float f33 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((double) ((qVar.f173i * sqrt * 0.0228f) + 1.0f))) * 43.85965f;
        double d7 = (double) f28;
        return new a(f27, sqrt, pow4, f33, log * ((float) Math.cos(d7)), log * ((float) Math.sin(d7)));
    }

    public static a b(float f6, float f7, float f8) {
        q qVar = q.f167k;
        float f9 = qVar.d;
        double d6 = ((double) f6) / 100.0d;
        Math.sqrt(d6);
        Math.sqrt((double) (((f7 / ((float) Math.sqrt(d6))) * qVar.d) / (qVar.f168a + 4.0f)));
        float f10 = (1.7f * f6) / ((0.007f * f6) + 1.0f);
        float log = ((float) Math.log((((double) (qVar.f173i * f7)) * 0.0228d) + 1.0d)) * 43.85965f;
        double d7 = (double) ((3.1415927f * f8) / 180.0f);
        return new a(f8, f7, f6, f10, log * ((float) Math.cos(d7)), log * ((float) Math.sin(d7)));
    }

    public final int c(q qVar) {
        float f6;
        q qVar2 = qVar;
        float f7 = this.f134b;
        int i2 = (((double) f7) > 0.0d ? 1 : (((double) f7) == 0.0d ? 0 : -1));
        float f8 = this.f135c;
        if (i2 != 0) {
            double d6 = (double) f8;
            if (d6 != 0.0d) {
                f6 = f7 / ((float) Math.sqrt(d6 / 100.0d));
                float pow = (float) Math.pow(((double) f6) / Math.pow(1.64d - Math.pow(0.29d, (double) qVar2.f172f), 0.73d), 1.1111111111111112d);
                double d7 = (double) ((this.f133a * 3.1415927f) / 180.0f);
                float pow2 = qVar2.f168a * ((float) Math.pow(((double) f8) / 100.0d, (1.0d / ((double) qVar2.d)) / ((double) qVar2.f174j)));
                float cos = ((float) (Math.cos(2.0d + d7) + 3.8d)) * 0.25f * 3846.1538f * qVar2.f171e * qVar2.f170c;
                float f9 = pow2 / qVar2.f169b;
                float sin = (float) Math.sin(d7);
                float cos2 = (float) Math.cos(d7);
                float f10 = 11.0f * pow * cos2;
                float f11 = (((0.305f + f9) * 23.0f) * pow) / (((pow * 108.0f) * sin) + (f10 + (cos * 23.0f)));
                float f12 = cos2 * f11;
                float f13 = f11 * sin;
                float f14 = f9 * 460.0f;
                float f15 = ((288.0f * f13) + ((451.0f * f12) + f14)) / 1403.0f;
                float f16 = ((f14 - (891.0f * f12)) - (261.0f * f13)) / 1403.0f;
                float f17 = ((f14 - (f12 * 220.0f)) - (f13 * 6300.0f)) / 1403.0f;
                float max = (float) Math.max(0.0d, (((double) Math.abs(f15)) * 27.13d) / (400.0d - ((double) Math.abs(f15))));
                float signum = Math.signum(f15);
                float f18 = 100.0f / qVar2.h;
                float pow3 = signum * f18 * ((float) Math.pow((double) max, 2.380952380952381d));
                float signum2 = Math.signum(f16) * f18 * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f16)) * 27.13d) / (400.0d - ((double) Math.abs(f16))))), 2.380952380952381d));
                float[] fArr = qVar2.g;
                float f19 = pow3 / fArr[0];
                float f20 = signum2 / fArr[1];
                float signum3 = ((Math.signum(f17) * f18) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f17)) * 27.13d) / (400.0d - ((double) Math.abs(f17))))), 2.380952380952381d))) / fArr[2];
                float[][] fArr2 = b.f139b;
                float[] fArr3 = fArr2[0];
                float f21 = fArr3[1] * f20;
                float f22 = (fArr3[2] * signum3) + f21 + (fArr3[0] * f19);
                float[] fArr4 = fArr2[1];
                float f23 = fArr4[1] * f20;
                float f24 = fArr4[2] * signum3;
                float[] fArr5 = fArr2[2];
                float f25 = f19 * fArr5[0];
                return d.a((double) f22, (double) (f24 + f23 + (fArr4[0] * f19)), (double) ((signum3 * fArr5[2]) + (f20 * fArr5[1]) + f25));
            }
        }
        f6 = 0.0f;
        float pow4 = (float) Math.pow(((double) f6) / Math.pow(1.64d - Math.pow(0.29d, (double) qVar2.f172f), 0.73d), 1.1111111111111112d);
        double d72 = (double) ((this.f133a * 3.1415927f) / 180.0f);
        float pow22 = qVar2.f168a * ((float) Math.pow(((double) f8) / 100.0d, (1.0d / ((double) qVar2.d)) / ((double) qVar2.f174j)));
        float cos3 = ((float) (Math.cos(2.0d + d72) + 3.8d)) * 0.25f * 3846.1538f * qVar2.f171e * qVar2.f170c;
        float f92 = pow22 / qVar2.f169b;
        float sin2 = (float) Math.sin(d72);
        float cos22 = (float) Math.cos(d72);
        float f102 = 11.0f * pow4 * cos22;
        float f112 = (((0.305f + f92) * 23.0f) * pow4) / (((pow4 * 108.0f) * sin2) + (f102 + (cos3 * 23.0f)));
        float f122 = cos22 * f112;
        float f132 = f112 * sin2;
        float f142 = f92 * 460.0f;
        float f152 = ((288.0f * f132) + ((451.0f * f122) + f142)) / 1403.0f;
        float f162 = ((f142 - (891.0f * f122)) - (261.0f * f132)) / 1403.0f;
        float f172 = ((f142 - (f122 * 220.0f)) - (f132 * 6300.0f)) / 1403.0f;
        float max2 = (float) Math.max(0.0d, (((double) Math.abs(f152)) * 27.13d) / (400.0d - ((double) Math.abs(f152))));
        float signum4 = Math.signum(f152);
        float f182 = 100.0f / qVar2.h;
        float pow32 = signum4 * f182 * ((float) Math.pow((double) max2, 2.380952380952381d));
        float signum22 = Math.signum(f162) * f182 * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f162)) * 27.13d) / (400.0d - ((double) Math.abs(f162))))), 2.380952380952381d));
        float[] fArr6 = qVar2.g;
        float f192 = pow32 / fArr6[0];
        float f202 = signum22 / fArr6[1];
        float signum32 = ((Math.signum(f172) * f182) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f172)) * 27.13d) / (400.0d - ((double) Math.abs(f172))))), 2.380952380952381d))) / fArr6[2];
        float[][] fArr22 = b.f139b;
        float[] fArr32 = fArr22[0];
        float f212 = fArr32[1] * f202;
        float f222 = (fArr32[2] * signum32) + f212 + (fArr32[0] * f192);
        float[] fArr42 = fArr22[1];
        float f232 = fArr42[1] * f202;
        float f242 = fArr42[2] * signum32;
        float[] fArr52 = fArr22[2];
        float f252 = f192 * fArr52[0];
        return d.a((double) f222, (double) (f242 + f232 + (fArr42[0] * f192)), (double) ((signum32 * fArr52[2]) + (f202 * fArr52[1]) + f252));
    }
}
