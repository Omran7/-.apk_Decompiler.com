package F3;

import H3.g;
import I1.b;
import J2.o;
import R2.i;
import Z2.e;
import a5.C0264a;
import com.bumptech.glide.c;
import com.google.android.gms.tasks.Continuation;
import com.mtma.criminal.city.utils.C0445o;
import com.mtma.criminal.city.utils.C0446p;
import com.mtma.criminal.city.utils.C0447q;
import com.mtma.criminal.city.utils.J;
import d5.k;
import d5.u;
import g3.d;
import g3.p;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

public final /* synthetic */ class f implements Continuation, d, J {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f740a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f741b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f742c;
    public final /* synthetic */ Object d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f743e;

    public /* synthetic */ f(Object obj, Object obj2, Object obj3, Object obj4, int i2) {
        this.f740a = i2;
        this.f741b = obj;
        this.f742c = obj2;
        this.d = obj3;
        this.f743e = obj4;
    }

    public Object f(o oVar) {
        return new e((i) oVar.a(i.class), oVar.c(g.class), (Executor) oVar.e((p) this.f741b), (Executor) oVar.e((p) this.f742c), (Executor) oVar.e((p) this.d), (ScheduledExecutorService) oVar.e((p) this.f743e));
    }

    public void h(boolean z3, k kVar) {
        switch (this.f740a) {
            case 2:
                Z2.d dVar = (Z2.d) this.d;
                C0264a aVar = (C0264a) this.f743e;
                if (z3) {
                    u uVar = (u) this.f741b;
                    if (uVar.getMoneyObject().getCash() > 0) {
                        u uVar2 = (u) this.f742c;
                        int Y3 = K1.e.Y(10, uVar2.getSkillsObject(), uVar2.getArmingObject(), uVar2.getSchoolObject());
                        String id = uVar.getAccountObject().getId();
                        C0447q qVar = new C0447q(uVar2, dVar, aVar, 0);
                        if (b.l0(1, c.f5744o)) {
                            c.s(true, new C0445o((Object) id, Y3, (Object) qVar));
                            return;
                        } else {
                            K1.e.r0(id, Y3, qVar);
                            return;
                        }
                    } else {
                        dVar.b(true, aVar.currentPlace, (String) null, 0);
                        return;
                    }
                } else {
                    dVar.b(false, aVar.currentPlace, (String) null, 0);
                    return;
                }
            default:
                Z2.d dVar2 = (Z2.d) this.d;
                C0264a aVar2 = (C0264a) this.f743e;
                if (z3) {
                    u uVar3 = (u) this.f741b;
                    long level = (((long) (((u) this.f742c).getMainStatesObject().getLevel() - uVar3.getMainStatesObject().getLevel())) * 2) + (((long) uVar3.getMainStatesObject().getLevel()) * 2) + 10;
                    com.bumptech.glide.d.l1(level, new C0446p(dVar2, aVar2, level, 0));
                    return;
                }
                dVar2.a(false, aVar2.currentPlace, 0);
                return;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object then(com.google.android.gms.tasks.Task r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f741b
            F3.h r0 = (F3.h) r0
            java.lang.String r1 = "this$0"
            kotlin.jvm.internal.j.e(r0, r1)
            java.lang.Object r1 = r8.f742c
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r8.f743e
            F3.p r2 = (F3.p) r2
            java.lang.String r3 = "task"
            kotlin.jvm.internal.j.e(r9, r3)
            boolean r3 = r9.isSuccessful()
            if (r3 != 0) goto L_0x0029
            java.lang.Exception r9 = r9.getException()
            kotlin.jvm.internal.j.b(r9)
            com.google.android.gms.tasks.Task r9 = com.google.android.gms.tasks.Tasks.forException(r9)
            goto L_0x0146
        L_0x0029:
            java.lang.Object r9 = r9.getResult()
            F3.q r9 = (F3.q) r9
            java.lang.String r3 = r0.h
            java.lang.String r4 = r0.f752f
            java.lang.String r5 = r0.f751e
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r5, r1}
            r5 = 3
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r5)
            java.lang.String r3 = java.lang.String.format(r3, r4)
            java.lang.String r4 = r0.g
            if (r4 == 0) goto L_0x005a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r4)
            r4 = 47
            r3.append(r4)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
        L_0x005a:
            java.net.URL r1 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0147 }
            r1.<init>(r3)     // Catch:{ MalformedURLException -> 0x0147 }
            java.lang.Object r3 = r8.d
            java.util.HashMap r3 = (java.util.HashMap) r3
            r0.getClass()
            java.lang.String r4 = "url cannot be null"
            com.google.android.gms.common.internal.I.h(r1, r4)
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            H3.f r5 = r0.f750c
            r5.getClass()
            java.lang.Object r3 = H3.f.i(r3)
            java.lang.String r5 = "data"
            r4.put(r5, r3)
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>(r4)
            java.lang.String r4 = "application/json"
            r5 = 0
            okhttp3.MediaType r4 = okhttp3.MediaType.a(r4)     // Catch:{ IllegalArgumentException -> 0x008b }
            goto L_0x008c
        L_0x008b:
            r4 = r5
        L_0x008c:
            java.lang.String r3 = r3.toString()
            java.nio.charset.Charset r6 = okhttp3.internal.Util.f10688i
            if (r4 == 0) goto L_0x00b9
            java.lang.String r7 = r4.f10575b     // Catch:{ IllegalArgumentException -> 0x009d }
            if (r7 == 0) goto L_0x009d
            java.nio.charset.Charset r7 = java.nio.charset.Charset.forName(r7)     // Catch:{ IllegalArgumentException -> 0x009d }
            goto L_0x009e
        L_0x009d:
            r7 = r5
        L_0x009e:
            if (r7 != 0) goto L_0x00b8
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r4)
            java.lang.String r4 = "; charset=utf-8"
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            okhttp3.MediaType r4 = okhttp3.MediaType.a(r4)     // Catch:{ IllegalArgumentException -> 0x00b6 }
            goto L_0x00b9
        L_0x00b6:
            r4 = r5
            goto L_0x00b9
        L_0x00b8:
            r6 = r7
        L_0x00b9:
            byte[] r3 = r3.getBytes(r6)
            okhttp3.RequestBody r3 = okhttp3.RequestBody.c(r4, r3)
            okhttp3.Request$Builder r4 = new okhttp3.Request$Builder
            r4.<init>()
            java.lang.String r1 = r1.toString()
            okhttp3.HttpUrl$Builder r6 = new okhttp3.HttpUrl$Builder
            r6.<init>()
            r6.b(r5, r1)
            okhttp3.HttpUrl r1 = r6.a()
            r4.f10642a = r1
            java.lang.String r1 = "POST"
            r4.b(r1, r3)
            kotlin.jvm.internal.j.b(r9)
            java.lang.String r1 = r9.f781a
            if (r1 == 0) goto L_0x00f1
            java.lang.String r3 = "Bearer "
            java.lang.String r1 = r3.concat(r1)
            okhttp3.Headers$Builder r3 = r4.f10644c
            java.lang.String r5 = "Authorization"
            r3.c(r5, r1)
        L_0x00f1:
            java.lang.String r1 = r9.f782b
            if (r1 == 0) goto L_0x00fc
            okhttp3.Headers$Builder r3 = r4.f10644c
            java.lang.String r5 = "Firebase-Instance-ID-Token"
            r3.c(r5, r1)
        L_0x00fc:
            java.lang.String r9 = r9.f783c
            if (r9 == 0) goto L_0x0107
            okhttp3.Headers$Builder r1 = r4.f10644c
            java.lang.String r3 = "X-Firebase-AppCheck"
            r1.c(r3, r9)
        L_0x0107:
            okhttp3.OkHttpClient r9 = r0.f749b
            java.lang.String r1 = "client"
            kotlin.jvm.internal.j.e(r9, r1)
            okhttp3.OkHttpClient$Builder r1 = new okhttp3.OkHttpClient$Builder
            r1.<init>(r9)
            java.util.concurrent.TimeUnit r9 = r2.f780a
            int r2 = okhttp3.internal.Util.d(r9)
            r1.f10618u = r2
            int r9 = okhttp3.internal.Util.d(r9)
            r1.f10620w = r9
            okhttp3.OkHttpClient r9 = new okhttp3.OkHttpClient
            r9.<init>(r1)
            okhttp3.Request r1 = r4.a()
            okhttp3.Call r9 = r9.a(r1)
            com.google.android.gms.tasks.TaskCompletionSource r1 = new com.google.android.gms.tasks.TaskCompletionSource
            r1.<init>()
            I3.h r2 = new I3.h
            r3 = 6
            r4 = 0
            r2.<init>(r1, r0, r3, r4)
            r9.k(r2)
            com.google.android.gms.tasks.Task r9 = r1.getTask()
            java.lang.String r0 = "tcs.task"
            kotlin.jvm.internal.j.d(r9, r0)
        L_0x0146:
            return r9
        L_0x0147:
            r9 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: F3.f.then(com.google.android.gms.tasks.Task):java.lang.Object");
    }
}
