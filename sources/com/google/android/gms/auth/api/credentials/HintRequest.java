package com.google.android.gms.auth.api.credentials;

import A1.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.common.internal.ReflectedParcelable;
import s1.b;

@Deprecated
public final class HintRequest extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<HintRequest> CREATOR = new b(3);

    /* renamed from: a  reason: collision with root package name */
    public final int f5940a;

    /* renamed from: b  reason: collision with root package name */
    public final CredentialPickerConfig f5941b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f5942c;
    public final boolean d;

    /* renamed from: e  reason: collision with root package name */
    public final String[] f5943e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f5944f;

    /* renamed from: p  reason: collision with root package name */
    public final String f5945p;

    /* renamed from: q  reason: collision with root package name */
    public final String f5946q;

    public HintRequest(int i2, CredentialPickerConfig credentialPickerConfig, boolean z3, boolean z4, String[] strArr, boolean z5, String str, String str2) {
        this.f5940a = i2;
        I.g(credentialPickerConfig);
        this.f5941b = credentialPickerConfig;
        this.f5942c = z3;
        this.d = z4;
        I.g(strArr);
        this.f5943e = strArr;
        if (i2 < 2) {
            this.f5944f = true;
            this.f5945p = null;
            this.f5946q = null;
            return;
        }
        this.f5944f = z5;
        this.f5945p = str;
        this.f5946q = str2;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.Q0(parcel, 1, this.f5941b, i2, false);
        android.support.v4.media.session.a.Y0(parcel, 2, 4);
        parcel.writeInt(this.f5942c ? 1 : 0);
        android.support.v4.media.session.a.Y0(parcel, 3, 4);
        parcel.writeInt(this.d ? 1 : 0);
        android.support.v4.media.session.a.S0(parcel, 4, this.f5943e, false);
        android.support.v4.media.session.a.Y0(parcel, 5, 4);
        parcel.writeInt(this.f5944f ? 1 : 0);
        android.support.v4.media.session.a.R0(parcel, 6, this.f5945p, false);
        android.support.v4.media.session.a.R0(parcel, 7, this.f5946q, false);
        android.support.v4.media.session.a.Y0(parcel, 1000, 4);
        parcel.writeInt(this.f5940a);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
