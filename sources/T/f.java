package t;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import java.util.ArrayList;
import java.util.Iterator;

public class f implements d {

    /* renamed from: a  reason: collision with root package name */
    public o f11581a = null;

    /* renamed from: b  reason: collision with root package name */
    public boolean f11582b = false;

    /* renamed from: c  reason: collision with root package name */
    public boolean f11583c = false;
    public final o d;

    /* renamed from: e  reason: collision with root package name */
    public int f11584e = 1;

    /* renamed from: f  reason: collision with root package name */
    public int f11585f;
    public int g;
    public int h = 1;

    /* renamed from: i  reason: collision with root package name */
    public g f11586i = null;

    /* renamed from: j  reason: collision with root package name */
    public boolean f11587j = false;

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList f11588k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList f11589l = new ArrayList();

    public f(o oVar) {
        this.d = oVar;
    }

    public final void a(d dVar) {
        ArrayList arrayList = this.f11589l;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (!((f) it2.next()).f11587j) {
                return;
            }
        }
        this.f11583c = true;
        o oVar = this.f11581a;
        if (oVar != null) {
            oVar.a(this);
        }
        if (this.f11582b) {
            this.d.a(this);
            return;
        }
        Iterator it3 = arrayList.iterator();
        f fVar = null;
        int i2 = 0;
        while (it3.hasNext()) {
            f fVar2 = (f) it3.next();
            if (!(fVar2 instanceof g)) {
                i2++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i2 == 1 && fVar.f11587j) {
            g gVar = this.f11586i;
            if (gVar != null) {
                if (gVar.f11587j) {
                    this.f11585f = this.h * gVar.g;
                } else {
                    return;
                }
            }
            d(fVar.g + this.f11585f);
        }
        o oVar2 = this.f11581a;
        if (oVar2 != null) {
            oVar2.a(this);
        }
    }

    public final void b(o oVar) {
        this.f11588k.add(oVar);
        if (this.f11587j) {
            oVar.a(oVar);
        }
    }

    public final void c() {
        this.f11589l.clear();
        this.f11588k.clear();
        this.f11587j = false;
        this.g = 0;
        this.f11583c = false;
        this.f11582b = false;
    }

    public void d(int i2) {
        if (!this.f11587j) {
            this.f11587j = true;
            this.g = i2;
            Iterator it2 = this.f11588k.iterator();
            while (it2.hasNext()) {
                d dVar = (d) it2.next();
                dVar.a(dVar);
            }
        }
    }

    public final String toString() {
        String str;
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.f11603b.f11326h0);
        sb.append(":");
        switch (this.f11584e) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case zzaky.zzf.zzf:
                str = "TOP";
                break;
            case zzaky.zzf.zzg:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append("(");
        if (this.f11587j) {
            obj = Integer.valueOf(this.g);
        } else {
            obj = "unresolved";
        }
        sb.append(obj);
        sb.append(") <t=");
        sb.append(this.f11589l.size());
        sb.append(":d=");
        sb.append(this.f11588k.size());
        sb.append(">");
        return sb.toString();
    }
}
