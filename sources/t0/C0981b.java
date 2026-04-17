package t0;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;

/* renamed from: t0.b  reason: case insensitive filesystem */
public final class C0981b extends Property {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f11632a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0981b(Class cls, String str, int i2) {
        super(cls, str);
        this.f11632a = i2;
    }

    public final Object get(Object obj) {
        switch (this.f11632a) {
            case 0:
                C0984e eVar = (C0984e) obj;
                return null;
            case 1:
                C0984e eVar2 = (C0984e) obj;
                return null;
            case 2:
                View view = (View) obj;
                return null;
            case 3:
                View view2 = (View) obj;
                return null;
            case 4:
                View view3 = (View) obj;
                return null;
            case 5:
                return Float.valueOf(w.f11697a.F0((View) obj));
            default:
                return ((View) obj).getClipBounds();
        }
    }

    public final void set(Object obj, Object obj2) {
        switch (this.f11632a) {
            case 0:
                C0984e eVar = (C0984e) obj;
                PointF pointF = (PointF) obj2;
                eVar.getClass();
                eVar.f11635a = Math.round(pointF.x);
                int round = Math.round(pointF.y);
                eVar.f11636b = round;
                int i2 = eVar.f11639f + 1;
                eVar.f11639f = i2;
                if (i2 == eVar.g) {
                    w.a(eVar.f11638e, eVar.f11635a, round, eVar.f11637c, eVar.d);
                    eVar.f11639f = 0;
                    eVar.g = 0;
                    return;
                }
                return;
            case 1:
                C0984e eVar2 = (C0984e) obj;
                PointF pointF2 = (PointF) obj2;
                eVar2.getClass();
                eVar2.f11637c = Math.round(pointF2.x);
                int round2 = Math.round(pointF2.y);
                eVar2.d = round2;
                int i5 = eVar2.g + 1;
                eVar2.g = i5;
                if (eVar2.f11639f == i5) {
                    w.a(eVar2.f11638e, eVar2.f11635a, eVar2.f11636b, eVar2.f11637c, round2);
                    eVar2.f11639f = 0;
                    eVar2.g = 0;
                    return;
                }
                return;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                w.a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                return;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                w.a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                return;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int round3 = Math.round(pointF5.x);
                int round4 = Math.round(pointF5.y);
                w.a(view3, round3, round4, view3.getWidth() + round3, view3.getHeight() + round4);
                return;
            case 5:
                float floatValue = ((Float) obj2).floatValue();
                w.f11697a.b1((View) obj, floatValue);
                return;
            default:
                ((View) obj).setClipBounds((Rect) obj2);
                return;
        }
    }
}
