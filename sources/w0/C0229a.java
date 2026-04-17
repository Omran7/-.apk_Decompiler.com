package W0;

import android.graphics.Bitmap;
import android.net.Uri;
import kotlin.jvm.internal.j;

/* renamed from: W0.a  reason: case insensitive filesystem */
public final class C0229a {

    /* renamed from: a  reason: collision with root package name */
    public final Bitmap f3911a;

    /* renamed from: b  reason: collision with root package name */
    public final Uri f3912b;

    /* renamed from: c  reason: collision with root package name */
    public final Exception f3913c;
    public final int d;

    public C0229a(Bitmap bitmap, Uri uri, Exception exc, int i2) {
        this.f3911a = bitmap;
        this.f3912b = uri;
        this.f3913c = exc;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0229a)) {
            return false;
        }
        C0229a aVar = (C0229a) obj;
        if (j.a(this.f3911a, aVar.f3911a) && j.a(this.f3912b, aVar.f3912b) && j.a(this.f3913c, aVar.f3913c) && this.d == aVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        int i5;
        int i6 = 0;
        Bitmap bitmap = this.f3911a;
        if (bitmap == null) {
            i2 = 0;
        } else {
            i2 = bitmap.hashCode();
        }
        int i7 = i2 * 31;
        Uri uri = this.f3912b;
        if (uri == null) {
            i5 = 0;
        } else {
            i5 = uri.hashCode();
        }
        int i8 = (i7 + i5) * 31;
        Exception exc = this.f3913c;
        if (exc != null) {
            i6 = exc.hashCode();
        }
        return Integer.hashCode(this.d) + ((i8 + i6) * 31);
    }

    public final String toString() {
        return "Result(bitmap=" + this.f3911a + ", uri=" + this.f3912b + ", error=" + this.f3913c + ", sampleSize=" + this.d + ")";
    }
}
