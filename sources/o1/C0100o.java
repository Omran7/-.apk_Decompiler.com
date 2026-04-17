package O1;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.a;
import com.google.android.gms.common.internal.I;
import java.util.Arrays;

/* renamed from: O1.o  reason: case insensitive filesystem */
public final class C0100o extends C0101p {
    public static final Parcelable.Creator<C0100o> CREATOR = new W(11);

    /* renamed from: a  reason: collision with root package name */
    public final B f2051a;

    /* renamed from: b  reason: collision with root package name */
    public final Uri f2052b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f2053c;

    public C0100o(B b6, Uri uri, byte[] bArr) {
        boolean z3;
        boolean z4;
        I.g(b6);
        this.f2051a = b6;
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
        this.f2052b = uri;
        if (!(bArr == null || bArr.length == 32)) {
            z5 = false;
        }
        I.a("clientDataHash must be 32 bytes long", z5);
        this.f2053c = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0100o)) {
            return false;
        }
        C0100o oVar = (C0100o) obj;
        if (!I.j(this.f2051a, oVar.f2051a) || !I.j(this.f2052b, oVar.f2052b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2051a, this.f2052b});
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = a.W0(20293, parcel);
        a.Q0(parcel, 2, this.f2051a, i2, false);
        a.Q0(parcel, 3, this.f2052b, i2, false);
        a.K0(parcel, 4, this.f2053c, false);
        a.X0(W02, parcel);
    }
}
