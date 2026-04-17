package i1;

import K4.t;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import c1.j;
import f1.c;
import j1.e;
import j1.g;
import k1.C0757b;

public final /* synthetic */ class h implements C0757b, e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f8264a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f8265b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f8266c;

    public /* synthetic */ h(Object obj, long j6, Object obj2) {
        this.f8265b = obj;
        this.f8266c = obj2;
        this.f8264a = j6;
    }

    /* JADX INFO: finally extract failed */
    public Object apply(Object obj) {
        boolean z3;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i2 = ((c) this.f8266c).f7891a;
        String num = Integer.toString(i2);
        String str = (String) this.f8265b;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, num});
        try {
            if (rawQuery.getCount() > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            rawQuery.close();
            long j6 = this.f8264a;
            if (!z3) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("log_source", str);
                contentValues.put("reason", Integer.valueOf(i2));
                contentValues.put("events_dropped_count", Long.valueOf(j6));
                sQLiteDatabase.insert("log_event_dropped", (String) null, contentValues);
            } else {
                sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j6 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i2)});
            }
            return null;
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    public Object b() {
        i iVar = (i) this.f8265b;
        g gVar = (g) iVar.f8269c;
        gVar.getClass();
        gVar.j(new t(iVar.g.g() + this.f8264a, (j) this.f8266c));
        return null;
    }
}
