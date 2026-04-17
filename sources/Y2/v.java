package y2;

import android.os.Bundle;
import android.os.Parcel;

public abstract class v extends j implements w {
    public final boolean a(int i2, Parcel parcel, Parcel parcel2, int i5) {
        if (i2 != 2) {
            return false;
        }
        k.b(parcel);
        b((Bundle) k.a(parcel, Bundle.CREATOR));
        return true;
    }
}
