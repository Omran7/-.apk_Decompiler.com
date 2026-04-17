package o1;

import A1.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.I;
import com.google.android.material.datepicker.n;
import java.util.Arrays;

/* renamed from: o1.a  reason: case insensitive filesystem */
public final class C0891a extends a {
    public static final Parcelable.Creator<C0891a> CREATOR = new n(21);

    /* renamed from: a  reason: collision with root package name */
    public final int f10424a;

    /* renamed from: b  reason: collision with root package name */
    public final long f10425b;

    /* renamed from: c  reason: collision with root package name */
    public final String f10426c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final int f10427e;

    /* renamed from: f  reason: collision with root package name */
    public final String f10428f;

    public C0891a(int i2, int i5, String str, String str2, long j6, int i6) {
        this.f10424a = i2;
        this.f10425b = j6;
        I.g(str);
        this.f10426c = str;
        this.d = i5;
        this.f10427e = i6;
        this.f10428f = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0891a)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C0891a aVar = (C0891a) obj;
        if (this.f10424a == aVar.f10424a && this.f10425b == aVar.f10425b && I.j(this.f10426c, aVar.f10426c) && this.d == aVar.d && this.f10427e == aVar.f10427e && I.j(this.f10428f, aVar.f10428f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f10424a), Long.valueOf(this.f10425b), this.f10426c, Integer.valueOf(this.d), Integer.valueOf(this.f10427e), this.f10428f});
    }

    public final String toString() {
        String str;
        int i2 = this.d;
        if (i2 == 1) {
            str = "ADDED";
        } else if (i2 == 2) {
            str = "REMOVED";
        } else if (i2 == 3) {
            str = "RENAMED_FROM";
        } else if (i2 != 4) {
            str = "UNKNOWN";
        } else {
            str = "RENAMED_TO";
        }
        return "AccountChangeEvent {accountName = " + this.f10426c + ", changeType = " + str + ", changeData = " + this.f10428f + ", eventIndex = " + this.f10427e + "}";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.Y0(parcel, 1, 4);
        parcel.writeInt(this.f10424a);
        android.support.v4.media.session.a.Y0(parcel, 2, 8);
        parcel.writeLong(this.f10425b);
        android.support.v4.media.session.a.R0(parcel, 3, this.f10426c, false);
        android.support.v4.media.session.a.Y0(parcel, 4, 4);
        parcel.writeInt(this.d);
        android.support.v4.media.session.a.Y0(parcel, 5, 4);
        parcel.writeInt(this.f10427e);
        android.support.v4.media.session.a.R0(parcel, 6, this.f10428f, false);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
