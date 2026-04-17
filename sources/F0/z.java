package F0;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;

public final class z implements t {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f724a;

    /* renamed from: b  reason: collision with root package name */
    public final Resources f725b;

    public /* synthetic */ z(Resources resources, int i2) {
        this.f724a = i2;
        this.f725b = resources;
    }

    public final s e(y yVar) {
        switch (this.f724a) {
            case 0:
                return new C0012b(this.f725b, yVar.a(Uri.class, AssetFileDescriptor.class));
            default:
                return new C0012b(this.f725b, (s) D.f667b);
        }
    }
}
