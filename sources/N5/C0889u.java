package n5;

import E5.e;
import I1.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.j;
import m5.C0849h;
import o5.d;
import p5.a;
import q5.g;
import x5.p;

/* renamed from: n5.u  reason: case insensitive filesystem */
public final class C0889u extends g implements p {

    /* renamed from: b  reason: collision with root package name */
    public Object f10408b;

    /* renamed from: c  reason: collision with root package name */
    public Iterator f10409c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public int f10410e;

    /* renamed from: f  reason: collision with root package name */
    public /* synthetic */ Object f10411f;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ Iterator f10412p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0889u(Iterator it2, d dVar) {
        super(dVar);
        this.f10412p = it2;
    }

    public final d create(Object obj, d dVar) {
        C0889u uVar = new C0889u(this.f10412p, dVar);
        uVar.f10411f = obj;
        return uVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((C0889u) create((e) obj, (d) obj2)).invokeSuspend(C0849h.f10203c);
    }

    public final Object invokeSuspend(Object obj) {
        e eVar;
        Iterator it2;
        ArrayList arrayList;
        int i2;
        e eVar2;
        C0888t tVar;
        Object[] objArr;
        a aVar = a.f11033a;
        int i5 = this.f10410e;
        if (i5 == 0) {
            b.I0(obj);
            eVar = (e) this.f10411f;
            it2 = this.f10412p;
            arrayList = new ArrayList(20);
            i2 = 0;
        } else if (i5 != 1) {
            if (i5 != 2) {
                if (i5 == 3) {
                    Iterator it3 = this.f10409c;
                    C0888t tVar2 = (C0888t) this.f10408b;
                    e eVar3 = (e) this.f10411f;
                    b.I0(obj);
                    tVar2.t();
                    while (it3.hasNext()) {
                        Object next = it3.next();
                        int k6 = tVar2.k();
                        int i6 = tVar2.f10406b;
                        if (k6 != i6) {
                            int i7 = tVar2.f10407c;
                            int i8 = tVar2.d;
                            Object[] objArr2 = tVar2.f10405a;
                            objArr2[(i7 + i8) % i6] = next;
                            tVar2.d = i8 + 1;
                            if (tVar2.k() == i6) {
                                if (tVar2.d < 20) {
                                    int i9 = i6 + (i6 >> 1) + 1;
                                    if (i9 > 20) {
                                        i9 = 20;
                                    }
                                    if (tVar2.f10407c == 0) {
                                        objArr = Arrays.copyOf(objArr2, i9);
                                        j.d(objArr, "copyOf(...)");
                                    } else {
                                        objArr = tVar2.toArray(new Object[i9]);
                                    }
                                    tVar2 = new C0888t(objArr, tVar2.d);
                                } else {
                                    ArrayList arrayList2 = new ArrayList(tVar2);
                                    this.f10411f = eVar3;
                                    this.f10408b = tVar2;
                                    this.f10409c = it3;
                                    this.f10410e = 3;
                                    eVar3.e(arrayList2, this);
                                    a aVar2 = a.f11033a;
                                    return aVar;
                                }
                            }
                        } else {
                            throw new IllegalStateException("ring buffer is full");
                        }
                    }
                    tVar = tVar2;
                    eVar2 = eVar3;
                } else if (i5 == 4) {
                    tVar = (C0888t) this.f10408b;
                    eVar2 = (e) this.f10411f;
                    b.I0(obj);
                    tVar.t();
                } else if (i5 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                if (tVar.d > 20) {
                    ArrayList arrayList3 = new ArrayList(tVar);
                    this.f10411f = eVar2;
                    this.f10408b = tVar;
                    this.f10409c = null;
                    this.f10410e = 4;
                    eVar2.e(arrayList3, this);
                    a aVar3 = a.f11033a;
                    return aVar;
                }
                if (!tVar.isEmpty()) {
                    this.f10411f = null;
                    this.f10408b = null;
                    this.f10409c = null;
                    this.f10410e = 5;
                    eVar2.e(tVar, this);
                    a aVar4 = a.f11033a;
                    return aVar;
                }
                return C0849h.f10203c;
            }
            b.I0(obj);
            return C0849h.f10203c;
        } else {
            i2 = this.d;
            it2 = this.f10409c;
            ArrayList arrayList4 = (ArrayList) this.f10408b;
            eVar = (e) this.f10411f;
            b.I0(obj);
            arrayList = new ArrayList(20);
        }
        e eVar4 = eVar;
        Iterator it4 = it2;
        int i10 = i2;
        while (it4.hasNext()) {
            Object next2 = it4.next();
            if (i2 > 0) {
                i2--;
            } else {
                arrayList.add(next2);
                if (arrayList.size() == 20) {
                    this.f10411f = eVar4;
                    this.f10408b = arrayList;
                    this.f10409c = it4;
                    this.d = i10;
                    this.f10410e = 1;
                    eVar4.e(arrayList, this);
                    a aVar5 = a.f11033a;
                    return aVar;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.f10411f = null;
            this.f10408b = null;
            this.f10409c = null;
            this.f10410e = 2;
            eVar4.e(arrayList, this);
            a aVar6 = a.f11033a;
            return aVar;
        }
        return C0849h.f10203c;
    }
}
