package M0;

import B0.D;
import I0.C0057d;
import U0.g;
import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.b;
import java.security.MessageDigest;
import z0.m;

public final class d implements m {

    /* renamed from: b  reason: collision with root package name */
    public final m f1792b;

    public d(m mVar) {
        g.c(mVar, "Argument must not be null");
        this.f1792b = mVar;
    }

    public final void a(MessageDigest messageDigest) {
        this.f1792b.a(messageDigest);
    }

    public final D b(Context context, D d, int i2, int i5) {
        c cVar = (c) d.get();
        C0057d dVar = new C0057d(b.a(context).f5727a, ((h) cVar.f1783a.f1782b).f1809l);
        m mVar = this.f1792b;
        D b6 = mVar.b(context, dVar, i2, i5);
        if (!dVar.equals(b6)) {
            dVar.d();
        }
        ((h) cVar.f1783a.f1782b).c(mVar, (Bitmap) b6.get());
        return d;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f1792b.equals(((d) obj).f1792b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1792b.hashCode();
    }
}
