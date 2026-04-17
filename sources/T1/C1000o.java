package t1;

import A1.a;
import O1.C0108x;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.I;
import java.util.Arrays;
import s1.b;

/* renamed from: t1.o  reason: case insensitive filesystem */
public final class C1000o extends a {
    public static final Parcelable.Creator<C1000o> CREATOR = new b(19);

    /* renamed from: a  reason: collision with root package name */
    public final String f11734a;

    /* renamed from: b  reason: collision with root package name */
    public final String f11735b;

    /* renamed from: c  reason: collision with root package name */
    public final String f11736c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final Uri f11737e;

    /* renamed from: f  reason: collision with root package name */
    public final String f11738f;

    /* renamed from: p  reason: collision with root package name */
    public final String f11739p;

    /* renamed from: q  reason: collision with root package name */
    public final String f11740q;

    /* renamed from: r  reason: collision with root package name */
    public final C0108x f11741r;

    public C1000o(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, C0108x xVar) {
        I.d(str);
        this.f11734a = str;
        this.f11735b = str2;
        this.f11736c = str3;
        this.d = str4;
        this.f11737e = uri;
        this.f11738f = str5;
        this.f11739p = str6;
        this.f11740q = str7;
        this.f11741r = xVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1000o)) {
            return false;
        }
        C1000o oVar = (C1000o) obj;
        if (!I.j(this.f11734a, oVar.f11734a) || !I.j(this.f11735b, oVar.f11735b) || !I.j(this.f11736c, oVar.f11736c) || !I.j(this.d, oVar.d) || !I.j(this.f11737e, oVar.f11737e) || !I.j(this.f11738f, oVar.f11738f) || !I.j(this.f11739p, oVar.f11739p) || !I.j(this.f11740q, oVar.f11740q) || !I.j(this.f11741r, oVar.f11741r)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11734a, this.f11735b, this.f11736c, this.d, this.f11737e, this.f11738f, this.f11739p, this.f11740q, this.f11741r});
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.R0(parcel, 1, this.f11734a, false);
        android.support.v4.media.session.a.R0(parcel, 2, this.f11735b, false);
        android.support.v4.media.session.a.R0(parcel, 3, this.f11736c, false);
        android.support.v4.media.session.a.R0(parcel, 4, this.d, false);
        android.support.v4.media.session.a.Q0(parcel, 5, this.f11737e, i2, false);
        android.support.v4.media.session.a.R0(parcel, 6, this.f11738f, false);
        android.support.v4.media.session.a.R0(parcel, 7, this.f11739p, false);
        android.support.v4.media.session.a.R0(parcel, 8, this.f11740q, false);
        android.support.v4.media.session.a.Q0(parcel, 9, this.f11741r, i2, false);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
