package W0;

import android.graphics.Bitmap;
import android.net.Uri;
import h0.C0552a;
import kotlin.jvm.internal.j;

/* renamed from: W0.f  reason: case insensitive filesystem */
public final class C0234f {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f3942a;

    /* renamed from: b  reason: collision with root package name */
    public final Bitmap f3943b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3944c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f3945e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f3946f;
    public final Exception g;

    public C0234f(Uri uri, Bitmap bitmap, int i2, int i5, boolean z3, boolean z4, Exception exc) {
        j.e(uri, "uri");
        this.f3942a = uri;
        this.f3943b = bitmap;
        this.f3944c = i2;
        this.d = i5;
        this.f3945e = z3;
        this.f3946f = z4;
        this.g = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0234f)) {
            return false;
        }
        C0234f fVar = (C0234f) obj;
        if (j.a(this.f3942a, fVar.f3942a) && j.a(this.f3943b, fVar.f3943b) && this.f3944c == fVar.f3944c && this.d == fVar.d && this.f3945e == fVar.f3945e && this.f3946f == fVar.f3946f && j.a(this.g, fVar.g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        int hashCode = this.f3942a.hashCode() * 31;
        int i5 = 0;
        Bitmap bitmap = this.f3943b;
        if (bitmap == null) {
            i2 = 0;
        } else {
            i2 = bitmap.hashCode();
        }
        int hashCode2 = (Boolean.hashCode(this.f3946f) + ((Boolean.hashCode(this.f3945e) + C0552a.g(this.d, C0552a.g(this.f3944c, (hashCode + i2) * 31, 31), 31)) * 31)) * 31;
        Exception exc = this.g;
        if (exc != null) {
            i5 = exc.hashCode();
        }
        return hashCode2 + i5;
    }

    public final String toString() {
        return "Result(uri=" + this.f3942a + ", bitmap=" + this.f3943b + ", loadSampleSize=" + this.f3944c + ", degreesRotated=" + this.d + ", flipHorizontally=" + this.f3945e + ", flipVertically=" + this.f3946f + ", error=" + this.g + ")";
    }
}
