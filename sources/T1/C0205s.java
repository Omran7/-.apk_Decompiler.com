package T1;

import com.google.android.gms.common.internal.I;

/* renamed from: T1.s  reason: case insensitive filesystem */
public final class C0205s {

    /* renamed from: a  reason: collision with root package name */
    public final String f3456a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3457b;

    /* renamed from: c  reason: collision with root package name */
    public final long f3458c;
    public final long d;

    /* renamed from: e  reason: collision with root package name */
    public final long f3459e;

    /* renamed from: f  reason: collision with root package name */
    public final long f3460f;
    public final long g;
    public final Long h;

    /* renamed from: i  reason: collision with root package name */
    public final Long f3461i;

    /* renamed from: j  reason: collision with root package name */
    public final Long f3462j;

    /* renamed from: k  reason: collision with root package name */
    public final Boolean f3463k;

    public C0205s(String str, String str2, long j6, long j7, long j8, long j9, long j10, Long l6, Long l7, Long l8, Boolean bool) {
        boolean z3;
        boolean z4;
        boolean z5;
        long j11 = j6;
        long j12 = j7;
        long j13 = j8;
        long j14 = j10;
        I.d(str);
        I.d(str2);
        boolean z6 = false;
        if (j11 >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        I.b(z3);
        if (j12 >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        I.b(z4);
        if (j13 >= 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        I.b(z5);
        I.b(j14 >= 0 ? true : z6);
        this.f3456a = str;
        this.f3457b = str2;
        this.f3458c = j11;
        this.d = j12;
        this.f3459e = j13;
        this.f3460f = j9;
        this.g = j14;
        this.h = l6;
        this.f3461i = l7;
        this.f3462j = l8;
        this.f3463k = bool;
    }

    public final C0205s a(Long l6, Long l7, Boolean bool) {
        return new C0205s(this.f3456a, this.f3457b, this.f3458c, this.d, this.f3459e, this.f3460f, this.g, this.h, l6, l7, bool);
    }

    public final C0205s b(long j6) {
        long j7 = this.d;
        long j8 = this.f3459e;
        return new C0205s(this.f3456a, this.f3457b, this.f3458c, j7, j8, j6, this.g, this.h, this.f3461i, this.f3462j, this.f3463k);
    }
}
