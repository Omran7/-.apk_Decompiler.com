package O1;

import A1.a;
import D1.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.I;
import java.util.Arrays;

/* renamed from: O1.x  reason: case insensitive filesystem */
public final class C0108x extends a {
    public static final Parcelable.Creator<C0108x> CREATOR = new c(16);

    /* renamed from: a  reason: collision with root package name */
    public final String f2061a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2062b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f2063c;
    public final C0095j d;

    /* renamed from: e  reason: collision with root package name */
    public final C0094i f2064e;

    /* renamed from: f  reason: collision with root package name */
    public final C0096k f2065f;

    /* renamed from: p  reason: collision with root package name */
    public final C0092g f2066p;

    /* renamed from: q  reason: collision with root package name */
    public final String f2067q;

    public C0108x(String str, String str2, byte[] bArr, C0095j jVar, C0094i iVar, C0096k kVar, C0092g gVar, String str3) {
        boolean z3 = true;
        if (!((jVar != null && iVar == null && kVar == null) || ((jVar == null && iVar != null && kVar == null) || (jVar == null && iVar == null && kVar != null)))) {
            z3 = false;
        }
        I.b(z3);
        this.f2061a = str;
        this.f2062b = str2;
        this.f2063c = bArr;
        this.d = jVar;
        this.f2064e = iVar;
        this.f2065f = kVar;
        this.f2066p = gVar;
        this.f2067q = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0108x)) {
            return false;
        }
        C0108x xVar = (C0108x) obj;
        if (!I.j(this.f2061a, xVar.f2061a) || !I.j(this.f2062b, xVar.f2062b) || !Arrays.equals(this.f2063c, xVar.f2063c) || !I.j(this.d, xVar.d) || !I.j(this.f2064e, xVar.f2064e) || !I.j(this.f2065f, xVar.f2065f) || !I.j(this.f2066p, xVar.f2066p) || !I.j(this.f2067q, xVar.f2067q)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2061a, this.f2062b, this.f2063c, this.f2064e, this.d, this.f2065f, this.f2066p, this.f2067q});
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.R0(parcel, 1, this.f2061a, false);
        android.support.v4.media.session.a.R0(parcel, 2, this.f2062b, false);
        android.support.v4.media.session.a.K0(parcel, 3, this.f2063c, false);
        android.support.v4.media.session.a.Q0(parcel, 4, this.d, i2, false);
        android.support.v4.media.session.a.Q0(parcel, 5, this.f2064e, i2, false);
        android.support.v4.media.session.a.Q0(parcel, 6, this.f2065f, i2, false);
        android.support.v4.media.session.a.Q0(parcel, 7, this.f2066p, i2, false);
        android.support.v4.media.session.a.R0(parcel, 8, this.f2067q, false);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
