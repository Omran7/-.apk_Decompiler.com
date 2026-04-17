package k;

import A.h;
import J2.o;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import com.mtma.criminal.city.R;
import java.util.WeakHashMap;
import n.i;
import n.k;
import u0.C1028o;

/* renamed from: k.K0  reason: case insensitive filesystem */
public final class C0671K0 {

    /* renamed from: f  reason: collision with root package name */
    public static final PorterDuff.Mode f9195f = PorterDuff.Mode.SRC_IN;
    public static C0671K0 g;
    public static final C0669J0 h = new i(6);

    /* renamed from: a  reason: collision with root package name */
    public WeakHashMap f9196a;

    /* renamed from: b  reason: collision with root package name */
    public final WeakHashMap f9197b = new WeakHashMap(0);

    /* renamed from: c  reason: collision with root package name */
    public TypedValue f9198c;
    public boolean d;

    /* renamed from: e  reason: collision with root package name */
    public o f9199e;

    public static synchronized C0671K0 b() {
        C0671K0 k02;
        synchronized (C0671K0.class) {
            try {
                if (g == null) {
                    g = new C0671K0();
                }
                k02 = g;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return k02;
    }

    public static synchronized PorterDuffColorFilter e(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (C0671K0.class) {
            C0669J0 j02 = h;
            j02.getClass();
            int i5 = (31 + i2) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) j02.get(Integer.valueOf(mode.hashCode() + i5));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i2, mode);
                PorterDuffColorFilter porterDuffColorFilter2 = (PorterDuffColorFilter) j02.put(Integer.valueOf(mode.hashCode() + i5), porterDuffColorFilter);
            }
        }
        return porterDuffColorFilter;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0054, code lost:
        r6 = r3.f10221c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable a(android.content.Context r10, int r11) {
        /*
            r9 = this;
            android.util.TypedValue r0 = r9.f9198c
            if (r0 != 0) goto L_0x000b
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r9.f9198c = r0
        L_0x000b:
            android.util.TypedValue r0 = r9.f9198c
            android.content.res.Resources r1 = r10.getResources()
            r2 = 1
            r1.getValue(r11, r0, r2)
            int r1 = r0.assetCookie
            long r1 = (long) r1
            r3 = 32
            long r1 = r1 << r3
            int r3 = r0.data
            long r3 = (long) r3
            long r1 = r1 | r3
            monitor-enter(r9)
            java.util.WeakHashMap r3 = r9.f9197b     // Catch:{ all -> 0x0047 }
            java.lang.Object r3 = r3.get(r10)     // Catch:{ all -> 0x0047 }
            n.g r3 = (n.g) r3     // Catch:{ all -> 0x0047 }
            r4 = 0
            if (r3 != 0) goto L_0x002d
            monitor-exit(r9)
            goto L_0x0062
        L_0x002d:
            java.lang.Object r5 = r3.b(r1)     // Catch:{ all -> 0x0047 }
            java.lang.ref.WeakReference r5 = (java.lang.ref.WeakReference) r5     // Catch:{ all -> 0x0047 }
            if (r5 == 0) goto L_0x0061
            java.lang.Object r5 = r5.get()     // Catch:{ all -> 0x0047 }
            android.graphics.drawable.Drawable$ConstantState r5 = (android.graphics.drawable.Drawable.ConstantState) r5     // Catch:{ all -> 0x0047 }
            if (r5 == 0) goto L_0x004a
            android.content.res.Resources r3 = r10.getResources()     // Catch:{ all -> 0x0047 }
            android.graphics.drawable.Drawable r4 = r5.newDrawable(r3)     // Catch:{ all -> 0x0047 }
            monitor-exit(r9)
            goto L_0x0062
        L_0x0047:
            r10 = move-exception
            goto L_0x00e2
        L_0x004a:
            long[] r5 = r3.f10220b     // Catch:{ all -> 0x0047 }
            int r6 = r3.d     // Catch:{ all -> 0x0047 }
            int r5 = o.C0890a.b(r5, r6, r1)     // Catch:{ all -> 0x0047 }
            if (r5 < 0) goto L_0x0061
            java.lang.Object[] r6 = r3.f10221c     // Catch:{ all -> 0x0047 }
            r7 = r6[r5]     // Catch:{ all -> 0x0047 }
            java.lang.Object r8 = n.h.f10222a     // Catch:{ all -> 0x0047 }
            if (r7 == r8) goto L_0x0061
            r6[r5] = r8     // Catch:{ all -> 0x0047 }
            r5 = 1
            r3.f10219a = r5     // Catch:{ all -> 0x0047 }
        L_0x0061:
            monitor-exit(r9)
        L_0x0062:
            if (r4 == 0) goto L_0x0065
            return r4
        L_0x0065:
            J2.o r3 = r9.f9199e
            r4 = 0
            if (r3 != 0) goto L_0x006b
            goto L_0x00ae
        L_0x006b:
            r3 = 2131165241(0x7f070039, float:1.7944694E38)
            if (r11 != r3) goto L_0x0088
            android.graphics.drawable.LayerDrawable r4 = new android.graphics.drawable.LayerDrawable
            r11 = 2131165240(0x7f070038, float:1.7944692E38)
            android.graphics.drawable.Drawable r11 = r9.c(r10, r11)
            r3 = 2131165242(0x7f07003a, float:1.7944696E38)
            android.graphics.drawable.Drawable r3 = r9.c(r10, r3)
            android.graphics.drawable.Drawable[] r11 = new android.graphics.drawable.Drawable[]{r11, r3}
            r4.<init>(r11)
            goto L_0x00ae
        L_0x0088:
            r3 = 2131165276(0x7f07005c, float:1.7944765E38)
            if (r11 != r3) goto L_0x0095
            r11 = 2131099707(0x7f06003b, float:1.7811775E38)
            android.graphics.drawable.LayerDrawable r4 = J2.o.o(r9, r10, r11)
            goto L_0x00ae
        L_0x0095:
            r3 = 2131165275(0x7f07005b, float:1.7944763E38)
            if (r11 != r3) goto L_0x00a2
            r11 = 2131099708(0x7f06003c, float:1.7811777E38)
            android.graphics.drawable.LayerDrawable r4 = J2.o.o(r9, r10, r11)
            goto L_0x00ae
        L_0x00a2:
            r3 = 2131165277(0x7f07005d, float:1.7944767E38)
            if (r11 != r3) goto L_0x00ae
            r11 = 2131099709(0x7f06003d, float:1.7811779E38)
            android.graphics.drawable.LayerDrawable r4 = J2.o.o(r9, r10, r11)
        L_0x00ae:
            if (r4 == 0) goto L_0x00e1
            int r11 = r0.changingConfigurations
            r4.setChangingConfigurations(r11)
            monitor-enter(r9)
            android.graphics.drawable.Drawable$ConstantState r11 = r4.getConstantState()     // Catch:{ all -> 0x00d1 }
            if (r11 == 0) goto L_0x00dd
            java.util.WeakHashMap r0 = r9.f9197b     // Catch:{ all -> 0x00d1 }
            java.lang.Object r0 = r0.get(r10)     // Catch:{ all -> 0x00d1 }
            n.g r0 = (n.g) r0     // Catch:{ all -> 0x00d1 }
            if (r0 != 0) goto L_0x00d3
            n.g r0 = new n.g     // Catch:{ all -> 0x00d1 }
            r0.<init>()     // Catch:{ all -> 0x00d1 }
            java.util.WeakHashMap r3 = r9.f9197b     // Catch:{ all -> 0x00d1 }
            r3.put(r10, r0)     // Catch:{ all -> 0x00d1 }
            goto L_0x00d3
        L_0x00d1:
            r10 = move-exception
            goto L_0x00df
        L_0x00d3:
            java.lang.ref.WeakReference r10 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x00d1 }
            r10.<init>(r11)     // Catch:{ all -> 0x00d1 }
            r0.d(r10, r1)     // Catch:{ all -> 0x00d1 }
            monitor-exit(r9)
            goto L_0x00e1
        L_0x00dd:
            monitor-exit(r9)
            goto L_0x00e1
        L_0x00df:
            monitor-exit(r9)     // Catch:{ all -> 0x00d1 }
            throw r10
        L_0x00e1:
            return r4
        L_0x00e2:
            monitor-exit(r9)     // Catch:{ all -> 0x0047 }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: k.C0671K0.a(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    public final synchronized Drawable c(Context context, int i2) {
        return d(context, i2, false);
    }

    public final synchronized Drawable d(Context context, int i2, boolean z3) {
        Drawable a6;
        try {
            if (!this.d) {
                this.d = true;
                Drawable c3 = c(context, R.drawable.abc_vector_test);
                if (c3 == null || (!(c3 instanceof C1028o) && !"android.graphics.drawable.VectorDrawable".equals(c3.getClass().getName()))) {
                    this.d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            a6 = a(context, i2);
            if (a6 == null) {
                a6 = h.getDrawable(context, i2);
            }
            if (a6 != null) {
                a6 = g(context, i2, z3, a6);
            }
            if (a6 != null) {
                C0725m0.a(a6);
            }
        } catch (Throwable th) {
            throw th;
        }
        return a6;
    }

    public final synchronized ColorStateList f(Context context, int i2) {
        ColorStateList colorStateList;
        k kVar;
        WeakHashMap weakHashMap = this.f9196a;
        ColorStateList colorStateList2 = null;
        if (weakHashMap == null || (kVar = (k) weakHashMap.get(context)) == null) {
            colorStateList = null;
        } else {
            colorStateList = (ColorStateList) kVar.d(i2);
        }
        if (colorStateList == null) {
            o oVar = this.f9199e;
            if (oVar != null) {
                colorStateList2 = oVar.p(context, i2);
            }
            if (colorStateList2 != null) {
                if (this.f9196a == null) {
                    this.f9196a = new WeakHashMap();
                }
                k kVar2 = (k) this.f9196a.get(context);
                if (kVar2 == null) {
                    kVar2 = new k();
                    this.f9196a.put(context, kVar2);
                }
                kVar2.a(i2, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ee  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable g(android.content.Context r9, int r10, boolean r11, android.graphics.drawable.Drawable r12) {
        /*
            r8 = this;
            android.content.res.ColorStateList r0 = r8.f(r9, r10)
            r1 = 0
            if (r0 == 0) goto L_0x0021
            android.graphics.drawable.Drawable r12 = r12.mutate()
            D.a.h(r12, r0)
            J2.o r9 = r8.f9199e
            if (r9 != 0) goto L_0x0013
            goto L_0x001a
        L_0x0013:
            r9 = 2131165290(0x7f07006a, float:1.7944793E38)
            if (r10 != r9) goto L_0x001a
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.MULTIPLY
        L_0x001a:
            if (r1 == 0) goto L_0x0108
            D.a.i(r12, r1)
            goto L_0x0108
        L_0x0021:
            J2.o r0 = r8.f9199e
            if (r0 == 0) goto L_0x0097
            r0 = 2131165285(0x7f070065, float:1.7944783E38)
            r2 = 16908301(0x102000d, float:2.3877265E-38)
            r3 = 16908303(0x102000f, float:2.387727E-38)
            r4 = 16908288(0x1020000, float:2.387723E-38)
            r5 = 2130903289(0x7f0300f9, float:1.7413392E38)
            r6 = 2130903291(0x7f0300fb, float:1.7413396E38)
            if (r10 != r0) goto L_0x0060
            r10 = r12
            android.graphics.drawable.LayerDrawable r10 = (android.graphics.drawable.LayerDrawable) r10
            android.graphics.drawable.Drawable r11 = r10.findDrawableByLayerId(r4)
            int r0 = k.C0681P0.c(r9, r6)
            android.graphics.PorterDuff$Mode r1 = k.C0740u.f9389b
            J2.o.r(r11, r0, r1)
            android.graphics.drawable.Drawable r11 = r10.findDrawableByLayerId(r3)
            int r0 = k.C0681P0.c(r9, r6)
            J2.o.r(r11, r0, r1)
            android.graphics.drawable.Drawable r10 = r10.findDrawableByLayerId(r2)
            int r9 = k.C0681P0.c(r9, r5)
            J2.o.r(r10, r9, r1)
            goto L_0x0108
        L_0x0060:
            r0 = 2131165276(0x7f07005c, float:1.7944765E38)
            if (r10 == r0) goto L_0x006f
            r0 = 2131165275(0x7f07005b, float:1.7944763E38)
            if (r10 == r0) goto L_0x006f
            r0 = 2131165277(0x7f07005d, float:1.7944767E38)
            if (r10 != r0) goto L_0x0097
        L_0x006f:
            r10 = r12
            android.graphics.drawable.LayerDrawable r10 = (android.graphics.drawable.LayerDrawable) r10
            android.graphics.drawable.Drawable r11 = r10.findDrawableByLayerId(r4)
            int r0 = k.C0681P0.b(r9, r6)
            android.graphics.PorterDuff$Mode r1 = k.C0740u.f9389b
            J2.o.r(r11, r0, r1)
            android.graphics.drawable.Drawable r11 = r10.findDrawableByLayerId(r3)
            int r0 = k.C0681P0.c(r9, r5)
            J2.o.r(r11, r0, r1)
            android.graphics.drawable.Drawable r10 = r10.findDrawableByLayerId(r2)
            int r9 = k.C0681P0.c(r9, r5)
            J2.o.r(r10, r9, r1)
            goto L_0x0108
        L_0x0097:
            J2.o r0 = r8.f9199e
            r2 = 0
            if (r0 == 0) goto L_0x0103
            android.graphics.PorterDuff$Mode r3 = k.C0740u.f9389b
            java.lang.Object r4 = r0.f1317a
            int[] r4 = (int[]) r4
            boolean r4 = J2.o.j(r4, r10)
            r5 = 1
            r6 = -1
            if (r4 == 0) goto L_0x00b0
            r10 = 2130903291(0x7f0300fb, float:1.7413396E38)
        L_0x00ad:
            r4 = r5
        L_0x00ae:
            r0 = r6
            goto L_0x00ec
        L_0x00b0:
            java.lang.Object r4 = r0.f1319c
            int[] r4 = (int[]) r4
            boolean r4 = J2.o.j(r4, r10)
            if (r4 == 0) goto L_0x00be
            r10 = 2130903289(0x7f0300f9, float:1.7413392E38)
            goto L_0x00ad
        L_0x00be:
            java.lang.Object r0 = r0.d
            int[] r0 = (int[]) r0
            boolean r0 = J2.o.j(r0, r10)
            r4 = 16842801(0x1010031, float:2.3693695E-38)
            if (r0 == 0) goto L_0x00cf
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.MULTIPLY
        L_0x00cd:
            r10 = r4
            goto L_0x00ad
        L_0x00cf:
            r0 = 2131165262(0x7f07004e, float:1.7944736E38)
            if (r10 != r0) goto L_0x00e3
            r10 = 1109603123(0x42233333, float:40.8)
            int r10 = java.lang.Math.round(r10)
            r0 = 16842800(0x1010030, float:2.3693693E-38)
            r4 = r5
            r7 = r0
            r0 = r10
            r10 = r7
            goto L_0x00ec
        L_0x00e3:
            r0 = 2131165244(0x7f07003c, float:1.79447E38)
            if (r10 != r0) goto L_0x00e9
            goto L_0x00cd
        L_0x00e9:
            r10 = r2
            r4 = r10
            goto L_0x00ae
        L_0x00ec:
            if (r4 == 0) goto L_0x0103
            android.graphics.drawable.Drawable r2 = r12.mutate()
            int r9 = k.C0681P0.c(r9, r10)
            android.graphics.PorterDuffColorFilter r9 = k.C0740u.c(r9, r3)
            r2.setColorFilter(r9)
            if (r0 == r6) goto L_0x0102
            r2.setAlpha(r0)
        L_0x0102:
            r2 = r5
        L_0x0103:
            if (r2 != 0) goto L_0x0108
            if (r11 == 0) goto L_0x0108
            r12 = r1
        L_0x0108:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: k.C0671K0.g(android.content.Context, int, boolean, android.graphics.drawable.Drawable):android.graphics.drawable.Drawable");
    }
}
