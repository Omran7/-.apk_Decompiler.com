package t1;

import A1.a;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.I;
import java.util.Arrays;
import s1.b;

/* renamed from: t1.m  reason: case insensitive filesystem */
public final class C0998m extends a {
    public static final Parcelable.Creator<C0998m> CREATOR = new b(18);

    /* renamed from: a  reason: collision with root package name */
    public final PendingIntent f11733a;

    public C0998m(PendingIntent pendingIntent) {
        I.g(pendingIntent);
        this.f11733a = pendingIntent;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0998m)) {
            return false;
        }
        return I.j(this.f11733a, ((C0998m) obj).f11733a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11733a});
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.Q0(parcel, 1, this.f11733a, i2, false);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
