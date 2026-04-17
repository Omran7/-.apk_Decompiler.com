package I0;

import B0.D;
import C0.b;
import android.content.Context;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;
import z0.m;

public final class t implements m {

    /* renamed from: b  reason: collision with root package name */
    public final m f1135b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f1136c;

    public t(m mVar, boolean z3) {
        this.f1135b = mVar;
        this.f1136c = z3;
    }

    public final void a(MessageDigest messageDigest) {
        this.f1135b.a(messageDigest);
    }

    public final D b(Context context, D d, int i2, int i5) {
        b bVar = com.bumptech.glide.b.a(context).f5727a;
        Drawable drawable = (Drawable) d.get();
        C0057d a6 = s.a(bVar, drawable, i2, i5);
        if (a6 != null) {
            D b6 = this.f1135b.b(context, a6, i2, i5);
            if (!b6.equals(a6)) {
                return new C0057d(context.getResources(), b6);
            }
            b6.d();
            return d;
        } else if (!this.f1136c) {
            return d;
        } else {
            throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t) {
            return this.f1135b.equals(((t) obj).f1135b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1135b.hashCode();
    }
}
