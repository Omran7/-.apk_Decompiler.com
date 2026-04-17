package b4;

import H4.i;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;

public final class l extends AbstractMap implements Serializable {

    /* renamed from: r  reason: collision with root package name */
    public static final i f5544r = new i(5);

    /* renamed from: a  reason: collision with root package name */
    public final Comparator f5545a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f5546b;

    /* renamed from: c  reason: collision with root package name */
    public k f5547c;
    public int d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f5548e = 0;

    /* renamed from: f  reason: collision with root package name */
    public final k f5549f;

    /* renamed from: p  reason: collision with root package name */
    public j f5550p;

    /* renamed from: q  reason: collision with root package name */
    public j f5551q;

    public l(boolean z3) {
        i iVar = f5544r;
        this.f5545a = iVar;
        this.f5546b = z3;
        this.f5549f = new k(z3);
    }

    public final k a(Object obj, boolean z3) {
        int i2;
        k kVar;
        Comparable comparable;
        k kVar2;
        k kVar3 = this.f5547c;
        i iVar = f5544r;
        Comparator comparator = this.f5545a;
        if (kVar3 != null) {
            if (comparator == iVar) {
                comparable = (Comparable) obj;
            } else {
                comparable = null;
            }
            while (true) {
                Object obj2 = kVar3.f5540f;
                if (comparable != null) {
                    i2 = comparable.compareTo(obj2);
                } else {
                    i2 = comparator.compare(obj, obj2);
                }
                if (i2 == 0) {
                    return kVar3;
                }
                if (i2 < 0) {
                    kVar2 = kVar3.f5537b;
                } else {
                    kVar2 = kVar3.f5538c;
                }
                if (kVar2 == null) {
                    break;
                }
                kVar3 = kVar2;
            }
        } else {
            i2 = 0;
        }
        if (!z3) {
            return null;
        }
        k kVar4 = this.f5549f;
        if (kVar3 != null) {
            kVar = new k(this.f5546b, kVar3, obj, kVar4, kVar4.f5539e);
            if (i2 < 0) {
                kVar3.f5537b = kVar;
            } else {
                kVar3.f5538c = kVar;
            }
            b(kVar3, true);
        } else if (comparator != iVar || (obj instanceof Comparable)) {
            kVar = new k(this.f5546b, kVar3, obj, kVar4, kVar4.f5539e);
            this.f5547c = kVar;
        } else {
            throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
        }
        this.d++;
        this.f5548e++;
        return kVar;
    }

    public final void b(k kVar, boolean z3) {
        int i2;
        int i5;
        int i6;
        int i7;
        while (kVar != null) {
            k kVar2 = kVar.f5537b;
            k kVar3 = kVar.f5538c;
            int i8 = 0;
            if (kVar2 != null) {
                i2 = kVar2.f5543r;
            } else {
                i2 = 0;
            }
            if (kVar3 != null) {
                i5 = kVar3.f5543r;
            } else {
                i5 = 0;
            }
            int i9 = i2 - i5;
            if (i9 == -2) {
                k kVar4 = kVar3.f5537b;
                k kVar5 = kVar3.f5538c;
                if (kVar5 != null) {
                    i7 = kVar5.f5543r;
                } else {
                    i7 = 0;
                }
                if (kVar4 != null) {
                    i8 = kVar4.f5543r;
                }
                int i10 = i8 - i7;
                if (i10 == -1 || (i10 == 0 && !z3)) {
                    e(kVar);
                } else {
                    f(kVar3);
                    e(kVar);
                }
                if (z3) {
                    return;
                }
            } else if (i9 == 2) {
                k kVar6 = kVar2.f5537b;
                k kVar7 = kVar2.f5538c;
                if (kVar7 != null) {
                    i6 = kVar7.f5543r;
                } else {
                    i6 = 0;
                }
                if (kVar6 != null) {
                    i8 = kVar6.f5543r;
                }
                int i11 = i8 - i6;
                if (i11 == 1 || (i11 == 0 && !z3)) {
                    f(kVar);
                } else {
                    e(kVar2);
                    f(kVar);
                }
                if (z3) {
                    return;
                }
            } else if (i9 == 0) {
                kVar.f5543r = i2 + 1;
                if (z3) {
                    return;
                }
            } else {
                kVar.f5543r = Math.max(i2, i5) + 1;
                if (!z3) {
                    return;
                }
            }
            kVar = kVar.f5536a;
        }
    }

    public final void c(k kVar, boolean z3) {
        k kVar2;
        int i2;
        k kVar3;
        if (z3) {
            k kVar4 = kVar.f5539e;
            kVar4.d = kVar.d;
            kVar.d.f5539e = kVar4;
        }
        k kVar5 = kVar.f5537b;
        k kVar6 = kVar.f5538c;
        k kVar7 = kVar.f5536a;
        int i5 = 0;
        if (kVar5 == null || kVar6 == null) {
            if (kVar5 != null) {
                d(kVar, kVar5);
                kVar.f5537b = null;
            } else if (kVar6 != null) {
                d(kVar, kVar6);
                kVar.f5538c = null;
            } else {
                d(kVar, (k) null);
            }
            b(kVar7, false);
            this.d--;
            this.f5548e++;
            return;
        }
        if (kVar5.f5543r > kVar6.f5543r) {
            k kVar8 = kVar5.f5538c;
            while (true) {
                k kVar9 = kVar8;
                kVar2 = kVar5;
                kVar5 = kVar9;
                if (kVar5 == null) {
                    break;
                }
                kVar8 = kVar5.f5538c;
            }
        } else {
            k kVar10 = kVar6.f5537b;
            while (true) {
                k kVar11 = kVar6;
                kVar6 = kVar10;
                kVar3 = kVar11;
                if (kVar6 == null) {
                    break;
                }
                kVar10 = kVar6.f5537b;
            }
            kVar2 = kVar3;
        }
        c(kVar2, false);
        k kVar12 = kVar.f5537b;
        if (kVar12 != null) {
            i2 = kVar12.f5543r;
            kVar2.f5537b = kVar12;
            kVar12.f5536a = kVar2;
            kVar.f5537b = null;
        } else {
            i2 = 0;
        }
        k kVar13 = kVar.f5538c;
        if (kVar13 != null) {
            i5 = kVar13.f5543r;
            kVar2.f5538c = kVar13;
            kVar13.f5536a = kVar2;
            kVar.f5538c = null;
        }
        kVar2.f5543r = Math.max(i2, i5) + 1;
        d(kVar, kVar2);
    }

