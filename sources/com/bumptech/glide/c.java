package com.bumptech.glide;

import D0.e;
import F3.h;
import H4.g;
import P4.a;
import P4.q;
import R2.i;
import S3.t;
import T2.b;
import Y4.A;
import Y4.y;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.activities.MainActivity;
import com.mtma.criminal.city.activities.StartActivity;
import com.mtma.criminal.city.activities.m;
import com.mtma.criminal.city.activities.u;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.C0438h;
import com.mtma.criminal.city.utils.C0439i;
import com.mtma.criminal.city.utils.C0440j;
import com.mtma.criminal.city.utils.G;
import com.mtma.criminal.city.utils.r0;
import d5.o;
import e5.C0505b;
import f.C0518i;
import g3.C0549b;
import g3.f;
import g3.p;
import h0.C0552a;
import h3.k;
import h3.l;
import i3.C0592h;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.Executor;
import k.b1;
import k.d1;
import kotlin.jvm.internal.j;
import o3.d;
import t0.v;
import z1.C1132b;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static k f5733a = null;

    /* renamed from: b  reason: collision with root package name */
    public static k f5734b = null;

    /* renamed from: c  reason: collision with root package name */
    public static l f5735c = null;
    public static Executor d = null;

    /* renamed from: e  reason: collision with root package name */
    public static boolean f5736e = false;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f5737f = false;
    public static boolean g = false;
    public static boolean h = false;

    /* renamed from: i  reason: collision with root package name */
    public static boolean f5738i = false;

    /* renamed from: j  reason: collision with root package name */
    public static boolean f5739j = false;

    /* renamed from: k  reason: collision with root package name */
    public static boolean f5740k = false;

    /* renamed from: l  reason: collision with root package name */
    public static boolean f5741l = false;

    /* renamed from: m  reason: collision with root package name */
    public static boolean f5742m = false;

    /* renamed from: n  reason: collision with root package name */
    public static long f5743n = 0;

    /* renamed from: o  reason: collision with root package name */
    public static long f5744o = -111;

    /* renamed from: p  reason: collision with root package name */
    public static Handler f5745p = null;

    /* renamed from: q  reason: collision with root package name */
    public static q f5746q = null;

    /* renamed from: r  reason: collision with root package name */
    public static boolean f5747r = false;

    /* renamed from: s  reason: collision with root package name */
    public static boolean f5748s = false;

    /* renamed from: t  reason: collision with root package name */
    public static int f5749t = 0;

    /* renamed from: u  reason: collision with root package name */
    public static boolean f5750u = false;

    /* renamed from: v  reason: collision with root package name */
    public static boolean f5751v = true;

    public static int A(Object obj) {
        long W5 = W(obj);
        long j6 = f5744o;
        if (W5 < j6) {
            return (int) ((j6 - W5) / 86400);
        }
        return 0;
    }

    public static void A0(StartActivity startActivity) {
        if (!f5740k) {
            f5740k = true;
            C0505b bVar = new C0505b(startActivity, R.layout.dialog_ok_cancle);
            TextView textView = (TextView) bVar.findViewById(R.id.dialog_ok_cancel_title);
            RelativeLayout relativeLayout = (RelativeLayout) bVar.findViewById(R.id.dialog_ok_cancel_ok_button);
            relativeLayout.setVisibility(0);
            textView.setText(R.string.note_title);
            textView.setTextColor(MyApplication.f7090a.getApplicationContext().getResources().getColor(R.color.maximum_word_color, startActivity.getTheme()));
            ((TextView) bVar.findViewById(R.id.dialog_ok_cancel_text)).setText(R.string.dialog_can_not_run_app_on_emulator_or_using_third_party_app);
            ((TextView) bVar.findViewById(R.id.dialog_ok_cancel_ok_button_text)).setText(R.string.close_button);
            relativeLayout.setOnClickListener(new u(relativeLayout, bVar, startActivity, 3));
            bVar.show();
        }
    }

    public static int B(int i2) {
        switch (i2) {
            case 2:
                return 20;
            case 3:
            case 4:
            case 5:
            case zzaky.zzf.zzf /*6*/:
            case zzaky.zzf.zzg /*7*/:
            case 8:
            case ModuleDescriptor.MODULE_VERSION /*11*/:
                return 5;
            case 9:
            case 10:
            case 13:
            case 14:
                return 1;
            case 12:
                return 2;
            case 15:
                return 10;
            default:
                return 0;
        }
    }

    public static void B0() {
        if (f5747r) {
            f5747r = false;
            f5744o = -111;
            f5745p.removeCallbacks(f5746q);
            f5745p = null;
            f5746q = null;
        }
    }

    public static ArrayList C(boolean z3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new A(0, R.string.school_gym_lesson_0_name, R.string.school_gym_lesson_0_description, R.drawable.school_gym_lesson_0, 7, 500000, o.getSchoolObject().getGymLessons().get(arrayList.size()).intValue()));
        arrayList.add(new A(1, R.string.school_gym_lesson_1_name, R.string.school_gym_lesson_1_description, R.drawable.school_gym_lesson_1, 15, 5000000, o.getSchoolObject().getGymLessons().get(arrayList.size()).intValue()));
        arrayList.add(new A(2, R.string.school_gym_lesson_2_name, R.string.school_gym_lesson_2_description, R.drawable.school_gym_lesson_2, 15, 5000000, o.getSchoolObject().getGymLessons().get(arrayList.size()).intValue()));
        arrayList.add(new A(3, R.string.school_gym_lesson_3_name, R.string.school_gym_lesson_3_description, R.drawable.school_gym_lesson_3, 15, 5000000, o.getSchoolObject().getGymLessons().get(arrayList.size()).intValue()));
        arrayList.add(new A(4, R.string.school_gym_lesson_4_name, R.string.school_gym_lesson_4_description, R.drawable.school_gym_lesson_4, 15, 5000000, o.getSchoolObject().getGymLessons().get(arrayList.size()).intValue()));
        arrayList.add(new A(5, R.string.school_gym_lesson_5_name, R.string.school_gym_lesson_5_description, R.drawable.school_gym_lesson_1, 30, 50000000, o.getSchoolObject().getGymLessons().get(arrayList.size()).intValue()));
        arrayList.add(new A(6, R.string.school_gym_lesson_6_name, R.string.school_gym_lesson_6_description, R.drawable.school_gym_lesson_2, 30, 50000000, o.getSchoolObject().getGymLessons().get(arrayList.size()).intValue()));
        arrayList.add(new A(7, R.string.school_gym_lesson_7_name, R.string.school_gym_lesson_7_description, R.drawable.school_gym_lesson_3, 30, 50000000, o.getSchoolObject().getGymLessons().get(arrayList.size()).intValue()));
        arrayList.add(new A(8, R.string.school_gym_lesson_8_name, R.string.school_gym_lesson_8_description, R.drawable.school_gym_lesson_4, 30, 50000000, o.getSchoolObject().getGymLessons().get(arrayList.size()).intValue()));
        if (z3) {
            h(4, arrayList);
        }
        return arrayList;
    }

    public static void C0(ViewGroup viewGroup, boolean z3) {
        if (Build.VERSION.SDK_INT >= 29) {
            v.b(viewGroup, z3);
        } else if (f5751v) {
            try {
                v.b(viewGroup, z3);
            } catch (NoSuchMethodError unused) {
                f5751v = false;
            }
        }
    }

    public static ArrayList D(boolean z3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new A(0, R.string.school_history_lesson_0_name, R.string.school_history_lesson_0_description, R.drawable.school_history_lesson_0, 7, 500000, o.getSchoolObject().getHistoryLessons().get(arrayList.size()).intValue()));
        arrayList.add(new A(1, R.string.school_history_lesson_1_name, R.string.school_history_lesson_1_description, R.drawable.school_history_lesson_1, 15, 5000000, o.getSchoolObject().getHistoryLessons().get(arrayList.size()).intValue()));
        arrayList.add(new A(2, R.string.school_history_lesson_2_name, R.string.school_history_lesson_2_description, R.drawable.school_history_lesson_2, 15, 5000000, o.getSchoolObject().getHistoryLessons().get(arrayList.size()).intValue()));
        arrayList.add(new A(3, R.string.school_history_lesson_3_name, R.string.school_history_lesson_3_description, R.drawable.school_history_lesson_1, 30, 50000000, o.getSchoolObject().getHistoryLessons().get(arrayList.size()).intValue()));
        arrayList.add(new A(4, R.string.school_history_lesson_4_name, R.string.school_history_lesson_4_description, R.drawable.school_history_lesson_2, 30, 50000000, o.getSchoolObject().getHistoryLessons().get(arrayList.size()).intValue()));
        if (z3) {
            h(2, arrayList);
        }
        return arrayList;
    }

    public static void D0(D2.l lVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("serverNumber", Integer.valueOf(o.getAccountObject().getCurrentOpenedServer()));
        hashMap.put("playerId", o.getAccountObject().getId());
        h.b().a("updatePlayerPlace").q(hashMap).addOnCompleteListener(new a(lVar, 6));
    }

    public static int E(long j6) {
        Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        instance.setTimeInMillis(j6 * 1000);
        return instance.get(10);
    }

    public static void E0(Context context) {
        com.google.android.gms.internal.measurement.a.v(com.google.android.gms.internal.measurement.a.c(C0592h.b().e(), "players"), "locationObject").d(new e(context, 8));
    }

    public static ArrayList F(boolean z3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new A(0, R.string.school_law_lesson_0_name, R.string.school_law_lesson_0_description, R.drawable.school_law_lesson_0, 7, 500000, o.getSchoolObject().getLawLessons().get(arrayList.size()).intValue()));
        arrayList.add(new A(1, R.string.school_law_lesson_1_name, R.string.school_law_lesson_1_description, R.drawable.school_law_lesson_1, 15, 5000000, o.getSchoolObject().getLawLessons().get(arrayList.size()).intValue()));
        arrayList.add(new A(2, R.string.school_law_lesson_2_name, R.string.school_law_lesson_2_description, R.drawable.school_law_lesson_2, 15, 5000000, o.getSchoolObject().getLawLessons().get(arrayList.size()).intValue()));
        arrayList.add(new A(3, R.string.school_law_lesson_3_name, R.string.school_law_lesson_3_description, R.drawable.school_law_lesson_3, 15, 5000000, o.getSchoolObject().getLawLessons().get(arrayList.size()).intValue()));
        arrayList.add(new A(4, R.string.school_law_lesson_4_name, R.string.school_law_lesson_4_description, R.drawable.school_law_lesson_1, 30, 50000000, o.getSchoolObject().getLawLessons().get(arrayList.size()).intValue()));
        arrayList.add(new A(5, R.string.school_law_lesson_5_name, R.string.school_law_lesson_5_description, R.drawable.school_law_lesson_2, 30, 50000000, o.getSchoolObject().getLawLessons().get(arrayList.size()).intValue()));
        arrayList.add(new A(6, R.string.school_law_lesson_6_name, R.string.school_law_lesson_6_description, R.drawable.school_law_lesson_3, 30, 50000000, o.getSchoolObject().getLawLessons().get(arrayList.size()).intValue()));
        if (z3) {
            h(3, arrayList);
        }
        return arrayList;
    }

    public static void F0(int i2, String str, long j6) {
        d.c(C0592h.b().e(), "players", str, "locationObject").H(new G(i2, 0, j6, str));
    }

    public static int G(int i2, int i5) {
        return ((A) Q(i2, false).get(i5)).f4276c;
    }

    public static Status G0(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return new Status(17499, (String) null, (PendingIntent) null, (C1132b) null);
        }
        String[] split = str.split(":", 2);
        split[0] = split[0].trim();
        if (split.length > 1 && (str2 = split[1]) != null) {
            split[1] = str2.trim();
        }
        List asList = Arrays.asList(split);
        if (asList.size() > 1) {
            return H0((String) asList.get(0), (String) asList.get(1));
        }
        return H0((String) asList.get(0), (String) null);
    }

    public static double H(int i2, int i5) {
        if (i2 == 0) {
            switch (i5) {
                case 0:
                case 1:
                case 2:
                    return 0.05d;
                case 3:
                    return 0.25d;
                case 4:
                case 5:
                    return 0.15d;
                case zzaky.zzf.zzf /*6*/:
                    return 0.5d;
                default:
                    return 1.0d;
            }
        } else if (i2 == 1) {
            switch (i5) {
                case 0:
                case 1:
                case 2:
                case 3:
                    return 0.05d;
                case 4:
                case 5:
                case zzaky.zzf.zzf /*6*/:
                    return 0.1d;
                default:
                    return 1.0d;
            }
        } else if (i2 == 2) {
            if (i5 == 0 || i5 == 1) {
                return 0.1d;
            }
            if (i5 == 2) {
                return 0.01d;
            }
            if (i5 == 3) {
                return 0.15d;
            }
            if (i5 != 4) {
                return 1.0d;
            }
            return 0.02d;
        } else if (i2 == 3) {
            switch (i5) {
                case 0:
                case 3:
                case 4:
                    return 0.1d;
                case 1:
                case 2:
                    return 0.05d;
                case 5:
                    return 2.0d;
                case zzaky.zzf.zzf /*6*/:
                    return 0.2d;
                default:
                    return 1.0d;
            }
        } else if (i2 != 4) {
            return 1.0d;
        } else {
            switch (i5) {
                case 0:
                    return 0.05d;
                case 1:
                case 2:
                case 3:
                case 4:
                    return 5.0d;
                case 5:
                case zzaky.zzf.zzf /*6*/:
                case zzaky.zzf.zzg /*7*/:
                case 8:
                    return 15.0d;
                default:
                    return 1.0d;
            }
        }
    }

    public static Status H0(String str, String str2) {
        int i2;
        str.getClass();
        char c3 = 65535;
        switch (str.hashCode()) {
            case -2130504259:
                if (str.equals("USER_CANCELLED")) {
                    c3 = 0;
                    break;
                }
                break;
            case -2065866930:
                if (str.equals("INVALID_RECIPIENT_EMAIL")) {
                    c3 = 1;
                    break;
                }
                break;
            case -2014808264:
                if (str.equals("WEB_CONTEXT_ALREADY_PRESENTED")) {
                    c3 = 2;
                    break;
                }
                break;
            case -2005236790:
                if (str.equals("INTERNAL_SUCCESS_SIGN_OUT")) {
                    c3 = 3;
                    break;
                }
                break;
            case -2001169389:
                if (str.equals("INVALID_IDP_RESPONSE")) {
                    c3 = 4;
                    break;
                }
                break;
            case -1944433728:
                if (str.equals("DYNAMIC_LINK_NOT_ACTIVATED")) {
                    c3 = 5;
                    break;
                }
                break;
            case -1800638118:
                if (str.equals("QUOTA_EXCEEDED")) {
                    c3 = 6;
                    break;
                }
                break;
            case -1774756919:
                if (str.equals("WEB_NETWORK_REQUEST_FAILED")) {
                    c3 = 7;
                    break;
                }
                break;
            case -1699246888:
                if (str.equals("INVALID_RECAPTCHA_VERSION")) {
                    c3 = 8;
                    break;
                }
                break;
            case -1603818979:
                if (str.equals("RECAPTCHA_NOT_ENABLED")) {
                    c3 = 9;
                    break;
                }
                break;
            case -1587614300:
                if (str.equals("EXPIRED_OOB_CODE")) {
                    c3 = 10;
                    break;
                }
                break;
            case -1584641425:
                if (str.equals("UNAUTHORIZED_DOMAIN")) {
                    c3 = 11;
                    break;
                }
                break;
            case -1583894766:
                if (str.equals("INVALID_OOB_CODE")) {
                    c3 = 12;
                    break;
                }
                break;
            case -1458751677:
                if (str.equals("MISSING_EMAIL")) {
                    c3 = 13;
                    break;
                }
                break;
            case -1421414571:
                if (str.equals("INVALID_CODE")) {
                    c3 = 14;
                    break;
                }
                break;
            case -1368998244:
                if (str.equals("INVALID_HOSTING_LINK_DOMAIN")) {
                    c3 = 15;
                    break;
                }
                break;
            case -1345867105:
                if (str.equals("TOKEN_EXPIRED")) {
                    c3 = 16;
                    break;
                }
                break;
            case -1340100504:
                if (str.equals("INVALID_TENANT_ID")) {
                    c3 = 17;
                    break;
                }
                break;
            case -1242922234:
                if (str.equals("ALTERNATE_CLIENT_IDENTIFIER_REQUIRED")) {
                    c3 = 18;
                    break;
                }
                break;
            case -1232010689:
                if (str.equals("INVALID_SESSION_INFO")) {
                    c3 = 19;
                    break;
                }
                break;
            case -1202691903:
                if (str.equals("SECOND_FACTOR_EXISTS")) {
                    c3 = 20;
                    break;
                }
                break;
            case -1112393964:
                if (str.equals("INVALID_EMAIL")) {
                    c3 = 21;
                    break;
                }
                break;
            case -1063710844:
                if (str.equals("ADMIN_ONLY_OPERATION")) {
                    c3 = 22;
                    break;
                }
                break;
            case -974503964:
                if (str.equals("MISSING_OR_INVALID_NONCE")) {
                    c3 = 23;
                    break;
                }
                break;
            case -863830559:
                if (str.equals("INVALID_CERT_HASH")) {
                    c3 = 24;
                    break;
                }
                break;
            case -828507413:
                if (str.equals("NO_SUCH_PROVIDER")) {
                    c3 = 25;
                    break;
                }
                break;
            case -749743758:
                if (str.equals("MFA_ENROLLMENT_NOT_FOUND")) {
                    c3 = 26;
                    break;
                }
                break;
            case -736207500:
                if (str.equals("MISSING_PASSWORD")) {
                    c3 = 27;
                    break;
                }
                break;
            case -646022241:
                if (str.equals("CREDENTIAL_TOO_OLD_LOGIN_AGAIN")) {
                    c3 = 28;
                    break;
                }
                break;
            case -595928767:
                if (str.equals("TIMEOUT")) {
                    c3 = 29;
                    break;
                }
                break;
            case -505579581:
                if (str.equals("INVALID_REQ_TYPE")) {
                    c3 = 30;
                    break;
                }
                break;
            case -406804866:
                if (str.equals("INVALID_LOGIN_CREDENTIALS")) {
                    c3 = 31;
                    break;
                }
                break;
            case -380728810:
                if (str.equals("INVALID_RECAPTCHA_ACTION")) {
                    c3 = ' ';
                    break;
                }
                break;
            case -333672188:
                if (str.equals("OPERATION_NOT_ALLOWED")) {
                    c3 = '!';
                    break;
                }
                break;
            case -294485423:
                if (str.equals("WEB_INTERNAL_ERROR")) {
                    c3 = '\"';
                    break;
                }
                break;
            case -217128228:
                if (str.equals("SECOND_FACTOR_LIMIT_EXCEEDED")) {
                    c3 = '#';
                    break;
                }
                break;
            case -122667194:
                if (str.equals("MISSING_MFA_ENROLLMENT_ID")) {
                    c3 = '$';
                    break;
                }
                break;
            case -75433118:
                if (str.equals("USER_NOT_FOUND")) {
                    c3 = '%';
                    break;
                }
                break;
            case -52772551:
                if (str.equals("CAPTCHA_CHECK_FAILED")) {
                    c3 = '&';
                    break;
                }
                break;
            case -40686718:
                if (str.equals("WEAK_PASSWORD")) {
                    c3 = '\'';
                    break;
                }
                break;
            case 15352275:
                if (str.equals("EMAIL_NOT_FOUND")) {
                    c3 = '(';
                    break;
                }
                break;
            case 210308040:
                if (str.equals("UNSUPPORTED_FIRST_FACTOR")) {
                    c3 = ')';
                    break;
                }
                break;
            case 269327773:
                if (str.equals("INVALID_SENDER")) {
                    c3 = '*';
                    break;
                }
                break;
            case 278802867:
                if (str.equals("MISSING_PHONE_NUMBER")) {
                    c3 = '+';
                    break;
                }
                break;
            case 408411681:
                if (str.equals("INVALID_DYNAMIC_LINK_DOMAIN")) {
                    c3 = ',';
                    break;
                }
                break;
            case 423563023:
                if (str.equals("MISSING_MFA_PENDING_CREDENTIAL")) {
                    c3 = '-';
                    break;
                }
                break;
            case 429251986:
                if (str.equals("UNSUPPORTED_PASSTHROUGH_OPERATION")) {
                    c3 = '.';
                    break;
                }
                break;
            case 483847807:
                if (str.equals("EMAIL_EXISTS")) {
                    c3 = '/';
                    break;
                }
                break;
            case 491979549:
                if (str.equals("INVALID_ID_TOKEN")) {
                    c3 = '0';
                    break;
                }
                break;
            case 492072102:
                if (str.equals("WEB_STORAGE_UNSUPPORTED")) {
                    c3 = '1';
                    break;
                }
                break;
            case 492515765:
                if (str.equals("MISSING_CLIENT_TYPE")) {
                    c3 = '2';
                    break;
                }
                break;
            case 530628231:
                if (str.equals("MISSING_RECAPTCHA_VERSION")) {
                    c3 = '3';
                    break;
                }
                break;
            case 542728406:
                if (str.equals("PASSWORD_LOGIN_DISABLED")) {
                    c3 = '4';
                    break;
                }
                break;
            case 582457886:
                if (str.equals("UNVERIFIED_EMAIL")) {
                    c3 = '5';
                    break;
                }
                break;
            case 605031096:
                if (str.equals("REJECTED_CREDENTIAL")) {
                    c3 = '6';
                    break;
                }
                break;
            case 745638750:
                if (str.equals("INVALID_MFA_PENDING_CREDENTIAL")) {
                    c3 = '7';
                    break;
                }
                break;
            case 786916712:
                if (str.equals("INVALID_VERIFICATION_PROOF")) {
                    c3 = '8';
                    break;
                }
                break;
            case 799258561:
                if (str.equals("INVALID_PROVIDER_ID")) {
                    c3 = '9';
                    break;
                }
                break;
            case 819646646:
                if (str.equals("CREDENTIAL_MISMATCH")) {
                    c3 = ':';
                    break;
                }
                break;
            case 844240628:
                if (str.equals("WEB_CONTEXT_CANCELED")) {
                    c3 = ';';
                    break;
                }
                break;
            case 886186878:
                if (str.equals("REQUIRES_SECOND_FACTOR_AUTH")) {
                    c3 = '<';
                    break;
                }
                break;
            case 895302372:
                if (str.equals("MISSING_CLIENT_IDENTIFIER")) {
                    c3 = '=';
                    break;
                }
                break;
            case 922685102:
                if (str.equals("INVALID_MESSAGE_PAYLOAD")) {
                    c3 = '>';
                    break;
                }
                break;
            case 989000548:
                if (str.equals("RESET_PASSWORD_EXCEED_LIMIT")) {
                    c3 = '?';
                    break;
                }
                break;
            case 1034932393:
                if (str.equals("INVALID_PENDING_TOKEN")) {
                    c3 = '@';
                    break;
                }
                break;
            case 1072360691:
                if (str.equals("INVALID_CUSTOM_TOKEN")) {
                    c3 = 'A';
                    break;
                }
                break;
            case 1094975491:
                if (str.equals("INVALID_PASSWORD")) {
                    c3 = 'B';
                    break;
                }
                break;
            case 1107081238:
                if (str.equals("<<Network Error>>")) {
                    c3 = 'C';
                    break;
                }
                break;
            case 1113992697:
                if (str.equals("INVALID_RECAPTCHA_TOKEN")) {
                    c3 = 'D';
                    break;
                }
                break;
            case 1141576252:
                if (str.equals("SESSION_EXPIRED")) {
                    c3 = 'E';
                    break;
                }
                break;
            case 1199811910:
                if (str.equals("MISSING_CODE")) {
                    c3 = 'F';
                    break;
                }
                break;
            case 1226505451:
                if (str.equals("FEDERATED_USER_ID_ALREADY_LINKED")) {
                    c3 = 'G';
                    break;
                }
                break;
            case 1308491624:
                if (str.equals("MISSING_RECAPTCHA_TOKEN")) {
                    c3 = 'H';
                    break;
                }
                break;
            case 1388786705:
                if (str.equals("INVALID_IDENTIFIER")) {
                    c3 = 'I';
                    break;
                }
                break;
            case 1433767024:
                if (str.equals("USER_DISABLED")) {
                    c3 = 'J';
                    break;
                }
                break;
            case 1442968770:
                if (str.equals("INVALID_PHONE_NUMBER")) {
                    c3 = 'K';
                    break;
                }
                break;
            case 1494923453:
                if (str.equals("INVALID_APP_CREDENTIAL")) {
                    c3 = 'L';
                    break;
                }
                break;
            case 1497901284:
                if (str.equals("TOO_MANY_ATTEMPTS_TRY_LATER")) {
                    c3 = 'M';
                    break;
                }
                break;
            case 1803454477:
                if (str.equals("MISSING_CONTINUE_URI")) {
                    c3 = 'N';
                    break;
                }
                break;
            case 1898790704:
                if (str.equals("MISSING_SESSION_INFO")) {
                    c3 = 'O';
                    break;
                }
                break;
            case 2063209097:
                if (str.equals("EMAIL_CHANGE_NEEDS_VERIFICATION")) {
                    c3 = 'P';
                    break;
                }
                break;
            case 2082564316:
                if (str.equals("UNSUPPORTED_TENANT_OPERATION")) {
                    c3 = 'Q';
                    break;
                }
                break;
        }
        switch (c3) {
            case 0:
                i2 = 18001;
                break;
            case 1:
                i2 = 17033;
                break;
            case 2:
                i2 = 17057;
                break;
            case 3:
                i2 = 17091;
                break;
            case 4:
            case 31:
            case '@':
                i2 = 17004;
                break;
            case 5:
                i2 = 17068;
                break;
            case zzaky.zzf.zzf /*6*/:
                i2 = 17052;
                break;
            case zzaky.zzf.zzg /*7*/:
                i2 = 17061;
                break;
            case 8:
                i2 = 17206;
                break;
            case 9:
                i2 = 17200;
                break;
            case 10:
                i2 = 17029;
                break;
            case ModuleDescriptor.MODULE_VERSION /*11*/:
                i2 = 17038;
                break;
            case 12:
                i2 = 17030;
                break;
            case 13:
                i2 = 17034;
                break;
            case 14:
                i2 = 17044;
                break;
            case 15:
                i2 = 17214;
                break;
            case 16:
                i2 = 17021;
                break;
            case 17:
                i2 = 17079;
                break;
            case 18:
                i2 = 18002;
                break;
            case 19:
                i2 = 17046;
                break;
            case 20:
                i2 = 17087;
                break;
            case 21:
            case 'I':
                i2 = 17008;
                break;
            case 22:
                i2 = 17085;
                break;
            case 23:
                i2 = 17094;
                break;
            case 24:
                i2 = 17064;
                break;
            case 25:
                i2 = 17016;
                break;
            case 26:
                i2 = 17084;
                break;
            case 27:
                i2 = 17035;
                break;
            case 28:
                i2 = 17014;
                break;
            case 29:
            case 'C':
                i2 = 17020;
                break;
            case 30:
                i2 = 17207;
                break;
            case ' ':
                i2 = 17203;
                break;
            case '!':
            case '4':
                i2 = 17006;
                break;
            case '\"':
                i2 = 17062;
                break;
            case '#':
                i2 = 17088;
                break;
            case '$':
                i2 = 17082;
                break;
            case '%':
            case '(':
                i2 = 17011;
                break;
            case '&':
                i2 = 17056;
                break;
            case '\'':
                i2 = 17026;
                break;
            case ')':
                i2 = 17089;
                break;
            case '*':
                i2 = 17032;
                break;
            case '+':
                i2 = 17041;
                break;
            case ',':
                i2 = 17074;
                break;
            case '-':
                i2 = 17081;
                break;
            case '.':
                i2 = 17095;
                break;
            case '/':
                i2 = 17007;
                break;
            case '0':
                i2 = 17017;
                break;
            case '1':
                i2 = 17065;
                break;
            case '2':
                i2 = 17204;
                break;
            case '3':
                i2 = 17205;
                break;
            case '5':
                i2 = 17086;
                break;
            case '6':
                i2 = 17075;
                break;
            case '7':
                i2 = 17083;
                break;
            case '8':
                i2 = 17049;
                break;
            case '9':
                i2 = 17071;
                break;
            case ':':
                i2 = 17002;
                break;
            case ';':
                i2 = 17058;
                break;
            case '<':
                i2 = 17078;
                break;
            case '=':
                i2 = 17093;
                break;
            case '>':
                i2 = 17031;
                break;
            case '?':
            case 'M':
                i2 = 17010;
                break;
            case 'A':
                i2 = 17000;
                break;
            case 'B':
                i2 = 17009;
                break;
            case 'D':
                i2 = 17202;
                break;
            case 'E':
                i2 = 17051;
                break;
            case 'F':
                i2 = 17043;
                break;
            case 'G':
                i2 = 17025;
                break;
            case 'H':
                i2 = 17201;
                break;
            case 'J':
                i2 = 17005;
                break;
            case 'K':
                i2 = 17042;
                break;
            case 'L':
                i2 = 17028;
                break;
            case 'N':
                i2 = 17040;
                break;
            case 'O':
                i2 = 17045;
                break;
            case 'P':
                i2 = 17090;
                break;
            case 'Q':
                i2 = 17073;
                break;
            default:
                i2 = 17499;
                break;
        }
        if (i2 != 17499) {
            return new Status(i2, str2, (PendingIntent) null, (C1132b) null);
        }
        if (str2 != null) {
            return new Status(i2, d.g(str, ":", str2), (PendingIntent) null, (C1132b) null);
        }
        return new Status(i2, str, (PendingIntent) null, (C1132b) null);
    }

    public static int I(int i2, int i5) {
        return ((A) Q(i2, false).get(i5)).f4275b;
    }

    public static ArrayList J(boolean z3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new A(0, R.string.school_military_lesson_0_name, R.string.school_military_lesson_0_description, R.drawable.school_military_lesson_0, 7, 500000, o.getSchoolObject().getMilitaryLessons().get(arrayList.size()).intValue()));
        arrayList.add(new A(1, R.string.school_military_lesson_1_name, R.string.school_military_lesson_1_description, R.drawable.school_military_lesson_1, 15, 5000000, o.getSchoolObject().getMilitaryLessons().get(arrayList.size()).intValue()));
        arrayList.add(new A(2, R.string.school_military_lesson_2_name, R.string.school_military_lesson_2_description, R.drawable.school_military_lesson_2, 15, 5000000, o.getSchoolObject().getMilitaryLessons().get(arrayList.size()).intValue()));
        arrayList.add(new A(3, R.string.school_military_lesson_3_name, R.string.school_military_lesson_3_description, R.drawable.school_military_lesson_3, 15, 5000000, o.getSchoolObject().getMilitaryLessons().get(arrayList.size()).intValue()));
        arrayList.add(new A(4, R.string.school_military_lesson_4_name, R.string.school_military_lesson_4_description, R.drawable.school_military_lesson_1, 30, 50000000, o.getSchoolObject().getMilitaryLessons().get(arrayList.size()).intValue()));
        arrayList.add(new A(5, R.string.school_military_lesson_5_name, R.string.school_military_lesson_5_description, R.drawable.school_military_lesson_2, 30, 50000000, o.getSchoolObject().getMilitaryLessons().get(arrayList.size()).intValue()));
        arrayList.add(new A(6, R.string.school_military_lesson_6_name, R.string.school_military_lesson_6_description, R.drawable.school_military_lesson_3, 30, 50000000, o.getSchoolObject().getMilitaryLessons().get(arrayList.size()).intValue()));
        if (z3) {
            h(3, arrayList);
        }
        return arrayList;
    }

    public static int K(int i2) {
        if (i2 == 0) {
            return R.string.city;
        }
        if (i2 == 1) {
            return R.string.hospital;
        }
        if (i2 == 2) {
            return R.string.prison;
        }
        if (i2 != 3) {
            return -1;
        }
        return R.string.plane;
    }

    public static long L(int i2) {
        switch (i2) {
            case 0:
                return 100000;
            case 1:
                return 500000;
            case 2:
                return 1000000;
            case 3:
                return 2000000;
            case 4:
                return 3000000;
            case 5:
                return 4000000;
            case zzaky.zzf.zzf /*6*/:
                return 5000000;
            case zzaky.zzf.zzg /*7*/:
                return 6000000;
            case 8:
                return 7000000;
            case 9:
                return 10000000;
            case 10:
                return 15000000;
            case ModuleDescriptor.MODULE_VERSION /*11*/:
                return 20000000;
            case 12:
                return 25000000;
            case 13:
                return 30000000;
            case 14:
                return 40000000;
            default:
                return 50000000;
        }
    }

    public static long M(int i2) {
        switch (i2) {
            case 0:
                return 1000;
            case 1:
                return 2500;
            case 2:
                return 6000;
            case 3:
                return 10000;
            case 4:
                return 15000;
            case 5:
                return 20000;
            case zzaky.zzf.zzf /*6*/:
                return 30000;
            case zzaky.zzf.zzg /*7*/:
                return 40000;
            case 8:
                return 50000;
            case 9:
                return 60000;
            case 10:
                return 70000;
            case ModuleDescriptor.MODULE_VERSION /*11*/:
                return 80000;
            case 12:
                return 100000;
            case 13:
                return 125000;
            case 14:
                return 150000;
            default:
                return 1500000;
        }
    }

    public static int N() {
        if (o.getLocationObject().getPlaceEndTimeInMilli() == -1) {
            return o.getLocationObject().getCurrentPlace();
        }
        if (W(Long.valueOf(o.getLocationObject().getPlaceEndTimeInMilli())) < f5744o) {
            return 0;
        }
        return o.getLocationObject().getCurrentPlace();
    }

    public static int P(int i2, int i5, int i6) {
        if (i2 == 0) {
            if (i5 == 0) {
                return i6 * 10;
            }
            return i6;
        } else if (i2 == 1) {
            if (i5 == 0) {
                return i6 * 100;
            }
            return i6;
        } else if (i2 != 2) {
            return i6;
        } else {
            if (i5 == 0) {
                return i6 / 500;
            }
            if (i5 == 1) {
                return i6 / 1000;
            }
            return i6;
        }
    }

    public static ArrayList Q(int i2, boolean z3) {
        if (i2 == 0) {
            return F(z3);
        }
        if (i2 == 1) {
            return J(z3);
        }
        if (i2 == 2) {
            return D(z3);
        }
        if (i2 == 3) {
            return S(z3);
        }
        if (i2 != 4) {
            return null;
        }
        return C(z3);
    }

    public static ArrayList R(d5.q qVar) {
        ArrayList arrayList = new ArrayList(Arrays.asList(new ArrayList[]{qVar.getLawLessons(), qVar.getMilitaryLessons(), qVar.getHistoryLessons(), qVar.getScienceLessons(), qVar.getGymLessons()}));
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (((Integer) ((ArrayList) arrayList.get(i2)).get(0)).intValue() == 2) {
                arrayList2.add(new y(MyApplication.f7090a.getApplicationContext().getString(I(i2, 0)), MyApplication.f7090a.getApplicationContext().getString(G(i2, 0))));
            }
            if (i2 == 2) {
                if (((Integer) ((ArrayList) arrayList.get(i2)).get(3)).intValue() == 2) {
                    arrayList4.add(new y(MyApplication.f7090a.getApplicationContext().getString(I(i2, 3)), MyApplication.f7090a.getApplicationContext().getString(G(i2, 3))));
                } else if (((Integer) ((ArrayList) arrayList.get(i2)).get(1)).intValue() == 2) {
                    arrayList3.add(new y(MyApplication.f7090a.getApplicationContext().getString(I(i2, 1)), MyApplication.f7090a.getApplicationContext().getString(G(i2, 1))));
                }
                if (((Integer) ((ArrayList) arrayList.get(i2)).get(4)).intValue() == 2) {
                    arrayList4.add(new y(MyApplication.f7090a.getApplicationContext().getString(I(i2, 4)), MyApplication.f7090a.getApplicationContext().getString(G(i2, 4))));
                } else if (((Integer) ((ArrayList) arrayList.get(i2)).get(2)).intValue() == 2) {
                    arrayList3.add(new y(MyApplication.f7090a.getApplicationContext().getString(I(i2, 2)), MyApplication.f7090a.getApplicationContext().getString(G(i2, 2))));
                }
            }
            if (!(i2 == 2 || i2 == 4)) {
                if (((Integer) ((ArrayList) arrayList.get(i2)).get(4)).intValue() == 2) {
                    arrayList4.add(new y(MyApplication.f7090a.getApplicationContext().getString(I(i2, 4)), MyApplication.f7090a.getApplicationContext().getString(G(i2, 4))));
                } else if (((Integer) ((ArrayList) arrayList.get(i2)).get(1)).intValue() == 2) {
                    arrayList3.add(new y(MyApplication.f7090a.getApplicationContext().getString(I(i2, 1)), MyApplication.f7090a.getApplicationContext().getString(G(i2, 1))));
                }
            }
            if (i2 != 2) {
                if (((Integer) ((ArrayList) arrayList.get(i2)).get(5)).intValue() == 2) {
                    arrayList4.add(new y(MyApplication.f7090a.getApplicationContext().getString(I(i2, 5)), MyApplication.f7090a.getApplicationContext().getString(G(i2, 5))));
                } else if (i2 != 4) {
                    if (((Integer) ((ArrayList) arrayList.get(i2)).get(2)).intValue() == 2) {
                        arrayList3.add(new y(MyApplication.f7090a.getApplicationContext().getString(I(i2, 2)), MyApplication.f7090a.getApplicationContext().getString(G(i2, 2))));
                    }
                } else if (((Integer) ((ArrayList) arrayList.get(i2)).get(1)).intValue() == 2) {
                    arrayList3.add(new y(MyApplication.f7090a.getApplicationContext().getString(I(i2, 1)), MyApplication.f7090a.getApplicationContext().getString(G(i2, 1))));
                }
                if (((Integer) ((ArrayList) arrayList.get(i2)).get(6)).intValue() == 2) {
                    arrayList4.add(new y(MyApplication.f7090a.getApplicationContext().getString(I(i2, 6)), MyApplication.f7090a.getApplicationContext().getString(G(i2, 6))));
                } else if (i2 != 4) {
                    if (((Integer) ((ArrayList) arrayList.get(i2)).get(3)).intValue() == 2) {
                        arrayList3.add(new y(MyApplication.f7090a.getApplicationContext().getString(I(i2, 3)), MyApplication.f7090a.getApplicationContext().getString(G(i2, 3))));
                    }
                } else if (((Integer) ((ArrayList) arrayList.get(i2)).get(2)).intValue() == 2) {
                    arrayList3.add(new y(MyApplication.f7090a.getApplicationContext().getString(I(i2, 2)), MyApplication.f7090a.getApplicationContext().getString(G(i2, 2))));
                }
            }
            if (i2 == 4) {
                if (((Integer) ((ArrayList) arrayList.get(i2)).get(7)).intValue() == 2) {
                    arrayList4.add(new y(MyApplication.f7090a.getApplicationContext().getString(I(i2, 7)), MyApplication.f7090a.getApplicationContext().getString(G(i2, 7))));
                } else if (((Integer) ((ArrayList) arrayList.get(i2)).get(3)).intValue() == 2) {
                    arrayList3.add(new y(MyApplication.f7090a.getApplicationContext().getString(I(i2, 3)), MyApplication.f7090a.getApplicationContext().getString(G(i2, 3))));
                }
                if (((Integer) ((ArrayList) arrayList.get(i2)).get(8)).intValue() == 2) {
                    arrayList4.add(new y(MyApplication.f7090a.getApplicationContext().getString(I(i2, 8)), MyApplication.f7090a.getApplicationContext().getString(G(i2, 8))));
                } else if (((Integer) ((ArrayList) arrayList.get(i2)).get(4)).intValue() == 2) {
                    arrayList3.add(new y(MyApplication.f7090a.getApplicationContext().getString(I(i2, 4)), MyApplication.f7090a.getApplicationContext().getString(G(i2, 4))));
                }
            }
        }
        ArrayList arrayList5 = new ArrayList();
        arrayList5.addAll(arrayList2);
        arrayList5.addAll(arrayList3);
        arrayList5.addAll(arrayList4);
        return arrayList5;
    }

    public static ArrayList S(boolean z3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new A(0, R.string.school_science_lesson_0_name, R.string.school_science_lesson_0_description, R.drawable.school_science_lesson_0, 7, 500000, o.getSchoolObject().getScienceLessons().get(arrayList.size()).intValue()));
        arrayList.add(new A(1, R.string.school_science_lesson_1_name, R.string.school_science_lesson_1_description, R.drawable.school_science_lesson_1, 15, 5000000, o.getSchoolObject().getScienceLessons().get(arrayList.size()).intValue()));
        arrayList.add(new A(2, R.string.school_science_lesson_2_name, R.string.school_science_lesson_2_description, R.drawable.school_science_lesson_2, 15, 5000000, o.getSchoolObject().getScienceLessons().get(arrayList.size()).intValue()));
        arrayList.add(new A(3, R.string.school_science_lesson_3_name, R.string.school_science_lesson_3_description, R.drawable.school_science_lesson_3, 15, 5000000, o.getSchoolObject().getScienceLessons().get(arrayList.size()).intValue()));
        arrayList.add(new A(4, R.string.school_science_lesson_4_name, R.string.school_science_lesson_4_description, R.drawable.school_science_lesson_1, 30, 50000000, o.getSchoolObject().getScienceLessons().get(arrayList.size()).intValue()));
        arrayList.add(new A(5, R.string.school_science_lesson_5_name, R.string.school_science_lesson_5_description, R.drawable.school_science_lesson_2, 30, 50000000, o.getSchoolObject().getScienceLessons().get(arrayList.size()).intValue()));
        arrayList.add(new A(6, R.string.school_science_lesson_6_name, R.string.school_science_lesson_6_description, R.drawable.school_science_lesson_3, 30, 50000000, o.getSchoolObject().getScienceLessons().get(arrayList.size()).intValue()));
        if (z3) {
            h(3, arrayList);
        }
        return arrayList;
    }

    public static long T(long j6) {
        long j7 = f5744o;
        if (j7 < j6) {
            return j6 - j7;
        }
        return 0;
    }

    public static long U(long j6) {
        long j7 = f5744o;
        if (j6 < j7) {
            return j7 - j6;
        }
        return 0;
    }

    public static int V(int i2) {
        switch (i2) {
            case 1:
                return R.string.gang_skill_special_name_full_power;
            case 2:
                return R.string.gang_skill_special_name_statics;
            case 3:
                return R.string.gang_skill_name_almighty;
            case 4:
                return R.string.gang_skill_name_hard_to_kill;
            case 5:
                return R.string.gang_skill_name_speed_demon;
            case zzaky.zzf.zzf /*6*/:
                return R.string.gang_skill_name_shadow_moves;
            case zzaky.zzf.zzg /*7*/:
                return R.string.gang_skill_name_weapons_expert;
            case 8:
                return R.string.gang_skill_name_armors_expert;
            case 9:
                return R.string.gang_skill_name_critical_hit;
            case 10:
                return R.string.gang_skill_name_bag;
            case ModuleDescriptor.MODULE_VERSION /*11*/:
                return R.string.gang_skill_name_prompt_recovery;
            case 12:
                return R.string.gang_skill_name_vigorous;
            case 13:
                return R.string.gang_skill_name_fearless;
            case 14:
                return R.string.gang_skill_name_gym_results;
            case 15:
                return R.string.gang_skill_name_chain_time;
            default:
                return 0;
        }
    }

    public static long W(Object obj) {
        if (obj instanceof Double) {
            return Math.round(((Double) obj).doubleValue()) / 1000;
        }
        return ((Long) obj).longValue() / 1000;
    }

    public static String X(Object obj) {
        long longValue = f5744o - (((Long) obj).longValue() / 1000);
        if (longValue < 0) {
            longValue = 0;
        }
        if (longValue < 60) {
            return MyApplication.f7090a.getApplicationContext().getString(R.string.seconds_ago_with_value, new Object[]{Long.valueOf(longValue)});
        }
        if (longValue < 3600) {
            return MyApplication.f7090a.getApplicationContext().getString(R.string.minutes_ago_with_value, new Object[]{Long.valueOf(longValue / 60)});
        }
        if (longValue < 86400) {
            return MyApplication.f7090a.getApplicationContext().getString(R.string.hours_ago_with_value, new Object[]{Long.valueOf((longValue / 60) / 60)});
        }
        if (longValue < 2592000) {
            return MyApplication.f7090a.getApplicationContext().getString(R.string.days_ago_with_value, new Object[]{Long.valueOf(((longValue / 60) / 60) / 24)});
        }
        if (longValue < 31104000) {
            return MyApplication.f7090a.getApplicationContext().getString(R.string.months_ago_with_value, new Object[]{Long.valueOf((((longValue / 60) / 60) / 24) / 30)});
        }
        return MyApplication.f7090a.getApplicationContext().getString(R.string.years_ago_with_value, new Object[]{Long.valueOf(((((longValue / 60) / 60) / 24) / 30) / 12)});
    }

    public static long Y(long j6) {
        Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        instance.setTimeInMillis(j6 * 1000);
        instance.set(instance.get(1), instance.get(2), instance.get(5), 0, 0, 0);
        return instance.getTimeInMillis() / 1000;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002e A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean Z() {
        /*
            r0 = 1
            r1 = 0
            com.mtma.criminal.city.app.MyApplication r2 = com.mtma.criminal.city.app.MyApplication.f7090a     // Catch:{ Exception -> 0x0016 }
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ Exception -> 0x0016 }
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ Exception -> 0x0016 }
            java.lang.String r3 = "auto_time"
            int r2 = android.provider.Settings.Global.getInt(r2, r3)     // Catch:{ Exception -> 0x0016 }
            if (r2 != r0) goto L_0x0016
            r2 = r0
            goto L_0x0017
        L_0x0016:
            r2 = r1
        L_0x0017:
            com.mtma.criminal.city.app.MyApplication r3 = com.mtma.criminal.city.app.MyApplication.f7090a     // Catch:{ Exception -> 0x002b }
            android.content.Context r3 = r3.getApplicationContext()     // Catch:{ Exception -> 0x002b }
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch:{ Exception -> 0x002b }
            java.lang.String r4 = "auto_time_zone"
            int r3 = android.provider.Settings.Global.getInt(r3, r4)     // Catch:{ Exception -> 0x002b }
            if (r3 != r0) goto L_0x002b
            r3 = r0
            goto L_0x002c
        L_0x002b:
            r3 = r1
        L_0x002c:
            if (r2 == 0) goto L_0x0031
            if (r3 == 0) goto L_0x0031
            goto L_0x0032
        L_0x0031:
            r0 = r1
        L_0x0032:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.c.Z():boolean");
    }

    public static void a(Throwable th, Throwable th2) {
        j.e(th, "<this>");
        j.e(th2, "exception");
        if (th != th2) {
            Integer num = t5.a.f11772a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = s5.a.f11566a;
            if (method != null) {
                method.invoke(th, new Object[]{th2});
            }
        }
    }

    public static void b(String str, boolean z3) {
        if (!z3) {
            throw new IllegalArgumentException(str);
        }
    }

    public static boolean b0(long j6, long j7) {
        if (W(Long.valueOf(j6)) >= Y(j7)) {
            return true;
        }
        return false;
    }

    public static void c(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: T3.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: T3.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: T3.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: T3.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v21, resolved type: T3.d} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0089 A[SYNTHETIC, Splitter:B:33:0x0089] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0156 A[SYNTHETIC, Splitter:B:86:0x0156] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0172 A[SYNTHETIC, Splitter:B:92:0x0172] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x018d A[SYNTHETIC, Splitter:B:98:0x018d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void c0(android.content.Intent r22) {
        /*
            r1 = r22
            boolean r0 = p0(r22)
            if (r0 == 0) goto L_0x0011
            java.lang.String r0 = "_nr"
            android.os.Bundle r2 = r22.getExtras()
            d0(r2, r0)
        L_0x0011:
            r0 = 0
            if (r1 == 0) goto L_0x0026
            java.lang.String r2 = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT"
            java.lang.String r3 = r22.getAction()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0021
            goto L_0x0026
        L_0x0021:
            boolean r2 = m()
            goto L_0x0027
        L_0x0026:
            r2 = r0
        L_0x0027:
            if (r2 == 0) goto L_0x020f
            K3.b r2 = com.google.firebase.messaging.FirebaseMessaging.f6902m
            java.lang.Object r2 = r2.get()
            Z0.f r2 = (Z0.f) r2
            java.lang.String r3 = "FirebaseMessaging"
            if (r2 != 0) goto L_0x003c
            java.lang.String r0 = "TransportFactory is null. Skip exporting message delivery metrics to Big Query"
            android.util.Log.e(r3, r0)
            goto L_0x020f
        L_0x003c:
            r4 = 0
            if (r1 != 0) goto L_0x0041
            goto L_0x01c6
        L_0x0041:
            android.os.Bundle r5 = r22.getExtras()
            if (r5 != 0) goto L_0x0049
            android.os.Bundle r5 = android.os.Bundle.EMPTY
        L_0x0049:
            java.lang.String r6 = "google.ttl"
            java.lang.Object r6 = r5.get(r6)
            boolean r7 = r6 instanceof java.lang.Integer
            if (r7 == 0) goto L_0x005c
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
        L_0x0059:
            r16 = r6
            goto L_0x007b
        L_0x005c:
            boolean r7 = r6 instanceof java.lang.String
            if (r7 == 0) goto L_0x0079
            r7 = r6
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ NumberFormatException -> 0x0068 }
            int r6 = java.lang.Integer.parseInt(r7)     // Catch:{ NumberFormatException -> 0x0068 }
            goto L_0x0059
        L_0x0068:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Invalid TTL: "
            r7.<init>(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            android.util.Log.w(r3, r6)
        L_0x0079:
            r16 = r0
        L_0x007b:
            java.lang.String r6 = "google.to"
            java.lang.String r6 = r5.getString(r6)
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 != 0) goto L_0x0089
        L_0x0087:
            r11 = r6
            goto L_0x00a2
        L_0x0089:
            R2.i r6 = R2.i.e()     // Catch:{ ExecutionException -> 0x0208, InterruptedException -> 0x0206 }
            java.lang.Object r7 = L3.d.f1716m     // Catch:{ ExecutionException -> 0x0208, InterruptedException -> 0x0206 }
            java.lang.Class<L3.e> r7 = L3.e.class
            java.lang.Object r6 = r6.c(r7)     // Catch:{ ExecutionException -> 0x0208, InterruptedException -> 0x0206 }
            L3.d r6 = (L3.d) r6     // Catch:{ ExecutionException -> 0x0208, InterruptedException -> 0x0206 }
            com.google.android.gms.tasks.Task r6 = r6.c()     // Catch:{ ExecutionException -> 0x0208, InterruptedException -> 0x0206 }
            java.lang.Object r6 = com.google.android.gms.tasks.Tasks.await(r6)     // Catch:{ ExecutionException -> 0x0208, InterruptedException -> 0x0206 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ ExecutionException -> 0x0208, InterruptedException -> 0x0206 }
            goto L_0x0087
        L_0x00a2:
            R2.i r6 = R2.i.e()
            r6.b()
            android.content.Context r6 = r6.f2490a
            java.lang.String r13 = r6.getPackageName()
            boolean r6 = S3.t.p(r5)
            if (r6 == 0) goto L_0x00b9
            T3.b r6 = T3.b.DISPLAY_NOTIFICATION
        L_0x00b7:
            r12 = r6
            goto L_0x00bc
        L_0x00b9:
            T3.b r6 = T3.b.DATA_MESSAGE
            goto L_0x00b7
        L_0x00bc:
            java.lang.String r6 = "google.delivered_priority"
            java.lang.String r6 = r5.getString(r6)
            r7 = 2
            r8 = 1
            if (r6 != 0) goto L_0x00dc
            java.lang.String r6 = "google.priority_reduced"
            java.lang.String r6 = r5.getString(r6)
            java.lang.String r9 = "1"
            boolean r6 = r9.equals(r6)
            if (r6 == 0) goto L_0x00d6
        L_0x00d4:
            r6 = r7
            goto L_0x00f0
        L_0x00d6:
            java.lang.String r6 = "google.priority"
            java.lang.String r6 = r5.getString(r6)
        L_0x00dc:
            java.lang.String r9 = "high"
            boolean r9 = r9.equals(r6)
            if (r9 == 0) goto L_0x00e6
            r6 = r8
            goto L_0x00f0
        L_0x00e6:
            java.lang.String r9 = "normal"
            boolean r6 = r9.equals(r6)
            if (r6 == 0) goto L_0x00ef
            goto L_0x00d4
        L_0x00ef:
            r6 = r0
        L_0x00f0:
            if (r6 != r7) goto L_0x00f5
            r0 = 5
        L_0x00f3:
            r15 = r0
            goto L_0x00fa
        L_0x00f5:
            if (r6 != r8) goto L_0x00f3
            r0 = 10
            goto L_0x00f3
        L_0x00fa:
            java.lang.String r0 = "google.message_id"
            java.lang.String r0 = r5.getString(r0)
            if (r0 != 0) goto L_0x0108
            java.lang.String r0 = "message_id"
            java.lang.String r0 = r5.getString(r0)
        L_0x0108:
            java.lang.String r6 = ""
            if (r0 == 0) goto L_0x010e
            r10 = r0
            goto L_0x010f
        L_0x010e:
            r10 = r6
        L_0x010f:
            java.lang.String r0 = "from"
            java.lang.String r0 = r5.getString(r0)
            if (r0 == 0) goto L_0x0120
            java.lang.String r9 = "/topics/"
            boolean r9 = r0.startsWith(r9)
            if (r9 == 0) goto L_0x0120
            r4 = r0
        L_0x0120:
            if (r4 == 0) goto L_0x0125
            r17 = r4
            goto L_0x0127
        L_0x0125:
            r17 = r6
        L_0x0127:
            java.lang.String r0 = "collapse_key"
            java.lang.String r0 = r5.getString(r0)
            if (r0 == 0) goto L_0x0131
            r14 = r0
            goto L_0x0132
        L_0x0131:
            r14 = r6
        L_0x0132:
            java.lang.String r0 = "google.c.a.m_l"
            java.lang.String r0 = r5.getString(r0)
            if (r0 == 0) goto L_0x013d
            r18 = r0
            goto L_0x013f
        L_0x013d:
            r18 = r6
        L_0x013f:
            java.lang.String r0 = "google.c.a.c_l"
            java.lang.String r0 = r5.getString(r0)
            if (r0 == 0) goto L_0x014a
            r19 = r0
            goto L_0x014c
        L_0x014a:
            r19 = r6
        L_0x014c:
            java.lang.String r0 = "google.c.sender.id"
            boolean r4 = r5.containsKey(r0)
            r20 = 0
            if (r4 == 0) goto L_0x0165
            java.lang.String r0 = r5.getString(r0)     // Catch:{ NumberFormatException -> 0x015f }
            long r4 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x015f }
            goto L_0x01b8
        L_0x015f:
            r0 = move-exception
            java.lang.String r4 = "error parsing project number"
            android.util.Log.w(r3, r4, r0)
        L_0x0165:
            R2.i r4 = R2.i.e()
            r4.b()
            R2.m r5 = r4.f2492c
            java.lang.String r0 = r5.f2503e
            if (r0 == 0) goto L_0x017e
            long r4 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0177 }
            goto L_0x01b8
        L_0x0177:
            r0 = move-exception
            r6 = r0
            java.lang.String r0 = "error parsing sender ID"
            android.util.Log.w(r3, r0, r6)
        L_0x017e:
            r4.b()
            java.lang.String r0 = r5.f2501b
            java.lang.String r4 = "1:"
            boolean r4 = r0.startsWith(r4)
            java.lang.String r5 = "error parsing app ID"
            if (r4 != 0) goto L_0x0198
            long r4 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0192 }
            goto L_0x01b8
        L_0x0192:
            r0 = move-exception
            r4 = r0
            android.util.Log.w(r3, r5, r4)
            goto L_0x01a1
        L_0x0198:
            java.lang.String r4 = ":"
            java.lang.String[] r0 = r0.split(r4)
            int r4 = r0.length
            if (r4 >= r7) goto L_0x01a4
        L_0x01a1:
            r4 = r20
            goto L_0x01b8
        L_0x01a4:
            r0 = r0[r8]
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L_0x01ad
            goto L_0x01a1
        L_0x01ad:
            long r4 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x01b2 }
            goto L_0x01b8
        L_0x01b2:
            r0 = move-exception
            r4 = r0
            android.util.Log.w(r3, r5, r4)
            goto L_0x01a1
        L_0x01b8:
            int r0 = (r4 > r20 ? 1 : (r4 == r20 ? 0 : -1))
            if (r0 <= 0) goto L_0x01be
            r8 = r4
            goto L_0x01c0
        L_0x01be:
            r8 = r20
        L_0x01c0:
            T3.d r4 = new T3.d
            r7 = r4
            r7.<init>(r8, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
        L_0x01c6:
            if (r4 != 0) goto L_0x01c9
            goto L_0x020f
        L_0x01c9:
            java.lang.String r0 = "google.product_id"
            r5 = 111881503(0x6ab2d1f, float:6.438935E-35)
            int r0 = r1.getIntExtra(r0, r5)     // Catch:{ RuntimeException -> 0x01ff }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ RuntimeException -> 0x01ff }
            Z0.b r1 = new Z0.b     // Catch:{ RuntimeException -> 0x01ff }
            r1.<init>(r0)     // Catch:{ RuntimeException -> 0x01ff }
            java.lang.String r0 = "FCM_CLIENT_EVENT_LOGGING"
            java.lang.String r5 = "proto"
            Z0.c r6 = new Z0.c     // Catch:{ RuntimeException -> 0x01ff }
            r6.<init>(r5)     // Catch:{ RuntimeException -> 0x01ff }
            D2.l r5 = new D2.l     // Catch:{ RuntimeException -> 0x01ff }
            r7 = 20
            r5.<init>(r7)     // Catch:{ RuntimeException -> 0x01ff }
            c1.o r2 = (c1.o) r2     // Catch:{ RuntimeException -> 0x01ff }
            F3.k r0 = r2.a(r0, r6, r5)     // Catch:{ RuntimeException -> 0x01ff }
            T3.e r2 = new T3.e     // Catch:{ RuntimeException -> 0x01ff }
            r2.<init>(r4)     // Catch:{ RuntimeException -> 0x01ff }
            Z0.a r4 = new Z0.a     // Catch:{ RuntimeException -> 0x01ff }
            r4.<init>(r2, r1)     // Catch:{ RuntimeException -> 0x01ff }
            r0.p(r4)     // Catch:{ RuntimeException -> 0x01ff }
            goto L_0x020f
        L_0x01ff:
            r0 = move-exception
            java.lang.String r1 = "Failed to send big query analytics payload."
            android.util.Log.w(r3, r1, r0)
            goto L_0x020f
        L_0x0206:
            r0 = move-exception
            goto L_0x0209
        L_0x0208:
            r0 = move-exception
        L_0x0209:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x020f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.c.c0(android.content.Intent):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:129:0x045b  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0470  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0485  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x04b8  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0469 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void d(long r12) {
        /*
            d5.q r0 = d5.o.getSchoolObject()
            boolean r0 = r0.isStudying()
            if (r0 == 0) goto L_0x04e3
            int r0 = w()
            r1 = 0
            java.util.ArrayList r0 = Q(r0, r1)
            int r2 = x()
            java.lang.Object r0 = r0.get(r2)
            Y4.A r0 = (Y4.A) r0
            int r0 = r0.f4277e
            int r0 = r0 * 24
            r2 = 21
            double r2 = K1.e.S(r2)
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r4 = r4 - r2
            double r2 = (double) r0
            double r2 = r2 * r4
            r4 = 4633641066610819072(0x404e000000000000, double:60.0)
            double r2 = r2 * r4
            double r2 = r2 * r4
            int r0 = (int) r2
            long r2 = (long) r0
            int r0 = w()
            int r4 = x()
            d5.q r5 = d5.o.getSchoolObject()
            java.lang.Object r5 = r5.getStartStudyingTimeInMilli()
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            r7 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 / r7
            long r12 = r12 - r5
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 < 0) goto L_0x04e3
            i3.h r12 = i3.C0592h.b()
            i3.f r12 = r12.e()
            java.lang.String r13 = "players"
            i3.f r12 = com.google.android.gms.internal.measurement.a.c(r12, r13)
            java.lang.String r2 = "schoolObject"
            java.lang.String r3 = "studying"
            i3.f r12 = com.google.android.gms.internal.measurement.a.d(r12, r2, r3)
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r12.I(r3)
            i3.h r12 = i3.C0592h.b()
            i3.f r12 = r12.e()
            i3.f r12 = com.google.android.gms.internal.measurement.a.c(r12, r13)
            java.lang.String r3 = "startStudyingTimeInMilli"
            i3.f r12 = com.google.android.gms.internal.measurement.a.d(r12, r2, r3)
            r3 = -1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            r12.I(r5)
            i3.h r12 = i3.C0592h.b()
            i3.f r12 = r12.e()
            i3.f r12 = com.google.android.gms.internal.measurement.a.c(r12, r13)
            i3.f r12 = com.google.android.gms.internal.measurement.a.v(r12, r2)
            r13 = 1
            r2 = 0
            r5 = 4
            r6 = 3
            r7 = 2
            if (r0 == 0) goto L_0x00b2
            if (r0 == r13) goto L_0x00af
            if (r0 == r7) goto L_0x00ac
            if (r0 == r6) goto L_0x00a9
            if (r0 == r5) goto L_0x00a6
            r8 = r2
            goto L_0x00b4
        L_0x00a6:
            java.lang.String r8 = "gymLessons"
            goto L_0x00b4
        L_0x00a9:
            java.lang.String r8 = "scienceLessons"
            goto L_0x00b4
        L_0x00ac:
            java.lang.String r8 = "historyLessons"
            goto L_0x00b4
        L_0x00af:
            java.lang.String r8 = "militaryLessons"
            goto L_0x00b4
        L_0x00b2:
            java.lang.String r8 = "lawLessons"
        L_0x00b4:
            i3.f r12 = r12.E(r8)
            java.lang.String r8 = java.lang.String.valueOf(r4)
            i3.f r12 = r12.E(r8)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r12.I(r8)
            d5.q r12 = d5.o.getSchoolObject()
            r12.setStudying(r1)
            d5.q r12 = d5.o.getSchoolObject()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            r12.setStartStudyingTimeInMilli(r8)
            if (r0 == 0) goto L_0x0124
            if (r0 == r13) goto L_0x0114
            if (r0 == r7) goto L_0x0104
            if (r0 == r6) goto L_0x00f4
            if (r0 == r5) goto L_0x00e4
            goto L_0x0133
        L_0x00e4:
            d5.q r12 = d5.o.getSchoolObject()
            java.util.ArrayList r12 = r12.getGymLessons()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r12.set(r4, r8)
            goto L_0x0133
        L_0x00f4:
            d5.q r12 = d5.o.getSchoolObject()
            java.util.ArrayList r12 = r12.getScienceLessons()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r12.set(r4, r8)
            goto L_0x0133
        L_0x0104:
            d5.q r12 = d5.o.getSchoolObject()
            java.util.ArrayList r12 = r12.getHistoryLessons()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r12.set(r4, r8)
            goto L_0x0133
        L_0x0114:
            d5.q r12 = d5.o.getSchoolObject()
            java.util.ArrayList r12 = r12.getMilitaryLessons()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r12.set(r4, r8)
            goto L_0x0133
        L_0x0124:
            d5.q r12 = d5.o.getSchoolObject()
            java.util.ArrayList r12 = r12.getLawLessons()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r12.set(r4, r8)
        L_0x0133:
            d5.q r12 = d5.o.getSchoolObject()
            java.util.ArrayList r12 = r12.getLawLessons()
            java.lang.Object r12 = r12.get(r5)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r8 = 6
            if (r12 != r7) goto L_0x0268
            d5.q r12 = d5.o.getSchoolObject()
            java.util.ArrayList r12 = r12.getLawLessons()
            r9 = 5
            java.lang.Object r12 = r12.get(r9)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            if (r12 != r7) goto L_0x0268
            d5.q r12 = d5.o.getSchoolObject()
            java.util.ArrayList r12 = r12.getLawLessons()
            java.lang.Object r12 = r12.get(r8)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            if (r12 != r7) goto L_0x0268
            d5.q r12 = d5.o.getSchoolObject()
            java.util.ArrayList r12 = r12.getMilitaryLessons()
            java.lang.Object r12 = r12.get(r5)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            if (r12 != r7) goto L_0x0268
            d5.q r12 = d5.o.getSchoolObject()
            java.util.ArrayList r12 = r12.getMilitaryLessons()
            java.lang.Object r12 = r12.get(r9)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            if (r12 != r7) goto L_0x0268
            d5.q r12 = d5.o.getSchoolObject()
            java.util.ArrayList r12 = r12.getMilitaryLessons()
            java.lang.Object r12 = r12.get(r8)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            if (r12 != r7) goto L_0x0268
            d5.q r12 = d5.o.getSchoolObject()
            java.util.ArrayList r12 = r12.getHistoryLessons()
            java.lang.Object r12 = r12.get(r6)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            if (r12 != r7) goto L_0x0268
            d5.q r12 = d5.o.getSchoolObject()
            java.util.ArrayList r12 = r12.getHistoryLessons()
            java.lang.Object r12 = r12.get(r5)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            if (r12 != r7) goto L_0x0268
            d5.q r12 = d5.o.getSchoolObject()
            java.util.ArrayList r12 = r12.getScienceLessons()
            java.lang.Object r12 = r12.get(r5)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            if (r12 != r7) goto L_0x0268
            d5.q r12 = d5.o.getSchoolObject()
            java.util.ArrayList r12 = r12.getScienceLessons()
            java.lang.Object r12 = r12.get(r9)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            if (r12 != r7) goto L_0x0268
            d5.q r12 = d5.o.getSchoolObject()
            java.util.ArrayList r12 = r12.getScienceLessons()
            java.lang.Object r12 = r12.get(r8)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            if (r12 != r7) goto L_0x0268
            d5.q r12 = d5.o.getSchoolObject()
            java.util.ArrayList r12 = r12.getGymLessons()
            java.lang.Object r12 = r12.get(r9)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            if (r12 != r7) goto L_0x0268
            d5.q r12 = d5.o.getSchoolObject()
            java.util.ArrayList r12 = r12.getGymLessons()
            java.lang.Object r12 = r12.get(r8)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            if (r12 != r7) goto L_0x0268
            d5.q r12 = d5.o.getSchoolObject()
            java.util.ArrayList r12 = r12.getGymLessons()
            r9 = 7
            java.lang.Object r12 = r12.get(r9)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            if (r12 != r7) goto L_0x0268
            d5.q r12 = d5.o.getSchoolObject()
            java.util.ArrayList r12 = r12.getGymLessons()
            r9 = 8
            java.lang.Object r12 = r12.get(r9)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            if (r12 != r7) goto L_0x0268
            r12 = 40
            goto L_0x03ff
        L_0x0268:
            d5.q r12 = d5.o.getSchoolObject()
            java.util.ArrayList r12 = r12.getLawLessons()
            java.lang.Object r12 = r12.get(r13)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            if (r12 != r7) goto L_0x0397
            d5.q r12 = d5.o.getSchoolObject()
            java.util.ArrayList r12 = r12.getLawLessons()
            java.lang.Object r12 = r12.get(r7)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            if (r12 != r7) goto L_0x0397
            d5.q r12 = d5.o.getSchoolObject()
            java.util.ArrayList r12 = r12.getLawLessons()
            java.lang.Object r12 = r12.get(r6)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            if (r12 != r7) goto L_0x0397
            d5.q r12 = d5.o.getSchoolObject()
            java.util.ArrayList r12 = r12.getMilitaryLessons()
            java.lang.Object r12 = r12.get(r13)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            if (r12 != r7) goto L_0x0397
            d5.q r12 = d5.o.getSchoolObject()
            java.util.ArrayList r12 = r12.getMilitaryLessons()
            java.lang.Object r12 = r12.get(r7)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            if (r12 != r7) goto L_0x0397
            d5.q r12 = d5.o.getSchoolObject()
            java.util.ArrayList r12 = r12.getMilitaryLessons()
            java.lang.Object r12 = r12.get(r6)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            if (r12 != r7) goto L_0x0397
            d5.q r12 = d5.o.getSchoolObject()
            java.util.ArrayList r12 = r12.getHistoryLessons()
            java.lang.Object r12 = r12.get(r13)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            if (r12 != r7) goto L_0x0397
            d5.q r12 = d5.o.getSchoolObject()
            java.util.ArrayList r12 = r12.getHistoryLessons()
            java.lang.Object r12 = r12.get(r7)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            if (r12 != r7) goto L_0x0397
            d5.q r12 = d5.o.getSchoolObject()
            java.util.ArrayList r12 = r12.getScienceLessons()
            java.lang.Object r12 = r12.get(r13)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            if (r12 != r7) goto L_0x0397
            d5.q r12 = d5.o.getSchoolObject()
            java.util.ArrayList r12 = r12.getScienceLessons()
            java.lang.Object r12 = r12.get(r7)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            if (r12 != r7) goto L_0x0397
            d5.q r12 = d5.o.getSchoolObject()
            java.util.ArrayList r12 = r12.getScienceLessons()
            java.lang.Object r12 = r12.get(r6)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            if (r12 != r7) goto L_0x0397
            d5.q r12 = d5.o.getSchoolObject()
            java.util.ArrayList r12 = r12.getGymLessons()
            java.lang.Object r12 = r12.get(r13)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            if (r12 != r7) goto L_0x0397
            d5.q r12 = d5.o.getSchoolObject()
            java.util.ArrayList r12 = r12.getGymLessons()
            java.lang.Object r12 = r12.get(r7)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            if (r12 != r7) goto L_0x0397
            d5.q r12 = d5.o.getSchoolObject()
            java.util.ArrayList r12 = r12.getGymLessons()
            java.lang.Object r12 = r12.get(r6)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            if (r12 != r7) goto L_0x0397
            d5.q r12 = d5.o.getSchoolObject()
            java.util.ArrayList r12 = r12.getGymLessons()
            java.lang.Object r12 = r12.get(r5)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            if (r12 != r7) goto L_0x0397
            r12 = 39
            goto L_0x03ff
        L_0x0397:
            d5.q r12 = d5.o.getSchoolObject()
            java.util.ArrayList r12 = r12.getLawLessons()
            java.lang.Object r12 = r12.get(r1)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            if (r12 != r7) goto L_0x03fe
            d5.q r12 = d5.o.getSchoolObject()
            java.util.ArrayList r12 = r12.getMilitaryLessons()
            java.lang.Object r12 = r12.get(r1)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            if (r12 != r7) goto L_0x03fe
            d5.q r12 = d5.o.getSchoolObject()
            java.util.ArrayList r12 = r12.getHistoryLessons()
            java.lang.Object r12 = r12.get(r1)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            if (r12 != r7) goto L_0x03fe
            d5.q r12 = d5.o.getSchoolObject()
            java.util.ArrayList r12 = r12.getScienceLessons()
            java.lang.Object r12 = r12.get(r1)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            if (r12 != r7) goto L_0x03fe
            d5.q r12 = d5.o.getSchoolObject()
            java.util.ArrayList r12 = r12.getGymLessons()
            java.lang.Object r12 = r12.get(r1)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            if (r12 != r7) goto L_0x03fe
            r12 = 38
            goto L_0x03ff
        L_0x03fe:
            r12 = r3
        L_0x03ff:
            if (r12 == r3) goto L_0x040d
            d5.a r9 = d5.o.getAccountObject()
            java.lang.String r9 = r9.getId()
            long r10 = (long) r13
            com.mtma.criminal.city.utils.Q.b(r12, r9, r10)
        L_0x040d:
            if (r4 != 0) goto L_0x042e
            if (r0 == 0) goto L_0x042a
            if (r0 == r13) goto L_0x0426
            if (r0 == r7) goto L_0x0422
            if (r0 == r6) goto L_0x041e
            if (r0 == r5) goto L_0x041a
            goto L_0x042e
        L_0x041a:
            r12 = 53
            goto L_0x04b6
        L_0x041e:
            r12 = 50
            goto L_0x04b6
        L_0x0422:
            r12 = 47
            goto L_0x04b6
        L_0x0426:
            r12 = 44
            goto L_0x04b6
        L_0x042a:
            r12 = 41
            goto L_0x04b6
        L_0x042e:
            if (r4 <= 0) goto L_0x04b5
            if (r0 == 0) goto L_0x0453
            if (r0 == r13) goto L_0x044e
            if (r0 == r7) goto L_0x0448
            if (r0 == r6) goto L_0x0442
            if (r0 == r5) goto L_0x043c
            r12 = r1
            goto L_0x0458
        L_0x043c:
            java.util.ArrayList r2 = C(r1)
            r12 = r5
            goto L_0x0458
        L_0x0442:
            java.util.ArrayList r2 = S(r1)
        L_0x0446:
            r12 = r6
            goto L_0x0458
        L_0x0448:
            java.util.ArrayList r2 = D(r1)
            r12 = r7
            goto L_0x0458
        L_0x044e:
            java.util.ArrayList r2 = J(r1)
            goto L_0x0446
        L_0x0453:
            java.util.ArrayList r2 = F(r1)
            goto L_0x0446
        L_0x0458:
            r9 = r13
        L_0x0459:
            if (r9 > r12) goto L_0x0469
            java.lang.Object r10 = r2.get(r9)
            Y4.A r10 = (Y4.A) r10
            int r10 = r10.g
            if (r10 == r7) goto L_0x0466
            goto L_0x046a
        L_0x0466:
            int r9 = r9 + 1
            goto L_0x0459
        L_0x0469:
            r1 = r13
        L_0x046a:
            if (r1 == 0) goto L_0x0488
            if (r4 > r12) goto L_0x0488
            if (r0 == 0) goto L_0x0485
            if (r0 == r13) goto L_0x0482
            if (r0 == r7) goto L_0x047f
            if (r0 == r6) goto L_0x047c
            if (r0 == r5) goto L_0x0479
            goto L_0x0488
        L_0x0479:
            r12 = 54
            goto L_0x04b6
        L_0x047c:
            r12 = 51
            goto L_0x04b6
        L_0x047f:
            r12 = 48
            goto L_0x04b6
        L_0x0482:
            r12 = 45
            goto L_0x04b6
        L_0x0485:
            r12 = 42
            goto L_0x04b6
        L_0x0488:
            if (r1 == 0) goto L_0x04b5
            r1 = r13
        L_0x048b:
            if (r1 > r12) goto L_0x049b
            java.lang.Object r9 = r2.get(r1)
            Y4.A r9 = (Y4.A) r9
            int r9 = r9.g
            if (r9 == r7) goto L_0x0498
            goto L_0x04b5
        L_0x0498:
            int r1 = r1 + 1
            goto L_0x048b
        L_0x049b:
            if (r0 == 0) goto L_0x04b2
            if (r0 == r13) goto L_0x04af
            if (r0 == r7) goto L_0x04ac
            if (r0 == r6) goto L_0x04a9
            if (r0 == r5) goto L_0x04a6
            goto L_0x04b5
        L_0x04a6:
            r12 = 55
            goto L_0x04b6
        L_0x04a9:
            r12 = 52
            goto L_0x04b6
        L_0x04ac:
            r12 = 49
            goto L_0x04b6
        L_0x04af:
            r12 = 46
            goto L_0x04b6
        L_0x04b2:
            r12 = 43
            goto L_0x04b6
        L_0x04b5:
            r12 = r3
        L_0x04b6:
            if (r12 == r3) goto L_0x04c4
            d5.a r1 = d5.o.getAccountObject()
            java.lang.String r1 = r1.getId()
            long r2 = (long) r13
            com.mtma.criminal.city.utils.Q.b(r12, r1, r2)
        L_0x04c4:
            d5.a r12 = d5.o.getAccountObject()
            java.lang.String r12 = r12.getId()
            b5.k r13 = new b5.k
            r13.<init>((int) r8, (int) r0, (int) r4)
            k0(r12, r13)
            d5.a r12 = d5.o.getAccountObject()
            java.lang.String r12 = r12.getId()
            r0 = 1
            r13 = 9
            android.support.v4.media.session.a.C0(r7, r13, r0, r12)
        L_0x04e3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.c.d(long):void");
    }

    public static void d0(Bundle bundle, String str) {
        String str2;
        try {
            i.e();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String string2 = bundle.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle2.putString("_nmn", string2);
            }
            String string3 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString("label", string3);
            }
            String string4 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("message_channel", string4);
            }
            String string5 = bundle.getString("from");
            String str3 = null;
            if (string5 == null || !string5.startsWith("/topics/")) {
                string5 = null;
            }
            if (string5 != null) {
                bundle2.putString("_nt", string5);
            }
            String string6 = bundle.getString("google.c.a.ts");
            if (string6 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string6));
                } catch (NumberFormatException e6) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e6);
                }
            }
            if (bundle.containsKey("google.c.a.udt")) {
                str3 = bundle.getString("google.c.a.udt");
            }
            if (str3 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(str3));
                } catch (NumberFormatException e7) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e7);
                }
            }
            if (t.p(bundle)) {
                str2 = "display";
            } else {
                str2 = "data";
            }
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            T2.a aVar = (T2.a) i.e().c(T2.a.class);
            if (aVar != null) {
                ((b) aVar).a(bundle2, str);
            } else {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    public static void e(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static String e0(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i2 = 0; i2 < str.length(); i2++) {
            sb.append(str.charAt(i2));
            if (str2.length() > i2) {
                sb.append(str2.charAt(i2));
            }
        }
        return sb.toString();
    }

    public static void f() {
        if (o.getNotificationObject().isHasUnReadNotification() || o.getNotificationObject().isHasUnReadPrivateMessage()) {
            R2.b.M0(R.raw.notification);
        }
    }

    public static String f0(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (!str.startsWith("/") && !str.endsWith("/") && !str.contains("//")) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : str.split("/", -1)) {
            if (!TextUtils.isEmpty(str2)) {
                if (sb.length() > 0) {
                    sb.append("/");
                    sb.append(str2);
                } else {
                    sb.append(str2);
                }
            }
        }
        return sb.toString();
    }

    public static void g(int i2, int i5, int i6) {
        if (i2 < 0 || i5 > i6) {
            StringBuilder h6 = com.google.android.gms.internal.measurement.a.h("fromIndex: ", i2, ", toIndex: ", i5, ", size: ");
            h6.append(i6);
            throw new IndexOutOfBoundsException(h6.toString());
        } else if (i2 > i5) {
            throw new IllegalArgumentException(C0552a.l("fromIndex: ", i2, i5, " > toIndex: "));
        }
    }

    /* JADX WARNING: type inference failed for: r0v14, types: [V.b, K.A] */
    public static V.b g0(MappedByteBuffer mappedByteBuffer) {
        long j6;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i2 = duplicate.getShort() & 65535;
        if (i2 <= 100) {
            duplicate.position(duplicate.position() + 6);
            int i5 = 0;
            while (true) {
                if (i5 >= i2) {
                    j6 = -1;
                    break;
                }
                int i6 = duplicate.getInt();
                duplicate.position(duplicate.position() + 4);
                j6 = ((long) duplicate.getInt()) & 4294967295L;
                duplicate.position(duplicate.position() + 4);
                if (1835365473 == i6) {
                    break;
                }
                i5++;
            }
            if (j6 != -1) {
                duplicate.position(duplicate.position() + ((int) (j6 - ((long) duplicate.position()))));
                duplicate.position(duplicate.position() + 12);
                long j7 = ((long) duplicate.getInt()) & 4294967295L;
                for (int i7 = 0; ((long) i7) < j7; i7++) {
                    int i8 = duplicate.getInt();
                    long j8 = ((long) duplicate.getInt()) & 4294967295L;
                    duplicate.getInt();
                    if (1164798569 == i8 || 1701669481 == i8) {
                        duplicate.position((int) (j8 + j6));
                        ? a6 = new K.A();
                        duplicate.order(ByteOrder.LITTLE_ENDIAN);
                        int position = duplicate.position() + duplicate.getInt(duplicate.position());
                        a6.d = duplicate;
                        a6.f1342a = position;
                        int i9 = position - duplicate.getInt(position);
                        a6.f1343b = i9;
                        a6.f1344c = ((ByteBuffer) a6.d).getShort(i9);
                        return a6;
                    }
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }

    public static void h(int i2, ArrayList arrayList) {
        int i5 = 0;
        A a6 = (A) arrayList.get(0);
        if (a6.g == 2) {
            for (int i6 = 1; i6 <= i2; i6++) {
                int i7 = (i6 + i2) - i5;
                if (((A) arrayList.get(i6)).g == 2) {
                    if (!(((A) arrayList.get(i7)).g == 2 || ((A) arrayList.get(i7)).g == 1)) {
                        ((A) arrayList.get(i7)).h = true;
                    }
                } else if (((A) arrayList.get(i6)).g != 1) {
                    ((A) arrayList.get(i6)).h = true;
                    arrayList.remove(i7);
                    i5++;
                }
            }
            return;
        }
        for (int size = arrayList.size() - 1; size > i2; size--) {
            arrayList.remove(arrayList.size() - 1);
        }
        if (a6.g != 1) {
            a6.h = true;
            for (int size2 = arrayList.size() - 1; size2 > 0; size2--) {
                arrayList.remove(arrayList.size() - 1);
            }
        }
    }

    public static TypedValue h0(Context context, int i2) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i2, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static String i(long j6) {
        String str;
        int i2 = (int) (j6 / 86400);
        int i5 = ((int) (j6 % 86400)) / 3600;
        if (i2 <= 0) {
            str = "";
        } else if (i2 == 1) {
            str = "يوم";
        } else if (i2 == 2) {
            str = "يومان";
        } else if (i2 <= 10) {
            str = i2 + " ايام";
        } else {
            str = i2 + " يوم";
        }
        if (i2 == 0 && i5 == 0) {
            return d.f(str, "0 ساعة");
        }
        if (i2 > 0 && i5 != 0) {
            str = d.f(str, " و");
        }
        if (i5 <= 0) {
            return str;
        }
        if (i5 == 1) {
            return d.f(str, "ساعة");
        }
        if (i5 == 2) {
            return d.f(str, "ساعتان");
        }
        if (i5 <= 10) {
            return str + i5 + " ساعات";
        }
        return str + i5 + " ساعة";
    }

    public static boolean i0(Context context, int i2, boolean z3) {
        TypedValue h02 = h0(context, i2);
        if (h02 == null || h02.type != 18) {
            return z3;
        }
        if (h02.data != 0) {
            return true;
        }
        return false;
    }

    public static float[] j(float[] fArr, int i2) {
        if (i2 >= 0) {
            int length = fArr.length;
            if (length >= 0) {
                int min = Math.min(i2, length);
                float[] fArr2 = new float[i2];
                System.arraycopy(fArr, 0, fArr2, 0, min);
                return fArr2;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        throw new IllegalArgumentException();
    }

    public static TypedValue j0(int i2, Context context, String str) {
        TypedValue h02 = h0(context, i2);
        if (h02 != null) {
            return h02;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", new Object[]{str, context.getResources().getResourceName(i2)}));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0083, code lost:
        r13 = 0;
        r15 = 1;
        r16 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008d, code lost:
        r13 = 0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0096 A[Catch:{ NumberFormatException -> 0x00aa }, LOOP:3: B:22:0x0068->B:41:0x0096, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00d7 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0095 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static C.j[] k(java.lang.String r17) {
        /*
            r0 = r17
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            r5 = r2
            r4 = 1
        L_0x000a:
            int r6 = r17.length()
            if (r4 >= r6) goto L_0x00de
        L_0x0010:
            int r6 = r17.length()
            r7 = 69
            r8 = 101(0x65, float:1.42E-43)
            if (r4 >= r6) goto L_0x0034
            char r6 = r0.charAt(r4)
            int r9 = r6 + -65
            int r10 = r6 + -90
            int r10 = r10 * r9
            if (r10 <= 0) goto L_0x002c
            int r9 = r6 + -97
            int r10 = r6 + -122
            int r10 = r10 * r9
            if (r10 > 0) goto L_0x0031
        L_0x002c:
            if (r6 == r8) goto L_0x0031
            if (r6 == r7) goto L_0x0031
            goto L_0x0034
        L_0x0031:
            int r4 = r4 + 1
            goto L_0x0010
        L_0x0034:
            java.lang.String r5 = r0.substring(r5, r4)
            java.lang.String r5 = r5.trim()
            boolean r6 = r5.isEmpty()
            if (r6 != 0) goto L_0x00d7
            char r6 = r5.charAt(r2)
            r9 = 122(0x7a, float:1.71E-43)
            if (r6 == r9) goto L_0x00c9
            char r6 = r5.charAt(r2)
            r9 = 90
            if (r6 != r9) goto L_0x0054
            goto L_0x00c9
        L_0x0054:
            int r6 = r5.length()     // Catch:{ NumberFormatException -> 0x00aa }
            float[] r6 = new float[r6]     // Catch:{ NumberFormatException -> 0x00aa }
            int r9 = r5.length()     // Catch:{ NumberFormatException -> 0x00aa }
            r11 = r2
            r10 = 1
        L_0x0060:
            if (r10 >= r9) goto L_0x00b4
            r13 = r2
            r14 = r13
            r15 = r14
            r16 = r15
            r12 = r10
        L_0x0068:
            int r3 = r5.length()     // Catch:{ NumberFormatException -> 0x00aa }
            if (r12 >= r3) goto L_0x009a
            char r3 = r5.charAt(r12)     // Catch:{ NumberFormatException -> 0x00aa }
            r2 = 32
            if (r3 == r2) goto L_0x0091
            if (r3 == r7) goto L_0x008f
            if (r3 == r8) goto L_0x008f
            switch(r3) {
                case 44: goto L_0x0091;
                case 45: goto L_0x0088;
                case 46: goto L_0x007e;
                default: goto L_0x007d;
            }     // Catch:{ NumberFormatException -> 0x00aa }
        L_0x007d:
            goto L_0x008d
        L_0x007e:
            if (r14 != 0) goto L_0x0083
            r13 = 0
            r14 = 1
            goto L_0x0093
        L_0x0083:
            r13 = 0
            r15 = 1
            r16 = 1
            goto L_0x0093
        L_0x0088:
            if (r12 == r10) goto L_0x008d
            if (r13 != 0) goto L_0x008d
            goto L_0x0083
        L_0x008d:
            r13 = 0
            goto L_0x0093
        L_0x008f:
            r13 = 1
            goto L_0x0093
        L_0x0091:
            r13 = 0
            r15 = 1
        L_0x0093:
            if (r15 == 0) goto L_0x0096
            goto L_0x009a
        L_0x0096:
            int r12 = r12 + 1
            r2 = 0
            goto L_0x0068
        L_0x009a:
            if (r10 >= r12) goto L_0x00ac
            int r2 = r11 + 1
            java.lang.String r3 = r5.substring(r10, r12)     // Catch:{ NumberFormatException -> 0x00aa }
            float r3 = java.lang.Float.parseFloat(r3)     // Catch:{ NumberFormatException -> 0x00aa }
            r6[r11] = r3     // Catch:{ NumberFormatException -> 0x00aa }
            r11 = r2
            goto L_0x00ac
        L_0x00aa:
            r0 = move-exception
            goto L_0x00bb
        L_0x00ac:
            if (r16 == 0) goto L_0x00b1
            r10 = r12
        L_0x00af:
            r2 = 0
            goto L_0x0060
        L_0x00b1:
            int r10 = r12 + 1
            goto L_0x00af
        L_0x00b4:
            float[] r2 = j(r6, r11)     // Catch:{ NumberFormatException -> 0x00aa }
            r3 = r2
            r2 = 0
            goto L_0x00cb
        L_0x00bb:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "error in parsing \""
            java.lang.String r3 = "\""
            java.lang.String r2 = h0.C0552a.o(r2, r5, r3)
            r1.<init>(r2, r0)
            throw r1
        L_0x00c9:
            float[] r3 = new float[r2]
        L_0x00cb:
            char r5 = r5.charAt(r2)
            C.j r2 = new C.j
            r2.<init>(r5, r3)
            r1.add(r2)
        L_0x00d7:
            int r2 = r4 + 1
            r5 = r4
            r4 = r2
            r2 = 0
            goto L_0x000a
        L_0x00de:
            int r4 = r4 - r5
            r2 = 1
            if (r4 != r2) goto L_0x00f8
            int r2 = r17.length()
            if (r5 >= r2) goto L_0x00f8
            char r0 = r0.charAt(r5)
            r2 = 0
            float[] r3 = new float[r2]
            C.j r4 = new C.j
            r4.<init>(r0, r3)
            r1.add(r4)
            goto L_0x00f9
        L_0x00f8:
            r2 = 0
        L_0x00f9:
            C.j[] r0 = new C.j[r2]
            java.lang.Object[] r0 = r1.toArray(r0)
            C.j[] r0 = (C.j[]) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.c.k(java.lang.String):C.j[]");
    }

    public static void k0(String str, b5.k kVar) {
        C0592h.d().e().E(R2.b.a0()).E("notifications").E(str).G().I(kVar).addOnSuccessListener(new g(str, kVar, 6, false));
    }

    public static C.j[] l(C.j[] jVarArr) {
        C.j[] jVarArr2 = new C.j[jVarArr.length];
        for (int i2 = 0; i2 < jVarArr.length; i2++) {
            jVarArr2[i2] = new C.j(jVarArr[i2]);
        }
        return jVarArr2;
    }

    public static boolean m() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            i.e();
            i e6 = i.e();
            e6.b();
            Context context = e6.f2490a;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (!(packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("delivery_metrics_exported_to_big_query_enabled"))) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    public static A1.c n(byte[] bArr, Parcelable.Creator creator) {
        I.g(creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        A1.c cVar = (A1.c) creator.createFromParcel(obtain);
        obtain.recycle();
        return cVar;
    }

    public static void n0(Status status, Object obj, TaskCompletionSource taskCompletionSource) {
        if (status.v()) {
            taskCompletionSource.setResult(obj);
        } else {
            taskCompletionSource.setException(I.k(status));
        }
    }

    public static void o(ArrayList arrayList) {
        boolean z3;
        boolean z4;
        HashMap hashMap = new HashMap(arrayList.size());
        Iterator it2 = arrayList.iterator();
        while (true) {
            int i2 = 0;
            if (it2.hasNext()) {
                C0549b bVar = (C0549b) it2.next();
                f fVar = new f(bVar);
                Iterator it3 = bVar.f8014b.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        p pVar = (p) it3.next();
                        if (bVar.f8016e == 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        g3.g gVar = new g3.g(pVar, !z4);
                        if (!hashMap.containsKey(gVar)) {
                            hashMap.put(gVar, new HashSet());
                        }
                        Set set = (Set) hashMap.get(gVar);
                        if (set.isEmpty() || !z4) {
                            set.add(fVar);
                        } else {
                            throw new IllegalArgumentException("Multiple components provide " + pVar + ".");
                        }
                    }
                }
            } else {
                for (Set<f> it4 : hashMap.values()) {
                    for (f fVar2 : it4) {
                        for (g3.h hVar : fVar2.f8023a.f8015c) {
                            if (hVar.f8030c == 0) {
                                if (hVar.f8029b == 2) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                Set<f> set2 = (Set) hashMap.get(new g3.g(hVar.f8028a, z3));
                                if (set2 != null) {
                                    for (f fVar3 : set2) {
                                        fVar2.f8024b.add(fVar3);
                                        fVar3.f8025c.add(fVar2);
                                    }
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                for (Set addAll : hashMap.values()) {
                    hashSet.addAll(addAll);
                }
                HashSet hashSet2 = new HashSet();
                Iterator it5 = hashSet.iterator();
                while (it5.hasNext()) {
                    f fVar4 = (f) it5.next();
                    if (fVar4.f8025c.isEmpty()) {
                        hashSet2.add(fVar4);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    f fVar5 = (f) hashSet2.iterator().next();
                    hashSet2.remove(fVar5);
                    i2++;
                    Iterator it6 = fVar5.f8024b.iterator();
                    while (it6.hasNext()) {
                        f fVar6 = (f) it6.next();
                        fVar6.f8025c.remove(fVar5);
                        if (fVar6.f8025c.isEmpty()) {
                            hashSet2.add(fVar6);
                        }
                    }
                }
                if (i2 != arrayList.size()) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it7 = hashSet.iterator();
                    while (it7.hasNext()) {
                        f fVar7 = (f) it7.next();
                        if (!fVar7.f8025c.isEmpty() && !fVar7.f8024b.isEmpty()) {
                            arrayList2.add(fVar7.f8023a);
                        }
                    }
                    throw new RuntimeException("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
                }
                return;
            }
        }
    }

    public static void o0(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            b1.a(view, charSequence);
            return;
        }
        d1 d1Var = d1.f9279t;
        if (d1Var != null && d1Var.f9281a == view) {
            d1.b((d1) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            d1 d1Var2 = d1.f9280u;
            if (d1Var2 != null && d1Var2.f9281a == view) {
                d1Var2.a();
            }
            view.setOnLongClickListener((View.OnLongClickListener) null);
            view.setLongClickable(false);
            view.setOnHoverListener((View.OnHoverListener) null);
            return;
        }
        new d1(view, charSequence);
    }

    public static void p(Context context, int i2) {
        if (!h) {
            h = true;
            C0505b bVar = new C0505b(context, R.layout.dialog_ok_cancle);
            TextView textView = (TextView) bVar.findViewById(R.id.dialog_ok_cancel_text);
            LinearLayout linearLayout = (LinearLayout) bVar.findViewById(R.id.dialog_ok_cancel_buttons_confirm_cancel_layout);
            RelativeLayout relativeLayout = (RelativeLayout) bVar.findViewById(R.id.dialog_ok_cancel_cancel_button);
            RelativeLayout relativeLayout2 = (RelativeLayout) bVar.findViewById(R.id.dialog_ok_cancel_confirm_button);
            TextView textView2 = (TextView) bVar.findViewById(R.id.dialog_ok_cancel_cancel_button_text);
            TextView textView3 = (TextView) bVar.findViewById(R.id.dialog_ok_cancel_confirm_button_text);
            ImageView imageView = (ImageView) bVar.findViewById(R.id.dialog_ok_cancel_cancel_button_image);
            ImageView imageView2 = (ImageView) bVar.findViewById(R.id.dialog_ok_cancel_confirm_button_image);
            if (i2 == 2001) {
                textView.setText(R.string.buy_power_tank_by_gold);
            } else {
                textView.setText(R.string.buy_courage_tank_by_gold);
            }
            linearLayout.setVisibility(0);
            textView2.setText(R.string.button_ok);
            textView3.setText(R.string.button_cancel);
            imageView.setImageResource(R.drawable.button_blue);
            imageView2.setImageResource(R.drawable.button_red);
            relativeLayout.setOnClickListener(new C0440j(relativeLayout, i2, context, bVar));
            relativeLayout2.setOnClickListener(new m(relativeLayout2, bVar, 5));
            bVar.show();
        }
    }

    public static boolean p0(Intent intent) {
        Bundle extras;
        if (intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return "1".equals(extras.getString("google.c.a.e"));
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.app.Dialog, e5.b] */
    /* JADX WARNING: type inference failed for: r3v6, types: [java.lang.Object, android.content.DialogInterface$OnDismissListener] */
    public static C0505b q(MainActivity mainActivity, int i2) {
        if (f5739j) {
            return null;
        }
        f5739j = true;
        ? dialog = new Dialog(mainActivity, R.style.CustomDialog);
        dialog.f7671a = true;
        dialog.a(R.layout.dialog_new_level, true);
        dialog.f7671a = false;
        ((TextView) dialog.findViewById(R.id.dialog_new_level_number)).setText(String.valueOf(i2));
        dialog.setOnDismissListener(new Object());
        dialog.show();
        R2.b.M0(R.raw.level_up);
        return dialog;
    }

    public static C0505b q0(MainActivity mainActivity) {
        C0505b bVar = new C0505b(mainActivity, R.layout.dialog_ok_cancle);
        TextView textView = (TextView) bVar.findViewById(R.id.dialog_ok_cancel_title);
        RelativeLayout relativeLayout = (RelativeLayout) bVar.findViewById(R.id.dialog_ok_cancel_ok_button);
        relativeLayout.setVisibility(0);
        textView.setText(R.string.alert);
        textView.setTextColor(MyApplication.f7090a.getApplicationContext().getResources().getColor(R.color.maximum_word_color, mainActivity.getTheme()));
        ((TextView) bVar.findViewById(R.id.dialog_ok_cancel_text)).setText(R.string.can_not_open_account_from_different_devices);
        ((TextView) bVar.findViewById(R.id.dialog_ok_cancel_ok_button_text)).setText(R.string.close_button);
        relativeLayout.setOnClickListener(new com.mtma.criminal.city.activities.l(relativeLayout, bVar, mainActivity, 1));
        bVar.show();
        return bVar;
    }

    public static final r5.b r(Enum[] enumArr) {
        j.e(enumArr, "entries");
        return new r5.b(enumArr);
    }

    public static void r0(C0518i iVar) {
        C0505b bVar = new C0505b(iVar, R.layout.dialog_ok_cancle);
        TextView textView = (TextView) bVar.findViewById(R.id.dialog_ok_cancel_title);
        RelativeLayout relativeLayout = (RelativeLayout) bVar.findViewById(R.id.dialog_ok_cancel_ok_button);
        relativeLayout.setVisibility(0);
        textView.setText(R.string.alert);
        textView.setTextColor(MyApplication.f7090a.getApplicationContext().getResources().getColor(R.color.maximum_word_color, iVar.getTheme()));
        ((TextView) bVar.findViewById(R.id.dialog_ok_cancel_text)).setText(R.string.dialog_account_banned_from_system);
        ((TextView) bVar.findViewById(R.id.dialog_ok_cancel_ok_button_text)).setText(R.string.close_button);
        relativeLayout.setOnClickListener(new C0438h(relativeLayout, bVar, iVar, 0));
        bVar.show();
    }

    public static void s(boolean z3, r0 r0Var) {
        if (!Z()) {
            Intent intent = new Intent(MyApplication.f7090a.getApplicationContext(), StartActivity.class);
            intent.addFlags(268468224);
            MyApplication.f7090a.getApplicationContext().startActivity(intent);
            return;
        }
        if (z3 && f5743n < 10) {
            long j6 = f5744o;
            if (j6 != -111) {
                r0Var.j(j6);
                return;
            }
        }
        com.google.android.gms.internal.measurement.a.v(com.google.android.gms.internal.measurement.a.c(C0592h.b().e(), "players"), "mainStatesObject").H(new com.mtma.criminal.city.fragments.gangBase.I(r0Var, 19));
    }

    public static void s0(Context context, String str, String str2) {
        if (!f5736e) {
            f5736e = true;
            C0505b bVar = new C0505b(context, R.layout.dialog_ok_cancle);
            RelativeLayout relativeLayout = (RelativeLayout) bVar.findViewById(R.id.dialog_ok_cancel_ok_button);
            TextView textView = (TextView) bVar.findViewById(R.id.dialog_ok_cancel_text);
            relativeLayout.setVisibility(0);
            if (str2 != null) {
                ((TextView) bVar.findViewById(R.id.dialog_ok_cancel_title)).setText(str2);
            }
            if (str != null) {
                textView.setText(str);
            } else {
                textView.setText(R.string.unknown_error);
            }
            relativeLayout.setOnClickListener(new m(relativeLayout, bVar, 2));
            bVar.show();
        }
    }

    public static void t0(StartActivity startActivity) {
        C0505b bVar = new C0505b(startActivity, R.layout.dialog_ok_cancle);
        TextView textView = (TextView) bVar.findViewById(R.id.dialog_ok_cancel_title);
        RelativeLayout relativeLayout = (RelativeLayout) bVar.findViewById(R.id.dialog_ok_cancel_ok_button);
        relativeLayout.setVisibility(0);
        textView.setText(R.string.alert);
        textView.setTextColor(MyApplication.f7090a.getApplicationContext().getResources().getColor(R.color.maximum_word_color, startActivity.getTheme()));
        ((TextView) bVar.findViewById(R.id.dialog_ok_cancel_text)).setText(R.string.dialog_account_disabled);
        ((TextView) bVar.findViewById(R.id.dialog_ok_cancel_ok_button_text)).setText(R.string.close_button);
        relativeLayout.setOnClickListener(new u(relativeLayout, bVar, startActivity, 5));
        bVar.show();
    }

    public static C0505b u0(C0518i iVar) {
        if (f5742m) {
            return null;
        }
        f5742m = true;
        C0505b bVar = new C0505b(iVar, R.layout.dialog_ok_cancle);
        TextView textView = (TextView) bVar.findViewById(R.id.dialog_ok_cancel_title);
        RelativeLayout relativeLayout = (RelativeLayout) bVar.findViewById(R.id.dialog_ok_cancel_ok_button);
        relativeLayout.setVisibility(0);
        textView.setText(R.string.game_repairing_title);
        textView.setTextColor(MyApplication.f7090a.getApplicationContext().getResources().getColor(R.color.maximum_word_color, iVar.getTheme()));
        ((TextView) bVar.findViewById(R.id.dialog_ok_cancel_text)).setText(R.string.dialog_game_repairing_right_now);
        ((TextView) bVar.findViewById(R.id.dialog_ok_cancel_ok_button_text)).setText(R.string.close_button);
        relativeLayout.setOnClickListener(new C0438h(relativeLayout, bVar, iVar, 2));
        bVar.show();
        return bVar;
    }

    public static String v() {
        Date date = new Date(f5744o * 1000);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss - dd/MM/yy");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat.format(date);
    }

    public static C0505b v0(MainActivity mainActivity) {
        C0505b bVar = new C0505b(mainActivity, R.layout.dialog_ok_cancle);
        RelativeLayout relativeLayout = (RelativeLayout) bVar.findViewById(R.id.dialog_ok_cancel_ok_button);
        TextView textView = (TextView) bVar.findViewById(R.id.dialog_ok_cancel_title);
        relativeLayout.setVisibility(0);
        textView.setText(R.string.alert);
        textView.setTextColor(MyApplication.f7090a.getApplicationContext().getResources().getColor(R.color.maximum_word_color, mainActivity.getTheme()));
        ((TextView) bVar.findViewById(R.id.dialog_ok_cancel_text)).setText(R.string.dialog_hacking_time_message);
        ((TextView) bVar.findViewById(R.id.dialog_ok_cancel_ok_button_text)).setText(R.string.close_button);
        relativeLayout.setOnClickListener(new com.mtma.criminal.city.activities.l(relativeLayout, bVar, mainActivity, 2));
        bVar.show();
        return bVar;
    }

    public static int w() {
        for (int i2 = 0; i2 < o.getSchoolObject().getLawLessons().size(); i2++) {
            if (o.getSchoolObject().getLawLessons().get(i2).intValue() == 1) {
                return 0;
            }
        }
        for (int i5 = 0; i5 < o.getSchoolObject().getMilitaryLessons().size(); i5++) {
            if (o.getSchoolObject().getMilitaryLessons().get(i5).intValue() == 1) {
                return 1;
            }
        }
        for (int i6 = 0; i6 < o.getSchoolObject().getHistoryLessons().size(); i6++) {
            if (o.getSchoolObject().getHistoryLessons().get(i6).intValue() == 1) {
                return 2;
            }
        }
        for (int i7 = 0; i7 < o.getSchoolObject().getScienceLessons().size(); i7++) {
            if (o.getSchoolObject().getScienceLessons().get(i7).intValue() == 1) {
                return 3;
            }
        }
        for (int i8 = 0; i8 < o.getSchoolObject().getGymLessons().size(); i8++) {
            if (o.getSchoolObject().getGymLessons().get(i8).intValue() == 1) {
                return 4;
            }
        }
        return -1;
    }

    public static void w0(C0518i iVar) {
        C0505b bVar = new C0505b(iVar, R.layout.dialog_ok_cancle);
        RelativeLayout relativeLayout = (RelativeLayout) bVar.findViewById(R.id.dialog_ok_cancel_ok_button);
        TextView textView = (TextView) bVar.findViewById(R.id.dialog_ok_cancel_title);
        relativeLayout.setVisibility(0);
        textView.setText(R.string.alert);
        textView.setTextColor(MyApplication.f7090a.getApplicationContext().getResources().getColor(R.color.maximum_word_color, iVar.getTheme()));
        ((TextView) bVar.findViewById(R.id.dialog_ok_cancel_text)).setText(R.string.dialog_account_need_review);
        ((TextView) bVar.findViewById(R.id.dialog_ok_cancel_ok_button_text)).setText(R.string.close_button);
        relativeLayout.setOnClickListener(new C0438h(relativeLayout, bVar, iVar, 1));
        bVar.show();
    }

    public static int x() {
        ArrayList Q5 = Q(w(), false);
        for (int i2 = 0; i2 < Q5.size(); i2++) {
            if (((A) Q5.get(i2)).g == 1) {
                return i2;
            }
        }
        return -1;
    }

    public static void x0(Context context) {
        if (!g) {
            g = true;
            C0505b bVar = new C0505b(context, R.layout.dialog_ok_cancle);
            RelativeLayout relativeLayout = (RelativeLayout) bVar.findViewById(R.id.dialog_ok_cancel_confirm_button);
            RelativeLayout relativeLayout2 = (RelativeLayout) bVar.findViewById(R.id.dialog_ok_cancel_cancel_button);
            ((TextView) bVar.findViewById(R.id.dialog_ok_cancel_text)).setText(R.string.do_not_have_enough_cash);
            ((LinearLayout) bVar.findViewById(R.id.dialog_ok_cancel_buttons_confirm_cancel_layout)).setVisibility(0);
            ((TextView) bVar.findViewById(R.id.dialog_ok_cancel_confirm_button_text)).setText(R.string.button_ok);
            relativeLayout.setOnClickListener(new C0439i(relativeLayout, 1, context, bVar));
            relativeLayout2.setOnClickListener(new m(relativeLayout2, bVar, 4));
            bVar.show();
        }
    }

    public static String y(Object obj) {
        Date date = new Date(((Long) obj).longValue());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat.format(date);
    }

    public static void y0(Context context) {
        if (!f5737f) {
            f5737f = true;
            C0505b bVar = new C0505b(context, R.layout.dialog_ok_cancle);
            RelativeLayout relativeLayout = (RelativeLayout) bVar.findViewById(R.id.dialog_ok_cancel_confirm_button);
            RelativeLayout relativeLayout2 = (RelativeLayout) bVar.findViewById(R.id.dialog_ok_cancel_cancel_button);
            ((TextView) bVar.findViewById(R.id.dialog_ok_cancel_text)).setText(R.string.do_not_have_enough_gold);
            ((LinearLayout) bVar.findViewById(R.id.dialog_ok_cancel_buttons_confirm_cancel_layout)).setVisibility(0);
            ((TextView) bVar.findViewById(R.id.dialog_ok_cancel_confirm_button_text)).setText(R.string.button_ok);
            relativeLayout.setOnClickListener(new C0439i(relativeLayout, 0, context, bVar));
            relativeLayout2.setOnClickListener(new m(relativeLayout2, bVar, 3));
            bVar.show();
        }
    }

    public static String z(Object obj) {
        Date date = new Date(((Long) obj).longValue());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss - dd/MM/yyyy");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat.format(date);
    }

    public static void z0(C0518i iVar) {
        if (!f5738i) {
            f5738i = true;
            C0505b bVar = new C0505b(iVar, R.layout.dialog_ok_cancle);
            TextView textView = (TextView) bVar.findViewById(R.id.dialog_ok_cancel_title);
            RelativeLayout relativeLayout = (RelativeLayout) bVar.findViewById(R.id.dialog_ok_cancel_confirm_button);
            RelativeLayout relativeLayout2 = (RelativeLayout) bVar.findViewById(R.id.dialog_ok_cancel_cancel_button);
            textView.setText(R.string.alert);
            textView.setTextColor(MyApplication.f7090a.getApplicationContext().getResources().getColor(R.color.maximum_word_color, iVar.getTheme()));
            ((TextView) bVar.findViewById(R.id.dialog_ok_cancel_text)).setText(R.string.old_app_version);
            ((LinearLayout) bVar.findViewById(R.id.dialog_ok_cancel_buttons_confirm_cancel_layout)).setVisibility(0);
            ((TextView) bVar.findViewById(R.id.dialog_ok_cancel_confirm_button_text)).setText(R.string.button_update);
            ((TextView) bVar.findViewById(R.id.dialog_ok_cancel_cancel_button_text)).setText(R.string.close_button);
            relativeLayout.setOnClickListener(new C0438h(relativeLayout, iVar, bVar));
            relativeLayout2.setOnClickListener(new C0438h(relativeLayout2, bVar, iVar, 4));
            bVar.show();
        }
    }

    public abstract String[] O(Class cls);

    public abstract boolean a0(Class cls);

    public abstract void m0(boolean z3);

    public abstract Method t(Class cls, Field field);

    public abstract Constructor u(Class cls);

    public void l0(boolean z3) {
    }
}
