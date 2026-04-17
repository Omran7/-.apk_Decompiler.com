package android.support.v4.media;

import a.C0251c;
import android.os.Parcel;
import android.os.Parcelable;

public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new C0251c(4);

    /* renamed from: a  reason: collision with root package name */
    public final int f4574a;

    /* renamed from: b  reason: collision with root package name */
    public final float f4575b;

    public RatingCompat(int i2, float f6) {
        this.f4574a = i2;
        this.f4575b = f6;
    }

    public final int describeContents() {
        return this.f4574a;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.f4574a);
        sb.append(" rating=");
        float f6 = this.f4575b;
        if (f6 < 0.0f) {
            str = "unrated";
        } else {
            str = String.valueOf(f6);
        }
        sb.append(str);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f4574a);
        parcel.writeFloat(this.f4575b);
    }
}
