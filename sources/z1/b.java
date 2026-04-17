package Z1;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import n.j;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final j f4472a = new j(0);

    /* renamed from: b  reason: collision with root package name */
    public final j f4473b = new j(0);

    public static b a(Context context, int i2) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i2);
            if (loadAnimator instanceof AnimatorSet) {
                return b(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return b(arrayList);
        } catch (Exception e6) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i2), e6);
            return null;
        }
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [Z1.c, java.lang.Object] */
    public static b b(ArrayList arrayList) {
        b bVar = new b();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Animator animator = (Animator) arrayList.get(i2);
            if (animator instanceof ObjectAnimator) {
                ObjectAnimator objectAnimator = (ObjectAnimator) animator;
                bVar.f4473b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
                String propertyName = objectAnimator.getPropertyName();
                long startDelay = objectAnimator.getStartDelay();
                long duration = objectAnimator.getDuration();
                TimeInterpolator interpolator = objectAnimator.getInterpolator();
                if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                    interpolator = a.f4470b;
                } else if (interpolator instanceof AccelerateInterpolator) {
                    interpolator = a.f4471c;
                } else if (interpolator instanceof DecelerateInterpolator) {
                    interpolator = a.d;
                }
                ? obj = new Object();
                obj.d = 0;
                obj.f4477e = 1;
                obj.f4474a = startDelay;
                obj.f4475b = duration;
                obj.f4476c = interpolator;
                obj.d = objectAnimator.getRepeatCount();
                obj.f4477e = objectAnimator.getRepeatMode();
                bVar.f4472a.put(propertyName, obj);
                i2++;
            } else {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
        }
        return bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        return this.f4472a.equals(((b) obj).f4472a);
    }

    public final int hashCode() {
        return this.f4472a.hashCode();
    }

    public final String toString() {
        return "\n" + b.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f4472a + "}\n";
    }
}
