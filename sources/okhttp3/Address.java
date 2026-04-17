package okhttp3;

import com.google.android.gms.internal.measurement.a;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;

public final class Address {

    /* renamed from: a  reason: collision with root package name */
    public final HttpUrl f10480a;

    /* renamed from: b  reason: collision with root package name */
    public final Dns f10481b;

    /* renamed from: c  reason: collision with root package name */
    public final SocketFactory f10482c;
    public final Authenticator d;

    /* renamed from: e  reason: collision with root package name */
    public final List f10483e;

    /* renamed from: f  reason: collision with root package name */
    public final List f10484f;
    public final ProxySelector g;
    public final SSLSocketFactory h;

    /* renamed from: i  reason: collision with root package name */
    public final HostnameVerifier f10485i;

    /* renamed from: j  reason: collision with root package name */
    public final CertificatePinner f10486j;

    public Address(String str, int i2, Dns dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, CertificatePinner certificatePinner, Authenticator authenticator, List list, List list2, ProxySelector proxySelector) {
        String str2 = str;
        int i5 = i2;
        Dns dns2 = dns;
        SocketFactory socketFactory2 = socketFactory;
        SSLSocketFactory sSLSocketFactory2 = sSLSocketFactory;
        Authenticator authenticator2 = authenticator;
        ProxySelector proxySelector2 = proxySelector;
        HttpUrl.Builder builder = new HttpUrl.Builder();
        String str3 = sSLSocketFactory2 != null ? "https" : "http";
        if (str3.equalsIgnoreCase("http")) {
            builder.f10568a = "http";
        } else if (str3.equalsIgnoreCase("https")) {
            builder.f10568a = "https";
        } else {
            throw new IllegalArgumentException("unexpected scheme: ".concat(str3));
        }
        if (str2 != null) {
            String c3 = Util.c(HttpUrl.g(0, str.length(), str, false));
            if (c3 != null) {
                builder.d = c3;
                if (i5 <= 0 || i5 > 65535) {
                    throw new IllegalArgumentException(a.f(i2, "unexpected port: "));
                }
                builder.f10571e = i5;
                this.f10480a = builder.a();
                if (dns2 != null) {
                    this.f10481b = dns2;
                    if (socketFactory2 != null) {
                        this.f10482c = socketFactory2;
                        if (authenticator2 != null) {
                            this.d = authenticator2;
                            if (list != null) {
                                this.f10483e = Util.m(list);
                                if (list2 != null) {
                                    this.f10484f = Util.m(list2);
                                    if (proxySelector2 != null) {
                                        this.g = proxySelector2;
                                        this.h = sSLSocketFactory2;
                                        this.f10485i = hostnameVerifier;
                                        this.f10486j = certificatePinner;
                                        return;
                                    }
                                    throw new NullPointerException("proxySelector == null");
                                }
                                throw new NullPointerException("connectionSpecs == null");
                            }
                            throw new NullPointerException("protocols == null");
                        }
                        throw new NullPointerException("proxyAuthenticator == null");
                    }
                    throw new NullPointerException("socketFactory == null");
                }
                throw new NullPointerException("dns == null");
            }
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        }
        throw new NullPointerException("host == null");
    }

    public final boolean a(Address address) {
        if (!this.f10481b.equals(address.f10481b) || !this.d.equals(address.d) || !this.f10483e.equals(address.f10483e) || !this.f10484f.equals(address.f10484f) || !this.g.equals(address.g) || !Util.k((Object) null, (Object) null) || !Util.k(this.h, address.h) || !Util.k(this.f10485i, address.f10485i) || !Util.k(this.f10486j, address.f10486j) || this.f10480a.f10565e != address.f10480a.f10565e) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Address) {
            Address address = (Address) obj;
            if (!this.f10480a.equals(address.f10480a) || !a(address)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        int i5;
        int hashCode = this.f10481b.hashCode();
        int hashCode2 = this.d.hashCode();
        int hashCode3 = this.f10483e.hashCode();
        int hashCode4 = (this.g.hashCode() + ((this.f10484f.hashCode() + ((hashCode3 + ((hashCode2 + ((hashCode + ((this.f10480a.f10567i.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 961;
        int i6 = 0;
        SSLSocketFactory sSLSocketFactory = this.h;
        if (sSLSocketFactory != null) {
            i2 = sSLSocketFactory.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (hashCode4 + i2) * 31;
        HostnameVerifier hostnameVerifier = this.f10485i;
        if (hostnameVerifier != null) {
            i5 = hostnameVerifier.hashCode();
        } else {
            i5 = 0;
        }
        int i8 = (i7 + i5) * 31;
        CertificatePinner certificatePinner = this.f10486j;
        if (certificatePinner != null) {
            i6 = certificatePinner.hashCode();
        }
        return i8 + i6;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        HttpUrl httpUrl = this.f10480a;
        sb.append(httpUrl.d);
        sb.append(":");
        sb.append(httpUrl.f10565e);
        sb.append(", proxySelector=");
        sb.append(this.g);
        sb.append("}");
        return sb.toString();
    }
}
