package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.activity.f;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import n0.C0852b;

public final class H {

    /* renamed from: f  reason: collision with root package name */
    public static final Class[] f5223f = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap f5224a;

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashMap f5225b;

    /* renamed from: c  reason: collision with root package name */
    public final LinkedHashMap f5226c;
    public final LinkedHashMap d;

    /* renamed from: e  reason: collision with root package name */
    public final C0852b f5227e;

    public H(HashMap hashMap) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f5224a = linkedHashMap;
        this.f5225b = new LinkedHashMap();
        this.f5226c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.f5227e = new f(this, 3);
        linkedHashMap.putAll(hashMap);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: androidx.lifecycle.y} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.os.Bundle a(androidx.lifecycle.H r10) {
        /*
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.j.e(r10, r0)
            java.util.LinkedHashMap r0 = r10.f5225b
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.j.e(r0, r1)
            int r1 = r0.size()
            if (r1 == 0) goto L_0x0040
            r2 = 1
            if (r1 == r2) goto L_0x001b
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>(r0)
            goto L_0x0042
        L_0x001b:
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.j.e(r0, r1)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            java.util.Map r1 = java.util.Collections.singletonMap(r1, r0)
            java.lang.String r0 = "with(...)"
            kotlin.jvm.internal.j.d(r1, r0)
            goto L_0x0042
        L_0x0040:
            n5.p r1 = n5.C0884p.f10399a
        L_0x0042:
            java.util.Set r0 = r1.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x004a:
            boolean r1 = r0.hasNext()
            java.util.LinkedHashMap r2 = r10.f5224a
            r3 = 0
            r4 = 0
            if (r1 == 0) goto L_0x00c8
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r5 = r1.getKey()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r1 = r1.getValue()
            n0.b r1 = (n0.C0852b) r1
            android.os.Bundle r1 = r1.a()
            java.lang.String r6 = "key"
            kotlin.jvm.internal.j.e(r5, r6)
            if (r1 != 0) goto L_0x0072
            goto L_0x0083
        L_0x0072:
            java.lang.Class[] r6 = f5223f
        L_0x0074:
            r7 = 29
            if (r4 >= r7) goto L_0x00ab
            r7 = r6[r4]
            kotlin.jvm.internal.j.b(r7)
            boolean r7 = r7.isInstance(r1)
            if (r7 == 0) goto L_0x00a8
        L_0x0083:
            java.util.LinkedHashMap r4 = r10.f5226c
            java.lang.Object r4 = r4.get(r5)
            boolean r6 = r4 instanceof androidx.lifecycle.y
            if (r6 == 0) goto L_0x0090
            r3 = r4
            androidx.lifecycle.y r3 = (androidx.lifecycle.y) r3
        L_0x0090:
            if (r3 == 0) goto L_0x0096
            r3.i(r1)
            goto L_0x0099
        L_0x0096:
            r2.put(r5, r1)
        L_0x0099:
            java.util.LinkedHashMap r1 = r10.d
            java.lang.Object r1 = r1.get(r5)
            if (r1 != 0) goto L_0x00a2
            goto L_0x004a
        L_0x00a2:
            java.lang.ClassCastException r10 = new java.lang.ClassCastException
            r10.<init>()
            throw r10
        L_0x00a8:
            int r4 = r4 + 1
            goto L_0x0074
        L_0x00ab:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Can't put value with type "
            r0.<init>(r2)
            java.lang.Class r1 = r1.getClass()
            r0.append(r1)
            java.lang.String r1 = " into saved state"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        L_0x00c8:
            java.util.Set r10 = r2.keySet()
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r10.size()
            r0.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r5 = r0.size()
            r1.<init>(r5)
            java.util.Iterator r10 = r10.iterator()
        L_0x00e2:
            boolean r5 = r10.hasNext()
            if (r5 == 0) goto L_0x00f9
            java.lang.Object r5 = r10.next()
            java.lang.String r5 = (java.lang.String) r5
            r0.add(r5)
            java.lang.Object r5 = r2.get(r5)
            r1.add(r5)
            goto L_0x00e2
        L_0x00f9:
            m5.d r10 = new m5.d
            java.lang.String r2 = "keys"
            r10.<init>(r2, r0)
            m5.d r0 = new m5.d
            java.lang.String r2 = "values"
            r0.<init>(r2, r1)
            m5.d[] r10 = new m5.C0845d[]{r10, r0}
            android.os.Bundle r0 = new android.os.Bundle
            r1 = 2
            r0.<init>(r1)
        L_0x0111:
            if (r4 >= r1) goto L_0x02d0
            r2 = r10[r4]
            java.lang.Object r5 = r2.f10195a
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r2 = r2.f10196b
            if (r2 != 0) goto L_0x0122
            r0.putString(r5, r3)
            goto L_0x02a7
        L_0x0122:
            boolean r6 = r2 instanceof java.lang.Boolean
            if (r6 == 0) goto L_0x0131
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r0.putBoolean(r5, r2)
            goto L_0x02a7
        L_0x0131:
            boolean r6 = r2 instanceof java.lang.Byte
            if (r6 == 0) goto L_0x0140
            java.lang.Number r2 = (java.lang.Number) r2
            byte r2 = r2.byteValue()
            r0.putByte(r5, r2)
            goto L_0x02a7
        L_0x0140:
            boolean r6 = r2 instanceof java.lang.Character
            if (r6 == 0) goto L_0x014f
            java.lang.Character r2 = (java.lang.Character) r2
            char r2 = r2.charValue()
            r0.putChar(r5, r2)
            goto L_0x02a7
        L_0x014f:
            boolean r6 = r2 instanceof java.lang.Double
            if (r6 == 0) goto L_0x015e
            java.lang.Number r2 = (java.lang.Number) r2
            double r6 = r2.doubleValue()
            r0.putDouble(r5, r6)
            goto L_0x02a7
        L_0x015e:
            boolean r6 = r2 instanceof java.lang.Float
            if (r6 == 0) goto L_0x016d
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            r0.putFloat(r5, r2)
            goto L_0x02a7
        L_0x016d:
            boolean r6 = r2 instanceof java.lang.Integer
            if (r6 == 0) goto L_0x017c
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r0.putInt(r5, r2)
            goto L_0x02a7
        L_0x017c:
            boolean r6 = r2 instanceof java.lang.Long
            if (r6 == 0) goto L_0x018b
            java.lang.Number r2 = (java.lang.Number) r2
            long r6 = r2.longValue()
            r0.putLong(r5, r6)
            goto L_0x02a7
        L_0x018b:
            boolean r6 = r2 instanceof java.lang.Short
            if (r6 == 0) goto L_0x019a
            java.lang.Number r2 = (java.lang.Number) r2
            short r2 = r2.shortValue()
            r0.putShort(r5, r2)
            goto L_0x02a7
        L_0x019a:
            boolean r6 = r2 instanceof android.os.Bundle
            if (r6 == 0) goto L_0x01a5
            android.os.Bundle r2 = (android.os.Bundle) r2
            r0.putBundle(r5, r2)
            goto L_0x02a7
        L_0x01a5:
            boolean r6 = r2 instanceof java.lang.CharSequence
            if (r6 == 0) goto L_0x01b0
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r0.putCharSequence(r5, r2)
            goto L_0x02a7
        L_0x01b0:
            boolean r6 = r2 instanceof android.os.Parcelable
            if (r6 == 0) goto L_0x01bb
            android.os.Parcelable r2 = (android.os.Parcelable) r2
            r0.putParcelable(r5, r2)
            goto L_0x02a7
        L_0x01bb:
            boolean r6 = r2 instanceof boolean[]
            if (r6 == 0) goto L_0x01c6
            boolean[] r2 = (boolean[]) r2
            r0.putBooleanArray(r5, r2)
            goto L_0x02a7
        L_0x01c6:
            boolean r6 = r2 instanceof byte[]
            if (r6 == 0) goto L_0x01d1
            byte[] r2 = (byte[]) r2
            r0.putByteArray(r5, r2)
            goto L_0x02a7
        L_0x01d1:
            boolean r6 = r2 instanceof char[]
            if (r6 == 0) goto L_0x01dc
            char[] r2 = (char[]) r2
            r0.putCharArray(r5, r2)
            goto L_0x02a7
        L_0x01dc:
            boolean r6 = r2 instanceof double[]
            if (r6 == 0) goto L_0x01e7
            double[] r2 = (double[]) r2
            r0.putDoubleArray(r5, r2)
            goto L_0x02a7
        L_0x01e7:
            boolean r6 = r2 instanceof float[]
            if (r6 == 0) goto L_0x01f2
            float[] r2 = (float[]) r2
            r0.putFloatArray(r5, r2)
            goto L_0x02a7
        L_0x01f2:
            boolean r6 = r2 instanceof int[]
            if (r6 == 0) goto L_0x01fd
            int[] r2 = (int[]) r2
            r0.putIntArray(r5, r2)
            goto L_0x02a7
        L_0x01fd:
            boolean r6 = r2 instanceof long[]
            if (r6 == 0) goto L_0x0208
            long[] r2 = (long[]) r2
            r0.putLongArray(r5, r2)
            goto L_0x02a7
        L_0x0208:
            boolean r6 = r2 instanceof short[]
            if (r6 == 0) goto L_0x0213
            short[] r2 = (short[]) r2
            r0.putShortArray(r5, r2)
            goto L_0x02a7
        L_0x0213:
            boolean r6 = r2 instanceof java.lang.Object[]
            r7 = 34
            java.lang.String r8 = " for key \""
            if (r6 == 0) goto L_0x0280
            java.lang.Class r6 = r2.getClass()
            java.lang.Class r6 = r6.getComponentType()
            kotlin.jvm.internal.j.b(r6)
            java.lang.Class<android.os.Parcelable> r9 = android.os.Parcelable.class
            boolean r9 = r9.isAssignableFrom(r6)
            if (r9 == 0) goto L_0x0235
            android.os.Parcelable[] r2 = (android.os.Parcelable[]) r2
            r0.putParcelableArray(r5, r2)
            goto L_0x02a7
        L_0x0235:
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            boolean r9 = r9.isAssignableFrom(r6)
            if (r9 == 0) goto L_0x0243
            java.lang.String[] r2 = (java.lang.String[]) r2
            r0.putStringArray(r5, r2)
            goto L_0x02a7
        L_0x0243:
            java.lang.Class<java.lang.CharSequence> r9 = java.lang.CharSequence.class
            boolean r9 = r9.isAssignableFrom(r6)
            if (r9 == 0) goto L_0x0251
            java.lang.CharSequence[] r2 = (java.lang.CharSequence[]) r2
            r0.putCharSequenceArray(r5, r2)
            goto L_0x02a7
        L_0x0251:
            java.lang.Class<java.io.Serializable> r9 = java.io.Serializable.class
            boolean r9 = r9.isAssignableFrom(r6)
            if (r9 == 0) goto L_0x025f
            java.io.Serializable r2 = (java.io.Serializable) r2
            r0.putSerializable(r5, r2)
            goto L_0x02a7
        L_0x025f:
            java.lang.String r10 = r6.getCanonicalName()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Illegal value array type "
            r1.<init>(r2)
            r1.append(r10)
            r1.append(r8)
            r1.append(r5)
            r1.append(r7)
            java.lang.String r10 = r1.toString()
            r0.<init>(r10)
            throw r0
        L_0x0280:
            boolean r6 = r2 instanceof java.io.Serializable
            if (r6 == 0) goto L_0x028a
            java.io.Serializable r2 = (java.io.Serializable) r2
            r0.putSerializable(r5, r2)
            goto L_0x02a7
        L_0x028a:
            boolean r6 = r2 instanceof android.os.IBinder
            if (r6 == 0) goto L_0x0294
            android.os.IBinder r2 = (android.os.IBinder) r2
            r0.putBinder(r5, r2)
            goto L_0x02a7
        L_0x0294:
            boolean r6 = r2 instanceof android.util.Size
            if (r6 == 0) goto L_0x029e
            android.util.Size r2 = (android.util.Size) r2
            G.a.a(r0, r5, r2)
            goto L_0x02a7
        L_0x029e:
            boolean r6 = r2 instanceof android.util.SizeF
            if (r6 == 0) goto L_0x02ab
            android.util.SizeF r2 = (android.util.SizeF) r2
            G.a.b(r0, r5, r2)
        L_0x02a7:
            int r4 = r4 + 1
            goto L_0x0111
        L_0x02ab:
            java.lang.Class r10 = r2.getClass()
            java.lang.String r10 = r10.getCanonicalName()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Illegal value type "
            r1.<init>(r2)
            r1.append(r10)
            r1.append(r8)
            r1.append(r5)
            r1.append(r7)
            java.lang.String r10 = r1.toString()
            r0.<init>(r10)
            throw r0
        L_0x02d0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.H.a(androidx.lifecycle.H):android.os.Bundle");
    }

    public H() {
        this.f5224a = new LinkedHashMap();
        this.f5225b = new LinkedHashMap();
        this.f5226c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.f5227e = new f(this, 3);
    }
}
