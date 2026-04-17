package android.support.v4.media.session;

import a.C0251c;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new C0251c(9);

    /* renamed from: a  reason: collision with root package name */
    public final int f4584a;

    /* renamed from: b  reason: collision with root package name */
    public final long f4585b;

    /* renamed from: c  reason: collision with root package name */
    public final long f4586c;
    public final float d;

    /* renamed from: e  reason: collision with root package name */
    public final long f4587e;

    /* renamed from: f  reason: collision with root package name */
    public final int f4588f;

    /* renamed from: p  reason: collision with root package name */
    public final CharSequence f4589p;

    /* renamed from: q  reason: collision with root package name */
    public final long f4590q;

    /* renamed from: r  reason: collision with root package name */
    public final ArrayList f4591r;

    /* renamed from: s  reason: collision with root package name */
    public final long f4592s;

    /* renamed from: t  reason: collision with root package name */
    public final Bundle f4593t;

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new Object();

        /* renamed from: a  reason: collision with root package name */
        public final String f4594a;

        /* renamed from: b  reason: collision with root package name */
        public final CharSequence f4595b;

        /* renamed from: c  reason: collision with root package name */
        public final int f4596c;
        public final Bundle d;

        public CustomAction(Parcel parcel) {
            this.f4594a = parcel.readString();
            this.f4595b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f4596c = parcel.readInt();
            this.d = parcel.readBundle(a.class.getClassLoader());
        }

        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + this.f4595b + ", mIcon=" + this.f4596c + ", mExtras=" + this.d;
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            parcel.writeString(this.f4594a);
            TextUtils.writeToParcel(this.f4595b, parcel, i2);
            parcel.writeInt(this.f4596c);
            parcel.writeBundle(this.d);
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f4584a = parcel.readInt();
        this.f4585b = parcel.readLong();
        this.d = parcel.readFloat();
        this.f4590q = parcel.readLong();
        this.f4586c = parcel.readLong();
        this.f4587e = parcel.readLong();
        this.f4589p = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f4591r = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f4592s = parcel.readLong();
        this.f4593t = parcel.readBundle(a.class.getClassLoader());
        this.f4588f = parcel.readInt();
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "PlaybackState {state=" + this.f4584a + ", position=" + this.f4585b + ", buffered position=" + this.f4586c + ", speed=" + this.d + ", updated=" + this.f4590q + ", actions=" + this.f4587e + ", error code=" + this.f4588f + ", error message=" + this.f4589p + ", custom actions=" + this.f4591r + ", active item id=" + this.f4592s + "}";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f4584a);
        parcel.writeLong(this.f4585b);
        parcel.writeFloat(this.d);
        parcel.writeLong(this.f4590q);
        parcel.writeLong(this.f4586c);
        parcel.writeLong(this.f4587e);
        TextUtils.writeToParcel(this.f4589p, parcel, i2);
        parcel.writeTypedList(this.f4591r);
        parcel.writeLong(this.f4592s);
        parcel.writeBundle(this.f4593t);
        parcel.writeInt(this.f4588f);
    }
}
