package Q1;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.location.zza;
import com.google.android.gms.internal.location.zzb;
import com.google.android.gms.internal.location.zzc;

public abstract class u extends zzb implements v {
    /* JADX WARNING: type inference failed for: r1v1, types: [com.google.android.gms.internal.location.zza, Q1.v] */
    public static v zzb(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
        if (queryLocalInterface instanceof v) {
            return (v) queryLocalInterface;
        }
        return new zza(iBinder, "com.google.android.gms.location.ILocationListener");
    }

    public final boolean zza(int i2, Parcel parcel, Parcel parcel2, int i5) {
        if (i2 != 1) {
            return false;
        }
        zzd((Location) zzc.zzb(parcel, Location.CREATOR));
        return true;
    }
}
