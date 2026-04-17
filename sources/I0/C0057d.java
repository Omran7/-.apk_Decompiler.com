package I0;

import B0.D;
import B0.z;
import C0.b;
import U0.g;
import U0.o;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* renamed from: I0.d  reason: case insensitive filesystem */
public final class C0057d implements D, z {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1108a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final Object f1109b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f1110c;

    public C0057d(b bVar, Bitmap bitmap) {
        g.c(bitmap, "Bitmap must not be null");
        this.f1109b = bitmap;
        g.c(bVar, "BitmapPool must not be null");
        this.f1110c = bVar;
    }

    public static C0057d e(b bVar, Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return new C0057d(bVar, bitmap);
    }

    public final void a() {
        switch (this.f1108a) {
            case 0:
                ((Bitmap) this.f1109b).prepareToDraw();
                return;
            default:
                D d = (D) this.f1110c;
                if (d instanceof z) {
                    ((z) d).a();
                    return;
                }
                return;
        }
    }

    public final int b() {
        switch (this.f1108a) {
            case 0:
                return o.c((Bitmap) this.f1109b);
            default:
                return ((D) this.f1110c).b();
        }
    }

    public final Class c() {
        switch (this.f1108a) {
            case 0:
                return Bitmap.class;
            default:
                return BitmapDrawable.class;
        }
    }

    public final void d() {
        switch (this.f1108a) {
            case 0:
                ((b) this.f1110c).f((Bitmap) this.f1109b);
                return;
            default:
                ((D) this.f1110c).d();
                return;
        }
    }

    public final Object get() {
        switch (this.f1108a) {
            case 0:
                return (Bitmap) this.f1109b;
            default:
                return new BitmapDrawable((Resources) this.f1109b, (Bitmap) ((D) this.f1110c).get());
        }
    }

    public C0057d(Resources resources, D d) {
        g.c(resources, "Argument must not be null");
        this.f1109b = resources;
        g.c(d, "Argument must not be null");
        this.f1110c = d;
    }
}
