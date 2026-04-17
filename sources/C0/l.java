package C0;

import U0.o;
import android.graphics.Bitmap;

public final class l implements j {

    /* renamed from: a  reason: collision with root package name */
    public final f f422a;

    /* renamed from: b  reason: collision with root package name */
    public int f423b;

    /* renamed from: c  reason: collision with root package name */
    public Bitmap.Config f424c;

    public l(f fVar) {
        this.f422a = fVar;
    }

    public final void a() {
        this.f422a.l(this);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f423b != lVar.f423b || !o.b(this.f424c, lVar.f424c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i2;
        int i5 = this.f423b * 31;
        Bitmap.Config config = this.f424c;
        if (config != null) {
            i2 = config.hashCode();
        } else {
            i2 = 0;
        }
        return i5 + i2;
    }

    public final String toString() {
        return m.c(this.f423b, this.f424c);
    }
}
