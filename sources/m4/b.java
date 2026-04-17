package M4;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import d5.k;
import i3.C0587c;
import java.util.ArrayList;
import java.util.List;

public final /* synthetic */ class b implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f1840a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1841b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f1842c;

    public /* synthetic */ b(c cVar, ArrayList arrayList, int i2) {
        this.f1840a = cVar;
        this.f1841b = arrayList;
        this.f1842c = i2;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [java.lang.Object, Y4.e] */
    public final void onComplete(Task task) {
        k kVar;
        c cVar = this.f1840a;
        ArrayList arrayList = cVar.f1848i0;
        int size = arrayList.size();
        int i2 = 0;
        for (Task task2 : (List) task.getResult()) {
            if (task2.isSuccessful() && (kVar = (k) ((C0587c) task2.getResult()).f(k.class)) != null) {
                ? obj = new Object();
                obj.f4340a = (String) this.f1841b.get(i2);
                obj.f4341b = kVar.getNickName();
                obj.f4342c = kVar.getProfilePicUrl();
                obj.g = kVar.getLevel();
                obj.f4344f = kVar.getGender();
                obj.d = R2.b.k0(kVar.getVipEndTime());
                obj.f4343e = R2.b.l0(kVar.getLastSeen());
                arrayList.add(size, obj);
            }
            i2++;
        }
        cVar.f1850k0.notifyDataSetChanged();
        cVar.f1846g0.setEmptyView(cVar.f1847h0);
        int i5 = this.f1842c;
        if (i5 == 10) {
            cVar.f1855p0 = true;
        }
        cVar.f1854o0 += i5;
        R2.b.w(false);
    }
}
