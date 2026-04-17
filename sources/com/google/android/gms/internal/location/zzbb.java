package com.google.android.gms.internal.location;

import R2.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C0378g;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;

public final class zzbb implements Parcelable.Creator<zzba> {
    public final Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int c12 = b.c1(parcel);
        ArrayList arrayList = zzba.zza;
        LocationRequest locationRequest = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        long j6 = Long.MAX_VALUE;
        while (parcel.dataPosition() < c12) {
            int readInt = parcel.readInt();
            char c3 = (char) readInt;
            if (c3 != 1) {
                switch (c3) {
                    case 5:
                        arrayList = b.v(parcel2, readInt, C0378g.CREATOR);
                        break;
                    case zzaky.zzf.zzf:
                        str = b.r(readInt, parcel2);
                        break;
                    case zzaky.zzf.zzg:
                        z3 = b.w0(readInt, parcel2);
                        break;
                    case 8:
                        z4 = b.w0(readInt, parcel2);
                        break;
                    case 9:
                        z5 = b.w0(readInt, parcel2);
                        break;
                    case 10:
                        str2 = b.r(readInt, parcel2);
                        break;
                    case ModuleDescriptor.MODULE_VERSION:
                        z6 = b.w0(readInt, parcel2);
                        break;
                    case 12:
                        z7 = b.w0(readInt, parcel2);
                        break;
                    case 13:
                        str3 = b.r(readInt, parcel2);
                        break;
                    case 14:
                        j6 = b.C0(readInt, parcel2);
                        break;
                    default:
                        b.T0(readInt, parcel2);
                        break;
                }
            } else {
                locationRequest = (LocationRequest) b.q(parcel2, readInt, LocationRequest.CREATOR);
            }
        }
        b.x(c12, parcel2);
        return new zzba(locationRequest, arrayList, str, z3, z4, z5, str2, z6, z7, str3, j6);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new zzba[i2];
    }
}
