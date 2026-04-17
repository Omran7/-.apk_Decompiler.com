package B0;

import N0.a;
import android.util.Log;
import com.bumptech.glide.load.data.g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import z0.i;
import z0.k;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final Class f280a;

    /* renamed from: b  reason: collision with root package name */
    public final List f281b;

    /* renamed from: c  reason: collision with root package name */
    public final a f282c;
    public final C0009h d;

    /* renamed from: e  reason: collision with root package name */
    public final String f283e;

    public o(Class cls, Class cls2, Class cls3, List list, a aVar, C0009h hVar) {
        this.f280a = cls;
        this.f281b = list;
        this.f282c = aVar;
        this.d = hVar;
        this.f283e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: B0.C} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: B0.F} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: B0.g} */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b8, code lost:
        if (r0 == 3) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ba, code lost:
        if (r0 == 1) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00bd, code lost:
        if (r1 != 2) goto L_0x00c0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final B0.D a(int r18, int r19, B0.l r20, com.bumptech.glide.load.data.g r21, z0.i r22) {
        /*
            r17 = this;
            r7 = r17
            r0 = r20
            B0.h r8 = r7.d
            java.lang.Object r1 = r8.j()
            r9 = r1
            java.util.List r9 = (java.util.List) r9
            r1 = r17
            r2 = r21
            r3 = r18
            r4 = r19
            r5 = r22
            r6 = r9
            B0.D r1 = r1.b(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0147 }
            r8.D(r9)
            java.lang.Object r2 = r0.f247c
            B0.n r2 = (B0.n) r2
            r2.getClass()
            java.lang.Object r3 = r1.get()
            java.lang.Class r15 = r3.getClass()
            r3 = 4
            int r0 = r0.f246b
            B0.k r4 = r2.f264a
            r5 = 0
            if (r0 == r3) goto L_0x0046
            z0.m r3 = r4.e(r15)
            com.bumptech.glide.e r6 = r2.f270q
            int r8 = r2.f274u
            int r9 = r2.f275v
            B0.D r6 = r3.b(r6, r1, r8, r9)
            r14 = r3
            goto L_0x0048
        L_0x0046:
            r6 = r1
            r14 = r5
        L_0x0048:
            boolean r3 = r1.equals(r6)
            if (r3 != 0) goto L_0x0051
            r1.d()
        L_0x0051:
            com.bumptech.glide.e r1 = r4.f232c
            com.bumptech.glide.h r1 = r1.a()
            N0.c r1 = r1.d
            java.lang.Class r3 = r6.c()
            z0.l r1 = r1.a(r3)
            if (r1 == 0) goto L_0x0089
            com.bumptech.glide.e r1 = r4.f232c
            com.bumptech.glide.h r1 = r1.a()
            r1.getClass()
            java.lang.Class r3 = r6.c()
            N0.c r1 = r1.d
            z0.l r5 = r1.a(r3)
            if (r5 == 0) goto L_0x007f
            z0.i r1 = r2.f277x
            int r1 = r5.o(r1)
            goto L_0x008a
        L_0x007f:
            com.bumptech.glide.g r0 = new com.bumptech.glide.g
            java.lang.Class r1 = r6.c()
            r0.<init>(r1)
            throw r0
        L_0x0089:
            r1 = 3
        L_0x008a:
            z0.f r3 = r2.f254D
            java.util.ArrayList r8 = r4.b()
            int r9 = r8.size()
            r13 = 0
            r10 = r13
        L_0x0096:
            r12 = 1
            if (r10 >= r9) goto L_0x00ac
            java.lang.Object r11 = r8.get(r10)
            F0.r r11 = (F0.r) r11
            z0.f r11 = r11.f704a
            boolean r11 = r11.equals(r3)
            if (r11 == 0) goto L_0x00a9
            r3 = r12
            goto L_0x00ad
        L_0x00a9:
            int r10 = r10 + 1
            goto L_0x0096
        L_0x00ac:
            r3 = r13
        L_0x00ad:
            B0.p r8 = r2.f276w
            int r8 = r8.f286a
            switch(r8) {
                case 0: goto L_0x00c0;
                case 1: goto L_0x00c0;
                default: goto L_0x00b4;
            }
        L_0x00b4:
            r8 = 1
            if (r3 != 0) goto L_0x00ba
            r3 = 3
            if (r0 == r3) goto L_0x00bc
        L_0x00ba:
            if (r0 != r8) goto L_0x00c0
        L_0x00bc:
            r0 = 2
            if (r1 != r0) goto L_0x00c0
            goto L_0x00c1
        L_0x00c0:
            r8 = 0
        L_0x00c1:
            if (r8 == 0) goto L_0x013e
            if (r5 == 0) goto L_0x0130
            int r0 = q.C0928e.c(r1)
            if (r0 == 0) goto L_0x010d
            if (r0 != r12) goto L_0x00ed
            B0.F r0 = new B0.F
            com.bumptech.glide.e r1 = r4.f232c
            C0.g r9 = r1.f5759a
            z0.f r10 = r2.f254D
            z0.f r11 = r2.f271r
            int r1 = r2.f274u
            int r3 = r2.f275v
            z0.i r4 = r2.f277x
            r8 = r0
            r18 = r0
            r0 = r12
            r12 = r1
            r1 = r13
            r13 = r3
            r16 = r4
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            r3 = r1
            r1 = r18
            goto L_0x0118
        L_0x00ed:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r2 = 1
            if (r1 == r2) goto L_0x0101
            r2 = 2
            if (r1 == r2) goto L_0x00fe
            r2 = 3
            if (r1 == r2) goto L_0x00fb
            java.lang.String r1 = "null"
            goto L_0x0103
        L_0x00fb:
            java.lang.String r1 = "NONE"
            goto L_0x0103
        L_0x00fe:
            java.lang.String r1 = "TRANSFORMED"
            goto L_0x0103
        L_0x0101:
            java.lang.String r1 = "SOURCE"
        L_0x0103:
            java.lang.String r2 = "Unknown strategy: "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L_0x010d:
            r0 = r12
            r3 = r13
            B0.g r1 = new B0.g
            z0.f r4 = r2.f254D
            z0.f r8 = r2.f271r
            r1.<init>(r4, r8)
        L_0x0118:
            B0.h r4 = B0.C.f179e
            java.lang.Object r4 = r4.j()
            B0.C r4 = (B0.C) r4
            r4.d = r3
            r4.f182c = r0
            r4.f181b = r6
            B0.h r0 = r2.f268f
            r0.f228b = r1
            r0.f229c = r5
            r0.d = r4
            r6 = r4
            goto L_0x013e
        L_0x0130:
            com.bumptech.glide.g r0 = new com.bumptech.glide.g
            java.lang.Object r1 = r6.get()
            java.lang.Class r1 = r1.getClass()
            r0.<init>(r1)
            throw r0
        L_0x013e:
            N0.a r0 = r7.f282c
            r1 = r22
            B0.D r0 = r0.i(r6, r1)
            return r0
        L_0x0147:
            r0 = move-exception
            r1 = r0
            r8.D(r9)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.o.a(int, int, B0.l, com.bumptech.glide.load.data.g, z0.i):B0.D");
    }

    public final D b(g gVar, int i2, int i5, i iVar, List list) {
        List list2 = this.f281b;
        int size = list2.size();
        D d6 = null;
        for (int i6 = 0; i6 < size; i6++) {
            k kVar = (k) list2.get(i6);
            try {
                if (kVar.b(gVar.d(), iVar)) {
                    d6 = kVar.a(gVar.d(), i2, i5, iVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e6) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + kVar, e6);
                }
                list.add(e6);
            }
            if (d6 != null) {
                break;
            }
        }
        if (d6 != null) {
            return d6;
        }
        throw new y(this.f283e, new ArrayList(list));
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.f280a + ", decoders=" + this.f281b + ", transcoder=" + this.f282c + '}';
    }
}
