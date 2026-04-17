package I0;

import C0.b;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.util.Log;
import java.security.MessageDigest;
import z0.C1130f;

public final class i extends C0058e {

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f1116b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(C1130f.f12789a);

    public final void a(MessageDigest messageDigest) {
        messageDigest.update(f1116b);
    }

    public final Bitmap c(b bVar, Bitmap bitmap, int i2, int i5) {
        Paint paint = A.f1089a;
        if (bitmap.getWidth() > i2 || bitmap.getHeight() > i5) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
            }
            return A.b(bVar, bitmap, i2, i5);
        } else if (!Log.isLoggable("TransformationUtils", 2)) {
            return bitmap;
        } else {
            Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
            return bitmap;
        }
    }

    public final boolean equals(Object obj) {
        return obj instanceof i;
    }

    public final int hashCode() {
        return -670243078;
    }
}
