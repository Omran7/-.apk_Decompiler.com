package O1;

import A1.a;
import D1.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.fido.zzbc;
import com.google.android.gms.internal.fido.zzh;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: O1.z  reason: case insensitive filesystem */
public final class C0110z extends a {
    public static final Parcelable.Creator<C0110z> CREATOR = new c(17);

    /* renamed from: a  reason: collision with root package name */
    public final E f2078a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f2079b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f2080c;

    static {
        zzbc.zzk(zzh.zza, zzh.zzb);
    }

    public C0110z(String str, byte[] bArr, ArrayList arrayList) {
        I.g(str);
        try {
            this.f2078a = E.a(str);
            I.g(bArr);
            this.f2079b = bArr;
            this.f2080c = arrayList;
        } catch (D e6) {
            throw new IllegalArgumentException(e6);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0110z)) {
            return false;
        }
        C0110z zVar = (C0110z) obj;
        if (!this.f2078a.equals(zVar.f2078a) || !Arrays.equals(this.f2079b, zVar.f2079b)) {
            return false;
        }
        ArrayList arrayList = this.f2080c;
        ArrayList arrayList2 = zVar.f2080c;
        if (arrayList == null && arrayList2 == null) {
            return true;
        }
        if (arrayList == null || arrayList2 == null || !arrayList.containsAll(arrayList2) || !arrayList2.containsAll(arrayList)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2078a, Integer.valueOf(Arrays.hashCode(this.f2079b)), this.f2080c});
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        this.f2078a.getClass();
        android.support.v4.media.session.a.R0(parcel, 2, "public-key", false);
        android.support.v4.media.session.a.K0(parcel, 3, this.f2079b, false);
        android.support.v4.media.session.a.V0(parcel, 4, this.f2080c, false);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
