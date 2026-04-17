package com.google.android.gms.fido.u2f.api.common;

import O1.W;
import P1.c;
import P1.h;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.a;
import com.google.android.gms.common.internal.I;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

@Deprecated
public class SignRequestParams extends RequestParams {
    public static final Parcelable.Creator<SignRequestParams> CREATOR = new W(25);

    /* renamed from: a  reason: collision with root package name */
    public final Integer f6241a;

    /* renamed from: b  reason: collision with root package name */
    public final Double f6242b;

    /* renamed from: c  reason: collision with root package name */
    public final Uri f6243c;
    public final byte[] d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f6244e;

    /* renamed from: f  reason: collision with root package name */
    public final c f6245f;

    /* renamed from: p  reason: collision with root package name */
    public final String f6246p;

    public SignRequestParams(Integer num, Double d6, Uri uri, byte[] bArr, ArrayList arrayList, c cVar, String str) {
        boolean z3;
        boolean z4;
        this.f6241a = num;
        this.f6242b = d6;
        this.f6243c = uri;
        this.d = bArr;
        boolean z5 = false;
        if (arrayList == null || arrayList.isEmpty()) {
            z3 = false;
        } else {
            z3 = true;
        }
        I.a("registeredKeys must not be null or empty", z3);
        this.f6244e = arrayList;
        this.f6245f = cVar;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            h hVar = (h) it2.next();
            if (hVar.f2152b == null && uri == null) {
                z4 = false;
            } else {
                z4 = true;
            }
            I.a("registered key has null appId and no request appId is provided", z4);
            String str2 = hVar.f2152b;
            if (str2 != null) {
                hashSet.add(Uri.parse(str2));
            }
        }
        I.a("Display Hint cannot be longer than 80 characters", (str == null || str.length() <= 80) ? true : z5);
        this.f6246p = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignRequestParams)) {
            return false;
        }
        SignRequestParams signRequestParams = (SignRequestParams) obj;
        if (I.j(this.f6241a, signRequestParams.f6241a) && I.j(this.f6242b, signRequestParams.f6242b) && I.j(this.f6243c, signRequestParams.f6243c) && Arrays.equals(this.d, signRequestParams.d)) {
            ArrayList arrayList = this.f6244e;
            ArrayList arrayList2 = signRequestParams.f6244e;
            if (!arrayList.containsAll(arrayList2) || !arrayList2.containsAll(arrayList) || !I.j(this.f6245f, signRequestParams.f6245f) || !I.j(this.f6246p, signRequestParams.f6246p)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Integer valueOf = Integer.valueOf(Arrays.hashCode(this.d));
        return Arrays.hashCode(new Object[]{this.f6241a, this.f6243c, this.f6242b, this.f6244e, this.f6245f, this.f6246p, valueOf});
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = a.W0(20293, parcel);
        a.O0(parcel, 2, this.f6241a);
        a.L0(parcel, 3, this.f6242b);
        a.Q0(parcel, 4, this.f6243c, i2, false);
        a.K0(parcel, 5, this.d, false);
        a.V0(parcel, 6, this.f6244e, false);
        a.Q0(parcel, 7, this.f6245f, i2, false);
        a.R0(parcel, 8, this.f6246p, false);
        a.X0(W02, parcel);
    }
}
