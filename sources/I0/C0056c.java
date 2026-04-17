package I0;

import B0.D;
import C0.b;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import s2.e;
import y0.d;
import z0.i;
import z0.k;

/* renamed from: I0.c  reason: case insensitive filesystem */
public final class C0056c implements k {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1106a;

    /* renamed from: b  reason: collision with root package name */
    public final b f1107b;

    public C0056c() {
        this.f1106a = 0;
        this.f1107b = new e(3);
    }

    public final D a(Object obj, int i2, int i5, i iVar) {
        switch (this.f1106a) {
            case 0:
                return c(G1.e.f(obj), i2, i5, iVar);
            default:
                return C0057d.e(this.f1107b, ((d) obj).b());
        }
    }

    public final /* bridge */ /* synthetic */ boolean b(Object obj, i iVar) {
        switch (this.f1106a) {
            case 0:
                G1.e.x(obj);
                return true;
            default:
                d dVar = (d) obj;
                return true;
        }
    }

    public C0057d c(ImageDecoder.Source source, int i2, int i5, i iVar) {
        Bitmap d = ImageDecoder.decodeBitmap(source, new H0.b(i2, i5, iVar));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + d.getWidth() + "x" + d.getHeight() + "] for [" + i2 + "x" + i5 + "]");
        }
        return new C0057d((b) (e) this.f1107b, d);
    }

    public C0056c(b bVar) {
        this.f1106a = 1;
        this.f1107b = bVar;
    }
}
