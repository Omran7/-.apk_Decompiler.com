package l3;

import A4.c;
import c1.i;
import h0.C0552a;
import j3.g;
import j4.C;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import k.C0737s0;
import k.e1;
import m0.a0;
import m3.C0837a;
import n3.C0866g;
import n3.m;
import o3.d;
import q3.b;
import q3.l;
import s3.C0970h;
import u3.C1031a;
import v3.h;
import v3.s;
import x3.a;

public final class o {
    public static long F;

    /* renamed from: A  reason: collision with root package name */
    public long f9701A = 0;

    /* renamed from: B  reason: collision with root package name */
    public int f9702B = 0;

    /* renamed from: C  reason: collision with root package name */
    public int f9703C = 0;

    /* renamed from: D  reason: collision with root package name */
    public ScheduledFuture f9704D = null;

    /* renamed from: E  reason: collision with root package name */
    public long f9705E;

    /* renamed from: a  reason: collision with root package name */
    public final m f9706a;

    /* renamed from: b  reason: collision with root package name */
    public final com.bumptech.glide.manager.o f9707b;

    /* renamed from: c  reason: collision with root package name */
    public String f9708c;
    public final HashSet d = new HashSet();

    /* renamed from: e  reason: collision with root package name */
    public boolean f9709e = true;

    /* renamed from: f  reason: collision with root package name */
    public long f9710f;
    public com.google.firebase.storage.o g;
    public C0792k h = C0792k.f9688a;

    /* renamed from: i  reason: collision with root package name */
    public long f9711i = 0;

    /* renamed from: j  reason: collision with root package name */
    public long f9712j = 0;

    /* renamed from: k  reason: collision with root package name */
    public final HashMap f9713k;

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList f9714l;

    /* renamed from: m  reason: collision with root package name */
    public final HashMap f9715m;

    /* renamed from: n  reason: collision with root package name */
    public final ConcurrentHashMap f9716n;

    /* renamed from: o  reason: collision with root package name */
    public final HashMap f9717o;

    /* renamed from: p  reason: collision with root package name */
    public String f9718p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f9719q;

    /* renamed from: r  reason: collision with root package name */
    public String f9720r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f9721s;

    /* renamed from: t  reason: collision with root package name */
    public final e1 f9722t;

    /* renamed from: u  reason: collision with root package name */
    public final c f9723u;

    /* renamed from: v  reason: collision with root package name */
    public final c f9724v;

    /* renamed from: w  reason: collision with root package name */
    public final b f9725w;

    /* renamed from: x  reason: collision with root package name */
    public final i f9726x;

    /* renamed from: y  reason: collision with root package name */
    public final C0837a f9727y;

    /* renamed from: z  reason: collision with root package name */
    public String f9728z;

    public o(e1 e1Var, com.bumptech.glide.manager.o oVar, m mVar) {
        this.f9706a = mVar;
        this.f9722t = e1Var;
        b bVar = (b) e1Var.f9290a;
        this.f9725w = bVar;
        this.f9723u = (c) e1Var.f9291b;
        this.f9724v = (c) e1Var.f9292c;
        this.f9707b = oVar;
        this.f9717o = new HashMap();
        this.f9713k = new HashMap();
        this.f9715m = new HashMap();
        this.f9716n = new ConcurrentHashMap();
        this.f9714l = new ArrayList();
        C1031a aVar = (C1031a) e1Var.d;
        this.f9727y = new C0837a(bVar, new i(18, (Object) aVar, "ConnectionRetryHelper", (String) null));
        long j6 = F;
        F = 1 + j6;
        this.f9726x = new i(18, (Object) aVar, "PersistentConnection", C0552a.m("pc_", j6));
        this.f9728z = null;
        b();
    }

    public final boolean a() {
        C0792k kVar = this.h;
        if (kVar == C0792k.d || kVar == C0792k.f9691e) {
            return true;
        }
        return false;
    }

    public final void b() {
        if (d()) {
            ScheduledFuture scheduledFuture = this.f9704D;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.f9704D = this.f9725w.schedule(new C0737s0(this, 4), 60000, TimeUnit.MILLISECONDS);
        } else if (this.d.contains("connection_idle")) {
            R2.b.g0(!d(), "", new Object[0]);
            h("connection_idle");
        }
    }

