package O1;

import A1.a;
import D1.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.fido.zzao;
import java.util.Arrays;

public final class L extends a {
    public static final Parcelable.Creator<L> CREATOR = new c(25);

    /* renamed from: a  reason: collision with root package name */
    public final J f1994a;

    /* renamed from: b  reason: collision with root package name */
    public final String f1995b;

    static {
        new L("supported", (String) null);
        new L("not-supported", (String) null);
    }

    public L(String str, String str2) {
        I.g(str);
        try {
            this.f1994a = J.a(str);
            this.f1995b = str2;
        } catch (K e6) {
            throw new IllegalArgumentException(e6);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof L)) {
            return false;
        }
        L l6 = (L) obj;
        if (!zzao.zza(this.f1994a, l6.f1994a) || !zzao.zza(this.f1995b, l6.f1995b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1994a, this.f1995b});
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.R0(parcel, 2, this.f1994a.f1993a, false);
        android.support.v4.media.session.a.R0(parcel, 3, this.f1995b, false);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
