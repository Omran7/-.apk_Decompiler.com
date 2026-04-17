package x;

import T.b;
import T.c;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* renamed from: x.e  reason: case insensitive filesystem */
public final class C1093e extends c {
    public static final Parcelable.Creator<C1093e> CREATOR = new b(8);

    /* renamed from: c  reason: collision with root package name */
    public SparseArray f12503c;

    public C1093e(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        this.f12503c = new SparseArray(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            this.f12503c.append(iArr[i2], readParcelableArray[i2]);
        }
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int i5;
        super.writeToParcel(parcel, i2);
        SparseArray sparseArray = this.f12503c;
        if (sparseArray != null) {
            i5 = sparseArray.size();
        } else {
            i5 = 0;
        }
        parcel.writeInt(i5);
        int[] iArr = new int[i5];
        Parcelable[] parcelableArr = new Parcelable[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            iArr[i6] = this.f12503c.keyAt(i6);
            parcelableArr[i6] = (Parcelable) this.f12503c.valueAt(i6);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i2);
    }
}
