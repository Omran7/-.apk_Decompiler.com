package com.google.android.material.button;

import K.O;
import Y1.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import com.google.android.material.datepicker.i;
import com.google.android.material.timepicker.f;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.fragments.gangBase.I;
import e2.C0485a;
import e2.C0488d;
import e2.C0489e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import m2.k;
import s2.C0962a;
import s2.j;
import x2.C1097a;

public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: t  reason: collision with root package name */
    public static final /* synthetic */ int f6356t = 0;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f6357a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final I f6358b = new I(this, 20);

    /* renamed from: c  reason: collision with root package name */
    public final LinkedHashSet f6359c = new LinkedHashSet();
    public final C0488d d = new C0488d(this);

    /* renamed from: e  reason: collision with root package name */
    public Integer[] f6360e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f6361f = false;

    /* renamed from: p  reason: collision with root package name */
    public boolean f6362p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f6363q;

    /* renamed from: r  reason: collision with root package name */
    public final int f6364r;

    /* renamed from: s  reason: collision with root package name */
    public HashSet f6365s = new HashSet();

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(C1097a.a(context, attributeSet, R.attr.materialButtonToggleGroupStyle, 2131952678), attributeSet, R.attr.materialButtonToggleGroupStyle);
        TypedArray f6 = k.f(getContext(), attributeSet, a.f4254k, R.attr.materialButtonToggleGroupStyle, 2131952678, new int[0]);
        setSingleSelection(f6.getBoolean(3, false));
        this.f6364r = f6.getResourceId(1, -1);
        this.f6363q = f6.getBoolean(2, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(f6.getBoolean(0, true));
        f6.recycle();
        WeakHashMap weakHashMap = O.f1352a;
        setImportantForAccessibility(1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (c(i2)) {
                return i2;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (c(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i2 = 0;
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            if ((getChildAt(i5) instanceof MaterialButton) && c(i5)) {
                i2++;
            }
        }
        return i2;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            WeakHashMap weakHashMap = O.f1352a;
            materialButton.setId(View.generateViewId());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f6358b);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public final void a() {
        LinearLayout.LayoutParams layoutParams;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex != -1) {
            for (int i2 = firstVisibleChildIndex + 1; i2 < getChildCount(); i2++) {
                MaterialButton materialButton = (MaterialButton) getChildAt(i2);
                int min = Math.min(materialButton.getStrokeWidth(), ((MaterialButton) getChildAt(i2 - 1)).getStrokeWidth());
                ViewGroup.LayoutParams layoutParams2 = materialButton.getLayoutParams();
                if (layoutParams2 instanceof LinearLayout.LayoutParams) {
                    layoutParams = (LinearLayout.LayoutParams) layoutParams2;
                } else {
                    layoutParams = new LinearLayout.LayoutParams(layoutParams2.width, layoutParams2.height);
                }
                if (getOrientation() == 0) {
                    layoutParams.setMarginEnd(0);
                    layoutParams.setMarginStart(-min);
                    layoutParams.topMargin = 0;
                } else {
                    layoutParams.bottomMargin = 0;
                    layoutParams.topMargin = -min;
                    layoutParams.setMarginStart(0);
                }
                materialButton.setLayoutParams(layoutParams);
            }
            if (getChildCount() != 0 && firstVisibleChildIndex != -1) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
                if (getOrientation() == 1) {
                    layoutParams3.topMargin = 0;
                    layoutParams3.bottomMargin = 0;
                    return;
                }
                layoutParams3.setMarginEnd(0);
                layoutParams3.setMarginStart(0);
                layoutParams3.leftMargin = 0;
                layoutParams3.rightMargin = 0;
            }
        }
    }

    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i2, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        b(materialButton.getId(), materialButton.f6353x);
        s2.k shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f6357a.add(new C0489e(shapeAppearanceModel.f11488e, shapeAppearanceModel.h, shapeAppearanceModel.f11489f, shapeAppearanceModel.g));
        materialButton.setEnabled(isEnabled());
        O.l(materialButton, new i(this, 1));
    }

    public final void b(int i2, boolean z3) {
        if (i2 == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i2);
            return;
        }
        HashSet hashSet = new HashSet(this.f6365s);
        if (z3 && !hashSet.contains(Integer.valueOf(i2))) {
            if (this.f6362p && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i2));
        } else if (!z3 && hashSet.contains(Integer.valueOf(i2))) {
            if (!this.f6363q || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i2));
            }
        } else {
            return;
        }
        d(hashSet);
    }

    public final boolean c(int i2) {
        if (getChildAt(i2).getVisibility() != 8) {
            return true;
        }
        return false;
    }

    public final void d(Set set) {
        HashSet hashSet = this.f6365s;
        this.f6365s = new HashSet(set);
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            int id = ((MaterialButton) getChildAt(i2)).getId();
            boolean contains = set.contains(Integer.valueOf(id));
            View findViewById = findViewById(id);
            if (findViewById instanceof MaterialButton) {
                this.f6361f = true;
                ((MaterialButton) findViewById).setChecked(contains);
                this.f6361f = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                set.contains(Integer.valueOf(id));
                Iterator it2 = this.f6359c.iterator();
                while (it2.hasNext()) {
                    ((f) it2.next()).a();
                }
            }
        }
        invalidate();
    }

    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.d);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            treeMap.put((MaterialButton) getChildAt(i2), Integer.valueOf(i2));
        }
        this.f6360e = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public final void e() {
        boolean z3;
        C0489e eVar;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i2 = 0; i2 < childCount; i2++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i2);
            if (materialButton.getVisibility() != 8) {
                j e6 = materialButton.getShapeAppearanceModel().e();
                C0489e eVar2 = (C0489e) this.f6357a.get(i2);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    if (getOrientation() == 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    C0962a aVar = C0489e.f7593e;
                    if (i2 == firstVisibleChildIndex) {
                        if (!z3) {
                            eVar = new C0489e(eVar2.f7594a, aVar, eVar2.f7595b, aVar);
                        } else if (k.e(this)) {
                            eVar = new C0489e(aVar, aVar, eVar2.f7595b, eVar2.f7596c);
                        } else {
                            eVar = new C0489e(eVar2.f7594a, eVar2.d, aVar, aVar);
                        }
                    } else if (i2 != lastVisibleChildIndex) {
                        eVar2 = null;
                    } else if (!z3) {
                        eVar = new C0489e(aVar, eVar2.d, aVar, eVar2.f7596c);
                    } else if (k.e(this)) {
                        eVar = new C0489e(eVar2.f7594a, eVar2.d, aVar, aVar);
                    } else {
                        eVar = new C0489e(aVar, aVar, eVar2.f7595b, eVar2.f7596c);
                    }
                    eVar2 = eVar;
                }
                if (eVar2 == null) {
                    e6.f11479e = new C0962a(0.0f);
                    e6.f11480f = new C0962a(0.0f);
                    e6.g = new C0962a(0.0f);
                    e6.h = new C0962a(0.0f);
                } else {
                    e6.f11479e = eVar2.f7594a;
                    e6.h = eVar2.d;
                    e6.f11480f = eVar2.f7595b;
                    e6.g = eVar2.f7596c;
                }
                materialButton.setShapeAppearanceModel(e6.a());
            }
        }
    }

    public int getCheckedButtonId() {
        if (!this.f6362p || this.f6365s.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f6365s.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            int id = ((MaterialButton) getChildAt(i2)).getId();
            if (this.f6365s.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    public final int getChildDrawingOrder(int i2, int i5) {
        Integer[] numArr = this.f6360e;
        if (numArr != null && i5 < numArr.length) {
            return numArr[i5].intValue();
        }
        Log.w("MButtonToggleGroup", "Child order wasn't updated");
        return i5;
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        int i2 = this.f6364r;
        if (i2 != -1) {
            d(Collections.singleton(Integer.valueOf(i2)));
        }
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i2;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        int visibleButtonCount = getVisibleButtonCount();
        if (this.f6362p) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, visibleButtonCount, false, i2));
    }

    public final void onMeasure(int i2, int i5) {
        e();
        a();
        super.onMeasure(i2, i5);
    }

    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal((C0485a) null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f6357a.remove(indexOfChild);
        }
        e();
        a();
    }

    public void setEnabled(boolean z3) {
        super.setEnabled(z3);
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            ((MaterialButton) getChildAt(i2)).setEnabled(z3);
        }
    }

    public void setSelectionRequired(boolean z3) {
        this.f6363q = z3;
    }

    public void setSingleSelection(boolean z3) {
        if (this.f6362p != z3) {
            this.f6362p = z3;
            d(new HashSet());
        }
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            ((MaterialButton) getChildAt(i2)).setA11yClassName((this.f6362p ? RadioButton.class : ToggleButton.class).getName());
        }
    }

    public void setSingleSelection(int i2) {
        setSingleSelection(getResources().getBoolean(i2));
    }
}
