package B0;

import F0.r;
import F0.s;
import F0.v;
import U0.m;
import com.bumptech.glide.h;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import n.e;
import z0.C1130f;

public final class E implements j, d {

    /* renamed from: a  reason: collision with root package name */
    public final n f183a;

    /* renamed from: b  reason: collision with root package name */
    public final k f184b;

    /* renamed from: c  reason: collision with root package name */
    public int f185c;
    public int d = -1;

    /* renamed from: e  reason: collision with root package name */
    public C1130f f186e;

    /* renamed from: f  reason: collision with root package name */
    public List f187f;

    /* renamed from: p  reason: collision with root package name */
    public int f188p;

    /* renamed from: q  reason: collision with root package name */
    public volatile r f189q;

    /* renamed from: r  reason: collision with root package name */
    public File f190r;

    /* renamed from: s  reason: collision with root package name */
    public F f191s;

    public E(k kVar, n nVar) {
        this.f184b = kVar;
        this.f183a = nVar;
    }

    public final void a(Exception exc) {
        this.f183a.e(this.f191s, exc, this.f189q.f706c, 4);
    }

    public final boolean b() {
        List list;
        ArrayList c3;
        ArrayList a6 = this.f184b.a();
        boolean z3 = false;
        if (a6.isEmpty()) {
            return false;
        }
        k kVar = this.f184b;
        h a7 = kVar.f232c.a();
        Class<?> cls = kVar.d.getClass();
        Class cls2 = kVar.g;
        Class cls3 = kVar.f237k;
        I3.h hVar = a7.h;
        m mVar = (m) ((AtomicReference) hVar.f1179b).getAndSet((Object) null);
        if (mVar == null) {
            mVar = new m(cls, cls2, cls3);
        } else {
            mVar.f3693a = cls;
            mVar.f3694b = cls2;
            mVar.f3695c = cls3;
        }
        synchronized (((e) hVar.f1180c)) {
            list = (List) ((e) hVar.f1180c).get(mVar);
        }
        ((AtomicReference) hVar.f1179b).set(mVar);
        ArrayList arrayList = list;
        if (list == null) {
            ArrayList arrayList2 = new ArrayList();
            v vVar = a7.f5770a;
            synchronized (vVar) {
                c3 = vVar.f708a.c(cls);
            }
            Iterator it2 = c3.iterator();
            while (it2.hasNext()) {
                Iterator it3 = a7.f5772c.n((Class) it2.next(), cls2).iterator();
                while (it3.hasNext()) {
                    Class cls4 = (Class) it3.next();
                    if (!a7.f5774f.b(cls4, cls3).isEmpty() && !arrayList2.contains(cls4)) {
                        arrayList2.add(cls4);
                    }
                }
            }
            I3.h hVar2 = a7.h;
            List unmodifiableList = Collections.unmodifiableList(arrayList2);
            synchronized (((e) hVar2.f1180c)) {
                ((e) hVar2.f1180c).put(new m(cls, cls2, cls3), unmodifiableList);
            }
            arrayList = arrayList2;
        }
        if (!arrayList.isEmpty()) {
            while (true) {
                List list2 = this.f187f;
                if (list2 == null || this.f188p >= list2.size()) {
                    int i2 = this.d + 1;
                    this.d = i2;
                    if (i2 >= arrayList.size()) {
                        int i5 = this.f185c + 1;
                        this.f185c = i5;
                        if (i5 >= a6.size()) {
                            return false;
                        }
                        this.d = 0;
                    }
                    C1130f fVar = (C1130f) a6.get(this.f185c);
                    Class cls5 = (Class) arrayList.get(this.d);
                    z0.m e6 = this.f184b.e(cls5);
                    k kVar2 = this.f184b;
                    this.f191s = new F(kVar2.f232c.f5759a, fVar, kVar2.f240n, kVar2.f233e, kVar2.f234f, e6, cls5, kVar2.f235i);
                    File a8 = kVar2.h.a().a(this.f191s);
                    this.f190r = a8;
                    if (a8 != null) {
                        this.f186e = fVar;
                        this.f187f = this.f184b.f232c.a().f(a8);
                        this.f188p = 0;
                    }
                } else {
                    this.f189q = null;
                    while (!z3 && this.f188p < this.f187f.size()) {
                        List list3 = this.f187f;
                        int i6 = this.f188p;
                        this.f188p = i6 + 1;
                        File file = this.f190r;
                        k kVar3 = this.f184b;
                        this.f189q = ((s) list3.get(i6)).a(file, kVar3.f233e, kVar3.f234f, kVar3.f235i);
                        if (!(this.f189q == null || this.f184b.c(this.f189q.f706c.b()) == null)) {
                            this.f189q.f706c.f(this.f184b.f241o, this);
                            z3 = true;
                        }
                    }
                    return z3;
                }
            }
        } else if (File.class.equals(this.f184b.f237k)) {
            return false;
        } else {
            throw new IllegalStateException("Failed to find any load path from " + this.f184b.d.getClass() + " to " + this.f184b.f237k);
        }
    }

    public final void cancel() {
        r rVar = this.f189q;
        if (rVar != null) {
            rVar.f706c.cancel();
        }
    }

    public final void d(Object obj) {
        this.f183a.a(this.f186e, obj, this.f189q.f706c, 4, this.f191s);
    }
}
