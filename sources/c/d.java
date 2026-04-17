package C;

import android.graphics.Color;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal f372a = new ThreadLocal();

    public static int a(double d, double d6, double d7) {
        double d8;
        double d9;
        double d10;
        int i2;
        int i5;
        double d11 = ((-0.4986d * d7) + ((-1.5372d * d6) + (3.2406d * d))) / 100.0d;
        double d12 = ((0.0415d * d7) + ((1.8758d * d6) + (-0.9689d * d))) / 100.0d;
        double d13 = ((1.057d * d7) + ((-0.204d * d6) + (0.0557d * d))) / 100.0d;
        if (d11 > 0.0031308d) {
            d8 = (Math.pow(d11, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d8 = d11 * 12.92d;
        }
        if (d12 > 0.0031308d) {
            d9 = (Math.pow(d12, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d9 = d12 * 12.92d;
        }
        if (d13 > 0.0031308d) {
            d10 = (Math.pow(d13, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d10 = d13 * 12.92d;
        }
        int round = (int) Math.round(d8 * 255.0d);
        int i6 = 0;
        if (round < 0) {
            i2 = 0;
        } else {
            i2 = Math.min(round, 255);
        }
        int round2 = (int) Math.round(d9 * 255.0d);
        if (round2 < 0) {
            i5 = 0;
        } else {
            i5 = Math.min(round2, 255);
        }
        int round3 = (int) Math.round(d10 * 255.0d);
        if (round3 >= 0) {
            i6 = Math.min(round3, 255);
        }
        return Color.rgb(i2, i5, i6);
    }

    public static int b(int i2, int i5) {
        int alpha = Color.alpha(i5);
        int alpha2 = Color.alpha(i2);
        int i6 = 255 - (((255 - alpha2) * (255 - alpha)) / 255);
        return Color.argb(i6, c(Color.red(i2), alpha2, Color.red(i5), alpha, i6), c(Color.green(i2), alpha2, Color.green(i5), alpha, i6), c(Color.blue(i2), alpha2, Color.blue(i5), alpha, i6));
    }

    public static int c(int i2, int i5, int i6, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        return (((255 - i5) * (i6 * i7)) + ((i2 * 255) * i5)) / (i8 * 255);
    }

    public static int d(int i2, int i5) {
        if (i5 >= 0 && i5 <= 255) {
            return (i2 & 16777215) | (i5 << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }
}
