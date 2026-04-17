package Q1;

import A1.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.s;

public final class j extends a implements s {
    public static final Parcelable.Creator<j> CREATOR = new w(3);

    /* renamed from: a  reason: collision with root package name */
    public final Status f2417a;

    /* renamed from: b  reason: collision with root package name */
    public final k f2418b;

    public j(Status status, k kVar) {
        this.f2417a = status;
        this.f2418b = kVar;
    }

    public final Status getStatus() {
        return this.f2417a;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.Q0(parcel, 1, this.f2417a, i2, false);
        android.support.v4.media.session.a.Q0(parcel, 2, this.f2418b, i2, false);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
