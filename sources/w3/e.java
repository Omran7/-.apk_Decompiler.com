package W3;

import B0.C0009h;
import R2.i;
import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class e extends c {

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ int f4085l;

    /* renamed from: m  reason: collision with root package name */
    public final Object f4086m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(C0009h hVar, i iVar, Uri uri, int i2) {
        super(hVar, iVar);
        this.f4085l = i2;
        switch (i2) {
            case 1:
                super(hVar, iVar);
                this.f4086m = uri;
                n("X-Goog-Upload-Protocol", "resumable");
                n("X-Goog-Upload-Command", "query");
                return;
            default:
                this.f4086m = uri;
                n("X-Goog-Upload-Protocol", "resumable");
                n("X-Goog-Upload-Command", "cancel");
                return;
        }
    }

    public final String c() {
        switch (this.f4085l) {
            case 0:
                return "POST";
            case 1:
                return "POST";
            default:
                return "POST";
        }
    }

    public JSONObject d() {
        switch (this.f4085l) {
            case 2:
                return (JSONObject) this.f4086m;
            default:
                return super.d();
        }
    }

    public Map g() {
        switch (this.f4085l) {
            case 2:
                HashMap hashMap = new HashMap();
                String path = ((Uri) this.f4077b.d).getPath();
                if (path == null) {
                    path = "";
                } else if (path.startsWith("/")) {
                    path = path.substring(1);
                }
                hashMap.put("name", path);
                hashMap.put("uploadType", "resumable");
                return hashMap;
            default:
                return super.g();
        }
    }

    public final Uri j() {
        switch (this.f4085l) {
            case 0:
                return (Uri) this.f4086m;
            case 1:
                return (Uri) this.f4086m;
            default:
                C0009h hVar = this.f4077b;
                String authority = ((Uri) hVar.d).getAuthority();
                Uri.Builder buildUpon = ((Uri) hVar.f228b).buildUpon();
                buildUpon.appendPath("b");
                buildUpon.appendPath(authority);
                buildUpon.appendPath("o");
                return buildUpon.build();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(C0009h hVar, i iVar, JSONObject jSONObject, String str) {
        super(hVar, iVar);
        this.f4085l = 2;
        this.f4086m = jSONObject;
        if (TextUtils.isEmpty(str)) {
            this.f4076a = new IllegalArgumentException("mContentType is null or empty");
        }
        n("X-Goog-Upload-Protocol", "resumable");
        n("X-Goog-Upload-Command", "start");
        n("X-Goog-Upload-Header-Content-Type", str);
    }
}
