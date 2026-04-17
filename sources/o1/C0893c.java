package o1;

import A1.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.I;
import com.google.android.material.datepicker.n;
import java.util.ArrayList;

/* renamed from: o1.c  reason: case insensitive filesystem */
public final class C0893c extends a {
    public static final Parcelable.Creator<C0893c> CREATOR = new n(23);

    /* renamed from: a  reason: collision with root package name */
    public final int f10432a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f10433b;

    public C0893c(int i2, ArrayList arrayList) {
        this.f10432a = i2;
        I.g(arrayList);
        this.f10433b = arrayList;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.Y0(parcel, 1, 4);
        parcel.writeInt(this.f10432a);
        android.support.v4.media.session.a.V0(parcel, 2, this.f10433b, false);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
