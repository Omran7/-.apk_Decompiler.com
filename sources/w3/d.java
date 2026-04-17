package W3;

import B0.C0009h;
import R2.i;
import android.net.Uri;

public final class d extends c {

    /* renamed from: l  reason: collision with root package name */
    public final Uri f4082l;

    /* renamed from: m  reason: collision with root package name */
    public final byte[] f4083m;

    /* renamed from: n  reason: collision with root package name */
    public final int f4084n;

    public d(C0009h hVar, i iVar, Uri uri, byte[] bArr, long j6, int i2, boolean z3) {
        super(hVar, iVar);
        if (j6 < 0) {
            this.f4076a = new IllegalArgumentException("offset cannot be negative");
        }
        this.f4084n = i2;
        this.f4082l = uri;
        this.f4083m = i2 <= 0 ? null : bArr;
        n("X-Goog-Upload-Protocol", "resumable");
        if (z3 && i2 > 0) {
            n("X-Goog-Upload-Command", "upload, finalize");
        } else if (z3) {
            n("X-Goog-Upload-Command", "finalize");
        } else {
            n("X-Goog-Upload-Command", "upload");
        }
        n("X-Goog-Upload-Offset", Long.toString(j6));
    }

    public final String c() {
        return "POST";
    }

    public final byte[] e() {
        return this.f4083m;
    }

    public final int f() {
        int i2 = this.f4084n;
        if (i2 > 0) {
            return i2;
        }
        return 0;
    }

    public final Uri j() {
        return this.f4082l;
    }
}
