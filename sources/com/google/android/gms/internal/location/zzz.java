package com.google.android.gms.internal.location;

import Q1.f;
import Q1.g;
import Q1.h;
import android.app.PendingIntent;
import android.location.Location;
import android.os.Looper;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.K;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.q;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;

public final class zzz {
    public final q flushLocations(o oVar) {
        return ((K) oVar).f6046b.doWrite(new zzq(this, oVar));
    }

    public final Location getLastLocation(o oVar) {
        boolean z3;
        i iVar = h.f2413a;
        if (oVar != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        I.a("GoogleApiClient parameter is required.", z3);
        oVar.getClass();
        throw new UnsupportedOperationException();
    }

    public final LocationAvailability getLocationAvailability(o oVar) {
        boolean z3;
        i iVar = h.f2413a;
        if (oVar != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        I.a("GoogleApiClient parameter is required.", z3);
        oVar.getClass();
        throw new UnsupportedOperationException();
    }

    public final q removeLocationUpdates(o oVar, PendingIntent pendingIntent) {
        return ((K) oVar).f6046b.doWrite(new zzw(this, oVar, pendingIntent));
    }

    public final q requestLocationUpdates(o oVar, LocationRequest locationRequest, PendingIntent pendingIntent) {
        return ((K) oVar).f6046b.doWrite(new zzu(this, oVar, locationRequest, pendingIntent));
    }

    public final q setMockLocation(o oVar, Location location) {
        return ((K) oVar).f6046b.doWrite(new zzp(this, oVar, location));
    }

    public final q setMockMode(o oVar, boolean z3) {
        return ((K) oVar).f6046b.doWrite(new zzo(this, oVar, z3));
    }

    public final q removeLocationUpdates(o oVar, f fVar) {
        return ((K) oVar).f6046b.doWrite(new zzn(this, oVar, fVar));
    }

    public final q requestLocationUpdates(o oVar, LocationRequest locationRequest, f fVar, Looper looper) {
        return ((K) oVar).f6046b.doWrite(new zzt(this, oVar, locationRequest, fVar, looper));
    }

    public final q removeLocationUpdates(o oVar, g gVar) {
        return ((K) oVar).f6046b.doWrite(new zzv(this, oVar, gVar));
    }

    public final q requestLocationUpdates(o oVar, LocationRequest locationRequest, g gVar) {
        I.h(Looper.myLooper(), "Calling thread must be a prepared Looper thread.");
        return ((K) oVar).f6046b.doWrite(new zzr(this, oVar, locationRequest, gVar));
    }

    public final q requestLocationUpdates(o oVar, LocationRequest locationRequest, g gVar, Looper looper) {
        return ((K) oVar).f6046b.doWrite(new zzs(this, oVar, locationRequest, gVar, looper));
    }
}
