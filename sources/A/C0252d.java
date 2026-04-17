package a;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: a.d  reason: case insensitive filesystem */
public final class C0252d extends Binder implements C0250b {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f4534b = 0;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0253e f4535a;

    public C0252d(C0253e eVar) {
        this.f4535a = eVar;
        attachInterface(this, C0250b.g);
    }

    public final boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i5) {
        Object obj;
        String str = C0250b.g;
        if (i2 >= 1 && i2 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i2 == 1598968902) {
            parcel2.writeString(str);
            return true;
        } else if (i2 != 1) {
            return super.onTransact(i2, parcel, parcel2, i5);
        } else {
            int readInt = parcel.readInt();
            Parcelable.Creator creator = Bundle.CREATOR;
            if (parcel.readInt() != 0) {
                obj = creator.createFromParcel(parcel);
            } else {
                obj = null;
            }
            C0253e eVar = this.f4535a;
            eVar.getClass();
            eVar.a(readInt, (Bundle) obj);
            return true;
        }
    }

    public final IBinder asBinder() {
        return this;
    }
}
