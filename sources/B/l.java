package B;

import android.content.res.Resources;
import java.util.Objects;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final Resources f156a;

    /* renamed from: b  reason: collision with root package name */
    public final Resources.Theme f157b;

    public l(Resources resources, Resources.Theme theme) {
        this.f156a = resources;
        this.f157b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        if (!this.f156a.equals(lVar.f156a) || !Objects.equals(this.f157b, lVar.f157b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f156a, this.f157b});
    }
}
