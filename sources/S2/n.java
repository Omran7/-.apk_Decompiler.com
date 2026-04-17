package s2;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;
import r2.C0949a;

public final class n extends t {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ArrayList f11504c;
    public final /* synthetic */ Matrix d;

    public n(ArrayList arrayList, Matrix matrix) {
        this.f11504c = arrayList;
        this.d = matrix;
    }

    public final void a(Matrix matrix, C0949a aVar, int i2, Canvas canvas) {
        Iterator it2 = this.f11504c.iterator();
        while (it2.hasNext()) {
            ((t) it2.next()).a(this.d, aVar, i2, canvas);
        }
    }
}
