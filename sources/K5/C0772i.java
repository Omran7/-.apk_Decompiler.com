package k5;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.google.android.material.datepicker.n;
import n.g;
import n.k;

/* renamed from: k5.i  reason: case insensitive filesystem */
public final class C0772i extends View.BaseSavedState {
    public static final Parcelable.Creator<C0772i> CREATOR = new n(17);

    /* renamed from: a  reason: collision with root package name */
    public long f9496a;

    /* renamed from: b  reason: collision with root package name */
    public long f9497b;

    /* renamed from: c  reason: collision with root package name */
    public int f9498c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public int f9499e;

    /* renamed from: f  reason: collision with root package name */
    public String f9500f;

    /* renamed from: p  reason: collision with root package name */
    public boolean f9501p;

    /* renamed from: q  reason: collision with root package name */
    public int f9502q;

    /* renamed from: r  reason: collision with root package name */
    public k f9503r;

    /* renamed from: s  reason: collision with root package name */
    public g f9504s;

    public final String toString() {
        return "AbsListView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " selectedId=" + this.f9496a + " firstId=" + this.f9497b + " viewLeft=" + this.f9498c + " position=" + this.d + " width=" + this.f9499e + " filter=" + this.f9500f + " checkState=" + this.f9503r + "}";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int i5;
        super.writeToParcel(parcel, i2);
        parcel.writeLong(this.f9496a);
        parcel.writeLong(this.f9497b);
        parcel.writeInt(this.f9498c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.f9499e);
        parcel.writeString(this.f9500f);
        parcel.writeByte(this.f9501p ? (byte) 1 : 0);
        parcel.writeInt(this.f9502q);
        k kVar = this.f9503r;
        if (kVar == null) {
            parcel.writeInt(-1);
        } else {
            int h = kVar.h();
            parcel.writeInt(h);
            for (int i6 = 0; i6 < h; i6++) {
                parcel.writeInt(kVar.f(i6));
                parcel.writeByte(((Boolean) kVar.i(i6)).booleanValue() ? (byte) 1 : 0);
            }
        }
        g gVar = this.f9504s;
        if (gVar != null) {
            i5 = gVar.e();
        } else {
            i5 = 0;
        }
        parcel.writeInt(i5);
        for (int i7 = 0; i7 < i5; i7++) {
            parcel.writeLong(gVar.c(i7));
            parcel.writeInt(((Integer) gVar.f(i7)).intValue());
        }
    }
}
