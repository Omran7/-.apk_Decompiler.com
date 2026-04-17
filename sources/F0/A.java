package F0;

import B0.D;
import I0.C0057d;
import N0.a;
import android.content.res.Resources;
import android.net.Uri;
import java.io.InputStream;
import z0.i;

public final class A implements t, a {

    /* renamed from: a  reason: collision with root package name */
    public final Resources f662a;

    public /* synthetic */ A(Resources resources) {
        this.f662a = resources;
    }

    public s e(y yVar) {
        return new C0012b(this.f662a, yVar.a(Uri.class, InputStream.class));
    }

    public D i(D d, i iVar) {
        if (d == null) {
            return null;
        }
        return new C0057d(this.f662a, d);
    }
}
