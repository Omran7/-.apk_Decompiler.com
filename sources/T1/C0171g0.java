package T1;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.I;

/* renamed from: T1.g0  reason: case insensitive filesystem */
public final class C0171g0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f3295a;

    /* renamed from: b  reason: collision with root package name */
    public final long f3296b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f3297c;
    public long d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ C0174h0 f3298e;

    public C0171g0(C0174h0 h0Var, String str, long j6) {
        this.f3298e = h0Var;
        I.d(str);
        this.f3295a = str;
        this.f3296b = j6;
    }

    public final long a() {
        if (!this.f3297c) {
            this.f3297c = true;
            this.d = this.f3298e.t().getLong(this.f3295a, this.f3296b);
        }
        return this.d;
    }

    public final void b(long j6) {
        SharedPreferences.Editor edit = this.f3298e.t().edit();
        edit.putLong(this.f3295a, j6);
        edit.apply();
        this.d = j6;
    }
}
