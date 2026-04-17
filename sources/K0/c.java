package K0;

import B0.D;
import B0.z;
import C0.b;
import M0.e;
import M0.h;
import U0.g;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.l;
import y0.d;

public final class c implements D, z {

    /* renamed from: a  reason: collision with root package name */
    public final Drawable f1444a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f1445b;

    public c(Drawable drawable, int i2) {
        this.f1445b = i2;
        g.c(drawable, "Argument must not be null");
        this.f1444a = drawable;
    }

    public void a() {
        switch (this.f1445b) {
            case 1:
                ((h) ((M0.c) this.f1444a).f1783a.f1782b).f1809l.prepareToDraw();
                return;
            default:
                Drawable drawable = this.f1444a;
                if (drawable instanceof BitmapDrawable) {
                    ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
                    return;
                } else if (drawable instanceof M0.c) {
                    ((h) ((M0.c) drawable).f1783a.f1782b).f1809l.prepareToDraw();
                    return;
                } else {
                    return;
                }
        }
    }

    public final int b() {
        switch (this.f1445b) {
            case 0:
                Drawable drawable = this.f1444a;
                return Math.max(1, drawable.getIntrinsicHeight() * drawable.getIntrinsicWidth() * 4);
            default:
                h hVar = (h) ((M0.c) this.f1444a).f1783a.f1782b;
                d dVar = hVar.f1801a;
                return (dVar.f12637j.length * 4) + dVar.d.limit() + dVar.f12636i.length + hVar.f1811n;
        }
    }

    public final Class c() {
        switch (this.f1445b) {
            case 0:
                return this.f1444a.getClass();
            default:
                return M0.c.class;
        }
    }

    public final void d() {
        C0.g gVar;
        C0.g gVar2;
        C0.g gVar3;
        switch (this.f1445b) {
            case 0:
                return;
            default:
                M0.c cVar = (M0.c) this.f1444a;
                cVar.stop();
                cVar.d = true;
                h hVar = (h) cVar.f1783a.f1782b;
                hVar.f1803c.clear();
                Bitmap bitmap = hVar.f1809l;
                if (bitmap != null) {
                    hVar.f1804e.f(bitmap);
                    hVar.f1809l = null;
                }
                hVar.f1805f = false;
                e eVar = hVar.f1806i;
                l lVar = hVar.d;
                if (eVar != null) {
                    lVar.m(eVar);
                    hVar.f1806i = null;
                }
                e eVar2 = hVar.f1808k;
                if (eVar2 != null) {
                    lVar.m(eVar2);
                    hVar.f1808k = null;
                }
                e eVar3 = hVar.f1810m;
                if (eVar3 != null) {
                    lVar.m(eVar3);
                    hVar.f1810m = null;
                }
                d dVar = hVar.f1801a;
                dVar.f12639l = null;
                byte[] bArr = dVar.f12636i;
                I3.h hVar2 = dVar.f12633c;
                if (!(bArr == null || (gVar3 = (C0.g) hVar2.f1180c) == null)) {
                    gVar3.g(bArr);
                }
                int[] iArr = dVar.f12637j;
                if (!(iArr == null || (gVar2 = (C0.g) hVar2.f1180c) == null)) {
                    gVar2.g(iArr);
                }
                Bitmap bitmap2 = dVar.f12640m;
                if (bitmap2 != null) {
                    ((b) hVar2.f1179b).f(bitmap2);
                }
                dVar.f12640m = null;
                dVar.d = null;
                dVar.f12646s = null;
                byte[] bArr2 = dVar.f12634e;
                if (!(bArr2 == null || (gVar = (C0.g) hVar2.f1180c) == null)) {
                    gVar.g(bArr2);
                }
                hVar.f1807j = true;
                return;
        }
    }

    public final Object get() {
        Drawable drawable = this.f1444a;
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return drawable;
        }
        return constantState.newDrawable();
    }

    private final void e() {
    }
}
