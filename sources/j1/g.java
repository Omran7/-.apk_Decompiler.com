package j1;

import F3.b;
import Z0.c;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import c1.j;
import i1.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import k1.C0757b;
import k1.C0758c;
import l1.C0780a;
import l5.C0797a;
import m1.C0834a;

public final class g implements d, C0758c, C0607c {

    /* renamed from: f  reason: collision with root package name */
    public static final c f8805f = new c("proto");

    /* renamed from: a  reason: collision with root package name */
    public final i f8806a;

    /* renamed from: b  reason: collision with root package name */
    public final C0780a f8807b;

    /* renamed from: c  reason: collision with root package name */
    public final C0780a f8808c;
    public final C0605a d;

    /* renamed from: e  reason: collision with root package name */
    public final C0797a f8809e;

    public g(C0780a aVar, C0780a aVar2, C0605a aVar3, i iVar, C0797a aVar4) {
        this.f8806a = iVar;
        this.f8807b = aVar;
        this.f8808c = aVar2;
        this.d = aVar3;
        this.f8809e = aVar4;
    }

    public static Long d(SQLiteDatabase sQLiteDatabase, j jVar) {
        Long l6;
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(new String[]{jVar.f5607a, String.valueOf(C0834a.a(jVar.f5609c))}));
        byte[] bArr = jVar.f5608b;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor query = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), (String) null, (String) null, (String) null);
        try {
            if (!query.moveToNext()) {
                l6 = null;
            } else {
                l6 = Long.valueOf(query.getLong(0));
            }
            return l6;
        } finally {
            query.close();
        }
    }

    public static String n(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            sb.append(((C0606b) it2.next()).f8800a);
            if (it2.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Object o(Cursor cursor, e eVar) {
        try {
            return eVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public final SQLiteDatabase c() {
        i iVar = this.f8806a;
        Objects.requireNonNull(iVar);
        C0780a aVar = this.f8808c;
        long g = aVar.g();
        while (true) {
            try {
                return iVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e6) {
                if (aVar.g() < ((long) this.d.f8798c) + g) {
                    SystemClock.sleep(50);
                } else {
                    throw new RuntimeException("Timed out while trying to open db.", e6);
                }
            }
        }
    }

    public final void close() {
        this.f8806a.close();
    }

    public final Object j(e eVar) {
        SQLiteDatabase c3 = c();
        c3.beginTransaction();
        try {
            Object apply = eVar.apply(c3);
            c3.setTransactionSuccessful();
            return apply;
        } finally {
            c3.endTransaction();
        }
    }

    public final ArrayList k(SQLiteDatabase sQLiteDatabase, j jVar, int i2) {
        ArrayList arrayList = new ArrayList();
        Long d6 = d(sQLiteDatabase, jVar);
        if (d6 == null) {
            return arrayList;
        }
        o(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{d6.toString()}, (String) null, (String) null, (String) null, String.valueOf(i2)), new b(this, arrayList, jVar, 6));
        return arrayList;
    }

    public final void l(long j6, f1.c cVar, String str) {
        j(new h(str, j6, cVar));
    }

    public final Object m(C0757b bVar) {
        SQLiteDatabase c3 = c();
        C0780a aVar = this.f8808c;
        long g = aVar.g();
        while (true) {
            try {
                c3.beginTransaction();
                try {
                    Object b6 = bVar.b();
                    c3.setTransactionSuccessful();
                    return b6;
                } finally {
                    c3.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e6) {
                if (aVar.g() < ((long) this.d.f8798c) + g) {
                    SystemClock.sleep(50);
                } else {
                    throw new RuntimeException("Timed out while trying to acquire the lock.", e6);
                }
            }
        }
    }
}
