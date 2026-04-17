package okhttp3;

import N5.g;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import okhttp3.internal.Util;
import okhttp3.internal.tls.CertificateChainCleaner;

public final class CertificatePinner {

    /* renamed from: c  reason: collision with root package name */
    public static final CertificatePinner f10502c = new CertificatePinner(new LinkedHashSet(new Builder().f10505a), (CertificateChainCleaner) null);

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashSet f10503a;

    /* renamed from: b  reason: collision with root package name */
    public final CertificateChainCleaner f10504b;

    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList f10505a = new ArrayList();
    }

    public static final class Pin {
        public final boolean equals(Object obj) {
            if (!(obj instanceof Pin)) {
                return false;
            }
            ((Pin) obj).getClass();
            throw null;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }

    public CertificatePinner(LinkedHashSet linkedHashSet, CertificateChainCleaner certificateChainCleaner) {
        this.f10503a = linkedHashSet;
        this.f10504b = certificateChainCleaner;
    }

    public static String b(X509Certificate x509Certificate) {
        if (x509Certificate != null) {
            StringBuilder sb = new StringBuilder("sha256/");
            g t6 = g.t(x509Certificate.getPublicKey().getEncoded());
            t6.getClass();
            try {
                sb.append(g.t(MessageDigest.getInstance("SHA-256").digest(t6.f1934a)).a());
                return sb.toString();
            } catch (NoSuchAlgorithmException e6) {
                throw new AssertionError(e6);
            }
        } else {
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
        }
    }

    public final void a(String str, List list) {
        List emptyList = Collections.emptyList();
        Iterator it2 = this.f10503a.iterator();
        if (it2.hasNext()) {
            ((Pin) it2.next()).getClass();
            throw null;
        } else if (!emptyList.isEmpty()) {
            CertificateChainCleaner certificateChainCleaner = this.f10504b;
            if (certificateChainCleaner != null) {
                list = certificateChainCleaner.a(str, list);
            }
            int size = list.size();
            int i2 = 0;
            while (i2 < size) {
                X509Certificate x509Certificate = (X509Certificate) list.get(i2);
                if (emptyList.size() <= 0) {
                    i2++;
                } else {
                    ((Pin) emptyList.get(0)).getClass();
                    throw null;
                }
            }
            StringBuilder sb = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
            int size2 = list.size();
            for (int i5 = 0; i5 < size2; i5++) {
                X509Certificate x509Certificate2 = (X509Certificate) list.get(i5);
                sb.append("\n    ");
                sb.append(b(x509Certificate2));
                sb.append(": ");
                sb.append(x509Certificate2.getSubjectDN().getName());
            }
            sb.append("\n  Pinned certificates for ");
            sb.append(str);
            sb.append(":");
            int size3 = emptyList.size();
            for (int i6 = 0; i6 < size3; i6++) {
                sb.append("\n    ");
                sb.append((Pin) emptyList.get(i6));
            }
            throw new SSLPeerUnverifiedException(sb.toString());
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CertificatePinner) {
            CertificatePinner certificatePinner = (CertificatePinner) obj;
            if (!Util.k(this.f10504b, certificatePinner.f10504b) || !this.f10503a.equals(certificatePinner.f10503a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        CertificateChainCleaner certificateChainCleaner = this.f10504b;
        if (certificateChainCleaner != null) {
            i2 = certificateChainCleaner.hashCode();
        } else {
            i2 = 0;
        }
        return this.f10503a.hashCode() + (i2 * 31);
    }
}
