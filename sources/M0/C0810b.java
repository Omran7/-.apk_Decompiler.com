package m0;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: m0.b  reason: case insensitive filesystem */
public final class C0810b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9927a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ArrayList f9928b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0816h f9929c;

    public /* synthetic */ C0810b(C0816h hVar, ArrayList arrayList, int i2) {
        this.f9927a = i2;
        this.f9929c = hVar;
        this.f9928b = arrayList;
    }

    public final void run() {
        View view;
        View view2;
        Iterator it2;
        switch (this.f9927a) {
            case 0:
                ArrayList arrayList = this.f9928b;
                Iterator it3 = arrayList.iterator();
                while (true) {
                    boolean hasNext = it3.hasNext();
                    C0816h hVar = this.f9929c;
                    if (hasNext) {
                        C0815g gVar = (C0815g) it3.next();
                        T t6 = gVar.f9969a;
                        hVar.getClass();
                        View view3 = t6.f9893a;
                        int i2 = gVar.d - gVar.f9970b;
                        int i5 = gVar.f9972e - gVar.f9971c;
                        if (i2 != 0) {
                            view3.animate().translationX(0.0f);
                        }
                        if (i5 != 0) {
                            view3.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator animate = view3.animate();
                        hVar.f9981p.add(t6);
                        animate.setDuration(hVar.f9844e).setListener(new C0812d(hVar, t6, i2, view3, i5, animate)).start();
                    } else {
                        arrayList.clear();
                        hVar.f9978m.remove(arrayList);
                        return;
                    }
                }
            case 1:
                ArrayList arrayList2 = this.f9928b;
                Iterator it4 = arrayList2.iterator();
                while (true) {
                    boolean hasNext2 = it4.hasNext();
                    C0816h hVar2 = this.f9929c;
                    if (hasNext2) {
                        C0814f fVar = (C0814f) it4.next();
                        hVar2.getClass();
                        T t7 = fVar.f9961a;
                        if (t7 == null) {
                            view = null;
                        } else {
                            view = t7.f9893a;
                        }
                        T t8 = fVar.f9962b;
                        if (t8 != null) {
                            view2 = t8.f9893a;
                        } else {
                            view2 = null;
                        }
                        ArrayList arrayList3 = hVar2.f9983r;
                        long j6 = hVar2.f9845f;
                        if (view != null) {
                            ViewPropertyAnimator duration = view.animate().setDuration(j6);
                            arrayList3.add(fVar.f9961a);
                            duration.translationX((float) (fVar.f9964e - fVar.f9963c));
                            duration.translationY((float) (fVar.f9965f - fVar.d));
                            C0813e eVar = r4;
                            it2 = it4;
                            C0813e eVar2 = new C0813e(hVar2, fVar, duration, view, 0);
                            duration.alpha(0.0f).setListener(eVar).start();
                        } else {
                            it2 = it4;
                        }
                        if (view2 != null) {
                            ViewPropertyAnimator animate2 = view2.animate();
                            arrayList3.add(fVar.f9962b);
                            animate2.translationX(0.0f).translationY(0.0f).setDuration(j6).alpha(1.0f).setListener(new C0813e(hVar2, fVar, animate2, view2, 1)).start();
                        }
                        it4 = it2;
                    } else {
                        arrayList2.clear();
                        hVar2.f9979n.remove(arrayList2);
                        return;
                    }
                }
            default:
                ArrayList arrayList4 = this.f9928b;
                Iterator it5 = arrayList4.iterator();
                while (true) {
                    boolean hasNext3 = it5.hasNext();
                    C0816h hVar3 = this.f9929c;
                    if (hasNext3) {
                        T t9 = (T) it5.next();
                        hVar3.getClass();
                        View view4 = t9.f9893a;
                        ViewPropertyAnimator animate3 = view4.animate();
                        hVar3.f9980o.add(t9);
                        animate3.alpha(1.0f).setDuration(hVar3.f9843c).setListener(new C0811c(hVar3, t9, view4, animate3)).start();
                    } else {
                        arrayList4.clear();
                        hVar3.f9977l.remove(arrayList4);
                        return;
                    }
                }
        }
    }
}
