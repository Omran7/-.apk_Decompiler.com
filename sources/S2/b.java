package s2;

import android.graphics.RectF;
import java.util.Arrays;

public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    public final c f11438a;

    /* renamed from: b  reason: collision with root package name */
    public final float f11439b;

    public b(float f6, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f11438a;
            f6 += ((b) cVar).f11439b;
        }
        this.f11438a = cVar;
        this.f11439b = f6;
    }

    public final float a(RectF rectF) {
        return Math.max(0.0f, this.f11438a.a(rectF) + this.f11439b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!this.f11438a.equals(bVar.f11438a) || this.f11439b != bVar.f11439b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11438a, Float.valueOf(this.f11439b)});
    }
}
