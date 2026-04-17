package com.google.android.gms.internal.location;

import R2.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

public final class zzbf implements Parcelable.Creator<zzbe> {
    public final Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int c12 = b.c1(parcel);
        String str = null;
        int i2 = 0;
        short s6 = 0;
        int i5 = 0;
        double d = 0.0d;
        double d6 = 0.0d;
        float f6 = 0.0f;
        long j6 = 0;
        int i6 = -1;
        while (parcel.dataPosition() < c12) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = b.r(readInt, parcel2);
                    break;
                case 2:
                    j6 = b.C0(readInt, parcel2);
                    break;
                case 3:
                    b.f1(parcel2, readInt, 4);
                    s6 = (short) parcel.readInt();
                    break;
                case 4:
                    b.f1(parcel2, readInt, 8);
                    d = parcel.readDouble();
                    break;
                case 5:
                    b.f1(parcel2, readInt, 8);
                    d6 = parcel.readDouble();
                    break;
                case zzaky.zzf.zzf:
                    b.f1(parcel2, readInt, 4);
                    f6 = parcel.readFloat();
                    break;
                case zzaky.zzf.zzg:
                    i2 = b.A0(readInt, parcel2);
                    break;
                case 8:
                    i5 = b.A0(readInt, parcel2);
                    break;
                case 9:
                    i6 = b.A0(readInt, parcel2);
                    break;
                default:
                    b.T0(readInt, parcel2);
                    break;
            }
        }
        b.x(c12, parcel2);
        return new zzbe(str, i2, s6, d, d6, f6, j6, i5, i6);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new zzbe[i2];
    }
}
