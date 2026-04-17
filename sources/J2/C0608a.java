package j2;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: j2.a  reason: case insensitive filesystem */
public final class C0608a implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public final Dialog f8815a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8816b;

    /* renamed from: c  reason: collision with root package name */
    public final int f8817c;
    public final int d;

    public C0608a(Dialog dialog, Rect rect) {
        this.f8815a = dialog;
        this.f8816b = rect.left;
        this.f8817c = rect.top;
        this.d = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = findViewById.getLeft() + this.f8816b;
        int width = findViewById.getWidth() + left;
        int top = findViewById.getTop() + this.f8817c;
        if (new RectF((float) left, (float) top, (float) width, (float) (findViewById.getHeight() + top)).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i2 = this.d;
            obtain.setLocation((float) ((-i2) - 1), (float) ((-i2) - 1));
        }
        view.performClick();
        return this.f8815a.onTouchEvent(obtain);
    }
}
