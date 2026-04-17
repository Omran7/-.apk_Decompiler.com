package s2;

import android.graphics.RectF;
import java.util.Arrays;

public final class h implements c {

    /* renamed from: a  reason: collision with root package name */
    public final float f11475a;

    public h(float f6) {
        this.f11475a = f6;
    }

    public final float a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f11475a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        if (this.f11475a == ((h) obj).f11475a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f11475a)});
    }
}
