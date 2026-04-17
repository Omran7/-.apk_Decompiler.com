package O1;

import A1.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.I;
import java.util.Arrays;

/* renamed from: O1.f  reason: case insensitive filesystem */
public final class C0091f extends a {
    public static final Parcelable.Creator<C0091f> CREATOR = new W(2);

    /* renamed from: a  reason: collision with root package name */
    public final C0106v f2022a;

    /* renamed from: b  reason: collision with root package name */
    public final a0 f2023b;

    /* renamed from: c  reason: collision with root package name */
    public final M f2024c;
    public final c0 d;

    /* renamed from: e  reason: collision with root package name */
    public final P f2025e;

    /* renamed from: f  reason: collision with root package name */
    public final Q f2026f;

    /* renamed from: p  reason: collision with root package name */
    public final b0 f2027p;

    /* renamed from: q  reason: collision with root package name */
    public final S f2028q;

    /* renamed from: r  reason: collision with root package name */
    public final C0107w f2029r;

    /* renamed from: s  reason: collision with root package name */
    public final T f2030s;

    public C0091f(C0106v vVar, a0 a0Var, M m6, c0 c0Var, P p6, Q q6, b0 b0Var, S s6, C0107w wVar, T t6) {
        this.f2022a = vVar;
        this.f2024c = m6;
        this.f2023b = a0Var;
        this.d = c0Var;
        this.f2025e = p6;
        this.f2026f = q6;
        this.f2027p = b0Var;
        this.f2028q = s6;
        this.f2029r = wVar;
        this.f2030s = t6;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0091f)) {
            return false;
        }
        C0091f fVar = (C0091f) obj;
        if (!I.j(this.f2022a, fVar.f2022a) || !I.j(this.f2023b, fVar.f2023b) || !I.j(this.f2024c, fVar.f2024c) || !I.j(this.d, fVar.d) || !I.j(this.f2025e, fVar.f2025e) || !I.j(this.f2026f, fVar.f2026f) || !I.j(this.f2027p, fVar.f2027p) || !I.j(this.f2028q, fVar.f2028q) || !I.j(this.f2029r, fVar.f2029r) || !I.j(this.f2030s, fVar.f2030s)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2022a, this.f2023b, this.f2024c, this.d, this.f2025e, this.f2026f, this.f2027p, this.f2028q, this.f2029r, this.f2030s});
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.Q0(parcel, 2, this.f2022a, i2, false);
        android.support.v4.media.session.a.Q0(parcel, 3, this.f2023b, i2, false);
        android.support.v4.media.session.a.Q0(parcel, 4, this.f2024c, i2, false);
        android.support.v4.media.session.a.Q0(parcel, 5, this.d, i2, false);
        android.support.v4.media.session.a.Q0(parcel, 6, this.f2025e, i2, false);
        android.support.v4.media.session.a.Q0(parcel, 7, this.f2026f, i2, false);
        android.support.v4.media.session.a.Q0(parcel, 8, this.f2027p, i2, false);
        android.support.v4.media.session.a.Q0(parcel, 9, this.f2028q, i2, false);
        android.support.v4.media.session.a.Q0(parcel, 10, this.f2029r, i2, false);
        android.support.v4.media.session.a.Q0(parcel, 11, this.f2030s, i2, false);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
