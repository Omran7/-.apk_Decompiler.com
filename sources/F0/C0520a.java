package f0;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.fragment.app.C0289v;
import f.C0512c;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: f0.a  reason: case insensitive filesystem */
public final class C0520a {

    /* renamed from: e  reason: collision with root package name */
    public static final Object f7874e = new Object();

    /* renamed from: f  reason: collision with root package name */
    public static C0520a f7875f;

    /* renamed from: a  reason: collision with root package name */
    public final Context f7876a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f7877b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f7878c = new HashMap();
    public final ArrayList d = new ArrayList();

    public C0520a(Context context) {
        this.f7876a = context;
        new C0512c(this, context.getMainLooper());
    }

    public static C0520a a(C0289v vVar) {
        C0520a aVar;
        synchronized (f7874e) {
            try {
                if (f7875f == null) {
                    f7875f = new C0520a(vVar.getApplicationContext());
                }
                aVar = f7875f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    public final void b(Intent intent) {
        boolean z3;
        synchronized (this.f7877b) {
            try {
                intent.getAction();
                String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f7876a.getContentResolver());
                intent.getData();
                String scheme = intent.getScheme();
                intent.getCategories();
                if ((intent.getFlags() & 8) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    Log.v("LocalBroadcastManager", "Resolving type " + resolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
                }
                ArrayList arrayList = (ArrayList) this.f7878c.get(intent.getAction());
                if (arrayList != null) {
                    if (z3) {
                        Log.v("LocalBroadcastManager", "Action list: " + arrayList);
                    }
                    if (arrayList.size() > 0) {
                        if (arrayList.get(0) != null) {
                            throw new ClassCastException();
                        } else if (z3) {
                            throw null;
                        } else {
                            throw null;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
