package com.google.android.gms.internal.location;

import A1.a;
import Q1.q;
import Q1.s;
import Q1.u;
import Q1.v;
import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

public final class zzbc extends a {
    public static final Parcelable.Creator<zzbc> CREATOR = new zzbd();
    final int zza;
    final zzba zzb;
    final v zzc;
    final PendingIntent zzd;
    final s zze;
    final zzai zzf;

    public zzbc(int i2, zzba zzba, IBinder iBinder, PendingIntent pendingIntent, IBinder iBinder2, IBinder iBinder3) {
        v vVar;
        s sVar;
        this.zza = i2;
        this.zzb = zzba;
        zzai zzai = null;
        if (iBinder == null) {
            vVar = null;
        } else {
            vVar = u.zzb(iBinder);
        }
        this.zzc = vVar;
        this.zzd = pendingIntent;
        if (iBinder2 == null) {
            sVar = null;
        } else {
            sVar = q.zzb(iBinder2);
        }
        this.zze = sVar;
        if (iBinder3 != null) {
            IInterface queryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            if (queryLocalInterface instanceof zzai) {
                zzai = (zzai) queryLocalInterface;
            } else {
                zzai = new zzag(iBinder3);
            }
        }
        this.zzf = zzai;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [android.os.IBinder] */
    /* JADX WARNING: type inference failed for: r3v0, types: [android.os.IBinder] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.location.zzbc zza(Q1.v r8, com.google.android.gms.internal.location.zzai r9) {
        /*
            com.google.android.gms.internal.location.zzbc r7 = new com.google.android.gms.internal.location.zzbc
            if (r9 != 0) goto L_0x0005
            r9 = 0
        L_0x0005:
            r6 = r9
            r4 = 0
            r5 = 0
            r1 = 2
            r2 = 0
            r0 = r7
            r3 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.location.zzbc.zza(Q1.v, com.google.android.gms.internal.location.zzai):com.google.android.gms.internal.location.zzbc");
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [android.os.IBinder] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.location.zzbc zzb(com.google.android.gms.internal.location.zzba r8, android.app.PendingIntent r9, com.google.android.gms.internal.location.zzai r10) {
        /*
            com.google.android.gms.internal.location.zzbc r7 = new com.google.android.gms.internal.location.zzbc
            r3 = 0
            r5 = 0
            r1 = 1
            r0 = r7
            r2 = r8
            r4 = r9
            r6 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.location.zzbc.zzb(com.google.android.gms.internal.location.zzba, android.app.PendingIntent, com.google.android.gms.internal.location.zzai):com.google.android.gms.internal.location.zzbc");
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [android.os.IBinder] */
    /* JADX WARNING: type inference failed for: r5v0, types: [android.os.IBinder] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.location.zzbc zzc(Q1.s r8, com.google.android.gms.internal.location.zzai r9) {
        /*
            com.google.android.gms.internal.location.zzbc r7 = new com.google.android.gms.internal.location.zzbc
            if (r9 != 0) goto L_0x0005
            r9 = 0
        L_0x0005:
            r6 = r9
            r3 = 0
            r4 = 0
            r1 = 2
            r2 = 0
            r0 = r7
            r5 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.location.zzbc.zzc(Q1.s, com.google.android.gms.internal.location.zzai):com.google.android.gms.internal.location.zzbc");
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        IBinder iBinder;
        IBinder iBinder2;
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        int i5 = this.zza;
        android.support.v4.media.session.a.Y0(parcel, 1, 4);
        parcel.writeInt(i5);
        android.support.v4.media.session.a.Q0(parcel, 2, this.zzb, i2, false);
        v vVar = this.zzc;
        IBinder iBinder3 = null;
        if (vVar == null) {
            iBinder = null;
        } else {
            iBinder = vVar.asBinder();
        }
        android.support.v4.media.session.a.M0(parcel, 3, iBinder);
        android.support.v4.media.session.a.Q0(parcel, 4, this.zzd, i2, false);
        s sVar = this.zze;
        if (sVar == null) {
            iBinder2 = null;
        } else {
            iBinder2 = sVar.asBinder();
        }
        android.support.v4.media.session.a.M0(parcel, 5, iBinder2);
        zzai zzai = this.zzf;
        if (zzai != null) {
            iBinder3 = zzai.asBinder();
        }
        android.support.v4.media.session.a.M0(parcel, 6, iBinder3);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
