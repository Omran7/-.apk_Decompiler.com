package P1;

import A1.a;
import O1.W;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.I;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

public final class h extends a {
    public static final Parcelable.Creator<h> CREATOR = new W(24);

    /* renamed from: a  reason: collision with root package name */
    public final d f2151a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2152b;

    /* renamed from: c  reason: collision with root package name */
    public final String f2153c;

    public h(d dVar, String str, String str2) {
        I.g(dVar);
        this.f2151a = dVar;
        this.f2153c = str;
        this.f2152b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        String str = this.f2153c;
        if (str == null) {
            if (hVar.f2153c != null) {
                return false;
            }
        } else if (!str.equals(hVar.f2153c)) {
            return false;
        }
        if (!this.f2151a.equals(hVar.f2151a)) {
            return false;
        }
        String str2 = hVar.f2152b;
        String str3 = this.f2152b;
        if (str3 == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str3.equals(str2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i2;
        int i5 = 0;
        String str = this.f2153c;
        if (str == null) {
            i2 = 0;
        } else {
            i2 = str.hashCode();
        }
        int hashCode = this.f2151a.hashCode() + ((i2 + 31) * 31);
        String str2 = this.f2152b;
        if (str2 != null) {
            i5 = str2.hashCode();
        }
        return (hashCode * 31) + i5;
    }

    public final String toString() {
        d dVar = this.f2151a;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("keyHandle", Base64.encodeToString(dVar.f2143b, 11));
            f fVar = dVar.f2144c;
            if (fVar != f.UNKNOWN) {
                jSONObject.put("version", fVar.f2147a);
            }
            ArrayList arrayList = dVar.d;
            if (arrayList != null) {
                jSONObject.put("transports", arrayList.toString());
            }
            String str = this.f2153c;
            if (str != null) {
                jSONObject.put("challenge", str);
            }
            String str2 = this.f2152b;
            if (str2 != null) {
                jSONObject.put("appId", str2);
            }
            return jSONObject.toString();
        } catch (JSONException e6) {
            throw new RuntimeException(e6);
        }
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.Q0(parcel, 2, this.f2151a, i2, false);
        android.support.v4.media.session.a.R0(parcel, 3, this.f2153c, false);
        android.support.v4.media.session.a.R0(parcel, 4, this.f2152b, false);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
