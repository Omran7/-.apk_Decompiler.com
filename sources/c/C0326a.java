package c;

import a.C0251c;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.j;

/* renamed from: c.a  reason: case insensitive filesystem */
public final class C0326a implements Parcelable {
    public static final Parcelable.Creator<C0326a> CREATOR = new C0251c(15);

    /* renamed from: a  reason: collision with root package name */
    public final int f5560a;

    /* renamed from: b  reason: collision with root package name */
    public final Intent f5561b;

    public C0326a(Intent intent, int i2) {
        this.f5560a = i2;
        this.f5561b = intent;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i2 = this.f5560a;
        if (i2 == -1) {
            str = "RESULT_OK";
        } else if (i2 != 0) {
            str = String.valueOf(i2);
        } else {
            str = "RESULT_CANCELED";
        }
        sb.append(str);
        sb.append(", data=");
        sb.append(this.f5561b);
        sb.append('}');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int i5;
        j.e(parcel, "dest");
        parcel.writeInt(this.f5560a);
        Intent intent = this.f5561b;
        if (intent == null) {
            i5 = 0;
        } else {
            i5 = 1;
        }
        parcel.writeInt(i5);
        if (intent != null) {
            intent.writeToParcel(parcel, i2);
        }
    }
}
