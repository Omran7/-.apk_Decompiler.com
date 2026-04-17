package W1;

import A1.a;
import Q1.w;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.s;
import java.util.ArrayList;

public final class e extends a implements s {
    public static final Parcelable.Creator<e> CREATOR = new w(27);

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f4067a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4068b;

    public e(String str, ArrayList arrayList) {
        this.f4067a = arrayList;
        this.f4068b = str;
    }

    public final Status getStatus() {
        if (this.f4068b != null) {
            return Status.f6002e;
        }
        return Status.f6006r;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.T0(parcel, 1, this.f4067a);
        android.support.v4.media.session.a.R0(parcel, 2, this.f4068b, false);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
