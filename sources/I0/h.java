package I0;

import C0.b;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.security.MessageDigest;
import z0.C1130f;

public final class h extends C0058e {

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f1115b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(C1130f.f12789a);

    public final void a(MessageDigest messageDigest) {
        messageDigest.update(f1115b);
    }

    public final Bitmap c(b bVar, Bitmap bitmap, int i2, int i5) {
        float f6;
        float f7;
        Bitmap.Config config;
        Paint paint = A.f1089a;
        if (bitmap.getWidth() == i2 && bitmap.getHeight() == i5) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f8 = 0.0f;
        if (bitmap.getWidth() * i5 > bitmap.getHeight() * i2) {
            f7 = ((float) i5) / ((float) bitmap.getHeight());
            f8 = (((float) i2) - (((float) bitmap.getWidth()) * f7)) * 0.5f;
            f6 = 0.0f;
        } else {
            f7 = ((float) i2) / ((float) bitmap.getWidth());
            f6 = (((float) i5) - (((float) bitmap.getHeight()) * f7)) * 0.5f;
        }
        matrix.setScale(f7, f7);
        matrix.postTranslate((float) ((int) (f8 + 0.5f)), (float) ((int) (f6 + 0.5f)));
        if (bitmap.getConfig() != null) {
            config = bitmap.getConfig();
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap d = bVar.d(i2, i5, config);
        d.setHasAlpha(bitmap.hasAlpha());
        A.a(bitmap, d, matrix);
        return d;
    }

    public final boolean equals(Object obj) {
        return obj instanceof h;
    }

    public final int hashCode() {
        return -599754482;
    }
}
