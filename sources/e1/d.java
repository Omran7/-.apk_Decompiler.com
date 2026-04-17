package E1;

import D1.c;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class d extends c {
    public static final Parcelable.Creator<d> CREATOR = new c(6);

    /* renamed from: a  reason: collision with root package name */
    public final int f597a;

    /* renamed from: b  reason: collision with root package name */
    public final Parcel f598b;

    /* renamed from: c  reason: collision with root package name */
    public final int f599c = 2;
    public final h d;

    /* renamed from: e  reason: collision with root package name */
    public final String f600e;

    /* renamed from: f  reason: collision with root package name */
    public int f601f;

    /* renamed from: p  reason: collision with root package name */
    public int f602p;

    public d(int i2, Parcel parcel, h hVar) {
        String str;
        this.f597a = i2;
        I.g(parcel);
        this.f598b = parcel;
        this.d = hVar;
        if (hVar == null) {
            str = null;
        } else {
            str = hVar.f611c;
        }
        this.f600e = str;
        this.f601f = 2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: android.os.Parcel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v9, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v11, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v15, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v13, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v16, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v15, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v17, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v17, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v18, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v21, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v25, resolved type: android.os.Parcel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: android.os.Parcel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v23, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r12v0 */
    /* JADX WARNING: type inference failed for: r12v22 */
    /* JADX WARNING: type inference failed for: r12v25 */
    /* JADX WARNING: type inference failed for: r12v26 */
    /* JADX WARNING: type inference failed for: r12v27 */
    /* JADX WARNING: type inference failed for: r12v28 */
    /* JADX WARNING: type inference failed for: r12v29 */
    /* JADX WARNING: type inference failed for: r12v30 */
    /* JADX WARNING: type inference failed for: r12v31 */
    /* JADX WARNING: type inference failed for: r12v32 */
    /* JADX WARNING: type inference failed for: r12v33 */
    /* JADX WARNING: type inference failed for: r12v34 */
    /* JADX WARNING: type inference failed for: r12v35 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=boolean[], code=?, for r12v19, types: [boolean[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void e(java.lang.StringBuilder r16, java.util.Map r17, android.os.Parcel r18) {
        /*
            r0 = r16
            r1 = r18
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            java.util.Set r3 = r17.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x0011:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0029
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getValue()
            E1.a r5 = (E1.a) r5
            int r5 = r5.f592p
            r2.put(r5, r4)
            goto L_0x0011
        L_0x0029:
            r3 = 123(0x7b, float:1.72E-43)
            r0.append(r3)
            int r3 = R2.b.c1(r18)
            r5 = 0
        L_0x0033:
            int r6 = r18.dataPosition()
            if (r6 >= r3) goto L_0x043f
            int r6 = r18.readInt()
            char r7 = (char) r6
            java.lang.Object r7 = r2.get(r7)
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            if (r7 == 0) goto L_0x0033
            java.lang.String r8 = ","
            if (r5 == 0) goto L_0x004d
            r0.append(r8)
        L_0x004d:
            java.lang.Object r5 = r7.getKey()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r7 = r7.getValue()
            E1.a r7 = (E1.a) r7
            java.lang.String r9 = "\""
            r0.append(r9)
            r0.append(r5)
            java.lang.String r5 = "\":"
            r0.append(r5)
            D1.a r5 = r7.f596t
            r10 = 4
            r11 = 8
            r12 = 0
            int r14 = r7.d
            if (r5 == 0) goto L_0x0155
            switch(r14) {
                case 0: goto L_0x0144;
                case 1: goto L_0x0123;
                case 2: goto L_0x0113;
                case 3: goto L_0x0100;
                case 4: goto L_0x00ed;
                case 5: goto L_0x00e1;
                case 6: goto L_0x00d1;
                case 7: goto L_0x00c5;
                case 8: goto L_0x00b9;
                case 9: goto L_0x00b9;
                case 10: goto L_0x0087;
                case 11: goto L_0x007f;
                default: goto L_0x0073;
            }
        L_0x0073:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unknown field out type = "
            java.lang.String r1 = com.google.android.gms.internal.measurement.a.f(r14, r1)
            r0.<init>(r1)
            throw r0
        L_0x007f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Method does not accept concrete type."
            r0.<init>(r1)
            throw r0
        L_0x0087:
            android.os.Bundle r5 = R2.b.n(r6, r1)
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            java.util.Set r8 = r5.keySet()
            java.util.Iterator r8 = r8.iterator()
        L_0x0098:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x00af
            java.lang.Object r9 = r8.next()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r10 = r5.getString(r9)
            com.google.android.gms.common.internal.I.g(r10)
            r6.put(r9, r10)
            goto L_0x0098
        L_0x00af:
            java.lang.Object r5 = E1.b.zaD(r7, r6)
            g(r0, r7, r5)
        L_0x00b6:
            r5 = 1
            goto L_0x0033
        L_0x00b9:
            byte[] r5 = R2.b.o(r6, r1)
            java.lang.Object r5 = E1.b.zaD(r7, r5)
            g(r0, r7, r5)
            goto L_0x00b6
        L_0x00c5:
            java.lang.String r5 = R2.b.r(r6, r1)
            java.lang.Object r5 = E1.b.zaD(r7, r5)
            g(r0, r7, r5)
            goto L_0x00b6
        L_0x00d1:
            boolean r5 = R2.b.w0(r6, r1)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            java.lang.Object r5 = E1.b.zaD(r7, r5)
            g(r0, r7, r5)
            goto L_0x00b6
        L_0x00e1:
            java.math.BigDecimal r5 = R2.b.m(r6, r1)
            java.lang.Object r5 = E1.b.zaD(r7, r5)
            g(r0, r7, r5)
            goto L_0x00b6
        L_0x00ed:
            R2.b.f1(r1, r6, r11)
            double r5 = r18.readDouble()
            java.lang.Double r5 = java.lang.Double.valueOf(r5)
            java.lang.Object r5 = E1.b.zaD(r7, r5)
            g(r0, r7, r5)
            goto L_0x00b6
        L_0x0100:
            R2.b.f1(r1, r6, r10)
            float r5 = r18.readFloat()
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            java.lang.Object r5 = E1.b.zaD(r7, r5)
            g(r0, r7, r5)
            goto L_0x00b6
        L_0x0113:
            long r5 = R2.b.C0(r6, r1)
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.lang.Object r5 = E1.b.zaD(r7, r5)
            g(r0, r7, r5)
            goto L_0x00b6
        L_0x0123:
            int r5 = R2.b.E0(r6, r1)
            int r6 = r18.dataPosition()
            if (r5 != 0) goto L_0x012e
            goto L_0x013b
        L_0x012e:
            byte[] r8 = r18.createByteArray()
            int r6 = r6 + r5
            r1.setDataPosition(r6)
            java.math.BigInteger r12 = new java.math.BigInteger
            r12.<init>(r8)
        L_0x013b:
            java.lang.Object r5 = E1.b.zaD(r7, r12)
            g(r0, r7, r5)
            goto L_0x00b6
        L_0x0144:
            int r5 = R2.b.A0(r6, r1)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object r5 = E1.b.zaD(r7, r5)
            g(r0, r7, r5)
            goto L_0x00b6
        L_0x0155:
            boolean r5 = r7.f590e
            java.lang.String r15 = r7.f594r
            if (r5 == 0) goto L_0x0315
            java.lang.String r5 = "["
            r0.append(r5)
            switch(r14) {
                case 0: goto L_0x02f9;
                case 1: goto L_0x02c2;
                case 2: goto L_0x029e;
                case 3: goto L_0x027a;
                case 4: goto L_0x0256;
                case 5: goto L_0x0216;
                case 6: goto L_0x01f2;
                case 7: goto L_0x01d7;
                case 8: goto L_0x01cf;
                case 9: goto L_0x01cf;
                case 10: goto L_0x01cf;
                case 11: goto L_0x016b;
                default: goto L_0x0163;
            }
        L_0x0163:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Unknown field type out."
            r0.<init>(r1)
            throw r0
        L_0x016b:
            int r5 = R2.b.E0(r6, r1)
            int r6 = r18.dataPosition()
            if (r5 != 0) goto L_0x0176
            goto L_0x01a1
        L_0x0176:
            int r9 = r18.readInt()
            android.os.Parcel[] r10 = new android.os.Parcel[r9]
            r11 = 0
        L_0x017d:
            if (r11 >= r9) goto L_0x019c
            int r14 = r18.readInt()
            if (r14 == 0) goto L_0x0197
            int r13 = r18.dataPosition()
            android.os.Parcel r4 = android.os.Parcel.obtain()
            r4.appendFrom(r1, r13, r14)
            r10[r11] = r4
            int r13 = r13 + r14
            r1.setDataPosition(r13)
            goto L_0x0199
        L_0x0197:
            r10[r11] = r12
        L_0x0199:
            int r11 = r11 + 1
            goto L_0x017d
        L_0x019c:
            int r6 = r6 + r5
            r1.setDataPosition(r6)
            r12 = r10
        L_0x01a1:
            int r4 = r12.length
            r5 = 0
        L_0x01a3:
            if (r5 >= r4) goto L_0x030e
            if (r5 <= 0) goto L_0x01aa
            r0.append(r8)
        L_0x01aa:
            r6 = r12[r5]
            r9 = 0
            r6.setDataPosition(r9)
            com.google.android.gms.common.internal.I.g(r15)
            E1.h r6 = r7.f595s
            com.google.android.gms.common.internal.I.g(r6)
            E1.h r6 = r7.f595s
            java.util.HashMap r6 = r6.f610b
            java.lang.Object r6 = r6.get(r15)
            java.util.Map r6 = (java.util.Map) r6
            com.google.android.gms.common.internal.I.g(r6)
            java.util.Map r6 = (java.util.Map) r6
            r9 = r12[r5]
            e(r0, r6, r9)
            int r5 = r5 + 1
            goto L_0x01a3
        L_0x01cf:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported"
            r0.<init>(r1)
            throw r0
        L_0x01d7:
            java.lang.String[] r4 = R2.b.s(r6, r1)
            int r5 = r4.length
            r6 = 0
        L_0x01dd:
            if (r6 >= r5) goto L_0x030e
            if (r6 == 0) goto L_0x01e4
            r0.append(r8)
        L_0x01e4:
            r0.append(r9)
            r7 = r4[r6]
            r0.append(r7)
            r0.append(r9)
            int r6 = r6 + 1
            goto L_0x01dd
        L_0x01f2:
            int r4 = R2.b.E0(r6, r1)
            int r5 = r18.dataPosition()
            if (r4 != 0) goto L_0x01fd
            goto L_0x0205
        L_0x01fd:
            boolean[] r12 = r18.createBooleanArray()
            int r5 = r5 + r4
            r1.setDataPosition(r5)
        L_0x0205:
            int r4 = r12.length
            r5 = 0
        L_0x0207:
            if (r5 >= r4) goto L_0x030e
            if (r5 == 0) goto L_0x020e
            r0.append(r8)
        L_0x020e:
            boolean r6 = r12[r5]
            r0.append(r6)
            int r5 = r5 + 1
            goto L_0x0207
        L_0x0216:
            int r4 = R2.b.E0(r6, r1)
            int r5 = r18.dataPosition()
            if (r4 != 0) goto L_0x0221
            goto L_0x0245
        L_0x0221:
            int r6 = r18.readInt()
            java.math.BigDecimal[] r12 = new java.math.BigDecimal[r6]
            r7 = 0
        L_0x0228:
            if (r7 >= r6) goto L_0x0241
            byte[] r9 = r18.createByteArray()
            int r10 = r18.readInt()
            java.math.BigDecimal r11 = new java.math.BigDecimal
            java.math.BigInteger r13 = new java.math.BigInteger
            r13.<init>(r9)
            r11.<init>(r13, r10)
            r12[r7] = r11
            int r7 = r7 + 1
            goto L_0x0228
        L_0x0241:
            int r5 = r5 + r4
            r1.setDataPosition(r5)
        L_0x0245:
            int r4 = r12.length
            r5 = 0
        L_0x0247:
            if (r5 >= r4) goto L_0x030e
            if (r5 == 0) goto L_0x024e
            r0.append(r8)
        L_0x024e:
            r6 = r12[r5]
            r0.append(r6)
            int r5 = r5 + 1
            goto L_0x0247
        L_0x0256:
            int r4 = R2.b.E0(r6, r1)
            int r5 = r18.dataPosition()
            if (r4 != 0) goto L_0x0261
            goto L_0x0269
        L_0x0261:
            double[] r12 = r18.createDoubleArray()
            int r5 = r5 + r4
            r1.setDataPosition(r5)
        L_0x0269:
            int r4 = r12.length
            r5 = 0
        L_0x026b:
            if (r5 >= r4) goto L_0x030e
            if (r5 == 0) goto L_0x0272
            r0.append(r8)
        L_0x0272:
            r6 = r12[r5]
            r0.append(r6)
            int r5 = r5 + 1
            goto L_0x026b
        L_0x027a:
            int r4 = R2.b.E0(r6, r1)
            int r5 = r18.dataPosition()
            if (r4 != 0) goto L_0x0285
            goto L_0x028d
        L_0x0285:
            float[] r12 = r18.createFloatArray()
            int r5 = r5 + r4
            r1.setDataPosition(r5)
        L_0x028d:
            int r4 = r12.length
            r5 = 0
        L_0x028f:
            if (r5 >= r4) goto L_0x030e
            if (r5 == 0) goto L_0x0296
            r0.append(r8)
        L_0x0296:
            r6 = r12[r5]
            r0.append(r6)
            int r5 = r5 + 1
            goto L_0x028f
        L_0x029e:
            int r4 = R2.b.E0(r6, r1)
            int r5 = r18.dataPosition()
            if (r4 != 0) goto L_0x02a9
            goto L_0x02b1
        L_0x02a9:
            long[] r12 = r18.createLongArray()
            int r5 = r5 + r4
            r1.setDataPosition(r5)
        L_0x02b1:
            int r4 = r12.length
            r5 = 0
        L_0x02b3:
            if (r5 >= r4) goto L_0x030e
            if (r5 == 0) goto L_0x02ba
            r0.append(r8)
        L_0x02ba:
            r6 = r12[r5]
            r0.append(r6)
            int r5 = r5 + 1
            goto L_0x02b3
        L_0x02c2:
            int r4 = R2.b.E0(r6, r1)
            int r5 = r18.dataPosition()
            if (r4 != 0) goto L_0x02cd
            goto L_0x02e8
        L_0x02cd:
            int r6 = r18.readInt()
            java.math.BigInteger[] r12 = new java.math.BigInteger[r6]
            r7 = 0
        L_0x02d4:
            if (r7 >= r6) goto L_0x02e4
            java.math.BigInteger r9 = new java.math.BigInteger
            byte[] r10 = r18.createByteArray()
            r9.<init>(r10)
            r12[r7] = r9
            int r7 = r7 + 1
            goto L_0x02d4
        L_0x02e4:
            int r5 = r5 + r4
            r1.setDataPosition(r5)
        L_0x02e8:
            int r4 = r12.length
            r5 = 0
        L_0x02ea:
            if (r5 >= r4) goto L_0x030e
            if (r5 == 0) goto L_0x02f1
            r0.append(r8)
        L_0x02f1:
            r6 = r12[r5]
            r0.append(r6)
            int r5 = r5 + 1
            goto L_0x02ea
        L_0x02f9:
            int[] r4 = R2.b.p(r6, r1)
            int r5 = r4.length
            r6 = 0
        L_0x02ff:
            if (r6 >= r5) goto L_0x030e
            if (r6 == 0) goto L_0x0306
            r0.append(r8)
        L_0x0306:
            r7 = r4[r6]
            r0.append(r7)
            int r6 = r6 + 1
            goto L_0x02ff
        L_0x030e:
            java.lang.String r4 = "]"
            r0.append(r4)
            goto L_0x00b6
        L_0x0315:
            switch(r14) {
                case 0: goto L_0x0435;
                case 1: goto L_0x0417;
                case 2: goto L_0x040d;
                case 3: goto L_0x0400;
                case 4: goto L_0x03f3;
                case 5: goto L_0x03e9;
                case 6: goto L_0x03df;
                case 7: goto L_0x03cb;
                case 8: goto L_0x03b4;
                case 9: goto L_0x039c;
                case 10: goto L_0x0357;
                case 11: goto L_0x0320;
                default: goto L_0x0318;
            }
        L_0x0318:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Unknown field type out"
            r0.<init>(r1)
            throw r0
        L_0x0320:
            int r4 = R2.b.E0(r6, r1)
            int r5 = r18.dataPosition()
            if (r4 != 0) goto L_0x032c
        L_0x032a:
            r4 = 0
            goto L_0x0338
        L_0x032c:
            android.os.Parcel r12 = android.os.Parcel.obtain()
            r12.appendFrom(r1, r5, r4)
            int r5 = r5 + r4
            r1.setDataPosition(r5)
            goto L_0x032a
        L_0x0338:
            r12.setDataPosition(r4)
            com.google.android.gms.common.internal.I.g(r15)
            E1.h r4 = r7.f595s
            com.google.android.gms.common.internal.I.g(r4)
            E1.h r4 = r7.f595s
            java.util.HashMap r4 = r4.f610b
            java.lang.Object r4 = r4.get(r15)
            java.util.Map r4 = (java.util.Map) r4
            com.google.android.gms.common.internal.I.g(r4)
            java.util.Map r4 = (java.util.Map) r4
            e(r0, r4, r12)
            goto L_0x00b6
        L_0x0357:
            android.os.Bundle r4 = R2.b.n(r6, r1)
            java.util.Set r5 = r4.keySet()
            java.lang.String r6 = "{"
            r0.append(r6)
            java.util.Iterator r5 = r5.iterator()
            r6 = 1
        L_0x0369:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x0395
            java.lang.Object r7 = r5.next()
            java.lang.String r7 = (java.lang.String) r7
            if (r6 != 0) goto L_0x037a
            r0.append(r8)
        L_0x037a:
            r0.append(r9)
            r0.append(r7)
            java.lang.String r6 = "\":\""
            r0.append(r6)
            java.lang.String r6 = r4.getString(r7)
            java.lang.String r6 = G1.d.a(r6)
            r0.append(r6)
            r0.append(r9)
            r6 = 0
            goto L_0x0369
        L_0x0395:
            java.lang.String r4 = "}"
            r0.append(r4)
            goto L_0x00b6
        L_0x039c:
            byte[] r4 = R2.b.o(r6, r1)
            r0.append(r9)
            if (r4 != 0) goto L_0x03a6
            goto L_0x03ac
        L_0x03a6:
            r5 = 10
            java.lang.String r12 = android.util.Base64.encodeToString(r4, r5)
        L_0x03ac:
            r0.append(r12)
            r0.append(r9)
            goto L_0x00b6
        L_0x03b4:
            byte[] r4 = R2.b.o(r6, r1)
            r0.append(r9)
            r7 = 0
            if (r4 != 0) goto L_0x03bf
            goto L_0x03c3
        L_0x03bf:
            java.lang.String r12 = android.util.Base64.encodeToString(r4, r7)
        L_0x03c3:
            r0.append(r12)
            r0.append(r9)
            goto L_0x00b6
        L_0x03cb:
            r7 = 0
            java.lang.String r4 = R2.b.r(r6, r1)
            r0.append(r9)
            java.lang.String r4 = G1.d.a(r4)
            r0.append(r4)
            r0.append(r9)
            goto L_0x00b6
        L_0x03df:
            r7 = 0
            boolean r4 = R2.b.w0(r6, r1)
            r0.append(r4)
            goto L_0x00b6
        L_0x03e9:
            r7 = 0
            java.math.BigDecimal r4 = R2.b.m(r6, r1)
            r0.append(r4)
            goto L_0x00b6
        L_0x03f3:
            r7 = 0
            R2.b.f1(r1, r6, r11)
            double r4 = r18.readDouble()
            r0.append(r4)
            goto L_0x00b6
        L_0x0400:
            r7 = 0
            R2.b.f1(r1, r6, r10)
            float r4 = r18.readFloat()
            r0.append(r4)
            goto L_0x00b6
        L_0x040d:
            r7 = 0
            long r4 = R2.b.C0(r6, r1)
            r0.append(r4)
            goto L_0x00b6
        L_0x0417:
            r7 = 0
            int r4 = R2.b.E0(r6, r1)
            int r5 = r18.dataPosition()
            if (r4 != 0) goto L_0x0423
            goto L_0x0430
        L_0x0423:
            byte[] r6 = r18.createByteArray()
            int r5 = r5 + r4
            r1.setDataPosition(r5)
            java.math.BigInteger r12 = new java.math.BigInteger
            r12.<init>(r6)
        L_0x0430:
            r0.append(r12)
            goto L_0x00b6
        L_0x0435:
            r7 = 0
            int r4 = R2.b.A0(r6, r1)
            r0.append(r4)
            goto L_0x00b6
        L_0x043f:
            int r2 = r18.dataPosition()
            if (r2 != r3) goto L_0x044b
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            return
        L_0x044b:
            A1.b r0 = new A1.b
            java.lang.String r2 = "Overread allowed size end="
            java.lang.String r2 = com.google.android.gms.internal.measurement.a.f(r3, r2)
            r0.<init>(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: E1.d.e(java.lang.StringBuilder, java.util.Map, android.os.Parcel):void");
    }

    public static final void f(StringBuilder sb, int i2, Object obj) {
        String str = null;
        switch (i2) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case zzaky.zzf.zzf /*6*/:
                sb.append(obj);
                return;
            case zzaky.zzf.zzg /*7*/:
                sb.append("\"");
                I.g(obj);
                sb.append(G1.d.a(obj.toString()));
                sb.append("\"");
                return;
            case 8:
                sb.append("\"");
                byte[] bArr = (byte[]) obj;
                if (bArr != null) {
                    str = Base64.encodeToString(bArr, 0);
                }
                sb.append(str);
                sb.append("\"");
                return;
            case 9:
                sb.append("\"");
                byte[] bArr2 = (byte[]) obj;
                if (bArr2 != null) {
                    str = Base64.encodeToString(bArr2, 10);
                }
                sb.append(str);
                sb.append("\"");
                return;
            case 10:
                I.g(obj);
                G1.c.h(sb, (HashMap) obj);
                return;
            case ModuleDescriptor.MODULE_VERSION /*11*/:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                throw new IllegalArgumentException(a.f(i2, "Unknown type = "));
        }
    }

    public static final void g(StringBuilder sb, a aVar, Object obj) {
        boolean z3 = aVar.f589c;
        int i2 = aVar.f588b;
        if (z3) {
            ArrayList arrayList = (ArrayList) obj;
            sb.append("[");
            int size = arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                if (i5 != 0) {
                    sb.append(",");
                }
                f(sb, i2, arrayList.get(i5));
            }
            sb.append("]");
            return;
        }
        f(sb, i2, obj);
    }

    public final void addConcreteTypeArrayInternal(a aVar, String str, ArrayList arrayList) {
        d(aVar);
        ArrayList arrayList2 = new ArrayList();
        I.g(arrayList);
        arrayList.size();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList2.add(((d) ((b) arrayList.get(i2))).c());
        }
        int i5 = aVar.f592p;
        Parcel parcel = this.f598b;
        int W02 = android.support.v4.media.session.a.W0(i5, parcel);
        int size2 = arrayList2.size();
        parcel.writeInt(size2);
        for (int i6 = 0; i6 < size2; i6++) {
            Parcel parcel2 = (Parcel) arrayList2.get(i6);
            if (parcel2 != null) {
                parcel.writeInt(parcel2.dataSize());
                parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        android.support.v4.media.session.a.X0(W02, parcel);
    }

    public final void addConcreteTypeInternal(a aVar, String str, b bVar) {
        d(aVar);
        Parcel c3 = ((d) bVar).c();
        Parcel parcel = this.f598b;
        int i2 = aVar.f592p;
        if (c3 == null) {
            android.support.v4.media.session.a.Y0(parcel, i2, 0);
            return;
        }
        int W02 = android.support.v4.media.session.a.W0(i2, parcel);
        parcel.appendFrom(c3, 0, c3.dataSize());
        android.support.v4.media.session.a.X0(W02, parcel);
    }

    public final Parcel c() {
        int i2 = this.f601f;
        Parcel parcel = this.f598b;
        if (i2 == 0) {
            int W02 = android.support.v4.media.session.a.W0(20293, parcel);
            this.f602p = W02;
            android.support.v4.media.session.a.X0(W02, parcel);
            this.f601f = 2;
        } else if (i2 == 1) {
            android.support.v4.media.session.a.X0(this.f602p, parcel);
            this.f601f = 2;
        }
        return parcel;
    }

    public final void d(a aVar) {
        if (aVar.f592p != -1) {
            Parcel parcel = this.f598b;
            if (parcel != null) {
                int i2 = this.f601f;
                if (i2 == 0) {
                    this.f602p = android.support.v4.media.session.a.W0(20293, parcel);
                    this.f601f = 1;
                } else if (i2 != 1) {
                    throw new IllegalStateException("Attempted to parse JSON with a SafeParcelResponse object that is already filled with data.");
                }
            } else {
                throw new IllegalStateException("Internal Parcel object is null.");
            }
        } else {
            throw new IllegalStateException("Field does not have a valid safe parcelable field id.");
        }
    }

    public final Map getFieldMappings() {
        h hVar = this.d;
        if (hVar == null) {
            return null;
        }
        String str = this.f600e;
        I.g(str);
        return (Map) hVar.f610b.get(str);
    }

    public final Object getValueObject(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    public final boolean isPrimitiveFieldSet(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    public final void setBooleanInternal(a aVar, String str, boolean z3) {
        d(aVar);
        Parcel parcel = this.f598b;
        android.support.v4.media.session.a.Y0(parcel, aVar.f592p, 4);
        parcel.writeInt(z3 ? 1 : 0);
    }

    public final void setDecodedBytesInternal(a aVar, String str, byte[] bArr) {
        d(aVar);
        android.support.v4.media.session.a.K0(this.f598b, aVar.f592p, bArr, true);
    }

    public final void setIntegerInternal(a aVar, String str, int i2) {
        d(aVar);
        Parcel parcel = this.f598b;
        android.support.v4.media.session.a.Y0(parcel, aVar.f592p, 4);
        parcel.writeInt(i2);
    }

    public final void setLongInternal(a aVar, String str, long j6) {
        d(aVar);
        Parcel parcel = this.f598b;
        android.support.v4.media.session.a.Y0(parcel, aVar.f592p, 8);
        parcel.writeLong(j6);
    }

    public final void setStringInternal(a aVar, String str, String str2) {
        d(aVar);
        android.support.v4.media.session.a.R0(this.f598b, aVar.f592p, str2, true);
    }

    public final void setStringMapInternal(a aVar, String str, Map map) {
        d(aVar);
        Bundle bundle = new Bundle();
        I.g(map);
        for (String str2 : map.keySet()) {
            bundle.putString(str2, (String) map.get(str2));
        }
        android.support.v4.media.session.a.J0(this.f598b, aVar.f592p, bundle, true);
    }

    public final void setStringsInternal(a aVar, String str, ArrayList arrayList) {
        d(aVar);
        I.g(arrayList);
        int size = arrayList.size();
        String[] strArr = new String[size];
        for (int i2 = 0; i2 < size; i2++) {
            strArr[i2] = (String) arrayList.get(i2);
        }
        android.support.v4.media.session.a.S0(this.f598b, aVar.f592p, strArr, true);
    }

    public final String toString() {
        h hVar = this.d;
        I.h(hVar, "Cannot convert to JSON on client side.");
        Parcel c3 = c();
        c3.setDataPosition(0);
        StringBuilder sb = new StringBuilder(100);
        String str = this.f600e;
        I.g(str);
        Map map = (Map) hVar.f610b.get(str);
        I.g(map);
        e(sb, map, c3);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        h hVar;
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.Y0(parcel, 1, 4);
        parcel.writeInt(this.f597a);
        Parcel c3 = c();
        if (c3 != null) {
            int W03 = android.support.v4.media.session.a.W0(2, parcel);
            parcel.appendFrom(c3, 0, c3.dataSize());
            android.support.v4.media.session.a.X0(W03, parcel);
        }
        if (this.f599c != 0) {
            hVar = this.d;
        } else {
            hVar = null;
        }
        android.support.v4.media.session.a.Q0(parcel, 3, hVar, i2, false);
        android.support.v4.media.session.a.X0(W02, parcel);
    }

    public final void zab(a aVar, String str, BigDecimal bigDecimal) {
        d(aVar);
        Parcel parcel = this.f598b;
        int i2 = aVar.f592p;
        if (bigDecimal == null) {
            android.support.v4.media.session.a.Y0(parcel, i2, 0);
            return;
        }
        int W02 = android.support.v4.media.session.a.W0(i2, parcel);
        parcel.writeByteArray(bigDecimal.unscaledValue().toByteArray());
        parcel.writeInt(bigDecimal.scale());
        android.support.v4.media.session.a.X0(W02, parcel);
    }

    public final void zad(a aVar, String str, ArrayList arrayList) {
        d(aVar);
        I.g(arrayList);
        int size = arrayList.size();
        BigDecimal[] bigDecimalArr = new BigDecimal[size];
        for (int i2 = 0; i2 < size; i2++) {
            bigDecimalArr[i2] = (BigDecimal) arrayList.get(i2);
        }
        int i5 = aVar.f592p;
        Parcel parcel = this.f598b;
        int W02 = android.support.v4.media.session.a.W0(i5, parcel);
        parcel.writeInt(size);
        for (int i6 = 0; i6 < size; i6++) {
            parcel.writeByteArray(bigDecimalArr[i6].unscaledValue().toByteArray());
            parcel.writeInt(bigDecimalArr[i6].scale());
        }
        android.support.v4.media.session.a.X0(W02, parcel);
    }

    public final void zaf(a aVar, String str, BigInteger bigInteger) {
        d(aVar);
        Parcel parcel = this.f598b;
        int i2 = aVar.f592p;
        if (bigInteger == null) {
            android.support.v4.media.session.a.Y0(parcel, i2, 0);
            return;
        }
        int W02 = android.support.v4.media.session.a.W0(i2, parcel);
        parcel.writeByteArray(bigInteger.toByteArray());
        android.support.v4.media.session.a.X0(W02, parcel);
    }

    public final void zah(a aVar, String str, ArrayList arrayList) {
        d(aVar);
        I.g(arrayList);
        int size = arrayList.size();
        BigInteger[] bigIntegerArr = new BigInteger[size];
        for (int i2 = 0; i2 < size; i2++) {
            bigIntegerArr[i2] = (BigInteger) arrayList.get(i2);
        }
        int i5 = aVar.f592p;
        Parcel parcel = this.f598b;
        int W02 = android.support.v4.media.session.a.W0(i5, parcel);
        parcel.writeInt(size);
        for (int i6 = 0; i6 < size; i6++) {
            parcel.writeByteArray(bigIntegerArr[i6].toByteArray());
        }
        android.support.v4.media.session.a.X0(W02, parcel);
    }

    public final void zak(a aVar, String str, ArrayList arrayList) {
        d(aVar);
        I.g(arrayList);
        int size = arrayList.size();
        boolean[] zArr = new boolean[size];
        for (int i2 = 0; i2 < size; i2++) {
            zArr[i2] = ((Boolean) arrayList.get(i2)).booleanValue();
        }
        int i5 = aVar.f592p;
        Parcel parcel = this.f598b;
        int W02 = android.support.v4.media.session.a.W0(i5, parcel);
        parcel.writeBooleanArray(zArr);
        android.support.v4.media.session.a.X0(W02, parcel);
    }

    public final void zan(a aVar, String str, double d6) {
        d(aVar);
        Parcel parcel = this.f598b;
        android.support.v4.media.session.a.Y0(parcel, aVar.f592p, 8);
        parcel.writeDouble(d6);
    }

    public final void zap(a aVar, String str, ArrayList arrayList) {
        d(aVar);
        I.g(arrayList);
        int size = arrayList.size();
        double[] dArr = new double[size];
        for (int i2 = 0; i2 < size; i2++) {
            dArr[i2] = ((Double) arrayList.get(i2)).doubleValue();
        }
        int i5 = aVar.f592p;
        Parcel parcel = this.f598b;
        int W02 = android.support.v4.media.session.a.W0(i5, parcel);
        parcel.writeDoubleArray(dArr);
        android.support.v4.media.session.a.X0(W02, parcel);
    }

    public final void zar(a aVar, String str, float f6) {
        d(aVar);
        Parcel parcel = this.f598b;
        android.support.v4.media.session.a.Y0(parcel, aVar.f592p, 4);
        parcel.writeFloat(f6);
    }

    public final void zat(a aVar, String str, ArrayList arrayList) {
        d(aVar);
        I.g(arrayList);
        int size = arrayList.size();
        float[] fArr = new float[size];
        for (int i2 = 0; i2 < size; i2++) {
            fArr[i2] = ((Float) arrayList.get(i2)).floatValue();
        }
        int i5 = aVar.f592p;
        Parcel parcel = this.f598b;
        int W02 = android.support.v4.media.session.a.W0(i5, parcel);
        parcel.writeFloatArray(fArr);
        android.support.v4.media.session.a.X0(W02, parcel);
    }

    public final void zaw(a aVar, String str, ArrayList arrayList) {
        d(aVar);
        I.g(arrayList);
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        android.support.v4.media.session.a.N0(this.f598b, aVar.f592p, iArr, true);
    }

    public final void zaz(a aVar, String str, ArrayList arrayList) {
        d(aVar);
        I.g(arrayList);
        int size = arrayList.size();
        long[] jArr = new long[size];
        for (int i2 = 0; i2 < size; i2++) {
            jArr[i2] = ((Long) arrayList.get(i2)).longValue();
        }
        int i5 = aVar.f592p;
        Parcel parcel = this.f598b;
        int W02 = android.support.v4.media.session.a.W0(i5, parcel);
        parcel.writeLongArray(jArr);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
