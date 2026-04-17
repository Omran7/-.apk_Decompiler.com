package android.support.v4.media.session;

import A2.f;
import F3.h;
import K1.e;
import K4.u;
import R2.b;
import S3.C0143d;
import S3.z;
import Y4.C0246c;
import Y4.C0247d;
import Y4.D;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.emoji2.text.g;
import com.bumptech.glide.c;
import com.google.android.gms.common.api.internal.C0362p;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.fragments.gangBase.C0421a;
import com.mtma.criminal.city.utils.C;
import com.mtma.criminal.city.utils.C0432b;
import com.mtma.criminal.city.utils.C0433c;
import com.mtma.criminal.city.utils.E;
import com.mtma.criminal.city.utils.F;
import com.mtma.criminal.city.utils.H;
import com.mtma.criminal.city.utils.W;
import com.mtma.criminal.city.utils.m0;
import com.mtma.criminal.city.utils.n0;
import com.mtma.criminal.city.utils.o0;
import com.mtma.criminal.city.utils.p0;
import com.mtma.criminal.city.utils.q0;
import d5.o;
import g3.C0548a;
import g3.C0549b;
import i3.C0587c;
import i3.C0590f;
import i3.C0592h;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import k3.C0762b;
import m0.C0804F;
import m0.P;
import n3.C0866g;
import o3.d;
import p.C0901d;
import p.C0904g;
import q3.l;
import v3.C1046a;
import v3.C1048c;
import v3.C1051f;
import v3.i;
import v3.j;
import v3.k;
import v3.p;
import v3.q;
import v3.s;
import v3.w;
import z0.C1129e;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f4597a = 0;

    public static long A(int i2, int i5, int i6) {
        double H6;
        int i7 = i5;
        long[] jArr = {1000, 5000};
        switch (i2) {
            case 0:
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 3) {
                            if (i7 == 4) {
                                jArr = new long[]{20, 25};
                                break;
                            }
                        } else {
                            jArr = new long[]{15, 20};
                            break;
                        }
                    } else {
                        jArr = new long[]{10, 15};
                        break;
                    }
                } else {
                    jArr = new long[]{5, 10};
                    break;
                }
                break;
            case 1:
                long j6 = ((long) i7) * 5;
                jArr = new long[]{5 + j6, j6 + 10};
                break;
            case 4:
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 != 3) {
                                if (i7 == 4) {
                                    jArr = new long[]{1000, 5000};
                                    break;
                                }
                            } else {
                                jArr = new long[]{500, 2500};
                                break;
                            }
                        } else {
                            jArr = new long[]{100, 1000};
                            break;
                        }
                    } else {
                        jArr = new long[]{300, 500};
                        break;
                    }
                } else {
                    jArr = new long[]{200, 300};
                    break;
                }
                break;
            case 5:
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 == 3) {
                                jArr = new long[]{5000, 50000};
                                break;
                            }
                        } else {
                            jArr = new long[]{1000, 20000};
                            break;
                        }
                    } else {
                        jArr = new long[]{100, 1000};
                        break;
                    }
                } else {
                    jArr = new long[]{100, 500};
                    break;
                }
                break;
            case zzaky.zzf.zzf /*6*/:
                jArr = new long[]{5000, 15000};
                break;
            case zzaky.zzf.zzg /*7*/:
                long j7 = ((long) i7) * 5000;
                jArr = new long[]{5000 + j7, j7 + 10000};
                break;
            case 8:
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 == 3) {
                                jArr = new long[]{100000, 0};
                                break;
                            }
                        } else {
                            jArr = new long[]{50000, 0};
                            break;
                        }
                    } else {
                        jArr = new long[]{20000, 0};
                        break;
                    }
                } else {
                    jArr = new long[]{10000, 0};
                    break;
                }
                break;
            case 9:
                long j8 = (long) i7;
                jArr = new long[]{(1000 * j8) + 2000, (j8 * 2000) + 4000};
                break;
            case ModuleDescriptor.MODULE_VERSION /*11*/:
                if (i7 != 0) {
                    if (i7 == 1) {
                        jArr = new long[]{10000, 50000};
                        break;
                    }
                } else {
                    jArr = new long[]{10000, 25000};
                    break;
                }
                break;
            case 12:
                long j9 = ((long) i7) * 10000;
                jArr = new long[]{j9 + 10000, j9 + 20000};
                break;
            case 13:
                long j10 = ((long) i7) * 8000;
                jArr = new long[]{8000 + j10, j10 + 16000};
                break;
            case 14:
                if (i7 != 0) {
                    if (i7 == 1) {
                        jArr = new long[]{10000, 200000};
                        break;
                    }
                } else {
                    jArr = new long[]{75000, 100000};
                    break;
                }
                break;
            case 15:
                if (i7 != 0) {
                    if (i7 == 1) {
                        jArr = new long[]{100000, 200000};
                        break;
                    }
                } else {
                    jArr = new long[]{25000, 50000};
                    break;
                }
                break;
            case 16:
                jArr = new long[]{100000, 0};
                break;
        }
        double d = 0.0d;
        if (o.getSchoolObject().getLawLessons().get(4).intValue() == 2) {
            H6 = c.H(0, 4);
        } else {
            if (o.getSchoolObject().getLawLessons().get(1).intValue() == 2) {
                H6 = c.H(0, 1);
            }
            double S5 = e.S(15) + d + 1.0d;
            jArr[0] = (long) (((double) jArr[0]) * S5);
            jArr[1] = (long) (((double) jArr[1]) * S5);
            return jArr[i6];
        }
        d = 0.0d + H6;
        double S52 = e.S(15) + d + 1.0d;
        jArr[0] = (long) (((double) jArr[0]) * S52);
        jArr[1] = (long) (((double) jArr[1]) * S52);
        return jArr[i6];
    }

    public static void A0(String str, C0587c cVar) {
        if (cVar == null) {
            o.getStockObject().getItemsInStock().remove(str);
        } else {
            o.getStockObject().getItemsInStock().put(str, cVar.f(Object.class));
        }
        int[] g02 = g0(o.getStockObject().getItemsInStock());
        int X3 = e.X(0) - g02[1];
        o.getStockObject().setStockFreeSpace(o.getStockObject().getStockSpace() - g02[0]);
        o.getStockObject().setBagFreeSpace(X3);
    }

    public static int B(int i2) {
        if (o.getCrimeObject() != null) {
            if (i2 < o.getCrimeObject().getLastOpenedCrimeType()) {
                return 2;
            }
            if (i2 > o.getCrimeObject().getLastOpenedCrimeType()) {
                return 0;
            }
            int size = G(i2).size() / 3;
            if (o.getCrimeObject().getLastOpenedCrimeItem() > size * 2) {
                return 2;
            }
            if (o.getCrimeObject().getLastOpenedCrimeItem() > size) {
                return 1;
            }
        }
        return 0;
    }

    public static void B0(int i2, int i5, int i6, int i7, o0 o0Var, String str, String str2, boolean z3) {
        String str3 = str;
        int i8 = i2;
        int i9 = i6;
        d.d(C0592h.b().e(), "players", str3, "stockObject", "itemsInStock").E(e.y(i5)).E(e.x(i2, i6)).H(new n0(i7, i2, i5, i6, o0Var, str3, str2, z3));
    }

    public static int C(int i2, int i5) {
        if (i2 < o.getCrimeObject().getLastOpenedCrimeType() || i5 < o.getCrimeObject().getLastOpenedCrimeItem()) {
            return 2;
        }
        if (i5 != o.getCrimeObject().getLastOpenedCrimeItem()) {
            return 0;
        }
        if (o.getCrimeObject().getLastOpenedCrimeExecutionNumber() >= ((double) (D() * 2))) {
            return 2;
        }
        if (o.getCrimeObject().getLastOpenedCrimeExecutionNumber() >= ((double) D())) {
            return 1;
        }
        return 0;
    }

    public static void C0(int i2, int i5, long j6, String str) {
        if (i2 == 0 || i2 == 1) {
            c.s(true, new C(i2, i5, j6, str));
        } else if (i2 == 2) {
            switch (i5) {
                case 0:
                case 1:
                case 2:
                case 3:
                    z0(i2, i5, j6, str);
                    return;
                case 4:
                case 5:
                case zzaky.zzf.zzf /*6*/:
                case zzaky.zzf.zzg /*7*/:
                case 8:
                case 9:
                    D0(i2, i5, str, j6, (String) null);
                    return;
                default:
                    return;
            }
        } else if (i2 == 3) {
            if (i5 != 0) {
                if (i5 == 1 || i5 == 2) {
                    z0(i2, i5, j6, str);
                    return;
                } else if (i5 != 3) {
                    return;
                }
            }
            D0(i2, i5, str, j6, (String) null);
        } else if (i2 == 4) {
            D0(i2, i5, str, j6, (String) null);
        }
    }

    public static int D() {
        return (o.getCrimeObject().getLastOpenedCrimeType() + 1) * 5;
    }

    public static void D0(int i2, int i5, String str, long j6, String str2) {
        C0590f fVar;
        if (str2 != null) {
            fVar = com.google.android.gms.internal.measurement.a.x(C0592h.d().e(), "rank").E(L(i2)).E(M(i2, i5)).E(str2).E(str);
        } else {
            fVar = com.google.android.gms.internal.measurement.a.x(C0592h.d().e(), "rank").E(L(i2)).E(M(i2, i5)).E(str);
        }
        fVar.H(new u(j6, (Object) str, 9));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int E(int r5, int r6) {
        /*
            r0 = 5
            r1 = 2
            r2 = 0
            switch(r5) {
                case 0: goto L_0x0059;
                case 1: goto L_0x0055;
                case 2: goto L_0x0051;
                case 3: goto L_0x004d;
                case 4: goto L_0x0048;
                case 5: goto L_0x0043;
                case 6: goto L_0x003e;
                case 7: goto L_0x0039;
                case 8: goto L_0x0034;
                case 9: goto L_0x002f;
                case 10: goto L_0x002a;
                case 11: goto L_0x0025;
                case 12: goto L_0x0020;
                case 13: goto L_0x001b;
                case 14: goto L_0x0015;
                case 15: goto L_0x000f;
                case 16: goto L_0x0009;
                default: goto L_0x0006;
            }
        L_0x0006:
            r6 = r2
            goto L_0x0072
        L_0x0009:
            int r6 = r6 * 100
            int r6 = r6 + 900
            goto L_0x0072
        L_0x000f:
            int r6 = r6 * 50
            int r6 = r6 + 750
            goto L_0x0072
        L_0x0015:
            int r6 = r6 * 50
            int r6 = r6 + 650
            goto L_0x0072
        L_0x001b:
            int r6 = r6 * 20
            int r6 = r6 + 570
            goto L_0x0072
        L_0x0020:
            int r6 = r6 * 10
            int r6 = r6 + 500
            goto L_0x0072
        L_0x0025:
            int r6 = r6 * 20
            int r6 = r6 + 470
            goto L_0x0072
        L_0x002a:
            int r6 = r6 * 10
            int r6 = r6 + 430
            goto L_0x0072
        L_0x002f:
            int r6 = r6 * 10
            int r6 = r6 + 360
            goto L_0x0072
        L_0x0034:
            int r6 = r6 * 10
            int r6 = r6 + 320
            goto L_0x0072
        L_0x0039:
            int r6 = r6 * 10
            int r6 = r6 + 270
            goto L_0x0072
        L_0x003e:
            int r6 = r6 * 10
            int r6 = r6 + 210
            goto L_0x0072
        L_0x0043:
            int r6 = r6 * 10
            int r6 = r6 + 170
            goto L_0x0072
        L_0x0048:
            int r6 = r6 * 10
            int r6 = r6 + 120
            goto L_0x0072
        L_0x004d:
            int r6 = r6 * r0
            int r6 = r6 + 85
            goto L_0x0072
        L_0x0051:
            int r6 = r6 * r0
            int r6 = r6 + 40
            goto L_0x0072
        L_0x0055:
            int r6 = r6 * r1
            int r6 = r6 + 20
            goto L_0x0072
        L_0x0059:
            if (r6 == 0) goto L_0x0071
            r5 = 1
            if (r6 == r5) goto L_0x0071
            if (r6 == r1) goto L_0x006f
            r5 = 3
            if (r6 == r5) goto L_0x006f
            r5 = 4
            if (r6 == r5) goto L_0x006d
            if (r6 == r0) goto L_0x0069
            goto L_0x0006
        L_0x0069:
            r5 = 8
        L_0x006b:
            r6 = r5
            goto L_0x0072
        L_0x006d:
            r5 = 7
            goto L_0x006b
        L_0x006f:
            r5 = 6
            goto L_0x006b
        L_0x0071:
            r6 = r0
        L_0x0072:
            d5.q r5 = d5.o.getSchoolObject()
            java.util.ArrayList r5 = r5.getLawLessons()
            java.lang.Object r5 = r5.get(r0)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r3 = 0
            if (r5 != r1) goto L_0x008e
            double r0 = com.bumptech.glide.c.H(r2, r0)
        L_0x008c:
            double r3 = r3 + r0
            goto L_0x00a7
        L_0x008e:
            d5.q r5 = d5.o.getSchoolObject()
            java.util.ArrayList r5 = r5.getLawLessons()
            java.lang.Object r5 = r5.get(r1)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            if (r5 != r1) goto L_0x00a7
            double r0 = com.bumptech.glide.c.H(r2, r1)
            goto L_0x008c
        L_0x00a7:
            double r5 = (double) r6
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r3 = r3 + r0
            double r3 = r3 * r5
            int r5 = (int) r3
            r6 = 2005(0x7d5, float:2.81E-42)
            boolean r6 = R2.b.i0(r6)
            if (r6 == 0) goto L_0x00b7
            int r5 = r5 * 2
        L_0x00b7:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.a.E(int, int):int");
    }

    public static void E0(String str, int i2, o0 o0Var) {
        com.google.android.gms.internal.measurement.a.d(com.google.android.gms.internal.measurement.a.c(C0592h.b().e(), "players"), "stockObject", str).H(new f(str, i2, o0Var));
    }

    public static int F(int i2) {
        switch (i2) {
            case 0:
                return 12;
            case 1:
                return 13;
            case 2:
                return 14;
            case 3:
                return 15;
            case 4:
                return 16;
            case 5:
                return 19;
            case zzaky.zzf.zzf /*6*/:
                return 20;
            case zzaky.zzf.zzg /*7*/:
                return 22;
            case 8:
                return 23;
            case 9:
                return 17;
            case 10:
                return 28;
            case ModuleDescriptor.MODULE_VERSION /*11*/:
                return 29;
            case 12:
                return 33;
            case 13:
                return 24;
            case 14:
                return 25;
            case 15:
                return 30;
            case 16:
                return 34;
            default:
                return -1;
        }
    }

    public static void F0(Context context, D d, X4.d dVar) {
        int i2;
        if (d.f4294b == 15) {
            if (d.f4313x == 2 && (o.getEstateObject().getFixedModificationList().size() < 3 || !o.getEstateObject().getFixedModificationList().get(2).booleanValue())) {
                com.google.android.gms.internal.measurement.a.n(MyApplication.f7090a, R.string.not_have_air_plane_road, context, (String) null);
                return;
            } else if (o.getArmingObject().getSpecialEquipmentId() != -1 && D.s(o.getArmingObject().getSpecialEquipmentId(), 0, 1).f4315z.contains(0)) {
                if (d.f4315z.contains(0)) {
                    i2 = ((Integer) d.f4289A.get(d.f4315z.indexOf(0))).intValue();
                } else {
                    i2 = 0;
                }
                if (o.getStockObject().getBagFreeSpace() < ((Integer) D.s(o.getArmingObject().getSpecialEquipmentId(), 0, 1).f4289A.get(D.s(o.getArmingObject().getSpecialEquipmentId(), 0, 1).f4315z.indexOf(0))).intValue() - i2) {
                    com.google.android.gms.internal.measurement.a.n(MyApplication.f7090a, R.string.bag_will_effected_with_special_equipment_using, context, (String) null);
                    return;
                }
            }
        }
        b.w(true);
        i0(new C0421a(d, dVar, context, 1));
    }

    public static ArrayList G(int i2) {
        switch (i2) {
            case 0:
                ArrayList arrayList = new ArrayList();
                arrayList.add(new Y4.f(R.string.crime_type_one_number_one, R.drawable.crime_type_one_number_one, E(i2, arrayList.size())));
                arrayList.add(new Y4.f(R.string.crime_type_one_number_two, R.drawable.crime_type_one_number_two, E(i2, arrayList.size())));
                arrayList.add(new Y4.f(R.string.crime_type_one_number_three, R.drawable.crime_type_one_number_three, E(i2, arrayList.size())));
                arrayList.add(new Y4.f(R.string.crime_type_one_number_four, R.drawable.crime_type_one_number_four, E(i2, arrayList.size())));
                arrayList.add(new Y4.f(R.string.crime_type_one_number_five, R.drawable.crime_type_one_number_five, E(i2, arrayList.size())));
                arrayList.add(new Y4.f(R.string.crime_type_one_number_six, R.drawable.crime_type_one_number_six, E(i2, arrayList.size())));
                return arrayList;
            case 1:
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new Y4.f(R.string.crime_type_two_number_one, R.drawable.crime_type_two_number_one, E(i2, arrayList2.size())));
                arrayList2.add(new Y4.f(R.string.crime_type_two_number_two, R.drawable.crime_type_two_number_two, E(i2, arrayList2.size())));
                arrayList2.add(new Y4.f(R.string.crime_type_two_number_three, R.drawable.crime_type_two_number_three, E(i2, arrayList2.size())));
                arrayList2.add(new Y4.f(R.string.crime_type_two_number_four, R.drawable.crime_type_two_number_four, E(i2, arrayList2.size())));
                arrayList2.add(new Y4.f(R.string.crime_type_two_number_five, R.drawable.crime_type_two_number_five, E(i2, arrayList2.size())));
                arrayList2.add(new Y4.f(R.string.crime_type_two_number_six, R.drawable.crime_type_two_number_six, E(i2, arrayList2.size())));
                arrayList2.add(new Y4.f(R.string.crime_type_two_number_seven, R.drawable.crime_type_two_number_seven, E(i2, arrayList2.size())));
                arrayList2.add(new Y4.f(R.string.crime_type_two_number_eight, R.drawable.crime_type_two_number_eight, E(i2, arrayList2.size())));
                arrayList2.add(new Y4.f(R.string.crime_type_two_number_nine, R.drawable.crime_type_two_number_nine, E(i2, arrayList2.size())));
                arrayList2.add(new Y4.f(R.string.crime_type_two_number_ten, R.drawable.crime_type_two_number_ten, E(i2, arrayList2.size())));
                return arrayList2;
            case 2:
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(new Y4.f(R.string.crime_type_three_number_one, R.drawable.crime_type_three_number_one, E(i2, arrayList3.size())));
                arrayList3.add(new Y4.f(R.string.crime_type_three_number_two, R.drawable.crime_type_three_number_two, E(i2, arrayList3.size())));
                arrayList3.add(new Y4.f(R.string.crime_type_three_number_three, R.drawable.crime_type_three_number_three, E(i2, arrayList3.size())));
                arrayList3.add(new Y4.f(R.string.crime_type_three_number_four, R.drawable.crime_type_three_number_four, E(i2, arrayList3.size())));
                arrayList3.add(new Y4.f(R.string.crime_type_three_number_five, R.drawable.crime_type_three_number_five, E(i2, arrayList3.size())));
                arrayList3.add(new Y4.f(R.string.crime_type_three_number_six, R.drawable.crime_type_three_number_six, E(i2, arrayList3.size())));
                arrayList3.add(new Y4.f(R.string.crime_type_three_number_seven, R.drawable.crime_type_three_number_seven, E(i2, arrayList3.size())));
                arrayList3.add(new Y4.f(R.string.crime_type_three_number_eight, R.drawable.crime_type_three_number_eight, E(i2, arrayList3.size())));
                return arrayList3;
            case 3:
                ArrayList arrayList4 = new ArrayList();
                arrayList4.add(new Y4.f(R.string.crime_type_four_number_one, R.drawable.crime_type_four_number_one, E(i2, arrayList4.size())));
                arrayList4.add(new Y4.f(R.string.crime_type_four_number_two, R.drawable.crime_type_four_number_two, E(i2, arrayList4.size())));
                arrayList4.add(new Y4.f(R.string.crime_type_four_number_three, R.drawable.crime_type_four_number_three, E(i2, arrayList4.size())));
                arrayList4.add(new Y4.f(R.string.crime_type_four_number_four, R.drawable.crime_type_four_number_four, E(i2, arrayList4.size())));
                arrayList4.add(new Y4.f(R.string.crime_type_four_number_five, R.drawable.crime_type_four_number_five, E(i2, arrayList4.size())));
                arrayList4.add(new Y4.f(R.string.crime_type_four_number_six, R.drawable.crime_type_four_number_six, E(i2, arrayList4.size())));
                return arrayList4;
            case 4:
                ArrayList arrayList5 = new ArrayList();
                arrayList5.add(new Y4.f(R.string.crime_type_five_number_one, R.drawable.crime_type_five_number_one, E(i2, arrayList5.size())));
                arrayList5.add(new Y4.f(R.string.crime_type_five_number_two, R.drawable.crime_type_five_number_two, E(i2, arrayList5.size())));
                arrayList5.add(new Y4.f(R.string.crime_type_five_number_three, R.drawable.crime_type_five_number_three, E(i2, arrayList5.size())));
                arrayList5.add(new Y4.f(R.string.crime_type_five_number_four, R.drawable.crime_type_five_number_four, E(i2, arrayList5.size())));
                arrayList5.add(new Y4.f(R.string.crime_type_five_number_five, R.drawable.crime_type_five_number_five, E(i2, arrayList5.size())));
                return arrayList5;
            case 5:
                ArrayList arrayList6 = new ArrayList();
                arrayList6.add(new Y4.f(R.string.crime_type_six_number_one, R.drawable.crime_type_six_number_one, E(i2, arrayList6.size())));
                arrayList6.add(new Y4.f(R.string.crime_type_six_number_two, R.drawable.crime_type_six_number_two, E(i2, arrayList6.size())));
                arrayList6.add(new Y4.f(R.string.crime_type_six_number_three, R.drawable.crime_type_six_number_three, E(i2, arrayList6.size())));
                arrayList6.add(new Y4.f(R.string.crime_type_six_number_four, R.drawable.crime_type_six_number_four, E(i2, arrayList6.size())));
                return arrayList6;
            case zzaky.zzf.zzf /*6*/:
                ArrayList arrayList7 = new ArrayList();
                arrayList7.add(new Y4.f(R.string.crime_type_seven_number_one, R.drawable.crime_type_seven_number_one, E(i2, arrayList7.size())));
                arrayList7.add(new Y4.f(R.string.crime_type_seven_number_two, R.drawable.crime_type_seven_number_two, E(i2, arrayList7.size())));
                arrayList7.add(new Y4.f(R.string.crime_type_seven_number_three, R.drawable.crime_type_seven_number_three, E(i2, arrayList7.size())));
                arrayList7.add(new Y4.f(R.string.crime_type_seven_number_four, R.drawable.crime_type_seven_number_four, E(i2, arrayList7.size())));
                arrayList7.add(new Y4.f(R.string.crime_type_seven_number_five, R.drawable.crime_type_seven_number_five, E(i2, arrayList7.size())));
                arrayList7.add(new Y4.f(R.string.crime_type_seven_number_six, R.drawable.crime_type_seven_number_six, E(i2, arrayList7.size())));
                return arrayList7;
            case zzaky.zzf.zzg /*7*/:
                ArrayList arrayList8 = new ArrayList();
                arrayList8.add(new Y4.f(R.string.crime_type_eight_number_one, R.drawable.crime_type_eight_number_one, E(i2, arrayList8.size())));
                arrayList8.add(new Y4.f(R.string.crime_type_eight_number_two, R.drawable.crime_type_eight_number_two, E(i2, arrayList8.size())));
                arrayList8.add(new Y4.f(R.string.crime_type_eight_number_three, R.drawable.crime_type_eight_number_three, E(i2, arrayList8.size())));
                arrayList8.add(new Y4.f(R.string.crime_type_eight_number_four, R.drawable.crime_type_eight_number_four, E(i2, arrayList8.size())));
                arrayList8.add(new Y4.f(R.string.crime_type_eight_number_five, R.drawable.crime_type_eight_number_five, E(i2, arrayList8.size())));
                return arrayList8;
            case 8:
                ArrayList arrayList9 = new ArrayList();
                arrayList9.add(new Y4.f(R.string.crime_type_nine_number_one, R.drawable.crime_type_nine_number_one, E(i2, arrayList9.size())));
                arrayList9.add(new Y4.f(R.string.crime_type_nine_number_two, R.drawable.crime_type_nine_number_two, E(i2, arrayList9.size())));
                arrayList9.add(new Y4.f(R.string.crime_type_nine_number_three, R.drawable.crime_type_nine_number_three, E(i2, arrayList9.size())));
                arrayList9.add(new Y4.f(R.string.crime_type_nine_number_four, R.drawable.crime_type_nine_number_four, E(i2, arrayList9.size())));
                return arrayList9;
            case 9:
                ArrayList arrayList10 = new ArrayList();
                arrayList10.add(new Y4.f(R.string.crime_type_ten_number_one, R.drawable.crime_type_ten_number_one, E(i2, arrayList10.size())));
                arrayList10.add(new Y4.f(R.string.crime_type_ten_number_two, R.drawable.crime_type_ten_number_two, E(i2, arrayList10.size())));
                arrayList10.add(new Y4.f(R.string.crime_type_ten_number_three, R.drawable.crime_type_ten_number_three, E(i2, arrayList10.size())));
                arrayList10.add(new Y4.f(R.string.crime_type_ten_number_four, R.drawable.crime_type_ten_number_four, E(i2, arrayList10.size())));
                arrayList10.add(new Y4.f(R.string.crime_type_ten_number_five, R.drawable.crime_type_ten_number_five, E(i2, arrayList10.size())));
                arrayList10.add(new Y4.f(R.string.crime_type_ten_number_six, R.drawable.crime_type_ten_number_six, E(i2, arrayList10.size())));
                arrayList10.add(new Y4.f(R.string.crime_type_ten_number_seven, R.drawable.crime_type_ten_number_seven, E(i2, arrayList10.size())));
                return arrayList10;
            case 10:
                ArrayList arrayList11 = new ArrayList();
                arrayList11.add(new Y4.f(R.string.crime_type_eleven_number_one, R.drawable.crime_type_eleven_number_one, E(i2, arrayList11.size())));
                arrayList11.add(new Y4.f(R.string.crime_type_eleven_number_two, R.drawable.crime_type_eleven_number_one, E(i2, arrayList11.size())));
                arrayList11.add(new Y4.f(R.string.crime_type_eleven_number_three, R.drawable.crime_type_eleven_number_one, E(i2, arrayList11.size())));
                return arrayList11;
            case ModuleDescriptor.MODULE_VERSION /*11*/:
                ArrayList arrayList12 = new ArrayList();
                arrayList12.add(new Y4.f(R.string.crime_type_twelve_number_one, R.drawable.crime_type_twelve_number_one, E(i2, arrayList12.size())));
                arrayList12.add(new Y4.f(R.string.crime_type_twelve_number_two, R.drawable.crime_type_twelve_number_one, E(i2, arrayList12.size())));
                return arrayList12;
            case 12:
                ArrayList arrayList13 = new ArrayList();
                arrayList13.add(new Y4.f(R.string.crime_type_thirteen_number_one, R.drawable.crime_type_thirteen_number_one, E(i2, arrayList13.size())));
                arrayList13.add(new Y4.f(R.string.crime_type_thirteen_number_two, R.drawable.crime_type_thirteen_number_two, E(i2, arrayList13.size())));
                arrayList13.add(new Y4.f(R.string.crime_type_thirteen_number_three, R.drawable.crime_type_thirteen_number_three, E(i2, arrayList13.size())));
                arrayList13.add(new Y4.f(R.string.crime_type_thirteen_number_four, R.drawable.crime_type_thirteen_number_four, E(i2, arrayList13.size())));
                arrayList13.add(new Y4.f(R.string.crime_type_thirteen_number_five, R.drawable.crime_type_thirteen_number_five, E(i2, arrayList13.size())));
                arrayList13.add(new Y4.f(R.string.crime_type_thirteen_number_six, R.drawable.crime_type_thirteen_number_six, E(i2, arrayList13.size())));
                return arrayList13;
            case 13:
                ArrayList arrayList14 = new ArrayList();
                arrayList14.add(new Y4.f(R.string.crime_type_fourteen_number_one, R.drawable.crime_type_fourteen_number_one, E(i2, arrayList14.size())));
                arrayList14.add(new Y4.f(R.string.crime_type_fourteen_number_two, R.drawable.crime_type_fourteen_number_two, E(i2, arrayList14.size())));
                arrayList14.add(new Y4.f(R.string.crime_type_fourteen_number_three, R.drawable.crime_type_fourteen_number_three, E(i2, arrayList14.size())));
                arrayList14.add(new Y4.f(R.string.crime_type_fourteen_number_four, R.drawable.crime_type_fourteen_number_four, E(i2, arrayList14.size())));
                return arrayList14;
            case 14:
                ArrayList arrayList15 = new ArrayList();
                arrayList15.add(new Y4.f(R.string.crime_type_fifteen_number_one, R.drawable.crime_type_fifteen_number_one, E(i2, arrayList15.size())));
                arrayList15.add(new Y4.f(R.string.crime_type_fifteen_number_two, R.drawable.crime_type_fifteen_number_two, E(i2, arrayList15.size())));
                return arrayList15;
            case 15:
                ArrayList arrayList16 = new ArrayList();
                arrayList16.add(new Y4.f(R.string.crime_type_sixteen_number_one, R.drawable.crime_type_sixteen_number_one, E(i2, arrayList16.size())));
                arrayList16.add(new Y4.f(R.string.crime_type_sixteen_number_two, R.drawable.crime_type_sixteen_number_two, E(i2, arrayList16.size())));
                return arrayList16;
            case 16:
                ArrayList arrayList17 = new ArrayList();
                arrayList17.add(new Y4.f(R.string.crime_type_seventeen_number_one, R.drawable.crime_type_seventeen_number_one, E(i2, arrayList17.size())));
                arrayList17.add(new Y4.f(R.string.crime_type_seventeen_number_two, R.drawable.crime_type_seventeen_number_two, E(i2, arrayList17.size())));
                return arrayList17;
            default:
                return null;
        }
    }

    public static void G0(Context context, String str, boolean z3) {
        if (o.getLocationObject().getCurrentPlace() == 1 || o.getMainStatesObject().getHealthCurrent() < com.bumptech.glide.d.o0()) {
            b.w(true);
            HashMap hashMap = new HashMap();
            hashMap.put("serverNumber", Integer.valueOf(o.getAccountObject().getCurrentOpenedServer()));
            hashMap.put("playerId", o.getAccountObject().getId());
            hashMap.put("totalHealth", Long.valueOf(com.bumptech.glide.d.o0()));
            hashMap.put("isBuyingFromShopMarket", Boolean.valueOf(z3));
            if (z3) {
                hashMap.put("moneyNode", str);
            }
            h.b().a("useHealthTank").q(hashMap).addOnCompleteListener(new E(context, str, z3));
            return;
        }
        com.google.android.gms.internal.measurement.a.n(MyApplication.f7090a, R.string.toast_not_in_hospital, context, (String) null);
    }

    public static int H(int i2) {
        if (i2 == 0) {
            return R.drawable.lamp_red;
        }
        if (i2 == 1) {
            return R.drawable.lamp_yellow;
        }
        if (i2 != 2) {
            return -1;
        }
        return R.drawable.lamp_green;
    }

    public static void H0(Context context, int i2) {
        if (o.getLocationObject().getCurrentPlace() != 1) {
            com.google.android.gms.internal.measurement.a.n(MyApplication.f7090a, R.string.toast_not_in_hospital, context, (String) null);
            return;
        }
        b.w(true);
        HashMap hashMap = new HashMap();
        hashMap.put("serverNumber", Integer.valueOf(o.getAccountObject().getCurrentOpenedServer()));
        hashMap.put("playerId", o.getAccountObject().getId());
        hashMap.put("materialId", Integer.valueOf(i2));
        hashMap.put("countNode", z());
        h.b().a("updateHospitalTime").q(hashMap).addOnCompleteListener(new P4.a(context, 5));
    }

    public static void I(B2.b bVar) {
        if (bVar.isDone()) {
            boolean z3 = false;
            while (true) {
                try {
                    bVar.get();
                    break;
                } catch (InterruptedException unused) {
                    z3 = true;
                } catch (Throwable th) {
                    if (z3) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z3) {
                Thread.currentThread().interrupt();
                return;
            }
            return;
        }
        throw new IllegalStateException(x3.a.a("Future was expected to be done: %s", bVar));
    }

    public static void I0(Parcel parcel, int i2, Boolean bool) {
        if (bool != null) {
            Y0(parcel, i2, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public static Set J() {
        try {
            Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", (Class[]) null).invoke((Object) null, (Object[]) null);
            if (invoke == null) {
                return Collections.emptySet();
            }
            Set<Object> set = (Set) invoke;
            for (Object obj : set) {
                if (!(obj instanceof int[])) {
                    return Collections.emptySet();
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.emptySet();
        }
    }

    public static void J0(Parcel parcel, int i2, Bundle bundle, boolean z3) {
        if (bundle != null) {
            int W02 = W0(i2, parcel);
            parcel.writeBundle(bundle);
            X0(W02, parcel);
        } else if (z3) {
            Y0(parcel, i2, 0);
        }
    }

    public static ArrayList K() {
        ArrayList arrayList = new ArrayList();
        d.h(R.string.type_all, arrayList, R.string.type_upgraded_weapons, R.string.type_guns, R.string.type_armors);
        d.h(R.string.type_special_equipments, arrayList, R.string.type_biochemical, R.string.type_pharmacy, R.string.type_herbs);
        d.h(R.string.type_cards, arrayList, R.string.type_specialties, R.string.type_grocery, R.string.type_work);
        d.h(R.string.type_flower, arrayList, R.string.type_food, R.string.type_plate, R.string.type_tunnel);
        d.h(R.string.type_upgrade, arrayList, R.string.type_shop, R.string.type_pieces, R.string.type_crime_rewards);
        return arrayList;
    }

    public static void K0(Parcel parcel, int i2, byte[] bArr, boolean z3) {
        if (bArr != null) {
            int W02 = W0(i2, parcel);
            parcel.writeByteArray(bArr);
            X0(W02, parcel);
        } else if (z3) {
            Y0(parcel, i2, 0);
        }
    }

    public static String L(int i2) {
        switch (i2) {
            case 0:
                return "daily";
            case 1:
                return "weekly";
            case 2:
                return "individual";
            case 3:
                return "gangs";
            case 4:
                return "social";
            case 5:
                return "hideouts";
            case zzaky.zzf.zzf /*6*/:
                return "skirmish";
            default:
                return "";
        }
    }

    public static void L0(Parcel parcel, int i2, Double d) {
        if (d != null) {
            Y0(parcel, i2, 8);
            parcel.writeDouble(d.doubleValue());
        }
    }

    public static String M(int i2, int i5) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    switch (i5) {
                        case 0:
                            return "autako";
                        case 1:
                            return "levels";
                        case 2:
                            return "medals";
                        case 3:
                            return "estate";
                        case 4:
                            return "fightWinner";
                        case 5:
                            return "crimes";
                        case zzaky.zzf.zzf /*6*/:
                            return "patient";
                        case zzaky.zzf.zzg /*7*/:
                            return "prisoner";
                        case 8:
                            return "flight";
                        case 9:
                            return "student";
                        default:
                            return "";
                    }
                } else if (i2 != 3) {
                    if (i2 != 4) {
                        return "";
                    }
                    if (i5 == 0) {
                        return "stolen";
                    }
                    if (i5 == 1) {
                        return "jailBreaker";
                    }
                    if (i5 != 2) {
                        return "";
                    }
                    return "BailoutPayer";
                } else if (i5 == 0) {
                    return "respect";
                } else {
                    if (i5 == 1) {
                        return "gold";
                    }
                    if (i5 == 2) {
                        return "cash";
                    }
                    if (i5 != 3) {
                        return "";
                    }
                    return "citiesConquered";
                }
            } else if (i5 == 0) {
                return "levels";
            } else {
                if (i5 != 1) {
                    return "";
                }
                return "medals";
            }
        } else if (i5 == 0) {
            return "crimes";
        } else {
            if (i5 == 1) {
                return "levels";
            }
            if (i5 == 2) {
                return "fighting";
            }
            if (i5 != 3) {
                return "";
            }
            return "chatting";
        }
    }

    public static void M0(Parcel parcel, int i2, IBinder iBinder) {
        if (iBinder != null) {
            int W02 = W0(i2, parcel);
            parcel.writeStrongBinder(iBinder);
            X0(W02, parcel);
        }
    }

    public static void N(String str, p0 p0Var) {
        ArrayList arrayList = new ArrayList();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        d.c(C0592h.b().e(), "players", str, "skillsObject").d(new B4.c(taskCompletionSource, 8));
        arrayList.add(taskCompletionSource.getTask());
        TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
        d.c(C0592h.b().e(), "players", str, "armingObject").d(new E4.a(taskCompletionSource2, 8));
        arrayList.add(taskCompletionSource2.getTask());
        TaskCompletionSource taskCompletionSource3 = new TaskCompletionSource();
        d.d(C0592h.b().e(), "players", str, "stockObject", "itemsInStock").d(new B4.c(taskCompletionSource3, 9));
        arrayList.add(taskCompletionSource3.getTask());
        Tasks.whenAllComplete((Collection<? extends Task<?>>) arrayList).addOnCompleteListener(new m0(str, p0Var));
    }

    public static void N0(Parcel parcel, int i2, int[] iArr, boolean z3) {
        if (iArr != null) {
            int W02 = W0(i2, parcel);
            parcel.writeIntArray(iArr);
            X0(W02, parcel);
        } else if (z3) {
            Y0(parcel, i2, 0);
        }
    }

    public static void O(p0 p0Var) {
        P(o.getAccountObject().getId(), p0Var);
    }

    public static void O0(Parcel parcel, int i2, Integer num) {
        if (num != null) {
            Y0(parcel, i2, 4);
            parcel.writeInt(num.intValue());
        }
    }

    public static void P(String str, p0 p0Var) {
        d.d(C0592h.b().e(), "players", str, "stockObject", "stockSpace").d(new X4.d(str, p0Var, 13, false));
    }

    public static void P0(Parcel parcel, int i2, Long l6) {
        if (l6 != null) {
            Y0(parcel, i2, 8);
            parcel.writeLong(l6.longValue());
        }
    }

    public static void Q0(Parcel parcel, int i2, Parcelable parcelable, int i5, boolean z3) {
        if (parcelable != null) {
            int W02 = W0(i2, parcel);
            parcelable.writeToParcel(parcel, i5);
            X0(W02, parcel);
        } else if (z3) {
            Y0(parcel, i2, 0);
        }
    }

    public static int R(int i2) {
        if (i2 == 1) {
            return 1;
        }
        if (i2 == 3) {
            return 8;
        }
        if (i2 == 4) {
            return 10;
        }
        if (i2 == 5) {
            return 15;
        }
        if (i2 == 6) {
            return 20;
        }
        if (i2 != 7) {
            return 5;
        }
        return 25;
    }

    public static void R0(Parcel parcel, int i2, String str, boolean z3) {
        if (str != null) {
            int W02 = W0(i2, parcel);
            parcel.writeString(str);
            X0(W02, parcel);
        } else if (z3) {
            Y0(parcel, i2, 0);
        }
    }

    public static int S(int i2) {
        if (i2 == 1) {
            return 10;
        }
        if (i2 == 3) {
            return 30;
        }
        if (i2 == 4) {
            return 40;
        }
        if (i2 == 5) {
            return 50;
        }
        if (i2 == 6) {
            return 60;
        }
        if (i2 != 7) {
            return 20;
        }
        return 80;
    }

    public static void S0(Parcel parcel, int i2, String[] strArr, boolean z3) {
        if (strArr != null) {
            int W02 = W0(i2, parcel);
            parcel.writeStringArray(strArr);
            X0(W02, parcel);
        } else if (z3) {
            Y0(parcel, i2, 0);
        }
    }

    public static int T(int i2) {
        if (i2 == 3 || i2 == 4) {
            return 1;
        }
        if (i2 == 5 || i2 == 6) {
            return 2;
        }
        if (i2 != 7) {
            return 0;
        }
        return 3;
    }

    public static void T0(Parcel parcel, int i2, List list) {
        if (list != null) {
            int W02 = W0(i2, parcel);
            parcel.writeStringList(list);
            X0(W02, parcel);
        }
    }

    public static int U() {
        return (o.getMainStatesObject().getLevel() / 2) * 10;
    }

    public static void U0(Parcel parcel, int i2, Parcelable[] parcelableArr, int i5) {
        if (parcelableArr != null) {
            int W02 = W0(i2, parcel);
            parcel.writeInt(r0);
            for (Parcelable parcelable : parcelableArr) {
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    int dataPosition = parcel.dataPosition();
                    parcel.writeInt(1);
                    int dataPosition2 = parcel.dataPosition();
                    parcelable.writeToParcel(parcel, i5);
                    int dataPosition3 = parcel.dataPosition();
                    parcel.setDataPosition(dataPosition);
                    parcel.writeInt(dataPosition3 - dataPosition2);
                    parcel.setDataPosition(dataPosition3);
                }
            }
            X0(W02, parcel);
        }
    }

    public static int V(int i2) {
        return S(i2) / 10;
    }

    public static void V0(Parcel parcel, int i2, List list, boolean z3) {
        if (list != null) {
            int W02 = W0(i2, parcel);
            int size = list.size();
            parcel.writeInt(size);
            for (int i5 = 0; i5 < size; i5++) {
                Parcelable parcelable = (Parcelable) list.get(i5);
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    int dataPosition = parcel.dataPosition();
                    parcel.writeInt(1);
                    int dataPosition2 = parcel.dataPosition();
                    parcelable.writeToParcel(parcel, 0);
                    int dataPosition3 = parcel.dataPosition();
                    parcel.setDataPosition(dataPosition);
                    parcel.writeInt(dataPosition3 - dataPosition2);
                    parcel.setDataPosition(dataPosition3);
                }
            }
            X0(W02, parcel);
        } else if (z3) {
            Y0(parcel, i2, 0);
        }
    }

    public static int W(int i2) {
        switch (i2) {
            case 2:
                return 10;
            case 3:
                return 20;
            case 4:
                return 40;
            case 5:
                return 80;
            case zzaky.zzf.zzf /*6*/:
                return 100;
            case zzaky.zzf.zzg /*7*/:
                return 150;
            default:
                return 5;
        }
    }

    public static int W0(int i2, Parcel parcel) {
        parcel.writeInt(i2 | -65536);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static int X(int i2) {
        switch (i2) {
            case 0:
                return R.drawable.museum_background_wood;
            case 1:
                return R.drawable.museum_background_pink;
            case 2:
                return R.drawable.museum_background_classic;
            case 3:
                return R.drawable.museum_background_laser;
            case 4:
                return R.drawable.museum_background_shell;
            case 5:
                return R.drawable.museum_background_forest;
            case zzaky.zzf.zzf /*6*/:
                return R.drawable.museum_background_universe;
            default:
                return -1;
        }
    }

    public static void X0(int i2, Parcel parcel) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i2 - 4);
        parcel.writeInt(dataPosition - i2);
        parcel.setDataPosition(dataPosition);
    }

    public static long Y(int i2) {
        switch (i2) {
            case 1:
                return 500;
            case 2:
            case 3:
                return 1000;
            case 4:
            case 5:
                return 1500;
            case zzaky.zzf.zzf /*6*/:
            case zzaky.zzf.zzg /*7*/:
                return 2000;
            case 8:
            case 9:
                return 2500;
            case 10:
            case ModuleDescriptor.MODULE_VERSION /*11*/:
                return 3000;
            case 12:
            case 13:
                return 3500;
            case 14:
                return 4000;
            case 15:
                return 4500;
            case 16:
                return 5000;
            default:
                return 0;
        }
    }

    public static void Y0(Parcel parcel, int i2, int i5) {
        parcel.writeInt(i2 | (i5 << 16));
    }

    public static double Z(int i2, int i5) {
        int i6;
        if (i2 != 3) {
            if (i2 == 13) {
                i6 = (i5 * 5) + 40;
            } else if (i2 == 15) {
                i6 = (i5 * 5) + 80;
            } else if (i2 == 5) {
                i6 = (i5 * 5) + 30;
            } else if (i2 != 6) {
                switch (i2) {
                    case 8:
                        i6 = (i5 * 5) + 50;
                        break;
                    case 9:
                    case 10:
                        i6 = (i5 * 5) + 60;
                        break;
                    default:
                        return 0.0d;
                }
            } else {
                i6 = (i5 * 5) + 20;
            }
        } else if (i5 <= 0) {
            return 0.0d;
        } else {
            i6 = (i5 * 5) + 10;
        }
        return (double) i6;
    }

    public static s a(Object obj, s sVar) {
        HashMap hashMap;
        k3.c cVar;
        try {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (map.containsKey(".priority")) {
                    sVar = C1129e.e((C0866g) null, map.get(".priority"));
                }
                if (map.containsKey(".value")) {
                    obj = map.get(".value");
                }
            }
            if (obj == null) {
                return k.f12295e;
            }
            if (obj instanceof String) {
                return new w((String) obj, sVar);
            }
            if (obj instanceof Long) {
                return new p((Long) obj, sVar);
            }
            if (obj instanceof Integer) {
                return new p(Long.valueOf((long) ((Integer) obj).intValue()), sVar);
            }
            if (obj instanceof Double) {
                return new j((Double) obj, sVar);
            }
            if (obj instanceof Boolean) {
                return new C1046a((Boolean) obj, sVar);
            }
            if (!(obj instanceof Map)) {
                if (!(obj instanceof List)) {
                    throw new RuntimeException("Failed to parse node with class " + obj.getClass().toString());
                }
            }
            if (obj instanceof Map) {
                Map map2 = (Map) obj;
                if (map2.containsKey(".sv")) {
                    return new i(map2, sVar);
                }
                hashMap = new HashMap(map2.size());
                for (String str : map2.keySet()) {
                    if (!str.startsWith(".")) {
                        s a6 = a(map2.get(str), k.f12295e);
                        if (!a6.isEmpty()) {
                            hashMap.put(C1048c.e(str), a6);
                        }
                    }
                }
            } else {
                List list = (List) obj;
                hashMap = new HashMap(list.size());
                for (int i2 = 0; i2 < list.size(); i2++) {
                    String str2 = "" + i2;
                    s a7 = a(list.get(i2), k.f12295e);
                    if (!a7.isEmpty()) {
                        hashMap.put(C1048c.e(str2), a7);
                    }
                }
            }
            if (hashMap.isEmpty()) {
                return k.f12295e;
            }
            H4.i iVar = C1051f.d;
            if (hashMap.size() < 25) {
                cVar = C0762b.C(new ArrayList(hashMap.keySet()), hashMap, iVar);
            } else {
                cVar = z.k(new ArrayList(hashMap.keySet()), hashMap, iVar);
            }
            return new C1051f(cVar, sVar);
        } catch (ClassCastException e6) {
            throw new RuntimeException("Failed to parse node", e6);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
        r2 = (r2 * 5) + 30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        return (double) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000b, code lost:
        r2 = (r2 * 5) + 80;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static double a0(int r1, int r2) {
        /*
            r0 = 2
            switch(r1) {
                case 2: goto L_0x003a;
                case 3: goto L_0x0032;
                case 4: goto L_0x0025;
                case 5: goto L_0x002d;
                case 6: goto L_0x002a;
                case 7: goto L_0x0025;
                case 8: goto L_0x0022;
                case 9: goto L_0x0015;
                case 10: goto L_0x0015;
                case 11: goto L_0x001a;
                case 12: goto L_0x0015;
                case 13: goto L_0x0004;
                case 14: goto L_0x0010;
                case 15: goto L_0x000b;
                case 16: goto L_0x0005;
                default: goto L_0x0004;
            }
        L_0x0004:
            goto L_0x0041
        L_0x0005:
            int r2 = r2 * 5
            int r2 = r2 + 90
        L_0x0009:
            double r1 = (double) r2
            return r1
        L_0x000b:
            int r2 = r2 * 5
            int r2 = r2 + 80
            goto L_0x0009
        L_0x0010:
            int r2 = r2 * 5
            int r2 = r2 + 70
            goto L_0x0009
        L_0x0015:
            int r2 = r2 * 5
            int r2 = r2 + 60
            goto L_0x0009
        L_0x001a:
            if (r2 != 0) goto L_0x0041
            r1 = 4634978072750194688(0x4052c00000000000, double:75.0)
            return r1
        L_0x0022:
            if (r2 <= 0) goto L_0x0041
            goto L_0x000b
        L_0x0025:
            int r2 = r2 * 5
            int r2 = r2 + 30
            goto L_0x0009
        L_0x002a:
            if (r2 <= r0) goto L_0x0041
            goto L_0x0025
        L_0x002d:
            int r2 = r2 * 5
            int r2 = r2 + 50
            goto L_0x0009
        L_0x0032:
            r1 = 3
            if (r2 <= r1) goto L_0x0041
            int r2 = r2 * 5
            int r2 = r2 + 20
            goto L_0x0009
        L_0x003a:
            if (r2 <= r0) goto L_0x0041
            int r2 = r2 * 5
            int r2 = r2 + 5
            goto L_0x0009
        L_0x0041:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.a.a0(int, int):double");
    }

    public static void b(String str, long j6, String str2, H h) {
        HashMap hashMap = new HashMap();
        hashMap.put("serverNumber", Integer.valueOf(o.getAccountObject().getCurrentOpenedServer()));
        hashMap.put("playerId", str);
        hashMap.put("secondsMustSpentInPlace", Long.valueOf(j6));
        hashMap.put("reason", str2);
        h.b().a("addPlayerToHospital").q(hashMap).addOnCompleteListener(new F(h, str, 0));
    }

    public static String b0(int i2, long j6) {
        if (i2 == 0) {
            Date date = new Date(j6 * 1000);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            return simpleDateFormat.format(date);
        } else if (i2 != 1) {
            return "";
        } else {
            Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
            instance.setTimeInMillis(j6 * 1000);
            instance.set(5, instance.get(5) - (instance.get(7) % 7));
            Calendar calendar = (Calendar) instance.clone();
            Calendar instance2 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
            instance2.set(1, calendar.get(1));
            instance2.set(2, 0);
            instance2.set(5, 1);
            instance2.set(11, 0);
            instance2.set(12, 0);
            instance2.set(13, 0);
            instance2.set(14, 0);
            instance2.add(5, (14 - instance2.get(7)) % 7);
            int i5 = calendar.get(1);
            return i5 + "-" + (((int) ((calendar.getTimeInMillis() - instance2.getTimeInMillis()) / 604800000)) + 1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        r0 = r3.getClass().getName();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void c(java.lang.StringBuilder r2, java.lang.Object r3) {
        /*
            if (r3 != 0) goto L_0x0008
            java.lang.String r3 = "null"
            r2.append(r3)
            goto L_0x003f
        L_0x0008:
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getSimpleName()
            int r1 = r0.length()
            if (r1 > 0) goto L_0x002c
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getName()
            r1 = 46
            int r1 = r0.lastIndexOf(r1)
            if (r1 <= 0) goto L_0x002c
            int r1 = r1 + 1
            java.lang.String r0 = r0.substring(r1)
        L_0x002c:
            r2.append(r0)
            r0 = 123(0x7b, float:1.72E-43)
            r2.append(r0)
            int r3 = java.lang.System.identityHashCode(r3)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
        L_0x003f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.a.c(java.lang.StringBuilder, java.lang.Object):void");
    }

    public static long c0(String str) {
        if (str != null) {
            return Long.parseLong(str.substring(0, str.indexOf(".")));
        }
        return 0;
    }

    public static long d0(int i2, int i5) {
        double d;
        double H6;
        long j6 = ((long) (((i2 - 2) * 5) + i5)) * 60;
        if (o.getSchoolObject().getLawLessons().get(6).intValue() == 2) {
            d = (double) j6;
            H6 = c.H(0, 6);
        } else if (o.getSchoolObject().getLawLessons().get(3).intValue() != 2) {
            return j6;
        } else {
            d = (double) j6;
            H6 = c.H(0, 3);
        }
        return (long) ((1.0d - H6) * d);
    }

    public static String f0(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return "TRuntime.".concat(str);
        }
        String concat = "TRuntime.".concat(str);
        if (concat.length() > 23) {
            return concat.substring(0, 23);
        }
        return concat;
    }

    public static byte[] g(ArrayDeque arrayDeque, int i2) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i2) {
            return bArr;
        }
        int length = i2 - bArr.length;
        byte[] copyOf = Arrays.copyOf(bArr, i2);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int min = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i2 - length, min);
            length -= min;
        }
        return copyOf;
    }

    public static int[] g0(Map map) {
        int i2;
        int intValue;
        int i5 = 0;
        if (map != null) {
            i2 = 0;
            for (Map.Entry entry : map.entrySet()) {
                if (entry.getValue() instanceof Map) {
                    for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                        if (entry2.getValue() instanceof Map) {
                            Map map2 = (Map) entry2.getValue();
                            if (map2.containsKey("count") && (intValue = ((Number) map2.get("count")).intValue()) > 0) {
                                if (map2.containsKey("usedInArming") && ((Boolean) map2.get("usedInArming")).booleanValue()) {
                                    intValue--;
                                }
                                i5 += intValue;
                            }
                            if (map2.containsKey("countInBag")) {
                                i2 = ((Number) map2.get("countInBag")).intValue() + i2;
                            }
                        }
                    }
                }
            }
        } else {
            i2 = 0;
        }
        return new int[]{i5, i2};
    }

    public static byte[] h(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = bArr;
        byte[] bArr4 = bArr2;
        if (bArr3.length == 32) {
            byte b6 = 0;
            long l02 = l0(bArr3, 0) & 67108863;
            long l03 = (l0(bArr3, 3) >> 2) & 67108611;
            long l04 = (l0(bArr3, 6) >> 4) & 67092735;
            long l05 = (l0(bArr3, 9) >> 6) & 66076671;
            long l06 = (l0(bArr3, 12) >> 8) & 1048575;
            long j6 = l03 * 5;
            long j7 = l04 * 5;
            long j8 = l05 * 5;
            long j9 = l06 * 5;
            int i2 = 17;
            byte[] bArr5 = new byte[17];
            long j10 = 0;
            int i5 = 0;
            long j11 = 0;
            long j12 = 0;
            long j13 = 0;
            long j14 = 0;
            while (i5 < bArr4.length) {
                int min = Math.min(16, bArr4.length - i5);
                System.arraycopy(bArr4, i5, bArr5, b6, min);
                bArr5[min] = 1;
                if (min != 16) {
                    Arrays.fill(bArr5, min + 1, i2, b6);
                }
                long l07 = j14 + (l0(bArr5, b6) & 67108863);
                long l08 = j10 + ((l0(bArr5, 3) >> 2) & 67108863);
                long l09 = j11 + ((l0(bArr5, 6) >> 4) & 67108863);
                long l010 = j12 + ((l0(bArr5, 9) >> 6) & 67108863);
                long l011 = j13 + (((l0(bArr5, 12) >> 8) & 67108863) | ((long) (bArr5[16] << 24)));
                long j15 = (l011 * j6) + (l010 * j7) + (l09 * j8) + (l08 * j9) + (l07 * l02);
                long j16 = (l011 * j7) + (l010 * j8) + (l09 * j9) + (l08 * l02) + (l07 * l03);
                long j17 = (l011 * j8) + (l010 * j9) + (l09 * l02) + (l08 * l03) + (l07 * l04);
                long j18 = (l010 * l02) + (l09 * l03) + (l08 * l04) + (l07 * l05);
                long j19 = l010 * l03;
                long j20 = l011 * l02;
                long j21 = j16 + (j15 >> 26);
                long j22 = j17 + (j21 >> 26);
                long j23 = (l011 * j9) + j18 + (j22 >> 26);
                long j24 = j20 + j19 + (l09 * l04) + (l08 * l05) + (l07 * l06) + (j23 >> 26);
                long j25 = j24 >> 26;
                j13 = j24 & 67108863;
                long j26 = (j25 * 5) + (j15 & 67108863);
                long j27 = j26 & 67108863;
                j10 = (j21 & 67108863) + (j26 >> 26);
                i5 += 16;
                j11 = j22 & 67108863;
                j12 = j23 & 67108863;
                b6 = 0;
                i2 = 17;
                j14 = j27;
            }
            long j28 = j11 + (j10 >> 26);
            long j29 = j28 & 67108863;
            long j30 = j12 + (j28 >> 26);
            long j31 = j30 & 67108863;
            long j32 = j13 + (j30 >> 26);
            long j33 = j32 & 67108863;
            long j34 = ((j32 >> 26) * 5) + j14;
            long j35 = j34 >> 26;
            long j36 = j34 & 67108863;
            long j37 = (j10 & 67108863) + j35;
            long j38 = j36 + 5;
            long j39 = j38 & 67108863;
            long j40 = j37 + (j38 >> 26);
            long j41 = j29 + (j40 >> 26);
            long j42 = j31 + (j41 >> 26);
            long j43 = (j33 + (j42 >> 26)) - 67108864;
            long j44 = j43 >> 63;
            long j45 = ~j44;
            long j46 = (j37 & j44) | (j40 & 67108863 & j45);
            long j47 = (j29 & j44) | (j41 & 67108863 & j45);
            long j48 = (j31 & j44) | (j42 & 67108863 & j45);
            long l012 = l0(bArr3, 16) + (((j36 & j44) | (j39 & j45) | (j46 << 26)) & 4294967295L);
            long j49 = l012 & 4294967295L;
            long l013 = l0(bArr3, 20) + (((j46 >> 6) | (j47 << 20)) & 4294967295L) + (l012 >> 32);
            long j50 = l013 & 4294967295L;
            long l014 = l0(bArr3, 24) + (((j47 >> 12) | (j48 << 14)) & 4294967295L) + (l013 >> 32);
            long l015 = l0(bArr3, 28);
            byte[] bArr6 = new byte[16];
            w0(bArr6, j49, 0);
            w0(bArr6, j50, 4);
            w0(bArr6, l014 & 4294967295L, 8);
            w0(bArr6, (l015 + (((((j43 & j45) | (j33 & j44)) << 8) | (j48 >> 18)) & 4294967295L) + (l014 >> 32)) & 4294967295L, 12);
            return bArr6;
        }
        throw new IllegalArgumentException("The key length in bytes must be 32.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x009f A[Catch:{ all -> 0x00ac }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ae A[Catch:{ all -> 0x00ac }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00da A[SYNTHETIC, Splitter:B:41:0x00da] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00df A[Catch:{ Exception -> 0x0063 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00e5 A[Catch:{ Exception -> 0x0063 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ea A[Catch:{ Exception -> 0x0063 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.net.Uri h0(android.content.Context r8, java.io.File r9) {
        /*
            java.lang.String r0 = "getUriForFile(...)"
            java.lang.String r1 = "AIC"
            java.lang.String r2 = "content://"
            java.lang.String r3 = r8.getPackageName()
            java.lang.String r4 = ".cropper.fileprovider"
            java.lang.String r3 = o3.d.f(r3, r4)
            java.lang.String r4 = "Try get URI for scope storage - content://"
            android.util.Log.i(r1, r4)     // Catch:{ Exception -> 0x001d }
            android.net.Uri r4 = A.k.d(r8, r3, r9)     // Catch:{ Exception -> 0x001d }
            kotlin.jvm.internal.j.d(r4, r0)     // Catch:{ Exception -> 0x001d }
            return r4
        L_0x001d:
            r4 = move-exception
            java.lang.String r4 = r4.getMessage()     // Catch:{ Exception -> 0x0063 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x0063 }
            android.util.Log.e(r1, r4)     // Catch:{ Exception -> 0x0063 }
            java.lang.String r4 = "ANR Risk -- Copying the file the location cache to avoid 'external-files-path' bug for N+ devices"
            android.util.Log.w(r1, r4)     // Catch:{ Exception -> 0x0063 }
            java.io.File r4 = new java.io.File     // Catch:{ Exception -> 0x0063 }
            java.io.File r5 = r8.getCacheDir()     // Catch:{ Exception -> 0x0063 }
            java.lang.String r6 = "CROP_LIB_CACHE"
            r4.<init>(r5, r6)     // Catch:{ Exception -> 0x0063 }
            java.io.File r5 = new java.io.File     // Catch:{ Exception -> 0x0063 }
            java.lang.String r6 = r9.getName()     // Catch:{ Exception -> 0x0063 }
            r5.<init>(r4, r6)     // Catch:{ Exception -> 0x0063 }
            r4 = 0
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0076, all -> 0x0073 }
            r6.<init>(r9)     // Catch:{ Exception -> 0x0076, all -> 0x0073 }
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0070, all -> 0x006d }
            r7.<init>(r5)     // Catch:{ Exception -> 0x0070, all -> 0x006d }
            z1.m.a(r6, r7)     // Catch:{ Exception -> 0x006a, all -> 0x0066 }
            java.lang.String r4 = "Completed Android N+ file copy. Attempting to return the cached file"
            android.util.Log.i(r1, r4)     // Catch:{ Exception -> 0x006a, all -> 0x0066 }
            android.net.Uri r4 = A.k.d(r8, r3, r5)     // Catch:{ Exception -> 0x006a, all -> 0x0066 }
            kotlin.jvm.internal.j.d(r4, r0)     // Catch:{ Exception -> 0x006a, all -> 0x0066 }
            r6.close()     // Catch:{ Exception -> 0x0063 }
            r7.close()     // Catch:{ Exception -> 0x0063 }
            return r4
        L_0x0063:
            r0 = move-exception
            goto L_0x00ee
        L_0x0066:
            r0 = move-exception
        L_0x0067:
            r4 = r6
            goto L_0x00e3
        L_0x006a:
            r0 = move-exception
        L_0x006b:
            r4 = r6
            goto L_0x0078
        L_0x006d:
            r0 = move-exception
            r7 = r4
            goto L_0x0067
        L_0x0070:
            r0 = move-exception
            r7 = r4
            goto L_0x006b
        L_0x0073:
            r0 = move-exception
            r7 = r4
            goto L_0x00e3
        L_0x0076:
            r0 = move-exception
            r7 = r4
        L_0x0078:
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x00ac }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00ac }
            android.util.Log.e(r1, r0)     // Catch:{ all -> 0x00ac }
            java.lang.String r0 = "Trying to provide URI manually"
            android.util.Log.i(r1, r0)     // Catch:{ all -> 0x00ac }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ac }
            r0.<init>(r2)     // Catch:{ all -> 0x00ac }
            r0.append(r3)     // Catch:{ all -> 0x00ac }
            java.lang.String r2 = "/files/my_images/"
            r0.append(r2)     // Catch:{ all -> 0x00ac }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00ac }
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00ac }
            r3 = 26
            if (r2 < r3) goto L_0x00ae
            r2 = 0
            java.lang.String[] r3 = new java.lang.String[r2]     // Catch:{ all -> 0x00ac }
            java.nio.file.Path r3 = java.nio.file.Paths.get(r0, r3)     // Catch:{ all -> 0x00ac }
            java.nio.file.attribute.FileAttribute[] r2 = new java.nio.file.attribute.FileAttribute[r2]     // Catch:{ all -> 0x00ac }
            java.nio.file.Files.createDirectories(r3, r2)     // Catch:{ all -> 0x00ac }
            goto L_0x00bc
        L_0x00ac:
            r0 = move-exception
            goto L_0x00e3
        L_0x00ae:
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x00ac }
            r2.<init>(r0)     // Catch:{ all -> 0x00ac }
            boolean r3 = r2.exists()     // Catch:{ all -> 0x00ac }
            if (r3 != 0) goto L_0x00bc
            r2.mkdirs()     // Catch:{ all -> 0x00ac }
        L_0x00bc:
            java.lang.String r2 = r9.getName()     // Catch:{ all -> 0x00ac }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ac }
            r3.<init>()     // Catch:{ all -> 0x00ac }
            r3.append(r0)     // Catch:{ all -> 0x00ac }
            r3.append(r2)     // Catch:{ all -> 0x00ac }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x00ac }
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ all -> 0x00ac }
            java.lang.String r2 = "parse(...)"
            kotlin.jvm.internal.j.d(r0, r2)     // Catch:{ all -> 0x00ac }
            if (r4 == 0) goto L_0x00dd
            r4.close()     // Catch:{ Exception -> 0x0063 }
        L_0x00dd:
            if (r7 == 0) goto L_0x00e2
            r7.close()     // Catch:{ Exception -> 0x0063 }
        L_0x00e2:
            return r0
        L_0x00e3:
            if (r4 == 0) goto L_0x00e8
            r4.close()     // Catch:{ Exception -> 0x0063 }
        L_0x00e8:
            if (r7 == 0) goto L_0x00ed
            r7.close()     // Catch:{ Exception -> 0x0063 }
        L_0x00ed:
            throw r0     // Catch:{ Exception -> 0x0063 }
        L_0x00ee:
            java.lang.String r0 = r0.getMessage()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            android.util.Log.e(r1, r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            java.lang.String r3 = "fromFile(...)"
            if (r0 >= r2) goto L_0x012d
            java.io.File r8 = r8.getExternalCacheDir()
            if (r8 == 0) goto L_0x012d
            java.lang.String r0 = "Use External storage, do not work for OS 29 and above"
            android.util.Log.i(r1, r0)     // Catch:{ Exception -> 0x0121 }
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x0121 }
            java.lang.String r8 = r8.getPath()     // Catch:{ Exception -> 0x0121 }
            java.lang.String r2 = r9.getAbsolutePath()     // Catch:{ Exception -> 0x0121 }
            r0.<init>(r8, r2)     // Catch:{ Exception -> 0x0121 }
            android.net.Uri r8 = android.net.Uri.fromFile(r0)     // Catch:{ Exception -> 0x0121 }
            kotlin.jvm.internal.j.d(r8, r3)     // Catch:{ Exception -> 0x0121 }
            return r8
        L_0x0121:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()
            java.lang.String r8 = java.lang.String.valueOf(r8)
            android.util.Log.e(r1, r8)
        L_0x012d:
            java.lang.String r8 = "Try get URI using file://"
            android.util.Log.i(r1, r8)
            android.net.Uri r8 = android.net.Uri.fromFile(r9)
            kotlin.jvm.internal.j.d(r8, r3)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.a.h0(android.content.Context, java.io.File):android.net.Uri");
    }

    public static int i(P p6, g gVar, View view, View view2, C0804F f6, boolean z3) {
        if (f6.v() == 0 || p6.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z3) {
            return Math.abs(C0804F.H(view) - C0804F.H(view2)) + 1;
        }
        return Math.min(gVar.l(), gVar.b(view2) - gVar.e(view));
    }

    public static void i0(J.a aVar) {
        new Thread(new W(aVar, 0)).start();
    }

    public static int j(P p6, g gVar, View view, View view2, C0804F f6, boolean z3, boolean z4) {
        int i2;
        if (f6.v() == 0 || p6.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(C0804F.H(view), C0804F.H(view2));
        int max = Math.max(C0804F.H(view), C0804F.H(view2));
        if (z4) {
            i2 = Math.max(0, (p6.b() - max) - 1);
        } else {
            i2 = Math.max(0, min);
        }
        if (!z3) {
            return i2;
        }
        return Math.round((((float) i2) * (((float) Math.abs(gVar.b(view2) - gVar.e(view))) / ((float) (Math.abs(C0804F.H(view) - C0804F.H(view2)) + 1)))) + ((float) (gVar.k() - gVar.e(view))));
    }

    public static int j0(int i2) {
        if (i2 == 1) {
            return 0;
        }
        if (i2 == 2) {
            return 1;
        }
        if (i2 == 4) {
            return 2;
        }
        if (i2 == 8) {
            return 3;
        }
        if (i2 == 16) {
            return 4;
        }
        if (i2 == 32) {
            return 5;
        }
        if (i2 == 64) {
            return 6;
        }
        if (i2 == 128) {
            return 7;
        }
        if (i2 == 256) {
            return 8;
        }
        throw new IllegalArgumentException(com.google.android.gms.internal.measurement.a.f(i2, "type needs to be >= FIRST and <= LAST, type="));
    }

    public static int k(P p6, g gVar, View view, View view2, C0804F f6, boolean z3) {
        if (f6.v() == 0 || p6.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z3) {
            return p6.b();
        }
        return (int) ((((float) (gVar.b(view2) - gVar.e(view))) / ((float) (Math.abs(C0804F.H(view) - C0804F.H(view2)) + 1))) * ((float) p6.b()));
    }

    public static boolean k0() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) MyApplication.f7090a.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return false;
        }
        return true;
    }

    public static C0549b l(String str, String str2) {
        U3.a aVar = new U3.a(str, str2);
        C0548a b6 = C0549b.b(U3.a.class);
        b6.f8011e = 1;
        b6.f8012f = new F3.e((Object) aVar, 11);
        return b6.b();
    }

    public static long l0(byte[] bArr, int i2) {
        return ((long) (((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16))) & 4294967295L;
    }

    public static C0362p n(Looper looper, Object obj, String str) {
        I.h(obj, "Listener must not be null");
        I.h(looper, "Looper must not be null");
        I.h(str, "Listener type must not be null");
        return new C0362p(looper, obj, str);
    }

    public static void n0(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
            }
        }
    }

    public static void o(Object obj, String str, String str2) {
        String f02 = f0(str);
        if (Log.isLoggable(f02, 3)) {
            Log.d(f02, String.format(str2, new Object[]{obj}));
        }
    }

    public static void o0(String str) {
        try {
            Class<?> cls = Class.forName(str);
            try {
                Object newInstance = cls.getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
                throw new RuntimeException("Expected instanceof GlideModule, but found: " + newInstance);
            } catch (InstantiationException e6) {
                v0(cls, e6);
                throw null;
            } catch (IllegalAccessException e7) {
                v0(cls, e7);
                throw null;
            } catch (NoSuchMethodException e8) {
                v0(cls, e8);
                throw null;
            } catch (InvocationTargetException e9) {
                v0(cls, e9);
                throw null;
            }
        } catch (ClassNotFoundException e10) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e10);
        }
    }

    public static void q(Exception exc, String str, String str2) {
        String f02 = f0(str);
        if (Log.isLoggable(f02, 6)) {
            Log.e(f02, str2, exc);
        }
    }

    public static long s(v3.o oVar) {
        long j6 = 8;
        if (!(oVar instanceof j) && !(oVar instanceof p)) {
            if (oVar instanceof C1046a) {
                j6 = 4;
            } else if (oVar instanceof w) {
                j6 = ((long) ((w) oVar).f12312c.length()) + 2;
            } else {
                throw new IllegalArgumentException("Unknown leaf node type: " + oVar.getClass());
            }
        }
        if (oVar.f12300a.isEmpty()) {
            return j6;
        }
        return s((v3.o) oVar.f12300a) + j6 + 24;
    }

    public static long t(s sVar) {
        if (sVar.isEmpty()) {
            return 4;
        }
        if (sVar.h()) {
            return s((v3.o) sVar);
        }
        l.b("Unexpected node type: " + sVar.getClass(), sVar instanceof C1051f);
        Iterator it2 = sVar.iterator();
        long j6 = 1;
        while (it2.hasNext()) {
            q qVar = (q) it2.next();
            j6 = j6 + ((long) qVar.f12304a.f12280a.length()) + 4 + t(qVar.f12305b);
        }
        if (!sVar.c().isEmpty()) {
            return j6 + 12 + s((v3.o) sVar.c());
        }
        return j6;
    }

    public static void t0() {
        int[] g02 = g0(o.getStockObject().getItemsInStock());
        int X3 = e.X(0) - g02[1];
        o.getStockObject().setStockFreeSpace(o.getStockObject().getStockSpace() - g02[0]);
        o.getStockObject().setBagFreeSpace(X3);
    }

    public static C0549b u(String str, D2.l lVar) {
        C0548a b6 = C0549b.b(U3.a.class);
        b6.f8011e = 1;
        b6.a(g3.h.b(Context.class));
        b6.f8012f = new A4.c(str, 2, (Object) lVar);
        return b6.b();
    }

    public static void u0(int i2, boolean z3, C0433c cVar) {
        com.google.android.gms.internal.measurement.a.v(com.google.android.gms.internal.measurement.a.c(C0592h.b().e(), "players"), "armingObject").H(new C0432b(z3, i2, (Object) cVar, 0));
    }

    public static ArrayList v(int i2) {
        ArrayList arrayList = new ArrayList();
        if (i2 == 3 || i2 == 4 || i2 == 5 || i2 == 6 || i2 == 7) {
            arrayList.add(new D(R.string.material_random_crystal_name, R.string.material_random_crystal_description, R.drawable.material_crystal_group, T(i2)));
        }
        arrayList.add(new D(R.string.material_level_experience_name, R.string.material_level_experience_description, R.drawable.material_level_experience, U()));
        arrayList.add(new D(R.string.material_loyalty_for_members_name, R.string.material_loyalty_for_members_description, R.drawable.material_gang_loyalty_for_member, V(i2)));
        arrayList.add(new D(R.string.material_loyalty_for_gang_name, R.string.material_loyalty_for_gang_description, R.drawable.material_gang_loyalty_for_gang, V(i2)));
        arrayList.add(new D(R.string.material_contribution_name, R.string.material_contribution_description, R.drawable.material_gang_contribution, R(i2)));
        return arrayList;
    }

    public static void v0(Class cls, ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, reflectiveOperationException);
    }

    public static ArrayList w() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C0247d(R.string.crime_type_one, R.drawable.crime_type_one, H(B(arrayList.size()))));
        arrayList.add(new C0247d(R.string.crime_type_two, R.drawable.crime_type_two, H(B(arrayList.size()))));
        arrayList.add(new C0247d(R.string.crime_type_three, R.drawable.crime_type_three, H(B(arrayList.size()))));
        arrayList.add(new C0247d(R.string.crime_type_four, R.drawable.crime_type_four, H(B(arrayList.size()))));
        arrayList.add(new C0247d(R.string.crime_type_five, R.drawable.crime_type_five, H(B(arrayList.size()))));
        arrayList.add(new C0247d(R.string.crime_type_six, R.drawable.crime_type_six, H(B(arrayList.size()))));
        arrayList.add(new C0247d(R.string.crime_type_seven, R.drawable.crime_type_seven, H(B(arrayList.size()))));
        arrayList.add(new C0247d(R.string.crime_type_eight, R.drawable.crime_type_eight, H(B(arrayList.size()))));
        arrayList.add(new C0247d(R.string.crime_type_nine, R.drawable.crime_type_nine, H(B(arrayList.size()))));
        arrayList.add(new C0247d(R.string.crime_type_ten, R.drawable.crime_type_ten, H(B(arrayList.size()))));
        arrayList.add(new C0247d(R.string.crime_type_eleven, R.drawable.crime_type_eleven, H(B(arrayList.size()))));
        arrayList.add(new C0247d(R.string.crime_type_twelve, R.drawable.crime_type_twelve, H(B(arrayList.size()))));
        arrayList.add(new C0247d(R.string.crime_type_thirteen, R.drawable.crime_type_thirteen, H(B(arrayList.size()))));
        arrayList.add(new C0247d(R.string.crime_type_fourteen, R.drawable.crime_type_fourteen, H(B(arrayList.size()))));
        arrayList.add(new C0247d(R.string.crime_type_fifteen, R.drawable.crime_type_fifteen, H(B(arrayList.size()))));
        arrayList.add(new C0247d(R.string.crime_type_sixteen, R.drawable.crime_type_sixteen, H(B(arrayList.size()))));
        arrayList.add(new C0247d(R.string.crime_type_seventeen, R.drawable.crime_type_seventeen, H(B(arrayList.size()))));
        return arrayList;
    }

    public static void w0(byte[] bArr, long j6, int i2) {
        int i5 = 0;
        while (i5 < 4) {
            bArr[i2 + i5] = (byte) ((int) (255 & j6));
            i5++;
            j6 >>= 8;
        }
    }

    public static ArrayList x() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C0246c(R.string.rank_daily_name, R.string.rank_daily_description, R.drawable.rank_daily));
        arrayList.add(new C0246c(R.string.rank_weekly_name, R.string.rank_weekly_description, R.drawable.rank_weekly));
        arrayList.add(new C0246c(R.string.rank_individual_name, R.string.rank_individual_description, R.drawable.rank_individual));
        arrayList.add(new C0246c(R.string.rank_gang_name, R.string.rank_gang_description, R.drawable.rank_gang));
        arrayList.add(new C0246c(R.string.rank_social_name, R.string.rank_social_description, R.drawable.rank_social));
        return arrayList;
    }

    public static byte[] x0(C0143d dVar) {
        int i2;
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int min = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int i5 = 0;
        while (i5 < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i5);
            byte[] bArr = new byte[min2];
            arrayDeque.add(bArr);
            int i6 = 0;
            while (i6 < min2) {
                int read = dVar.read(bArr, i6, min2 - i6);
                if (read == -1) {
                    return g(arrayDeque, i5);
                }
                i6 += read;
                i5 += read;
            }
            long j6 = (long) min;
            if (min < 4096) {
                i2 = 4;
            } else {
                i2 = 2;
            }
            long j7 = j6 * ((long) i2);
            if (j7 > 2147483647L) {
                min = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
            } else if (j7 < -2147483648L) {
                min = Integer.MIN_VALUE;
            } else {
                min = (int) j7;
            }
        }
        if (dVar.read() == -1) {
            return g(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static ArrayList y(int i2) {
        switch (i2) {
            case 0:
                ArrayList arrayList = new ArrayList();
                arrayList.add(new C0246c(R.string.rank_daily_nope_name, R.string.rank_daily_nope_description, R.drawable.rank_daily_nope));
                arrayList.add(new C0246c(R.string.rank_daily_level_name, R.string.rank_daily_level_description, R.drawable.rank_daily_level));
                arrayList.add(new C0246c(R.string.rank_daily_warlord_name, R.string.rank_daily_warlord_description, R.drawable.rank_daily_warlord));
                arrayList.add(new C0246c(R.string.rank_daily_chatterbox_name, R.string.rank_daily_chatterbox_description, R.drawable.rank_daily_chatterbox));
                return arrayList;
            case 1:
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new C0246c(R.string.rank_weekly_level_name, R.string.rank_weekly_level_description, R.drawable.rank_weekly_level));
                arrayList2.add(new C0246c(R.string.rank_weekly_medals_name, R.string.rank_weekly_medals_description, R.drawable.rank_weekly_medals));
                return arrayList2;
            case 2:
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(new C0246c(R.string.rank_individual_otaku_name, R.string.rank_individual_otaku_description, R.drawable.rank_individual_otaku));
                arrayList3.add(new C0246c(R.string.rank_individual_level_name, R.string.rank_individual_level_description, R.drawable.rank_individual_level));
                arrayList3.add(new C0246c(R.string.rank_individual_medals_name, R.string.rank_individual_medals_description, R.drawable.rank_individual_medals));
                arrayList3.add(new C0246c(R.string.rank_individual_estate_name, R.string.rank_individual_estate_description, R.drawable.rank_individual_estate));
                arrayList3.add(new C0246c(R.string.rank_individual_winner_name, R.string.rank_individual_winner_description, R.drawable.rank_individual_winner));
                arrayList3.add(new C0246c(R.string.rank_individual_crimes_name, R.string.rank_individual_crimes_description, R.drawable.rank_individual_crimes));
                arrayList3.add(new C0246c(R.string.rank_individual_patient_name, R.string.rank_individual_patient_description, R.drawable.rank_individual_patient));
                arrayList3.add(new C0246c(R.string.rank_individual_lifer_name, R.string.rank_individual_lifer_description, R.drawable.rank_individual_lifer));
                arrayList3.add(new C0246c(R.string.rank_individual_flight_name, R.string.rank_individual_flight_description, R.drawable.rank_individual_flight));
                arrayList3.add(new C0246c(R.string.rank_individual_hardworking_name, R.string.rank_individual_hardworking_description, R.drawable.rank_individual_hardworking));
                return arrayList3;
            case 3:
                ArrayList arrayList4 = new ArrayList();
                arrayList4.add(new C0246c(R.string.rank_gang_respect_name, R.string.rank_gang_respect_description, R.drawable.rank_gang_respect));
                arrayList4.add(new C0246c(R.string.rank_gang_gold_name, R.string.rank_gang_gold_description, R.drawable.rank_gang_gold));
                arrayList4.add(new C0246c(R.string.rank_gang_cash_name, R.string.rank_gang_cash_description, R.drawable.rank_gang_cash));
                arrayList4.add(new C0246c(R.string.rank_gang_cities_conquered_name, R.string.rank_gang_cities_conquered_description, R.drawable.rank_gang_cities_conquered));
                return arrayList4;
            case 4:
                ArrayList arrayList5 = new ArrayList();
                arrayList5.add(new C0246c(R.string.rank_social_target_name, R.string.rank_social_target_description, R.drawable.rank_social_target));
                arrayList5.add(new C0246c(R.string.rank_social_brave_heart_name, R.string.rank_social_brave_heart_description, R.drawable.rank_social_braveheart));
                arrayList5.add(new C0246c(R.string.rank_social_bailiff_name, R.string.rank_social_bailiff_description, R.drawable.rank_social_bailiff));
                return arrayList5;
            case 5:
                ArrayList arrayList6 = new ArrayList();
                arrayList6.add(new C0246c(R.string.rank_hideouts_old_easy_name, R.string.rank_hideouts_old_easy_description, R.drawable.rank_hideouts_old_easy));
                arrayList6.add(new C0246c(R.string.rank_hideouts_old_hard_name, R.string.rank_hideouts_old_hard_description, R.drawable.rank_hideouts_old_hard));
                arrayList6.add(new C0246c(R.string.rank_hideouts_new_easy_name, R.string.rank_hideouts_new_easy_description, R.drawable.rank_hideouts_new_easy));
                arrayList6.add(new C0246c(R.string.rank_hideouts_new_hard_name, R.string.rank_hideouts_new_hard_description, R.drawable.rank_hideouts_new_hard));
                return arrayList6;
            case zzaky.zzf.zzf /*6*/:
                ArrayList arrayList7 = new ArrayList();
                arrayList7.add(new C0246c(R.string.rank_skirmish_damage_name, R.string.rank_skirmish_damage_description, R.drawable.rank_skirmish));
                arrayList7.add(new C0246c(R.string.rank_skirmish_attacks_name, R.string.rank_skirmish_attacks_description, R.drawable.rank_skirmish));
                arrayList7.add(new C0246c(R.string.rank_skirmish_shares_name, R.string.rank_skirmish_shares_description, R.drawable.rank_skirmish));
                arrayList7.add(new C0246c(R.string.rank_skirmish_assists_name, R.string.rank_skirmish_assists_description, R.drawable.rank_skirmish));
                return arrayList7;
            default:
                return null;
        }
    }

    public static void y0(int i2, int i5, int i6, int i7, boolean z3, q0 q0Var) {
        com.google.android.gms.internal.measurement.a.d(com.google.android.gms.internal.measurement.a.c(C0592h.b().e(), "players"), "stockObject", "itemsInStock").E(e.y(i5)).E(e.x(i2, i6)).H(new C0432b(z3, i7, (Object) q0Var, 1));
    }

    public static String z() {
        if (o.getLocationObject().getCurrentCity() != 0) {
            return "countInBag";
        }
        return "count";
    }

    public static void z0(int i2, int i5, long j6, String str) {
        com.google.android.gms.internal.measurement.a.x(C0592h.d().e(), "rank").E(L(i2)).E(M(i2, i5)).E(str).I(e.d(18, j6) + "." + str);
    }

    public abstract a Q(C1048c cVar);

    public abstract boolean d(p.h hVar, C0901d dVar, C0901d dVar2);

    public abstract boolean e(p.h hVar, Object obj, Object obj2);

    public G3.c e0(Context context, Object obj) {
        return null;
    }

    public abstract boolean f(p.h hVar, C0904g gVar, C0904g gVar2);

    public abstract Intent m(Context context, Object obj);

    public abstract s m0();

    public abstract String p(byte[] bArr, int i2, int i5);

    public abstract Object p0(Intent intent, int i2);

    public abstract int q0(byte[] bArr, int i2, int i5);

    public abstract int r(String str, byte[] bArr, int i2, int i5);

    public abstract void r0(C0904g gVar, C0904g gVar2);

    public abstract void s0(C0904g gVar, Thread thread);
}
