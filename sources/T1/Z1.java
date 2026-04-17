package T1;

import A1.a;
import Q1.w;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.I;
import java.util.ArrayList;
import java.util.List;

public final class Z1 extends a {
    public static final Parcelable.Creator<Z1> CREATOR = new w(23);

    /* renamed from: A  reason: collision with root package name */
    public final long f3186A;

    /* renamed from: B  reason: collision with root package name */
    public final List f3187B;

    /* renamed from: C  reason: collision with root package name */
    public final String f3188C;

    /* renamed from: D  reason: collision with root package name */
    public final String f3189D;

    /* renamed from: E  reason: collision with root package name */
    public final String f3190E;
    public final String F;

    /* renamed from: G  reason: collision with root package name */
    public final boolean f3191G;

    /* renamed from: H  reason: collision with root package name */
    public final long f3192H;

    /* renamed from: I  reason: collision with root package name */
    public final int f3193I;

    /* renamed from: J  reason: collision with root package name */
    public final String f3194J;

    /* renamed from: K  reason: collision with root package name */
    public final int f3195K;

    /* renamed from: L  reason: collision with root package name */
    public final long f3196L;

    /* renamed from: M  reason: collision with root package name */
    public final String f3197M;

    /* renamed from: N  reason: collision with root package name */
    public final String f3198N;

    /* renamed from: O  reason: collision with root package name */
    public final long f3199O;

    /* renamed from: P  reason: collision with root package name */
    public final int f3200P;

    /* renamed from: a  reason: collision with root package name */
    public final String f3201a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3202b;

    /* renamed from: c  reason: collision with root package name */
    public final String f3203c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final long f3204e;

    /* renamed from: f  reason: collision with root package name */
    public final long f3205f;

    /* renamed from: p  reason: collision with root package name */
    public final String f3206p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f3207q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f3208r;

    /* renamed from: s  reason: collision with root package name */
    public final long f3209s;

    /* renamed from: t  reason: collision with root package name */
    public final String f3210t;

    /* renamed from: u  reason: collision with root package name */
    public final long f3211u;

    /* renamed from: v  reason: collision with root package name */
    public final int f3212v;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f3213w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f3214x;

    /* renamed from: y  reason: collision with root package name */
    public final String f3215y;

    /* renamed from: z  reason: collision with root package name */
    public final Boolean f3216z;

