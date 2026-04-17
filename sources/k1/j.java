package K1;

import J1.a;
import J1.b;
import android.os.Parcel;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

public final class j extends zza {
    public final a a(b bVar, String str, int i2, b bVar2) {
        Parcel zza = zza();
        zzc.zze(zza, bVar);
        zza.writeString(str);
        zza.writeInt(i2);
        zzc.zze(zza, bVar2);
        Parcel zzB = zzB(2, zza);
        a a6 = b.a(zzB.readStrongBinder());
        zzB.recycle();
        return a6;
    }

    public final a b(b bVar, String str, int i2, b bVar2) {
        Parcel zza = zza();
        zzc.zze(zza, bVar);
        zza.writeString(str);
        zza.writeInt(i2);
        zzc.zze(zza, bVar2);
        Parcel zzB = zzB(3, zza);
        a a6 = b.a(zzB.readStrongBinder());
        zzB.recycle();
        return a6;
    }
}
