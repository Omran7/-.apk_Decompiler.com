package com.google.firebase.concurrent;

import S3.n;
import V2.a;
import V2.b;
import V2.c;
import com.bumptech.glide.d;
import com.google.firebase.components.ComponentRegistrar;
import g3.C0548a;
import g3.C0549b;
import g3.l;
import g3.p;
import h3.j;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

public class ExecutorsRegistrar implements ComponentRegistrar {

    /* renamed from: a  reason: collision with root package name */
    public static final l f6886a = new l(new n(3));

    /* renamed from: b  reason: collision with root package name */
    public static final l f6887b = new l(new n(4));

    /* renamed from: c  reason: collision with root package name */
    public static final l f6888c = new l(new n(5));
    public static final l d = new l(new n(6));

    public final List getComponents() {
        Class<a> cls = a.class;
        Class<ScheduledExecutorService> cls2 = ScheduledExecutorService.class;
        p pVar = new p(cls, cls2);
        Class<ExecutorService> cls3 = ExecutorService.class;
        Class<Executor> cls4 = Executor.class;
        p[] pVarArr = {new p(cls, cls3), new p(cls, cls4)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(pVar);
        for (p g : pVarArr) {
            d.g(g, "Null interface");
        }
        Collections.addAll(hashSet, pVarArr);
        C0549b bVar = new C0549b((String) null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new D2.l(29), hashSet3);
        Class<b> cls5 = b.class;
        p pVar2 = new p(cls5, cls2);
        p[] pVarArr2 = {new p(cls5, cls3), new p(cls5, cls4)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(pVar2);
        for (p g5 : pVarArr2) {
            d.g(g5, "Null interface");
        }
        Collections.addAll(hashSet4, pVarArr2);
        C0549b bVar2 = new C0549b((String) null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new j(0), hashSet6);
        Class<c> cls6 = c.class;
        p pVar3 = new p(cls6, cls2);
        p[] pVarArr3 = {new p(cls6, cls3), new p(cls6, cls4)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(pVar3);
        for (p g6 : pVarArr3) {
            d.g(g6, "Null interface");
        }
        Collections.addAll(hashSet7, pVarArr3);
        C0549b bVar3 = new C0549b((String) null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new j(1), hashSet9);
        C0548a a6 = C0549b.a(new p(V2.d.class, cls4));
        a6.f8012f = new j(2);
        return Arrays.asList(new C0549b[]{bVar, bVar2, bVar3, a6.b()});
    }
}
