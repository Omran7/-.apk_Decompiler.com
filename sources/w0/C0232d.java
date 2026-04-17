package W0;

import G5.C;
import m5.C0849h;
import o5.d;
import q5.h;
import x5.p;

/* renamed from: W0.d  reason: case insensitive filesystem */
public final class C0232d extends h implements p {

    /* renamed from: a  reason: collision with root package name */
    public int f3920a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ Object f3921b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0233e f3922c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0232d(C0233e eVar, d dVar) {
        super(2, dVar);
        this.f3922c = eVar;
    }

    public final d create(Object obj, d dVar) {
        C0232d dVar2 = new C0232d(this.f3922c, dVar);
        dVar2.f3921b = obj;
        return dVar2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((C0232d) create((C) obj, (d) obj2)).invokeSuspend(C0849h.f10203c);
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00da A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            r24 = this;
            r1 = r24
            p5.a r2 = p5.a.f11033a
            int r0 = r1.f3920a
            m5.h r3 = m5.C0849h.f10203c
            W0.e r4 = r1.f3922c
            r5 = 2
            r6 = 1
            if (r0 == 0) goto L_0x002b
            if (r0 == r6) goto L_0x001f
            if (r0 != r5) goto L_0x0017
            I1.b.I0(r25)
            goto L_0x00c7
        L_0x0017:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x001f:
            I1.b.I0(r25)     // Catch:{ Exception -> 0x0026 }
            r22 = r3
            goto L_0x00c6
        L_0x0026:
            r0 = move-exception
        L_0x0027:
            r22 = r3
            goto L_0x00ca
        L_0x002b:
            I1.b.I0(r25)
            java.lang.Object r0 = r1.f3921b
            G5.C r0 = (G5.C) r0
            boolean r8 = G5.F.m(r0)     // Catch:{ Exception -> 0x0026 }
            if (r8 == 0) goto L_0x00c7
            android.net.Uri r10 = r4.f3928c     // Catch:{ Exception -> 0x0026 }
            if (r10 == 0) goto L_0x007d
            android.graphics.Rect r8 = W0.C0239k.f3959a     // Catch:{ Exception -> 0x0079 }
            android.content.Context r9 = r4.f3926a     // Catch:{ Exception -> 0x0073 }
            float[] r11 = r4.f3929e     // Catch:{ Exception -> 0x0073 }
            int r12 = r4.f3930f     // Catch:{ Exception -> 0x0073 }
            int r13 = r4.f3931p     // Catch:{ Exception -> 0x0073 }
            int r14 = r4.f3932q     // Catch:{ Exception -> 0x0073 }
            boolean r15 = r4.f3933r     // Catch:{ Exception -> 0x0073 }
            int r8 = r4.f3934s     // Catch:{ Exception -> 0x0073 }
            int r6 = r4.f3935t     // Catch:{ Exception -> 0x0073 }
            int r5 = r4.f3936u     // Catch:{ Exception -> 0x0073 }
            int r7 = r4.f3937v     // Catch:{ Exception -> 0x0073 }
            r22 = r3
            boolean r3 = r4.f3938w     // Catch:{ Exception -> 0x006f }
            r23 = r2
            boolean r2 = r4.f3939x     // Catch:{ Exception -> 0x006b }
            r16 = r8
            r17 = r6
            r18 = r5
            r19 = r7
            r20 = r3
            r21 = r2
            B0.l r2 = W0.C0239k.c(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ Exception -> 0x006b }
            goto L_0x0099
        L_0x006b:
            r0 = move-exception
        L_0x006c:
            r2 = r23
            goto L_0x00ca
        L_0x006f:
            r0 = move-exception
            r23 = r2
            goto L_0x006c
        L_0x0073:
            r0 = move-exception
            r23 = r2
            r22 = r3
            goto L_0x006c
        L_0x0079:
            r0 = move-exception
            r23 = r2
            goto L_0x0027
        L_0x007d:
            r23 = r2
            r22 = r3
            android.graphics.Bitmap r5 = r4.d     // Catch:{ Exception -> 0x006b }
            if (r5 == 0) goto L_0x00b4
            android.graphics.Rect r2 = W0.C0239k.f3959a     // Catch:{ Exception -> 0x006b }
            float[] r6 = r4.f3929e     // Catch:{ Exception -> 0x006b }
            int r7 = r4.f3930f     // Catch:{ Exception -> 0x006b }
            boolean r8 = r4.f3933r     // Catch:{ Exception -> 0x006b }
            int r9 = r4.f3934s     // Catch:{ Exception -> 0x006b }
            int r10 = r4.f3935t     // Catch:{ Exception -> 0x006b }
            boolean r11 = r4.f3938w     // Catch:{ Exception -> 0x006b }
            boolean r12 = r4.f3939x     // Catch:{ Exception -> 0x006b }
            B0.l r2 = W0.C0239k.e(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x006b }
        L_0x0099:
            java.lang.Object r3 = r2.f247c     // Catch:{ Exception -> 0x006b }
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3     // Catch:{ Exception -> 0x006b }
            int r5 = r4.f3936u     // Catch:{ Exception -> 0x006b }
            int r6 = r4.f3937v     // Catch:{ Exception -> 0x006b }
            W0.G r7 = r4.f3940y     // Catch:{ Exception -> 0x006b }
            android.graphics.Bitmap r3 = W0.C0239k.v(r3, r5, r6, r7)     // Catch:{ Exception -> 0x006b }
            K5.d r5 = G5.N.f878b     // Catch:{ Exception -> 0x006b }
            W0.c r6 = new W0.c     // Catch:{ Exception -> 0x006b }
            r7 = 0
            r6.<init>(r4, r3, r2, r7)     // Catch:{ Exception -> 0x006b }
            r2 = 2
            G5.F.q(r0, r5, r6, r2)     // Catch:{ Exception -> 0x006b }
            goto L_0x00db
        L_0x00b4:
            W0.a r0 = new W0.a     // Catch:{ Exception -> 0x006b }
            r2 = 1
            r3 = 0
            r0.<init>(r3, r3, r3, r2)     // Catch:{ Exception -> 0x006b }
            r1.f3920a = r2     // Catch:{ Exception -> 0x006b }
            java.lang.Object r0 = W0.C0233e.a(r4, r0, r1)     // Catch:{ Exception -> 0x006b }
            r2 = r23
            if (r0 != r2) goto L_0x00c6
            return r2
        L_0x00c6:
            return r22
        L_0x00c7:
            r22 = r3
            goto L_0x00db
        L_0x00ca:
            W0.a r3 = new W0.a
            r5 = 1
            r6 = 0
            r3.<init>(r6, r6, r0, r5)
            r5 = 2
            r1.f3920a = r5
            java.lang.Object r0 = W0.C0233e.a(r4, r3, r1)
            if (r0 != r2) goto L_0x00db
            return r2
        L_0x00db:
            return r22
        */
        throw new UnsupportedOperationException("Method not decompiled: W0.C0232d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
