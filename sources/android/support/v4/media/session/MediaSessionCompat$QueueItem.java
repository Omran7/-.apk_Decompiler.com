package android.support.v4.media.session;

import a.C0251c;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;

public final class MediaSessionCompat$QueueItem implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$QueueItem> CREATOR = new C0251c(5);

    /* renamed from: a  reason: collision with root package name */
    public final MediaDescriptionCompat f4576a;

    /* renamed from: b  reason: collision with root package name */
    public final long f4577b;

    public MediaSessionCompat$QueueItem(Parcel parcel) {
        this.f4576a = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        this.f4577b = parcel.readLong();
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "MediaSession.QueueItem {Description=" + this.f4576a + ", Id=" + this.f4577b + " }";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        this.f4576a.writeToParcel(parcel, i2);
        parcel.writeLong(this.f4577b);
    }
}
