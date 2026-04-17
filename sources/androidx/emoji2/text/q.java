package androidx.emoji2.text;

import android.util.SparseArray;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final SparseArray f4954a;

    /* renamed from: b  reason: collision with root package name */
    public t f4955b;

    public q(int i2) {
        this.f4954a = new SparseArray(i2);
    }

    public final void a(t tVar, int i2, int i5) {
        q qVar;
        int a6 = tVar.a(i2);
        SparseArray sparseArray = this.f4954a;
        if (sparseArray == null) {
            qVar = null;
        } else {
            qVar = (q) sparseArray.get(a6);
        }
        if (qVar == null) {
            qVar = new q(1);
            sparseArray.put(tVar.a(i2), qVar);
        }
        if (i5 > i2) {
            qVar.a(tVar, i2 + 1, i5);
        } else {
            qVar.f4955b = tVar;
        }
    }
}
