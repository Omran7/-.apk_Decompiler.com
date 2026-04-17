package i1;

import A4.c;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import c1.j;
import k1.C0757b;

public final /* synthetic */ class g implements C0757b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8261a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ i f8262b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ j f8263c;

    public /* synthetic */ g(i iVar, j jVar, int i2) {
        this.f8261a = i2;
        this.f8262b = iVar;
        this.f8263c = jVar;
    }

    public final Object b() {
        Boolean bool;
        Cursor rawQuery;
        switch (this.f8261a) {
            case 0:
                j jVar = this.f8263c;
                j1.g gVar = (j1.g) this.f8262b.f8269c;
                SQLiteDatabase c3 = gVar.c();
                c3.beginTransaction();
                try {
                    Long d = j1.g.d(c3, jVar);
                    if (d == null) {
                        bool = Boolean.FALSE;
                    } else {
                        rawQuery = gVar.c().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{d.toString()});
                        Boolean valueOf = Boolean.valueOf(rawQuery.moveToNext());
                        rawQuery.close();
                        bool = valueOf;
                    }
                    c3.setTransactionSuccessful();
                    c3.endTransaction();
                    return bool;
                } catch (Throwable th) {
                    c3.endTransaction();
                    throw th;
                }
            default:
                j1.g gVar2 = (j1.g) this.f8262b.f8269c;
                gVar2.getClass();
                return (Iterable) gVar2.j(new c((Object) gVar2, (Object) this.f8263c, 9));
        }
    }
}
