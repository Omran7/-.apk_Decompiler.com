package L3;

import H3.f;
import I3.h;
import K3.b;
import M3.a;
import N3.c;
import R2.i;
import R2.k;
import android.net.TrafficStats;
import android.util.Log;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import g3.l;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import q.C0928e;

public final class d implements e {

    /* renamed from: m  reason: collision with root package name */
    public static final Object f1716m = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final i f1717a;

    /* renamed from: b  reason: collision with root package name */
    public final c f1718b;

    /* renamed from: c  reason: collision with root package name */
    public final h f1719c;
    public final k d;

    /* renamed from: e  reason: collision with root package name */
    public final l f1720e;

    /* renamed from: f  reason: collision with root package name */
    public final i f1721f;
    public final Object g;
    public final ExecutorService h;

    /* renamed from: i  reason: collision with root package name */
    public final h3.l f1722i;

    /* renamed from: j  reason: collision with root package name */
    public String f1723j;

    /* renamed from: k  reason: collision with root package name */
    public final HashSet f1724k;

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList f1725l;

    static {
        new AtomicInteger(1);
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [L3.i, java.lang.Object] */
    public d(i iVar, b bVar, ExecutorService executorService, h3.l lVar) {
        iVar.b();
        c cVar = new c(iVar.f2490a, bVar);
        h hVar = new h((Object) iVar, 19);
        if (f.f1015b == null) {
            f.f1015b = new f(14);
        }
        f fVar = f.f1015b;
        if (k.d == null) {
            k.d = new k(fVar);
        }
        k kVar = k.d;
        l lVar2 = new l(new b(iVar, 0));
        ? obj = new Object();
        this.g = new Object();
        this.f1724k = new HashSet();
        this.f1725l = new ArrayList();
        this.f1717a = iVar;
        this.f1718b = cVar;
        this.f1719c = hVar;
        this.d = kVar;
        this.f1720e = lVar2;
        this.f1721f = obj;
        this.h = executorService;
        this.f1722i = lVar;
    }

    public final void a() {
        h b6;
        M3.b F;
        synchronized (f1716m) {
            try {
                i iVar = this.f1717a;
                iVar.b();
                b6 = h.b(iVar.f2490a);
                F = this.f1719c.F();
                int i2 = F.f1830b;
                boolean z3 = true;
                if (i2 != 2) {
                    if (i2 != 1) {
                        z3 = false;
                    }
                }
                if (z3) {
                    String f6 = f(F);
                    h hVar = this.f1719c;
                    a a6 = F.a();
                    a6.f1824a = f6;
                    a6.f1825b = 3;
                    F = a6.a();
                    hVar.t(F);
                }
                if (b6 != null) {
                    b6.J();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        i(F);
        this.f1722i.execute(new c(this, 1));
    }

    public final M3.b b(M3.b bVar) {
        boolean z3;
        N3.b f6;
        M3.b bVar2 = bVar;
        i iVar = this.f1717a;
        iVar.b();
        String str = iVar.f2492c.f2500a;
        String str2 = bVar2.f1829a;
        i iVar2 = this.f1717a;
        iVar2.b();
        String str3 = iVar2.f2492c.g;
        String str4 = bVar2.d;
        c cVar = this.f1718b;
        N3.d dVar = cVar.f1908c;
        if (dVar.a()) {
            URL a6 = c.a("projects/" + str3 + "/installations/" + str2 + "/authTokens:generate");
            int i2 = 0;
            while (i2 <= 1) {
                TrafficStats.setThreadStatsTag(32771);
                HttpURLConnection c3 = cVar.c(a6, str);
                try {
                    c3.setRequestMethod("POST");
                    c3.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    c3.setDoOutput(true);
                    c.h(c3);
                    int responseCode = c3.getResponseCode();
                    dVar.b(responseCode);
                    if (responseCode < 200 || responseCode >= 300) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (z3) {
                        f6 = c.f(c3);
                    } else {
                        c.b(c3, (String) null, str, str3);
                        if (responseCode == 401 || responseCode == 404) {
                            A2.f a7 = N3.b.a();
                            a7.f29b = 3;
                            f6 = a7.b();
                        } else if (responseCode != 429) {
                            if (responseCode < 500 || responseCode >= 600) {
                                Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                A2.f a8 = N3.b.a();
                                a8.f29b = 2;
                                f6 = a8.b();
                            }
                            c3.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            i2++;
                        } else {
                            throw new k("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                        }
                    }
                    c3.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    int c6 = C0928e.c(f6.f1904c);
                    if (c6 == 0) {
                        k kVar = this.d;
                        kVar.getClass();
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        kVar.f1733a.getClass();
                        long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                        a a9 = bVar.a();
                        a9.f1826c = f6.f1902a;
                        a9.f1827e = Long.valueOf(f6.f1903b);
                        a9.f1828f = Long.valueOf(seconds);
                        return a9.a();
                    } else if (c6 == 1) {
                        a a10 = bVar.a();
                        a10.g = "BAD CONFIG";
                        a10.f1825b = 5;
                        return a10.a();
                    } else if (c6 == 2) {
                        synchronized (this) {
                            this.f1723j = null;
                        }
                        a a11 = bVar.a();
                        a11.f1825b = 2;
                        return a11.a();
                    } else {
                        throw new k("Firebase Installations Service is unavailable. Please try again later.");
                    }
                } catch (IOException | AssertionError unused) {
                } catch (Throwable th) {
                    c3.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            }
            throw new k("Firebase Installations Service is unavailable. Please try again later.");
        }
        throw new k("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final Task c() {
        String str;
        e();
        synchronized (this) {
            str = this.f1723j;
        }
        if (str != null) {
            return Tasks.forResult(str);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        h hVar = new h(taskCompletionSource);
        synchronized (this.g) {
            this.f1725l.add(hVar);
        }
        Task task = taskCompletionSource.getTask();
        this.h.execute(new c(this, 0));
        return task;
    }

    public final Task d() {
        e();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        g gVar = new g(this.d, taskCompletionSource);
        synchronized (this.g) {
            this.f1725l.add(gVar);
        }
        Task task = taskCompletionSource.getTask();
        this.h.execute(new c(this, 2));
        return task;
    }

    public final void e() {
        i iVar = this.f1717a;
        iVar.b();
        I.e(iVar.f2492c.f2501b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        iVar.b();
        I.e(iVar.f2492c.g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        iVar.b();
        I.e(iVar.f2492c.f2500a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        iVar.b();
        String str = iVar.f2492c.f2501b;
        Pattern pattern = k.f1732c;
        I.a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        iVar.b();
        I.a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", k.f1732c.matcher(iVar.f2492c.f2500a).matches());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
        if ("[DEFAULT]".equals(r0.f2491b) != false) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String f(M3.b r6) {
        /*
            r5 = this;
            R2.i r0 = r5.f1717a
            r0.b()
            java.lang.String r0 = r0.f2491b
            java.lang.String r1 = "CHIME_ANDROID_SDK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x001e
            R2.i r0 = r5.f1717a
            r0.b()
            java.lang.String r1 = "[DEFAULT]"
            java.lang.String r0 = r0.f2491b
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005b
        L_0x001e:
            r0 = 1
            int r6 = r6.f1830b
            if (r6 != r0) goto L_0x005b
            g3.l r6 = r5.f1720e
            java.lang.Object r6 = r6.get()
            M3.c r6 = (M3.c) r6
            android.content.SharedPreferences r0 = r6.f1835a
            monitor-enter(r0)
            android.content.SharedPreferences r1 = r6.f1835a     // Catch:{ all -> 0x003f }
            monitor-enter(r1)     // Catch:{ all -> 0x003f }
            android.content.SharedPreferences r2 = r6.f1835a     // Catch:{ all -> 0x0056 }
            java.lang.String r3 = "|S|id"
            r4 = 0
            java.lang.String r2 = r2.getString(r3, r4)     // Catch:{ all -> 0x0056 }
            monitor-exit(r1)     // Catch:{ all -> 0x0056 }
            if (r2 == 0) goto L_0x0041
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            goto L_0x0046
        L_0x003f:
            r6 = move-exception
            goto L_0x0059
        L_0x0041:
            java.lang.String r2 = r6.a()     // Catch:{ all -> 0x003f }
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
        L_0x0046:
            boolean r6 = android.text.TextUtils.isEmpty(r2)
            if (r6 == 0) goto L_0x0055
            L3.i r6 = r5.f1721f
            r6.getClass()
            java.lang.String r2 = L3.i.a()
        L_0x0055:
            return r2
        L_0x0056:
            r6 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0056 }
            throw r6     // Catch:{ all -> 0x003f }
        L_0x0059:
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            throw r6
        L_0x005b:
            L3.i r6 = r5.f1721f
            r6.getClass()
            java.lang.String r6 = L3.i.a()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: L3.d.f(M3.b):java.lang.String");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:18|19|20) */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0050, code lost:
        if (r9.startsWith("{") == false) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r5 = new org.json.JSONObject(r9).getString("token");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005e, code lost:
        r5 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x018e, code lost:
        r15.disconnect();
        android.net.TrafficStats.clearThreadStatsTag();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0194, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x005f */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c8 A[Catch:{ IOException | AssertionError -> 0x0195, all -> 0x00c8 }, ExcHandler: all (r0v3 'th' java.lang.Throwable A[CUSTOM_DECLARE, Catch:{ IOException | AssertionError -> 0x0195, all -> 0x00c8 }]), Splitter:B:34:0x00ba] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final M3.b g(M3.b r23) {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            java.lang.String r2 = r0.f1829a
            r3 = 4
            r5 = 0
            if (r2 == 0) goto L_0x006a
            int r2 = r2.length()
            r6 = 11
            if (r2 != r6) goto L_0x006a
            g3.l r2 = r1.f1720e
            java.lang.Object r2 = r2.get()
            M3.c r2 = (M3.c) r2
            android.content.SharedPreferences r6 = r2.f1835a
            monitor-enter(r6)
            java.lang.String[] r7 = M3.c.f1834c     // Catch:{ all -> 0x0061 }
            r8 = 0
        L_0x0020:
            if (r8 >= r3) goto L_0x0066
            r9 = r7[r8]     // Catch:{ all -> 0x0061 }
            java.lang.String r10 = r2.f1836b     // Catch:{ all -> 0x0061 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0061 }
            java.lang.String r12 = "|T|"
            r11.<init>(r12)     // Catch:{ all -> 0x0061 }
            r11.append(r10)     // Catch:{ all -> 0x0061 }
            java.lang.String r10 = "|"
            r11.append(r10)     // Catch:{ all -> 0x0061 }
            r11.append(r9)     // Catch:{ all -> 0x0061 }
            java.lang.String r9 = r11.toString()     // Catch:{ all -> 0x0061 }
            android.content.SharedPreferences r10 = r2.f1835a     // Catch:{ all -> 0x0061 }
            java.lang.String r9 = r10.getString(r9, r5)     // Catch:{ all -> 0x0061 }
            if (r9 == 0) goto L_0x0063
            boolean r10 = r9.isEmpty()     // Catch:{ all -> 0x0061 }
            if (r10 != 0) goto L_0x0063
            java.lang.String r2 = "{"
            boolean r2 = r9.startsWith(r2)     // Catch:{ all -> 0x0061 }
            if (r2 == 0) goto L_0x005e
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x005f }
            r2.<init>(r9)     // Catch:{ JSONException -> 0x005f }
            java.lang.String r7 = "token"
            java.lang.String r5 = r2.getString(r7)     // Catch:{ JSONException -> 0x005f }
            goto L_0x005f
        L_0x005e:
            r5 = r9
        L_0x005f:
            monitor-exit(r6)     // Catch:{ all -> 0x0061 }
            goto L_0x006a
        L_0x0061:
            r0 = move-exception
            goto L_0x0068
        L_0x0063:
            int r8 = r8 + 1
            goto L_0x0020
        L_0x0066:
            monitor-exit(r6)     // Catch:{ all -> 0x0061 }
            goto L_0x006a
        L_0x0068:
            monitor-exit(r6)     // Catch:{ all -> 0x0061 }
            throw r0
        L_0x006a:
            N3.c r2 = r1.f1718b
            R2.i r6 = r1.f1717a
            r6.b()
            R2.m r6 = r6.f2492c
            java.lang.String r6 = r6.f2500a
            java.lang.String r7 = r0.f1829a
            R2.i r8 = r1.f1717a
            r8.b()
            R2.m r8 = r8.f2492c
            java.lang.String r8 = r8.g
            R2.i r9 = r1.f1717a
            r9.b()
            R2.m r9 = r9.f2492c
            java.lang.String r9 = r9.f2501b
            N3.d r10 = r2.f1908c
            boolean r11 = r10.a()
            java.lang.String r12 = "Firebase Installations Service is unavailable. Please try again later."
            if (r11 == 0) goto L_0x01a5
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r13 = "projects/"
            r11.<init>(r13)
            r11.append(r8)
            java.lang.String r13 = "/installations"
            r11.append(r13)
            java.lang.String r11 = r11.toString()
            java.net.URL r11 = N3.c.a(r11)
            r13 = 0
        L_0x00ab:
            r14 = 1
            if (r13 > r14) goto L_0x019f
            r15 = 32769(0x8001, float:4.5919E-41)
            android.net.TrafficStats.setThreadStatsTag(r15)
            java.net.HttpURLConnection r15 = r2.c(r11, r6)
            java.lang.String r4 = "POST"
            r15.setRequestMethod(r4)     // Catch:{ IOException | AssertionError -> 0x0195, all -> 0x00c8 }
            r15.setDoOutput(r14)     // Catch:{ IOException | AssertionError -> 0x0195, all -> 0x00c8 }
            if (r5 == 0) goto L_0x00cb
            java.lang.String r4 = "x-goog-fis-android-iid-migration-auth"
            r15.addRequestProperty(r4, r5)     // Catch:{ IOException | AssertionError -> 0x0195, all -> 0x00c8 }
            goto L_0x00cb
        L_0x00c8:
            r0 = move-exception
            goto L_0x018e
        L_0x00cb:
            N3.c.g(r15, r7, r9)     // Catch:{ IOException | AssertionError -> 0x0195, all -> 0x00c8 }
            int r4 = r15.getResponseCode()     // Catch:{ IOException | AssertionError -> 0x0195, all -> 0x00c8 }
            r10.b(r4)     // Catch:{ IOException | AssertionError -> 0x0195, all -> 0x00c8 }
            r3 = 200(0xc8, float:2.8E-43)
            if (r4 < r3) goto L_0x00df
            r3 = 300(0x12c, float:4.2E-43)
            if (r4 >= r3) goto L_0x00df
            r3 = r14
            goto L_0x00e0
        L_0x00df:
            r3 = 0
        L_0x00e0:
            if (r3 == 0) goto L_0x00f0
            N3.a r2 = N3.c.e(r15)     // Catch:{ IOException | AssertionError -> 0x00ed, all -> 0x00c8 }
            r15.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            goto L_0x0127
        L_0x00ed:
            r3 = 4
            goto L_0x0195
        L_0x00f0:
            N3.c.b(r15, r9, r6, r8)     // Catch:{ IOException | AssertionError -> 0x00ed, all -> 0x00c8 }
            r3 = 429(0x1ad, float:6.01E-43)
            if (r4 == r3) goto L_0x0185
            r3 = 500(0x1f4, float:7.0E-43)
            if (r4 < r3) goto L_0x0108
            r3 = 600(0x258, float:8.41E-43)
            if (r4 >= r3) goto L_0x0108
            r15.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            r3 = 4
            goto L_0x019b
        L_0x0108:
            java.lang.String r3 = "Firebase-Installations"
            java.lang.String r4 = "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase."
            android.util.Log.e(r3, r4)     // Catch:{ IOException | AssertionError -> 0x00ed, all -> 0x00c8 }
            N3.a r3 = new N3.a     // Catch:{ IOException | AssertionError -> 0x00ed, all -> 0x00c8 }
            r20 = 0
            r19 = 0
            r21 = 2
            r18 = 0
            r17 = 0
            r16 = r3
            r16.<init>(r17, r18, r19, r20, r21)     // Catch:{ IOException | AssertionError -> 0x00ed, all -> 0x00c8 }
            r15.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            r2 = r3
        L_0x0127:
            int r3 = r2.f1901e
            int r3 = q.C0928e.c(r3)
            if (r3 == 0) goto L_0x0149
            if (r3 != r14) goto L_0x0141
            M3.a r0 = r23.a()
            java.lang.String r2 = "BAD CONFIG"
            r0.g = r2
            r2 = 5
            r0.f1825b = r2
            M3.b r0 = r0.a()
            return r0
        L_0x0141:
            L3.f r0 = new L3.f
            java.lang.String r2 = "Firebase Installations Service is unavailable. Please try again later."
            r0.<init>(r2)
            throw r0
        L_0x0149:
            java.lang.String r3 = r2.f1899b
            java.lang.String r4 = r2.f1900c
            L3.k r5 = r1.d
            r5.getClass()
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS
            H3.f r5 = r5.f1733a
            r5.getClass()
            long r7 = java.lang.System.currentTimeMillis()
            long r5 = r6.toSeconds(r7)
            N3.b r2 = r2.d
            java.lang.String r7 = r2.f1902a
            long r8 = r2.f1903b
            M3.a r0 = r23.a()
            r0.f1824a = r3
            r3 = 4
            r0.f1825b = r3
            r0.f1826c = r7
            r0.d = r4
            java.lang.Long r2 = java.lang.Long.valueOf(r8)
            r0.f1827e = r2
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            r0.f1828f = r2
            M3.b r0 = r0.a()
            return r0
        L_0x0185:
            r3 = 4
            L3.f r4 = new L3.f     // Catch:{ IOException | AssertionError -> 0x0195, all -> 0x00c8 }
            java.lang.String r14 = "Firebase servers have received too many requests from this client in a short period of time. Please try again later."
            r4.<init>(r14)     // Catch:{ IOException | AssertionError -> 0x0195, all -> 0x00c8 }
            throw r4     // Catch:{ IOException | AssertionError -> 0x0195, all -> 0x00c8 }
        L_0x018e:
            r15.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        L_0x0195:
            r15.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
        L_0x019b:
            int r13 = r13 + 1
            goto L_0x00ab
        L_0x019f:
            L3.f r0 = new L3.f
            r0.<init>(r12)
            throw r0
        L_0x01a5:
            L3.f r0 = new L3.f
            r0.<init>(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: L3.d.g(M3.b):M3.b");
    }

    public final void h(Exception exc) {
        synchronized (this.g) {
            try {
                Iterator it2 = this.f1725l.iterator();
                while (it2.hasNext()) {
                    if (((j) it2.next()).a(exc)) {
                        it2.remove();
                    }
                }
            } finally {
            }
        }
    }

    public final void i(M3.b bVar) {
        synchronized (this.g) {
            try {
                Iterator it2 = this.f1725l.iterator();
                while (it2.hasNext()) {
                    if (((j) it2.next()).b(bVar)) {
                        it2.remove();
                    }
                }
            } finally {
            }
        }
    }
}
