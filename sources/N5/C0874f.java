package n5;

import I1.b;
import com.bumptech.glide.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.j;
import x5.l;

/* renamed from: n5.f  reason: case insensitive filesystem */
public abstract class C0874f extends d {
    public static List A1(Object[] objArr) {
        j.e(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            return C0883o.f10398a;
        }
        if (length != 1) {
            return new ArrayList(new C0872d(objArr));
        }
        return b.t0(objArr[0]);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0028 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean t1(java.lang.Object[] r4, java.lang.Object r5) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.j.e(r4, r0)
            r0 = 0
            if (r5 != 0) goto L_0x0014
            int r5 = r4.length
            r1 = r0
        L_0x000a:
            if (r1 >= r5) goto L_0x0025
            r2 = r4[r1]
            if (r2 != 0) goto L_0x0011
            goto L_0x0026
        L_0x0011:
            int r1 = r1 + 1
            goto L_0x000a
        L_0x0014:
            int r1 = r4.length
            r2 = r0
        L_0x0016:
            if (r2 >= r1) goto L_0x0025
            r3 = r4[r2]
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x0022
            r1 = r2
            goto L_0x0026
        L_0x0022:
            int r2 = r2 + 1
            goto L_0x0016
        L_0x0025:
            r1 = -1
        L_0x0026:
            if (r1 < 0) goto L_0x0029
            r0 = 1
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.C0874f.t1(java.lang.Object[], java.lang.Object):boolean");
    }

    public static void u1(int i2, int i5, int i6, int[] iArr, int[] iArr2) {
        j.e(iArr, "<this>");
        j.e(iArr2, "destination");
        System.arraycopy(iArr, i5, iArr2, i2, i6 - i5);
    }

    public static void v1(Object[] objArr, int i2, Object[] objArr2, int i5, int i6) {
        j.e(objArr, "<this>");
        j.e(objArr2, "destination");
        System.arraycopy(objArr, i5, objArr2, i2, i6 - i5);
    }

    public static /* synthetic */ void w1(Object[] objArr, int i2, Object[] objArr2, int i5, int i6) {
        if ((i6 & 4) != 0) {
            i2 = 0;
        }
        v1(objArr, 0, objArr2, i2, i5);
    }

    public static final void x1(Object[] objArr, int i2, int i5) {
        j.e(objArr, "<this>");
        Arrays.fill(objArr, i2, i5, (Object) null);
    }

    public static String y1(Object[] objArr) {
        j.e(objArr, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int i2 = 0;
        for (Object obj : objArr) {
            i2++;
            if (i2 > 1) {
                sb.append(",");
            }
            b.i(sb, obj, (l) null);
        }
        sb.append("]");
        String sb2 = sb.toString();
        j.d(sb2, "toString(...)");
        return sb2;
    }

    public static List z1(long[] jArr) {
        j.e(jArr, "<this>");
        int length = jArr.length;
        if (length == 0) {
            return C0883o.f10398a;
        }
        if (length == 1) {
            return b.t0(Long.valueOf(jArr[0]));
        }
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long valueOf : jArr) {
            arrayList.add(Long.valueOf(valueOf));
        }
        return arrayList;
    }
}
