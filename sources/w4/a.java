package W4;

import android.view.View;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.v0;
import e5.C0509f;
import java.util.ArrayList;

public final class a extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4087a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ArrayList f4088b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f4089c;
    public final /* synthetic */ g d;

    public /* synthetic */ a(g gVar, ArrayList arrayList, int i2, int i5) {
        this.f4087a = i5;
        this.d = gVar;
        this.f4088b = arrayList;
        this.f4089c = i2;
    }

    public final void onClick(View view) {
        switch (this.f4087a) {
            case 0:
                super.onClick(view);
                v0.c(this.d.f4104d0, view, MyApplication.f7090a.getApplicationContext().getString(((Integer) this.f4088b.get(this.f4089c)).intValue()));
                return;
            case 1:
                super.onClick(view);
                v0.c(this.d.f4104d0, view, MyApplication.f7090a.getApplicationContext().getString(((Integer) this.f4088b.get(this.f4089c)).intValue()));
                return;
            default:
                super.onClick(view);
                v0.c(this.d.f4104d0, view, MyApplication.f7090a.getApplicationContext().getString(((Integer) this.f4088b.get(this.f4089c)).intValue()));
                return;
        }
    }
}
