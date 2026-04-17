package I0;

import B0.D;
import C0.b;
import U0.o;
import android.content.Context;
import android.graphics.Bitmap;
import z0.m;

/* renamed from: I0.e  reason: case insensitive filesystem */
public abstract class C0058e implements m {
    public final D b(Context context, D d, int i2, int i5) {
        if (o.i(i2, i5)) {
            b bVar = com.bumptech.glide.b.a(context).f5727a;
            Bitmap bitmap = (Bitmap) d.get();
            if (i2 == Integer.MIN_VALUE) {
                i2 = bitmap.getWidth();
            }
            if (i5 == Integer.MIN_VALUE) {
                i5 = bitmap.getHeight();
            }
            Bitmap c3 = c(bVar, bitmap, i2, i5);
            if (bitmap.equals(c3)) {
                return d;
            }
            return C0057d.e(bVar, c3);
        }
        throw new IllegalArgumentException("Cannot apply transformation on width: " + i2 + " or height: " + i5 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
    }

    public abstract Bitmap c(b bVar, Bitmap bitmap, int i2, int i5);
}
