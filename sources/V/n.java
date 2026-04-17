package v;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import h0.C0552a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

public final class n {
    public static final int[] d = {0, 4, 8};

    /* renamed from: e  reason: collision with root package name */
    public static final SparseIntArray f12132e;

    /* renamed from: f  reason: collision with root package name */
    public static final SparseIntArray f12133f;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f12134a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final boolean f12135b = true;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f12136c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f12132e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f12133f = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    public static int[] c(C1035a aVar, String str) {
        int i2;
        String[] split = str.split(",");
        Context context = aVar.getContext();
        int[] iArr = new int[split.length];
        int i5 = 0;
        int i6 = 0;
        while (i5 < split.length) {
            String trim = split[i5].trim();
            Object obj = null;
            try {
                i2 = p.class.getField(trim).getInt((Object) null);
            } catch (Exception unused) {
                i2 = 0;
            }
            if (i2 == 0) {
                i2 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i2 == 0 && aVar.isInEditMode() && (aVar.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) aVar.getParent();
                if (trim != null) {
                    HashMap hashMap = constraintLayout.f4849v;
                    if (hashMap != null && hashMap.containsKey(trim)) {
                        obj = constraintLayout.f4849v.get(trim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (obj != null && (obj instanceof Integer)) {
                    i2 = ((Integer) obj).intValue();
                }
            }
            iArr[i6] = i2;
            i5++;
            i6++;
        }
        if (i6 != split.length) {
            return Arrays.copyOf(iArr, i6);
        }
        return iArr;
    }

    /* JADX WARNING: type inference failed for: r3v120, types: [v.h, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x05b9, code lost:
        r10 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x05c9, code lost:
        r6 = r6 + r10;
        r10 = r19;
        r15 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0624, code lost:
        r10 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0627, code lost:
        r18 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0629, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x00aa, code lost:
        r10 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x07b9, code lost:
        r18 = r0;
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x07bb, code lost:
        r0 = 1;
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0cf2, code lost:
        r12 = r12 + r0;
        r3 = r24;
        r20 = r15;
        r21 = r10;
        r10 = r0;
        r0 = r18;
        r18 = r21;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static v.i d(android.content.Context r22, android.util.AttributeSet r23, boolean r24) {
        /*
            v.i r1 = new v.i
            r1.<init>()
            if (r24 == 0) goto L_0x000e
            int[] r2 = v.q.f12139c
        L_0x0009:
            r3 = r22
            r4 = r23
            goto L_0x0011
        L_0x000e:
            int[] r2 = v.q.f12137a
            goto L_0x0009
        L_0x0011:
            android.content.res.TypedArray r2 = r3.obtainStyledAttributes(r4, r2)
            int[] r3 = d
            android.util.SparseIntArray r4 = f12132e
            v.l r5 = r1.f12043b
            java.lang.String[] r6 = r.C0939a.f11126a
            v.m r7 = r1.f12045e
            v.k r8 = r1.f12044c
            v.j r9 = r1.d
            java.lang.String r12 = "CURRENTLY UNSUPPORTED"
            java.lang.String r13 = "/"
            java.lang.String r14 = "unused attribute 0x"
            java.lang.String r15 = "Unknown attribute 0x"
            java.lang.String r11 = "   "
            java.lang.String r0 = "ConstraintSet"
            if (r24 == 0) goto L_0x05d0
            int r10 = r2.getIndexCount()
            r16 = r3
            v.h r3 = new v.h
            r3.<init>()
            r17 = r6
            r6 = 10
            r18 = r12
            int[] r12 = new int[r6]
            r3.f12033a = r12
            int[] r12 = new int[r6]
            r3.f12034b = r12
            r12 = 0
            r3.f12035c = r12
            int[] r12 = new int[r6]
            r3.d = r12
            float[] r6 = new float[r6]
            r3.f12036e = r6
            r6 = 0
            r3.f12037f = r6
            r12 = 5
            int[] r6 = new int[r12]
            r3.g = r6
            java.lang.String[] r6 = new java.lang.String[r12]
            r3.h = r6
            r6 = 0
            r3.f12038i = r6
            r12 = 4
            int[] r6 = new int[r12]
            r3.f12039j = r6
            boolean[] r6 = new boolean[r12]
            r3.f12040k = r6
            r6 = 0
            r3.f12041l = r6
            r8.getClass()
            r9.getClass()
            r7.getClass()
            r6 = 0
        L_0x007a:
            if (r6 >= r10) goto L_0x0d07
            int r12 = r2.getIndex(r6)
            r19 = r10
            android.util.SparseIntArray r10 = f12133f
            int r10 = r10.get(r12)
            switch(r10) {
                case 2: goto L_0x05bb;
                case 3: goto L_0x008b;
                case 4: goto L_0x008b;
                case 5: goto L_0x05af;
                case 6: goto L_0x05a1;
                case 7: goto L_0x0593;
                case 8: goto L_0x0584;
                case 9: goto L_0x008b;
                case 10: goto L_0x008b;
                case 11: goto L_0x0575;
                case 12: goto L_0x0566;
                case 13: goto L_0x0557;
                case 14: goto L_0x0548;
                case 15: goto L_0x0539;
                case 16: goto L_0x052a;
                case 17: goto L_0x051b;
                case 18: goto L_0x050c;
                case 19: goto L_0x04fd;
                case 20: goto L_0x04ee;
                case 21: goto L_0x04df;
                case 22: goto L_0x04ce;
                case 23: goto L_0x04bf;
                case 24: goto L_0x04b0;
                case 25: goto L_0x008b;
                case 26: goto L_0x008b;
                case 27: goto L_0x04a1;
                case 28: goto L_0x0492;
                case 29: goto L_0x008b;
                case 30: goto L_0x008b;
                case 31: goto L_0x0483;
                case 32: goto L_0x008b;
                case 33: goto L_0x008b;
                case 34: goto L_0x0474;
                case 35: goto L_0x008b;
                case 36: goto L_0x008b;
                case 37: goto L_0x0465;
                case 38: goto L_0x0454;
                case 39: goto L_0x0445;
                case 40: goto L_0x0436;
                case 41: goto L_0x0427;
                case 42: goto L_0x0418;
                case 43: goto L_0x0409;
                case 44: goto L_0x03f6;
                case 45: goto L_0x03e7;
                case 46: goto L_0x03d8;
                case 47: goto L_0x03c9;
                case 48: goto L_0x03ba;
                case 49: goto L_0x03ab;
                case 50: goto L_0x039c;
                case 51: goto L_0x038d;
                case 52: goto L_0x037e;
                case 53: goto L_0x036f;
                case 54: goto L_0x0360;
                case 55: goto L_0x0351;
                case 56: goto L_0x0342;
                case 57: goto L_0x0333;
                case 58: goto L_0x0324;
                case 59: goto L_0x0315;
                case 60: goto L_0x0306;
                case 61: goto L_0x008b;
                case 62: goto L_0x02f7;
                case 63: goto L_0x02e8;
                case 64: goto L_0x02d9;
                case 65: goto L_0x02b4;
                case 66: goto L_0x02a6;
                case 67: goto L_0x0297;
                case 68: goto L_0x0288;
                case 69: goto L_0x0279;
                case 70: goto L_0x0268;
                case 71: goto L_0x025f;
                case 72: goto L_0x0250;
                case 73: goto L_0x0241;
                case 74: goto L_0x0234;
                case 75: goto L_0x0225;
                case 76: goto L_0x0216;
                case 77: goto L_0x0209;
                case 78: goto L_0x01fa;
                case 79: goto L_0x01eb;
                case 80: goto L_0x01dc;
                case 81: goto L_0x01cd;
                case 82: goto L_0x01be;
                case 83: goto L_0x01af;
                case 84: goto L_0x01a0;
                case 85: goto L_0x0191;
                case 86: goto L_0x012f;
                case 87: goto L_0x010e;
                case 88: goto L_0x008b;
                case 89: goto L_0x008b;
                case 90: goto L_0x008b;
                case 91: goto L_0x008b;
                case 92: goto L_0x008b;
                case 93: goto L_0x0100;
                case 94: goto L_0x00f2;
                case 95: goto L_0x00eb;
                case 96: goto L_0x00e4;
                case 97: goto L_0x00d6;
                case 98: goto L_0x00bc;
                case 99: goto L_0x00ae;
                default: goto L_0x008b;
            }
        L_0x008b:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r15)
            r20 = r15
            java.lang.String r15 = java.lang.Integer.toHexString(r12)
            r10.append(r15)
            r10.append(r11)
            int r12 = r4.get(r12)
            r10.append(r12)
            java.lang.String r10 = r10.toString()
            android.util.Log.w(r0, r10)
        L_0x00aa:
            r10 = 1
        L_0x00ab:
            r15 = 5
            goto L_0x05c9
        L_0x00ae:
            r20 = r15
            boolean r10 = r9.g
            boolean r10 = r2.getBoolean(r12, r10)
            r12 = 99
            r3.d(r12, r10)
            goto L_0x00aa
        L_0x00bc:
            r20 = r15
            int r10 = u.C1013a.f11773z
            android.util.TypedValue r10 = r2.peekValue(r12)
            int r10 = r10.type
            r15 = 3
            if (r10 != r15) goto L_0x00cd
            r2.getString(r12)
            goto L_0x00aa
        L_0x00cd:
            int r10 = r1.f12042a
            int r10 = r2.getResourceId(r12, r10)
            r1.f12042a = r10
            goto L_0x00aa
        L_0x00d6:
            r20 = r15
            int r10 = r9.f12099o0
            int r10 = r2.getInt(r12, r10)
            r12 = 97
            r3.b(r12, r10)
            goto L_0x00aa
        L_0x00e4:
            r20 = r15
            r10 = 1
            g(r3, r2, r12, r10)
            goto L_0x00ab
        L_0x00eb:
            r20 = r15
            r10 = 0
            g(r3, r2, r12, r10)
            goto L_0x00aa
        L_0x00f2:
            r20 = r15
            int r10 = r9.f12065S
            int r10 = r2.getDimensionPixelSize(r12, r10)
            r12 = 94
            r3.b(r12, r10)
            goto L_0x00aa
        L_0x0100:
            r20 = r15
            int r10 = r9.f12058L
            int r10 = r2.getDimensionPixelSize(r12, r10)
            r12 = 93
            r3.b(r12, r10)
            goto L_0x00aa
        L_0x010e:
            r20 = r15
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r14)
            java.lang.String r15 = java.lang.Integer.toHexString(r12)
            r10.append(r15)
            r10.append(r11)
            int r12 = r4.get(r12)
            r10.append(r12)
            java.lang.String r10 = r10.toString()
            android.util.Log.w(r0, r10)
            goto L_0x00aa
        L_0x012f:
            r20 = r15
            android.util.TypedValue r10 = r2.peekValue(r12)
            int r10 = r10.type
            r15 = 1
            if (r10 != r15) goto L_0x0152
            r15 = -1
            int r10 = r2.getResourceId(r12, r15)
            r8.f12117i = r10
            r12 = 89
            r3.b(r12, r10)
            int r10 = r8.f12117i
            if (r10 == r15) goto L_0x00aa
            r10 = -2
            r12 = 88
            r3.b(r12, r10)
            goto L_0x00aa
        L_0x0152:
            r15 = 3
            if (r10 != r15) goto L_0x0184
            java.lang.String r10 = r2.getString(r12)
            r8.h = r10
            r15 = 90
            r3.c(r15, r10)
            java.lang.String r10 = r8.h
            int r10 = r10.indexOf(r13)
            if (r10 <= 0) goto L_0x017c
            r10 = -1
            int r12 = r2.getResourceId(r12, r10)
            r8.f12117i = r12
            r15 = 89
            r3.b(r15, r12)
            r12 = -2
            r15 = 88
            r3.b(r15, r12)
            goto L_0x00aa
        L_0x017c:
            r10 = -1
            r15 = 88
            r3.b(r15, r10)
            goto L_0x00aa
        L_0x0184:
            r15 = 88
            int r10 = r8.f12117i
            int r10 = r2.getInteger(r12, r10)
            r3.b(r15, r10)
            goto L_0x00aa
        L_0x0191:
            r20 = r15
            float r10 = r8.f12116f
            float r10 = r2.getFloat(r12, r10)
            r12 = 85
            r3.a(r12, r10)
            goto L_0x00aa
        L_0x01a0:
            r20 = r15
            int r10 = r8.g
            int r10 = r2.getInteger(r12, r10)
            r12 = 84
            r3.b(r12, r10)
            goto L_0x00aa
        L_0x01af:
            r20 = r15
            int r10 = r7.h
            int r10 = f(r2, r12, r10)
            r12 = 83
            r3.b(r12, r10)
            goto L_0x00aa
        L_0x01be:
            r20 = r15
            int r10 = r8.f12113b
            int r10 = r2.getInteger(r12, r10)
            r12 = 82
            r3.b(r12, r10)
            goto L_0x00aa
        L_0x01cd:
            r20 = r15
            boolean r10 = r9.f12095m0
            boolean r10 = r2.getBoolean(r12, r10)
            r12 = 81
            r3.d(r12, r10)
            goto L_0x00aa
        L_0x01dc:
            r20 = r15
            boolean r10 = r9.f12093l0
            boolean r10 = r2.getBoolean(r12, r10)
            r12 = 80
            r3.d(r12, r10)
            goto L_0x00aa
        L_0x01eb:
            r20 = r15
            float r10 = r8.d
            float r10 = r2.getFloat(r12, r10)
            r12 = 79
            r3.a(r12, r10)
            goto L_0x00aa
        L_0x01fa:
            r20 = r15
            int r10 = r5.f12119b
            int r10 = r2.getInt(r12, r10)
            r12 = 78
            r3.b(r12, r10)
            goto L_0x00aa
        L_0x0209:
            r20 = r15
            r10 = 77
            java.lang.String r12 = r2.getString(r12)
            r3.c(r10, r12)
            goto L_0x00aa
        L_0x0216:
            r20 = r15
            int r10 = r8.f12114c
            int r10 = r2.getInt(r12, r10)
            r12 = 76
            r3.b(r12, r10)
            goto L_0x00aa
        L_0x0225:
            r20 = r15
            boolean r10 = r9.f12097n0
            boolean r10 = r2.getBoolean(r12, r10)
            r12 = 75
            r3.d(r12, r10)
            goto L_0x00aa
        L_0x0234:
            r20 = r15
            r10 = 74
            java.lang.String r12 = r2.getString(r12)
            r3.c(r10, r12)
            goto L_0x00aa
        L_0x0241:
            r20 = r15
            int r10 = r9.f12084g0
            int r10 = r2.getDimensionPixelSize(r12, r10)
            r12 = 73
            r3.b(r12, r10)
            goto L_0x00aa
        L_0x0250:
            r20 = r15
            int r10 = r9.f12083f0
            int r10 = r2.getInt(r12, r10)
            r12 = 72
            r3.b(r12, r10)
            goto L_0x00aa
        L_0x025f:
            r20 = r15
            r10 = r18
            android.util.Log.e(r0, r10)
            goto L_0x00aa
        L_0x0268:
            r20 = r15
            r10 = r18
            r15 = 70
            r10 = 1065353216(0x3f800000, float:1.0)
            float r12 = r2.getFloat(r12, r10)
            r3.a(r15, r12)
            goto L_0x00aa
        L_0x0279:
            r20 = r15
            r10 = 1065353216(0x3f800000, float:1.0)
            r15 = 69
            float r12 = r2.getFloat(r12, r10)
            r3.a(r15, r12)
            goto L_0x00aa
        L_0x0288:
            r20 = r15
            float r10 = r5.d
            float r10 = r2.getFloat(r12, r10)
            r12 = 68
            r3.a(r12, r10)
            goto L_0x00aa
        L_0x0297:
            r20 = r15
            float r10 = r8.f12115e
            float r10 = r2.getFloat(r12, r10)
            r12 = 67
            r3.a(r12, r10)
            goto L_0x00aa
        L_0x02a6:
            r20 = r15
            r10 = 66
            r15 = 0
            int r12 = r2.getInt(r12, r15)
            r3.b(r10, r12)
            goto L_0x00aa
        L_0x02b4:
            r20 = r15
            r15 = 0
            android.util.TypedValue r10 = r2.peekValue(r12)
            int r10 = r10.type
            r15 = 3
            if (r10 != r15) goto L_0x02cb
            java.lang.String r10 = r2.getString(r12)
            r15 = 65
            r3.c(r15, r10)
            goto L_0x00aa
        L_0x02cb:
            r10 = 0
            r15 = 65
            int r12 = r2.getInteger(r12, r10)
            r10 = r17[r12]
            r3.c(r15, r10)
            goto L_0x00aa
        L_0x02d9:
            r20 = r15
            int r10 = r8.f12112a
            int r10 = f(r2, r12, r10)
            r12 = 64
            r3.b(r12, r10)
            goto L_0x00aa
        L_0x02e8:
            r20 = r15
            float r10 = r9.f12049B
            float r10 = r2.getFloat(r12, r10)
            r12 = 63
            r3.a(r12, r10)
            goto L_0x00aa
        L_0x02f7:
            r20 = r15
            int r10 = r9.f12048A
            int r10 = r2.getDimensionPixelSize(r12, r10)
            r12 = 62
            r3.b(r12, r10)
            goto L_0x00aa
        L_0x0306:
            r20 = r15
            float r10 = r7.f12122a
            float r10 = r2.getFloat(r12, r10)
            r12 = 60
            r3.a(r12, r10)
            goto L_0x00aa
        L_0x0315:
            r20 = r15
            int r10 = r9.f12078c0
            int r10 = r2.getDimensionPixelSize(r12, r10)
            r12 = 59
            r3.b(r12, r10)
            goto L_0x00aa
        L_0x0324:
            r20 = r15
            int r10 = r9.f12076b0
            int r10 = r2.getDimensionPixelSize(r12, r10)
            r12 = 58
            r3.b(r12, r10)
            goto L_0x00aa
        L_0x0333:
            r20 = r15
            int r10 = r9.f12074a0
            int r10 = r2.getDimensionPixelSize(r12, r10)
            r12 = 57
            r3.b(r12, r10)
            goto L_0x00aa
        L_0x0342:
            r20 = r15
            int r10 = r9.f12072Z
            int r10 = r2.getDimensionPixelSize(r12, r10)
            r12 = 56
            r3.b(r12, r10)
            goto L_0x00aa
        L_0x0351:
            r20 = r15
            int r10 = r9.f12071Y
            int r10 = r2.getInt(r12, r10)
            r12 = 55
            r3.b(r12, r10)
            goto L_0x00aa
        L_0x0360:
            r20 = r15
            int r10 = r9.f12070X
            int r10 = r2.getInt(r12, r10)
            r12 = 54
            r3.b(r12, r10)
            goto L_0x00aa
        L_0x036f:
            r20 = r15
            float r10 = r7.f12129k
            float r10 = r2.getDimension(r12, r10)
            r12 = 53
            r3.a(r12, r10)
            goto L_0x00aa
        L_0x037e:
            r20 = r15
            float r10 = r7.f12128j
            float r10 = r2.getDimension(r12, r10)
            r12 = 52
            r3.a(r12, r10)
            goto L_0x00aa
        L_0x038d:
            r20 = r15
            float r10 = r7.f12127i
            float r10 = r2.getDimension(r12, r10)
            r12 = 51
            r3.a(r12, r10)
            goto L_0x00aa
        L_0x039c:
            r20 = r15
            float r10 = r7.g
            float r10 = r2.getDimension(r12, r10)
            r12 = 50
            r3.a(r12, r10)
            goto L_0x00aa
        L_0x03ab:
            r20 = r15
            float r10 = r7.f12126f
            float r10 = r2.getDimension(r12, r10)
            r12 = 49
            r3.a(r12, r10)
            goto L_0x00aa
        L_0x03ba:
            r20 = r15
            float r10 = r7.f12125e
            float r10 = r2.getFloat(r12, r10)
            r12 = 48
            r3.a(r12, r10)
            goto L_0x00aa
        L_0x03c9:
            r20 = r15
            float r10 = r7.d
            float r10 = r2.getFloat(r12, r10)
            r12 = 47
            r3.a(r12, r10)
            goto L_0x00aa
        L_0x03d8:
            r20 = r15
            float r10 = r7.f12124c
            float r10 = r2.getFloat(r12, r10)
            r12 = 46
            r3.a(r12, r10)
            goto L_0x00aa
        L_0x03e7:
            r20 = r15
            float r10 = r7.f12123b
            float r10 = r2.getFloat(r12, r10)
            r12 = 45
            r3.a(r12, r10)
            goto L_0x00aa
        L_0x03f6:
            r20 = r15
            r10 = 44
            r15 = 1
            r3.d(r10, r15)
            float r15 = r7.f12131m
            float r12 = r2.getDimension(r12, r15)
            r3.a(r10, r12)
            goto L_0x00aa
        L_0x0409:
            r20 = r15
            float r10 = r5.f12120c
            float r10 = r2.getFloat(r12, r10)
            r12 = 43
            r3.a(r12, r10)
            goto L_0x00aa
        L_0x0418:
            r20 = r15
            int r10 = r9.f12069W
            int r10 = r2.getInt(r12, r10)
            r12 = 42
            r3.b(r12, r10)
            goto L_0x00aa
        L_0x0427:
            r20 = r15
            int r10 = r9.f12068V
            int r10 = r2.getInt(r12, r10)
            r12 = 41
            r3.b(r12, r10)
            goto L_0x00aa
        L_0x0436:
            r20 = r15
            float r10 = r9.f12066T
            float r10 = r2.getFloat(r12, r10)
            r12 = 40
            r3.a(r12, r10)
            goto L_0x00aa
        L_0x0445:
            r20 = r15
            float r10 = r9.f12067U
            float r10 = r2.getFloat(r12, r10)
            r12 = 39
            r3.a(r12, r10)
            goto L_0x00aa
        L_0x0454:
            r20 = r15
            int r10 = r1.f12042a
            int r10 = r2.getResourceId(r12, r10)
            r1.f12042a = r10
            r12 = 38
            r3.b(r12, r10)
            goto L_0x00aa
        L_0x0465:
            r20 = r15
            float r10 = r9.f12108x
            float r10 = r2.getFloat(r12, r10)
            r12 = 37
            r3.a(r12, r10)
            goto L_0x00aa
        L_0x0474:
            r20 = r15
            int r10 = r9.f12054H
            int r10 = r2.getDimensionPixelSize(r12, r10)
            r12 = 34
            r3.b(r12, r10)
            goto L_0x00aa
        L_0x0483:
            r20 = r15
            int r10 = r9.f12057K
            int r10 = r2.getDimensionPixelSize(r12, r10)
            r12 = 31
            r3.b(r12, r10)
            goto L_0x00aa
        L_0x0492:
            r20 = r15
            int r10 = r9.f12053G
            int r10 = r2.getDimensionPixelSize(r12, r10)
            r12 = 28
            r3.b(r12, r10)
            goto L_0x00aa
        L_0x04a1:
            r20 = r15
            int r10 = r9.f12052E
            int r10 = r2.getInt(r12, r10)
            r12 = 27
            r3.b(r12, r10)
            goto L_0x00aa
        L_0x04b0:
            r20 = r15
            int r10 = r9.F
            int r10 = r2.getDimensionPixelSize(r12, r10)
            r12 = 24
            r3.b(r12, r10)
            goto L_0x00aa
        L_0x04bf:
            r20 = r15
            int r10 = r9.f12075b
            int r10 = r2.getLayoutDimension(r12, r10)
            r12 = 23
            r3.b(r12, r10)
            goto L_0x00aa
        L_0x04ce:
            r20 = r15
            int r10 = r5.f12118a
            int r10 = r2.getInt(r12, r10)
            r10 = r16[r10]
            r12 = 22
            r3.b(r12, r10)
            goto L_0x00aa
        L_0x04df:
            r20 = r15
            int r10 = r9.f12077c
            int r10 = r2.getLayoutDimension(r12, r10)
            r12 = 21
            r3.b(r12, r10)
            goto L_0x00aa
        L_0x04ee:
            r20 = r15
            float r10 = r9.f12107w
            float r10 = r2.getFloat(r12, r10)
            r12 = 20
            r3.a(r12, r10)
            goto L_0x00aa
        L_0x04fd:
            r20 = r15
            float r10 = r9.f12082f
            float r10 = r2.getFloat(r12, r10)
            r12 = 19
            r3.a(r12, r10)
            goto L_0x00aa
        L_0x050c:
            r20 = r15
            int r10 = r9.f12080e
            int r10 = r2.getDimensionPixelOffset(r12, r10)
            r12 = 18
            r3.b(r12, r10)
            goto L_0x00aa
        L_0x051b:
            r20 = r15
            int r10 = r9.d
            int r10 = r2.getDimensionPixelOffset(r12, r10)
            r12 = 17
            r3.b(r12, r10)
            goto L_0x00aa
        L_0x052a:
            r20 = r15
            int r10 = r9.f12060N
            int r10 = r2.getDimensionPixelSize(r12, r10)
            r12 = 16
            r3.b(r12, r10)
            goto L_0x00aa
        L_0x0539:
            r20 = r15
            int r10 = r9.f12064R
            int r10 = r2.getDimensionPixelSize(r12, r10)
            r12 = 15
            r3.b(r12, r10)
            goto L_0x00aa
        L_0x0548:
            r20 = r15
            int r10 = r9.f12061O
            int r10 = r2.getDimensionPixelSize(r12, r10)
            r12 = 14
            r3.b(r12, r10)
            goto L_0x00aa
        L_0x0557:
            r20 = r15
            int r10 = r9.f12059M
            int r10 = r2.getDimensionPixelSize(r12, r10)
            r12 = 13
            r3.b(r12, r10)
            goto L_0x00aa
        L_0x0566:
            r20 = r15
            int r10 = r9.f12063Q
            int r10 = r2.getDimensionPixelSize(r12, r10)
            r12 = 12
            r3.b(r12, r10)
            goto L_0x00aa
        L_0x0575:
            r20 = r15
            int r10 = r9.f12062P
            int r10 = r2.getDimensionPixelSize(r12, r10)
            r12 = 11
            r3.b(r12, r10)
            goto L_0x00aa
        L_0x0584:
            r20 = r15
            int r10 = r9.f12056J
            int r10 = r2.getDimensionPixelSize(r12, r10)
            r12 = 8
            r3.b(r12, r10)
            goto L_0x00aa
        L_0x0593:
            r20 = r15
            int r10 = r9.f12051D
            int r10 = r2.getDimensionPixelOffset(r12, r10)
            r12 = 7
            r3.b(r12, r10)
            goto L_0x00aa
        L_0x05a1:
            r20 = r15
            int r10 = r9.f12050C
            int r10 = r2.getDimensionPixelOffset(r12, r10)
            r12 = 6
            r3.b(r12, r10)
            goto L_0x00aa
        L_0x05af:
            r20 = r15
            java.lang.String r10 = r2.getString(r12)
            r15 = 5
            r3.c(r15, r10)
        L_0x05b9:
            r10 = 1
            goto L_0x05c9
        L_0x05bb:
            r20 = r15
            r15 = 5
            int r10 = r9.f12055I
            int r10 = r2.getDimensionPixelSize(r12, r10)
            r12 = 2
            r3.b(r12, r10)
            goto L_0x05b9
        L_0x05c9:
            int r6 = r6 + r10
            r10 = r19
            r15 = r20
            goto L_0x007a
        L_0x05d0:
            r16 = r3
            r17 = r6
            r18 = r12
            r20 = r15
            r10 = 1
            int r3 = r2.getIndexCount()
            r12 = 0
        L_0x05de:
            if (r12 >= r3) goto L_0x0d00
            int r6 = r2.getIndex(r12)
            if (r6 == r10) goto L_0x05f8
            r10 = 23
            r15 = 24
            if (r10 == r6) goto L_0x05fc
            if (r15 == r6) goto L_0x05fc
            r8.getClass()
            r9.getClass()
            r7.getClass()
            goto L_0x05fc
        L_0x05f8:
            r10 = 23
            r15 = 24
        L_0x05fc:
            int r19 = r4.get(r6)
            switch(r19) {
                case 1: goto L_0x0cdf;
                case 2: goto L_0x0ccc;
                case 3: goto L_0x0cb9;
                case 4: goto L_0x0ca6;
                case 5: goto L_0x0c95;
                case 6: goto L_0x0c82;
                case 7: goto L_0x0c6f;
                case 8: goto L_0x0c5c;
                case 9: goto L_0x0c49;
                case 10: goto L_0x0c36;
                case 11: goto L_0x0c23;
                case 12: goto L_0x0c10;
                case 13: goto L_0x0bfd;
                case 14: goto L_0x0bea;
                case 15: goto L_0x0bd7;
                case 16: goto L_0x0bc4;
                case 17: goto L_0x0bb1;
                case 18: goto L_0x0b9e;
                case 19: goto L_0x0b8b;
                case 20: goto L_0x0b78;
                case 21: goto L_0x0b65;
                case 22: goto L_0x0b4e;
                case 23: goto L_0x0b3b;
                case 24: goto L_0x0b28;
                case 25: goto L_0x0b15;
                case 26: goto L_0x0b02;
                case 27: goto L_0x0aef;
                case 28: goto L_0x0adc;
                case 29: goto L_0x0ac9;
                case 30: goto L_0x0ab6;
                case 31: goto L_0x0aa3;
                case 32: goto L_0x0a90;
                case 33: goto L_0x0a7d;
                case 34: goto L_0x0a6a;
                case 35: goto L_0x0a57;
                case 36: goto L_0x0a44;
                case 37: goto L_0x0a31;
                case 38: goto L_0x0a1e;
                case 39: goto L_0x0a0b;
                case 40: goto L_0x09f8;
                case 41: goto L_0x09e5;
                case 42: goto L_0x09d2;
                case 43: goto L_0x09bf;
                case 44: goto L_0x09a9;
                case 45: goto L_0x0996;
                case 46: goto L_0x0983;
                case 47: goto L_0x0970;
                case 48: goto L_0x095d;
                case 49: goto L_0x094a;
                case 50: goto L_0x0937;
                case 51: goto L_0x0924;
                case 52: goto L_0x0911;
                case 53: goto L_0x08fe;
                case 54: goto L_0x08eb;
                case 55: goto L_0x08d8;
                case 56: goto L_0x08c5;
                case 57: goto L_0x08b2;
                case 58: goto L_0x089f;
                case 59: goto L_0x088c;
                case 60: goto L_0x0879;
                case 61: goto L_0x0866;
                case 62: goto L_0x0853;
                case 63: goto L_0x0840;
                case 64: goto L_0x082d;
                case 65: goto L_0x0809;
                case 66: goto L_0x07fa;
                case 67: goto L_0x07eb;
                case 68: goto L_0x07dc;
                case 69: goto L_0x07cd;
                case 70: goto L_0x07be;
                case 71: goto L_0x07af;
                case 72: goto L_0x07a0;
                case 73: goto L_0x0791;
                case 74: goto L_0x0784;
                case 75: goto L_0x0775;
                case 76: goto L_0x0766;
                case 77: goto L_0x0759;
                case 78: goto L_0x074a;
                case 79: goto L_0x073b;
                case 80: goto L_0x072c;
                case 81: goto L_0x071d;
                case 82: goto L_0x070e;
                case 83: goto L_0x06ff;
                case 84: goto L_0x06f0;
                case 85: goto L_0x06e1;
                case 86: goto L_0x06ab;
                case 87: goto L_0x0688;
                case 88: goto L_0x0603;
                case 89: goto L_0x0603;
                case 90: goto L_0x0603;
                case 91: goto L_0x067b;
                case 92: goto L_0x066e;
                case 93: goto L_0x0661;
                case 94: goto L_0x0654;
                case 95: goto L_0x0649;
                case 96: goto L_0x0639;
                case 97: goto L_0x062c;
                default: goto L_0x0603;
            }
        L_0x0603:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r15 = r20
            r10.<init>(r15)
            r24 = r3
            java.lang.String r3 = java.lang.Integer.toHexString(r6)
            r10.append(r3)
            r10.append(r11)
            int r3 = r4.get(r6)
            r10.append(r3)
            java.lang.String r3 = r10.toString()
            android.util.Log.w(r0, r3)
        L_0x0624:
            r10 = r18
            r3 = 0
        L_0x0627:
            r18 = r0
        L_0x0629:
            r0 = 1
            goto L_0x0cf2
        L_0x062c:
            r24 = r3
            r15 = r20
            int r3 = r9.f12099o0
            int r3 = r2.getInt(r6, r3)
            r9.f12099o0 = r3
            goto L_0x0624
        L_0x0639:
            r24 = r3
            r15 = r20
            r3 = 1
            g(r9, r2, r6, r3)
            r10 = r18
            r18 = r0
            r0 = r3
        L_0x0646:
            r3 = 0
            goto L_0x0cf2
        L_0x0649:
            r24 = r3
            r15 = r20
            r3 = 0
            g(r9, r2, r6, r3)
            r10 = r18
            goto L_0x0627
        L_0x0654:
            r24 = r3
            r15 = r20
            int r3 = r9.f12065S
            int r3 = r2.getDimensionPixelSize(r6, r3)
            r9.f12065S = r3
            goto L_0x0624
        L_0x0661:
            r24 = r3
            r15 = r20
            int r3 = r9.f12058L
            int r3 = r2.getDimensionPixelSize(r6, r3)
            r9.f12058L = r3
            goto L_0x0624
        L_0x066e:
            r24 = r3
            r15 = r20
            int r3 = r9.f12102r
            int r3 = f(r2, r6, r3)
            r9.f12102r = r3
            goto L_0x0624
        L_0x067b:
            r24 = r3
            r15 = r20
            int r3 = r9.f12101q
            int r3 = f(r2, r6, r3)
            r9.f12101q = r3
            goto L_0x0624
        L_0x0688:
            r24 = r3
            r15 = r20
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r14)
            java.lang.String r10 = java.lang.Integer.toHexString(r6)
            r3.append(r10)
            r3.append(r11)
            int r6 = r4.get(r6)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            android.util.Log.w(r0, r3)
            goto L_0x0624
        L_0x06ab:
            r24 = r3
            r15 = r20
            android.util.TypedValue r3 = r2.peekValue(r6)
            int r3 = r3.type
            r10 = 1
            if (r3 != r10) goto L_0x06c1
            r10 = -1
            int r3 = r2.getResourceId(r6, r10)
            r8.f12117i = r3
            goto L_0x0624
        L_0x06c1:
            r10 = 3
            if (r3 != r10) goto L_0x06d9
            java.lang.String r3 = r2.getString(r6)
            r8.h = r3
            int r3 = r3.indexOf(r13)
            if (r3 <= 0) goto L_0x0624
            r3 = -1
            int r6 = r2.getResourceId(r6, r3)
            r8.f12117i = r6
            goto L_0x0624
        L_0x06d9:
            r3 = -1
            int r10 = r8.f12117i
            r2.getInteger(r6, r10)
            goto L_0x0624
        L_0x06e1:
            r24 = r3
            r15 = r20
            r3 = -1
            float r10 = r8.f12116f
            float r6 = r2.getFloat(r6, r10)
            r8.f12116f = r6
            goto L_0x0624
        L_0x06f0:
            r24 = r3
            r15 = r20
            r3 = -1
            int r10 = r8.g
            int r6 = r2.getInteger(r6, r10)
            r8.g = r6
            goto L_0x0624
        L_0x06ff:
            r24 = r3
            r15 = r20
            r3 = -1
            int r10 = r7.h
            int r6 = f(r2, r6, r10)
            r7.h = r6
            goto L_0x0624
        L_0x070e:
            r24 = r3
            r15 = r20
            r3 = -1
            int r10 = r8.f12113b
            int r6 = r2.getInteger(r6, r10)
            r8.f12113b = r6
            goto L_0x0624
        L_0x071d:
            r24 = r3
            r15 = r20
            r3 = -1
            boolean r10 = r9.f12095m0
            boolean r6 = r2.getBoolean(r6, r10)
            r9.f12095m0 = r6
            goto L_0x0624
        L_0x072c:
            r24 = r3
            r15 = r20
            r3 = -1
            boolean r10 = r9.f12093l0
            boolean r6 = r2.getBoolean(r6, r10)
            r9.f12093l0 = r6
            goto L_0x0624
        L_0x073b:
            r24 = r3
            r15 = r20
            r3 = -1
            float r10 = r8.d
            float r6 = r2.getFloat(r6, r10)
            r8.d = r6
            goto L_0x0624
        L_0x074a:
            r24 = r3
            r15 = r20
            r3 = -1
            int r10 = r5.f12119b
            int r6 = r2.getInt(r6, r10)
            r5.f12119b = r6
            goto L_0x0624
        L_0x0759:
            r24 = r3
            r15 = r20
            r3 = -1
            java.lang.String r6 = r2.getString(r6)
            r9.f12091k0 = r6
            goto L_0x0624
        L_0x0766:
            r24 = r3
            r15 = r20
            r3 = -1
            int r10 = r8.f12114c
            int r6 = r2.getInt(r6, r10)
            r8.f12114c = r6
            goto L_0x0624
        L_0x0775:
            r24 = r3
            r15 = r20
            r3 = -1
            boolean r10 = r9.f12097n0
            boolean r6 = r2.getBoolean(r6, r10)
            r9.f12097n0 = r6
            goto L_0x0624
        L_0x0784:
            r24 = r3
            r15 = r20
            r3 = -1
            java.lang.String r6 = r2.getString(r6)
            r9.f12089j0 = r6
            goto L_0x0624
        L_0x0791:
            r24 = r3
            r15 = r20
            r3 = -1
            int r10 = r9.f12084g0
            int r6 = r2.getDimensionPixelSize(r6, r10)
            r9.f12084g0 = r6
            goto L_0x0624
        L_0x07a0:
            r24 = r3
            r15 = r20
            r3 = -1
            int r10 = r9.f12083f0
            int r6 = r2.getInt(r6, r10)
            r9.f12083f0 = r6
            goto L_0x0624
        L_0x07af:
            r24 = r3
            r10 = r18
            r15 = r20
            r3 = -1
            android.util.Log.e(r0, r10)
        L_0x07b9:
            r18 = r0
        L_0x07bb:
            r0 = 1
            goto L_0x0646
        L_0x07be:
            r24 = r3
            r10 = r18
            r15 = r20
            r3 = 1065353216(0x3f800000, float:1.0)
            float r6 = r2.getFloat(r6, r3)
            r9.f12081e0 = r6
            goto L_0x07b9
        L_0x07cd:
            r24 = r3
            r10 = r18
            r15 = r20
            r3 = 1065353216(0x3f800000, float:1.0)
            float r6 = r2.getFloat(r6, r3)
            r9.f12079d0 = r6
            goto L_0x07b9
        L_0x07dc:
            r24 = r3
            r10 = r18
            r15 = r20
            float r3 = r5.d
            float r3 = r2.getFloat(r6, r3)
            r5.d = r3
            goto L_0x07b9
        L_0x07eb:
            r24 = r3
            r10 = r18
            r15 = r20
            float r3 = r8.f12115e
            float r3 = r2.getFloat(r6, r3)
            r8.f12115e = r3
            goto L_0x07b9
        L_0x07fa:
            r24 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r2.getInt(r6, r3)
            r8.getClass()
            goto L_0x0627
        L_0x0809:
            r24 = r3
            r10 = r18
            r15 = r20
            android.util.TypedValue r3 = r2.peekValue(r6)
            int r3 = r3.type
            r18 = r0
            r0 = 3
            if (r3 != r0) goto L_0x0821
            r2.getString(r6)
            r8.getClass()
            goto L_0x07bb
        L_0x0821:
            r3 = 0
            int r6 = r2.getInteger(r6, r3)
            r6 = r17[r6]
            r8.getClass()
            goto L_0x0629
        L_0x082d:
            r24 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r8.f12112a
            int r0 = f(r2, r6, r0)
            r8.f12112a = r0
            goto L_0x0629
        L_0x0840:
            r24 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            float r0 = r9.f12049B
            float r0 = r2.getFloat(r6, r0)
            r9.f12049B = r0
            goto L_0x0629
        L_0x0853:
            r24 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.f12048A
            int r0 = r2.getDimensionPixelSize(r6, r0)
            r9.f12048A = r0
            goto L_0x0629
        L_0x0866:
            r24 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.f12110z
            int r0 = f(r2, r6, r0)
            r9.f12110z = r0
            goto L_0x0629
        L_0x0879:
            r24 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            float r0 = r7.f12122a
            float r0 = r2.getFloat(r6, r0)
            r7.f12122a = r0
            goto L_0x0629
        L_0x088c:
            r24 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.f12078c0
            int r0 = r2.getDimensionPixelSize(r6, r0)
            r9.f12078c0 = r0
            goto L_0x0629
        L_0x089f:
            r24 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.f12076b0
            int r0 = r2.getDimensionPixelSize(r6, r0)
            r9.f12076b0 = r0
            goto L_0x0629
        L_0x08b2:
            r24 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.f12074a0
            int r0 = r2.getDimensionPixelSize(r6, r0)
            r9.f12074a0 = r0
            goto L_0x0629
        L_0x08c5:
            r24 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.f12072Z
            int r0 = r2.getDimensionPixelSize(r6, r0)
            r9.f12072Z = r0
            goto L_0x0629
        L_0x08d8:
            r24 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.f12071Y
            int r0 = r2.getInt(r6, r0)
            r9.f12071Y = r0
            goto L_0x0629
        L_0x08eb:
            r24 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.f12070X
            int r0 = r2.getInt(r6, r0)
            r9.f12070X = r0
            goto L_0x0629
        L_0x08fe:
            r24 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            float r0 = r7.f12129k
            float r0 = r2.getDimension(r6, r0)
            r7.f12129k = r0
            goto L_0x0629
        L_0x0911:
            r24 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            float r0 = r7.f12128j
            float r0 = r2.getDimension(r6, r0)
            r7.f12128j = r0
            goto L_0x0629
        L_0x0924:
            r24 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            float r0 = r7.f12127i
            float r0 = r2.getDimension(r6, r0)
            r7.f12127i = r0
            goto L_0x0629
        L_0x0937:
            r24 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            float r0 = r7.g
            float r0 = r2.getDimension(r6, r0)
            r7.g = r0
            goto L_0x0629
        L_0x094a:
            r24 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            float r0 = r7.f12126f
            float r0 = r2.getDimension(r6, r0)
            r7.f12126f = r0
            goto L_0x0629
        L_0x095d:
            r24 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            float r0 = r7.f12125e
            float r0 = r2.getFloat(r6, r0)
            r7.f12125e = r0
            goto L_0x0629
        L_0x0970:
            r24 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            float r0 = r7.d
            float r0 = r2.getFloat(r6, r0)
            r7.d = r0
            goto L_0x0629
        L_0x0983:
            r24 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            float r0 = r7.f12124c
            float r0 = r2.getFloat(r6, r0)
            r7.f12124c = r0
            goto L_0x0629
        L_0x0996:
            r24 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            float r0 = r7.f12123b
            float r0 = r2.getFloat(r6, r0)
            r7.f12123b = r0
            goto L_0x0629
        L_0x09a9:
            r24 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            r0 = 1
            r7.f12130l = r0
            float r0 = r7.f12131m
            float r0 = r2.getDimension(r6, r0)
            r7.f12131m = r0
            goto L_0x0629
        L_0x09bf:
            r24 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            float r0 = r5.f12120c
            float r0 = r2.getFloat(r6, r0)
            r5.f12120c = r0
            goto L_0x0629
        L_0x09d2:
            r24 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.f12069W
            int r0 = r2.getInt(r6, r0)
            r9.f12069W = r0
            goto L_0x0629
        L_0x09e5:
            r24 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.f12068V
            int r0 = r2.getInt(r6, r0)
            r9.f12068V = r0
            goto L_0x0629
        L_0x09f8:
            r24 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            float r0 = r9.f12066T
            float r0 = r2.getFloat(r6, r0)
            r9.f12066T = r0
            goto L_0x0629
        L_0x0a0b:
            r24 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            float r0 = r9.f12067U
            float r0 = r2.getFloat(r6, r0)
            r9.f12067U = r0
            goto L_0x0629
        L_0x0a1e:
            r24 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r1.f12042a
            int r0 = r2.getResourceId(r6, r0)
            r1.f12042a = r0
            goto L_0x0629
        L_0x0a31:
            r24 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            float r0 = r9.f12108x
            float r0 = r2.getFloat(r6, r0)
            r9.f12108x = r0
            goto L_0x0629
        L_0x0a44:
            r24 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.f12092l
            int r0 = f(r2, r6, r0)
            r9.f12092l = r0
            goto L_0x0629
        L_0x0a57:
            r24 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.f12094m
            int r0 = f(r2, r6, r0)
            r9.f12094m = r0
            goto L_0x0629
        L_0x0a6a:
            r24 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.f12054H
            int r0 = r2.getDimensionPixelSize(r6, r0)
            r9.f12054H = r0
            goto L_0x0629
        L_0x0a7d:
            r24 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.f12104t
            int r0 = f(r2, r6, r0)
            r9.f12104t = r0
            goto L_0x0629
        L_0x0a90:
            r24 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.f12103s
            int r0 = f(r2, r6, r0)
            r9.f12103s = r0
            goto L_0x0629
        L_0x0aa3:
            r24 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.f12057K
            int r0 = r2.getDimensionPixelSize(r6, r0)
            r9.f12057K = r0
            goto L_0x0629
        L_0x0ab6:
            r24 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.f12090k
            int r0 = f(r2, r6, r0)
            r9.f12090k = r0
            goto L_0x0629
        L_0x0ac9:
            r24 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.f12088j
            int r0 = f(r2, r6, r0)
            r9.f12088j = r0
            goto L_0x0629
        L_0x0adc:
            r24 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.f12053G
            int r0 = r2.getDimensionPixelSize(r6, r0)
            r9.f12053G = r0
            goto L_0x0629
        L_0x0aef:
            r24 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.f12052E
            int r0 = r2.getInt(r6, r0)
            r9.f12052E = r0
            goto L_0x0629
        L_0x0b02:
            r24 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.f12086i
            int r0 = f(r2, r6, r0)
            r9.f12086i = r0
            goto L_0x0629
        L_0x0b15:
            r24 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.h
            int r0 = f(r2, r6, r0)
            r9.h = r0
            goto L_0x0629
        L_0x0b28:
            r24 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.F
            int r0 = r2.getDimensionPixelSize(r6, r0)
            r9.F = r0
            goto L_0x0629
        L_0x0b3b:
            r24 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.f12075b
            int r0 = r2.getLayoutDimension(r6, r0)
            r9.f12075b = r0
            goto L_0x0629
        L_0x0b4e:
            r24 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r5.f12118a
            int r0 = r2.getInt(r6, r0)
            r5.f12118a = r0
            r0 = r16[r0]
            r5.f12118a = r0
            goto L_0x0629
        L_0x0b65:
            r24 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.f12077c
            int r0 = r2.getLayoutDimension(r6, r0)
            r9.f12077c = r0
            goto L_0x0629
        L_0x0b78:
            r24 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            float r0 = r9.f12107w
            float r0 = r2.getFloat(r6, r0)
            r9.f12107w = r0
            goto L_0x0629
        L_0x0b8b:
            r24 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            float r0 = r9.f12082f
            float r0 = r2.getFloat(r6, r0)
            r9.f12082f = r0
            goto L_0x0629
        L_0x0b9e:
            r24 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.f12080e
            int r0 = r2.getDimensionPixelOffset(r6, r0)
            r9.f12080e = r0
            goto L_0x0629
        L_0x0bb1:
            r24 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.d
            int r0 = r2.getDimensionPixelOffset(r6, r0)
            r9.d = r0
            goto L_0x0629
        L_0x0bc4:
            r24 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.f12060N
            int r0 = r2.getDimensionPixelSize(r6, r0)
            r9.f12060N = r0
            goto L_0x0629
        L_0x0bd7:
            r24 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.f12064R
            int r0 = r2.getDimensionPixelSize(r6, r0)
            r9.f12064R = r0
            goto L_0x0629
        L_0x0bea:
            r24 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.f12061O
            int r0 = r2.getDimensionPixelSize(r6, r0)
            r9.f12061O = r0
            goto L_0x0629
        L_0x0bfd:
            r24 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.f12059M
            int r0 = r2.getDimensionPixelSize(r6, r0)
            r9.f12059M = r0
            goto L_0x0629
        L_0x0c10:
            r24 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.f12063Q
            int r0 = r2.getDimensionPixelSize(r6, r0)
            r9.f12063Q = r0
            goto L_0x0629
        L_0x0c23:
            r24 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.f12062P
            int r0 = r2.getDimensionPixelSize(r6, r0)
            r9.f12062P = r0
            goto L_0x0629
        L_0x0c36:
            r24 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.f12105u
            int r0 = f(r2, r6, r0)
            r9.f12105u = r0
            goto L_0x0629
        L_0x0c49:
            r24 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.f12106v
            int r0 = f(r2, r6, r0)
            r9.f12106v = r0
            goto L_0x0629
        L_0x0c5c:
            r24 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.f12056J
            int r0 = r2.getDimensionPixelSize(r6, r0)
            r9.f12056J = r0
            goto L_0x0629
        L_0x0c6f:
            r24 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.f12051D
            int r0 = r2.getDimensionPixelOffset(r6, r0)
            r9.f12051D = r0
            goto L_0x0629
        L_0x0c82:
            r24 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.f12050C
            int r0 = r2.getDimensionPixelOffset(r6, r0)
            r9.f12050C = r0
            goto L_0x0629
        L_0x0c95:
            r24 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            java.lang.String r0 = r2.getString(r6)
            r9.f12109y = r0
            goto L_0x0629
        L_0x0ca6:
            r24 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.f12096n
            int r0 = f(r2, r6, r0)
            r9.f12096n = r0
            goto L_0x0629
        L_0x0cb9:
            r24 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.f12098o
            int r0 = f(r2, r6, r0)
            r9.f12098o = r0
            goto L_0x0629
        L_0x0ccc:
            r24 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.f12055I
            int r0 = r2.getDimensionPixelSize(r6, r0)
            r9.f12055I = r0
            goto L_0x0629
        L_0x0cdf:
            r24 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.f12100p
            int r0 = f(r2, r6, r0)
            r9.f12100p = r0
            goto L_0x0629
        L_0x0cf2:
            int r12 = r12 + r0
            r3 = r24
            r20 = r15
            r21 = r10
            r10 = r0
            r0 = r18
            r18 = r21
            goto L_0x05de
        L_0x0d00:
            java.lang.String r0 = r9.f12089j0
            if (r0 == 0) goto L_0x0d07
            r0 = 0
            r9.f12087i0 = r0
        L_0x0d07:
            r2.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: v.n.d(android.content.Context, android.util.AttributeSet, boolean):v.i");
    }

    public static int f(TypedArray typedArray, int i2, int i5) {
        int resourceId = typedArray.getResourceId(i2, i5);
        if (resourceId == -1) {
            return typedArray.getInt(i2, -1);
        }
        return resourceId;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void g(java.lang.Object r7, android.content.res.TypedArray r8, int r9, int r10) {
        /*
            if (r7 != 0) goto L_0x0003
            return
        L_0x0003:
            android.util.TypedValue r0 = r8.peekValue(r9)
            int r0 = r0.type
            r1 = 3
            r2 = 23
            r3 = 21
            r4 = 1
            r5 = 5
            r6 = 0
            if (r0 == r1) goto L_0x006f
            if (r0 == r5) goto L_0x002c
            int r8 = r8.getInt(r9, r6)
            r9 = -4
            r0 = -2
            if (r8 == r9) goto L_0x002a
            r9 = -3
            if (r8 == r9) goto L_0x0025
            if (r8 == r0) goto L_0x0027
            r9 = -1
            if (r8 == r9) goto L_0x0027
        L_0x0025:
            r4 = r6
            goto L_0x0031
        L_0x0027:
            r4 = r6
            r6 = r8
            goto L_0x0031
        L_0x002a:
            r6 = r0
            goto L_0x0031
        L_0x002c:
            int r8 = r8.getDimensionPixelSize(r9, r6)
            goto L_0x0027
        L_0x0031:
            boolean r8 = r7 instanceof v.e
            if (r8 == 0) goto L_0x0043
            v.e r7 = (v.e) r7
            if (r10 != 0) goto L_0x003e
            r7.width = r6
            r7.f11981W = r4
            goto L_0x006e
        L_0x003e:
            r7.height = r6
            r7.f11982X = r4
            goto L_0x006e
        L_0x0043:
            boolean r8 = r7 instanceof v.j
            if (r8 == 0) goto L_0x0055
            v.j r7 = (v.j) r7
            if (r10 != 0) goto L_0x0050
            r7.f12075b = r6
            r7.f12093l0 = r4
            goto L_0x006e
        L_0x0050:
            r7.f12077c = r6
            r7.f12095m0 = r4
            goto L_0x006e
        L_0x0055:
            boolean r8 = r7 instanceof v.h
            if (r8 == 0) goto L_0x006e
            v.h r7 = (v.h) r7
            if (r10 != 0) goto L_0x0066
            r7.b(r2, r6)
            r8 = 80
            r7.d(r8, r4)
            goto L_0x006e
        L_0x0066:
            r7.b(r3, r6)
            r8 = 81
            r7.d(r8, r4)
        L_0x006e:
            return
        L_0x006f:
            java.lang.String r8 = r8.getString(r9)
            if (r8 != 0) goto L_0x0077
            goto L_0x0177
        L_0x0077:
            r9 = 61
            int r9 = r8.indexOf(r9)
            int r0 = r8.length()
            if (r9 <= 0) goto L_0x0177
            int r0 = r0 - r4
            if (r9 >= r0) goto L_0x0177
            java.lang.String r0 = r8.substring(r6, r9)
            int r9 = r9 + r4
            java.lang.String r8 = r8.substring(r9)
            int r9 = r8.length()
            if (r9 <= 0) goto L_0x0177
            java.lang.String r9 = r0.trim()
            java.lang.String r8 = r8.trim()
            java.lang.String r0 = "ratio"
            boolean r0 = r0.equalsIgnoreCase(r9)
            if (r0 == 0) goto L_0x00cc
            boolean r9 = r7 instanceof v.e
            if (r9 == 0) goto L_0x00b7
            v.e r7 = (v.e) r7
            if (r10 != 0) goto L_0x00b0
            r7.width = r6
            goto L_0x00b2
        L_0x00b0:
            r7.height = r6
        L_0x00b2:
            h(r7, r8)
            goto L_0x0177
        L_0x00b7:
            boolean r9 = r7 instanceof v.j
            if (r9 == 0) goto L_0x00c1
            v.j r7 = (v.j) r7
            r7.f12109y = r8
            goto L_0x0177
        L_0x00c1:
            boolean r9 = r7 instanceof v.h
            if (r9 == 0) goto L_0x0177
            v.h r7 = (v.h) r7
            r7.c(r5, r8)
            goto L_0x0177
        L_0x00cc:
            java.lang.String r0 = "weight"
            boolean r0 = r0.equalsIgnoreCase(r9)
            if (r0 == 0) goto L_0x011a
            float r8 = java.lang.Float.parseFloat(r8)     // Catch:{ NumberFormatException -> 0x0177 }
            boolean r9 = r7 instanceof v.e     // Catch:{ NumberFormatException -> 0x0177 }
            if (r9 == 0) goto L_0x00ec
            v.e r7 = (v.e) r7     // Catch:{ NumberFormatException -> 0x0177 }
            if (r10 != 0) goto L_0x00e6
            r7.width = r6     // Catch:{ NumberFormatException -> 0x0177 }
            r7.f11966H = r8     // Catch:{ NumberFormatException -> 0x0177 }
            goto L_0x0177
        L_0x00e6:
            r7.height = r6     // Catch:{ NumberFormatException -> 0x0177 }
            r7.f11967I = r8     // Catch:{ NumberFormatException -> 0x0177 }
            goto L_0x0177
        L_0x00ec:
            boolean r9 = r7 instanceof v.j     // Catch:{ NumberFormatException -> 0x0177 }
            if (r9 == 0) goto L_0x0100
            v.j r7 = (v.j) r7     // Catch:{ NumberFormatException -> 0x0177 }
            if (r10 != 0) goto L_0x00fa
            r7.f12075b = r6     // Catch:{ NumberFormatException -> 0x0177 }
            r7.f12067U = r8     // Catch:{ NumberFormatException -> 0x0177 }
            goto L_0x0177
        L_0x00fa:
            r7.f12077c = r6     // Catch:{ NumberFormatException -> 0x0177 }
            r7.f12066T = r8     // Catch:{ NumberFormatException -> 0x0177 }
            goto L_0x0177
        L_0x0100:
            boolean r9 = r7 instanceof v.h     // Catch:{ NumberFormatException -> 0x0177 }
            if (r9 == 0) goto L_0x0177
            v.h r7 = (v.h) r7     // Catch:{ NumberFormatException -> 0x0177 }
            if (r10 != 0) goto L_0x0111
            r7.b(r2, r6)     // Catch:{ NumberFormatException -> 0x0177 }
            r9 = 39
            r7.a(r9, r8)     // Catch:{ NumberFormatException -> 0x0177 }
            goto L_0x0177
        L_0x0111:
            r7.b(r3, r6)     // Catch:{ NumberFormatException -> 0x0177 }
            r9 = 40
            r7.a(r9, r8)     // Catch:{ NumberFormatException -> 0x0177 }
            goto L_0x0177
        L_0x011a:
            java.lang.String r0 = "parent"
            boolean r9 = r0.equalsIgnoreCase(r9)
            if (r9 == 0) goto L_0x0177
            float r8 = java.lang.Float.parseFloat(r8)     // Catch:{ NumberFormatException -> 0x0177 }
            r9 = 1065353216(0x3f800000, float:1.0)
            float r8 = java.lang.Math.min(r9, r8)     // Catch:{ NumberFormatException -> 0x0177 }
            r9 = 0
            float r8 = java.lang.Math.max(r9, r8)     // Catch:{ NumberFormatException -> 0x0177 }
            boolean r9 = r7 instanceof v.e     // Catch:{ NumberFormatException -> 0x0177 }
            r0 = 2
            if (r9 == 0) goto L_0x0148
            v.e r7 = (v.e) r7     // Catch:{ NumberFormatException -> 0x0177 }
            if (r10 != 0) goto L_0x0141
            r7.width = r6     // Catch:{ NumberFormatException -> 0x0177 }
            r7.f11976R = r8     // Catch:{ NumberFormatException -> 0x0177 }
            r7.f11970L = r0     // Catch:{ NumberFormatException -> 0x0177 }
            goto L_0x0177
        L_0x0141:
            r7.height = r6     // Catch:{ NumberFormatException -> 0x0177 }
            r7.f11977S = r8     // Catch:{ NumberFormatException -> 0x0177 }
            r7.f11971M = r0     // Catch:{ NumberFormatException -> 0x0177 }
            goto L_0x0177
        L_0x0148:
            boolean r9 = r7 instanceof v.j     // Catch:{ NumberFormatException -> 0x0177 }
            if (r9 == 0) goto L_0x015e
            v.j r7 = (v.j) r7     // Catch:{ NumberFormatException -> 0x0177 }
            if (r10 != 0) goto L_0x0157
            r7.f12075b = r6     // Catch:{ NumberFormatException -> 0x0177 }
            r7.f12079d0 = r8     // Catch:{ NumberFormatException -> 0x0177 }
            r7.f12070X = r0     // Catch:{ NumberFormatException -> 0x0177 }
            goto L_0x0177
        L_0x0157:
            r7.f12077c = r6     // Catch:{ NumberFormatException -> 0x0177 }
            r7.f12081e0 = r8     // Catch:{ NumberFormatException -> 0x0177 }
            r7.f12071Y = r0     // Catch:{ NumberFormatException -> 0x0177 }
            goto L_0x0177
        L_0x015e:
            boolean r8 = r7 instanceof v.h     // Catch:{ NumberFormatException -> 0x0177 }
            if (r8 == 0) goto L_0x0177
            v.h r7 = (v.h) r7     // Catch:{ NumberFormatException -> 0x0177 }
            if (r10 != 0) goto L_0x016f
            r7.b(r2, r6)     // Catch:{ NumberFormatException -> 0x0177 }
            r8 = 54
            r7.b(r8, r0)     // Catch:{ NumberFormatException -> 0x0177 }
            goto L_0x0177
        L_0x016f:
            r7.b(r3, r6)     // Catch:{ NumberFormatException -> 0x0177 }
            r8 = 55
            r7.b(r8, r0)     // Catch:{ NumberFormatException -> 0x0177 }
        L_0x0177:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v.n.g(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    public static void h(e eVar, String str) {
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            char c3 = 65535;
            int i2 = 0;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (substring.equalsIgnoreCase("W")) {
                    c3 = 0;
                } else if (substring.equalsIgnoreCase("H")) {
                    c3 = 1;
                }
                i2 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            if (indexOf2 < 0 || indexOf2 >= length - 1) {
                String substring2 = str.substring(i2);
                if (substring2.length() > 0) {
                    Float.parseFloat(substring2);
                }
            } else {
                String substring3 = str.substring(i2, indexOf2);
                String substring4 = str.substring(indexOf2 + 1);
                if (substring3.length() > 0 && substring4.length() > 0) {
                    try {
                        float parseFloat = Float.parseFloat(substring3);
                        float parseFloat2 = Float.parseFloat(substring4);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            if (c3 == 1) {
                                Math.abs(parseFloat2 / parseFloat);
                            } else {
                                Math.abs(parseFloat / parseFloat2);
                            }
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
        eVar.f11965G = str;
    }

    /* JADX WARNING: type inference failed for: r5v3, types: [v.a, android.view.View, v.c] */
    /* JADX WARNING: type inference failed for: r7v5, types: [s.a, s.i] */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0103, code lost:
        r18 = r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(androidx.constraintlayout.widget.ConstraintLayout r20) {
        /*
            r19 = this;
            r1 = r19
            r2 = r20
            r3 = 1
            int r4 = r20.getChildCount()
            java.util.HashSet r5 = new java.util.HashSet
            java.util.HashMap r6 = r1.f12136c
            java.util.Set r0 = r6.keySet()
            r5.<init>(r0)
            r8 = 0
        L_0x0015:
            if (r8 >= r4) goto L_0x0305
            android.view.View r9 = r2.getChildAt(r8)
            int r0 = r9.getId()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            boolean r10 = r6.containsKey(r10)
            java.lang.String r11 = "ConstraintSet"
            if (r10 != 0) goto L_0x0054
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r10 = "id unknown "
            r0.<init>(r10)
            android.content.Context r10 = r9.getContext()     // Catch:{ Exception -> 0x0043 }
            android.content.res.Resources r10 = r10.getResources()     // Catch:{ Exception -> 0x0043 }
            int r9 = r9.getId()     // Catch:{ Exception -> 0x0043 }
            java.lang.String r9 = r10.getResourceEntryName(r9)     // Catch:{ Exception -> 0x0043 }
            goto L_0x0045
        L_0x0043:
            java.lang.String r9 = "UNKNOWN"
        L_0x0045:
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r11, r0)
        L_0x004f:
            r1 = r3
            r18 = r4
            goto L_0x02fd
        L_0x0054:
            boolean r10 = r1.f12135b
            r12 = -1
            if (r10 == 0) goto L_0x0064
            if (r0 == r12) goto L_0x005c
            goto L_0x0064
        L_0x005c:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r2 = "All children of ConstraintLayout must have ids to use ConstraintSet"
            r0.<init>(r2)
            throw r0
        L_0x0064:
            if (r0 != r12) goto L_0x0067
        L_0x0066:
            goto L_0x004f
        L_0x0067:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            boolean r10 = r6.containsKey(r10)
            if (r10 == 0) goto L_0x02e9
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            r5.remove(r10)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            java.lang.Object r10 = r6.get(r10)
            v.i r10 = (v.i) r10
            if (r10 != 0) goto L_0x0085
            goto L_0x0066
        L_0x0085:
            boolean r11 = r9 instanceof v.C1035a
            if (r11 == 0) goto L_0x00b7
            v.j r11 = r10.d
            r11.f12085h0 = r3
            r13 = r9
            v.a r13 = (v.C1035a) r13
            r13.setId(r0)
            int r0 = r11.f12083f0
            r13.setType(r0)
            int r0 = r11.f12084g0
            r13.setMargin(r0)
            boolean r0 = r11.f12097n0
            r13.setAllowsGoneWidget(r0)
            int[] r0 = r11.f12087i0
            if (r0 == 0) goto L_0x00aa
            r13.setReferencedIds(r0)
            goto L_0x00b7
        L_0x00aa:
            java.lang.String r0 = r11.f12089j0
            if (r0 == 0) goto L_0x00b7
            int[] r0 = c(r13, r0)
            r11.f12087i0 = r0
            r13.setReferencedIds(r0)
        L_0x00b7:
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            r11 = r0
            v.e r11 = (v.e) r11
            r11.a()
            r10.a(r11)
            java.util.HashMap r13 = r10.f12046f
            java.lang.String r14 = "\" not found on "
            java.lang.String r15 = " Custom Attribute \""
            java.lang.String r7 = "TransitionLayout"
            java.lang.Class r3 = r9.getClass()
            java.util.Set r0 = r13.keySet()
            java.util.Iterator r16 = r0.iterator()
        L_0x00d8:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0231
            java.lang.Object r0 = r16.next()
            r12 = r0
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r0 = r13.get(r12)
            v.b r0 = (v.C1036b) r0
            boolean r1 = r0.f11948a
            if (r1 != 0) goto L_0x00f8
            java.lang.String r1 = "set"
            java.lang.String r1 = o3.d.i(r1, r12)
        L_0x00f5:
            r17 = r13
            goto L_0x00fa
        L_0x00f8:
            r1 = r12
            goto L_0x00f5
        L_0x00fa:
            int r13 = r0.f11949b     // Catch:{ NoSuchMethodException -> 0x0129, IllegalAccessException -> 0x0124, InvocationTargetException -> 0x011f }
            int r13 = q.C0928e.c(r13)     // Catch:{ NoSuchMethodException -> 0x0129, IllegalAccessException -> 0x0124, InvocationTargetException -> 0x011f }
            switch(r13) {
                case 0: goto L_0x01cd;
                case 1: goto L_0x01b3;
                case 2: goto L_0x0198;
                case 3: goto L_0x0172;
                case 4: goto L_0x015e;
                case 5: goto L_0x0146;
                case 6: goto L_0x012e;
                case 7: goto L_0x0107;
                default: goto L_0x0103;
            }     // Catch:{ NoSuchMethodException -> 0x0129, IllegalAccessException -> 0x0124, InvocationTargetException -> 0x011f }
        L_0x0103:
            r18 = r4
            goto L_0x0228
        L_0x0107:
            java.lang.Class r13 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x0129, IllegalAccessException -> 0x0124, InvocationTargetException -> 0x011f }
            java.lang.Class[] r13 = new java.lang.Class[]{r13}     // Catch:{ NoSuchMethodException -> 0x0129, IllegalAccessException -> 0x0124, InvocationTargetException -> 0x011f }
            java.lang.reflect.Method r13 = r3.getMethod(r1, r13)     // Catch:{ NoSuchMethodException -> 0x0129, IllegalAccessException -> 0x0124, InvocationTargetException -> 0x011f }
            int r0 = r0.f11950c     // Catch:{ NoSuchMethodException -> 0x0129, IllegalAccessException -> 0x0124, InvocationTargetException -> 0x011f }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NoSuchMethodException -> 0x0129, IllegalAccessException -> 0x0124, InvocationTargetException -> 0x011f }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ NoSuchMethodException -> 0x0129, IllegalAccessException -> 0x0124, InvocationTargetException -> 0x011f }
            r13.invoke(r9, r0)     // Catch:{ NoSuchMethodException -> 0x0129, IllegalAccessException -> 0x0124, InvocationTargetException -> 0x011f }
            goto L_0x0103
        L_0x011f:
            r0 = move-exception
            r18 = r4
            goto L_0x01e7
        L_0x0124:
            r0 = move-exception
            r18 = r4
            goto L_0x01fa
        L_0x0129:
            r0 = move-exception
            r18 = r4
            goto L_0x020d
        L_0x012e:
            java.lang.Class r13 = java.lang.Float.TYPE     // Catch:{ NoSuchMethodException -> 0x0129, IllegalAccessException -> 0x0124, InvocationTargetException -> 0x011f }
            java.lang.Class[] r13 = new java.lang.Class[]{r13}     // Catch:{ NoSuchMethodException -> 0x0129, IllegalAccessException -> 0x0124, InvocationTargetException -> 0x011f }
            java.lang.reflect.Method r13 = r3.getMethod(r1, r13)     // Catch:{ NoSuchMethodException -> 0x0129, IllegalAccessException -> 0x0124, InvocationTargetException -> 0x011f }
            float r0 = r0.d     // Catch:{ NoSuchMethodException -> 0x0129, IllegalAccessException -> 0x0124, InvocationTargetException -> 0x011f }
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch:{ NoSuchMethodException -> 0x0129, IllegalAccessException -> 0x0124, InvocationTargetException -> 0x011f }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ NoSuchMethodException -> 0x0129, IllegalAccessException -> 0x0124, InvocationTargetException -> 0x011f }
            r13.invoke(r9, r0)     // Catch:{ NoSuchMethodException -> 0x0129, IllegalAccessException -> 0x0124, InvocationTargetException -> 0x011f }
            goto L_0x0103
        L_0x0146:
            java.lang.Class r13 = java.lang.Boolean.TYPE     // Catch:{ NoSuchMethodException -> 0x0129, IllegalAccessException -> 0x0124, InvocationTargetException -> 0x011f }
            java.lang.Class[] r13 = new java.lang.Class[]{r13}     // Catch:{ NoSuchMethodException -> 0x0129, IllegalAccessException -> 0x0124, InvocationTargetException -> 0x011f }
            java.lang.reflect.Method r13 = r3.getMethod(r1, r13)     // Catch:{ NoSuchMethodException -> 0x0129, IllegalAccessException -> 0x0124, InvocationTargetException -> 0x011f }
            boolean r0 = r0.f11952f     // Catch:{ NoSuchMethodException -> 0x0129, IllegalAccessException -> 0x0124, InvocationTargetException -> 0x011f }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ NoSuchMethodException -> 0x0129, IllegalAccessException -> 0x0124, InvocationTargetException -> 0x011f }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ NoSuchMethodException -> 0x0129, IllegalAccessException -> 0x0124, InvocationTargetException -> 0x011f }
            r13.invoke(r9, r0)     // Catch:{ NoSuchMethodException -> 0x0129, IllegalAccessException -> 0x0124, InvocationTargetException -> 0x011f }
            goto L_0x0103
        L_0x015e:
            java.lang.Class<java.lang.CharSequence> r13 = java.lang.CharSequence.class
            java.lang.Class[] r13 = new java.lang.Class[]{r13}     // Catch:{ NoSuchMethodException -> 0x0129, IllegalAccessException -> 0x0124, InvocationTargetException -> 0x011f }
            java.lang.reflect.Method r13 = r3.getMethod(r1, r13)     // Catch:{ NoSuchMethodException -> 0x0129, IllegalAccessException -> 0x0124, InvocationTargetException -> 0x011f }
            java.lang.String r0 = r0.f11951e     // Catch:{ NoSuchMethodException -> 0x0129, IllegalAccessException -> 0x0124, InvocationTargetException -> 0x011f }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ NoSuchMethodException -> 0x0129, IllegalAccessException -> 0x0124, InvocationTargetException -> 0x011f }
            r13.invoke(r9, r0)     // Catch:{ NoSuchMethodException -> 0x0129, IllegalAccessException -> 0x0124, InvocationTargetException -> 0x011f }
            goto L_0x0103
        L_0x0172:
            java.lang.Class<android.graphics.drawable.Drawable> r13 = android.graphics.drawable.Drawable.class
            java.lang.Class[] r13 = new java.lang.Class[]{r13}     // Catch:{ NoSuchMethodException -> 0x0129, IllegalAccessException -> 0x0124, InvocationTargetException -> 0x011f }
            java.lang.reflect.Method r13 = r3.getMethod(r1, r13)     // Catch:{ NoSuchMethodException -> 0x0129, IllegalAccessException -> 0x0124, InvocationTargetException -> 0x011f }
            r18 = r4
            android.graphics.drawable.ColorDrawable r4 = new android.graphics.drawable.ColorDrawable     // Catch:{ NoSuchMethodException -> 0x0195, IllegalAccessException -> 0x0193, InvocationTargetException -> 0x0191 }
            r4.<init>()     // Catch:{ NoSuchMethodException -> 0x0195, IllegalAccessException -> 0x0193, InvocationTargetException -> 0x0191 }
            int r0 = r0.g     // Catch:{ NoSuchMethodException -> 0x0195, IllegalAccessException -> 0x0193, InvocationTargetException -> 0x0191 }
            r4.setColor(r0)     // Catch:{ NoSuchMethodException -> 0x0195, IllegalAccessException -> 0x0193, InvocationTargetException -> 0x0191 }
            java.lang.Object[] r0 = new java.lang.Object[]{r4}     // Catch:{ NoSuchMethodException -> 0x0195, IllegalAccessException -> 0x0193, InvocationTargetException -> 0x0191 }
            r13.invoke(r9, r0)     // Catch:{ NoSuchMethodException -> 0x0195, IllegalAccessException -> 0x0193, InvocationTargetException -> 0x0191 }
            goto L_0x0228
        L_0x0191:
            r0 = move-exception
            goto L_0x01e7
        L_0x0193:
            r0 = move-exception
            goto L_0x01fa
        L_0x0195:
            r0 = move-exception
            goto L_0x020d
        L_0x0198:
            r18 = r4
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x0195, IllegalAccessException -> 0x0193, InvocationTargetException -> 0x0191 }
            java.lang.Class[] r4 = new java.lang.Class[]{r4}     // Catch:{ NoSuchMethodException -> 0x0195, IllegalAccessException -> 0x0193, InvocationTargetException -> 0x0191 }
            java.lang.reflect.Method r4 = r3.getMethod(r1, r4)     // Catch:{ NoSuchMethodException -> 0x0195, IllegalAccessException -> 0x0193, InvocationTargetException -> 0x0191 }
            int r0 = r0.g     // Catch:{ NoSuchMethodException -> 0x0195, IllegalAccessException -> 0x0193, InvocationTargetException -> 0x0191 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NoSuchMethodException -> 0x0195, IllegalAccessException -> 0x0193, InvocationTargetException -> 0x0191 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ NoSuchMethodException -> 0x0195, IllegalAccessException -> 0x0193, InvocationTargetException -> 0x0191 }
            r4.invoke(r9, r0)     // Catch:{ NoSuchMethodException -> 0x0195, IllegalAccessException -> 0x0193, InvocationTargetException -> 0x0191 }
            goto L_0x0228
        L_0x01b3:
            r18 = r4
            java.lang.Class r4 = java.lang.Float.TYPE     // Catch:{ NoSuchMethodException -> 0x0195, IllegalAccessException -> 0x0193, InvocationTargetException -> 0x0191 }
            java.lang.Class[] r4 = new java.lang.Class[]{r4}     // Catch:{ NoSuchMethodException -> 0x0195, IllegalAccessException -> 0x0193, InvocationTargetException -> 0x0191 }
            java.lang.reflect.Method r4 = r3.getMethod(r1, r4)     // Catch:{ NoSuchMethodException -> 0x0195, IllegalAccessException -> 0x0193, InvocationTargetException -> 0x0191 }
            float r0 = r0.d     // Catch:{ NoSuchMethodException -> 0x0195, IllegalAccessException -> 0x0193, InvocationTargetException -> 0x0191 }
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch:{ NoSuchMethodException -> 0x0195, IllegalAccessException -> 0x0193, InvocationTargetException -> 0x0191 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ NoSuchMethodException -> 0x0195, IllegalAccessException -> 0x0193, InvocationTargetException -> 0x0191 }
            r4.invoke(r9, r0)     // Catch:{ NoSuchMethodException -> 0x0195, IllegalAccessException -> 0x0193, InvocationTargetException -> 0x0191 }
            goto L_0x0228
        L_0x01cd:
            r18 = r4
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x0195, IllegalAccessException -> 0x0193, InvocationTargetException -> 0x0191 }
            java.lang.Class[] r4 = new java.lang.Class[]{r4}     // Catch:{ NoSuchMethodException -> 0x0195, IllegalAccessException -> 0x0193, InvocationTargetException -> 0x0191 }
            java.lang.reflect.Method r4 = r3.getMethod(r1, r4)     // Catch:{ NoSuchMethodException -> 0x0195, IllegalAccessException -> 0x0193, InvocationTargetException -> 0x0191 }
            int r0 = r0.f11950c     // Catch:{ NoSuchMethodException -> 0x0195, IllegalAccessException -> 0x0193, InvocationTargetException -> 0x0191 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NoSuchMethodException -> 0x0195, IllegalAccessException -> 0x0193, InvocationTargetException -> 0x0191 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ NoSuchMethodException -> 0x0195, IllegalAccessException -> 0x0193, InvocationTargetException -> 0x0191 }
            r4.invoke(r9, r0)     // Catch:{ NoSuchMethodException -> 0x0195, IllegalAccessException -> 0x0193, InvocationTargetException -> 0x0191 }
            goto L_0x0228
        L_0x01e7:
            java.lang.StringBuilder r1 = h0.C0552a.t(r15, r12, r14)
            java.lang.String r4 = r3.getName()
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r7, r1, r0)
            goto L_0x0228
        L_0x01fa:
            java.lang.StringBuilder r1 = h0.C0552a.t(r15, r12, r14)
            java.lang.String r4 = r3.getName()
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r7, r1, r0)
            goto L_0x0228
        L_0x020d:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r12 = r3.getName()
            r4.append(r12)
            java.lang.String r12 = " must have a method "
            r4.append(r12)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            android.util.Log.e(r7, r1, r0)
        L_0x0228:
            r1 = r19
            r13 = r17
            r4 = r18
            r12 = -1
            goto L_0x00d8
        L_0x0231:
            r18 = r4
            r9.setLayoutParams(r11)
            v.l r0 = r10.f12043b
            int r1 = r0.f12119b
            if (r1 != 0) goto L_0x0241
            int r1 = r0.f12118a
            r9.setVisibility(r1)
        L_0x0241:
            float r0 = r0.f12120c
            r9.setAlpha(r0)
            v.m r0 = r10.f12045e
            float r1 = r0.f12122a
            r9.setRotation(r1)
            float r1 = r0.f12123b
            r9.setRotationX(r1)
            float r1 = r0.f12124c
            r9.setRotationY(r1)
            float r1 = r0.d
            r9.setScaleX(r1)
            float r1 = r0.f12125e
            r9.setScaleY(r1)
            int r1 = r0.h
            r3 = -1
            if (r1 == r3) goto L_0x02b5
            android.view.ViewParent r1 = r9.getParent()
            android.view.View r1 = (android.view.View) r1
            int r3 = r0.h
            android.view.View r1 = r1.findViewById(r3)
            if (r1 == 0) goto L_0x02cf
            int r3 = r1.getTop()
            int r4 = r1.getBottom()
            int r4 = r4 + r3
            float r3 = (float) r4
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r4
            int r7 = r1.getLeft()
            int r1 = r1.getRight()
            int r1 = r1 + r7
            float r1 = (float) r1
            float r1 = r1 / r4
            int r4 = r9.getRight()
            int r7 = r9.getLeft()
            int r4 = r4 - r7
            if (r4 <= 0) goto L_0x02cf
            int r4 = r9.getBottom()
            int r7 = r9.getTop()
            int r4 = r4 - r7
            if (r4 <= 0) goto L_0x02cf
            int r4 = r9.getLeft()
            float r4 = (float) r4
            float r1 = r1 - r4
            int r4 = r9.getTop()
            float r4 = (float) r4
            float r3 = r3 - r4
            r9.setPivotX(r1)
            r9.setPivotY(r3)
            goto L_0x02cf
        L_0x02b5:
            float r1 = r0.f12126f
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x02c2
            float r1 = r0.f12126f
            r9.setPivotX(r1)
        L_0x02c2:
            float r1 = r0.g
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x02cf
            float r1 = r0.g
            r9.setPivotY(r1)
        L_0x02cf:
            float r1 = r0.f12127i
            r9.setTranslationX(r1)
            float r1 = r0.f12128j
            r9.setTranslationY(r1)
            float r1 = r0.f12129k
            r9.setTranslationZ(r1)
            boolean r1 = r0.f12130l
            if (r1 == 0) goto L_0x02e7
            float r0 = r0.f12131m
            r9.setElevation(r0)
        L_0x02e7:
            r1 = 1
            goto L_0x02fd
        L_0x02e9:
            r18 = r4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "WARNING NO CONSTRAINTS for view "
            r1.<init>(r3)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.v(r11, r0)
            goto L_0x02e7
        L_0x02fd:
            int r8 = r8 + r1
            r3 = r1
            r4 = r18
            r1 = r19
            goto L_0x0015
        L_0x0305:
            r18 = r4
            java.util.Iterator r0 = r5.iterator()
        L_0x030b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x03b5
            java.lang.Object r1 = r0.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.Object r3 = r6.get(r1)
            v.i r3 = (v.i) r3
            if (r3 != 0) goto L_0x0320
            goto L_0x030b
        L_0x0320:
            v.j r4 = r3.d
            int r5 = r4.f12085h0
            r7 = 1
            if (r5 != r7) goto L_0x0391
            v.a r5 = new v.a
            android.content.Context r7 = r20.getContext()
            r5.<init>(r7)
            r8 = 32
            int[] r8 = new int[r8]
            r5.f11953a = r8
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            r5.f11958p = r8
            r5.f11955c = r7
            s.a r7 = new s.a
            r7.<init>()
            r8 = 0
            r7.s0 = r8
            r9 = 1
            r7.f11266t0 = r9
            r7.f11267u0 = r8
            r7.f11268v0 = r8
            r5.f11947s = r7
            r5.d = r7
            r5.i()
            r7 = 8
            r5.setVisibility(r7)
            int r7 = r1.intValue()
            r5.setId(r7)
            int[] r7 = r4.f12087i0
            if (r7 == 0) goto L_0x0369
            r5.setReferencedIds(r7)
            goto L_0x0376
        L_0x0369:
            java.lang.String r7 = r4.f12089j0
            if (r7 == 0) goto L_0x0376
            int[] r7 = c(r5, r7)
            r4.f12087i0 = r7
            r5.setReferencedIds(r7)
        L_0x0376:
            int r7 = r4.f12083f0
            r5.setType(r7)
            int r7 = r4.f12084g0
            r5.setMargin(r7)
            v.r r7 = androidx.constraintlayout.widget.ConstraintLayout.f4837y
            v.e r7 = new v.e
            r7.<init>()
            r5.i()
            r3.a(r7)
            r2.addView(r5, r7)
            goto L_0x0392
        L_0x0391:
            r8 = 0
        L_0x0392:
            boolean r4 = r4.f12073a
            if (r4 == 0) goto L_0x030b
            androidx.constraintlayout.widget.Guideline r4 = new androidx.constraintlayout.widget.Guideline
            android.content.Context r5 = r20.getContext()
            r4.<init>(r5)
            int r1 = r1.intValue()
            r4.setId(r1)
            v.r r1 = androidx.constraintlayout.widget.ConstraintLayout.f4837y
            v.e r1 = new v.e
            r1.<init>()
            r3.a(r1)
            r2.addView(r4, r1)
            goto L_0x030b
        L_0x03b5:
            r8 = 0
            r7 = r8
            r1 = r18
        L_0x03b9:
            if (r7 >= r1) goto L_0x03cb
            android.view.View r0 = r2.getChildAt(r7)
            boolean r3 = r0 instanceof v.c
            if (r3 == 0) goto L_0x03c8
            v.c r0 = (v.c) r0
            r0.e(r2)
        L_0x03c8:
            r3 = 1
            int r7 = r7 + r3
            goto L_0x03b9
        L_0x03cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v.n.a(androidx.constraintlayout.widget.ConstraintLayout):void");
    }

    public final void b(ConstraintLayout constraintLayout) {
        HashMap hashMap;
        int i2;
        n nVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap2 = nVar.f12136c;
        hashMap2.clear();
        int i5 = 0;
        while (i5 < childCount) {
            View childAt = constraintLayout.getChildAt(i5);
            e eVar = (e) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!nVar.f12135b || id != -1) {
                if (!hashMap2.containsKey(Integer.valueOf(id))) {
                    hashMap2.put(Integer.valueOf(id), new i());
                }
                i iVar = (i) hashMap2.get(Integer.valueOf(id));
                if (iVar == null) {
                    i2 = childCount;
                    hashMap = hashMap2;
                } else {
                    HashMap hashMap3 = nVar.f12134a;
                    HashMap hashMap4 = new HashMap();
                    Class<?> cls = childAt.getClass();
                    for (String str : hashMap3.keySet()) {
                        C1036b bVar = (C1036b) hashMap3.get(str);
                        int i6 = childCount;
                        try {
                            if (str.equals("BackgroundColor")) {
                                hashMap = hashMap2;
                                try {
                                    hashMap4.put(str, new C1036b(bVar, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                                } catch (NoSuchMethodException e6) {
                                    e = e6;
                                    Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e);
                                    childCount = i6;
                                    hashMap2 = hashMap;
                                } catch (IllegalAccessException e7) {
                                    e = e7;
                                    StringBuilder t6 = C0552a.t(" Custom Attribute \"", str, "\" not found on ");
                                    t6.append(cls.getName());
                                    Log.e("TransitionLayout", t6.toString(), e);
                                    childCount = i6;
                                    hashMap2 = hashMap;
                                } catch (InvocationTargetException e8) {
                                    e = e8;
                                    StringBuilder t7 = C0552a.t(" Custom Attribute \"", str, "\" not found on ");
                                    t7.append(cls.getName());
                                    Log.e("TransitionLayout", t7.toString(), e);
                                    childCount = i6;
                                    hashMap2 = hashMap;
                                }
                            } else {
                                hashMap = hashMap2;
                                hashMap4.put(str, new C1036b(bVar, cls.getMethod("getMap" + str, (Class[]) null).invoke(childAt, (Object[]) null)));
                            }
                        } catch (NoSuchMethodException e9) {
                            e = e9;
                            hashMap = hashMap2;
                            Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e);
                            childCount = i6;
                            hashMap2 = hashMap;
                        } catch (IllegalAccessException e10) {
                            e = e10;
                            hashMap = hashMap2;
                            StringBuilder t62 = C0552a.t(" Custom Attribute \"", str, "\" not found on ");
                            t62.append(cls.getName());
                            Log.e("TransitionLayout", t62.toString(), e);
                            childCount = i6;
                            hashMap2 = hashMap;
                        } catch (InvocationTargetException e11) {
                            e = e11;
                            hashMap = hashMap2;
                            StringBuilder t72 = C0552a.t(" Custom Attribute \"", str, "\" not found on ");
                            t72.append(cls.getName());
                            Log.e("TransitionLayout", t72.toString(), e);
                            childCount = i6;
                            hashMap2 = hashMap;
                        }
                        childCount = i6;
                        hashMap2 = hashMap;
                    }
                    i2 = childCount;
                    hashMap = hashMap2;
                    iVar.f12046f = hashMap4;
                    iVar.f12042a = id;
                    int i7 = eVar.f11992e;
                    j jVar = iVar.d;
                    jVar.h = i7;
                    jVar.f12086i = eVar.f11994f;
                    jVar.f12088j = eVar.g;
                    jVar.f12090k = eVar.h;
                    jVar.f12092l = eVar.f11998i;
                    jVar.f12094m = eVar.f12000j;
                    jVar.f12096n = eVar.f12002k;
                    jVar.f12098o = eVar.f12004l;
                    jVar.f12100p = eVar.f12006m;
                    jVar.f12101q = eVar.f12008n;
                    jVar.f12102r = eVar.f12010o;
                    jVar.f12103s = eVar.f12016s;
                    jVar.f12104t = eVar.f12017t;
                    jVar.f12105u = eVar.f12018u;
                    jVar.f12106v = eVar.f12019v;
                    jVar.f12107w = eVar.f11964E;
                    jVar.f12108x = eVar.F;
                    jVar.f12109y = eVar.f11965G;
                    jVar.f12110z = eVar.f12012p;
                    jVar.f12048A = eVar.f12014q;
                    jVar.f12049B = eVar.f12015r;
                    jVar.f12050C = eVar.f11978T;
                    jVar.f12051D = eVar.f11979U;
                    jVar.f12052E = eVar.f11980V;
                    jVar.f12082f = eVar.f11989c;
                    jVar.d = eVar.f11985a;
                    jVar.f12080e = eVar.f11987b;
                    jVar.f12075b = eVar.width;
                    jVar.f12077c = eVar.height;
                    jVar.F = eVar.leftMargin;
                    jVar.f12053G = eVar.rightMargin;
                    jVar.f12054H = eVar.topMargin;
                    jVar.f12055I = eVar.bottomMargin;
                    jVar.f12058L = eVar.f11963D;
                    jVar.f12066T = eVar.f11967I;
                    jVar.f12067U = eVar.f11966H;
                    jVar.f12069W = eVar.f11969K;
                    jVar.f12068V = eVar.f11968J;
                    jVar.f12093l0 = eVar.f11981W;
                    jVar.f12095m0 = eVar.f11982X;
                    jVar.f12070X = eVar.f11970L;
                    jVar.f12071Y = eVar.f11971M;
                    jVar.f12072Z = eVar.f11974P;
                    jVar.f12074a0 = eVar.f11975Q;
                    jVar.f12076b0 = eVar.f11972N;
                    jVar.f12078c0 = eVar.f11973O;
                    jVar.f12079d0 = eVar.f11976R;
                    jVar.f12081e0 = eVar.f11977S;
                    jVar.f12091k0 = eVar.f11983Y;
                    jVar.f12060N = eVar.f12021x;
                    jVar.f12062P = eVar.f12023z;
                    jVar.f12059M = eVar.f12020w;
                    jVar.f12061O = eVar.f12022y;
                    jVar.f12064R = eVar.f11960A;
                    jVar.f12063Q = eVar.f11961B;
                    jVar.f12065S = eVar.f11962C;
                    jVar.f12099o0 = eVar.f11984Z;
                    jVar.f12056J = eVar.getMarginEnd();
                    jVar.f12057K = eVar.getMarginStart();
                    int visibility = childAt.getVisibility();
                    l lVar = iVar.f12043b;
                    lVar.f12118a = visibility;
                    lVar.f12120c = childAt.getAlpha();
                    float rotation = childAt.getRotation();
                    m mVar = iVar.f12045e;
                    mVar.f12122a = rotation;
                    mVar.f12123b = childAt.getRotationX();
                    mVar.f12124c = childAt.getRotationY();
                    mVar.d = childAt.getScaleX();
                    mVar.f12125e = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (!(((double) pivotX) == 0.0d && ((double) pivotY) == 0.0d)) {
                        mVar.f12126f = pivotX;
                        mVar.g = pivotY;
                    }
                    mVar.f12127i = childAt.getTranslationX();
                    mVar.f12128j = childAt.getTranslationY();
                    mVar.f12129k = childAt.getTranslationZ();
                    if (mVar.f12130l) {
                        mVar.f12131m = childAt.getElevation();
                    }
                    if (childAt instanceof C1035a) {
                        C1035a aVar = (C1035a) childAt;
                        jVar.f12097n0 = aVar.getAllowsGoneWidget();
                        jVar.f12087i0 = aVar.getReferencedIds();
                        jVar.f12083f0 = aVar.getType();
                        jVar.f12084g0 = aVar.getMargin();
                    }
                }
                i5++;
                nVar = this;
                childCount = i2;
                hashMap2 = hashMap;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    public final void e(Context context, int i2) {
        XmlResourceParser xml = context.getResources().getXml(i2);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    i d6 = d(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        d6.d.f12073a = true;
                    }
                    this.f12136c.put(Integer.valueOf(d6.f12042a), d6);
                }
            }
        } catch (XmlPullParserException e6) {
            Log.e("ConstraintSet", "Error parsing resource: " + i2, e6);
        } catch (IOException e7) {
            Log.e("ConstraintSet", "Error parsing resource: " + i2, e7);
        }
    }
}
