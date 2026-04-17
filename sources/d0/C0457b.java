package d0;

import B0.H;
import androidx.emoji2.text.v;
import androidx.lifecycle.O;
import n.k;
import x1.d;

/* renamed from: d0.b  reason: case insensitive filesystem */
public class C0457b extends O {

    /* renamed from: f  reason: collision with root package name */
    public static final v f7500f = new v(16);
    public final k d = new k();

    /* renamed from: e  reason: collision with root package name */
    public boolean f7501e = false;

    public final void b() {
        k kVar = this.d;
        int h = kVar.h();
        int i2 = 0;
        while (i2 < h) {
            C0456a aVar = (C0456a) kVar.i(i2);
            d dVar = aVar.f7497l;
            dVar.a();
            dVar.f12541c = true;
            H h6 = aVar.f7499n;
            if (h6 != null) {
                aVar.h(h6);
            }
            C0456a aVar2 = dVar.f12539a;
            if (aVar2 == null) {
                throw new IllegalStateException("No listener register");
            } else if (aVar2 == aVar) {
                dVar.f12539a = null;
                if (h6 != null) {
                    boolean z3 = h6.f200b;
                }
                dVar.d = true;
                dVar.f12540b = false;
                dVar.f12541c = false;
                dVar.f12542e = false;
                i2++;
            } else {
                throw new IllegalArgumentException("Attempting to unregister the wrong listener");
            }
        }
        kVar.b();
    }
}
