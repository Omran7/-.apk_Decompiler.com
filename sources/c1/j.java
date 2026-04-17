package c1;

import Z0.d;
import android.util.Base64;
import java.util.Arrays;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final String f5607a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f5608b;

    /* renamed from: c  reason: collision with root package name */
    public final d f5609c;

    public j(String str, byte[] bArr, d dVar) {
        this.f5607a = str;
        this.f5608b = bArr;
        this.f5609c = dVar;
    }

    public static i a() {
        i iVar = new i(0);
        iVar.d = d.f4466a;
        return iVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (!this.f5607a.equals(jVar.f5607a) || !Arrays.equals(this.f5608b, jVar.f5608b) || !this.f5609c.equals(jVar.f5609c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f5607a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f5608b)) * 1000003) ^ this.f5609c.hashCode();
    }

    public final String toString() {
        String str;
        byte[] bArr = this.f5608b;
        if (bArr == null) {
            str = "";
        } else {
            str = Base64.encodeToString(bArr, 2);
        }
        return "TransportContext(" + this.f5607a + ", " + this.f5609c + ", " + str + ")";
    }
}
