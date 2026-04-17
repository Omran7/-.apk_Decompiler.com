package O1;

import A1.a;
import D1.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.I;
import java.util.Arrays;

public final class A extends a {
    public static final Parcelable.Creator<A> CREATOR = new c(18);

    /* renamed from: a  reason: collision with root package name */
    public final E f1969a;

    /* renamed from: b  reason: collision with root package name */
    public final r f1970b;

    public A(String str, int i2) {
        I.g(str);
        try {
            this.f1969a = E.a(str);
            try {
                this.f1970b = r.a(i2);
            } catch (C0102q e6) {
                throw new IllegalArgumentException(e6);
            }
        } catch (D e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof A)) {
            return false;
        }
        A a6 = (A) obj;
        if (!this.f1969a.equals(a6.f1969a) || !this.f1970b.equals(a6.f1970b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1969a, this.f1970b});
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [O1.a, java.lang.Enum] */
    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        this.f1969a.getClass();
        android.support.v4.media.session.a.R0(parcel, 2, "public-key", false);
        android.support.v4.media.session.a.O0(parcel, 3, Integer.valueOf(this.f1970b.f2054a.a()));
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
