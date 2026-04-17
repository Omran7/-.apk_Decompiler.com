package T1;

import java.util.concurrent.Callable;

/* renamed from: T1.l0  reason: case insensitive filesystem */
public final /* synthetic */ class C0186l0 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3373a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f3374b;

    public C0186l0(D0 d02, C0214v vVar, String str) {
        this.f3373a = 1;
        this.f3374b = d02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:219:?, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x01eb  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x01f0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r17 = this;
            r1 = r17
            int r0 = r1.f3373a
            switch(r0) {
                case 0: goto L_0x02d1;
                case 1: goto L_0x02b6;
                case 2: goto L_0x028d;
                case 3: goto L_0x0039;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r1.f3374b
            r2 = r0
            x0.c r2 = (x0.c) r2
            monitor-enter(r2)
            java.lang.Object r0 = r1.f3374b     // Catch:{ all -> 0x0017 }
            x0.c r0 = (x0.c) r0     // Catch:{ all -> 0x0017 }
            java.io.BufferedWriter r3 = r0.f12518r     // Catch:{ all -> 0x0017 }
            if (r3 != 0) goto L_0x0019
            monitor-exit(r2)     // Catch:{ all -> 0x0017 }
            goto L_0x0035
        L_0x0017:
            r0 = move-exception
            goto L_0x0037
        L_0x0019:
            r0.u()     // Catch:{ all -> 0x0017 }
            java.lang.Object r0 = r1.f3374b     // Catch:{ all -> 0x0017 }
            x0.c r0 = (x0.c) r0     // Catch:{ all -> 0x0017 }
            boolean r0 = r0.n()     // Catch:{ all -> 0x0017 }
            if (r0 == 0) goto L_0x0034
            java.lang.Object r0 = r1.f3374b     // Catch:{ all -> 0x0017 }
            x0.c r0 = (x0.c) r0     // Catch:{ all -> 0x0017 }
            r0.s()     // Catch:{ all -> 0x0017 }
            java.lang.Object r0 = r1.f3374b     // Catch:{ all -> 0x0017 }
            x0.c r0 = (x0.c) r0     // Catch:{ all -> 0x0017 }
            r3 = 0
            r0.f12520t = r3     // Catch:{ all -> 0x0017 }
        L_0x0034:
            monitor-exit(r2)     // Catch:{ all -> 0x0017 }
        L_0x0035:
            r0 = 0
            return r0
        L_0x0037:
            monitor-exit(r2)     // Catch:{ all -> 0x0017 }
            throw r0
        L_0x0039:
            java.lang.Object r0 = r1.f3374b
            r2 = r0
            w0.j r2 = (w0.C1063j) r2
            w0.a r0 = r2.f12379b
            java.lang.Object r3 = r0.f12334a
            monitor-enter(r3)
            w0.a r0 = r2.f12379b     // Catch:{ all -> 0x004e }
            int r0 = r0.f12335b     // Catch:{ all -> 0x004e }
            r4 = 0
            r5 = 3
            if (r0 != r5) goto L_0x0051
            monitor-exit(r3)     // Catch:{ all -> 0x004e }
            goto L_0x028a
        L_0x004e:
            r0 = move-exception
            goto L_0x028b
        L_0x0051:
            w0.a r0 = r2.f12379b     // Catch:{ all -> 0x004e }
            int r6 = r0.f12335b     // Catch:{ all -> 0x004e }
            monitor-exit(r3)     // Catch:{ all -> 0x004e }
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x0074
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r3 = "accountName"
            r0.putString(r3, r4)
            w0.a r3 = r2.f12379b
            java.lang.String r7 = r3.f12336c
            java.lang.Long r3 = r3.f12355y
            long r8 = r3.longValue()
            com.google.android.gms.internal.play_billing.zze.zzc(r0, r7, r8)
            goto L_0x0075
        L_0x0074:
            r0 = r4
        L_0x0075:
            r3 = 6
            r7 = 0
            r8 = 1
            w0.a r9 = r2.f12379b     // Catch:{ Exception -> 0x0097 }
            java.lang.Object r9 = r9.f12334a     // Catch:{ Exception -> 0x0097 }
            monitor-enter(r9)     // Catch:{ Exception -> 0x0097 }
            w0.a r10 = r2.f12379b     // Catch:{ all -> 0x01c1 }
            com.google.android.gms.internal.play_billing.zzan r10 = r10.h     // Catch:{ all -> 0x01c1 }
            monitor-exit(r9)     // Catch:{ all -> 0x01c1 }
            if (r10 != 0) goto L_0x009a
            w0.a r0 = r2.f12379b     // Catch:{ Exception -> 0x0097 }
            r0.m(r7)     // Catch:{ Exception -> 0x0097 }
            w0.a r0 = r2.f12379b     // Catch:{ Exception -> 0x0097 }
            w0.c r5 = w0.C1073t.f12398i     // Catch:{ Exception -> 0x0097 }
            r9 = 119(0x77, float:1.67E-43)
            r0.t(r9, r3, r5)     // Catch:{ Exception -> 0x0097 }
            r2.a(r5)     // Catch:{ Exception -> 0x0097 }
            goto L_0x028a
        L_0x0097:
            r0 = move-exception
            goto L_0x01c4
        L_0x009a:
            w0.a r9 = r2.f12379b     // Catch:{ Exception -> 0x0097 }
            android.content.Context r9 = r9.f12338f     // Catch:{ Exception -> 0x0097 }
            java.lang.String r9 = r9.getPackageName()     // Catch:{ Exception -> 0x0097 }
            r13 = r5
            r12 = 23
        L_0x00a5:
            if (r12 < r5) goto L_0x00d2
            if (r0 != 0) goto L_0x00b0
            java.lang.String r13 = "subs"
            int r13 = r10.zzy(r12, r9, r13)     // Catch:{ Exception -> 0x0097 }
            goto L_0x00b6
        L_0x00b0:
            java.lang.String r13 = "subs"
            int r13 = r10.zzc(r12, r9, r13, r0)     // Catch:{ Exception -> 0x0097 }
        L_0x00b6:
            if (r13 != 0) goto L_0x00cf
            java.lang.String r14 = "BillingClient"
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0097 }
            r15.<init>()     // Catch:{ Exception -> 0x0097 }
            java.lang.String r11 = "highestLevelSupportedForSubs: "
            r15.append(r11)     // Catch:{ Exception -> 0x0097 }
            r15.append(r12)     // Catch:{ Exception -> 0x0097 }
            java.lang.String r11 = r15.toString()     // Catch:{ Exception -> 0x0097 }
            com.google.android.gms.internal.play_billing.zze.zzk(r14, r11)     // Catch:{ Exception -> 0x0097 }
            goto L_0x00d3
        L_0x00cf:
            int r12 = r12 + -1
            goto L_0x00a5
        L_0x00d2:
            r12 = r7
        L_0x00d3:
            w0.a r11 = r2.f12379b     // Catch:{ Exception -> 0x0097 }
            r11.getClass()     // Catch:{ Exception -> 0x0097 }
            w0.a r11 = r2.f12379b     // Catch:{ Exception -> 0x0097 }
            if (r12 < r5) goto L_0x00de
            r14 = r8
            goto L_0x00df
        L_0x00de:
            r14 = r7
        L_0x00df:
            r11.f12340j = r14     // Catch:{ Exception -> 0x0097 }
            r11 = 9
            if (r12 >= r5) goto L_0x00ee
            java.lang.String r12 = "BillingClient"
            java.lang.String r14 = "In-app billing API does not support subscription on this device."
            com.google.android.gms.internal.play_billing.zze.zzk(r12, r14)     // Catch:{ Exception -> 0x0097 }
            r12 = r11
            goto L_0x00ef
        L_0x00ee:
            r12 = r8
        L_0x00ef:
            r14 = r13
            r13 = 23
        L_0x00f2:
            if (r13 < r5) goto L_0x0123
            if (r0 != 0) goto L_0x00fd
            java.lang.String r14 = "inapp"
            int r14 = r10.zzy(r13, r9, r14)     // Catch:{ Exception -> 0x0097 }
            goto L_0x0103
        L_0x00fd:
            java.lang.String r14 = "inapp"
            int r14 = r10.zzc(r13, r9, r14, r0)     // Catch:{ Exception -> 0x0097 }
        L_0x0103:
            if (r14 != 0) goto L_0x0120
            w0.a r0 = r2.f12379b     // Catch:{ Exception -> 0x0097 }
            r0.f12341k = r13     // Catch:{ Exception -> 0x0097 }
            java.lang.String r0 = "BillingClient"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0097 }
            r9.<init>()     // Catch:{ Exception -> 0x0097 }
            java.lang.String r10 = "mHighestLevelSupportedForInApp: "
            r9.append(r10)     // Catch:{ Exception -> 0x0097 }
            r9.append(r13)     // Catch:{ Exception -> 0x0097 }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x0097 }
            com.google.android.gms.internal.play_billing.zze.zzk(r0, r9)     // Catch:{ Exception -> 0x0097 }
            goto L_0x0123
        L_0x0120:
            int r13 = r13 + -1
            goto L_0x00f2
        L_0x0123:
            w0.a r0 = r2.f12379b     // Catch:{ Exception -> 0x0097 }
            int r9 = r0.f12341k     // Catch:{ Exception -> 0x0097 }
            r10 = 21
            if (r9 < r10) goto L_0x012d
            r10 = r8
            goto L_0x012e
        L_0x012d:
            r10 = r7
        L_0x012e:
            r0.f12350t = r10     // Catch:{ Exception -> 0x0097 }
            r10 = 20
            if (r9 < r10) goto L_0x0136
            r10 = r8
            goto L_0x0137
        L_0x0136:
            r10 = r7
        L_0x0137:
            r0.f12349s = r10     // Catch:{ Exception -> 0x0097 }
            r10 = 19
            if (r9 < r10) goto L_0x013f
            r10 = r8
            goto L_0x0140
        L_0x013f:
            r10 = r7
        L_0x0140:
            r0.f12348r = r10     // Catch:{ Exception -> 0x0097 }
            r10 = 17
            if (r9 < r10) goto L_0x0148
            r10 = r8
            goto L_0x0149
        L_0x0148:
            r10 = r7
        L_0x0149:
            r0.f12347q = r10     // Catch:{ Exception -> 0x0097 }
            r10 = 16
            if (r9 < r10) goto L_0x0151
            r10 = r8
            goto L_0x0152
        L_0x0151:
            r10 = r7
        L_0x0152:
            r0.f12346p = r10     // Catch:{ Exception -> 0x0097 }
            r10 = 15
            if (r9 < r10) goto L_0x015a
            r10 = r8
            goto L_0x015b
        L_0x015a:
            r10 = r7
        L_0x015b:
            r0.f12345o = r10     // Catch:{ Exception -> 0x0097 }
            r10 = 14
            if (r9 < r10) goto L_0x0163
            r10 = r8
            goto L_0x0164
        L_0x0163:
            r10 = r7
        L_0x0164:
            r0.f12344n = r10     // Catch:{ Exception -> 0x0097 }
            if (r9 < r11) goto L_0x016a
            r10 = r8
            goto L_0x016b
        L_0x016a:
            r10 = r7
        L_0x016b:
            r0.f12343m = r10     // Catch:{ Exception -> 0x0097 }
            if (r9 < r3) goto L_0x0171
            r10 = r8
            goto L_0x0172
        L_0x0171:
            r10 = r7
        L_0x0172:
            r0.f12342l = r10     // Catch:{ Exception -> 0x0097 }
            if (r9 >= r5) goto L_0x017f
            java.lang.String r0 = "BillingClient"
            java.lang.String r9 = "In-app billing API version 3 is not supported on this device."
            com.google.android.gms.internal.play_billing.zze.zzl(r0, r9)     // Catch:{ Exception -> 0x0097 }
            r12 = 36
        L_0x017f:
            if (r14 != 0) goto L_0x01b6
            w0.a r0 = r2.f12379b     // Catch:{ Exception -> 0x0097 }
            java.lang.Object r9 = r0.f12334a     // Catch:{ Exception -> 0x0097 }
            monitor-enter(r9)     // Catch:{ Exception -> 0x0097 }
            w0.a r0 = r2.f12379b     // Catch:{ all -> 0x018f }
            int r0 = r0.f12335b     // Catch:{ all -> 0x018f }
            if (r0 != r5) goto L_0x0191
            monitor-exit(r9)     // Catch:{ all -> 0x018f }
            goto L_0x028a
        L_0x018f:
            r0 = move-exception
            goto L_0x01b4
        L_0x0191:
            if (r6 != r8) goto L_0x0195
            r0 = r7
            goto L_0x0196
        L_0x0195:
            r0 = r8
        L_0x0196:
            w0.a r5 = r2.f12379b     // Catch:{ all -> 0x018f }
            r10 = 2
            r5.m(r10)     // Catch:{ all -> 0x018f }
            w0.a r5 = r2.f12379b     // Catch:{ all -> 0x018f }
            com.google.android.gms.common.api.internal.J r5 = r5.f12337e     // Catch:{ all -> 0x018f }
            if (r5 == 0) goto L_0x01a7
            w0.a r5 = r2.f12379b     // Catch:{ all -> 0x018f }
            com.google.android.gms.common.api.internal.J r5 = r5.f12337e     // Catch:{ all -> 0x018f }
            goto L_0x01a8
        L_0x01a7:
            r5 = r4
        L_0x01a8:
            monitor-exit(r9)     // Catch:{ all -> 0x018f }
            if (r5 == 0) goto L_0x01b2
            w0.a r9 = r2.f12379b     // Catch:{ Exception -> 0x0097 }
            boolean r9 = r9.f12350t     // Catch:{ Exception -> 0x0097 }
            r5.b(r9)     // Catch:{ Exception -> 0x0097 }
        L_0x01b2:
            r5 = r4
            goto L_0x01fc
        L_0x01b4:
            monitor-exit(r9)     // Catch:{ all -> 0x018f }
            throw r0     // Catch:{ Exception -> 0x0097 }
        L_0x01b6:
            if (r6 != r8) goto L_0x01ba
            r0 = r7
            goto L_0x01bb
        L_0x01ba:
            r0 = r8
        L_0x01bb:
            w0.a r5 = r2.f12379b     // Catch:{ Exception -> 0x0097 }
            r5.m(r7)     // Catch:{ Exception -> 0x0097 }
            goto L_0x01b2
        L_0x01c1:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x01c1 }
            throw r0     // Catch:{ Exception -> 0x0097 }
        L_0x01c4:
            if (r6 != r8) goto L_0x01c8
            r5 = r7
            goto L_0x01c9
        L_0x01c8:
            r5 = r8
        L_0x01c9:
            java.lang.String r6 = "BillingClient"
            java.lang.String r9 = "Exception while checking if billing is supported; try to reconnect"
            com.google.android.gms.internal.play_billing.zze.zzm(r6, r9, r0)
            boolean r6 = r0 instanceof android.os.DeadObjectException
            r9 = 42
            if (r6 == 0) goto L_0x01da
            r6 = 101(0x65, float:1.42E-43)
        L_0x01d8:
            r12 = r6
            goto L_0x01e9
        L_0x01da:
            boolean r6 = r0 instanceof android.os.RemoteException
            if (r6 == 0) goto L_0x01e1
            r6 = 100
            goto L_0x01d8
        L_0x01e1:
            boolean r6 = r0 instanceof java.lang.SecurityException
            if (r6 == 0) goto L_0x01e8
            r6 = 102(0x66, float:1.43E-43)
            goto L_0x01d8
        L_0x01e8:
            r12 = r9
        L_0x01e9:
            if (r12 != r9) goto L_0x01f0
            java.lang.String r0 = w0.C1071r.a(r0)
            goto L_0x01f1
        L_0x01f0:
            r0 = r4
        L_0x01f1:
            w0.a r6 = r2.f12379b
            r6.m(r7)
            r14 = r3
            r16 = r5
            r5 = r0
            r0 = r16
        L_0x01fc:
            if (r14 != 0) goto L_0x0241
            if (r8 == r0) goto L_0x0218
            w0.a r0 = r2.f12379b     // Catch:{ all -> 0x0216 }
            r0.getClass()     // Catch:{ all -> 0x0216 }
            com.google.android.gms.internal.play_billing.zzkd r3 = w0.C1071r.d(r3)     // Catch:{ all -> 0x020d }
            r0.l(r3)     // Catch:{ all -> 0x020d }
            goto L_0x023b
        L_0x020d:
            r0 = move-exception
            java.lang.String r3 = "BillingClient"
            java.lang.String r5 = "Unable to log."
            com.google.android.gms.internal.play_billing.zze.zzm(r3, r5, r0)     // Catch:{ all -> 0x0216 }
            goto L_0x023b
        L_0x0216:
            r0 = move-exception
            goto L_0x0234
        L_0x0218:
            w0.a r0 = r2.f12379b     // Catch:{ all -> 0x0216 }
            m0.a0 r0 = r0.g     // Catch:{ all -> 0x0216 }
            com.google.android.gms.internal.play_billing.zzlo r3 = com.google.android.gms.internal.play_billing.zzlq.zzc()     // Catch:{ all -> 0x0216 }
            com.google.android.gms.internal.play_billing.zzke r5 = com.google.android.gms.internal.play_billing.zzki.zzc()     // Catch:{ all -> 0x0216 }
            r5.zzn(r7)     // Catch:{ all -> 0x0216 }
            r3.zza(r5)     // Catch:{ all -> 0x0216 }
            com.google.android.gms.internal.play_billing.zzhk r3 = r3.zzf()     // Catch:{ all -> 0x0216 }
            com.google.android.gms.internal.play_billing.zzlq r3 = (com.google.android.gms.internal.play_billing.zzlq) r3     // Catch:{ all -> 0x0216 }
            r0.A(r3)     // Catch:{ all -> 0x0216 }
            goto L_0x023b
        L_0x0234:
            java.lang.String r3 = "BillingClient"
            java.lang.String r5 = "Unable to log."
            com.google.android.gms.internal.play_billing.zze.zzm(r3, r5, r0)
        L_0x023b:
            w0.c r0 = w0.C1073t.h
            r2.a(r0)
            goto L_0x028a
        L_0x0241:
            w0.c r6 = w0.C1073t.f12393a
            if (r8 == r0) goto L_0x024d
            w0.a r0 = r2.f12379b     // Catch:{ all -> 0x024b }
            r0.u(r12, r3, r6, r5)     // Catch:{ all -> 0x024b }
            goto L_0x0285
        L_0x024b:
            r0 = move-exception
            goto L_0x027e
        L_0x024d:
            com.google.android.gms.internal.play_billing.zzke r0 = com.google.android.gms.internal.play_billing.zzki.zzc()     // Catch:{ all -> 0x024b }
            int r3 = r6.f12358a     // Catch:{ all -> 0x024b }
            r0.zzn(r3)     // Catch:{ all -> 0x024b }
            java.lang.String r3 = r6.f12359b     // Catch:{ all -> 0x024b }
            r0.zzm(r3)     // Catch:{ all -> 0x024b }
            r0.zzo(r12)     // Catch:{ all -> 0x024b }
            if (r5 == 0) goto L_0x0263
            r0.zza(r5)     // Catch:{ all -> 0x024b }
        L_0x0263:
            w0.a r3 = r2.f12379b     // Catch:{ all -> 0x024b }
            m0.a0 r3 = r3.g     // Catch:{ all -> 0x024b }
            com.google.android.gms.internal.play_billing.zzlo r5 = com.google.android.gms.internal.play_billing.zzlq.zzc()     // Catch:{ all -> 0x024b }
            com.google.android.gms.internal.play_billing.zzhk r0 = r0.zzf()     // Catch:{ all -> 0x024b }
            com.google.android.gms.internal.play_billing.zzki r0 = (com.google.android.gms.internal.play_billing.zzki) r0     // Catch:{ all -> 0x024b }
            r5.zzm(r0)     // Catch:{ all -> 0x024b }
            com.google.android.gms.internal.play_billing.zzhk r0 = r5.zzf()     // Catch:{ all -> 0x024b }
            com.google.android.gms.internal.play_billing.zzlq r0 = (com.google.android.gms.internal.play_billing.zzlq) r0     // Catch:{ all -> 0x024b }
            r3.A(r0)     // Catch:{ all -> 0x024b }
            goto L_0x0285
        L_0x027e:
            java.lang.String r3 = "BillingClient"
            java.lang.String r5 = "Unable to log."
            com.google.android.gms.internal.play_billing.zze.zzm(r3, r5, r0)
        L_0x0285:
            w0.c r0 = w0.C1073t.f12393a
            r2.a(r0)
        L_0x028a:
            return r4
        L_0x028b:
            monitor-exit(r3)     // Catch:{ all -> 0x004e }
            throw r0
        L_0x028d:
            java.lang.Object r0 = r1.f3374b
            r2 = r0
            e0.a r2 = (e0.C0477a) r2
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.f7561e
            r3 = 1
            r0.set(r3)
            r0 = 10
            r4 = 0
            android.os.Process.setThreadPriority(r0)     // Catch:{ all -> 0x02aa }
            x1.d r0 = r2.f7563p     // Catch:{ all -> 0x02aa }
            r0.d()     // Catch:{ all -> 0x02aa }
            android.os.Binder.flushPendingCommands()     // Catch:{ all -> 0x02aa }
            r2.a(r4)
            return r4
        L_0x02aa:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicBoolean r5 = r2.d     // Catch:{ all -> 0x02b1 }
            r5.set(r3)     // Catch:{ all -> 0x02b1 }
            throw r0     // Catch:{ all -> 0x02b1 }
        L_0x02b1:
            r0 = move-exception
            r2.a(r4)
            throw r0
        L_0x02b6:
            java.lang.Object r0 = r1.f3374b
            T1.D0 r0 = (T1.D0) r0
            T1.T1 r2 = r0.f2818a
            r2.j()
            T1.T1 r0 = r0.f2818a
            T1.d0 r0 = r0.f3066q
            T1.T1.L(r0)
            r0.o()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "Unexpected call on client side"
            r0.<init>(r2)
            throw r0
        L_0x02d1:
            com.google.android.gms.internal.measurement.zzt r0 = new com.google.android.gms.internal.measurement.zzt
            java.lang.Object r2 = r1.f3374b
            T1.n0 r2 = (T1.C0192n0) r2
            S3.t r2 = r2.f3407t
            r0.<init>(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.C0186l0.call():java.lang.Object");
    }

    public /* synthetic */ C0186l0(Object obj, int i2) {
        this.f3373a = i2;
        this.f3374b = obj;
    }
}
