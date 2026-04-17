package k;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: k.h0  reason: case insensitive filesystem */
public final class C0715h0 {

    /* renamed from: l  reason: collision with root package name */
    public static final RectF f9302l = new RectF();

    /* renamed from: m  reason: collision with root package name */
    public static final ConcurrentHashMap f9303m = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    public int f9304a = 0;

    /* renamed from: b  reason: collision with root package name */
    public boolean f9305b = false;

    /* renamed from: c  reason: collision with root package name */
    public float f9306c = -1.0f;
    public float d = -1.0f;

    /* renamed from: e  reason: collision with root package name */
    public float f9307e = -1.0f;

    /* renamed from: f  reason: collision with root package name */
    public int[] f9308f = new int[0];
    public boolean g = false;
    public TextPaint h;

    /* renamed from: i  reason: collision with root package name */
    public final TextView f9309i;

    /* renamed from: j  reason: collision with root package name */
    public final Context f9310j;

    /* renamed from: k  reason: collision with root package name */
    public final C0707d0 f9311k;

    public C0715h0(TextView textView) {
        this.f9309i = textView;
        this.f9310j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f9311k = new C0711f0();
        } else {
            this.f9311k = new C0707d0();
        }
    }

    public static int[] b(int[] iArr) {
        if (r0 == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i2 : iArr) {
            if (i2 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i2)) < 0) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        if (r0 == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i5 = 0; i5 < size; i5++) {
            iArr2[i5] = ((Integer) arrayList.get(i5)).intValue();
        }
        return iArr2;
    }

    public static Method d(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = f9303m;
            Method method = (Method) concurrentHashMap.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, (Class[]) null)) != null) {
                method.setAccessible(true);
                concurrentHashMap.put(str, method);
            }
            return method;
        } catch (Exception e6) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e6);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        android.util.Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + r2 + "() method", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        return r4;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object e(java.lang.String r2, java.lang.Object r3, java.lang.Object r4) {
        /*
            java.lang.reflect.Method r0 = d(r2)     // Catch:{ Exception -> 0x000c, all -> 0x000a }
            r1 = 0
            java.lang.Object r4 = r0.invoke(r3, r1)     // Catch:{ Exception -> 0x000c, all -> 0x000a }
            goto L_0x0027
        L_0x000a:
            r2 = move-exception
            goto L_0x000e
        L_0x000c:
            r3 = move-exception
            goto L_0x000f
        L_0x000e:
            throw r2
        L_0x000f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed to invoke TextView#"
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r2 = "() method"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "ACTVAutoSizeHelper"
            android.util.Log.w(r0, r2, r3)
        L_0x0027:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: k.C0715h0.e(java.lang.String, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final void a() {
        int i2;
        if (f()) {
            if (this.f9305b) {
                if (this.f9309i.getMeasuredHeight() > 0 && this.f9309i.getMeasuredWidth() > 0) {
                    if (this.f9311k.b(this.f9309i)) {
                        i2 = 1048576;
                    } else {
                        i2 = (this.f9309i.getMeasuredWidth() - this.f9309i.getTotalPaddingLeft()) - this.f9309i.getTotalPaddingRight();
                    }
                    int height = (this.f9309i.getHeight() - this.f9309i.getCompoundPaddingBottom()) - this.f9309i.getCompoundPaddingTop();
                    if (i2 > 0 && height > 0) {
                        RectF rectF = f9302l;
                        synchronized (rectF) {
                            try {
                                rectF.setEmpty();
                                rectF.right = (float) i2;
                                rectF.bottom = (float) height;
                                float c3 = (float) c(rectF);
                                if (c3 != this.f9309i.getTextSize()) {
                                    g(0, c3);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f9305b = true;
        }
    }

    public final int c(RectF rectF) {
        CharSequence transformation;
        RectF rectF2 = rectF;
        int length = this.f9308f.length;
        if (length != 0) {
            int i2 = length - 1;
            int i5 = 0;
            int i6 = 1;
            while (i6 <= i2) {
                int i7 = (i6 + i2) / 2;
                int i8 = this.f9308f[i7];
                TextView textView = this.f9309i;
                CharSequence text = textView.getText();
                TransformationMethod transformationMethod = textView.getTransformationMethod();
                if (!(transformationMethod == null || (transformation = transformationMethod.getTransformation(text, textView)) == null)) {
                    text = transformation;
                }
                int maxLines = textView.getMaxLines();
                TextPaint textPaint = this.h;
                if (textPaint == null) {
                    this.h = new TextPaint();
                } else {
                    textPaint.reset();
                }
                this.h.set(textView.getPaint());
                this.h.setTextSize((float) i8);
                StaticLayout a6 = C0705c0.a(text, (Layout.Alignment) e("getLayoutAlignment", textView, Layout.Alignment.ALIGN_NORMAL), Math.round(rectF2.right), maxLines, this.f9309i, this.h, this.f9311k);
                if ((maxLines == -1 || (a6.getLineCount() <= maxLines && a6.getLineEnd(a6.getLineCount() - 1) == text.length())) && ((float) a6.getHeight()) <= rectF2.bottom) {
                    int i9 = i7 + 1;
                    i5 = i6;
                    i6 = i9;
                } else {
                    i5 = i7 - 1;
                    i2 = i5;
                }
            }
            return this.f9308f[i5];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    public final boolean f() {
        if (!j() || this.f9304a == 0) {
            return false;
        }
        return true;
    }

    public final void g(int i2, float f6) {
        Resources resources;
        Context context = this.f9310j;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        float applyDimension = TypedValue.applyDimension(i2, f6, resources.getDisplayMetrics());
        TextView textView = this.f9309i;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean isInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.f9305b = false;
                try {
                    Method d6 = d("nullLayouts");
                    if (d6 != null) {
                        d6.invoke(textView, (Object[]) null);
                    }
                } catch (Exception e6) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e6);
                }
                if (!isInLayout) {
                    textView.requestLayout();
                } else {
                    textView.forceLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean h() {
        if (!j() || this.f9304a != 1) {
            this.f9305b = false;
        } else {
            if (!this.g || this.f9308f.length == 0) {
                int floor = ((int) Math.floor((double) ((this.f9307e - this.d) / this.f9306c))) + 1;
                int[] iArr = new int[floor];
                for (int i2 = 0; i2 < floor; i2++) {
                    iArr[i2] = Math.round((((float) i2) * this.f9306c) + this.d);
                }
                this.f9308f = b(iArr);
            }
            this.f9305b = true;
        }
        return this.f9305b;
    }

    public final boolean i() {
        boolean z3;
        int[] iArr = this.f9308f;
        int length = iArr.length;
        if (length > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.g = z3;
        if (z3) {
            this.f9304a = 1;
            this.d = (float) iArr[0];
            this.f9307e = (float) iArr[length - 1];
            this.f9306c = -1.0f;
        }
        return z3;
    }

    public final boolean j() {
        return !(this.f9309i instanceof C0744w);
    }

    public final void k(float f6, float f7, float f8) {
        if (f6 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f6 + "px) is less or equal to (0px)");
        } else if (f7 <= f6) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f7 + "px) is less or equal to minimum auto-size text size (" + f6 + "px)");
        } else if (f8 > 0.0f) {
            this.f9304a = 1;
            this.d = f6;
            this.f9307e = f7;
            this.f9306c = f8;
            this.g = false;
        } else {
            throw new IllegalArgumentException("The auto-size step granularity (" + f8 + "px) is less or equal to (0px)");
        }
    }
}
