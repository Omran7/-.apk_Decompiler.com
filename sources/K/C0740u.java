package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import com.mtma.criminal.city.R;

/* renamed from: k.u  reason: case insensitive filesystem */
public final class C0740u {

    /* renamed from: b  reason: collision with root package name */
    public static final PorterDuff.Mode f9389b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c  reason: collision with root package name */
    public static C0740u f9390c;

    /* renamed from: a  reason: collision with root package name */
    public C0671K0 f9391a;

    public static synchronized C0740u a() {
        C0740u uVar;
        synchronized (C0740u.class) {
            try {
                if (f9390c == null) {
                    d();
                }
                uVar = f9390c;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return uVar;
    }

    public static synchronized PorterDuffColorFilter c(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter e6;
        synchronized (C0740u.class) {
            e6 = C0671K0.e(i2, mode);
        }
        return e6;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [k.u, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.lang.Object, J2.o] */
    public static synchronized void d() {
        synchronized (C0740u.class) {
            if (f9390c == null) {
                ? obj = new Object();
                f9390c = obj;
                obj.f9391a = C0671K0.b();
                C0671K0 k02 = f9390c.f9391a;
                ? obj2 = new Object();
                obj2.f1317a = new int[]{2131165301, 2131165299, 2131165225};
                obj2.f1318b = new int[]{2131165249, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
                obj2.f1319c = new int[]{2131165298, 2131165300, 2131165242, R.drawable.abc_text_cursor_material, 2131165295, 2131165296, 2131165297};
                obj2.d = new int[]{2131165274, R.drawable.abc_cab_background_internal_bg, 2131165273};
                obj2.f1320e = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
                obj2.f1321f = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
                synchronized (k02) {
                    k02.f9199e = obj2;
                }
            }
        }
    }

    public static void e(Drawable drawable, C0684R0 r02, int[] iArr) {
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        PorterDuff.Mode mode2 = C0671K0.f9195f;
        int[] state = drawable.getState();
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z3 = r02.d;
            if (z3 || r02.f9231c) {
                PorterDuffColorFilter porterDuffColorFilter = null;
                if (z3) {
                    colorStateList = r02.f9229a;
                } else {
                    colorStateList = null;
                }
                if (r02.f9231c) {
                    mode = r02.f9230b;
                } else {
                    mode = C0671K0.f9195f;
                }
                if (!(colorStateList == null || mode == null)) {
                    porterDuffColorFilter = C0671K0.e(colorStateList.getColorForState(iArr, 0), mode);
                }
                drawable.setColorFilter(porterDuffColorFilter);
                return;
            }
            drawable.clearColorFilter();
            return;
        }
        Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
    }

    public final synchronized Drawable b(Context context, int i2) {
        return this.f9391a.c(context, i2);
    }
}
