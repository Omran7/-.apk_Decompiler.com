package k;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

public final class a1 implements C0723l0 {

    /* renamed from: a  reason: collision with root package name */
    public Toolbar f9257a;

    /* renamed from: b  reason: collision with root package name */
    public int f9258b;

    /* renamed from: c  reason: collision with root package name */
    public View f9259c;
    public Drawable d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f9260e;

    /* renamed from: f  reason: collision with root package name */
    public Drawable f9261f;
    public boolean g;
    public CharSequence h;

    /* renamed from: i  reason: collision with root package name */
    public CharSequence f9262i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f9263j;

    /* renamed from: k  reason: collision with root package name */
    public Window.Callback f9264k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f9265l;

    /* renamed from: m  reason: collision with root package name */
    public C0718j f9266m;

    /* renamed from: n  reason: collision with root package name */
    public int f9267n;

    /* renamed from: o  reason: collision with root package name */
    public Drawable f9268o;

    public final void a(int i2) {
        View view;
        int i5 = this.f9258b ^ i2;
        this.f9258b = i2;
        if (i5 != 0) {
            if ((i5 & 4) != 0) {
                if ((i2 & 4) != 0) {
                    b();
                }
                int i6 = this.f9258b & 4;
                Toolbar toolbar = this.f9257a;
                if (i6 != 0) {
                    Drawable drawable = this.f9261f;
                    if (drawable == null) {
                        drawable = this.f9268o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i5 & 3) != 0) {
                c();
            }
            int i7 = i5 & 8;
            Toolbar toolbar2 = this.f9257a;
            if (i7 != 0) {
                if ((i2 & 8) != 0) {
                    toolbar2.setTitle(this.h);
                    toolbar2.setSubtitle(this.f9262i);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((i5 & 16) != 0 && (view = this.f9259c) != null) {
                if ((i2 & 16) != 0) {
                    toolbar2.addView(view);
                } else {
                    toolbar2.removeView(view);
                }
            }
        }
    }

    public final void b() {
        if ((this.f9258b & 4) != 0) {
            boolean isEmpty = TextUtils.isEmpty(this.f9263j);
            Toolbar toolbar = this.f9257a;
            if (isEmpty) {
                toolbar.setNavigationContentDescription(this.f9267n);
            } else {
                toolbar.setNavigationContentDescription(this.f9263j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i2 = this.f9258b;
        if ((i2 & 2) == 0) {
            drawable = null;
        } else if ((i2 & 1) != 0) {
            drawable = this.f9260e;
            if (drawable == null) {
                drawable = this.d;
            }
        } else {
            drawable = this.d;
        }
        this.f9257a.setLogo(drawable);
    }
}
