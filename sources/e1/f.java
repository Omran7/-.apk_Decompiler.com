package E1;

import A1.a;
import D1.c;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Map;

public final class f extends a {
    public static final Parcelable.Creator<f> CREATOR = new c(5);

    /* renamed from: a  reason: collision with root package name */
    public final int f603a;

    /* renamed from: b  reason: collision with root package name */
    public final String f604b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f605c;

    public f(int i2, String str, ArrayList arrayList) {
        this.f603a = i2;
        this.f604b = str;
        this.f605c = arrayList;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.Y0(parcel, 1, 4);
        parcel.writeInt(this.f603a);
        android.support.v4.media.session.a.R0(parcel, 2, this.f604b, false);
        android.support.v4.media.session.a.V0(parcel, 3, this.f605c, false);
        android.support.v4.media.session.a.X0(W02, parcel);
    }

    public f(Map map, String str) {
        ArrayList arrayList;
        this.f603a = 1;
        this.f604b = str;
        if (map == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (String str2 : map.keySet()) {
                arrayList2.add(new g((a) map.get(str2), str2));
            }
            arrayList = arrayList2;
        }
        this.f605c = arrayList;
    }
}
