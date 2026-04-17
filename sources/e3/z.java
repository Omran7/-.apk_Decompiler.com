package e3;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.a;
import android.util.Log;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.p002firebaseauthapi.zzaag;
import com.google.android.gms.internal.p002firebaseauthapi.zzair;
import com.google.android.material.datepicker.n;
import org.json.JSONException;
import org.json.JSONObject;

public final class z extends r {
    public static final Parcelable.Creator<z> CREATOR = new n(7);

    /* renamed from: a  reason: collision with root package name */
    public final String f7662a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7663b;

    /* renamed from: c  reason: collision with root package name */
    public final long f7664c;
    public final zzair d;

    public z(String str, String str2, long j6, zzair zzair) {
        I.d(str);
        this.f7662a = str;
        this.f7663b = str2;
        this.f7664c = j6;
        I.h(zzair, "totpInfo cannot be null.");
        this.d = zzair;
    }

    public static z x(JSONObject jSONObject) {
        if (jSONObject.has("enrollmentTimestamp")) {
            long optLong = jSONObject.optLong("enrollmentTimestamp");
            if (jSONObject.opt("totpInfo") != null) {
                return new z(jSONObject.optString("uid"), jSONObject.optString("displayName"), optLong, new zzair());
            }
            throw new IllegalArgumentException("A totpInfo is required to build a TotpMultiFactorInfo instance.");
        }
        throw new IllegalArgumentException("An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a TotpMultiFactorInfo instance.");
    }

    public final String v() {
        return "totp";
    }

    public final JSONObject w() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", "totp");
            jSONObject.putOpt("uid", this.f7662a);
            jSONObject.putOpt("displayName", this.f7663b);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.f7664c));
            jSONObject.putOpt("totpInfo", this.d);
            return jSONObject;
        } catch (JSONException e6) {
            Log.d("TotpMultiFactorInfo", "Failed to jsonify this object");
            throw new zzaag(e6);
        }
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = a.W0(20293, parcel);
        a.R0(parcel, 1, this.f7662a, false);
        a.R0(parcel, 2, this.f7663b, false);
        a.Y0(parcel, 3, 8);
        parcel.writeLong(this.f7664c);
        a.Q0(parcel, 4, this.d, i2, false);
        a.X0(W02, parcel);
    }
}
