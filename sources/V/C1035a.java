package v;

import s.C0960a;
import s.d;

/* renamed from: v.a  reason: case insensitive filesystem */
public final class C1035a extends c {

    /* renamed from: q  reason: collision with root package name */
    public int f11945q;

    /* renamed from: r  reason: collision with root package name */
    public int f11946r;

    /* renamed from: s  reason: collision with root package name */
    public C0960a f11947s;

    public boolean getAllowsGoneWidget() {
        return this.f11947s.f11266t0;
    }

    public int getMargin() {
        return this.f11947s.f11267u0;
    }

    public int getType() {
        return this.f11945q;
    }

    public final void h(d dVar, boolean z3) {
        int i2 = this.f11945q;
        this.f11946r = i2;
        if (z3) {
            if (i2 == 5) {
                this.f11946r = 1;
            } else if (i2 == 6) {
                this.f11946r = 0;
            }
        } else if (i2 == 5) {
            this.f11946r = 0;
        } else if (i2 == 6) {
            this.f11946r = 1;
        }
        if (dVar instanceof C0960a) {
            ((C0960a) dVar).s0 = this.f11946r;
        }
    }

    public void setAllowsGoneWidget(boolean z3) {
        this.f11947s.f11266t0 = z3;
    }

    public void setDpMargin(int i2) {
        this.f11947s.f11267u0 = (int) ((((float) i2) * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i2) {
        this.f11947s.f11267u0 = i2;
    }

    public void setType(int i2) {
        this.f11945q = i2;
    }
}
