package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import java.nio.charset.Charset;
import v0.C1037a;
import v0.C1038b;

public class IconCompatParcelizer {
    public static IconCompat read(C1037a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f4881a = aVar.f(iconCompat.f4881a, 1);
        byte[] bArr = iconCompat.f4883c;
        if (aVar.e(2)) {
            Parcel parcel = ((C1038b) aVar).f12149e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f4883c = bArr;
        iconCompat.d = aVar.g(iconCompat.d, 3);
        iconCompat.f4884e = aVar.f(iconCompat.f4884e, 4);
        iconCompat.f4885f = aVar.f(iconCompat.f4885f, 5);
        iconCompat.g = (ColorStateList) aVar.g(iconCompat.g, 6);
        String str = iconCompat.f4886i;
        if (aVar.e(7)) {
            str = ((C1038b) aVar).f12149e.readString();
        }
        iconCompat.f4886i = str;
        String str2 = iconCompat.f4887j;
        if (aVar.e(8)) {
            str2 = ((C1038b) aVar).f12149e.readString();
        }
        iconCompat.f4887j = str2;
        iconCompat.h = PorterDuff.Mode.valueOf(iconCompat.f4886i);
        switch (iconCompat.f4881a) {
            case -1:
                Parcelable parcelable = iconCompat.d;
                if (parcelable != null) {
                    iconCompat.f4882b = parcelable;
                    break;
                } else {
                    throw new IllegalArgumentException("Invalid icon");
                }
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.d;
                if (parcelable2 == null) {
                    byte[] bArr3 = iconCompat.f4883c;
                    iconCompat.f4882b = bArr3;
                    iconCompat.f4881a = 3;
                    iconCompat.f4884e = 0;
                    iconCompat.f4885f = bArr3.length;
                    break;
                } else {
                    iconCompat.f4882b = parcelable2;
                    break;
                }
            case 2:
            case 4:
            case zzaky.zzf.zzf /*6*/:
                String str3 = new String(iconCompat.f4883c, Charset.forName("UTF-16"));
                iconCompat.f4882b = str3;
                if (iconCompat.f4881a == 2 && iconCompat.f4887j == null) {
                    iconCompat.f4887j = str3.split(":", -1)[0];
                    break;
                }
            case 3:
                iconCompat.f4882b = iconCompat.f4883c;
                break;
        }
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, C1037a aVar) {
        aVar.getClass();
        iconCompat.f4886i = iconCompat.h.name();
        switch (iconCompat.f4881a) {
            case -1:
                iconCompat.d = (Parcelable) iconCompat.f4882b;
                break;
            case 1:
            case 5:
                iconCompat.d = (Parcelable) iconCompat.f4882b;
                break;
            case 2:
                iconCompat.f4883c = ((String) iconCompat.f4882b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f4883c = (byte[]) iconCompat.f4882b;
                break;
            case 4:
            case zzaky.zzf.zzf /*6*/:
                iconCompat.f4883c = iconCompat.f4882b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i2 = iconCompat.f4881a;
        if (-1 != i2) {
            aVar.j(i2, 1);
        }
        byte[] bArr = iconCompat.f4883c;
        if (bArr != null) {
            aVar.i(2);
            int length = bArr.length;
            Parcel parcel = ((C1038b) aVar).f12149e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            aVar.i(3);
            ((C1038b) aVar).f12149e.writeParcelable(parcelable, 0);
        }
        int i5 = iconCompat.f4884e;
        if (i5 != 0) {
            aVar.j(i5, 4);
        }
        int i6 = iconCompat.f4885f;
        if (i6 != 0) {
            aVar.j(i6, 5);
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            aVar.i(6);
            ((C1038b) aVar).f12149e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f4886i;
        if (str != null) {
            aVar.i(7);
            ((C1038b) aVar).f12149e.writeString(str);
        }
        String str2 = iconCompat.f4887j;
        if (str2 != null) {
            aVar.i(8);
            ((C1038b) aVar).f12149e.writeString(str2);
        }
    }
}
