package K;

import L.e;
import L.f;
import L.j;
import U3.c;
import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.mtma.criminal.city.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: K.a  reason: case insensitive filesystem */
public final class C0061a extends View.AccessibilityDelegate {

    /* renamed from: a  reason: collision with root package name */
    public final C0062b f1363a;

    public C0061a(C0062b bVar) {
        this.f1363a = bVar;
    }

    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.f1363a.a(view, accessibilityEvent);
    }

    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        c b6 = this.f1363a.b(view);
        if (b6 != null) {
            return (AccessibilityNodeProvider) b6.f3713b;
        }
        return null;
    }

    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f1363a.c(view, accessibilityEvent);
    }

    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        Object obj;
        boolean z3;
        Object obj2;
        boolean z4;
        Object obj3;
        ClickableSpan[] clickableSpanArr;
        int i2;
        View view2 = view;
        AccessibilityNodeInfo accessibilityNodeInfo2 = accessibilityNodeInfo;
        int i5 = 1;
        j jVar = new j(accessibilityNodeInfo2);
        WeakHashMap weakHashMap = O.f1352a;
        Class<Boolean> cls = Boolean.class;
        if (Build.VERSION.SDK_INT >= 28) {
            obj = Boolean.valueOf(H.d(view));
        } else {
            obj = view2.getTag(R.id.tag_screen_reader_focusable);
            if (!cls.isInstance(obj)) {
                obj = null;
            }
        }
        Boolean bool = (Boolean) obj;
        int i6 = 0;
        if (bool == null || !bool.booleanValue()) {
            z3 = false;
        } else {
            z3 = true;
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 28) {
            accessibilityNodeInfo2.setScreenReaderFocusable(z3);
        } else {
            jVar.h(1, z3);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            obj2 = Boolean.valueOf(H.c(view));
        } else {
            obj2 = view2.getTag(R.id.tag_accessibility_heading);
            if (!cls.isInstance(obj2)) {
                obj2 = null;
            }
        }
        Boolean bool2 = (Boolean) obj2;
        if (bool2 == null || !bool2.booleanValue()) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (i7 >= 28) {
            accessibilityNodeInfo2.setHeading(z4);
        } else {
            jVar.h(2, z4);
        }
        CharSequence d = O.d(view);
        if (i7 >= 28) {
            accessibilityNodeInfo2.setPaneTitle(d);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", d);
        }
        if (i7 >= 30) {
            obj3 = J.b(view);
        } else {
            obj3 = view2.getTag(R.id.tag_state_description);
            if (!CharSequence.class.isInstance(obj3)) {
                obj3 = null;
            }
        }
        CharSequence charSequence = (CharSequence) obj3;
        if (i7 >= 30) {
            f.c(accessibilityNodeInfo2, charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
        this.f1363a.d(view2, jVar);
        CharSequence text = accessibilityNodeInfo.getText();
        if (i7 < 26) {
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SparseArray sparseArray = (SparseArray) view2.getTag(R.id.tag_accessibility_clickable_spans);
            if (sparseArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i8 = 0; i8 < sparseArray.size(); i8++) {
                    if (((WeakReference) sparseArray.valueAt(i8)).get() == null) {
                        arrayList.add(Integer.valueOf(i8));
                    }
                }
                for (int i9 = 0; i9 < arrayList.size(); i9++) {
                    sparseArray.remove(((Integer) arrayList.get(i9)).intValue());
                }
            }
            if (text instanceof Spanned) {
                clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
            } else {
                clickableSpanArr = null;
            }
            if (clickableSpanArr != null && clickableSpanArr.length > 0) {
                accessibilityNodeInfo.getExtras().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R.id.accessibility_action_clickable_span);
                SparseArray sparseArray2 = (SparseArray) view2.getTag(R.id.tag_accessibility_clickable_spans);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    view2.setTag(R.id.tag_accessibility_clickable_spans, sparseArray2);
                }
                int i10 = 0;
                while (i10 < clickableSpanArr.length) {
                    ClickableSpan clickableSpan = clickableSpanArr[i10];
                    int i11 = i6;
                    while (true) {
                        if (i11 >= sparseArray2.size()) {
                            i2 = j.f1701c;
                            j.f1701c = i2 + 1;
                            break;
                        } else if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(i11)).get())) {
                            i2 = sparseArray2.keyAt(i11);
                            break;
                        } else {
                            i11 += i5;
                        }
                    }
                    sparseArray2.put(i2, new WeakReference(clickableSpanArr[i10]));
                    ClickableSpan clickableSpan2 = clickableSpanArr[i10];
                    Spanned spanned = (Spanned) text;
                    jVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                    jVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                    jVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                    jVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i2));
                    i5 = 1;
                    i10++;
                    i6 = 0;
                }
            }
        }
        List list = (List) view2.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        for (int i12 = 0; i12 < list.size(); i12++) {
            jVar.b((e) list.get(i12));
        }
    }

    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f1363a.e(view, accessibilityEvent);
    }

    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f1363a.f(viewGroup, view, accessibilityEvent);
    }

    public final boolean performAccessibilityAction(View view, int i2, Bundle bundle) {
        return this.f1363a.g(view, i2, bundle);
    }

    public final void sendAccessibilityEvent(View view, int i2) {
        this.f1363a.h(view, i2);
    }

    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.f1363a.i(view, accessibilityEvent);
    }
}
