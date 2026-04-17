package t1;

import A1.a;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.I;
import s1.b;

/* renamed from: t1.g  reason: case insensitive filesystem */
public final class C0992g extends a {
    public static final Parcelable.Creator<C0992g> CREATOR = new b(8);

    /* renamed from: a  reason: collision with root package name */
    public final PendingIntent f11722a;

    public C0992g(PendingIntent pendingIntent) {
        I.g(pendingIntent);
        this.f11722a = pendingIntent;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.Q0(parcel, 1, this.f11722a, i2, false);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
