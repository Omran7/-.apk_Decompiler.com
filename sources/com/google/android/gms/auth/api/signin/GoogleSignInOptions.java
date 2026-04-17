package com.google.android.gms.auth.api.signin;

import A1.a;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import w1.C1077c;
import w1.C1078d;
import x1.C1095a;

@Deprecated
public class GoogleSignInOptions extends a implements e, ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR = new C1078d(1);

    /* renamed from: t  reason: collision with root package name */
    public static final GoogleSignInOptions f5973t;

    /* renamed from: u  reason: collision with root package name */
    public static final Scope f5974u;

    /* renamed from: v  reason: collision with root package name */
    public static final Scope f5975v;

    /* renamed from: w  reason: collision with root package name */
    public static final Scope f5976w = new Scope(1, "https://www.googleapis.com/auth/games");

    /* renamed from: x  reason: collision with root package name */
    public static final C1077c f5977x = new C1077c(1);

    /* renamed from: a  reason: collision with root package name */
    public final int f5978a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f5979b;

    /* renamed from: c  reason: collision with root package name */
    public final Account f5980c;
    public final boolean d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f5981e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f5982f;

    /* renamed from: p  reason: collision with root package name */
    public final String f5983p;

    /* renamed from: q  reason: collision with root package name */
    public final String f5984q;

    /* renamed from: r  reason: collision with root package name */
    public final ArrayList f5985r;

    /* renamed from: s  reason: collision with root package name */
    public final String f5986s;

    static {
        Scope scope = new Scope(1, "profile");
        new Scope(1, "email");
        Scope scope2 = new Scope(1, "openid");
        f5974u = scope2;
        Scope scope3 = new Scope(1, "https://www.googleapis.com/auth/games_lite");
        f5975v = scope3;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        hashSet.add(scope2);
        hashSet.add(scope);
        if (hashSet.contains(f5976w)) {
            Scope scope4 = f5975v;
            if (hashSet.contains(scope4)) {
                hashSet.remove(scope4);
            }
        }
        f5973t = new GoogleSignInOptions(3, new ArrayList(hashSet), (Account) null, false, false, false, (String) null, (String) null, hashMap, (String) null);
        HashSet hashSet2 = new HashSet();
        HashMap hashMap2 = new HashMap();
        hashSet2.add(scope3);
        hashSet2.addAll(Arrays.asList(new Scope[0]));
        if (hashSet2.contains(f5976w)) {
            Scope scope5 = f5975v;
            if (hashSet2.contains(scope5)) {
                hashSet2.remove(scope5);
            }
        }
        new GoogleSignInOptions(3, new ArrayList(hashSet2), (Account) null, false, false, false, (String) null, (String) null, hashMap2, (String) null);
    }

    public GoogleSignInOptions(int i2, ArrayList arrayList, Account account, boolean z3, boolean z4, boolean z5, String str, String str2, HashMap hashMap, String str3) {
        this.f5978a = i2;
        this.f5979b = arrayList;
        this.f5980c = account;
        this.d = z3;
        this.f5981e = z4;
        this.f5982f = z5;
        this.f5983p = str;
        this.f5984q = str2;
        this.f5985r = new ArrayList(hashMap.values());
        this.f5986s = str3;
    }

    public static GoogleSignInOptions v(String str) {
        String str2;
        Account account;
        String str3;
        String str4 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            hashSet.add(new Scope(1, jSONArray.getString(i2)));
        }
        if (jSONObject.has("accountName")) {
            str2 = jSONObject.optString("accountName");
        } else {
            str2 = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            account = new Account(str2, "com.google");
        } else {
            account = null;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        boolean z3 = jSONObject.getBoolean("idTokenRequested");
        boolean z4 = jSONObject.getBoolean("serverAuthRequested");
        boolean z5 = jSONObject.getBoolean("forceCodeForRefreshToken");
        if (jSONObject.has("serverClientId")) {
            str3 = jSONObject.optString("serverClientId");
        } else {
            str3 = null;
        }
        if (jSONObject.has("hostedDomain")) {
            str4 = jSONObject.optString("hostedDomain");
        }
        return new GoogleSignInOptions(3, arrayList, account, z3, z4, z5, str3, str4, new HashMap(), (String) null);
    }

    public static HashMap w(ArrayList arrayList) {
        HashMap hashMap = new HashMap();
        if (arrayList != null) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C1095a aVar = (C1095a) it2.next();
                hashMap.put(Integer.valueOf(aVar.f12531b), aVar);
            }
        }
        return hashMap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0047, code lost:
        if (r1.equals(r5) != false) goto L_0x0049;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r0 = r8.f5983p
            java.util.ArrayList r1 = r8.f5979b
            r2 = 0
            if (r9 != 0) goto L_0x0008
            return r2
        L_0x0008:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r9 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r9     // Catch:{ ClassCastException -> 0x007b }
            java.util.ArrayList r3 = r9.f5979b     // Catch:{ ClassCastException -> 0x007b }
            java.lang.String r4 = r9.f5983p     // Catch:{ ClassCastException -> 0x007b }
            android.accounts.Account r5 = r9.f5980c     // Catch:{ ClassCastException -> 0x007b }
            java.util.ArrayList r6 = r8.f5985r     // Catch:{ ClassCastException -> 0x007b }
            boolean r6 = r6.isEmpty()     // Catch:{ ClassCastException -> 0x007b }
            if (r6 == 0) goto L_0x007b
            java.util.ArrayList r6 = r9.f5985r     // Catch:{ ClassCastException -> 0x007b }
            boolean r6 = r6.isEmpty()     // Catch:{ ClassCastException -> 0x007b }
            if (r6 != 0) goto L_0x0021
            goto L_0x007b
        L_0x0021:
            int r6 = r1.size()     // Catch:{ ClassCastException -> 0x007b }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ ClassCastException -> 0x007b }
            r7.<init>(r3)     // Catch:{ ClassCastException -> 0x007b }
            int r7 = r7.size()     // Catch:{ ClassCastException -> 0x007b }
            if (r6 != r7) goto L_0x007b
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ ClassCastException -> 0x007b }
            r6.<init>(r3)     // Catch:{ ClassCastException -> 0x007b }
            boolean r1 = r1.containsAll(r6)     // Catch:{ ClassCastException -> 0x007b }
            if (r1 != 0) goto L_0x003c
            goto L_0x007b
        L_0x003c:
            android.accounts.Account r1 = r8.f5980c     // Catch:{ ClassCastException -> 0x007b }
            if (r1 != 0) goto L_0x0043
            if (r5 != 0) goto L_0x007b
            goto L_0x0049
        L_0x0043:
            boolean r1 = r1.equals(r5)     // Catch:{ ClassCastException -> 0x007b }
            if (r1 == 0) goto L_0x007b
        L_0x0049:
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ ClassCastException -> 0x007b }
            if (r1 == 0) goto L_0x0056
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch:{ ClassCastException -> 0x007b }
            if (r0 == 0) goto L_0x007b
            goto L_0x005d
        L_0x0056:
            boolean r0 = r0.equals(r4)     // Catch:{ ClassCastException -> 0x007b }
            if (r0 != 0) goto L_0x005d
            goto L_0x007b
        L_0x005d:
            boolean r0 = r8.f5982f     // Catch:{ ClassCastException -> 0x007b }
            boolean r1 = r9.f5982f     // Catch:{ ClassCastException -> 0x007b }
            if (r0 != r1) goto L_0x007b
            boolean r0 = r8.d     // Catch:{ ClassCastException -> 0x007b }
            boolean r1 = r9.d     // Catch:{ ClassCastException -> 0x007b }
            if (r0 != r1) goto L_0x007b
            boolean r0 = r8.f5981e     // Catch:{ ClassCastException -> 0x007b }
            boolean r1 = r9.f5981e     // Catch:{ ClassCastException -> 0x007b }
            if (r0 != r1) goto L_0x007b
            java.lang.String r0 = r8.f5986s     // Catch:{ ClassCastException -> 0x007b }
            java.lang.String r9 = r9.f5986s     // Catch:{ ClassCastException -> 0x007b }
            boolean r9 = android.text.TextUtils.equals(r0, r9)     // Catch:{ ClassCastException -> 0x007b }
            if (r9 == 0) goto L_0x007b
            r9 = 1
            return r9
        L_0x007b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i2;
        int i5;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f5979b;
        int size = arrayList2.size();
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            arrayList.add(((Scope) arrayList2.get(i7)).f6001b);
        }
        Collections.sort(arrayList);
        Account account = this.f5980c;
        int hashCode = (arrayList.hashCode() + (1 * 31)) * 31;
        if (account == null) {
            i2 = 0;
        } else {
            i2 = account.hashCode();
        }
        int i8 = hashCode + i2;
        String str = this.f5983p;
        int i9 = i8 * 31;
        if (str == null) {
            i5 = 0;
        } else {
            i5 = str.hashCode();
        }
        int i10 = ((((((i9 + i5) * 31) + (this.f5982f ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.f5981e ? 1 : 0);
        String str2 = this.f5986s;
        int i11 = i10 * 31;
        if (str2 != null) {
            i6 = str2.hashCode();
        }
        return i11 + i6;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.Y0(parcel, 1, 4);
        parcel.writeInt(this.f5978a);
        android.support.v4.media.session.a.V0(parcel, 2, new ArrayList(this.f5979b), false);
        android.support.v4.media.session.a.Q0(parcel, 3, this.f5980c, i2, false);
        android.support.v4.media.session.a.Y0(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        android.support.v4.media.session.a.Y0(parcel, 5, 4);
        parcel.writeInt(this.f5981e ? 1 : 0);
        android.support.v4.media.session.a.Y0(parcel, 6, 4);
        parcel.writeInt(this.f5982f ? 1 : 0);
        android.support.v4.media.session.a.R0(parcel, 7, this.f5983p, false);
        android.support.v4.media.session.a.R0(parcel, 8, this.f5984q, false);
        android.support.v4.media.session.a.V0(parcel, 9, this.f5985r, false);
        android.support.v4.media.session.a.R0(parcel, 10, this.f5986s, false);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
