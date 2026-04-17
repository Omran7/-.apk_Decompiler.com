package t1;

import A1.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.I;
import java.util.Arrays;
import s1.b;

/* renamed from: t1.l  reason: case insensitive filesystem */
public final class C0997l extends a {
    public static final Parcelable.Creator<C0997l> CREATOR = new b(17);

    /* renamed from: a  reason: collision with root package name */
    public final C1001p f11730a;

    /* renamed from: b  reason: collision with root package name */
    public final String f11731b;

    /* renamed from: c  reason: collision with root package name */
    public final int f11732c;

    public C0997l(C1001p pVar, String str, int i2) {
        I.g(pVar);
        this.f11730a = pVar;
        this.f11731b = str;
        this.f11732c = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0997l)) {
            return false;
        }
        C0997l lVar = (C0997l) obj;
        if (!I.j(this.f11730a, lVar.f11730a) || !I.j(this.f11731b, lVar.f11731b) || this.f11732c != lVar.f11732c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11730a, this.f11731b});
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.Q0(parcel, 1, this.f11730a, i2, false);
        android.support.v4.media.session.a.R0(parcel, 2, this.f11731b, false);
        android.support.v4.media.session.a.Y0(parcel, 3, 4);
        parcel.writeInt(this.f11732c);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
