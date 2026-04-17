package t1;

import A1.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.I;
import java.util.Arrays;
import s1.b;

/* renamed from: t1.p  reason: case insensitive filesystem */
public final class C1001p extends a {
    public static final Parcelable.Creator<C1001p> CREATOR = new b(20);

    /* renamed from: a  reason: collision with root package name */
    public final String f11742a;

    /* renamed from: b  reason: collision with root package name */
    public final String f11743b;

    public C1001p(String str, String str2) {
        I.h(str, "Account identifier cannot be null");
        String trim = str.trim();
        I.e(trim, "Account identifier cannot be empty");
        this.f11742a = trim;
        I.d(str2);
        this.f11743b = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1001p)) {
            return false;
        }
        C1001p pVar = (C1001p) obj;
        if (!I.j(this.f11742a, pVar.f11742a) || !I.j(this.f11743b, pVar.f11743b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11742a, this.f11743b});
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.R0(parcel, 1, this.f11742a, false);
        android.support.v4.media.session.a.R0(parcel, 2, this.f11743b, false);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
