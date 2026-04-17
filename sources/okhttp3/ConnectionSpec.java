package okhttp3;

import h0.C0552a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import javax.net.ssl.SSLSocket;
import okhttp3.internal.Util;

public final class ConnectionSpec {

    /* renamed from: e  reason: collision with root package name */
    public static final ConnectionSpec f10530e;

    /* renamed from: f  reason: collision with root package name */
    public static final ConnectionSpec f10531f = new ConnectionSpec(new Builder(false));

    /* renamed from: a  reason: collision with root package name */
    public final boolean f10532a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f10533b;

    /* renamed from: c  reason: collision with root package name */
    public final String[] f10534c;
    public final String[] d;

    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        public boolean f10535a;

        /* renamed from: b  reason: collision with root package name */
        public String[] f10536b;

        /* renamed from: c  reason: collision with root package name */
        public String[] f10537c;
        public boolean d;

        public Builder(boolean z3) {
            this.f10535a = z3;
        }

        public final void a(String... strArr) {
            if (!this.f10535a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            } else if (strArr.length != 0) {
                this.f10536b = (String[]) strArr.clone();
            } else {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
        }

        public final void b(CipherSuite... cipherSuiteArr) {
            if (this.f10535a) {
                String[] strArr = new String[cipherSuiteArr.length];
                for (int i2 = 0; i2 < cipherSuiteArr.length; i2++) {
                    strArr[i2] = cipherSuiteArr[i2].f10523a;
                }
                a(strArr);
                return;
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        public final void c(String... strArr) {
            if (!this.f10535a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            } else if (strArr.length != 0) {
                this.f10537c = (String[]) strArr.clone();
            } else {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
        }

        public final void d(TlsVersion... tlsVersionArr) {
            if (this.f10535a) {
                String[] strArr = new String[tlsVersionArr.length];
                for (int i2 = 0; i2 < tlsVersionArr.length; i2++) {
                    strArr[i2] = tlsVersionArr[i2].f10680a;
                }
                c(strArr);
                return;
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
    }

    static {
        CipherSuite cipherSuite = CipherSuite.f10518q;
        CipherSuite cipherSuite2 = CipherSuite.f10519r;
        CipherSuite cipherSuite3 = CipherSuite.f10520s;
        CipherSuite cipherSuite4 = CipherSuite.f10521t;
        CipherSuite cipherSuite5 = CipherSuite.f10522u;
        CipherSuite cipherSuite6 = CipherSuite.f10512k;
        CipherSuite cipherSuite7 = CipherSuite.f10514m;
        CipherSuite cipherSuite8 = CipherSuite.f10513l;
        CipherSuite cipherSuite9 = CipherSuite.f10515n;
        CipherSuite cipherSuite10 = CipherSuite.f10517p;
        CipherSuite cipherSuite11 = CipherSuite.f10516o;
        CipherSuite[] cipherSuiteArr = {cipherSuite, cipherSuite2, cipherSuite3, cipherSuite4, cipherSuite5, cipherSuite6, cipherSuite7, cipherSuite8, cipherSuite9, cipherSuite10, cipherSuite11};
        CipherSuite[] cipherSuiteArr2 = {cipherSuite, cipherSuite2, cipherSuite3, cipherSuite4, cipherSuite5, cipherSuite6, cipherSuite7, cipherSuite8, cipherSuite9, cipherSuite10, cipherSuite11, CipherSuite.f10510i, CipherSuite.f10511j, CipherSuite.g, CipherSuite.h, CipherSuite.f10508e, CipherSuite.f10509f, CipherSuite.d};
        Builder builder = new Builder(true);
        builder.b(cipherSuiteArr);
        TlsVersion tlsVersion = TlsVersion.TLS_1_3;
        TlsVersion tlsVersion2 = TlsVersion.TLS_1_2;
        builder.d(tlsVersion, tlsVersion2);
        if (builder.f10535a) {
            builder.d = true;
            new ConnectionSpec(builder);
            Builder builder2 = new Builder(true);
            builder2.b(cipherSuiteArr2);
            TlsVersion tlsVersion3 = TlsVersion.TLS_1_1;
            TlsVersion tlsVersion4 = TlsVersion.TLS_1_0;
            builder2.d(tlsVersion, tlsVersion2, tlsVersion3, tlsVersion4);
            if (builder2.f10535a) {
                builder2.d = true;
                f10530e = new ConnectionSpec(builder2);
                Builder builder3 = new Builder(true);
                builder3.b(cipherSuiteArr2);
                builder3.d(tlsVersion4);
                if (builder3.f10535a) {
                    builder3.d = true;
                    new ConnectionSpec(builder3);
                    return;
                }
                throw new IllegalStateException("no TLS extensions for cleartext connections");
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
        throw new IllegalStateException("no TLS extensions for cleartext connections");
    }

    public ConnectionSpec(Builder builder) {
        this.f10532a = builder.f10535a;
        this.f10534c = builder.f10536b;
        this.d = builder.f10537c;
        this.f10533b = builder.d;
    }

    public final boolean a(SSLSocket sSLSocket) {
        if (!this.f10532a) {
            return false;
        }
        String[] strArr = this.d;
        if (strArr != null && !Util.q(Util.f10694o, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.f10534c;
        if (strArr2 == null || Util.q(CipherSuite.f10506b, strArr2, sSLSocket.getEnabledCipherSuites())) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ConnectionSpec)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        ConnectionSpec connectionSpec = (ConnectionSpec) obj;
        boolean z3 = connectionSpec.f10532a;
        boolean z4 = this.f10532a;
        if (z4 != z3) {
            return false;
        }
        if (!z4 || (Arrays.equals(this.f10534c, connectionSpec.f10534c) && Arrays.equals(this.d, connectionSpec.d) && this.f10533b == connectionSpec.f10533b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f10532a) {
            return ((((527 + Arrays.hashCode(this.f10534c)) * 31) + Arrays.hashCode(this.d)) * 31) + (this.f10533b ^ true ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        String str;
        if (!this.f10532a) {
            return "ConnectionSpec()";
        }
        String str2 = "[all enabled]";
        String[] strArr = this.f10534c;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String a6 : strArr) {
                arrayList.add(CipherSuite.a(a6));
            }
            str = Collections.unmodifiableList(arrayList).toString();
        } else {
            str = str2;
        }
        String[] strArr2 = this.d;
        if (strArr2 != null) {
            ArrayList arrayList2 = new ArrayList(strArr2.length);
            for (String a7 : strArr2) {
                arrayList2.add(TlsVersion.a(a7));
            }
            str2 = Collections.unmodifiableList(arrayList2).toString();
        }
        StringBuilder u6 = C0552a.u("ConnectionSpec(cipherSuites=", str, ", tlsVersions=", str2, ", supportsTlsExtensions=");
        u6.append(this.f10533b);
        u6.append(")");
        return u6.toString();
    }
}
