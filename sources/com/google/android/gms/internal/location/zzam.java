package com.google.android.gms.internal.location;

import Q1.A;
import Q1.C0138c;
import Q1.e;
import Q1.i;
import Q1.l;
import android.app.PendingIntent;
import android.location.Location;
import android.os.IInterface;
import com.google.android.gms.common.api.internal.C0356j;
import com.google.android.gms.location.LocationAvailability;

public interface zzam extends IInterface {
    void zzd(e eVar, PendingIntent pendingIntent, zzak zzak);

    void zze(PendingIntent pendingIntent, zzak zzak, String str);

    void zzf(String[] strArr, zzak zzak, String str);

    void zzg(A a6, zzak zzak);

    void zzh(long j6, boolean z3, PendingIntent pendingIntent);

    void zzi(C0138c cVar, PendingIntent pendingIntent, C0356j jVar);

    void zzj(PendingIntent pendingIntent, C0356j jVar);

    void zzk(PendingIntent pendingIntent);

    void zzl(PendingIntent pendingIntent, C0356j jVar);

    @Deprecated
    Location zzm();

    Location zzn(String str);

    void zzo(zzbc zzbc);

    void zzp(boolean z3);

    void zzq(Location location);

    void zzr(zzai zzai);

    LocationAvailability zzs(String str);

    void zzt(i iVar, zzao zzao, String str);

    void zzu(zzl zzl);

    void zzv(PendingIntent pendingIntent, l lVar, C0356j jVar);
}
