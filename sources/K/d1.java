package k;

import K.O;
import K.Q;
import K.T;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import com.mtma.criminal.city.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public final class d1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: t  reason: collision with root package name */
    public static d1 f9279t;

    /* renamed from: u  reason: collision with root package name */
    public static d1 f9280u;

    /* renamed from: a  reason: collision with root package name */
    public final View f9281a;

    /* renamed from: b  reason: collision with root package name */
    public final CharSequence f9282b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9283c;
    public final c1 d = new c1(this, 0);

    /* renamed from: e  reason: collision with root package name */
    public final c1 f9284e = new c1(this, 1);

    /* renamed from: f  reason: collision with root package name */
    public int f9285f;

    /* renamed from: p  reason: collision with root package name */
    public int f9286p;

    /* renamed from: q  reason: collision with root package name */
    public e1 f9287q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f9288r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f9289s;

    public d1(View view, CharSequence charSequence) {
        int i2;
        this.f9281a = view;
        this.f9282b = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = T.f1357a;
        if (Build.VERSION.SDK_INT >= 28) {
            i2 = Q.a(viewConfiguration);
        } else {
            i2 = viewConfiguration.getScaledTouchSlop() / 2;
        }
        this.f9283c = i2;
        this.f9289s = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(d1 d1Var) {
        d1 d1Var2 = f9279t;
        if (d1Var2 != null) {
            d1Var2.f9281a.removeCallbacks(d1Var2.d);
        }
        f9279t = d1Var;
        if (d1Var != null) {
            d1Var.f9281a.postDelayed(d1Var.d, (long) ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        d1 d1Var = f9280u;
        View view = this.f9281a;
        if (d1Var == this) {
            f9280u = null;
            e1 e1Var = this.f9287q;
            if (e1Var != null) {
                View view2 = (View) e1Var.f9291b;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) e1Var.f9290a).getSystemService("window")).removeView(view2);
                }
                this.f9287q = null;
                this.f9289s = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f9279t == this) {
            b((d1) null);
        }
        view.removeCallbacks(this.f9284e);
    }

    /* JADX WARNING: type inference failed for: r4v3, types: [java.lang.Object, k.e1] */
    public final void c(boolean z3) {
        int i2;
        int i5;
        int i6;
        String str;
        long j6;
        long longPressTimeout;
        long j7;
        String str2;
        int i7;
        int i8;
        View view = this.f9281a;
        if (view.isAttachedToWindow()) {
            b((d1) null);
            d1 d1Var = f9280u;
            if (d1Var != null) {
                d1Var.a();
            }
            f9280u = this;
            this.f9288r = z3;
            Context context = view.getContext();
            ? obj = new Object();
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            obj.d = layoutParams;
            obj.f9293e = new Rect();
            obj.f9294f = new int[2];
            obj.f9295p = new int[2];
            obj.f9290a = context;
            View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
            obj.f9291b = inflate;
            obj.f9292c = (TextView) inflate.findViewById(R.id.message);
            layoutParams.setTitle(e1.class.getSimpleName());
            layoutParams.packageName = context.getPackageName();
            layoutParams.type = 1002;
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.format = -3;
            layoutParams.windowAnimations = 2131951620;
            layoutParams.flags = 24;
            this.f9287q = obj;
            int i9 = this.f9285f;
            int i10 = this.f9286p;
            boolean z4 = this.f9288r;
            View view2 = (View) obj.f9291b;
            ViewParent parent = view2.getParent();
            Context context2 = (Context) obj.f9290a;
            if (!(parent == null || view2.getParent() == null)) {
                ((WindowManager) context2.getSystemService("window")).removeView(view2);
            }
            ((TextView) obj.f9292c).setText(this.f9282b);
            WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) obj.d;
            layoutParams2.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                i9 = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                i2 = i10 + dimensionPixelOffset2;
                i5 = i10 - dimensionPixelOffset2;
            } else {
                i2 = view.getHeight();
                i5 = 0;
            }
            layoutParams2.gravity = 49;
            Resources resources = context2.getResources();
            if (z4) {
                i6 = R.dimen.tooltip_y_offset_touch;
            } else {
                i6 = R.dimen.tooltip_y_offset_non_touch;
            }
            int dimensionPixelOffset3 = resources.getDimensionPixelOffset(i6);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams3 = rootView.getLayoutParams();
            if (!(layoutParams3 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams3).type != 2) {
                Context context3 = view.getContext();
                while (true) {
                    if (!(context3 instanceof ContextWrapper)) {
                        break;
                    } else if (context3 instanceof Activity) {
                        rootView = ((Activity) context3).getWindow().getDecorView();
                        break;
                    } else {
                        context3 = ((ContextWrapper) context3).getBaseContext();
                    }
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
                str = "window";
            } else {
                Rect rect = (Rect) obj.f9293e;
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    str2 = "window";
                    i7 = 0;
                } else {
                    Resources resources2 = context2.getResources();
                    str2 = "window";
                    int identifier = resources2.getIdentifier("status_bar_height", "dimen", "android");
                    if (identifier != 0) {
                        i8 = resources2.getDimensionPixelSize(identifier);
                    } else {
                        i8 = 0;
                    }
                    DisplayMetrics displayMetrics = resources2.getDisplayMetrics();
                    i7 = 0;
                    rect.set(0, i8, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                int[] iArr = (int[]) obj.f9295p;
                rootView.getLocationOnScreen(iArr);
                int[] iArr2 = (int[]) obj.f9294f;
                view.getLocationOnScreen(iArr2);
                int i11 = iArr2[i7] - iArr[i7];
                iArr2[i7] = i11;
                iArr2[1] = iArr2[1] - iArr[1];
                layoutParams2.x = (i11 + i9) - (rootView.getWidth() / 2);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i7, i7);
                view2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i12 = iArr2[1];
                int i13 = ((i5 + i12) - dimensionPixelOffset3) - measuredHeight;
                int i14 = i12 + i2 + dimensionPixelOffset3;
                if (z4) {
                    if (i13 >= 0) {
                        layoutParams2.y = i13;
                    } else {
                        layoutParams2.y = i14;
                    }
                } else if (measuredHeight + i14 <= rect.height()) {
                    layoutParams2.y = i14;
                } else {
                    layoutParams2.y = i13;
                }
                str = str2;
            }
            ((WindowManager) context2.getSystemService(str)).addView(view2, layoutParams2);
            view.addOnAttachStateChangeListener(this);
            if (this.f9288r) {
                j6 = 2500;
            } else {
                WeakHashMap weakHashMap = O.f1352a;
                if ((view.getWindowSystemUiVisibility() & 1) == 1) {
                    longPressTimeout = (long) ViewConfiguration.getLongPressTimeout();
                    j7 = 3000;
                } else {
                    longPressTimeout = (long) ViewConfiguration.getLongPressTimeout();
                    j7 = 15000;
                }
                j6 = j7 - longPressTimeout;
            }
            c1 c1Var = this.f9284e;
            view.removeCallbacks(c1Var);
            view.postDelayed(c1Var, j6);
        }
    }

    public final boolean onHover(View view, MotionEvent motionEvent) {
        int i2;
        if (this.f9287q != null && this.f9288r) {
            return false;
        }
        View view2 = this.f9281a;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                this.f9289s = true;
                a();
            }
        } else if (view2.isEnabled() && this.f9287q == null) {
            int x6 = (int) motionEvent.getX();
            int y6 = (int) motionEvent.getY();
            if (this.f9289s || Math.abs(x6 - this.f9285f) > (i2 = this.f9283c) || Math.abs(y6 - this.f9286p) > i2) {
                this.f9285f = x6;
                this.f9286p = y6;
                this.f9289s = false;
                b(this);
            }
        }
        return false;
    }

    public final boolean onLongClick(View view) {
        this.f9285f = view.getWidth() / 2;
        this.f9286p = view.getHeight() / 2;
        c(true);
        return true;
    }

    public final void onViewDetachedFromWindow(View view) {
        a();
    }

    public final void onViewAttachedToWindow(View view) {
    }
}
