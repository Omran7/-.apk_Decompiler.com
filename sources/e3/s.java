package e3;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.a;
import android.text.TextUtils;
import com.google.android.gms.common.internal.I;
import com.google.android.material.datepicker.n;

public final class s extends C0495c implements Cloneable {
    public static final Parcelable.Creator<s> CREATOR = new n(4);

    /* renamed from: a  reason: collision with root package name */
    public final String f7654a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7655b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7656c;
    public boolean d;

    /* renamed from: e  reason: collision with root package name */
    public final String f7657e;

    public s(String str, String str2, String str3, String str4, boolean z3) {
        boolean z4;
        if ((TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) && (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4))) {
            z4 = false;
        } else {
            z4 = true;
        }
        I.a("Cannot create PhoneAuthCredential without either sessionInfo + smsCode or temporary proof + phoneNumber.", z4);
        this.f7654a = str;
        this.f7655b = str2;
        this.f7656c = str3;
        this.d = z3;
        this.f7657e = str4;
    }

    public final Object clone() {
        boolean z3 = this.d;
        return new s(this.f7654a, this.f7655b, this.f7656c, this.f7657e, z3);
    }

    public final String v() {
        return "phone";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = a.W0(20293, parcel);
        a.R0(parcel, 1, this.f7654a, false);
        a.R0(parcel, 2, this.f7655b, false);
        a.R0(parcel, 4, this.f7656c, false);
        boolean z3 = this.d;
        a.Y0(parcel, 5, 4);
        parcel.writeInt(z3 ? 1 : 0);
        a.R0(parcel, 6, this.f7657e, false);
        a.X0(W02, parcel);
    }
}
