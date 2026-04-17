package G4;

import I4.h;
import M4.c;
import P4.j;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.fragments.gangBase.A;
import com.mtma.criminal.city.utils.v0;
import u4.C1033b;
import v2.i;
import x4.C1101d;

public final /* synthetic */ class b implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f843a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f844b;

    public /* synthetic */ b(Object obj, int i2) {
        this.f843a = i2;
        this.f844b = obj;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z3;
        switch (this.f843a) {
            case 0:
                c cVar = (c) this.f844b;
                cVar.getClass();
                int action = motionEvent.getAction();
                if (action == 0) {
                    cVar.f852k0 = motionEvent.getY();
                    return false;
                } else if (action != 1 || cVar.f852k0 - motionEvent.getY() <= 150.0f || !cVar.f853l0) {
                    return false;
                } else {
                    v0.e(cVar.f845d0, MyApplication.f7090a.getApplicationContext().getString(R.string.no_more_items));
                    R2.b.M0(R.raw.error_loading);
                    return false;
                }
            case 1:
                h hVar = (h) this.f844b;
                hVar.getClass();
                int action2 = motionEvent.getAction();
                if (action2 == 0) {
                    hVar.f1230p0 = motionEvent.getY();
                    return false;
                } else if (action2 != 1 || hVar.f1230p0 - motionEvent.getY() <= 150.0f || !hVar.f1229o0 || hVar.f1224j0.size() < 7 || hVar.f1227m0) {
                    return false;
                } else {
                    v0.e(hVar.f1218d0, MyApplication.f7090a.getApplicationContext().getString(R.string.no_more_items));
                    R2.b.M0(R.raw.error_loading);
                    return false;
                }
            case 2:
                c cVar2 = (c) this.f844b;
                cVar2.getClass();
                int action3 = motionEvent.getAction();
                if (action3 == 0) {
                    cVar2.f1851l0 = motionEvent.getY();
                    return false;
                } else if (action3 != 1 || cVar2.f1851l0 - motionEvent.getY() <= 150.0f || !cVar2.f1852m0 || cVar2.f1848i0.size() < 7 || cVar2.f1855p0) {
                    return false;
                } else {
                    v0.e(cVar2.f1843d0, MyApplication.f7090a.getApplicationContext().getString(R.string.no_more_items));
                    R2.b.M0(R.raw.error_loading);
                    return false;
                }
            case 3:
                j jVar = (j) this.f844b;
                jVar.getClass();
                int action4 = motionEvent.getAction();
                if (action4 == 0) {
                    jVar.f2244p0 = motionEvent.getY();
                    return false;
                } else if (action4 != 1 || jVar.f2244p0 - motionEvent.getY() <= 150.0f || !jVar.f2243o0 || jVar.f2237i0.size() < 7 || jVar.f2241m0) {
                    return false;
                } else {
                    v0.e(jVar.f2232d0, MyApplication.f7090a.getApplicationContext().getString(R.string.no_more_items));
                    R2.b.M0(R.raw.error_loading);
                    return false;
                }
            case 4:
                A a6 = (A) this.f844b;
                a6.getClass();
                int action5 = motionEvent.getAction();
                if (action5 == 0) {
                    a6.f7104o0 = motionEvent.getY();
                    return false;
                } else if (action5 != 1 || a6.f7104o0 - motionEvent.getY() <= 150.0f || !a6.f7103n0 || a6.f7098i0.size() < 6 || a6.f7101l0) {
                    return false;
                } else {
                    v0.e(a6.f7093d0, MyApplication.f7090a.getApplicationContext().getString(R.string.no_more_items));
                    R2.b.M0(R.raw.error_loading);
                    return false;
                }
            case 5:
                C1033b bVar = (C1033b) this.f844b;
                bVar.getClass();
                int action6 = motionEvent.getAction();
                if (action6 == 0) {
                    bVar.f11867t0 = motionEvent.getY();
                    return false;
                } else if (action6 != 1 || bVar.f11867t0 - motionEvent.getY() <= 150.0f || !bVar.s0 || bVar.f11861m0.size() < 7 || bVar.f11864p0) {
                    return false;
                } else {
                    v0.e(bVar.f11852d0, MyApplication.f7090a.getApplicationContext().getString(R.string.no_more_items));
                    R2.b.M0(R.raw.error_loading);
                    return false;
                }
            case zzaky.zzf.zzf /*6*/:
                i iVar = (i) this.f844b;
                iVar.getClass();
                if (motionEvent.getAction() == 1) {
                    long currentTimeMillis = System.currentTimeMillis() - iVar.f12190o;
                    if (currentTimeMillis < 0 || currentTimeMillis > 300) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        iVar.f12188m = false;
                    }
                    iVar.u();
                    iVar.f12188m = true;
                    iVar.f12190o = System.currentTimeMillis();
                }
                return false;
            default:
                C1101d dVar = (C1101d) this.f844b;
                dVar.getClass();
                int action7 = motionEvent.getAction();
                if (action7 == 0) {
                    dVar.f12575p0 = motionEvent.getY();
                    return false;
                } else if (action7 != 1 || dVar.f12575p0 - motionEvent.getY() <= 150.0f || !dVar.f12574o0 || dVar.f12569j0.size() < 7 || dVar.f12572m0) {
                    return false;
                } else {
                    v0.e(dVar.f12563d0, MyApplication.f7090a.getApplicationContext().getString(R.string.no_more_items));
                    R2.b.M0(R.raw.error_loading);
                    return false;
                }
        }
    }
}
