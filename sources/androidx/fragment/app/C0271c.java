package androidx.fragment.app;

import a.C0251c;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.c  reason: case insensitive filesystem */
public final class C0271c implements Parcelable {
    public static final Parcelable.Creator<C0271c> CREATOR = new C0251c(11);

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f5098a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f5099b;

    public C0271c(Parcel parcel) {
        this.f5098a = parcel.createStringArrayList();
        this.f5099b = parcel.createTypedArrayList(C0270b.CREATOR);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeStringList(this.f5098a);
        parcel.writeTypedList(this.f5099b);
    }
}
