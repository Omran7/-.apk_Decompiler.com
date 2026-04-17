package O1;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.a;
import com.google.android.gms.common.internal.I;
import java.util.Arrays;

/* renamed from: O1.n  reason: case insensitive filesystem */
public final class C0099n extends C0101p {
    public static final Parcelable.Creator<C0099n> CREATOR = new W(10);

    /* renamed from: a  reason: collision with root package name */
    public final C0109y f2048a;

    /* renamed from: b  reason: collision with root package name */
    public final Uri f2049b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f2050c;

    public C0099n(C0109y yVar, Uri uri, byte[] bArr) {
        boolean z3;
        boolean z4;
        I.g(yVar);
        this.f2048a = yVar;
        I.g(uri);
        boolean z5 = true;
        if (uri.getScheme() != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        I.a("origin scheme must be non-empty", z3);
        if (uri.getAuthority() != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        I.a("origin authority must be non-empty", z4);
        this.f2049b = uri;
        if (!(bArr == null || bArr.length == 32)) {
            z5 = false;
        }
        I.a("clientDataHash must be 32 bytes long", z5);
        this.f2050c = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0099n)) {
            return false;
        }
        C0099n nVar = (C0099n) obj;
        if (!I.j(this.f2048a, nVar.f2048a) || !I.j(this.f2049b, nVar.f2049b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2048a, this.f2049b});
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = a.W0(20293, parcel);
        a.Q0(parcel, 2, this.f2048a, i2, false);
        a.Q0(parcel, 3, this.f2049b, i2, false);
        a.K0(parcel, 4, this.f2050c, false);
        a.X0(W02, parcel);
    }
}
