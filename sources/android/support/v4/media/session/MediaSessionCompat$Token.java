package android.support.v4.media.session;

import a.C0251c;
import android.os.Parcel;
import android.os.Parcelable;

public final class MediaSessionCompat$Token implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$Token> CREATOR = new C0251c(7);

    /* renamed from: a  reason: collision with root package name */
    public final Parcelable f4579a;

    public MediaSessionCompat$Token(Parcelable parcelable) {
        this.f4579a = parcelable;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaSessionCompat$Token)) {
            return false;
        }
        MediaSessionCompat$Token mediaSessionCompat$Token = (MediaSessionCompat$Token) obj;
        Parcelable parcelable = this.f4579a;
        if (parcelable != null) {
            Parcelable parcelable2 = mediaSessionCompat$Token.f4579a;
            if (parcelable2 == null) {
                return false;
            }
            return parcelable.equals(parcelable2);
        } else if (mediaSessionCompat$Token.f4579a == null) {
            return true;
        } else {
            return false;
        }
    }

    public final int hashCode() {
        Parcelable parcelable = this.f4579a;
        if (parcelable == null) {
            return 0;
        }
        return parcelable.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f4579a, i2);
    }
}
