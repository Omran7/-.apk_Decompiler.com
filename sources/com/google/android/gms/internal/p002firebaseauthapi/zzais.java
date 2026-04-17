package com.google.android.gms.internal.p002firebaseauthapi;

import R2.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzais  reason: invalid package */
public final class zzais implements Parcelable.Creator<zzait> {
    public final Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int c12 = b.c1(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        while (parcel.dataPosition() < c12) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = b.r(readInt, parcel2);
                    break;
                case 3:
                    str2 = b.r(readInt, parcel2);
                    break;
                case 4:
                    str3 = b.r(readInt, parcel2);
                    break;
                case 5:
                    str4 = b.r(readInt, parcel2);
                    break;
                case zzaky.zzf.zzf /*6*/:
                    str5 = b.r(readInt, parcel2);
                    break;
                case zzaky.zzf.zzg /*7*/:
                    str6 = b.r(readInt, parcel2);
                    break;
                case 8:
                    str7 = b.r(readInt, parcel2);
                    break;
                case 9:
                    str8 = b.r(readInt, parcel2);
                    break;
                case 10:
                    z3 = b.w0(readInt, parcel2);
                    break;
                case ModuleDescriptor.MODULE_VERSION:
                    z4 = b.w0(readInt, parcel2);
                    break;
                case 12:
                    str9 = b.r(readInt, parcel2);
                    break;
                case 13:
                    str10 = b.r(readInt, parcel2);
                    break;
                case 14:
                    str11 = b.r(readInt, parcel2);
                    break;
                case 15:
                    str12 = b.r(readInt, parcel2);
                    break;
                case 16:
                    z5 = b.w0(readInt, parcel2);
                    break;
                case 17:
                    str13 = b.r(readInt, parcel2);
                    break;
                default:
                    b.T0(readInt, parcel2);
                    break;
            }
        }
        b.x(c12, parcel2);
        return new zzait(str, str2, str3, str4, str5, str6, str7, str8, z3, z4, str9, str10, str11, str12, z5, str13);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzait[i2];
    }
}
