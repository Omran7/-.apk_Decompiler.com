package f3;

import A1.a;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzaag;
import e3.C0491B;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: f3.c  reason: case insensitive filesystem */
public final class C0526c extends a implements C0491B {
    public static final Parcelable.Creator<C0526c> CREATOR = new C0525b(0);

    /* renamed from: a  reason: collision with root package name */
    public String f7913a;

    /* renamed from: b  reason: collision with root package name */
    public String f7914b;

    /* renamed from: c  reason: collision with root package name */
    public String f7915c;
    public String d;

    /* renamed from: e  reason: collision with root package name */
    public String f7916e;

    /* renamed from: f  reason: collision with root package name */
    public String f7917f;

    /* renamed from: p  reason: collision with root package name */
    public boolean f7918p;

    /* renamed from: q  reason: collision with root package name */
    public String f7919q;

    public C0526c(String str, String str2, String str3, String str4, String str5, String str6, boolean z3, String str7) {
        this.f7913a = str;
        this.f7914b = str2;
        this.f7916e = str3;
        this.f7917f = str4;
        this.f7915c = str5;
        this.d = str6;
        if (!TextUtils.isEmpty(str6)) {
            Uri.parse(str6);
        }
        this.f7918p = z3;
        this.f7919q = str7;
    }

    public static C0526c v(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new C0526c(jSONObject.optString("userId"), jSONObject.optString("providerId"), jSONObject.optString("email"), jSONObject.optString("phoneNumber"), jSONObject.optString("displayName"), jSONObject.optString("photoUrl"), jSONObject.optBoolean("isEmailVerified"), jSONObject.optString("rawUserInfo"));
        } catch (JSONException e6) {
            Log.d("DefaultAuthUserInfo", "Failed to unpack UserInfo from JSON");
            throw new zzaag(e6);
        }
    }

    public final String t() {
        return this.f7914b;
    }

    public final String w() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("userId", this.f7913a);
            jSONObject.putOpt("providerId", this.f7914b);
            jSONObject.putOpt("displayName", this.f7915c);
            jSONObject.putOpt("photoUrl", this.d);
            jSONObject.putOpt("email", this.f7916e);
            jSONObject.putOpt("phoneNumber", this.f7917f);
            jSONObject.putOpt("isEmailVerified", Boolean.valueOf(this.f7918p));
            jSONObject.putOpt("rawUserInfo", this.f7919q);
            return jSONObject.toString();
        } catch (JSONException e6) {
            Log.d("DefaultAuthUserInfo", "Failed to jsonify this object");
            throw new zzaag(e6);
        }
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.R0(parcel, 1, this.f7913a, false);
        android.support.v4.media.session.a.R0(parcel, 2, this.f7914b, false);
        android.support.v4.media.session.a.R0(parcel, 3, this.f7915c, false);
        android.support.v4.media.session.a.R0(parcel, 4, this.d, false);
        android.support.v4.media.session.a.R0(parcel, 5, this.f7916e, false);
        android.support.v4.media.session.a.R0(parcel, 6, this.f7917f, false);
        android.support.v4.media.session.a.Y0(parcel, 7, 4);
        parcel.writeInt(this.f7918p ? 1 : 0);
        android.support.v4.media.session.a.R0(parcel, 8, this.f7919q, false);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
