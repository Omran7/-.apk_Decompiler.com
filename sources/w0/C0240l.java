package W0;

import android.net.Uri;
import kotlin.jvm.internal.j;

/* renamed from: W0.l  reason: case insensitive filesystem */
public final class C0240l extends Exception {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0240l(Uri uri, String str) {
        super("crop: Failed to load sampled bitmap: " + uri + "\r\n" + str);
        j.e(uri, "uri");
    }
}
