package com.bumptech.glide;

import A2.f;
import F3.h;
import G5.C0019a;
import K1.e;
import K4.u;
import R2.b;
import T1.C0185l;
import T1.C0217w;
import Y4.C0246c;
import Y4.g;
import Z2.c;
import a1.C0258c;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Trace;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.emoji2.text.v;
import b5.l;
import c1.i;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzahq;
import com.google.android.gms.internal.p002firebaseauthapi.zzair;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.google.android.gms.tasks.Tasks;
import com.google.crypto.tink.shaded.protobuf.A;
import com.google.crypto.tink.shaded.protobuf.B;
import com.google.crypto.tink.shaded.protobuf.C0399d;
import com.google.crypto.tink.shaded.protobuf.C0404i;
import com.google.crypto.tink.shaded.protobuf.C0409n;
import com.google.crypto.tink.shaded.protobuf.C0414t;
import com.google.crypto.tink.shaded.protobuf.C0419y;
import com.google.crypto.tink.shaded.protobuf.D;
import com.google.crypto.tink.shaded.protobuf.K;
import com.google.crypto.tink.shaded.protobuf.U;
import com.google.crypto.tink.shaded.protobuf.d0;
import com.google.crypto.tink.shaded.protobuf.g0;
import com.google.crypto.tink.shaded.protobuf.s0;
import com.google.firebase.auth.FirebaseAuth;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.C;
import com.mtma.criminal.city.utils.C0434d;
import com.mtma.criminal.city.utils.C0453x;
import com.mtma.criminal.city.utils.C0454y;
import com.mtma.criminal.city.utils.J;
import d5.C0469b;
import d5.C0473f;
import d5.C0475h;
import d5.k;
import d5.o;
import d5.q;
import d5.r;
import e3.n;
import e3.w;
import e3.z;
import f3.C0524a;
import h0.C0552a;
import i3.C0590f;
import i3.C0592h;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import k.C0709e0;
import kotlin.jvm.internal.j;
import m5.C0848g;
import m5.C0849h;
import org.json.JSONArray;
import org.json.JSONObject;
import t0.x;
import u4.C1034c;
import x5.a;
import x5.p;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f5752a = true;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f5753b = false;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f5754c = false;
    public static long d = 0;

    /* renamed from: e  reason: collision with root package name */
    public static long f5755e = 0;

    /* renamed from: f  reason: collision with root package name */
    public static Method f5756f = null;
    public static boolean g = true;
    public static Field h;

    /* renamed from: i  reason: collision with root package name */
    public static boolean f5757i;

    public d() {
        new ConcurrentHashMap();
    }

    public static int A(d0 d0Var, int i2, byte[] bArr, int i5, int i6, A a6, C0258c cVar) {
        Object i7 = d0Var.i();
        int R02 = R0(i7, d0Var, bArr, i5, i6, cVar);
        d0Var.d(i7);
        cVar.d = i7;
        a6.add(i7);
        while (R02 < i6) {
            int S5 = S(bArr, R02, cVar);
            if (i2 != cVar.f4550b) {
                break;
            }
            Object i8 = d0Var.i();
            int R03 = R0(i8, d0Var, bArr, S5, i6, cVar);
            d0Var.d(i8);
            cVar.d = i8;
            a6.add(i8);
            R02 = R03;
        }
        return R02;
    }

    public static int A0() {
        return B0(o.getMainStatesObject());
    }

    public static int B(byte[] bArr, int i2, A a6, C0258c cVar) {
        boolean z3;
        C0399d dVar = (C0399d) a6;
        int S5 = S(bArr, i2, cVar);
        int i5 = cVar.f4550b + S5;
        while (S5 < i5) {
            S5 = U(bArr, S5, cVar);
            if (cVar.f4551c != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            dVar.v(z3);
        }
        if (S5 == i5) {
            return S5;
        }
        throw D.g();
    }

    public static int B0(k kVar) {
        int U5 = (e.U(12) * e.X(12)) + 100;
        if (b.k0(kVar.getVipEndTime())) {
            return U5 + U5;
        }
        return U5;
    }

    public static int C(byte[] bArr, int i2, A a6, C0258c cVar) {
        C0409n nVar = (C0409n) a6;
        int S5 = S(bArr, i2, cVar);
        int i5 = cVar.f4550b + S5;
        while (S5 < i5) {
            nVar.v(Double.longBitsToDouble(v(bArr, S5)));
            S5 += 8;
        }
        if (S5 == i5) {
            return S5;
        }
        throw D.g();
    }

    public static String C0() {
        return o3.d.g(e.d(2, (long) o.getLocationObject().getCurrentCity()), ".", e.d(2, 2));
    }

    public static int D(byte[] bArr, int i2, A a6, C0258c cVar) {
        C0419y yVar = (C0419y) a6;
        int S5 = S(bArr, i2, cVar);
        int i5 = cVar.f4550b + S5;
        while (S5 < i5) {
            yVar.v(t(bArr, S5));
            S5 += 4;
        }
        if (S5 == i5) {
            return S5;
        }
        throw D.g();
    }

    public static int D0(ArrayList arrayList) {
        int i2 = 0;
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            if (M0(((Long) arrayList.get(i5)).longValue(), c.f5744o)) {
                i2++;
            }
        }
        return i2;
    }

    public static int E(byte[] bArr, int i2, A a6, C0258c cVar) {
        K k6 = (K) a6;
        int S5 = S(bArr, i2, cVar);
        int i5 = cVar.f4550b + S5;
        while (S5 < i5) {
            k6.v(v(bArr, S5));
            S5 += 8;
        }
        if (S5 == i5) {
            return S5;
        }
        throw D.g();
    }

    public static String E0(String str, String str2) {
        try {
            f fVar = new f(MyApplication.f7090a.getApplicationContext());
            fVar.w();
            return o0.b.a(MyApplication.f7090a.getApplicationContext(), fVar.e()).getString(str, str2);
        } catch (Exception e6) {
            e6.printStackTrace();
            return str2;
        }
    }

    public static int F(byte[] bArr, int i2, A a6, C0258c cVar) {
        C0414t tVar = (C0414t) a6;
        int S5 = S(bArr, i2, cVar);
        int i5 = cVar.f4550b + S5;
        while (S5 < i5) {
            tVar.v(Float.intBitsToFloat(t(bArr, S5)));
            S5 += 4;
        }
        if (S5 == i5) {
            return S5;
        }
        throw D.g();
    }

    public static int G(byte[] bArr, int i2, A a6, C0258c cVar) {
        C0419y yVar = (C0419y) a6;
        int S5 = S(bArr, i2, cVar);
        int i5 = cVar.f4550b + S5;
        while (S5 < i5) {
            S5 = S(bArr, S5, cVar);
            yVar.v(E2.d.d(cVar.f4550b));
        }
        if (S5 == i5) {
            return S5;
        }
        throw D.g();
    }

    public static boolean G0(int i2, int i5, int i6, boolean z3, boolean z4) {
        if (!z3 || z4 || i2 < 80) {
            return false;
        }
        if (i5 < 90) {
            if (i6 < i5 / 2) {
                return false;
            }
            return true;
        } else if (i6 < 60) {
            return false;
        } else {
            return true;
        }
    }

    public static int H(byte[] bArr, int i2, A a6, C0258c cVar) {
        K k6 = (K) a6;
        int S5 = S(bArr, i2, cVar);
        int i5 = cVar.f4550b + S5;
        while (S5 < i5) {
            S5 = U(bArr, S5, cVar);
            k6.v(E2.d.e(cVar.f4551c));
        }
        if (S5 == i5) {
            return S5;
        }
        throw D.g();
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void H0(android.content.Context r4) {
        /*
            android.content.SharedPreferences r0 = I1.b.X(r4)
            java.lang.String r1 = "proxy_notification_initialized"
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)
            if (r0 == 0) goto L_0x000e
            return
        L_0x000e:
            java.lang.String r0 = "firebase_messaging_notification_delegation_enabled"
            android.content.Context r1 = r4.getApplicationContext()     // Catch:{ NameNotFoundException -> 0x0037 }
            android.content.pm.PackageManager r2 = r1.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0037 }
            if (r2 == 0) goto L_0x0037
            java.lang.String r1 = r1.getPackageName()     // Catch:{ NameNotFoundException -> 0x0037 }
            r3 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r1 = r2.getApplicationInfo(r1, r3)     // Catch:{ NameNotFoundException -> 0x0037 }
            if (r1 == 0) goto L_0x0037
            android.os.Bundle r2 = r1.metaData     // Catch:{ NameNotFoundException -> 0x0037 }
            if (r2 == 0) goto L_0x0037
            boolean r2 = r2.containsKey(r0)     // Catch:{ NameNotFoundException -> 0x0037 }
            if (r2 == 0) goto L_0x0037
            android.os.Bundle r1 = r1.metaData     // Catch:{ NameNotFoundException -> 0x0037 }
            boolean r0 = r1.getBoolean(r0)     // Catch:{ NameNotFoundException -> 0x0037 }
            goto L_0x0038
        L_0x0037:
            r0 = 1
        L_0x0038:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r1 < r2) goto L_0x004f
            com.google.android.gms.tasks.TaskCompletionSource r1 = new com.google.android.gms.tasks.TaskCompletionSource
            r1.<init>()
            S3.v r2 = new S3.v
            r2.<init>(r4, r0, r1)
            r2.run()
            r1.getTask()
            goto L_0x0053
        L_0x004f:
            r4 = 0
            com.google.android.gms.tasks.Tasks.forResult(r4)
        L_0x0053:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.d.H0(android.content.Context):void");
    }

    public static int I(byte[] bArr, int i2, A a6, C0258c cVar) {
        C0419y yVar = (C0419y) a6;
        int S5 = S(bArr, i2, cVar);
        int i5 = cVar.f4550b + S5;
        while (S5 < i5) {
            S5 = S(bArr, S5, cVar);
            yVar.v(cVar.f4550b);
        }
        if (S5 == i5) {
            return S5;
        }
        throw D.g();
    }

    public static boolean I0() {
        if (o.getAccountObject().isAdmin() || o.getAccountObject().isTemporaryAdmin()) {
            return true;
        }
        return false;
    }

    public static int J(byte[] bArr, int i2, A a6, C0258c cVar) {
        K k6 = (K) a6;
        int S5 = S(bArr, i2, cVar);
        int i5 = cVar.f4550b + S5;
        while (S5 < i5) {
            S5 = U(bArr, S5, cVar);
            k6.v(cVar.f4551c);
        }
        if (S5 == i5) {
            return S5;
        }
        throw D.g();
    }

    public static boolean J0(int i2) {
        boolean z3;
        boolean z4;
        int position = o.getGangObject().getPosition();
        if (position == 0 || position == 1 || position == 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (position < i2) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z3 || !z4) {
            return false;
        }
        return true;
    }

    public static int K(int i2, byte[] bArr, int i5, int i6, A a6, C0258c cVar) {
        C0419y yVar = (C0419y) a6;
        int S5 = S(bArr, i5, cVar);
        yVar.v(E2.d.d(cVar.f4550b));
        while (S5 < i6) {
            int S6 = S(bArr, S5, cVar);
            if (i2 != cVar.f4550b) {
                break;
            }
            S5 = S(bArr, S6, cVar);
            yVar.v(E2.d.d(cVar.f4550b));
        }
        return S5;
    }

    public static boolean K0() {
        try {
            if (f5756f == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        Class<Trace> cls = Trace.class;
        try {
            if (f5756f == null) {
                f5755e = cls.getField("TRACE_TAG_APP").getLong((Object) null);
                f5756f = cls.getMethod("isTagEnabled", new Class[]{Long.TYPE});
            }
            return ((Boolean) f5756f.invoke((Object) null, new Object[]{Long.valueOf(f5755e)})).booleanValue();
        } catch (Exception e6) {
            if (e6 instanceof InvocationTargetException) {
                Throwable cause = e6.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new RuntimeException(cause);
            }
            Log.v("Trace", "Unable to call isTagEnabled via reflection", e6);
            return false;
        }
    }

    public static int L(int i2, byte[] bArr, int i5, int i6, A a6, C0258c cVar) {
        K k6 = (K) a6;
        int U5 = U(bArr, i5, cVar);
        k6.v(E2.d.e(cVar.f4551c));
        while (U5 < i6) {
            int S5 = S(bArr, U5, cVar);
            if (i2 != cVar.f4550b) {
                break;
            }
            U5 = U(bArr, S5, cVar);
            k6.v(E2.d.e(cVar.f4551c));
        }
        return U5;
    }

    public static boolean L0(Context context) {
        if (context.getResources().getConfiguration().fontScale >= 1.3f) {
            return true;
        }
        return false;
    }

    public static int M(byte[] bArr, int i2, C0258c cVar) {
        int S5 = S(bArr, i2, cVar);
        int i5 = cVar.f4550b;
        if (i5 < 0) {
            throw D.e();
        } else if (i5 == 0) {
            cVar.d = "";
            return S5;
        } else {
            cVar.d = new String(bArr, S5, i5, B.f6742a);
            return S5 + i5;
        }
    }

    public static boolean M0(long j6, long j7) {
        if (j6 != -1 && (j6 / 1000) + 604800 > j7) {
            return true;
        }
        return false;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044 A[EDGE_INSN: B:21:0x0044->B:17:0x0044 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001d  */
    public static int N(int r4, byte[] r5, int r6, int r7, com.google.crypto.tink.shaded.protobuf.A r8, a1.C0258c r9) {
        /*
            int r6 = S(r5, r6, r9)
            int r0 = r9.f4550b
            if (r0 < 0) goto L_0x0045
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0010
            r8.add(r1)
            goto L_0x001b
        L_0x0010:
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = com.google.crypto.tink.shaded.protobuf.B.f6742a
            r2.<init>(r5, r6, r0, r3)
            r8.add(r2)
        L_0x001a:
            int r6 = r6 + r0
        L_0x001b:
            if (r6 >= r7) goto L_0x0044
            int r0 = S(r5, r6, r9)
            int r2 = r9.f4550b
            if (r4 == r2) goto L_0x0026
            goto L_0x0044
        L_0x0026:
            int r6 = S(r5, r0, r9)
            int r0 = r9.f4550b
            if (r0 < 0) goto L_0x003f
            if (r0 != 0) goto L_0x0034
            r8.add(r1)
            goto L_0x001b
        L_0x0034:
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = com.google.crypto.tink.shaded.protobuf.B.f6742a
            r2.<init>(r5, r6, r0, r3)
            r8.add(r2)
            goto L_0x001a
        L_0x003f:
            com.google.crypto.tink.shaded.protobuf.D r4 = com.google.crypto.tink.shaded.protobuf.D.e()
            throw r4
        L_0x0044:
            return r6
        L_0x0045:
            com.google.crypto.tink.shaded.protobuf.D r4 = com.google.crypto.tink.shaded.protobuf.D.e()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.d.N(int, byte[], int, int, com.google.crypto.tink.shaded.protobuf.A, a1.c):int");
    }

    public static C0848g N0(a aVar) {
        j.e(aVar, "initializer");
        return new C0848g(aVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003e, code lost:
        r2 = r7 + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0046, code lost:
        if (com.google.crypto.tink.shaded.protobuf.s0.f6855a.q0(r6, r7, r2) != 0) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0048, code lost:
        r9.add(new java.lang.String(r6, r7, r0, com.google.crypto.tink.shaded.protobuf.B.f6742a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0057, code lost:
        throw com.google.crypto.tink.shaded.protobuf.D.b();
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005d A[EDGE_INSN: B:28:0x005d->B:23:0x005d ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int O(int r5, byte[] r6, int r7, int r8, com.google.crypto.tink.shaded.protobuf.A r9, a1.C0258c r10) {
        /*
            int r7 = S(r6, r7, r10)
            int r0 = r10.f4550b
            if (r0 < 0) goto L_0x0063
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0010
            r9.add(r1)
            goto L_0x0025
        L_0x0010:
            int r2 = r7 + r0
            android.support.v4.media.session.a r3 = com.google.crypto.tink.shaded.protobuf.s0.f6855a
            int r3 = r3.q0(r6, r7, r2)
            if (r3 != 0) goto L_0x005e
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = com.google.crypto.tink.shaded.protobuf.B.f6742a
            r3.<init>(r6, r7, r0, r4)
            r9.add(r3)
        L_0x0024:
            r7 = r2
        L_0x0025:
            if (r7 >= r8) goto L_0x005d
            int r0 = S(r6, r7, r10)
            int r2 = r10.f4550b
            if (r5 == r2) goto L_0x0030
            goto L_0x005d
        L_0x0030:
            int r7 = S(r6, r0, r10)
            int r0 = r10.f4550b
            if (r0 < 0) goto L_0x0058
            if (r0 != 0) goto L_0x003e
            r9.add(r1)
            goto L_0x0025
        L_0x003e:
            int r2 = r7 + r0
            android.support.v4.media.session.a r3 = com.google.crypto.tink.shaded.protobuf.s0.f6855a
            int r3 = r3.q0(r6, r7, r2)
            if (r3 != 0) goto L_0x0053
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = com.google.crypto.tink.shaded.protobuf.B.f6742a
            r3.<init>(r6, r7, r0, r4)
            r9.add(r3)
            goto L_0x0024
        L_0x0053:
            com.google.crypto.tink.shaded.protobuf.D r5 = com.google.crypto.tink.shaded.protobuf.D.b()
            throw r5
        L_0x0058:
            com.google.crypto.tink.shaded.protobuf.D r5 = com.google.crypto.tink.shaded.protobuf.D.e()
            throw r5
        L_0x005d:
            return r7
        L_0x005e:
            com.google.crypto.tink.shaded.protobuf.D r5 = com.google.crypto.tink.shaded.protobuf.D.b()
            throw r5
        L_0x0063:
            com.google.crypto.tink.shaded.protobuf.D r5 = com.google.crypto.tink.shaded.protobuf.D.e()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.d.O(int, byte[], int, int, com.google.crypto.tink.shaded.protobuf.A, a1.c):int");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.content.ContextWrapper, i.c] */
    public static Drawable O0(Context context, int i2, Resources.Theme theme) {
        if (theme != null) {
            ? contextWrapper = new ContextWrapper(context);
            contextWrapper.f8183b = theme;
            contextWrapper.a(theme.getResources().getConfiguration());
            context = contextWrapper;
        }
        return b.J(context, i2);
    }

    public static int P(byte[] bArr, int i2, C0258c cVar) {
        int S5 = S(bArr, i2, cVar);
        int i5 = cVar.f4550b;
        if (i5 < 0) {
            throw D.e();
        } else if (i5 == 0) {
            cVar.d = "";
            return S5;
        } else {
            cVar.d = s0.f6855a.p(bArr, S5, i5);
            return S5 + i5;
        }
    }

    public static void P0(long j6, J j7) {
        com.google.android.gms.internal.measurement.a.v(com.google.android.gms.internal.measurement.a.c(C0592h.b().e(), "players"), "mainStatesObject").H(new u(j6, (Object) j7, 6));
    }

    public static int Q(int i2, byte[] bArr, int i5, int i6, g0 g0Var, C0258c cVar) {
        if ((i2 >>> 3) != 0) {
            int i7 = i2 & 7;
            if (i7 == 0) {
                int U5 = U(bArr, i5, cVar);
                g0Var.d(i2, Long.valueOf(cVar.f4551c));
                return U5;
            } else if (i7 == 1) {
                g0Var.d(i2, Long.valueOf(v(bArr, i5)));
                return i5 + 8;
            } else if (i7 == 2) {
                int S5 = S(bArr, i5, cVar);
                int i8 = cVar.f4550b;
                if (i8 < 0) {
                    throw D.e();
                } else if (i8 <= bArr.length - S5) {
                    if (i8 == 0) {
                        g0Var.d(i2, C0404i.f6810b);
                    } else {
                        g0Var.d(i2, C0404i.v(bArr, S5, i8));
                    }
                    return S5 + i8;
                } else {
                    throw D.g();
                }
            } else if (i7 == 3) {
                g0 c3 = g0.c();
                int i9 = (i2 & -8) | 4;
                int i10 = 0;
                while (true) {
                    if (i5 >= i6) {
                        break;
                    }
                    int S6 = S(bArr, i5, cVar);
                    int i11 = cVar.f4550b;
                    if (i11 == i9) {
                        i10 = i11;
                        i5 = S6;
                        break;
                    }
                    i10 = i11;
                    i5 = Q(i11, bArr, S6, i6, c3, cVar);
                }
                if (i5 > i6 || i10 != i9) {
                    throw D.f();
                }
                g0Var.d(i2, c3);
                return i5;
            } else if (i7 == 5) {
                g0Var.d(i2, Integer.valueOf(t(bArr, i5)));
                return i5 + 4;
            } else {
                throw D.a();
            }
        } else {
            throw D.a();
        }
    }

    public static int Q0(Object obj, d0 d0Var, byte[] bArr, int i2, int i5, int i6, C0258c cVar) {
        int J5 = ((U) d0Var).J(obj, bArr, i2, i5, i6, cVar);
        cVar.d = obj;
        return J5;
    }

    public static int R(int i2, byte[] bArr, int i5, C0258c cVar) {
        int i6 = i2 & 127;
        int i7 = i5 + 1;
        byte b6 = bArr[i5];
        if (b6 >= 0) {
            cVar.f4550b = i6 | (b6 << 7);
            return i7;
        }
        int i8 = i6 | ((b6 & Byte.MAX_VALUE) << 7);
        int i9 = i5 + 2;
        byte b7 = bArr[i7];
        if (b7 >= 0) {
            cVar.f4550b = i8 | (b7 << 14);
            return i9;
        }
        int i10 = i8 | ((b7 & Byte.MAX_VALUE) << 14);
        int i11 = i5 + 3;
        byte b8 = bArr[i9];
        if (b8 >= 0) {
            cVar.f4550b = i10 | (b8 << 21);
            return i11;
        }
        int i12 = i10 | ((b8 & Byte.MAX_VALUE) << 21);
        int i13 = i5 + 4;
        byte b9 = bArr[i11];
        if (b9 >= 0) {
            cVar.f4550b = i12 | (b9 << 28);
            return i13;
        }
        int i14 = i12 | ((b9 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i15 = i13 + 1;
            if (bArr[i13] < 0) {
                i13 = i15;
            } else {
                cVar.f4550b = i14;
                return i15;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int R0(java.lang.Object r6, com.google.crypto.tink.shaded.protobuf.d0 r7, byte[] r8, int r9, int r10, a1.C0258c r11) {
        /*
            int r0 = r9 + 1
            byte r9 = r8[r9]
            if (r9 >= 0) goto L_0x000c
            int r0 = R(r9, r8, r0, r11)
            int r9 = r11.f4550b
        L_0x000c:
            r3 = r0
            if (r9 < 0) goto L_0x001e
            int r10 = r10 - r3
            if (r9 > r10) goto L_0x001e
            int r9 = r9 + r3
            r0 = r7
            r1 = r6
            r2 = r8
            r4 = r9
            r5 = r11
            r0.b(r1, r2, r3, r4, r5)
            r11.d = r6
            return r9
        L_0x001e:
            com.google.crypto.tink.shaded.protobuf.D r6 = com.google.crypto.tink.shaded.protobuf.D.g()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.d.R0(java.lang.Object, com.google.crypto.tink.shaded.protobuf.d0, byte[], int, int, a1.c):int");
    }

    public static int S(byte[] bArr, int i2, C0258c cVar) {
        int i5 = i2 + 1;
        byte b6 = bArr[i2];
        if (b6 < 0) {
            return R(b6, bArr, i5, cVar);
        }
        cVar.f4550b = b6;
        return i5;
    }

    public static Uri S0(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Uri uri = W3.b.f4074j;
        String str3 = "";
        if (str.toLowerCase().startsWith("gs://")) {
            String f02 = c.f0(str.substring(5));
            if (!TextUtils.isEmpty(f02)) {
                String encode = Uri.encode(f02);
                I.g(encode);
                str3 = encode.replace("%2F", "/");
            }
            return Uri.parse("gs://" + str3);
        }
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        if (scheme == null || (!I.j(scheme.toLowerCase(), "http") && !I.j(scheme.toLowerCase(), "https"))) {
            Log.w("StorageUtil", "FirebaseStorage is unable to support the scheme:" + scheme);
            throw new IllegalArgumentException("Uri scheme");
        }
        int indexOf = parse.getAuthority().toLowerCase().indexOf(uri.getAuthority());
        String encodedPath = parse.getEncodedPath();
        I.g(encodedPath);
        String replace = encodedPath.replace("%2F", "/");
        if (indexOf == 0 && replace.startsWith("/")) {
            int indexOf2 = replace.indexOf("/b/", 0);
            int i2 = indexOf2 + 3;
            int indexOf3 = replace.indexOf("/", i2);
            int indexOf4 = replace.indexOf("/o/", 0);
            if (indexOf2 == -1 || indexOf3 == -1) {
                Log.w("StorageUtil", "Firebase Storage URLs must point to an object in your Storage Bucket. Please obtain a URL using the Firebase Console or getDownloadUrl().");
                throw new IllegalArgumentException("Firebase Storage URLs must point to an object in your Storage Bucket. Please obtain a URL using the Firebase Console or getDownloadUrl().");
            }
            str2 = replace.substring(i2, indexOf3);
            if (indexOf4 != -1) {
                str3 = replace.substring(indexOf4 + 3);
            }
            replace = str3;
        } else if (indexOf > 1) {
            str2 = parse.getAuthority().substring(0, indexOf - 1);
        } else {
            Log.w("StorageUtil", "Firebase Storage URLs must point to an object in your Storage Bucket. Please obtain a URL using the Firebase Console or getDownloadUrl().");
            throw new IllegalArgumentException("Firebase Storage URLs must point to an object in your Storage Bucket. Please obtain a URL using the Firebase Console or getDownloadUrl().");
        }
        I.e(str2, "No bucket specified");
        return new Uri.Builder().scheme("gs").authority(str2).encodedPath(replace).build();
    }

    public static int T(int i2, byte[] bArr, int i5, int i6, A a6, C0258c cVar) {
        C0419y yVar = (C0419y) a6;
        int S5 = S(bArr, i5, cVar);
        yVar.v(cVar.f4550b);
        while (S5 < i6) {
            int S6 = S(bArr, S5, cVar);
            if (i2 != cVar.f4550b) {
                break;
            }
            S5 = S(bArr, S6, cVar);
            yVar.v(cVar.f4550b);
        }
        return S5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0064 A[Catch:{ UnsupportedEncodingException -> 0x0069 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Map T0(java.lang.String r5) {
        /*
            com.google.android.gms.common.internal.I.d(r5)
            java.lang.String r0 = "\\."
            r1 = -1
            java.lang.String[] r0 = r5.split(r0, r1)
            int r1 = r0.length
            r2 = 2
            r3 = 0
            java.lang.String r4 = "FirebaseAppCheck"
            if (r1 >= r2) goto L_0x001f
            java.lang.String r0 = "Invalid token (too few subsections):\n"
            java.lang.String r5 = r0.concat(r5)
            android.util.Log.e(r4, r5, r3)
            java.util.Map r5 = java.util.Collections.emptyMap()
            return r5
        L_0x001f:
            r5 = 1
            r5 = r0[r5]
            java.lang.String r0 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0069 }
            r1 = 11
            byte[] r5 = android.util.Base64.decode(r5, r1)     // Catch:{ UnsupportedEncodingException -> 0x0069 }
            java.lang.String r1 = "UTF-8"
            r0.<init>(r5, r1)     // Catch:{ UnsupportedEncodingException -> 0x0069 }
            boolean r5 = android.text.TextUtils.isEmpty(r0)     // Catch:{ UnsupportedEncodingException -> 0x0069 }
            if (r5 == 0) goto L_0x0037
        L_0x0035:
            r5 = r3
            goto L_0x0062
        L_0x0037:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Exception -> 0x0045 }
            r5.<init>(r0)     // Catch:{ Exception -> 0x0045 }
            java.lang.Object r0 = org.json.JSONObject.NULL     // Catch:{ Exception -> 0x0045 }
            if (r5 == r0) goto L_0x0035
            n.e r5 = g1(r5)     // Catch:{ Exception -> 0x0045 }
            goto L_0x0062
        L_0x0045:
            r5 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException -> 0x0069 }
            java.lang.String r1 = "Failed to parse JSONObject into Map:\n"
            r0.<init>(r1)     // Catch:{ UnsupportedEncodingException -> 0x0069 }
            r0.append(r5)     // Catch:{ UnsupportedEncodingException -> 0x0069 }
            java.lang.String r5 = r0.toString()     // Catch:{ UnsupportedEncodingException -> 0x0069 }
            r0 = 3
            boolean r0 = android.util.Log.isLoggable(r4, r0)     // Catch:{ UnsupportedEncodingException -> 0x0069 }
            if (r0 == 0) goto L_0x005e
            android.util.Log.d(r4, r5, r3)     // Catch:{ UnsupportedEncodingException -> 0x0069 }
        L_0x005e:
            java.util.Map r5 = java.util.Collections.emptyMap()     // Catch:{ UnsupportedEncodingException -> 0x0069 }
        L_0x0062:
            if (r5 != 0) goto L_0x006b
            java.util.Map r5 = java.util.Collections.emptyMap()     // Catch:{ UnsupportedEncodingException -> 0x0069 }
            goto L_0x006b
        L_0x0069:
            r5 = move-exception
            goto L_0x006c
        L_0x006b:
            return r5
        L_0x006c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to decode token (charset unknown):\n"
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            android.util.Log.e(r4, r5, r3)
            java.util.Map r5 = java.util.Collections.emptyMap()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.d.T0(java.lang.String):java.util.Map");
    }

    public static int U(byte[] bArr, int i2, C0258c cVar) {
        int i5 = i2 + 1;
        long j6 = (long) bArr[i2];
        if (j6 >= 0) {
            cVar.f4551c = j6;
            return i5;
        }
        int i6 = i2 + 2;
        byte b6 = bArr[i5];
        long j7 = (j6 & 127) | (((long) (b6 & Byte.MAX_VALUE)) << 7);
        int i7 = 7;
        while (b6 < 0) {
            int i8 = i6 + 1;
            byte b7 = bArr[i6];
            i7 += 7;
            j7 |= ((long) (b7 & Byte.MAX_VALUE)) << i7;
            int i9 = i8;
            b6 = b7;
            i6 = i9;
        }
        cVar.f4551c = j7;
        return i6;
    }

    public static void U0(int i2, J j6) {
        com.google.android.gms.internal.measurement.a.v(com.google.android.gms.internal.measurement.a.c(C0592h.b().e(), "players"), "mainStatesObject").H(new com.mtma.criminal.city.utils.I(i2, j6));
    }

    public static int V(int i2, byte[] bArr, int i5, int i6, A a6, C0258c cVar) {
        K k6 = (K) a6;
        int U5 = U(bArr, i5, cVar);
        k6.v(cVar.f4551c);
        while (U5 < i6) {
            int S5 = S(bArr, U5, cVar);
            if (i2 != cVar.f4550b) {
                break;
            }
            U5 = U(bArr, S5, cVar);
            k6.v(cVar.f4551c);
        }
        return U5;
    }

    public static void V0(String str, C0454y yVar) {
        com.google.android.gms.internal.measurement.a.d(com.google.android.gms.internal.measurement.a.c(C0592h.b().e(), "players"), "mainStatesObject", "level").d(new X4.d(yVar, str, 12));
    }

    public static void W(int i2, long j6, C0453x xVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("serverNumber", Integer.valueOf(o.getAccountObject().getCurrentOpenedServer()));
        hashMap.put("playerId", o.getAccountObject().getId());
        hashMap.put("playerName", o.getMainStatesObject().getNickName());
        hashMap.put("gangId", o.getGangObject().getId());
        hashMap.put("gangName", o.getGangObject().getName());
        hashMap.put("depositType", Integer.valueOf(i2));
        hashMap.put("depositValue", Long.valueOf(j6));
        h.b().a("depositToGang").q(hashMap).addOnCompleteListener(new H4.d((Object) xVar, 27));
    }

    public static void W0(String str, String str2) {
        b5.j jVar = new b5.j("@System_Administration", str2, true, false);
        l lVar = new l("@System_Administration", MyApplication.f7090a.getApplicationContext().getString(R.string.system_administration));
        C0590f E6 = C0592h.d().e().E(b.a0()).E("messages").E(str);
        HashMap hashMap = new HashMap();
        hashMap.put("chatData/@System_Administration", lVar);
        hashMap.put("chatMessages/@System_Administration/" + (c.f5744o + E6.E("chatMessages").E("@System_Administration").G().F()), jVar);
        E6.J(hashMap).addOnSuccessListener(new H4.e(str, 11));
    }

    public static void X0(String str, boolean z3) {
        try {
            f fVar = new f(MyApplication.f7090a.getApplicationContext());
            fVar.w();
            o0.a aVar = (o0.a) o0.b.a(MyApplication.f7090a.getApplicationContext(), fVar.e()).edit();
            aVar.putBoolean(str, z3);
            aVar.apply();
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    public static long Y(int i2) {
        String str;
        StringBuilder sb = new StringBuilder("activity_");
        if (i2 != 0) {
            str = null;
        } else {
            str = "goldBullionChase";
        }
        sb.append(str);
        sb.append("_EndTimeInMilli");
        return x0(sb.toString());
    }

    public static void Y0(int i2) {
        try {
            f fVar = new f(MyApplication.f7090a.getApplicationContext());
            fVar.w();
            o0.a aVar = (o0.a) o0.b.a(MyApplication.f7090a.getApplicationContext(), fVar.e()).edit();
            aVar.putInt("server_maximum_level", i2);
            aVar.apply();
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    public static ArrayList Z() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C0246c(R.string.estate_shack_name, R.string.estate_shack_description, R.drawable.estate_shack));
        arrayList.add(new C0246c(R.string.estate_basement_name, R.string.estate_basement_description, R.drawable.estate_basement));
        arrayList.add(new C0246c(R.string.estate_apartment_name, R.string.estate_apartment_description, R.drawable.estate_apartment));
        arrayList.add(new C0246c(R.string.estate_suburban_house_name, R.string.estate_suburban_house_description, R.drawable.estate_suburban_house));
        arrayList.add(new C0246c(R.string.estate_chalet_name, R.string.estate_chalet_description, R.drawable.estate_chalet));
        arrayList.add(new C0246c(R.string.estate_detached_house_name, R.string.estate_detached_house_description, R.drawable.estate_detached_house));
        arrayList.add(new C0246c(R.string.estate_villa_name, R.string.estate_villa_description, R.drawable.estate_villa));
        arrayList.add(new C0246c(R.string.estate_ranch_name, R.string.estate_ranch_description, R.drawable.estate_ranch));
        arrayList.add(new C0246c(R.string.estate_beach_house_name, R.string.estate_beach_house_description, R.drawable.estate_beach_house));
        arrayList.add(new C0246c(R.string.estate_courtyard_name, R.string.estate_courtyard_description, R.drawable.estate_courtyard));
        arrayList.add(new C0246c(R.string.estate_detached_house_name, R.string.estate_detached_house_description, R.drawable.estate_detached_house));
        arrayList.add(new C0246c(R.string.estate_district_name, R.string.estate_district_description, R.drawable.estate_district));
        arrayList.add(new C0246c(R.string.estate_mansion_name, R.string.estate_mansion_description, R.drawable.estate_mansion));
        arrayList.add(new C0246c(R.string.estate_palace_name, R.string.estate_palace_description, R.drawable.estate_palace));
        arrayList.add(new C0246c(R.string.estate_castle_name, R.string.estate_castle_description, R.drawable.estate_castle));
        arrayList.add(new C0246c(R.string.estate_private_island_name, R.string.estate_private_island_description, R.drawable.estate_private_island));
        arrayList.add(new C0246c(R.string.estate_space_station_name, R.string.estate_space_station_description, R.drawable.estate_space_station));
        return arrayList;
    }

    public static Context Z0(Context context, String str) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putString("Locale.Helper.Selected.Language", str);
        edit.apply();
        Locale locale = new Locale(str);
        Locale.setDefault(locale);
        Configuration configuration = context.getResources().getConfiguration();
        configuration.setLocale(locale);
        configuration.setLayoutDirection(locale);
        return context.createConfigurationContext(configuration);
    }

    public static void a(String str, String str2, String str3, String str4, X4.d dVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("serverNumber", Integer.valueOf(o.getAccountObject().getCurrentOpenedServer()));
        hashMap.put("playerId", str);
        hashMap.put("playerName", str2);
        hashMap.put("gangId", str3);
        hashMap.put("gangName", str4);
        h.b().a("acceptGangRequest").q(hashMap).addOnCompleteListener(new K4.h(dVar, str));
    }

    public static ColorStateList a0(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        ColorStateList colorStateList;
        if (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (colorStateList = A.h.getColorStateList(context, resourceId)) == null) {
            return typedArray.getColorStateList(i2);
        }
        return colorStateList;
    }

    public static void a1(String str, long j6) {
        try {
            f fVar = new f(MyApplication.f7090a.getApplicationContext());
            fVar.w();
            o0.a aVar = (o0.a) o0.b.a(MyApplication.f7090a.getApplicationContext(), fVar.e()).edit();
            aVar.putLong(str, j6);
            aVar.apply();
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    public static void b(long j6, J j7) {
        if (f5753b) {
            new Handler().postDelayed(new C0217w(j6, j7), 1000);
        } else {
            P0(j6, j7);
        }
    }

    public static ColorStateList b0(Context context, i iVar, int i2) {
        int resourceId;
        ColorStateList colorStateList;
        TypedArray typedArray = (TypedArray) iVar.f5606c;
        if (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (colorStateList = A.h.getColorStateList(context, resourceId)) == null) {
            return iVar.m(i2);
        }
        return colorStateList;
    }

    public static void c(Object obj, Object obj2) {
        if (obj == null) {
            String valueOf = String.valueOf(obj2);
            StringBuilder sb = new StringBuilder(valueOf.length() + 24);
            sb.append("null key in entry: null=");
            sb.append(valueOf);
            throw new NullPointerException(sb.toString());
        } else if (obj2 == null) {
            String valueOf2 = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(valueOf2.length() + 26);
            sb2.append("null value in entry: ");
            sb2.append(valueOf2);
            sb2.append("=null");
            throw new NullPointerException(sb2.toString());
        }
    }

    public static ColorStateList c0(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !C0709e0.o(drawable)) {
            return null;
        }
        return C0709e0.c(drawable).getColorStateList();
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.Object, i3.q, com.mtma.criminal.city.utils.l] */
    public static void d(long j6) {
        if (c.U(c.W(o.getEstateObject().getLastTimeDailyTaxPaidInMilli())) <= 86400) {
            return;
        }
        if (o.getEstateObject().getFirebaseKeyNode().equals("--defaultEstate")) {
            k1(j6, new androidx.fragment.app.D(13));
            return;
        }
        C0590f d6 = com.google.android.gms.internal.measurement.a.d(com.google.android.gms.internal.measurement.a.c(C0592h.b().e(), "players"), "moneyObject", "cash");
        ? obj = new Object();
        obj.f7431a = j6;
        d6.d(obj);
    }

    public static int d0() {
        return e0(o.getMainStatesObject().getLevel());
    }

    public static void d1(p pVar, C0019a aVar, C0019a aVar2) {
        try {
            I5.a.e(b.h0(((q5.a) pVar).create(aVar, aVar2)), C0849h.f10203c, (x5.l) null);
        } catch (Throwable th) {
            aVar2.resumeWith(I1.b.r(th));
            throw th;
        }
    }

    public static void e() {
        if (!b.k0(o.getMainStatesObject().getVipEndTime()) && o.getMainStatesObject().getVipEndTime() != -1) {
            com.google.android.gms.internal.measurement.a.d(com.google.android.gms.internal.measurement.a.c(C0592h.b().e(), "players"), "mainStatesObject", "vipEndTime").I(-1);
        }
    }

    public static int e0(int i2) {
        return (e.U(13) * e.X(13)) + 19 + i2;
    }

    public static int e1(Context context, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(16973825, new int[]{i2});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static void f(int i2, String str) {
        if (i2 < 0) {
            StringBuilder sb = new StringBuilder(str.length() + 40);
            sb.append(str);
            sb.append(" cannot be negative but was: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public static String f0(b3.b bVar) {
        if (bVar == null) {
            return null;
        }
        try {
            c cVar = (c) Tasks.await(((Z2.e) bVar).b(false), 30000, TimeUnit.MILLISECONDS);
            if (cVar.f4484b != null) {
                Log.w("StorageUtil", "Error getting App Check token; using placeholder token instead. Error: " + cVar.f4484b);
            }
            return cVar.f4483a;
        } catch (ExecutionException e6) {
            e = e6;
            C0552a.x(e, "Unexpected error getting App Check token: ", "StorageUtil");
            return null;
        } catch (InterruptedException e7) {
            e = e7;
            C0552a.x(e, "Unexpected error getting App Check token: ", "StorageUtil");
            return null;
        } catch (TimeoutException e8) {
            e = e8;
            C0552a.x(e, "Unexpected error getting App Check token: ", "StorageUtil");
            return null;
        }
    }

    public static ArrayList f1(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            Object obj = jSONArray.get(i2);
            if (obj instanceof JSONArray) {
                obj = f1((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = g1((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    public static void g(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static String g0(C0524a aVar) {
        String str;
        if (aVar != null) {
            try {
                FirebaseAuth firebaseAuth = (FirebaseAuth) aVar;
                str = ((n) Tasks.await(firebaseAuth.c(firebaseAuth.f6866f, false), 30000, TimeUnit.MILLISECONDS)).f7649a;
            } catch (ExecutionException e6) {
                e = e6;
                C0552a.x(e, "error getting token ", "StorageUtil");
                return null;
            } catch (InterruptedException e7) {
                e = e7;
                C0552a.x(e, "error getting token ", "StorageUtil");
                return null;
            } catch (TimeoutException e8) {
                e = e8;
                C0552a.x(e, "error getting token ", "StorageUtil");
                return null;
            }
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        Log.w("StorageUtil", "no auth token for request");
        return null;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [n.e, n.j] */
    public static n.e g1(JSONObject jSONObject) {
        ? jVar = new n.j(0);
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = f1((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = g1((JSONObject) obj);
            } else if (obj.equals(JSONObject.NULL)) {
                obj = null;
            }
            jVar.put(next, obj);
        }
        return jVar;
    }

    public static int h(int i2, int i5, int i6) {
        if (i2 < i5) {
            return i5;
        }
        if (i2 > i6) {
            return i6;
        }
        return i2;
    }

    public static long h0(k kVar, C0475h hVar, r rVar, C0469b bVar, q qVar) {
        long q02 = q0(kVar, hVar, rVar, bVar, qVar);
        if (kVar.getHealthCurrent() >= q02) {
            return kVar.getHealthCurrent();
        }
        double U5 = (double) c.U(kVar.getHealthChangeTimeInSeconds());
        if (U5 > 2400.0d) {
            return q02;
        }
        double d6 = (double) q02;
        long j6 = (long) ((U5 / 120.0d) * d6 * 0.05d);
        if (kVar.getHealthDoubleEffectEndTime() > c.f5744o) {
            j6 *= 2;
        } else if (kVar.getHealthDoubleEffectEndTime() > kVar.getHealthChangeTimeInSeconds()) {
            j6 += (long) ((((double) c.U(kVar.getHealthDoubleEffectEndTime())) / 120.0d) * d6 * 0.05d);
        }
        return kVar.getHealthCurrent() + j6;
    }

    public static void h1(int i2) {
        if (i2 == 0) {
            if (o.getMainStatesObject().getPowerCurrent() < A0()) {
                com.google.android.gms.internal.measurement.a.d(com.google.android.gms.internal.measurement.a.c(C0592h.b().e(), "players"), "mainStatesObject", "powerChangeTimeInMilli").I(i3.n.f8294a);
            }
        } else if (i2 == 1) {
            if (o.getMainStatesObject().getCourageCurrent() < d0()) {
                com.google.android.gms.internal.measurement.a.d(com.google.android.gms.internal.measurement.a.c(C0592h.b().e(), "players"), "mainStatesObject", "courageChangeTimeInMilli").I(i3.n.f8294a);
            }
        } else if (i2 == 3 && o.getMainStatesObject().getHealthCurrent() < o0()) {
            com.google.android.gms.internal.measurement.a.d(com.google.android.gms.internal.measurement.a.c(C0592h.b().e(), "players"), "mainStatesObject", "healthChangeTimeInMilli").I(i3.n.f8294a);
        }
    }

    public static byte[] i(byte[]... bArr) {
        int length = bArr.length;
        int i2 = 0;
        int i5 = 0;
        while (i2 < length) {
            byte[] bArr2 = bArr[i2];
            if (i5 <= com.google.android.gms.common.api.f.API_PRIORITY_OTHER - bArr2.length) {
                i5 += bArr2.length;
                i2++;
            } else {
                throw new GeneralSecurityException("exceeded size limit");
            }
        }
        byte[] bArr3 = new byte[i5];
        int i6 = 0;
        for (byte[] bArr4 : bArr) {
            System.arraycopy(bArr4, 0, bArr3, i6, bArr4.length);
            i6 += bArr4.length;
        }
        return bArr3;
    }

    public static long i0(int i2) {
        return ((Y4.h) m0().get(i2)).h / 1000;
    }

    public static void i1() {
        com.google.android.gms.internal.measurement.a.d(com.google.android.gms.internal.measurement.a.c(C0592h.b().e(), "players"), "estateObject", "allOwnEstates").d(new v(13));
    }

    public static Y4.h j(C0473f fVar) {
        Y4.h hVar = (Y4.h) m0().get(fVar.getId());
        hVar.f4360j = fVar.isUsed();
        hVar.f4361k = fVar.isSpouseUsed();
        hVar.f4355b = fVar.getEstateOwnerId();
        hVar.f4363m = ((Long) fVar.getLastTimeDailyTaxPaidInMilli()).longValue();
        hVar.f4365o = fVar.getPrivateDomainPicUrl();
        ArrayList l02 = l0(fVar.getId());
        int i2 = 0;
        for (int i5 = 0; i5 < l02.size(); i5++) {
            if (o.getSchoolObject().getScienceLessons().get(3).intValue() == 2) {
                ((g) l02.get(i5)).f4352e = (long) ((1.0d - c.H(3, 3)) * ((double) ((g) l02.get(i5)).f4352e));
            }
            if (o.getSchoolObject().getScienceLessons().get(6).intValue() == 2) {
                ((g) l02.get(i5)).d = (int) ((c.H(3, 6) + 1.0d) * ((double) ((g) l02.get(i5)).d));
            }
            if (((g) l02.get(i5)).g) {
                if (M0(fVar.getServantContractsStartTimeInMilliList().get(i2).longValue(), c.f5744o)) {
                    ((g) l02.get(i5)).f4353f = true;
                } else {
                    ((g) l02.get(i5)).f4353f = false;
                }
                ((g) l02.get(i5)).h = fVar.getServantContractsStartTimeInMilliList().get(i2).longValue();
                i2++;
            } else {
                ((g) l02.get(i5)).f4353f = fVar.getFixedModificationList().get(i5).booleanValue();
            }
        }
        hVar.f4364n = l02;
        if (l02.size() == 5 && ((g) l02.get(2)).f4353f) {
            hVar.f4359i = true;
        }
        for (int i6 = 0; i6 < l02.size(); i6++) {
            if (((g) l02.get(i6)).f4353f) {
                hVar.g += ((g) l02.get(i6)).d;
            }
        }
        return hVar;
    }

    public static Drawable j0(Context context, Context context2, int i2, Resources.Theme theme) {
        try {
            if (f5752a) {
                return O0(context2, i2, theme);
            }
        } catch (NoClassDefFoundError unused) {
            f5752a = false;
        } catch (IllegalStateException e6) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                return A.h.getDrawable(context2, i2);
            }
            throw e6;
        } catch (Resources.NotFoundException unused2) {
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        Resources resources = context2.getResources();
        ThreadLocal threadLocal = B.p.f164a;
        return B.i.a(resources, i2, theme);
    }

    public static void j1(long j6, String str, C1034c cVar) {
        o3.d.c(C0592h.b().e(), "players", str, "mainStatesObject").H(new C0185l(j6, str, cVar));
    }

    public static Drawable k0(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        Drawable J5;
        if (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (J5 = b.J(context, resourceId)) == null) {
            return typedArray.getDrawable(i2);
        }
        return J5;
    }

    public static void k1(long j6, androidx.fragment.app.D d6) {
        com.google.android.gms.internal.measurement.a.d(com.google.android.gms.internal.measurement.a.c(C0592h.b().e(), "players"), "estateObject", "allOwnEstates").E(o.getEstateObject().getFirebaseKeyNode()).E("lastTimeDailyTaxPaidInMilli").H(new U0.k(j6, d6));
    }

    public static ArrayList l0(int i2) {
        int i5 = i2;
        ArrayList arrayList = new ArrayList();
        if (i5 == 1) {
            arrayList.add(new g(R.string.estate_basement_modification_one_name, R.string.estate_basement_modification_one_description, R.drawable.estate_basement_modification_one, 10, 200, false));
        } else if (i5 == 2) {
            arrayList.add(new g(R.string.estate_apartment_modification_one_name, R.string.estate_apartment_modification_one_description, R.drawable.estate_apartment_modification_one, 11, 1000, false));
        } else if (i5 == 3) {
            arrayList.add(new g(R.string.estate_suburban_house_modification_one_name, R.string.estate_suburban_house_modification_one_description, R.drawable.estate_suburban_house_modification_one, 13, 2000, false));
            arrayList.add(new g(R.string.estate_suburban_house_modification_two_name, R.string.estate_servant_modification_description, R.drawable.estate_suburban_house_modification_two, 50, 500, true));
        } else if (i5 == 4) {
            arrayList.add(new g(R.string.estate_chalet_modification_one_name, R.string.estate_chalet_modification_one_description, R.drawable.estate_chalet_modification_one, 18, 5000, false));
            arrayList.add(new g(R.string.estate_chalet_modification_two_name, R.string.estate_chalet_modification_two_description, R.drawable.estate_chalet_modification_two, 18, 5000, false));
            arrayList.add(new g(R.string.estate_chalet_modification_three_name, R.string.estate_servant_modification_description, R.drawable.estate_chalet_modification_three, 50, 1000, true));
            arrayList.add(new g(R.string.estate_chalet_modification_four_name, R.string.estate_servant_modification_description, R.drawable.estate_chalet_modification_four, 100, 2000, true));
        } else if (i5 == 5) {
            arrayList.add(new g(R.string.estate_detached_house_modification_one_name, R.string.estate_detached_house_modification_one_description, R.drawable.estate_detached_house_modification_one, 60, 100000, false));
            arrayList.add(new g(R.string.estate_detached_house_modification_two_name, R.string.estate_detached_house_modification_two_description, R.drawable.estate_detached_house_modification_two, 60, 100000, false));
            arrayList.add(new g(R.string.estate_detached_house_modification_three_name, R.string.estate_servant_modification_description, R.drawable.estate_detached_house_modification_three, 100, 4000, true));
            arrayList.add(new g(R.string.estate_detached_house_modification_four_name, R.string.estate_servant_modification_description, R.drawable.estate_detached_house_modification_four, 150, 6000, true));
        } else if (i5 == 6) {
            arrayList.add(new g(R.string.estate_villa_modification_one_name, R.string.estate_villa_modification_one_description, R.drawable.estate_villa_modification_one, 85, 300000, false));
            arrayList.add(new g(R.string.estate_villa_modification_two_name, R.string.estate_villa_modification_two_description, R.drawable.estate_villa_modification_two, 85, 300000, false));
            arrayList.add(new g(R.string.estate_villa_modification_three_name, R.string.estate_servant_modification_description, R.drawable.estate_villa_modification_three, 150, 8000, true));
            arrayList.add(new g(R.string.estate_villa_modification_four_name, R.string.estate_servant_modification_description, R.drawable.estate_villa_modification_four, 200, 10000, true));
        } else if (i5 == 7) {
            arrayList.add(new g(R.string.estate_ranch_modification_one_name, R.string.estate_ranch_modification_one_description, R.drawable.estate_ranch_modification_one, 93, 500000, false));
            arrayList.add(new g(R.string.estate_ranch_modification_two_name, R.string.estate_ranch_modification_two_description, R.drawable.estate_ranch_modification_two, 93, 500000, false));
            arrayList.add(new g(R.string.estate_ranch_modification_three_name, R.string.estate_servant_modification_description, R.drawable.estate_ranch_modification_three, 200, 20000, true));
            arrayList.add(new g(R.string.estate_ranch_modification_four_name, R.string.estate_servant_modification_description, R.drawable.estate_ranch_modification_four, 250, 30000, true));
        } else if (i5 == 8) {
            arrayList.add(new g(R.string.estate_beach_house_modification_one_name, R.string.estate_beach_house_modification_one_description, R.drawable.estate_beach_house_modification_one, 72, 500000, false));
            arrayList.add(new g(R.string.estate_beach_house_modification_two_name, R.string.estate_beach_house_modification_two_description, R.drawable.estate_beach_house_modification_two, 72, 500000, false));
            arrayList.add(new g(R.string.estate_beach_house_modification_three_name, R.string.estate_servant_modification_description, R.drawable.estate_beach_house_modification_three, 250, 40000, true));
            arrayList.add(new g(R.string.estate_beach_house_modification_four_name, R.string.estate_servant_modification_description, R.drawable.estate_beach_house_modification_four, 300, 50000, true));
        } else if (i5 == 9) {
            arrayList.add(new g(R.string.estate_courtyard_modification_one_name, R.string.estate_courtyard_modification_one_description, R.drawable.estate_courtyard_modification_one, 90, 800000, false));
            arrayList.add(new g(R.string.estate_courtyard_modification_two_name, R.string.estate_courtyard_modification_two_description, R.drawable.estate_courtyard_modification_two, 90, 800000, false));
            arrayList.add(new g(R.string.estate_courtyard_modification_three_name, R.string.estate_servant_modification_description, R.drawable.estate_courtyard_modification_three, 300, 100000, true));
            arrayList.add(new g(R.string.estate_courtyard_modification_four_name, R.string.estate_servant_modification_description, R.drawable.estate_courtyard_modification_four, 350, 200000, true));
        } else if (i5 == 10) {
            arrayList.add(new g(R.string.estate_district_modification_one_name, R.string.estate_district_modification_one_description, R.drawable.estate_district_modification_one, 110, 900000, false));
            arrayList.add(new g(R.string.estate_district_modification_two_name, R.string.estate_district_modification_two_description, R.drawable.estate_district_modification_two, 110, 900000, false));
            arrayList.add(new g(R.string.estate_district_modification_three_name, R.string.estate_servant_modification_description, R.drawable.estate_district_modification_three, 350, 200000, true));
            arrayList.add(new g(R.string.estate_district_modification_four_name, R.string.estate_servant_modification_description, R.drawable.estate_district_modification_four, 400, 400000, true));
        } else if (i5 == 11) {
            arrayList.add(new g(R.string.estate_mansion_modification_one_name, R.string.estate_mansion_modification_one_description, R.drawable.estate_mansion_modificatoin_one, 135, 1000000, false));
            arrayList.add(new g(R.string.estate_mansion_modification_two_name, R.string.estate_mansion_modification_two_description, R.drawable.estate_mansion_modificatoin_two, 135, 1000000, false));
            arrayList.add(new g(R.string.estate_mansion_modification_three_name, R.string.estate_servant_modification_description, R.drawable.estate_mansion_modificatoin_three, 350, 300000, true));
            arrayList.add(new g(R.string.estate_mansion_modification_four_name, R.string.estate_servant_modification_description, R.drawable.estate_mansion_modificatoin_four, 400, 400000, true));
        } else if (i5 == 12) {
            arrayList.add(new g(R.string.estate_palace_modification_one_name, R.string.estate_palace_modification_one_description, R.drawable.estate_palace_modificatoin_one, 210, 2000000, false));
            arrayList.add(new g(R.string.estate_palace_modification_two_name, R.string.estate_palace_modification_two_description, R.drawable.estate_palace_modificatoin_two, 210, 2000000, false));
            arrayList.add(new g(R.string.estate_palace_modification_three_name, R.string.estate_servant_modification_description, R.drawable.estate_palace_modificatoin_three, 400, 500000, true));
            arrayList.add(new g(R.string.estate_palace_modification_four_name, R.string.estate_servant_modification_description, R.drawable.estate_palace_modificatoin_four, 450, 600000, true));
        } else if (i5 == 13) {
            arrayList.add(new g(R.string.estate_castle_modification_one_name, R.string.estate_castle_modification_one_description, R.drawable.estate_castle_modification_one, 322, 5000000, false));
            arrayList.add(new g(R.string.estate_castle_modification_two_name, R.string.estate_castle_modification_two_description, R.drawable.estate_castle_modification_two, 322, 5000000, false));
            arrayList.add(new g(R.string.estate_castle_modification_three_name, R.string.estate_servant_modification_description, R.drawable.estate_castle_modification_three, 450, 700000, true));
            arrayList.add(new g(R.string.estate_castle_modification_four_name, R.string.estate_servant_modification_description, R.drawable.estate_castle_modification_four, 500, 800000, true));
        } else if (i5 == 14) {
            arrayList.add(new g(R.string.estate_private_island_modification_one_name, R.string.estate_private_island_modification_one_description, R.drawable.estate_private_island_modification_one, 410, 10000000, false));
            arrayList.add(new g(R.string.estate_private_island_modification_two_name, R.string.estate_private_island_modification_two_description, R.drawable.estate_private_island_modification_two, 410, 10000000, false));
            arrayList.add(new g(R.string.estate_private_island_modification_three_name, R.string.estate_private_island_modification_three_description, R.drawable.estate_private_island_modification_three, 100, 100000000, false));
            arrayList.add(new g(R.string.estate_private_island_modification_four_name, R.string.estate_servant_modification_description, R.drawable.estate_private_island_modification_four, 500, 900000, true));
            arrayList.add(new g(R.string.estate_private_island_modification_five_name, R.string.estate_servant_modification_description, R.drawable.estate_private_island_modification_five, 600, 1000000, true));
        } else if (i5 == 15) {
            arrayList.add(new g(R.string.estate_space_station_modification_one_name, R.string.estate_space_station_modification_one_description, R.drawable.estate_space_station_modification_one, 450, 15000000, false));
            arrayList.add(new g(R.string.estate_space_station_modification_two_name, R.string.estate_space_station_modification_two_description, R.drawable.estate_space_station_modification_two, 450, 15000000, false));
            arrayList.add(new g(R.string.estate_space_station_modification_three_name, R.string.estate_space_station_modification_three_description, R.drawable.estate_space_station_modification_three, 100, 100000000, false));
            arrayList.add(new g(R.string.estate_space_station_modification_four_name, R.string.estate_space_station_modification_four_description, R.drawable.estate_space_station_modification_four, 550, 1500000, true));
            arrayList.add(new g(R.string.estate_space_station_modification_five_name, R.string.estate_space_station_modification_five_description, R.drawable.estate_space_station_modification_five, 650, 2500000, true));
        } else if (i5 == 16) {
            arrayList.add(new g(R.string.estate_space_station_modification_one_name, R.string.estate_space_station_modification_one_description, R.drawable.estate_space_station_modification_one, 450, 15000000, false));
            arrayList.add(new g(R.string.estate_space_station_modification_two_name, R.string.estate_space_station_modification_two_description, R.drawable.estate_space_station_modification_two, 450, 15000000, false));
            arrayList.add(new g(R.string.estate_space_station_modification_three_name, R.string.estate_space_station_modification_three_description, R.drawable.estate_space_station_modification_three, 100, 100000000, false));
            arrayList.add(new g(R.string.estate_space_station_modification_four_name, R.string.estate_space_station_modification_four_description, R.drawable.estate_space_station_modification_four, 550, 1500000, true));
            arrayList.add(new g(R.string.estate_space_station_modification_five_name, R.string.estate_space_station_modification_five_description, R.drawable.estate_space_station_modification_five, 650, 2500000, true));
        }
        return arrayList;
    }

    public static void l1(long j6, J j7) {
        int v02 = v0(80, "server_maximum_level");
        if (o.getMainStatesObject().getLevel() >= v02) {
            j7.h(true, o.getMainStatesObject());
        } else {
            com.google.android.gms.internal.measurement.a.v(com.google.android.gms.internal.measurement.a.c(C0592h.b().e(), "players"), "mainStatesObject").H(new C(v02, j6, j7));
        }
    }

    public static ArrayList m0() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Y4.h(0, R.string.estate_shack_name, R.string.estate_shack_description, R.drawable.estate_shack, 100, 0));
        arrayList.add(new Y4.h(1, R.string.estate_basement_name, R.string.estate_basement_description, R.drawable.estate_basement, 120, 1000));
        arrayList.add(new Y4.h(2, R.string.estate_apartment_name, R.string.estate_apartment_description, R.drawable.estate_apartment, 150, 5000));
        arrayList.add(new Y4.h(3, R.string.estate_suburban_house_name, R.string.estate_suburban_house_description, R.drawable.estate_suburban_house, 180, 10000));
        arrayList.add(new Y4.h(4, R.string.estate_chalet_name, R.string.estate_chalet_description, R.drawable.estate_chalet, 200, 50000));
        arrayList.add(new Y4.h(5, R.string.estate_detached_house_name, R.string.estate_detached_house_description, R.drawable.estate_detached_house, 450, 1000000));
        arrayList.add(new Y4.h(6, R.string.estate_villa_name, R.string.estate_villa_description, R.drawable.estate_villa, 700, 3000000));
        arrayList.add(new Y4.h(7, R.string.estate_ranch_name, R.string.estate_ranch_description, R.drawable.estate_ranch, 810, 5000000));
        arrayList.add(new Y4.h(8, R.string.estate_beach_house_name, R.string.estate_beach_house_description, R.drawable.estate_beach_house, 850, 6000000));
        arrayList.add(new Y4.h(9, R.string.estate_courtyard_name, R.string.estate_courtyard_description, R.drawable.estate_courtyard, 900, 8000000));
        arrayList.add(new Y4.h(10, R.string.estate_district_name, R.string.estate_district_description, R.drawable.estate_district, 1100, 9000000));
        arrayList.add(new Y4.h(11, R.string.estate_mansion_name, R.string.estate_mansion_description, R.drawable.estate_mansion, 1350, 10000000));
        arrayList.add(new Y4.h(12, R.string.estate_palace_name, R.string.estate_palace_description, R.drawable.estate_palace, 2100, 20000000));
        arrayList.add(new Y4.h(13, R.string.estate_castle_name, R.string.estate_castle_description, R.drawable.estate_castle, 3220, 50000000));
        arrayList.add(new Y4.h(14, R.string.estate_private_island_name, R.string.estate_private_island_description, R.drawable.estate_private_island, 4100, 100000000));
        arrayList.add(new Y4.h(15, R.string.estate_space_station_name, R.string.estate_space_station_description, R.drawable.estate_space_station, 4500, 400000000));
        return arrayList;
    }

    public static void m1(int i2, int i5, boolean z3, J j6) {
        if (z3) {
            c.s(false, new com.mtma.criminal.city.utils.I(i2, j6));
        } else {
            com.google.android.gms.internal.measurement.a.v(com.google.android.gms.internal.measurement.a.c(C0592h.b().e(), "players"), "mainStatesObject").H(new U0.b(i2, i5, (Object) j6, 1));
        }
    }

    public static int n0(int i2) {
        if (i2 == 0) {
            return R.string.gang_position_boss;
        }
        if (i2 == 1) {
            return R.string.gang_position_vise;
        }
        if (i2 == 2) {
            return R.string.gang_position_advisor;
        }
        if (i2 == 3) {
            return R.string.gang_position_operation_chief;
        }
        if (i2 == 4) {
            return R.string.gang_position_fighter;
        }
        return R.string.gang_position_new;
    }

    public static void n1(int i2, C0434d dVar) {
        com.google.android.gms.internal.measurement.a.d(com.google.android.gms.internal.measurement.a.c(C0592h.b().e(), "players"), "chatObject", "speakersNumber").H(new B0.l(i2, (Object) dVar, 7));
    }

    public static int o(int i2, byte[] bArr, int i5, int i6, A a6, C0258c cVar) {
        boolean z3;
        boolean z4;
        C0399d dVar = (C0399d) a6;
        int U5 = U(bArr, i5, cVar);
        if (cVar.f4551c != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        dVar.v(z3);
        while (U5 < i6) {
            int S5 = S(bArr, U5, cVar);
            if (i2 != cVar.f4550b) {
                break;
            }
            U5 = U(bArr, S5, cVar);
            if (cVar.f4551c != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            dVar.v(z4);
        }
        return U5;
    }

    public static long o0() {
        return p0(o.getMainStatesObject());
    }

    public static final void o1(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i2) {
        if (i2 < 0 || byteBuffer2.remaining() < i2 || byteBuffer3.remaining() < i2 || byteBuffer.remaining() < i2) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        for (int i5 = 0; i5 < i2; i5++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    public static int p(byte[] bArr, int i2, C0258c cVar) {
        int S5 = S(bArr, i2, cVar);
        int i5 = cVar.f4550b;
        if (i5 < 0) {
            throw D.e();
        } else if (i5 > bArr.length - S5) {
            throw D.g();
        } else if (i5 == 0) {
            cVar.d = C0404i.f6810b;
            return S5;
        } else {
            cVar.d = C0404i.v(bArr, S5, i5);
            return S5 + i5;
        }
    }

    public static long p0(k kVar) {
        return q0(kVar, o.getGymObject(), o.getSkillsObject(), o.getArmingObject(), o.getSchoolObject());
    }

    public static final byte[] p1(byte[] bArr, int i2, byte[] bArr2, int i5, int i6) {
        if (i6 < 0 || bArr.length - i6 < i2 || bArr2.length - i6 < i5) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        byte[] bArr3 = new byte[i6];
        for (int i7 = 0; i7 < i6; i7++) {
            bArr3[i7] = (byte) (bArr[i7 + i2] ^ bArr2[i7 + i5]);
        }
        return bArr3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x004d A[EDGE_INSN: B:30:0x004d->B:22:0x004d ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int q(int r2, byte[] r3, int r4, int r5, com.google.crypto.tink.shaded.protobuf.A r6, a1.C0258c r7) {
        /*
            int r4 = S(r3, r4, r7)
            int r0 = r7.f4550b
            if (r0 < 0) goto L_0x0053
            int r1 = r3.length
            int r1 = r1 - r4
            if (r0 > r1) goto L_0x004e
            if (r0 != 0) goto L_0x0014
            com.google.crypto.tink.shaded.protobuf.h r0 = com.google.crypto.tink.shaded.protobuf.C0404i.f6810b
            r6.add(r0)
            goto L_0x001c
        L_0x0014:
            com.google.crypto.tink.shaded.protobuf.h r1 = com.google.crypto.tink.shaded.protobuf.C0404i.v(r3, r4, r0)
            r6.add(r1)
        L_0x001b:
            int r4 = r4 + r0
        L_0x001c:
            if (r4 >= r5) goto L_0x004d
            int r0 = S(r3, r4, r7)
            int r1 = r7.f4550b
            if (r2 == r1) goto L_0x0027
            goto L_0x004d
        L_0x0027:
            int r4 = S(r3, r0, r7)
            int r0 = r7.f4550b
            if (r0 < 0) goto L_0x0048
            int r1 = r3.length
            int r1 = r1 - r4
            if (r0 > r1) goto L_0x0043
            if (r0 != 0) goto L_0x003b
            com.google.crypto.tink.shaded.protobuf.h r0 = com.google.crypto.tink.shaded.protobuf.C0404i.f6810b
            r6.add(r0)
            goto L_0x001c
        L_0x003b:
            com.google.crypto.tink.shaded.protobuf.h r1 = com.google.crypto.tink.shaded.protobuf.C0404i.v(r3, r4, r0)
            r6.add(r1)
            goto L_0x001b
        L_0x0043:
            com.google.crypto.tink.shaded.protobuf.D r2 = com.google.crypto.tink.shaded.protobuf.D.g()
            throw r2
        L_0x0048:
            com.google.crypto.tink.shaded.protobuf.D r2 = com.google.crypto.tink.shaded.protobuf.D.e()
            throw r2
        L_0x004d:
            return r4
        L_0x004e:
            com.google.crypto.tink.shaded.protobuf.D r2 = com.google.crypto.tink.shaded.protobuf.D.g()
            throw r2
        L_0x0053:
            com.google.crypto.tink.shaded.protobuf.D r2 = com.google.crypto.tink.shaded.protobuf.D.e()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.d.q(int, byte[], int, int, com.google.crypto.tink.shaded.protobuf.A, a1.c):int");
    }

    public static long q0(k kVar, C0475h hVar, r rVar, C0469b bVar, q qVar) {
        double d6;
        int level = kVar.getLevel();
        if (level <= 100) {
            d6 = 20.0d;
        } else if (level <= 200) {
            d6 = 15.0d;
        } else if (level <= 300) {
            d6 = 10.0d;
        } else {
            d6 = 5.0d;
        }
        long ceil = (long) (Math.ceil(((double) level) / d6) * ((double) (((long) level) * 100)));
        if (!(kVar.getLevel() == 1 && hVar.getDefense() == 10.0d)) {
            double d7 = (double) ceil;
            ceil = (long) (((((e.T(2, rVar, bVar, qVar) + 1.0d) * hVar.getDefense()) / d7) + 1.0d) * d7);
        }
        return (long) ((e.T(14, rVar, bVar, qVar) + 1.0d) * ((double) ceil));
    }

    public static final byte[] q1(byte[] bArr, byte[] bArr2) {
        if (bArr.length == bArr2.length) {
            return p1(bArr, 0, bArr2, 0, bArr.length);
        }
        throw new IllegalArgumentException("The lengths of x and y should match.");
    }

    public static double r(byte[] bArr, int i2) {
        return Double.longBitsToDouble(v(bArr, i2));
    }

    public static String r0() {
        return o3.d.g(e.d(2, (long) o.getLocationObject().getCurrentCity()), ".", e.d(2, 1));
    }

    public static e3.r r1(zzahq zzahq) {
        if (zzahq == null) {
            return null;
        }
        if (!TextUtils.isEmpty(zzahq.zze())) {
            String zzd = zzahq.zzd();
            String zzc = zzahq.zzc();
            long zza = zzahq.zza();
            String zze = zzahq.zze();
            I.d(zze);
            return new w(zza, zzd, zzc, zze);
        } else if (zzahq.zzb() == null) {
            return null;
        } else {
            String zzd2 = zzahq.zzd();
            String zzc2 = zzahq.zzc();
            long zza2 = zzahq.zza();
            zzair zzb = zzahq.zzb();
            I.h(zzb, "totpInfo cannot be null.");
            return new z(zzd2, zzc2, zza2, zzb);
        }
    }

    public static int s(int i2, byte[] bArr, int i5, int i6, A a6, C0258c cVar) {
        C0409n nVar = (C0409n) a6;
        nVar.v(r(bArr, i5));
        int i7 = i5 + 8;
        while (i7 < i6) {
            int S5 = S(bArr, i7, cVar);
            if (i2 != cVar.f4550b) {
                break;
            }
            nVar.v(Double.longBitsToDouble(v(bArr, S5)));
            i7 = S5 + 8;
        }
        return i7;
    }

    public static long s0(int i2) {
        if (i2 == 1) {
            return 5000000;
        }
        if (i2 == 2) {
            return 10000000;
        }
        if (i2 == 3) {
            return 20000000;
        }
        if (i2 == 4) {
            return 40000000;
        }
        if (i2 != 5) {
            return 500000000;
        }
        return 100000000;
    }

    public static ArrayList s1(List list) {
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            e3.r r12 = r1((zzahq) it2.next());
            if (r12 != null) {
                arrayList.add(r12);
            }
        }
        return arrayList;
    }

    public static int t(byte[] bArr, int i2) {
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    public static int t0(int i2) {
        if (i2 == 1) {
            return 10;
        }
        if (i2 == 2) {
            return 20;
        }
        if (i2 == 3) {
            return 30;
        }
        if (i2 == 4) {
            return 40;
        }
        if (i2 != 5) {
            return 100;
        }
        return 50;
    }

    public static int u(int i2, byte[] bArr, int i5, int i6, A a6, C0258c cVar) {
        C0419y yVar = (C0419y) a6;
        yVar.v(t(bArr, i5));
        int i7 = i5 + 4;
        while (i7 < i6) {
            int S5 = S(bArr, i7, cVar);
            if (i2 != cVar.f4550b) {
                break;
            }
            yVar.v(t(bArr, S5));
            i7 = S5 + 4;
        }
        return i7;
    }

    public static long u0(int i2) {
        if (i2 == 1) {
            return 1000;
        }
        if (i2 == 2) {
            return 5000;
        }
        if (i2 == 3) {
            return 15000;
        }
        if (i2 == 4) {
            return 30000;
        }
        if (i2 != 5) {
            return 100000;
        }
        return 50000;
    }

    public static long v(byte[] bArr, int i2) {
        return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
    }

    public static int v0(int i2, String str) {
        try {
            f fVar = new f(MyApplication.f7090a.getApplicationContext());
            fVar.w();
            return o0.b.a(MyApplication.f7090a.getApplicationContext(), fVar.e()).getInt(str, i2);
        } catch (Exception unused) {
            return i2;
        }
    }

    public static int w(int i2, byte[] bArr, int i5, int i6, A a6, C0258c cVar) {
        K k6 = (K) a6;
        k6.v(v(bArr, i5));
        int i7 = i5 + 8;
        while (i7 < i6) {
            int S5 = S(bArr, i7, cVar);
            if (i2 != cVar.f4550b) {
                break;
            }
            k6.v(v(bArr, S5));
            i7 = S5 + 8;
        }
        return i7;
    }

    public static long w0(int i2) {
        if (i2 < 10) {
            return (((long) i2) * 10) + 40;
        }
        if (i2 < 20) {
            return (long) (((i2 - 10) * 20) + 150);
        }
        if (i2 < 30) {
            return (long) (((i2 - 20) * 100) + 430);
        }
        if (i2 < 40) {
            return (long) (((i2 - 30) * 200) + 1600);
        }
        if (i2 < 60) {
            return (long) (((i2 - 40) * 1000) + 5900);
        }
        if (i2 < 360) {
            return (long) (((i2 - 60) * 2000) + 28610);
        }
        return -1;
    }

    public static float x(byte[] bArr, int i2) {
        return Float.intBitsToFloat(t(bArr, i2));
    }

    public static long x0(String str) {
        try {
            f fVar = new f(MyApplication.f7090a.getApplicationContext());
            fVar.w();
            return o0.b.a(MyApplication.f7090a.getApplicationContext(), fVar.e()).getLong(str, -1);
        } catch (Exception unused) {
            return -1;
        }
    }

    public static int y(int i2, byte[] bArr, int i5, int i6, A a6, C0258c cVar) {
        C0414t tVar = (C0414t) a6;
        tVar.v(x(bArr, i5));
        int i7 = i5 + 4;
        while (i7 < i6) {
            int S5 = S(bArr, i7, cVar);
            if (i2 != cVar.f4550b) {
                break;
            }
            tVar.v(Float.intBitsToFloat(t(bArr, S5)));
            i7 = S5 + 4;
        }
        return i7;
    }

    public static int y0(int i2) {
        if (i2 == 2) {
            return 35;
        }
        if (i2 == 3) {
            return 50;
        }
        if (i2 == 4) {
            return 65;
        }
        if (i2 == 5) {
            return 80;
        }
        if (i2 != 6) {
            return 20;
        }
        return 100;
    }

    public static int z(d0 d0Var, int i2, byte[] bArr, int i5, int i6, A a6, C0258c cVar) {
        int i7 = (i2 & -8) | 4;
        Object i8 = d0Var.i();
        int Q02 = Q0(i8, d0Var, bArr, i5, i6, i7, cVar);
        d0Var.d(i8);
        cVar.d = i8;
        a6.add(i8);
        while (Q02 < i6) {
            int S5 = S(bArr, Q02, cVar);
            if (i2 != cVar.f4550b) {
                break;
            }
            Object i9 = d0Var.i();
            int Q03 = Q0(i9, d0Var, bArr, S5, i6, i7, cVar);
            d0Var.d(i9);
            cVar.d = i9;
            a6.add(i9);
            Q02 = Q03;
        }
        return Q02;
    }

    public static int z0(int i2) {
        switch (i2) {
            case 0:
                return 69;
            case 1:
                return 70;
            case 2:
                return 71;
            case 3:
                return 72;
            case 4:
                return 73;
            case 5:
                return 74;
            case zzaky.zzf.zzf:
                return 75;
            case zzaky.zzf.zzg:
                return 76;
            case 8:
                return 77;
            case 9:
                return 78;
            case 10:
                return 79;
            case ModuleDescriptor.MODULE_VERSION:
                return 80;
            case 12:
                return 81;
            case 13:
                return 82;
            case 14:
                return 83;
            case 15:
                return 84;
            case 16:
                return 85;
            default:
                return -1;
        }
    }

    public float F0(View view) {
        if (g) {
            try {
                return x.a(view);
            } catch (NoSuchMethodError unused) {
                g = false;
            }
        }
        return view.getAlpha();
    }

    public H.h X(H.h[] hVarArr, int i2) {
        int i5;
        boolean z3;
        int i6;
        new H3.f(3);
        if ((i2 & 1) == 0) {
            i5 = 400;
        } else {
            i5 = 700;
        }
        if ((i2 & 2) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        H.h hVar = null;
        int i7 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        for (H.h hVar2 : hVarArr) {
            int abs = Math.abs(hVar2.f981c - i5) * 2;
            if (hVar2.d == z3) {
                i6 = 0;
            } else {
                i6 = 1;
            }
            int i8 = abs + i6;
            if (hVar == null || i7 > i8) {
                hVar = hVar2;
                i7 = i8;
            }
        }
        return hVar;
    }

    public void b1(View view, float f6) {
        if (g) {
            try {
                x.b(view, f6);
                return;
            } catch (NoSuchMethodError unused) {
                g = false;
            }
        }
        view.setAlpha(f6);
    }

    public void c1(View view, int i2) {
        if (!f5757i) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                h = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            f5757i = true;
        }
        Field field = h;
        if (field != null) {
            try {
                h.setInt(view, i2 | (field.getInt(view) & -13));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public abstract Typeface k(Context context, B.f fVar, Resources resources, int i2);

    public abstract Typeface l(Context context, H.h[] hVarArr, int i2);

    public Typeface m(Context context, InputStream inputStream) {
        File h02 = I1.b.h0(context);
        if (h02 == null) {
            return null;
        }
        try {
            if (!I1.b.q(h02, inputStream)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(h02.getPath());
            h02.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            h02.delete();
        }
    }

    public Typeface n(Context context, Resources resources, int i2, String str, int i5) {
        File h02 = I1.b.h0(context);
        if (h02 == null) {
            return null;
        }
        try {
            if (!I1.b.p(h02, resources, i2)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(h02.getPath());
            h02.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            h02.delete();
        }
    }
}
