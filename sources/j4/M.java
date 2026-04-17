package j4;

import android.content.Context;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;

public final class M implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8914a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ConstraintLayout f8915b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ArrayList f8916c;
    public final /* synthetic */ GridView d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ArrayAdapter f8917e;

    public /* synthetic */ M(ArrayAdapter arrayAdapter, ConstraintLayout constraintLayout, ArrayList arrayList, GridView gridView, int i2) {
        this.f8914a = i2;
        this.f8917e = arrayAdapter;
        this.f8915b = constraintLayout;
        this.f8916c = arrayList;
        this.d = gridView;
    }

    public final void onGlobalLayout() {
        switch (this.f8914a) {
            case 0:
                int height = this.f8915b.getRootView().getHeight();
                Context context = ((C0626h) this.f8917e).f9018b;
                ArrayList arrayList = this.f8916c;
                C0641q qVar = new C0641q(context, arrayList, height, 3);
                int size = arrayList.size();
                GridView gridView = this.d;
                gridView.setNumColumns(size);
                gridView.setAdapter(qVar);
                gridView.getRootView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
                return;
            case 1:
                int height2 = this.f8915b.getRootView().getHeight();
                Context context2 = ((C0621e0) this.f8917e).f8999a;
                ArrayList arrayList2 = this.f8916c;
                C0641q qVar2 = new C0641q(context2, arrayList2, height2, 3);
                int size2 = arrayList2.size();
                GridView gridView2 = this.d;
                gridView2.setNumColumns(size2);
                gridView2.setAdapter(qVar2);
                gridView2.getRootView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
                return;
            default:
                int height3 = this.f8915b.getRootView().getHeight();
                Context context3 = ((Z) this.f8917e).f8965b;
                ArrayList arrayList3 = this.f8916c;
                C0641q qVar3 = new C0641q(context3, arrayList3, height3, 3);
                int size3 = arrayList3.size();
                GridView gridView3 = this.d;
                gridView3.setNumColumns(size3);
                gridView3.setAdapter(qVar3);
                gridView3.getRootView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
                return;
        }
    }
}
