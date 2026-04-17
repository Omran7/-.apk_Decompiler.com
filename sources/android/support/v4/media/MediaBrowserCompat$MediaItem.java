package android.support.v4.media;

import a.C0251c;
import android.os.Parcel;
import android.os.Parcelable;

public class MediaBrowserCompat$MediaItem implements Parcelable {
    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new C0251c(1);

    /* renamed from: a  reason: collision with root package name */
    public final int f4563a;

    /* renamed from: b  reason: collision with root package name */
    public final MediaDescriptionCompat f4564b;

    public MediaBrowserCompat$MediaItem(Parcel parcel) {
        this.f4563a = parcel.readInt();
        this.f4564b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "MediaItem{mFlags=" + this.f4563a + ", mDescription=" + this.f4564b + '}';
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f4563a);
        this.f4564b.writeToParcel(parcel, i2);
    }
}
