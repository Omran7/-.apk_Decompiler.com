package D3;

import A3.c;
import A3.d;
import A3.e;
import C3.a;
import h0.C0552a;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public final class f implements e {

    /* renamed from: f  reason: collision with root package name */
    public static final Charset f567f = Charset.forName("UTF-8");
    public static final c g;
    public static final c h;

    /* renamed from: i  reason: collision with root package name */
    public static final a f568i = new a(1);

    /* renamed from: a  reason: collision with root package name */
    public OutputStream f569a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f570b;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f571c;
    public final a d;

    /* renamed from: e  reason: collision with root package name */
    public final h f572e = new h(this);

    static {
        Class<e> cls = e.class;
        g = new c(C0552a.w(C0552a.v(cls, new a(1))), "key");
        h = new c(C0552a.w(C0552a.v(cls, new a(2))), "value");
    }

    public f(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2, a aVar) {
        this.f569a = byteArrayOutputStream;
        this.f570b = hashMap;
        this.f571c = hashMap2;
        this.d = aVar;
    }

    public static int g(c cVar) {
        e eVar = (e) ((Annotation) cVar.f62b.get(e.class));
        if (eVar != null) {
            return ((a) eVar).f563a;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    public final e a(c cVar, Object obj) {
        c(cVar, obj, true);
        return this;
    }

    public final void b(c cVar, int i2, boolean z3) {
        if (!z3 || i2 != 0) {
            e eVar = (e) ((Annotation) cVar.f62b.get(e.class));
            if (eVar != null) {
                h(((a) eVar).f563a << 3);
                h(i2);
                return;
            }
            throw new RuntimeException("Field has no @Protobuf config");
        }
    }

    public final void c(c cVar, Object obj, boolean z3) {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z3 || charSequence.length() != 0) {
                    h((g(cVar) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f567f);
                    h(bytes.length);
                    this.f569a.write(bytes);
                }
            } else if (obj instanceof Collection) {
                for (Object c3 : (Collection) obj) {
                    c(cVar, c3, false);
                }
            } else if (obj instanceof Map) {
                for (Map.Entry f6 : ((Map) obj).entrySet()) {
                    f(f568i, cVar, f6, false);
                }
            } else if (obj instanceof Double) {
                double doubleValue = ((Double) obj).doubleValue();
                if (!z3 || doubleValue != 0.0d) {
                    h((g(cVar) << 3) | 1);
                    this.f569a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(doubleValue).array());
                }
            } else if (obj instanceof Float) {
                float floatValue = ((Float) obj).floatValue();
                if (!z3 || floatValue != 0.0f) {
                    h((g(cVar) << 3) | 5);
                    this.f569a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
                }
            } else if (obj instanceof Number) {
                long longValue = ((Number) obj).longValue();
                if (!z3 || longValue != 0) {
                    e eVar = (e) ((Annotation) cVar.f62b.get(e.class));
                    if (eVar != null) {
                        h(((a) eVar).f563a << 3);
                        i(longValue);
                        return;
                    }
                    throw new RuntimeException("Field has no @Protobuf config");
                }
            } else if (obj instanceof Boolean) {
                b(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z3);
            } else if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                if (!z3 || bArr.length != 0) {
                    h((g(cVar) << 3) | 2);
                    h(bArr.length);
                    this.f569a.write(bArr);
                }
            } else {
                d dVar = (d) this.f570b.get(obj.getClass());
                if (dVar != null) {
                    f(dVar, cVar, obj, z3);
                    return;
                }
                A3.f fVar = (A3.f) this.f571c.get(obj.getClass());
                if (fVar != null) {
                    h hVar = this.f572e;
                    hVar.f574a = false;
                    hVar.f576c = cVar;
                    hVar.f575b = z3;
                    fVar.a(obj, hVar);
                } else if (obj instanceof c) {
                    b(cVar, ((c) obj).a(), true);
                } else if (obj instanceof Enum) {
                    b(cVar, ((Enum) obj).ordinal(), true);
                } else {
                    f(this.d, cVar, obj, z3);
                }
            }
        }
    }

    public final e d(c cVar, long j6) {
        if (j6 != 0) {
            e eVar = (e) ((Annotation) cVar.f62b.get(e.class));
            if (eVar != null) {
                h(((a) eVar).f563a << 3);
                i(j6);
            } else {
                throw new RuntimeException("Field has no @Protobuf config");
            }
        }
        return this;
    }

    public final e e(c cVar, int i2) {
        b(cVar, i2, true);
        return this;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.io.OutputStream, D3.b] */
    public final void f(d dVar, c cVar, Object obj, boolean z3) {
        OutputStream outputStream;
        ? outputStream2 = new OutputStream();
        outputStream2.f564a = 0;
        try {
            outputStream = this.f569a;
            this.f569a = outputStream2;
            dVar.a(obj, this);
            this.f569a = outputStream;
            long j6 = outputStream2.f564a;
            outputStream2.close();
            if (!z3 || j6 != 0) {
                h((g(cVar) << 3) | 2);
                i(j6);
                dVar.a(obj, this);
                return;
            }
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public final void h(int i2) {
        while (((long) (i2 & -128)) != 0) {
            this.f569a.write((i2 & 127) | 128);
            i2 >>>= 7;
        }
        this.f569a.write(i2 & 127);
    }

    public final void i(long j6) {
        while ((-128 & j6) != 0) {
            this.f569a.write((((int) j6) & 127) | 128);
            j6 >>>= 7;
        }
        this.f569a.write(((int) j6) & 127);
    }
}
