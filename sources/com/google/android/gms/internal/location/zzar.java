package com.google.android.gms.internal.location;

import Q1.q;
import com.google.android.gms.common.api.internal.C0362p;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

final class zzar extends q {
    private final C0362p zza;

    public zzar(C0362p pVar) {
        super("com.google.android.gms.location.ILocationCallback");
        this.zza = pVar;
    }

    public final synchronized void zzc() {
        C0362p pVar = this.zza;
        pVar.f6109b = null;
        pVar.f6110c = null;
    }

    public final void zzd(LocationResult locationResult) {
        this.zza.a(new zzap(this, locationResult));
    }

    public final void zze(LocationAvailability locationAvailability) {
        this.zza.a(new zzaq(this, locationAvailability));
    }
}
