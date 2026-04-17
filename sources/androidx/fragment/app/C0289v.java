package androidx.fragment.app;

import T1.A;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.f;
import androidx.activity.g;
import androidx.activity.o;
import androidx.lifecycle.C0302m;
import androidx.lifecycle.C0303n;
import androidx.lifecycle.C0309u;
import k.C0738t;
import z.C1122b;

/* renamed from: androidx.fragment.app.v  reason: case insensitive filesystem */
public abstract class C0289v extends o implements C1122b {

    /* renamed from: C  reason: collision with root package name */
    public final A f5197C = new A((Object) new C0288u(this), 14);

    /* renamed from: D  reason: collision with root package name */
    public final C0309u f5198D = new C0309u(this);

    /* renamed from: E  reason: collision with root package name */
    public boolean f5199E;
    public boolean F;

    /* renamed from: G  reason: collision with root package name */
    public boolean f5200G = true;

    public C0289v() {
        ((C0738t) this.d.d).f("android:support:lifecycle", new f(this, 1));
        f(new C0287t(this, 0));
        this.f4652u.add(new C0287t(this, 1));
        g(new g(this, 1));
    }

    public static boolean m(I i2) {
        C0289v vVar;
        boolean z3 = false;
        for (C0286s sVar : i2.f5000c.v()) {
            if (sVar != null) {
                C0288u uVar = sVar.f5148B;
                if (uVar == null) {
                    vVar = null;
                } else {
                    vVar = uVar.f5196t;
                }
                if (vVar != null) {
                    z3 |= m(sVar.m());
                }
                Q q6 = sVar.f5168W;
                C0303n nVar = C0303n.d;
                if (q6 != null) {
                    q6.d();
                    if (q6.f5058c.f5278c.compareTo(nVar) >= 0) {
                        sVar.f5168W.f5058c.g();
                        z3 = true;
                    }
                }
                if (sVar.f5167V.f5278c.compareTo(nVar) >= 0) {
                    sVar.f5167V.g();
                    z3 = true;
                }
            }
        }
        return z3;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003a, code lost:
        if (r0.equals("--list-dumpables") == false) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0043, code lost:
        if (r0.equals("--dump-dumpable") == false) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004a, code lost:
        if (android.os.Build.VERSION.SDK_INT < 33) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void dump(java.lang.String r4, java.io.FileDescriptor r5, java.io.PrintWriter r6, java.lang.String[] r7) {
        /*
            r3 = this;
            super.dump(r4, r5, r6, r7)
            if (r7 == 0) goto L_0x005d
            int r0 = r7.length
            if (r0 != 0) goto L_0x0009
            goto L_0x005d
        L_0x0009:
            r0 = 0
            r0 = r7[r0]
            int r1 = r0.hashCode()
            switch(r1) {
                case -645125871: goto L_0x004d;
                case 100470631: goto L_0x003d;
                case 472614934: goto L_0x0034;
                case 1159329357: goto L_0x0024;
                case 1455016274: goto L_0x0014;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x005d
        L_0x0014:
            java.lang.String r1 = "--autofill"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x001d
            goto L_0x005d
        L_0x001d:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L_0x005d
            goto L_0x005c
        L_0x0024:
            java.lang.String r1 = "--contentcapture"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x002d
            goto L_0x005d
        L_0x002d:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L_0x005d
            goto L_0x005c
        L_0x0034:
            java.lang.String r1 = "--list-dumpables"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0046
            goto L_0x005d
        L_0x003d:
            java.lang.String r1 = "--dump-dumpable"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0046
            goto L_0x005d
        L_0x0046:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L_0x005d
            goto L_0x005c
        L_0x004d:
            java.lang.String r1 = "--translation"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0056
            goto L_0x005d
        L_0x0056:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L_0x005d
        L_0x005c:
            return
        L_0x005d:
            r6.print(r4)
            java.lang.String r0 = "Local FragmentActivity "
            r6.print(r0)
            int r0 = java.lang.System.identityHashCode(r3)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r6.print(r0)
            java.lang.String r0 = " State:"
            r6.println(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r1 = "  "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.print(r0)
            java.lang.String r1 = "mCreated="
            r6.print(r1)
            boolean r1 = r3.f5199E
            r6.print(r1)
            java.lang.String r1 = " mResumed="
            r6.print(r1)
            boolean r1 = r3.F
            r6.print(r1)
            java.lang.String r1 = " mStopped="
            r6.print(r1)
            boolean r1 = r3.f5200G
            r6.print(r1)
            android.app.Application r1 = r3.getApplication()
            if (r1 == 0) goto L_0x00b9
            X4.d r1 = new X4.d
            androidx.lifecycle.T r2 = r3.e()
            r1.<init>((androidx.lifecycle.C0307s) r3, (androidx.lifecycle.T) r2)
            r1.x(r0, r6)
        L_0x00b9:
            T1.A r0 = r3.f5197C
            java.lang.Object r0 = r0.f2796b
            androidx.fragment.app.u r0 = (androidx.fragment.app.C0288u) r0
            androidx.fragment.app.I r0 = r0.f5195s
            r0.u(r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0289v.dump(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    public final I l() {
        return ((C0288u) this.f5197C.f2796b).f5195s;
    }

    public void onActivityResult(int i2, int i5, Intent intent) {
        this.f5197C.l();
        super.onActivityResult(i2, i5, intent);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f5198D.d(C0302m.ON_CREATE);
        I i2 = ((C0288u) this.f5197C.f2796b).f5195s;
        i2.f4990E = false;
        i2.F = false;
        i2.f4996L.f5031i = false;
        i2.t(1);
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((C0288u) this.f5197C.f2796b).f5195s.f5002f.onCreateView(view, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;
    }

    public void onDestroy() {
        super.onDestroy();
        ((C0288u) this.f5197C.f2796b).f5195s.k();
        this.f5198D.d(C0302m.ON_DESTROY);
    }

    public boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        if (i2 == 6) {
            return ((C0288u) this.f5197C.f2796b).f5195s.i();
        }
        return false;
    }

    public void onPause() {
        super.onPause();
        this.F = false;
        ((C0288u) this.f5197C.f2796b).f5195s.t(5);
        this.f5198D.d(C0302m.ON_PAUSE);
    }

    public void onPostResume() {
        super.onPostResume();
        this.f5198D.d(C0302m.ON_RESUME);
        I i2 = ((C0288u) this.f5197C.f2796b).f5195s;
        i2.f4990E = false;
        i2.F = false;
        i2.f4996L.f5031i = false;
        i2.t(7);
    }

    public final void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        this.f5197C.l();
        super.onRequestPermissionsResult(i2, strArr, iArr);
    }

    public void onResume() {
        A a6 = this.f5197C;
        a6.l();
        super.onResume();
        this.F = true;
        ((C0288u) a6.f2796b).f5195s.x(true);
    }

    public void onStart() {
        A a6 = this.f5197C;
        a6.l();
        super.onStart();
        this.f5200G = false;
        boolean z3 = this.f5199E;
        C0288u uVar = (C0288u) a6.f2796b;
        if (!z3) {
            this.f5199E = true;
            I i2 = uVar.f5195s;
            i2.f4990E = false;
            i2.F = false;
            i2.f4996L.f5031i = false;
            i2.t(4);
        }
        uVar.f5195s.x(true);
        this.f5198D.d(C0302m.ON_START);
        I i5 = uVar.f5195s;
        i5.f4990E = false;
        i5.F = false;
        i5.f4996L.f5031i = false;
        i5.t(5);
    }

    public final void onStateNotSaved() {
        this.f5197C.l();
    }

    public void onStop() {
        super.onStop();
        this.f5200G = true;
        do {
        } while (m(l()));
        I i2 = ((C0288u) this.f5197C.f2796b).f5195s;
        i2.F = true;
        i2.f4996L.f5031i = true;
        i2.t(4);
        this.f5198D.d(C0302m.ON_STOP);
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((C0288u) this.f5197C.f2796b).f5195s.f5002f.onCreateView((View) null, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(str, context, attributeSet) : onCreateView;
    }
}
