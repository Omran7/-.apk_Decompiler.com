package y1;

import A1.a;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: y1.a  reason: case insensitive filesystem */
public final class C1108a extends a {
    public static final Parcelable.Creator<C1108a> CREATOR = new c(0);

    /* renamed from: a  reason: collision with root package name */
    public final Intent f12648a;

    public C1108a(Intent intent) {
        this.f12648a = intent;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.Q0(parcel, 1, this.f12648a, i2, false);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