    public final void c(String str) {
        i iVar = this.f9726x;
        if (iVar.y()) {
            iVar.d("Connection interrupted for: ".concat(str), (Throwable) null, new Object[0]);
        }
        this.d.add(str);
        com.google.firebase.storage.o oVar = this.g;
        C0837a aVar = this.f9727y;
        if (oVar != null) {
            oVar.b(2);
            this.g = null;
        } else {
            ScheduledFuture scheduledFuture = aVar.h;
            i iVar2 = aVar.f10152b;
            if (scheduledFuture != null) {
                iVar2.d("Cancelling existing retry attempt", (Throwable) null, new Object[0]);
                aVar.h.cancel(false);
                aVar.h = null;
            } else {
                iVar2.d("No existing retry attempt to cancel", (Throwable) null, new Object[0]);
            }
            aVar.f10156i = 0;
            this.h = C0792k.f9688a;
        }
        aVar.f10157j = true;
        aVar.f10156i = 0;
    }

    public final boolean d() {
        if (!this.f9717o.isEmpty() || !this.f9716n.isEmpty() || !this.f9713k.isEmpty() || !this.f9715m.isEmpty()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [l3.m, java.lang.Object] */
    public final void e(String str, ArrayList arrayList, Object obj, String str2, q qVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("p", R2.b.u0(arrayList));
        hashMap.put("d", obj);
        if (str2 != null) {
            hashMap.put("h", str2);
        }
        long j6 = this.f9711i;
        this.f9711i = 1 + j6;
        HashMap hashMap2 = this.f9715m;
        Long valueOf = Long.valueOf(j6);
        ? obj2 = new Object();
        obj2.f9696a = str;
        obj2.f9697b = hashMap;
        obj2.f9698c = qVar;
        hashMap2.put(valueOf, obj2);
        if (this.h == C0792k.f9691e) {
            l(j6);
        }
        this.f9705E = System.currentTimeMillis();
        b();
    }

    public final l f(n nVar) {
        i iVar = this.f9726x;
        if (iVar.y()) {
            iVar.d("removing query " + nVar, (Throwable) null, new Object[0]);
        }
        HashMap hashMap = this.f9717o;
        if (!hashMap.containsKey(nVar)) {
            if (iVar.y()) {
                iVar.d("Trying to remove listener for QuerySpec " + nVar + " but no listener exists.", (Throwable) null, new Object[0]);
            }
            return null;
        }
        l lVar = (l) hashMap.get(nVar);
        hashMap.remove(nVar);
        b();
        return lVar;
    }

    public final void g() {
        boolean z3;
        C0792k kVar = this.h;
        C0792k kVar2 = C0792k.f9691e;
        boolean z4 = true;
        if (kVar == kVar2) {
            z3 = true;
        } else {
            z3 = false;
        }
        R2.b.g0(z3, "Should be connected if we're restoring state, but we are: %s", kVar);
        i iVar = this.f9726x;
        if (iVar.y()) {
            iVar.d("Restoring outstanding listens", (Throwable) null, new Object[0]);
        }
        for (l lVar : this.f9717o.values()) {
            if (iVar.y()) {
                iVar.d("Restoring listen " + lVar.f9694b, (Throwable) null, new Object[0]);
            }
            k(lVar);
        }
        if (iVar.y()) {
            iVar.d("Restoring writes.", (Throwable) null, new Object[0]);
        }
        ArrayList arrayList = new ArrayList(this.f9715m.keySet());
        Collections.sort(arrayList);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            l(((Long) it2.next()).longValue());
        }
        ArrayList arrayList2 = this.f9714l;
        Iterator it3 = arrayList2.iterator();
        if (!it3.hasNext()) {
            arrayList2.clear();
            if (iVar.y()) {
                iVar.d("Restoring reads.", (Throwable) null, new Object[0]);
            }
            ConcurrentHashMap concurrentHashMap = this.f9716n;
            ArrayList arrayList3 = new ArrayList(concurrentHashMap.keySet());
            Collections.sort(arrayList3);
            Iterator it4 = arrayList3.iterator();
            if (it4.hasNext()) {
                Long l6 = (Long) it4.next();
                if (this.h != kVar2) {
                    z4 = false;
                }
                R2.b.g0(z4, "sendGet called when we can't send gets", new Object[0]);
                concurrentHashMap.get(l6).getClass();
                throw new ClassCastException();
            }
            return;
        }
        throw d.e(it3);
    }

    public final void h(String str) {
        i iVar = this.f9726x;
        if (iVar.y()) {
            iVar.d("Connection no longer interrupted for: ".concat(str), (Throwable) null, new Object[0]);
        }
        this.d.remove(str);
        if (this.d.size() == 0 && this.h == C0792k.f9688a) {
            n();
        }
    }

    public final void i(boolean z3) {
        boolean z4;
        if (this.f9720r == null) {
            g();
            return;
        }
        R2.b.g0(a(), "Must be connected to send auth, but was: %s", this.h);
        i iVar = this.f9726x;
        if (iVar.y()) {
            iVar.d("Sending app check.", (Throwable) null, new Object[0]);
        }
        C0786e eVar = new C0786e(this, z3);
        HashMap hashMap = new HashMap();
        if (this.f9720r != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        R2.b.g0(z4, "App check token must be set!", new Object[0]);
        hashMap.put("token", this.f9720r);
        m("appcheck", true, hashMap, eVar);
    }

    public final void j(boolean z3) {
        R2.b.g0(a(), "Must be connected to send auth, but was: %s", this.h);
        i iVar = this.f9726x;
        a0 a0Var = null;
        if (iVar.y()) {
            iVar.d("Sending auth.", (Throwable) null, new Object[0]);
        }
        C0787f fVar = new C0787f(this, z3);
        HashMap hashMap = new HashMap();
        String str = this.f9718p;
        if (str.startsWith("gauth|")) {
            try {
                HashMap b6 = a.b(str.substring(6));
                a0Var = new a0((String) b6.get("token"), (Map) b6.get("auth"), 21);
            } catch (IOException e6) {
                throw new RuntimeException("Failed to parse gauth token", e6);
            }
        }
        if (a0Var != null) {
            hashMap.put("cred", (String) a0Var.f9925b);
            Map map = (Map) a0Var.f9926c;
            if (map != null) {
                hashMap.put("authvar", map);
            }
            m("gauth", true, hashMap, fVar);
            return;
        }
        hashMap.put("cred", this.f9718p);
        m("auth", true, hashMap, fVar);
    }

    /* JADX WARNING: type inference failed for: r3v15, types: [java.lang.Object, com.mtma.criminal.city.utils.l] */
    public final void k(l lVar) {
        a0 a0Var;
        boolean z3;
        HashMap hashMap = new HashMap();
        hashMap.put("p", R2.b.u0(lVar.f9694b.f9699a));
        Long l6 = lVar.d;
        if (l6 != null) {
            hashMap.put("q", lVar.f9694b.f9700b);
            hashMap.put("t", l6);
        }
        C0970h hVar = (C0970h) lVar.f9695c.f10250a;
        hashMap.put("h", ((v3.m) ((C) hVar.f11542c.f9926c).f8851c).f12296a.u());
        if (android.support.v4.media.session.a.t(((v3.m) ((C) hVar.f11542c.f9926c).f8851c).f12296a) > 1024) {
            s sVar = ((v3.m) ((C) hVar.f11542c.f9926c).f8851c).f12296a;
            ? obj = new Object();
            obj.f7431a = Math.max(512, (long) Math.sqrt((double) (android.support.v4.media.session.a.t(sVar) * 100)));
            if (sVar.isEmpty()) {
                a0Var = new a0(Collections.emptyList(), Collections.singletonList(""));
            } else {
                h hVar2 = new h(obj);
                a0.t(sVar, hVar2);
                if (hVar2.d == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                l.b("Can't finish hashing in the middle processing a child", z3);
                if (hVar2.f12288a != null) {
                    hVar2.b();
                }
                ArrayList arrayList = hVar2.g;
                arrayList.add("");
                a0Var = new a0((List) hVar2.f12292f, (List) arrayList);
            }
            List<C0866g> unmodifiableList = Collections.unmodifiableList((List) a0Var.f9925b);
            ArrayList arrayList2 = new ArrayList(unmodifiableList.size());
            for (C0866g k6 : unmodifiableList) {
                arrayList2.add(k6.k());
            }
            List unmodifiableList2 = Collections.unmodifiableList((List) a0Var.f9926c);
            if (arrayList2.size() == unmodifiableList2.size() - 1) {
                ArrayList arrayList3 = new ArrayList();
                for (List u02 : Collections.unmodifiableList(arrayList2)) {
                    arrayList3.add(R2.b.u0(u02));
                }
                HashMap hashMap2 = new HashMap();
                hashMap2.put("hs", Collections.unmodifiableList(unmodifiableList2));
                hashMap2.put("ps", arrayList3);
                hashMap.put("ch", hashMap2);
            } else {
                throw new IllegalArgumentException("Number of posts need to be n-1 for n hashes in CompoundHash");
            }
        }
        m("q", false, hashMap, new C0789h(this, lVar));
    }

    public final void l(long j6) {
        boolean z3;
        if (this.h == C0792k.f9691e) {
            z3 = true;
        } else {
            z3 = false;
        }
        R2.b.g0(z3, "sendPut called when we can't send writes (we're disconnected or writes are paused).", new Object[0]);
        m mVar = (m) this.f9715m.get(Long.valueOf(j6));
        q qVar = mVar.f9698c;
        mVar.d = true;
        String str = mVar.f9696a;
        m(str, false, mVar.f9697b, new C0788g(this, str, j6, mVar, qVar));
    }

    public final void m(String str, boolean z3, Map map, C0791j jVar) {
        String[] strArr;
        long j6 = this.f9712j;
        this.f9712j = 1 + j6;
        HashMap hashMap = new HashMap();
        hashMap.put("r", Long.valueOf(j6));
        hashMap.put("a", str);
        hashMap.put("b", map);
        com.google.firebase.storage.o oVar = this.g;
        oVar.getClass();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("t", "d");
        hashMap2.put("d", hashMap);
        int i2 = oVar.f6947a;
        i iVar = (i) oVar.f6950e;
        if (i2 != 2) {
            iVar.d("Tried to send on an unconnected connection", (Throwable) null, new Object[0]);
        } else {
            if (z3) {
                iVar.d("Sending data (contents hidden)", (Throwable) null, new Object[0]);
            } else {
                iVar.d("Sending data: %s", (Throwable) null, hashMap2);
            }
            t tVar = (t) oVar.f6949c;
            tVar.e();
            try {
                String c3 = a.c(hashMap2);
                if (c3.length() <= 16384) {
                    strArr = new String[]{c3};
                } else {
                    ArrayList arrayList = new ArrayList();
                    int i5 = 0;
                    while (i5 < c3.length()) {
                        int i6 = i5 + 16384;
                        arrayList.add(c3.substring(i5, Math.min(i6, c3.length())));
                        i5 = i6;
                    }
                    strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
                }
                if (strArr.length > 1) {
                    tVar.f9737a.M("" + strArr.length);
                }
                for (String M6 : strArr) {
                    tVar.f9737a.M(M6);
                }
            } catch (IOException e6) {
                tVar.f9743j.g("Failed to serialize message: " + hashMap2.toString(), e6);
                tVar.f();
            }
        }
        this.f9713k.put(Long.valueOf(j6), jVar);
    }

    public final void n() {
        boolean z3;
        if (this.d.size() == 0) {
            C0792k kVar = this.h;
            if (kVar == C0792k.f9688a) {
                z3 = true;
            } else {
                z3 = false;
            }
            R2.b.g0(z3, "Not in disconnected state: %s", kVar);
            boolean z4 = this.f9719q;
            boolean z5 = this.f9721s;
            this.f9726x.d("Scheduling connection attempt", (Throwable) null, new Object[0]);
            this.f9719q = false;
            this.f9721s = false;
            C0783b bVar = new C0783b(this, z4, z5);
            C0837a aVar = this.f9727y;
            aVar.getClass();
            g gVar = new g((Object) aVar, (Object) bVar, 3, false);
            ScheduledFuture scheduledFuture = aVar.h;
            i iVar = aVar.f10152b;
            if (scheduledFuture != null) {
                iVar.d("Cancelling previous scheduled retry", (Throwable) null, new Object[0]);
                aVar.h.cancel(false);
                aVar.h = null;
            }
            long j6 = 0;
            if (!aVar.f10157j) {
                long j7 = aVar.f10156i;
                if (j7 == 0) {
                    aVar.f10156i = aVar.f10153c;
                } else {
                    aVar.f10156i = Math.min((long) (((double) j7) * aVar.f10155f), aVar.d);
                }
                double d6 = aVar.f10154e;
                double d7 = (double) aVar.f10156i;
                j6 = (long) ((aVar.g.nextDouble() * d6 * d7) + ((1.0d - d6) * d7));
            }
            aVar.f10157j = false;
            iVar.d("Scheduling retry in %dms", (Throwable) null, Long.valueOf(j6));
            aVar.h = aVar.f10151a.schedule(gVar, j6, TimeUnit.MILLISECONDS);
        }
    }
}
