package h3;

import J2.o;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import c1.i;
import c1.p;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.database.DatabaseRegistrar;
import g3.d;
import j1.e;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;
import m1.C0834a;
import t0.k;
import t0.l;
import t0.m;
import v2.w;

public final /* synthetic */ class j implements d, e, l, w {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8141a;

    public /* synthetic */ j(int i2) {
        this.f8141a = i2;
    }

    public void a(k kVar, m mVar) {
        switch (this.f8141a) {
            case 5:
                kVar.a(mVar);
                return;
            case zzaky.zzf.zzf:
                kVar.f(mVar);
                return;
            case zzaky.zzf.zzg:
                kVar.b(mVar);
                return;
            case 8:
                kVar.c();
                return;
            default:
                kVar.d();
                return;
        }
    }

    public Object apply(Object obj) {
        byte[] bArr;
        Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
        try {
            ArrayList arrayList = new ArrayList();
            while (rawQuery.moveToNext()) {
                i a6 = c1.j.a();
                a6.H(rawQuery.getString(1));
                a6.d = C0834a.b(rawQuery.getInt(2));
                String string = rawQuery.getString(3);
                if (string == null) {
                    bArr = null;
                } else {
                    bArr = Base64.decode(string, 0);
                }
                a6.f5606c = bArr;
                arrayList.add(a6.c());
            }
            return arrayList;
        } finally {
            rawQuery.close();
        }
    }

    public Object f(o oVar) {
        switch (this.f8141a) {
            case 0:
                return (ScheduledExecutorService) ExecutorsRegistrar.f6888c.get();
            case 1:
                return (ScheduledExecutorService) ExecutorsRegistrar.f6887b.get();
            case 2:
                g3.l lVar = ExecutorsRegistrar.f6886a;
                return m.f8150a;
            case 3:
                return DatabaseRegistrar.lambda$getComponents$0(oVar);
            case ModuleDescriptor.MODULE_VERSION:
                return p.b((Context) oVar.a(Context.class));
            case 12:
                return p.b((Context) oVar.a(Context.class));
            default:
                return p.b((Context) oVar.a(Context.class));
        }
    }
}
