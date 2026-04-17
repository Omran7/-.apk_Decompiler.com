package j4;

import R2.b;
import Y4.D;
import Y4.k;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bumptech.glide.c;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.v0;
import d5.o;
import e5.C0505b;
import e5.C0509f;
import h0.C0552a;

public final class P extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8935a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0505b f8936b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ D f8937c;
    public final /* synthetic */ TextView d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f8938e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ArrayAdapter f8939f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public P(C0626h hVar, RelativeLayout relativeLayout, EditText editText, D d6, k kVar, C0505b bVar) {
        super(relativeLayout);
        this.f8939f = hVar;
        this.d = editText;
        this.f8937c = d6;
        this.f8938e = kVar;
        this.f8936b = bVar;
    }

    public final void onClick(View view) {
        int i2;
        int i5;
        long j6;
        View view2 = view;
        C0505b bVar = this.f8936b;
        ArrayAdapter arrayAdapter = this.f8939f;
        Object obj = this.f8938e;
        TextView textView = this.d;
        switch (this.f8935a) {
            case 0:
                super.onClick(view);
                try {
                    i2 = Integer.parseInt(((EditText) textView).getText().toString().trim());
                } catch (Exception e6) {
                    int i6 = C0626h.d;
                    a.q("Exception from try-catch block inside ", "h", " in displayBuyDialog method.", e6, "h");
                    i2 = 0;
                }
                C0626h hVar = (C0626h) arrayAdapter;
                if (i2 < 1) {
                    a.m(MyApplication.f7090a, R.string.select_amount_first, hVar.f9018b, view2);
                    return;
                } else if (o.getMoneyObject().getCash() < this.f8937c.f4297f * ((long) i2)) {
                    c.x0(hVar.f9018b);
                    return;
                } else {
                    hVar.getClass();
                    b.w(true);
                    android.support.v4.media.session.a.i0(new K(hVar, i2, (k) obj, 0));
                    bVar.dismiss();
                    hVar.f9019c = false;
                    return;
                }
            default:
                super.onClick(view);
                try {
                    i5 = Integer.parseInt(textView.getText().toString().trim());
                } catch (Exception e7) {
                    int i7 = M0.f8918k;
                    C0552a.x(e7, "Exception from try-catch block when get integer from EditText (ignore it, default value added 0).", "M0");
                    i5 = 0;
                }
                String replace = ((TextView) obj).getText().toString().trim().replace(",", "");
                try {
                    j6 = Long.parseLong(replace);
                } catch (Exception e8) {
                    Exception exc = e8;
                    int i8 = M0.f8918k;
                    C0552a.x(exc, "Exception from try-catch block when get integer from EditText (ignore it, default value added 0).", "M0");
                    j6 = 0;
                }
                M0 m02 = (M0) arrayAdapter;
                if (i5 == 0) {
                    a.m(MyApplication.f7090a, R.string.select_amount_first, m02.f8919a, view2);
                    return;
                } else if (i5 > 10) {
                    v0.d(m02.f8919a, view2, MyApplication.f7090a.getApplicationContext().getString(R.string.can_not_add_more_than_for_each_stall_cell, new Object[]{10}));
                    return;
                } else if (j6 == 0) {
                    a.m(MyApplication.f7090a, R.string.select_cost_first, m02.f8919a, view2);
                    return;
                } else if (replace.length() > 13) {
                    a.m(MyApplication.f7090a, R.string.select_cost_too_high, m02.f8919a, view2);
                    return;
                } else {
                    bVar.dismiss();
                    m02.f8924i = false;
                    b.w(true);
                    android.support.v4.media.session.a.i0(new B0(m02, this.f8937c, i5, j6));
                    return;
                }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public P(M0 m02, RelativeLayout relativeLayout, TextView textView, TextView textView2, C0505b bVar, D d6) {
        super(relativeLayout);
        this.f8939f = m02;
        this.d = textView;
        this.f8938e = textView2;
        this.f8936b = bVar;
        this.f8937c = d6;
    }
}
