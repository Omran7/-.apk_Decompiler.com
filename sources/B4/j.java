package b4;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import n.c;
import n.e;

public final class j extends AbstractSet {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5534a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Map f5535b;

    public /* synthetic */ j(Map map, int i2) {
        this.f5534a = i2;
        this.f5535b = map;
    }

    public void clear() {
        switch (this.f5534a) {
            case 0:
                ((l) this.f5535b).clear();
                return;
            case 1:
                ((l) this.f5535b).clear();
                return;
            default:
                super.clear();
                return;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x003f A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean contains(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.f5534a
            switch(r0) {
                case 0: goto L_0x0013;
                case 1: goto L_0x000a;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r5 = super.contains(r5)
            return r5
        L_0x000a:
            java.util.Map r0 = r4.f5535b
            b4.l r0 = (b4.l) r0
            boolean r5 = r0.containsKey(r5)
            return r5
        L_0x0013:
            boolean r0 = r5 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 == 0) goto L_0x0040
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.util.Map r0 = r4.f5535b
            b4.l r0 = (b4.l) r0
            r0.getClass()
            java.lang.Object r2 = r5.getKey()
            r3 = 0
            if (r2 == 0) goto L_0x002d
            b4.k r0 = r0.a(r2, r1)     // Catch:{ ClassCastException -> 0x002d }
            goto L_0x002e
        L_0x002d:
            r0 = r3
        L_0x002e:
            if (r0 == 0) goto L_0x003d
            java.lang.Object r2 = r0.f5542q
            java.lang.Object r5 = r5.getValue()
            boolean r5 = java.util.Objects.equals(r2, r5)
            if (r5 == 0) goto L_0x003d
            r3 = r0
        L_0x003d:
            if (r3 == 0) goto L_0x0040
            r1 = 1
        L_0x0040:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.j.contains(java.lang.Object):boolean");
    }

    public final Iterator iterator() {
        switch (this.f5534a) {
            case 0:
                return new i((l) this.f5535b, 0);
            case 1:
                return new i((l) this.f5535b, 1);
            default:
                return new c((e) this.f5535b);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean remove(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.f5534a
            switch(r0) {
                case 0: goto L_0x0023;
                case 1: goto L_0x000a;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r6 = super.remove(r6)
            return r6
        L_0x000a:
            java.util.Map r0 = r5.f5535b
            b4.l r0 = (b4.l) r0
            r0.getClass()
            r1 = 0
            r2 = 0
            if (r6 == 0) goto L_0x0019
            b4.k r2 = r0.a(r6, r1)     // Catch:{ ClassCastException -> 0x0019 }
        L_0x0019:
            r6 = 1
            if (r2 == 0) goto L_0x001f
            r0.c(r2, r6)
        L_0x001f:
            if (r2 == 0) goto L_0x0022
            r1 = r6
        L_0x0022:
            return r1
        L_0x0023:
            boolean r0 = r6 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 != 0) goto L_0x0029
            goto L_0x0055
        L_0x0029:
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.util.Map r0 = r5.f5535b
            b4.l r0 = (b4.l) r0
            r0.getClass()
            java.lang.Object r2 = r6.getKey()
            r3 = 0
            if (r2 == 0) goto L_0x003e
            b4.k r2 = r0.a(r2, r1)     // Catch:{ ClassCastException -> 0x003e }
            goto L_0x003f
        L_0x003e:
            r2 = r3
        L_0x003f:
            if (r2 == 0) goto L_0x004e
            java.lang.Object r4 = r2.f5542q
            java.lang.Object r6 = r6.getValue()
            boolean r6 = java.util.Objects.equals(r4, r6)
            if (r6 == 0) goto L_0x004e
            r3 = r2
        L_0x004e:
            if (r3 != 0) goto L_0x0051
            goto L_0x0055
        L_0x0051:
            r1 = 1
            r0.c(r3, r1)
        L_0x0055:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.j.remove(java.lang.Object):boolean");
    }

    public final int size() {
        switch (this.f5534a) {
            case 0:
                return ((l) this.f5535b).d;
            case 1:
                return ((l) this.f5535b).d;
            default:
                return ((e) this.f5535b).f10226c;
        }
    }
}
