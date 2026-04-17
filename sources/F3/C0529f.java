package f3;

import A1.c;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: f3.f  reason: case insensitive filesystem */
public final class C0529f implements c {
    public static final Parcelable.Creator<C0529f> CREATOR = new C0525b(2);

    /* renamed from: a  reason: collision with root package name */
    public final long f7932a;

    /* renamed from: b  reason: collision with root package name */
    public final long f7933b;

    public C0529f(long j6, long j7) {
        this.f7932a = j6;
        this.f7933b = j7;
    }

    public static C0529f a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return new C0529f(jSONObject.getLong("lastSignInTimestamp"), jSONObject.getLong("creationTimestamp"));
        } catch (JSONException unused) {
            return null;
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = a.W0(20293, parcel);
        a.Y0(parcel, 1, 8);
        parcel.writeLong(this.f7932a);
        a.Y0(parcel, 2, 8);
        parcel.writeLong(this.f7933b);
        a.X0(W02, parcel);
    }
}
