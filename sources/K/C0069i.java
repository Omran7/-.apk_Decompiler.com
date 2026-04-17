package K;

import android.view.DisplayCutout;
import java.util.Objects;

/* renamed from: K.i  reason: case insensitive filesystem */
public final class C0069i {

    /* renamed from: a  reason: collision with root package name */
    public final DisplayCutout f1396a;

    public C0069i(DisplayCutout displayCutout) {
        this.f1396a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0069i.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f1396a, ((C0069i) obj).f1396a);
    }

    public final int hashCode() {
        return this.f1396a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f1396a + "}";
    }
}
