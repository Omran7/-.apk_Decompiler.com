package k;

import K.C0064d;
import K.C0066f;
import K.O;
import K.r;
import R2.b;
import U3.c;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import com.mtma.criminal.city.R;

/* renamed from: k.w  reason: case insensitive filesystem */
public class C0744w extends EditText implements r {

    /* renamed from: a  reason: collision with root package name */
    public final C0730p f9395a;

    /* renamed from: b  reason: collision with root package name */
    public final C0695X f9396b;

    /* renamed from: c  reason: collision with root package name */
    public final C0654C f9397c;
    public final Q.r d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public final C0654C f9398e;

    /* renamed from: f  reason: collision with root package name */
    public C0742v f9399f;

    /* JADX WARNING: type inference failed for: r5v5, types: [Q.r, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0744w(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        C0683Q0.a(context);
        C0681P0.a(this, getContext());
        C0730p pVar = new C0730p(this);
        this.f9395a = pVar;
        pVar.d(attributeSet, R.attr.editTextStyle);
        C0695X x6 = new C0695X(this);
        this.f9396b = x6;
        x6.f(attributeSet, R.attr.editTextStyle);
        x6.b();
        C0654C c3 = new C0654C();
        c3.f9145b = this;
        this.f9397c = c3;
        C0654C c6 = new C0654C((EditText) this);
        this.f9398e = c6;
        c6.b(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener a6 = c6.a(keyListener);
            if (a6 != keyListener) {
                super.setKeyListener(a6);
                super.setRawInputType(inputType);
                super.setFocusable(isFocusable);
                super.setClickable(isClickable);
                super.setLongClickable(isLongClickable);
            }
        }
    }

    private C0742v getSuperCaller() {
        if (this.f9399f == null) {
            this.f9399f = new C0742v(this);
        }
        return this.f9399f;
    }

    public final C0066f a(C0066f fVar) {
        return this.d.a(this, fVar);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0730p pVar = this.f9395a;
        if (pVar != null) {
            pVar.a();
        }
        C0695X x6 = this.f9396b;
        if (x6 != null) {
            x6.b();
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return b.Y0(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0730p pVar = this.f9395a;
        if (pVar != null) {
            return pVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0730p pVar = this.f9395a;
        if (pVar != null) {
            return pVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f9396b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f9396b.e();
    }

    public TextClassifier getTextClassifier() {
        C0654C c3;
        if (Build.VERSION.SDK_INT >= 28 || (c3 = this.f9397c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c3.f9146c;
        if (textClassifier == null) {
            return C0685S.a((TextView) c3.f9145b);
        }
        return textClassifier;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0055, code lost:
        if (r1 != null) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006a, code lost:
        if (r1 != null) goto L_0x0057;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0071  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r8) {
        /*
            r7 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r8)
            k.X r1 = r7.f9396b
            r1.getClass()
            k.C0695X.h(r8, r0, r7)
            android.support.v4.media.session.a.n0(r8, r0, r7)
            if (r0 == 0) goto L_0x0077
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 > r2) goto L_0x0077
            java.lang.String[] r2 = K.O.f(r7)
            if (r2 == 0) goto L_0x0077
            java.lang.String r3 = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            java.lang.String r4 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            r5 = 25
            if (r1 < r5) goto L_0x0029
            r8.contentMimeTypes = r2
            goto L_0x003e
        L_0x0029:
            android.os.Bundle r6 = r8.extras
            if (r6 != 0) goto L_0x0034
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            r8.extras = r6
        L_0x0034:
            android.os.Bundle r6 = r8.extras
            r6.putStringArray(r4, r2)
            android.os.Bundle r6 = r8.extras
            r6.putStringArray(r3, r2)
        L_0x003e:
            F3.e r2 = new F3.e
            r6 = 1
            r2.<init>((java.lang.Object) r7, (int) r6)
            if (r1 < r5) goto L_0x004d
            P.d r1 = new P.d
            r1.<init>(r0, r2)
        L_0x004b:
            r0 = r1
            goto L_0x0077
        L_0x004d:
            java.lang.String[] r6 = P.c.f2122a
            if (r1 < r5) goto L_0x0059
            java.lang.String[] r1 = r8.contentMimeTypes
            if (r1 == 0) goto L_0x006d
        L_0x0057:
            r6 = r1
            goto L_0x006d
        L_0x0059:
            android.os.Bundle r1 = r8.extras
            if (r1 != 0) goto L_0x005e
            goto L_0x006d
        L_0x005e:
            java.lang.String[] r1 = r1.getStringArray(r4)
            if (r1 != 0) goto L_0x006a
            android.os.Bundle r1 = r8.extras
            java.lang.String[] r1 = r1.getStringArray(r3)
        L_0x006a:
            if (r1 == 0) goto L_0x006d
            goto L_0x0057
        L_0x006d:
            int r1 = r6.length
            if (r1 != 0) goto L_0x0071
            goto L_0x0077
        L_0x0071:
            P.e r1 = new P.e
            r1.<init>(r0, r2)
            goto L_0x004b
        L_0x0077:
            k.C r1 = r7.f9398e
            W.b r8 = r1.c(r0, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: k.C0744w.onCreateInputConnection(android.view.inputmethod.EditorInfo):android.view.inputmethod.InputConnection");
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30 && i2 < 33) {
            ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
        }
    }

    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean z3 = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && O.f(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                } else if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                z3 = C0660F.a(dragEvent, this, activity);
            }
        }
        if (z3) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    public final boolean onTextContextMenuItem(int i2) {
        ClipData clipData;
        c cVar;
        int i5;
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 31 || O.f(this) == null || (i2 != 16908322 && i2 != 16908337)) {
            return super.onTextContextMenuItem(i2);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        if (clipboardManager == null) {
            clipData = null;
        } else {
            clipData = clipboardManager.getPrimaryClip();
        }
        if (clipData != null && clipData.getItemCount() > 0) {
            if (i6 >= 31) {
                cVar = new c(clipData, 1);
            } else {
                C0064d dVar = new C0064d();
                dVar.f1377b = clipData;
                dVar.f1378c = 1;
                cVar = dVar;
            }
            if (i2 == 16908322) {
                i5 = 0;
            } else {
                i5 = 1;
            }
            cVar.f(i5);
            O.h(this, cVar.a());
        }
        return true;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0730p pVar = this.f9395a;
        if (pVar != null) {
            pVar.e();
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0730p pVar = this.f9395a;
        if (pVar != null) {
            pVar.f(i2);
        }
    }

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0695X x6 = this.f9396b;
        if (x6 != null) {
            x6.b();
        }
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0695X x6 = this.f9396b;
        if (x6 != null) {
            x6.b();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(b.d1(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z3) {
        this.f9398e.d(z3);
    }

    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f9398e.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0730p pVar = this.f9395a;
        if (pVar != null) {
            pVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0730p pVar = this.f9395a;
        if (pVar != null) {
            pVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0695X x6 = this.f9396b;
        x6.l(colorStateList);
        x6.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0695X x6 = this.f9396b;
        x6.m(mode);
        x6.b();
    }

    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        C0695X x6 = this.f9396b;
        if (x6 != null) {
            x6.g(context, i2);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        C0654C c3;
        if (Build.VERSION.SDK_INT >= 28 || (c3 = this.f9397c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c3.f9146c = textClassifier;
        }
    }

    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }
}
