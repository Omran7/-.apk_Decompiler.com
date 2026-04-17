package e3;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.a;
import android.text.TextUtils;
import com.google.android.gms.common.internal.I;
import com.google.android.material.datepicker.n;

/* renamed from: e3.d  reason: case insensitive filesystem */
public final class C0496d extends C0495c {
    public static final Parcelable.Creator<C0496d> CREATOR = new n(13);

    /* renamed from: a  reason: collision with root package name */
    public final String f7640a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7641b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7642c;
    public String d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f7643e;

    public C0496d(String str, String str2, String str3, String str4, boolean z3) {
        I.d(str);
        this.f7640a = str;
        if (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3)) {
            this.f7641b = str2;
            this.f7642c = str3;
            this.d = str4;
            this.f7643e = z3;
            return;
        }
        throw new IllegalArgumentException("Cannot create an EmailAuthCredential without a password or emailLink.");
    }

    public final String v() {
        return "password";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = a.W0(20293, parcel);
        a.R0(parcel, 1, this.f7640a, false);
        a.R0(parcel, 2, this.f7641b, false);
        a.R0(parcel, 3, this.f7642c, false);
        a.R0(parcel, 4, this.d, false);
        boolean z3 = this.f7643e;
        a.Y0(parcel, 5, 4);
        parcel.writeInt(z3 ? 1 : 0);
        a.X0(W02, parcel);
    }
}
