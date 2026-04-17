package c1;

import J2.o;
import java.util.HashMap;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final String f5598a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f5599b;

    /* renamed from: c  reason: collision with root package name */
    public final l f5600c;
    public final long d;

    /* renamed from: e  reason: collision with root package name */
    public final long f5601e;

    /* renamed from: f  reason: collision with root package name */
    public final HashMap f5602f;

    public h(String str, Integer num, l lVar, long j6, long j7, HashMap hashMap) {
        this.f5598a = str;
        this.f5599b = num;
        this.f5600c = lVar;
        this.d = j6;
        this.f5601e = j7;
        this.f5602f = hashMap;
    }

    public final String a(String str) {
        String str2 = (String) this.f5602f.get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f5602f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, J2.o] */
    public final o c() {
        ? obj = new Object();
        String str = this.f5598a;
        if (str != null) {
            obj.f1317a = str;
            obj.f1321f = this.f5599b;
            l lVar = this.f5600c;
            if (lVar != null) {
                obj.f1318b = lVar;
                obj.f1319c = Long.valueOf(this.d);
                obj.d = Long.valueOf(this.f5601e);
                obj.f1320e = new HashMap(this.f5602f);
                return obj;
            }
            throw new NullPointerException("Null encodedPayload");
        }
        throw new NullPointerException("Null transportName");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f5598a.equals(hVar.f5598a)) {
            Integer num = hVar.f5599b;
            Integer num2 = this.f5599b;
            if (num2 != null ? num2.equals(num) : num == null) {
                if (this.f5600c.equals(hVar.f5600c) && this.d == hVar.d && this.f5601e == hVar.f5601e && this.f5602f.equals(hVar.f5602f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        int hashCode = (this.f5598a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f5599b;
        if (num == null) {
            i2 = 0;
        } else {
            i2 = num.hashCode();
        }
        long j6 = this.d;
        long j7 = this.f5601e;
        return ((((((((hashCode ^ i2) * 1000003) ^ this.f5600c.hashCode()) * 1000003) ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003) ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003) ^ this.f5602f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f5598a + ", code=" + this.f5599b + ", encodedPayload=" + this.f5600c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.f5601e + ", autoMetadata=" + this.f5602f + "}";
    }
}
