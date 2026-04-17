package W4;

import R2.b;
import Y4.D;
import Y4.E;
import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import e5.C0509f;

public final class c extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4092a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ E f4093b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ g f4094c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(g gVar, ConstraintLayout constraintLayout, E e6, int i2) {
        super(constraintLayout);
        this.f4092a = i2;
        this.f4094c = gVar;
        this.f4093b = e6;
    }

    public final void onClick(View view) {
        switch (this.f4092a) {
            case 0:
                super.onClick(view);
                Context applicationContext = MyApplication.f7090a.getApplicationContext();
                E e6 = this.f4093b;
                com.bumptech.glide.c.s0(this.f4094c.f4104d0, MyApplication.f7090a.getApplicationContext().getString(R.string.city_to_get_certification, new Object[]{applicationContext.getString(D.s(e6.d, 0, 1).f4295c), MyApplication.f7090a.getApplicationContext().getString(b.F(e6.d))}), (String) null);
                return;
            default:
                super.onClick(view);
                Context applicationContext2 = MyApplication.f7090a.getApplicationContext();
                E e7 = this.f4093b;
                com.bumptech.glide.c.s0(this.f4094c.f4104d0, MyApplication.f7090a.getApplicationContext().getString(R.string.city_to_get_certification, new Object[]{applicationContext2.getString(D.s(e7.d, 0, 1).f4295c), MyApplication.f7090a.getApplicationContext().getString(b.F(e7.d))}), (String) null);
                return;
        }
    }
}
