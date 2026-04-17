package I0;

import C0.b;
import android.graphics.Bitmap;
import java.security.MessageDigest;
import z0.C1130f;

public final class v extends C0058e {

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f1137b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(C1130f.f12789a);

    public final void a(MessageDigest messageDigest) {
        messageDigest.update(f1137b);
    }

    public final Bitmap c(b bVar, Bitmap bitmap, int i2, int i5) {
        return A.b(bVar, bitmap, i2, i5);
    }

    public final boolean equals(Object obj) {
        return obj instanceof v;
    }

    public final int hashCode() {
        return 1572326941;
    }
}
