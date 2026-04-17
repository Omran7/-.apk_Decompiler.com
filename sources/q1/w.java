package Q1;

import R2.b;
import S3.x;
import T1.C0161d;
import T1.C0164e;
import T1.C0176i;
import T1.C0211u;
import T1.C0214v;
import T1.I1;
import T1.L1;
import T1.M1;
import T1.N1;
import T1.W1;
import T1.Z1;
import W0.A;
import W0.C0241m;
import W0.G;
import W0.H;
import W0.y;
import W0.z;
import W1.e;
import W1.f;
import W1.g;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.a;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.B;
import com.google.android.gms.common.internal.C0378g;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.j;
import z1.C1132b;

public final class w implements Parcelable.Creator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2426a;

    public /* synthetic */ w(int i2) {
        this.f2426a = i2;
    }

    public static void a(C0214v vVar, Parcel parcel, int i2) {
        String str = vVar.f3508a;
        int W02 = a.W0(20293, parcel);
        a.R0(parcel, 2, str, false);
        a.Q0(parcel, 3, vVar.f3509b, i2, false);
        a.R0(parcel, 4, vVar.f3510c, false);
        a.Y0(parcel, 5, 8);
        parcel.writeLong(vVar.d);
        a.X0(W02, parcel);
    }

    public static void b(W1 w12, Parcel parcel) {
        int i2 = w12.f3139a;
        int W02 = a.W0(20293, parcel);
        a.Y0(parcel, 1, 4);
        parcel.writeInt(i2);
        a.R0(parcel, 2, w12.f3140b, false);
        a.Y0(parcel, 3, 8);
        parcel.writeLong(w12.f3141c);
        a.P0(parcel, 4, w12.d);
        a.R0(parcel, 6, w12.f3142e, false);
        a.R0(parcel, 7, w12.f3143f, false);
        a.L0(parcel, 8, w12.f3144p);
        a.X0(W02, parcel);
    }

    public final Object createFromParcel(Parcel parcel) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        Integer num;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        Parcel parcel2 = parcel;
        switch (this.f2426a) {
            case 0:
                int c12 = b.c1(parcel);
                List list = LocationResult.f6259b;
                while (parcel.dataPosition() < c12) {
                    int readInt = parcel.readInt();
                    if (((char) readInt) != 1) {
                        b.T0(readInt, parcel2);
                    } else {
                        list = b.v(parcel2, readInt, Location.CREATOR);
                    }
                }
                b.x(c12, parcel2);
                return new LocationResult(list);
            case 1:
                int c13 = b.c1(parcel);
                String str = "";
                String str2 = str;
                String str3 = str2;
                while (parcel.dataPosition() < c13) {
                    int readInt2 = parcel.readInt();
                    char c3 = (char) readInt2;
                    if (c3 == 1) {
                        str2 = b.r(readInt2, parcel2);
                    } else if (c3 == 2) {
                        str3 = b.r(readInt2, parcel2);
                    } else if (c3 != 5) {
                        b.T0(readInt2, parcel2);
                    } else {
                        str = b.r(readInt2, parcel2);
                    }
                }
                b.x(c13, parcel2);
                return new y(str, str2, str3);
            case 2:
                int c14 = b.c1(parcel);
                ArrayList arrayList = null;
                boolean z21 = false;
                boolean z22 = false;
                y yVar = null;
                while (parcel.dataPosition() < c14) {
                    int readInt3 = parcel.readInt();
                    char c6 = (char) readInt3;
                    if (c6 == 1) {
                        arrayList = b.v(parcel2, readInt3, LocationRequest.CREATOR);
                    } else if (c6 == 2) {
                        z21 = b.w0(readInt3, parcel2);
                    } else if (c6 == 3) {
                        z22 = b.w0(readInt3, parcel2);
                    } else if (c6 != 5) {
                        b.T0(readInt3, parcel2);
                    } else {
                        yVar = (y) b.q(parcel2, readInt3, y.CREATOR);
                    }
                }
                b.x(c14, parcel2);
                return new i(arrayList, z21, z22, yVar);
            case 3:
                int c15 = b.c1(parcel);
                Status status = null;
                k kVar = null;
                while (parcel.dataPosition() < c15) {
                    int readInt4 = parcel.readInt();
                    char c7 = (char) readInt4;
                    if (c7 == 1) {
                        status = (Status) b.q(parcel2, readInt4, Status.CREATOR);
                    } else if (c7 != 2) {
                        b.T0(readInt4, parcel2);
                    } else {
                        kVar = (k) b.q(parcel2, readInt4, k.CREATOR);
                    }
                }
                b.x(c15, parcel2);
                return new j(status, kVar);
            case 4:
                int c16 = b.c1(parcel);
                boolean z23 = false;
                boolean z24 = false;
                boolean z25 = false;
                boolean z26 = false;
                boolean z27 = false;
                boolean z28 = false;
                while (parcel.dataPosition() < c16) {
                    int readInt5 = parcel.readInt();
                    switch ((char) readInt5) {
                        case 1:
                            z23 = b.w0(readInt5, parcel2);
                            break;
                        case 2:
                            z24 = b.w0(readInt5, parcel2);
                            break;
                        case 3:
                            z25 = b.w0(readInt5, parcel2);
                            break;
                        case 4:
                            z26 = b.w0(readInt5, parcel2);
                            break;
                        case 5:
                            z27 = b.w0(readInt5, parcel2);
                            break;
                        case zzaky.zzf.zzf /*6*/:
                            z28 = b.w0(readInt5, parcel2);
                            break;
                        default:
                            b.T0(readInt5, parcel2);
                            break;
                    }
                }
                b.x(c16, parcel2);
                return new k(z23, z24, z25, z26, z27, z28);
            case 5:
                int c17 = b.c1(parcel);
                int i2 = 1;
                int i5 = 1;
                long j6 = -1;
                long j7 = -1;
                while (parcel.dataPosition() < c17) {
                    int readInt6 = parcel.readInt();
                    char c8 = (char) readInt6;
                    if (c8 == 1) {
                        i2 = b.A0(readInt6, parcel2);
                    } else if (c8 == 2) {
                        i5 = b.A0(readInt6, parcel2);
                    } else if (c8 == 3) {
                        j6 = b.C0(readInt6, parcel2);
                    } else if (c8 != 4) {
                        b.T0(readInt6, parcel2);
                    } else {
                        j7 = b.C0(readInt6, parcel2);
                    }
                }
                b.x(c17, parcel2);
                return new z(i2, i5, j6, j7);
            case zzaky.zzf.zzf /*6*/:
                int c18 = b.c1(parcel);
                String str4 = "";
                ArrayList arrayList2 = null;
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < c18) {
                    int readInt7 = parcel.readInt();
                    char c9 = (char) readInt7;
                    if (c9 == 1) {
                        arrayList2 = b.t(readInt7, parcel2);
                    } else if (c9 == 2) {
                        pendingIntent = (PendingIntent) b.q(parcel2, readInt7, PendingIntent.CREATOR);
                    } else if (c9 != 3) {
                        b.T0(readInt7, parcel2);
                    } else {
                        str4 = b.r(readInt7, parcel2);
                    }
                }
                b.x(c18, parcel2);
                return new A(arrayList2, pendingIntent, str4);
            case zzaky.zzf.zzg /*7*/:
                int c19 = b.c1(parcel);
                ArrayList arrayList3 = null;
                int i6 = 0;
                while (parcel.dataPosition() < c19) {
                    int readInt8 = parcel.readInt();
                    char c10 = (char) readInt8;
                    if (c10 == 1) {
                        arrayList3 = b.v(parcel2, readInt8, B.CREATOR);
                    } else if (c10 != 2) {
                        b.T0(readInt8, parcel2);
                    } else {
                        i6 = b.A0(readInt8, parcel2);
                    }
                }
                b.x(c19, parcel2);
                return new l(i6, arrayList3);
            case 8:
                int c110 = b.c1(parcel);
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                int i10 = 0;
                while (parcel.dataPosition() < c110) {
                    int readInt9 = parcel.readInt();
                    char c11 = (char) readInt9;
                    if (c11 == 1) {
                        i7 = b.A0(readInt9, parcel2);
                    } else if (c11 == 2) {
                        i8 = b.A0(readInt9, parcel2);
                    } else if (c11 == 3) {
                        i9 = b.A0(readInt9, parcel2);
                    } else if (c11 != 4) {
                        b.T0(readInt9, parcel2);
                    } else {
                        i10 = b.A0(readInt9, parcel2);
                    }
                }
                b.x(c110, parcel2);
                return new B(i7, i8, i9, i10);
            case 9:
                int c111 = b.c1(parcel);
                int i11 = 0;
                int i12 = 0;
                while (parcel.dataPosition() < c111) {
                    int readInt10 = parcel.readInt();
                    char c20 = (char) readInt10;
                    if (c20 == 1) {
                        i11 = b.A0(readInt10, parcel2);
                    } else if (c20 != 2) {
                        b.T0(readInt10, parcel2);
                    } else {
                        i12 = b.A0(readInt10, parcel2);
                    }
                }
                b.x(c111, parcel2);
                return new C0137b(i11, i12);
            case 10:
                int c112 = b.c1(parcel);
                ArrayList arrayList4 = null;
                String str5 = null;
                ArrayList arrayList5 = null;
                String str6 = null;
                while (parcel.dataPosition() < c112) {
                    int readInt11 = parcel.readInt();
                    char c21 = (char) readInt11;
                    if (c21 == 1) {
                        arrayList4 = b.v(parcel2, readInt11, C0137b.CREATOR);
                    } else if (c21 == 2) {
                        str5 = b.r(readInt11, parcel2);
                    } else if (c21 == 3) {
                        arrayList5 = b.v(parcel2, readInt11, C0378g.CREATOR);
                    } else if (c21 != 4) {
                        b.T0(readInt11, parcel2);
                    } else {
                        str6 = b.r(readInt11, parcel2);
                    }
                }
                b.x(c112, parcel2);
                return new C0138c(arrayList4, str5, arrayList5, str6);
            case ModuleDescriptor.MODULE_VERSION /*11*/:
                int c113 = b.c1(parcel);
                boolean z29 = true;
                long j8 = 50;
                float f6 = 0.0f;
                long j9 = Long.MAX_VALUE;
                int i13 = Integer.MAX_VALUE;
                while (parcel.dataPosition() < c113) {
                    int readInt12 = parcel.readInt();
                    char c22 = (char) readInt12;
                    if (c22 == 1) {
                        z29 = b.w0(readInt12, parcel2);
                    } else if (c22 == 2) {
                        j8 = b.C0(readInt12, parcel2);
                    } else if (c22 == 3) {
                        b.f1(parcel2, readInt12, 4);
                        f6 = parcel.readFloat();
                    } else if (c22 == 4) {
                        j9 = b.C0(readInt12, parcel2);
                    } else if (c22 != 5) {
                        b.T0(readInt12, parcel2);
                    } else {
                        i13 = b.A0(readInt12, parcel2);
                    }
                }
                b.x(c113, parcel2);
                return new C(z29, j8, f6, j9, i13);
            case 12:
                int c114 = b.c1(parcel);
                Bundle bundle = null;
                while (parcel.dataPosition() < c114) {
                    int readInt13 = parcel.readInt();
                    if (((char) readInt13) != 2) {
                        b.T0(readInt13, parcel2);
                    } else {
                        bundle = b.n(readInt13, parcel2);
                    }
                }
                b.x(c114, parcel2);
                return new x(bundle);
            case 13:
                int c115 = b.c1(parcel);
                long j10 = 0;
                long j11 = 0;
                int i14 = 0;
                while (parcel.dataPosition() < c115) {
                    int readInt14 = parcel.readInt();
                    char c23 = (char) readInt14;
                    if (c23 == 1) {
                        j10 = b.C0(readInt14, parcel2);
                    } else if (c23 == 2) {
                        i14 = b.A0(readInt14, parcel2);
                    } else if (c23 != 3) {
                        b.T0(readInt14, parcel2);
                    } else {
                        j11 = b.C0(readInt14, parcel2);
                    }
                }
                b.x(c115, parcel2);
                return new C0161d(j10, i14, j11);
            case 14:
                int c116 = b.c1(parcel);
                String str7 = null;
                String str8 = null;
                W1 w12 = null;
                String str9 = null;
                C0214v vVar = null;
                C0214v vVar2 = null;
                C0214v vVar3 = null;
                long j12 = 0;
                long j13 = 0;
                long j14 = 0;
                boolean z30 = false;
                while (parcel.dataPosition() < c116) {
                    int readInt15 = parcel.readInt();
                    switch ((char) readInt15) {
                        case 2:
                            str7 = b.r(readInt15, parcel2);
                            break;
                        case 3:
                            str8 = b.r(readInt15, parcel2);
                            break;
                        case 4:
                            w12 = (W1) b.q(parcel2, readInt15, W1.CREATOR);
                            break;
                        case 5:
                            j12 = b.C0(readInt15, parcel2);
                            break;
                        case zzaky.zzf.zzf /*6*/:
                            z30 = b.w0(readInt15, parcel2);
                            break;
                        case zzaky.zzf.zzg /*7*/:
                            str9 = b.r(readInt15, parcel2);
                            break;
                        case 8:
                            vVar = (C0214v) b.q(parcel2, readInt15, C0214v.CREATOR);
                            break;
                        case 9:
                            j13 = b.C0(readInt15, parcel2);
                            break;
                        case 10:
                            vVar2 = (C0214v) b.q(parcel2, readInt15, C0214v.CREATOR);
                            break;
                        case ModuleDescriptor.MODULE_VERSION /*11*/:
                            j14 = b.C0(readInt15, parcel2);
                            break;
                        case 12:
                            vVar3 = (C0214v) b.q(parcel2, readInt15, C0214v.CREATOR);
                            break;
                        default:
                            b.T0(readInt15, parcel2);
                            break;
                    }
                }
                b.x(c116, parcel2);
                return new C0164e(str7, str8, w12, j12, z30, str9, vVar, j13, vVar2, j14, vVar3);
            case 15:
                int c117 = b.c1(parcel);
                Bundle bundle2 = null;
                while (parcel.dataPosition() < c117) {
                    int readInt16 = parcel.readInt();
                    if (((char) readInt16) != 1) {
                        b.T0(readInt16, parcel2);
                    } else {
                        bundle2 = b.n(readInt16, parcel2);
                    }
                }
                b.x(c117, parcel2);
                return new C0176i(bundle2);
            case 16:
                int c118 = b.c1(parcel);
                Bundle bundle3 = null;
                while (parcel.dataPosition() < c118) {
                    int readInt17 = parcel.readInt();
                    if (((char) readInt17) != 2) {
                        b.T0(readInt17, parcel2);
                    } else {
                        bundle3 = b.n(readInt17, parcel2);
                    }
                }
                b.x(c118, parcel2);
                return new C0211u(bundle3);
            case 17:
                int c119 = b.c1(parcel);
                long j15 = 0;
                String str10 = null;
                C0211u uVar = null;
                String str11 = null;
                while (parcel.dataPosition() < c119) {
                    int readInt18 = parcel.readInt();
                    char c24 = (char) readInt18;
                    if (c24 == 2) {
                        str10 = b.r(readInt18, parcel2);
                    } else if (c24 == 3) {
                        uVar = (C0211u) b.q(parcel2, readInt18, C0211u.CREATOR);
                    } else if (c24 == 4) {
                        str11 = b.r(readInt18, parcel2);
                    } else if (c24 != 5) {
                        b.T0(readInt18, parcel2);
                    } else {
                        j15 = b.C0(readInt18, parcel2);
                    }
                }
                b.x(c119, parcel2);
                return new C0214v(str10, uVar, str11, j15);
            case 18:
                int c120 = b.c1(parcel);
                int i15 = 0;
                long j16 = 0;
                String str12 = null;
                while (parcel.dataPosition() < c120) {
                    int readInt19 = parcel.readInt();
                    char c25 = (char) readInt19;
                    if (c25 == 1) {
                        str12 = b.r(readInt19, parcel2);
                    } else if (c25 == 2) {
                        j16 = b.C0(readInt19, parcel2);
                    } else if (c25 != 3) {
                        b.T0(readInt19, parcel2);
                    } else {
                        i15 = b.A0(readInt19, parcel2);
                    }
                }
                b.x(c120, parcel2);
                return new I1(str12, j16, i15);
            case 19:
                int c121 = b.c1(parcel);
                byte[] bArr = null;
                String str13 = null;
                Bundle bundle4 = null;
                String str14 = null;
                long j17 = 0;
                long j18 = 0;
                int i16 = 0;
                while (parcel.dataPosition() < c121) {
                    int readInt20 = parcel.readInt();
                    switch ((char) readInt20) {
                        case 1:
                            j17 = b.C0(readInt20, parcel2);
                            break;
                        case 2:
                            bArr = b.o(readInt20, parcel2);
                            break;
                        case 3:
                            str13 = b.r(readInt20, parcel2);
                            break;
                        case 4:
                            bundle4 = b.n(readInt20, parcel2);
                            break;
                        case 5:
                            i16 = b.A0(readInt20, parcel2);
                            break;
                        case zzaky.zzf.zzf /*6*/:
                            j18 = b.C0(readInt20, parcel2);
                            break;
                        case zzaky.zzf.zzg /*7*/:
                            str14 = b.r(readInt20, parcel2);
                            break;
                        default:
                            b.T0(readInt20, parcel2);
                            break;
                    }
                }
                b.x(c121, parcel2);
                return new L1(j17, bArr, str13, bundle4, i16, j18, str14);
            case 20:
                int c122 = b.c1(parcel);
                while (true) {
                    ArrayList arrayList6 = null;
                    while (true) {
                        if (parcel.dataPosition() < c122) {
                            int readInt21 = parcel.readInt();
                            if (((char) readInt21) != 1) {
                                b.T0(readInt21, parcel2);
                            } else {
                                int E02 = b.E0(readInt21, parcel2);
                                int dataPosition = parcel.dataPosition();
                                if (E02 != 0) {
                                    ArrayList arrayList7 = new ArrayList();
                                    int readInt22 = parcel.readInt();
                                    for (int i17 = 0; i17 < readInt22; i17++) {
                                        arrayList7.add(Integer.valueOf(parcel.readInt()));
                                    }
                                    parcel2.setDataPosition(dataPosition + E02);
                                    arrayList6 = arrayList7;
                                }
                            }
                        } else {
                            b.x(c122, parcel2);
                            return new M1(arrayList6);
                        }
                    }
                }
            case 21:
                int c123 = b.c1(parcel);
                ArrayList arrayList8 = null;
                while (parcel.dataPosition() < c123) {
                    int readInt23 = parcel.readInt();
                    if (((char) readInt23) != 1) {
                        b.T0(readInt23, parcel2);
                    } else {
                        arrayList8 = b.v(parcel2, readInt23, L1.CREATOR);
                    }
                }
                b.x(c123, parcel2);
                return new N1(arrayList8);
            case 22:
                int c124 = b.c1(parcel);
                String str15 = null;
                Long l6 = null;
                Float f7 = null;
                String str16 = null;
                String str17 = null;
                Double d = null;
                long j19 = 0;
                int i18 = 0;
                while (parcel.dataPosition() < c124) {
                    int readInt24 = parcel.readInt();
                    switch ((char) readInt24) {
                        case 1:
                            i18 = b.A0(readInt24, parcel2);
                            break;
                        case 2:
                            str15 = b.r(readInt24, parcel2);
                            break;
                        case 3:
                            j19 = b.C0(readInt24, parcel2);
                            break;
                        case 4:
                            l6 = b.D0(readInt24, parcel2);
                            break;
                        case 5:
                            int E03 = b.E0(readInt24, parcel2);
                            if (E03 != 0) {
                                b.e1(parcel2, E03, 4);
                                f7 = Float.valueOf(parcel.readFloat());
                                break;
                            } else {
                                f7 = null;
                                break;
                            }
                        case zzaky.zzf.zzf /*6*/:
                            str16 = b.r(readInt24, parcel2);
                            break;
                        case zzaky.zzf.zzg /*7*/:
                            str17 = b.r(readInt24, parcel2);
                            break;
                        case 8:
                            d = b.y0(readInt24, parcel2);
                            break;
                        default:
                            b.T0(readInt24, parcel2);
                            break;
                    }
                }
                b.x(c124, parcel2);
                return new W1(i18, str15, j19, l6, f7, str16, str17, d);
            case 23:
                int c125 = b.c1(parcel);
                boolean z31 = false;
                int i19 = 0;
                boolean z32 = false;
                boolean z33 = false;
                int i20 = 0;
                int i21 = 0;
                long j20 = 0;
                long j21 = 0;
                long j22 = 0;
                long j23 = 0;
                long j24 = 0;
                long j25 = 0;
                long j26 = 0;
                String str18 = "";
                String str19 = str18;
                String str20 = str19;
                String str21 = str20;
                String str22 = null;
                String str23 = null;
                String str24 = null;
                String str25 = null;
                String str26 = null;
                String str27 = null;
                String str28 = null;
                Boolean bool = null;
                ArrayList arrayList9 = null;
                String str29 = null;
                String str30 = null;
                String str31 = null;
                int i22 = 100;
                boolean z34 = true;
                boolean z35 = true;
                long j27 = -2147483648L;
                while (parcel.dataPosition() < c125) {
                    int readInt25 = parcel.readInt();
                    switch ((char) readInt25) {
                        case 2:
                            str22 = b.r(readInt25, parcel2);
                            break;
                        case 3:
                            str23 = b.r(readInt25, parcel2);
                            break;
                        case 4:
                            str24 = b.r(readInt25, parcel2);
                            break;
                        case 5:
                            str25 = b.r(readInt25, parcel2);
                            break;
                        case zzaky.zzf.zzf /*6*/:
                            j20 = b.C0(readInt25, parcel2);
                            break;
                        case zzaky.zzf.zzg /*7*/:
                            j21 = b.C0(readInt25, parcel2);
                            break;
                        case 8:
                            str26 = b.r(readInt25, parcel2);
                            break;
                        case 9:
                            z34 = b.w0(readInt25, parcel2);
                            break;
                        case 10:
                            z31 = b.w0(readInt25, parcel2);
                            break;
                        case ModuleDescriptor.MODULE_VERSION /*11*/:
                            j27 = b.C0(readInt25, parcel2);
                            break;
                        case 12:
                            str27 = b.r(readInt25, parcel2);
                            break;
                        case 14:
                            j22 = b.C0(readInt25, parcel2);
                            break;
                        case 15:
                            i19 = b.A0(readInt25, parcel2);
                            break;
                        case 16:
                            z35 = b.w0(readInt25, parcel2);
                            break;
                        case 18:
                            z32 = b.w0(readInt25, parcel2);
                            break;
                        case 19:
                            str28 = b.r(readInt25, parcel2);
                            break;
                        case 21:
                            bool = b.x0(readInt25, parcel2);
                            break;
                        case 22:
                            j23 = b.C0(readInt25, parcel2);
                            break;
                        case 23:
                            arrayList9 = b.t(readInt25, parcel2);
                            break;
                        case 24:
                            str29 = b.r(readInt25, parcel2);
                            break;
                        case 25:
                            str18 = b.r(readInt25, parcel2);
                            break;
                        case 26:
                            str19 = b.r(readInt25, parcel2);
                            break;
                        case 27:
                            str30 = b.r(readInt25, parcel2);
                            break;
                        case 28:
                            z33 = b.w0(readInt25, parcel2);
                            break;
                        case 29:
                            j24 = b.C0(readInt25, parcel2);
                            break;
                        case 30:
                            i22 = b.A0(readInt25, parcel2);
                            break;
                        case 31:
                            str20 = b.r(readInt25, parcel2);
                            break;
                        case ' ':
                            i20 = b.A0(readInt25, parcel2);
                            break;
                        case '\"':
                            j25 = b.C0(readInt25, parcel2);
                            break;
                        case '#':
                            str31 = b.r(readInt25, parcel2);
                            break;
                        case '$':
                            str21 = b.r(readInt25, parcel2);
                            break;
                        case '%':
                            j26 = b.C0(readInt25, parcel2);
                            break;
                        case '&':
                            i21 = b.A0(readInt25, parcel2);
                            break;
                        default:
                            b.T0(readInt25, parcel2);
                            break;
                    }
                }
                b.x(c125, parcel2);
                return new Z1(str22, str23, str24, str25, j20, j21, str26, z34, z31, j27, str27, j22, i19, z35, z32, str28, bool, j23, arrayList9, str29, str18, str19, str30, z33, j24, i22, str20, i20, j25, str31, str21, j26, i21);
            case 24:
                j.e(parcel2, "in");
                Class<Uri> cls = Uri.class;
                float[] createFloatArray = parcel.createFloatArray();
                j.b(createFloatArray);
                Class<Rect> cls2 = Rect.class;
                return new y((Uri) parcel2.readParcelable(cls.getClassLoader()), (Uri) parcel2.readParcelable(cls.getClassLoader()), (Exception) parcel.readSerializable(), createFloatArray, (Rect) parcel2.readParcelable(cls2.getClassLoader()), (Rect) parcel2.readParcelable(cls2.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 25:
                j.e(parcel2, "parcel");
                if (parcel.readInt() != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (parcel.readInt() != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                z valueOf = z.valueOf(parcel.readString());
                W0.x valueOf2 = W0.x.valueOf(parcel.readString());
                float readFloat = parcel.readFloat();
                float readFloat2 = parcel.readFloat();
                float readFloat3 = parcel.readFloat();
                A valueOf3 = A.valueOf(parcel.readString());
                H valueOf4 = H.valueOf(parcel.readString());
                if (parcel.readInt() != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (parcel.readInt() != 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (parcel.readInt() != 0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                int readInt26 = parcel.readInt();
                if (parcel.readInt() != 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (parcel.readInt() != 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (parcel.readInt() != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (parcel.readInt() != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                int readInt27 = parcel.readInt();
                float readFloat4 = parcel.readFloat();
                if (parcel.readInt() != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                int readInt28 = parcel.readInt();
                int readInt29 = parcel.readInt();
                float readFloat5 = parcel.readFloat();
                int readInt30 = parcel.readInt();
                float readFloat6 = parcel.readFloat();
                float readFloat7 = parcel.readFloat();
                float readFloat8 = parcel.readFloat();
                int readInt31 = parcel.readInt();
                int readInt32 = parcel.readInt();
                float readFloat9 = parcel.readFloat();
                int readInt33 = parcel.readInt();
                int readInt34 = parcel.readInt();
                int readInt35 = parcel.readInt();
                int readInt36 = parcel.readInt();
                int readInt37 = parcel.readInt();
                int readInt38 = parcel.readInt();
                int readInt39 = parcel.readInt();
                int readInt40 = parcel.readInt();
                Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
                CharSequence charSequence = (CharSequence) creator.createFromParcel(parcel2);
                int readInt41 = parcel.readInt();
                if (parcel.readInt() == 0) {
                    num = null;
                } else {
                    num = Integer.valueOf(parcel.readInt());
                }
                Class<W0.w> cls3 = W0.w.class;
                Uri uri = (Uri) parcel2.readParcelable(cls3.getClassLoader());
                Bitmap.CompressFormat valueOf5 = Bitmap.CompressFormat.valueOf(parcel.readString());
                int readInt42 = parcel.readInt();
                int readInt43 = parcel.readInt();
                int readInt44 = parcel.readInt();
                G valueOf6 = G.valueOf(parcel.readString());
                if (parcel.readInt() != 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                Rect rect = (Rect) parcel2.readParcelable(cls3.getClassLoader());
                int readInt45 = parcel.readInt();
                if (parcel.readInt() != 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (parcel.readInt() != 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (parcel.readInt() != 0) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                int readInt46 = parcel.readInt();
                if (parcel.readInt() != 0) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (parcel.readInt() != 0) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                CharSequence charSequence2 = (CharSequence) creator.createFromParcel(parcel2);
                int readInt47 = parcel.readInt();
                if (parcel.readInt() != 0) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                if (parcel.readInt() != 0) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                String readString = parcel.readString();
                ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                float readFloat10 = parcel.readFloat();
                int readInt48 = parcel.readInt();
                String readString2 = parcel.readString();
                int readInt49 = parcel.readInt();
                if (parcel.readInt() == 0) {
                    num2 = null;
                } else {
                    num2 = Integer.valueOf(parcel.readInt());
                }
                if (parcel.readInt() == 0) {
                    num3 = null;
                } else {
                    num3 = Integer.valueOf(parcel.readInt());
                }
                if (parcel.readInt() == 0) {
                    num4 = null;
                } else {
                    num4 = Integer.valueOf(parcel.readInt());
                }
                if (parcel.readInt() == 0) {
                    num5 = null;
                } else {
                    num5 = Integer.valueOf(parcel.readInt());
                }
                return new W0.w(z3, z4, valueOf, valueOf2, readFloat, readFloat2, readFloat3, valueOf3, valueOf4, z5, z6, z7, readInt26, z8, z9, z10, z11, readInt27, readFloat4, z12, readInt28, readInt29, readFloat5, readInt30, readFloat6, readFloat7, readFloat8, readInt31, readInt32, readFloat9, readInt33, readInt34, readInt35, readInt36, readInt37, readInt38, readInt39, readInt40, charSequence, readInt41, num, uri, valueOf5, readInt42, readInt43, readInt44, valueOf6, z13, rect, readInt45, z14, z15, z16, readInt46, z17, z18, charSequence2, readInt47, z19, z20, readString, createStringArrayList, readFloat10, readInt48, readString2, readInt49, num2, num3, num4, num5);
            case 26:
                int c126 = b.c1(parcel);
                Intent intent = null;
                int i23 = 0;
                int i24 = 0;
                while (parcel.dataPosition() < c126) {
                    int readInt50 = parcel.readInt();
                    char c26 = (char) readInt50;
                    if (c26 == 1) {
                        i23 = b.A0(readInt50, parcel2);
                    } else if (c26 == 2) {
                        i24 = b.A0(readInt50, parcel2);
                    } else if (c26 != 3) {
                        b.T0(readInt50, parcel2);
                    } else {
                        intent = (Intent) b.q(parcel2, readInt50, Intent.CREATOR);
                    }
                }
                b.x(c126, parcel2);
                return new W1.b(i23, i24, intent);
            case 27:
                int c127 = b.c1(parcel);
                ArrayList arrayList10 = null;
                String str32 = null;
                while (parcel.dataPosition() < c127) {
                    int readInt51 = parcel.readInt();
                    char c27 = (char) readInt51;
                    if (c27 == 1) {
                        arrayList10 = b.t(readInt51, parcel2);
                    } else if (c27 != 2) {
                        b.T0(readInt51, parcel2);
                    } else {
                        str32 = b.r(readInt51, parcel2);
                    }
                }
                b.x(c127, parcel2);
                return new e(str32, arrayList10);
            case 28:
                int c128 = b.c1(parcel);
                com.google.android.gms.common.internal.A a6 = null;
                int i25 = 0;
                while (parcel.dataPosition() < c128) {
                    int readInt52 = parcel.readInt();
                    char c28 = (char) readInt52;
                    if (c28 == 1) {
                        i25 = b.A0(readInt52, parcel2);
                    } else if (c28 != 2) {
                        b.T0(readInt52, parcel2);
                    } else {
                        a6 = (com.google.android.gms.common.internal.A) b.q(parcel2, readInt52, com.google.android.gms.common.internal.A.CREATOR);
                    }
                }
                b.x(c128, parcel2);
                return new f(i25, a6);
            default:
                int c129 = b.c1(parcel);
                C1132b bVar = null;
                int i26 = 0;
                B b6 = null;
                while (parcel.dataPosition() < c129) {
                    int readInt53 = parcel.readInt();
                    char c29 = (char) readInt53;
                    if (c29 == 1) {
                        i26 = b.A0(readInt53, parcel2);
                    } else if (c29 == 2) {
                        bVar = (C1132b) b.q(parcel2, readInt53, C1132b.CREATOR);
                    } else if (c29 != 3) {
                        b.T0(readInt53, parcel2);
                    } else {
                        b6 = (B) b.q(parcel2, readInt53, B.CREATOR);
                    }
                }
                b.x(c129, parcel2);
                return new g(i26, bVar, b6);
        }
    }

    public final Object[] newArray(int i2) {
        switch (this.f2426a) {
            case 0:
                return new LocationResult[i2];
            case 1:
                return new y[i2];
            case 2:
                return new i[i2];
            case 3:
                return new j[i2];
            case 4:
                return new k[i2];
            case 5:
                return new z[i2];
            case zzaky.zzf.zzf /*6*/:
                return new A[i2];
            case zzaky.zzf.zzg /*7*/:
                return new l[i2];
            case 8:
                return new B[i2];
            case 9:
                return new C0137b[i2];
            case 10:
                return new C0138c[i2];
            case ModuleDescriptor.MODULE_VERSION /*11*/:
                return new C[i2];
            case 12:
                return new x[i2];
            case 13:
                return new C0161d[i2];
            case 14:
                return new C0164e[i2];
            case 15:
                return new C0176i[i2];
            case 16:
                return new C0211u[i2];
            case 17:
                return new C0214v[i2];
            case 18:
                return new I1[i2];
            case 19:
                return new L1[i2];
            case 20:
                return new M1[i2];
            case 21:
                return new N1[i2];
            case 22:
                return new W1[i2];
            case 23:
                return new Z1[i2];
            case 24:
                return new C0241m[i2];
            case 25:
                return new W0.w[i2];
            case 26:
                return new W1.b[i2];
            case 27:
                return new e[i2];
            case 28:
                return new f[i2];
            default:
                return new g[i2];
        }
    }
}
