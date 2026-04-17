package com.google.android.gms.auth.api.credentials;

import A1.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import s1.b;

@Deprecated
public final class CredentialPickerConfig extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<CredentialPickerConfig> CREATOR = new b(1);

    /* renamed from: a  reason: collision with root package name */
    public final int f5937a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f5938b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f5939c;
    public final int d;

    public CredentialPickerConfig(int i2, boolean z3, boolean z4, boolean z5, int i5) {
        this.f5937a = i2;
        this.f5938b = z3;
        this.f5939c = z4;
        if (i2 < 2) {
            this.d = true == z5 ? 3 : 1;
        } else {
            this.d = i5;
        }
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        int i5 = 1;
        android.support.v4.media.session.a.Y0(parcel, 1, 4);
        parcel.writeInt(this.f5938b ? 1 : 0);
        android.support.v4.media.session.a.Y0(parcel, 2, 4);
        parcel.writeInt(this.f5939c ? 1 : 0);
        int i6 = this.d;
        if (i6 != 3) {
            i5 = 0;
        }
        android.support.v4.media.session.a.Y0(parcel, 3, 4);
        parcel.writeInt(i5);
        android.support.v4.media.session.a.Y0(parcel, 4, 4);
        parcel.writeInt(i6);
        android.support.v4.media.session.a.Y0(parcel, 1000, 4);
        parcel.writeInt(this.f5937a);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
