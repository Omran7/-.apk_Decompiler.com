package com.google.android.gms.internal.location;

import A1.a;
import Q1.C0139d;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

public final class zzbe extends a implements C0139d {
    public static final Parcelable.Creator<zzbe> CREATOR = new zzbf();
    private final String zza;
    private final long zzb;
    private final short zzc;
    private final double zzd;
    private final double zze;
    private final float zzf;
    private final int zzg;
    private final int zzh;
    private final int zzi;

    public zzbe(String str, int i2, short s6, double d, double d6, float f6, long j6, int i5, int i6) {
        String str2;
        if (str == null || str.length() > 100) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2 = "requestId is null or too long: ".concat(valueOf);
            } else {
                str2 = new String("requestId is null or too long: ");
            }
            throw new IllegalArgumentException(str2);
        } else if (f6 <= 0.0f) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("invalid radius: ");
            sb.append(f6);
            throw new IllegalArgumentException(sb.toString());
        } else if (d > 90.0d || d < -90.0d) {
            StringBuilder sb2 = new StringBuilder(42);
            sb2.append("invalid latitude: ");
            sb2.append(d);
            throw new IllegalArgumentException(sb2.toString());
        } else if (d6 > 180.0d || d6 < -180.0d) {
            StringBuilder sb3 = new StringBuilder(43);
            sb3.append("invalid longitude: ");
            sb3.append(d6);
            throw new IllegalArgumentException(sb3.toString());
        } else {
            int i7 = i2 & 7;
            if (i7 != 0) {
                this.zzc = s6;
                this.zza = str;
                this.zzd = d;
                this.zze = d6;
                this.zzf = f6;
                this.zzb = j6;
                this.zzg = i7;
                this.zzh = i5;
                this.zzi = i6;
                return;
            }
            StringBuilder sb4 = new StringBuilder(46);
            sb4.append("No supported transition specified: ");
            sb4.append(i2);
            throw new IllegalArgumentException(sb4.toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzbe) {
            zzbe zzbe = (zzbe) obj;
            if (this.zzf == zzbe.zzf && this.zzd == zzbe.zzd && this.zze == zzbe.zze && this.zzc == zzbe.zzc) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final String getRequestId() {
        return this.zza;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.zzd);
        long doubleToLongBits2 = Double.doubleToLongBits(this.zze);
        return ((((Float.floatToIntBits(this.zzf) + ((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31)) * 31) + this.zzc) * 31) + this.zzg;
    }

    public final String toString() {
        String str;
        Locale locale = Locale.US;
        short s6 = this.zzc;
        if (s6 == -1) {
            str = "INVALID";
        } else if (s6 != 1) {
            str = "UNKNOWN";
        } else {
            str = "CIRCLE";
        }
        return String.format(locale, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", new Object[]{str, this.zza.replaceAll("\\p{C}", "?"), Integer.valueOf(this.zzg), Double.valueOf(this.zzd), Double.valueOf(this.zze), Float.valueOf(this.zzf), Integer.valueOf(this.zzh / 1000), Integer.valueOf(this.zzi), Long.valueOf(this.zzb)});
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.R0(parcel, 1, this.zza, false);
        long j6 = this.zzb;
        android.support.v4.media.session.a.Y0(parcel, 2, 8);
        parcel.writeLong(j6);
        short s6 = this.zzc;
        android.support.v4.media.session.a.Y0(parcel, 3, 4);
        parcel.writeInt(s6);
        double d = this.zzd;
        android.support.v4.media.session.a.Y0(parcel, 4, 8);
        parcel.writeDouble(d);
        double d6 = this.zze;
        android.support.v4.media.session.a.Y0(parcel, 5, 8);
        parcel.writeDouble(d6);
        float f6 = this.zzf;
        android.support.v4.media.session.a.Y0(parcel, 6, 4);
        parcel.writeFloat(f6);
        int i5 = this.zzg;
        android.support.v4.media.session.a.Y0(parcel, 7, 4);
        parcel.writeInt(i5);
        int i6 = this.zzh;
        android.support.v4.media.session.a.Y0(parcel, 8, 4);
        parcel.writeInt(i6);
        int i7 = this.zzi;
        android.support.v4.media.session.a.Y0(parcel, 9, 4);
        parcel.writeInt(i7);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
