package R2;

import G1.f;
import X4.d;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.I;
import java.util.Arrays;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final String f2500a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2501b;

    /* renamed from: c  reason: collision with root package name */
    public final String f2502c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final String f2503e;

    /* renamed from: f  reason: collision with root package name */
    public final String f2504f;
    public final String g;

    public m(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        boolean z3;
        int i2 = f.f831a;
        if (str == null || str.trim().isEmpty()) {
            z3 = true;
        } else {
            z3 = false;
        }
        I.i("ApplicationId must be set.", true ^ z3);
        this.f2501b = str;
        this.f2500a = str2;
        this.f2502c = str3;
        this.d = str4;
        this.f2503e = str5;
        this.f2504f = str6;
        this.g = str7;
    }

    public static m a(Context context) {
        d dVar = new d(context);
        String C6 = dVar.C("google_app_id");
        if (TextUtils.isEmpty(C6)) {
            return null;
        }
        return new m(C6, dVar.C("google_api_key"), dVar.C("firebase_database_url"), dVar.C("ga_trackingId"), dVar.C("gcm_defaultSenderId"), dVar.C("google_storage_bucket"), dVar.C("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (!I.j(this.f2501b, mVar.f2501b) || !I.j(this.f2500a, mVar.f2500a) || !I.j(this.f2502c, mVar.f2502c) || !I.j(this.d, mVar.d) || !I.j(this.f2503e, mVar.f2503e) || !I.j(this.f2504f, mVar.f2504f) || !I.j(this.g, mVar.g)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2501b, this.f2500a, this.f2502c, this.d, this.f2503e, this.f2504f, this.g});
    }

    public final String toString() {
        d dVar = new d((Object) this);
        dVar.c(this.f2501b, "applicationId");
        dVar.c(this.f2500a, "apiKey");
        dVar.c(this.f2502c, "databaseUrl");
        dVar.c(this.f2503e, "gcmSenderId");
        dVar.c(this.f2504f, "storageBucket");
        dVar.c(this.g, "projectId");
        return dVar.toString();
    }
}
