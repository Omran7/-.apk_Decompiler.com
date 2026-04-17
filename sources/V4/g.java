package V4;

import I1.b;
import K1.e;
import Y4.D;
import android.graphics.Typeface;
import android.os.Handler;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import d5.o;
import j4.C0614b;
import java.util.ArrayList;
import w4.C1088d;

public final class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3801a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f3802b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f3803c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g(Object obj, Object obj2, int i2, int i5) {
        this.f3801a = i5;
        this.d = obj;
        this.f3803c = obj2;
        this.f3802b = i2;
    }

    public final void run() {
        switch (this.f3801a) {
            case 0:
                h hVar = (h) this.d;
                hVar.f3819Q0.clearAnimation();
                hVar.f3819Q0.setVisibility(8);
                hVar.f3808D0.setLayoutParams((RelativeLayout.LayoutParams) this.f3803c);
                hVar.f3808D0.setPaddingRelative(e.m(1.0d), 2, -this.f3802b, e.m(1.0d));
                return;
            case 1:
                int i2 = this.f3802b + 1;
                ArrayList arrayList = (ArrayList) this.f3803c;
                if (i2 < arrayList.size()) {
                    C0614b bVar = (C0614b) this.d;
                    bVar.add((D) arrayList.get(i2));
                    bVar.notifyDataSetChanged();
                    new Handler().postDelayed(new g(i2, arrayList, bVar), 200);
                    return;
                }
                return;
            case 2:
                ((BottomSheetBehavior) this.d).E((View) this.f3803c, this.f3802b, false);
                return;
            case 3:
                int i5 = this.f3802b;
                ((TextView) this.f3803c).setTypeface((Typeface) this.d, i5);
                return;
            default:
                C1088d dVar = (C1088d) this.d;
                dVar.f12457G0.clearAnimation();
                dVar.f12457G0.setVisibility(8);
                dVar.f12456F0.setLayoutParams((RelativeLayout.LayoutParams) this.f3803c);
                dVar.f12456F0.setPaddingRelative(e.m(1.0d), 2, -this.f3802b, e.m(1.0d));
                if (b.n0(o.getGymObject().getSelectedGymLesson() + 1)) {
                    dVar.f12455E0.setVisibility(4);
                    dVar.f12462M0.notifyDataSetChanged();
                    return;
                }
                return;
        }
    }

    public g(TextView textView, Typeface typeface, int i2) {
        this.f3801a = 3;
        this.f3803c = textView;
        this.d = typeface;
        this.f3802b = i2;
    }

    public g(int i2, ArrayList arrayList, C0614b bVar) {
        this.f3801a = 1;
        this.f3802b = i2;
        this.f3803c = arrayList;
        this.d = bVar;
    }
}
