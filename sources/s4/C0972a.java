package s4;

import R2.b;
import com.google.android.gms.internal.measurement.a;
import i3.C0587c;
import i3.C0588d;
import i3.q;
import j4.D;

/* renamed from: s4.a  reason: case insensitive filesystem */
public final class C0972a implements q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f11546a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0973b f11547b;

    public /* synthetic */ C0972a(C0973b bVar, int i2) {
        this.f11546a = i2;
        this.f11547b = bVar;
    }

    public final void B(C0588d dVar) {
        int i2 = this.f11546a;
    }

    public final void u(C0587c cVar) {
        int i2;
        C0973b bVar = this.f11547b;
        int i5 = 0;
        Class<Integer> cls = Integer.class;
        switch (this.f11546a) {
            case 0:
                try {
                    i2 = ((Integer) cVar.f(cls)).intValue();
                } catch (Exception e6) {
                    a.q("Exception from try-catch block inside ", "b", " in  method displayDataOnScreen when get the crime tool count (ignore it, default value added 0).", e6, "b");
                    i2 = 0;
                }
                D d = new D(bVar.f11549d0, android.support.v4.media.session.a.G(bVar.f11550e0), bVar.f11550e0, i2);
                bVar.f11555j0 = d;
                bVar.f11553h0.setAdapter(d);
                b.w(false);
                return;
            default:
                try {
                    i5 = ((Integer) cVar.f(cls)).intValue();
                } catch (Exception e7) {
                    a.q("Exception from try-catch block inside ", "b", " in  method displayDataOnScreen when get the crime tool count (ignore it, default value added 0).", e7, "b");
                }
                D d6 = bVar.f11555j0;
                d6.d = i5;
                d6.notifyDataSetChanged();
                return;
        }
    }

    private final void a(C0588d dVar) {
    }

    private final void b(C0588d dVar) {
    }
}
