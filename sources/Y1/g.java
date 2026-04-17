package y1;

import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;

public final class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new c(1);

    /* renamed from: a  reason: collision with root package name */
    public final Messenger f12661a;

    public g(IBinder iBinder) {
        this.f12661a = new Messenger(iBinder);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            Messenger messenger = this.f12661a;
            messenger.getClass();
            IBinder binder = messenger.getBinder();
            Messenger messenger2 = ((g) obj).f12661a;
            messenger2.getClass();
            return binder.equals(messenger2.getBinder());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        Messenger messenger = this.f12661a;
        messenger.getClass();
        return messenger.getBinder().hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        Messenger messenger = this.f12661a;
        messenger.getClass();
        parcel.writeStrongBinder(messenger.getBinder());
    }
}
