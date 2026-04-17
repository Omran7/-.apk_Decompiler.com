package e3;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.a;
import android.util.Log;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.p002firebaseauthapi.zzaag;
import com.google.android.material.datepicker.n;
import org.json.JSONException;
import org.json.JSONObject;

public final class w extends r {
    public static final Parcelable.Creator<w> CREATOR = new n(5);

    /* renamed from: a  reason: collision with root package name */
    public final String f7658a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7659b;

    /* renamed from: c  reason: collision with root package name */
    public final long f7660c;
    public final String d;

    public w(long j6, String str, String str2, String str3) {
        I.d(str);
        this.f7658a = str;
        this.f7659b = str2;
        this.f7660c = j6;
        I.d(str3);
        this.d = str3;
    }

    public static w x(JSONObject jSONObject) {
        if (jSONObject.has("enrollmentTimestamp")) {
            return new w(jSONObject.optLong("enrollmentTimestamp"), jSONObject.optString("uid"), jSONObject.optString("displayName"), jSONObject.optString("phoneNumber"));
        }
        throw new IllegalArgumentException("An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a PhoneMultiFactorInfo instance.");
    }

    public final String v() {
        return "phone";
    }

    public final JSONObject w() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", "phone");
            jSONObject.putOpt("uid", this.f7658a);
            jSONObject.putOpt("displayName", this.f7659b);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.f7660c));
            jSONObject.putOpt("phoneNumber", this.d);
            return jSONObject;
        } catch (JSONException e6) {
            Log.d("PhoneMultiFactorInfo", "Failed to jsonify this object");
            throw new zzaag(e6);
        }
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = a.W0(20293, parcel);
        a.R0(parcel, 1, this.f7658a, false);
        a.R0(parcel, 2, this.f7659b, false);
        a.Y0(parcel, 3, 8);
        parcel.writeLong(this.f7660c);
        a.R0(parcel, 4, this.d, false);
        a.X0(W02, parcel);
    }
}
