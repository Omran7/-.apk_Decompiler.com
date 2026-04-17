package K;

import L.e;
import L.t;
import Q.r;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.mtma.criminal.city.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k.C0744w;

public abstract class O {

    /* renamed from: a  reason: collision with root package name */
    public static WeakHashMap f1352a = null;

    /* renamed from: b  reason: collision with root package name */
    public static Field f1353b = null;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f1354c = false;
    public static final int[] d = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* renamed from: e  reason: collision with root package name */
    public static final C0083x f1355e = new Object();

    /* renamed from: f  reason: collision with root package name */
    public static final C0085z f1356f = new C0085z();

    public static X a(View view) {
        if (f1352a == null) {
            f1352a = new WeakHashMap();
        }
        X x6 = (X) f1352a.get(view);
        if (x6 != null) {
            return x6;
        }
        X x7 = new X(view);
        f1352a.put(view, x7);
        return x7;
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [java.lang.Object, K.N] */
    public static boolean b(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = N.d;
        N n2 = (N) view.getTag(R.id.tag_unhandled_key_event_manager);
        N n6 = n2;
        if (n2 == null) {
            ? obj = new Object();
            obj.f1349a = null;
            obj.f1350b = null;
            obj.f1351c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, obj);
            n6 = obj;
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = n6.f1349a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = N.d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (n6.f1349a == null) {
                            n6.f1349a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = N.d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                n6.f1349a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    n6.f1349a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View a6 = n6.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a6 != null && !KeyEvent.isModifierKey(keyCode)) {
                if (n6.f1350b == null) {
                    n6.f1350b = new SparseArray();
                }
                n6.f1350b.put(keyCode, new WeakReference(a6));
            }
        }
        if (a6 != null) {
            return true;
        }
        return false;
    }

    public static View.AccessibilityDelegate c(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return I.a(view);
        }
        if (f1354c) {
            return null;
        }
        if (f1353b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f1353b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f1354c = true;
                return null;
            }
        }
        try {
            Object obj = f1353b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f1354c = true;
            return null;
        }
    }

    public static CharSequence d(View view) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            obj = H.b(view);
        } else {
            obj = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(obj)) {
                obj = null;
            }
        }
        return (CharSequence) obj;
    }

    public static ArrayList e(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static String[] f(C0744w wVar) {
        if (Build.VERSION.SDK_INT >= 31) {
            return K.a(wVar);
        }
        return (String[]) wVar.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void g(View view, int i2) {
        boolean z3;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            if (d(view) == null || !view.isShown() || view.getWindowVisibility() != 0) {
                z3 = false;
            } else {
                z3 = true;
            }
            int i5 = 32;
            if (view.getAccessibilityLiveRegion() != 0 || z3) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                if (!z3) {
                    i5 = 2048;
                }
                obtain.setEventType(i5);
                obtain.setContentChangeTypes(i2);
                if (z3) {
                    obtain.getText().add(d(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (i2 == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                obtain2.setContentChangeTypes(i2);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(d(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
            } else if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i2);
                } catch (AbstractMethodError e6) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e6);
                }
            }
        }
    }

    public static C0066f h(View view, C0066f fVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + fVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return K.b(view, fVar);
        }
        C0077q qVar = (C0077q) view.getTag(R.id.tag_on_receive_content_listener);
        r rVar = f1355e;
        if (qVar != null) {
            C0066f a6 = ((r) qVar).a(view, fVar);
            if (a6 == null) {
                return null;
            }
            if (view instanceof r) {
                rVar = (r) view;
            }
            return rVar.a(a6);
        }
        if (view instanceof r) {
            rVar = (r) view;
        }
        return rVar.a(fVar);
    }

    public static void i(View view, int i2) {
        ArrayList e6 = e(view);
        for (int i5 = 0; i5 < e6.size(); i5++) {
            if (((e) e6.get(i5)).a() == i2) {
                e6.remove(i5);
                return;
            }
        }
    }

    public static void j(View view, e eVar, t tVar) {
        C0062b bVar;
        e eVar2 = new e((Object) null, eVar.f1698b, (String) null, tVar, eVar.f1699c);
        View.AccessibilityDelegate c3 = c(view);
        if (c3 == null) {
            bVar = null;
        } else if (c3 instanceof C0061a) {
            bVar = ((C0061a) c3).f1363a;
        } else {
            bVar = new C0062b(c3);
        }
        if (bVar == null) {
            bVar = new C0062b();
        }
        l(view, bVar);
        i(view, eVar2.a());
        e(view).add(eVar2);
        g(view, 0);
    }

    public static void k(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            I.d(view, context, iArr, attributeSet, typedArray, i2, 0);
        }
    }

    public static void l(View view, C0062b bVar) {
        C0061a aVar;
        if (bVar == null && (c(view) instanceof C0061a)) {
            bVar = new C0062b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        if (bVar == null) {
            aVar = null;
        } else {
            aVar = bVar.f1370b;
        }
        view.setAccessibilityDelegate(aVar);
    }

    public static void m(View view, CharSequence charSequence) {
        boolean z3;
        new C0084y(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).d(view, charSequence);
        C0085z zVar = f1356f;
        if (charSequence != null) {
            WeakHashMap weakHashMap = zVar.f1441a;
            if (!view.isShown() || view.getWindowVisibility() != 0) {
                z3 = false;
            } else {
                z3 = true;
            }
            weakHashMap.put(view, Boolean.valueOf(z3));
            view.addOnAttachStateChangeListener(zVar);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(zVar);
                return;
            }
            return;
        }
        zVar.f1441a.remove(view);
        view.removeOnAttachStateChangeListener(zVar);
        view.getViewTreeObserver().removeOnGlobalLayoutListener(zVar);
    }
}
