package m0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.n;
import java.util.ArrayList;

public final class b0 implements Parcelable {
    public static final Parcelable.Creator<b0> CREATOR = new n(20);

    /* renamed from: a  reason: collision with root package name */
    public int f9930a;

    /* renamed from: b  reason: collision with root package name */
    public int f9931b;

    /* renamed from: c  reason: collision with root package name */
    public int f9932c;
    public int[] d;

    /* renamed from: e  reason: collision with root package name */
    public int f9933e;

    /* renamed from: f  reason: collision with root package name */
    public int[] f9934f;

    /* renamed from: p  reason: collision with root package name */
    public ArrayList f9935p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f9936q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f9937r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f9938s;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f9930a);
        parcel.writeInt(this.f9931b);
        parcel.writeInt(this.f9932c);
        if (this.f9932c > 0) {
            parcel.writeIntArray(this.d);
        }
        parcel.writeInt(this.f9933e);
        if (this.f9933e > 0) {
            parcel.writeIntArray(this.f9934f);
        }
        parcel.writeInt(this.f9936q ? 1 : 0);
        parcel.writeInt(this.f9937r ? 1 : 0);
        parcel.writeInt(this.f9938s ? 1 : 0);
        parcel.writeList(this.f9935p);
    }
}
