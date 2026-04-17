package t0;

import android.widget.FrameLayout;
import com.mtma.criminal.city.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import n.e;
import n.j;

public abstract class q {

    /* renamed from: a  reason: collision with root package name */
    public static final C0980a f11688a;

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadLocal f11689b = new ThreadLocal();

    /* renamed from: c  reason: collision with root package name */
    public static final ArrayList f11690c = new ArrayList();

    /* JADX WARNING: type inference failed for: r0v0, types: [t0.a, t0.m] */
    static {
        ? mVar = new m();
        mVar.f11627J = new ArrayList();
        mVar.f11630M = false;
        mVar.f11631N = 0;
        mVar.f11628K = false;
        mVar.J(new h(2));
        mVar.J(new m());
        mVar.J(new h(1));
        f11688a = mVar;
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [android.view.ViewTreeObserver$OnPreDrawListener, java.lang.Object, android.view.View$OnAttachStateChangeListener, t0.p] */
    public static void a(FrameLayout frameLayout, m mVar) {
        ArrayList arrayList = f11690c;
        if (!arrayList.contains(frameLayout) && frameLayout.isLaidOut()) {
            arrayList.add(frameLayout);
            if (mVar == null) {
                mVar = f11688a;
            }
            m j6 = mVar.clone();
            ArrayList arrayList2 = (ArrayList) b().get(frameLayout);
            if (arrayList2 != null && arrayList2.size() > 0) {
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ((m) it2.next()).x(frameLayout);
                }
            }
            j6.h(frameLayout, true);
            if (frameLayout.getTag(R.id.transition_current_scene) == null) {
                frameLayout.setTag(R.id.transition_current_scene, (Object) null);
                ? obj = new Object();
                obj.f11686a = j6;
                obj.f11687b = frameLayout;
                frameLayout.addOnAttachStateChangeListener(obj);
                frameLayout.getViewTreeObserver().addOnPreDrawListener(obj);
                return;
            }
            throw new ClassCastException();
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [n.e, java.lang.Object, n.j] */
    public static e b() {
        e eVar;
        ThreadLocal threadLocal = f11689b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (eVar = (e) weakReference.get()) != null) {
            return eVar;
        }
        ? jVar = new j(0);
        threadLocal.set(new WeakReference(jVar));
        return jVar;
    }
}
