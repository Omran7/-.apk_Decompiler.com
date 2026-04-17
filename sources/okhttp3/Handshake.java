package okhttp3;

import java.io.IOException;
import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import okhttp3.internal.Util;

public final class Handshake {

    /* renamed from: a  reason: collision with root package name */
    public final TlsVersion f10556a;

    /* renamed from: b  reason: collision with root package name */
    public final CipherSuite f10557b;

    /* renamed from: c  reason: collision with root package name */
    public final List f10558c;
    public final List d;

    public Handshake(TlsVersion tlsVersion, CipherSuite cipherSuite, List list, List list2) {
        this.f10556a = tlsVersion;
        this.f10557b = cipherSuite;
        this.f10558c = list;
        this.d = list2;
    }

    public static Handshake a(SSLSession sSLSession) {
        Certificate[] certificateArr;
        List list;
        List list2;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        } else if (!"SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
            CipherSuite a6 = CipherSuite.a(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null");
            } else if (!"NONE".equals(protocol)) {
                TlsVersion a7 = TlsVersion.a(protocol);
                try {
                    certificateArr = sSLSession.getPeerCertificates();
                } catch (SSLPeerUnverifiedException unused) {
                    certificateArr = null;
                }
                if (certificateArr != null) {
                    list = Util.n(certificateArr);
                } else {
                    list = Collections.emptyList();
                }
                Certificate[] localCertificates = sSLSession.getLocalCertificates();
                if (localCertificates != null) {
                    list2 = Util.n(localCertificates);
                } else {
                    list2 = Collections.emptyList();
                }
                return new Handshake(a7, a6, list, list2);
            } else {
                throw new IOException("tlsVersion == NONE");
            }
        } else {
            throw new IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Handshake)) {
            return false;
        }
        Handshake handshake = (Handshake) obj;
        if (!this.f10556a.equals(handshake.f10556a) || !this.f10557b.equals(handshake.f10557b) || !this.f10558c.equals(handshake.f10558c) || !this.d.equals(handshake.d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f10557b.hashCode();
        int hashCode2 = this.f10558c.hashCode();
        return this.d.hashCode() + ((hashCode2 + ((hashCode + ((this.f10556a.hashCode() + 527) * 31)) * 31)) * 31);
    }
}
