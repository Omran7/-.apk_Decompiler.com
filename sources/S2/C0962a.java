package s2;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: s2.a  reason: case insensitive filesystem */
public final class C0962a implements c {

    /* renamed from: a  reason: collision with root package name */
    public final float f11437a;

    public C0962a(float f6) {
        this.f11437a = f6;
    }

    public final float a(RectF rectF) {
        return this.f11437a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0962a)) {
            return false;
        }
        if (this.f11437a == ((C0962a) obj).f11437a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f11437a)});
    }
}
