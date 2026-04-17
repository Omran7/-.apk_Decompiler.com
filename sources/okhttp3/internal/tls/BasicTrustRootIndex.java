package okhttp3.internal.tls;

import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

public final class BasicTrustRootIndex implements TrustRootIndex {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap f10938a = new LinkedHashMap();

    public BasicTrustRootIndex(X509Certificate... x509CertificateArr) {
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            Set set = (Set) this.f10938a.get(subjectX500Principal);
            if (set == null) {
                set = new LinkedHashSet(1);
                this.f10938a.put(subjectX500Principal, set);
            }
            set.add(x509Certificate);
        }
    }

    public final X509Certificate a(X509Certificate x509Certificate) {
        Set<X509Certificate> set = (Set) this.f10938a.get(x509Certificate.getIssuerX500Principal());
        if (set == null) {
            return null;
        }
        for (X509Certificate x509Certificate2 : set) {
            try {
                x509Certificate.verify(x509Certificate2.getPublicKey());
                return x509Certificate2;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BasicTrustRootIndex) || !((BasicTrustRootIndex) obj).f10938a.equals(this.f10938a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f10938a.hashCode();
    }
}
