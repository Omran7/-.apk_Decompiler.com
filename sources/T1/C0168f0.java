package T1;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.I;

/* renamed from: T1.f0  reason: case insensitive filesystem */
public final class C0168f0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f3288a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f3289b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f3290c;
    public boolean d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ C0174h0 f3291e;

    public C0168f0(C0174h0 h0Var, String str, boolean z3) {
        this.f3291e = h0Var;
        I.d(str);
        this.f3288a = str;
        this.f3289b = z3;
    }

    public final void a(boolean z3) {
        SharedPreferences.Editor edit = this.f3291e.t().edit();
        edit.putBoolean(this.f3288a, z3);
        edit.apply();
        this.d = z3;
    }

    public final boolean b() {
        if (!this.f3290c) {
            this.f3290c = true;
            this.d = this.f3291e.t().getBoolean(this.f3288a, this.f3289b);
        }
        return this.d;
    }
}
