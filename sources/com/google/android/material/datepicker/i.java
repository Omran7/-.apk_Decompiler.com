package com.google.android.material.datepicker;

import K.C0062b;
import L.j;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Adapter;
import android.widget.ListAdapter;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;
import com.mtma.criminal.city.R;
import it.sephiroth.android.library.widget.HListView;

public final class i extends C0062b {
    public final /* synthetic */ int d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f6409e;

    public /* synthetic */ i(Object obj, int i2) {
        this.d = i2;
        this.f6409e = obj;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.d) {
            case 3:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.f6409e).d);
                return;
            default:
                super.c(view, accessibilityEvent);
                return;
        }
    }

    public final void d(View view, j jVar) {
        String str;
        int i2 = -1;
        Object obj = this.f6409e;
        View.AccessibilityDelegate accessibilityDelegate = this.f1369a;
        switch (this.d) {
            case 0:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, jVar.f1702a);
                k kVar = (k) obj;
                if (kVar.f6423o0.getVisibility() == 0) {
                    str = kVar.r(R.string.mtrl_picker_toggle_to_year_selection);
                } else {
                    str = kVar.r(R.string.mtrl_picker_toggle_to_day_selection);
                }
                jVar.j(str);
                return;
            case 1:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, jVar.f1702a);
                int i5 = MaterialButtonToggleGroup.f6356t;
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                materialButtonToggleGroup.getClass();
                if (view instanceof MaterialButton) {
                    int i6 = 0;
                    int i7 = 0;
                    while (true) {
                        if (i6 < materialButtonToggleGroup.getChildCount()) {
                            if (materialButtonToggleGroup.getChildAt(i6) == view) {
                                i2 = i7;
                            } else {
                                if ((materialButtonToggleGroup.getChildAt(i6) instanceof MaterialButton) && materialButtonToggleGroup.c(i6)) {
                                    i7++;
                                }
                                i6++;
                            }
                        }
                    }
                }
                jVar.i(L.i.a(0, 1, i2, ((MaterialButton) view).f6353x, 1));
                return;
            case 2:
                AccessibilityNodeInfo accessibilityNodeInfo = jVar.f1702a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                HListView hListView = (HListView) obj;
                int c3 = hListView.c(view);
                ListAdapter listAdapter = (ListAdapter) hListView.getAdapter();
                if (c3 != -1 && listAdapter != null && hListView.isEnabled() && listAdapter.isEnabled(c3)) {
                    if (c3 == hListView.getSelectedItemPosition()) {
                        accessibilityNodeInfo.setSelected(true);
                        jVar.a(8);
                    } else {
                        jVar.a(4);
                    }
                    if (hListView.isClickable()) {
                        jVar.a(16);
                        accessibilityNodeInfo.setClickable(true);
                    }
                    if (hListView.isLongClickable()) {
                        jVar.a(32);
                        accessibilityNodeInfo.setLongClickable(true);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                AccessibilityNodeInfo accessibilityNodeInfo2 = jVar.f1702a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo2.setCheckable(checkableImageButton.f6470e);
                accessibilityNodeInfo2.setChecked(checkableImageButton.d);
                return;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo3 = jVar.f1702a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                accessibilityNodeInfo3.setCheckable(((NavigationMenuItemView) obj).f6474G);
                return;
        }
    }

    public boolean g(View view, int i2, Bundle bundle) {
        long j6;
        switch (this.d) {
            case 2:
                if (super.g(view, i2, bundle)) {
                    return true;
                }
                HListView hListView = (HListView) this.f6409e;
                int c3 = hListView.c(view);
                ListAdapter listAdapter = (ListAdapter) hListView.getAdapter();
                if (c3 != -1 && listAdapter != null && hListView.isEnabled() && listAdapter.isEnabled(c3)) {
                    Adapter adapter = hListView.getAdapter();
                    if (adapter == null || c3 < 0) {
                        j6 = Long.MIN_VALUE;
                    } else {
                        j6 = adapter.getItemId(c3);
                    }
                    if (i2 != 4) {
                        if (i2 != 8) {
                            if (i2 != 16) {
                                if (i2 == 32 && hListView.isLongClickable()) {
                                    return hListView.F(c3);
                                }
                            } else if (hListView.isClickable()) {
                                return hListView.E(c3, j6);
                            }
                        } else if (hListView.getSelectedItemPosition() == c3) {
                            hListView.setSelection(-1);
                            return true;
                        }
                    } else if (hListView.getSelectedItemPosition() != c3) {
                        hListView.setSelection(c3);
                        return true;
                    }
                }
                return false;
            default:
                return super.g(view, i2, bundle);
        }
    }
}
