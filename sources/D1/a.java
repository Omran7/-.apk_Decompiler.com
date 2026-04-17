package D1;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;

public final class a extends A1.a {
    public static final Parcelable.Creator<a> CREATOR = new c(1);

    /* renamed from: a  reason: collision with root package name */
    public final int f504a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f505b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final SparseArray f506c = new SparseArray();

    public a(int i2, ArrayList arrayList) {
        this.f504a = i2;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            d dVar = (d) arrayList.get(i5);
            String str = dVar.f511b;
            int i6 = dVar.f512c;
            this.f505b.put(str, Integer.valueOf(i6));
            this.f506c.put(i6, str);
        }
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.Y0(parcel, 1, 4);
        parcel.writeInt(this.f504a);
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = this.f505b;
        for (String str : hashMap.keySet()) {
            arrayList.add(new d(str, ((Integer) hashMap.get(str)).intValue()));
        }
        android.support.v4.media.session.a.V0(parcel, 2, arrayList, false);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
