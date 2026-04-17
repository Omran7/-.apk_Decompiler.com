package com.google.android.gms.common.internal;

import A1.a;
import a.C0251c;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.common.zza;
import z1.C1132b;

public final class B extends a {
    public static final Parcelable.Creator<B> CREATOR = new C0251c(23);

    /* renamed from: a  reason: collision with root package name */
    public final int f6128a;

    /* renamed from: b  reason: collision with root package name */
    public final IBinder f6129b;

    /* renamed from: c  reason: collision with root package name */
    public final C1132b f6130c;
    public final boolean d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f6131e;

    public B(int i2, IBinder iBinder, C1132b bVar, boolean z3, boolean z4) {
        this.f6128a = i2;
        this.f6129b = iBinder;
        this.f6130c = bVar;
        this.d = z3;
        this.f6131e = z4;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b6 = (B) obj;
        if (this.f6130c.equals(b6.f6130c)) {
            Object obj3 = null;
            IBinder iBinder = this.f6129b;
            if (iBinder == null) {
                obj2 = null;
            } else {
                int i2 = C0372a.f6167a;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                if (queryLocalInterface instanceof C0386o) {
                    obj2 = (C0386o) queryLocalInterface;
                } else {
                    obj2 = new zza(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
                }
            }
            IBinder iBinder2 = b6.f6129b;
            if (iBinder2 != null) {
                int i5 = C0372a.f6167a;
                IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                if (queryLocalInterface2 instanceof C0386o) {
                    obj3 = (C0386o) queryLocalInterface2;
                } else {
                    obj3 = new zza(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor");
                }
            }
            if (I.j(obj2, obj3)) {
                return true;
            }
        }
        return false;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.Y0(parcel, 1, 4);
        parcel.writeInt(this.f6128a);
        android.support.v4.media.session.a.M0(parcel, 2, this.f6129b);
        android.support.v4.media.session.a.Q0(parcel, 3, this.f6130c, i2, false);
        android.support.v4.media.session.a.Y0(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        android.support.v4.media.session.a.Y0(parcel, 5, 4);
        parcel.writeInt(this.f6131e ? 1 : 0);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
