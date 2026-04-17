package T1;

import A1.a;
import Q1.w;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public final class M1 extends a {
    public static final Parcelable.Creator<M1> CREATOR = new w(20);

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f2989a;

    public M1(ArrayList arrayList) {
        this.f2989a = arrayList;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        ArrayList arrayList = this.f2989a;
        if (arrayList != null) {
            int W03 = android.support.v4.media.session.a.W0(1, parcel);
            int size = arrayList.size();
            parcel.writeInt(size);
            for (int i5 = 0; i5 < size; i5++) {
                parcel.writeInt(((Integer) arrayList.get(i5)).intValue());
            }
            android.support.v4.media.session.a.X0(W03, parcel);
        }
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
