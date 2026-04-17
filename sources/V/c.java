package v;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;
import s.d;
import s.i;

public abstract class c extends View {

    /* renamed from: a  reason: collision with root package name */
    public int[] f11953a;

    /* renamed from: b  reason: collision with root package name */
    public int f11954b;

    /* renamed from: c  reason: collision with root package name */
    public Context f11955c;
    public i d;

    /* renamed from: e  reason: collision with root package name */
    public String f11956e;

    /* renamed from: f  reason: collision with root package name */
    public String f11957f;

    /* renamed from: p  reason: collision with root package name */
    public HashMap f11958p;

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x007f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L_0x0097
            int r0 = r6.length()
            if (r0 != 0) goto L_0x000a
            goto L_0x0097
        L_0x000a:
            android.content.Context r0 = r5.f11955c
            if (r0 != 0) goto L_0x000f
            return
        L_0x000f:
            java.lang.String r6 = r6.trim()
            android.view.ViewParent r1 = r5.getParent()
            boolean r1 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout
            r2 = 0
            if (r1 == 0) goto L_0x0023
            android.view.ViewParent r1 = r5.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            goto L_0x0024
        L_0x0023:
            r1 = r2
        L_0x0024:
            boolean r3 = r5.isInEditMode()
            if (r3 == 0) goto L_0x004b
            if (r1 == 0) goto L_0x004b
            if (r6 == 0) goto L_0x003f
            java.util.HashMap r3 = r1.f4849v
            if (r3 == 0) goto L_0x003f
            boolean r3 = r3.containsKey(r6)
            if (r3 == 0) goto L_0x003f
            java.util.HashMap r3 = r1.f4849v
            java.lang.Object r3 = r3.get(r6)
            goto L_0x0040
        L_0x003f:
            r3 = r2
        L_0x0040:
            boolean r4 = r3 instanceof java.lang.Integer
            if (r4 == 0) goto L_0x004b
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            goto L_0x004c
        L_0x004b:
            r3 = 0
        L_0x004c:
            if (r3 != 0) goto L_0x0054
            if (r1 == 0) goto L_0x0054
            int r3 = r5.f(r1, r6)
        L_0x0054:
            if (r3 != 0) goto L_0x0060
            java.lang.Class<v.p> r1 = v.p.class
            java.lang.reflect.Field r1 = r1.getField(r6)     // Catch:{ Exception -> 0x0060 }
            int r3 = r1.getInt(r2)     // Catch:{ Exception -> 0x0060 }
        L_0x0060:
            if (r3 != 0) goto L_0x0070
            android.content.res.Resources r1 = r0.getResources()
            java.lang.String r2 = "id"
            java.lang.String r0 = r0.getPackageName()
            int r3 = r1.getIdentifier(r6, r2, r0)
        L_0x0070:
            if (r3 == 0) goto L_0x007f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            java.util.HashMap r1 = r5.f11958p
            r1.put(r0, r6)
            r5.b(r3)
            goto L_0x0097
        L_0x007f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Could not find id of \""
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = "\""
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "ConstraintHelper"
            android.util.Log.w(r0, r6)
        L_0x0097:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v.c.a(java.lang.String):void");
    }

    public final void b(int i2) {
        if (i2 != getId()) {
            int i5 = this.f11954b + 1;
            int[] iArr = this.f11953a;
            if (i5 > iArr.length) {
                this.f11953a = Arrays.copyOf(iArr, iArr.length * 2);
            }
            int[] iArr2 = this.f11953a;
            int i6 = this.f11954b;
            iArr2[i6] = i2;
            this.f11954b = i6 + 1;
        }
    }

    public final void c(String str) {
        ConstraintLayout constraintLayout;
        if (str != null && str.length() != 0 && this.f11955c != null) {
            String trim = str.trim();
            if (getParent() instanceof ConstraintLayout) {
                constraintLayout = (ConstraintLayout) getParent();
            } else {
                constraintLayout = null;
            }
            if (constraintLayout == null) {
                Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
                return;
            }
            int childCount = constraintLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = constraintLayout.getChildAt(i2);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if ((layoutParams instanceof e) && trim.equals(((e) layoutParams).f11983Y)) {
                    if (childAt.getId() == -1) {
                        Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                    } else {
                        b(childAt.getId());
                    }
                }
            }
        }
    }

    public final void d(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i2 = 0; i2 < this.f11954b; i2++) {
            View view = (View) constraintLayout.f4838a.get(this.f11953a[i2]);
            if (view != null) {
                view.setVisibility(visibility);
                if (elevation > 0.0f) {
                    view.setTranslationZ(view.getTranslationZ() + elevation);
                }
            }
        }
    }

    public final int f(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String str2;
        if (str == null || constraintLayout == null || (resources = this.f11955c.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            if (childAt.getId() != -1) {
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    str2 = null;
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    public void g(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, q.f12138b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 35) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f11956e = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f11957f = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f11953a, this.f11954b);
    }

    public abstract void h(d dVar, boolean z3);

    public final void i() {
        if (this.d != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof e) {
                ((e) layoutParams).f12013p0 = this.d;
            }
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f11956e;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f11957f;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    public void onMeasure(int i2, int i5) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f11956e = str;
        if (str != null) {
            int i2 = 0;
            this.f11954b = 0;
            while (true) {
                int indexOf = str.indexOf(44, i2);
                if (indexOf == -1) {
                    a(str.substring(i2));
                    return;
                } else {
                    a(str.substring(i2, indexOf));
                    i2 = indexOf + 1;
                }
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f11957f = str;
        if (str != null) {
            int i2 = 0;
            this.f11954b = 0;
            while (true) {
                int indexOf = str.indexOf(44, i2);
                if (indexOf == -1) {
                    c(str.substring(i2));
                    return;
                } else {
                    c(str.substring(i2, indexOf));
                    i2 = indexOf + 1;
                }
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f11956e = null;
        this.f11954b = 0;
        for (int b6 : iArr) {
            b(b6);
        }
    }

    public final void setTag(int i2, Object obj) {
        super.setTag(i2, obj);
        if (obj == null && this.f11956e == null) {
            b(i2);
        }
    }

    public void e(ConstraintLayout constraintLayout) {
    }

    public final void onDraw(Canvas canvas) {
    }
}
