package e3;

import A1.a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.emoji2.text.v;
import com.google.android.material.datepicker.n;

/* renamed from: e3.a  reason: case insensitive filesystem */
public final class C0493a extends a {
    public static final Parcelable.Creator<C0493a> CREATOR = new n(10);

    /* renamed from: a  reason: collision with root package name */
    public final String f7627a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7628b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7629c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f7630e;

    /* renamed from: f  reason: collision with root package name */
    public final String f7631f;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f7632p;

    /* renamed from: q  reason: collision with root package name */
    public final String f7633q;

    /* renamed from: r  reason: collision with root package name */
    public int f7634r;

    /* renamed from: s  reason: collision with root package name */
    public final String f7635s;

    /* renamed from: t  reason: collision with root package name */
    public final String f7636t;

    public C0493a(v vVar) {
        this.f7627a = null;
        this.f7628b = null;
        this.f7629c = null;
        this.d = null;
        this.f7630e = false;
        this.f7631f = null;
        this.f7632p = false;
        this.f7635s = null;
        this.f7636t = null;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.R0(parcel, 1, this.f7627a, false);
        android.support.v4.media.session.a.R0(parcel, 2, this.f7628b, false);
        android.support.v4.media.session.a.R0(parcel, 3, this.f7629c, false);
        android.support.v4.media.session.a.R0(parcel, 4, this.d, false);
        android.support.v4.media.session.a.Y0(parcel, 5, 4);
        parcel.writeInt(this.f7630e ? 1 : 0);
        android.support.v4.media.session.a.R0(parcel, 6, this.f7631f, false);
        android.support.v4.media.session.a.Y0(parcel, 7, 4);
        parcel.writeInt(this.f7632p ? 1 : 0);
        android.support.v4.media.session.a.R0(parcel, 8, this.f7633q, false);
        int i5 = this.f7634r;
        android.support.v4.media.session.a.Y0(parcel, 9, 4);
        parcel.writeInt(i5);
        android.support.v4.media.session.a.R0(parcel, 10, this.f7635s, false);
        android.support.v4.media.session.a.R0(parcel, 11, this.f7636t, false);
        android.support.v4.media.session.a.X0(W02, parcel);
    }

    public C0493a(String str, String str2, String str3, String str4, boolean z3, String str5, boolean z4, String str6, int i2, String str7, String str8) {
        this.f7627a = str;
        this.f7628b = str2;
        this.f7629c = str3;
        this.d = str4;
        this.f7630e = z3;
        this.f7631f = str5;
        this.f7632p = z4;
        this.f7633q = str6;
        this.f7634r = i2;
        this.f7635s = str7;
        this.f7636t = str8;
    }
}
