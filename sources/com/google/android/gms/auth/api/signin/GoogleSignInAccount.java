package com.google.android.gms.auth.api.signin;

import A1.a;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;
import w1.C1078d;

@Deprecated
public class GoogleSignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new C1078d(0);

    /* renamed from: a  reason: collision with root package name */
    public final int f5961a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5962b;

    /* renamed from: c  reason: collision with root package name */
    public final String f5963c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final String f5964e;

    /* renamed from: f  reason: collision with root package name */
    public final Uri f5965f;

    /* renamed from: p  reason: collision with root package name */
    public String f5966p;

    /* renamed from: q  reason: collision with root package name */
    public final long f5967q;

    /* renamed from: r  reason: collision with root package name */
    public final String f5968r;

    /* renamed from: s  reason: collision with root package name */
    public final ArrayList f5969s;

    /* renamed from: t  reason: collision with root package name */
    public final String f5970t;

    /* renamed from: u  reason: collision with root package name */
    public final String f5971u;

    /* renamed from: v  reason: collision with root package name */
    public final HashSet f5972v = new HashSet();

    public GoogleSignInAccount(int i2, String str, String str2, String str3, String str4, Uri uri, String str5, long j6, String str6, ArrayList arrayList, String str7, String str8) {
        this.f5961a = i2;
        this.f5962b = str;
        this.f5963c = str2;
        this.d = str3;
        this.f5964e = str4;
        this.f5965f = uri;
        this.f5966p = str5;
        this.f5967q = j6;
        this.f5968r = str6;
        this.f5969s = arrayList;
        this.f5970t = str7;
        this.f5971u = str8;
    }

    public static GoogleSignInAccount v(String str) {
        Uri uri;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        if (!TextUtils.isEmpty(optString)) {
            uri = Uri.parse(optString);
        } else {
            uri = null;
        }
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            hashSet.add(new Scope(1, jSONArray.getString(i2)));
        }
        String optString2 = jSONObject.optString("id");
        if (jSONObject.has("tokenId")) {
            str2 = jSONObject.optString("tokenId");
        } else {
            str2 = null;
        }
        if (jSONObject.has("email")) {
            str3 = jSONObject.optString("email");
        } else {
            str3 = null;
        }
        if (jSONObject.has("displayName")) {
            str4 = jSONObject.optString("displayName");
        } else {
            str4 = null;
        }
        if (jSONObject.has("givenName")) {
            str5 = jSONObject.optString("givenName");
        } else {
            str5 = null;
        }
        if (jSONObject.has("familyName")) {
            str6 = jSONObject.optString("familyName");
        } else {
            str6 = null;
        }
        String string = jSONObject.getString("obfuscatedIdentifier");
        I.d(string);
        GoogleSignInAccount googleSignInAccount = r3;
        GoogleSignInAccount googleSignInAccount2 = new GoogleSignInAccount(3, optString2, str2, str3, str4, uri, (String) null, parseLong, string, new ArrayList(hashSet), str5, str6);
        if (jSONObject.has("serverAuthCode")) {
            str7 = jSONObject.optString("serverAuthCode");
        }
        googleSignInAccount.f5966p = str7;
        return googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (googleSignInAccount.f5968r.equals(this.f5968r)) {
            HashSet hashSet = new HashSet(googleSignInAccount.f5969s);
            hashSet.addAll(googleSignInAccount.f5972v);
            HashSet hashSet2 = new HashSet(this.f5969s);
            hashSet2.addAll(this.f5972v);
            if (hashSet.equals(hashSet2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        HashSet hashSet = new HashSet(this.f5969s);
        hashSet.addAll(this.f5972v);
        return ((this.f5968r.hashCode() + 527) * 31) + hashSet.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.Y0(parcel, 1, 4);
        parcel.writeInt(this.f5961a);
        android.support.v4.media.session.a.R0(parcel, 2, this.f5962b, false);
        android.support.v4.media.session.a.R0(parcel, 3, this.f5963c, false);
        android.support.v4.media.session.a.R0(parcel, 4, this.d, false);
        android.support.v4.media.session.a.R0(parcel, 5, this.f5964e, false);
        android.support.v4.media.session.a.Q0(parcel, 6, this.f5965f, i2, false);
        android.support.v4.media.session.a.R0(parcel, 7, this.f5966p, false);
        android.support.v4.media.session.a.Y0(parcel, 8, 8);
        parcel.writeLong(this.f5967q);
        android.support.v4.media.session.a.R0(parcel, 9, this.f5968r, false);
        android.support.v4.media.session.a.V0(parcel, 10, this.f5969s, false);
        android.support.v4.media.session.a.R0(parcel, 11, this.f5970t, false);
        android.support.v4.media.session.a.R0(parcel, 12, this.f5971u, false);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
