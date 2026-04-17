package u0;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
import n.e;

/* renamed from: u0.i  reason: case insensitive filesystem */
public final class C1022i extends C1023j {

    /* renamed from: a  reason: collision with root package name */
    public final Matrix f11797a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f11798b;

    /* renamed from: c  reason: collision with root package name */
    public float f11799c;
    public float d;

    /* renamed from: e  reason: collision with root package name */
    public float f11800e;

    /* renamed from: f  reason: collision with root package name */
    public float f11801f;
    public float g;
    public float h;

    /* renamed from: i  reason: collision with root package name */
    public float f11802i;

    /* renamed from: j  reason: collision with root package name */
    public final Matrix f11803j;

    /* renamed from: k  reason: collision with root package name */
    public String f11804k;

    public C1022i() {
        this.f11797a = new Matrix();
        this.f11798b = new ArrayList();
        this.f11799c = 0.0f;
        this.d = 0.0f;
        this.f11800e = 0.0f;
        this.f11801f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.f11802i = 0.0f;
        this.f11803j = new Matrix();
        this.f11804k = null;
    }

    public final boolean a() {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f11798b;
            if (i2 >= arrayList.size()) {
                return false;
            }
            if (((C1023j) arrayList.get(i2)).a()) {
                return true;
            }
            i2++;
        }
    }

    public final boolean b(int[] iArr) {
        int i2 = 0;
        boolean z3 = false;
        while (true) {
            ArrayList arrayList = this.f11798b;
            if (i2 >= arrayList.size()) {
                return z3;
            }
            z3 |= ((C1023j) arrayList.get(i2)).b(iArr);
            i2++;
        }
    }

    public final void c() {
        Matrix matrix = this.f11803j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.f11800e);
        matrix.postScale(this.f11801f, this.g);
        matrix.postRotate(this.f11799c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.f11802i + this.f11800e);
    }

    public String getGroupName() {
        return this.f11804k;
    }

    public Matrix getLocalMatrix() {
        return this.f11803j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.f11800e;
    }

    public float getRotation() {
        return this.f11799c;
    }

    public float getScaleX() {
        return this.f11801f;
    }

    public float getScaleY() {
        return this.g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.f11802i;
    }

    public void setPivotX(float f6) {
        if (f6 != this.d) {
            this.d = f6;
            c();
        }
    }

    public void setPivotY(float f6) {
        if (f6 != this.f11800e) {
            this.f11800e = f6;
            c();
        }
    }

    public void setRotation(float f6) {
        if (f6 != this.f11799c) {
            this.f11799c = f6;
            c();
        }
    }

    public void setScaleX(float f6) {
        if (f6 != this.f11801f) {
            this.f11801f = f6;
            c();
        }
    }

    public void setScaleY(float f6) {
        if (f6 != this.g) {
            this.g = f6;
            c();
        }
    }

    public void setTranslateX(float f6) {
        if (f6 != this.h) {
            this.h = f6;
            c();
        }
    }

    public void setTranslateY(float f6) {
        if (f6 != this.f11802i) {
            this.f11802i = f6;
            c();
        }
    }

    /* JADX WARNING: type inference failed for: r4v5, types: [u0.h, u0.k] */
    public C1022i(C1022i iVar, e eVar) {
        C1024k kVar;
        this.f11797a = new Matrix();
        this.f11798b = new ArrayList();
        this.f11799c = 0.0f;
        this.d = 0.0f;
        this.f11800e = 0.0f;
        this.f11801f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.f11802i = 0.0f;
        Matrix matrix = new Matrix();
        this.f11803j = matrix;
        this.f11804k = null;
        this.f11799c = iVar.f11799c;
        this.d = iVar.d;
        this.f11800e = iVar.f11800e;
        this.f11801f = iVar.f11801f;
        this.g = iVar.g;
        this.h = iVar.h;
        this.f11802i = iVar.f11802i;
        String str = iVar.f11804k;
        this.f11804k = str;
        if (str != null) {
            eVar.put(str, this);
        }
        matrix.set(iVar.f11803j);
        ArrayList arrayList = iVar.f11798b;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            Object obj = arrayList.get(i2);
            if (obj instanceof C1022i) {
                this.f11798b.add(new C1022i((C1022i) obj, eVar));
            } else {
                if (obj instanceof C1021h) {
                    C1021h hVar = (C1021h) obj;
                    ? kVar2 = new C1024k(hVar);
                    kVar2.f11789e = 0.0f;
                    kVar2.g = 1.0f;
                    kVar2.h = 1.0f;
                    kVar2.f11791i = 0.0f;
                    kVar2.f11792j = 1.0f;
                    kVar2.f11793k = 0.0f;
                    kVar2.f11794l = Paint.Cap.BUTT;
                    kVar2.f11795m = Paint.Join.MITER;
                    kVar2.f11796n = 4.0f;
                    kVar2.d = hVar.d;
                    kVar2.f11789e = hVar.f11789e;
                    kVar2.g = hVar.g;
                    kVar2.f11790f = hVar.f11790f;
                    kVar2.f11807c = hVar.f11807c;
                    kVar2.h = hVar.h;
                    kVar2.f11791i = hVar.f11791i;
                    kVar2.f11792j = hVar.f11792j;
                    kVar2.f11793k = hVar.f11793k;
                    kVar2.f11794l = hVar.f11794l;
                    kVar2.f11795m = hVar.f11795m;
                    kVar2.f11796n = hVar.f11796n;
                    kVar = kVar2;
                } else if (obj instanceof C1020g) {
                    kVar = new C1024k((C1020g) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f11798b.add(kVar);
                String str2 = kVar.f11806b;
                if (str2 != null) {
                    eVar.put(str2, kVar);
                }
            }
        }
    }
}
