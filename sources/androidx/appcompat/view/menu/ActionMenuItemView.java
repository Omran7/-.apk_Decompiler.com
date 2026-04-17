package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import com.bumptech.glide.c;
import e.C0476a;
import j.C0602b;
import j.C0603c;
import j.j;
import j.k;
import j.m;
import j.x;
import k.C0703b0;
import k.C0720k;

public class ActionMenuItemView extends C0703b0 implements x, View.OnClickListener, C0720k {

    /* renamed from: A  reason: collision with root package name */
    public final int f4681A;

    /* renamed from: q  reason: collision with root package name */
    public m f4682q;

    /* renamed from: r  reason: collision with root package name */
    public CharSequence f4683r;

    /* renamed from: s  reason: collision with root package name */
    public Drawable f4684s;

    /* renamed from: t  reason: collision with root package name */
    public j f4685t;

    /* renamed from: u  reason: collision with root package name */
    public C0602b f4686u;

    /* renamed from: v  reason: collision with root package name */
    public C0603c f4687v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f4688w = h();

    /* renamed from: x  reason: collision with root package name */
    public boolean f4689x;

    /* renamed from: y  reason: collision with root package name */
    public final int f4690y;

    /* renamed from: z  reason: collision with root package name */
    public int f4691z;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0476a.f7534c, 0, 0);
        this.f4690y = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f4681A = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f4691z = -1;
        setSaveEnabled(false);
    }

    public final boolean a() {
        return !TextUtils.isEmpty(getText());
    }

    public final void b(m mVar) {
        int i2;
        this.f4682q = mVar;
        setIcon(mVar.getIcon());
        setTitle(mVar.getTitleCondensed());
        setId(mVar.f8756a);
        if (mVar.isVisible()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        setVisibility(i2);
        setEnabled(mVar.isEnabled());
        if (mVar.hasSubMenu() && this.f4686u == null) {
            this.f4686u = new C0602b(this);
        }
    }

    public final boolean c() {
        if (TextUtils.isEmpty(getText()) || this.f4682q.getIcon() != null) {
            return false;
        }
        return true;
    }

    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    public m getItemData() {
        return this.f4682q;
    }

    public final boolean h() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i5 = configuration.screenHeightDp;
        if (i2 >= 480 || ((i2 >= 640 && i5 >= 480) || configuration.orientation == 2)) {
            return true;
        }
        return false;
    }

    public final void i() {
        CharSequence charSequence;
        CharSequence charSequence2;
        boolean z3 = true;
        boolean z4 = !TextUtils.isEmpty(this.f4683r);
        if (this.f4684s != null && ((this.f4682q.f8751H & 4) != 4 || (!this.f4688w && !this.f4689x))) {
            z3 = false;
        }
        boolean z5 = z4 & z3;
        CharSequence charSequence3 = null;
        if (z5) {
            charSequence = this.f4683r;
        } else {
            charSequence = null;
        }
        setText(charSequence);
        CharSequence charSequence4 = this.f4682q.f8771z;
        if (TextUtils.isEmpty(charSequence4)) {
            if (z5) {
                charSequence2 = null;
            } else {
                charSequence2 = this.f4682q.f8759e;
            }
            setContentDescription(charSequence2);
        } else {
            setContentDescription(charSequence4);
        }
        CharSequence charSequence5 = this.f4682q.f8745A;
        if (TextUtils.isEmpty(charSequence5)) {
            if (!z5) {
                charSequence3 = this.f4682q.f8759e;
            }
            c.o0(this, charSequence3);
            return;
        }
        c.o0(this, charSequence5);
    }

    public final void onClick(View view) {
        j jVar = this.f4685t;
        if (jVar != null) {
            jVar.c(this.f4682q);
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f4688w = h();
        i();
    }

    public final void onMeasure(int i2, int i5) {
        int i6;
        int i7;
        boolean isEmpty = TextUtils.isEmpty(getText());
        if (!isEmpty && (i7 = this.f4691z) >= 0) {
            super.setPadding(i7, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i2, i5);
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int measuredWidth = getMeasuredWidth();
        int i8 = this.f4690y;
        if (mode == Integer.MIN_VALUE) {
            i6 = Math.min(size, i8);
        } else {
            i6 = i8;
        }
        if (mode != 1073741824 && i8 > 0 && measuredWidth < i6) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i6, 1073741824), i5);
        }
        if (isEmpty && this.f4684s != null) {
            super.setPadding((getMeasuredWidth() - this.f4684s.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState((Parcelable) null);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0602b bVar;
        if (!this.f4682q.hasSubMenu() || (bVar = this.f4686u) == null || !bVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setCheckable(boolean z3) {
    }

    public void setChecked(boolean z3) {
    }

    public void setExpandedFormat(boolean z3) {
        if (this.f4689x != z3) {
            this.f4689x = z3;
            m mVar = this.f4682q;
            if (mVar != null) {
                k kVar = mVar.f8768w;
                kVar.f8735t = true;
                kVar.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f4684s = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i2 = this.f4681A;
            if (intrinsicWidth > i2) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i2) / ((float) intrinsicWidth)));
                intrinsicWidth = i2;
            }
            if (intrinsicHeight > i2) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i2) / ((float) intrinsicHeight)));
            } else {
                i2 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i2);
        }
        setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        i();
    }

    public void setItemInvoker(j jVar) {
        this.f4685t = jVar;
    }

    public final void setPadding(int i2, int i5, int i6, int i7) {
        this.f4691z = i2;
        super.setPadding(i2, i5, i6, i7);
    }

    public void setPopupCallback(C0603c cVar) {
        this.f4687v = cVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f4683r = charSequence;
        i();
    }
}
