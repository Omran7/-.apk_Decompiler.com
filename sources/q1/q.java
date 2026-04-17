package Q1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.location.zza;
import com.google.android.gms.internal.location.zzb;
import com.google.android.gms.internal.location.zzc;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

public abstract class q extends zzb implements s {
    /* JADX WARNING: type inference failed for: r1v1, types: [Q1.s, com.google.android.gms.internal.location.zza] */
    public static s zzb(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
        if (queryLocalInterface instanceof s) {
            return (s) queryLocalInterface;
        }
        return new zza(iBinder, "com.google.android.gms.location.ILocationCallback");
    }

    public final boolean zza(int i2, Parcel parcel, Parcel parcel2, int i5) {
        if (i2 == 1) {
            zzd((LocationResult) zzc.zzb(parcel, LocationResult.CREATOR));
        } else if (i2 != 2) {
            return false;
        } else {
            zze((LocationAvailability) zzc.zzb(parcel, LocationAvailability.CREATOR));
        }
        return true;
    }
}
