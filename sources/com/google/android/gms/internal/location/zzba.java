package com.google.android.gms.internal.location;

import A1.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C0378g;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;

public final class zzba extends a {
    public static final Parcelable.Creator<zzba> CREATOR = new zzbb();
    static final List<C0378g> zza = Collections.emptyList();
    final LocationRequest zzb;
    final List<C0378g> zzc;
    final String zzd;
    final boolean zze;
    final boolean zzf;
    final boolean zzg;
    final String zzh;
    final boolean zzi;
    boolean zzj;
    String zzk;
    long zzl;

    public zzba(LocationRequest locationRequest, List<C0378g> list, String str, boolean z3, boolean z4, boolean z5, String str2, boolean z6, boolean z7, String str3, long j6) {
        this.zzb = locationRequest;
        this.zzc = list;
        this.zzd = str;
        this.zze = z3;
        this.zzf = z4;
        this.zzg = z5;
        this.zzh = str2;
        this.zzi = z6;
        this.zzj = z7;
        this.zzk = str3;
        this.zzl = j6;
    }

    public static zzba zza(String str, LocationRequest locationRequest) {
        return new zzba(locationRequest, zza, (String) null, false, false, false, (String) null, false, false, (String) null, Long.MAX_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzba) {
            zzba zzba = (zzba) obj;
            if (!I.j(this.zzb, zzba.zzb) || !I.j(this.zzc, zzba.zzc) || !I.j(this.zzd, zzba.zzd) || this.zze != zzba.zze || this.zzf != zzba.zzf || this.zzg != zzba.zzg || !I.j(this.zzh, zzba.zzh) || this.zzi != zzba.zzi || this.zzj != zzba.zzj || !I.j(this.zzk, zzba.zzk)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.zzb);
        if (this.zzd != null) {
            sb.append(" tag=");
            sb.append(this.zzd);
        }
        if (this.zzh != null) {
            sb.append(" moduleId=");
            sb.append(this.zzh);
        }
        if (this.zzk != null) {
            sb.append(" contextAttributionTag=");
            sb.append(this.zzk);
        }
        sb.append(" hideAppOps=");
        sb.append(this.zze);
        sb.append(" clients=");
        sb.append(this.zzc);
        sb.append(" forceCoarseLocation=");
        sb.append(this.zzf);
        if (this.zzg) {
            sb.append(" exemptFromBackgroundThrottle");
        }
        if (this.zzi) {
            sb.append(" locationSettingsIgnored");
        }
        if (this.zzj) {
            sb.append(" inaccurateLocationsDelayed");
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.Q0(parcel, 1, this.zzb, i2, false);
        android.support.v4.media.session.a.V0(parcel, 5, this.zzc, false);
        android.support.v4.media.session.a.R0(parcel, 6, this.zzd, false);
        boolean z3 = this.zze;
        android.support.v4.media.session.a.Y0(parcel, 7, 4);
        parcel.writeInt(z3 ? 1 : 0);
        boolean z4 = this.zzf;
        android.support.v4.media.session.a.Y0(parcel, 8, 4);
        parcel.writeInt(z4 ? 1 : 0);
        boolean z5 = this.zzg;
        android.support.v4.media.session.a.Y0(parcel, 9, 4);
        parcel.writeInt(z5 ? 1 : 0);
        android.support.v4.media.session.a.R0(parcel, 10, this.zzh, false);
        boolean z6 = this.zzi;
        android.support.v4.media.session.a.Y0(parcel, 11, 4);
        parcel.writeInt(z6 ? 1 : 0);
        boolean z7 = this.zzj;
        android.support.v4.media.session.a.Y0(parcel, 12, 4);
        parcel.writeInt(z7 ? 1 : 0);
        android.support.v4.media.session.a.R0(parcel, 13, this.zzk, false);
        long j6 = this.zzl;
        android.support.v4.media.session.a.Y0(parcel, 14, 8);
        parcel.writeLong(j6);
        android.support.v4.media.session.a.X0(W02, parcel);
    }

    public final zzba zzb(long j6) {
        LocationRequest locationRequest = this.zzb;
        long j7 = locationRequest.f6257q;
        long j8 = locationRequest.f6252b;
        if (j7 < j8) {
            j7 = j8;
        }
        if (j7 <= j8) {
            this.zzl = 10000;
            return this;
        }
        LocationRequest locationRequest2 = this.zzb;
        long j9 = locationRequest2.f6252b;
        long j10 = locationRequest2.f6257q;
        if (j10 < j9) {
            j10 = j9;
        }
        StringBuilder sb = new StringBuilder(120);
        sb.append("could not set max age when location batching is requested, interval=");
        sb.append(j9);
        sb.append("maxWaitTime=");
        sb.append(j10);
        throw new IllegalArgumentException(sb.toString());
    }

    public final zzba zzc(String str) {
        this.zzk = str;
        return this;
    }

    public final zzba zzd(boolean z3) {
        this.zzj = true;
        return this;
    }
}
