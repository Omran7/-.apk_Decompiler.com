package android.support.v4.media.session;

import a.C0251c;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;

public final class MediaSessionCompat$ResultReceiverWrapper implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$ResultReceiverWrapper> CREATOR = new C0251c(6);

    /* renamed from: a  reason: collision with root package name */
    public ResultReceiver f4578a;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        this.f4578a.writeToParcel(parcel, i2);
    }
}
