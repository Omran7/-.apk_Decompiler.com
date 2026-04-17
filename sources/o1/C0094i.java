package O1;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.a;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.fido.zzam;
import com.google.android.gms.internal.fido.zzan;
import com.google.android.gms.internal.fido.zzch;
import java.util.Arrays;

/* renamed from: O1.i  reason: case insensitive filesystem */
public final class C0094i extends C0097l {
    public static final Parcelable.Creator<C0094i> CREATOR = new W(6);

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f2035a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f2036b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f2037c;
    public final byte[] d;

    /* renamed from: e  reason: collision with root package name */
    public final byte[] f2038e;

    public C0094i(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        I.g(bArr);
        this.f2035a = bArr;
        I.g(bArr2);
        this.f2036b = bArr2;
        I.g(bArr3);
        this.f2037c = bArr3;
        I.g(bArr4);
        this.d = bArr4;
        this.f2038e = bArr5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0094i)) {
            return false;
        }
        C0094i iVar = (C0094i) obj;
        if (!Arrays.equals(this.f2035a, iVar.f2035a) || !Arrays.equals(this.f2036b, iVar.f2036b) || !Arrays.equals(this.f2037c, iVar.f2037c) || !Arrays.equals(this.d, iVar.d) || !Arrays.equals(this.f2038e, iVar.f2038e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f2035a)), Integer.valueOf(Arrays.hashCode(this.f2036b)), Integer.valueOf(Arrays.hashCode(this.f2037c)), Integer.valueOf(Arrays.hashCode(this.d)), Integer.valueOf(Arrays.hashCode(this.f2038e))});
    }

    public final String toString() {
        zzam zza = zzan.zza(this);
        zzch zzf = zzch.zzf();
        byte[] bArr = this.f2035a;
        zza.zzb("keyHandle", zzf.zzg(bArr, 0, bArr.length));
        zzch zzf2 = zzch.zzf();
        byte[] bArr2 = this.f2036b;
        zza.zzb("clientDataJSON", zzf2.zzg(bArr2, 0, bArr2.length));
        zzch zzf3 = zzch.zzf();
        byte[] bArr3 = this.f2037c;
        zza.zzb("authenticatorData", zzf3.zzg(bArr3, 0, bArr3.length));
        zzch zzf4 = zzch.zzf();
        byte[] bArr4 = this.d;
        zza.zzb("signature", zzf4.zzg(bArr4, 0, bArr4.length));
        byte[] bArr5 = this.f2038e;
        if (bArr5 != null) {
            zza.zzb("userHandle", zzch.zzf().zzg(bArr5, 0, bArr5.length));
        }
        return zza.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = a.W0(20293, parcel);
        a.K0(parcel, 2, this.f2035a, false);
        a.K0(parcel, 3, this.f2036b, false);
        a.K0(parcel, 4, this.f2037c, false);
        a.K0(parcel, 5, this.d, false);
        a.K0(parcel, 6, this.f2038e, false);
        a.X0(W02, parcel);
    }
}
