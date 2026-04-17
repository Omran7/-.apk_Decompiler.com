package t;

import java.util.ArrayList;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public o f11593a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList f11594b;

    public static long a(f fVar, long j6) {
        o oVar = fVar.d;
        if (oVar instanceof j) {
            return j6;
        }
        ArrayList arrayList = fVar.f11588k;
        int size = arrayList.size();
        long j7 = j6;
        for (int i2 = 0; i2 < size; i2++) {
            d dVar = (d) arrayList.get(i2);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.d != oVar) {
                    j7 = Math.min(j7, a(fVar2, ((long) fVar2.f11585f) + j6));
                }
            }
        }
        if (fVar != oVar.f11607i) {
            return j7;
        }
        long j8 = oVar.j();
        f fVar3 = oVar.h;
        long j9 = j6 - j8;
        return Math.min(Math.min(j7, a(fVar3, j9)), j9 - ((long) fVar3.f11585f));
    }

    public static long b(f fVar, long j6) {
        o oVar = fVar.d;
        if (oVar instanceof j) {
            return j6;
        }
        ArrayList arrayList = fVar.f11588k;
        int size = arrayList.size();
        long j7 = j6;
        for (int i2 = 0; i2 < size; i2++) {
            d dVar = (d) arrayList.get(i2);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.d != oVar) {
                    j7 = Math.max(j7, b(fVar2, ((long) fVar2.f11585f) + j6));
                }
            }
        }
        if (fVar != oVar.h) {
            return j7;
        }
        long j8 = oVar.j();
        f fVar3 = oVar.f11607i;
        long j9 = j6 + j8;
        return Math.max(Math.max(j7, b(fVar3, j9)), j9 - ((long) fVar3.f11585f));
    }
}
