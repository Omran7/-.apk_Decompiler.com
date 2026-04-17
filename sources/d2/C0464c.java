package d2;

import T.b;
import T.c;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: d2.c  reason: case insensitive filesystem */
public final class C0464c extends c {
    public static final Parcelable.Creator<C0464c> CREATOR = new b(1);

    /* renamed from: c  reason: collision with root package name */
    public final int f7519c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f7520e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f7521f;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f7522p;

    public C0464c(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f7519c = parcel.readInt();
        this.d = parcel.readInt();
        boolean z3 = false;
        this.f7520e = parcel.readInt() == 1;
        this.f7521f = parcel.readInt() == 1;
        this.f7522p = parcel.readInt() == 1 ? true : z3;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.f7519c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.f7520e ? 1 : 0);
        parcel.writeInt(this.f7521f ? 1 : 0);
        parcel.writeInt(this.f7522p ? 1 : 0);
    }

    public C0464c(AbsSavedState absSavedState, BottomSheetBehavior bottomSheetBehavior) {
        super(absSavedState);
        this.f7519c = bottomSheetBehavior.f6299L;
        this.d = bottomSheetBehavior.f6321e;
        this.f7520e = bottomSheetBehavior.f6316b;
        this.f7521f = bottomSheetBehavior.f6296I;
        this.f7522p = bottomSheetBehavior.f6297J;
    }
}
