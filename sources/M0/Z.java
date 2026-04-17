package m0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.n;
import java.util.Arrays;

public final class Z implements Parcelable {
    public static final Parcelable.Creator<Z> CREATOR = new n(19);

    /* renamed from: a  reason: collision with root package name */
    public int f9918a;

    /* renamed from: b  reason: collision with root package name */
    public int f9919b;

    /* renamed from: c  reason: collision with root package name */
    public int[] f9920c;
    public boolean d;

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f9918a + ", mGapDir=" + this.f9919b + ", mHasUnwantedGapAfter=" + this.d + ", mGapPerSpan=" + Arrays.toString(this.f9920c) + '}';
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f9918a);
        parcel.writeInt(this.f9919b);
        parcel.writeInt(this.d ? 1 : 0);
        int[] iArr = this.f9920c;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(iArr.length);
        parcel.writeIntArray(this.f9920c);
    }
}
