package B4;

import E4.d;
import H4.j;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.fragments.gangBase.J;
import com.mtma.criminal.city.fragments.gangBase.s;
import com.mtma.criminal.city.utils.v0;
import k.C0652B;
import k.C0657D0;
import v4.C1052a;

public final class b implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f346a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f347b;

    public /* synthetic */ b(Object obj, int i2) {
        this.f346a = i2;
        this.f347b = obj;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C0652B b6;
        Object obj = this.f347b;
        switch (this.f346a) {
            case 0:
                int action = motionEvent.getAction();
                g gVar = (g) obj;
                if (action == 0) {
                    gVar.f369p0 = motionEvent.getY();
                } else if (action == 1 && gVar.f369p0 - motionEvent.getY() > 150.0f && gVar.f368o0 && gVar.f363j0.size() >= 7 && !gVar.f366m0) {
                    v0.e(gVar.f357d0, MyApplication.f7090a.getApplicationContext().getString(R.string.no_more_items));
                    R2.b.M0(R.raw.error_loading);
                }
                return false;
            case 1:
                int action2 = motionEvent.getAction();
                d dVar = (d) obj;
                if (action2 == 0) {
                    dVar.f644r0 = motionEvent.getY();
                } else if (action2 == 1 && dVar.f644r0 - motionEvent.getY() > 150.0f && dVar.f643q0 && dVar.f638l0.size() >= 7 && !dVar.f641o0) {
                    v0.e(dVar.f630d0, MyApplication.f7090a.getApplicationContext().getString(R.string.no_more_items));
                    R2.b.M0(R.raw.error_loading);
                }
                return false;
            case 2:
                int action3 = motionEvent.getAction();
                j jVar = (j) obj;
                if (action3 == 0) {
                    jVar.f1065p0 = motionEvent.getY();
                } else if (action3 == 1 && jVar.f1065p0 - motionEvent.getY() > 150.0f && jVar.f1064o0 && jVar.f1059j0.size() >= 7 && !jVar.f1062m0) {
                    v0.e(jVar.f1053d0, MyApplication.f7090a.getApplicationContext().getString(R.string.no_more_items));
                    R2.b.M0(R.raw.error_loading);
                }
                return false;
            case 3:
                int action4 = motionEvent.getAction();
                s sVar = (s) obj;
                if (action4 == 0) {
                    sVar.f7270k0 = motionEvent.getY();
                } else if (action4 == 1 && sVar.f7270k0 - motionEvent.getY() > 150.0f && sVar.f7271l0) {
                    v0.e(sVar.f7263d0, MyApplication.f7090a.getApplicationContext().getString(R.string.no_more_items));
                    R2.b.M0(R.raw.error_loading);
                }
                return false;
            case 4:
                int action5 = motionEvent.getAction();
                J j6 = (J) obj;
                if (action5 == 0) {
                    j6.f7156p0 = motionEvent.getY();
                } else if (action5 == 1 && j6.f7156p0 - motionEvent.getY() > 150.0f && j6.f7155o0 && j6.f7151k0.size() >= 7 && !j6.f7153m0) {
                    v0.e(j6.f7144d0, MyApplication.f7090a.getApplicationContext().getString(R.string.no_more_items));
                    R2.b.M0(R.raw.error_loading);
                }
                return false;
            case 5:
                int action6 = motionEvent.getAction() & 255;
                View view2 = (View) obj;
                if (action6 == 0) {
                    ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view2, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{view2.getScaleX() * 0.94f}), PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{view2.getScaleY() * 0.94f})});
                    ofPropertyValuesHolder.setDuration(0);
                    ofPropertyValuesHolder.setRepeatMode(2);
                    ofPropertyValuesHolder.start();
                } else if (action6 == 1 || action6 == 3) {
                    ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(view2, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{view2.getScaleX() / 0.94f}), PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{view2.getScaleY() / 0.94f})});
                    ofPropertyValuesHolder2.setDuration(0);
                    ofPropertyValuesHolder2.setRepeatMode(2);
                    ofPropertyValuesHolder2.start();
                }
                return false;
            case zzaky.zzf.zzf /*6*/:
                int action7 = motionEvent.getAction();
                int x6 = (int) motionEvent.getX();
                int y6 = (int) motionEvent.getY();
                C0657D0 d02 = (C0657D0) obj;
                if (action7 == 0 && (b6 = d02.f9161I) != null && b6.isShowing() && x6 >= 0 && x6 < d02.f9161I.getWidth() && y6 >= 0 && y6 < d02.f9161I.getHeight()) {
                    d02.f9158E.postDelayed(d02.f9154A, 250);
                } else if (action7 == 1) {
                    d02.f9158E.removeCallbacks(d02.f9154A);
                }
                return false;
            default:
                int action8 = motionEvent.getAction();
                C1052a aVar = (C1052a) obj;
                if (action8 == 0) {
                    aVar.f12330t0 = motionEvent.getY();
                } else if (action8 == 1 && aVar.f12330t0 - motionEvent.getY() > 150.0f && aVar.s0 && aVar.f12323l0.size() >= 7 && !aVar.f12328q0) {
                    v0.e(aVar.f12315d0, MyApplication.f7090a.getApplicationContext().getString(R.string.no_more_items));
                    R2.b.M0(R.raw.error_loading);
                }
                return false;
        }
    }
}
