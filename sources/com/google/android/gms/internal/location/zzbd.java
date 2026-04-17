package com.google.android.gms.internal.location;

import R2.b;
import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

public final class zzbd implements Parcelable.Creator<zzbc> {
    public final Object createFromParcel(Parcel parcel) {
        int c12 = b.c1(parcel);
        int i2 = 1;
        zzba zzba = null;
        IBinder iBinder = null;
        PendingIntent pendingIntent = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        while (parcel.dataPosition() < c12) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i2 = b.A0(readInt, parcel);
                    break;
                case 2:
                    zzba = (zzba) b.q(parcel, readInt, zzba.CREATOR);
                    break;
                case 3:
                    iBinder = b.z0(readInt, parcel);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) b.q(parcel, readInt, PendingIntent.CREATOR);
                    break;
                case 5:
                    iBinder2 = b.z0(readInt, parcel);
                    break;
                case zzaky.zzf.zzf:
                    iBinder3 = b.z0(readInt, parcel);
                    break;
                default:
                    b.T0(readInt, parcel);
                    break;
            }
        }
        b.x(c12, parcel);
        return new zzbc(i2, zzba, iBinder, pendingIntent, iBinder2, iBinder3);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new zzbc[i2];
    }
}
