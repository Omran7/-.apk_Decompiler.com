package m0;

import K.C0075o;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

/* renamed from: m0.h  reason: case insensitive filesystem */
public final class C0816h extends C0801C {

    /* renamed from: s  reason: collision with root package name */
    public static TimeInterpolator f9973s;
    public boolean g;
    public ArrayList h;

    /* renamed from: i  reason: collision with root package name */
    public ArrayList f9974i;

    /* renamed from: j  reason: collision with root package name */
    public ArrayList f9975j;

    /* renamed from: k  reason: collision with root package name */
    public ArrayList f9976k;

    /* renamed from: l  reason: collision with root package name */
    public ArrayList f9977l;

    /* renamed from: m  reason: collision with root package name */
    public ArrayList f9978m;

    /* renamed from: n  reason: collision with root package name */
    public ArrayList f9979n;

    /* renamed from: o  reason: collision with root package name */
    public ArrayList f9980o;

    /* renamed from: p  reason: collision with root package name */
    public ArrayList f9981p;

    /* renamed from: q  reason: collision with root package name */
    public ArrayList f9982q;

    /* renamed from: r  reason: collision with root package name */
    public ArrayList f9983r;

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((T) arrayList.get(size)).f9893a.animate().cancel();
        }
    }

    /* JADX WARNING: type inference failed for: r12v3, types: [m0.f, java.lang.Object] */
    public final boolean a(T t6, T t7, C0075o oVar, C0075o oVar2) {
        int i2;
        int i5;
        int i6 = oVar.f1411a;
        int i7 = oVar.f1412b;
        if (t7.p()) {
            int i8 = oVar.f1411a;
            i2 = oVar.f1412b;
            i5 = i8;
        } else {
            i5 = oVar2.f1411a;
            i2 = oVar2.f1412b;
        }
        if (t6 == t7) {
            return g(t6, i6, i7, i5, i2);
        }
        View view = t6.f9893a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        l(t6);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        l(t7);
        View view2 = t7.f9893a;
        view2.setTranslationX((float) (-((int) (((float) (i5 - i6)) - translationX))));
        view2.setTranslationY((float) (-((int) (((float) (i2 - i7)) - translationY))));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.f9976k;
        ? obj = new Object();
        obj.f9961a = t6;
        obj.f9962b = t7;
        obj.f9963c = i6;
        obj.d = i7;
        obj.f9964e = i5;
        obj.f9965f = i2;
        arrayList.add(obj);
        return true;
    }

    public final void d(T t6) {
        View view = t6.f9893a;
        view.animate().cancel();
        ArrayList arrayList = this.f9975j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((C0815g) arrayList.get(size)).f9969a == t6) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(t6);
                arrayList.remove(size);
            }
        }
        j(this.f9976k, t6);
        if (this.h.remove(t6)) {
            view.setAlpha(1.0f);
            c(t6);
        }
        if (this.f9974i.remove(t6)) {
            view.setAlpha(1.0f);
            c(t6);
        }
        ArrayList arrayList2 = this.f9979n;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            j(arrayList3, t6);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f9978m;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((C0815g) arrayList5.get(size4)).f9969a == t6) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(t6);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList arrayList6 = this.f9977l;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(t6)) {
                view.setAlpha(1.0f);
                c(t6);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.f9982q.remove(t6);
        this.f9980o.remove(t6);
        this.f9983r.remove(t6);
        this.f9981p.remove(t6);
        i();
    }

    public final void e() {
        ArrayList arrayList = this.f9975j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C0815g gVar = (C0815g) arrayList.get(size);
            View view = gVar.f9969a.f9893a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(gVar.f9969a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.h;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            c((T) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f9974i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            T t6 = (T) arrayList3.get(size3);
            t6.f9893a.setAlpha(1.0f);
            c(t6);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f9976k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            C0814f fVar = (C0814f) arrayList4.get(size4);
            T t7 = fVar.f9961a;
            if (t7 != null) {
                k(fVar, t7);
            }
            T t8 = fVar.f9962b;
            if (t8 != null) {
                k(fVar, t8);
            }
        }
        arrayList4.clear();
        if (f()) {
            ArrayList arrayList5 = this.f9978m;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    C0815g gVar2 = (C0815g) arrayList6.get(size6);
                    View view2 = gVar2.f9969a.f9893a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    c(gVar2.f9969a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList arrayList7 = this.f9977l;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    T t9 = (T) arrayList8.get(size8);
                    t9.f9893a.setAlpha(1.0f);
                    c(t9);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList arrayList9 = this.f9979n;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    C0814f fVar2 = (C0814f) arrayList10.get(size10);
                    T t10 = fVar2.f9961a;
                    if (t10 != null) {
                        k(fVar2, t10);
                    }
                    T t11 = fVar2.f9962b;
                    if (t11 != null) {
                        k(fVar2, t11);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            h(this.f9982q);
            h(this.f9981p);
            h(this.f9980o);
            h(this.f9983r);
            ArrayList arrayList11 = this.f9842b;
            if (arrayList11.size() <= 0) {
                arrayList11.clear();
            } else {
                arrayList11.get(0).getClass();
                throw new ClassCastException();
            }
        }
    }

    public final boolean f() {
        if (!this.f9974i.isEmpty() || !this.f9976k.isEmpty() || !this.f9975j.isEmpty() || !this.h.isEmpty() || !this.f9981p.isEmpty() || !this.f9982q.isEmpty() || !this.f9980o.isEmpty() || !this.f9983r.isEmpty() || !this.f9978m.isEmpty() || !this.f9977l.isEmpty() || !this.f9979n.isEmpty()) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r1v6, types: [java.lang.Object, m0.g] */
    public final boolean g(T t6, int i2, int i5, int i6, int i7) {
        View view = t6.f9893a;
        int translationX = i2 + ((int) view.getTranslationX());
        int translationY = i5 + ((int) t6.f9893a.getTranslationY());
        l(t6);
        int i8 = i6 - translationX;
        int i9 = i7 - translationY;
        if (i8 == 0 && i9 == 0) {
            c(t6);
            return false;
        }
        if (i8 != 0) {
            view.setTranslationX((float) (-i8));
        }
        if (i9 != 0) {
            view.setTranslationY((float) (-i9));
        }
        ArrayList arrayList = this.f9975j;
        ? obj = new Object();
        obj.f9969a = t6;
        obj.f9970b = translationX;
        obj.f9971c = translationY;
        obj.d = i6;
        obj.f9972e = i7;
        arrayList.add(obj);
        return true;
    }

    public final void i() {
        if (!f()) {
            ArrayList arrayList = this.f9842b;
            if (arrayList.size() <= 0) {
                arrayList.clear();
            } else {
                arrayList.get(0).getClass();
                throw new ClassCastException();
            }
        }
    }

    public final void j(ArrayList arrayList, T t6) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0814f fVar = (C0814f) arrayList.get(size);
            if (k(fVar, t6) && fVar.f9961a == null && fVar.f9962b == null) {
                arrayList.remove(fVar);
            }
        }
    }

    public final boolean k(C0814f fVar, T t6) {
        if (fVar.f9962b == t6) {
            fVar.f9962b = null;
        } else if (fVar.f9961a != t6) {
            return false;
        } else {
            fVar.f9961a = null;
        }
        t6.f9893a.setAlpha(1.0f);
        View view = t6.f9893a;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        c(t6);
        return true;
    }

    public final void l(T t6) {
        if (f9973s == null) {
            f9973s = new ValueAnimator().getInterpolator();
        }
        t6.f9893a.animate().setInterpolator(f9973s);
        d(t6);
    }
}
