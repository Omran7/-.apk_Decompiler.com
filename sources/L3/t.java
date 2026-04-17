package l3;

import X4.d;
import c1.i;
import com.google.firebase.storage.o;
import h0.C0552a;
import java.io.IOException;
import java.net.URI;
import java.util.HashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import k.e1;
import m3.C0838b;
import q3.b;
import u3.C1031a;
import w3.C1083d;
import x3.a;

public final class t {

    /* renamed from: k  reason: collision with root package name */
    public static long f9736k;

    /* renamed from: a  reason: collision with root package name */
    public d f9737a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f9738b = false;

    /* renamed from: c  reason: collision with root package name */
    public boolean f9739c = false;
    public long d = 0;

    /* renamed from: e  reason: collision with root package name */
    public C0838b f9740e;

    /* renamed from: f  reason: collision with root package name */
    public final o f9741f;
    public ScheduledFuture g;
    public ScheduledFuture h;

    /* renamed from: i  reason: collision with root package name */
    public final b f9742i;

    /* renamed from: j  reason: collision with root package name */
    public final i f9743j;

    public t(e1 e1Var, com.bumptech.glide.manager.o oVar, String str, String str2, o oVar2, String str3) {
        String str4;
        this.f9742i = (b) e1Var.f9290a;
        this.f9741f = oVar2;
        long j6 = f9736k;
        f9736k = 1 + j6;
        this.f9743j = new i(18, (Object) (C1031a) e1Var.d, "WebSocket", C0552a.m("ws_", j6));
        str = str == null ? (String) oVar.f5844c : str;
        if (oVar.f5843b) {
            str4 = "wss";
        } else {
            str4 = "ws";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str4);
        sb.append("://");
        sb.append(str);
        sb.append("/.ws?ns=");
        String r6 = C0552a.r(sb, (String) oVar.d, "&v=5");
        URI create = URI.create(str3 != null ? o3.d.g(r6, "&ls=", str3) : r6);
        HashMap hashMap = new HashMap();
        hashMap.put("User-Agent", (String) e1Var.f9293e);
        hashMap.put("X-Firebase-GMPID", (String) e1Var.f9294f);
        hashMap.put("X-Firebase-AppCheck", str2);
        this.f9737a = new d(this, new C1083d(e1Var, create, hashMap));
    }

    public static void a(t tVar) {
        if (!tVar.f9739c) {
            i iVar = tVar.f9743j;
            if (iVar.y()) {
                iVar.d("closing itself", (Throwable) null, new Object[0]);
            }
            tVar.f();
        }
        tVar.f9737a = null;
        ScheduledFuture scheduledFuture = tVar.g;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    public final void b(String str) {
        i iVar = this.f9743j;
        C0838b bVar = this.f9740e;
        if (!bVar.f10163p) {
            if (str.length() > 0) {
                bVar.f10158a.add(str);
            }
            long j6 = this.d - 1;
            this.d = j6;
            if (j6 == 0) {
                try {
                    C0838b bVar2 = this.f9740e;
                    if (!bVar2.f10163p) {
                        bVar2.f10163p = true;
                        HashMap b6 = a.b(bVar2.toString());
                        this.f9740e = null;
                        if (iVar.y()) {
                            iVar.d("handleIncomingFrame complete frame: " + b6, (Throwable) null, new Object[0]);
                        }
                        this.f9741f.h(b6);
                        return;
                    }
                    throw new IllegalStateException("Trying to freeze frozen StringListReader");
                } catch (IOException e6) {
                    iVar.g("Error parsing frame: " + this.f9740e.toString(), e6);
                    c();
                    f();
                } catch (ClassCastException e7) {
                    iVar.g("Error parsing frame (cast error): " + this.f9740e.toString(), e7);
                    c();
                    f();
                }
            }
        } else {
            throw new IllegalStateException("Trying to add string after reading");
        }
    }

    public final void c() {
        i iVar = this.f9743j;
        if (iVar.y()) {
            iVar.d("websocket is being closed", (Throwable) null, new Object[0]);
        }
        this.f9739c = true;
        ((C1083d) this.f9737a.f4209b).a();
        ScheduledFuture scheduledFuture = this.h;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledFuture scheduledFuture2 = this.g;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(true);
        }
    }

    public final void d(int i2) {
        this.d = (long) i2;
        this.f9740e = new C0838b();
        i iVar = this.f9743j;
        if (iVar.y()) {
            iVar.d("HandleNewFrameCount: " + this.d, (Throwable) null, new Object[0]);
        }
    }

    public final void e() {
        if (!this.f9739c) {
            ScheduledFuture scheduledFuture = this.g;
            i iVar = this.f9743j;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                if (iVar.y()) {
                    iVar.d("Reset keepAlive. Remaining: " + this.g.getDelay(TimeUnit.MILLISECONDS), (Throwable) null, new Object[0]);
                }
            } else if (iVar.y()) {
                iVar.d("Reset keepAlive", (Throwable) null, new Object[0]);
            }
            this.g = this.f9742i.schedule(new r(this, 1), 45000, TimeUnit.MILLISECONDS);
        }
    }

    public final void f() {
        this.f9739c = true;
        boolean z3 = this.f9738b;
        o oVar = this.f9741f;
        oVar.f6949c = null;
        i iVar = (i) oVar.f6950e;
        if (z3 || oVar.f6947a != 1) {
            if (iVar.y()) {
                iVar.d("Realtime connection lost", (Throwable) null, new Object[0]);
            }
        } else if (iVar.y()) {
            iVar.d("Realtime connection failed", (Throwable) null, new Object[0]);
        }
        oVar.b(2);
    }
}
