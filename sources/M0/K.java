package m0;

import android.util.SparseArray;

public final class K {

    /* renamed from: a  reason: collision with root package name */
    public SparseArray f9867a;

    /* renamed from: b  reason: collision with root package name */
    public int f9868b;

    public final C0808J a(int i2) {
        SparseArray sparseArray = this.f9867a;
        C0808J j6 = (C0808J) sparseArray.get(i2);
        if (j6 != null) {
            return j6;
        }
        C0808J j7 = new C0808J();
        sparseArray.put(i2, j7);
        return j7;
    }
}
