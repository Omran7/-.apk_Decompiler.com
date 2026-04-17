package e3;

import A1.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzaj;
import com.google.android.gms.internal.p002firebaseauthapi.zzam;
import com.google.android.material.datepicker.n;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public final class F extends a {
    public static final Parcelable.Creator<F> CREATOR = new n(3);

    /* renamed from: a  reason: collision with root package name */
    public final String f7614a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7615b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7616c;

    public F(String str, String str2, String str3) {
        this.f7614a = str;
        this.f7615b = str2;
        this.f7616c = str3;
    }

    public static zzaj v(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return zzaj.zza(new ArrayList());
        }
        zzam zzg = zzaj.zzg();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i2);
            zzg.zza(new F(jSONObject.getString("credentialId"), jSONObject.getString("name"), jSONObject.getString("displayName")));
        }
        return zzg.zza();
    }

    public static final F w(JSONObject jSONObject) {
        return new F(jSONObject.getString("credentialId"), jSONObject.getString("name"), jSONObject.getString("displayName"));
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.R0(parcel, 1, this.f7614a, false);
        android.support.v4.media.session.a.R0(parcel, 2, this.f7615b, false);
        android.support.v4.media.session.a.R0(parcel, 3, this.f7616c, false);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
