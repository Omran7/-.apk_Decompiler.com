package T1;

import A1.a;
import Q1.w;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.I;

/* renamed from: T1.e  reason: case insensitive filesystem */
public final class C0164e extends a {
    public static final Parcelable.Creator<C0164e> CREATOR = new w(14);

    /* renamed from: a  reason: collision with root package name */
    public String f3271a;

    /* renamed from: b  reason: collision with root package name */
    public String f3272b;

    /* renamed from: c  reason: collision with root package name */
    public W1 f3273c;
    public long d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3274e;

    /* renamed from: f  reason: collision with root package name */
    public String f3275f;

    /* renamed from: p  reason: collision with root package name */
    public final C0214v f3276p;

    /* renamed from: q  reason: collision with root package name */
    public long f3277q;

    /* renamed from: r  reason: collision with root package name */
    public C0214v f3278r;

    /* renamed from: s  reason: collision with root package name */
    public final long f3279s;

    /* renamed from: t  reason: collision with root package name */
    public final C0214v f3280t;

    public C0164e(C0164e eVar) {
        I.g(eVar);
        this.f3271a = eVar.f3271a;
        this.f3272b = eVar.f3272b;
        this.f3273c = eVar.f3273c;
        this.d = eVar.d;
        this.f3274e = eVar.f3274e;
        this.f3275f = eVar.f3275f;
        this.f3276p = eVar.f3276p;
        this.f3277q = eVar.f3277q;
        this.f3278r = eVar.f3278r;
        this.f3279s = eVar.f3279s;
        this.f3280t = eVar.f3280t;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.R0(parcel, 2, this.f3271a, false);
        android.support.v4.media.session.a.R0(parcel, 3, this.f3272b, false);
        android.support.v4.media.session.a.Q0(parcel, 4, this.f3273c, i2, false);
        long j6 = this.d;
        android.support.v4.media.session.a.Y0(parcel, 5, 8);
        parcel.writeLong(j6);
        boolean z3 = this.f3274e;
        android.support.v4.media.session.a.Y0(parcel, 6, 4);
        parcel.writeInt(z3 ? 1 : 0);
        android.support.v4.media.session.a.R0(parcel, 7, this.f3275f, false);
        android.support.v4.media.session.a.Q0(parcel, 8, this.f3276p, i2, false);
        long j7 = this.f3277q;
        android.support.v4.media.session.a.Y0(parcel, 9, 8);
        parcel.writeLong(j7);
        android.support.v4.media.session.a.Q0(parcel, 10, this.f3278r, i2, false);
        android.support.v4.media.session.a.Y0(parcel, 11, 8);
        parcel.writeLong(this.f3279s);
        android.support.v4.media.session.a.Q0(parcel, 12, this.f3280t, i2, false);
        android.support.v4.media.session.a.X0(W02, parcel);
    }

    public C0164e(String str, String str2, W1 w12, long j6, boolean z3, String str3, C0214v vVar, long j7, C0214v vVar2, long j8, C0214v vVar3) {
        this.f3271a = str;
        this.f3272b = str2;
        this.f3273c = w12;
        this.d = j6;
        this.f3274e = z3;
        this.f3275f = str3;
        this.f3276p = vVar;
        this.f3277q = j7;
        this.f3278r = vVar2;
        this.f3279s = j8;
        this.f3280t = vVar3;
    }
}
