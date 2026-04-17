package c;

import a.C0251c;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.j;

/* renamed from: c.i  reason: case insensitive filesystem */
public final class C0334i implements Parcelable {
    public static final Parcelable.Creator<C0334i> CREATOR = new C0251c(16);

    /* renamed from: a  reason: collision with root package name */
    public final IntentSender f5573a;

    /* renamed from: b  reason: collision with root package name */
    public final Intent f5574b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5575c;
    public final int d;

    public C0334i(IntentSender intentSender, Intent intent, int i2, int i5) {
        j.e(intentSender, "intentSender");
        this.f5573a = intentSender;
        this.f5574b = intent;
        this.f5575c = i2;
        this.d = i5;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        j.e(parcel, "dest");
        parcel.writeParcelable(this.f5573a, i2);
        parcel.writeParcelable(this.f5574b, i2);
        parcel.writeInt(this.f5575c);
        parcel.writeInt(this.d);
    }
}
