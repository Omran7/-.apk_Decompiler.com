package t0;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import o3.d;
import q.C0928e;

public final class u {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f11694a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final View f11695b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f11696c = new ArrayList();

    public u(View view) {
        this.f11695b = view;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r3 = (t0.u) r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof t0.u
            if (r0 == 0) goto L_0x0018
            t0.u r3 = (t0.u) r3
            android.view.View r0 = r3.f11695b
            android.view.View r1 = r2.f11695b
            if (r1 != r0) goto L_0x0018
            java.util.HashMap r0 = r2.f11694a
            java.util.HashMap r3 = r3.f11694a
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0018
            r3 = 1
            return r3
        L_0x0018:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.u.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return this.f11694a.hashCode() + (this.f11695b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder b6 = C0928e.b("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        b6.append(this.f11695b);
        b6.append("\n");
        String f6 = d.f(b6.toString(), "    values:");
        HashMap hashMap = this.f11694a;
        for (String str : hashMap.keySet()) {
            f6 = f6 + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return f6;
    }
}
