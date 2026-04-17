package com.google.crypto.tink.shaded.protobuf;

import java.util.Collections;
import java.util.List;

public final class H extends J {

    /* renamed from: c  reason: collision with root package name */
    public static final Class f6756c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: com.google.crypto.tink.shaded.protobuf.F} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: com.google.crypto.tink.shaded.protobuf.F} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: com.google.crypto.tink.shaded.protobuf.F} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List d(long r3, java.lang.Object r5, int r6) {
        /*
            com.google.crypto.tink.shaded.protobuf.o0 r0 = com.google.crypto.tink.shaded.protobuf.p0.f6845c
            java.lang.Object r0 = r0.i(r5, r3)
            java.util.List r0 = (java.util.List) r0
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x0031
            boolean r1 = r0 instanceof com.google.crypto.tink.shaded.protobuf.G
            if (r1 == 0) goto L_0x0018
            com.google.crypto.tink.shaded.protobuf.F r0 = new com.google.crypto.tink.shaded.protobuf.F
            r0.<init>((int) r6)
            goto L_0x002d
        L_0x0018:
            boolean r1 = r0 instanceof com.google.crypto.tink.shaded.protobuf.Z
            if (r1 == 0) goto L_0x0028
            boolean r1 = r0 instanceof com.google.crypto.tink.shaded.protobuf.A
            if (r1 == 0) goto L_0x0028
            com.google.crypto.tink.shaded.protobuf.A r0 = (com.google.crypto.tink.shaded.protobuf.A) r0
            com.google.crypto.tink.shaded.protobuf.A r6 = r0.a(r6)
            r0 = r6
            goto L_0x002d
        L_0x0028:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r6)
        L_0x002d:
            com.google.crypto.tink.shaded.protobuf.p0.v(r5, r3, r0)
            goto L_0x0084
        L_0x0031:
            java.lang.Class r1 = r0.getClass()
            java.lang.Class r2 = f6756c
            boolean r1 = r2.isAssignableFrom(r1)
            if (r1 == 0) goto L_0x004f
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>(r2)
            r1.addAll(r0)
            com.google.crypto.tink.shaded.protobuf.p0.v(r5, r3, r1)
        L_0x004d:
            r0 = r1
            goto L_0x0084
        L_0x004f:
            boolean r1 = r0 instanceof com.google.crypto.tink.shaded.protobuf.k0
            if (r1 == 0) goto L_0x0066
            com.google.crypto.tink.shaded.protobuf.F r1 = new com.google.crypto.tink.shaded.protobuf.F
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>((int) r2)
            com.google.crypto.tink.shaded.protobuf.k0 r0 = (com.google.crypto.tink.shaded.protobuf.k0) r0
            r1.addAll(r0)
            com.google.crypto.tink.shaded.protobuf.p0.v(r5, r3, r1)
            goto L_0x004d
        L_0x0066:
            boolean r1 = r0 instanceof com.google.crypto.tink.shaded.protobuf.Z
            if (r1 == 0) goto L_0x0084
            boolean r1 = r0 instanceof com.google.crypto.tink.shaded.protobuf.A
            if (r1 == 0) goto L_0x0084
            r1 = r0
            com.google.crypto.tink.shaded.protobuf.A r1 = (com.google.crypto.tink.shaded.protobuf.A) r1
            r2 = r1
            com.google.crypto.tink.shaded.protobuf.b r2 = (com.google.crypto.tink.shaded.protobuf.C0397b) r2
            boolean r2 = r2.f6788a
            if (r2 != 0) goto L_0x0084
            int r0 = r0.size()
            int r0 = r0 + r6
            com.google.crypto.tink.shaded.protobuf.A r0 = r1.a(r0)
            com.google.crypto.tink.shaded.protobuf.p0.v(r5, r3, r0)
        L_0x0084:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.H.d(long, java.lang.Object, int):java.util.List");
    }

    public final void a(Object obj, long j6) {
        Object obj2;
        List list = (List) p0.f6845c.i(obj, j6);
        if (list instanceof G) {
            obj2 = ((G) list).j();
        } else {
            if (!f6756c.isAssignableFrom(list.getClass())) {
                if (!(list instanceof Z) || !(list instanceof A)) {
                    obj2 = Collections.unmodifiableList(list);
                } else {
                    C0397b bVar = (C0397b) ((A) list);
                    if (bVar.f6788a) {
                        bVar.f6788a = false;
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
        }
        p0.v(obj, j6, obj2);
    }

    public final void b(Object obj, long j6, Object obj2) {
        List list = (List) p0.f6845c.i(obj2, j6);
        List d = d(j6, obj, list.size());
        int size = d.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            d.addAll(list);
        }
        if (size > 0) {
            list = d;
        }
        p0.v(obj, j6, list);
    }

    public final List c(Object obj, long j6) {
        return d(j6, obj, 10);
    }
}
