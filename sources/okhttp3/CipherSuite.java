package okhttp3;

import java.util.Comparator;
import java.util.LinkedHashMap;

public final class CipherSuite {

    /* renamed from: b  reason: collision with root package name */
    public static final Comparator f10506b = new Comparator<String>() {
        public final int compare(Object obj, Object obj2) {
            String str = (String) obj;
            String str2 = (String) obj2;
            int min = Math.min(str.length(), str2.length());
            int i2 = 4;
            while (true) {
                if (i2 < min) {
                    char charAt = str.charAt(i2);
                    char charAt2 = str2.charAt(i2);
                    if (charAt == charAt2) {
                        i2++;
                    } else if (charAt >= charAt2) {
                        return 1;
                    }
                } else {
                    int length = str.length();
                    int length2 = str2.length();
                    if (length == length2) {
                        return 0;
                    }
                    if (length >= length2) {
                        return 1;
                    }
                }
            }
            return -1;
        }
    };

    /* renamed from: c  reason: collision with root package name */
    public static final LinkedHashMap f10507c = new LinkedHashMap();
    public static final CipherSuite d = b("SSL_RSA_WITH_3DES_EDE_CBC_SHA");

    /* renamed from: e  reason: collision with root package name */
    public static final CipherSuite f10508e = b("TLS_RSA_WITH_AES_128_CBC_SHA");

    /* renamed from: f  reason: collision with root package name */
    public static final CipherSuite f10509f = b("TLS_RSA_WITH_AES_256_CBC_SHA");
    public static final CipherSuite g = b("TLS_RSA_WITH_AES_128_GCM_SHA256");
    public static final CipherSuite h = b("TLS_RSA_WITH_AES_256_GCM_SHA384");

    /* renamed from: i  reason: collision with root package name */
    public static final CipherSuite f10510i = b("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA");

    /* renamed from: j  reason: collision with root package name */
    public static final CipherSuite f10511j = b("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA");

    /* renamed from: k  reason: collision with root package name */
    public static final CipherSuite f10512k = b("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256");

    /* renamed from: l  reason: collision with root package name */
    public static final CipherSuite f10513l = b("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384");

    /* renamed from: m  reason: collision with root package name */
    public static final CipherSuite f10514m = b("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");

    /* renamed from: n  reason: collision with root package name */
    public static final CipherSuite f10515n = b("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384");

    /* renamed from: o  reason: collision with root package name */
    public static final CipherSuite f10516o = b("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256");

    /* renamed from: p  reason: collision with root package name */
    public static final CipherSuite f10517p = b("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256");

    /* renamed from: q  reason: collision with root package name */
    public static final CipherSuite f10518q = b("TLS_AES_128_GCM_SHA256");

    /* renamed from: r  reason: collision with root package name */
    public static final CipherSuite f10519r = b("TLS_AES_256_GCM_SHA384");

    /* renamed from: s  reason: collision with root package name */
    public static final CipherSuite f10520s = b("TLS_CHACHA20_POLY1305_SHA256");

    /* renamed from: t  reason: collision with root package name */
    public static final CipherSuite f10521t = b("TLS_AES_128_CCM_SHA256");

    /* renamed from: u  reason: collision with root package name */
    public static final CipherSuite f10522u = b("TLS_AES_256_CCM_8_SHA256");

    /* renamed from: a  reason: collision with root package name */
    public final String f10523a;

