package a;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: a.e  reason: case insensitive filesystem */
public class C0253e implements Parcelable {
    public static final Parcelable.Creator<C0253e> CREATOR = new C0251c(0);

    /* renamed from: a  reason: collision with root package name */
    public C0250b f4536a;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        synchronized (this) {
            try {
                if (this.f4536a == null) {
                    this.f4536a = new C0252d(this);
                }
                parcel.writeStrongBinder(this.f4536a.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(int i2, Bundle bundle) {
    }
}
