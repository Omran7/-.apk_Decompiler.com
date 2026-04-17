package T1;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.SystemClock;

public final class Q extends E {

    /* renamed from: e  reason: collision with root package name */
    public static final String[] f3023e = {"app_version", "ALTER TABLE messages ADD COLUMN app_version TEXT;", "app_version_int", "ALTER TABLE messages ADD COLUMN app_version_int INTEGER;"};

    /* renamed from: c  reason: collision with root package name */
    public final C0188m f3024c = new C0188m(this, ((C0212u0) this.f398a).f3489a);
    public boolean d;

    public Q(C0212u0 u0Var) {
        super(u0Var);
    }

    public final boolean r() {
        return false;
    }

    public final SQLiteDatabase s() {
        if (this.d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f3024c.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.d = true;
        return null;
    }

    public final void t() {
        int delete;
        C0212u0 u0Var = (C0212u0) this.f398a;
        o();
        try {
            SQLiteDatabase s6 = s();
            if (s6 != null && (delete = s6.delete("messages", (String) null, (String[]) null)) > 0) {
                Z z3 = u0Var.f3496r;
                C0212u0.k(z3);
                z3.f3180w.b(Integer.valueOf(delete), "Reset local analytics data. records");
            }
        } catch (SQLiteException e6) {
            Z z4 = u0Var.f3496r;
            C0212u0.k(z4);
            z4.f3172f.b(e6, "Error resetting local analytics data. error");
        }
    }

    public final void u() {
        o();
        if (!this.d) {
            C0212u0 u0Var = (C0212u0) this.f398a;
            if (u0Var.f3489a.getDatabasePath("google_app_measurement_local.db").exists()) {
                int i2 = 0;
                int i5 = 5;
                while (i2 < 5) {
                    SQLiteDatabase sQLiteDatabase = null;
                    try {
                        SQLiteDatabase s6 = s();
                        if (s6 == null) {
                            this.d = true;
                            return;
                        }
                        s6.beginTransaction();
                        s6.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                        s6.setTransactionSuccessful();
                        s6.endTransaction();
                        s6.close();
                        return;
                    } catch (SQLiteFullException e6) {
                        Z z3 = u0Var.f3496r;
                        C0212u0.k(z3);
                        z3.f3172f.b(e6, "Error deleting app launch break from local database");
                        this.d = true;
                        if (sQLiteDatabase == null) {
                            i2++;
                        }
                        sQLiteDatabase.close();
                        i2++;
                    } catch (SQLiteDatabaseLockedException unused) {
                        SystemClock.sleep((long) i5);
                        i5 += 20;
                        if (sQLiteDatabase == null) {
                            i2++;
                        }
                        sQLiteDatabase.close();
                        i2++;
                    } catch (SQLiteException e7) {
                        if (sQLiteDatabase != null) {
                            if (sQLiteDatabase.inTransaction()) {
                                sQLiteDatabase.endTransaction();
                            }
                        }
                        Z z4 = u0Var.f3496r;
                        C0212u0.k(z4);
                        z4.f3172f.b(e7, "Error deleting app launch break from local database");
                        this.d = true;
                        if (sQLiteDatabase != null) {
                            sQLiteDatabase.close();
                            i2++;
                        } else {
                            i2++;
                        }
                    } catch (Throwable th) {
                        if (sQLiteDatabase != null) {
                            sQLiteDatabase.close();
                        }
                        throw th;
                    }
                }
                Z z5 = u0Var.f3496r;
                C0212u0.k(z5);
                z5.f3175r.a("Error deleting app launch break from local database in reasonable time");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d1, code lost:
        r11.insertOrThrow("messages", (java.lang.String) null, r6);
        r11.setTransactionSuccessful();
        r11.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00da, code lost:
        if (r12 == null) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00dc, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00df, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e3, code lost:
        return true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x013e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00f5 A[SYNTHETIC, Splitter:B:62:0x00f5] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x013e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x013e A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean v(byte[] r19, int r20) {
        /*
            r18 = this;
            r1 = r18
            r18.o()
            boolean r0 = r1.d
            r2 = 0
            if (r0 == 0) goto L_0x000b
            goto L_0x0066
        L_0x000b:
            java.lang.Object r0 = r1.f398a
            r3 = r0
            T1.u0 r3 = (T1.C0212u0) r3
            T1.g r0 = r3.f3494p
            T1.G r4 = T1.H.f2923l1
            r5 = 0
            boolean r0 = r0.B(r5, r4)
            if (r0 == 0) goto L_0x0024
            T1.O r0 = r3.n()
            T1.Z1 r0 = r0.s(r5)
            goto L_0x0025
        L_0x0024:
            r0 = r5
        L_0x0025:
            android.content.ContentValues r6 = new android.content.ContentValues
            r6.<init>()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r20)
            java.lang.String r8 = "type"
            r6.put(r8, r7)
            java.lang.String r7 = "entry"
            r8 = r19
            r6.put(r7, r8)
            T1.g r7 = r3.f3494p
            boolean r4 = r7.B(r5, r4)
            if (r4 == 0) goto L_0x0056
            if (r0 == 0) goto L_0x0056
            java.lang.String r4 = "app_version"
            java.lang.String r7 = r0.f3203c
            r6.put(r4, r7)
            long r7 = r0.f3209s
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            java.lang.String r4 = "app_version_int"
            r6.put(r4, r0)
        L_0x0056:
            r4 = 5
            r7 = r2
            r8 = r4
        L_0x0059:
            T1.Z r9 = r3.f3496r
            if (r7 >= r4) goto L_0x014f
            r10 = 1
            android.database.sqlite.SQLiteDatabase r11 = r18.s()     // Catch:{ SQLiteFullException -> 0x0126, SQLiteDatabaseLockedException -> 0x0113, SQLiteException -> 0x00f0, all -> 0x00ed }
            if (r11 != 0) goto L_0x0070
            r1.d = r10     // Catch:{ SQLiteFullException -> 0x006d, SQLiteDatabaseLockedException -> 0x00e9, SQLiteException -> 0x006a, all -> 0x0067 }
        L_0x0066:
            return r2
        L_0x0067:
            r0 = move-exception
            goto L_0x0144
        L_0x006a:
            r0 = move-exception
            goto L_0x00e7
        L_0x006d:
            r0 = move-exception
            goto L_0x00eb
        L_0x0070:
            r11.beginTransaction()     // Catch:{ SQLiteFullException -> 0x006d, SQLiteDatabaseLockedException -> 0x00e9, SQLiteException -> 0x006a, all -> 0x0067 }
            java.lang.String r0 = "select count(1) from messages"
            android.database.Cursor r12 = r11.rawQuery(r0, r5)     // Catch:{ SQLiteFullException -> 0x006d, SQLiteDatabaseLockedException -> 0x00e9, SQLiteException -> 0x006a, all -> 0x0067 }
            r13 = 0
            if (r12 == 0) goto L_0x008a
            boolean r0 = r12.moveToFirst()     // Catch:{ SQLiteFullException -> 0x00ce, SQLiteDatabaseLockedException -> 0x0115, SQLiteException -> 0x00cc }
            if (r0 == 0) goto L_0x008a
            long r13 = r12.getLong(r2)     // Catch:{ SQLiteFullException -> 0x00ce, SQLiteDatabaseLockedException -> 0x0115, SQLiteException -> 0x00cc }
            goto L_0x008a
        L_0x0088:
            r0 = move-exception
            goto L_0x00e4
        L_0x008a:
            r15 = 100000(0x186a0, double:4.94066E-319)
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            java.lang.String r15 = "messages"
            if (r0 < 0) goto L_0x00d1
            T1.C0212u0.k(r9)     // Catch:{ SQLiteFullException -> 0x00ce, SQLiteDatabaseLockedException -> 0x0115, SQLiteException -> 0x00cc }
            T1.X r0 = r9.f3172f
            java.lang.String r4 = "Data loss, local db full"
            r0.a(r4)     // Catch:{ SQLiteFullException -> 0x00ce, SQLiteDatabaseLockedException -> 0x0115, SQLiteException -> 0x00cc }
            java.lang.String r4 = "rowid in (select rowid from messages order by rowid asc limit ?)"
            r16 = 100001(0x186a1, double:4.9407E-319)
            long r16 = r16 - r13
            java.lang.String r13 = java.lang.Long.toString(r16)     // Catch:{ SQLiteFullException -> 0x00ce, SQLiteDatabaseLockedException -> 0x0115, SQLiteException -> 0x00cc }
            java.lang.String[] r13 = new java.lang.String[]{r13}     // Catch:{ SQLiteFullException -> 0x00ce, SQLiteDatabaseLockedException -> 0x0115, SQLiteException -> 0x00cc }
            int r4 = r11.delete(r15, r4, r13)     // Catch:{ SQLiteFullException -> 0x00ce, SQLiteDatabaseLockedException -> 0x0115, SQLiteException -> 0x00cc }
            long r13 = (long) r4     // Catch:{ SQLiteFullException -> 0x00ce, SQLiteDatabaseLockedException -> 0x0115, SQLiteException -> 0x00cc }
            int r4 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r4 == 0) goto L_0x00d1
            T1.C0212u0.k(r9)     // Catch:{ SQLiteFullException -> 0x00ce, SQLiteDatabaseLockedException -> 0x0115, SQLiteException -> 0x00cc }
            java.lang.String r4 = "Different delete count than expected in local db. expected, received, difference"
            java.lang.Long r2 = java.lang.Long.valueOf(r16)     // Catch:{ SQLiteFullException -> 0x00ce, SQLiteDatabaseLockedException -> 0x0115, SQLiteException -> 0x00cc }
            java.lang.Long r10 = java.lang.Long.valueOf(r13)     // Catch:{ SQLiteFullException -> 0x00ce, SQLiteDatabaseLockedException -> 0x0115, SQLiteException -> 0x00cc }
            long r16 = r16 - r13
            java.lang.Long r13 = java.lang.Long.valueOf(r16)     // Catch:{ SQLiteFullException -> 0x00ce, SQLiteDatabaseLockedException -> 0x0115, SQLiteException -> 0x00cc }
            r0.d(r4, r2, r10, r13)     // Catch:{ SQLiteFullException -> 0x00ce, SQLiteDatabaseLockedException -> 0x0115, SQLiteException -> 0x00cc }
            goto L_0x00d1
        L_0x00cc:
            r0 = move-exception
            goto L_0x00f3
        L_0x00ce:
            r0 = move-exception
            goto L_0x0129
        L_0x00d1:
            r11.insertOrThrow(r15, r5, r6)     // Catch:{ SQLiteFullException -> 0x00ce, SQLiteDatabaseLockedException -> 0x0115, SQLiteException -> 0x00cc }
            r11.setTransactionSuccessful()     // Catch:{ SQLiteFullException -> 0x00ce, SQLiteDatabaseLockedException -> 0x0115, SQLiteException -> 0x00cc }
            r11.endTransaction()     // Catch:{ SQLiteFullException -> 0x00ce, SQLiteDatabaseLockedException -> 0x0115, SQLiteException -> 0x00cc }
            if (r12 == 0) goto L_0x00df
            r12.close()
        L_0x00df:
            r11.close()
            r2 = 1
            return r2
        L_0x00e4:
            r5 = r12
            goto L_0x0144
        L_0x00e7:
            r12 = r5
            goto L_0x00f3
        L_0x00e9:
            r12 = r5
            goto L_0x0115
        L_0x00eb:
            r12 = r5
            goto L_0x0129
        L_0x00ed:
            r0 = move-exception
            r11 = r5
            goto L_0x0144
        L_0x00f0:
            r0 = move-exception
            r11 = r5
            r12 = r11
        L_0x00f3:
            if (r11 == 0) goto L_0x00fe
            boolean r2 = r11.inTransaction()     // Catch:{ all -> 0x0088 }
            if (r2 == 0) goto L_0x00fe
            r11.endTransaction()     // Catch:{ all -> 0x0088 }
        L_0x00fe:
            T1.C0212u0.k(r9)     // Catch:{ all -> 0x0088 }
            T1.X r2 = r9.f3172f     // Catch:{ all -> 0x0088 }
            java.lang.String r4 = "Error writing entry to local database"
            r2.b(r0, r4)     // Catch:{ all -> 0x0088 }
            r2 = 1
            r1.d = r2     // Catch:{ all -> 0x0088 }
            if (r12 == 0) goto L_0x0110
            r12.close()
        L_0x0110:
            if (r11 == 0) goto L_0x013e
            goto L_0x0122
        L_0x0113:
            r11 = r5
            r12 = r11
        L_0x0115:
            long r9 = (long) r8
            android.os.SystemClock.sleep(r9)     // Catch:{ all -> 0x0088 }
            int r8 = r8 + 20
            if (r12 == 0) goto L_0x0120
            r12.close()
        L_0x0120:
            if (r11 == 0) goto L_0x013e
        L_0x0122:
            r11.close()
            goto L_0x013e
        L_0x0126:
            r0 = move-exception
            r11 = r5
            r12 = r11
        L_0x0129:
            T1.C0212u0.k(r9)     // Catch:{ all -> 0x0088 }
            T1.X r2 = r9.f3172f     // Catch:{ all -> 0x0088 }
            java.lang.String r4 = "Error writing entry; local database full"
            r2.b(r0, r4)     // Catch:{ all -> 0x0088 }
            r2 = 1
            r1.d = r2     // Catch:{ all -> 0x0088 }
            if (r12 == 0) goto L_0x013b
            r12.close()
        L_0x013b:
            if (r11 == 0) goto L_0x013e
            goto L_0x0122
        L_0x013e:
            int r7 = r7 + 1
            r2 = 0
            r4 = 5
            goto L_0x0059
        L_0x0144:
            if (r5 == 0) goto L_0x0149
            r5.close()
        L_0x0149:
            if (r11 == 0) goto L_0x014e
            r11.close()
        L_0x014e:
            throw r0
        L_0x014f:
            T1.C0212u0.k(r9)
            java.lang.String r0 = "Failed to write entry to local database"
            T1.X r2 = r9.f3180w
            r2.a(r0)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.Q.v(byte[], int):boolean");
    }
}
