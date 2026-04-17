package U;

import K.O;
import L.j;
import U3.c;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import h2.d;
import java.util.WeakHashMap;

public final class a extends c {
    public final /* synthetic */ b d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(b bVar) {
        super(18);
        this.d = bVar;
    }

    public final j g(int i2) {
        return new j(AccessibilityNodeInfo.obtain(this.d.n(i2).f1702a));
    }

    public final j i(int i2) {
        int i5;
        b bVar = this.d;
        if (i2 == 2) {
            i5 = bVar.f3645k;
        } else {
            i5 = bVar.f3646l;
        }
        if (i5 == Integer.MIN_VALUE) {
            return null;
        }
        return g(i5);
    }

    public final boolean w(int i2, int i5, Bundle bundle) {
        int i6;
        b bVar = this.d;
        Chip chip = bVar.f3643i;
        if (i2 != -1) {
            boolean z3 = true;
            if (i5 == 1) {
                return bVar.p(i2);
            }
            if (i5 == 2) {
                return bVar.j(i2);
            }
            boolean z4 = false;
            if (i5 == 64) {
                AccessibilityManager accessibilityManager = bVar.h;
                if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i6 = bVar.f3645k) != i2) {
                    if (i6 != Integer.MIN_VALUE) {
                        bVar.f3645k = Integer.MIN_VALUE;
                        bVar.f3643i.invalidate();
                        bVar.q(i6, 65536);
                    }
                    bVar.f3645k = i2;
                    chip.invalidate();
                    bVar.q(i2, 32768);
                    return z3;
                }
            } else if (i5 != 128) {
                d dVar = (d) bVar;
                if (i5 != 16) {
                    return false;
                }
                Chip chip2 = dVar.f8056q;
                if (i2 == 0) {
                    return chip2.performClick();
                }
                if (i2 != 1) {
                    return false;
                }
                chip2.playSoundEffect(0);
                View.OnClickListener onClickListener = chip2.f6379q;
                if (onClickListener != null) {
                    onClickListener.onClick(chip2);
                    z4 = true;
                }
                if (!chip2.f6372B) {
                    return z4;
                }
                chip2.f6371A.q(1, 1);
                return z4;
            } else if (bVar.f3645k == i2) {
                bVar.f3645k = Integer.MIN_VALUE;
                chip.invalidate();
                bVar.q(i2, 65536);
                return z3;
            }
            z3 = false;
            return z3;
        }
        WeakHashMap weakHashMap = O.f1352a;
        return chip.performAccessibilityAction(i5, bundle);
    }
}
