package T1;

import A1.a;
import Q1.w;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;

/* renamed from: T1.u  reason: case insensitive filesystem */
public final class C0211u extends a implements Iterable {
    public static final Parcelable.Creator<C0211u> CREATOR = new w(16);

    /* renamed from: a  reason: collision with root package name */
    public final Bundle f3472a;

    public C0211u(Bundle bundle) {
        this.f3472a = bundle;
    }

    public final Iterator iterator() {
        return new C0208t(this);
    }

    public final String toString() {
        return this.f3472a.toString();
    }

    public final Bundle v() {
        return new Bundle(this.f3472a);
    }

    public final Double w() {
        return Double.valueOf(this.f3472a.getDouble("value"));
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.J0(parcel, 2, v(), false);
        android.support.v4.media.session.a.X0(W02, parcel);
    }

    public final Object x(String str) {
        return this.f3472a.get(str);
    }

    public final String y() {
        return this.f3472a.getString("currency");
    }
}
