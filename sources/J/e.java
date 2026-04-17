package j;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.transition.Transition;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.fragment.app.N;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.fragments.gangBase.I;
import java.util.ArrayList;
import java.util.Iterator;
import k.C0661F0;
import k.C0667I0;
import k.C0739t0;

public final class e extends s implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: A  reason: collision with root package name */
    public boolean f8684A;

    /* renamed from: B  reason: collision with root package name */
    public int f8685B;

    /* renamed from: C  reason: collision with root package name */
    public int f8686C;

    /* renamed from: D  reason: collision with root package name */
    public boolean f8687D;

    /* renamed from: E  reason: collision with root package name */
    public boolean f8688E;
    public v F;

    /* renamed from: G  reason: collision with root package name */
    public ViewTreeObserver f8689G;

    /* renamed from: H  reason: collision with root package name */
    public t f8690H;

    /* renamed from: I  reason: collision with root package name */
    public boolean f8691I;

    /* renamed from: b  reason: collision with root package name */
    public final Context f8692b;

    /* renamed from: c  reason: collision with root package name */
    public final int f8693c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f8694e;

    /* renamed from: f  reason: collision with root package name */
    public final Handler f8695f;

    /* renamed from: p  reason: collision with root package name */
    public final ArrayList f8696p = new ArrayList();

    /* renamed from: q  reason: collision with root package name */
    public final ArrayList f8697q = new ArrayList();

    /* renamed from: r  reason: collision with root package name */
    public final K4.e f8698r = new K4.e(this, 5);

    /* renamed from: s  reason: collision with root package name */
    public final N f8699s = new N(this, 1);

    /* renamed from: t  reason: collision with root package name */
    public final I f8700t = new I(this, 24);

    /* renamed from: u  reason: collision with root package name */
    public int f8701u;

    /* renamed from: v  reason: collision with root package name */
    public int f8702v;

    /* renamed from: w  reason: collision with root package name */
    public View f8703w;

    /* renamed from: x  reason: collision with root package name */
    public View f8704x;

    /* renamed from: y  reason: collision with root package name */
    public int f8705y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f8706z;

    public e(Context context, View view, int i2, boolean z3) {
        int i5 = 0;
        this.f8701u = 0;
        this.f8702v = 0;
        this.f8692b = context;
        this.f8703w = view;
        this.d = i2;
        this.f8694e = z3;
        this.f8687D = false;
        this.f8705y = view.getLayoutDirection() != 1 ? 1 : i5;
        Resources resources = context.getResources();
        this.f8693c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f8695f = new Handler();
    }

    public final void a(k kVar, boolean z3) {
        int i2;
        ArrayList arrayList = this.f8697q;
        int size = arrayList.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                i5 = -1;
                break;
            } else if (kVar == ((d) arrayList.get(i5)).f8682b) {
                break;
            } else {
                i5++;
            }
        }
        if (i5 >= 0) {
            int i6 = i5 + 1;
            if (i6 < arrayList.size()) {
                ((d) arrayList.get(i6)).f8682b.c(false);
            }
            d dVar = (d) arrayList.remove(i5);
            dVar.f8682b.r(this);
            boolean z4 = this.f8691I;
            C0667I0 i02 = dVar.f8681a;
            if (z4) {
                C0661F0.b(i02.f9161I, (Transition) null);
                i02.f9161I.setAnimationStyle(0);
            }
            i02.dismiss();
            int size2 = arrayList.size();
            if (size2 > 0) {
                this.f8705y = ((d) arrayList.get(size2 - 1)).f8683c;
            } else {
                if (this.f8703w.getLayoutDirection() == 1) {
                    i2 = 0;
                } else {
                    i2 = 1;
                }
                this.f8705y = i2;
            }
            if (size2 == 0) {
                dismiss();
                v vVar = this.F;
                if (vVar != null) {
                    vVar.a(kVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.f8689G;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.f8689G.removeGlobalOnLayoutListener(this.f8698r);
                    }
                    this.f8689G = null;
                }
                this.f8704x.removeOnAttachStateChangeListener(this.f8699s);
                this.f8690H.onDismiss();
            } else if (z3) {
                ((d) arrayList.get(0)).f8682b.c(false);
            }
        }
    }

    public final boolean b() {
        ArrayList arrayList = this.f8697q;
        if (arrayList.size() <= 0 || !((d) arrayList.get(0)).f8681a.f9161I.isShowing()) {
            return false;
        }
        return true;
    }

    public final void c() {
        boolean z3;
        if (!b()) {
            ArrayList arrayList = this.f8696p;
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                v((k) it2.next());
            }
            arrayList.clear();
            View view = this.f8703w;
            this.f8704x = view;
            if (view != null) {
                if (this.f8689G == null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.f8689G = viewTreeObserver;
                if (z3) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f8698r);
                }
                this.f8704x.addOnAttachStateChangeListener(this.f8699s);
            }
        }
    }

    public final void dismiss() {
        ArrayList arrayList = this.f8697q;
        int size = arrayList.size();
        if (size > 0) {
            d[] dVarArr = (d[]) arrayList.toArray(new d[size]);
            for (int i2 = size - 1; i2 >= 0; i2--) {
                d dVar = dVarArr[i2];
                if (dVar.f8681a.f9161I.isShowing()) {
                    dVar.f8681a.dismiss();
                }
            }
        }
    }

    public final void e() {
        Iterator it2 = this.f8697q.iterator();
        while (it2.hasNext()) {
            ListAdapter adapter = ((d) it2.next()).f8681a.f9164c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((h) adapter).notifyDataSetChanged();
        }
    }

    public final C0739t0 f() {
        ArrayList arrayList = this.f8697q;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((d) arrayList.get(arrayList.size() - 1)).f8681a.f9164c;
    }

    public final boolean h() {
        return false;
    }

    public final void j(v vVar) {
        this.F = vVar;
    }

    public final boolean k(C0600C c3) {
        Iterator it2 = this.f8697q.iterator();
        while (it2.hasNext()) {
            d dVar = (d) it2.next();
            if (c3 == dVar.f8682b) {
                dVar.f8681a.f9164c.requestFocus();
                return true;
            }
        }
        if (!c3.hasVisibleItems()) {
            return false;
        }
        l(c3);
        v vVar = this.F;
        if (vVar != null) {
            vVar.p(c3);
        }
        return true;
    }

    public final void l(k kVar) {
        kVar.b(this, this.f8692b);
        if (b()) {
            v(kVar);
        } else {
            this.f8696p.add(kVar);
        }
    }

    public final void n(View view) {
        if (this.f8703w != view) {
            this.f8703w = view;
            this.f8702v = Gravity.getAbsoluteGravity(this.f8701u, view.getLayoutDirection());
        }
    }

    public final void o(boolean z3) {
        this.f8687D = z3;
    }

    public final void onDismiss() {
        d dVar;
        ArrayList arrayList = this.f8697q;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                dVar = null;
                break;
            }
            dVar = (d) arrayList.get(i2);
            if (!dVar.f8681a.f9161I.isShowing()) {
                break;
            }
            i2++;
        }
        if (dVar != null) {
            dVar.f8682b.c(false);
        }
    }

    public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    public final void p(int i2) {
        if (this.f8701u != i2) {
            this.f8701u = i2;
            this.f8702v = Gravity.getAbsoluteGravity(i2, this.f8703w.getLayoutDirection());
        }
    }

    public final void q(int i2) {
        this.f8706z = true;
        this.f8685B = i2;
    }

    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f8690H = (t) onDismissListener;
    }

    public final void s(boolean z3) {
        this.f8688E = z3;
    }

    public final void t(int i2) {
        this.f8684A = true;
        this.f8686C = i2;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [k.I0, k.D0] */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x013f, code lost:
        if (((r8.getWidth() + r11[0]) + r5) > r9.right) goto L_0x0141;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0144, code lost:
        r8 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0149, code lost:
        if ((r11[0] - r5) < 0) goto L_0x0144;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01ec  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void v(j.k r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            android.content.Context r2 = r0.f8692b
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r2)
            j.h r4 = new j.h
            boolean r5 = r0.f8694e
            r6 = 2131492875(0x7f0c000b, float:1.8609214E38)
            r4.<init>(r1, r3, r5, r6)
            boolean r5 = r16.b()
            r6 = 1
            if (r5 != 0) goto L_0x0022
            boolean r5 = r0.f8687D
            if (r5 == 0) goto L_0x0022
            r4.f8716c = r6
            goto L_0x002e
        L_0x0022:
            boolean r5 = r16.b()
            if (r5 == 0) goto L_0x002e
            boolean r5 = j.s.u(r17)
            r4.f8716c = r5
        L_0x002e:
            int r5 = r0.f8693c
            int r5 = j.s.m(r4, r2, r5)
            k.I0 r7 = new k.I0
            int r8 = r0.d
            r9 = 0
            r7.<init>(r2, r9, r8)
            com.mtma.criminal.city.fragments.gangBase.I r2 = r0.f8700t
            r7.f9191L = r2
            r7.f9176y = r0
            k.B r2 = r7.f9161I
            r2.setOnDismissListener(r0)
            android.view.View r2 = r0.f8703w
            r7.f9175x = r2
            int r2 = r0.f8702v
            r7.f9172u = r2
            r7.f9160H = r6
            k.B r2 = r7.f9161I
            r2.setFocusable(r6)
            k.B r2 = r7.f9161I
            r8 = 2
            r2.setInputMethodMode(r8)
            r7.p(r4)
            r7.r(r5)
            int r2 = r0.f8702v
            r7.f9172u = r2
            java.util.ArrayList r2 = r0.f8697q
            int r4 = r2.size()
            r10 = 0
            if (r4 <= 0) goto L_0x00e5
            int r4 = r2.size()
            int r4 = r4 - r6
            java.lang.Object r4 = r2.get(r4)
            j.d r4 = (j.d) r4
            j.k r11 = r4.f8682b
            java.util.ArrayList r12 = r11.f8730f
            int r12 = r12.size()
            r13 = r10
        L_0x0083:
            if (r13 >= r12) goto L_0x0099
            android.view.MenuItem r14 = r11.getItem(r13)
            boolean r15 = r14.hasSubMenu()
            if (r15 == 0) goto L_0x0096
            android.view.SubMenu r15 = r14.getSubMenu()
            if (r1 != r15) goto L_0x0096
            goto L_0x009a
        L_0x0096:
            int r13 = r13 + 1
            goto L_0x0083
        L_0x0099:
            r14 = r9
        L_0x009a:
            if (r14 != 0) goto L_0x009e
            r6 = r9
            goto L_0x00e7
        L_0x009e:
            k.I0 r11 = r4.f8681a
            k.t0 r11 = r11.f9164c
            android.widget.ListAdapter r12 = r11.getAdapter()
            boolean r13 = r12 instanceof android.widget.HeaderViewListAdapter
            if (r13 == 0) goto L_0x00b7
            android.widget.HeaderViewListAdapter r12 = (android.widget.HeaderViewListAdapter) r12
            int r13 = r12.getHeadersCount()
            android.widget.ListAdapter r12 = r12.getWrappedAdapter()
            j.h r12 = (j.h) r12
            goto L_0x00ba
        L_0x00b7:
            j.h r12 = (j.h) r12
            r13 = r10
        L_0x00ba:
            int r15 = r12.getCount()
            r8 = r10
        L_0x00bf:
            r6 = -1
            if (r8 >= r15) goto L_0x00cd
            j.m r9 = r12.getItem(r8)
            if (r14 != r9) goto L_0x00c9
            goto L_0x00ce
        L_0x00c9:
            int r8 = r8 + 1
            r9 = 0
            goto L_0x00bf
        L_0x00cd:
            r8 = r6
        L_0x00ce:
            if (r8 != r6) goto L_0x00d1
            goto L_0x00e6
        L_0x00d1:
            int r8 = r8 + r13
            int r6 = r11.getFirstVisiblePosition()
            int r8 = r8 - r6
            if (r8 < 0) goto L_0x00e6
            int r6 = r11.getChildCount()
            if (r8 < r6) goto L_0x00e0
            goto L_0x00e6
        L_0x00e0:
            android.view.View r6 = r11.getChildAt(r8)
            goto L_0x00e7
        L_0x00e5:
            r4 = 0
        L_0x00e6:
            r6 = 0
        L_0x00e7:
            if (r6 == 0) goto L_0x01b2
            int r8 = android.os.Build.VERSION.SDK_INT
            k.B r9 = r7.f9161I
            r11 = 28
            if (r8 > r11) goto L_0x0107
            java.lang.reflect.Method r8 = k.C0667I0.f9190M
            if (r8 == 0) goto L_0x010a
            java.lang.Boolean r11 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x00ff }
            java.lang.Object[] r11 = new java.lang.Object[]{r11}     // Catch:{ Exception -> 0x00ff }
            r8.invoke(r9, r11)     // Catch:{ Exception -> 0x00ff }
            goto L_0x010a
        L_0x00ff:
            java.lang.String r8 = "MenuPopupWindow"
            java.lang.String r9 = "Could not invoke setTouchModal() on PopupWindow. Oh well."
            android.util.Log.i(r8, r9)
            goto L_0x010a
        L_0x0107:
            k.C0663G0.a(r9, r10)
        L_0x010a:
            k.B r8 = r7.f9161I
            r9 = 0
            k.C0661F0.a(r8, r9)
            int r8 = r2.size()
            r9 = 1
            int r8 = r8 - r9
            java.lang.Object r8 = r2.get(r8)
            j.d r8 = (j.d) r8
            k.I0 r8 = r8.f8681a
            k.t0 r8 = r8.f9164c
            r9 = 2
            int[] r11 = new int[r9]
            r8.getLocationOnScreen(r11)
            android.graphics.Rect r9 = new android.graphics.Rect
            r9.<init>()
            android.view.View r12 = r0.f8704x
            r12.getWindowVisibleDisplayFrame(r9)
            int r12 = r0.f8705y
            r13 = 1
            if (r12 != r13) goto L_0x0146
            r11 = r11[r10]
            int r8 = r8.getWidth()
            int r8 = r8 + r11
            int r8 = r8 + r5
            int r9 = r9.right
            if (r8 <= r9) goto L_0x0144
        L_0x0141:
            r8 = r10
        L_0x0142:
            r9 = 1
            goto L_0x014c
        L_0x0144:
            r8 = 1
            goto L_0x0142
        L_0x0146:
            r8 = r11[r10]
            int r8 = r8 - r5
            if (r8 >= 0) goto L_0x0141
            goto L_0x0144
        L_0x014c:
            if (r8 != r9) goto L_0x0150
            r9 = 1
            goto L_0x0151
        L_0x0150:
            r9 = r10
        L_0x0151:
            r0.f8705y = r8
            int r8 = android.os.Build.VERSION.SDK_INT
            r11 = 26
            r12 = 5
            if (r8 < r11) goto L_0x015f
            r7.f9175x = r6
            r8 = r10
            r13 = r8
            goto L_0x0191
        L_0x015f:
            r8 = 2
            int[] r11 = new int[r8]
            android.view.View r13 = r0.f8703w
            r13.getLocationOnScreen(r11)
            int[] r8 = new int[r8]
            r6.getLocationOnScreen(r8)
            int r13 = r0.f8702v
            r13 = r13 & 7
            if (r13 != r12) goto L_0x0186
            r13 = r11[r10]
            android.view.View r14 = r0.f8703w
            int r14 = r14.getWidth()
            int r14 = r14 + r13
            r11[r10] = r14
            r13 = r8[r10]
            int r14 = r6.getWidth()
            int r14 = r14 + r13
            r8[r10] = r14
        L_0x0186:
            r13 = r8[r10]
            r14 = r11[r10]
            int r13 = r13 - r14
            r14 = 1
            r8 = r8[r14]
            r11 = r11[r14]
            int r8 = r8 - r11
        L_0x0191:
            int r11 = r0.f8702v
            r11 = r11 & r12
            if (r11 != r12) goto L_0x01a0
            if (r9 == 0) goto L_0x019a
            int r13 = r13 + r5
            goto L_0x01a7
        L_0x019a:
            int r5 = r6.getWidth()
        L_0x019e:
            int r13 = r13 - r5
            goto L_0x01a7
        L_0x01a0:
            if (r9 == 0) goto L_0x019e
            int r5 = r6.getWidth()
            int r13 = r13 + r5
        L_0x01a7:
            r7.f9166f = r13
            r5 = 1
            r7.f9171t = r5
            r7.f9170s = r5
            r7.i(r8)
            goto L_0x01d0
        L_0x01b2:
            boolean r5 = r0.f8706z
            if (r5 == 0) goto L_0x01ba
            int r5 = r0.f8685B
            r7.f9166f = r5
        L_0x01ba:
            boolean r5 = r0.f8684A
            if (r5 == 0) goto L_0x01c3
            int r5 = r0.f8686C
            r7.i(r5)
        L_0x01c3:
            android.graphics.Rect r5 = r0.f8781a
            if (r5 == 0) goto L_0x01cd
            android.graphics.Rect r9 = new android.graphics.Rect
            r9.<init>(r5)
            goto L_0x01ce
        L_0x01cd:
            r9 = 0
        L_0x01ce:
            r7.f9159G = r9
        L_0x01d0:
            j.d r5 = new j.d
            int r6 = r0.f8705y
            r5.<init>(r7, r1, r6)
            r2.add(r5)
            r7.c()
            k.t0 r2 = r7.f9164c
            r2.setOnKeyListener(r0)
            if (r4 != 0) goto L_0x020d
            boolean r4 = r0.f8688E
            if (r4 == 0) goto L_0x020d
            java.lang.CharSequence r4 = r1.f8737v
            if (r4 == 0) goto L_0x020d
            r4 = 2131492882(0x7f0c0012, float:1.8609228E38)
            android.view.View r3 = r3.inflate(r4, r2, r10)
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            r4 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r4 = r3.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r3.setEnabled(r10)
            java.lang.CharSequence r1 = r1.f8737v
            r4.setText(r1)
            r1 = 0
            r2.addHeaderView(r3, r1, r10)
            r7.c()
        L_0x020d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j.e.v(j.k):void");
    }
}
