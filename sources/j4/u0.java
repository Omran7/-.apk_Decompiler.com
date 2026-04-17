package j4;

import R2.b;
import Y4.D;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import e5.C0505b;
import e5.C0509f;
import i3.C0592h;

public final class u0 extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9105a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0505b f9106b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ EditText f9107c;
    public final /* synthetic */ D d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ A0 f9108e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(A0 a02, RelativeLayout relativeLayout, EditText editText, D d6, C0505b bVar, int i2) {
        super(relativeLayout);
        this.f9105a = i2;
        this.f9108e = a02;
        this.f9107c = editText;
        this.d = d6;
        this.f9106b = bVar;
    }

    public final void onClick(View view) {
        switch (this.f9105a) {
            case 0:
                super.onClick(view);
                EditText editText = this.f9107c;
                String g = a.g(editText);
                boolean isEmpty = g.isEmpty();
                A0 a02 = this.f9108e;
                if (isEmpty || g.equals("0")) {
                    a.m(MyApplication.f7090a, R.string.select_amount_first, a02.f8839a, view);
                    return;
                }
                A0.b(a02, Integer.parseInt(editText.getText().toString().trim()), this.d);
                this.f9106b.dismiss();
                a02.d = false;
                return;
            case 1:
                super.onClick(view);
                this.f9106b.dismiss();
                A0 a03 = this.f9108e;
                a03.f8842e = false;
                int parseInt = Integer.parseInt(this.f9107c.getText().toString().trim());
                b.w(true);
                a.v(a.c(C0592h.b().e(), "players"), "locationObject").d(new x0(a03, parseInt, this.d));
                return;
            default:
                super.onClick(view);
                String g5 = a.g(this.f9107c);
                boolean isEmpty2 = g5.isEmpty();
                A0 a04 = this.f9108e;
                if (isEmpty2 || g5.equals("0")) {
                    a.m(MyApplication.f7090a, R.string.select_amount_first, a04.f8839a, view);
                    return;
                }
                A0.c(a04, this.d, 1, Integer.parseInt(g5), this.f9106b);
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u0(A0 a02, RelativeLayout relativeLayout, C0505b bVar, EditText editText, D d6) {
        super(relativeLayout);
        this.f9105a = 1;
        this.f9108e = a02;
        this.f9106b = bVar;
        this.f9107c = editText;
        this.d = d6;
    }
}
