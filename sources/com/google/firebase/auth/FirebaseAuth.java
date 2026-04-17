package com.google.firebase.auth;

import B0.C0004c;
import B2.a;
import J2.o;
import K3.b;
import R2.i;
import S3.z;
import android.app.PendingIntent;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import androidx.emoji2.text.v;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.p002firebaseauthapi.zzach;
import com.google.android.gms.internal.p002firebaseauthapi.zzaei;
import com.google.android.gms.internal.p002firebaseauthapi.zzahn;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import e3.C0493a;
import e3.C0494b;
import e3.C0499g;
import e3.H;
import e3.m;
import f3.C0524a;
import f3.C0528e;
import f3.C0531h;
import f3.C0536m;
import f3.C0541r;
import f3.t;
import f3.u;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import o3.d;
import z1.C1132b;

public class FirebaseAuth implements C0524a {

    /* renamed from: a  reason: collision with root package name */
    public final i f6862a;

    /* renamed from: b  reason: collision with root package name */
    public final CopyOnWriteArrayList f6863b = new CopyOnWriteArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final CopyOnWriteArrayList f6864c = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList d = new CopyOnWriteArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final zzach f6865e;

    /* renamed from: f  reason: collision with root package name */
    public m f6866f;
    public final Object g = new Object();
    public final Object h = new Object();

    /* renamed from: i  reason: collision with root package name */
    public final String f6867i;

    /* renamed from: j  reason: collision with root package name */
    public o f6868j;

    /* renamed from: k  reason: collision with root package name */
    public final RecaptchaAction f6869k = RecaptchaAction.custom("getOobCode");

    /* renamed from: l  reason: collision with root package name */
    public final RecaptchaAction f6870l = RecaptchaAction.custom("signInWithPassword");

    /* renamed from: m  reason: collision with root package name */
    public final RecaptchaAction f6871m = RecaptchaAction.custom("signUpPassword");

    /* renamed from: n  reason: collision with root package name */
    public final z f6872n;

    /* renamed from: o  reason: collision with root package name */
    public final u f6873o;

    /* renamed from: p  reason: collision with root package name */
    public final b f6874p;

    /* renamed from: q  reason: collision with root package name */
    public final b f6875q;

    /* renamed from: r  reason: collision with root package name */
    public C0541r f6876r;

    /* renamed from: s  reason: collision with root package name */
    public final Executor f6877s;

    /* renamed from: t  reason: collision with root package name */
    public final Executor f6878t;

