package n3;

import a3.C0261a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import k3.k;
import v3.C1048c;
import w3.C1080a;

/* renamed from: n3.C  reason: case insensitive filesystem */
public final class C0858C implements C1080a {

    /* renamed from: a  reason: collision with root package name */
    public ArrayList f10243a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public int f10244b;

    public C0858C(C0866g gVar) {
        this.f10244b = 0;
        gVar.getClass();
        k kVar = new k(gVar);
        while (kVar.hasNext()) {
            this.f10243a.add(((C1048c) kVar.next()).f12280a);
        }
        this.f10244b = Math.max(1, this.f10243a.size());
        for (int i2 = 0; i2 < this.f10243a.size(); i2++) {
            this.f10244b = f((CharSequence) this.f10243a.get(i2)) + this.f10244b;
        }
        c();
    }

    public static int f(CharSequence charSequence) {
        int length = charSequence.length();
        int i2 = 0;
        int i5 = 0;
        while (i2 < length) {
            char charAt = charSequence.charAt(i2);
            if (charAt <= 127) {
                i5++;
            } else if (charAt <= 2047) {
                i5 += 2;
            } else if (Character.isHighSurrogate(charAt)) {
                i5 += 4;
                i2++;
            } else {
                i5 += 3;
            }
            i2++;
        }
        return i5;
    }

    public boolean a(byte[] bArr) {
        this.f10243a.add(bArr);
        this.f10244b += bArr.length;
        return true;
    }

    public C0261a b() {
        byte[] bArr = new byte[this.f10244b];
        int i2 = 0;
        int i5 = 0;
        while (true) {
            ArrayList arrayList = this.f10243a;
            if (i2 >= arrayList.size()) {
                return new C0261a();
            }
            byte[] bArr2 = (byte[]) arrayList.get(i2);
            System.arraycopy(bArr2, 0, bArr, i5, bArr2.length);
            i5 += bArr2.length;
            i2++;
        }
    }

    public void c() {
        String str;
        if (this.f10244b <= 768) {
            ArrayList arrayList = this.f10243a;
            if (arrayList.size() > 32) {
                StringBuilder sb = new StringBuilder("Path specified exceeds the maximum depth that can be written (32) or object contains a cycle ");
                if (arrayList.size() != 0) {
                    StringBuilder sb2 = new StringBuilder("in path '");
                    StringBuilder sb3 = new StringBuilder();
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        if (i2 > 0) {
                            sb3.append("/");
                        }
                        sb3.append((String) arrayList.get(i2));
                    }
                    sb2.append(sb3.toString());
                    sb2.append("'");
                    str = sb2.toString();
                } else {
                    str = "";
                }
                sb.append(str);
                throw new RuntimeException(sb.toString());
            }
            return;
        }
        throw new RuntimeException("Data has a key path longer than 768 bytes (" + this.f10244b + ").");
    }

    public void d() {
        ArrayList arrayList = this.f10243a;
        this.f10244b -= f((String) arrayList.remove(arrayList.size() - 1));
        if (arrayList.size() > 0) {
            this.f10244b--;
        }
    }

    public void e(String str) {
        ArrayList arrayList = this.f10243a;
        if (arrayList.size() > 0) {
            this.f10244b++;
        }
        arrayList.add(str);
        this.f10244b = f(str) + this.f10244b;
        c();
    }

    public void g(Object obj) {
        if (obj instanceof Map) {
            Map map = (Map) obj;
            for (String str : map.keySet()) {
                if (!str.startsWith(".")) {
                    e(str);
                    g(map.get(str));
                    d();
                }
            }
        } else if (obj instanceof List) {
            List list = (List) obj;
            for (int i2 = 0; i2 < list.size(); i2++) {
                e(Integer.toString(i2));
                g(list.get(i2));
                d();
            }
        }
    }
}
