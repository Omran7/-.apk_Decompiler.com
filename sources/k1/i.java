package K1;

import J1.a;
import J1.b;
import android.os.Parcel;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

public final class i extends zza {
    public final a B(b bVar, String str, boolean z3, long j6) {
        Parcel zza = zza();
        zzc.zze(zza, bVar);
        zza.writeString(str);
        zza.writeInt(z3 ? 1 : 0);
        zza.writeLong(j6);
        Parcel zzB = zzB(7, zza);
        a a6 = b.a(zzB.readStrongBinder());
        zzB.recycle();
        return a6;
    }

    public final a a(b bVar, String str, int i2) {
        Parcel zza = zza();
        zzc.zze(zza, bVar);
        zza.writeString(str);
        zza.writeInt(i2);
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
        Parcel zzB = zzB(8, zza);
        a a6 = b.a(zzB.readStrongBinder());
        zzB.recycle();
        return a6;
    }

    public final a j(b bVar, String str, int i2) {
        Parcel zza = zza();
        zzc.zze(zza, bVar);
        zza.writeString(str);
        zza.writeInt(i2);
        Parcel zzB = zzB(4, zza);
        a a6 = b.a(zzB.readStrongBinder());
        zzB.recycle();
        return a6;
    }
}
