package M4;

import R2.b;
import b5.f;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import d5.k;
import i3.C0587c;
import java.util.ArrayList;
import java.util.List;

public final /* synthetic */ class a implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f1837a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1838b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1839c;
    public final /* synthetic */ int d;

    public /* synthetic */ a(c cVar, ArrayList arrayList, ArrayList arrayList2, int i2) {
        this.f1837a = cVar;
        this.f1838b = arrayList;
        this.f1839c = arrayList2;
        this.d = i2;
    }

    /* JADX WARNING: type inference failed for: r9v1, types: [java.lang.Object, Y4.e] */
    /* JADX WARNING: type inference failed for: r9v2, types: [java.lang.Object, Y4.e] */
    public final void onComplete(Task task) {
        f fVar;
        c cVar = this.f1837a;
        ArrayList arrayList = cVar.f1848i0;
        int size = arrayList.size();
        int i2 = 0;
        for (Task task2 : (List) task.getResult()) {
            if (task2.isSuccessful()) {
                C0587c cVar2 = (C0587c) task2.getResult();
                ArrayList arrayList2 = this.f1838b;
                int intValue = ((Integer) arrayList2.get(i2)).intValue();
                ArrayList arrayList3 = this.f1839c;
                if (intValue == 0 || ((Integer) arrayList2.get(i2)).intValue() == 1) {
                    k kVar = (k) cVar2.f(k.class);
                    if (kVar != null) {
                        int intValue2 = ((Integer) arrayList2.get(i2)).intValue();
                        ? obj = new Object();
                        obj.h = (String) cVar.f1849j0.get(i2);
                        obj.f4340a = (String) arrayList3.get(i2);
                        obj.f4345i = intValue2;
                        obj.f4341b = kVar.getNickName();
                        obj.f4342c = kVar.getProfilePicUrl();
                        obj.g = kVar.getLevel();
                        obj.f4344f = kVar.getGender();
                        obj.d = b.k0(kVar.getVipEndTime());
                        obj.f4343e = b.l0(kVar.getLastSeen());
                        arrayList.add(size, obj);
                    }
                } else if (((Integer) arrayList2.get(i2)).intValue() == 2 && (fVar = (f) cVar2.f(f.class)) != null) {
                    int intValue3 = ((Integer) arrayList2.get(i2)).intValue();
                    ? obj2 = new Object();
                    obj2.h = (String) cVar.f1849j0.get(i2);
                    obj2.f4340a = (String) arrayList3.get(i2);
                    obj2.f4345i = intValue3;
                    obj2.f4341b = fVar.getName();
                    obj2.f4342c = fVar.getImageUrl();
                    obj2.g = fVar.getLevel();
                    arrayList.add(size, obj2);
                }
            }
            i2++;
        }
        cVar.f1850k0.notifyDataSetChanged();
        cVar.f1846g0.setEmptyView(cVar.f1847h0);
        int i5 = this.d;
        if (i5 == 10) {
            cVar.f1855p0 = true;
        }
        cVar.f1854o0 += i5;
        b.w(false);
    }
}
