package t0;

import K.D;
import K.O;
import K.W;
import K.b0;
import S3.z;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.support.v4.media.session.a;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.FrameLayout;
import android.widget.ListView;
import androidx.emoji2.text.v;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import n.e;
import n.g;
import n.h;
import n.j;
import o.C0890a;

public abstract class m implements Cloneable {
    public static final Animator[] F = new Animator[0];

    /* renamed from: G  reason: collision with root package name */
    public static final int[] f11660G = {2, 1, 3, 4};

    /* renamed from: H  reason: collision with root package name */
    public static final v f11661H = new v(26);

    /* renamed from: I  reason: collision with root package name */
    public static final ThreadLocal f11662I = new ThreadLocal();

    /* renamed from: A  reason: collision with root package name */
    public boolean f11663A = false;

    /* renamed from: B  reason: collision with root package name */
    public m f11664B = null;

    /* renamed from: C  reason: collision with root package name */
    public ArrayList f11665C = null;

    /* renamed from: D  reason: collision with root package name */
    public ArrayList f11666D = new ArrayList();

    /* renamed from: E  reason: collision with root package name */
    public v f11667E = f11661H;

    /* renamed from: a  reason: collision with root package name */
    public final String f11668a = getClass().getName();

    /* renamed from: b  reason: collision with root package name */
    public long f11669b = -1;

    /* renamed from: c  reason: collision with root package name */
    public long f11670c = -1;
    public TimeInterpolator d = null;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f11671e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f11672f = new ArrayList();

    /* renamed from: p  reason: collision with root package name */
    public z f11673p = new z(18);

    /* renamed from: q  reason: collision with root package name */
    public z f11674q = new z(18);

    /* renamed from: r  reason: collision with root package name */
    public C0980a f11675r = null;

    /* renamed from: s  reason: collision with root package name */
    public final int[] f11676s = f11660G;

    /* renamed from: t  reason: collision with root package name */
    public ArrayList f11677t;

    /* renamed from: u  reason: collision with root package name */
    public ArrayList f11678u;

    /* renamed from: v  reason: collision with root package name */
    public k[] f11679v;

    /* renamed from: w  reason: collision with root package name */
    public final ArrayList f11680w = new ArrayList();

    /* renamed from: x  reason: collision with root package name */
    public Animator[] f11681x = F;

    /* renamed from: y  reason: collision with root package name */
    public int f11682y = 0;

    /* renamed from: z  reason: collision with root package name */
    public boolean f11683z = false;

