package f;

import R2.b;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;
import i.C0573c;

public final class x extends ContentFrameLayout {

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ z f7809r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x(z zVar, C0573c cVar) {
        super(cVar, (AttributeSet) null);
        this.f7809r = zVar;
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.f7809r.t(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        return false;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x6 = (int) motionEvent.getX();
            int y6 = (int) motionEvent.getY();
            if (x6 < -5 || y6 < -5 || x6 > getWidth() + 5 || y6 > getHeight() + 5) {
                z zVar = this.f7809r;
                zVar.p(zVar.y(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setBackgroundResource(int i2) {
        setBackgroundDrawable(b.J(getContext(), i2));
    }
}
