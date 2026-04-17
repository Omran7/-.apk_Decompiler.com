package y2;

import android.os.Bundle;
import android.os.Parcel;

public abstract class q extends j implements r {
    public final boolean a(int i2, Parcel parcel, Parcel parcel2, int i5) {
        if (i2 == 2) {
            k.b(parcel);
            e((Bundle) k.a(parcel, Bundle.CREATOR));
            return true;
        } else if (i2 == 3) {
            k.b(parcel);
            c((Bundle) k.a(parcel, Bundle.CREATOR));
            return true;
        } else if (i2 == 4) {
            k.b(parcel);
            d((Bundle) k.a(parcel, Bundle.CREATOR));
            return true;
        } else if (i2 != 5) {
            return false;
        } else {
            k.b(parcel);
            b((Bundle) k.a(parcel, Bundle.CREATOR));
            return true;
        }
    }
}
