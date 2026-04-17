package com.google.android.gms.internal.measurement;

import R2.b;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

public final class zzdi implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int c12 = b.c1(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        String str4 = null;
        boolean z3 = false;
        long j6 = 0;
        long j7 = 0;
        while (parcel.dataPosition() < c12) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    j6 = b.C0(readInt, parcel2);
                    break;
                case 2:
                    j7 = b.C0(readInt, parcel2);
                    break;
                case 3:
                    z3 = b.w0(readInt, parcel2);
                    break;
                case 4:
                    str = b.r(readInt, parcel2);
                    break;
                case 5:
                    str2 = b.r(readInt, parcel2);
                    break;
                case zzaky.zzf.zzf:
                    str3 = b.r(readInt, parcel2);
                    break;
                case zzaky.zzf.zzg:
                    bundle = b.n(readInt, parcel2);
                    break;
                case 8:
                    str4 = b.r(readInt, parcel2);
                    break;
                default:
                    b.T0(readInt, parcel2);
                    break;
            }
        }
        b.x(c12, parcel2);
        return new zzdh(j6, j7, z3, str, str2, str3, bundle, str4);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzdh[i2];
    }
}
