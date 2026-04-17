package k;

import R2.b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v4.media.session.a;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;

/* renamed from: k.s  reason: case insensitive filesystem */
public final class C0736s extends CheckedTextView {

    /* renamed from: a  reason: collision with root package name */
    public final C0738t f9368a = new C0738t(this);

    /* renamed from: b  reason: collision with root package name */
    public final C0730p f9369b;

    /* renamed from: c  reason: collision with root package name */
    public final C0695X f9370c;
    public C0746x d;

    /* JADX INFO: finally extract failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|(2:6|7)|9|10|(1:14)|15|(1:17)|18|(1:20)|21|22) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0068 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0736s(android.content.Context r9, android.util.AttributeSet r10) {
        /*
            r8 = this;
            k.C0683Q0.a(r9)
            r6 = 2130903230(0x7f0300be, float:1.7413272E38)
            r8.<init>(r9, r10, r6)
            android.content.Context r9 = r8.getContext()
            k.C0681P0.a(r8, r9)
            k.X r9 = new k.X
            r9.<init>(r8)
            r8.f9370c = r9
            r9.f(r10, r6)
            r9.b()
            k.p r9 = new k.p
            r9.<init>(r8)
            r8.f9369b = r9
            r9.d(r10, r6)
            k.t r9 = new k.t
            r9.<init>(r8)
            r8.f9368a = r9
            android.content.Context r9 = r8.getContext()
            int[] r2 = e.C0476a.f7540l
            c1.i r9 = c1.i.A(r9, r10, r2, r6)
            java.lang.Object r0 = r9.f5606c
            r7 = r0
            android.content.res.TypedArray r7 = (android.content.res.TypedArray) r7
            android.content.Context r1 = r8.getContext()
            java.lang.Object r0 = r9.f5606c
            r4 = r0
            android.content.res.TypedArray r4 = (android.content.res.TypedArray) r4
            r0 = r8
            r3 = r10
            r5 = r6
            K.O.k(r0, r1, r2, r3, r4, r5)
            r0 = 1
            boolean r1 = r7.hasValue(r0)     // Catch:{ all -> 0x0066 }
            r2 = 0
            if (r1 == 0) goto L_0x0068
            int r0 = r7.getResourceId(r0, r2)     // Catch:{ all -> 0x0066 }
            if (r0 == 0) goto L_0x0068
            android.content.Context r1 = r8.getContext()     // Catch:{ NotFoundException -> 0x0068 }
            android.graphics.drawable.Drawable r0 = R2.b.J(r1, r0)     // Catch:{ NotFoundException -> 0x0068 }
            r8.setCheckMarkDrawable((android.graphics.drawable.Drawable) r0)     // Catch:{ NotFoundException -> 0x0068 }
            goto L_0x007f
        L_0x0066:
            r10 = move-exception
            goto L_0x00ac
        L_0x0068:
            boolean r0 = r7.hasValue(r2)     // Catch:{ all -> 0x0066 }
            if (r0 == 0) goto L_0x007f
            int r0 = r7.getResourceId(r2, r2)     // Catch:{ all -> 0x0066 }
            if (r0 == 0) goto L_0x007f
            android.content.Context r1 = r8.getContext()     // Catch:{ all -> 0x0066 }
            android.graphics.drawable.Drawable r0 = R2.b.J(r1, r0)     // Catch:{ all -> 0x0066 }
            r8.setCheckMarkDrawable((android.graphics.drawable.Drawable) r0)     // Catch:{ all -> 0x0066 }
        L_0x007f:
            r0 = 2
            boolean r1 = r7.hasValue(r0)     // Catch:{ all -> 0x0066 }
            if (r1 == 0) goto L_0x008d
            android.content.res.ColorStateList r0 = r9.m(r0)     // Catch:{ all -> 0x0066 }
            r8.setCheckMarkTintList(r0)     // Catch:{ all -> 0x0066 }
        L_0x008d:
            r0 = 3
            boolean r1 = r7.hasValue(r0)     // Catch:{ all -> 0x0066 }
            if (r1 == 0) goto L_0x00a1
            r1 = -1
            int r0 = r7.getInt(r0, r1)     // Catch:{ all -> 0x0066 }
            r1 = 0
            android.graphics.PorterDuff$Mode r0 = k.C0725m0.b(r0, r1)     // Catch:{ all -> 0x0066 }
            r8.setCheckMarkTintMode(r0)     // Catch:{ all -> 0x0066 }
        L_0x00a1:
            r9.G()
            k.x r9 = r8.getEmojiTextViewHelper()
            r9.a(r10, r6)
            return
        L_0x00ac:
            r9.G()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: k.C0736s.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private C0746x getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new C0746x(this);
        }
        return this.d;
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0695X x6 = this.f9370c;
        if (x6 != null) {
            x6.b();
        }
        C0730p pVar = this.f9369b;
        if (pVar != null) {
            pVar.a();
        }
        C0738t tVar = this.f9368a;
        if (tVar != null) {
            tVar.b();
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return b.Y0(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0730p pVar = this.f9369b;
        if (pVar != null) {
            return pVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0730p pVar = this.f9369b;
        if (pVar != null) {
            return pVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C0738t tVar = this.f9368a;
        if (tVar != null) {
            return (ColorStateList) tVar.f9373a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C0738t tVar = this.f9368a;
        if (tVar != null) {
            return (PorterDuff.Mode) tVar.f9374b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f9370c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f9370c.e();
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        a.n0(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    public void setAllCaps(boolean z3) {
        super.setAllCaps(z3);
        getEmojiTextViewHelper().b(z3);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0730p pVar = this.f9369b;
        if (pVar != null) {
            pVar.e();
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0730p pVar = this.f9369b;
        if (pVar != null) {
            pVar.f(i2);
        }
    }

    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C0738t tVar = this.f9368a;
        if (tVar == null) {
            return;
        }
        if (tVar.f9376e) {
            tVar.f9376e = false;
            return;
        }
        tVar.f9376e = true;
        tVar.b();
    }

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0695X x6 = this.f9370c;
        if (x6 != null) {
            x6.b();
        }
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0695X x6 = this.f9370c;
        if (x6 != null) {
            x6.b();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(b.d1(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z3) {
        getEmojiTextViewHelper().c(z3);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0730p pVar = this.f9369b;
        if (pVar != null) {
            pVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0730p pVar = this.f9369b;
        if (pVar != null) {
            pVar.i(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C0738t tVar = this.f9368a;
        if (tVar != null) {
            tVar.f9373a = colorStateList;
            tVar.f9375c = true;
            tVar.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C0738t tVar = this.f9368a;
        if (tVar != null) {
            tVar.f9374b = mode;
            tVar.d = true;
            tVar.b();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0695X x6 = this.f9370c;
        x6.l(colorStateList);
        x6.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0695X x6 = this.f9370c;
        x6.m(mode);
        x6.b();
    }

    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        C0695X x6 = this.f9370c;
        if (x6 != null) {
            x6.g(context, i2);
        }
    }

    public void setCheckMarkDrawable(int i2) {
        setCheckMarkDrawable(b.J(getContext(), i2));
    }
}
