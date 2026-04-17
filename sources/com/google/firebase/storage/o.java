package com.google.firebase.storage;

import B.m;
import R2.b;
import V3.c;
import V3.f;
import android.app.Activity;
import android.support.v4.media.session.a;
import androidx.emoji2.text.v;
import c1.i;
import com.google.android.gms.common.internal.I;
import h0.C0552a;
import i3.C0589e;
import j4.C;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import k.e1;
import l3.C0790i;
import l3.C0791j;
import l3.C0792k;
import l3.n;
import l3.p;
import l3.t;
import m3.C0837a;
import n3.C0862c;
import n3.C0866g;
import n3.q;
import n3.r;
import n3.w;
import n3.y;
import n3.z;
import o3.d;
import q3.l;
import s3.C0969g;
import s3.C0970h;
import u3.C1031a;
import v3.C1048c;
import v3.k;
import v3.s;

public final class o {

    /* renamed from: f  reason: collision with root package name */
    public static long f6946f;

    /* renamed from: a  reason: collision with root package name */
    public int f6947a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f6948b;

    /* renamed from: c  reason: collision with root package name */
    public Object f6949c;
    public final Object d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f6950e;

    public o(k kVar, int i2, n nVar) {
        this.f6948b = new ConcurrentLinkedQueue();
        this.f6949c = new HashMap();
        this.d = kVar;
        this.f6947a = i2;
        this.f6950e = nVar;
    }

