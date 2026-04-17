package androidx.fragment.app;

import android.util.Log;
import androidx.emoji2.text.v;
import androidx.lifecycle.O;
import androidx.lifecycle.T;
import java.util.HashMap;
import java.util.Iterator;

public final class K extends O {

    /* renamed from: j  reason: collision with root package name */
    public static final v f5028j = new v(1);
    public final HashMap d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public final HashMap f5029e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    public final HashMap f5030f = new HashMap();
    public final boolean g;
    public boolean h = false;

    /* renamed from: i  reason: collision with root package name */
    public boolean f5031i = false;

    public K(boolean z3) {
        this.g = z3;
    }

    public final void b() {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.h = true;
    }

    public final void c(C0286s sVar) {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + sVar);
        }
        d(sVar.f5177e);
    }

    public final void d(String str) {
        HashMap hashMap = this.f5029e;
        K k6 = (K) hashMap.get(str);
        if (k6 != null) {
            k6.b();
            hashMap.remove(str);
        }
        HashMap hashMap2 = this.f5030f;
        T t6 = (T) hashMap2.get(str);
        if (t6 != null) {
            t6.a();
            hashMap2.remove(str);
        }
    }

    public final void e(C0286s sVar) {
        if (this.f5031i) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else if (this.d.remove(sVar.f5177e) != null && Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + sVar);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || K.class != obj.getClass()) {
            return false;
        }
        K k6 = (K) obj;
        if (!this.d.equals(k6.d) || !this.f5029e.equals(k6.f5029e) || !this.f5030f.equals(k6.f5030f)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f5029e.hashCode();
        return this.f5030f.hashCode() + ((hashCode + (this.d.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it2 = this.d.values().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it3 = this.f5029e.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it4 = this.f5030f.keySet().iterator();
        while (it4.hasNext()) {
            sb.append((String) it4.next());
            if (it4.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
