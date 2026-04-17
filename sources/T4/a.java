package T4;

import B4.b;
import H.j;
import R4.i;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C0269a;
import androidx.fragment.app.C0286s;
import androidx.fragment.app.I;
import com.mtma.criminal.city.R;
import d5.o;
import e5.C0505b;
import e5.C0509f;
import f.C0518i;
import java.util.ArrayList;

public final class a extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3578a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f3579b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(d dVar, View view, int i2) {
        super(view);
        this.f3578a = i2;
        this.f3579b = dVar;
    }

    public final void onClick(View view) {
        switch (this.f3578a) {
            case 0:
                super.onClick(view);
                C0518i iVar = (C0518i) this.f3579b.f3587d0;
                for (C0286s sVar : iVar.l().f5000c.v()) {
                    if ((sVar instanceof i) || (sVar instanceof d)) {
                        I l6 = iVar.l();
                        l6.getClass();
                        C0269a aVar = new C0269a(l6);
                        aVar.h(sVar);
                        aVar.e(false);
                    }
                }
                return;
            default:
                super.onClick(view);
                d dVar = this.f3579b;
                if (!dVar.s0) {
                    dVar.s0 = true;
                    Context context = dVar.f3587d0;
                    C0505b bVar = new C0505b(context, R.layout.dialog_museum_background);
                    ConstraintLayout constraintLayout = (ConstraintLayout) bVar.findViewById(R.id.dialog_museum_background_main_layout);
                    ScrollView scrollView = (ScrollView) bVar.findViewById(R.id.dialog_museum_background_scroll_view);
                    RelativeLayout relativeLayout = (RelativeLayout) bVar.findViewById(R.id.dialog_museum_background_change_button);
                    LinearLayout linearLayout = (LinearLayout) bVar.findViewById(R.id.dialog_museum_background_container_layout);
                    ImageView imageView = (ImageView) bVar.findViewById(R.id.dialog_museum_background_close_button);
                    ArrayList<Integer> museumBackgroundAvailable = o.getStockObject().getMuseumBackgroundAvailable();
                    boolean z3 = false;
                    int i2 = 0;
                    while (i2 < museumBackgroundAvailable.size()) {
                        View inflate = LayoutInflater.from(context).inflate(R.layout.item_museum_background, (ViewGroup) null, z3);
                        CheckBox checkBox = (CheckBox) inflate.findViewById(R.id.item_museum_check_box);
                        ((ImageView) inflate.findViewById(R.id.item_museum_background)).setImageResource(android.support.v4.media.session.a.X(museumBackgroundAvailable.get(i2).intValue()));
                        int museumBackgroundIdSelected = o.getStockObject().getMuseumBackgroundIdSelected();
                        dVar.f3601r0 = museumBackgroundIdSelected;
                        if (museumBackgroundIdSelected == museumBackgroundAvailable.get(i2).intValue()) {
                            checkBox.setChecked(true);
                        }
                        checkBox.setOnTouchListener(new b(checkBox, 5));
                        checkBox.setOnCheckedChangeListener(new b(dVar, museumBackgroundAvailable, i2, linearLayout));
                        linearLayout.addView(inflate);
                        i2++;
                        z3 = false;
                    }
                    scrollView.post(new j((Object) linearLayout, (Object) scrollView, (Object) constraintLayout, 11));
                    relativeLayout.setOnClickListener(new c(dVar, relativeLayout, bVar, 0));
                    imageView.setOnClickListener(new c(dVar, imageView, bVar, 1));
                    bVar.show();
                    return;
                }
                return;
        }
    }
}
