package G0;

import F0.r;
import F0.s;
import K1.e;
import T0.b;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import z0.i;

public final class d implements s {

    /* renamed from: a  reason: collision with root package name */
    public final Context f820a;

    /* renamed from: b  reason: collision with root package name */
    public final s f821b;

    /* renamed from: c  reason: collision with root package name */
    public final s f822c;
    public final Class d;

    public d(Context context, s sVar, s sVar2, Class cls) {
        this.f820a = context.getApplicationContext();
        this.f821b = sVar;
        this.f822c = sVar2;
        this.d = cls;
    }

    public final r a(Object obj, int i2, int i5, i iVar) {
        Uri uri = (Uri) obj;
        return new r(new b(uri), new c(this.f820a, this.f821b, this.f822c, uri, i2, i5, iVar, this.d));
    }

    public final boolean b(Object obj) {
        Uri uri = (Uri) obj;
        if (Build.VERSION.SDK_INT < 29 || !e.e0(uri)) {
            return false;
        }
        return true;
    }
}
