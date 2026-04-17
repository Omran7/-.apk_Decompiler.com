package F0;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.net.URL;
import z0.i;

public final class B implements s {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f663a;

    /* renamed from: b  reason: collision with root package name */
    public final s f664b;

    public /* synthetic */ B(s sVar, int i2) {
        this.f663a = i2;
        this.f664b = sVar;
    }

    public final r a(Object obj, int i2, int i5, i iVar) {
        Uri uri;
        switch (this.f663a) {
            case 0:
                String str = (String) obj;
                if (TextUtils.isEmpty(str)) {
                    uri = null;
                } else if (str.charAt(0) == '/') {
                    uri = Uri.fromFile(new File(str));
                } else {
                    Uri parse = Uri.parse(str);
                    if (parse.getScheme() == null) {
                        uri = Uri.fromFile(new File(str));
                    } else {
                        uri = parse;
                    }
                }
                if (uri == null) {
                    return null;
                }
                s sVar = this.f664b;
                if (!sVar.b(uri)) {
                    return null;
                }
                return sVar.a(uri, i2, i5, iVar);
            default:
                return this.f664b.a(new i((URL) obj), i2, i5, iVar);
        }
    }

    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        switch (this.f663a) {
            case 0:
                String str = (String) obj;
                return true;
            default:
                URL url = (URL) obj;
                return true;
        }
    }
}
