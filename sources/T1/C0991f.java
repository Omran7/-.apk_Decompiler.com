package t1;

import A1.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.I;
import java.util.Arrays;
import s1.b;

/* renamed from: t1.f  reason: case insensitive filesystem */
public final class C0991f extends a {
    public static final Parcelable.Creator<C0991f> CREATOR = new b(7);

    /* renamed from: a  reason: collision with root package name */
    public final C0990e f11716a;

    /* renamed from: b  reason: collision with root package name */
    public final C0987b f11717b;

    /* renamed from: c  reason: collision with root package name */
    public final String f11718c;
    public final boolean d;

    /* renamed from: e  reason: collision with root package name */
    public final int f11719e;

    /* renamed from: f  reason: collision with root package name */
    public final C0989d f11720f;

    /* renamed from: p  reason: collision with root package name */
    public final C0988c f11721p;

    public C0991f(C0990e eVar, C0987b bVar, String str, boolean z3, int i2, C0989d dVar, C0988c cVar) {
        I.g(eVar);
        this.f11716a = eVar;
        I.g(bVar);
        this.f11717b = bVar;
        this.f11718c = str;
        this.d = z3;
        this.f11719e = i2;
        this.f11720f = dVar == null ? new C0989d(false, (byte[]) null, (String) null) : dVar;
        this.f11721p = cVar == null ? new C0988c((String) null, false) : cVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0991f)) {
            return false;
        }
        C0991f fVar = (C0991f) obj;
        if (!I.j(this.f11716a, fVar.f11716a) || !I.j(this.f11717b, fVar.f11717b) || !I.j(this.f11720f, fVar.f11720f) || !I.j(this.f11721p, fVar.f11721p) || !I.j(this.f11718c, fVar.f11718c) || this.d != fVar.d || this.f11719e != fVar.f11719e) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11716a, this.f11717b, this.f11720f, this.f11721p, this.f11718c, Boolean.valueOf(this.d)});
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.Q0(parcel, 1, this.f11716a, i2, false);
        android.support.v4.media.session.a.Q0(parcel, 2, this.f11717b, i2, false);
        android.support.v4.media.session.a.R0(parcel, 3, this.f11718c, false);
        android.support.v4.media.session.a.Y0(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        android.support.v4.media.session.a.Y0(parcel, 5, 4);
        parcel.writeInt(this.f11719e);
        android.support.v4.media.session.a.Q0(parcel, 6, this.f11720f, i2, false);
        android.support.v4.media.session.a.Q0(parcel, 7, this.f11721p, i2, false);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
