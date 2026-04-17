package com.google.android.gms.fido.u2f.api.common;

import O1.W;
import P1.c;
import P1.g;
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
public class RegisterRequestParams extends RequestParams {
    public static final Parcelable.Creator<RegisterRequestParams> CREATOR = new W(23);

    /* renamed from: a  reason: collision with root package name */
    public final Integer f6235a;

    /* renamed from: b  reason: collision with root package name */
    public final Double f6236b;

    /* renamed from: c  reason: collision with root package name */
    public final Uri f6237c;
    public final ArrayList d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f6238e;

    /* renamed from: f  reason: collision with root package name */
    public final c f6239f;

    /* renamed from: p  reason: collision with root package name */
    public final String f6240p;

    public RegisterRequestParams(Integer num, Double d6, Uri uri, ArrayList arrayList, ArrayList arrayList2, c cVar, String str) {
        boolean z3;
        boolean z4;
        boolean z5;
        this.f6235a = num;
        this.f6236b = d6;
        this.f6237c = uri;
        boolean z6 = false;
        if (arrayList == null || arrayList.isEmpty()) {
            z3 = false;
        } else {
            z3 = true;
        }
        I.a("empty list of register requests is provided", z3);
        this.d = arrayList;
        this.f6238e = arrayList2;
        this.f6239f = cVar;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            g gVar = (g) it2.next();
            if (uri == null && gVar.d == null) {
                z5 = false;
            } else {
                z5 = true;
            }
            I.a("register request has null appId and no request appId is provided", z5);
            String str2 = gVar.d;
            if (str2 != null) {
                hashSet.add(Uri.parse(str2));
            }
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            h hVar = (h) it3.next();
            if (uri == null && hVar.f2152b == null) {
                z4 = false;
            } else {
                z4 = true;
            }
            I.a("registered key has null appId and no request appId is provided", z4);
            String str3 = hVar.f2152b;
            if (str3 != null) {
                hashSet.add(Uri.parse(str3));
            }
        }
        I.a("Display Hint cannot be longer than 80 characters", (str == null || str.length() <= 80) ? true : z6);
        this.f6240p = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterRequestParams)) {
            return false;
        }
        RegisterRequestParams registerRequestParams = (RegisterRequestParams) obj;
        if (I.j(this.f6235a, registerRequestParams.f6235a) && I.j(this.f6236b, registerRequestParams.f6236b) && I.j(this.f6237c, registerRequestParams.f6237c) && I.j(this.d, registerRequestParams.d)) {
            ArrayList arrayList = this.f6238e;
            ArrayList arrayList2 = registerRequestParams.f6238e;
            if (((arrayList != null || arrayList2 != null) && (arrayList == null || arrayList2 == null || !arrayList.containsAll(arrayList2) || !arrayList2.containsAll(arrayList))) || !I.j(this.f6239f, registerRequestParams.f6239f) || !I.j(this.f6240p, registerRequestParams.f6240p)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6235a, this.f6237c, this.f6236b, this.d, this.f6238e, this.f6239f, this.f6240p});
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = a.W0(20293, parcel);
        a.O0(parcel, 2, this.f6235a);
        a.L0(parcel, 3, this.f6236b);
        a.Q0(parcel, 4, this.f6237c, i2, false);
        a.V0(parcel, 5, this.d, false);
        a.V0(parcel, 6, this.f6238e, false);
        a.Q0(parcel, 7, this.f6239f, i2, false);
        a.R0(parcel, 8, this.f6240p, false);
        a.X0(W02, parcel);
    }
}
