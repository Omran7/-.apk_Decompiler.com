package F3;

import B0.C0009h;
import H3.f;
import R2.i;
import android.content.Context;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import okhttp3.OkHttpClient;

public final class h {

    /* renamed from: i  reason: collision with root package name */
    public static final TaskCompletionSource f746i = new TaskCompletionSource();

    /* renamed from: j  reason: collision with root package name */
    public static boolean f747j;

    /* renamed from: a  reason: collision with root package name */
    public final Executor f748a;

    /* renamed from: b  reason: collision with root package name */
    public final OkHttpClient f749b = new OkHttpClient();

    /* renamed from: c  reason: collision with root package name */
    public final f f750c = new f();
    public final d d;

    /* renamed from: e  reason: collision with root package name */
    public final String f751e;

    /* renamed from: f  reason: collision with root package name */
    public final String f752f;
    public final String g;
    public final String h;

    public h(Context context, String str, d dVar, Executor executor, Executor executor2) {
        j.e(context, "context");
        j.e(executor, "executor");
        j.e(executor2, "uiExecutor");
        this.f748a = executor;
        I.g(dVar);
        this.d = dVar;
        I.g(str);
        this.f751e = str;
        this.h = "https://%1$s-%2$s.cloudfunctions.net/%3$s";
        try {
            new URL("us-central1");
            this.f752f = "us-central1";
            this.g = "us-central1";
        } catch (MalformedURLException unused) {
            this.f752f = "us-central1";
            this.g = null;
        }
        synchronized (f746i) {
            if (!f747j) {
                f747j = true;
                executor2.execute(new g(context, 0));
            }
        }
    }

    public static final h b() {
        h hVar;
        l lVar = (l) i.e().c(l.class);
        I.h(lVar, "Functions component does not exist.");
        synchronized (lVar) {
            hVar = (h) lVar.f774b.get("us-central1");
            if (hVar == null) {
                hVar = lVar.f773a.a();
                lVar.f774b.put("us-central1", hVar);
            }
        }
        return hVar;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, F3.p] */
    public final C0009h a(String str) {
        ? obj = new Object();
        obj.f780a = p.f779b;
        return new C0009h(this, str, (p) obj);
    }
}
