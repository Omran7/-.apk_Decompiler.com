package Q1;

import A1.a;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.location.zzbs;
import java.util.List;

public final class A extends a {
    public static final Parcelable.Creator<A> CREATOR = new w(6);

    /* renamed from: a  reason: collision with root package name */
    public final zzbs f2391a;

    /* renamed from: b  reason: collision with root package name */
    public final PendingIntent f2392b;

    /* renamed from: c  reason: collision with root package name */
    public final String f2393c;

    public A(List list, PendingIntent pendingIntent, String str) {
        zzbs zzbs;
        if (list == null) {
            zzbs = zzbs.zzi();
        } else {
            zzbs = zzbs.zzj(list);
        }
        this.f2391a = zzbs;
        this.f2392b = pendingIntent;
        this.f2393c = str;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.T0(parcel, 1, this.f2391a);
        android.support.v4.media.session.a.Q0(parcel, 2, this.f2392b, i2, false);
        android.support.v4.media.session.a.R0(parcel, 3, this.f2393c, false);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
