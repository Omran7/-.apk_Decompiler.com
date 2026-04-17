package e3;

import android.net.Uri;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.p002firebaseauthapi.zzan;
import java.util.HashMap;
import java.util.Set;

/* renamed from: e3.b  reason: case insensitive filesystem */
public final class C0494b {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f7637c = 0;

    /* renamed from: a  reason: collision with root package name */
    public final String f7638a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7639b;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("recoverEmail", 2);
        hashMap.put("resetPassword", 0);
        hashMap.put("signIn", 4);
        hashMap.put("verifyEmail", 1);
        hashMap.put("verifyBeforeChangeEmail", 5);
        hashMap.put("revertSecondFactorAddition", 6);
        zzan.zza(hashMap);
    }

    public C0494b(String str) {
        String a6 = a(str, "apiKey");
        String a7 = a(str, "oobCode");
        String a8 = a(str, "mode");
        if (a6 == null || a7 == null || a8 == null) {
            throw new IllegalArgumentException("apiKey, oobCode and mode are required in a valid action code URL");
        }
        I.d(a6);
        I.d(a7);
        this.f7638a = a7;
        I.d(a8);
        a(str, "continueUrl");
        a(str, "lang");
        this.f7639b = a(str, "tenantId");
    }

    public static String a(String str, String str2) {
        Uri parse = Uri.parse(str);
        try {
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            if (queryParameterNames.contains(str2)) {
                return parse.getQueryParameter(str2);
            }
            if (!queryParameterNames.contains("link")) {
                return null;
            }
            String queryParameter = parse.getQueryParameter("link");
            I.d(queryParameter);
            return Uri.parse(queryParameter).getQueryParameter(str2);
        } catch (NullPointerException | UnsupportedOperationException unused) {
            return null;
        }
    }
}
