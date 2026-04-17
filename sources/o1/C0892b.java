package o1;

import A1.a;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.material.datepicker.n;

/* renamed from: o1.b  reason: case insensitive filesystem */
public final class C0892b extends a {
    public static final Parcelable.Creator<C0892b> CREATOR = new n(22);

    /* renamed from: a  reason: collision with root package name */
    public final int f10429a;

    /* renamed from: b  reason: collision with root package name */
    public final int f10430b;

    /* renamed from: c  reason: collision with root package name */
    public final String f10431c;
    public final Account d;

    public C0892b(int i2, int i5, String str, Account account) {
        this.f10429a = i2;
        this.f10430b = i5;
        this.f10431c = str;
        if (account != null || TextUtils.isEmpty(str)) {
            this.d = account;
        } else {
            this.d = new Account(str, "com.google");
        }
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.Y0(parcel, 1, 4);
        parcel.writeInt(this.f10429a);
        android.support.v4.media.session.a.Y0(parcel, 2, 4);
        parcel.writeInt(this.f10430b);
        android.support.v4.media.session.a.R0(parcel, 3, this.f10431c, false);
        android.support.v4.media.session.a.Q0(parcel, 4, this.d, i2, false);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
