package I0;

import B0.D;
import U0.g;
import U0.o;
import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import java.io.File;

public final class B implements D {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1091a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f1092b;

    public /* synthetic */ B(Object obj, int i2) {
        this.f1091a = i2;
        this.f1092b = obj;
    }

    public final int b() {
        switch (this.f1091a) {
            case 0:
                return o.c((Bitmap) this.f1092b);
            case 1:
                return ((byte[]) this.f1092b).length;
            case 2:
                return o.d(Bitmap.Config.ARGB_8888) * ((AnimatedImageDrawable) this.f1092b).getIntrinsicHeight() * ((AnimatedImageDrawable) this.f1092b).getIntrinsicWidth() * 2;
            default:
                return 1;
        }
    }

    public final Class c() {
        switch (this.f1091a) {
            case 0:
                return Bitmap.class;
            case 1:
                return byte[].class;
            case 2:
                return Drawable.class;
            default:
                return ((File) this.f1092b).getClass();
        }
    }

    public final void d() {
        switch (this.f1091a) {
            case 0:
            case 1:
                return;
            case 2:
                ((AnimatedImageDrawable) this.f1092b).stop();
                ((AnimatedImageDrawable) this.f1092b).clearAnimationCallbacks();
                return;
            default:
                return;
        }
    }

    public final Object get() {
        switch (this.f1091a) {
            case 0:
                return (Bitmap) this.f1092b;
            case 1:
                return (byte[]) this.f1092b;
            case 2:
                return (AnimatedImageDrawable) this.f1092b;
            default:
                return (File) this.f1092b;
        }
    }

    public B(byte[] bArr) {
        this.f1091a = 1;
        g.c(bArr, "Argument must not be null");
        this.f1092b = bArr;
    }

    public B(File file) {
        this.f1091a = 3;
        g.c(file, "Argument must not be null");
        this.f1092b = file;
    }

    private final void a() {
    }

    private final void e() {
    }

    private final void f() {
    }
}
