package q1;

import android.os.Bundle;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.internal.I;
import java.util.Arrays;
import java.util.Set;

/* renamed from: q1.d  reason: case insensitive filesystem */
public final class C0934d implements e {

    /* renamed from: b  reason: collision with root package name */
    public static final C0934d f11081b = new C0934d(new Bundle());

    /* renamed from: a  reason: collision with root package name */
    public final Bundle f11082a;

    public /* synthetic */ C0934d(Bundle bundle) {
        this.f11082a = bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0934d)) {
            return false;
        }
        Bundle bundle = ((C0934d) obj).f11082a;
        Bundle bundle2 = this.f11082a;
        if (bundle2 == null || bundle == null) {
            if (bundle2 == bundle) {
                return true;
            }
        } else if (bundle2.size() == bundle.size()) {
            Set<String> keySet = bundle2.keySet();
            if (keySet.containsAll(bundle.keySet())) {
                for (String next : keySet) {
                    if (!I.j(bundle2.get(next), bundle.get(next))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11082a});
    }
}
