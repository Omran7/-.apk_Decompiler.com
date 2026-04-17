package W1;

import A1.a;
import Q1.w;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.s;

public final class b extends a implements s {
    public static final Parcelable.Creator<b> CREATOR = new w(26);

    /* renamed from: a  reason: collision with root package name */
    public final int f4064a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4065b;

    /* renamed from: c  reason: collision with root package name */
    public final Intent f4066c;

    public b(int i2, int i5, Intent intent) {
        this.f4064a = i2;
        this.f4065b = i5;
        this.f4066c = intent;
    }

    public final Status getStatus() {
        if (this.f4065b == 0) {
            return Status.f6002e;
        }
        return Status.f6006r;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.Y0(parcel, 1, 4);
        parcel.writeInt(this.f4064a);
        android.support.v4.media.session.a.Y0(parcel, 2, 4);
        parcel.writeInt(this.f4065b);
        android.support.v4.media.session.a.Q0(parcel, 3, this.f4066c, i2, false);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
