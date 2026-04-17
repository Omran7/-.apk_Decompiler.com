package Q1;

import A1.a;
import O1.W;
import android.os.Parcel;
import android.os.Parcelable;
import h0.C0552a;
import java.util.ArrayList;

public final class e extends a {
    public static final Parcelable.Creator<e> CREATOR = new W(27);

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f2410a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2411b;

    /* renamed from: c  reason: collision with root package name */
    public final String f2412c;
    public final String d;

    public e(ArrayList arrayList, int i2, String str, String str2) {
        this.f2410a = arrayList;
        this.f2411b = i2;
        this.f2412c = str;
        this.d = str2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GeofencingRequest[geofences=");
        sb.append(this.f2410a);
        sb.append(", initialTrigger=");
        sb.append(this.f2411b);
        sb.append(", tag=");
        sb.append(this.f2412c);
        sb.append(", attributionTag=");
        return C0552a.r(sb, this.d, "]");
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.V0(parcel, 1, this.f2410a, false);
        android.support.v4.media.session.a.Y0(parcel, 2, 4);
        parcel.writeInt(this.f2411b);
        android.support.v4.media.session.a.R0(parcel, 3, this.f2412c, false);
        android.support.v4.media.session.a.R0(parcel, 4, this.d, false);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
