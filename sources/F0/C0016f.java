package F0;

import android.content.res.Resources;
import com.bumptech.glide.f;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.data.e;
import java.io.IOException;

/* renamed from: F0.f  reason: case insensitive filesystem */
public final class C0016f implements e {

    /* renamed from: a  reason: collision with root package name */
    public final Resources.Theme f684a;

    /* renamed from: b  reason: collision with root package name */
    public final Resources f685b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f686c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public Object f687e;

    public C0016f(Resources.Theme theme, Resources resources, C0017g gVar, int i2) {
        this.f684a = theme;
        this.f685b = resources;
        this.f686c = gVar;
        this.d = i2;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [F0.g, java.lang.Object] */
    public final Class b() {
        return this.f686c.b();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [F0.g, java.lang.Object] */
    public final void c() {
        Object obj = this.f687e;
        if (obj != null) {
            try {
                this.f686c.g(obj);
            } catch (IOException unused) {
            }
        }
    }

    public final int e() {
        return 1;
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [F0.g, java.lang.Object] */
    public final void f(f fVar, d dVar) {
        try {
            Object f6 = this.f686c.f(this.f685b, this.d, this.f684a);
            this.f687e = f6;
            dVar.d(f6);
        } catch (Resources.NotFoundException e6) {
            dVar.a(e6);
        }
    }

    public final void cancel() {
    }
}