    /* renamed from: u  reason: collision with root package name */
    public final Executor f6879u;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: e3.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: f3.t} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: e3.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v2, resolved type: f3.t} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: e3.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v5, resolved type: f3.t} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x015d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FirebaseAuth(R2.i r13, K3.b r14, K3.b r15, java.util.concurrent.Executor r16, java.util.concurrent.Executor r17, java.util.concurrent.ScheduledExecutorService r18, java.util.concurrent.Executor r19) {
        /*
            r12 = this;
            r1 = r12
            r0 = r13
            r2 = r16
            r3 = 0
            com.google.android.gms.internal.firebase-auth-api.zzach r4 = new com.google.android.gms.internal.firebase-auth-api.zzach
            r5 = r18
            r4.<init>(r13, r2, r5)
            S3.z r5 = new S3.z
            r13.b()
            android.content.Context r6 = r0.f2490a
            java.lang.String r7 = r13.g()
            r8 = 13
            r5.<init>((int) r8, (boolean) r3)
            com.google.android.gms.common.internal.I.g(r6)
            com.google.android.gms.common.internal.I.d(r7)
            r5.f2711b = r7
            android.content.Context r6 = r6.getApplicationContext()
            r5.f2712c = r6
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "com.google.firebase.auth.api.Store."
            r8.<init>(r9)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            r8 = 0
            android.content.SharedPreferences r6 = r6.getSharedPreferences(r7, r8)
            r5.d = r6
            C1.a r6 = new C1.a
            java.lang.String r7 = "StorageHelpers"
            java.lang.String[] r9 = new java.lang.String[r8]
            r6.<init>(r7, r9)
            r5.f2713e = r6
            f3.u r6 = f3.u.f7957b
            r12.<init>()
            java.util.concurrent.CopyOnWriteArrayList r7 = new java.util.concurrent.CopyOnWriteArrayList
            r7.<init>()
            r1.f6863b = r7
            java.util.concurrent.CopyOnWriteArrayList r7 = new java.util.concurrent.CopyOnWriteArrayList
            r7.<init>()
            r1.f6864c = r7
            java.util.concurrent.CopyOnWriteArrayList r7 = new java.util.concurrent.CopyOnWriteArrayList
            r7.<init>()
            r1.d = r7
            java.lang.Object r7 = new java.lang.Object
            r7.<init>()
            r1.g = r7
            java.lang.Object r7 = new java.lang.Object
            r7.<init>()
            r1.h = r7
            java.lang.String r7 = "getOobCode"
            com.google.android.recaptcha.RecaptchaAction r7 = com.google.android.recaptcha.RecaptchaAction.custom(r7)
            r1.f6869k = r7
            java.lang.String r7 = "signInWithPassword"
            com.google.android.recaptcha.RecaptchaAction r7 = com.google.android.recaptcha.RecaptchaAction.custom(r7)
            r1.f6870l = r7
            java.lang.String r7 = "signUpPassword"
            com.google.android.recaptcha.RecaptchaAction r7 = com.google.android.recaptcha.RecaptchaAction.custom(r7)
            r1.f6871m = r7
            java.lang.String r7 = "sendVerificationCode"
            com.google.android.recaptcha.RecaptchaAction.custom(r7)
            java.lang.String r7 = "mfaSmsEnrollment"
            com.google.android.recaptcha.RecaptchaAction.custom(r7)
            java.lang.String r7 = "mfaSmsSignIn"
            com.google.android.recaptcha.RecaptchaAction.custom(r7)
            r1.f6862a = r0
            r1.f6865e = r4
            r1.f6872n = r5
            com.google.android.gms.common.internal.I.g(r6)
            r1.f6873o = r6
            r0 = r14
            r1.f6874p = r0
            r0 = r15
            r1.f6875q = r0
            r1.f6877s = r2
            r0 = r17
            r1.f6878t = r0
            r0 = r19
            r1.f6879u = r0
            java.lang.String r0 = "type"
            java.lang.String r2 = "com.google.firebase.auth.FIREBASE_USER"
            java.lang.String r2 = r5.L(r2)
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            r6 = 0
            if (r4 == 0) goto L_0x00c5
        L_0x00c3:
            r0 = r6
            goto L_0x00f3
        L_0x00c5:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Exception -> 0x00e1 }
            r4.<init>(r2)     // Catch:{ Exception -> 0x00e1 }
            boolean r2 = r4.has(r0)     // Catch:{ Exception -> 0x00e1 }
            if (r2 == 0) goto L_0x00c3
            java.lang.String r0 = r4.optString(r0)     // Catch:{ Exception -> 0x00e1 }
            java.lang.String r2 = "com.google.firebase.auth.internal.DefaultFirebaseUser"
            boolean r0 = r2.equalsIgnoreCase(r0)     // Catch:{ Exception -> 0x00e1 }
            if (r0 == 0) goto L_0x00c3
            f3.e r0 = r5.K(r4)     // Catch:{ Exception -> 0x00e1 }
            goto L_0x00f3
        L_0x00e1:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.Object r2 = r5.f2713e
            C1.a r2 = (C1.a) r2
            java.lang.String r4 = "Failed to restore user data from persistent storage."
            java.lang.String r5 = r2.f430a
            java.lang.String r0 = r2.d(r4, r0)
            android.util.Log.i(r5, r0)
            goto L_0x00c3
        L_0x00f3:
            r1.f6866f = r0
            if (r0 == 0) goto L_0x0132
            S3.z r2 = r1.f6872n
            r2.getClass()
            f3.c r0 = r0.f7921b
            java.lang.String r0 = r0.f7913a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "com.google.firebase.auth.GET_TOKEN_RESPONSE."
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            java.lang.String r0 = r2.L(r0)
            if (r0 == 0) goto L_0x012a
            com.google.android.gms.internal.firebase-auth-api.zzahn r0 = com.google.android.gms.internal.p002firebaseauthapi.zzahn.zzb(r0)     // Catch:{ zzaag -> 0x0119 }
            goto L_0x012b
        L_0x0119:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.Object r2 = r2.f2713e
            C1.a r2 = (C1.a) r2
            java.lang.String r4 = "Failed to restore token data from persistent storage."
            java.lang.String r5 = r2.f430a
            java.lang.String r0 = r2.d(r4, r0)
            android.util.Log.i(r5, r0)
        L_0x012a:
            r0 = r6
        L_0x012b:
            if (r0 == 0) goto L_0x0132
            e3.m r2 = r1.f6866f
            e(r12, r2, r0, r8, r8)
        L_0x0132:
            f3.u r0 = r1.f6873o
            f3.o r0 = r0.f7958a
            r0.getClass()
            R2.i r0 = r1.f6862a
            r0.b()
            android.content.Context r0 = r0.f2490a
            java.lang.String r2 = "com.google.firebase.auth.internal.ProcessDeathHelper"
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r2, r8)
            java.lang.String r2 = "firebaseAppName"
            java.lang.String r4 = ""
            java.lang.String r2 = r0.getString(r2, r4)
            R2.i r4 = r1.f6862a
            r4.b()
            java.lang.String r4 = r4.f2491b
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L_0x015d
            goto L_0x03bf
        L_0x015d:
            java.lang.String r2 = "verifyAssertionRequest"
            boolean r2 = r0.contains(r2)
            r4 = 0
            if (r2 == 0) goto L_0x0363
            java.lang.String r2 = "verifyAssertionRequest"
            java.lang.String r7 = ""
            java.lang.String r2 = r0.getString(r2, r7)
            android.os.Parcelable$Creator<com.google.android.gms.internal.firebase-auth-api.zzait> r7 = com.google.android.gms.internal.p002firebaseauthapi.zzait.CREATOR
            if (r2 != 0) goto L_0x0175
            r2 = r6
            goto L_0x017b
        L_0x0175:
            r9 = 10
            byte[] r2 = android.util.Base64.decode(r2, r9)
        L_0x017b:
            A1.c r2 = com.bumptech.glide.c.n(r2, r7)
            com.google.android.gms.internal.firebase-auth-api.zzait r2 = (com.google.android.gms.internal.p002firebaseauthapi.zzait) r2
            java.lang.String r7 = "operation"
            java.lang.String r9 = ""
            java.lang.String r7 = r0.getString(r7, r9)
            java.lang.String r9 = "tenantId"
            java.lang.String r9 = r0.getString(r9, r6)
            java.lang.String r10 = "firebaseUserUid"
            java.lang.String r11 = ""
            java.lang.String r10 = r0.getString(r10, r11)
            java.lang.String r11 = "timestamp"
            r0.getLong(r11, r4)
            if (r9 == 0) goto L_0x01ae
            com.google.android.gms.common.internal.I.d(r9)
            java.lang.Object r4 = r1.h
            monitor-enter(r4)
            r1.f6867i = r9     // Catch:{ all -> 0x01ab }
            monitor-exit(r4)     // Catch:{ all -> 0x01ab }
            r2.zzb((java.lang.String) r9)
            goto L_0x01ae
        L_0x01ab:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x01ab }
            throw r0
        L_0x01ae:
            r7.getClass()
            r4 = 17072(0x42b0, float:2.3923E-41)
            r5 = -1
            int r9 = r7.hashCode()
            switch(r9) {
                case -98509410: goto L_0x01d2;
                case 175006864: goto L_0x01c7;
                case 1450464913: goto L_0x01bc;
                default: goto L_0x01bb;
            }
        L_0x01bb:
            goto L_0x01dc
        L_0x01bc:
            java.lang.String r9 = "com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN"
            boolean r7 = r7.equals(r9)
            if (r7 != 0) goto L_0x01c5
            goto L_0x01dc
        L_0x01c5:
            r5 = 2
            goto L_0x01dc
        L_0x01c7:
            java.lang.String r9 = "com.google.firebase.auth.internal.NONGMSCORE_LINK"
            boolean r7 = r7.equals(r9)
            if (r7 != 0) goto L_0x01d0
            goto L_0x01dc
        L_0x01d0:
            r5 = 1
            goto L_0x01dc
        L_0x01d2:
            java.lang.String r9 = "com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE"
            boolean r7 = r7.equals(r9)
            if (r7 != 0) goto L_0x01db
            goto L_0x01dc
        L_0x01db:
            r5 = r3
        L_0x01dc:
            switch(r5) {
                case 0: goto L_0x029f;
                case 1: goto L_0x026c;
                case 2: goto L_0x01e1;
                default: goto L_0x01df;
            }
        L_0x01df:
            goto L_0x035f
        L_0x01e1:
            e3.G r2 = e3.G.x(r2)
            e3.c r2 = r2.w()
            boolean r3 = r2 instanceof e3.C0496d
            if (r3 == 0) goto L_0x024a
            e3.d r2 = (e3.C0496d) r2
            java.lang.String r3 = r2.f7642c
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x0219
            java.lang.String r3 = r2.f7641b
            com.google.android.gms.common.internal.I.g(r3)
            java.lang.String r4 = r1.f6867i
            java.lang.String r2 = r2.f7640a
            e3.E r5 = new e3.E
            r6 = 0
            r7 = 0
            r13 = r5
            r14 = r12
            r15 = r2
            r16 = r6
            r17 = r7
            r18 = r3
            r19 = r4
            r13.<init>(r14, r15, r16, r17, r18, r19)
            com.google.android.recaptcha.RecaptchaAction r2 = r1.f6870l
            r5.Q0(r12, r4, r2)
            goto L_0x035f
        L_0x0219:
            java.lang.String r3 = r2.f7642c
            com.google.android.gms.common.internal.I.d(r3)
            boolean r3 = r12.g(r3)
            if (r3 == 0) goto L_0x0232
            com.google.android.gms.common.api.Status r2 = new com.google.android.gms.common.api.Status
            r2.<init>(r4, r6, r6, r6)
            R2.k r2 = com.google.android.gms.internal.p002firebaseauthapi.zzaei.zza((com.google.android.gms.common.api.Status) r2)
            com.google.android.gms.tasks.Tasks.forException(r2)
            goto L_0x035f
        L_0x0232:
            e3.D r3 = new e3.D
            r4 = 0
            r13 = r3
            r14 = r12
            r15 = r8
            r16 = r6
            r17 = r2
            r18 = r4
            r13.<init>(r14, r15, r16, r17, r18)
            java.lang.String r2 = r1.f6867i
            com.google.android.recaptcha.RecaptchaAction r4 = r1.f6869k
            r3.Q0(r12, r2, r4)
            goto L_0x035f
        L_0x024a:
            boolean r3 = r2 instanceof e3.s
            R2.i r4 = r1.f6862a
            com.google.android.gms.internal.firebase-auth-api.zzach r5 = r1.f6865e
            if (r3 == 0) goto L_0x0260
            e3.s r2 = (e3.s) r2
            java.lang.String r3 = r1.f6867i
            e3.h r6 = new e3.h
            r6.<init>(r12)
            r5.zza((R2.i) r4, (e3.s) r2, (java.lang.String) r3, (f3.v) r6)
            goto L_0x035f
        L_0x0260:
            java.lang.String r3 = r1.f6867i
            e3.h r6 = new e3.h
            r6.<init>(r12)
            r5.zza((R2.i) r4, (e3.C0495c) r2, (java.lang.String) r3, (f3.v) r6)
            goto L_0x035f
        L_0x026c:
            e3.m r4 = r1.f6866f
            f3.e r4 = (f3.C0528e) r4
            f3.c r4 = r4.f7921b
            java.lang.String r4 = r4.f7913a
            boolean r4 = r4.equals(r10)
            if (r4 == 0) goto L_0x035f
            e3.m r4 = r1.f6866f
            e3.G r2 = e3.G.x(r2)
            com.google.android.gms.common.internal.I.g(r4)
            e3.c r2 = r2.w()
            e3.g r5 = new e3.g
            r5.<init>(r12, r3)
            com.google.android.gms.internal.firebase-auth-api.zzach r3 = r1.f6865e
            R2.i r6 = r1.f6862a
            r7 = 0
            r13 = r3
            r14 = r6
            r15 = r4
            r16 = r2
            r17 = r7
            r18 = r5
            r13.zza((R2.i) r14, (e3.m) r15, (e3.C0495c) r16, (java.lang.String) r17, (f3.t) r18)
            goto L_0x035f
        L_0x029f:
            e3.m r5 = r1.f6866f
            f3.e r5 = (f3.C0528e) r5
            f3.c r5 = r5.f7921b
            java.lang.String r5 = r5.f7913a
            boolean r5 = r5.equals(r10)
            if (r5 == 0) goto L_0x035f
            e3.m r5 = r1.f6866f
            e3.G r2 = e3.G.x(r2)
            com.google.android.gms.common.internal.I.g(r5)
            e3.c r2 = r2.w()
            boolean r7 = r2 instanceof e3.C0496d
            if (r7 == 0) goto L_0x0328
            e3.d r2 = (e3.C0496d) r2
            java.lang.String r3 = r2.f7641b
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x02cb
            java.lang.String r3 = "password"
            goto L_0x02cd
        L_0x02cb:
            java.lang.String r3 = "emailLink"
        L_0x02cd:
            java.lang.String r7 = "password"
            boolean r3 = r7.equals(r3)
            if (r3 == 0) goto L_0x02f8
            java.lang.String r3 = r2.f7641b
            com.google.android.gms.common.internal.I.d(r3)
            java.lang.String r4 = r5.v()
            java.lang.String r2 = r2.f7640a
            e3.E r6 = new e3.E
            r7 = 1
            r13 = r6
            r14 = r12
            r15 = r2
            r16 = r7
            r17 = r5
            r18 = r3
            r19 = r4
            r13.<init>(r14, r15, r16, r17, r18, r19)
            com.google.android.recaptcha.RecaptchaAction r2 = r1.f6870l
            r6.Q0(r12, r4, r2)
            goto L_0x035f
        L_0x02f8:
            java.lang.String r3 = r2.f7642c
            com.google.android.gms.common.internal.I.d(r3)
            boolean r3 = r12.g(r3)
            if (r3 == 0) goto L_0x0310
            com.google.android.gms.common.api.Status r2 = new com.google.android.gms.common.api.Status
            r2.<init>(r4, r6, r6, r6)
            R2.k r2 = com.google.android.gms.internal.p002firebaseauthapi.zzaei.zza((com.google.android.gms.common.api.Status) r2)
            com.google.android.gms.tasks.Tasks.forException(r2)
            goto L_0x035f
        L_0x0310:
            e3.D r3 = new e3.D
            r4 = 1
            r6 = 0
            r13 = r3
            r14 = r12
            r15 = r4
            r16 = r5
            r17 = r2
            r18 = r6
            r13.<init>(r14, r15, r16, r17, r18)
            java.lang.String r2 = r1.f6867i
            com.google.android.recaptcha.RecaptchaAction r4 = r1.f6869k
            r3.Q0(r12, r2, r4)
            goto L_0x035f
        L_0x0328:
            boolean r4 = r2 instanceof e3.s
            if (r4 == 0) goto L_0x0346
            e3.s r2 = (e3.s) r2
            java.lang.String r4 = r1.f6867i
            e3.g r6 = new e3.g
            r6.<init>(r12, r3)
            com.google.android.gms.internal.firebase-auth-api.zzach r3 = r1.f6865e
            R2.i r7 = r1.f6862a
            r13 = r3
            r14 = r7
            r15 = r5
            r16 = r2
            r17 = r4
            r18 = r6
            r13.zzb((R2.i) r14, (e3.m) r15, (e3.s) r16, (java.lang.String) r17, (f3.t) r18)
            goto L_0x035f
        L_0x0346:
            java.lang.String r4 = r5.v()
            e3.g r6 = new e3.g
            r6.<init>(r12, r3)
            com.google.android.gms.internal.firebase-auth-api.zzach r3 = r1.f6865e
            R2.i r7 = r1.f6862a
            r13 = r3
            r14 = r7
            r15 = r5
            r16 = r2
            r17 = r4
            r18 = r6
            r13.zzc(r14, r15, r16, r17, r18)
        L_0x035f:
            f3.C0538o.b(r0)
            goto L_0x03bf
        L_0x0363:
            java.lang.String r2 = "recaptchaToken"
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L_0x0393
            java.lang.String r2 = "recaptchaToken"
            java.lang.String r3 = ""
            java.lang.String r2 = r0.getString(r2, r3)
            java.lang.String r3 = "operation"
            java.lang.String r6 = ""
            java.lang.String r3 = r0.getString(r3, r6)
            java.lang.String r6 = "timestamp"
            r0.getLong(r6, r4)
            r3.getClass()
            java.lang.String r4 = "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x038c
            goto L_0x038f
        L_0x038c:
            com.google.android.gms.tasks.Tasks.forResult(r2)
        L_0x038f:
            f3.C0538o.b(r0)
            goto L_0x03bf
        L_0x0393:
            java.lang.String r2 = "statusCode"
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L_0x03bf
            java.lang.String r2 = "statusCode"
            r3 = 17062(0x42a6, float:2.3909E-41)
            int r2 = r0.getInt(r2, r3)
            java.lang.String r3 = "statusMessage"
            java.lang.String r7 = ""
            java.lang.String r3 = r0.getString(r3, r7)
            com.google.android.gms.common.api.Status r7 = new com.google.android.gms.common.api.Status
            r7.<init>(r2, r3, r6, r6)
            java.lang.String r2 = "timestamp"
            r0.getLong(r2, r4)
            f3.C0538o.b(r0)
            R2.k r0 = com.google.android.gms.internal.p002firebaseauthapi.zzaei.zza((com.google.android.gms.common.api.Status) r7)
            com.google.android.gms.tasks.Tasks.forException(r0)
        L_0x03bf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.FirebaseAuth.<init>(R2.i, K3.b, K3.b, java.util.concurrent.Executor, java.util.concurrent.Executor, java.util.concurrent.ScheduledExecutorService, java.util.concurrent.Executor):void");
    }

    public static void d(FirebaseAuth firebaseAuth, m mVar) {
        if (mVar != null) {
            String str = ((C0528e) mVar).f7921b.f7913a;
            Log.d("FirebaseAuth", "Notifying auth state listeners about user ( " + str + " ).");
        } else {
            Log.d("FirebaseAuth", "Notifying auth state listeners about a sign-out event.");
        }
        firebaseAuth.f6879u.execute(new C0004c((Object) firebaseAuth, 27));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:97|98|99|100|101|102) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:101:0x0238 */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0305  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x030a  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x031c  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0320  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0327  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0343  */
    /* JADX WARNING: Removed duplicated region for block: B:184:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void e(com.google.firebase.auth.FirebaseAuth r17, e3.m r18, com.google.android.gms.internal.p002firebaseauthapi.zzahn r19, boolean r20, boolean r21) {
        /*
            r0 = r17
            r1 = r18
            com.google.android.gms.common.internal.I.g(r18)
            com.google.android.gms.common.internal.I.g(r19)
            e3.m r2 = r0.f6866f
            if (r2 == 0) goto L_0x0023
            r5 = r1
            f3.e r5 = (f3.C0528e) r5
            f3.c r5 = r5.f7921b
            java.lang.String r5 = r5.f7913a
            f3.e r2 = (f3.C0528e) r2
            f3.c r2 = r2.f7921b
            java.lang.String r2 = r2.f7913a
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0023
            r2 = 1
            goto L_0x0024
        L_0x0023:
            r2 = 0
        L_0x0024:
            if (r2 != 0) goto L_0x0029
            if (r21 == 0) goto L_0x0029
            return
        L_0x0029:
            e3.m r5 = r0.f6866f
            if (r5 != 0) goto L_0x0030
            r2 = 1
            r5 = 1
            goto L_0x004c
        L_0x0030:
            f3.e r5 = (f3.C0528e) r5
            com.google.android.gms.internal.firebase-auth-api.zzahn r5 = r5.f7920a
            java.lang.String r5 = r5.zzc()
            java.lang.String r6 = r19.zzc()
            boolean r5 = r5.equals(r6)
            if (r2 == 0) goto L_0x0046
            if (r5 == 0) goto L_0x0046
            r5 = 0
            goto L_0x0047
        L_0x0046:
            r5 = 1
        L_0x0047:
            if (r2 != 0) goto L_0x004b
            r2 = 1
            goto L_0x004c
        L_0x004b:
            r2 = 0
        L_0x004c:
            e3.m r6 = r0.f6866f
            r7 = 0
            if (r6 == 0) goto L_0x00d0
            r8 = r1
            f3.e r8 = (f3.C0528e) r8
            f3.c r9 = r8.f7921b
            java.lang.String r9 = r9.f7913a
            if (r6 != 0) goto L_0x005c
            r6 = r7
            goto L_0x0062
        L_0x005c:
            f3.e r6 = (f3.C0528e) r6
            f3.c r6 = r6.f7921b
            java.lang.String r6 = r6.f7913a
        L_0x0062:
            boolean r6 = r9.equals(r6)
            if (r6 != 0) goto L_0x0069
            goto L_0x00d0
        L_0x0069:
            e3.m r6 = r0.f6866f
            java.util.ArrayList r9 = r8.f7923e
            r6.y(r9)
            boolean r6 = r18.w()
            if (r6 != 0) goto L_0x007e
            e3.m r6 = r0.f6866f
            f3.e r6 = (f3.C0528e) r6
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            r6.f7926q = r9
        L_0x007e:
            f3.n r6 = r8.f7930u
            if (r6 == 0) goto L_0x00b3
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.List r10 = r6.f7946a
            java.util.Iterator r10 = r10.iterator()
        L_0x008d:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x009d
            java.lang.Object r11 = r10.next()
            e3.w r11 = (e3.w) r11
            r9.add(r11)
            goto L_0x008d
        L_0x009d:
            java.util.List r6 = r6.f7947b
            java.util.Iterator r6 = r6.iterator()
        L_0x00a3:
            boolean r10 = r6.hasNext()
            if (r10 == 0) goto L_0x00b8
            java.lang.Object r10 = r6.next()
            e3.z r10 = (e3.z) r10
            r9.add(r10)
            goto L_0x00a3
        L_0x00b3:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        L_0x00b8:
            java.util.List r6 = r8.f7931v
            e3.m r8 = r0.f6866f
            r8.z(r9)
            e3.m r8 = r0.f6866f
            f3.e r8 = (f3.C0528e) r8
            if (r6 != 0) goto L_0x00cd
            r8.getClass()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L_0x00cd:
            r8.f7931v = r6
            goto L_0x00d2
        L_0x00d0:
            r0.f6866f = r1
        L_0x00d2:
            if (r20 == 0) goto L_0x0305
            S3.z r6 = r0.f6872n
            e3.m r8 = r0.f6866f
            r6.getClass()
            com.google.android.gms.common.internal.I.g(r8)
            java.lang.Object r9 = r6.f2713e
            C1.a r9 = (C1.a) r9
            org.json.JSONObject r10 = new org.json.JSONObject
            r10.<init>()
            java.lang.Class r11 = r8.getClass()
            java.lang.Class<f3.e> r12 = f3.C0528e.class
            boolean r11 = r12.isAssignableFrom(r11)
            if (r11 == 0) goto L_0x02f6
            f3.e r8 = (f3.C0528e) r8
            java.lang.String r7 = "cachedTokenState"
            com.google.android.gms.internal.firebase-auth-api.zzahn r11 = r8.f7920a     // Catch:{ Exception -> 0x0145 }
            java.lang.String r11 = r11.zzf()     // Catch:{ Exception -> 0x0145 }
            r10.put(r7, r11)     // Catch:{ Exception -> 0x0145 }
            java.lang.String r7 = "applicationName"
            java.lang.String r11 = r8.f7922c     // Catch:{ Exception -> 0x0145 }
            R2.i r11 = R2.i.f(r11)     // Catch:{ Exception -> 0x0145 }
            r11.b()     // Catch:{ Exception -> 0x0145 }
            java.lang.String r11 = r11.f2491b     // Catch:{ Exception -> 0x0145 }
            r10.put(r7, r11)     // Catch:{ Exception -> 0x0145 }
            java.lang.String r7 = "type"
            java.lang.String r11 = "com.google.firebase.auth.internal.DefaultFirebaseUser"
            r10.put(r7, r11)     // Catch:{ Exception -> 0x0145 }
            java.util.ArrayList r7 = r8.f7923e     // Catch:{ Exception -> 0x0145 }
            if (r7 == 0) goto L_0x020d
            org.json.JSONArray r7 = new org.json.JSONArray     // Catch:{ Exception -> 0x0145 }
            r7.<init>()     // Catch:{ Exception -> 0x0145 }
            java.util.ArrayList r11 = r8.f7923e     // Catch:{ Exception -> 0x0145 }
            int r12 = r11.size()     // Catch:{ Exception -> 0x0145 }
            int r13 = r11.size()     // Catch:{ Exception -> 0x0145 }
            r14 = 30
            if (r13 <= r14) goto L_0x0149
            java.lang.String r12 = "Provider user info list size larger than max size, truncating list to %d. Actual list size: %d"
            java.lang.Integer r13 = java.lang.Integer.valueOf(r14)     // Catch:{ Exception -> 0x0145 }
            int r15 = r11.size()     // Catch:{ Exception -> 0x0145 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ Exception -> 0x0145 }
            java.lang.Object[] r13 = new java.lang.Object[]{r13, r15}     // Catch:{ Exception -> 0x0145 }
            r9.f(r12, r13)     // Catch:{ Exception -> 0x0145 }
            r12 = r14
            goto L_0x0149
        L_0x0145:
            r0 = move-exception
            r3 = 0
            goto L_0x02e3
        L_0x0149:
            r13 = 0
            r14 = 0
        L_0x014b:
            java.lang.String r15 = "firebase"
            if (r13 >= r12) goto L_0x0170
            java.lang.Object r16 = r11.get(r13)     // Catch:{ Exception -> 0x0145 }
            r3 = r16
            f3.c r3 = (f3.C0526c) r3     // Catch:{ Exception -> 0x0145 }
            java.lang.String r4 = r3.f7914b     // Catch:{ Exception -> 0x0145 }
            boolean r4 = r4.equals(r15)     // Catch:{ Exception -> 0x0145 }
            if (r4 == 0) goto L_0x0160
            r14 = 1
        L_0x0160:
            int r4 = r12 + -1
            if (r13 != r4) goto L_0x0166
            if (r14 == 0) goto L_0x0170
        L_0x0166:
            java.lang.String r3 = r3.w()     // Catch:{ Exception -> 0x0145 }
            r7.put(r3)     // Catch:{ Exception -> 0x0145 }
            int r13 = r13 + 1
            goto L_0x014b
        L_0x0170:
            if (r14 != 0) goto L_0x0205
            int r3 = r12 + -1
        L_0x0174:
            int r4 = r11.size()     // Catch:{ Exception -> 0x0145 }
            if (r3 >= r4) goto L_0x0192
            if (r3 < 0) goto L_0x0192
            java.lang.Object r4 = r11.get(r3)     // Catch:{ Exception -> 0x0145 }
            f3.c r4 = (f3.C0526c) r4     // Catch:{ Exception -> 0x0145 }
            java.lang.String r13 = r4.f7914b     // Catch:{ Exception -> 0x0145 }
            boolean r13 = r13.equals(r15)     // Catch:{ Exception -> 0x0145 }
            if (r13 == 0) goto L_0x0195
            java.lang.String r3 = r4.w()     // Catch:{ Exception -> 0x0145 }
            r7.put(r3)     // Catch:{ Exception -> 0x0145 }
            r14 = 1
        L_0x0192:
            r16 = 1
            goto L_0x01a9
        L_0x0195:
            int r13 = r11.size()     // Catch:{ Exception -> 0x0145 }
            r16 = 1
            int r13 = r13 + -1
            if (r3 != r13) goto L_0x01a6
            java.lang.String r4 = r4.w()     // Catch:{ Exception -> 0x0145 }
            r7.put(r4)     // Catch:{ Exception -> 0x0145 }
        L_0x01a6:
            int r3 = r3 + 1
            goto L_0x0174
        L_0x01a9:
            if (r14 != 0) goto L_0x0207
            java.lang.String r3 = "Malformed user object! No Firebase Auth provider id found. Provider user info list size: %d, trimmed size: %d"
            int r4 = r11.size()     // Catch:{ Exception -> 0x0145 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x0145 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ Exception -> 0x0145 }
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r12}     // Catch:{ Exception -> 0x0145 }
            r9.f(r3, r4)     // Catch:{ Exception -> 0x0145 }
            int r3 = r11.size()     // Catch:{ Exception -> 0x0145 }
            r4 = 5
            if (r3 >= r4) goto L_0x0207
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0145 }
            java.lang.String r4 = "Provider user info list:\n"
            r3.<init>(r4)     // Catch:{ Exception -> 0x0145 }
            java.util.Iterator r4 = r11.iterator()     // Catch:{ Exception -> 0x0145 }
        L_0x01d2:
            boolean r11 = r4.hasNext()     // Catch:{ Exception -> 0x0145 }
            if (r11 == 0) goto L_0x01fa
            java.lang.Object r11 = r4.next()     // Catch:{ Exception -> 0x0145 }
            f3.c r11 = (f3.C0526c) r11     // Catch:{ Exception -> 0x0145 }
            java.lang.String r11 = r11.f7914b     // Catch:{ Exception -> 0x0145 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0145 }
            r12.<init>()     // Catch:{ Exception -> 0x0145 }
            java.lang.String r13 = "Provider - "
            r12.append(r13)     // Catch:{ Exception -> 0x0145 }
            r12.append(r11)     // Catch:{ Exception -> 0x0145 }
            java.lang.String r11 = "\n"
            r12.append(r11)     // Catch:{ Exception -> 0x0145 }
            java.lang.String r11 = r12.toString()     // Catch:{ Exception -> 0x0145 }
            r3.append(r11)     // Catch:{ Exception -> 0x0145 }
            goto L_0x01d2
        L_0x01fa:
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0145 }
            r4 = 0
            java.lang.Object[] r11 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0145 }
            r9.f(r3, r11)     // Catch:{ Exception -> 0x0145 }
            goto L_0x0207
        L_0x0205:
            r16 = 1
        L_0x0207:
            java.lang.String r3 = "userInfos"
            r10.put(r3, r7)     // Catch:{ Exception -> 0x0145 }
            goto L_0x020f
        L_0x020d:
            r16 = 1
        L_0x020f:
            java.lang.String r3 = "anonymous"
            boolean r4 = r8.w()     // Catch:{ Exception -> 0x0145 }
            r10.put(r3, r4)     // Catch:{ Exception -> 0x0145 }
            java.lang.String r3 = "version"
            java.lang.String r4 = "2"
            r10.put(r3, r4)     // Catch:{ Exception -> 0x0145 }
            f3.f r3 = r8.f7927r     // Catch:{ Exception -> 0x0145 }
            if (r3 == 0) goto L_0x023b
            java.lang.String r4 = "userMetadata"
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ Exception -> 0x0145 }
            r7.<init>()     // Catch:{ Exception -> 0x0145 }
            java.lang.String r11 = "lastSignInTimestamp"
            long r12 = r3.f7932a     // Catch:{ JSONException -> 0x0238 }
            r7.put(r11, r12)     // Catch:{ JSONException -> 0x0238 }
            java.lang.String r11 = "creationTimestamp"
            long r12 = r3.f7933b     // Catch:{ JSONException -> 0x0238 }
            r7.put(r11, r12)     // Catch:{ JSONException -> 0x0238 }
        L_0x0238:
            r10.put(r4, r7)     // Catch:{ Exception -> 0x0145 }
        L_0x023b:
            f3.n r3 = r8.f7930u     // Catch:{ Exception -> 0x0145 }
            if (r3 == 0) goto L_0x0270
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ Exception -> 0x0145 }
            r4.<init>()     // Catch:{ Exception -> 0x0145 }
            java.util.List r7 = r3.f7946a     // Catch:{ Exception -> 0x0145 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ Exception -> 0x0145 }
        L_0x024a:
            boolean r11 = r7.hasNext()     // Catch:{ Exception -> 0x0145 }
            if (r11 == 0) goto L_0x025a
            java.lang.Object r11 = r7.next()     // Catch:{ Exception -> 0x0145 }
            e3.w r11 = (e3.w) r11     // Catch:{ Exception -> 0x0145 }
            r4.add(r11)     // Catch:{ Exception -> 0x0145 }
            goto L_0x024a
        L_0x025a:
            java.util.List r3 = r3.f7947b     // Catch:{ Exception -> 0x0145 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ Exception -> 0x0145 }
        L_0x0260:
            boolean r7 = r3.hasNext()     // Catch:{ Exception -> 0x0145 }
            if (r7 == 0) goto L_0x0275
            java.lang.Object r7 = r3.next()     // Catch:{ Exception -> 0x0145 }
            e3.z r7 = (e3.z) r7     // Catch:{ Exception -> 0x0145 }
            r4.add(r7)     // Catch:{ Exception -> 0x0145 }
            goto L_0x0260
        L_0x0270:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ Exception -> 0x0145 }
            r4.<init>()     // Catch:{ Exception -> 0x0145 }
        L_0x0275:
            boolean r3 = r4.isEmpty()     // Catch:{ Exception -> 0x0145 }
            if (r3 != 0) goto L_0x029c
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ Exception -> 0x0145 }
            r3.<init>()     // Catch:{ Exception -> 0x0145 }
            r7 = 0
        L_0x0281:
            int r11 = r4.size()     // Catch:{ Exception -> 0x0145 }
            if (r7 >= r11) goto L_0x0297
            java.lang.Object r11 = r4.get(r7)     // Catch:{ Exception -> 0x0145 }
            e3.r r11 = (e3.r) r11     // Catch:{ Exception -> 0x0145 }
            org.json.JSONObject r11 = r11.w()     // Catch:{ Exception -> 0x0145 }
            r3.put(r11)     // Catch:{ Exception -> 0x0145 }
            int r7 = r7 + 1
            goto L_0x0281
        L_0x0297:
            java.lang.String r4 = "userMultiFactorInfo"
            r10.put(r4, r3)     // Catch:{ Exception -> 0x0145 }
        L_0x029c:
            java.util.List r3 = r8.f7931v     // Catch:{ Exception -> 0x0145 }
            if (r3 == 0) goto L_0x02dd
            boolean r4 = r3.isEmpty()     // Catch:{ Exception -> 0x0145 }
            if (r4 != 0) goto L_0x02dd
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch:{ Exception -> 0x0145 }
            r4.<init>()     // Catch:{ Exception -> 0x0145 }
            r7 = 0
        L_0x02ac:
            int r8 = r3.size()     // Catch:{ Exception -> 0x0145 }
            if (r7 >= r8) goto L_0x02d8
            java.lang.Object r8 = r3.get(r7)     // Catch:{ Exception -> 0x0145 }
            e3.F r8 = (e3.F) r8     // Catch:{ Exception -> 0x0145 }
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch:{ Exception -> 0x0145 }
            r11.<init>()     // Catch:{ Exception -> 0x0145 }
            java.lang.String r12 = r8.f7614a     // Catch:{ Exception -> 0x0145 }
            java.lang.String r13 = "credentialId"
            r11.put(r13, r12)     // Catch:{ Exception -> 0x0145 }
            java.lang.String r12 = "name"
            java.lang.String r13 = r8.f7615b     // Catch:{ Exception -> 0x0145 }
            r11.put(r12, r13)     // Catch:{ Exception -> 0x0145 }
            java.lang.String r12 = "displayName"
            java.lang.String r8 = r8.f7616c     // Catch:{ Exception -> 0x0145 }
            r11.put(r12, r8)     // Catch:{ Exception -> 0x0145 }
            r4.put(r11)     // Catch:{ Exception -> 0x0145 }
            int r7 = r7 + 1
            goto L_0x02ac
        L_0x02d8:
            java.lang.String r3 = "passkeyInfo"
            r10.put(r3, r4)     // Catch:{ Exception -> 0x0145 }
        L_0x02dd:
            java.lang.String r7 = r10.toString()     // Catch:{ Exception -> 0x0145 }
            r3 = 0
            goto L_0x02f9
        L_0x02e3:
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r2 = r9.f430a
            java.lang.String r3 = "Failed to turn object into JSON"
            java.lang.String r1 = r9.d(r3, r1)
            android.util.Log.wtf(r2, r1, r0)
            com.google.android.gms.internal.firebase-auth-api.zzaag r1 = new com.google.android.gms.internal.firebase-auth-api.zzaag
            r1.<init>(r0)
            throw r1
        L_0x02f6:
            r3 = 0
            r16 = 1
        L_0x02f9:
            boolean r4 = android.text.TextUtils.isEmpty(r7)
            if (r4 != 0) goto L_0x0308
            java.lang.String r4 = "com.google.firebase.auth.FIREBASE_USER"
            r6.M(r4, r7)
            goto L_0x0308
        L_0x0305:
            r3 = 0
            r16 = 1
        L_0x0308:
            if (r5 == 0) goto L_0x031c
            e3.m r4 = r0.f6866f
            if (r4 == 0) goto L_0x0316
            r5 = r4
            f3.e r5 = (f3.C0528e) r5
            r6 = r19
            r5.f7920a = r6
            goto L_0x0318
        L_0x0316:
            r6 = r19
        L_0x0318:
            f(r0, r4)
            goto L_0x031e
        L_0x031c:
            r6 = r19
        L_0x031e:
            if (r2 == 0) goto L_0x0325
            e3.m r2 = r0.f6866f
            d(r0, r2)
        L_0x0325:
            if (r20 == 0) goto L_0x033f
            S3.z r2 = r0.f6872n
            r2.getClass()
            f3.e r1 = (f3.C0528e) r1
            f3.c r1 = r1.f7921b
            java.lang.String r1 = r1.f7913a
            java.lang.String r4 = "com.google.firebase.auth.GET_TOKEN_RESPONSE."
            java.lang.String r1 = o3.d.i(r4, r1)
            java.lang.String r4 = r19.zzf()
            r2.M(r1, r4)
        L_0x033f:
            e3.m r1 = r0.f6866f
            if (r1 == 0) goto L_0x038c
            f3.r r2 = r0.f6876r
            if (r2 != 0) goto L_0x0353
            R2.i r2 = r0.f6862a
            com.google.android.gms.common.internal.I.g(r2)
            f3.r r4 = new f3.r
            r4.<init>(r2)
            r0.f6876r = r4
        L_0x0353:
            f3.r r0 = r0.f6876r
            f3.e r1 = (f3.C0528e) r1
            com.google.android.gms.internal.firebase-auth-api.zzahn r1 = r1.f7920a
            r0.getClass()
            if (r1 != 0) goto L_0x035f
            goto L_0x038c
        L_0x035f:
            long r4 = r1.zza()
            r6 = 0
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 > 0) goto L_0x036b
            r4 = 3600(0xe10, double:1.7786E-320)
        L_0x036b:
            long r1 = r1.zzb()
            r6 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r6
            long r4 = r4 + r1
            f3.h r1 = r0.f7954b
            r1.f7939a = r4
            r4 = -1
            r1.f7940b = r4
            int r1 = r0.f7953a
            if (r1 <= 0) goto L_0x0385
            boolean r1 = r0.f7955c
            if (r1 != 0) goto L_0x0385
            r3 = r16
        L_0x0385:
            if (r3 == 0) goto L_0x038c
            f3.h r0 = r0.f7954b
            r0.a()
        L_0x038c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.FirebaseAuth.e(com.google.firebase.auth.FirebaseAuth, e3.m, com.google.android.gms.internal.firebase-auth-api.zzahn, boolean, boolean):void");
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [P3.b, java.lang.Object] */
    public static void f(FirebaseAuth firebaseAuth, m mVar) {
        String str;
        if (mVar != null) {
            String str2 = ((C0528e) mVar).f7921b.f7913a;
            Log.d("FirebaseAuth", "Notifying id token listeners about user ( " + str2 + " ).");
        } else {
            Log.d("FirebaseAuth", "Notifying id token listeners about a sign-out event.");
        }
        if (mVar != null) {
            str = ((C0528e) mVar).f7920a.zzc();
        } else {
            str = null;
        }
        ? obj = new Object();
        obj.f2184a = str;
        firebaseAuth.f6879u.execute(new a((Object) firebaseAuth, (Object) obj, 26));
    }

    public static FirebaseAuth getInstance() {
        return (FirebaseAuth) i.e().c(FirebaseAuth.class);
    }

    public final Task a(String str) {
        I.d(str);
        I.d(str);
        C0493a aVar = new C0493a(new v(17));
        aVar.f7634r = 1;
        return new H(this, str, aVar, 1).Q0(this, this.f6867i, this.f6869k);
    }

    public final void b() {
        z zVar = this.f6872n;
        I.g(zVar);
        m mVar = this.f6866f;
        if (mVar != null) {
            ((SharedPreferences) zVar.d).edit().remove(d.i("com.google.firebase.auth.GET_TOKEN_RESPONSE.", ((C0528e) mVar).f7921b.f7913a)).apply();
            this.f6866f = null;
        }
        ((SharedPreferences) zVar.d).edit().remove("com.google.firebase.auth.FIREBASE_USER").apply();
        f(this, (m) null);
        d(this, (m) null);
        C0541r rVar = this.f6876r;
        if (rVar != null) {
            C0531h hVar = rVar.f7954b;
            hVar.d.removeCallbacks(hVar.f7942e);
        }
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [e3.g, f3.t] */
    public final Task c(m mVar, boolean z3) {
        if (mVar == null) {
            return Tasks.forException(zzaei.zza(new Status(17495, (String) null, (PendingIntent) null, (C1132b) null)));
        }
        zzahn zzahn = ((C0528e) mVar).f7920a;
        if (zzahn.zzg() && !z3) {
            return Tasks.forResult(C0536m.a(zzahn.zzc()));
        }
        return this.f6865e.zza(this.f6862a, mVar, zzahn.zzd(), (t) new C0499g(this, 1));
    }

    public final boolean g(String str) {
        C0494b bVar;
        int i2 = C0494b.f7637c;
        I.d(str);
        try {
            bVar = new C0494b(str);
        } catch (IllegalArgumentException unused) {
            bVar = null;
        }
        if (bVar == null || TextUtils.equals(this.f6867i, bVar.f7639b)) {
            return false;
        }
        return true;
    }

    public static FirebaseAuth getInstance(i iVar) {
        return (FirebaseAuth) iVar.c(FirebaseAuth.class);
    }
}
