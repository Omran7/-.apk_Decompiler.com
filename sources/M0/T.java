package m0;

import K.O;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import k5.C0770g;
import q.C0928e;

public abstract class T {

    /* renamed from: s  reason: collision with root package name */
    public static final List f9892s = Collections.emptyList();

    /* renamed from: a  reason: collision with root package name */
    public final View f9893a;

    /* renamed from: b  reason: collision with root package name */
    public WeakReference f9894b;

    /* renamed from: c  reason: collision with root package name */
    public int f9895c = -1;
    public int d = -1;

    /* renamed from: e  reason: collision with root package name */
    public long f9896e = -1;

    /* renamed from: f  reason: collision with root package name */
    public int f9897f = -1;
    public int g = -1;
    public T h = null;

    /* renamed from: i  reason: collision with root package name */
    public T f9898i = null;

    /* renamed from: j  reason: collision with root package name */
    public int f9899j;

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList f9900k = null;

    /* renamed from: l  reason: collision with root package name */
    public final List f9901l = null;

    /* renamed from: m  reason: collision with root package name */
    public int f9902m = 0;

    /* renamed from: n  reason: collision with root package name */
    public C0770g f9903n = null;

    /* renamed from: o  reason: collision with root package name */
    public boolean f9904o = false;

    /* renamed from: p  reason: collision with root package name */
    public int f9905p = 0;

    /* renamed from: q  reason: collision with root package name */
    public int f9906q = -1;

    /* renamed from: r  reason: collision with root package name */
    public RecyclerView f9907r;

    public T(View view) {
        if (view != null) {
            this.f9893a = view;
            return;
        }
        throw new IllegalArgumentException("itemView may not be null");
    }

    public final void a(int i2) {
        this.f9899j = i2 | this.f9899j;
    }

    public final int b() {
        int i2 = this.g;
        if (i2 == -1) {
            return this.f9895c;
        }
        return i2;
    }

    public final List c() {
        ArrayList arrayList;
        int i2 = this.f9899j & 1024;
        List list = f9892s;
        if (i2 != 0 || (arrayList = this.f9900k) == null || arrayList.size() == 0) {
            return list;
        }
        return this.f9901l;
    }

    public final boolean d(int i2) {
        if ((i2 & this.f9899j) != 0) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        View view = this.f9893a;
        if (view.getParent() == null || view.getParent() == this.f9907r) {
            return false;
        }
        return true;
    }

    public final boolean f() {
        if ((this.f9899j & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        if ((this.f9899j & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        if ((this.f9899j & 16) == 0) {
            WeakHashMap weakHashMap = O.f1352a;
            if (!this.f9893a.hasTransientState()) {
                return true;
            }
        }
        return false;
    }

    public final boolean i() {
        if ((this.f9899j & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean j() {
        if (this.f9903n != null) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        if ((this.f9899j & 256) != 0) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        if ((this.f9899j & 2) != 0) {
            return true;
        }
        return false;
    }

    public final void m(int i2, boolean z3) {
        if (this.d == -1) {
            this.d = this.f9895c;
        }
        if (this.g == -1) {
            this.g = this.f9895c;
        }
        if (z3) {
            this.g += i2;
        }
        this.f9895c += i2;
        View view = this.f9893a;
        if (view.getLayoutParams() != null) {
            ((C0805G) view.getLayoutParams()).f9863c = true;
        }
    }

    public final void n() {
        this.f9899j = 0;
        this.f9895c = -1;
        this.d = -1;
        this.f9896e = -1;
        this.g = -1;
        this.f9902m = 0;
        this.h = null;
        this.f9898i = null;
        ArrayList arrayList = this.f9900k;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f9899j &= -1025;
        this.f9905p = 0;
        this.f9906q = -1;
        RecyclerView.j(this);
    }

    public final void o(boolean z3) {
        int i2;
        int i5 = this.f9902m;
        if (z3) {
            i2 = i5 - 1;
        } else {
            i2 = i5 + 1;
        }
        this.f9902m = i2;
        if (i2 < 0) {
            this.f9902m = 0;
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
        } else if (!z3 && i2 == 1) {
            this.f9899j |= 16;
        } else if (z3 && i2 == 0) {
            this.f9899j &= -17;
        }
    }

    public final boolean p() {
        if ((this.f9899j & 128) != 0) {
            return true;
        }
        return false;
    }

    public final boolean q() {
        if ((this.f9899j & 32) != 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        String str2;
        if (getClass().isAnonymousClass()) {
            str = "ViewHolder";
        } else {
            str = getClass().getSimpleName();
        }
        StringBuilder b6 = C0928e.b(str, "{");
        b6.append(Integer.toHexString(hashCode()));
        b6.append(" position=");
        b6.append(this.f9895c);
        b6.append(" id=");
        b6.append(this.f9896e);
        b6.append(", oldPos=");
        b6.append(this.d);
        b6.append(", pLpos:");
        b6.append(this.g);
        StringBuilder sb = new StringBuilder(b6.toString());
        if (j()) {
            sb.append(" scrap ");
            if (this.f9904o) {
                str2 = "[changeScrap]";
            } else {
                str2 = "[attachedScrap]";
            }
            sb.append(str2);
        }
        if (g()) {
            sb.append(" invalid");
        }
        if (!f()) {
            sb.append(" unbound");
        }
        if ((this.f9899j & 2) != 0) {
            sb.append(" update");
        }
        if (i()) {
            sb.append(" removed");
        }
        if (p()) {
            sb.append(" ignored");
        }
        if (k()) {
            sb.append(" tmpDetached");
        }
        if (!h()) {
            sb.append(" not recyclable(" + this.f9902m + ")");
        }
        if ((this.f9899j & 512) != 0 || g()) {
            sb.append(" undefined adapter position");
        }
        if (this.f9893a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }
}
