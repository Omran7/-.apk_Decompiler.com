package com.google.android.gms.fido.common;

import D1.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

public enum Transport implements ReflectedParcelable {
    HYBRID("cable");
    
    public static final Parcelable.Creator<Transport> CREATOR = null;

    /* renamed from: a  reason: collision with root package name */
    public final String f6234a;

    static {
        CREATOR = new c(7);
    }

    /* access modifiers changed from: public */
    Transport(String str) {
        this.f6234a = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return this.f6234a;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f6234a);
    }
}
