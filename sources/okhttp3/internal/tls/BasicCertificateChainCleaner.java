package okhttp3.internal.tls;

import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

public final class BasicCertificateChainCleaner extends CertificateChainCleaner {

    /* renamed from: a  reason: collision with root package name */
    public final TrustRootIndex f10937a;

    public BasicCertificateChainCleaner(TrustRootIndex trustRootIndex) {
        this.f10937a = trustRootIndex;
    }

    public final List a(String str, List list) {
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        arrayList.add(arrayDeque.removeFirst());
        boolean z3 = false;
        for (int i2 = 0; i2 < 9; i2++) {
            X509Certificate x509Certificate = (X509Certificate) arrayList.get(arrayList.size() - 1);
            X509Certificate a6 = this.f10937a.a(x509Certificate);
            if (a6 != null) {
                if (arrayList.size() > 1 || !x509Certificate.equals(a6)) {
                    arrayList.add(a6);
                }
                if (a6.getIssuerDN().equals(a6.getSubjectDN())) {
                    try {
                        a6.verify(a6.getPublicKey());
                        return arrayList;
                    } catch (GeneralSecurityException unused) {
                    }
                }
                z3 = true;
            } else {
                Iterator it2 = arrayDeque.iterator();
                while (it2.hasNext()) {
                    X509Certificate x509Certificate2 = (X509Certificate) it2.next();
                    if (x509Certificate.getIssuerDN().equals(x509Certificate2.getSubjectDN())) {
                        try {
                            x509Certificate.verify(x509Certificate2.getPublicKey());
                            it2.remove();
                            arrayList.add(x509Certificate2);
                        } catch (GeneralSecurityException unused2) {
                            continue;
                        }
                    }
                }
                if (z3) {
                    return arrayList;
                }
                throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
            }
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BasicCertificateChainCleaner) || !((BasicCertificateChainCleaner) obj).f10937a.equals(this.f10937a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f10937a.hashCode();
    }
}
