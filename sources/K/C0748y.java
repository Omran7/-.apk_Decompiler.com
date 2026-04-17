package k;

import A2.f;
import R2.b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;

/* renamed from: k.y  reason: case insensitive filesystem */
public class C0748y extends ImageButton {

    /* renamed from: a  reason: collision with root package name */
    public final C0730p f9410a;

    /* renamed from: b  reason: collision with root package name */
    public final f f9411b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f9412c = false;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0748y(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        C0683Q0.a(context);
        C0681P0.a(this, getContext());
        C0730p pVar = new C0730p(this);
        this.f9410a = pVar;
        pVar.d(attributeSet, i2);
        f fVar = new f((ImageView) this);
        this.f9411b = fVar;
        fVar.j(attributeSet, i2);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0730p pVar = this.f9410a;
        if (pVar != null) {
            pVar.a();
        }
        f fVar = this.f9411b;
        if (fVar != null) {
            fVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0730p pVar = this.f9410a;
        if (pVar != null) {
            return pVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0730p pVar = this.f9410a;
        if (pVar != null) {
            return pVar.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C0684R0 r02;
        f fVar = this.f9411b;
        if (fVar == null || (r02 = (C0684R0) fVar.d) == null) {
            return null;
        }
        return r02.f9229a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C0684R0 r02;
        f fVar = this.f9411b;
        if (fVar == null || (r02 = (C0684R0) fVar.d) == null) {
            return null;
        }
        return r02.f9230b;
    }

    public final boolean hasOverlappingRendering() {
        if ((((ImageView) this.f9411b.f30c).getBackground() instanceof RippleDrawable) || !super.hasOverlappingRendering()) {
            return false;
        }
        return true;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0730p pVar = this.f9410a;
        if (pVar != null) {
            pVar.e();
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0730p pVar = this.f9410a;
        if (pVar != null) {
            pVar.f(i2);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        f fVar = this.f9411b;
        if (fVar != null) {
            fVar.a();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        f fVar = this.f9411b;
        if (!(fVar == null || drawable == null || this.f9412c)) {
            fVar.f29b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (fVar != null) {
            fVar.a();
            if (!this.f9412c) {
                ImageView imageView = (ImageView) fVar.f30c;
                if (imageView.getDrawable() != null) {
                    imageView.getDrawable().setLevel(fVar.f29b);
                }
            }
        }
    }

    public void setImageLevel(int i2) {
        super.setImageLevel(i2);
        this.f9412c = true;
    }

    public void setImageResource(int i2) {
        f fVar = this.f9411b;
        ImageView imageView = (ImageView) fVar.f30c;
        if (i2 != 0) {
            Drawable J5 = b.J(imageView.getContext(), i2);
            if (J5 != null) {
                C0725m0.a(J5);
            }
            imageView.setImageDrawable(J5);
        } else {
            imageView.setImageDrawable((Drawable) null);
        }
        fVar.a();
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        f fVar = this.f9411b;
        if (fVar != null) {
            fVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0730p pVar = this.f9410a;
        if (pVar != null) {
            pVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0730p pVar = this.f9410a;
        if (pVar != null) {
            pVar.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        f fVar = this.f9411b;
        if (fVar != null) {
            if (((C0684R0) fVar.d) == null) {
                fVar.d = new Object();
            }
            C0684R0 r02 = (C0684R0) fVar.d;
            r02.f9229a = colorStateList;
            r02.d = true;
            fVar.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        f fVar = this.f9411b;
        if (fVar != null) {
            if (((C0684R0) fVar.d) == null) {
                fVar.d = new Object();
            }
            C0684R0 r02 = (C0684R0) fVar.d;
            r02.f9230b = mode;
            r02.f9231c = true;
            fVar.a();
        }
    }
}
