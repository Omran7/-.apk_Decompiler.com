package v2;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import s2.g;
import s2.k;

public final class f extends s2.f {

    /* renamed from: q  reason: collision with root package name */
    public final RectF f12178q;

    public f(k kVar, RectF rectF) {
        super(kVar);
        this.f12178q = rectF;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [v2.g, s2.g, android.graphics.drawable.Drawable] */
    public final Drawable newDrawable() {
        ? gVar = new g((s2.f) this);
        gVar.f12180G = this;
        gVar.invalidateSelf();
        return gVar;
    }

    public f(f fVar) {
        super((s2.f) fVar);
        this.f12178q = fVar.f12178q;
    }
}
