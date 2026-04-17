package B0;

import F3.k;
import I.f;
import I.g;
import R2.b;
import V4.h;
import Y4.D;
import Z4.v;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.z;
import b5.j;
import com.bumptech.glide.c;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.internal.play_billing.zzlk;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.Q;
import d5.o;
import i3.C0587c;
import i3.C0588d;
import i3.C0592h;
import i3.q;
import java.io.Serializable;
import k.C0724m;
import v3.s;
import x1.d;

public final class H implements q, z {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f199a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f200b;

    /* renamed from: c  reason: collision with root package name */
    public Object f201c;

    public /* synthetic */ H(Object obj, boolean z3, int i2) {
        this.f199a = i2;
        this.f201c = obj;
        this.f200b = z3;
    }

    public static H e(Object obj) {
        return new H(obj, false, 4);
    }

    public static H f(Serializable serializable) {
        return new H(serializable, true, 4);
    }

    public boolean a() {
        return this.f200b;
    }

    public boolean b(CharSequence charSequence, int i2) {
        if (charSequence == null || i2 < 0 || charSequence.length() - i2 < 0) {
            throw new IllegalArgumentException();
        } else if (((f) this.f201c) == null) {
            return a();
        } else {
            boolean z3 = true;
            for (int i5 = 0; i5 < i2 && z3; i5++) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i5));
                H h = g.f1086a;
                if (directionality != 0) {
                    if (!(directionality == 1 || directionality == 2)) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                break;
                            case 16:
                            case 17:
                                break;
                            default:
                                z3 = true;
                                break;
                        }
                    }
                    z3 = false;
                }
                z3 = true;
            }
            if (!z3) {
                return true;
            }
            if (!z3) {
                return a();
            }
            return false;
        }
    }

    public void c(v vVar) {
        h hVar = (h) this.f201c;
        h.W(hVar);
        hVar.f3829b1 = false;
        boolean z3 = vVar.isAllProcessSuccess;
        Context context = hVar.f3831d0;
        if (z3) {
            hVar.f3824V0 = vVar.palladiumCountAfterChange;
            o.getUpgradeObject().setEmblem(vVar.emblemAfterChange);
            o.getUpgradeObject().setLuckyLine(vVar.luckyLineAfterChange);
            if (this.f200b) {
                int i2 = hVar.f3822T0 + 1;
                hVar.f3822T0 = i2;
                hVar.f3820R0 = D.s(hVar.f3821S0, i2, 1);
                h.V(hVar);
                int i5 = hVar.f3822T0;
                if (i5 == 12) {
                    hVar.Z();
                } else {
                    int i6 = (i5 * 4) + D.s(hVar.f3821S0, 0, 1).f4292D;
                    hVar.X0 = i6;
                    hVar.f3826Y0 = i6 * 5;
                    hVar.f3827Z0 = ((long) i6) * 50000;
                    h.Y(hVar);
                }
                b.w(false);
                b.M0(R.raw.add_new_item);
                c.s0(context, MyApplication.f7090a.getApplicationContext().getString(R.string.upgrade_success), (String) null);
                long j6 = (long) 1;
                Q.b(56, o.getAccountObject().getId(), j6);
                if (hVar.f3822T0 == 12) {
                    Q.b(57, o.getAccountObject().getId(), j6);
                }
                if (hVar.f3822T0 >= 5) {
                    j jVar = new j("@System", hVar.s(R.string.announce_upgrade_weapon, o.getMainStatesObject().getNickName(), MyApplication.f7090a.getApplicationContext().getString(hVar.f3820R0.f4295c), Integer.valueOf(hVar.f3822T0)), true, false);
                    String F = C0592h.d().e().E(b.a0()).E("chats").E("worldwide").G().F();
                    C0592h.d().e().E(b.a0()).E("chats").E("worldwide").E(c.f5744o + F).I(jVar);
                    return;
                }
                return;
            }
            hVar.f3819Q0.setVisibility(0);
            h.V(hVar);
            h.Y(hVar);
            b.w(false);
            c.s0(context, MyApplication.f7090a.getApplicationContext().getString(R.string.upgrade_failed), (String) null);
            Q.b(58, o.getAccountObject().getId(), (long) 1);
            return;
        }
        b.w(false);
        if (!vVar.isWeaponExist) {
            a.n(MyApplication.f7090a, R.string.items_not_exist_anymore, context, (String) null);
        } else if (!vVar.isPalladiumChanged) {
            a.n(MyApplication.f7090a, R.string.do_not_have_enough_palladium, context, (String) null);
        } else if (!vVar.isEmblemsChanged) {
            a.n(MyApplication.f7090a, R.string.do_not_have_enough_emblems, context, (String) null);
        } else if (!vVar.isCashChanged) {
            c.x0(context);
        } else {
            a.n(MyApplication.f7090a, R.string.unknown_error_try_again, context, (String) null);
        }
    }

    public synchronized void d(D d, boolean z3) {
        try {
            if (!this.f200b) {
                if (!z3) {
                    this.f200b = true;
                    d.d();
                    this.f200b = false;
                }
            }
            ((Handler) this.f201c).obtainMessage(1, d).sendToTarget();
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public void g(Object obj) {
        C0724m mVar = (C0724m) this.f201c;
        mVar.getClass();
        Void voidR = (Void) obj;
        SignInHubActivity signInHubActivity = (SignInHubActivity) mVar.f9345b;
        signInHubActivity.setResult(signInHubActivity.f5996K, signInHubActivity.f5997L);
        signInHubActivity.finish();
        this.f200b = true;
    }

    public void h(zzlk zzlk) {
        if (this.f200b) {
            zze.zzl("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            ((k) this.f201c).p(new Z0.a(zzlk, (Z0.b) null));
        } catch (Throwable unused) {
            zze.zzl("BillingLogger", "logging failed.");
        }
    }

    public String toString() {
        switch (this.f199a) {
            case 5:
                return ((C0724m) this.f201c).toString();
            case 8:
                String str = (String) this.f201c;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
                sb.append("{");
                sb.append(str);
                sb.append("}");
                sb.append(this.f200b);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public void u(C0587c cVar) {
        boolean z3 = this.f200b;
        H4.h hVar = (H4.h) this.f201c;
        if (z3) {
            H4.h.V(hVar, cVar);
        } else {
            a.c(C0592h.b().e(), "players").E(hVar.f1046p0).E("mainStatesObject").d(new I3.h((Object) this, (Object) cVar, 8));
        }
    }

    public H(int i2) {
        this.f199a = i2;
        switch (i2) {
            case 9:
                return;
            default:
                this.f201c = new Handler(Looper.getMainLooper(), new G(0));
                return;
        }
    }

    public H(boolean z3, s sVar) {
        this.f199a = 7;
        this.f200b = z3;
        this.f201c = sVar;
    }

    public H(f fVar, boolean z3) {
        this.f199a = 2;
        this.f199a = 2;
        this.f201c = fVar;
        this.f200b = z3;
    }

    public H(d dVar, C0724m mVar) {
        this.f199a = 5;
        this.f200b = false;
        this.f201c = mVar;
    }

    public void B(C0588d dVar) {
    }
}
