package c1;

import A4.a;
import D0.e;
import Z0.c;
import a1.C0256a;
import android.content.Context;
import h0.C0552a;
import h1.b;
import i1.i;
import i1.j;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import l1.C0780a;

public final class p {

    /* renamed from: e  reason: collision with root package name */
    public static volatile k f5622e;

    /* renamed from: a  reason: collision with root package name */
    public final C0780a f5623a;

    /* renamed from: b  reason: collision with root package name */
    public final C0780a f5624b;

    /* renamed from: c  reason: collision with root package name */
    public final b f5625c;
    public final i d;

    public p(C0780a aVar, C0780a aVar2, b bVar, i iVar, j jVar) {
        this.f5623a = aVar;
        this.f5624b = aVar2;
        this.f5625c = bVar;
        this.d = iVar;
        jVar.getClass();
        jVar.f8273a.execute(new a(jVar, 14));
    }

    public static p a() {
        k kVar = f5622e;
        if (kVar != null) {
            return (p) kVar.f5614f.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (f5622e == null) {
            synchronized (p.class) {
                try {
                    if (f5622e == null) {
                        e eVar = new e();
                        context.getClass();
                        eVar.f494b = context;
                        f5622e = eVar.c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final o c(C0256a aVar) {
        Set set;
        byte[] bArr;
        if (aVar != null) {
            set = Collections.unmodifiableSet(C0256a.d);
        } else {
            set = Collections.singleton(new c("proto"));
        }
        i a6 = j.a();
        aVar.getClass();
        a6.f5605b = "cct";
        String str = aVar.f4544a;
        String str2 = aVar.f4545b;
        if (str2 == null && str == null) {
            bArr = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bArr = C0552a.p("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        }
        a6.f5606c = bArr;
        return new o(set, a6.c(), this);
    }
}
