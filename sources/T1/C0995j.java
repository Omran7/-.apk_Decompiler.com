package t1;

import A1.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.I;
import java.util.Arrays;
import s1.b;

/* renamed from: t1.j  reason: case insensitive filesystem */
public final class C0995j extends a {
    public static final Parcelable.Creator<C0995j> CREATOR = new b(10);

    /* renamed from: a  reason: collision with root package name */
    public final String f11724a;

    /* renamed from: b  reason: collision with root package name */
    public final String f11725b;

    /* renamed from: c  reason: collision with root package name */
    public final String f11726c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f11727e;

    /* renamed from: f  reason: collision with root package name */
    public final int f11728f;

    public C0995j(String str, String str2, String str3, String str4, boolean z3, int i2) {
        I.g(str);
        this.f11724a = str;
        this.f11725b = str2;
        this.f11726c = str3;
        this.d = str4;
        this.f11727e = z3;
        this.f11728f = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0995j)) {
            return false;
        }
        C0995j jVar = (C0995j) obj;
        if (!I.j(this.f11724a, jVar.f11724a) || !I.j(this.d, jVar.d) || !I.j(this.f11725b, jVar.f11725b) || !I.j(Boolean.valueOf(this.f11727e), Boolean.valueOf(jVar.f11727e)) || this.f11728f != jVar.f11728f) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11724a, this.f11725b, this.d, Boolean.valueOf(this.f11727e), Integer.valueOf(this.f11728f)});
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.R0(parcel, 1, this.f11724a, false);
        android.support.v4.media.session.a.R0(parcel, 2, this.f11725b, false);
        android.support.v4.media.session.a.R0(parcel, 3, this.f11726c, false);
        android.support.v4.media.session.a.R0(parcel, 4, this.d, false);
        android.support.v4.media.session.a.Y0(parcel, 5, 4);
        parcel.writeInt(this.f11727e ? 1 : 0);
        android.support.v4.media.session.a.Y0(parcel, 6, 4);
        parcel.writeInt(this.f11728f);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
