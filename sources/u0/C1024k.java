package u0;

import C.j;
import com.bumptech.glide.c;

/* renamed from: u0.k  reason: case insensitive filesystem */
public abstract class C1024k extends C1023j {

    /* renamed from: a  reason: collision with root package name */
    public j[] f11805a = null;

    /* renamed from: b  reason: collision with root package name */
    public String f11806b;

    /* renamed from: c  reason: collision with root package name */
    public int f11807c = 0;

    public C1024k() {
    }

    public j[] getPathData() {
        return this.f11805a;
    }

    public String getPathName() {
        return this.f11806b;
    }

    public void setPathData(j[] jVarArr) {
        j[] jVarArr2 = this.f11805a;
        boolean z3 = false;
        if (jVarArr2 != null && jVarArr != null && jVarArr2.length == jVarArr.length) {
            int i2 = 0;
            while (true) {
                if (i2 >= jVarArr2.length) {
                    z3 = true;
                    break;
                }
                j jVar = jVarArr2[i2];
                char c3 = jVar.f378a;
                j jVar2 = jVarArr[i2];
                if (c3 != jVar2.f378a || jVar.f379b.length != jVar2.f379b.length) {
                    break;
                }
                i2++;
            }
        }
        if (!z3) {
            this.f11805a = c.l(jVarArr);
            return;
        }
        j[] jVarArr3 = this.f11805a;
        for (int i5 = 0; i5 < jVarArr.length; i5++) {
            jVarArr3[i5].f378a = jVarArr[i5].f378a;
            int i6 = 0;
            while (true) {
                float[] fArr = jVarArr[i5].f379b;
                if (i6 >= fArr.length) {
                    break;
                }
                jVarArr3[i5].f379b[i6] = fArr[i6];
                i6++;
            }
        }
    }

    public C1024k(C1024k kVar) {
        this.f11806b = kVar.f11806b;
        this.f11805a = c.l(kVar.f11805a);
    }
}