    static {
        b("SSL_RSA_WITH_NULL_MD5");
        b("SSL_RSA_WITH_NULL_SHA");
        b("SSL_RSA_EXPORT_WITH_RC4_40_MD5");
        b("SSL_RSA_WITH_RC4_128_MD5");
        b("SSL_RSA_WITH_RC4_128_SHA");
        b("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA");
        b("SSL_RSA_WITH_DES_CBC_SHA");
        b("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA");
        b("SSL_DHE_DSS_WITH_DES_CBC_SHA");
        b("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA");
        b("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA");
        b("SSL_DHE_RSA_WITH_DES_CBC_SHA");
        b("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA");
        b("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5");
        b("SSL_DH_anon_WITH_RC4_128_MD5");
        b("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA");
        b("SSL_DH_anon_WITH_DES_CBC_SHA");
        b("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA");
        b("TLS_KRB5_WITH_DES_CBC_SHA");
        b("TLS_KRB5_WITH_3DES_EDE_CBC_SHA");
        b("TLS_KRB5_WITH_RC4_128_SHA");
        b("TLS_KRB5_WITH_DES_CBC_MD5");
        b("TLS_KRB5_WITH_3DES_EDE_CBC_MD5");
        b("TLS_KRB5_WITH_RC4_128_MD5");
        b("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA");
        b("TLS_KRB5_EXPORT_WITH_RC4_40_SHA");
        b("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5");
        b("TLS_KRB5_EXPORT_WITH_RC4_40_MD5");
        b("TLS_DHE_DSS_WITH_AES_128_CBC_SHA");
        b("TLS_DHE_RSA_WITH_AES_128_CBC_SHA");
        b("TLS_DH_anon_WITH_AES_128_CBC_SHA");
        b("TLS_DHE_DSS_WITH_AES_256_CBC_SHA");
        b("TLS_DHE_RSA_WITH_AES_256_CBC_SHA");
        b("TLS_DH_anon_WITH_AES_256_CBC_SHA");
        b("TLS_RSA_WITH_NULL_SHA256");
        b("TLS_RSA_WITH_AES_128_CBC_SHA256");
        b("TLS_RSA_WITH_AES_256_CBC_SHA256");
        b("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256");
        b("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA");
        b("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA");
        b("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA");
        b("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256");
        b("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256");
        b("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256");
        b("TLS_DH_anon_WITH_AES_128_CBC_SHA256");
        b("TLS_DH_anon_WITH_AES_256_CBC_SHA256");
        b("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA");
        b("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA");
        b("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA");
        b("TLS_PSK_WITH_RC4_128_SHA");
        b("TLS_PSK_WITH_3DES_EDE_CBC_SHA");
        b("TLS_PSK_WITH_AES_128_CBC_SHA");
        b("TLS_PSK_WITH_AES_256_CBC_SHA");
        b("TLS_RSA_WITH_SEED_CBC_SHA");
        b("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256");
        b("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384");
        b("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256");
        b("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384");
        b("TLS_DH_anon_WITH_AES_128_GCM_SHA256");
        b("TLS_DH_anon_WITH_AES_256_GCM_SHA384");
        b("TLS_EMPTY_RENEGOTIATION_INFO_SCSV");
        b("TLS_FALLBACK_SCSV");
        b("TLS_ECDH_ECDSA_WITH_NULL_SHA");
        b("TLS_ECDH_ECDSA_WITH_RC4_128_SHA");
        b("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA");
        b("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA");
        b("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA");
        b("TLS_ECDHE_ECDSA_WITH_NULL_SHA");
        b("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA");
        b("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA");
        b("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA");
        b("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA");
        b("TLS_ECDH_RSA_WITH_NULL_SHA");
        b("TLS_ECDH_RSA_WITH_RC4_128_SHA");
        b("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA");
        b("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA");
        b("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA");
        b("TLS_ECDHE_RSA_WITH_NULL_SHA");
        b("TLS_ECDHE_RSA_WITH_RC4_128_SHA");
        b("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA");
        b("TLS_ECDH_anon_WITH_NULL_SHA");
        b("TLS_ECDH_anon_WITH_RC4_128_SHA");
        b("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA");
        b("TLS_ECDH_anon_WITH_AES_128_CBC_SHA");
        b("TLS_ECDH_anon_WITH_AES_256_CBC_SHA");
        b("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256");
        b("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384");
        b("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256");
        b("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384");
        b("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256");
        b("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384");
        b("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256");
        b("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384");
        b("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256");
        b("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384");
        b("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256");
        b("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384");
        b("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA");
        b("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA");
        b("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
        b("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256");
    }

    public CipherSuite(String str) {
        str.getClass();
        this.f10523a = str;
    }

    public static synchronized CipherSuite a(String str) {
        CipherSuite cipherSuite;
        String str2;
        synchronized (CipherSuite.class) {
            try {
                LinkedHashMap linkedHashMap = f10507c;
                cipherSuite = (CipherSuite) linkedHashMap.get(str);
                if (cipherSuite == null) {
                    if (str.startsWith("TLS_")) {
                        str2 = "SSL_" + str.substring(4);
                    } else if (str.startsWith("SSL_")) {
                        str2 = "TLS_" + str.substring(4);
                    } else {
                        str2 = str;
                    }
                    cipherSuite = (CipherSuite) linkedHashMap.get(str2);
                    if (cipherSuite == null) {
                        cipherSuite = new CipherSuite(str);
                    }
                    linkedHashMap.put(str, cipherSuite);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return cipherSuite;
    }

    public static CipherSuite b(String str) {
        CipherSuite cipherSuite = new CipherSuite(str);
        f10507c.put(str, cipherSuite);
        return cipherSuite;
    }

    public final String toString() {
        return this.f10523a;
    }
}
