package O1;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.a;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.fido.zzam;
import com.google.android.gms.internal.fido.zzan;
import com.google.android.gms.internal.fido.zzch;
import java.util.Arrays;

/* renamed from: O1.j  reason: case insensitive filesystem */
public final class C0095j extends C0097l {
    public static final Parcelable.Creator<C0095j> CREATOR = new W(7);

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f2039a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f2040b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f2041c;
    public final String[] d;

    public C0095j(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        I.g(bArr);
        this.f2039a = bArr;
        I.g(bArr2);
        this.f2040b = bArr2;
        I.g(bArr3);
        this.f2041c = bArr3;
        I.g(strArr);
        this.d = strArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0095j)) {
            return false;
        }
        C0095j jVar = (C0095j) obj;
        if (!Arrays.equals(this.f2039a, jVar.f2039a) || !Arrays.equals(this.f2040b, jVar.f2040b) || !Arrays.equals(this.f2041c, jVar.f2041c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f2039a)), Integer.valueOf(Arrays.hashCode(this.f2040b)), Integer.valueOf(Arrays.hashCode(this.f2041c))});
    }

    public final String toString() {
        zzam zza = zzan.zza(this);
        zzch zzf = zzch.zzf();
        byte[] bArr = this.f2039a;
        zza.zzb("keyHandle", zzf.zzg(bArr, 0, bArr.length));
        zzch zzf2 = zzch.zzf();
        byte[] bArr2 = this.f2040b;
        zza.zzb("clientDataJSON", zzf2.zzg(bArr2, 0, bArr2.length));
        zzch zzf3 = zzch.zzf();
        byte[] bArr3 = this.f2041c;
        zza.zzb("attestationObject", zzf3.zzg(bArr3, 0, bArr3.length));
        zza.zzb("transports", Arrays.toString(this.d));
        return zza.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = a.W0(20293, parcel);
        a.K0(parcel, 2, this.f2039a, false);
        a.K0(parcel, 3, this.f2040b, false);
        a.K0(parcel, 4, this.f2041c, false);
        a.S0(parcel, 5, this.d, false);
        a.X0(W02, parcel);
    }
}
