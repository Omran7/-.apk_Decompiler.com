package z1;

import J1.a;
import J1.b;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public abstract class p extends zzb implements D {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f12830b = 0;

    /* renamed from: a  reason: collision with root package name */
    public final int f12831a;

    public p(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        boolean z3;
        if (bArr.length == 25) {
            z3 = true;
        } else {
            z3 = false;
        }
        I.b(z3);
        this.f12831a = Arrays.hashCode(bArr);
    }

    public static byte[] a(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e6) {
            throw new AssertionError(e6);
        }
    }

    public abstract byte[] b();

    public final boolean equals(Object obj) {
        a zzd;
        if (obj != null && (obj instanceof D)) {
            try {
                D d = (D) obj;
                if (d.zzc() != this.f12831a || (zzd = d.zzd()) == null) {
                    return false;
                }
                return Arrays.equals(b(), (byte[]) b.b(zzd));
            } catch (RemoteException e6) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e6);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f12831a;
    }

    public final boolean zza(int i2, Parcel parcel, Parcel parcel2, int i5) {
        if (i2 == 1) {
            a zzd = zzd();
            parcel2.writeNoException();
            zzc.zze(parcel2, zzd);
        } else if (i2 != 2) {
            return false;
        } else {
            parcel2.writeNoException();
            parcel2.writeInt(this.f12831a);
        }
        return true;
    }

    public final int zzc() {
        return this.f12831a;
    }

    public final a zzd() {
        return new b(b());
    }
}
