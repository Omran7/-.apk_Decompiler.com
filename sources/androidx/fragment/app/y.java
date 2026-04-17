package androidx.fragment.app;

import Y.a;
import Z.c;
import Z.d;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import h0.C0552a;

public final class y implements LayoutInflater.Factory2 {

    /* renamed from: a  reason: collision with root package name */
    public final I f5207a;

    public y(I i2) {
        this.f5207a = i2;
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z3;
        O o6;
        boolean equals = FragmentContainerView.class.getName().equals(str);
        I i2 = this.f5207a;
        if (equals) {
            return new FragmentContainerView(context, attributeSet, i2);
        }
        C0289v vVar = null;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue((String) null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f4243a);
        int i5 = 0;
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (attributeValue != null) {
            try {
                z3 = C0286s.class.isAssignableFrom(C.b(context.getClassLoader(), attributeValue));
            } catch (ClassNotFoundException unused) {
                z3 = false;
            }
            if (z3) {
                if (view != null) {
                    i5 = view.getId();
                }
                if (i5 == -1 && resourceId == -1 && string == null) {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                }
                C0286s z4 = resourceId != -1 ? i2.z(resourceId) : null;
                if (z4 == null && string != null) {
                    z4 = i2.A(string);
                }
                if (z4 == null && i5 != -1) {
                    z4 = i2.z(i5);
                }
                if (z4 == null) {
                    C C6 = i2.C();
                    context.getClassLoader();
                    z4 = C6.a(attributeValue);
                    z4.f5185v = true;
                    z4.f5151E = resourceId != 0 ? resourceId : i5;
                    z4.F = i5;
                    z4.f5152G = string;
                    z4.f5186w = true;
                    z4.f5147A = i2;
                    C0288u uVar = i2.f5014t;
                    z4.f5148B = uVar;
                    C0289v vVar2 = uVar.f5193q;
                    z4.f5157L = true;
                    if (uVar != null) {
                        vVar = uVar.f5192p;
                    }
                    if (vVar != null) {
                        z4.f5157L = true;
                    }
                    o6 = i2.a(z4);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Fragment " + z4 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                    }
                } else if (!z4.f5186w) {
                    z4.f5186w = true;
                    z4.f5147A = i2;
                    C0288u uVar2 = i2.f5014t;
                    z4.f5148B = uVar2;
                    C0289v vVar3 = uVar2.f5193q;
                    z4.f5157L = true;
                    if (uVar2 != null) {
                        vVar = uVar2.f5192p;
                    }
                    if (vVar != null) {
                        z4.f5157L = true;
                    }
                    o6 = i2.f(z4);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Retained Fragment " + z4 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                    }
                } else {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(i5) + " with another fragment for " + attributeValue);
                }
                ViewGroup viewGroup = (ViewGroup) view;
                c cVar = d.f4461a;
                d.b(new Z.a(z4, "Attempting to use <fragment> tag to add fragment " + z4 + " to container " + viewGroup));
                d.a(z4).getClass();
                z4.f5158M = viewGroup;
                o6.k();
                o6.j();
                View view2 = z4.f5159N;
                if (view2 != null) {
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (z4.f5159N.getTag() == null) {
                        z4.f5159N.setTag(string);
                    }
                    z4.f5159N.addOnAttachStateChangeListener(new x(this, o6));
                    return z4.f5159N;
                }
                throw new IllegalStateException(C0552a.o("Fragment ", attributeValue, " did not create a view."));
            }
        }
        return null;
    }
}
