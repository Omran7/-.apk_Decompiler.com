package F0;

import A0.a;
import I0.G;
import K1.e;
import T0.b;
import android.content.Context;
import android.net.Uri;
import z0.i;

public final class o implements s {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f700a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f701b;

    public o(Context context, int i2) {
        this.f700a = i2;
        switch (i2) {
            case 1:
                this.f701b = context.getApplicationContext();
                return;
            case 2:
                this.f701b = context.getApplicationContext();
                return;
            default:
                this.f701b = context;
                return;
        }
    }

    public final r a(Object obj, int i2, int i5, i iVar) {
        Long l6;
        switch (this.f700a) {
            case 0:
                Uri uri = (Uri) obj;
                return new r(new b(uri), new n(this.f701b, uri, 0));
            case 1:
                Uri uri2 = (Uri) obj;
                if (i2 == Integer.MIN_VALUE || i5 == Integer.MIN_VALUE || i2 > 512 || i5 > 384) {
                    return null;
                }
                b bVar = new b(uri2);
                Context context = this.f701b;
                return new r(bVar, A0.b.a(context, uri2, new a(context.getContentResolver(), 0)));
            default:
                Uri uri3 = (Uri) obj;
                if (i2 == Integer.MIN_VALUE || i5 == Integer.MIN_VALUE || i2 > 512 || i5 > 384 || (l6 = (Long) iVar.c(G.d)) == null || l6.longValue() != -1) {
                    return null;
                }
                b bVar2 = new b(uri3);
                Context context2 = this.f701b;
                return new r(bVar2, A0.b.a(context2, uri3, new a(context2.getContentResolver(), 1)));
        }
    }

    public final boolean b(Object obj) {
        switch (this.f700a) {
            case 0:
                return e.e0((Uri) obj);
            case 1:
                Uri uri = (Uri) obj;
                if (!e.e0(uri) || uri.getPathSegments().contains("video")) {
                    return false;
                }
                return true;
            default:
                Uri uri2 = (Uri) obj;
                if (!e.e0(uri2) || !uri2.getPathSegments().contains("video")) {
                    return false;
                }
                return true;
        }
    }
}
