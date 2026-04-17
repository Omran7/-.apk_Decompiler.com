package j4;

import R2.b;
import Y4.D;
import android.content.Context;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.C0445o;
import d5.o;
import e5.C0505b;
import e5.C0509f;
import h0.C0552a;

public final class H0 extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8886a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ EditText f8887b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0505b f8888c;
    public final /* synthetic */ D d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ M0 f8889e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public H0(M0 m02, RelativeLayout relativeLayout, C0505b bVar, EditText editText, D d6) {
        super(relativeLayout);
        this.f8889e = m02;
        this.f8888c = bVar;
        this.f8887b = editText;
        this.d = d6;
    }

    public final void onClick(View view) {
        int i2;
        D d6 = this.d;
        C0505b bVar = this.f8888c;
        M0 m02 = this.f8889e;
        EditText editText = this.f8887b;
        switch (this.f8886a) {
            case 0:
                super.onClick(view);
                bVar.dismiss();
                m02.h = false;
                String g = a.g(editText);
                boolean isEmpty = g.isEmpty();
                Context context = m02.f8919a;
                if (isEmpty || g.equals("0")) {
                    a.m(MyApplication.f7090a, R.string.select_amount_first, context, view);
                    return;
                }
                int parseInt = Integer.parseInt(g);
                if (parseInt > o.getStockObject().getBagFreeSpace()) {
                    a.n(MyApplication.f7090a, R.string.no_enough_space_in_bag, context, (String) null);
                    return;
                }
                b.w(true);
                android.support.v4.media.session.a.N(o.getAccountObject().getId(), new C0445o((Object) m02, parseInt, (Object) d6));
                return;
            default:
                super.onClick(view);
                try {
                    i2 = Integer.parseInt(editText.getText().toString().trim());
                } catch (Exception e6) {
                    int i5 = M0.f8918k;
                    C0552a.x(e6, "Exception from try-catch block when get integer from EditText (ignore it, default value added 0).", "M0");
                    i2 = 0;
                }
                if (i2 == 0) {
                    a.n(MyApplication.f7090a, R.string.select_amount_for_converting, m02.f8919a, (String) null);
                    return;
                }
                bVar.dismiss();
                m02.f8925j = false;
                b.w(true);
                android.support.v4.media.session.a.i0(new K(m02, i2, d6, 3));
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public H0(M0 m02, RelativeLayout relativeLayout, EditText editText, C0505b bVar, D d6) {
        super(relativeLayout);
        this.f8889e = m02;
        this.f8887b = editText;
        this.f8888c = bVar;
        this.d = d6;
    }
}
