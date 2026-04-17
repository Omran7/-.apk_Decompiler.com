package com.google.android.gms.internal.location;

import Q1.A;
import Q1.C0138c;
import Q1.D;
import Q1.e;
import Q1.i;
import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.internal.C0351e;
import com.google.android.gms.common.api.internal.C0360n;
import com.google.android.gms.common.api.internal.C0362p;
import com.google.android.gms.common.api.internal.C0367v;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.internal.C0380i;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import java.util.List;
import z1.d;

public final class zzaz extends zzi {
    private final zzav zzf;

    public zzaz(Context context, Looper looper, m mVar, n nVar, String str, C0380i iVar) {
        super(context, looper, mVar, nVar, str, iVar);
        this.zzf = new zzav(context, this.zze);
    }

    public final void disconnect() {
        synchronized (this.zzf) {
            if (isConnected()) {
                try {
                    this.zzf.zzn();
                    this.zzf.zzo();
                } catch (Exception e6) {
                    Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", e6);
                }
            }
            super.disconnect();
        }
    }

    public final boolean usesClientTelemetry() {
        return true;
    }

    public final LocationAvailability zzA() {
        return this.zzf.zzc();
    }

    public final void zzB(zzba zzba, C0362p pVar, zzai zzai) {
        synchronized (this.zzf) {
            this.zzf.zze(zzba, pVar, zzai);
        }
    }

    public final void zzC(LocationRequest locationRequest, C0362p pVar, zzai zzai) {
        synchronized (this.zzf) {
            this.zzf.zzd(locationRequest, pVar, zzai);
        }
    }

    public final void zzD(zzba zzba, PendingIntent pendingIntent, zzai zzai) {
        this.zzf.zzf(zzba, pendingIntent, zzai);
    }

    public final void zzE(LocationRequest locationRequest, PendingIntent pendingIntent, zzai zzai) {
        this.zzf.zzg(locationRequest, pendingIntent, zzai);
    }

    public final void zzF(C0360n nVar, zzai zzai) {
        this.zzf.zzh(nVar, zzai);
    }

    public final void zzG(PendingIntent pendingIntent, zzai zzai) {
        this.zzf.zzj(pendingIntent, zzai);
    }

    public final void zzH(C0360n nVar, zzai zzai) {
        this.zzf.zzi(nVar, zzai);
    }

    public final void zzI(boolean z3) {
        this.zzf.zzk(z3);
    }

    public final void zzJ(Location location) {
        this.zzf.zzl(location);
    }

    public final void zzK(zzai zzai) {
        this.zzf.zzm(zzai);
    }

    public final void zzL(i iVar, C0351e eVar, String str) {
        boolean z3;
        checkConnected();
        boolean z4 = false;
        if (iVar != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        I.a("locationSettingsRequest can't be null nor empty.", z3);
        if (eVar != null) {
            z4 = true;
        }
        I.a("listener can't be null.", z4);
        ((zzam) getService()).zzt(iVar, new zzay(eVar), (String) null);
    }

    public final void zzq(long j6, PendingIntent pendingIntent) {
        boolean z3;
        checkConnected();
        I.g(pendingIntent);
        if (j6 >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        I.a("detectionIntervalMillis must be >= 0", z3);
        ((zzam) getService()).zzh(j6, true, pendingIntent);
    }

    public final void zzr(C0138c cVar, PendingIntent pendingIntent, C0351e eVar) {
        checkConnected();
        I.h(cVar, "activityTransitionRequest must be specified.");
        I.h(pendingIntent, "PendingIntent must be specified.");
        I.h(eVar, "ResultHolder not provided.");
        ((zzam) getService()).zzi(cVar, pendingIntent, new C0367v(eVar));
    }

    public final void zzs(PendingIntent pendingIntent, C0351e eVar) {
        checkConnected();
        I.h(eVar, "ResultHolder not provided.");
        ((zzam) getService()).zzj(pendingIntent, new C0367v(eVar));
    }

    public final void zzt(PendingIntent pendingIntent) {
        checkConnected();
        I.g(pendingIntent);
        ((zzam) getService()).zzk(pendingIntent);
    }

    public final void zzu(PendingIntent pendingIntent, C0351e eVar) {
        checkConnected();
        I.h(pendingIntent, "PendingIntent must be specified.");
        I.h(eVar, "ResultHolder not provided.");
        ((zzam) getService()).zzl(pendingIntent, new C0367v(eVar));
    }

    public final void zzv(e eVar, PendingIntent pendingIntent, C0351e eVar2) {
        checkConnected();
        I.h(eVar, "geofencingRequest can't be null.");
        I.h(pendingIntent, "PendingIntent must be specified.");
        I.h(eVar2, "ResultHolder not provided.");
        ((zzam) getService()).zzd(eVar, pendingIntent, new zzaw(eVar2));
    }

    public final void zzw(A a6, C0351e eVar) {
        checkConnected();
        I.h(a6, "removeGeofencingRequest can't be null.");
        I.h(eVar, "ResultHolder not provided.");
        ((zzam) getService()).zzg(a6, new zzax(eVar));
    }

    public final void zzx(PendingIntent pendingIntent, C0351e eVar) {
        checkConnected();
        I.h(pendingIntent, "PendingIntent must be specified.");
        I.h(eVar, "ResultHolder not provided.");
        ((zzam) getService()).zze(pendingIntent, new zzax(eVar), getContext().getPackageName());
    }

    public final void zzy(List<String> list, C0351e eVar) {
        boolean z3;
        checkConnected();
        if (list == null || list.size() <= 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        I.a("geofenceRequestIds can't be null nor empty.", z3);
        I.h(eVar, "ResultHolder not provided.");
        ((zzam) getService()).zzf((String[]) list.toArray(new String[0]), new zzax(eVar), getContext().getPackageName());
    }

    public final Location zzz(String str) {
        int i2;
        d[] availableFeatures = getAvailableFeatures();
        d dVar = D.f2401a;
        int i5 = 0;
        if (availableFeatures != null) {
            i2 = availableFeatures.length;
        } else {
            i2 = 0;
        }
        while (true) {
            if (i5 >= i2) {
                break;
            } else if (!I.j(availableFeatures[i5], dVar)) {
                i5++;
            } else if (i5 >= 0) {
                return this.zzf.zza(str);
            }
        }
        return this.zzf.zzb();
    }
}
