package C3;

import A3.d;
import A3.e;
import D3.f;
import java.util.Map;

public final /* synthetic */ class a implements d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f455a;

    public /* synthetic */ a(int i2) {
        this.f455a = i2;
    }

    public final void a(Object obj, Object obj2) {
        switch (this.f455a) {
            case 0:
                throw new RuntimeException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                e eVar = (e) obj2;
                eVar.a(f.g, entry.getKey());
                eVar.a(f.h, entry.getValue());
                return;
            default:
                throw new RuntimeException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