    public static void b(z zVar, View view, u uVar) {
        ((e) zVar.f2711b).put(view, uVar);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = (SparseArray) zVar.f2712c;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, (Object) null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = O.f1352a;
        String k6 = D.k(view);
        if (k6 != null) {
            e eVar = (e) zVar.f2713e;
            if (eVar.containsKey(k6)) {
                eVar.put(k6, (Object) null);
            } else {
                eVar.put(k6, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                g gVar = (g) zVar.d;
                if (gVar.f10219a) {
                    int i2 = gVar.d;
                    long[] jArr = gVar.f10220b;
                    Object[] objArr = gVar.f10221c;
                    int i5 = 0;
                    for (int i6 = 0; i6 < i2; i6++) {
                        Object obj = objArr[i6];
                        if (obj != h.f10222a) {
                            if (i6 != i5) {
                                jArr[i5] = jArr[i6];
                                objArr[i5] = obj;
                                objArr[i6] = null;
                            }
                            i5++;
                        }
                    }
                    gVar.f10219a = false;
                    gVar.d = i5;
                }
                if (C0890a.b(gVar.f10220b, gVar.d, itemIdAtPosition) >= 0) {
                    View view2 = (View) gVar.b(itemIdAtPosition);
                    if (view2 != null) {
                        view2.setHasTransientState(false);
                        gVar.d((Object) null, itemIdAtPosition);
                        return;
                    }
                    return;
                }
                view.setHasTransientState(true);
                gVar.d(view, itemIdAtPosition);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [n.e, java.lang.Object, n.j] */
    public static e q() {
        ThreadLocal threadLocal = f11662I;
        e eVar = (e) threadLocal.get();
        if (eVar != null) {
            return eVar;
        }
        ? jVar = new j(0);
        threadLocal.set(jVar);
        return jVar;
    }

    public static boolean v(u uVar, u uVar2, String str) {
        Object obj = uVar.f11694a.get(str);
        Object obj2 = uVar2.f11694a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A() {
        H();
        e q6 = q();
        Iterator it2 = this.f11666D.iterator();
        while (it2.hasNext()) {
            Animator animator = (Animator) it2.next();
            if (q6.containsKey(animator)) {
                H();
                if (animator != null) {
                    animator.addListener(new b0(this, q6));
                    long j6 = this.f11670c;
                    if (j6 >= 0) {
                        animator.setDuration(j6);
                    }
                    long j7 = this.f11669b;
                    if (j7 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j7);
                    }
                    TimeInterpolator timeInterpolator = this.d;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new W((Object) this, 8));
                    animator.start();
                }
            }
        }
        this.f11666D.clear();
        n();
    }

    public void B(long j6) {
        this.f11670c = j6;
    }

    public void D(TimeInterpolator timeInterpolator) {
        this.d = timeInterpolator;
    }

    public void E(v vVar) {
        if (vVar == null) {
            this.f11667E = f11661H;
        } else {
            this.f11667E = vVar;
        }
    }

    public void G(long j6) {
        this.f11669b = j6;
    }

    public final void H() {
        if (this.f11682y == 0) {
            w(this, l.f11655i);
            this.f11663A = false;
        }
        this.f11682y++;
    }

    public String I(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.f11670c != -1) {
            sb.append("dur(");
            sb.append(this.f11670c);
            sb.append(") ");
        }
        if (this.f11669b != -1) {
            sb.append("dly(");
            sb.append(this.f11669b);
            sb.append(") ");
        }
        if (this.d != null) {
            sb.append("interp(");
            sb.append(this.d);
            sb.append(") ");
        }
        ArrayList arrayList = this.f11671e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f11672f;
        if (size > 0 || arrayList2.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(i2));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                    if (i5 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i5));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    public void a(k kVar) {
        if (this.f11665C == null) {
            this.f11665C = new ArrayList();
        }
        this.f11665C.add(kVar);
    }

    public void c() {
        ArrayList arrayList = this.f11680w;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f11681x);
        this.f11681x = F;
        for (int i2 = size - 1; i2 >= 0; i2--) {
            Animator animator = animatorArr[i2];
            animatorArr[i2] = null;
            animator.cancel();
        }
        this.f11681x = animatorArr;
        w(this, l.f11657k);
    }

    public abstract void d(u uVar);

    public final void e(View view, boolean z3) {
        if (view != null) {
            view.getId();
            if (view.getParent() instanceof ViewGroup) {
                u uVar = new u(view);
                if (z3) {
                    g(uVar);
                } else {
                    d(uVar);
                }
                uVar.f11696c.add(this);
                f(uVar);
                if (z3) {
                    b(this.f11673p, view, uVar);
                } else {
                    b(this.f11674q, view, uVar);
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    e(viewGroup.getChildAt(i2), z3);
                }
            }
        }
    }

    public abstract void g(u uVar);

    public final void h(FrameLayout frameLayout, boolean z3) {
        i(z3);
        ArrayList arrayList = this.f11671e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f11672f;
        if (size > 0 || arrayList2.size() > 0) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                View findViewById = frameLayout.findViewById(((Integer) arrayList.get(i2)).intValue());
                if (findViewById != null) {
                    u uVar = new u(findViewById);
                    if (z3) {
                        g(uVar);
                    } else {
                        d(uVar);
                    }
                    uVar.f11696c.add(this);
                    f(uVar);
                    if (z3) {
                        b(this.f11673p, findViewById, uVar);
                    } else {
                        b(this.f11674q, findViewById, uVar);
                    }
                }
            }
            for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                View view = (View) arrayList2.get(i5);
                u uVar2 = new u(view);
                if (z3) {
                    g(uVar2);
                } else {
                    d(uVar2);
                }
                uVar2.f11696c.add(this);
                f(uVar2);
                if (z3) {
                    b(this.f11673p, view, uVar2);
                } else {
                    b(this.f11674q, view, uVar2);
                }
            }
            return;
        }
        e(frameLayout, z3);
    }

    public final void i(boolean z3) {
        if (z3) {
            ((e) this.f11673p.f2711b).clear();
            ((SparseArray) this.f11673p.f2712c).clear();
            ((g) this.f11673p.d).a();
            return;
        }
        ((e) this.f11674q.f2711b).clear();
        ((SparseArray) this.f11674q.f2712c).clear();
        ((g) this.f11674q.d).a();
    }

    /* renamed from: j */
    public m clone() {
        try {
            m mVar = (m) super.clone();
            mVar.f11666D = new ArrayList();
            mVar.f11673p = new z(18);
            mVar.f11674q = new z(18);
            mVar.f11677t = null;
            mVar.f11678u = null;
            mVar.f11664B = this;
            mVar.f11665C = null;
            return mVar;
        } catch (CloneNotSupportedException e6) {
            throw new RuntimeException(e6);
        }
    }

    public Animator l(FrameLayout frameLayout, u uVar, u uVar2) {
        return null;
    }

    /* JADX WARNING: type inference failed for: r3v11, types: [java.lang.Object, t0.j] */
    public void m(FrameLayout frameLayout, z zVar, z zVar2, ArrayList arrayList, ArrayList arrayList2) {
        int i2;
        u uVar;
        View view;
        u uVar2;
        Animator animator;
        e q6 = q();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        p().getClass();
        int i5 = 0;
        while (i5 < size) {
            u uVar3 = (u) arrayList.get(i5);
            u uVar4 = (u) arrayList2.get(i5);
            if (uVar3 != null && !uVar3.f11696c.contains(this)) {
                uVar3 = null;
            }
            if (uVar4 != null && !uVar4.f11696c.contains(this)) {
                uVar4 = null;
            }
            if (!(uVar3 == null && uVar4 == null) && (uVar3 == null || uVar4 == null || t(uVar3, uVar4))) {
                Animator l6 = l(frameLayout, uVar3, uVar4);
                if (l6 != null) {
                    String str = this.f11668a;
                    if (uVar4 != null) {
                        String[] r6 = r();
                        view = uVar4.f11695b;
                        if (r6 != null && r6.length > 0) {
                            uVar2 = new u(view);
                            u uVar5 = (u) ((e) zVar2.f2711b).get(view);
                            i2 = size;
                            if (uVar5 != null) {
                                int i6 = 0;
                                while (i6 < r6.length) {
                                    HashMap hashMap = uVar2.f11694a;
                                    String str2 = r6[i6];
                                    hashMap.put(str2, uVar5.f11694a.get(str2));
                                    i6++;
                                    ArrayList arrayList3 = arrayList;
                                    r6 = r6;
                                }
                            }
                            int i7 = q6.f10226c;
                            int i8 = 0;
                            while (true) {
                                if (i8 >= i7) {
                                    animator = l6;
                                    break;
                                }
                                j jVar = (j) q6.get((Animator) q6.f(i8));
                                if (jVar.f11652c != null && jVar.f11650a == view && jVar.f11651b.equals(str) && jVar.f11652c.equals(uVar2)) {
                                    animator = null;
                                    break;
                                }
                                i8++;
                            }
                        } else {
                            z zVar3 = zVar2;
                            i2 = size;
                            animator = l6;
                            uVar2 = null;
                        }
                        l6 = animator;
                        uVar = uVar2;
                    } else {
                        z zVar4 = zVar2;
                        i2 = size;
                        view = uVar3.f11695b;
                        uVar = null;
                    }
                    if (l6 != null) {
                        WindowId windowId = frameLayout.getWindowId();
                        ? obj = new Object();
                        obj.f11650a = view;
                        obj.f11651b = str;
                        obj.f11652c = uVar;
                        obj.d = windowId;
                        obj.f11653e = this;
                        obj.f11654f = l6;
                        q6.put(l6, obj);
                        this.f11666D.add(l6);
                    }
                    i5++;
                    size = i2;
                }
            } else {
                FrameLayout frameLayout2 = frameLayout;
            }
            z zVar5 = zVar2;
            i2 = size;
            i5++;
            size = i2;
        }
        if (sparseIntArray.size() != 0) {
            for (int i9 = 0; i9 < sparseIntArray.size(); i9++) {
                j jVar2 = (j) q6.get((Animator) this.f11666D.get(sparseIntArray.keyAt(i9)));
                long startDelay = jVar2.f11654f.getStartDelay();
                jVar2.f11654f.setStartDelay(startDelay + (((long) sparseIntArray.valueAt(i9)) - Long.MAX_VALUE));
            }
        }
    }

    public final void n() {
        int i2 = this.f11682y - 1;
        this.f11682y = i2;
        if (i2 == 0) {
            w(this, l.f11656j);
            for (int i5 = 0; i5 < ((g) this.f11673p.d).e(); i5++) {
                View view = (View) ((g) this.f11673p.d).f(i5);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i6 = 0; i6 < ((g) this.f11674q.d).e(); i6++) {
                View view2 = (View) ((g) this.f11674q.d).f(i6);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f11663A = true;
        }
    }

    public final u o(View view, boolean z3) {
        ArrayList arrayList;
        ArrayList arrayList2;
        C0980a aVar = this.f11675r;
        if (aVar != null) {
            return aVar.o(view, z3);
        }
        if (z3) {
            arrayList = this.f11677t;
        } else {
            arrayList = this.f11678u;
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            }
            u uVar = (u) arrayList.get(i2);
            if (uVar == null) {
                return null;
            }
            if (uVar.f11695b == view) {
                break;
            }
            i2++;
        }
        if (i2 < 0) {
            return null;
        }
        if (z3) {
            arrayList2 = this.f11678u;
        } else {
            arrayList2 = this.f11677t;
        }
        return (u) arrayList2.get(i2);
    }

    public final m p() {
        C0980a aVar = this.f11675r;
        if (aVar != null) {
            return aVar.p();
        }
        return this;
    }

    public String[] r() {
        return null;
    }

    public final u s(View view, boolean z3) {
        z zVar;
        C0980a aVar = this.f11675r;
        if (aVar != null) {
            return aVar.s(view, z3);
        }
        if (z3) {
            zVar = this.f11673p;
        } else {
            zVar = this.f11674q;
        }
        return (u) ((e) zVar.f2711b).get(view);
    }

    public boolean t(u uVar, u uVar2) {
        if (uVar == null || uVar2 == null) {
            return false;
        }
        String[] r6 = r();
        if (r6 != null) {
            int length = r6.length;
            int i2 = 0;
            while (i2 < length) {
                if (!v(uVar, uVar2, r6[i2])) {
                    i2++;
                }
            }
            return false;
        }
        for (String v6 : uVar.f11694a.keySet()) {
            if (v(uVar, uVar2, v6)) {
            }
        }
        return false;
        return true;
    }

    public final String toString() {
        return I("");
    }

    public final boolean u(View view) {
        int id = view.getId();
        ArrayList arrayList = this.f11671e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f11672f;
        if ((size != 0 || arrayList2.size() != 0) && !arrayList.contains(Integer.valueOf(id)) && !arrayList2.contains(view)) {
            return false;
        }
        return true;
    }

    public final void w(m mVar, l lVar) {
        m mVar2 = this.f11664B;
        if (mVar2 != null) {
            mVar2.w(mVar, lVar);
        }
        ArrayList arrayList = this.f11665C;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = this.f11665C.size();
            k[] kVarArr = this.f11679v;
            if (kVarArr == null) {
                kVarArr = new k[size];
            }
            this.f11679v = null;
            k[] kVarArr2 = (k[]) this.f11665C.toArray(kVarArr);
            for (int i2 = 0; i2 < size; i2++) {
                lVar.a(kVarArr2[i2], mVar);
                kVarArr2[i2] = null;
            }
            this.f11679v = kVarArr2;
        }
    }

    public void x(ViewGroup viewGroup) {
        if (!this.f11663A) {
            ArrayList arrayList = this.f11680w;
            int size = arrayList.size();
            Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f11681x);
            this.f11681x = F;
            for (int i2 = size - 1; i2 >= 0; i2--) {
                Animator animator = animatorArr[i2];
                animatorArr[i2] = null;
                animator.pause();
            }
            this.f11681x = animatorArr;
            w(this, l.f11658l);
            this.f11683z = true;
        }
    }

    public m y(k kVar) {
        m mVar;
        ArrayList arrayList = this.f11665C;
        if (arrayList == null) {
            return this;
        }
        if (!arrayList.remove(kVar) && (mVar = this.f11664B) != null) {
            mVar.y(kVar);
        }
        if (this.f11665C.size() == 0) {
            this.f11665C = null;
        }
        return this;
    }

    public void z(FrameLayout frameLayout) {
        if (this.f11683z) {
            if (!this.f11663A) {
                ArrayList arrayList = this.f11680w;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f11681x);
                this.f11681x = F;
                for (int i2 = size - 1; i2 >= 0; i2--) {
                    Animator animator = animatorArr[i2];
                    animatorArr[i2] = null;
                    animator.resume();
                }
                this.f11681x = animatorArr;
                w(this, l.f11659m);
            }
            this.f11683z = false;
        }
    }

    public void F() {
    }

    public void C(a aVar) {
    }

    public void f(u uVar) {
    }
}