    public final void clear() {
        this.f5547c = null;
        this.d = 0;
        this.f5548e++;
        k kVar = this.f5549f;
        kVar.f5539e = kVar;
        kVar.d = kVar;
    }

    public final boolean containsKey(Object obj) {
        k kVar = null;
        if (obj != null) {
            try {
                kVar = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        if (kVar != null) {
            return true;
        }
        return false;
    }

    public final void d(k kVar, k kVar2) {
        k kVar3 = kVar.f5536a;
        kVar.f5536a = null;
        if (kVar2 != null) {
            kVar2.f5536a = kVar3;
        }
        if (kVar3 == null) {
            this.f5547c = kVar2;
        } else if (kVar3.f5537b == kVar) {
            kVar3.f5537b = kVar2;
        } else {
            kVar3.f5538c = kVar2;
        }
    }

    public final void e(k kVar) {
        int i2;
        int i5;
        k kVar2 = kVar.f5537b;
        k kVar3 = kVar.f5538c;
        k kVar4 = kVar3.f5537b;
        k kVar5 = kVar3.f5538c;
        kVar.f5538c = kVar4;
        if (kVar4 != null) {
            kVar4.f5536a = kVar;
        }
        d(kVar, kVar3);
        kVar3.f5537b = kVar;
        kVar.f5536a = kVar3;
        int i6 = 0;
        if (kVar2 != null) {
            i2 = kVar2.f5543r;
        } else {
            i2 = 0;
        }
        if (kVar4 != null) {
            i5 = kVar4.f5543r;
        } else {
            i5 = 0;
        }
        int max = Math.max(i2, i5) + 1;
        kVar.f5543r = max;
        if (kVar5 != null) {
            i6 = kVar5.f5543r;
        }
        kVar3.f5543r = Math.max(max, i6) + 1;
    }

    public final Set entrySet() {
        j jVar = this.f5550p;
        if (jVar != null) {
            return jVar;
        }
        j jVar2 = new j(this, 0);
        this.f5550p = jVar2;
        return jVar2;
    }

    public final void f(k kVar) {
        int i2;
        int i5;
        k kVar2 = kVar.f5537b;
        k kVar3 = kVar.f5538c;
        k kVar4 = kVar2.f5537b;
        k kVar5 = kVar2.f5538c;
        kVar.f5537b = kVar5;
        if (kVar5 != null) {
            kVar5.f5536a = kVar;
        }
        d(kVar, kVar2);
        kVar2.f5538c = kVar;
        kVar.f5536a = kVar2;
        int i6 = 0;
        if (kVar3 != null) {
            i2 = kVar3.f5543r;
        } else {
            i2 = 0;
        }
        if (kVar5 != null) {
            i5 = kVar5.f5543r;
        } else {
            i5 = 0;
        }
        int max = Math.max(i2, i5) + 1;
        kVar.f5543r = max;
        if (kVar4 != null) {
            i6 = kVar4.f5543r;
        }
        kVar2.f5543r = Math.max(max, i6) + 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x000c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object get(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L_0x0009
            r1 = 0
            b4.k r3 = r2.a(r3, r1)     // Catch:{ ClassCastException -> 0x0009 }
            goto L_0x000a
        L_0x0009:
            r3 = r0
        L_0x000a:
            if (r3 == 0) goto L_0x000e
            java.lang.Object r0 = r3.f5542q
        L_0x000e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.l.get(java.lang.Object):java.lang.Object");
    }

    public final Set keySet() {
        j jVar = this.f5551q;
        if (jVar != null) {
            return jVar;
        }
        j jVar2 = new j(this, 1);
        this.f5551q = jVar2;
        return jVar2;
    }

    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        } else if (obj2 != null || this.f5546b) {
            k a6 = a(obj, true);
            Object obj3 = a6.f5542q;
            a6.f5542q = obj2;
            return obj3;
        } else {
            throw new NullPointerException("value == null");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0012  */
    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x000c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object remove(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L_0x0009
            r1 = 0
            b4.k r3 = r2.a(r3, r1)     // Catch:{ ClassCastException -> 0x0009 }
            goto L_0x000a
        L_0x0009:
            r3 = r0
        L_0x000a:
            if (r3 == 0) goto L_0x0010
            r1 = 1
            r2.c(r3, r1)
        L_0x0010:
            if (r3 == 0) goto L_0x0014
            java.lang.Object r0 = r3.f5542q
        L_0x0014:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.l.remove(java.lang.Object):java.lang.Object");
    }

    public final int size() {
        return this.d;
    }
}
