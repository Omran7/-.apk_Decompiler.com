package m0;

import G.l;
import H4.i;
import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import com.google.crypto.tink.shaded.protobuf.C0407l;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import k5.C0770g;

/* renamed from: m0.m  reason: case insensitive filesystem */
public final class C0821m implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public static final ThreadLocal f10018e = new ThreadLocal();

    /* renamed from: f  reason: collision with root package name */
    public static final i f10019f = new i(10);

    /* renamed from: a  reason: collision with root package name */
    public ArrayList f10020a;

    /* renamed from: b  reason: collision with root package name */
    public long f10021b;

    /* renamed from: c  reason: collision with root package name */
    public long f10022c;
    public ArrayList d;

    public static T c(RecyclerView recyclerView, int i2, long j6) {
        int v6 = recyclerView.f5356e.v();
        for (int i5 = 0; i5 < v6; i5++) {
            T I6 = RecyclerView.I(recyclerView.f5356e.t(i5));
            if (I6.f9895c == i2 && !I6.g()) {
                return null;
            }
        }
        C0770g gVar = recyclerView.f5351b;
        try {
            recyclerView.P();
            T n2 = gVar.n(i2, j6);
            if (n2 != null) {
                if (!n2.f() || n2.g()) {
                    gVar.b(n2, false);
                } else {
                    gVar.h(n2.f9893a);
                }
            }
            return n2;
        } finally {
            recyclerView.Q(false);
        }
    }

    public final void a(RecyclerView recyclerView, int i2, int i5) {
        if (recyclerView.f5386y && this.f10021b == 0) {
            this.f10021b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        C0407l lVar = recyclerView.f5364k0;
        lVar.f6829a = i2;
        lVar.f6830b = i5;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: m0.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v7, resolved type: m0.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: m0.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(long r17) {
        /*
            r16 = this;
            r1 = r16
            r0 = 1
            java.util.ArrayList r2 = r1.f10020a
            int r3 = r2.size()
            r4 = 0
            r5 = r4
            r6 = r5
        L_0x000c:
            if (r5 >= r3) goto L_0x0024
            java.lang.Object r7 = r2.get(r5)
            androidx.recyclerview.widget.RecyclerView r7 = (androidx.recyclerview.widget.RecyclerView) r7
            int r8 = r7.getWindowVisibility()
            if (r8 != 0) goto L_0x0022
            com.google.crypto.tink.shaded.protobuf.l r8 = r7.f5364k0
            r8.b(r7, r4)
            int r7 = r8.f6831c
            int r6 = r6 + r7
        L_0x0022:
            int r5 = r5 + r0
            goto L_0x000c
        L_0x0024:
            java.util.ArrayList r5 = r1.d
            r5.ensureCapacity(r6)
            r6 = r4
            r7 = r6
        L_0x002b:
            if (r6 >= r3) goto L_0x0084
            java.lang.Object r8 = r2.get(r6)
            androidx.recyclerview.widget.RecyclerView r8 = (androidx.recyclerview.widget.RecyclerView) r8
            int r9 = r8.getWindowVisibility()
            if (r9 == 0) goto L_0x003a
            goto L_0x0082
        L_0x003a:
            com.google.crypto.tink.shaded.protobuf.l r9 = r8.f5364k0
            int r10 = r9.f6829a
            int r10 = java.lang.Math.abs(r10)
            int r11 = r9.f6830b
            int r11 = java.lang.Math.abs(r11)
            int r11 = r11 + r10
            r10 = r4
        L_0x004a:
            int r12 = r9.f6831c
            int r12 = r12 * 2
            if (r10 >= r12) goto L_0x0082
            int r12 = r5.size()
            if (r7 < r12) goto L_0x005f
            m0.l r12 = new m0.l
            r12.<init>()
            r5.add(r12)
            goto L_0x0065
        L_0x005f:
            java.lang.Object r12 = r5.get(r7)
            m0.l r12 = (m0.C0820l) r12
        L_0x0065:
            java.lang.Object r13 = r9.d
            int[] r13 = (int[]) r13
            int r14 = r10 + 1
            r14 = r13[r14]
            if (r14 > r11) goto L_0x0071
            r15 = r0
            goto L_0x0072
        L_0x0071:
            r15 = r4
        L_0x0072:
            r12.f10014a = r15
            r12.f10015b = r11
            r12.f10016c = r14
            r12.d = r8
            r13 = r13[r10]
            r12.f10017e = r13
            int r7 = r7 + r0
            int r10 = r10 + 2
            goto L_0x004a
        L_0x0082:
            int r6 = r6 + r0
            goto L_0x002b
        L_0x0084:
            H4.i r2 = f10019f
            java.util.Collections.sort(r5, r2)
            r2 = r4
        L_0x008a:
            int r3 = r5.size()
            if (r2 >= r3) goto L_0x014a
            java.lang.Object r3 = r5.get(r2)
            m0.l r3 = (m0.C0820l) r3
            androidx.recyclerview.widget.RecyclerView r6 = r3.d
            if (r6 != 0) goto L_0x009c
            goto L_0x014a
        L_0x009c:
            boolean r7 = r3.f10014a
            if (r7 == 0) goto L_0x00a6
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L_0x00a8
        L_0x00a6:
            r7 = r17
        L_0x00a8:
            int r9 = r3.f10017e
            m0.T r6 = c(r6, r9, r7)
            if (r6 == 0) goto L_0x013a
            java.lang.ref.WeakReference r7 = r6.f9894b
            if (r7 == 0) goto L_0x013a
            boolean r7 = r6.f()
            if (r7 == 0) goto L_0x013a
            boolean r7 = r6.g()
            if (r7 != 0) goto L_0x013a
            java.lang.ref.WeakReference r6 = r6.f9894b
            java.lang.Object r6 = r6.get()
            androidx.recyclerview.widget.RecyclerView r6 = (androidx.recyclerview.widget.RecyclerView) r6
            if (r6 != 0) goto L_0x00cc
            goto L_0x013a
        L_0x00cc:
            boolean r7 = r6.f5333H
            if (r7 == 0) goto L_0x00f5
            c1.i r7 = r6.f5356e
            int r7 = r7.v()
            if (r7 == 0) goto L_0x00f5
            m0.C r7 = r6.f5342Q
            if (r7 == 0) goto L_0x00df
            r7.e()
        L_0x00df:
            m0.F r7 = r6.f5378u
            k5.g r8 = r6.f5351b
            if (r7 == 0) goto L_0x00ed
            r7.g0(r8)
            m0.F r7 = r6.f5378u
            r7.h0(r8)
        L_0x00ed:
            java.util.ArrayList r7 = r8.f9491a
            r7.clear()
            r8.f()
        L_0x00f5:
            com.google.crypto.tink.shaded.protobuf.l r7 = r6.f5364k0
            r7.b(r6, r0)
            int r8 = r7.f6831c
            if (r8 == 0) goto L_0x013a
            java.lang.String r8 = "RV Nested Prefetch"
            int r9 = G.l.f807a     // Catch:{ all -> 0x012c }
            android.os.Trace.beginSection(r8)     // Catch:{ all -> 0x012c }
            m0.P r8 = r6.f5365l0     // Catch:{ all -> 0x012c }
            m0.y r9 = r6.f5376t     // Catch:{ all -> 0x012c }
            r8.d = r0     // Catch:{ all -> 0x012c }
            int r9 = r9.a()     // Catch:{ all -> 0x012c }
            r8.f9878e = r9     // Catch:{ all -> 0x012c }
            r8.g = r4     // Catch:{ all -> 0x012c }
            r8.h = r4     // Catch:{ all -> 0x012c }
            r8.f9880i = r4     // Catch:{ all -> 0x012c }
            r8 = r4
        L_0x0118:
            int r9 = r7.f6831c     // Catch:{ all -> 0x012c }
            int r9 = r9 * 2
            if (r8 >= r9) goto L_0x012e
            java.lang.Object r9 = r7.d     // Catch:{ all -> 0x012c }
            int[] r9 = (int[]) r9     // Catch:{ all -> 0x012c }
            r9 = r9[r8]     // Catch:{ all -> 0x012c }
            r10 = r17
            c(r6, r9, r10)     // Catch:{ all -> 0x012c }
            int r8 = r8 + 2
            goto L_0x0118
        L_0x012c:
            r0 = move-exception
            goto L_0x0134
        L_0x012e:
            r10 = r17
            android.os.Trace.endSection()
            goto L_0x013c
        L_0x0134:
            int r2 = G.l.f807a
            android.os.Trace.endSection()
            throw r0
        L_0x013a:
            r10 = r17
        L_0x013c:
            r3.f10014a = r4
            r3.f10015b = r4
            r3.f10016c = r4
            r6 = 0
            r3.d = r6
            r3.f10017e = r4
            int r2 = r2 + r0
            goto L_0x008a
        L_0x014a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.C0821m.b(long):void");
    }

    public final void run() {
        try {
            int i2 = l.f807a;
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList = this.f10020a;
            if (arrayList.isEmpty()) {
                this.f10021b = 0;
                Trace.endSection();
                return;
            }
            int size = arrayList.size();
            long j6 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                RecyclerView recyclerView = (RecyclerView) arrayList.get(i5);
                if (recyclerView.getWindowVisibility() == 0) {
                    j6 = Math.max(recyclerView.getDrawingTime(), j6);
                }
            }
            if (j6 == 0) {
                this.f10021b = 0;
                Trace.endSection();
                return;
            }
            b(TimeUnit.MILLISECONDS.toNanos(j6) + this.f10022c);
            this.f10021b = 0;
            Trace.endSection();
        } catch (Throwable th) {
            this.f10021b = 0;
            int i6 = l.f807a;
            Trace.endSection();
            throw th;
        }
    }
}
