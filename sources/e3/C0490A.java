package e3;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.a;
import com.google.android.gms.common.internal.I;
import com.google.android.material.datepicker.n;

/* renamed from: e3.A  reason: case insensitive filesystem */
public final class C0490A extends C0495c {
    public static final Parcelable.Creator<C0490A> CREATOR = new n(8);

    /* renamed from: a  reason: collision with root package name */
    public final String f7597a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7598b;

    public C0490A(String str, String str2) {
        I.d(str);
        this.f7597a = str;
        I.d(str2);
        this.f7598b = str2;
    }

    public final String v() {
        return "twitter.com";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = a.W0(20293, parcel);
        a.R0(parcel, 1, this.f7597a, false);
        a.R0(parcel, 2, this.f7598b, false);
        a.X0(W02, parcel);
    }
}
