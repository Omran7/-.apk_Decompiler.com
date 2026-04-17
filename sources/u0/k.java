package U0;

import B0.H;
import R2.b;
import androidx.fragment.app.D;
import com.bumptech.glide.c;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.utils.C0443m;
import d5.o;
import i3.C0587c;
import i3.C0588d;
import i3.C0592h;
import i3.C0595k;
import i3.p;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class k implements p {

    /* renamed from: a  reason: collision with root package name */
    public long f3689a;

    /* renamed from: b  reason: collision with root package name */
    public long f3690b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f3691c;

    public k(long j6) {
        this.f3691c = new LinkedHashMap(100, 0.75f, true);
        this.f3689a = j6;
    }

    public synchronized Object a(Object obj) {
        Object obj2;
        j jVar = (j) ((LinkedHashMap) this.f3691c).get(obj);
        if (jVar != null) {
            obj2 = jVar.f3687a;
        } else {
            obj2 = null;
        }
        return obj2;
    }

    public int b(Object obj) {
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004f, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.Object d(java.lang.Object r8, java.lang.Object r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            int r0 = r7.b(r9)     // Catch:{ all -> 0x0012 }
            long r1 = (long) r0     // Catch:{ all -> 0x0012 }
            long r3 = r7.f3689a     // Catch:{ all -> 0x0012 }
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r4 = 0
            if (r3 < 0) goto L_0x0014
            r7.c(r8, r9)     // Catch:{ all -> 0x0012 }
            monitor-exit(r7)
            return r4
        L_0x0012:
            r8 = move-exception
            goto L_0x0050
        L_0x0014:
            if (r9 == 0) goto L_0x001b
            long r5 = r7.f3690b     // Catch:{ all -> 0x0012 }
            long r5 = r5 + r1
            r7.f3690b = r5     // Catch:{ all -> 0x0012 }
        L_0x001b:
            java.lang.Object r1 = r7.f3691c     // Catch:{ all -> 0x0012 }
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch:{ all -> 0x0012 }
            if (r9 != 0) goto L_0x0023
            r2 = r4
            goto L_0x0028
        L_0x0023:
            U0.j r2 = new U0.j     // Catch:{ all -> 0x0012 }
            r2.<init>(r9, r0)     // Catch:{ all -> 0x0012 }
        L_0x0028:
            java.lang.Object r0 = r1.put(r8, r2)     // Catch:{ all -> 0x0012 }
            U0.j r0 = (U0.j) r0     // Catch:{ all -> 0x0012 }
            if (r0 == 0) goto L_0x0045
            long r1 = r7.f3690b     // Catch:{ all -> 0x0012 }
            int r3 = r0.f3688b     // Catch:{ all -> 0x0012 }
            long r5 = (long) r3     // Catch:{ all -> 0x0012 }
            long r1 = r1 - r5
            r7.f3690b = r1     // Catch:{ all -> 0x0012 }
            java.lang.Object r1 = r0.f3687a     // Catch:{ all -> 0x0012 }
            boolean r9 = r1.equals(r9)     // Catch:{ all -> 0x0012 }
            if (r9 != 0) goto L_0x0045
            java.lang.Object r9 = r0.f3687a     // Catch:{ all -> 0x0012 }
            r7.c(r8, r9)     // Catch:{ all -> 0x0012 }
        L_0x0045:
            long r8 = r7.f3689a     // Catch:{ all -> 0x0012 }
            r7.e(r8)     // Catch:{ all -> 0x0012 }
            if (r0 == 0) goto L_0x004e
            java.lang.Object r4 = r0.f3687a     // Catch:{ all -> 0x0012 }
        L_0x004e:
            monitor-exit(r7)
            return r4
        L_0x0050:
            monitor-exit(r7)     // Catch:{ all -> 0x0012 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: U0.k.d(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public synchronized void e(long j6) {
        while (this.f3690b > j6) {
            Iterator it2 = ((LinkedHashMap) this.f3691c).entrySet().iterator();
            Map.Entry entry = (Map.Entry) it2.next();
            j jVar = (j) entry.getValue();
            this.f3690b -= (long) jVar.f3688b;
            Object key = entry.getKey();
            it2.remove();
            c(key, jVar.f3687a);
        }
    }

    public H f(C0595k kVar) {
        if (kVar.b() == null) {
            return b.W0(kVar);
        }
        Long l6 = (Long) kVar.c(Long.class);
        this.f3689a = l6.longValue();
        if (c.U(c.W(l6)) < 86400) {
            return b.a();
        }
        kVar.d(Long.valueOf(this.f3690b * 1000));
        return b.W0(kVar);
    }

    public void l(C0588d dVar, boolean z3, C0587c cVar) {
        if (dVar != null || !cVar.b() || !z3) {
            ((D) this.f3691c).l(false);
            if (this.f3689a != ((Long) o.getEstateObject().getLastTimeDailyTaxPaidInMilli()).longValue()) {
                a.d(a.c(C0592h.b().e(), "players"), "estateObject", "lastTimeDailyTaxPaidInMilli").I(Long.valueOf(this.f3689a)).addOnSuccessListener(new C0443m(this, 0));
                return;
            }
            return;
        }
        a.d(a.c(C0592h.b().e(), "players"), "estateObject", "lastTimeDailyTaxPaidInMilli").I(Long.valueOf(this.f3690b * 1000)).addOnSuccessListener(new C0443m(this, 1));
    }

    public k(long j6, D d) {
        this.f3690b = j6;
        this.f3691c = d;
    }

    public void c(Object obj, Object obj2) {
    }
}
