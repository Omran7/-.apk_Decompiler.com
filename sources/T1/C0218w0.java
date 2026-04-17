package T1;

import G1.b;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.measurement.zzgo;
import com.google.android.gms.internal.measurement.zzih;
import java.util.ArrayList;

/* renamed from: T1.w0  reason: case insensitive filesystem */
public final /* synthetic */ class C0218w0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3522a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ D0 f3523b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Z1 f3524c;

    public /* synthetic */ C0218w0(D0 d02, Z1 z12, int i2) {
        this.f3522a = i2;
        this.f3523b = d02;
        this.f3524c = z12;
    }

    public final void run() {
        switch (this.f3522a) {
            case 0:
                T1 t12 = this.f3523b.f2818a;
                t12.j();
                t12.S(this.f3524c);
                return;
            case 1:
                T1 t13 = this.f3523b.f2818a;
                t13.j();
                t13.R(this.f3524c);
                return;
            case 2:
                D0 d02 = this.f3523b;
                d02.f2818a.j();
                d02.f2818a.O(this.f3524c);
                return;
            case 3:
                D0 d03 = this.f3523b;
                d03.f2818a.j();
                T1 t14 = d03.f2818a;
                t14.f().o();
                t14.k();
                Z1 z12 = this.f3524c;
                I.g(z12);
                String str = z12.f3201a;
                I.d(str);
                int i2 = 0;
                if (t14.h0().B((String) null, H.f2954y0)) {
                    ((b) t14.g()).getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    int u6 = t14.h0().u((String) null, H.f2910h0);
                    t14.h0();
                    long longValue = currentTimeMillis - ((Long) H.f2903e.a((Object) null)).longValue();
                    while (i2 < u6 && t14.G((String) null, longValue)) {
                        i2++;
                    }
                } else {
                    t14.h0();
                    long intValue = (long) ((Integer) H.f2921l.a((Object) null)).intValue();
                    while (((long) i2) < intValue && t14.G(str, 0)) {
                        i2++;
                    }
                }
                if (t14.h0().B((String) null, H.f2956z0)) {
                    t14.f().o();
                    t14.E();
                }
                if (t14.h0().B((String) null, H.f2874Q0)) {
                    zzih zzb = zzih.zzb(z12.f3200P);
                    Q1 q12 = t14.f3068s;
                    q12.o();
                    if (((C0212u0) q12.f398a).f3494p.B((String) null, H.f2872P0) && zzb == zzih.CLIENT_UPLOAD_ELIGIBLE && !Q1.r(str)) {
                        C0192n0 n0Var = q12.f2982b.f3060a;
                        T1.L(n0Var);
                        zzgo D4 = n0Var.D(str);
                        if (D4 != null && D4.zzv() && !D4.zzi().zze().isEmpty()) {
                            t14.c().f3180w.b(str, "[sgtm] Going background, trigger client side upload. appId");
                            ((b) t14.g()).getClass();
                            t14.Y(str, System.currentTimeMillis());
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 4:
                D0 d04 = this.f3523b;
                d04.f2818a.j();
                T1 t15 = d04.f2818a;
                t15.f().o();
                t15.k();
                Z1 z13 = this.f3524c;
                I.d(z13.f3201a);
                t15.f0(z13);
                return;
            case 5:
                D0 d05 = this.f3523b;
                d05.f2818a.j();
                T1 t16 = d05.f2818a;
                if (t16.f3048H != null) {
                    ArrayList arrayList = new ArrayList();
                    t16.f3049I = arrayList;
                    arrayList.addAll(t16.f3048H);
                }
                C0191n nVar = t16.f3062c;
                T1.L(nVar);
                C0212u0 u0Var = (C0212u0) nVar.f398a;
                Z1 z14 = this.f3524c;
                String str2 = z14.f3201a;
                I.g(str2);
                I.d(str2);
                nVar.o();
                nVar.p();
                try {
                    SQLiteDatabase k02 = nVar.k0();
                    String[] strArr = {str2};
                    int delete = k02.delete("apps", "app_id=?", strArr) + k02.delete("events", "app_id=?", strArr) + k02.delete("events_snapshot", "app_id=?", strArr) + k02.delete("user_attributes", "app_id=?", strArr) + k02.delete("conditional_properties", "app_id=?", strArr) + k02.delete("raw_events", "app_id=?", strArr) + k02.delete("raw_events_metadata", "app_id=?", strArr) + k02.delete("queue", "app_id=?", strArr) + k02.delete("audience_filter_values", "app_id=?", strArr) + k02.delete("main_event_params", "app_id=?", strArr) + k02.delete("default_event_params", "app_id=?", strArr) + k02.delete("trigger_uris", "app_id=?", strArr) + k02.delete("upload_queue", "app_id=?", strArr);
                    if (delete > 0) {
                        Z z3 = u0Var.f3496r;
                        C0212u0.k(z3);
                        z3.f3180w.c("Reset analytics data. app, records", str2, Integer.valueOf(delete));
                    }
                } catch (SQLiteException e6) {
                    Z z4 = u0Var.f3496r;
                    C0212u0.k(z4);
                    z4.f3172f.c("Error resetting analytics data. appId, error", Z.w(str2), e6);
                }
                if (z14.f3207q) {
                    t16.O(z14);
                    return;
                }
                return;
            default:
                D0 d06 = this.f3523b;
                d06.f2818a.j();
                T1 t17 = d06.f2818a;
                t17.f().o();
                t17.k();
                Z1 z15 = this.f3524c;
                I.d(z15.f3201a);
                t17.S(z15);
                t17.R(z15);
                return;
        }
    }
}
