package F0;

import android.content.ContentResolver;
import android.net.Uri;
import com.bumptech.glide.load.data.a;
import com.bumptech.glide.load.data.b;
import com.bumptech.glide.load.data.e;

public final class E implements t, F {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f669a;

    /* renamed from: b  reason: collision with root package name */
    public final ContentResolver f670b;

    public /* synthetic */ E(ContentResolver contentResolver, int i2) {
        this.f669a = i2;
        this.f670b = contentResolver;
    }

    public final s e(y yVar) {
        switch (this.f669a) {
            case 0:
                return new G(this);
            default:
                return new G(this);
        }
    }

    public final e f(Uri uri) {
        switch (this.f669a) {
            case 0:
                return new a(this.f670b, uri, 0);
            default:
                return new b(1, uri, this.f670b);
        }
    }
}
