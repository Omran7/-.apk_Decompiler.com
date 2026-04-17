package com.google.android.gms.auth.api.identity;

import A1.a;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import s1.b;

public class SaveAccountLinkingTokenRequest extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<SaveAccountLinkingTokenRequest> CREATOR = new b(15);

    /* renamed from: a  reason: collision with root package name */
    public final PendingIntent f5956a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5957b;

    /* renamed from: c  reason: collision with root package name */
    public final String f5958c;
    public final ArrayList d;

    /* renamed from: e  reason: collision with root package name */
    public final String f5959e;

    /* renamed from: f  reason: collision with root package name */
    public final int f5960f;

    public SaveAccountLinkingTokenRequest(PendingIntent pendingIntent, String str, String str2, ArrayList arrayList, String str3, int i2) {
        this.f5956a = pendingIntent;
        this.f5957b = str;
        this.f5958c = str2;
        this.d = arrayList;
        this.f5959e = str3;
        this.f5960f = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SaveAccountLinkingTokenRequest)) {
            return false;
        }
        SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest = (SaveAccountLinkingTokenRequest) obj;
        ArrayList arrayList = this.d;
        if (arrayList.size() != saveAccountLinkingTokenRequest.d.size() || !arrayList.containsAll(saveAccountLinkingTokenRequest.d) || !I.j(this.f5956a, saveAccountLinkingTokenRequest.f5956a) || !I.j(this.f5957b, saveAccountLinkingTokenRequest.f5957b) || !I.j(this.f5958c, saveAccountLinkingTokenRequest.f5958c) || !I.j(this.f5959e, saveAccountLinkingTokenRequest.f5959e) || this.f5960f != saveAccountLinkingTokenRequest.f5960f) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5956a, this.f5957b, this.f5958c, this.d, this.f5959e});
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.Q0(parcel, 1, this.f5956a, i2, false);
        android.support.v4.media.session.a.R0(parcel, 2, this.f5957b, false);
        android.support.v4.media.session.a.R0(parcel, 3, this.f5958c, false);
        android.support.v4.media.session.a.T0(parcel, 4, this.d);
        android.support.v4.media.session.a.R0(parcel, 5, this.f5959e, false);
        android.support.v4.media.session.a.Y0(parcel, 6, 4);
        parcel.writeInt(this.f5960f);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
