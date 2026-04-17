package androidx.fragment.app;

import S3.z;
import android.util.Log;
import c.C0326a;
import c.C0327b;
import java.util.ArrayList;
import java.util.Map;

public final class A implements C0327b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4971a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ I f4972b;

    public /* synthetic */ A(I i2, int i5) {
        this.f4971a = i5;
        this.f4972b = i2;
    }

    public final void e(Object obj) {
        int i2;
        switch (this.f4971a) {
            case 0:
                Map map = (Map) obj;
                String[] strArr = (String[]) map.keySet().toArray(new String[0]);
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    if (((Boolean) arrayList.get(i5)).booleanValue()) {
                        i2 = 0;
                    } else {
                        i2 = -1;
                    }
                    iArr[i5] = i2;
                }
                I i6 = this.f4972b;
                F f6 = (F) i6.f4988C.pollFirst();
                if (f6 == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                    return;
                }
                z zVar = i6.f5000c;
                String str = f6.f4978a;
                if (zVar.r(str) == null) {
                    Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                    return;
                }
                return;
            default:
                C0326a aVar = (C0326a) obj;
                I i7 = this.f4972b;
                F f7 = (F) i7.f4988C.pollFirst();
                if (f7 == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                    return;
                }
                z zVar2 = i7.f5000c;
                String str2 = f7.f4978a;
                C0286s r6 = zVar2.r(str2);
                if (r6 == null) {
                    Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str2);
                    return;
                }
                r6.z(f7.f4979b, aVar.f5560a, aVar.f5561b);
                return;
        }
    }
}
