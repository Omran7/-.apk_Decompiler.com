package T1;

import A1.a;
import Q1.w;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: T1.i  reason: case insensitive filesystem */
public final class C0176i extends a {
    public static final Parcelable.Creator<C0176i> CREATOR = new w(15);

    /* renamed from: a  reason: collision with root package name */
    public final Bundle f3338a;

    public C0176i(Bundle bundle) {
        this.f3338a = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.J0(parcel, 1, this.f3338a, false);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
