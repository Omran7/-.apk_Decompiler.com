package p1;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.internal.auth.zzb;
import com.google.android.gms.internal.auth.zzc;

/* renamed from: p1.b  reason: case insensitive filesystem */
public abstract class C0908b extends zzb implements C0909c {
    public final boolean zza(int i2, Parcel parcel, Parcel parcel2, int i5) {
        if (i2 == 1) {
            zzc.zzb(parcel);
            zzb((Account) zzc.zza(parcel, Account.CREATOR));
        } else if (i2 != 2) {
            return false;
        } else {
            boolean zzf = zzc.zzf(parcel);
            zzc.zzb(parcel);
            zzc(zzf);
        }
        return true;
    }
}
