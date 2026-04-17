package B0;

import com.bumptech.glide.load.data.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import z0.i;

public final class B {

    /* renamed from: a  reason: collision with root package name */
    public final C0009h f176a;

    /* renamed from: b  reason: collision with root package name */
    public final List f177b;

    /* renamed from: c  reason: collision with root package name */
    public final String f178c;

    public B(Class cls, Class cls2, Class cls3, List list, C0009h hVar) {
        this.f176a = hVar;
        if (!list.isEmpty()) {
            this.f177b = list;
            this.f178c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
            return;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }

    public final D a(int i2, int i5, l lVar, g gVar, i iVar) {
        D d;
        C0009h hVar = this.f176a;
        List list = (List) hVar.j();
        try {
            List list2 = this.f177b;
            int size = list2.size();
            d = null;
            for (int i6 = 0; i6 < size; i6++) {
                d = ((o) list2.get(i6)).a(i2, i5, lVar, gVar, iVar);
                if (d != null) {
                    break;
                }
            }
        } catch (y e6) {
            list.add(e6);
        } catch (Throwable th) {
            hVar.D(list);
            throw th;
        }
        if (d != null) {
            hVar.D(list);
            return d;
        }
        throw new y(this.f178c, new ArrayList(list));
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f177b.toArray()) + '}';
    }
}
