package P;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

public final class f implements g {

    /* renamed from: a  reason: collision with root package name */
    public final InputContentInfo f2125a;

    public f(Object obj) {
        this.f2125a = (InputContentInfo) obj;
    }

    public final ClipDescription b() {
        return this.f2125a.getDescription();
    }

    public final Object c() {
        return this.f2125a;
    }

    public final Uri e() {
        return this.f2125a.getContentUri();
    }

    public final void f() {
        this.f2125a.requestPermission();
    }

    public final Uri g() {
        return this.f2125a.getLinkUri();
    }

    public f(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f2125a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
