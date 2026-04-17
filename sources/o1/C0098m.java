package O1;

import A1.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.I;
import java.util.Arrays;

/* renamed from: O1.m  reason: case insensitive filesystem */
public final class C0098m extends a {
    public static final Parcelable.Creator<C0098m> CREATOR = new W(9);

    /* renamed from: a  reason: collision with root package name */
    public final C0088c f2045a;

    /* renamed from: b  reason: collision with root package name */
    public final Boolean f2046b;

    /* renamed from: c  reason: collision with root package name */
    public final V f2047c;
    public final I d;

    public C0098m(String str, Boolean bool, String str2, String str3) {
        C0088c cVar;
        V v6;
        I i2 = null;
        if (str == null) {
            cVar = null;
        } else {
            try {
                cVar = C0088c.a(str);
            } catch (H | U | C0087b e6) {
                throw new IllegalArgumentException(e6);
            }
        }
        this.f2045a = cVar;
        this.f2046b = bool;
        if (str2 == null) {
            v6 = null;
        } else {
            v6 = V.a(str2);
        }
        this.f2047c = v6;
        if (str3 != null) {
            i2 = I.a(str3);
        }
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0098m)) {
            return false;
        }
        C0098m mVar = (C0098m) obj;
        if (!I.j(this.f2045a, mVar.f2045a) || !I.j(this.f2046b, mVar.f2046b) || !I.j(this.f2047c, mVar.f2047c) || !I.j(v(), mVar.v())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2045a, this.f2046b, this.f2047c, v()});
    }

    public final I v() {
        I i2 = this.d;
        if (i2 != null) {
            return i2;
        }
        Boolean bool = this.f2046b;
        if (bool == null || !bool.booleanValue()) {
            return null;
        }
        return I.RESIDENT_KEY_REQUIRED;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        String str;
        String str2;
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        String str3 = null;
        C0088c cVar = this.f2045a;
        if (cVar == null) {
            str = null;
        } else {
            str = cVar.f2018a;
        }
        android.support.v4.media.session.a.R0(parcel, 2, str, false);
        android.support.v4.media.session.a.I0(parcel, 3, this.f2046b);
        V v6 = this.f2047c;
        if (v6 == null) {
            str2 = null;
        } else {
            str2 = v6.f2006a;
        }
        android.support.v4.media.session.a.R0(parcel, 4, str2, false);
        if (v() != null) {
            str3 = v().f1991a;
        }
        android.support.v4.media.session.a.R0(parcel, 5, str3, false);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
