package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.api.f;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import m0.a0;
import q.C0926c;
import s.d;
import s.e;
import s.h;
import v.c;
import v.n;
import v.o;
import v.q;
import v.r;

public class ConstraintLayout extends ViewGroup {

    /* renamed from: y  reason: collision with root package name */
    public static r f4837y;

    /* renamed from: a  reason: collision with root package name */
    public final SparseArray f4838a = new SparseArray();

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f4839b = new ArrayList(4);

    /* renamed from: c  reason: collision with root package name */
    public final e f4840c = new e();
    public int d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f4841e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f4842f = f.API_PRIORITY_OTHER;

    /* renamed from: p  reason: collision with root package name */
    public int f4843p = f.API_PRIORITY_OTHER;

    /* renamed from: q  reason: collision with root package name */
    public boolean f4844q = true;

    /* renamed from: r  reason: collision with root package name */
    public int f4845r = 257;

    /* renamed from: s  reason: collision with root package name */
    public n f4846s = null;

    /* renamed from: t  reason: collision with root package name */
    public a0 f4847t = null;

    /* renamed from: u  reason: collision with root package name */
    public int f4848u = -1;

    /* renamed from: v  reason: collision with root package name */
    public HashMap f4849v = new HashMap();

    /* renamed from: w  reason: collision with root package name */
    public final SparseArray f4850w = new SparseArray();

