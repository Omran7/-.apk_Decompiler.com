package j;

import android.content.Context;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;

public class u {

    /* renamed from: a  reason: collision with root package name */
    public final Context f8783a;

    /* renamed from: b  reason: collision with root package name */
    public final k f8784b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f8785c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public View f8786e;

    /* renamed from: f  reason: collision with root package name */
    public int f8787f = 8388611;
    public boolean g;
    public v h;

    /* renamed from: i  reason: collision with root package name */
    public s f8788i;

    /* renamed from: j  reason: collision with root package name */
    public t f8789j;

    /* renamed from: k  reason: collision with root package name */
    public final t f8790k = new t(this);

    public u(int i2, Context context, View view, k kVar, boolean z3) {
        this.f8783a = context;
        this.f8784b = kVar;
        this.f8786e = view;
        this.f8785c = z3;
        this.d = i2;
    }

    /* JADX WARNING: type inference failed for: r0v10, types: [j.e] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final j.s a() {
        /*
            r11 = this;
            j.s r0 = r11.f8788i
            if (r0 != 0) goto L_0x006b
            java.lang.String r0 = "window"
            android.content.Context r1 = r11.f8783a
            java.lang.Object r0 = r1.getSystemService(r0)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r2 = new android.graphics.Point
            r2.<init>()
            r0.getRealSize(r2)
            int r0 = r2.x
            int r2 = r2.y
            int r0 = java.lang.Math.min(r0, r2)
            android.content.res.Resources r2 = r1.getResources()
            r3 = 2131099670(0x7f060016, float:1.78117E38)
            int r2 = r2.getDimensionPixelSize(r3)
            if (r0 < r2) goto L_0x003b
            j.e r0 = new j.e
            android.view.View r2 = r11.f8786e
            int r3 = r11.d
            boolean r4 = r11.f8785c
            r0.<init>(r1, r2, r3, r4)
            goto L_0x004b
        L_0x003b:
            j.B r0 = new j.B
            android.view.View r8 = r11.f8786e
            android.content.Context r7 = r11.f8783a
            boolean r10 = r11.f8785c
            j.k r9 = r11.f8784b
            int r6 = r11.d
            r5 = r0
            r5.<init>(r6, r7, r8, r9, r10)
        L_0x004b:
            j.k r1 = r11.f8784b
            r0.l(r1)
            j.t r1 = r11.f8790k
            r0.r(r1)
            android.view.View r1 = r11.f8786e
            r0.n(r1)
            j.v r1 = r11.h
            r0.j(r1)
            boolean r1 = r11.g
            r0.o(r1)
            int r1 = r11.f8787f
            r0.p(r1)
            r11.f8788i = r0
        L_0x006b:
            j.s r0 = r11.f8788i
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j.u.a():j.s");
    }

    public final boolean b() {
        s sVar = this.f8788i;
        if (sVar == null || !sVar.b()) {
            return false;
        }
        return true;
    }

    public void c() {
        this.f8788i = null;
        t tVar = this.f8789j;
        if (tVar != null) {
            tVar.onDismiss();
        }
    }

    public final void d(int i2, int i5, boolean z3, boolean z4) {
        s a6 = a();
        a6.s(z4);
        if (z3) {
            if ((Gravity.getAbsoluteGravity(this.f8787f, this.f8786e.getLayoutDirection()) & 7) == 5) {
                i2 -= this.f8786e.getWidth();
            }
            a6.q(i2);
            a6.t(i5);
            int i6 = (int) ((this.f8783a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a6.f8781a = new Rect(i2 - i6, i5 - i6, i2 + i6, i5 + i6);
        }
        a6.c();
    }
}
