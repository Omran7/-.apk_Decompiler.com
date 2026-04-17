package u0;

import B.i;
import B.p;
import D.a;
import K.W;
import M0.b;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.util.ArrayList;
import n.j;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: u0.e  reason: case insensitive filesystem */
public final class C1018e extends C1019f implements Animatable {

    /* renamed from: b  reason: collision with root package name */
    public final C1017d f11784b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f11785c;
    public W d = null;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList f11786e = null;

    /* renamed from: f  reason: collision with root package name */
    public final C1016c f11787f = new C1016c(this);

    /* JADX WARNING: type inference failed for: r2v1, types: [android.graphics.drawable.Drawable$ConstantState, u0.d] */
    public C1018e(Context context) {
        this.f11785c = context;
        this.f11784b = new Drawable.ConstantState();
    }

    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f11788a;
        if (drawable != null) {
            a.a(drawable, theme);
        }
    }

    public final boolean canApplyTheme() {
        Drawable drawable = this.f11788a;
        if (drawable != null) {
            return a.b(drawable);
        }
        return false;
    }

    public final void draw(Canvas canvas) {
        Drawable drawable = this.f11788a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        C1017d dVar = this.f11784b;
        dVar.f11781a.draw(canvas);
        if (dVar.f11782b.isStarted()) {
            invalidateSelf();
        }
    }

    public final int getAlpha() {
        Drawable drawable = this.f11788a;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.f11784b.f11781a.getAlpha();
    }

    public final int getChangingConfigurations() {
        Drawable drawable = this.f11788a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f11784b.getClass();
        return changingConfigurations;
    }

    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f11788a;
        if (drawable != null) {
            return a.c(drawable);
        }
        return this.f11784b.f11781a.getColorFilter();
    }

    public final Drawable.ConstantState getConstantState() {
        if (this.f11788a != null) {
            return new b(this.f11788a.getConstantState(), 1);
        }
        return null;
    }

    public final int getIntrinsicHeight() {
        Drawable drawable = this.f11788a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.f11784b.f11781a.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        Drawable drawable = this.f11788a;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.f11784b.f11781a.getIntrinsicWidth();
    }

    public final int getOpacity() {
        Drawable drawable = this.f11788a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.f11784b.f11781a.getOpacity();
    }

    /* JADX WARNING: type inference failed for: r7v8, types: [n.e, n.j] */
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C1017d dVar;
        Drawable drawable = this.f11788a;
        if (drawable != null) {
            a.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            dVar = this.f11784b;
            if (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    if ("animated-vector".equals(name)) {
                        TypedArray f6 = B.b.f(resources, theme, attributeSet, C1014a.f11777e);
                        int resourceId = f6.getResourceId(0, 0);
                        if (resourceId != 0) {
                            C1028o oVar = new C1028o();
                            ThreadLocal threadLocal = p.f164a;
                            oVar.f11788a = i.a(resources, resourceId, theme);
                            new C1027n(oVar.f11788a.getConstantState());
                            oVar.f11835f = false;
                            oVar.setCallback(this.f11787f);
                            C1028o oVar2 = dVar.f11781a;
                            if (oVar2 != null) {
                                oVar2.setCallback((Drawable.Callback) null);
                            }
                            dVar.f11781a = oVar;
                        }
                        f6.recycle();
                    } else if ("target".equals(name)) {
                        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, C1014a.f11778f);
                        String string = obtainAttributes.getString(0);
                        int resourceId2 = obtainAttributes.getResourceId(1, 0);
                        if (resourceId2 != 0) {
                            Context context = this.f11785c;
                            if (context != null) {
                                Animator loadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
                                loadAnimator.setTarget(dVar.f11781a.f11832b.f11822b.f11820o.get(string));
                                if (dVar.f11783c == null) {
                                    dVar.f11783c = new ArrayList();
                                    dVar.d = new j(0);
                                }
                                dVar.f11783c.add(loadAnimator);
                                dVar.d.put(loadAnimator, string);
                            } else {
                                obtainAttributes.recycle();
                                throw new IllegalStateException("Context can't be null when inflating animators");
                            }
                        }
                        obtainAttributes.recycle();
                    } else {
                        continue;
                    }
                }
                eventType = xmlPullParser.next();
            }
        }
        if (dVar.f11782b == null) {
            dVar.f11782b = new AnimatorSet();
        }
        dVar.f11782b.playTogether(dVar.f11783c);
    }

    public final boolean isAutoMirrored() {
        Drawable drawable = this.f11788a;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.f11784b.f11781a.isAutoMirrored();
    }

    public final boolean isRunning() {
        Drawable drawable = this.f11788a;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.f11784b.f11782b.isRunning();
    }

    public final boolean isStateful() {
        Drawable drawable = this.f11788a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.f11784b.f11781a.isStateful();
    }

    public final Drawable mutate() {
        Drawable drawable = this.f11788a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f11788a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f11784b.f11781a.setBounds(rect);
        }
    }

    public final boolean onLevelChange(int i2) {
        Drawable drawable = this.f11788a;
        if (drawable != null) {
            return drawable.setLevel(i2);
        }
        return this.f11784b.f11781a.setLevel(i2);
    }

    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f11788a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.f11784b.f11781a.setState(iArr);
    }

    public final void setAlpha(int i2) {
        Drawable drawable = this.f11788a;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else {
            this.f11784b.f11781a.setAlpha(i2);
        }
    }

    public final void setAutoMirrored(boolean z3) {
        Drawable drawable = this.f11788a;
        if (drawable != null) {
            drawable.setAutoMirrored(z3);
        } else {
            this.f11784b.f11781a.setAutoMirrored(z3);
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f11788a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f11784b.f11781a.setColorFilter(colorFilter);
        }
    }

    public final void setTint(int i2) {
        Drawable drawable = this.f11788a;
        if (drawable != null) {
            R2.b.S0(drawable, i2);
        } else {
            this.f11784b.f11781a.setTint(i2);
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f11788a;
        if (drawable != null) {
            a.h(drawable, colorStateList);
        } else {
            this.f11784b.f11781a.setTintList(colorStateList);
        }
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f11788a;
        if (drawable != null) {
            a.i(drawable, mode);
        } else {
            this.f11784b.f11781a.setTintMode(mode);
        }
    }

    public final boolean setVisible(boolean z3, boolean z4) {
        Drawable drawable = this.f11788a;
        if (drawable != null) {
            return drawable.setVisible(z3, z4);
        }
        this.f11784b.f11781a.setVisible(z3, z4);
        return super.setVisible(z3, z4);
    }

    public final void start() {
        Drawable drawable = this.f11788a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        C1017d dVar = this.f11784b;
        if (!dVar.f11782b.isStarted()) {
            dVar.f11782b.start();
            invalidateSelf();
        }
    }

    public final void stop() {
        Drawable drawable = this.f11788a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f11784b.f11782b.end();
        }
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
    }
}
