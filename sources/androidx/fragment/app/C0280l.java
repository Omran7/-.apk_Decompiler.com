package androidx.fragment.app;

import B0.C0004c;
import I1.b;
import T1.A;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.p;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import kotlin.jvm.internal.j;

/* renamed from: androidx.fragment.app.l  reason: case insensitive filesystem */
public class C0280l extends C0286s implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: d0  reason: collision with root package name */
    public final C0277i f5117d0 = new C0277i(this);

    /* renamed from: e0  reason: collision with root package name */
    public final C0278j f5118e0 = new C0278j(this);

    /* renamed from: f0  reason: collision with root package name */
    public int f5119f0 = 0;

    /* renamed from: g0  reason: collision with root package name */
    public int f5120g0 = 0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f5121h0 = true;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f5122i0 = true;

    /* renamed from: j0  reason: collision with root package name */
    public int f5123j0 = -1;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f5124k0;

    /* renamed from: l0  reason: collision with root package name */
    public final A f5125l0 = new A((Object) this, 13);

    /* renamed from: m0  reason: collision with root package name */
    public Dialog f5126m0;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f5127n0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f5128o0;

    /* renamed from: p0  reason: collision with root package name */
    public boolean f5129p0;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f5130q0 = false;

    public C0280l() {
        new C0004c((Object) this, 17);
    }

    public final void A(C0289v vVar) {
        super.A(vVar);
        this.f5169X.e(this.f5125l0);
        if (!this.f5129p0) {
            this.f5128o0 = false;
        }
    }

    public void B(Bundle bundle) {
        boolean z3;
        super.B(bundle);
        new Handler();
        if (this.F == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f5122i0 = z3;
        if (bundle != null) {
            this.f5119f0 = bundle.getInt("android:style", 0);
            this.f5120g0 = bundle.getInt("android:theme", 0);
            this.f5121h0 = bundle.getBoolean("android:cancelable", true);
            this.f5122i0 = bundle.getBoolean("android:showsDialog", this.f5122i0);
            this.f5123j0 = bundle.getInt("android:backStackId", -1);
        }
    }

    public final void E() {
        this.f5157L = true;
        Dialog dialog = this.f5126m0;
        if (dialog != null) {
            this.f5127n0 = true;
            dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
            this.f5126m0.dismiss();
            if (!this.f5128o0) {
                onDismiss(this.f5126m0);
            }
            this.f5126m0 = null;
            this.f5130q0 = false;
        }
    }

    public final void F() {
        this.f5157L = true;
        if (!this.f5129p0 && !this.f5128o0) {
            this.f5128o0 = true;
        }
        this.f5169X.h(this.f5125l0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0046 A[Catch:{ all -> 0x004e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.LayoutInflater G(android.os.Bundle r8) {
        /*
            r7 = this;
            android.view.LayoutInflater r8 = super.G(r8)
            boolean r0 = r7.f5122i0
            r1 = 2
            java.lang.String r2 = "FragmentManager"
            if (r0 == 0) goto L_0x009a
            boolean r3 = r7.f5124k0
            if (r3 == 0) goto L_0x0011
            goto L_0x009a
        L_0x0011:
            if (r0 != 0) goto L_0x0014
            goto L_0x0071
        L_0x0014:
            boolean r0 = r7.f5130q0
            if (r0 != 0) goto L_0x0071
            r0 = 0
            r3 = 1
            r7.f5124k0 = r3     // Catch:{ all -> 0x004e }
            android.app.Dialog r4 = r7.V()     // Catch:{ all -> 0x004e }
            r7.f5126m0 = r4     // Catch:{ all -> 0x004e }
            boolean r5 = r7.f5122i0     // Catch:{ all -> 0x004e }
            if (r5 == 0) goto L_0x0068
            int r5 = r7.f5119f0     // Catch:{ all -> 0x004e }
            if (r5 == r3) goto L_0x003b
            if (r5 == r1) goto L_0x003b
            r6 = 3
            if (r5 == r6) goto L_0x0030
            goto L_0x003e
        L_0x0030:
            android.view.Window r5 = r4.getWindow()     // Catch:{ all -> 0x004e }
            if (r5 == 0) goto L_0x003b
            r6 = 24
            r5.addFlags(r6)     // Catch:{ all -> 0x004e }
        L_0x003b:
            r4.requestWindowFeature(r3)     // Catch:{ all -> 0x004e }
        L_0x003e:
            android.content.Context r4 = r7.n()     // Catch:{ all -> 0x004e }
            boolean r5 = r4 instanceof android.app.Activity     // Catch:{ all -> 0x004e }
            if (r5 == 0) goto L_0x0050
            android.app.Dialog r5 = r7.f5126m0     // Catch:{ all -> 0x004e }
            android.app.Activity r4 = (android.app.Activity) r4     // Catch:{ all -> 0x004e }
            r5.setOwnerActivity(r4)     // Catch:{ all -> 0x004e }
            goto L_0x0050
        L_0x004e:
            r8 = move-exception
            goto L_0x006e
        L_0x0050:
            android.app.Dialog r4 = r7.f5126m0     // Catch:{ all -> 0x004e }
            boolean r5 = r7.f5121h0     // Catch:{ all -> 0x004e }
            r4.setCancelable(r5)     // Catch:{ all -> 0x004e }
            android.app.Dialog r4 = r7.f5126m0     // Catch:{ all -> 0x004e }
            androidx.fragment.app.i r5 = r7.f5117d0     // Catch:{ all -> 0x004e }
            r4.setOnCancelListener(r5)     // Catch:{ all -> 0x004e }
            android.app.Dialog r4 = r7.f5126m0     // Catch:{ all -> 0x004e }
            androidx.fragment.app.j r5 = r7.f5118e0     // Catch:{ all -> 0x004e }
            r4.setOnDismissListener(r5)     // Catch:{ all -> 0x004e }
            r7.f5130q0 = r3     // Catch:{ all -> 0x004e }
            goto L_0x006b
        L_0x0068:
            r3 = 0
            r7.f5126m0 = r3     // Catch:{ all -> 0x004e }
        L_0x006b:
            r7.f5124k0 = r0
            goto L_0x0071
        L_0x006e:
            r7.f5124k0 = r0
            throw r8
        L_0x0071:
            boolean r0 = android.util.Log.isLoggable(r2, r1)
            if (r0 == 0) goto L_0x008d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "get layout inflater for DialogFragment "
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r1 = " from dialog context"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r2, r0)
        L_0x008d:
            android.app.Dialog r0 = r7.f5126m0
            if (r0 == 0) goto L_0x0099
            android.content.Context r0 = r0.getContext()
            android.view.LayoutInflater r8 = r8.cloneInContext(r0)
        L_0x0099:
            return r8
        L_0x009a:
            boolean r0 = android.util.Log.isLoggable(r2, r1)
            if (r0 == 0) goto L_0x00d5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "getting layout inflater for DialogFragment "
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            boolean r1 = r7.f5122i0
            if (r1 != 0) goto L_0x00c4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "mShowsDialog = false: "
            r1.<init>(r3)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.d(r2, r0)
            goto L_0x00d5
        L_0x00c4:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "mCreatingDialog = true: "
            r1.<init>(r3)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.d(r2, r0)
        L_0x00d5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0280l.G(android.os.Bundle):android.view.LayoutInflater");
    }

    public void J(Bundle bundle) {
        Dialog dialog = this.f5126m0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i2 = this.f5119f0;
        if (i2 != 0) {
            bundle.putInt("android:style", i2);
        }
        int i5 = this.f5120g0;
        if (i5 != 0) {
            bundle.putInt("android:theme", i5);
        }
        boolean z3 = this.f5121h0;
        if (!z3) {
            bundle.putBoolean("android:cancelable", z3);
        }
        boolean z4 = this.f5122i0;
        if (!z4) {
            bundle.putBoolean("android:showsDialog", z4);
        }
        int i6 = this.f5123j0;
        if (i6 != -1) {
            bundle.putInt("android:backStackId", i6);
        }
    }

    public void K() {
        this.f5157L = true;
        Dialog dialog = this.f5126m0;
        if (dialog != null) {
            this.f5127n0 = false;
            dialog.show();
            View decorView = this.f5126m0.getWindow().getDecorView();
            j.e(decorView, "<this>");
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    public void L() {
        this.f5157L = true;
        Dialog dialog = this.f5126m0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public final void M(Bundle bundle) {
        Bundle bundle2;
        this.f5157L = true;
        if (this.f5126m0 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f5126m0.onRestoreInstanceState(bundle2);
        }
    }

    public final void N(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.N(layoutInflater, viewGroup, bundle);
        if (this.f5159N == null && this.f5126m0 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f5126m0.onRestoreInstanceState(bundle2);
        }
    }

    public Dialog V() {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new p(Q(), this.f5120g0);
    }

    public final b i() {
        return new C0279k(this, new C0283o(this));
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.f5127n0) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
            }
            if (!this.f5128o0) {
                this.f5128o0 = true;
                this.f5129p0 = false;
                Dialog dialog = this.f5126m0;
                if (dialog != null) {
                    dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
                    this.f5126m0.dismiss();
                }
                this.f5127n0 = true;
                if (this.f5123j0 >= 0) {
                    I p6 = p();
                    int i2 = this.f5123j0;
                    if (i2 >= 0) {
                        p6.v(new H(p6, i2), true);
                        this.f5123j0 = -1;
                        return;
                    }
                    throw new IllegalArgumentException(a.f(i2, "Bad id: "));
                }
                C0269a aVar = new C0269a(p());
                aVar.f5081p = true;
                aVar.h(this);
                aVar.e(true);
            }
        }
    }

    public final void y() {
        this.f5157L = true;
    }
}
