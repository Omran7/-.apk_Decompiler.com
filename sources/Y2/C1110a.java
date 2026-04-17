package y2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: y2.a  reason: case insensitive filesystem */
public abstract class C1110a implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    public final IBinder f12685a;

    /* renamed from: b  reason: collision with root package name */
    public final String f12686b;

    public C1110a(IBinder iBinder, String str) {
        this.f12685a = iBinder;
        this.f12686b = str;
    }

    public final void a(int i2, Parcel parcel) {
        try {
            this.f12685a.transact(i2, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f12685a;
    }
}
