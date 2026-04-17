package s2;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

public final class u {

    /* renamed from: a  reason: collision with root package name */
    public float f11517a;

    /* renamed from: b  reason: collision with root package name */
    public float f11518b;

    /* renamed from: c  reason: collision with root package name */
    public float f11519c;
    public float d;

    /* renamed from: e  reason: collision with root package name */
    public float f11520e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f11521f = new ArrayList();
    public final ArrayList g = new ArrayList();

    public u() {
        d(0.0f, 270.0f, 0.0f);
    }

    public final void a(float f6) {
        float f7 = this.d;
        if (f7 != f6) {
            float f8 = ((f6 - f7) + 360.0f) % 360.0f;
            if (f8 <= 180.0f) {
                float f9 = this.f11518b;
                float f10 = this.f11519c;
                q qVar = new q(f9, f10, f9, f10);
                qVar.f11511f = this.d;
                qVar.g = f8;
                this.g.add(new o(qVar));
                this.d = f6;
            }
        }
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f11521f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((s) arrayList.get(i2)).a(matrix, path);
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [s2.s, s2.r, java.lang.Object] */
    public final void c(float f6, float f7) {
        ? sVar = new s();
        sVar.f11512b = f6;
        sVar.f11513c = f7;
        this.f11521f.add(sVar);
        p pVar = new p(sVar, this.f11518b, this.f11519c);
        a(pVar.b() + 270.0f);
        this.g.add(pVar);
        this.d = pVar.b() + 270.0f;
        this.f11518b = f6;
        this.f11519c = f7;
    }

    public final void d(float f6, float f7, float f8) {
        this.f11517a = f6;
        this.f11518b = 0.0f;
        this.f11519c = f6;
        this.d = f7;
        this.f11520e = (f7 + f8) % 360.0f;
        this.f11521f.clear();
        this.g.clear();
    }
}