    /* renamed from: x  reason: collision with root package name */
    public final v.f f4851x = new v.f(this, this);

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h(attributeSet, 0);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        if (max2 > 0) {
            return max2;
        }
        return max;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, v.r] */
    public static r getSharedValues() {
        if (f4837y == null) {
            ? obj = new Object();
            new SparseIntArray();
            new HashMap();
            f4837y = obj;
        }
        return f4837y;
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof v.e;
    }

    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f4839b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i2 = 0; i2 < size; i2++) {
                ((c) arrayList.get(i2)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = (float) getWidth();
            float height = (float) getHeight();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (!(childAt.getVisibility() == 8 || (tag = childAt.getTag()) == null || !(tag instanceof String))) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i6 = (int) ((((float) parseInt) / 1080.0f) * width);
                        int i7 = (int) ((((float) parseInt2) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f6 = (float) i6;
                        float f7 = (float) i7;
                        float f8 = (float) (i6 + ((int) ((((float) parseInt3) / 1080.0f) * width)));
                        Canvas canvas2 = canvas;
                        float f9 = f7;
                        float f10 = f7;
                        float f11 = f8;
                        float f12 = f6;
                        Paint paint2 = paint;
                        canvas2.drawLine(f6, f9, f11, f10, paint);
                        float parseInt4 = (float) (i7 + ((int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * height)));
                        float f13 = f8;
                        float f14 = parseInt4;
                        canvas2.drawLine(f13, f10, f11, f14, paint);
                        float f15 = parseInt4;
                        float f16 = f12;
                        canvas2.drawLine(f13, f15, f16, f14, paint);
                        float f17 = f12;
                        canvas2.drawLine(f17, f15, f16, f10, paint);
                        paint.setColor(-16711936);
                        float f18 = f8;
                        Paint paint3 = paint;
                        canvas2.drawLine(f17, f10, f18, parseInt4, paint);
                        canvas2.drawLine(f17, parseInt4, f18, f10, paint);
                    }
                }
            }
        }
    }

    public final void forceLayout() {
        this.f4844q = true;
        super.forceLayout();
    }

    public final d g(View view) {
        if (view == this) {
            return this.f4840c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof v.e) {
            return ((v.e) view.getLayoutParams()).f12013p0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof v.e) {
            return ((v.e) view.getLayoutParams()).f12013p0;
        }
        return null;
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new v.e();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, java.lang.Object, v.e] */
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ? marginLayoutParams = new ViewGroup.MarginLayoutParams(context, attributeSet);
        marginLayoutParams.f11985a = -1;
        marginLayoutParams.f11987b = -1;
        marginLayoutParams.f11989c = -1.0f;
        marginLayoutParams.d = true;
        marginLayoutParams.f11992e = -1;
        marginLayoutParams.f11994f = -1;
        marginLayoutParams.g = -1;
        marginLayoutParams.h = -1;
        marginLayoutParams.f11998i = -1;
        marginLayoutParams.f12000j = -1;
        marginLayoutParams.f12002k = -1;
        marginLayoutParams.f12004l = -1;
        marginLayoutParams.f12006m = -1;
        marginLayoutParams.f12008n = -1;
        marginLayoutParams.f12010o = -1;
        marginLayoutParams.f12012p = -1;
        marginLayoutParams.f12014q = 0;
        marginLayoutParams.f12015r = 0.0f;
        marginLayoutParams.f12016s = -1;
        marginLayoutParams.f12017t = -1;
        marginLayoutParams.f12018u = -1;
        marginLayoutParams.f12019v = -1;
        marginLayoutParams.f12020w = Integer.MIN_VALUE;
        marginLayoutParams.f12021x = Integer.MIN_VALUE;
        marginLayoutParams.f12022y = Integer.MIN_VALUE;
        marginLayoutParams.f12023z = Integer.MIN_VALUE;
        marginLayoutParams.f11960A = Integer.MIN_VALUE;
        marginLayoutParams.f11961B = Integer.MIN_VALUE;
        marginLayoutParams.f11962C = Integer.MIN_VALUE;
        marginLayoutParams.f11963D = 0;
        marginLayoutParams.f11964E = 0.5f;
        marginLayoutParams.F = 0.5f;
        marginLayoutParams.f11965G = null;
        marginLayoutParams.f11966H = -1.0f;
        marginLayoutParams.f11967I = -1.0f;
        marginLayoutParams.f11968J = 0;
        marginLayoutParams.f11969K = 0;
        marginLayoutParams.f11970L = 0;
        marginLayoutParams.f11971M = 0;
        marginLayoutParams.f11972N = 0;
        marginLayoutParams.f11973O = 0;
        marginLayoutParams.f11974P = 0;
        marginLayoutParams.f11975Q = 0;
        marginLayoutParams.f11976R = 1.0f;
        marginLayoutParams.f11977S = 1.0f;
        marginLayoutParams.f11978T = -1;
        marginLayoutParams.f11979U = -1;
        marginLayoutParams.f11980V = -1;
        marginLayoutParams.f11981W = false;
        marginLayoutParams.f11982X = false;
        marginLayoutParams.f11983Y = null;
        marginLayoutParams.f11984Z = 0;
        marginLayoutParams.f11986a0 = true;
        marginLayoutParams.f11988b0 = true;
        marginLayoutParams.f11990c0 = false;
        marginLayoutParams.f11991d0 = false;
        marginLayoutParams.f11993e0 = false;
        marginLayoutParams.f11995f0 = -1;
        marginLayoutParams.f11996g0 = -1;
        marginLayoutParams.f11997h0 = -1;
        marginLayoutParams.f11999i0 = -1;
        marginLayoutParams.f12001j0 = Integer.MIN_VALUE;
        marginLayoutParams.f12003k0 = Integer.MIN_VALUE;
        marginLayoutParams.f12005l0 = 0.5f;
        marginLayoutParams.f12013p0 = new d();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.f12138b);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            int i5 = v.d.f11959a.get(index);
            switch (i5) {
                case 1:
                    marginLayoutParams.f11980V = obtainStyledAttributes.getInt(index, marginLayoutParams.f11980V);
                    break;
                case 2:
                    int resourceId = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f12012p);
                    marginLayoutParams.f12012p = resourceId;
                    if (resourceId != -1) {
                        break;
                    } else {
                        marginLayoutParams.f12012p = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 3:
                    marginLayoutParams.f12014q = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f12014q);
                    break;
                case 4:
                    float f6 = obtainStyledAttributes.getFloat(index, marginLayoutParams.f12015r) % 360.0f;
                    marginLayoutParams.f12015r = f6;
                    if (f6 >= 0.0f) {
                        break;
                    } else {
                        marginLayoutParams.f12015r = (360.0f - f6) % 360.0f;
                        break;
                    }
                case 5:
                    marginLayoutParams.f11985a = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.f11985a);
                    break;
                case zzaky.zzf.zzf:
                    marginLayoutParams.f11987b = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.f11987b);
                    break;
                case zzaky.zzf.zzg:
                    marginLayoutParams.f11989c = obtainStyledAttributes.getFloat(index, marginLayoutParams.f11989c);
                    break;
                case 8:
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f11992e);
                    marginLayoutParams.f11992e = resourceId2;
                    if (resourceId2 != -1) {
                        break;
                    } else {
                        marginLayoutParams.f11992e = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 9:
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f11994f);
                    marginLayoutParams.f11994f = resourceId3;
                    if (resourceId3 != -1) {
                        break;
                    } else {
                        marginLayoutParams.f11994f = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 10:
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.g);
                    marginLayoutParams.g = resourceId4;
                    if (resourceId4 != -1) {
                        break;
                    } else {
                        marginLayoutParams.g = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case ModuleDescriptor.MODULE_VERSION:
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.h);
                    marginLayoutParams.h = resourceId5;
                    if (resourceId5 != -1) {
                        break;
                    } else {
                        marginLayoutParams.h = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 12:
                    int resourceId6 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f11998i);
                    marginLayoutParams.f11998i = resourceId6;
                    if (resourceId6 != -1) {
                        break;
                    } else {
                        marginLayoutParams.f11998i = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 13:
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f12000j);
                    marginLayoutParams.f12000j = resourceId7;
                    if (resourceId7 != -1) {
                        break;
                    } else {
                        marginLayoutParams.f12000j = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 14:
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f12002k);
                    marginLayoutParams.f12002k = resourceId8;
                    if (resourceId8 != -1) {
                        break;
                    } else {
                        marginLayoutParams.f12002k = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 15:
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f12004l);
                    marginLayoutParams.f12004l = resourceId9;
                    if (resourceId9 != -1) {
                        break;
                    } else {
                        marginLayoutParams.f12004l = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 16:
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f12006m);
                    marginLayoutParams.f12006m = resourceId10;
                    if (resourceId10 != -1) {
                        break;
                    } else {
                        marginLayoutParams.f12006m = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 17:
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f12016s);
                    marginLayoutParams.f12016s = resourceId11;
                    if (resourceId11 != -1) {
                        break;
                    } else {
                        marginLayoutParams.f12016s = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 18:
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f12017t);
                    marginLayoutParams.f12017t = resourceId12;
                    if (resourceId12 != -1) {
                        break;
                    } else {
                        marginLayoutParams.f12017t = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 19:
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f12018u);
                    marginLayoutParams.f12018u = resourceId13;
                    if (resourceId13 != -1) {
                        break;
                    } else {
                        marginLayoutParams.f12018u = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 20:
                    int resourceId14 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f12019v);
                    marginLayoutParams.f12019v = resourceId14;
                    if (resourceId14 != -1) {
                        break;
                    } else {
                        marginLayoutParams.f12019v = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 21:
                    marginLayoutParams.f12020w = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f12020w);
                    break;
                case 22:
                    marginLayoutParams.f12021x = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f12021x);
                    break;
                case 23:
                    marginLayoutParams.f12022y = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f12022y);
                    break;
                case 24:
                    marginLayoutParams.f12023z = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f12023z);
                    break;
                case 25:
                    marginLayoutParams.f11960A = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f11960A);
                    break;
                case 26:
                    marginLayoutParams.f11961B = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f11961B);
                    break;
                case 27:
                    marginLayoutParams.f11981W = obtainStyledAttributes.getBoolean(index, marginLayoutParams.f11981W);
                    break;
                case 28:
                    marginLayoutParams.f11982X = obtainStyledAttributes.getBoolean(index, marginLayoutParams.f11982X);
                    break;
                case 29:
                    marginLayoutParams.f11964E = obtainStyledAttributes.getFloat(index, marginLayoutParams.f11964E);
                    break;
                case 30:
                    marginLayoutParams.F = obtainStyledAttributes.getFloat(index, marginLayoutParams.F);
                    break;
                case 31:
                    int i6 = obtainStyledAttributes.getInt(index, 0);
                    marginLayoutParams.f11970L = i6;
                    if (i6 != 1) {
                        break;
                    } else {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        break;
                    }
                case 32:
                    int i7 = obtainStyledAttributes.getInt(index, 0);
                    marginLayoutParams.f11971M = i7;
                    if (i7 != 1) {
                        break;
                    } else {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        break;
                    }
                case 33:
                    try {
                        marginLayoutParams.f11972N = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f11972N);
                        break;
                    } catch (Exception unused) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.f11972N) != -2) {
                            break;
                        } else {
                            marginLayoutParams.f11972N = -2;
                            break;
                        }
                    }
                case 34:
                    try {
                        marginLayoutParams.f11974P = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f11974P);
                        break;
                    } catch (Exception unused2) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.f11974P) != -2) {
                            break;
                        } else {
                            marginLayoutParams.f11974P = -2;
                            break;
                        }
                    }
                case 35:
                    marginLayoutParams.f11976R = Math.max(0.0f, obtainStyledAttributes.getFloat(index, marginLayoutParams.f11976R));
                    marginLayoutParams.f11970L = 2;
                    break;
                case 36:
                    try {
                        marginLayoutParams.f11973O = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f11973O);
                        break;
                    } catch (Exception unused3) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.f11973O) != -2) {
                            break;
                        } else {
                            marginLayoutParams.f11973O = -2;
                            break;
                        }
                    }
                case 37:
                    try {
                        marginLayoutParams.f11975Q = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f11975Q);
                        break;
                    } catch (Exception unused4) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.f11975Q) != -2) {
                            break;
                        } else {
                            marginLayoutParams.f11975Q = -2;
                            break;
                        }
                    }
                case 38:
                    marginLayoutParams.f11977S = Math.max(0.0f, obtainStyledAttributes.getFloat(index, marginLayoutParams.f11977S));
                    marginLayoutParams.f11971M = 2;
                    break;
                default:
                    switch (i5) {
                        case 44:
                            n.h(marginLayoutParams, obtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            marginLayoutParams.f11966H = obtainStyledAttributes.getFloat(index, marginLayoutParams.f11966H);
                            break;
                        case 46:
                            marginLayoutParams.f11967I = obtainStyledAttributes.getFloat(index, marginLayoutParams.f11967I);
                            break;
                        case 47:
                            marginLayoutParams.f11968J = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            marginLayoutParams.f11969K = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            marginLayoutParams.f11978T = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.f11978T);
                            break;
                        case 50:
                            marginLayoutParams.f11979U = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.f11979U);
                            break;
                        case 51:
                            marginLayoutParams.f11983Y = obtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f12008n);
                            marginLayoutParams.f12008n = resourceId15;
                            if (resourceId15 != -1) {
                                break;
                            } else {
                                marginLayoutParams.f12008n = obtainStyledAttributes.getInt(index, -1);
                                break;
                            }
                        case 53:
                            int resourceId16 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f12010o);
                            marginLayoutParams.f12010o = resourceId16;
                            if (resourceId16 != -1) {
                                break;
                            } else {
                                marginLayoutParams.f12010o = obtainStyledAttributes.getInt(index, -1);
                                break;
                            }
                        case 54:
                            marginLayoutParams.f11963D = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f11963D);
                            break;
                        case 55:
                            marginLayoutParams.f11962C = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f11962C);
                            break;
                        default:
                            switch (i5) {
                                case 64:
                                    n.g(marginLayoutParams, obtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    n.g(marginLayoutParams, obtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    marginLayoutParams.f11984Z = obtainStyledAttributes.getInt(index, marginLayoutParams.f11984Z);
                                    break;
                                case 67:
                                    marginLayoutParams.d = obtainStyledAttributes.getBoolean(index, marginLayoutParams.d);
                                    break;
                            }
                    }
            }
        }
        obtainStyledAttributes.recycle();
        marginLayoutParams.a();
        return marginLayoutParams;
    }

    public int getMaxHeight() {
        return this.f4843p;
    }

    public int getMaxWidth() {
        return this.f4842f;
    }

    public int getMinHeight() {
        return this.f4841e;
    }

    public int getMinWidth() {
        return this.d;
    }

    public int getOptimizationLevel() {
        return this.f4840c.f11356D0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        e eVar = this.f4840c;
        if (eVar.f11329j == null) {
            int id2 = getId();
            if (id2 != -1) {
                eVar.f11329j = getContext().getResources().getResourceEntryName(id2);
            } else {
                eVar.f11329j = "parent";
            }
        }
        if (eVar.f11326h0 == null) {
            eVar.f11326h0 = eVar.f11329j;
            Log.v("ConstraintLayout", " setDebugName " + eVar.f11326h0);
        }
        Iterator it2 = eVar.f11364q0.iterator();
        while (it2.hasNext()) {
            d dVar = (d) it2.next();
            View view = dVar.f11324f0;
            if (view != null) {
                if (dVar.f11329j == null && (id = view.getId()) != -1) {
                    dVar.f11329j = getContext().getResources().getResourceEntryName(id);
                }
                if (dVar.f11326h0 == null) {
                    dVar.f11326h0 = dVar.f11329j;
                    Log.v("ConstraintLayout", " setDebugName " + dVar.f11326h0);
                }
            }
        }
        eVar.n(sb);
        return sb.toString();
    }

    public final void h(AttributeSet attributeSet, int i2) {
        e eVar = this.f4840c;
        eVar.f11324f0 = this;
        v.f fVar = this.f4851x;
        eVar.f11367u0 = fVar;
        eVar.s0.f11580f = fVar;
        this.f4838a.put(getId(), this);
        this.f4846s = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, q.f12138b, i2, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i5 = 0; i5 < indexCount; i5++) {
                int index = obtainStyledAttributes.getIndex(i5);
                if (index == 16) {
                    this.d = obtainStyledAttributes.getDimensionPixelOffset(index, this.d);
                } else if (index == 17) {
                    this.f4841e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f4841e);
                } else if (index == 14) {
                    this.f4842f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f4842f);
                } else if (index == 15) {
                    this.f4843p = obtainStyledAttributes.getDimensionPixelOffset(index, this.f4843p);
                } else if (index == 113) {
                    this.f4845r = obtainStyledAttributes.getInt(index, this.f4845r);
                } else if (index == 56) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            i(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f4847t = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        n nVar = new n();
                        this.f4846s = nVar;
                        nVar.e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f4846s = null;
                    }
                    this.f4848u = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        eVar.f11356D0 = this.f4845r;
        C0926c.f11046q = eVar.W(512);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(int r13) {
        /*
            r12 = this;
            m0.a0 r0 = new m0.a0
            android.content.Context r1 = r12.getContext()
            r2 = 15
            r0.<init>((int) r2)
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            r0.f9925b = r2
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            r0.f9926c = r2
            java.lang.String r2 = "Error parsing resource: "
            java.lang.String r3 = "ConstraintLayoutStates"
            android.content.res.Resources r4 = r1.getResources()
            android.content.res.XmlResourceParser r4 = r4.getXml(r13)
            int r5 = r4.getEventType()     // Catch:{ XmlPullParserException -> 0x004c, IOException -> 0x004a }
            r6 = 0
        L_0x002a:
            r7 = 1
            if (r5 == r7) goto L_0x00c4
            r8 = 2
            if (r5 == r8) goto L_0x0032
            goto L_0x00a0
        L_0x0032:
            java.lang.String r5 = r4.getName()     // Catch:{ XmlPullParserException -> 0x004c, IOException -> 0x004a }
            int r9 = r5.hashCode()     // Catch:{ XmlPullParserException -> 0x004c, IOException -> 0x004a }
            r10 = 4
            r11 = 3
            switch(r9) {
                case -1349929691: goto L_0x006c;
                case 80204913: goto L_0x0062;
                case 1382829617: goto L_0x0059;
                case 1657696882: goto L_0x004f;
                case 1901439077: goto L_0x0040;
                default: goto L_0x003f;
            }     // Catch:{ XmlPullParserException -> 0x004c, IOException -> 0x004a }
        L_0x003f:
            goto L_0x0076
        L_0x0040:
            java.lang.String r7 = "Variant"
            boolean r5 = r5.equals(r7)     // Catch:{ XmlPullParserException -> 0x004c, IOException -> 0x004a }
            if (r5 == 0) goto L_0x0076
            r7 = r11
            goto L_0x0077
        L_0x004a:
            r1 = move-exception
            goto L_0x00a5
        L_0x004c:
            r1 = move-exception
            goto L_0x00b5
        L_0x004f:
            java.lang.String r7 = "layoutDescription"
            boolean r5 = r5.equals(r7)     // Catch:{ XmlPullParserException -> 0x004c, IOException -> 0x004a }
            if (r5 == 0) goto L_0x0076
            r7 = 0
            goto L_0x0077
        L_0x0059:
            java.lang.String r9 = "StateSet"
            boolean r5 = r5.equals(r9)     // Catch:{ XmlPullParserException -> 0x004c, IOException -> 0x004a }
            if (r5 == 0) goto L_0x0076
            goto L_0x0077
        L_0x0062:
            java.lang.String r7 = "State"
            boolean r5 = r5.equals(r7)     // Catch:{ XmlPullParserException -> 0x004c, IOException -> 0x004a }
            if (r5 == 0) goto L_0x0076
            r7 = r8
            goto L_0x0077
        L_0x006c:
            java.lang.String r7 = "ConstraintSet"
            boolean r5 = r5.equals(r7)     // Catch:{ XmlPullParserException -> 0x004c, IOException -> 0x004a }
            if (r5 == 0) goto L_0x0076
            r7 = r10
            goto L_0x0077
        L_0x0076:
            r7 = -1
        L_0x0077:
            if (r7 == r8) goto L_0x0091
            if (r7 == r11) goto L_0x0082
            if (r7 == r10) goto L_0x007e
            goto L_0x00a0
        L_0x007e:
            r0.r(r1, r4)     // Catch:{ XmlPullParserException -> 0x004c, IOException -> 0x004a }
            goto L_0x00a0
        L_0x0082:
            v.g r5 = new v.g     // Catch:{ XmlPullParserException -> 0x004c, IOException -> 0x004a }
            r5.<init>(r1, r4)     // Catch:{ XmlPullParserException -> 0x004c, IOException -> 0x004a }
            if (r6 == 0) goto L_0x00a0
            java.lang.Object r7 = r6.d     // Catch:{ XmlPullParserException -> 0x004c, IOException -> 0x004a }
            java.util.ArrayList r7 = (java.util.ArrayList) r7     // Catch:{ XmlPullParserException -> 0x004c, IOException -> 0x004a }
            r7.add(r5)     // Catch:{ XmlPullParserException -> 0x004c, IOException -> 0x004a }
            goto L_0x00a0
        L_0x0091:
            U0.b r5 = new U0.b     // Catch:{ XmlPullParserException -> 0x004c, IOException -> 0x004a }
            r5.<init>(r1, r4)     // Catch:{ XmlPullParserException -> 0x004c, IOException -> 0x004a }
            java.lang.Object r6 = r0.f9925b     // Catch:{ XmlPullParserException -> 0x004c, IOException -> 0x004a }
            android.util.SparseArray r6 = (android.util.SparseArray) r6     // Catch:{ XmlPullParserException -> 0x004c, IOException -> 0x004a }
            int r7 = r5.f3674b     // Catch:{ XmlPullParserException -> 0x004c, IOException -> 0x004a }
            r6.put(r7, r5)     // Catch:{ XmlPullParserException -> 0x004c, IOException -> 0x004a }
            r6 = r5
        L_0x00a0:
            int r5 = r4.next()     // Catch:{ XmlPullParserException -> 0x004c, IOException -> 0x004a }
            goto L_0x002a
        L_0x00a5:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r2)
            r4.append(r13)
            java.lang.String r13 = r4.toString()
            android.util.Log.e(r3, r13, r1)
            goto L_0x00c4
        L_0x00b5:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r2)
            r4.append(r13)
            java.lang.String r13 = r4.toString()
            android.util.Log.e(r3, r13, r1)
        L_0x00c4:
            r12.f4847t = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.i(int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:148:0x02e8  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x02ea  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x032b  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0348  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0422  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x0431  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x04d1  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:384:0x0377 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:395:0x04d5 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:408:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01c0 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01ca  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j(s.e r26, int r27, int r28, int r29) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = r27
            int r3 = android.view.View.MeasureSpec.getMode(r28)
            int r4 = android.view.View.MeasureSpec.getSize(r28)
            int r5 = android.view.View.MeasureSpec.getMode(r29)
            int r6 = android.view.View.MeasureSpec.getSize(r29)
            int r7 = r25.getPaddingTop()
            r8 = 0
            int r7 = java.lang.Math.max(r8, r7)
            int r9 = r25.getPaddingBottom()
            int r9 = java.lang.Math.max(r8, r9)
            int r10 = r7 + r9
            int r11 = r25.getPaddingWidth()
            v.f r12 = r0.f4851x
            r12.f12025b = r7
            r12.f12026c = r9
            r12.d = r11
            r12.f12027e = r10
            r9 = r28
            r12.f12028f = r9
            r9 = r29
            r12.g = r9
            int r9 = r25.getPaddingStart()
            int r9 = java.lang.Math.max(r8, r9)
            int r13 = r25.getPaddingEnd()
            int r13 = java.lang.Math.max(r8, r13)
            r14 = 1
            if (r9 > 0) goto L_0x005e
            if (r13 <= 0) goto L_0x0055
            goto L_0x005e
        L_0x0055:
            int r9 = r25.getPaddingLeft()
            int r9 = java.lang.Math.max(r8, r9)
            goto L_0x0075
        L_0x005e:
            android.content.Context r15 = r25.getContext()
            android.content.pm.ApplicationInfo r15 = r15.getApplicationInfo()
            int r15 = r15.flags
            r16 = 4194304(0x400000, float:5.877472E-39)
            r15 = r15 & r16
            if (r15 == 0) goto L_0x0075
            int r15 = r25.getLayoutDirection()
            if (r14 != r15) goto L_0x0075
            r9 = r13
        L_0x0075:
            int r4 = r4 - r11
            int r6 = r6 - r10
            int r10 = r12.f12027e
            int r11 = r12.d
            int r12 = r25.getChildCount()
            r15 = 1073741824(0x40000000, float:2.0)
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == r13) goto L_0x00a6
            if (r3 == 0) goto L_0x0097
            if (r3 == r15) goto L_0x008c
            r17 = r8
            goto L_0x00b2
        L_0x008c:
            int r14 = r0.f4842f
            int r14 = r14 - r11
            int r14 = java.lang.Math.min(r14, r4)
            r17 = r14
            r14 = 1
            goto L_0x00b2
        L_0x0097:
            if (r12 != 0) goto L_0x00a3
            int r14 = r0.d
            int r14 = java.lang.Math.max(r8, r14)
        L_0x009f:
            r17 = r14
        L_0x00a1:
            r14 = 2
            goto L_0x00b2
        L_0x00a3:
            r17 = r8
            goto L_0x00a1
        L_0x00a6:
            if (r12 != 0) goto L_0x00af
            int r14 = r0.d
            int r14 = java.lang.Math.max(r8, r14)
            goto L_0x009f
        L_0x00af:
            r17 = r4
            goto L_0x00a1
        L_0x00b2:
            if (r5 == r13) goto L_0x00d1
            if (r5 == 0) goto L_0x00c4
            if (r5 == r15) goto L_0x00bb
            r13 = r8
        L_0x00b9:
            r12 = 1
            goto L_0x00dc
        L_0x00bb:
            int r12 = r0.f4843p
            int r12 = r12 - r10
            int r12 = java.lang.Math.min(r12, r6)
            r13 = r12
            goto L_0x00b9
        L_0x00c4:
            if (r12 != 0) goto L_0x00cf
            int r12 = r0.f4841e
            int r12 = java.lang.Math.max(r8, r12)
        L_0x00cc:
            r13 = r12
        L_0x00cd:
            r12 = 2
            goto L_0x00dc
        L_0x00cf:
            r13 = r8
            goto L_0x00cd
        L_0x00d1:
            if (r12 != 0) goto L_0x00da
            int r12 = r0.f4841e
            int r12 = java.lang.Math.max(r8, r12)
            goto L_0x00cc
        L_0x00da:
            r13 = r6
            goto L_0x00cd
        L_0x00dc:
            int r15 = r26.q()
            t.e r8 = r1.s0
            r19 = r6
            r6 = r17
            if (r6 != r15) goto L_0x00ee
            int r15 = r26.k()
            if (r13 == r15) goto L_0x00f0
        L_0x00ee:
            r15 = 1
            goto L_0x00f2
        L_0x00f0:
            r15 = 0
            goto L_0x00f5
        L_0x00f2:
            r8.f11578c = r15
            goto L_0x00f0
        L_0x00f5:
            r1.f11312Y = r15
            r1.f11313Z = r15
            int r15 = r0.f4842f
            int r15 = r15 - r11
            r17 = r8
            int[] r8 = r1.f11291C
            r20 = r4
            r4 = 0
            r8[r4] = r15
            int r15 = r0.f4843p
            int r15 = r15 - r10
            r18 = 1
            r8[r18] = r15
            r1.f11317b0 = r4
            r1.f11319c0 = r4
            r1.M(r14)
            r1.O(r6)
            r1.N(r12)
            r1.L(r13)
            int r6 = r0.d
            int r6 = r6 - r11
            if (r6 >= 0) goto L_0x0124
            r1.f11317b0 = r4
            goto L_0x0126
        L_0x0124:
            r1.f11317b0 = r6
        L_0x0126:
            int r6 = r0.f4841e
            int r6 = r6 - r10
            if (r6 >= 0) goto L_0x012e
            r1.f11319c0 = r4
            goto L_0x0130
        L_0x012e:
            r1.f11319c0 = r6
        L_0x0130:
            r1.f11370x0 = r9
            r1.f11371y0 = r7
            c1.i r4 = r1.f11365r0
            r4.getClass()
            v.f r6 = r1.f11367u0
            java.util.ArrayList r7 = r1.f11364q0
            int r7 = r7.size()
            int r9 = r26.q()
            int r10 = r26.k()
            r11 = 128(0x80, float:1.794E-43)
            boolean r11 = s.j.c(r2, r11)
            r12 = 64
            if (r11 != 0) goto L_0x015c
            boolean r2 = s.j.c(r2, r12)
            if (r2 == 0) goto L_0x015a
            goto L_0x015c
        L_0x015a:
            r2 = 0
            goto L_0x015d
        L_0x015c:
            r2 = 1
        L_0x015d:
            r13 = 3
            if (r2 == 0) goto L_0x01bc
            r15 = 0
        L_0x0161:
            if (r15 >= r7) goto L_0x01bc
            java.util.ArrayList r12 = r1.f11364q0
            java.lang.Object r12 = r12.get(r15)
            s.d r12 = (s.d) r12
            int[] r14 = r12.f11342p0
            r18 = 0
            r0 = r14[r18]
            if (r0 != r13) goto L_0x0177
            r0 = 1
        L_0x0174:
            r22 = 1
            goto L_0x0179
        L_0x0177:
            r0 = 0
            goto L_0x0174
        L_0x0179:
            r14 = r14[r22]
            if (r14 != r13) goto L_0x017f
            r14 = 1
            goto L_0x0180
        L_0x017f:
            r14 = 0
        L_0x0180:
            if (r0 == 0) goto L_0x018d
            if (r14 == 0) goto L_0x018d
            float r0 = r12.f11310W
            r14 = 0
            int r0 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x018d
            r0 = 1
            goto L_0x018e
        L_0x018d:
            r0 = 0
        L_0x018e:
            boolean r14 = r12.x()
            if (r14 == 0) goto L_0x019a
            if (r0 == 0) goto L_0x019a
        L_0x0196:
            r0 = 1073741824(0x40000000, float:2.0)
            r2 = 0
            goto L_0x01be
        L_0x019a:
            boolean r14 = r12.y()
            if (r14 == 0) goto L_0x01a3
            if (r0 == 0) goto L_0x01a3
            goto L_0x0196
        L_0x01a3:
            boolean r0 = r12 instanceof s.g
            if (r0 == 0) goto L_0x01a8
            goto L_0x0196
        L_0x01a8:
            boolean r0 = r12.x()
            if (r0 != 0) goto L_0x0196
            boolean r0 = r12.y()
            if (r0 == 0) goto L_0x01b5
            goto L_0x0196
        L_0x01b5:
            int r15 = r15 + 1
            r0 = r25
            r12 = 64
            goto L_0x0161
        L_0x01bc:
            r0 = 1073741824(0x40000000, float:2.0)
        L_0x01be:
            if (r3 != r0) goto L_0x01c2
            if (r5 == r0) goto L_0x01c4
        L_0x01c2:
            if (r11 == 0) goto L_0x01c6
        L_0x01c4:
            r0 = 1
            goto L_0x01c7
        L_0x01c6:
            r0 = 0
        L_0x01c7:
            r0 = r0 & r2
            if (r0 == 0) goto L_0x0422
            r12 = 0
            r14 = r8[r12]
            r12 = r20
            int r12 = java.lang.Math.min(r14, r12)
            r14 = 1
            r8 = r8[r14]
            r15 = r19
            int r8 = java.lang.Math.min(r8, r15)
            r15 = 1073741824(0x40000000, float:2.0)
            if (r3 != r15) goto L_0x01ed
            int r13 = r26.q()
            if (r13 == r12) goto L_0x01ed
            r1.O(r12)
            t.e r12 = r1.s0
            r12.f11577b = r14
        L_0x01ed:
            if (r5 != r15) goto L_0x01fc
            int r12 = r26.k()
            if (r12 == r8) goto L_0x01fc
            r1.L(r8)
            t.e r8 = r1.s0
            r8.f11577b = r14
        L_0x01fc:
            if (r3 != r15) goto L_0x0384
            if (r5 != r15) goto L_0x0384
            r8 = r17
            boolean r12 = r8.f11577b
            s.e r13 = r8.f11576a
            if (r12 != 0) goto L_0x020f
            boolean r12 = r8.f11578c
            if (r12 == 0) goto L_0x020d
            goto L_0x020f
        L_0x020d:
            r15 = 0
            goto L_0x0244
        L_0x020f:
            java.util.ArrayList r12 = r13.f11364q0
            java.util.Iterator r12 = r12.iterator()
        L_0x0215:
            boolean r14 = r12.hasNext()
            if (r14 == 0) goto L_0x0232
            java.lang.Object r14 = r12.next()
            s.d r14 = (s.d) r14
            r14.h()
            r15 = 0
            r14.f11314a = r15
            t.k r2 = r14.d
            r2.n()
            t.m r2 = r14.f11321e
            r2.m()
            goto L_0x0215
        L_0x0232:
            r15 = 0
            r13.h()
            r13.f11314a = r15
            t.k r2 = r13.d
            r2.n()
            t.m r2 = r13.f11321e
            r2.m()
            r8.f11578c = r15
        L_0x0244:
            s.e r2 = r8.d
            r8.b(r2)
            r13.f11312Y = r15
            r13.f11313Z = r15
            int r2 = r13.j(r15)
            r12 = 1
            int r14 = r13.j(r12)
            boolean r12 = r8.f11577b
            if (r12 == 0) goto L_0x025d
            r8.c()
        L_0x025d:
            int r12 = r13.r()
            int r15 = r13.s()
            r20 = r0
            t.k r0 = r13.d
            t.f r0 = r0.h
            r0.d(r12)
            t.m r0 = r13.f11321e
            t.f r0 = r0.h
            r0.d(r15)
            r8.g()
            java.util.ArrayList r0 = r8.f11579e
            r22 = r6
            r6 = 2
            if (r2 == r6) goto L_0x0286
            if (r14 != r6) goto L_0x0282
            goto L_0x0286
        L_0x0282:
            r23 = r9
        L_0x0284:
            r6 = 1
            goto L_0x02db
        L_0x0286:
            if (r11 == 0) goto L_0x029f
            java.util.Iterator r6 = r0.iterator()
        L_0x028c:
            boolean r23 = r6.hasNext()
            if (r23 == 0) goto L_0x029f
            java.lang.Object r23 = r6.next()
            t.o r23 = (t.o) r23
            boolean r23 = r23.k()
            if (r23 != 0) goto L_0x028c
            r11 = 0
        L_0x029f:
            if (r11 == 0) goto L_0x02be
            r6 = 2
            if (r2 != r6) goto L_0x02be
            r6 = 1
            r13.M(r6)
            r23 = r9
            r6 = 0
            int r9 = r8.d(r13, r6)
            r13.O(r9)
            t.k r6 = r13.d
            t.g r6 = r6.f11605e
            int r9 = r13.q()
            r6.d(r9)
            goto L_0x02c0
        L_0x02be:
            r23 = r9
        L_0x02c0:
            if (r11 == 0) goto L_0x0284
            r6 = 2
            if (r14 != r6) goto L_0x0284
            r6 = 1
            r13.N(r6)
            int r9 = r8.d(r13, r6)
            r13.L(r9)
            t.m r9 = r13.f11321e
            t.g r9 = r9.f11605e
            int r11 = r13.k()
            r9.d(r11)
        L_0x02db:
            int[] r9 = r13.f11342p0
            r24 = r10
            r11 = 0
            r10 = r9[r11]
            if (r10 == r6) goto L_0x02ea
            r6 = 4
            if (r10 != r6) goto L_0x02e8
            goto L_0x02ea
        L_0x02e8:
            r6 = 0
            goto L_0x0321
        L_0x02ea:
            int r6 = r13.q()
            int r6 = r6 + r12
            t.k r10 = r13.d
            t.f r10 = r10.f11607i
            r10.d(r6)
            t.k r10 = r13.d
            t.g r10 = r10.f11605e
            int r6 = r6 - r12
            r10.d(r6)
            r8.g()
            r6 = 1
            r9 = r9[r6]
            if (r9 == r6) goto L_0x0309
            r6 = 4
            if (r9 != r6) goto L_0x031d
        L_0x0309:
            int r6 = r13.k()
            int r6 = r6 + r15
            t.m r9 = r13.f11321e
            t.f r9 = r9.f11607i
            r9.d(r6)
            t.m r9 = r13.f11321e
            t.g r9 = r9.f11605e
            int r6 = r6 - r15
            r9.d(r6)
        L_0x031d:
            r8.g()
            r6 = 1
        L_0x0321:
            java.util.Iterator r8 = r0.iterator()
        L_0x0325:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x033e
            java.lang.Object r9 = r8.next()
            t.o r9 = (t.o) r9
            s.d r10 = r9.f11603b
            if (r10 != r13) goto L_0x033a
            boolean r10 = r9.g
            if (r10 != 0) goto L_0x033a
            goto L_0x0325
        L_0x033a:
            r9.e()
            goto L_0x0325
        L_0x033e:
            java.util.Iterator r0 = r0.iterator()
        L_0x0342:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L_0x0377
            java.lang.Object r8 = r0.next()
            t.o r8 = (t.o) r8
            if (r6 != 0) goto L_0x0355
            s.d r9 = r8.f11603b
            if (r9 != r13) goto L_0x0355
            goto L_0x0342
        L_0x0355:
            t.f r9 = r8.h
            boolean r9 = r9.f11587j
            if (r9 != 0) goto L_0x035d
        L_0x035b:
            r0 = 0
            goto L_0x0378
        L_0x035d:
            t.f r9 = r8.f11607i
            boolean r9 = r9.f11587j
            if (r9 != 0) goto L_0x0368
            boolean r9 = r8 instanceof t.i
            if (r9 != 0) goto L_0x0368
            goto L_0x035b
        L_0x0368:
            t.g r9 = r8.f11605e
            boolean r9 = r9.f11587j
            if (r9 != 0) goto L_0x0342
            boolean r9 = r8 instanceof t.C0977c
            if (r9 != 0) goto L_0x0342
            boolean r8 = r8 instanceof t.i
            if (r8 != 0) goto L_0x0342
            goto L_0x035b
        L_0x0377:
            r0 = 1
        L_0x0378:
            r13.M(r2)
            r13.N(r14)
            r6 = r0
            r0 = 1073741824(0x40000000, float:2.0)
            r2 = 2
            goto L_0x0412
        L_0x0384:
            r20 = r0
            r22 = r6
            r23 = r9
            r24 = r10
            r8 = r17
            boolean r0 = r8.f11577b
            s.e r2 = r8.f11576a
            if (r0 == 0) goto L_0x03e3
            java.util.ArrayList r0 = r2.f11364q0
            java.util.Iterator r0 = r0.iterator()
        L_0x039a:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x03c3
            java.lang.Object r6 = r0.next()
            s.d r6 = (s.d) r6
            r6.h()
            r9 = 0
            r6.f11314a = r9
            t.k r10 = r6.d
            t.g r12 = r10.f11605e
            r12.f11587j = r9
            r10.g = r9
            r10.n()
            t.m r6 = r6.f11321e
            t.g r10 = r6.f11605e
            r10.f11587j = r9
            r6.g = r9
            r6.m()
            goto L_0x039a
        L_0x03c3:
            r9 = 0
            r2.h()
            r2.f11314a = r9
            t.k r0 = r2.d
            t.g r6 = r0.f11605e
            r6.f11587j = r9
            r0.g = r9
            r0.n()
            t.m r0 = r2.f11321e
            t.g r6 = r0.f11605e
            r6.f11587j = r9
            r0.g = r9
            r0.m()
            r8.c()
            goto L_0x03e4
        L_0x03e3:
            r9 = 0
        L_0x03e4:
            s.e r0 = r8.d
            r8.b(r0)
            r2.f11312Y = r9
            r2.f11313Z = r9
            t.k r0 = r2.d
            t.f r0 = r0.h
            r0.d(r9)
            t.m r0 = r2.f11321e
            t.f r0 = r0.h
            r0.d(r9)
            r0 = 1073741824(0x40000000, float:2.0)
            if (r3 != r0) goto L_0x0406
            boolean r2 = r1.T(r9, r11)
            r6 = r2
            r2 = 1
            goto L_0x0408
        L_0x0406:
            r2 = 0
            r6 = 1
        L_0x0408:
            if (r5 != r0) goto L_0x0412
            r8 = 1
            boolean r9 = r1.T(r8, r11)
            r6 = r6 & r9
            int r2 = r2 + 1
        L_0x0412:
            if (r6 == 0) goto L_0x042c
            if (r3 != r0) goto L_0x0418
            r3 = 1
            goto L_0x0419
        L_0x0418:
            r3 = 0
        L_0x0419:
            if (r5 != r0) goto L_0x041d
            r0 = 1
            goto L_0x041e
        L_0x041d:
            r0 = 0
        L_0x041e:
            r1.P(r3, r0)
            goto L_0x042c
        L_0x0422:
            r20 = r0
            r22 = r6
            r23 = r9
            r24 = r10
            r2 = 0
            r6 = 0
        L_0x042c:
            if (r6 == 0) goto L_0x0431
            r0 = 2
            if (r2 == r0) goto L_0x06cc
        L_0x0431:
            int r0 = r1.f11356D0
            if (r7 <= 0) goto L_0x04ff
            java.util.ArrayList r2 = r1.f11364q0
            int r2 = r2.size()
            r3 = 64
            boolean r3 = r1.W(r3)
            v.f r5 = r1.f11367u0
            r15 = 0
        L_0x0444:
            if (r15 >= r2) goto L_0x04d9
            java.util.ArrayList r6 = r1.f11364q0
            java.lang.Object r6 = r6.get(r15)
            s.d r6 = (s.d) r6
            boolean r8 = r6 instanceof s.h
            if (r8 == 0) goto L_0x0456
        L_0x0452:
            r8 = 3
            r10 = 0
            goto L_0x04d5
        L_0x0456:
            boolean r8 = r6 instanceof s.C0960a
            if (r8 == 0) goto L_0x045b
            goto L_0x0452
        L_0x045b:
            boolean r8 = r6.F
            if (r8 == 0) goto L_0x0460
            goto L_0x0452
        L_0x0460:
            if (r3 == 0) goto L_0x0477
            t.k r8 = r6.d
            if (r8 == 0) goto L_0x0477
            t.m r9 = r6.f11321e
            if (r9 == 0) goto L_0x0477
            t.g r8 = r8.f11605e
            boolean r8 = r8.f11587j
            if (r8 == 0) goto L_0x0477
            t.g r8 = r9.f11605e
            boolean r8 = r8.f11587j
            if (r8 == 0) goto L_0x0477
            goto L_0x0452
        L_0x0477:
            r8 = 0
            int r9 = r6.j(r8)
            r8 = 1
            int r10 = r6.j(r8)
            r11 = 3
            if (r9 != r11) goto L_0x0490
            int r12 = r6.f11344r
            if (r12 == r8) goto L_0x0490
            if (r10 != r11) goto L_0x0490
            int r11 = r6.f11345s
            if (r11 == r8) goto L_0x0490
            r11 = r8
            goto L_0x0491
        L_0x0490:
            r11 = 0
        L_0x0491:
            if (r11 != 0) goto L_0x04cc
            boolean r12 = r1.W(r8)
            if (r12 == 0) goto L_0x04cc
            boolean r8 = r6 instanceof s.g
            if (r8 != 0) goto L_0x04cc
            r8 = 3
            if (r9 != r8) goto L_0x04ad
            int r12 = r6.f11344r
            if (r12 != 0) goto L_0x04ad
            if (r10 == r8) goto L_0x04ad
            boolean r12 = r6.x()
            if (r12 != 0) goto L_0x04ad
            r11 = 1
        L_0x04ad:
            if (r10 != r8) goto L_0x04bc
            int r12 = r6.f11345s
            if (r12 != 0) goto L_0x04bc
            if (r9 == r8) goto L_0x04bc
            boolean r12 = r6.x()
            if (r12 != 0) goto L_0x04bc
            r11 = 1
        L_0x04bc:
            if (r9 == r8) goto L_0x04c3
            if (r10 != r8) goto L_0x04c1
            goto L_0x04c3
        L_0x04c1:
            r10 = 0
            goto L_0x04ce
        L_0x04c3:
            float r9 = r6.f11310W
            r10 = 0
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 <= 0) goto L_0x04ce
            r11 = 1
            goto L_0x04ce
        L_0x04cc:
            r8 = 3
            goto L_0x04c1
        L_0x04ce:
            if (r11 == 0) goto L_0x04d1
            goto L_0x04d5
        L_0x04d1:
            r9 = 0
            r4.z(r9, r6, r5)
        L_0x04d5:
            int r15 = r15 + 1
            goto L_0x0444
        L_0x04d9:
            androidx.constraintlayout.widget.ConstraintLayout r2 = r5.f12024a
            int r3 = r2.getChildCount()
            r15 = 0
        L_0x04e0:
            if (r15 >= r3) goto L_0x04e8
            r2.getChildAt(r15)
            int r15 = r15 + 1
            goto L_0x04e0
        L_0x04e8:
            java.util.ArrayList r2 = r2.f4839b
            int r3 = r2.size()
            if (r3 <= 0) goto L_0x04ff
            r15 = 0
        L_0x04f1:
            if (r15 >= r3) goto L_0x04ff
            java.lang.Object r5 = r2.get(r15)
            v.c r5 = (v.c) r5
            r5.getClass()
            int r15 = r15 + 1
            goto L_0x04f1
        L_0x04ff:
            r4.M(r1)
            java.lang.Object r2 = r4.f5605b
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r3 = r2.size()
            r5 = r23
            r6 = r24
            r15 = 0
            if (r7 <= 0) goto L_0x0514
            r4.I(r1, r15, r5, r6)
        L_0x0514:
            if (r3 <= 0) goto L_0x06c2
            int[] r7 = r1.f11342p0
            r8 = r7[r15]
            r9 = 2
            if (r8 != r9) goto L_0x0520
            r8 = 1
        L_0x051e:
            r10 = 1
            goto L_0x0522
        L_0x0520:
            r8 = r15
            goto L_0x051e
        L_0x0522:
            r7 = r7[r10]
            if (r7 != r9) goto L_0x0528
            r7 = 1
            goto L_0x0529
        L_0x0528:
            r7 = r15
        L_0x0529:
            int r9 = r26.q()
            java.lang.Object r10 = r4.d
            s.e r10 = (s.e) r10
            int r11 = r10.f11317b0
            int r9 = java.lang.Math.max(r9, r11)
            int r11 = r26.k()
            int r10 = r10.f11319c0
            int r10 = java.lang.Math.max(r11, r10)
            r11 = r15
            r12 = r11
        L_0x0543:
            if (r11 >= r3) goto L_0x05d2
            java.lang.Object r14 = r2.get(r11)
            s.d r14 = (s.d) r14
            boolean r15 = r14 instanceof s.g
            if (r15 != 0) goto L_0x0555
            r16 = r0
            r1 = r22
            goto L_0x05c7
        L_0x0555:
            int r15 = r14.q()
            int r13 = r14.k()
            r16 = r0
            r1 = r22
            r0 = 1
            boolean r19 = r4.z(r0, r14, r1)
            r0 = r12 | r19
            int r12 = r14.q()
            r19 = r0
            int r0 = r14.k()
            if (r12 == r15) goto L_0x0599
            r14.O(r12)
            if (r8 == 0) goto L_0x0597
            int r12 = r14.r()
            int r15 = r14.f11308U
            int r12 = r12 + r15
            if (r12 <= r9) goto L_0x0597
            int r12 = r14.r()
            int r15 = r14.f11308U
            int r12 = r12 + r15
            r15 = 4
            s.c r19 = r14.i(r15)
            int r15 = r19.e()
            int r15 = r15 + r12
            int r9 = java.lang.Math.max(r9, r15)
        L_0x0597:
            r15 = 1
            goto L_0x059b
        L_0x0599:
            r15 = r19
        L_0x059b:
            if (r0 == r13) goto L_0x05c1
            r14.L(r0)
            if (r7 == 0) goto L_0x05c0
            int r0 = r14.s()
            int r12 = r14.f11309V
            int r0 = r0 + r12
            if (r0 <= r10) goto L_0x05c0
            int r0 = r14.s()
            int r12 = r14.f11309V
            int r0 = r0 + r12
            r12 = 5
            s.c r12 = r14.i(r12)
            int r12 = r12.e()
            int r12 = r12 + r0
            int r10 = java.lang.Math.max(r10, r12)
        L_0x05c0:
            r15 = 1
        L_0x05c1:
            s.g r14 = (s.g) r14
            boolean r0 = r14.f11418y0
            r0 = r0 | r15
            r12 = r0
        L_0x05c7:
            int r11 = r11 + 1
            r22 = r1
            r0 = r16
            r15 = 0
            r1 = r26
            goto L_0x0543
        L_0x05d2:
            r16 = r0
            r1 = r22
            r0 = 0
        L_0x05d7:
            r15 = 2
            if (r0 >= r15) goto L_0x06be
            r11 = 0
        L_0x05db:
            if (r11 >= r3) goto L_0x06a3
            java.lang.Object r13 = r2.get(r11)
            s.d r13 = (s.d) r13
            boolean r14 = r13 instanceof s.i
            if (r14 == 0) goto L_0x05eb
            boolean r14 = r13 instanceof s.g
            if (r14 == 0) goto L_0x060e
        L_0x05eb:
            boolean r14 = r13 instanceof s.h
            if (r14 == 0) goto L_0x05f0
            goto L_0x060e
        L_0x05f0:
            int r14 = r13.f11325g0
            r15 = 8
            if (r14 != r15) goto L_0x05f7
            goto L_0x060e
        L_0x05f7:
            if (r20 == 0) goto L_0x060a
            t.k r14 = r13.d
            t.g r14 = r14.f11605e
            boolean r14 = r14.f11587j
            if (r14 == 0) goto L_0x060a
            t.m r14 = r13.f11321e
            t.g r14 = r14.f11605e
            boolean r14 = r14.f11587j
            if (r14 == 0) goto L_0x060a
            goto L_0x060e
        L_0x060a:
            boolean r14 = r13 instanceof s.g
            if (r14 == 0) goto L_0x0618
        L_0x060e:
            r22 = r1
            r19 = r2
            r21 = r3
            r14 = 4
            r15 = 5
            goto L_0x0698
        L_0x0618:
            int r14 = r13.q()
            int r15 = r13.k()
            r19 = r2
            int r2 = r13.f11315a0
            r21 = r3
            r3 = 1
            if (r0 != r3) goto L_0x062a
            r3 = 2
        L_0x062a:
            boolean r3 = r4.z(r3, r13, r1)
            r3 = r3 | r12
            int r12 = r13.q()
            r22 = r1
            int r1 = r13.k()
            if (r12 == r14) goto L_0x0662
            r13.O(r12)
            if (r8 == 0) goto L_0x065f
            int r3 = r13.r()
            int r12 = r13.f11308U
            int r3 = r3 + r12
            if (r3 <= r9) goto L_0x065f
            int r3 = r13.r()
            int r12 = r13.f11308U
            int r3 = r3 + r12
            r14 = 4
            s.c r12 = r13.i(r14)
            int r12 = r12.e()
            int r12 = r12 + r3
            int r9 = java.lang.Math.max(r9, r12)
            goto L_0x0660
        L_0x065f:
            r14 = 4
        L_0x0660:
            r3 = 1
            goto L_0x0663
        L_0x0662:
            r14 = 4
        L_0x0663:
            if (r1 == r15) goto L_0x068c
            r13.L(r1)
            if (r7 == 0) goto L_0x0689
            int r1 = r13.s()
            int r3 = r13.f11309V
            int r1 = r1 + r3
            if (r1 <= r10) goto L_0x0689
            int r1 = r13.s()
            int r3 = r13.f11309V
            int r1 = r1 + r3
            r15 = 5
            s.c r3 = r13.i(r15)
            int r3 = r3.e()
            int r3 = r3 + r1
            int r10 = java.lang.Math.max(r10, r3)
            goto L_0x068a
        L_0x0689:
            r15 = 5
        L_0x068a:
            r3 = 1
            goto L_0x068d
        L_0x068c:
            r15 = 5
        L_0x068d:
            boolean r1 = r13.f11293E
            if (r1 == 0) goto L_0x0697
            int r1 = r13.f11315a0
            if (r2 == r1) goto L_0x0697
            r12 = 1
            goto L_0x0698
        L_0x0697:
            r12 = r3
        L_0x0698:
            int r11 = r11 + 1
            r2 = r19
            r3 = r21
            r1 = r22
            r15 = 2
            goto L_0x05db
        L_0x06a3:
            r22 = r1
            r19 = r2
            r21 = r3
            r14 = 4
            r15 = 5
            if (r12 == 0) goto L_0x06be
            int r0 = r0 + 1
            r1 = r26
            r2 = r22
            r4.I(r1, r0, r5, r6)
            r1 = r2
            r2 = r19
            r3 = r21
            r12 = 0
            goto L_0x05d7
        L_0x06be:
            r1 = r26
            r0 = r16
        L_0x06c2:
            r1.f11356D0 = r0
            r0 = 512(0x200, float:7.175E-43)
            boolean r0 = r1.W(r0)
            q.C0926c.f11046q = r0
        L_0x06cc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.j(s.e, int, int, int):void");
    }

    public final void k(d dVar, v.e eVar, SparseArray sparseArray, int i2, int i5) {
        View view = (View) this.f4838a.get(i2);
        d dVar2 = (d) sparseArray.get(i2);
        if (dVar2 != null && view != null && (view.getLayoutParams() instanceof v.e)) {
            eVar.f11990c0 = true;
            if (i5 == 6) {
                v.e eVar2 = (v.e) view.getLayoutParams();
                eVar2.f11990c0 = true;
                eVar2.f12013p0.f11293E = true;
            }
            dVar.i(6).b(dVar2.i(i5), eVar.f11963D, eVar.f11962C, true);
            dVar.f11293E = true;
            dVar.i(3).j();
            dVar.i(5).j();
        }
    }

    public void onLayout(boolean z3, int i2, int i5, int i6, int i7) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            v.e eVar = (v.e) childAt.getLayoutParams();
            d dVar = eVar.f12013p0;
            if (childAt.getVisibility() != 8 || eVar.f11991d0 || eVar.f11993e0 || isInEditMode) {
                int r6 = dVar.r();
                int s6 = dVar.s();
                childAt.layout(r6, s6, dVar.q() + r6, dVar.k() + s6);
            }
        }
        ArrayList arrayList = this.f4839b;
        int size = arrayList.size();
        if (size > 0) {
            for (int i9 = 0; i9 < size; i9++) {
                ((c) arrayList.get(i9)).getClass();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v113, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v13, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x02ec  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0308 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0329  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0346  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x036d  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x038b  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x03b1  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x03be  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x03e1  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x03e9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r24, int r25) {
        /*
            r23 = this;
            r6 = r23
            r7 = r24
            r8 = r25
            boolean r0 = r6.f4844q
            r6.f4844q = r0
            r9 = 0
            r10 = 1
            if (r0 != 0) goto L_0x0025
            int r0 = r23.getChildCount()
            r1 = r9
        L_0x0013:
            if (r1 >= r0) goto L_0x0025
            android.view.View r2 = r6.getChildAt(r1)
            boolean r2 = r2.isLayoutRequested()
            if (r2 == 0) goto L_0x0022
            r6.f4844q = r10
            goto L_0x0025
        L_0x0022:
            int r1 = r1 + 1
            goto L_0x0013
        L_0x0025:
            android.content.Context r0 = r23.getContext()
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            int r0 = r0.flags
            r1 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x003c
            int r0 = r23.getLayoutDirection()
            if (r10 != r0) goto L_0x003c
            r0 = r10
            goto L_0x003d
        L_0x003c:
            r0 = r9
        L_0x003d:
            s.e r11 = r6.f4840c
            r11.f11368v0 = r0
            boolean r0 = r6.f4844q
            if (r0 == 0) goto L_0x0595
            r6.f4844q = r9
            int r0 = r23.getChildCount()
            r1 = r9
        L_0x004c:
            if (r1 >= r0) goto L_0x005d
            android.view.View r2 = r6.getChildAt(r1)
            boolean r2 = r2.isLayoutRequested()
            if (r2 == 0) goto L_0x005a
            r12 = r10
            goto L_0x005e
        L_0x005a:
            int r1 = r1 + 1
            goto L_0x004c
        L_0x005d:
            r12 = r9
        L_0x005e:
            if (r12 == 0) goto L_0x058e
            boolean r13 = r23.isInEditMode()
            int r14 = r23.getChildCount()
            r0 = r9
        L_0x0069:
            if (r0 >= r14) goto L_0x007c
            android.view.View r1 = r6.getChildAt(r0)
            s.d r1 = r6.g(r1)
            if (r1 != 0) goto L_0x0076
            goto L_0x0079
        L_0x0076:
            r1.C()
        L_0x0079:
            int r0 = r0 + 1
            goto L_0x0069
        L_0x007c:
            r0 = 0
            r15 = -1
            if (r13 == 0) goto L_0x0104
            r1 = r9
        L_0x0081:
            if (r1 >= r14) goto L_0x0104
            android.view.View r2 = r6.getChildAt(r1)
            android.content.res.Resources r3 = r23.getResources()     // Catch:{ NotFoundException -> 0x00ff }
            int r4 = r2.getId()     // Catch:{ NotFoundException -> 0x00ff }
            java.lang.String r3 = r3.getResourceName(r4)     // Catch:{ NotFoundException -> 0x00ff }
            int r4 = r2.getId()     // Catch:{ NotFoundException -> 0x00ff }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ NotFoundException -> 0x00ff }
            if (r3 == 0) goto L_0x00bd
            java.util.HashMap r5 = r6.f4849v     // Catch:{ NotFoundException -> 0x00ff }
            if (r5 != 0) goto L_0x00a8
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ NotFoundException -> 0x00ff }
            r5.<init>()     // Catch:{ NotFoundException -> 0x00ff }
            r6.f4849v = r5     // Catch:{ NotFoundException -> 0x00ff }
        L_0x00a8:
            java.lang.String r5 = "/"
            int r5 = r3.indexOf(r5)     // Catch:{ NotFoundException -> 0x00ff }
            if (r5 == r15) goto L_0x00b7
            int r5 = r5 + 1
            java.lang.String r5 = r3.substring(r5)     // Catch:{ NotFoundException -> 0x00ff }
            goto L_0x00b8
        L_0x00b7:
            r5 = r3
        L_0x00b8:
            java.util.HashMap r10 = r6.f4849v     // Catch:{ NotFoundException -> 0x00ff }
            r10.put(r5, r4)     // Catch:{ NotFoundException -> 0x00ff }
        L_0x00bd:
            r4 = 47
            int r4 = r3.indexOf(r4)     // Catch:{ NotFoundException -> 0x00ff }
            if (r4 == r15) goto L_0x00cb
            int r4 = r4 + 1
            java.lang.String r3 = r3.substring(r4)     // Catch:{ NotFoundException -> 0x00ff }
        L_0x00cb:
            int r2 = r2.getId()     // Catch:{ NotFoundException -> 0x00ff }
            if (r2 != 0) goto L_0x00d3
        L_0x00d1:
            r2 = r11
            goto L_0x00fd
        L_0x00d3:
            android.util.SparseArray r4 = r6.f4838a     // Catch:{ NotFoundException -> 0x00ff }
            java.lang.Object r4 = r4.get(r2)     // Catch:{ NotFoundException -> 0x00ff }
            android.view.View r4 = (android.view.View) r4     // Catch:{ NotFoundException -> 0x00ff }
            if (r4 != 0) goto L_0x00ee
            android.view.View r4 = r6.findViewById(r2)     // Catch:{ NotFoundException -> 0x00ff }
            if (r4 == 0) goto L_0x00ee
            if (r4 == r6) goto L_0x00ee
            android.view.ViewParent r2 = r4.getParent()     // Catch:{ NotFoundException -> 0x00ff }
            if (r2 != r6) goto L_0x00ee
            r6.onViewAdded(r4)     // Catch:{ NotFoundException -> 0x00ff }
        L_0x00ee:
            if (r4 != r6) goto L_0x00f1
            goto L_0x00d1
        L_0x00f1:
            if (r4 != 0) goto L_0x00f5
            r2 = r0
            goto L_0x00fd
        L_0x00f5:
            android.view.ViewGroup$LayoutParams r2 = r4.getLayoutParams()     // Catch:{ NotFoundException -> 0x00ff }
            v.e r2 = (v.e) r2     // Catch:{ NotFoundException -> 0x00ff }
            s.d r2 = r2.f12013p0     // Catch:{ NotFoundException -> 0x00ff }
        L_0x00fd:
            r2.f11326h0 = r3     // Catch:{ NotFoundException -> 0x00ff }
        L_0x00ff:
            int r1 = r1 + 1
            r10 = 1
            goto L_0x0081
        L_0x0104:
            int r1 = r6.f4848u
            if (r1 == r15) goto L_0x0115
            r1 = r9
        L_0x0109:
            if (r1 >= r14) goto L_0x0115
            android.view.View r2 = r6.getChildAt(r1)
            r2.getId()
            int r1 = r1 + 1
            goto L_0x0109
        L_0x0115:
            v.n r1 = r6.f4846s
            if (r1 == 0) goto L_0x011c
            r1.a(r6)
        L_0x011c:
            java.util.ArrayList r1 = r11.f11364q0
            r1.clear()
            java.util.ArrayList r1 = r6.f4839b
            int r2 = r1.size()
            if (r2 <= 0) goto L_0x01cf
            r3 = r9
        L_0x012a:
            if (r3 >= r2) goto L_0x01cf
            java.lang.Object r4 = r1.get(r3)
            v.c r4 = (v.c) r4
            boolean r5 = r4.isInEditMode()
            if (r5 == 0) goto L_0x013d
            java.lang.String r5 = r4.f11956e
            r4.setIds(r5)
        L_0x013d:
            s.i r5 = r4.d
            if (r5 != 0) goto L_0x0145
            r17 = r1
            goto L_0x01c6
        L_0x0145:
            r5.f11426r0 = r9
            s.d[] r5 = r5.f11425q0
            java.util.Arrays.fill(r5, r0)
            r5 = r9
        L_0x014d:
            int r0 = r4.f11954b
            if (r5 >= r0) goto L_0x01bf
            int[] r0 = r4.f11953a
            r0 = r0[r5]
            android.util.SparseArray r15 = r6.f4838a
            java.lang.Object r15 = r15.get(r0)
            android.view.View r15 = (android.view.View) r15
            if (r15 != 0) goto L_0x0185
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.util.HashMap r9 = r4.f11958p
            java.lang.Object r0 = r9.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            int r10 = r4.f(r6, r0)
            if (r10 == 0) goto L_0x0185
            int[] r15 = r4.f11953a
            r15[r5] = r10
            java.lang.Integer r15 = java.lang.Integer.valueOf(r10)
            r9.put(r15, r0)
            android.util.SparseArray r0 = r6.f4838a
            java.lang.Object r0 = r0.get(r10)
            r15 = r0
            android.view.View r15 = (android.view.View) r15
        L_0x0185:
            if (r15 == 0) goto L_0x01b6
            s.i r0 = r4.d
            s.d r9 = r6.g(r15)
            r0.getClass()
            if (r9 == r0) goto L_0x01b6
            if (r9 != 0) goto L_0x0195
            goto L_0x01b6
        L_0x0195:
            int r10 = r0.f11426r0
            r15 = 1
            int r10 = r10 + r15
            s.d[] r15 = r0.f11425q0
            r17 = r1
            int r1 = r15.length
            if (r10 <= r1) goto L_0x01ab
            int r1 = r15.length
            r10 = 2
            int r1 = r1 * r10
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r15, r1)
            s.d[] r1 = (s.d[]) r1
            r0.f11425q0 = r1
        L_0x01ab:
            s.d[] r1 = r0.f11425q0
            int r10 = r0.f11426r0
            r1[r10] = r9
            r1 = 1
            int r10 = r10 + r1
            r0.f11426r0 = r10
            goto L_0x01b8
        L_0x01b6:
            r17 = r1
        L_0x01b8:
            int r5 = r5 + 1
            r1 = r17
            r9 = 0
            r15 = -1
            goto L_0x014d
        L_0x01bf:
            r17 = r1
            s.i r0 = r4.d
            r0.S()
        L_0x01c6:
            int r3 = r3 + 1
            r1 = r17
            r0 = 0
            r9 = 0
            r15 = -1
            goto L_0x012a
        L_0x01cf:
            r0 = 0
        L_0x01d0:
            if (r0 >= r14) goto L_0x01d8
            r6.getChildAt(r0)
            int r0 = r0 + 1
            goto L_0x01d0
        L_0x01d8:
            android.util.SparseArray r9 = r6.f4850w
            r9.clear()
            r0 = 0
            r9.put(r0, r11)
            int r0 = r23.getId()
            r9.put(r0, r11)
            r0 = 0
        L_0x01e9:
            if (r0 >= r14) goto L_0x01fd
            android.view.View r1 = r6.getChildAt(r0)
            s.d r2 = r6.g(r1)
            int r1 = r1.getId()
            r9.put(r1, r2)
            int r0 = r0 + 1
            goto L_0x01e9
        L_0x01fd:
            r10 = 0
        L_0x01fe:
            if (r10 >= r14) goto L_0x058e
            android.view.View r0 = r6.getChildAt(r10)
            s.d r15 = r6.g(r0)
            if (r15 != 0) goto L_0x0211
        L_0x020a:
            r16 = r14
            r0 = 2
            r3 = 1
            r4 = -1
            goto L_0x0582
        L_0x0211:
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            r5 = r1
            v.e r5 = (v.e) r5
            java.util.ArrayList r1 = r11.f11364q0
            r1.add(r15)
            s.d r1 = r15.f11307T
            if (r1 == 0) goto L_0x022b
            s.e r1 = (s.e) r1
            java.util.ArrayList r1 = r1.f11364q0
            r1.remove(r15)
            r15.C()
        L_0x022b:
            r15.f11307T = r11
            r5.a()
            int r1 = r0.getVisibility()
            r15.f11325g0 = r1
            r15.f11324f0 = r0
            boolean r1 = r0 instanceof v.c
            if (r1 == 0) goto L_0x0243
            v.c r0 = (v.c) r0
            boolean r1 = r11.f11368v0
            r0.h(r15, r1)
        L_0x0243:
            boolean r0 = r5.f11991d0
            if (r0 == 0) goto L_0x0278
            s.h r15 = (s.h) r15
            int r0 = r5.f12007m0
            int r1 = r5.f12009n0
            float r2 = r5.f12011o0
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 == 0) goto L_0x0261
            if (r4 <= 0) goto L_0x025f
            r15.f11420q0 = r2
            r2 = -1
            r15.f11421r0 = r2
            r15.s0 = r2
            goto L_0x020a
        L_0x025f:
            r2 = -1
            goto L_0x020a
        L_0x0261:
            r2 = -1
            if (r0 == r2) goto L_0x026d
            if (r0 <= r2) goto L_0x020a
            r15.f11420q0 = r3
            r15.f11421r0 = r0
            r15.s0 = r2
            goto L_0x020a
        L_0x026d:
            if (r1 == r2) goto L_0x020a
            if (r1 <= r2) goto L_0x020a
            r15.f11420q0 = r3
            r15.f11421r0 = r2
            r15.s0 = r1
            goto L_0x020a
        L_0x0278:
            int r0 = r5.f11995f0
            int r1 = r5.f11996g0
            int r2 = r5.f11997h0
            int r3 = r5.f11999i0
            int r4 = r5.f12001j0
            r16 = r14
            int r14 = r5.f12003k0
            float r7 = r5.f12005l0
            int r8 = r5.f12012p
            r6 = -1
            if (r8 == r6) goto L_0x02ad
            java.lang.Object r0 = r9.get(r8)
            r22 = r0
            s.d r22 = (s.d) r22
            if (r22 == 0) goto L_0x02aa
            float r0 = r5.f12015r
            int r1 = r5.f12014q
            r19 = 7
            r21 = 0
            r17 = r15
            r18 = r19
            r20 = r1
            r17.v(r18, r19, r20, r21, r22)
            r15.f11292D = r0
        L_0x02aa:
            r14 = r5
            goto L_0x03eb
        L_0x02ad:
            if (r0 == r6) goto L_0x02cb
            java.lang.Object r0 = r9.get(r0)
            r22 = r0
            s.d r22 = (s.d) r22
            if (r22 == 0) goto L_0x02c9
            int r0 = r5.leftMargin
            r17 = r15
            r1 = 2
            r18 = r1
            r19 = r1
            r20 = r0
            r21 = r4
            r17.v(r18, r19, r20, r21, r22)
        L_0x02c9:
            r0 = -1
            goto L_0x02ea
        L_0x02cb:
            r0 = r6
            if (r1 == r0) goto L_0x02ea
            java.lang.Object r0 = r9.get(r1)
            r22 = r0
            s.d r22 = (s.d) r22
            if (r22 == 0) goto L_0x02c9
            int r0 = r5.leftMargin
            r17 = r15
            r1 = 2
            r18 = r1
            r1 = 4
            r19 = r1
            r20 = r0
            r21 = r4
            r17.v(r18, r19, r20, r21, r22)
            goto L_0x02c9
        L_0x02ea:
            if (r2 == r0) goto L_0x0308
            java.lang.Object r0 = r9.get(r2)
            r22 = r0
            s.d r22 = (s.d) r22
            if (r22 == 0) goto L_0x0324
            int r0 = r5.rightMargin
            r17 = r15
            r1 = 4
            r18 = r1
            r1 = 2
            r19 = r1
            r20 = r0
            r21 = r14
            r17.v(r18, r19, r20, r21, r22)
            goto L_0x0324
        L_0x0308:
            if (r3 == r0) goto L_0x0324
            java.lang.Object r0 = r9.get(r3)
            r22 = r0
            s.d r22 = (s.d) r22
            if (r22 == 0) goto L_0x0324
            int r0 = r5.rightMargin
            r17 = r15
            r1 = 4
            r18 = r1
            r19 = r1
            r20 = r0
            r21 = r14
            r17.v(r18, r19, r20, r21, r22)
        L_0x0324:
            int r0 = r5.f11998i
            r1 = -1
            if (r0 == r1) goto L_0x0346
            java.lang.Object r0 = r9.get(r0)
            r22 = r0
            s.d r22 = (s.d) r22
            if (r22 == 0) goto L_0x0368
            int r0 = r5.topMargin
            int r1 = r5.f12021x
            r17 = r15
            r2 = 3
            r18 = r2
            r19 = r2
            r20 = r0
            r21 = r1
            r17.v(r18, r19, r20, r21, r22)
            goto L_0x0368
        L_0x0346:
            int r0 = r5.f12000j
            r1 = -1
            if (r0 == r1) goto L_0x0368
            java.lang.Object r0 = r9.get(r0)
            r22 = r0
            s.d r22 = (s.d) r22
            if (r22 == 0) goto L_0x0368
            int r0 = r5.topMargin
            int r1 = r5.f12021x
            r17 = r15
            r2 = 3
            r18 = r2
            r2 = 5
            r19 = r2
            r20 = r0
            r21 = r1
            r17.v(r18, r19, r20, r21, r22)
        L_0x0368:
            int r0 = r5.f12002k
            r1 = -1
            if (r0 == r1) goto L_0x038b
            java.lang.Object r0 = r9.get(r0)
            r22 = r0
            s.d r22 = (s.d) r22
            if (r22 == 0) goto L_0x03ac
            int r0 = r5.bottomMargin
            int r1 = r5.f12023z
            r17 = r15
            r2 = 5
            r18 = r2
            r2 = 3
            r19 = r2
            r20 = r0
            r21 = r1
            r17.v(r18, r19, r20, r21, r22)
            goto L_0x03ac
        L_0x038b:
            int r0 = r5.f12004l
            r1 = -1
            if (r0 == r1) goto L_0x03ac
            java.lang.Object r0 = r9.get(r0)
            r22 = r0
            s.d r22 = (s.d) r22
            if (r22 == 0) goto L_0x03ac
            int r0 = r5.bottomMargin
            int r1 = r5.f12023z
            r17 = r15
            r2 = 5
            r18 = r2
            r19 = r2
            r20 = r0
            r21 = r1
            r17.v(r18, r19, r20, r21, r22)
        L_0x03ac:
            int r4 = r5.f12006m
            r6 = -1
            if (r4 == r6) goto L_0x03be
            r8 = 6
            r0 = r23
            r1 = r15
            r2 = r5
            r3 = r9
            r14 = r5
            r5 = r8
            r0.k(r1, r2, r3, r4, r5)
        L_0x03bc:
            r0 = 0
            goto L_0x03dd
        L_0x03be:
            r14 = r5
            int r4 = r14.f12008n
            if (r4 == r6) goto L_0x03ce
            r0 = r23
            r1 = r15
            r2 = r14
            r3 = r9
            r8 = 3
            r5 = r8
            r0.k(r1, r2, r3, r4, r5)
            goto L_0x03bc
        L_0x03ce:
            int r4 = r14.f12010o
            if (r4 == r6) goto L_0x03bc
            r0 = r23
            r1 = r15
            r2 = r14
            r3 = r9
            r6 = 5
            r5 = r6
            r0.k(r1, r2, r3, r4, r5)
            goto L_0x03bc
        L_0x03dd:
            int r1 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r1 < 0) goto L_0x03e3
            r15.f11320d0 = r7
        L_0x03e3:
            float r1 = r14.F
            int r2 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r2 < 0) goto L_0x03eb
            r15.f11322e0 = r1
        L_0x03eb:
            if (r13 == 0) goto L_0x03fc
            int r0 = r14.f11978T
            r1 = -1
            if (r0 != r1) goto L_0x03f6
            int r2 = r14.f11979U
            if (r2 == r1) goto L_0x03fc
        L_0x03f6:
            int r1 = r14.f11979U
            r15.f11312Y = r0
            r15.f11313Z = r1
        L_0x03fc:
            boolean r0 = r14.f11986a0
            r1 = 3
            r2 = 4
            r3 = -2
            if (r0 != 0) goto L_0x042f
            int r0 = r14.width
            r4 = -1
            if (r0 != r4) goto L_0x0427
            boolean r0 = r14.f11981W
            if (r0 == 0) goto L_0x0411
            r15.M(r1)
        L_0x040f:
            r0 = 2
            goto L_0x0415
        L_0x0411:
            r15.M(r2)
            goto L_0x040f
        L_0x0415:
            s.c r0 = r15.i(r0)
            int r4 = r14.leftMargin
            r0.g = r4
            r0 = 4
            s.c r0 = r15.i(r0)
            int r4 = r14.rightMargin
            r0.g = r4
            goto L_0x0440
        L_0x0427:
            r15.M(r1)
            r0 = 0
            r15.O(r0)
            goto L_0x0440
        L_0x042f:
            r0 = 1
            r15.M(r0)
            int r0 = r14.width
            r15.O(r0)
            int r0 = r14.width
            if (r0 != r3) goto L_0x0440
            r0 = 2
            r15.M(r0)
        L_0x0440:
            boolean r0 = r14.f11988b0
            if (r0 != 0) goto L_0x0470
            int r0 = r14.height
            r4 = -1
            if (r0 != r4) goto L_0x0468
            boolean r0 = r14.f11982X
            if (r0 == 0) goto L_0x0452
            r15.N(r1)
        L_0x0450:
            r0 = 3
            goto L_0x0456
        L_0x0452:
            r15.N(r2)
            goto L_0x0450
        L_0x0456:
            s.c r0 = r15.i(r0)
            int r2 = r14.topMargin
            r0.g = r2
            r0 = 5
            s.c r0 = r15.i(r0)
            int r2 = r14.bottomMargin
            r0.g = r2
            goto L_0x0482
        L_0x0468:
            r15.N(r1)
            r0 = 0
            r15.L(r0)
            goto L_0x0482
        L_0x0470:
            r0 = 1
            r4 = -1
            r15.N(r0)
            int r0 = r14.height
            r15.L(r0)
            int r0 = r14.height
            if (r0 != r3) goto L_0x0482
            r0 = 2
            r15.N(r0)
        L_0x0482:
            java.lang.String r0 = r14.f11965G
            if (r0 == 0) goto L_0x048c
            int r2 = r0.length()
            if (r2 != 0) goto L_0x048f
        L_0x048c:
            r2 = 0
            goto L_0x051b
        L_0x048f:
            int r2 = r0.length()
            r3 = 44
            int r3 = r0.indexOf(r3)
            if (r3 <= 0) goto L_0x04bc
            int r5 = r2 + -1
            if (r3 >= r5) goto L_0x04bc
            r5 = 0
            java.lang.String r6 = r0.substring(r5, r3)
            java.lang.String r5 = "W"
            boolean r5 = r6.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x04ae
            r5 = 0
            goto L_0x04b9
        L_0x04ae:
            java.lang.String r5 = "H"
            boolean r5 = r6.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x04b8
            r5 = 1
            goto L_0x04b9
        L_0x04b8:
            r5 = r4
        L_0x04b9:
            int r3 = r3 + 1
            goto L_0x04be
        L_0x04bc:
            r5 = r4
            r3 = 0
        L_0x04be:
            r6 = 58
            int r6 = r0.indexOf(r6)
            if (r6 < 0) goto L_0x0501
            int r2 = r2 + -1
            if (r6 >= r2) goto L_0x0501
            java.lang.String r2 = r0.substring(r3, r6)
            int r6 = r6 + 1
            java.lang.String r0 = r0.substring(r6)
            int r3 = r2.length()
            if (r3 <= 0) goto L_0x0510
            int r3 = r0.length()
            if (r3 <= 0) goto L_0x0510
            float r2 = java.lang.Float.parseFloat(r2)     // Catch:{ NumberFormatException -> 0x0510 }
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x0510 }
            r3 = 0
            int r6 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r6 <= 0) goto L_0x0510
            int r6 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r6 <= 0) goto L_0x0510
            r3 = 1
            if (r5 != r3) goto L_0x04fa
            float r0 = r0 / r2
            float r0 = java.lang.Math.abs(r0)     // Catch:{ NumberFormatException -> 0x0510 }
            goto L_0x04ff
        L_0x04fa:
            float r2 = r2 / r0
            float r0 = java.lang.Math.abs(r2)     // Catch:{ NumberFormatException -> 0x0510 }
        L_0x04ff:
            r2 = 0
            goto L_0x0512
        L_0x0501:
            java.lang.String r0 = r0.substring(r3)
            int r2 = r0.length()
            if (r2 <= 0) goto L_0x0510
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x0510 }
            goto L_0x04ff
        L_0x0510:
            r0 = 0
            goto L_0x04ff
        L_0x0512:
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x051d
            r15.f11310W = r0
            r15.f11311X = r5
            goto L_0x051d
        L_0x051b:
            r15.f11310W = r2
        L_0x051d:
            float r0 = r14.f11966H
            float[] r2 = r15.f11332k0
            r3 = 0
            r2[r3] = r0
            float r0 = r14.f11967I
            r3 = 1
            r2[r3] = r0
            int r0 = r14.f11968J
            r15.f11328i0 = r0
            int r0 = r14.f11969K
            r15.f11330j0 = r0
            int r0 = r14.f11984Z
            if (r0 < 0) goto L_0x0539
            if (r0 > r1) goto L_0x0539
            r15.f11343q = r0
        L_0x0539:
            int r0 = r14.f11970L
            int r1 = r14.f11972N
            int r2 = r14.f11974P
            float r5 = r14.f11976R
            r15.f11344r = r0
            r15.f11347u = r1
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r2 != r1) goto L_0x054b
            r2 = 0
        L_0x054b:
            r15.f11348v = r2
            r15.f11349w = r5
            r2 = 0
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r6 <= 0) goto L_0x055f
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r5 >= 0) goto L_0x055f
            if (r0 != 0) goto L_0x055f
            r0 = 2
            r15.f11344r = r0
        L_0x055f:
            int r0 = r14.f11971M
            int r5 = r14.f11973O
            int r6 = r14.f11975Q
            float r7 = r14.f11977S
            r15.f11345s = r0
            r15.f11350x = r5
            if (r6 != r1) goto L_0x056e
            r6 = 0
        L_0x056e:
            r15.f11351y = r6
            r15.f11352z = r7
            r1 = 0
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x0581
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x0581
            if (r0 != 0) goto L_0x0581
            r0 = 2
            r15.f11345s = r0
            goto L_0x0582
        L_0x0581:
            r0 = 2
        L_0x0582:
            int r10 = r10 + 1
            r6 = r23
            r7 = r24
            r8 = r25
            r14 = r16
            goto L_0x01fe
        L_0x058e:
            if (r12 == 0) goto L_0x0595
            c1.i r0 = r11.f11365r0
            r0.M(r11)
        L_0x0595:
            q.c r0 = r11.f11369w0
            r0.getClass()
            r0 = r23
            int r1 = r0.f4845r
            r2 = r24
            r3 = r25
            r0.j(r11, r1, r2, r3)
            int r1 = r11.q()
            int r4 = r11.k()
            boolean r5 = r11.f11357E0
            boolean r6 = r11.f11358F0
            v.f r7 = r0.f4851x
            int r8 = r7.f12027e
            int r7 = r7.d
            int r1 = r1 + r7
            int r4 = r4 + r8
            r7 = 0
            int r1 = android.view.View.resolveSizeAndState(r1, r2, r7)
            int r2 = android.view.View.resolveSizeAndState(r4, r3, r7)
            r3 = 16777215(0xffffff, float:2.3509886E-38)
            r1 = r1 & r3
            r2 = r2 & r3
            int r3 = r0.f4842f
            int r1 = java.lang.Math.min(r3, r1)
            int r3 = r0.f4843p
            int r2 = java.lang.Math.min(r3, r2)
            r3 = 16777216(0x1000000, float:2.3509887E-38)
            if (r5 == 0) goto L_0x05d8
            r1 = r1 | r3
        L_0x05d8:
            if (r6 == 0) goto L_0x05db
            r2 = r2 | r3
        L_0x05db:
            r0.setMeasuredDimension(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        d g = g(view);
        if ((view instanceof Guideline) && !(g instanceof h)) {
            v.e eVar = (v.e) view.getLayoutParams();
            h hVar = new h();
            eVar.f12013p0 = hVar;
            eVar.f11991d0 = true;
            hVar.S(eVar.f11980V);
        }
        if (view instanceof c) {
            c cVar = (c) view;
            cVar.i();
            ((v.e) view.getLayoutParams()).f11993e0 = true;
            ArrayList arrayList = this.f4839b;
            if (!arrayList.contains(cVar)) {
                arrayList.add(cVar);
            }
        }
        this.f4838a.put(view.getId(), view);
        this.f4844q = true;
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f4838a.remove(view.getId());
        d g = g(view);
        this.f4840c.f11364q0.remove(g);
        g.C();
        this.f4839b.remove(view);
        this.f4844q = true;
    }

    public final void requestLayout() {
        this.f4844q = true;
        super.requestLayout();
    }

    public void setConstraintSet(n nVar) {
        this.f4846s = nVar;
    }

    public void setId(int i2) {
        int id = getId();
        SparseArray sparseArray = this.f4838a;
        sparseArray.remove(id);
        super.setId(i2);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i2) {
        if (i2 != this.f4843p) {
            this.f4843p = i2;
            requestLayout();
        }
    }

    public void setMaxWidth(int i2) {
        if (i2 != this.f4842f) {
            this.f4842f = i2;
            requestLayout();
        }
    }

    public void setMinHeight(int i2) {
        if (i2 != this.f4841e) {
            this.f4841e = i2;
            requestLayout();
        }
    }

    public void setMinWidth(int i2) {
        if (i2 != this.d) {
            this.d = i2;
            requestLayout();
        }
    }

    public void setOnConstraintsChanged(o oVar) {
        a0 a0Var = this.f4847t;
        if (a0Var != null) {
            a0Var.getClass();
        }
    }

    public void setOptimizationLevel(int i2) {
        this.f4845r = i2;
        e eVar = this.f4840c;
        eVar.f11356D0 = i2;
        C0926c.f11046q = eVar.W(512);
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        h(attributeSet, i2);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, v.e] */
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        ? marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
        marginLayoutParams.f11985a = -1;
        marginLayoutParams.f11987b = -1;
        marginLayoutParams.f11989c = -1.0f;
        marginLayoutParams.d = true;
        marginLayoutParams.f11992e = -1;
        marginLayoutParams.f11994f = -1;
        marginLayoutParams.g = -1;
        marginLayoutParams.h = -1;
        marginLayoutParams.f11998i = -1;
        marginLayoutParams.f12000j = -1;
        marginLayoutParams.f12002k = -1;
        marginLayoutParams.f12004l = -1;
        marginLayoutParams.f12006m = -1;
        marginLayoutParams.f12008n = -1;
        marginLayoutParams.f12010o = -1;
        marginLayoutParams.f12012p = -1;
        marginLayoutParams.f12014q = 0;
        marginLayoutParams.f12015r = 0.0f;
        marginLayoutParams.f12016s = -1;
        marginLayoutParams.f12017t = -1;
        marginLayoutParams.f12018u = -1;
        marginLayoutParams.f12019v = -1;
        marginLayoutParams.f12020w = Integer.MIN_VALUE;
        marginLayoutParams.f12021x = Integer.MIN_VALUE;
        marginLayoutParams.f12022y = Integer.MIN_VALUE;
        marginLayoutParams.f12023z = Integer.MIN_VALUE;
        marginLayoutParams.f11960A = Integer.MIN_VALUE;
        marginLayoutParams.f11961B = Integer.MIN_VALUE;
        marginLayoutParams.f11962C = Integer.MIN_VALUE;
        marginLayoutParams.f11963D = 0;
        marginLayoutParams.f11964E = 0.5f;
        marginLayoutParams.F = 0.5f;
        marginLayoutParams.f11965G = null;
        marginLayoutParams.f11966H = -1.0f;
        marginLayoutParams.f11967I = -1.0f;
        marginLayoutParams.f11968J = 0;
        marginLayoutParams.f11969K = 0;
        marginLayoutParams.f11970L = 0;
        marginLayoutParams.f11971M = 0;
        marginLayoutParams.f11972N = 0;
        marginLayoutParams.f11973O = 0;
        marginLayoutParams.f11974P = 0;
        marginLayoutParams.f11975Q = 0;
        marginLayoutParams.f11976R = 1.0f;
        marginLayoutParams.f11977S = 1.0f;
        marginLayoutParams.f11978T = -1;
        marginLayoutParams.f11979U = -1;
        marginLayoutParams.f11980V = -1;
        marginLayoutParams.f11981W = false;
        marginLayoutParams.f11982X = false;
        marginLayoutParams.f11983Y = null;
        marginLayoutParams.f11984Z = 0;
        marginLayoutParams.f11986a0 = true;
        marginLayoutParams.f11988b0 = true;
        marginLayoutParams.f11990c0 = false;
        marginLayoutParams.f11991d0 = false;
        marginLayoutParams.f11993e0 = false;
        marginLayoutParams.f11995f0 = -1;
        marginLayoutParams.f11996g0 = -1;
        marginLayoutParams.f11997h0 = -1;
        marginLayoutParams.f11999i0 = -1;
        marginLayoutParams.f12001j0 = Integer.MIN_VALUE;
        marginLayoutParams.f12003k0 = Integer.MIN_VALUE;
        marginLayoutParams.f12005l0 = 0.5f;
        marginLayoutParams.f12013p0 = new d();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.leftMargin = marginLayoutParams2.leftMargin;
            marginLayoutParams.rightMargin = marginLayoutParams2.rightMargin;
            marginLayoutParams.topMargin = marginLayoutParams2.topMargin;
            marginLayoutParams.bottomMargin = marginLayoutParams2.bottomMargin;
            marginLayoutParams.setMarginStart(marginLayoutParams2.getMarginStart());
            marginLayoutParams.setMarginEnd(marginLayoutParams2.getMarginEnd());
        }
        if (layoutParams instanceof v.e) {
            v.e eVar = (v.e) layoutParams;
            marginLayoutParams.f11985a = eVar.f11985a;
            marginLayoutParams.f11987b = eVar.f11987b;
            marginLayoutParams.f11989c = eVar.f11989c;
            marginLayoutParams.d = eVar.d;
            marginLayoutParams.f11992e = eVar.f11992e;
            marginLayoutParams.f11994f = eVar.f11994f;
            marginLayoutParams.g = eVar.g;
            marginLayoutParams.h = eVar.h;
            marginLayoutParams.f11998i = eVar.f11998i;
            marginLayoutParams.f12000j = eVar.f12000j;
            marginLayoutParams.f12002k = eVar.f12002k;
            marginLayoutParams.f12004l = eVar.f12004l;
            marginLayoutParams.f12006m = eVar.f12006m;
            marginLayoutParams.f12008n = eVar.f12008n;
            marginLayoutParams.f12010o = eVar.f12010o;
            marginLayoutParams.f12012p = eVar.f12012p;
            marginLayoutParams.f12014q = eVar.f12014q;
            marginLayoutParams.f12015r = eVar.f12015r;
            marginLayoutParams.f12016s = eVar.f12016s;
            marginLayoutParams.f12017t = eVar.f12017t;
            marginLayoutParams.f12018u = eVar.f12018u;
            marginLayoutParams.f12019v = eVar.f12019v;
            marginLayoutParams.f12020w = eVar.f12020w;
            marginLayoutParams.f12021x = eVar.f12021x;
            marginLayoutParams.f12022y = eVar.f12022y;
            marginLayoutParams.f12023z = eVar.f12023z;
            marginLayoutParams.f11960A = eVar.f11960A;
            marginLayoutParams.f11961B = eVar.f11961B;
            marginLayoutParams.f11962C = eVar.f11962C;
            marginLayoutParams.f11963D = eVar.f11963D;
            marginLayoutParams.f11964E = eVar.f11964E;
            marginLayoutParams.F = eVar.F;
            marginLayoutParams.f11965G = eVar.f11965G;
            marginLayoutParams.f11966H = eVar.f11966H;
            marginLayoutParams.f11967I = eVar.f11967I;
            marginLayoutParams.f11968J = eVar.f11968J;
            marginLayoutParams.f11969K = eVar.f11969K;
            marginLayoutParams.f11981W = eVar.f11981W;
            marginLayoutParams.f11982X = eVar.f11982X;
            marginLayoutParams.f11970L = eVar.f11970L;
            marginLayoutParams.f11971M = eVar.f11971M;
            marginLayoutParams.f11972N = eVar.f11972N;
            marginLayoutParams.f11974P = eVar.f11974P;
            marginLayoutParams.f11973O = eVar.f11973O;
            marginLayoutParams.f11975Q = eVar.f11975Q;
            marginLayoutParams.f11976R = eVar.f11976R;
            marginLayoutParams.f11977S = eVar.f11977S;
            marginLayoutParams.f11978T = eVar.f11978T;
            marginLayoutParams.f11979U = eVar.f11979U;
            marginLayoutParams.f11980V = eVar.f11980V;
            marginLayoutParams.f11986a0 = eVar.f11986a0;
            marginLayoutParams.f11988b0 = eVar.f11988b0;
            marginLayoutParams.f11990c0 = eVar.f11990c0;
            marginLayoutParams.f11991d0 = eVar.f11991d0;
            marginLayoutParams.f11995f0 = eVar.f11995f0;
            marginLayoutParams.f11996g0 = eVar.f11996g0;
            marginLayoutParams.f11997h0 = eVar.f11997h0;
            marginLayoutParams.f11999i0 = eVar.f11999i0;
            marginLayoutParams.f12001j0 = eVar.f12001j0;
            marginLayoutParams.f12003k0 = eVar.f12003k0;
            marginLayoutParams.f12005l0 = eVar.f12005l0;
            marginLayoutParams.f11983Y = eVar.f11983Y;
            marginLayoutParams.f11984Z = eVar.f11984Z;
            marginLayoutParams.f12013p0 = eVar.f12013p0;
        }
        return marginLayoutParams;
    }
}
