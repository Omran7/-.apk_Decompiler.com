package com.google.android.gms.auth.api.identity;

import A1.a;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import s1.b;

public class AuthorizationRequest extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<AuthorizationRequest> CREATOR = new b(5);

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f5949a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5950b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f5951c;
    public final boolean d;

    /* renamed from: e  reason: collision with root package name */
    public final Account f5952e;

    /* renamed from: f  reason: collision with root package name */
    public final String f5953f;

    /* renamed from: p  reason: collision with root package name */
    public final String f5954p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f5955q;

    public AuthorizationRequest(ArrayList arrayList, String str, boolean z3, boolean z4, Account account, String str2, String str3, boolean z5) {
        boolean z6 = false;
        if (arrayList != null && !arrayList.isEmpty()) {
            z6 = true;
        }
        I.a("requestedScopes cannot be null or empty", z6);
        this.f5949a = arrayList;
        this.f5950b = str;
        this.f5951c = z3;
        this.d = z4;
        this.f5952e = account;
        this.f5953f = str2;
        this.f5954p = str3;
        this.f5955q = z5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthorizationRequest)) {
            return false;
        }
        AuthorizationRequest authorizationRequest = (AuthorizationRequest) obj;
        ArrayList arrayList = this.f5949a;
        if (arrayList.size() != authorizationRequest.f5949a.size() || !arrayList.containsAll(authorizationRequest.f5949a) || this.f5951c != authorizationRequest.f5951c || this.f5955q != authorizationRequest.f5955q || this.d != authorizationRequest.d || !I.j(this.f5950b, authorizationRequest.f5950b) || !I.j(this.f5952e, authorizationRequest.f5952e) || !I.j(this.f5953f, authorizationRequest.f5953f) || !I.j(this.f5954p, authorizationRequest.f5954p)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Boolean valueOf = Boolean.valueOf(this.f5951c);
        Boolean valueOf2 = Boolean.valueOf(this.f5955q);
        Boolean valueOf3 = Boolean.valueOf(this.d);
        return Arrays.hashCode(new Object[]{this.f5949a, this.f5950b, valueOf, valueOf2, valueOf3, this.f5952e, this.f5953f, this.f5954p});
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.V0(parcel, 1, this.f5949a, false);
        android.support.v4.media.session.a.R0(parcel, 2, this.f5950b, false);
        android.support.v4.media.session.a.Y0(parcel, 3, 4);
        parcel.writeInt(this.f5951c ? 1 : 0);
        android.support.v4.media.session.a.Y0(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        android.support.v4.media.session.a.Q0(parcel, 5, this.f5952e, i2, false);
        android.support.v4.media.session.a.R0(parcel, 6, this.f5953f, false);
        android.support.v4.media.session.a.R0(parcel, 7, this.f5954p, false);
        android.support.v4.media.session.a.Y0(parcel, 8, 4);
        parcel.writeInt(this.f5955q ? 1 : 0);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