    public Z1(String str, String str2, String str3, long j6, String str4, long j7, long j8, String str5, boolean z3, boolean z4, String str6, long j9, int i2, boolean z5, boolean z6, String str7, Boolean bool, long j10, List list, String str8, String str9, String str10, String str11, boolean z7, long j11, int i5, String str12, int i6, long j12, String str13, String str14, long j13, int i7) {
        I.d(str);
        this.f3201a = str;
        this.f3202b = true == TextUtils.isEmpty(str2) ? null : str2;
        this.f3203c = str3;
        this.f3209s = j6;
        this.d = str4;
        this.f3204e = j7;
        this.f3205f = j8;
        this.f3206p = str5;
        this.f3207q = z3;
        this.f3208r = z4;
        this.f3210t = str6;
        this.f3211u = j9;
        this.f3212v = i2;
        this.f3213w = z5;
        this.f3214x = z6;
        this.f3215y = str7;
        this.f3216z = bool;
        this.f3186A = j10;
        this.f3187B = list;
        this.f3188C = str8;
        this.f3189D = str9;
        this.f3190E = str10;
        this.F = str11;
        this.f3191G = z7;
        this.f3192H = j11;
        this.f3193I = i5;
        this.f3194J = str12;
        this.f3195K = i6;
        this.f3196L = j12;
        this.f3197M = str13;
        this.f3198N = str14;
        this.f3199O = j13;
        this.f3200P = i7;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.R0(parcel, 2, this.f3201a, false);
        android.support.v4.media.session.a.R0(parcel, 3, this.f3202b, false);
        android.support.v4.media.session.a.R0(parcel, 4, this.f3203c, false);
        android.support.v4.media.session.a.R0(parcel, 5, this.d, false);
        android.support.v4.media.session.a.Y0(parcel, 6, 8);
        parcel.writeLong(this.f3204e);
        android.support.v4.media.session.a.Y0(parcel, 7, 8);
        parcel.writeLong(this.f3205f);
        android.support.v4.media.session.a.R0(parcel, 8, this.f3206p, false);
        android.support.v4.media.session.a.Y0(parcel, 9, 4);
        parcel.writeInt(this.f3207q ? 1 : 0);
        android.support.v4.media.session.a.Y0(parcel, 10, 4);
        parcel.writeInt(this.f3208r ? 1 : 0);
        android.support.v4.media.session.a.Y0(parcel, 11, 8);
        parcel.writeLong(this.f3209s);
        android.support.v4.media.session.a.R0(parcel, 12, this.f3210t, false);
        android.support.v4.media.session.a.Y0(parcel, 14, 8);
        parcel.writeLong(this.f3211u);
        android.support.v4.media.session.a.Y0(parcel, 15, 4);
        parcel.writeInt(this.f3212v);
        android.support.v4.media.session.a.Y0(parcel, 16, 4);
        parcel.writeInt(this.f3213w ? 1 : 0);
        android.support.v4.media.session.a.Y0(parcel, 18, 4);
        parcel.writeInt(this.f3214x ? 1 : 0);
        android.support.v4.media.session.a.R0(parcel, 19, this.f3215y, false);
        android.support.v4.media.session.a.I0(parcel, 21, this.f3216z);
        android.support.v4.media.session.a.Y0(parcel, 22, 8);
        parcel.writeLong(this.f3186A);
        android.support.v4.media.session.a.T0(parcel, 23, this.f3187B);
        android.support.v4.media.session.a.R0(parcel, 24, this.f3188C, false);
        android.support.v4.media.session.a.R0(parcel, 25, this.f3189D, false);
        android.support.v4.media.session.a.R0(parcel, 26, this.f3190E, false);
        android.support.v4.media.session.a.R0(parcel, 27, this.F, false);
        android.support.v4.media.session.a.Y0(parcel, 28, 4);
        parcel.writeInt(this.f3191G ? 1 : 0);
        android.support.v4.media.session.a.Y0(parcel, 29, 8);
        parcel.writeLong(this.f3192H);
        android.support.v4.media.session.a.Y0(parcel, 30, 4);
        parcel.writeInt(this.f3193I);
        android.support.v4.media.session.a.R0(parcel, 31, this.f3194J, false);
        android.support.v4.media.session.a.Y0(parcel, 32, 4);
        parcel.writeInt(this.f3195K);
        android.support.v4.media.session.a.Y0(parcel, 34, 8);
        parcel.writeLong(this.f3196L);
        android.support.v4.media.session.a.R0(parcel, 35, this.f3197M, false);
        android.support.v4.media.session.a.R0(parcel, 36, this.f3198N, false);
        android.support.v4.media.session.a.Y0(parcel, 37, 8);
        parcel.writeLong(this.f3199O);
        android.support.v4.media.session.a.Y0(parcel, 38, 4);
        parcel.writeInt(this.f3200P);
        android.support.v4.media.session.a.X0(W02, parcel);
    }

    public Z1(String str, String str2, String str3, String str4, long j6, long j7, String str5, boolean z3, boolean z4, long j8, String str6, long j9, int i2, boolean z5, boolean z6, String str7, Boolean bool, long j10, ArrayList arrayList, String str8, String str9, String str10, String str11, boolean z7, long j11, int i5, String str12, int i6, long j12, String str13, String str14, long j13, int i7) {
        this.f3201a = str;
        this.f3202b = str2;
        this.f3203c = str3;
        this.f3209s = j8;
        this.d = str4;
        this.f3204e = j6;
        this.f3205f = j7;
        this.f3206p = str5;
        this.f3207q = z3;
        this.f3208r = z4;
        this.f3210t = str6;
        this.f3211u = j9;
        this.f3212v = i2;
        this.f3213w = z5;
        this.f3214x = z6;
        this.f3215y = str7;
        this.f3216z = bool;
        this.f3186A = j10;
        this.f3187B = arrayList;
        this.f3188C = str8;
        this.f3189D = str9;
        this.f3190E = str10;
        this.F = str11;
        this.f3191G = z7;
        this.f3192H = j11;
        this.f3193I = i5;
        this.f3194J = str12;
        this.f3195K = i6;
        this.f3196L = j12;
        this.f3197M = str13;
        this.f3198N = str14;
        this.f3199O = j13;
        this.f3200P = i7;
    }
}
