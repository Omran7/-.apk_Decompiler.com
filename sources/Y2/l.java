package y2;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class l {
    public static final ArrayList a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            m mVar = (m) it2.next();
            Bundle bundle = new Bundle();
            bundle.putInt("event_type", mVar.f12708a);
            bundle.putLong("event_timestamp", mVar.f12709b);
            arrayList2.add(bundle);
        }
        return arrayList2;
    }

    public static int b(float f6) {
        if (!Float.isNaN(f6)) {
            return Math.round(f6);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }
}
