package F0;

import U0.g;
import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;
import z0.C1130f;

public final class i implements C1130f {

    /* renamed from: b  reason: collision with root package name */
    public final m f688b;

    /* renamed from: c  reason: collision with root package name */
    public final URL f689c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public String f690e;

    /* renamed from: f  reason: collision with root package name */
    public URL f691f;
    public volatile byte[] g;
    public int h;

    public i(URL url) {
        m mVar = j.f692a;
        g.c(url, "Argument must not be null");
        this.f689c = url;
        this.d = null;
        g.c(mVar, "Argument must not be null");
        this.f688b = mVar;
    }

    public final void a(MessageDigest messageDigest) {
        if (this.g == null) {
            this.g = c().getBytes(C1130f.f12789a);
        }
        messageDigest.update(this.g);
    }

    public final String c() {
        String str = this.d;
        if (str != null) {
            return str;
        }
        URL url = this.f689c;
        g.c(url, "Argument must not be null");
        return url.toString();
    }

    public final URL d() {
        if (this.f691f == null) {
            if (TextUtils.isEmpty(this.f690e)) {
                String str = this.d;
                if (TextUtils.isEmpty(str)) {
                    URL url = this.f689c;
                    g.c(url, "Argument must not be null");
                    str = url.toString();
                }
                this.f690e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
            }
            this.f691f = new URL(this.f690e);
        }
        return this.f691f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (!c().equals(iVar.c()) || !this.f688b.equals(iVar.f688b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.h == 0) {
            int hashCode = c().hashCode();
            this.h = hashCode;
            this.h = this.f688b.f695b.hashCode() + (hashCode * 31);
        }
        return this.h;
    }

    public final String toString() {
        return c();
    }

    public i(String str) {
        m mVar = j.f692a;
        this.f689c = null;
        if (!TextUtils.isEmpty(str)) {
            this.d = str;
            g.c(mVar, "Argument must not be null");
            this.f688b = mVar;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }
}
