package com.google.android.gms.internal.location;

import A1.a;
import Q1.C;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.C0378g;
import com.google.android.gms.common.internal.I;
import java.util.Collections;
import java.util.List;

public final class zzj extends a {
    public static final Parcelable.Creator<zzj> CREATOR = new zzk();
    static final List<C0378g> zza = Collections.emptyList();
    static final C zzb = new C(true, 50, 0.0f, Long.MAX_VALUE, f.API_PRIORITY_OTHER);
    final C zzc;
    final List<C0378g> zzd;
    final String zze;

    public zzj(C c3, List<C0378g> list, String str) {
        this.zzc = c3;
        this.zzd = list;
        this.zze = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzj)) {
            return false;
        }
        zzj zzj = (zzj) obj;
        if (!I.j(this.zzc, zzj.zzc) || !I.j(this.zzd, zzj.zzd) || !I.j(this.zze, zzj.zze)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.zzc.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzc);
        String valueOf2 = String.valueOf(this.zzd);
        String str = this.zze;
        int length = valueOf.length();
        StringBuilder sb = new StringBuilder(length + 77 + valueOf2.length() + String.valueOf(str).length());
        sb.append("DeviceOrientationRequestInternal{deviceOrientationRequest=");
        sb.append(valueOf);
        sb.append(", clients=");
        sb.append(valueOf2);
        sb.append(", tag='");
        sb.append(str);
        sb.append("'}");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.Q0(parcel, 1, this.zzc, i2, false);
        android.support.v4.media.session.a.V0(parcel, 2, this.zzd, false);
        android.support.v4.media.session.a.R0(parcel, 3, this.zze, false);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
