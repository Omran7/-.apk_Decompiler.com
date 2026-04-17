package e3;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.a;
import com.google.android.material.datepicker.n;

public final class p extends C0495c {
    public static final Parcelable.Creator<p> CREATOR = new n(2);

    /* renamed from: a  reason: collision with root package name */
    public final String f7652a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7653b;

    public p(String str, String str2) {
        if (str == null && str2 == null) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        } else if (str != null && str.length() == 0) {
            throw new IllegalArgumentException("idToken cannot be empty");
        } else if (str2 == null || str2.length() != 0) {
            this.f7652a = str;
            this.f7653b = str2;
        } else {
            throw new IllegalArgumentException("accessToken cannot be empty");
        }
    }

    public final String v() {
        return "google.com";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = a.W0(20293, parcel);
        a.R0(parcel, 1, this.f7652a, false);
        a.R0(parcel, 2, this.f7653b, false);
        a.X0(W02, parcel);
    }
}
