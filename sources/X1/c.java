package x1;

import C1.a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.C0369x;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.internal.I;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public final class c implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public static final a f12536c = new a("RevokeAccessOperation", new String[0]);

    /* renamed from: a  reason: collision with root package name */
    public final String f12537a;

    /* renamed from: b  reason: collision with root package name */
    public final C0369x f12538b = new BasePendingResult((o) null);

    /* JADX WARNING: type inference failed for: r2v1, types: [com.google.android.gms.common.api.internal.BasePendingResult, com.google.android.gms.common.api.internal.x] */
    public c(String str) {
        I.d(str);
        this.f12537a = str;
    }

    public final void run() {
        a aVar = f12536c;
        Status status = Status.f6004p;
        try {
            String str = this.f12537a;
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + str).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f6002e;
            } else {
                aVar.c("Unable to revoke access!", new Object[0]);
            }
            aVar.a("Response Code: " + responseCode, new Object[0]);
        } catch (IOException e6) {
            aVar.c("IOException when revoking access: ".concat(String.valueOf(e6.toString())), new Object[0]);
        } catch (Exception e7) {
            aVar.c("Exception when revoking access: ".concat(String.valueOf(e7.toString())), new Object[0]);
        }
        this.f12538b.setResult(status);
    }
}
