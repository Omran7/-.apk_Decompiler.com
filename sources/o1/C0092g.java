package O1;

import A1.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.I;
import java.util.Arrays;

/* renamed from: O1.g  reason: case insensitive filesystem */
public final class C0092g extends a {
    public static final Parcelable.Creator<C0092g> CREATOR = new W(1);

    /* renamed from: a  reason: collision with root package name */
    public final N f2031a;

    /* renamed from: b  reason: collision with root package name */
    public final X f2032b;

    /* renamed from: c  reason: collision with root package name */
    public final C0093h f2033c;
    public final Y d;

    public C0092g(N n2, X x6, C0093h hVar, Y y6) {
        this.f2031a = n2;
        this.f2032b = x6;
        this.f2033c = hVar;
        this.d = y6;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0092g)) {
            return false;
        }
        C0092g gVar = (C0092g) obj;
        if (!I.j(this.f2031a, gVar.f2031a) || !I.j(this.f2032b, gVar.f2032b) || !I.j(this.f2033c, gVar.f2033c) || !I.j(this.d, gVar.d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2031a, this.f2032b, this.f2033c, this.d});
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.Q0(parcel, 1, this.f2031a, i2, false);
        android.support.v4.media.session.a.Q0(parcel, 2, this.f2032b, i2, false);
        android.support.v4.media.session.a.Q0(parcel, 3, this.f2033c, i2, false);
        android.support.v4.media.session.a.Q0(parcel, 4, this.d, i2, false);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
