package e3;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.a;
import com.google.android.gms.common.internal.I;
import com.google.android.material.datepicker.n;

/* renamed from: e3.e  reason: case insensitive filesystem */
public final class C0497e extends C0495c {
    public static final Parcelable.Creator<C0497e> CREATOR = new n(14);

    /* renamed from: a  reason: collision with root package name */
    public final String f7644a;

    public C0497e(String str) {
        I.d(str);
        this.f7644a = str;
    }

    public final String v() {
        return "facebook.com";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = a.W0(20293, parcel);
        a.R0(parcel, 1, this.f7644a, false);
        a.X0(W02, parcel);
    }
}
