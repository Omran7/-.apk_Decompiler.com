package O1;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.a;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.fido.zzam;
import com.google.android.gms.internal.fido.zzan;
import java.util.Arrays;

/* renamed from: O1.k  reason: case insensitive filesystem */
public final class C0096k extends C0097l {
    public static final Parcelable.Creator<C0096k> CREATOR = new W(8);

    /* renamed from: a  reason: collision with root package name */
    public final C0105u f2042a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2043b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2044c;

    public C0096k(int i2, String str, int i5) {
        try {
            this.f2042a = C0105u.a(i2);
            this.f2043b = str;
            this.f2044c = i5;
        } catch (C0104t e6) {
            throw new IllegalArgumentException(e6);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0096k)) {
            return false;
        }
        C0096k kVar = (C0096k) obj;
        if (!I.j(this.f2042a, kVar.f2042a) || !I.j(this.f2043b, kVar.f2043b) || !I.j(Integer.valueOf(this.f2044c), Integer.valueOf(kVar.f2044c))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2042a, this.f2043b, Integer.valueOf(this.f2044c)});
    }

    public final String toString() {
        zzam zza = zzan.zza(this);
        zza.zza("errorCode", this.f2042a.f2058a);
        String str = this.f2043b;
        if (str != null) {
            zza.zzb("errorMessage", str);
        }
        return zza.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = a.W0(20293, parcel);
        int i5 = this.f2042a.f2058a;
        a.Y0(parcel, 2, 4);
        parcel.writeInt(i5);
        a.R0(parcel, 3, this.f2043b, false);
        a.Y0(parcel, 4, 4);
        parcel.writeInt(this.f2044c);
        a.X0(W02, parcel);
    }
}
