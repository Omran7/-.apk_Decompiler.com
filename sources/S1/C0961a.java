package s1;

import A1.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.common.internal.I;

/* renamed from: s1.a  reason: case insensitive filesystem */
public final class C0961a extends a {
    public static final Parcelable.Creator<C0961a> CREATOR = new b(2);

    /* renamed from: a  reason: collision with root package name */
    public final int f11428a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f11429b;

    /* renamed from: c  reason: collision with root package name */
    public final String[] f11430c;
    public final CredentialPickerConfig d;

    /* renamed from: e  reason: collision with root package name */
    public final CredentialPickerConfig f11431e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f11432f;

    /* renamed from: p  reason: collision with root package name */
    public final String f11433p;

    /* renamed from: q  reason: collision with root package name */
    public final String f11434q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f11435r;

    public C0961a(int i2, boolean z3, String[] strArr, CredentialPickerConfig credentialPickerConfig, CredentialPickerConfig credentialPickerConfig2, boolean z4, String str, String str2, boolean z5) {
        this.f11428a = i2;
        this.f11429b = z3;
        I.g(strArr);
        this.f11430c = strArr;
        this.d = credentialPickerConfig == null ? new CredentialPickerConfig(2, false, true, false, 1) : credentialPickerConfig;
        this.f11431e = credentialPickerConfig2 == null ? new CredentialPickerConfig(2, false, true, false, 1) : credentialPickerConfig2;
        if (i2 < 3) {
            this.f11432f = true;
            this.f11433p = null;
            this.f11434q = null;
        } else {
            this.f11432f = z4;
            this.f11433p = str;
            this.f11434q = str2;
        }
        this.f11435r = z5;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.Y0(parcel, 1, 4);
        parcel.writeInt(this.f11429b ? 1 : 0);
        android.support.v4.media.session.a.S0(parcel, 2, this.f11430c, false);
        android.support.v4.media.session.a.Q0(parcel, 3, this.d, i2, false);
        android.support.v4.media.session.a.Q0(parcel, 4, this.f11431e, i2, false);
        android.support.v4.media.session.a.Y0(parcel, 5, 4);
        parcel.writeInt(this.f11432f ? 1 : 0);
        android.support.v4.media.session.a.R0(parcel, 6, this.f11433p, false);
        android.support.v4.media.session.a.R0(parcel, 7, this.f11434q, false);
        android.support.v4.media.session.a.Y0(parcel, 8, 4);
        parcel.writeInt(this.f11435r ? 1 : 0);
        android.support.v4.media.session.a.Y0(parcel, 1000, 4);
        parcel.writeInt(this.f11428a);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
