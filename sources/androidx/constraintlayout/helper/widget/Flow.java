package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.HashMap;
import s.d;
import s.g;
import s.i;
import v.q;
import v.s;

public class Flow extends s {

    /* renamed from: s  reason: collision with root package name */
    public final g f4836s;

    /* JADX WARNING: type inference failed for: r8v1, types: [s.g, s.i] */
    /* JADX WARNING: type inference failed for: r1v0, types: [t.b, java.lang.Object] */
    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11953a = new int[32];
        this.f11958p = new HashMap();
        this.f11955c = context;
        super.g(attributeSet);
        ? iVar = new i();
        iVar.s0 = 0;
        iVar.f11413t0 = 0;
        iVar.f11414u0 = 0;
        iVar.f11415v0 = 0;
        iVar.f11416w0 = 0;
        iVar.f11417x0 = 0;
        iVar.f11418y0 = false;
        iVar.f11419z0 = 0;
        iVar.f11388A0 = 0;
        iVar.f11389B0 = new Object();
        iVar.f11390C0 = null;
        iVar.f11391D0 = -1;
        iVar.f11392E0 = -1;
        iVar.f11393F0 = -1;
        iVar.f11394G0 = -1;
        iVar.f11395H0 = -1;
        iVar.f11396I0 = -1;
        iVar.f11397J0 = 0.5f;
        iVar.f11398K0 = 0.5f;
        iVar.L0 = 0.5f;
        iVar.f11399M0 = 0.5f;
        iVar.f11400N0 = 0.5f;
        iVar.O0 = 0.5f;
        iVar.f11401P0 = 0;
        iVar.f11402Q0 = 0;
        iVar.f11403R0 = 2;
        iVar.f11404S0 = 2;
        iVar.f11405T0 = 0;
        iVar.f11406U0 = -1;
        iVar.f11407V0 = 0;
        iVar.f11408W0 = new ArrayList();
        iVar.X0 = null;
        iVar.f11409Y0 = null;
        iVar.f11410Z0 = null;
        iVar.f11412b1 = 0;
        this.f4836s = iVar;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, q.f12138b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 0) {
                    this.f4836s.f11407V0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    g gVar = this.f4836s;
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar.s0 = dimensionPixelSize;
                    gVar.f11413t0 = dimensionPixelSize;
                    gVar.f11414u0 = dimensionPixelSize;
                    gVar.f11415v0 = dimensionPixelSize;
                } else if (index == 18) {
                    g gVar2 = this.f4836s;
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar2.f11414u0 = dimensionPixelSize2;
                    gVar2.f11416w0 = dimensionPixelSize2;
                    gVar2.f11417x0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.f4836s.f11415v0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.f4836s.f11416w0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.f4836s.s0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.f4836s.f11417x0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.f4836s.f11413t0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.f4836s.f11405T0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.f4836s.f11391D0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.f4836s.f11392E0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.f4836s.f11393F0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.f4836s.f11395H0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.f4836s.f11394G0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.f4836s.f11396I0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.f4836s.f11397J0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.f4836s.L0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.f4836s.f11400N0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.f4836s.f11399M0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.f4836s.O0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.f4836s.f11398K0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.f4836s.f11403R0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.f4836s.f11404S0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.f4836s.f11401P0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.f4836s.f11402Q0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.f4836s.f11406U0 = obtainStyledAttributes.getInt(index, -1);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.d = this.f4836s;
        i();
    }

    public final void h(d dVar, boolean z3) {
        g gVar = this.f4836s;
        int i2 = gVar.f11414u0;
        if (i2 <= 0 && gVar.f11415v0 <= 0) {
            return;
        }
        if (z3) {
            gVar.f11416w0 = gVar.f11415v0;
            gVar.f11417x0 = i2;
            return;
        }
        gVar.f11416w0 = i2;
        gVar.f11417x0 = gVar.f11415v0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r43v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v0, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r43v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v1, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: s.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r43v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r43v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v3, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r43v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r43v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v11, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r43v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v6, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v104, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v105, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v10, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v106, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v7, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v8, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v9, resolved type: java.lang.Object[]} */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r2v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:380:0x07a8  */
    /* JADX WARNING: Removed duplicated region for block: B:381:0x07ad  */
    /* JADX WARNING: Removed duplicated region for block: B:388:0x07c1  */
    /* JADX WARNING: Removed duplicated region for block: B:389:0x07c4  */
    /* JADX WARNING: Removed duplicated region for block: B:396:0x07e0  */
    /* JADX WARNING: Removed duplicated region for block: B:397:0x07e2  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j(s.g r41, int r42, int r43) {
        /*
            r40 = this;
            r0 = r40
            r9 = r41
            int r10 = android.view.View.MeasureSpec.getMode(r42)
            int r11 = android.view.View.MeasureSpec.getSize(r42)
            int r12 = android.view.View.MeasureSpec.getMode(r43)
            int r13 = android.view.View.MeasureSpec.getSize(r43)
            r14 = 0
            if (r9 == 0) goto L_0x07ef
            int r1 = r9.f11426r0
            r15 = 1
            r8 = 2
            r7 = 3
            if (r1 <= 0) goto L_0x0085
            s.d r1 = r9.f11307T
            if (r1 == 0) goto L_0x0027
            s.e r1 = (s.e) r1
            v.f r1 = r1.f11367u0
            goto L_0x0028
        L_0x0027:
            r1 = 0
        L_0x0028:
            if (r1 != 0) goto L_0x0032
            r9.f11419z0 = r14
            r9.f11388A0 = r14
            r9.f11418y0 = r14
            goto L_0x07e5
        L_0x0032:
            r3 = r14
        L_0x0033:
            int r4 = r9.f11426r0
            if (r3 >= r4) goto L_0x0085
            s.d[] r4 = r9.f11425q0
            r4 = r4[r3]
            if (r4 != 0) goto L_0x003e
            goto L_0x0082
        L_0x003e:
            boolean r5 = r4 instanceof s.h
            if (r5 == 0) goto L_0x0043
            goto L_0x0082
        L_0x0043:
            int r5 = r4.j(r14)
            int r6 = r4.j(r15)
            if (r5 != r7) goto L_0x0058
            int r2 = r4.f11344r
            if (r2 == r15) goto L_0x0058
            if (r6 != r7) goto L_0x0058
            int r2 = r4.f11345s
            if (r2 == r15) goto L_0x0058
            goto L_0x0082
        L_0x0058:
            if (r5 != r7) goto L_0x005b
            r5 = r8
        L_0x005b:
            if (r6 != r7) goto L_0x005e
            r6 = r8
        L_0x005e:
            t.b r2 = r9.f11389B0
            r2.f11567a = r5
            r2.f11568b = r6
            int r5 = r4.q()
            r2.f11569c = r5
            int r5 = r4.k()
            r2.d = r5
            r1.b(r4, r2)
            int r5 = r2.f11570e
            r4.O(r5)
            int r5 = r2.f11571f
            r4.L(r5)
            int r2 = r2.g
            r4.I(r2)
        L_0x0082:
            int r3 = r3 + 1
            goto L_0x0033
        L_0x0085:
            int r6 = r9.f11416w0
            int r5 = r9.f11417x0
            int r4 = r9.s0
            int r3 = r9.f11413t0
            int[] r2 = new int[r8]
            int r1 = r11 - r6
            int r1 = r1 - r5
            int r7 = r9.f11407V0
            if (r7 != r15) goto L_0x0099
            int r1 = r13 - r4
            int r1 = r1 - r3
        L_0x0099:
            r8 = -1
            if (r7 != 0) goto L_0x00a9
            int r7 = r9.f11391D0
            if (r7 != r8) goto L_0x00a2
            r9.f11391D0 = r14
        L_0x00a2:
            int r7 = r9.f11392E0
            if (r7 != r8) goto L_0x00b5
            r9.f11392E0 = r14
            goto L_0x00b5
        L_0x00a9:
            int r7 = r9.f11391D0
            if (r7 != r8) goto L_0x00af
            r9.f11391D0 = r14
        L_0x00af:
            int r7 = r9.f11392E0
            if (r7 != r8) goto L_0x00b5
            r9.f11392E0 = r14
        L_0x00b5:
            s.d[] r7 = r9.f11425q0
            r8 = r14
            r17 = r8
        L_0x00ba:
            int r14 = r9.f11426r0
            r15 = 8
            if (r8 >= r14) goto L_0x00ce
            s.d[] r14 = r9.f11425q0
            r14 = r14[r8]
            int r14 = r14.f11325g0
            if (r14 != r15) goto L_0x00ca
            int r17 = r17 + 1
        L_0x00ca:
            int r8 = r8 + 1
            r15 = 1
            goto L_0x00ba
        L_0x00ce:
            if (r17 <= 0) goto L_0x00f3
            int r14 = r14 - r17
            s.d[] r7 = new s.d[r14]
            r8 = 0
            r14 = 0
        L_0x00d6:
            int r15 = r9.f11426r0
            if (r8 >= r15) goto L_0x00f3
            s.d[] r15 = r9.f11425q0
            r15 = r15[r8]
            r18 = r1
            int r1 = r15.f11325g0
            r19 = r2
            r2 = 8
            if (r1 == r2) goto L_0x00ec
            r7[r14] = r15
            int r14 = r14 + 1
        L_0x00ec:
            int r8 = r8 + 1
            r1 = r18
            r2 = r19
            goto L_0x00d6
        L_0x00f3:
            r18 = r1
            r19 = r2
            r15 = r14
            r14 = r7
            r9.f11411a1 = r14
            r9.f11412b1 = r15
            int r1 = r9.f11405T0
            java.util.ArrayList r8 = r9.f11408W0
            if (r1 == 0) goto L_0x0702
            s.c r7 = r9.f11297J
            s.c r2 = r9.f11296I
            s.c r0 = r9.f11298K
            r27 = r0
            s.c r0 = r9.f11299L
            r28 = r0
            int[] r0 = r9.f11342p0
            r17 = r2
            r2 = 1
            if (r1 == r2) goto L_0x04cb
            r2 = 2
            if (r1 == r2) goto L_0x0382
            r16 = r7
            r7 = 3
            if (r1 == r7) goto L_0x0134
        L_0x011e:
            r32 = r3
            r33 = r4
            r34 = r5
            r35 = r6
            r39 = r10
            r38 = r11
            r36 = r12
            r43 = r13
            r31 = r19
        L_0x0130:
            r1 = 0
            r2 = 1
            goto L_0x0794
        L_0x0134:
            int r1 = r9.f11407V0
            if (r15 != 0) goto L_0x0139
            goto L_0x011e
        L_0x0139:
            r8.clear()
            r43 = r13
            s.f r13 = new s.f
            s.c r7 = r9.f11296I
            r21 = r5
            s.c r5 = r9.f11297J
            r22 = r6
            s.c r6 = r9.f11298K
            r23 = r8
            s.c r8 = r9.f11299L
            r30 = r1
            r29 = r18
            r1 = r13
            r18 = r17
            r31 = r19
            r17 = r2
            r2 = r41
            r32 = r3
            r3 = r30
            r33 = r4
            r4 = r7
            r34 = r21
            r35 = r22
            r36 = r12
            r12 = 3
            r7 = r8
            r12 = r23
            r8 = r29
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r12.add(r13)
            if (r30 != 0) goto L_0x0202
            r1 = 0
            r2 = 0
            r3 = 0
            r8 = 0
        L_0x017a:
            if (r8 >= r15) goto L_0x01fc
            r4 = 1
            int r1 = r1 + r4
            r7 = r14[r8]
            r6 = r29
            int r17 = r9.U(r7, r6)
            int[] r4 = r7.f11342p0
            r5 = 0
            r4 = r4[r5]
            r5 = 3
            if (r4 != r5) goto L_0x0190
            int r2 = r2 + 1
        L_0x0190:
            r19 = r2
            if (r3 == r6) goto L_0x019b
            int r2 = r9.f11401P0
            int r2 = r2 + r3
            int r2 = r2 + r17
            if (r2 <= r6) goto L_0x01a1
        L_0x019b:
            s.d r2 = r13.f11374b
            if (r2 == 0) goto L_0x01a1
            r2 = 1
            goto L_0x01a2
        L_0x01a1:
            r2 = 0
        L_0x01a2:
            if (r2 != 0) goto L_0x01ad
            if (r8 <= 0) goto L_0x01ad
            int r4 = r9.f11406U0
            if (r4 <= 0) goto L_0x01ad
            if (r1 <= r4) goto L_0x01ad
            r2 = 1
        L_0x01ad:
            if (r2 == 0) goto L_0x01dc
            s.f r13 = new s.f
            s.c r4 = r9.f11296I
            s.c r5 = r9.f11297J
            s.c r3 = r9.f11298K
            s.c r2 = r9.f11299L
            r1 = r13
            r21 = r2
            r2 = r41
            r22 = r3
            r3 = r30
            r29 = r6
            r6 = r22
            r38 = r11
            r11 = r7
            r7 = r21
            r39 = r10
            r10 = r8
            r8 = r29
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r13.f11383n = r10
            r12.add(r13)
            r3 = r17
            r1 = 1
            goto L_0x01ef
        L_0x01dc:
            r29 = r6
            r39 = r10
            r38 = r11
            r11 = r7
            r10 = r8
            if (r10 <= 0) goto L_0x01ed
            int r2 = r9.f11401P0
            int r2 = r2 + r17
            int r2 = r2 + r3
            r3 = r2
            goto L_0x01ef
        L_0x01ed:
            r3 = r17
        L_0x01ef:
            r13.a(r11)
            int r8 = r10 + 1
            r2 = r19
            r11 = r38
            r10 = r39
            goto L_0x017a
        L_0x01fc:
            r39 = r10
            r38 = r11
            goto L_0x0270
        L_0x0202:
            r39 = r10
            r38 = r11
            r1 = 0
            r2 = 0
            r3 = 0
            r10 = 0
        L_0x020a:
            if (r10 >= r15) goto L_0x0270
            r4 = 1
            int r1 = r1 + r4
            r11 = r14[r10]
            r8 = r29
            int r17 = r9.T(r11, r8)
            int[] r5 = r11.f11342p0
            r5 = r5[r4]
            r4 = 3
            if (r5 != r4) goto L_0x021f
            int r2 = r2 + 1
        L_0x021f:
            r19 = r2
            if (r3 == r8) goto L_0x022a
            int r2 = r9.f11402Q0
            int r2 = r2 + r3
            int r2 = r2 + r17
            if (r2 <= r8) goto L_0x0230
        L_0x022a:
            s.d r2 = r13.f11374b
            if (r2 == 0) goto L_0x0230
            r2 = 1
            goto L_0x0231
        L_0x0230:
            r2 = 0
        L_0x0231:
            if (r2 != 0) goto L_0x023c
            if (r10 <= 0) goto L_0x023c
            int r4 = r9.f11406U0
            if (r4 <= 0) goto L_0x023c
            if (r1 <= r4) goto L_0x023c
            r2 = 1
        L_0x023c:
            if (r2 == 0) goto L_0x025b
            s.f r13 = new s.f
            s.c r4 = r9.f11296I
            s.c r5 = r9.f11297J
            s.c r6 = r9.f11298K
            s.c r7 = r9.f11299L
            r1 = r13
            r2 = r41
            r3 = r30
            r29 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r13.f11383n = r10
            r12.add(r13)
            r3 = r17
            r1 = 1
            goto L_0x0268
        L_0x025b:
            r29 = r8
            if (r10 <= 0) goto L_0x0266
            int r2 = r9.f11402Q0
            int r2 = r2 + r17
            int r2 = r2 + r3
            r3 = r2
            goto L_0x0268
        L_0x0266:
            r3 = r17
        L_0x0268:
            r13.a(r11)
            int r10 = r10 + 1
            r2 = r19
            goto L_0x020a
        L_0x0270:
            int r1 = r12.size()
            int r3 = r9.f11416w0
            int r4 = r9.s0
            int r5 = r9.f11417x0
            int r6 = r9.f11413t0
            r7 = 0
            r8 = r0[r7]
            r10 = 2
            if (r8 == r10) goto L_0x028a
            r7 = 1
            r0 = r0[r7]
            if (r0 != r10) goto L_0x0288
            goto L_0x028a
        L_0x0288:
            r0 = 0
            goto L_0x028b
        L_0x028a:
            r0 = 1
        L_0x028b:
            if (r2 <= 0) goto L_0x02b6
            if (r0 == 0) goto L_0x02b6
            r0 = 0
        L_0x0290:
            if (r0 >= r1) goto L_0x02b6
            java.lang.Object r2 = r12.get(r0)
            s.f r2 = (s.f) r2
            if (r30 != 0) goto L_0x02a6
            int r7 = r2.d()
            r11 = r29
            int r7 = r11 - r7
            r2.e(r7)
            goto L_0x02b1
        L_0x02a6:
            r11 = r29
            int r7 = r2.c()
            int r7 = r11 - r7
            r2.e(r7)
        L_0x02b1:
            int r0 = r0 + 1
            r29 = r11
            goto L_0x0290
        L_0x02b6:
            r11 = r29
            r2 = r16
            r0 = r18
            r14 = r27
            r13 = r28
            r7 = 0
            r8 = 0
            r10 = 0
        L_0x02c3:
            if (r7 >= r1) goto L_0x037a
            java.lang.Object r15 = r12.get(r7)
            s.f r15 = (s.f) r15
            if (r30 != 0) goto L_0x0320
            int r6 = r1 + -1
            if (r7 >= r6) goto L_0x02e2
            int r6 = r7 + 1
            java.lang.Object r6 = r12.get(r6)
            s.f r6 = (s.f) r6
            s.d r6 = r6.f11374b
            s.c r6 = r6.f11297J
            r13 = r6
            r29 = r12
            r6 = 0
            goto L_0x02e8
        L_0x02e2:
            int r6 = r9.f11413t0
            r29 = r12
            r13 = r28
        L_0x02e8:
            s.d r12 = r15.f11374b
            s.c r12 = r12.f11299L
            r16 = r15
            r17 = r30
            r18 = r0
            r19 = r2
            r20 = r14
            r21 = r13
            r22 = r3
            r23 = r4
            r24 = r5
            r25 = r6
            r26 = r11
            r16.f(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            int r2 = r15.d()
            int r2 = java.lang.Math.max(r8, r2)
            int r4 = r15.c()
            int r4 = r4 + r10
            if (r7 <= 0) goto L_0x0317
            int r8 = r9.f11402Q0
            int r4 = r4 + r8
        L_0x0317:
            r42 = r1
            r8 = r2
            r10 = r4
            r2 = r12
            r12 = r29
            r4 = 0
            goto L_0x0374
        L_0x0320:
            r29 = r12
            int r5 = r1 + -1
            if (r7 >= r5) goto L_0x0339
            int r5 = r7 + 1
            r12 = r29
            java.lang.Object r5 = r12.get(r5)
            s.f r5 = (s.f) r5
            s.d r5 = r5.f11374b
            s.c r5 = r5.f11296I
            r42 = r1
            r14 = r5
            r5 = 0
            goto L_0x0341
        L_0x0339:
            r12 = r29
            int r5 = r9.f11417x0
            r42 = r1
            r14 = r27
        L_0x0341:
            s.d r1 = r15.f11374b
            s.c r1 = r1.f11298K
            r16 = r15
            r17 = r30
            r18 = r0
            r19 = r2
            r20 = r14
            r21 = r13
            r22 = r3
            r23 = r4
            r24 = r5
            r25 = r6
            r26 = r11
            r16.f(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            int r0 = r15.d()
            int r0 = r0 + r8
            int r3 = r15.c()
            int r3 = java.lang.Math.max(r10, r3)
            if (r7 <= 0) goto L_0x0370
            int r8 = r9.f11401P0
            int r0 = r0 + r8
        L_0x0370:
            r8 = r0
            r0 = r1
            r10 = r3
            r3 = 0
        L_0x0374:
            int r7 = r7 + 1
            r1 = r42
            goto L_0x02c3
        L_0x037a:
            r0 = 0
            r31[r0] = r8
            r0 = 1
            r31[r0] = r10
            goto L_0x0130
        L_0x0382:
            r32 = r3
            r33 = r4
            r34 = r5
            r35 = r6
            r39 = r10
            r38 = r11
            r36 = r12
            r43 = r13
            r11 = r18
            r31 = r19
            r10 = r2
            int r0 = r9.f11407V0
            if (r0 != 0) goto L_0x03c0
            int r1 = r9.f11406U0
            if (r1 > 0) goto L_0x03be
            r1 = 0
            r2 = 0
            r3 = 0
        L_0x03a2:
            if (r1 >= r15) goto L_0x03bc
            if (r1 <= 0) goto L_0x03a9
            int r4 = r9.f11401P0
            int r2 = r2 + r4
        L_0x03a9:
            r4 = r14[r1]
            if (r4 != 0) goto L_0x03ae
            goto L_0x03b9
        L_0x03ae:
            int r4 = r9.U(r4, r11)
            int r4 = r4 + r2
            if (r4 <= r11) goto L_0x03b6
            goto L_0x03bc
        L_0x03b6:
            int r3 = r3 + 1
            r2 = r4
        L_0x03b9:
            int r1 = r1 + 1
            goto L_0x03a2
        L_0x03bc:
            r1 = 0
            goto L_0x03e3
        L_0x03be:
            r3 = r1
            goto L_0x03bc
        L_0x03c0:
            int r1 = r9.f11406U0
            if (r1 > 0) goto L_0x03e2
            r1 = 0
            r2 = 0
            r3 = 0
        L_0x03c7:
            if (r1 >= r15) goto L_0x03e1
            if (r1 <= 0) goto L_0x03ce
            int r4 = r9.f11402Q0
            int r2 = r2 + r4
        L_0x03ce:
            r4 = r14[r1]
            if (r4 != 0) goto L_0x03d3
            goto L_0x03de
        L_0x03d3:
            int r4 = r9.T(r4, r11)
            int r4 = r4 + r2
            if (r4 <= r11) goto L_0x03db
            goto L_0x03e1
        L_0x03db:
            int r3 = r3 + 1
            r2 = r4
        L_0x03de:
            int r1 = r1 + 1
            goto L_0x03c7
        L_0x03e1:
            r1 = r3
        L_0x03e2:
            r3 = 0
        L_0x03e3:
            int[] r2 = r9.f11410Z0
            if (r2 != 0) goto L_0x03eb
            int[] r2 = new int[r10]
            r9.f11410Z0 = r2
        L_0x03eb:
            if (r1 != 0) goto L_0x03f0
            r2 = 1
            if (r0 == r2) goto L_0x03f4
        L_0x03f0:
            if (r3 != 0) goto L_0x03f6
            if (r0 != 0) goto L_0x03f6
        L_0x03f4:
            r2 = 1
            goto L_0x03f7
        L_0x03f6:
            r2 = 0
        L_0x03f7:
            if (r2 != 0) goto L_0x04c1
            if (r0 != 0) goto L_0x0405
            float r1 = (float) r15
            float r4 = (float) r3
            float r1 = r1 / r4
            double r4 = (double) r1
            double r4 = java.lang.Math.ceil(r4)
            int r1 = (int) r4
            goto L_0x040e
        L_0x0405:
            float r3 = (float) r15
            float r4 = (float) r1
            float r3 = r3 / r4
            double r3 = (double) r3
            double r3 = java.lang.Math.ceil(r3)
            int r3 = (int) r3
        L_0x040e:
            s.d[] r4 = r9.f11409Y0
            if (r4 == 0) goto L_0x0415
            int r5 = r4.length
            if (r5 >= r3) goto L_0x0417
        L_0x0415:
            r5 = 0
            goto L_0x041c
        L_0x0417:
            r5 = 0
            java.util.Arrays.fill(r4, r5)
            goto L_0x0420
        L_0x041c:
            s.d[] r4 = new s.d[r3]
            r9.f11409Y0 = r4
        L_0x0420:
            s.d[] r4 = r9.X0
            if (r4 == 0) goto L_0x042c
            int r6 = r4.length
            if (r6 >= r1) goto L_0x0428
            goto L_0x042c
        L_0x0428:
            java.util.Arrays.fill(r4, r5)
            goto L_0x0430
        L_0x042c:
            s.d[] r4 = new s.d[r1]
            r9.X0 = r4
        L_0x0430:
            r4 = 0
        L_0x0431:
            if (r4 >= r3) goto L_0x0476
            r5 = 0
        L_0x0434:
            if (r5 >= r1) goto L_0x0473
            int r6 = r5 * r3
            int r6 = r6 + r4
            r7 = 1
            if (r0 != r7) goto L_0x043f
            int r6 = r4 * r1
            int r6 = r6 + r5
        L_0x043f:
            int r7 = r14.length
            if (r6 < r7) goto L_0x0443
            goto L_0x0470
        L_0x0443:
            r6 = r14[r6]
            if (r6 != 0) goto L_0x0448
            goto L_0x0470
        L_0x0448:
            int r7 = r9.U(r6, r11)
            s.d[] r8 = r9.f11409Y0
            r8 = r8[r4]
            if (r8 == 0) goto L_0x0458
            int r8 = r8.q()
            if (r8 >= r7) goto L_0x045c
        L_0x0458:
            s.d[] r7 = r9.f11409Y0
            r7[r4] = r6
        L_0x045c:
            int r7 = r9.T(r6, r11)
            s.d[] r8 = r9.X0
            r8 = r8[r5]
            if (r8 == 0) goto L_0x046c
            int r8 = r8.k()
            if (r8 >= r7) goto L_0x0470
        L_0x046c:
            s.d[] r7 = r9.X0
            r7[r5] = r6
        L_0x0470:
            int r5 = r5 + 1
            goto L_0x0434
        L_0x0473:
            int r4 = r4 + 1
            goto L_0x0431
        L_0x0476:
            r4 = 0
            r5 = 0
        L_0x0478:
            if (r4 >= r3) goto L_0x048e
            s.d[] r6 = r9.f11409Y0
            r6 = r6[r4]
            if (r6 == 0) goto L_0x048b
            if (r4 <= 0) goto L_0x0485
            int r7 = r9.f11401P0
            int r5 = r5 + r7
        L_0x0485:
            int r6 = r9.U(r6, r11)
            int r6 = r6 + r5
            r5 = r6
        L_0x048b:
            int r4 = r4 + 1
            goto L_0x0478
        L_0x048e:
            r4 = 0
            r6 = 0
        L_0x0490:
            if (r4 >= r1) goto L_0x04a6
            s.d[] r7 = r9.X0
            r7 = r7[r4]
            if (r7 == 0) goto L_0x04a3
            if (r4 <= 0) goto L_0x049d
            int r8 = r9.f11402Q0
            int r6 = r6 + r8
        L_0x049d:
            int r7 = r9.T(r7, r11)
            int r7 = r7 + r6
            r6 = r7
        L_0x04a3:
            int r4 = r4 + 1
            goto L_0x0490
        L_0x04a6:
            r4 = 0
            r31[r4] = r5
            r4 = 1
            r31[r4] = r6
            if (r0 != 0) goto L_0x04b9
            if (r5 <= r11) goto L_0x04b6
            if (r3 <= r4) goto L_0x04b6
            int r3 = r3 + -1
            goto L_0x03f7
        L_0x04b6:
            r2 = r4
            goto L_0x03f7
        L_0x04b9:
            if (r6 <= r11) goto L_0x04b6
            if (r1 <= r4) goto L_0x04b6
            int r1 = r1 + -1
            goto L_0x03f7
        L_0x04c1:
            r4 = 1
            int[] r0 = r9.f11410Z0
            r2 = 0
            r0[r2] = r3
            r0[r4] = r1
            goto L_0x0130
        L_0x04cb:
            r32 = r3
            r33 = r4
            r34 = r5
            r35 = r6
            r16 = r7
            r39 = r10
            r38 = r11
            r36 = r12
            r43 = r13
            r11 = r18
            r31 = r19
            r10 = 2
            r12 = r8
            r18 = r17
            int r13 = r9.f11407V0
            if (r15 != 0) goto L_0x04eb
            goto L_0x0130
        L_0x04eb:
            r12.clear()
            s.f r8 = new s.f
            s.c r4 = r9.f11296I
            s.c r5 = r9.f11297J
            s.c r6 = r9.f11298K
            s.c r7 = r9.f11299L
            r1 = r8
            r2 = r41
            r3 = r13
            r10 = r8
            r8 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r12.add(r10)
            if (r13 != 0) goto L_0x0581
            r8 = r10
            r1 = 0
            r2 = 0
            r10 = 0
        L_0x050a:
            if (r10 >= r15) goto L_0x057b
            r7 = r14[r10]
            int r17 = r9.U(r7, r11)
            int[] r3 = r7.f11342p0
            r4 = 0
            r3 = r3[r4]
            r4 = 3
            if (r3 != r4) goto L_0x051c
            int r1 = r1 + 1
        L_0x051c:
            r19 = r1
            if (r2 == r11) goto L_0x0527
            int r1 = r9.f11401P0
            int r1 = r1 + r2
            int r1 = r1 + r17
            if (r1 <= r11) goto L_0x052d
        L_0x0527:
            s.d r1 = r8.f11374b
            if (r1 == 0) goto L_0x052d
            r1 = 1
            goto L_0x052e
        L_0x052d:
            r1 = 0
        L_0x052e:
            if (r1 != 0) goto L_0x053b
            if (r10 <= 0) goto L_0x053b
            int r3 = r9.f11406U0
            if (r3 <= 0) goto L_0x053b
            int r3 = r10 % r3
            if (r3 != 0) goto L_0x053b
            r1 = 1
        L_0x053b:
            if (r1 == 0) goto L_0x0562
            s.f r8 = new s.f
            s.c r4 = r9.f11296I
            s.c r5 = r9.f11297J
            s.c r6 = r9.f11298K
            s.c r3 = r9.f11299L
            r1 = r8
            r2 = r41
            r21 = r3
            r3 = r13
            r22 = r0
            r0 = r7
            r7 = r21
            r29 = r13
            r13 = r8
            r8 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r13.f11383n = r10
            r12.add(r13)
            r8 = r13
        L_0x055f:
            r2 = r17
            goto L_0x056f
        L_0x0562:
            r22 = r0
            r0 = r7
            r29 = r13
            if (r10 <= 0) goto L_0x055f
            int r1 = r9.f11401P0
            int r1 = r1 + r17
            int r1 = r1 + r2
            r2 = r1
        L_0x056f:
            r8.a(r0)
            int r10 = r10 + 1
            r1 = r19
            r0 = r22
            r13 = r29
            goto L_0x050a
        L_0x057b:
            r22 = r0
            r29 = r13
            goto L_0x05f6
        L_0x0581:
            r22 = r0
            r29 = r13
            r8 = r10
            r0 = 0
            r1 = 0
            r2 = 0
        L_0x0589:
            if (r0 >= r15) goto L_0x05f6
            r10 = r14[r0]
            int r13 = r9.T(r10, r11)
            int[] r3 = r10.f11342p0
            r4 = 1
            r3 = r3[r4]
            r7 = 3
            if (r3 != r7) goto L_0x059b
            int r1 = r1 + 1
        L_0x059b:
            r17 = r1
            if (r2 == r11) goto L_0x05a5
            int r1 = r9.f11402Q0
            int r1 = r1 + r2
            int r1 = r1 + r13
            if (r1 <= r11) goto L_0x05ab
        L_0x05a5:
            s.d r1 = r8.f11374b
            if (r1 == 0) goto L_0x05ab
            r1 = 1
            goto L_0x05ac
        L_0x05ab:
            r1 = 0
        L_0x05ac:
            if (r1 != 0) goto L_0x05b9
            if (r0 <= 0) goto L_0x05b9
            int r3 = r9.f11406U0
            if (r3 <= 0) goto L_0x05b9
            int r3 = r0 % r3
            if (r3 != 0) goto L_0x05b9
            r1 = 1
        L_0x05b9:
            if (r1 == 0) goto L_0x05df
            s.f r8 = new s.f
            s.c r4 = r9.f11296I
            s.c r5 = r9.f11297J
            s.c r6 = r9.f11298K
            s.c r3 = r9.f11299L
            r1 = r8
            r2 = r41
            r19 = r3
            r3 = r29
            r20 = r7
            r7 = r19
            r30 = r14
            r14 = r8
            r8 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r14.f11383n = r0
            r12.add(r14)
            r2 = r13
            r8 = r14
            goto L_0x05ec
        L_0x05df:
            r20 = r7
            r30 = r14
            if (r0 <= 0) goto L_0x05eb
            int r1 = r9.f11402Q0
            int r1 = r1 + r13
            int r1 = r1 + r2
            r2 = r1
            goto L_0x05ec
        L_0x05eb:
            r2 = r13
        L_0x05ec:
            r8.a(r10)
            int r0 = r0 + 1
            r1 = r17
            r14 = r30
            goto L_0x0589
        L_0x05f6:
            int r0 = r12.size()
            int r2 = r9.f11416w0
            int r3 = r9.s0
            int r4 = r9.f11417x0
            int r5 = r9.f11413t0
            r6 = 0
            r7 = r22[r6]
            r6 = 2
            if (r7 == r6) goto L_0x0610
            r7 = 1
            r8 = r22[r7]
            if (r8 != r6) goto L_0x060e
            goto L_0x0610
        L_0x060e:
            r6 = 0
            goto L_0x0611
        L_0x0610:
            r6 = 1
        L_0x0611:
            if (r1 <= 0) goto L_0x0636
            if (r6 == 0) goto L_0x0636
            r1 = 0
        L_0x0616:
            if (r1 >= r0) goto L_0x0636
            java.lang.Object r6 = r12.get(r1)
            s.f r6 = (s.f) r6
            if (r29 != 0) goto L_0x062a
            int r7 = r6.d()
            int r7 = r11 - r7
            r6.e(r7)
            goto L_0x0633
        L_0x062a:
            int r7 = r6.c()
            int r7 = r11 - r7
            r6.e(r7)
        L_0x0633:
            int r1 = r1 + 1
            goto L_0x0616
        L_0x0636:
            r6 = r3
            r1 = r18
            r14 = r27
            r13 = r28
            r7 = 0
            r8 = 0
            r10 = 0
            r3 = r2
            r2 = r16
        L_0x0643:
            if (r7 >= r0) goto L_0x06fa
            java.lang.Object r15 = r12.get(r7)
            s.f r15 = (s.f) r15
            if (r29 != 0) goto L_0x06a0
            int r5 = r0 + -1
            if (r7 >= r5) goto L_0x0662
            int r5 = r7 + 1
            java.lang.Object r5 = r12.get(r5)
            s.f r5 = (s.f) r5
            s.d r5 = r5.f11374b
            s.c r5 = r5.f11297J
            r13 = r5
            r37 = r12
            r5 = 0
            goto L_0x0668
        L_0x0662:
            int r5 = r9.f11413t0
            r37 = r12
            r13 = r28
        L_0x0668:
            s.d r12 = r15.f11374b
            s.c r12 = r12.f11299L
            r16 = r15
            r17 = r29
            r18 = r1
            r19 = r2
            r20 = r14
            r21 = r13
            r22 = r3
            r23 = r6
            r24 = r4
            r25 = r5
            r26 = r11
            r16.f(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            int r2 = r15.d()
            int r2 = java.lang.Math.max(r8, r2)
            int r6 = r15.c()
            int r6 = r6 + r10
            if (r7 <= 0) goto L_0x0697
            int r8 = r9.f11402Q0
            int r6 = r6 + r8
        L_0x0697:
            r42 = r0
            r8 = r2
            r10 = r6
            r2 = r12
            r12 = r37
            r6 = 0
            goto L_0x06f4
        L_0x06a0:
            r37 = r12
            int r4 = r0 + -1
            if (r7 >= r4) goto L_0x06b9
            int r4 = r7 + 1
            r12 = r37
            java.lang.Object r4 = r12.get(r4)
            s.f r4 = (s.f) r4
            s.d r4 = r4.f11374b
            s.c r4 = r4.f11296I
            r42 = r0
            r14 = r4
            r4 = 0
            goto L_0x06c1
        L_0x06b9:
            r12 = r37
            int r4 = r9.f11417x0
            r42 = r0
            r14 = r27
        L_0x06c1:
            s.d r0 = r15.f11374b
            s.c r0 = r0.f11298K
            r16 = r15
            r17 = r29
            r18 = r1
            r19 = r2
            r20 = r14
            r21 = r13
            r22 = r3
            r23 = r6
            r24 = r4
            r25 = r5
            r26 = r11
            r16.f(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            int r1 = r15.d()
            int r1 = r1 + r8
            int r3 = r15.c()
            int r3 = java.lang.Math.max(r10, r3)
            if (r7 <= 0) goto L_0x06f0
            int r8 = r9.f11401P0
            int r1 = r1 + r8
        L_0x06f0:
            r8 = r1
            r10 = r3
            r3 = 0
            r1 = r0
        L_0x06f4:
            int r7 = r7 + 1
            r0 = r42
            goto L_0x0643
        L_0x06fa:
            r0 = 0
            r31[r0] = r8
            r0 = 1
            r31[r0] = r10
            goto L_0x0130
        L_0x0702:
            r32 = r3
            r33 = r4
            r34 = r5
            r35 = r6
            r39 = r10
            r38 = r11
            r36 = r12
            r43 = r13
            r30 = r14
            r11 = r18
            r31 = r19
            r12 = r8
            int r0 = r9.f11407V0
            if (r15 != 0) goto L_0x071f
            goto L_0x0130
        L_0x071f:
            int r1 = r12.size()
            if (r1 != 0) goto L_0x073b
            s.f r10 = new s.f
            s.c r4 = r9.f11296I
            s.c r5 = r9.f11297J
            s.c r6 = r9.f11298K
            s.c r7 = r9.f11299L
            r1 = r10
            r2 = r41
            r3 = r0
            r8 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r12.add(r10)
            goto L_0x077b
        L_0x073b:
            r1 = 0
            java.lang.Object r2 = r12.get(r1)
            r10 = r2
            s.f r10 = (s.f) r10
            r10.f11375c = r1
            r2 = 0
            r10.f11374b = r2
            r10.f11381l = r1
            r10.f11382m = r1
            r10.f11383n = r1
            r10.f11384o = r1
            r10.f11385p = r1
            int r1 = r9.f11416w0
            int r2 = r9.s0
            int r3 = r9.f11417x0
            int r4 = r9.f11413t0
            s.c r5 = r9.f11298K
            s.c r6 = r9.f11299L
            s.c r7 = r9.f11296I
            s.c r8 = r9.f11297J
            r16 = r10
            r17 = r0
            r18 = r7
            r19 = r8
            r20 = r5
            r21 = r6
            r22 = r1
            r23 = r2
            r24 = r3
            r25 = r4
            r26 = r11
            r16.f(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
        L_0x077b:
            r0 = 0
        L_0x077c:
            if (r0 >= r15) goto L_0x0786
            r1 = r30[r0]
            r10.a(r1)
            int r0 = r0 + 1
            goto L_0x077c
        L_0x0786:
            int r0 = r10.d()
            r1 = 0
            r31[r1] = r0
            int r0 = r10.c()
            r2 = 1
            r31[r2] = r0
        L_0x0794:
            r0 = r31[r1]
            int r0 = r0 + r35
            int r0 = r0 + r34
            r1 = r31[r2]
            int r1 = r1 + r33
            int r1 = r1 + r32
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = r39
            if (r5 != r4) goto L_0x07ad
            r0 = r36
            r11 = r38
            goto L_0x07bf
        L_0x07ad:
            if (r5 != r3) goto L_0x07b8
            r6 = r38
            int r11 = java.lang.Math.min(r0, r6)
        L_0x07b5:
            r0 = r36
            goto L_0x07bf
        L_0x07b8:
            if (r5 != 0) goto L_0x07bc
            r11 = r0
            goto L_0x07b5
        L_0x07bc:
            r0 = r36
            r11 = 0
        L_0x07bf:
            if (r0 != r4) goto L_0x07c4
            r13 = r43
            goto L_0x07d2
        L_0x07c4:
            if (r0 != r3) goto L_0x07cd
            r3 = r43
            int r13 = java.lang.Math.min(r1, r3)
            goto L_0x07d2
        L_0x07cd:
            if (r0 != 0) goto L_0x07d1
            r13 = r1
            goto L_0x07d2
        L_0x07d1:
            r13 = 0
        L_0x07d2:
            r9.f11419z0 = r11
            r9.f11388A0 = r13
            r9.O(r11)
            r9.L(r13)
            int r0 = r9.f11426r0
            if (r0 <= 0) goto L_0x07e2
            r14 = r2
            goto L_0x07e3
        L_0x07e2:
            r14 = 0
        L_0x07e3:
            r9.f11418y0 = r14
        L_0x07e5:
            int r0 = r9.f11419z0
            int r1 = r9.f11388A0
            r2 = r40
            r2.setMeasuredDimension(r0, r1)
            goto L_0x07f4
        L_0x07ef:
            r2 = r0
            r0 = r14
            r2.setMeasuredDimension(r0, r0)
        L_0x07f4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.helper.widget.Flow.j(s.g, int, int):void");
    }

    public final void onMeasure(int i2, int i5) {
        j(this.f4836s, i2, i5);
    }

    public void setFirstHorizontalBias(float f6) {
        this.f4836s.L0 = f6;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i2) {
        this.f4836s.f11393F0 = i2;
        requestLayout();
    }

    public void setFirstVerticalBias(float f6) {
        this.f4836s.f11399M0 = f6;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i2) {
        this.f4836s.f11394G0 = i2;
        requestLayout();
    }

    public void setHorizontalAlign(int i2) {
        this.f4836s.f11403R0 = i2;
        requestLayout();
    }

    public void setHorizontalBias(float f6) {
        this.f4836s.f11397J0 = f6;
        requestLayout();
    }

    public void setHorizontalGap(int i2) {
        this.f4836s.f11401P0 = i2;
        requestLayout();
    }

    public void setHorizontalStyle(int i2) {
        this.f4836s.f11391D0 = i2;
        requestLayout();
    }

    public void setLastHorizontalBias(float f6) {
        this.f4836s.f11400N0 = f6;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i2) {
        this.f4836s.f11395H0 = i2;
        requestLayout();
    }

    public void setLastVerticalBias(float f6) {
        this.f4836s.O0 = f6;
        requestLayout();
    }

    public void setLastVerticalStyle(int i2) {
        this.f4836s.f11396I0 = i2;
        requestLayout();
    }

    public void setMaxElementsWrap(int i2) {
        this.f4836s.f11406U0 = i2;
        requestLayout();
    }

    public void setOrientation(int i2) {
        this.f4836s.f11407V0 = i2;
        requestLayout();
    }

    public void setPadding(int i2) {
        g gVar = this.f4836s;
        gVar.s0 = i2;
        gVar.f11413t0 = i2;
        gVar.f11414u0 = i2;
        gVar.f11415v0 = i2;
        requestLayout();
    }

    public void setPaddingBottom(int i2) {
        this.f4836s.f11413t0 = i2;
        requestLayout();
    }

    public void setPaddingLeft(int i2) {
        this.f4836s.f11416w0 = i2;
        requestLayout();
    }

    public void setPaddingRight(int i2) {
        this.f4836s.f11417x0 = i2;
        requestLayout();
    }

    public void setPaddingTop(int i2) {
        this.f4836s.s0 = i2;
        requestLayout();
    }

    public void setVerticalAlign(int i2) {
        this.f4836s.f11404S0 = i2;
        requestLayout();
    }

    public void setVerticalBias(float f6) {
        this.f4836s.f11398K0 = f6;
        requestLayout();
    }

    public void setVerticalGap(int i2) {
        this.f4836s.f11402Q0 = i2;
        requestLayout();
    }

    public void setVerticalStyle(int i2) {
        this.f4836s.f11392E0 = i2;
        requestLayout();
    }

    public void setWrapMode(int i2) {
        this.f4836s.f11405T0 = i2;
        requestLayout();
    }
}
