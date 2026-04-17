package i3;

import R2.i;
import g3.n;
import j3.e;
import java.util.HashMap;

/* renamed from: i3.i  reason: case insensitive filesystem */
public final class C0593i {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f8286a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final i f8287b;

    /* renamed from: c  reason: collision with root package name */
    public final e f8288c;
    public final e d;

    public C0593i(i iVar, n nVar, n nVar2) {
        this.f8287b = iVar;
        this.f8288c = new e(nVar, 1);
        this.d = new e(nVar2, 0);
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, n3.e] */
    public final synchronized C0592h a(n3.n nVar) {
        C0592h hVar;
        try {
            hVar = (C0592h) this.f8286a.get(nVar);
            if (hVar == null) {
                ? obj = new Object();
                obj.h = 2;
                obj.f10271j = false;
                i iVar = this.f8287b;
                iVar.b();
                if (!"[DEFAULT]".equals(iVar.f2491b)) {
                    i iVar2 = this.f8287b;
                    iVar2.b();
                    String str = iVar2.f2491b;
                    synchronized (obj) {
                        if (obj.f10271j) {
                            throw new RuntimeException("Modifications to DatabaseConfig objects must occur before they are in use");
                        } else if (str == null || str.isEmpty()) {
                            throw new IllegalArgumentException("Session identifier is not allowed to be empty or null!");
                        } else {
                            obj.f10269f = str;
                        }
                    }
                }
                i iVar3 = this.f8287b;
                synchronized (obj) {
                    obj.f10270i = iVar3;
                }
                obj.f10267c = this.f8288c;
                obj.d = this.d;
                C0592h hVar2 = new C0592h(obj, nVar);
                this.f8286a.put(nVar, hVar2);
                hVar = hVar2;
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return hVar;
    }
}