    public void a(Activity activity, Executor executor, Object obj) {
        boolean z3;
        f fVar;
        I.g(obj);
        synchronized (((k) this.d).f6934a) {
            try {
                if ((((k) this.d).h & this.f6947a) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                ((ConcurrentLinkedQueue) this.f6948b).add(obj);
                fVar = new f(executor);
                ((HashMap) this.f6949c).put(obj, fVar);
                if (activity != null) {
                    I.a("Activity is already destroyed!", !activity.isDestroyed());
                    c.f3766c.b(new m(this, obj, 8), activity, obj);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (z3) {
            m mVar = new m(this, obj, ((k) this.d).f(), 1);
            Executor executor2 = fVar.f3779a;
            if (executor2 != null) {
                executor2.execute(mVar);
            } else {
                com.bumptech.glide.c.f5735c.execute(mVar);
            }
        }
    }

    public void b(int i2) {
        boolean z3;
        String str;
        if (this.f6947a != 3) {
            i iVar = (i) this.f6950e;
            boolean z4 = false;
            if (iVar.y()) {
                iVar.d("closing realtime connection", (Throwable) null, new Object[0]);
            }
            this.f6947a = 3;
            t tVar = (t) this.f6949c;
            if (tVar != null) {
                tVar.c();
                this.f6949c = null;
            }
            l3.o oVar = (l3.o) this.d;
            i iVar2 = oVar.f9726x;
            if (iVar2.y()) {
                if (i2 == 1) {
                    str = "SERVER_RESET";
                } else if (i2 == 2) {
                    str = "OTHER";
                } else {
                    throw null;
                }
                iVar2.d("Got on disconnect due to ".concat(str), (Throwable) null, new Object[0]);
            }
            oVar.h = C0792k.f9688a;
            oVar.g = null;
            oVar.f9713k.clear();
            ArrayList arrayList = new ArrayList();
            Iterator it2 = oVar.f9715m.entrySet().iterator();
            while (it2.hasNext()) {
                l3.m mVar = (l3.m) ((Map.Entry) it2.next()).getValue();
                if (mVar.f9697b.containsKey("h") && mVar.d) {
                    arrayList.add(mVar);
                    it2.remove();
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                ((l3.m) it3.next()).f9698c.c("disconnected", (String) null);
            }
            if (oVar.d.size() == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                long currentTimeMillis = System.currentTimeMillis();
                long j6 = oVar.f9710f;
                long j7 = currentTimeMillis - j6;
                if (j6 > 0 && j7 > 30000) {
                    z4 = true;
                }
                if (i2 == 1 || z4) {
                    C0837a aVar = oVar.f9727y;
                    aVar.f10157j = true;
                    aVar.f10156i = 0;
                }
                oVar.n();
            }
            oVar.f9710f = 0;
            n3.m mVar2 = oVar.f9706a;
            mVar2.getClass();
            mVar2.q(C0862c.d, Boolean.FALSE);
            b.A(mVar2.f10300b);
            ArrayList arrayList2 = new ArrayList();
            v vVar = mVar2.f10302e;
            C0866g gVar = C0866g.d;
            vVar.getClass();
            mVar2.f10302e = new v(23);
            mVar2.k(arrayList2);
        }
    }

    public void c(String str) {
        i iVar = (i) this.f6950e;
        if (iVar.y()) {
            iVar.d("Connection shutdown command received. Shutting down...", (Throwable) null, new Object[0]);
        }
        l3.o oVar = (l3.o) this.d;
        oVar.getClass();
        boolean equals = str.equals("Invalid appcheck token");
        i iVar2 = oVar.f9726x;
        if (equals) {
            int i2 = oVar.f9703C;
            if (((long) i2) < 3) {
                oVar.f9703C = i2 + 1;
                iVar2.Q("Detected invalid AppCheck token. Reconnecting (" + (3 - ((long) oVar.f9703C)) + " attempts remaining)");
                b(2);
            }
        }
        iVar2.Q("Firebase Database connection was forcefully killed by the server. Will not attempt reconnect. Reason: ".concat(str));
        oVar.c("server_kill");
        b(2);
    }

    public void d(Map map) {
        i iVar = (i) this.f6950e;
        if (iVar.y()) {
            iVar.d("Got control message: " + map.toString(), (Throwable) null, new Object[0]);
        }
        try {
            String str = (String) map.get("t");
            if (str == null) {
                if (iVar.y()) {
                    iVar.d("Got invalid control message: " + map.toString(), (Throwable) null, new Object[0]);
                }
                b(2);
            } else if (str.equals("s")) {
                c((String) map.get("d"));
            } else if (str.equals("r")) {
                i((String) map.get("d"));
            } else if (str.equals("h")) {
                f((Map) map.get("d"));
            } else if (iVar.y()) {
                iVar.d("Ignoring unknown control message: ".concat(str), (Throwable) null, new Object[0]);
            }
        } catch (ClassCastException e6) {
            if (iVar.y()) {
                iVar.d("Failed to parse control message: " + e6.toString(), (Throwable) null, new Object[0]);
            }
            b(2);
        }
    }

    public void e(Map map) {
        Long l6;
        List list;
        Long l7;
        List list2;
        boolean z3;
        ArrayList arrayList;
        ArrayList arrayList2;
        Map map2 = map;
        i iVar = (i) this.f6950e;
        ArrayList arrayList3 = null;
        boolean z4 = false;
        if (iVar.y()) {
            iVar.d("received data message: " + map.toString(), (Throwable) null, new Object[0]);
        }
        l3.o oVar = (l3.o) this.d;
        oVar.getClass();
        if (map2.containsKey("r")) {
            C0791j jVar = (C0791j) oVar.f9713k.remove(Long.valueOf((long) ((Integer) map2.get("r")).intValue()));
            if (jVar != null) {
                jVar.a((Map) map2.get("b"));
            }
        } else if (!map2.containsKey("error")) {
            boolean containsKey = map2.containsKey("a");
            i iVar2 = oVar.f9726x;
            if (containsKey) {
                String str = (String) map2.get("a");
                Map map3 = (Map) map2.get("b");
                if (iVar2.y()) {
                    iVar2.d("handleServerMessage: " + str + " " + map3, (Throwable) null, new Object[0]);
                }
                boolean equals = str.equals("d");
                n3.m mVar = oVar.f9706a;
                if (equals || str.equals("m")) {
                    boolean equals2 = str.equals("m");
                    String str2 = (String) map3.get("p");
                    Object obj = map3.get("d");
                    Object obj2 = map3.get("t");
                    if (obj2 instanceof Integer) {
                        l6 = Long.valueOf((long) ((Integer) obj2).intValue());
                    } else if (obj2 instanceof Long) {
                        l6 = (Long) obj2;
                    } else {
                        l6 = null;
                    }
                    if (!equals2 || !(obj instanceof Map) || ((Map) obj).size() != 0) {
                        ArrayList V02 = b.V0(str2);
                        mVar.getClass();
                        C0866g gVar = new C0866g(V02);
                        i iVar3 = mVar.f10304i;
                        if (iVar3.y()) {
                            iVar3.d("onDataUpdate: " + gVar, (Throwable) null, new Object[0]);
                        }
                        if (mVar.f10306k.y()) {
                            iVar3.d("onDataUpdate: " + gVar + " " + obj, (Throwable) null, new Object[0]);
                        }
                        if (l6 != null) {
                            try {
                                z zVar = new z(l6.longValue());
                                if (equals2) {
                                    HashMap hashMap = new HashMap();
                                    for (Map.Entry entry : ((Map) obj).entrySet()) {
                                        hashMap.put(new C0866g((String) entry.getKey()), a.a(entry.getValue(), k.f12295e));
                                    }
                                    y yVar = mVar.f10309n;
                                    yVar.getClass();
                                    list = (List) yVar.f10351f.a(new r(yVar, zVar, gVar, hashMap, 0));
                                } else {
                                    s a6 = a.a(obj, k.f12295e);
                                    y yVar2 = mVar.f10309n;
                                    yVar2.getClass();
                                    list = (List) yVar2.f10351f.a(new r(yVar2, zVar, gVar, a6, 2));
                                }
                            } catch (C0589e e6) {
                                iVar3.g("FIREBASE INTERNAL ERROR", e6);
                                return;
                            }
                        } else if (equals2) {
                            HashMap hashMap2 = new HashMap();
                            for (Map.Entry entry2 : ((Map) obj).entrySet()) {
                                hashMap2.put(new C0866g((String) entry2.getKey()), a.a(entry2.getValue(), k.f12295e));
                            }
                            y yVar3 = mVar.f10309n;
                            yVar3.getClass();
                            list = (List) yVar3.f10351f.a(new w(yVar3, hashMap2, gVar));
                        } else {
                            list = mVar.f10309n.f(gVar, a.a(obj, k.f12295e));
                        }
                        if (list.size() > 0) {
                            mVar.n(gVar);
                        }
                        mVar.k(list);
                    } else if (iVar2.y()) {
                        iVar2.d(d.i("ignoring empty merge for path ", str2), (Throwable) null, new Object[0]);
                    }
                } else if (str.equals("rm")) {
                    String str3 = (String) map3.get("p");
                    ArrayList V03 = b.V0(str3);
                    Object obj3 = map3.get("d");
                    Object obj4 = map3.get("t");
                    if (obj4 instanceof Integer) {
                        l7 = Long.valueOf((long) ((Integer) obj4).intValue());
                    } else if (obj4 instanceof Long) {
                        l7 = (Long) obj4;
                    } else {
                        l7 = null;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (Map map4 : (List) obj3) {
                        String str4 = (String) map4.get("s");
                        String str5 = (String) map4.get("e");
                        if (str4 != null) {
                            arrayList = b.V0(str4);
                        } else {
                            arrayList = arrayList3;
                        }
                        if (str5 != null) {
                            arrayList2 = b.V0(str5);
                        } else {
                            arrayList2 = arrayList3;
                        }
                        arrayList4.add(new p(arrayList, arrayList2, map4.get("m")));
                        arrayList3 = null;
                    }
                    if (!arrayList4.isEmpty()) {
                        mVar.getClass();
                        C0866g gVar2 = new C0866g(V03);
                        i iVar4 = mVar.f10304i;
                        if (iVar4.y()) {
                            iVar4.d("onRangeMergeUpdate: " + gVar2, (Throwable) null, new Object[0]);
                        }
                        if (mVar.f10306k.y()) {
                            iVar4.d("onRangeMergeUpdate: " + gVar2 + " " + arrayList4, (Throwable) null, new Object[0]);
                        }
                        ArrayList arrayList5 = new ArrayList(arrayList4.size());
                        Iterator it2 = arrayList4.iterator();
                        while (it2.hasNext()) {
                            arrayList5.add(new v3.v((p) it2.next()));
                        }
                        if (l7 != null) {
                            y yVar4 = mVar.f10309n;
                            z zVar2 = new z(l7.longValue());
                            C0969g gVar3 = (C0969g) yVar4.f10349c.get(zVar2);
                            if (gVar3 != null) {
                                C0866g gVar4 = gVar3.f11538a;
                                l.c(gVar2.equals(gVar4));
                                q qVar = (q) yVar4.f10347a.v(gVar4);
                                if (qVar != null) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                l.b("Missing sync point for query tag that we're tracking", z3);
                                C0970h g = qVar.g(gVar3);
                                if (g != null) {
                                    z4 = true;
                                }
                                l.b("Missing view for query tag that we're tracking", z4);
                                s sVar = ((v3.m) ((C) g.f11542c.f9926c).f8851c).f12296a;
                                Iterator it3 = arrayList5.iterator();
                                while (it3.hasNext()) {
                                    v3.v vVar = (v3.v) it3.next();
                                    vVar.getClass();
                                    sVar = vVar.a(C0866g.d, sVar, vVar.f12311c);
                                }
                                list2 = (List) yVar4.f10351f.a(new r(yVar4, zVar2, gVar2, sVar, 2));
                            } else {
                                list2 = Collections.emptyList();
                            }
                        } else {
                            y yVar5 = mVar.f10309n;
                            q qVar2 = (q) yVar5.f10347a.v(gVar2);
                            if (qVar2 == null) {
                                list2 = Collections.emptyList();
                            } else {
                                C0970h d6 = qVar2.d();
                                if (d6 != null) {
                                    s sVar2 = ((v3.m) ((C) d6.f11542c.f9926c).f8851c).f12296a;
                                    Iterator it4 = arrayList5.iterator();
                                    while (it4.hasNext()) {
                                        v3.v vVar2 = (v3.v) it4.next();
                                        vVar2.getClass();
                                        sVar2 = vVar2.a(C0866g.d, sVar2, vVar2.f12311c);
                                    }
                                    list2 = yVar5.f(gVar2, sVar2);
                                } else {
                                    list2 = Collections.emptyList();
                                }
                            }
                        }
                        if (list2.size() > 0) {
                            mVar.n(gVar2);
                        }
                        mVar.k(list2);
                    } else if (iVar2.y()) {
                        iVar2.d("Ignoring empty range merge for path ".concat(str3), (Throwable) null, new Object[0]);
                    }
                } else if (str.equals("c")) {
                    ArrayList V04 = b.V0((String) map3.get("p"));
                    if (iVar2.y()) {
                        iVar2.d("removing all listens at path " + V04, (Throwable) null, new Object[0]);
                    }
                    ArrayList arrayList6 = new ArrayList();
                    HashMap hashMap3 = oVar.f9717o;
                    for (Map.Entry entry3 : hashMap3.entrySet()) {
                        l3.l lVar = (l3.l) entry3.getValue();
                        if (((n) entry3.getKey()).f9699a.equals(V04)) {
                            arrayList6.add(lVar);
                        }
                    }
                    Iterator it5 = arrayList6.iterator();
                    while (it5.hasNext()) {
                        hashMap3.remove(((l3.l) it5.next()).f9694b);
                    }
                    oVar.b();
                    Iterator it6 = arrayList6.iterator();
                    while (it6.hasNext()) {
                        ((l3.l) it6.next()).f9693a.c("permission_denied", (String) null);
                    }
                } else if (str.equals("ac")) {
                    iVar2.d(C0552a.q("Auth token revoked: ", (String) map3.get("s"), " (", (String) map3.get("d"), ")"), (Throwable) null, new Object[0]);
                    oVar.f9718p = null;
                    oVar.f9719q = true;
                    mVar.getClass();
                    mVar.q(C0862c.f10261c, Boolean.FALSE);
                    oVar.g.b(2);
                } else if (str.equals("apc")) {
                    iVar2.d(C0552a.q("App check token revoked: ", (String) map3.get("s"), " (", (String) map3.get("d"), ")"), (Throwable) null, new Object[0]);
                    oVar.f9720r = null;
                    oVar.f9721s = true;
                } else if (str.equals("sd")) {
                    String K6 = iVar2.K((String) map3.get("msg"), new Object[0]);
                    System.currentTimeMillis();
                    ((C1031a) iVar2.f5606c).a(2, (String) iVar2.f5605b, K6);
                } else if (iVar2.y()) {
                    iVar2.d("Unrecognized action from server: ".concat(str), (Throwable) null, new Object[0]);
                }
            } else if (iVar2.y()) {
                iVar2.d("Ignoring unknown message: " + map2, (Throwable) null, new Object[0]);
            }
        }
    }

    public void f(Map map) {
        boolean z3;
        long longValue = ((Long) map.get("ts")).longValue();
        l3.o oVar = (l3.o) this.d;
        oVar.f9708c = (String) map.get("h");
        String str = (String) map.get("s");
        if (this.f6947a == 1) {
            ((t) this.f6949c).getClass();
            i iVar = (i) this.f6950e;
            if (iVar.y()) {
                iVar.d("realtime connection established", (Throwable) null, new Object[0]);
            }
            this.f6947a = 2;
            i iVar2 = oVar.f9726x;
            if (iVar2.y()) {
                iVar2.d("onReady", (Throwable) null, new Object[0]);
            }
            oVar.f9710f = System.currentTimeMillis();
            if (iVar2.y()) {
                iVar2.d("handling timestamp", (Throwable) null, new Object[0]);
            }
            HashMap hashMap = new HashMap();
            hashMap.put("serverTimeOffset", Long.valueOf(longValue - System.currentTimeMillis()));
            n3.m mVar = oVar.f9706a;
            mVar.getClass();
            for (Map.Entry entry : hashMap.entrySet()) {
                mVar.q(C1048c.e((String) entry.getKey()), entry.getValue());
            }
            if (oVar.f9709e) {
                HashMap hashMap2 = new HashMap();
                oVar.f9722t.getClass();
                hashMap2.put("sdk.android." + "21.0.0".replace('.', '-'), 1);
                if (iVar2.y()) {
                    iVar2.d("Sending first connection stats", (Throwable) null, new Object[0]);
                }
                if (!hashMap2.isEmpty()) {
                    HashMap hashMap3 = new HashMap();
                    hashMap3.put("c", hashMap2);
                    oVar.m("s", false, hashMap3, new C0790i(oVar));
                } else if (iVar2.y()) {
                    iVar2.d("Not sending stats because stats are empty", (Throwable) null, new Object[0]);
                }
            }
            if (iVar2.y()) {
                iVar2.d("calling restore tokens", (Throwable) null, new Object[0]);
            }
            C0792k kVar = oVar.h;
            if (kVar == C0792k.f9690c) {
                z3 = true;
            } else {
                z3 = false;
            }
            b.g0(z3, "Wanted to restore tokens, but was in wrong state: %s", kVar);
            if (oVar.f9718p != null) {
                if (iVar2.y()) {
                    iVar2.d("Restoring auth.", (Throwable) null, new Object[0]);
                }
                oVar.h = C0792k.d;
                oVar.j(true);
            } else {
                if (iVar2.y()) {
                    iVar2.d("Not restoring auth because auth token is null.", (Throwable) null, new Object[0]);
                }
                oVar.h = C0792k.f9691e;
                oVar.i(true);
            }
            oVar.f9709e = false;
            oVar.f9728z = str;
            mVar.q(C0862c.d, Boolean.TRUE);
        }
    }

    public void g() {
        if ((((k) this.d).h & this.f6947a) != 0) {
            p f6 = ((k) this.d).f();
            Iterator it2 = ((ConcurrentLinkedQueue) this.f6948b).iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                f fVar = (f) ((HashMap) this.f6949c).get(next);
                if (fVar != null) {
                    m mVar = new m(this, next, f6, 0);
                    Executor executor = fVar.f3779a;
                    if (executor != null) {
                        executor.execute(mVar);
                    } else {
                        com.bumptech.glide.c.f5735c.execute(mVar);
                    }
                }
            }
        }
    }

    public void h(HashMap hashMap) {
        i iVar = (i) this.f6950e;
        try {
            String str = (String) hashMap.get("t");
            if (str == null) {
                if (iVar.y()) {
                    iVar.d("Failed to parse server message: missing message type:" + hashMap.toString(), (Throwable) null, new Object[0]);
                }
                b(2);
            } else if (str.equals("d")) {
                e((Map) hashMap.get("d"));
            } else if (str.equals("c")) {
                d((Map) hashMap.get("d"));
            } else if (iVar.y()) {
                iVar.d("Ignoring unknown server message type: ".concat(str), (Throwable) null, new Object[0]);
            }
        } catch (ClassCastException e6) {
            if (iVar.y()) {
                iVar.d("Failed to parse server message: " + e6.toString(), (Throwable) null, new Object[0]);
            }
            b(2);
        }
    }

    public void i(String str) {
        i iVar = (i) this.f6950e;
        if (iVar.y()) {
            iVar.d("Got a reset; killing connection to " + ((String) ((com.bumptech.glide.manager.o) this.f6948b).f5844c) + "; Updating internalHost to " + str, (Throwable) null, new Object[0]);
        }
        ((l3.o) this.d).f9708c = str;
        b(1);
    }

    public o(e1 e1Var, com.bumptech.glide.manager.o oVar, String str, l3.o oVar2, String str2, String str3) {
        long j6 = f6946f;
        f6946f = 1 + j6;
        this.f6948b = oVar;
        this.d = oVar2;
        this.f6950e = new i(18, (Object) (C1031a) e1Var.d, "Connection", C0552a.m("conn_", j6));
        this.f6947a = 1;
        this.f6949c = new t(e1Var, oVar, str, str3, this, str2);
    }
}
