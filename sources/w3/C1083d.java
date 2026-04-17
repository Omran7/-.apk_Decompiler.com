package w3;

import X4.d;
import android.net.SSLCertificateSocketFactory;
import android.net.SSLSessionCache;
import android.util.Base64;
import c1.i;
import com.google.android.gms.internal.measurement.a;
import java.io.File;
import java.io.IOException;
import java.net.Socket;
import java.net.URI;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocket;
import k.C0737s0;
import k.e1;
import l3.s;
import l3.t;
import q.C0928e;
import u3.C1031a;

/* renamed from: w3.d  reason: case insensitive filesystem */
public final class C1083d {

    /* renamed from: l  reason: collision with root package name */
    public static final AtomicInteger f12419l = new AtomicInteger(0);

    /* renamed from: m  reason: collision with root package name */
    public static final Charset f12420m = Charset.forName("UTF-8");

    /* renamed from: n  reason: collision with root package name */
    public static final ThreadFactory f12421n = Executors.defaultThreadFactory();

    /* renamed from: o  reason: collision with root package name */
    public static final C1082c f12422o = new Object();

    /* renamed from: a  reason: collision with root package name */
    public volatile int f12423a = 1;

    /* renamed from: b  reason: collision with root package name */
    public volatile Socket f12424b = null;

    /* renamed from: c  reason: collision with root package name */
    public d f12425c = null;
    public final URI d;

    /* renamed from: e  reason: collision with root package name */
    public final String f12426e;

    /* renamed from: f  reason: collision with root package name */
    public final f f12427f;
    public final g g;
    public final i h;

    /* renamed from: i  reason: collision with root package name */
    public final i f12428i;

    /* renamed from: j  reason: collision with root package name */
    public final int f12429j;

    /* renamed from: k  reason: collision with root package name */
    public final Thread f12430k;

    /* JADX WARNING: type inference failed for: r8v4, types: [w3.f, java.lang.Object] */
    public C1083d(e1 e1Var, URI uri, HashMap hashMap) {
        int incrementAndGet = f12419l.incrementAndGet();
        this.f12429j = incrementAndGet;
        this.f12430k = f12421n.newThread(new C0737s0(this, 16));
        this.d = uri;
        this.f12426e = (String) e1Var.f9295p;
        this.f12428i = new i(18, (Object) (C1031a) e1Var.d, "WebSocket", a.f(incrementAndGet, "sk_"));
        i iVar = new i(19);
        iVar.f5605b = null;
        iVar.f5606c = uri;
        iVar.d = hashMap;
        byte[] bArr = new byte[16];
        for (int i2 = 0; i2 < 16; i2++) {
            bArr[i2] = (byte) ((int) ((Math.random() * ((double) 255)) + ((double) 0)));
        }
        iVar.f5605b = Base64.encodeToString(bArr, 2);
        this.h = iVar;
        ? obj = new Object();
        obj.f12431a = null;
        obj.f12432b = null;
        obj.f12433c = null;
        obj.d = new byte[112];
        obj.f12435f = false;
        obj.f12432b = this;
        this.f12427f = obj;
        this.g = new g(this, this.f12429j);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [w3.e, java.lang.RuntimeException] */
    public final synchronized void a() {
        int c3 = C0928e.c(this.f12423a);
        if (c3 == 0) {
            this.f12423a = 5;
        } else if (c3 == 1) {
            b();
        } else if (c3 == 2) {
            try {
                this.f12423a = 4;
                this.g.f12438c = true;
                this.g.b((byte) 8, new byte[0]);
            } catch (IOException e6) {
                this.f12425c.K(new RuntimeException("Failed to send close frame", e6));
            }
        } else if (c3 == 3) {
        } else {
            if (c3 == 4) {
            }
        }
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [w3.e, java.lang.RuntimeException] */
    public final synchronized void b() {
        if (this.f12423a != 5) {
            this.f12427f.f12435f = true;
            this.g.f12438c = true;
            if (this.f12424b != null) {
                try {
                    this.f12424b.close();
                } catch (Exception e6) {
                    this.f12425c.K(new RuntimeException("Failed to close", e6));
                }
            }
            this.f12423a = 5;
            d dVar = this.f12425c;
            ((t) dVar.f4210c).f9742i.execute(new s(dVar, 1));
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [w3.e, java.lang.RuntimeException] */
    public final synchronized void c() {
        if (this.f12423a != 1) {
            this.f12425c.K(new RuntimeException("connect() already called"));
            a();
            return;
        }
        C1082c cVar = f12422o;
        cVar.getClass();
        this.f12430k.setName("TubeSockReader-" + this.f12429j);
        this.f12423a = 2;
        this.f12430k.start();
    }

    public final Socket d() {
        URI uri = this.d;
        String scheme = uri.getScheme();
        String host = uri.getHost();
        int port = uri.getPort();
        if (scheme != null && scheme.equals("ws")) {
            if (port == -1) {
                port = 80;
            }
            try {
                return new Socket(host, port);
            } catch (UnknownHostException e6) {
                throw new RuntimeException(o3.d.i("unknown host: ", host), e6);
            } catch (IOException e7) {
                throw new RuntimeException("error while creating socket to " + uri, e7);
            }
        } else if (scheme == null || !scheme.equals("wss")) {
            throw new RuntimeException(o3.d.i("unsupported protocol: ", scheme));
        } else {
            if (port == -1) {
                port = 443;
            }
            SSLSessionCache sSLSessionCache = null;
            String str = this.f12426e;
            if (str != null) {
                try {
                    sSLSessionCache = new SSLSessionCache(new File(str));
                } catch (IOException e8) {
                    this.f12428i.d("Failed to initialize SSL session cache", e8, new Object[0]);
                }
            }
            try {
                SSLSocket sSLSocket = (SSLSocket) SSLCertificateSocketFactory.getDefault(60000, sSLSessionCache).createSocket(host, port);
                if (HttpsURLConnection.getDefaultHostnameVerifier().verify(host, sSLSocket.getSession())) {
                    return sSLSocket;
                }
                throw new RuntimeException("Error while verifying secure socket to " + uri);
            } catch (UnknownHostException e9) {
                throw new RuntimeException(o3.d.i("unknown host: ", host), e9);
            } catch (IOException e10) {
                throw new RuntimeException("error while creating secure socket to " + uri, e10);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [w3.e, java.lang.RuntimeException] */
    /* JADX WARNING: type inference failed for: r4v2, types: [w3.e, java.lang.RuntimeException] */
    public final synchronized void e(byte b6, byte[] bArr) {
        if (this.f12423a != 3) {
            this.f12425c.K(new RuntimeException("error while sending data: not connected"));
        } else {
            try {
                this.g.b(b6, bArr);
            } catch (IOException e6) {
                this.f12425c.K(new RuntimeException("Failed to send frame", e6));
                a();
            }
        }
    }
}
