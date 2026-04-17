package com.google.android.recaptcha.internal;

import I1.b;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.List;
import kotlin.jvm.internal.f;
import n5.C0875g;

public final class zzei extends SQLiteOpenHelper {
    public static final zzeg zza;
    private static final int zzb;
    private static final String zzc;
    /* access modifiers changed from: private */
    public static zzei zzd;

    static {
        zzeg zzeg = new zzeg((f) null);
        zza = zzeg;
        zzb = zzeg.zzc("18.6.1");
        zzc = zzeg.zzd("18.6.1");
    }

    public /* synthetic */ zzei(Context context, f fVar) {
        super(context, zzc, (SQLiteDatabase.CursorFactory) null, zzb);
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE ce (id INTEGER PRIMARY KEY,ts BIGINT NOT NULL,ss TEXT NOT NULL)");
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i5) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ce");
        sQLiteDatabase.execSQL("CREATE TABLE ce (id INTEGER PRIMARY KEY,ts BIGINT NOT NULL,ss TEXT NOT NULL)");
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i5) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ce");
        sQLiteDatabase.execSQL("CREATE TABLE ce (id INTEGER PRIMARY KEY,ts BIGINT NOT NULL,ss TEXT NOT NULL)");
    }

    public final int zza(List list) {
        if (list.isEmpty()) {
            return 0;
        }
        return getWritableDatabase().delete("ce", "id IN ".concat(C0875g.U0(list, ", ", "(", ")", zzeh.zza, 24)), (String[]) null);
    }

    public final int zzb() {
        Cursor rawQuery = getReadableDatabase().rawQuery("SELECT COUNT(*) FROM ce", (String[]) null);
        int i2 = -1;
        try {
            if (rawQuery.moveToNext()) {
                i2 = rawQuery.getInt(0);
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
        rawQuery.close();
        return i2;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:6|7) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004e, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0051, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0046, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        r1 = n5.C0883o.f10398a;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0048 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List zzd() {
        /*
            r8 = this;
            android.database.sqlite.SQLiteDatabase r0 = r8.getReadableDatabase()
            r6 = 0
            java.lang.String r7 = "ts ASC"
            java.lang.String r1 = "ce"
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            android.database.Cursor r0 = r0.query(r1, r2, r3, r4, r5, r6, r7)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L_0x0016:
            boolean r2 = r0.moveToNext()     // Catch:{ Exception -> 0x0048 }
            if (r2 == 0) goto L_0x004a
            java.lang.String r2 = "id"
            int r2 = r0.getColumnIndexOrThrow(r2)     // Catch:{ Exception -> 0x0048 }
            int r2 = r0.getInt(r2)     // Catch:{ Exception -> 0x0048 }
            java.lang.String r3 = "ss"
            int r3 = r0.getColumnIndexOrThrow(r3)     // Catch:{ Exception -> 0x0048 }
            java.lang.String r3 = r0.getString(r3)     // Catch:{ Exception -> 0x0048 }
            java.lang.String r4 = "ts"
            int r4 = r0.getColumnIndexOrThrow(r4)     // Catch:{ Exception -> 0x0048 }
            long r4 = r0.getLong(r4)     // Catch:{ Exception -> 0x0048 }
            com.google.android.recaptcha.internal.zzej r6 = new com.google.android.recaptcha.internal.zzej     // Catch:{ Exception -> 0x0048 }
            kotlin.jvm.internal.j.b(r3)     // Catch:{ Exception -> 0x0048 }
            r6.<init>(r3, r4, r2)     // Catch:{ Exception -> 0x0048 }
            r1.add(r6)     // Catch:{ Exception -> 0x0048 }
            goto L_0x0016
        L_0x0046:
            r1 = move-exception
            goto L_0x004e
        L_0x0048:
            n5.o r1 = n5.C0883o.f10398a     // Catch:{ all -> 0x0046 }
        L_0x004a:
            r0.close()
            return r1
        L_0x004e:
            r0.close()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzei.zzd():java.util.List");
    }

    public final boolean zzf(zzej zzej) {
        if (zza(b.t0(zzej)) == 1) {
            return true;
        }
        return false;
    }
}
