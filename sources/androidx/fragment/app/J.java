package androidx.fragment.app;

import a.C0251c;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public final class J implements Parcelable {
    public static final Parcelable.Creator<J> CREATOR = new C0251c(13);

    /* renamed from: a  reason: collision with root package name */
    public ArrayList f5021a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList f5022b;

    /* renamed from: c  reason: collision with root package name */
    public C0270b[] f5023c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public String f5024e;

    /* renamed from: f  reason: collision with root package name */
    public ArrayList f5025f;

    /* renamed from: p  reason: collision with root package name */
    public ArrayList f5026p;

    /* renamed from: q  reason: collision with root package name */
    public ArrayList f5027q;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeStringList(this.f5021a);
        parcel.writeStringList(this.f5022b);
        parcel.writeTypedArray(this.f5023c, i2);
        parcel.writeInt(this.d);
        parcel.writeString(this.f5024e);
        parcel.writeStringList(this.f5025f);
        parcel.writeTypedList(this.f5026p);
        parcel.writeTypedList(this.f5027q);
    }
}
