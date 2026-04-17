package h3;

import K4.t;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import c1.j;
import com.mtma.criminal.city.utils.K;
import f1.c;
import i1.i;
import j1.g;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import k1.C0757b;

/* renamed from: h3.b  reason: case insensitive filesystem */
public final /* synthetic */ class C0558b implements C0564h, C0757b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8120a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f8121b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f8122c;
    public final /* synthetic */ Object d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f8123e;

    public /* synthetic */ C0558b(C0563g gVar, Object obj, long j6, TimeUnit timeUnit, int i2) {
        this.f8120a = i2;
        this.f8121b = gVar;
        this.f8123e = obj;
        this.f8122c = j6;
        this.d = timeUnit;
    }

    public ScheduledFuture a(K k6) {
        switch (this.f8120a) {
            case 0:
                C0563g gVar = (C0563g) this.f8121b;
                gVar.getClass();
                return gVar.f8139b.schedule(new C0561e(gVar, (Runnable) this.f8123e, k6, 1), this.f8122c, (TimeUnit) this.d);
            default:
                C0563g gVar2 = (C0563g) this.f8121b;
                gVar2.getClass();
                return gVar2.f8139b.schedule(new C0562f(gVar2, (Callable) this.f8123e, k6), this.f8122c, (TimeUnit) this.d);
        }
    }

    public Object b() {
        Cursor rawQuery;
        i iVar = (i) this.f8121b;
        g gVar = (g) iVar.f8269c;
        gVar.getClass();
        Iterable iterable = (Iterable) this.f8123e;
        if (iterable.iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + g.n(iterable);
            SQLiteDatabase c3 = gVar.c();
            c3.beginTransaction();
            try {
                c3.compileStatement(str).execute();
                rawQuery = c3.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", (String[]) null);
                while (rawQuery.moveToNext()) {
                    gVar.l((long) rawQuery.getInt(0), c.MAX_RETRIES_REACHED, rawQuery.getString(1));
                }
                rawQuery.close();
                c3.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                c3.setTransactionSuccessful();
                c3.endTransaction();
            } catch (Throwable th) {
                c3.endTransaction();
                throw th;
            }
        }
        gVar.j(new t(iVar.g.g() + this.f8122c, (j) this.d));
        return null;
    }

    public /* synthetic */ C0558b(i iVar, Iterable iterable, j jVar, long j6) {
        this.f8120a = 2;
        this.f8121b = iVar;
        this.f8123e = iterable;
        this.d = jVar;
        this.f8122c = j6;
    }
}
