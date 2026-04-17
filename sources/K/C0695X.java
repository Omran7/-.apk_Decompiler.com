package k;

import A.h;
import K.O;
import P.b;
import P.c;
import Q.m;
import Q.p;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import c1.i;
import com.google.android.gms.internal.measurement.a;
import e.C0476a;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* renamed from: k.X  reason: case insensitive filesystem */
public final class C0695X {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f9242a;

    /* renamed from: b  reason: collision with root package name */
    public C0684R0 f9243b;

    /* renamed from: c  reason: collision with root package name */
    public C0684R0 f9244c;
    public C0684R0 d;

    /* renamed from: e  reason: collision with root package name */
    public C0684R0 f9245e;

    /* renamed from: f  reason: collision with root package name */
    public C0684R0 f9246f;
    public C0684R0 g;
    public C0684R0 h;

    /* renamed from: i  reason: collision with root package name */
    public final C0715h0 f9247i;

    /* renamed from: j  reason: collision with root package name */
    public int f9248j = 0;

    /* renamed from: k  reason: collision with root package name */
    public int f9249k = -1;

    /* renamed from: l  reason: collision with root package name */
    public Typeface f9250l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f9251m;

    public C0695X(TextView textView) {
        this.f9242a = textView;
        this.f9247i = new C0715h0(textView);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [k.R0, java.lang.Object] */
    public static C0684R0 c(Context context, C0740u uVar, int i2) {
        ColorStateList f6;
        synchronized (uVar) {
            f6 = uVar.f9391a.f(context, i2);
        }
        if (f6 == null) {
            return null;
        }
        ? obj = new Object();
        obj.d = true;
        obj.f9229a = f6;
        return obj;
    }

    public static void h(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        int i2;
        int i5;
        CharSequence charSequence;
        int i6 = Build.VERSION.SDK_INT;
        if (i6 < 30 && inputConnection != null) {
            CharSequence text = textView.getText();
            if (i6 >= 30) {
                b.a(editorInfo, text);
                return;
            }
            text.getClass();
            if (i6 >= 30) {
                b.a(editorInfo, text);
                return;
            }
            int i7 = editorInfo.initialSelStart;
            int i8 = editorInfo.initialSelEnd;
            if (i7 > i8) {
                i2 = i8;
            } else {
                i2 = i7;
            }
            if (i7 <= i8) {
                i7 = i8;
            }
            int length = text.length();
            if (i2 < 0 || i7 > length) {
                c.a(editorInfo, (CharSequence) null, 0, 0);
                return;
            }
            int i9 = editorInfo.inputType & 4095;
            if (i9 == 129 || i9 == 225 || i9 == 18) {
                c.a(editorInfo, (CharSequence) null, 0, 0);
            } else if (length <= 2048) {
                c.a(editorInfo, text, i2, i7);
            } else {
                int i10 = i7 - i2;
                if (i10 > 1024) {
                    i5 = 0;
                } else {
                    i5 = i10;
                }
                int i11 = 2048 - i5;
                int min = Math.min(text.length() - i7, i11 - Math.min(i2, (int) (((double) i11) * 0.8d)));
                int min2 = Math.min(i2, i11 - min);
                int i12 = i2 - min2;
                if (Character.isLowSurrogate(text.charAt(i12))) {
                    i12++;
                    min2--;
                }
                if (Character.isHighSurrogate(text.charAt((i7 + min) - 1))) {
                    min--;
                }
                int i13 = min2 + i5;
                int i14 = i13 + min;
                if (i5 != i10) {
                    charSequence = TextUtils.concat(new CharSequence[]{text.subSequence(i12, i12 + min2), text.subSequence(i7, min + i7)});
                } else {
                    charSequence = text.subSequence(i12, i14 + i12);
                }
                c.a(editorInfo, charSequence, min2, i13);
            }
        }
    }

    public final void a(Drawable drawable, C0684R0 r02) {
        if (drawable != null && r02 != null) {
            C0740u.e(drawable, r02, this.f9242a.getDrawableState());
        }
    }

    public final void b() {
        C0684R0 r02 = this.f9243b;
        TextView textView = this.f9242a;
        if (!(r02 == null && this.f9244c == null && this.d == null && this.f9245e == null)) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f9243b);
            a(compoundDrawables[1], this.f9244c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.f9245e);
        }
        if (this.f9246f != null || this.g != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            a(compoundDrawablesRelative[0], this.f9246f);
            a(compoundDrawablesRelative[2], this.g);
        }
    }

    public final ColorStateList d() {
        C0684R0 r02 = this.h;
        if (r02 != null) {
            return r02.f9229a;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        C0684R0 r02 = this.h;
        if (r02 != null) {
            return r02.f9230b;
        }
        return null;
    }

    public final void f(AttributeSet attributeSet, int i2) {
        String str;
        boolean z3;
        boolean z4;
        String str2;
        boolean z5;
        float f6;
        float f7;
        float f8;
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4;
        Drawable drawable5;
        Drawable drawable6;
        int i5;
        int i6;
        int i7;
        float f9;
        ColorStateList colorStateList;
        int resourceId;
        int i8;
        int resourceId2;
        int i9;
        AttributeSet attributeSet2 = attributeSet;
        int i10 = i2;
        TextView textView = this.f9242a;
        Context context = textView.getContext();
        C0740u a6 = C0740u.a();
        int[] iArr = C0476a.h;
        i A6 = i.A(context, attributeSet2, iArr, i10);
        O.k(textView, textView.getContext(), iArr, attributeSet, (TypedArray) A6.f5606c, i2);
        TypedArray typedArray = (TypedArray) A6.f5606c;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f9243b = c(context, a6, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f9244c = c(context, a6, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.d = c(context, a6, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f9245e = c(context, a6, typedArray.getResourceId(2, 0));
        }
        if (typedArray.hasValue(5)) {
            this.f9246f = c(context, a6, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.g = c(context, a6, typedArray.getResourceId(6, 0));
        }
        A6.G();
        boolean z6 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = C0476a.f7550v;
        if (resourceId3 != -1) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            i iVar = new i(context, obtainStyledAttributes);
            if (z6 || !obtainStyledAttributes.hasValue(14)) {
                z4 = false;
                z3 = false;
            } else {
                z4 = obtainStyledAttributes.getBoolean(14, false);
                z3 = true;
            }
            n(context, iVar);
            int i11 = Build.VERSION.SDK_INT;
            if (obtainStyledAttributes.hasValue(15)) {
                str = obtainStyledAttributes.getString(15);
                i9 = 26;
            } else {
                i9 = 26;
                str = null;
            }
            if (i11 < i9 || !obtainStyledAttributes.hasValue(13)) {
                str2 = null;
            } else {
                str2 = obtainStyledAttributes.getString(13);
            }
            iVar.G();
        } else {
            z4 = false;
            z3 = false;
            str2 = null;
            str = null;
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet2, iArr2, i10, 0);
        i iVar2 = new i(context, obtainStyledAttributes2);
        if (z6 || !obtainStyledAttributes2.hasValue(14)) {
            z5 = z4;
        } else {
            z5 = obtainStyledAttributes2.getBoolean(14, false);
            z3 = true;
        }
        int i12 = Build.VERSION.SDK_INT;
        if (obtainStyledAttributes2.hasValue(15)) {
            str = obtainStyledAttributes2.getString(15);
        }
        if (i12 >= 26) {
            if (obtainStyledAttributes2.hasValue(13)) {
                str2 = obtainStyledAttributes2.getString(13);
            }
        }
        if (i12 >= 28 && obtainStyledAttributes2.hasValue(0) && obtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, iVar2);
        iVar2.G();
        if (!z6 && z3) {
            textView.setAllCaps(z5);
        }
        Typeface typeface = this.f9250l;
        if (typeface != null) {
            if (this.f9249k == -1) {
                textView.setTypeface(typeface, this.f9248j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (str2 != null) {
            C0691V.d(textView, str2);
        }
        if (str != null) {
            C0689U.b(textView, C0689U.a(str));
        }
        int[] iArr3 = C0476a.f7537i;
        C0715h0 h0Var = this.f9247i;
        Context context2 = h0Var.f9310j;
        TypedArray obtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet2, iArr3, i10, 0);
        TextView textView2 = h0Var.f9309i;
        TypedArray typedArray2 = obtainStyledAttributes3;
        Context context3 = context2;
        C0715h0 h0Var2 = h0Var;
        O.k(textView2, textView2.getContext(), iArr3, attributeSet, typedArray2, i2);
        TypedArray typedArray3 = typedArray2;
        if (typedArray3.hasValue(5)) {
            h0Var2.f9304a = typedArray3.getInt(5, 0);
        }
        if (typedArray3.hasValue(4)) {
            f6 = typedArray3.getDimension(4, -1.0f);
        } else {
            f6 = -1.0f;
        }
        if (typedArray3.hasValue(2)) {
            f7 = typedArray3.getDimension(2, -1.0f);
        } else {
            f7 = -1.0f;
        }
        if (typedArray3.hasValue(1)) {
            f8 = typedArray3.getDimension(1, -1.0f);
        } else {
            f8 = -1.0f;
        }
        if (typedArray3.hasValue(3) && (resourceId2 = typedArray3.getResourceId(3, 0)) > 0) {
            TypedArray obtainTypedArray = typedArray3.getResources().obtainTypedArray(resourceId2);
            int length = obtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i13 = 0; i13 < length; i13++) {
                    iArr4[i13] = obtainTypedArray.getDimensionPixelSize(i13, -1);
                }
                h0Var2.f9308f = C0715h0.b(iArr4);
                h0Var2.i();
            }
            obtainTypedArray.recycle();
        }
        typedArray3.recycle();
        if (!h0Var2.j()) {
            h0Var2.f9304a = 0;
        } else if (h0Var2.f9304a == 1) {
            if (!h0Var2.g) {
                DisplayMetrics displayMetrics = context3.getResources().getDisplayMetrics();
                if (f7 == -1.0f) {
                    i8 = 2;
                    f7 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i8 = 2;
                }
                if (f8 == -1.0f) {
                    f8 = TypedValue.applyDimension(i8, 112.0f, displayMetrics);
                }
                if (f6 == -1.0f) {
                    f6 = 1.0f;
                }
                h0Var2.k(f7, f8, f6);
            }
            h0Var2.h();
        }
        if (i1.f9317c && h0Var2.f9304a != 0) {
            int[] iArr5 = h0Var2.f9308f;
            if (iArr5.length > 0) {
                if (((float) C0691V.a(textView)) != -1.0f) {
                    C0691V.b(textView, Math.round(h0Var2.d), Math.round(h0Var2.f9307e), Math.round(h0Var2.f9306c), 0);
                } else {
                    C0691V.c(textView, iArr5, 0);
                }
            }
        }
        TypedArray obtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet2, iArr3);
        int resourceId4 = obtainStyledAttributes4.getResourceId(8, -1);
        if (resourceId4 != -1) {
            drawable = a6.b(context, resourceId4);
        } else {
            drawable = null;
        }
        int resourceId5 = obtainStyledAttributes4.getResourceId(13, -1);
        if (resourceId5 != -1) {
            drawable2 = a6.b(context, resourceId5);
        } else {
            drawable2 = null;
        }
        int resourceId6 = obtainStyledAttributes4.getResourceId(9, -1);
        if (resourceId6 != -1) {
            drawable3 = a6.b(context, resourceId6);
        } else {
            drawable3 = null;
        }
        int resourceId7 = obtainStyledAttributes4.getResourceId(6, -1);
        if (resourceId7 != -1) {
            drawable4 = a6.b(context, resourceId7);
        } else {
            drawable4 = null;
        }
        int resourceId8 = obtainStyledAttributes4.getResourceId(10, -1);
        if (resourceId8 != -1) {
            drawable5 = a6.b(context, resourceId8);
        } else {
            drawable5 = null;
        }
        int resourceId9 = obtainStyledAttributes4.getResourceId(7, -1);
        if (resourceId9 != -1) {
            drawable6 = a6.b(context, resourceId9);
        } else {
            drawable6 = null;
        }
        if (drawable5 != null || drawable6 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
        } else if (!(drawable == null && drawable2 == null && drawable3 == null && drawable4 == null)) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable7 = compoundDrawablesRelative2[0];
            if (drawable7 == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawable == null) {
                    drawable = compoundDrawables[0];
                }
                if (drawable2 == null) {
                    drawable2 = compoundDrawables[1];
                }
                if (drawable3 == null) {
                    drawable3 = compoundDrawables[2];
                }
                if (drawable4 == null) {
                    drawable4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            } else {
                if (drawable2 == null) {
                    drawable2 = compoundDrawablesRelative2[1];
                }
                if (drawable4 == null) {
                    drawable4 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, compoundDrawablesRelative2[2], drawable4);
            }
        }
        if (obtainStyledAttributes4.hasValue(11)) {
            if (!obtainStyledAttributes4.hasValue(11) || (resourceId = obtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = h.getColorStateList(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes4.getColorStateList(11);
            }
            m.f(textView, colorStateList);
        }
        if (obtainStyledAttributes4.hasValue(12)) {
            i5 = -1;
            m.g(textView, C0725m0.b(obtainStyledAttributes4.getInt(12, -1), (PorterDuff.Mode) null));
        } else {
            i5 = -1;
        }
        int dimensionPixelSize = obtainStyledAttributes4.getDimensionPixelSize(15, i5);
        int dimensionPixelSize2 = obtainStyledAttributes4.getDimensionPixelSize(18, i5);
        if (obtainStyledAttributes4.hasValue(19)) {
            TypedValue peekValue = obtainStyledAttributes4.peekValue(19);
            if (peekValue == null || peekValue.type != 5) {
                i7 = -1;
                f9 = (float) obtainStyledAttributes4.getDimensionPixelSize(19, -1);
                i6 = -1;
            } else {
                int i14 = peekValue.data;
                int i15 = i14 & 15;
                f9 = TypedValue.complexToFloat(i14);
                i6 = i15;
                i7 = -1;
            }
        } else {
            i7 = -1;
            i6 = -1;
            f9 = -1.0f;
        }
        obtainStyledAttributes4.recycle();
        if (dimensionPixelSize != i7) {
            R2.b.O0(textView, dimensionPixelSize);
        }
        if (dimensionPixelSize2 != i7) {
            R2.b.Q0(textView, dimensionPixelSize2);
        }
        if (f9 == -1.0f) {
            return;
        }
        if (i6 == i7) {
            R2.b.R0(textView, (int) f9);
        } else if (Build.VERSION.SDK_INT >= 34) {
            p.a(textView, i6, f9);
        } else {
            R2.b.R0(textView, Math.round(TypedValue.applyDimension(i6, f9, textView.getResources().getDisplayMetrics())));
        }
    }

    public final void g(Context context, int i2) {
        String string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, C0476a.f7550v);
        i iVar = new i(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.f9242a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        int i5 = Build.VERSION.SDK_INT;
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, iVar);
        if (i5 >= 26 && obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            C0691V.d(textView, string);
        }
        iVar.G();
        Typeface typeface = this.f9250l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f9248j);
        }
    }

    public final void i(int i2, int i5, int i6, int i7) {
        C0715h0 h0Var = this.f9247i;
        if (h0Var.j()) {
            DisplayMetrics displayMetrics = h0Var.f9310j.getResources().getDisplayMetrics();
            h0Var.k(TypedValue.applyDimension(i7, (float) i2, displayMetrics), TypedValue.applyDimension(i7, (float) i5, displayMetrics), TypedValue.applyDimension(i7, (float) i6, displayMetrics));
            if (h0Var.h()) {
                h0Var.a();
            }
        }
    }

    public final void j(int[] iArr, int i2) {
        C0715h0 h0Var = this.f9247i;
        if (h0Var.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i2 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = h0Var.f9310j.getResources().getDisplayMetrics();
                    for (int i5 = 0; i5 < length; i5++) {
                        iArr2[i5] = Math.round(TypedValue.applyDimension(i2, (float) iArr[i5], displayMetrics));
                    }
                }
                h0Var.f9308f = C0715h0.b(iArr2);
                if (!h0Var.i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                h0Var.g = false;
            }
            if (h0Var.h()) {
                h0Var.a();
            }
        }
    }

    public final void k(int i2) {
        C0715h0 h0Var = this.f9247i;
        if (!h0Var.j()) {
            return;
        }
        if (i2 == 0) {
            h0Var.f9304a = 0;
            h0Var.d = -1.0f;
            h0Var.f9307e = -1.0f;
            h0Var.f9306c = -1.0f;
            h0Var.f9308f = new int[0];
            h0Var.f9305b = false;
        } else if (i2 == 1) {
            DisplayMetrics displayMetrics = h0Var.f9310j.getResources().getDisplayMetrics();
            h0Var.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (h0Var.h()) {
                h0Var.a();
            }
        } else {
            throw new IllegalArgumentException(a.f(i2, "Unknown auto-size text type: "));
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [k.R0, java.lang.Object] */
    public final void l(ColorStateList colorStateList) {
        boolean z3;
        if (this.h == null) {
            this.h = new Object();
        }
        C0684R0 r02 = this.h;
        r02.f9229a = colorStateList;
        if (colorStateList != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        r02.d = z3;
        this.f9243b = r02;
        this.f9244c = r02;
        this.d = r02;
        this.f9245e = r02;
        this.f9246f = r02;
        this.g = r02;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [k.R0, java.lang.Object] */
    public final void m(PorterDuff.Mode mode) {
        boolean z3;
        if (this.h == null) {
            this.h = new Object();
        }
        C0684R0 r02 = this.h;
        r02.f9230b = mode;
        if (mode != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        r02.f9231c = z3;
        this.f9243b = r02;
        this.f9244c = r02;
        this.d = r02;
        this.f9245e = r02;
        this.f9246f = r02;
        this.g = r02;
    }

    public final void n(Context context, i iVar) {
        String string;
        boolean z3;
        boolean z4;
        int i2 = this.f9248j;
        TypedArray typedArray = (TypedArray) iVar.f5606c;
        this.f9248j = typedArray.getInt(2, i2);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 28) {
            int i6 = typedArray.getInt(11, -1);
            this.f9249k = i6;
            if (i6 != -1) {
                this.f9248j &= 2;
            }
        }
        int i7 = 10;
        boolean z5 = false;
        if (typedArray.hasValue(10) || typedArray.hasValue(12)) {
            this.f9250l = null;
            if (typedArray.hasValue(12)) {
                i7 = 12;
            }
            int i8 = this.f9249k;
            int i9 = this.f9248j;
            if (!context.isRestricted()) {
                try {
                    Typeface p6 = iVar.p(i7, this.f9248j, new C0687T(this, i8, i9, new WeakReference(this.f9242a)));
                    if (p6 != null) {
                        if (i5 < 28 || this.f9249k == -1) {
                            this.f9250l = p6;
                        } else {
                            Typeface create = Typeface.create(p6, 0);
                            int i10 = this.f9249k;
                            if ((this.f9248j & 2) != 0) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            this.f9250l = C0693W.a(create, i10, z4);
                        }
                    }
                    if (this.f9250l == null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    this.f9251m = z3;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f9250l == null && (string = typedArray.getString(i7)) != null) {
                if (Build.VERSION.SDK_INT < 28 || this.f9249k == -1) {
                    this.f9250l = Typeface.create(string, this.f9248j);
                    return;
                }
                Typeface create2 = Typeface.create(string, 0);
                int i11 = this.f9249k;
                if ((this.f9248j & 2) != 0) {
                    z5 = true;
                }
                this.f9250l = C0693W.a(create2, i11, z5);
            }
        } else if (typedArray.hasValue(1)) {
            this.f9251m = false;
            int i12 = typedArray.getInt(1, 1);
            if (i12 == 1) {
                this.f9250l = Typeface.SANS_SERIF;
            } else if (i12 == 2) {
                this.f9250l = Typeface.SERIF;
            } else if (i12 == 3) {
                this.f9250l = Typeface.MONOSPACE;
            }
        }
    }
}
