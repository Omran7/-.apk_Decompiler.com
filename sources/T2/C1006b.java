package t2;

import T.b;
import T.c;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* renamed from: t2.b  reason: case insensitive filesystem */
public final class C1006b extends c {
    public static final Parcelable.Creator<C1006b> CREATOR = new b(6);

    /* renamed from: c  reason: collision with root package name */
    public final int f11747c;

    public C1006b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f11747c = parcel.readInt();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.f11747c);
    }

    public C1006b(AbsSavedState absSavedState, SideSheetBehavior sideSheetBehavior) {
        super(absSavedState);
        this.f11747c = sideSheetBehavior.h;
    }
}
