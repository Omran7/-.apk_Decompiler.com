package Q1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.location.zza;
import com.google.android.gms.internal.location.zzb;

public abstract class n extends zzb implements o {
    /* JADX WARNING: type inference failed for: r1v1, types: [Q1.o, com.google.android.gms.internal.location.zza] */
    public static o zzb(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.IDeviceOrientationListener");
        if (queryLocalInterface instanceof o) {
            return (o) queryLocalInterface;
        }
        return new zza(iBinder, "com.google.android.gms.location.IDeviceOrientationListener");
    }

    public final boolean zza(int i2, Parcel parcel, Parcel parcel2, int i5) {
        throw null;
    }
}
