package android.support.v4.media;

import a.C0251c;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new C0251c(2);

    /* renamed from: a  reason: collision with root package name */
    public final String f4565a;

    /* renamed from: b  reason: collision with root package name */
    public final CharSequence f4566b;

    /* renamed from: c  reason: collision with root package name */
    public final CharSequence f4567c;
    public final CharSequence d;

    /* renamed from: e  reason: collision with root package name */
    public final Bitmap f4568e;

    /* renamed from: f  reason: collision with root package name */
    public final Uri f4569f;

    /* renamed from: p  reason: collision with root package name */
    public final Bundle f4570p;

    /* renamed from: q  reason: collision with root package name */
    public final Uri f4571q;

    /* renamed from: r  reason: collision with root package name */
    public Object f4572r;

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f4565a = str;
        this.f4566b = charSequence;
        this.f4567c = charSequence2;
        this.d = charSequence3;
        this.f4568e = bitmap;
        this.f4569f = uri;
        this.f4570p = bundle;
        this.f4571q = uri2;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return this.f4566b + ", " + this.f4567c + ", " + this.d;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        Object obj = this.f4572r;
        if (obj == null) {
            MediaDescription.Builder builder = new MediaDescription.Builder();
            builder.setMediaId(this.f4565a);
            builder.setTitle(this.f4566b);
            builder.setSubtitle(this.f4567c);
            builder.setDescription(this.d);
            builder.setIconBitmap(this.f4568e);
            builder.setIconUri(this.f4569f);
            builder.setExtras(this.f4570p);
            builder.setMediaUri(this.f4571q);
            obj = builder.build();
            this.f4572r = obj;
        }
        ((MediaDescription) obj).writeToParcel(parcel, i2);
    }
}
