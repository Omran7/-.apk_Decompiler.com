package E1;

import A1.a;
import D1.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.I;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class h extends a {
    public static final Parcelable.Creator<h> CREATOR = new c(4);

    /* renamed from: a  reason: collision with root package name */
    public final int f609a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f610b;

    /* renamed from: c  reason: collision with root package name */
    public final String f611c;

    public h(int i2, String str, ArrayList arrayList) {
        this.f609a = i2;
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            f fVar = (f) arrayList.get(i5);
            String str2 = fVar.f604b;
            HashMap hashMap2 = new HashMap();
            ArrayList arrayList2 = fVar.f605c;
            I.g(arrayList2);
            int size2 = arrayList2.size();
            for (int i6 = 0; i6 < size2; i6++) {
                g gVar = (g) arrayList2.get(i6);
                hashMap2.put(gVar.f607b, gVar.f608c);
            }
            hashMap.put(str2, hashMap2);
        }
        this.f610b = hashMap;
        I.g(str);
        this.f611c = str;
        for (String str3 : hashMap.keySet()) {
            Map map = (Map) hashMap.get(str3);
            for (String str4 : map.keySet()) {
                ((a) map.get(str4)).f595s = this;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        HashMap hashMap = this.f610b;
        for (String str : hashMap.keySet()) {
            sb.append(str);
            sb.append(":\n");
            Map map = (Map) hashMap.get(str);
            for (String str2 : map.keySet()) {
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(map.get(str2));
            }
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.Y0(parcel, 1, 4);
        parcel.writeInt(this.f609a);
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = this.f610b;
        for (String str : hashMap.keySet()) {
            arrayList.add(new f((Map) hashMap.get(str), str));
        }
        android.support.v4.media.session.a.V0(parcel, 2, arrayList, false);
        android.support.v4.media.session.a.R0(parcel, 3, this.f611c, false);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
