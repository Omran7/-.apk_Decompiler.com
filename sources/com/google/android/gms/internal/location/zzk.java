package com.google.android.gms.internal.location;

import Q1.C;
import R2.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C0378g;
import java.util.List;

public final class zzk implements Parcelable.Creator<zzj> {
    public final Object createFromParcel(Parcel parcel) {
        int c12 = b.c1(parcel);
        C c3 = zzj.zzb;
        List<C0378g> list = zzj.zza;
        String str = null;
        while (parcel.dataPosition() < c12) {
            int readInt = parcel.readInt();
            char c6 = (char) readInt;
            if (c6 == 1) {
                c3 = (C) b.q(parcel, readInt, C.CREATOR);
            } else if (c6 == 2) {
                list = b.v(parcel, readInt, C0378g.CREATOR);
            } else if (c6 != 3) {
                b.T0(readInt, parcel);
            } else {
                str = b.r(readInt, parcel);
            }
        }
        b.x(c12, parcel);
        return new zzj(c3, list, str);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new zzj[i2];
    }
}
