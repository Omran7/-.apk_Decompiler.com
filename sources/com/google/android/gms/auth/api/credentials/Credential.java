package com.google.android.gms.auth.api.credentials;

import A1.a;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import s1.b;

@Deprecated
public class Credential extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Credential> CREATOR = new b(0);

    /* renamed from: a  reason: collision with root package name */
    public final String f5930a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5931b;

    /* renamed from: c  reason: collision with root package name */
    public final Uri f5932c;
    public final List d;

    /* renamed from: e  reason: collision with root package name */
    public final String f5933e;

    /* renamed from: f  reason: collision with root package name */
    public final String f5934f;

    /* renamed from: p  reason: collision with root package name */
    public final String f5935p;

    /* renamed from: q  reason: collision with root package name */
    public final String f5936q;

    public Credential(String str, String str2, Uri uri, ArrayList arrayList, String str3, String str4, String str5, String str6) {
        List list;
        Boolean bool;
        I.h(str, "credential identifier cannot be null");
        String trim = str.trim();
        I.e(trim, "credential identifier cannot be empty");
        if (str3 == null || !TextUtils.isEmpty(str3)) {
            if (str4 != null) {
                if (TextUtils.isEmpty(str4)) {
                    bool = Boolean.FALSE;
                } else {
                    Uri parse = Uri.parse(str4);
                    if (!parse.isAbsolute() || !parse.isHierarchical() || TextUtils.isEmpty(parse.getScheme()) || TextUtils.isEmpty(parse.getAuthority())) {
                        bool = Boolean.FALSE;
                    } else {
                        boolean z3 = true;
                        if (!"http".equalsIgnoreCase(parse.getScheme()) && !"https".equalsIgnoreCase(parse.getScheme())) {
                            z3 = false;
                        }
                        bool = Boolean.valueOf(z3);
                    }
                }
                if (!bool.booleanValue()) {
                    throw new IllegalArgumentException("Account type must be a valid Http/Https URI");
                }
            }
            if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str3)) {
                if (str2 != null && TextUtils.isEmpty(str2.trim())) {
                    str2 = null;
                }
                this.f5931b = str2;
                this.f5932c = uri;
                if (arrayList == null) {
                    list = Collections.emptyList();
                } else {
                    list = Collections.unmodifiableList(arrayList);
                }
                this.d = list;
                this.f5930a = trim;
                this.f5933e = str3;
                this.f5934f = str4;
                this.f5935p = str5;
                this.f5936q = str6;
                return;
            }
            throw new IllegalArgumentException("Password and AccountType are mutually exclusive");
        }
        throw new IllegalArgumentException("Password must not be empty if set");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Credential)) {
            return false;
        }
        Credential credential = (Credential) obj;
        if (!TextUtils.equals(this.f5930a, credential.f5930a) || !TextUtils.equals(this.f5931b, credential.f5931b) || !I.j(this.f5932c, credential.f5932c) || !TextUtils.equals(this.f5933e, credential.f5933e) || !TextUtils.equals(this.f5934f, credential.f5934f)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5930a, this.f5931b, this.f5932c, this.f5933e, this.f5934f});
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.R0(parcel, 1, this.f5930a, false);
        android.support.v4.media.session.a.R0(parcel, 2, this.f5931b, false);
        android.support.v4.media.session.a.Q0(parcel, 3, this.f5932c, i2, false);
        android.support.v4.media.session.a.V0(parcel, 4, this.d, false);
        android.support.v4.media.session.a.R0(parcel, 5, this.f5933e, false);
        android.support.v4.media.session.a.R0(parcel, 6, this.f5934f, false);
        android.support.v4.media.session.a.R0(parcel, 9, this.f5935p, false);
        android.support.v4.media.session.a.R0(parcel, 10, this.f5936q, false);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
