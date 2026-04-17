package e3;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.a;
import com.google.android.gms.common.internal.I;
import com.google.android.material.datepicker.n;

public final class x extends C0495c {
    public static final Parcelable.Creator<x> CREATOR = new n(6);

    /* renamed from: a  reason: collision with root package name */
    public final String f7661a;

    public x(String str) {
        I.d(str);
        this.f7661a = str;
    }

    public final String v() {
        return "playgames.google.com";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = a.W0(20293, parcel);
        a.R0(parcel, 1, this.f7661a, false);
        a.X0(W02, parcel);
    }
}
