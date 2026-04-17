package r4;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import com.bumptech.glide.c;
import e5.C0508e;

/* renamed from: r4.g  reason: case insensitive filesystem */
public final /* synthetic */ class C0957g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f11236a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ j f11237b;

    public /* synthetic */ C0957g(j jVar, int i2) {
        this.f11236a = i2;
        this.f11237b = jVar;
    }

    public final void run() {
        switch (this.f11236a) {
            case 0:
                C0508e eVar = this.f11237b.f11264x0;
                if (!eVar.isShowing()) {
                    View view = eVar.f7698c;
                    if (view.getWindowToken() != null) {
                        eVar.setBackgroundDrawable(new ColorDrawable(0));
                        eVar.showAtLocation(view, 0, 0, 0);
                        return;
                    }
                    return;
                }
                return;
            default:
                j jVar = this.f11237b;
                if (jVar.f11253l0.isShown()) {
                    if (c.f5744o != -111) {
                        jVar.f11253l0.setText(c.v());
                    }
                    j.f11243y0.postDelayed(j.f11244z0, 1000);
                    return;
                }
                return;
        }
    }
}
