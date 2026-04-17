package I0;

import B0.D;
import K0.c;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.io.File;
import z0.i;
import z0.k;

public final class C implements k {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1093a;

    public /* synthetic */ C(int i2) {
        this.f1093a = i2;
    }

    public final D a(Object obj, int i2, int i5, i iVar) {
        switch (this.f1093a) {
            case 0:
                return new B((Bitmap) obj, 0);
            case 1:
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    return new c(drawable, 0);
                }
                return null;
            default:
                return new B((File) obj);
        }
    }

    public final /* bridge */ /* synthetic */ boolean b(Object obj, i iVar) {
        switch (this.f1093a) {
            case 0:
                Bitmap bitmap = (Bitmap) obj;
                return true;
            case 1:
                Drawable drawable = (Drawable) obj;
                return true;
            default:
                File file = (File) obj;
                return true;
        }
    }
}
