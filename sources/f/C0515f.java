package f;

import K.E;
import K.O;
import K1.e;
import K4.m;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.activity.p;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.mtma.criminal.city.R;
import i.j;
import java.util.WeakHashMap;

/* renamed from: f.f  reason: case insensitive filesystem */
public final class C0515f extends p implements DialogInterface, C0519j {
    public z d;

    /* renamed from: e  reason: collision with root package name */
    public final A f7780e;

    /* renamed from: f  reason: collision with root package name */
    public final C0514e f7781f;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0515f(android.view.ContextThemeWrapper r5, int r6) {
        /*
            r4 = this;
            int r6 = g(r5, r6)
            r0 = 1
            r1 = 2130903461(0x7f0301a5, float:1.741374E38)
            if (r6 != 0) goto L_0x0019
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r3 = r5.getTheme()
            r3.resolveAttribute(r1, r2, r0)
            int r2 = r2.resourceId
            goto L_0x001a
        L_0x0019:
            r2 = r6
        L_0x001a:
            r4.<init>(r5, r2)
            f.A r2 = new f.A
            r2.<init>(r4)
            r4.f7780e = r2
            f.n r2 = r4.e()
            if (r6 != 0) goto L_0x0038
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.res.Resources$Theme r5 = r5.getTheme()
            r5.resolveAttribute(r1, r6, r0)
            int r6 = r6.resourceId
        L_0x0038:
            r5 = r2
            f.z r5 = (f.z) r5
            r5.f7852c0 = r6
            r2.c()
            f.e r5 = new f.e
            android.content.Context r6 = r4.getContext()
            android.view.Window r0 = r4.getWindow()
            r5.<init>(r6, r4, r0)
            r4.f7781f = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f.C0515f.<init>(android.view.ContextThemeWrapper, int):void");
    }

    public static int g(Context context, int i2) {
        if (((i2 >>> 24) & 255) >= 1) {
            return i2;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        d();
        z zVar = (z) e();
        zVar.v();
        ((ViewGroup) zVar.f7833J.findViewById(16908290)).addView(view, layoutParams);
        zVar.f7869v.a(zVar.f7868u.getCallback());
    }

    public final void dismiss() {
        super.dismiss();
        e().d();
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return e.l(this.f7780e, getWindow().getDecorView(), this, keyEvent);
    }

    public final n e() {
        if (this.d == null) {
            m mVar = n.f7789a;
            this.d = new z(getContext(), getWindow(), this, this);
        }
        return this.d;
    }

    public final void f(Bundle bundle) {
        e().a();
        super.onCreate(bundle);
        e().c();
    }

    public final View findViewById(int i2) {
        z zVar = (z) e();
        zVar.v();
        return zVar.f7868u.findViewById(i2);
    }

    public final void i(CharSequence charSequence) {
        super.setTitle(charSequence);
        e().j(charSequence);
    }

    public final void invalidateOptionsMenu() {
        z zVar = (z) e();
        if (zVar.f7871x != null) {
            zVar.z();
            zVar.f7871x.getClass();
            zVar.A(0);
        }
    }

    public final boolean j(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void onCreate(Bundle bundle) {
        boolean z3;
        boolean z4;
        int i2;
        boolean z5;
        ListAdapter listAdapter;
        int i5;
        int i6;
        View view;
        View findViewById;
        int i7 = 2;
        f(bundle);
        C0514e eVar = this.f7781f;
        eVar.f7761b.setContentView(eVar.f7773q);
        Window window = eVar.f7762c;
        View findViewById2 = window.findViewById(R.id.parentPanel);
        View findViewById3 = findViewById2.findViewById(R.id.topPanel);
        View findViewById4 = findViewById2.findViewById(R.id.contentPanel);
        View findViewById5 = findViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(R.id.customPanel);
        window.setFlags(131072, 131072);
        viewGroup.setVisibility(8);
        View findViewById6 = viewGroup.findViewById(R.id.topPanel);
        View findViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View findViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup a6 = C0514e.a(findViewById6, findViewById3);
        ViewGroup a7 = C0514e.a(findViewById7, findViewById4);
        ViewGroup a8 = C0514e.a(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        eVar.f7765i = nestedScrollView;
        nestedScrollView.setFocusable(false);
        eVar.f7765i.setNestedScrollingEnabled(false);
        TextView textView = (TextView) a7.findViewById(16908299);
        eVar.f7769m = textView;
        if (textView != null) {
            textView.setVisibility(8);
            eVar.f7765i.removeView(eVar.f7769m);
            if (eVar.f7763e != null) {
                ViewGroup viewGroup2 = (ViewGroup) eVar.f7765i.getParent();
                int indexOfChild = viewGroup2.indexOfChild(eVar.f7765i);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(eVar.f7763e, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                a7.setVisibility(8);
            }
        }
        Button button = (Button) a8.findViewById(16908313);
        eVar.f7764f = button;
        m mVar = eVar.f7779w;
        button.setOnClickListener(mVar);
        if (TextUtils.isEmpty((CharSequence) null)) {
            eVar.f7764f.setVisibility(8);
            z3 = false;
        } else {
            eVar.f7764f.setText((CharSequence) null);
            eVar.f7764f.setVisibility(0);
            z3 = true;
        }
        Button button2 = (Button) a8.findViewById(16908314);
        eVar.g = button2;
        button2.setOnClickListener(mVar);
        if (TextUtils.isEmpty((CharSequence) null)) {
            eVar.g.setVisibility(8);
        } else {
            eVar.g.setText((CharSequence) null);
            eVar.g.setVisibility(0);
            z3 |= true;
        }
        Button button3 = (Button) a8.findViewById(16908315);
        eVar.h = button3;
        button3.setOnClickListener(mVar);
        if (TextUtils.isEmpty((CharSequence) null)) {
            eVar.h.setVisibility(8);
        } else {
            eVar.h.setText((CharSequence) null);
            eVar.h.setVisibility(0);
            z3 |= true;
        }
        TypedValue typedValue = new TypedValue();
        eVar.f7760a.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (z3) {
                Button button4 = eVar.f7764f;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (z3) {
                Button button5 = eVar.g;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (z3) {
                Button button6 = eVar.h;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (!z3) {
            a8.setVisibility(8);
        }
        if (eVar.f7770n != null) {
            a6.addView(eVar.f7770n, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            eVar.f7767k = (ImageView) window.findViewById(16908294);
            if (TextUtils.isEmpty(eVar.d) || !eVar.f7777u) {
                window.findViewById(R.id.title_template).setVisibility(8);
                eVar.f7767k.setVisibility(8);
                a6.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                eVar.f7768l = textView2;
                textView2.setText(eVar.d);
                Drawable drawable = eVar.f7766j;
                if (drawable != null) {
                    eVar.f7767k.setImageDrawable(drawable);
                } else {
                    eVar.f7768l.setPadding(eVar.f7767k.getPaddingLeft(), eVar.f7767k.getPaddingTop(), eVar.f7767k.getPaddingRight(), eVar.f7767k.getPaddingBottom());
                    eVar.f7767k.setVisibility(8);
                }
            }
        }
        if (viewGroup.getVisibility() != 8) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (a6 == null || a6.getVisibility() == 8) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        if (a8.getVisibility() != 8) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (!z5 && (findViewById = a7.findViewById(R.id.textSpacerNoButtons)) != null) {
            findViewById.setVisibility(0);
        }
        if (i2 != 0) {
            NestedScrollView nestedScrollView2 = eVar.f7765i;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            if (eVar.f7763e != null) {
                view = a6.findViewById(R.id.titleDividerNoCustom);
            } else {
                view = null;
            }
            if (view != null) {
                view.setVisibility(0);
            }
        } else {
            View findViewById9 = a7.findViewById(R.id.textSpacerNoTitle);
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = eVar.f7763e;
        if (alertController$RecycleListView != null) {
            alertController$RecycleListView.getClass();
            if (!z5 || i2 == 0) {
                int paddingLeft = alertController$RecycleListView.getPaddingLeft();
                if (i2 != 0) {
                    i5 = alertController$RecycleListView.getPaddingTop();
                } else {
                    i5 = alertController$RecycleListView.f4679a;
                }
                int paddingRight = alertController$RecycleListView.getPaddingRight();
                if (z5) {
                    i6 = alertController$RecycleListView.getPaddingBottom();
                } else {
                    i6 = alertController$RecycleListView.f4680b;
                }
                alertController$RecycleListView.setPadding(paddingLeft, i5, paddingRight, i6);
            }
        }
        if (!z4) {
            View view2 = eVar.f7763e;
            if (view2 == null) {
                view2 = eVar.f7765i;
            }
            if (view2 != null) {
                if (!z5) {
                    i7 = 0;
                }
                int i8 = i7 | i2;
                View findViewById10 = window.findViewById(R.id.scrollIndicatorUp);
                View findViewById11 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = O.f1352a;
                E.d(view2, i8, 3);
                if (findViewById10 != null) {
                    a7.removeView(findViewById10);
                }
                if (findViewById11 != null) {
                    a7.removeView(findViewById11);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = eVar.f7763e;
        if (alertController$RecycleListView2 != null && (listAdapter = eVar.f7771o) != null) {
            alertController$RecycleListView2.setAdapter(listAdapter);
            int i9 = eVar.f7772p;
            if (i9 > -1) {
                alertController$RecycleListView2.setItemChecked(i9, true);
                alertController$RecycleListView2.setSelection(i9);
            }
        }
    }

    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f7781f.f7765i;
        if (nestedScrollView == null || !nestedScrollView.j(keyEvent)) {
            return super.onKeyDown(i2, keyEvent);
        }
        return true;
    }

    public final boolean onKeyUp(int i2, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f7781f.f7765i;
        if (nestedScrollView == null || !nestedScrollView.j(keyEvent)) {
            return super.onKeyUp(i2, keyEvent);
        }
        return true;
    }

    public final void onStop() {
        super.onStop();
        z zVar = (z) e();
        zVar.z();
        J j6 = zVar.f7871x;
        if (j6 != null) {
            j6.f7731I = false;
            j jVar = j6.f7730H;
            if (jVar != null) {
                jVar.a();
            }
        }
    }

    public final void setContentView(int i2) {
        d();
        e().g(i2);
    }

    public final void setTitle(int i2) {
        super.setTitle(i2);
        e().j(getContext().getString(i2));
    }

    public final void setContentView(View view) {
        d();
        e().h(view);
    }

    public final void setTitle(CharSequence charSequence) {
        i(charSequence);
        C0514e eVar = this.f7781f;
        eVar.d = charSequence;
        TextView textView = eVar.f7768l;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        d();
        e().i(view, layoutParams);
    }
}
