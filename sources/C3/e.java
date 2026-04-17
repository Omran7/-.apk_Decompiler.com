package C3;

import A3.c;
import A3.d;
import A3.f;
import A3.g;
import android.util.Base64;
import android.util.JsonWriter;
import java.io.BufferedWriter;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public final class e implements A3.e, g {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f463a = true;

    /* renamed from: b  reason: collision with root package name */
    public final JsonWriter f464b;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f465c;
    public final HashMap d;

    /* renamed from: e  reason: collision with root package name */
    public final a f466e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f467f;

    public e(BufferedWriter bufferedWriter, HashMap hashMap, HashMap hashMap2, a aVar, boolean z3) {
        this.f464b = new JsonWriter(bufferedWriter);
        this.f465c = hashMap;
        this.d = hashMap2;
        this.f466e = aVar;
        this.f467f = z3;
    }

    public final A3.e a(c cVar, Object obj) {
        g(obj, cVar.f61a);
        return this;
    }

    public final g b(String str) {
        h();
        this.f464b.value(str);
        return this;
    }

    public final g c(boolean z3) {
        h();
        this.f464b.value(z3);
        return this;
    }

    public final A3.e d(c cVar, long j6) {
        String str = cVar.f61a;
        h();
        JsonWriter jsonWriter = this.f464b;
        jsonWriter.name(str);
        h();
        jsonWriter.value(j6);
        return this;
    }

    public final A3.e e(c cVar, int i2) {
        String str = cVar.f61a;
        h();
        JsonWriter jsonWriter = this.f464b;
        jsonWriter.name(str);
        h();
        jsonWriter.value((long) i2);
        return this;
    }

    public final void f(Object obj) {
        JsonWriter jsonWriter = this.f464b;
        if (obj == null) {
            jsonWriter.nullValue();
        } else if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
        } else if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                h();
                jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
                return;
            }
            jsonWriter.beginArray();
            int i2 = 0;
            if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                int length = iArr.length;
                while (i2 < length) {
                    jsonWriter.value((long) iArr[i2]);
                    i2++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i2 < length2) {
                    long j6 = jArr[i2];
                    h();
                    jsonWriter.value(j6);
                    i2++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i2 < length3) {
                    jsonWriter.value(dArr[i2]);
                    i2++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i2 < length4) {
                    jsonWriter.value(zArr[i2]);
                    i2++;
                }
            } else if (obj instanceof Number[]) {
                Number[] numberArr = (Number[]) obj;
                int length5 = numberArr.length;
                while (i2 < length5) {
                    f(numberArr[i2]);
                    i2++;
                }
            } else {
                Object[] objArr = (Object[]) obj;
                int length6 = objArr.length;
                while (i2 < length6) {
                    f(objArr[i2]);
                    i2++;
                }
            }
            jsonWriter.endArray();
        } else if (obj instanceof Collection) {
            jsonWriter.beginArray();
            for (Object f6 : (Collection) obj) {
                f(f6);
            }
            jsonWriter.endArray();
        } else if (obj instanceof Map) {
            jsonWriter.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                try {
                    g(entry.getValue(), (String) key);
                } catch (ClassCastException e6) {
                    throw new RuntimeException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", new Object[]{key, key.getClass()}), e6);
                }
            }
            jsonWriter.endObject();
        } else {
            d dVar = (d) this.f465c.get(obj.getClass());
            if (dVar != null) {
                jsonWriter.beginObject();
                dVar.a(obj, this);
                jsonWriter.endObject();
                return;
            }
            f fVar = (f) this.d.get(obj.getClass());
            if (fVar != null) {
                fVar.a(obj, this);
            } else if (obj instanceof Enum) {
                String name = ((Enum) obj).name();
                h();
                jsonWriter.value(name);
            } else {
                jsonWriter.beginObject();
                this.f466e.a(obj, this);
                throw null;
            }
        }
    }

    public final void g(Object obj, String str) {
        boolean z3 = this.f467f;
        JsonWriter jsonWriter = this.f464b;
        if (!z3) {
            h();
            jsonWriter.name(str);
            if (obj == null) {
                jsonWriter.nullValue();
            } else {
                f(obj);
            }
        } else if (obj != null) {
            h();
            jsonWriter.name(str);
            f(obj);
        }
    }

    public final void h() {
        if (!this.f463a) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }
}
