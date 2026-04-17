package f;

import K.B;
import K.O;
import K.X;
import S3.z;
import X4.d;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewStubCompat;
import com.mtma.criminal.city.R;
import i.C0571a;
import i.C0573c;
import i.l;
import i.m;
import j.k;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

public final class v implements Window.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final Window.Callback f7803a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f7804b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f7805c;
    public boolean d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ z f7806e;

    public v(z zVar, Window.Callback callback) {
        this.f7806e = zVar;
        if (callback != null) {
            this.f7803a = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    /* JADX INFO: finally extract failed */
    public final void a(Window.Callback callback) {
        try {
            this.f7804b = true;
            callback.onContentChanged();
            this.f7804b = false;
        } catch (Throwable th) {
            this.f7804b = false;
            throw th;
        }
    }

    public final boolean b(int i2, Menu menu) {
        return this.f7803a.onMenuOpened(i2, menu);
    }

    public final void c(int i2, Menu menu) {
        this.f7803a.onPanelClosed(i2, menu);
    }

    public final void d(List list, Menu menu, int i2) {
        l.a(this.f7803a, list, menu, i2);
    }

    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f7803a.dispatchGenericMotionEvent(motionEvent);
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z3 = this.f7805c;
        Window.Callback callback = this.f7803a;
        if (z3) {
            return callback.dispatchKeyEvent(keyEvent);
        }
        if (this.f7806e.t(keyEvent) || callback.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
        if (r0 != false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0067, code lost:
        if (r7 != false) goto L_0x003b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchKeyShortcutEvent(android.view.KeyEvent r7) {
        /*
            r6 = this;
            android.view.Window$Callback r0 = r6.f7803a
            boolean r0 = r0.dispatchKeyShortcutEvent(r7)
            r1 = 1
            if (r0 != 0) goto L_0x006f
            int r0 = r7.getKeyCode()
            f.z r2 = r6.f7806e
            r2.z()
            f.J r3 = r2.f7871x
            r4 = 0
            if (r3 == 0) goto L_0x003d
            f.I r3 = r3.f7744x
            if (r3 != 0) goto L_0x001d
        L_0x001b:
            r0 = r4
            goto L_0x0039
        L_0x001d:
            j.k r3 = r3.d
            if (r3 == 0) goto L_0x001b
            int r5 = r7.getDeviceId()
            android.view.KeyCharacterMap r5 = android.view.KeyCharacterMap.load(r5)
            int r5 = r5.getKeyboardType()
            if (r5 == r1) goto L_0x0031
            r5 = r1
            goto L_0x0032
        L_0x0031:
            r5 = r4
        L_0x0032:
            r3.setQwertyMode(r5)
            boolean r0 = r3.performShortcut(r0, r7, r4)
        L_0x0039:
            if (r0 == 0) goto L_0x003d
        L_0x003b:
            r7 = r1
            goto L_0x006b
        L_0x003d:
            f.y r0 = r2.f7845V
            if (r0 == 0) goto L_0x0052
            int r3 = r7.getKeyCode()
            boolean r0 = r2.E(r0, r3, r7)
            if (r0 == 0) goto L_0x0052
            f.y r7 = r2.f7845V
            if (r7 == 0) goto L_0x003b
            r7.f7818l = r1
            goto L_0x003b
        L_0x0052:
            f.y r0 = r2.f7845V
            if (r0 != 0) goto L_0x006a
            f.y r0 = r2.y(r4)
            r2.F(r0, r7)
            int r3 = r7.getKeyCode()
            boolean r7 = r2.E(r0, r3, r7)
            r0.f7817k = r4
            if (r7 == 0) goto L_0x006a
            goto L_0x003b
        L_0x006a:
            r7 = r4
        L_0x006b:
            if (r7 == 0) goto L_0x006e
            goto L_0x006f
        L_0x006e:
            r1 = r4
        L_0x006f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: f.v.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f7803a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f7803a.dispatchTouchEvent(motionEvent);
    }

    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f7803a.dispatchTrackballEvent(motionEvent);
    }

    public final void onActionModeFinished(ActionMode actionMode) {
        this.f7803a.onActionModeFinished(actionMode);
    }

    public final void onActionModeStarted(ActionMode actionMode) {
        this.f7803a.onActionModeStarted(actionMode);
    }

    public final void onAttachedToWindow() {
        this.f7803a.onAttachedToWindow();
    }

    public final void onContentChanged() {
        if (this.f7804b) {
            this.f7803a.onContentChanged();
        }
    }

    public final boolean onCreatePanelMenu(int i2, Menu menu) {
        if (i2 != 0 || (menu instanceof k)) {
            return this.f7803a.onCreatePanelMenu(i2, menu);
        }
        return false;
    }

    public final View onCreatePanelView(int i2) {
        return this.f7803a.onCreatePanelView(i2);
    }

    public final void onDetachedFromWindow() {
        this.f7803a.onDetachedFromWindow();
    }

    public final boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        return this.f7803a.onMenuItemSelected(i2, menuItem);
    }

    public final boolean onMenuOpened(int i2, Menu menu) {
        b(i2, menu);
        z zVar = this.f7806e;
        if (i2 == 108) {
            zVar.z();
            J j6 = zVar.f7871x;
            if (!(j6 == null || true == j6.f7724A)) {
                j6.f7724A = true;
                ArrayList arrayList = j6.f7725B;
                if (arrayList.size() > 0) {
                    arrayList.get(0).getClass();
                    throw new ClassCastException();
                }
            }
        } else {
            zVar.getClass();
        }
        return true;
    }

    public final void onPanelClosed(int i2, Menu menu) {
        if (this.d) {
            this.f7803a.onPanelClosed(i2, menu);
            return;
        }
        c(i2, menu);
        z zVar = this.f7806e;
        if (i2 == 108) {
            zVar.z();
            J j6 = zVar.f7871x;
            if (j6 != null && j6.f7724A) {
                j6.f7724A = false;
                ArrayList arrayList = j6.f7725B;
                if (arrayList.size() > 0) {
                    arrayList.get(0).getClass();
                    throw new ClassCastException();
                }
            }
        } else if (i2 == 0) {
            y y6 = zVar.y(i2);
            if (y6.f7819m) {
                zVar.p(y6, false);
            }
        } else {
            zVar.getClass();
        }
    }

    public final void onPointerCaptureChanged(boolean z3) {
        m.a(this.f7803a, z3);
    }

    public final boolean onPreparePanel(int i2, View view, Menu menu) {
        k kVar;
        if (menu instanceof k) {
            kVar = (k) menu;
        } else {
            kVar = null;
        }
        if (i2 == 0 && kVar == null) {
            return false;
        }
        if (kVar != null) {
            kVar.f8725G = true;
        }
        boolean onPreparePanel = this.f7803a.onPreparePanel(i2, view, menu);
        if (kVar != null) {
            kVar.f8725G = false;
        }
        return onPreparePanel;
    }

    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i2) {
        k kVar = this.f7806e.y(0).h;
        if (kVar != null) {
            d(list, kVar, i2);
        } else {
            d(list, menu, i2);
        }
    }

    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return i.k.a(this.f7803a, searchEvent);
    }

    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f7803a.onWindowAttributesChanged(layoutParams);
    }

    public final void onWindowFocusChanged(boolean z3) {
        this.f7803a.onWindowFocusChanged(z3);
    }

    /* JADX WARNING: type inference failed for: r2v10, types: [j.i, java.lang.Object, i.a, i.d] */
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i2) {
        ViewGroup viewGroup;
        z zVar = this.f7806e;
        zVar.getClass();
        if (i2 != 0) {
            return i.k.b(this.f7803a, callback, i2);
        }
        z zVar2 = new z(zVar.f7867t, callback);
        C0571a aVar = zVar.f7828D;
        if (aVar != null) {
            aVar.a();
        }
        d dVar = new d(zVar, zVar2, 17);
        zVar.z();
        J j6 = zVar.f7871x;
        if (j6 != null) {
            I i5 = j6.f7744x;
            if (i5 != null) {
                i5.a();
            }
            j6.f7738r.setHideOnContentScrollEnabled(false);
            j6.f7741u.e();
            I i6 = new I(j6, j6.f7741u.getContext(), dVar);
            k kVar = i6.d;
            kVar.w();
            try {
                if (((z) i6.f7719e.f4209b).E(i6, kVar)) {
                    j6.f7744x = i6;
                    i6.g();
                    j6.f7741u.c(i6);
                    j6.S0(true);
                } else {
                    i6 = null;
                }
                zVar.f7828D = i6;
            } finally {
                kVar.v();
            }
        }
        if (zVar.f7828D == null) {
            X x6 = zVar.f7831H;
            if (x6 != null) {
                x6.b();
            }
            C0571a aVar2 = zVar.f7828D;
            if (aVar2 != null) {
                aVar2.a();
            }
            if (zVar.f7829E == null) {
                boolean z3 = zVar.f7841R;
                Context context = zVar.f7867t;
                if (z3) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme newTheme = context.getResources().newTheme();
                        newTheme.setTo(theme);
                        newTheme.applyStyle(typedValue.resourceId, true);
                        C0573c cVar = new C0573c(context, 0);
                        cVar.getTheme().setTo(newTheme);
                        context = cVar;
                    }
                    zVar.f7829E = new ActionBarContextView(context, (AttributeSet) null);
                    PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    zVar.F = popupWindow;
                    Q.l.d(popupWindow, 2);
                    zVar.F.setContentView(zVar.f7829E);
                    zVar.F.setWidth(-1);
                    context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    zVar.f7829E.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    zVar.F.setHeight(-2);
                    zVar.f7830G = new o(zVar, 1);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) zVar.f7833J.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        zVar.z();
                        J j7 = zVar.f7871x;
                        Context T02 = j7 != null ? j7.T0() : null;
                        if (T02 != null) {
                            context = T02;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                        zVar.f7829E = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (zVar.f7829E != null) {
                X x7 = zVar.f7831H;
                if (x7 != null) {
                    x7.b();
                }
                zVar.f7829E.e();
                Context context2 = zVar.f7829E.getContext();
                ActionBarContextView actionBarContextView = zVar.f7829E;
                ? obj = new Object();
                obj.f8186c = context2;
                obj.d = actionBarContextView;
                obj.f8187e = dVar;
                k kVar2 = new k(actionBarContextView.getContext());
                kVar2.f8736u = 1;
                obj.f8190q = kVar2;
                kVar2.f8729e = obj;
                if (((z) dVar.f4209b).E(obj, kVar2)) {
                    obj.g();
                    zVar.f7829E.c(obj);
                    zVar.f7828D = obj;
                    if (zVar.f7832I && (viewGroup = zVar.f7833J) != null && viewGroup.isLaidOut()) {
                        zVar.f7829E.setAlpha(0.0f);
                        X a6 = O.a(zVar.f7829E);
                        a6.a(1.0f);
                        zVar.f7831H = a6;
                        a6.d(new r(zVar, 1));
                    } else {
                        zVar.f7829E.setAlpha(1.0f);
                        zVar.f7829E.setVisibility(0);
                        if (zVar.f7829E.getParent() instanceof View) {
                            WeakHashMap weakHashMap = O.f1352a;
                            B.c((View) zVar.f7829E.getParent());
                        }
                    }
                    if (zVar.F != null) {
                        zVar.f7868u.getDecorView().post(zVar.f7830G);
                    }
                } else {
                    zVar.f7828D = null;
                }
            }
            zVar.H();
            zVar.f7828D = zVar.f7828D;
        }
        zVar.H();
        C0571a aVar3 = zVar.f7828D;
        if (aVar3 != null) {
            return zVar2.s(aVar3);
        }
        return null;
    }

    public final boolean onSearchRequested() {
        return this.f7803a.onSearchRequested();
    }

    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
