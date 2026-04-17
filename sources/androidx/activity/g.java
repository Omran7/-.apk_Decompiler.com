package androidx.activity;

import android.os.Bundle;
import androidx.fragment.app.C0286s;
import androidx.fragment.app.C0288u;
import androidx.fragment.app.C0289v;
import b.C0310a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import k.C0738t;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.p;
import y5.a;

public final /* synthetic */ class g implements C0310a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4622a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ o f4623b;

    public /* synthetic */ g(o oVar, int i2) {
        this.f4622a = i2;
        this.f4623b = oVar;
    }

    public final void a(o oVar) {
        switch (this.f4622a) {
            case 0:
                o oVar2 = this.f4623b;
                j.e(oVar, "it");
                Bundle c3 = ((C0738t) oVar2.d.d).c("android:support:activity-result");
                if (c3 != null) {
                    m mVar = oVar2.f4649r;
                    mVar.getClass();
                    ArrayList<Integer> integerArrayList = c3.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = c3.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList != null && integerArrayList != null) {
                        ArrayList<String> stringArrayList2 = c3.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                        if (stringArrayList2 != null) {
                            mVar.d.addAll(stringArrayList2);
                        }
                        Bundle bundle = c3.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                        Bundle bundle2 = mVar.g;
                        if (bundle != null) {
                            bundle2.putAll(bundle);
                        }
                        int size = stringArrayList.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            String str = stringArrayList.get(i2);
                            LinkedHashMap linkedHashMap = mVar.f4635b;
                            boolean containsKey = linkedHashMap.containsKey(str);
                            LinkedHashMap linkedHashMap2 = mVar.f4634a;
                            if (containsKey) {
                                Integer num = (Integer) linkedHashMap.remove(str);
                                if (bundle2.containsKey(str)) {
                                    continue;
                                } else if (!(linkedHashMap2 instanceof a)) {
                                    linkedHashMap2.remove(num);
                                } else {
                                    p.b(linkedHashMap2, "kotlin.collections.MutableMap");
                                    throw null;
                                }
                            }
                            Integer num2 = integerArrayList.get(i2);
                            j.d(num2, "rcs[i]");
                            int intValue = num2.intValue();
                            String str2 = stringArrayList.get(i2);
                            j.d(str2, "keys[i]");
                            String str3 = str2;
                            linkedHashMap2.put(Integer.valueOf(intValue), str3);
                            linkedHashMap.put(str3, Integer.valueOf(intValue));
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                C0288u uVar = (C0288u) ((C0289v) this.f4623b).f5197C.f2796b;
                uVar.f5195s.b(uVar, uVar, (C0286s) null);
                return;
        }
    }
}
