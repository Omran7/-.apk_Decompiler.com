package com.google.android.gms.internal.location;

import Q1.u;
import android.location.Location;
import com.google.android.gms.common.api.internal.C0362p;

final class zzau extends u {
    private final C0362p zza;

    public zzau(C0362p pVar) {
        super("com.google.android.gms.location.ILocationListener");
        this.zza = pVar;
    }

    public final synchronized void zzc() {
        C0362p pVar = this.zza;
        pVar.f6109b = null;
        pVar.f6110c = null;
    }

    public final synchronized void zzd(Location location) {
        this.zza.a(new zzat(this, location));
    }
}
