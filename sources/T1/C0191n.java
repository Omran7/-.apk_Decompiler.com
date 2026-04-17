package T1;

import G1.b;
import K4.u;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.measurement.zzhm;
import com.google.android.gms.internal.measurement.zzht;
import com.google.android.gms.internal.measurement.zzhv;
import com.google.android.gms.internal.measurement.zzhw;
import com.google.android.gms.internal.measurement.zzhx;
import com.google.android.gms.internal.measurement.zzpn;
import com.google.android.gms.internal.measurement.zzqr;
import h0.C0552a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: T1.n  reason: case insensitive filesystem */
public final class C0191n extends O1 {

    /* renamed from: f  reason: collision with root package name */
    public static final String[] f3389f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* renamed from: p  reason: collision with root package name */
    public static final String[] f3390p = {"associated_row_id", "ALTER TABLE upload_queue ADD COLUMN associated_row_id INTEGER;", "last_upload_timestamp", "ALTER TABLE upload_queue ADD COLUMN last_upload_timestamp INTEGER;"};

    /* renamed from: q  reason: collision with root package name */
    public static final String[] f3391q = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* renamed from: r  reason: collision with root package name */
    public static final String[] f3392r = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;", "client_upload_eligibility", "ALTER TABLE apps ADD COLUMN client_upload_eligibility INTEGER;"};

    /* renamed from: s  reason: collision with root package name */
    public static final String[] f3393s = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* renamed from: t  reason: collision with root package name */
    public static final String[] f3394t = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* renamed from: u  reason: collision with root package name */
    public static final String[] f3395u = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: v  reason: collision with root package name */
    public static final String[] f3396v = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: w  reason: collision with root package name */
    public static final String[] f3397w = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: x  reason: collision with root package name */
    public static final String[] f3398x = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};

    /* renamed from: y  reason: collision with root package name */
    public static final String[] f3399y = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};
    public final C0188m d;

    /* renamed from: e  reason: collision with root package name */
    public final u f3400e = new u(((C0212u0) this.f398a).f3501w);

    public C0191n(T1 t12) {
        super(t12);
        ((C0212u0) this.f398a).getClass();
        this.d = new C0188m(this, ((C0212u0) this.f398a).f3489a);
    }

    public static final String X(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return "";
        }
        return C0552a.o(" AND (upload_type IN (", TextUtils.join(", ", arrayList), "))");
    }

    public static final void e0(ContentValues contentValues, Object obj) {
        I.d("value");
        I.g(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put("value", (Double) obj);
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    public final void A(String str) {
        C0205s Q5;
        U("events_snapshot", str);
        Cursor cursor = null;
        try {
            cursor = k0().query("events", (String[]) Collections.singletonList("name").toArray(new String[0]), "app_id=?", new String[]{str}, (String) null, (String) null, (String) null);
            if (cursor.moveToFirst()) {
                do {
                    String string = cursor.getString(0);
                    if (!(string == null || (Q5 = Q("events", str, string)) == null)) {
                        V("events_snapshot", Q5);
                    }
                } while (cursor.moveToNext());
            }
        } catch (SQLiteException e6) {
            Z z3 = ((C0212u0) this.f398a).f3496r;
            C0212u0.k(z3);
            z3.f3172f.c("Error creating snapshot. appId", Z.w(str), e6);
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        if (cursor != null) {
            cursor.close();
        }
    }

    public final void B(ArrayList arrayList) {
        I.g(arrayList);
        o();
        p();
        StringBuilder sb = new StringBuilder("rowid in (");
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (i2 != 0) {
                sb.append(",");
            }
            sb.append(((Long) arrayList.get(i2)).longValue());
        }
        sb.append(")");
        int delete = k0().delete("raw_events", sb.toString(), (String[]) null);
        if (delete != arrayList.size()) {
            Z z3 = ((C0212u0) this.f398a).f3496r;
            C0212u0.k(z3);
            z3.f3172f.c("Deleted fewer rows from raw events table than expected", Integer.valueOf(delete), Integer.valueOf(arrayList.size()));
        }
    }

    public final void C(Long l6) {
        o();
        p();
        C0212u0 u0Var = (C0212u0) this.f398a;
        C0170g gVar = u0Var.f3494p;
        Z z3 = u0Var.f3496r;
        if (gVar.B((String) null, H.f2867M0)) {
            try {
                if (k0().delete("upload_queue", "rowid=?", new String[]{l6.toString()}) != 1) {
                    C0212u0.k(z3);
                    z3.f3175r.a("Deleted fewer rows from upload_queue than expected");
                }
            } catch (SQLiteException e6) {
                C0212u0.k(z3);
                z3.f3172f.b(e6, "Failed to delete a MeasurementBatch in a upload_queue table");
                throw e6;
            }
        }
    }

    public final void D() {
        p();
        k0().endTransaction();
    }

    public final void E(ArrayList arrayList) {
        o();
        p();
        I.g(arrayList);
        if (arrayList.size() == 0) {
            throw new IllegalArgumentException("Given Integer is zero");
        } else if (Z()) {
            String o6 = C0552a.o("(", TextUtils.join(",", arrayList), ")");
            int i2 = (f0("SELECT COUNT(1) FROM queue WHERE rowid IN " + o6 + " AND retry_count =  2147483647 LIMIT 1", (String[]) null) > 0 ? 1 : (f0("SELECT COUNT(1) FROM queue WHERE rowid IN " + o6 + " AND retry_count =  2147483647 LIMIT 1", (String[]) null) == 0 ? 0 : -1));
            C0212u0 u0Var = (C0212u0) this.f398a;
            if (i2 > 0) {
                Z z3 = u0Var.f3496r;
                C0212u0.k(z3);
                z3.f3175r.a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase k02 = k0();
                k02.execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + o6 + " AND (retry_count IS NULL OR retry_count < 2147483647)");
            } catch (SQLiteException e6) {
                Z z4 = u0Var.f3496r;
                C0212u0.k(z4);
                z4.f3172f.b(e6, "Error incrementing retry count. error");
            }
        }
    }

    public final void F(Long l6) {
        String str;
        o();
        p();
        C0212u0 u0Var = (C0212u0) this.f398a;
        if (u0Var.f3494p.B((String) null, H.f2867M0) && Z()) {
            int i2 = (f0("SELECT COUNT(1) FROM upload_queue WHERE rowid = " + l6 + " AND retry_count =  2147483647 LIMIT 1", (String[]) null) > 0 ? 1 : (f0("SELECT COUNT(1) FROM upload_queue WHERE rowid = " + l6 + " AND retry_count =  2147483647 LIMIT 1", (String[]) null) == 0 ? 0 : -1));
            Z z3 = u0Var.f3496r;
            if (i2 > 0) {
                C0212u0.k(z3);
                z3.f3175r.a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase k02 = k0();
                if (u0Var.f3494p.B((String) null, H.f2872P0)) {
                    u0Var.f3501w.getClass();
                    str = " SET retry_count = retry_count + 1, last_upload_timestamp = " + System.currentTimeMillis();
                } else {
                    str = " SET retry_count = retry_count + 1 ";
                }
                k02.execSQL("UPDATE upload_queue" + str + " WHERE rowid = " + l6 + " AND retry_count < 2147483647");
            } catch (SQLiteException e6) {
                C0212u0.k(z3);
                z3.f3172f.b(e6, "Error incrementing retry count. error");
            }
        }
    }

    public final void G() {
        o();
        p();
        if (Z()) {
            T1 t12 = this.f2982b;
            long a6 = t12.f3067r.f3544e.a();
            C0212u0 u0Var = (C0212u0) this.f398a;
            u0Var.f3501w.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(elapsedRealtime - a6) > ((Long) H.f2865L.a((Object) null)).longValue()) {
                t12.f3067r.f3544e.b(elapsedRealtime);
                o();
                p();
                if (Z()) {
                    SQLiteDatabase k02 = k0();
                    u0Var.f3501w.getClass();
                    int delete = k02.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(((Long) H.f2873Q.a((Object) null)).longValue())});
                    if (delete > 0) {
                        Z z3 = u0Var.f3496r;
                        C0212u0.k(z3);
                        z3.f3180w.b(Integer.valueOf(delete), "Deleted stale rows. rowsDeleted");
                    }
                }
            }
        }
    }

    public final void H(String str, String str2) {
        I.d(str);
        I.d(str2);
        o();
        p();
        try {
            k0().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e6) {
            C0212u0 u0Var = (C0212u0) this.f398a;
            Z z3 = u0Var.f3496r;
            C0212u0.k(z3);
            z3.f3172f.d("Error deleting user property. appId", Z.w(str), u0Var.f3500v.f(str2), e6);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c1, code lost:
        if (r8 != null) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0059, code lost:
        if (r8 != null) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x005b, code lost:
        V("events", r8);
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d0 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void I(java.lang.String r20) {
        /*
            r19 = this;
            r1 = r19
            r2 = r20
            java.lang.String r3 = "events_snapshot"
            java.util.ArrayList r0 = new java.util.ArrayList
            java.lang.String r4 = "lifetime_count"
            java.lang.String r5 = "name"
            java.lang.String[] r4 = new java.lang.String[]{r5, r4}
            java.util.List r4 = java.util.Arrays.asList(r4)
            r0.<init>(r4)
            java.lang.String r4 = "events"
            java.lang.String r5 = "_f"
            T1.s r6 = r1.Q(r4, r2, r5)
            java.lang.String r7 = "_v"
            T1.s r8 = r1.Q(r4, r2, r7)
            r1.U(r4, r2)
            r9 = 0
            r10 = 0
            android.database.sqlite.SQLiteDatabase r11 = r19.k0()     // Catch:{ SQLiteException -> 0x009e, all -> 0x009b }
            java.lang.String r12 = "events_snapshot"
            java.lang.String[] r13 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x009e, all -> 0x009b }
            java.lang.Object[] r0 = r0.toArray(r13)     // Catch:{ SQLiteException -> 0x009e, all -> 0x009b }
            r13 = r0
            java.lang.String[] r13 = (java.lang.String[]) r13     // Catch:{ SQLiteException -> 0x009e, all -> 0x009b }
            java.lang.String r14 = "app_id=?"
            java.lang.String[] r15 = new java.lang.String[]{r20}     // Catch:{ SQLiteException -> 0x009e, all -> 0x009b }
            r18 = 0
            r16 = 0
            r17 = 0
            android.database.Cursor r9 = r11.query(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ SQLiteException -> 0x009e, all -> 0x009b }
            boolean r0 = r9.moveToFirst()     // Catch:{ SQLiteException -> 0x009e, all -> 0x009b }
            if (r0 != 0) goto L_0x0060
            r9.close()
            if (r6 == 0) goto L_0x0059
        L_0x0054:
            r1.V(r4, r6)
            goto L_0x00c4
        L_0x0059:
            if (r8 == 0) goto L_0x00c4
        L_0x005b:
            r1.V(r4, r8)
            goto L_0x00c4
        L_0x0060:
            r11 = r10
            r12 = r11
        L_0x0062:
            java.lang.String r0 = r9.getString(r10)     // Catch:{ SQLiteException -> 0x008e, all -> 0x008c }
            r13 = 1
            long r14 = r9.getLong(r13)     // Catch:{ SQLiteException -> 0x008e, all -> 0x008c }
            r16 = 1
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 < 0) goto L_0x0080
            boolean r14 = r5.equals(r0)     // Catch:{ SQLiteException -> 0x008e, all -> 0x008c }
            if (r14 == 0) goto L_0x0079
            r11 = r13
            goto L_0x0080
        L_0x0079:
            boolean r14 = r7.equals(r0)     // Catch:{ SQLiteException -> 0x008e, all -> 0x008c }
            if (r14 == 0) goto L_0x0080
            r12 = r13
        L_0x0080:
            if (r0 == 0) goto L_0x0090
            T1.s r0 = r1.Q(r3, r2, r0)     // Catch:{ SQLiteException -> 0x008e, all -> 0x008c }
            if (r0 == 0) goto L_0x0090
            r1.V(r4, r0)     // Catch:{ SQLiteException -> 0x008e, all -> 0x008c }
            goto L_0x0090
        L_0x008c:
            r0 = move-exception
            goto L_0x0097
        L_0x008e:
            r0 = move-exception
            goto L_0x0099
        L_0x0090:
            boolean r0 = r9.moveToNext()     // Catch:{ SQLiteException -> 0x008e, all -> 0x008c }
            if (r0 != 0) goto L_0x0062
            goto L_0x00b5
        L_0x0097:
            r10 = r11
            goto L_0x00c9
        L_0x0099:
            r10 = r11
            goto L_0x00a0
        L_0x009b:
            r0 = move-exception
            r12 = r10
            goto L_0x00c9
        L_0x009e:
            r0 = move-exception
            r12 = r10
        L_0x00a0:
            java.lang.Object r5 = r1.f398a     // Catch:{ all -> 0x00c8 }
            T1.u0 r5 = (T1.C0212u0) r5     // Catch:{ all -> 0x00c8 }
            T1.Z r5 = r5.f3496r     // Catch:{ all -> 0x00c8 }
            T1.C0212u0.k(r5)     // Catch:{ all -> 0x00c8 }
            T1.X r5 = r5.f3172f     // Catch:{ all -> 0x00c8 }
            java.lang.String r7 = "Error querying snapshot. appId"
            T1.Y r11 = T1.Z.w(r20)     // Catch:{ all -> 0x00c8 }
            r5.c(r7, r11, r0)     // Catch:{ all -> 0x00c8 }
            r11 = r10
        L_0x00b5:
            if (r9 == 0) goto L_0x00ba
            r9.close()
        L_0x00ba:
            if (r11 != 0) goto L_0x00bf
            if (r6 == 0) goto L_0x00bf
            goto L_0x0054
        L_0x00bf:
            if (r12 != 0) goto L_0x00c4
            if (r8 == 0) goto L_0x00c4
            goto L_0x005b
        L_0x00c4:
            r1.U(r3, r2)
            return
        L_0x00c8:
            r0 = move-exception
        L_0x00c9:
            if (r9 == 0) goto L_0x00ce
            r9.close()
        L_0x00ce:
            if (r10 != 0) goto L_0x00d7
            if (r6 != 0) goto L_0x00d3
            goto L_0x00d7
        L_0x00d3:
            r1.V(r4, r6)
            goto L_0x00de
        L_0x00d7:
            if (r12 != 0) goto L_0x00de
            if (r8 == 0) goto L_0x00de
            r1.V(r4, r8)
        L_0x00de:
            r1.U(r3, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.C0191n.I(java.lang.String):void");
    }

    public final void J() {
        p();
        k0().setTransactionSuccessful();
    }

    public final void K(V v6, boolean z3) {
        o();
        p();
        String c3 = v6.c();
        I.g(c3);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", c3);
        I0 i02 = I0.ANALYTICS_STORAGE;
        T1 t12 = this.f2982b;
        if (z3) {
            contentValues.put("app_instance_id", (String) null);
        } else if (t12.n0(c3).k(i02)) {
            contentValues.put("app_instance_id", v6.d());
        }
        contentValues.put("gmp_app_id", v6.g());
        boolean k6 = t12.n0(c3).k(I0.AD_STORAGE);
        C0212u0 u0Var = v6.f3103a;
        if (k6) {
            C0203r0 r0Var = u0Var.f3497s;
            C0212u0.k(r0Var);
            r0Var.o();
            contentValues.put("resettable_device_id_hash", v6.f3106e);
        }
        C0203r0 r0Var2 = u0Var.f3497s;
        C0212u0.k(r0Var2);
        r0Var2.o();
        contentValues.put("last_bundle_index", Long.valueOf(v6.g));
        C0203r0 r0Var3 = u0Var.f3497s;
        C0212u0.k(r0Var3);
        r0Var3.o();
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(v6.h));
        C0203r0 r0Var4 = u0Var.f3497s;
        C0212u0.k(r0Var4);
        r0Var4.o();
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(v6.f3108i));
        contentValues.put("app_version", v6.e());
        C0203r0 r0Var5 = u0Var.f3497s;
        C0212u0.k(r0Var5);
        r0Var5.o();
        contentValues.put("app_store", v6.f3111l);
        C0203r0 r0Var6 = u0Var.f3497s;
        C0212u0.k(r0Var6);
        r0Var6.o();
        contentValues.put("gmp_version", Long.valueOf(v6.f3112m));
        C0203r0 r0Var7 = u0Var.f3497s;
        C0212u0.k(r0Var7);
        r0Var7.o();
        contentValues.put("dev_cert_hash", Long.valueOf(v6.f3113n));
        C0203r0 r0Var8 = u0Var.f3497s;
        C0212u0.k(r0Var8);
        r0Var8.o();
        contentValues.put("measurement_enabled", Boolean.valueOf(v6.f3114o));
        C0203r0 r0Var9 = u0Var.f3497s;
        C0212u0.k(r0Var9);
        r0Var9.o();
        contentValues.put("day", Long.valueOf(v6.f3093K));
        C0203r0 r0Var10 = u0Var.f3497s;
        C0212u0.k(r0Var10);
        r0Var10.o();
        contentValues.put("daily_public_events_count", Long.valueOf(v6.f3094L));
        C0212u0.k(r0Var10);
        r0Var10.o();
        contentValues.put("daily_events_count", Long.valueOf(v6.f3095M));
        C0212u0.k(r0Var10);
        r0Var10.o();
        contentValues.put("daily_conversions_count", Long.valueOf(v6.f3096N));
        C0203r0 r0Var11 = u0Var.f3497s;
        C0212u0.k(r0Var11);
        r0Var11.o();
        contentValues.put("config_fetched_time", Long.valueOf(v6.f3101S));
        C0203r0 r0Var12 = u0Var.f3497s;
        C0212u0.k(r0Var12);
        r0Var12.o();
        contentValues.put("failed_config_fetch_time", Long.valueOf(v6.f3102T));
        contentValues.put("app_version_int", Long.valueOf(v6.S()));
        contentValues.put("firebase_instance_id", v6.f());
        C0212u0.k(r0Var10);
        r0Var10.o();
        contentValues.put("daily_error_events_count", Long.valueOf(v6.f3097O));
        C0212u0.k(r0Var10);
        r0Var10.o();
        contentValues.put("daily_realtime_events_count", Long.valueOf(v6.f3098P));
        C0212u0.k(r0Var10);
        r0Var10.o();
        contentValues.put("health_monitor_sample", v6.f3099Q);
        contentValues.put("android_id", 0L);
        C0203r0 r0Var13 = u0Var.f3497s;
        C0212u0.k(r0Var13);
        r0Var13.o();
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(v6.f3115p));
        contentValues.put("admob_app_id", v6.a());
        contentValues.put("dynamite_version", Long.valueOf(v6.T()));
        if (t12.n0(c3).k(i02)) {
            C0203r0 r0Var14 = u0Var.f3497s;
            C0212u0.k(r0Var14);
            r0Var14.o();
            contentValues.put("session_stitching_token", v6.f3120u);
        }
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(v6.t()));
        C0203r0 r0Var15 = u0Var.f3497s;
        C0212u0.k(r0Var15);
        r0Var15.o();
        contentValues.put("target_os_version", Long.valueOf(v6.f3122w));
        C0203r0 r0Var16 = u0Var.f3497s;
        C0212u0.k(r0Var16);
        r0Var16.o();
        contentValues.put("session_stitching_token_hash", Long.valueOf(v6.f3123x));
        zzqr.zzb();
        C0212u0 u0Var2 = (C0212u0) this.f398a;
        if (u0Var2.f3494p.B(c3, H.f2884V0)) {
            C0203r0 r0Var17 = u0Var.f3497s;
            C0212u0.k(r0Var17);
            r0Var17.o();
            contentValues.put("ad_services_version", Integer.valueOf(v6.f3124y));
            C0203r0 r0Var18 = u0Var.f3497s;
            C0212u0.k(r0Var18);
            r0Var18.o();
            contentValues.put("attribution_eligibility_status", Long.valueOf(v6.f3086C));
        }
        C0203r0 r0Var19 = u0Var.f3497s;
        C0212u0.k(r0Var19);
        r0Var19.o();
        contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(v6.f3125z));
        contentValues.put("npa_metadata_value", v6.U());
        C0203r0 r0Var20 = u0Var.f3497s;
        C0212u0.k(r0Var20);
        r0Var20.o();
        contentValues.put("bundle_delivery_index", Long.valueOf(v6.f3089G));
        contentValues.put("sgtm_preview_key", v6.i());
        C0212u0.k(r0Var10);
        r0Var10.o();
        contentValues.put("dma_consent_state", Integer.valueOf(v6.f3088E));
        C0212u0.k(r0Var10);
        r0Var10.o();
        contentValues.put("daily_realtime_dcu_count", Integer.valueOf(v6.F));
        contentValues.put("serialized_npa_metadata", v6.h());
        G g = H.f2872P0;
        C0170g gVar = u0Var2.f3494p;
        if (gVar.B(c3, g)) {
            contentValues.put("client_upload_eligibility", Integer.valueOf(v6.R()));
        }
        C0203r0 r0Var21 = u0Var.f3497s;
        C0212u0.k(r0Var21);
        r0Var21.o();
        ArrayList arrayList = v6.f3119t;
        Z z4 = u0Var2.f3496r;
        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                C0212u0.k(z4);
                z4.f3175r.b(c3, "Safelisted events should not be an empty list. appId");
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", arrayList));
            }
        }
        zzpn.zzb();
        if (gVar.B((String) null, H.f2862J0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        C0203r0 r0Var22 = u0Var.f3497s;
        C0212u0.k(r0Var22);
        r0Var22.o();
        contentValues.put("unmatched_pfo", v6.f3084A);
        C0203r0 r0Var23 = u0Var.f3497s;
        C0212u0.k(r0Var23);
        r0Var23.o();
        contentValues.put("unmatched_uwa", v6.f3085B);
        C0203r0 r0Var24 = u0Var.f3497s;
        C0212u0.k(r0Var24);
        r0Var24.o();
        contentValues.put("ad_campaign_info", v6.f3091I);
        try {
            SQLiteDatabase k02 = k0();
            if (((long) k02.update("apps", contentValues, "app_id = ?", new String[]{c3})) == 0 && k02.insertWithOnConflict("apps", (String) null, contentValues, 5) == -1) {
                C0212u0.k(z4);
                z4.f3172f.b(Z.w(c3), "Failed to insert/update app (got -1). appId");
            }
        } catch (SQLiteException e6) {
            C0212u0.k(z4);
            z4.f3172f.c("Error storing app. appId", Z.w(c3), e6);
        }
    }

    public final void L(String str, J0 j02) {
        I.g(str);
        o();
        p();
        M(str, s0(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("storage_consent_at_bundling", j02.j());
        W(contentValues);
    }

    public final void M(String str, J0 j02) {
        I.g(str);
        I.g(j02);
        o();
        p();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", j02.j());
        contentValues.put("consent_source", Integer.valueOf(j02.f2971b));
        W(contentValues);
    }

    public final boolean N(String str) {
        C0212u0 u0Var = (C0212u0) this.f398a;
        if (u0Var.f3494p.B((String) null, H.f2867M0)) {
            if (u0Var.f3494p.B((String) null, H.f2872P0)) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(Integer.valueOf(new C0178i1[]{C0178i1.GOOGLE_SIGNAL}[0].f3347a));
                if (f0(C0552a.p("SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=?", X(arrayList), " AND NOT ", S()), new String[]{str}) != 0) {
                    return true;
                }
                return false;
            }
            if (f0("SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=? AND NOT ".concat(S()), new String[]{str}) != 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean O(String str, String str2) {
        if (f0("select count(1) from raw_events where app_id = ? and name = ?", new String[]{str, str2}) > 0) {
            return true;
        }
        return false;
    }

    public final void P(String str, String str2) {
        I.d(str);
        I.d(str2);
        o();
        p();
        try {
            k0().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e6) {
            C0212u0 u0Var = (C0212u0) this.f398a;
            Z z3 = u0Var.f3496r;
            C0212u0.k(z3);
            z3.f3172f.d("Error deleting conditional property", Z.w(str), u0Var.f3500v.f(str2), e6);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x012f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T1.C0205s Q(java.lang.String r31, java.lang.String r32, java.lang.String r33) {
        /*
            r30 = this;
            r1 = r30
            java.lang.Object r0 = r1.f398a
            r2 = r0
            T1.u0 r2 = (T1.C0212u0) r2
            com.google.android.gms.common.internal.I.d(r32)
            com.google.android.gms.common.internal.I.d(r33)
            r30.o()
            r30.p()
            java.util.ArrayList r0 = new java.util.ArrayList
            java.lang.String r8 = "last_sampled_complex_event_id"
            java.lang.String r9 = "last_sampling_rate"
            java.lang.String r3 = "lifetime_count"
            java.lang.String r4 = "current_bundle_count"
            java.lang.String r5 = "last_fire_timestamp"
            java.lang.String r6 = "last_bundled_timestamp"
            java.lang.String r7 = "last_bundled_day"
            java.lang.String r10 = "last_exempt_from_sampling"
            java.lang.String r11 = "current_session_count"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4, r5, r6, r7, r8, r9, r10, r11}
            java.util.List r3 = java.util.Arrays.asList(r3)
            r0.<init>(r3)
            r3 = 0
            android.database.sqlite.SQLiteDatabase r4 = r30.k0()     // Catch:{ SQLiteException -> 0x010d, all -> 0x010b }
            r12 = 0
            java.lang.String[] r5 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x010d, all -> 0x010b }
            java.lang.Object[] r0 = r0.toArray(r5)     // Catch:{ SQLiteException -> 0x010d, all -> 0x010b }
            r6 = r0
            java.lang.String[] r6 = (java.lang.String[]) r6     // Catch:{ SQLiteException -> 0x010d, all -> 0x010b }
            java.lang.String r7 = "app_id=? and name=?"
            java.lang.String[] r8 = new java.lang.String[]{r32, r33}     // Catch:{ SQLiteException -> 0x010d, all -> 0x010b }
            r11 = 0
            r9 = 0
            r10 = 0
            r5 = r31
            android.database.Cursor r4 = r4.query(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ SQLiteException -> 0x010d, all -> 0x010b }
            boolean r0 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x0103 }
            if (r0 != 0) goto L_0x0058
            goto L_0x0127
        L_0x0058:
            long r16 = r4.getLong(r12)     // Catch:{ SQLiteException -> 0x0103 }
            r0 = 1
            long r18 = r4.getLong(r0)     // Catch:{ SQLiteException -> 0x0103 }
            r5 = 2
            long r22 = r4.getLong(r5)     // Catch:{ SQLiteException -> 0x0103 }
            r5 = 3
            boolean r6 = r4.isNull(r5)     // Catch:{ SQLiteException -> 0x0103 }
            r7 = 0
            if (r6 == 0) goto L_0x0072
            r24 = r7
            goto L_0x0078
        L_0x0072:
            long r5 = r4.getLong(r5)     // Catch:{ SQLiteException -> 0x0103 }
            r24 = r5
        L_0x0078:
            r5 = 4
            boolean r6 = r4.isNull(r5)     // Catch:{ SQLiteException -> 0x0103 }
            if (r6 == 0) goto L_0x0082
            r26 = r3
            goto L_0x008c
        L_0x0082:
            long r5 = r4.getLong(r5)     // Catch:{ SQLiteException -> 0x0103 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ SQLiteException -> 0x0103 }
            r26 = r5
        L_0x008c:
            r5 = 5
            boolean r6 = r4.isNull(r5)     // Catch:{ SQLiteException -> 0x0103 }
            if (r6 == 0) goto L_0x0096
            r27 = r3
            goto L_0x00a0
        L_0x0096:
            long r5 = r4.getLong(r5)     // Catch:{ SQLiteException -> 0x0103 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ SQLiteException -> 0x0103 }
            r27 = r5
        L_0x00a0:
            r5 = 6
            boolean r6 = r4.isNull(r5)     // Catch:{ SQLiteException -> 0x0103 }
            if (r6 == 0) goto L_0x00aa
            r28 = r3
            goto L_0x00b4
        L_0x00aa:
            long r5 = r4.getLong(r5)     // Catch:{ SQLiteException -> 0x0103 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ SQLiteException -> 0x0103 }
            r28 = r5
        L_0x00b4:
            r5 = 7
            boolean r6 = r4.isNull(r5)     // Catch:{ SQLiteException -> 0x0103 }
            if (r6 != 0) goto L_0x00cf
            long r5 = r4.getLong(r5)     // Catch:{ SQLiteException -> 0x0103 }
            r9 = 1
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 != 0) goto L_0x00c6
            r12 = r0
        L_0x00c6:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r12)     // Catch:{ SQLiteException -> 0x0103 }
            r29 = r0
            goto L_0x00d1
        L_0x00cd:
            r0 = move-exception
            goto L_0x0109
        L_0x00cf:
            r29 = r3
        L_0x00d1:
            r0 = 8
            boolean r5 = r4.isNull(r0)     // Catch:{ SQLiteException -> 0x0103 }
            if (r5 == 0) goto L_0x00dc
            r20 = r7
            goto L_0x00e2
        L_0x00dc:
            long r5 = r4.getLong(r0)     // Catch:{ SQLiteException -> 0x0103 }
            r20 = r5
        L_0x00e2:
            T1.s r0 = new T1.s     // Catch:{ SQLiteException -> 0x0103 }
            r13 = r0
            r14 = r32
            r15 = r33
            r13.<init>(r14, r15, r16, r18, r20, r22, r24, r26, r27, r28, r29)     // Catch:{ SQLiteException -> 0x0103 }
            boolean r5 = r4.moveToNext()     // Catch:{ SQLiteException -> 0x0103 }
            if (r5 == 0) goto L_0x0105
            T1.Z r5 = r2.f3496r     // Catch:{ SQLiteException -> 0x0103 }
            T1.C0212u0.k(r5)     // Catch:{ SQLiteException -> 0x0103 }
            T1.X r5 = r5.f3172f     // Catch:{ SQLiteException -> 0x0103 }
            java.lang.String r6 = "Got multiple records for event aggregates, expected one. appId"
            T1.Y r7 = T1.Z.w(r32)     // Catch:{ SQLiteException -> 0x0103 }
            r5.b(r7, r6)     // Catch:{ SQLiteException -> 0x0103 }
            goto L_0x0105
        L_0x0103:
            r0 = move-exception
            goto L_0x010f
        L_0x0105:
            r4.close()
            return r0
        L_0x0109:
            r3 = r4
            goto L_0x012d
        L_0x010b:
            r0 = move-exception
            goto L_0x012d
        L_0x010d:
            r0 = move-exception
            r4 = r3
        L_0x010f:
            T1.Z r5 = r2.f3496r     // Catch:{ all -> 0x00cd }
            T1.C0212u0.k(r5)     // Catch:{ all -> 0x00cd }
            T1.X r5 = r5.f3172f     // Catch:{ all -> 0x00cd }
            java.lang.String r6 = "Error querying events. appId"
            T1.Y r7 = T1.Z.w(r32)     // Catch:{ all -> 0x00cd }
            T1.S r2 = r2.f3500v     // Catch:{ all -> 0x00cd }
            r8 = r33
            java.lang.String r2 = r2.d(r8)     // Catch:{ all -> 0x00cd }
            r5.d(r6, r7, r2, r0)     // Catch:{ all -> 0x00cd }
        L_0x0127:
            if (r4 == 0) goto L_0x012c
            r4.close()
        L_0x012c:
            return r3
        L_0x012d:
            if (r3 == 0) goto L_0x0132
            r3.close()
        L_0x0132:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.C0191n.Q(java.lang.String, java.lang.String, java.lang.String):T1.s");
    }

    public final U1 R(String str, long j6, byte[] bArr, String str2, String str3, int i2, int i5, long j7, long j8, long j9) {
        C0178i1 i1Var;
        String str4 = str3;
        int i6 = i5;
        boolean isEmpty = TextUtils.isEmpty(str2);
        C0212u0 u0Var = (C0212u0) this.f398a;
        if (isEmpty) {
            Z z3 = u0Var.f3496r;
            C0212u0.k(z3);
            z3.f3179v.a("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
            return null;
        }
        try {
            zzht zzht = (zzht) C0162d0.U(zzhv.zzb(), bArr);
            C0178i1[] values = C0178i1.values();
            int length = values.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    i1Var = C0178i1.UNKNOWN;
                    break;
                }
                i1Var = values[i7];
                if (i1Var.f3347a == i2) {
                    break;
                }
                i7++;
            }
            if (!(i1Var == C0178i1.GOOGLE_SIGNAL || i1Var == C0178i1.GOOGLE_SIGNAL_PENDING || i6 <= 0)) {
                ArrayList arrayList = new ArrayList();
                for (zzhx zzch : zzht.zzj()) {
                    zzhw zzhw = (zzhw) zzch.zzch();
                    zzhw.zzat(i6);
                    arrayList.add((zzhx) zzhw.zzba());
                }
                zzht.zzd();
                zzht.zzb(arrayList);
            }
            HashMap hashMap = new HashMap();
            if (str4 != null) {
                String[] split = str4.split("\r\n");
                int length2 = split.length;
                int i8 = 0;
                while (true) {
                    if (i8 >= length2) {
                        break;
                    }
                    String str5 = split[i8];
                    if (str5.isEmpty()) {
                        break;
                    }
                    String[] split2 = str5.split("=", 2);
                    if (split2.length != 2) {
                        Z z4 = u0Var.f3496r;
                        C0212u0.k(z4);
                        z4.f3172f.b(str5, "Invalid upload header: ");
                        break;
                    }
                    hashMap.put(split2[0], split2[1]);
                    i8++;
                }
            }
            return new U1(j6, (zzhv) zzht.zzba(), str2, hashMap, i1Var, j8, j9, i5);
        } catch (IOException e6) {
            Z z5 = u0Var.f3496r;
            C0212u0.k(z5);
            z5.f3172f.c("Failed to queued MeasurementBatch from upload_queue. appId", str, e6);
            return null;
        }
    }

    public final String S() {
        ((C0212u0) this.f398a).f3501w.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        Locale locale = Locale.US;
        Long l6 = (Long) H.f2875R.a((Object) null);
        l6.getClass();
        return C0552a.q("(", "(upload_type = 1 AND ABS(creation_timestamp - " + currentTimeMillis + ") > " + l6 + ")", " OR ", "(upload_type != 1 AND ABS(creation_timestamp - " + currentTimeMillis + ") > " + ((Long) H.f2873Q.a((Object) null)).longValue() + ")", ")");
    }

    public final String T(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            Cursor rawQuery = k0().rawQuery(str, strArr);
            if (rawQuery.moveToFirst()) {
                String string = rawQuery.getString(0);
                rawQuery.close();
                return string;
            }
            rawQuery.close();
            return "";
        } catch (SQLiteException e6) {
            Z z3 = ((C0212u0) this.f398a).f3496r;
            C0212u0.k(z3);
            z3.f3172f.c("Database error", str, e6);
            throw e6;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void U(String str, String str2) {
        I.d(str2);
        o();
        p();
        try {
            k0().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e6) {
            Z z3 = ((C0212u0) this.f398a).f3496r;
            C0212u0.k(z3);
            z3.f3172f.c("Error deleting snapshot. appId", Z.w(str2), e6);
        }
    }

    public final void V(String str, C0205s sVar) {
        long j6;
        C0212u0 u0Var = (C0212u0) this.f398a;
        I.g(sVar);
        o();
        p();
        ContentValues contentValues = new ContentValues();
        String str2 = sVar.f3456a;
        contentValues.put("app_id", str2);
        contentValues.put("name", sVar.f3457b);
        contentValues.put("lifetime_count", Long.valueOf(sVar.f3458c));
        contentValues.put("current_bundle_count", Long.valueOf(sVar.d));
        contentValues.put("last_fire_timestamp", Long.valueOf(sVar.f3460f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(sVar.g));
        contentValues.put("last_bundled_day", sVar.h);
        contentValues.put("last_sampled_complex_event_id", sVar.f3461i);
        contentValues.put("last_sampling_rate", sVar.f3462j);
        contentValues.put("current_session_count", Long.valueOf(sVar.f3459e));
        Boolean bool = sVar.f3463k;
        if (bool == null || !bool.booleanValue()) {
            j6 = null;
        } else {
            j6 = 1L;
        }
        contentValues.put("last_exempt_from_sampling", j6);
        try {
            if (k0().insertWithOnConflict(str, (String) null, contentValues, 5) == -1) {
                Z z3 = u0Var.f3496r;
                C0212u0.k(z3);
                z3.f3172f.b(Z.w(str2), "Failed to insert/update event aggregates (got -1). appId");
            }
        } catch (SQLiteException e6) {
            Z z4 = u0Var.f3496r;
            C0212u0.k(z4);
            z4.f3172f.c("Error storing event aggregates. appId", Z.w(str2), e6);
        }
    }

    public final void W(ContentValues contentValues) {
        C0212u0 u0Var = (C0212u0) this.f398a;
        try {
            SQLiteDatabase k02 = k0();
            String asString = contentValues.getAsString("app_id");
            if (asString == null) {
                Z z3 = u0Var.f3496r;
                C0212u0.k(z3);
                z3.f3174q.b(Z.w("app_id"), "Value of the primary key is not set.");
            } else if (((long) k02.update("consent_settings", contentValues, "app_id = ?", new String[]{asString})) == 0 && k02.insertWithOnConflict("consent_settings", (String) null, contentValues, 5) == -1) {
                Z z4 = u0Var.f3496r;
                C0212u0.k(z4);
                z4.f3172f.c("Failed to insert/update table (got -1). key", Z.w("consent_settings"), Z.w("app_id"));
            }
        } catch (SQLiteException e6) {
            Z z5 = u0Var.f3496r;
            C0212u0.k(z5);
            z5.f3172f.d("Error storing into table. key", Z.w("consent_settings"), Z.w("app_id"), e6);
        }
    }

    public final void Y(String str, I1 i12) {
        o();
        p();
        I.d(str);
        C0212u0 u0Var = (C0212u0) this.f398a;
        u0Var.f3501w.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        G g = H.f2946u0;
        long j6 = i12.f2967b;
        int i2 = (j6 > (currentTimeMillis - ((Long) g.a((Object) null)).longValue()) ? 1 : (j6 == (currentTimeMillis - ((Long) g.a((Object) null)).longValue()) ? 0 : -1));
        Z z3 = u0Var.f3496r;
        if (i2 < 0 || j6 > ((Long) g.a((Object) null)).longValue() + currentTimeMillis) {
            C0212u0.k(z3);
            z3.f3175r.d("Storing trigger URI outside of the max retention time span. appId, now, timestamp", Z.w(str), Long.valueOf(currentTimeMillis), Long.valueOf(j6));
        }
        C0212u0.k(z3);
        z3.f3180w.a("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", i12.f2966a);
        contentValues.put("source", Integer.valueOf(i12.f2968c));
        contentValues.put("timestamp_millis", Long.valueOf(j6));
        try {
            if (k0().insert("trigger_uris", (String) null, contentValues) == -1) {
                C0212u0.k(z3);
                z3.f3172f.b(Z.w(str), "Failed to insert trigger URI (got -1). appId");
            }
        } catch (SQLiteException e6) {
            C0212u0.k(z3);
            z3.f3172f.c("Error storing trigger URI. appId", Z.w(str), e6);
        }
    }

    public final boolean Z() {
        return ((C0212u0) this.f398a).f3489a.getDatabasePath("google_app_measurement.db").exists();
    }

    public final void a0(String str, Long l6, long j6, zzhm zzhm) {
        o();
        p();
        I.g(zzhm);
        I.d(str);
        byte[] zzcd = zzhm.zzcd();
        C0212u0 u0Var = (C0212u0) this.f398a;
        Z z3 = u0Var.f3496r;
        Z z4 = u0Var.f3496r;
        C0212u0.k(z3);
        z3.f3180w.c("Saving complex main event, appId, data size", u0Var.f3500v.d(str), Integer.valueOf(zzcd.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l6);
        contentValues.put("children_to_process", Long.valueOf(j6));
        contentValues.put("main_event", zzcd);
        try {
            if (k0().insertWithOnConflict("main_event_params", (String) null, contentValues, 5) == -1) {
                C0212u0.k(z4);
                z4.f3172f.b(Z.w(str), "Failed to insert complex main event (got -1). appId");
            }
        } catch (SQLiteException e6) {
            C0212u0.k(z4);
            z4.f3172f.c("Error storing complex main event. appId", Z.w(str), e6);
        }
    }

    public final boolean b0(C0164e eVar) {
        o();
        p();
        String str = eVar.f3271a;
        I.g(str);
        X1 u02 = u0(str, eVar.f3273c.f3140b);
        C0212u0 u0Var = (C0212u0) this.f398a;
        if (u02 == null) {
            long f02 = f0("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            u0Var.getClass();
            if (f02 >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", eVar.f3272b);
        contentValues.put("name", eVar.f3273c.f3140b);
        Object v6 = eVar.f3273c.v();
        I.g(v6);
        e0(contentValues, v6);
        contentValues.put("active", Boolean.valueOf(eVar.f3274e));
        contentValues.put("trigger_event_name", eVar.f3275f);
        contentValues.put("trigger_timeout", Long.valueOf(eVar.f3277q));
        Y1 y12 = u0Var.f3499u;
        Z z3 = u0Var.f3496r;
        C0212u0.i(y12);
        contentValues.put("timed_out_event", Y1.o0(eVar.f3276p));
        contentValues.put("creation_timestamp", Long.valueOf(eVar.d));
        C0212u0.i(u0Var.f3499u);
        contentValues.put("triggered_event", Y1.o0(eVar.f3278r));
        contentValues.put("triggered_timestamp", Long.valueOf(eVar.f3273c.f3141c));
        contentValues.put("time_to_live", Long.valueOf(eVar.f3279s));
        contentValues.put("expired_event", Y1.o0(eVar.f3280t));
        try {
            if (k0().insertWithOnConflict("conditional_properties", (String) null, contentValues, 5) != -1) {
                return true;
            }
            C0212u0.k(z3);
            z3.f3172f.b(Z.w(str), "Failed to insert/update conditional user property (got -1)");
            return true;
        } catch (SQLiteException e6) {
            C0212u0.k(z3);
            z3.f3172f.c("Error storing conditional user property", Z.w(str), e6);
            return true;
        }
    }

    public final boolean c0(X1 x12) {
        o();
        p();
        String str = x12.f3151a;
        String str2 = x12.f3153c;
        X1 u02 = u0(str, str2);
        C0212u0 u0Var = (C0212u0) this.f398a;
        String str3 = x12.f3152b;
        if (u02 == null) {
            if (Y1.j0(str2)) {
                if (f0("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str}) >= ((long) Math.max(Math.min(u0Var.f3494p.u(str, H.f2881U), 100), 25))) {
                    return false;
                }
            } else if (!"_npa".equals(str2)) {
                long f02 = f0("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str, str3});
                u0Var.getClass();
                if (f02 >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", str3);
        contentValues.put("name", str2);
        contentValues.put("set_timestamp", Long.valueOf(x12.d));
        e0(contentValues, x12.f3154e);
        try {
            if (k0().insertWithOnConflict("user_attributes", (String) null, contentValues, 5) != -1) {
                return true;
            }
            Z z3 = u0Var.f3496r;
            C0212u0.k(z3);
            z3.f3172f.b(Z.w(str), "Failed to insert/update user property (got -1). appId");
            return true;
        } catch (SQLiteException e6) {
            Z z4 = u0Var.f3496r;
            C0212u0.k(z4);
            z4.f3172f.c("Error storing user property. appId", Z.w(str), e6);
            return true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:80:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d0(java.lang.String r21, long r22, long r24, D0.d r26) {
        /*
            r20 = this;
            r1 = r20
            r2 = r26
            java.lang.Object r0 = r1.f398a
            r3 = r0
            T1.u0 r3 = (T1.C0212u0) r3
            java.lang.String r0 = "select metadata_fingerprint from raw_events where app_id = ?"
            java.lang.String r4 = "select app_id, metadata_fingerprint from raw_events where "
            r20.o()
            r20.p()
            r5 = 0
            android.database.sqlite.SQLiteDatabase r15 = r20.k0()     // Catch:{ SQLiteException -> 0x0035 }
            boolean r6 = android.text.TextUtils.isEmpty(r21)     // Catch:{ SQLiteException -> 0x0035 }
            r14 = 1
            java.lang.String r7 = ""
            r16 = -1
            r13 = 0
            if (r6 == 0) goto L_0x007a
            int r0 = (r24 > r16 ? 1 : (r24 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x003a
            java.lang.String r6 = java.lang.String.valueOf(r24)     // Catch:{ SQLiteException -> 0x0035 }
            java.lang.String r8 = java.lang.String.valueOf(r22)     // Catch:{ SQLiteException -> 0x0035 }
            java.lang.String[] r6 = new java.lang.String[]{r6, r8}     // Catch:{ SQLiteException -> 0x0035 }
            goto L_0x0042
        L_0x0035:
            r0 = move-exception
            r8 = r21
            goto L_0x01c4
        L_0x003a:
            java.lang.String r6 = java.lang.String.valueOf(r22)     // Catch:{ SQLiteException -> 0x0035 }
            java.lang.String[] r6 = new java.lang.String[]{r6}     // Catch:{ SQLiteException -> 0x0035 }
        L_0x0042:
            if (r0 == 0) goto L_0x0046
            java.lang.String r7 = "rowid <= ? and "
        L_0x0046:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0035 }
            r0.<init>(r4)     // Catch:{ SQLiteException -> 0x0035 }
            r0.append(r7)     // Catch:{ SQLiteException -> 0x0035 }
            java.lang.String r4 = "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;"
            r0.append(r4)     // Catch:{ SQLiteException -> 0x0035 }
            java.lang.String r0 = r0.toString()     // Catch:{ SQLiteException -> 0x0035 }
            android.database.Cursor r5 = r15.rawQuery(r0, r6)     // Catch:{ SQLiteException -> 0x0035 }
            boolean r0 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x0075 }
            if (r0 != 0) goto L_0x0063
            goto L_0x01d5
        L_0x0063:
            java.lang.String r4 = r5.getString(r13)     // Catch:{ SQLiteException -> 0x0075 }
            java.lang.String r0 = r5.getString(r14)     // Catch:{ SQLiteException -> 0x0072 }
            r5.close()     // Catch:{ SQLiteException -> 0x0072 }
            goto L_0x00b8
        L_0x006f:
            r0 = move-exception
            goto L_0x01db
        L_0x0072:
            r0 = move-exception
            goto L_0x01c5
        L_0x0075:
            r0 = move-exception
            r4 = r21
            goto L_0x01c5
        L_0x007a:
            int r4 = (r24 > r16 ? 1 : (r24 == r16 ? 0 : -1))
            if (r4 == 0) goto L_0x0089
            java.lang.String r6 = java.lang.String.valueOf(r24)     // Catch:{ SQLiteException -> 0x0035 }
            r8 = r21
            java.lang.String[] r6 = new java.lang.String[]{r8, r6}     // Catch:{ SQLiteException -> 0x01c3 }
            goto L_0x008f
        L_0x0089:
            r8 = r21
            java.lang.String[] r6 = new java.lang.String[]{r21}     // Catch:{ SQLiteException -> 0x01c3 }
        L_0x008f:
            if (r4 == 0) goto L_0x0093
            java.lang.String r7 = " and rowid <= ?"
        L_0x0093:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x01c3 }
            r4.<init>(r0)     // Catch:{ SQLiteException -> 0x01c3 }
            r4.append(r7)     // Catch:{ SQLiteException -> 0x01c3 }
            java.lang.String r0 = " order by rowid limit 1;"
            r4.append(r0)     // Catch:{ SQLiteException -> 0x01c3 }
            java.lang.String r0 = r4.toString()     // Catch:{ SQLiteException -> 0x01c3 }
            android.database.Cursor r5 = r15.rawQuery(r0, r6)     // Catch:{ SQLiteException -> 0x01c3 }
            boolean r0 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x01c3 }
            if (r0 != 0) goto L_0x00b0
            goto L_0x01d5
        L_0x00b0:
            java.lang.String r0 = r5.getString(r13)     // Catch:{ SQLiteException -> 0x01c3 }
            r5.close()     // Catch:{ SQLiteException -> 0x01c3 }
            r4 = r8
        L_0x00b8:
            java.lang.String r7 = "raw_events_metadata"
            java.lang.String r6 = "metadata"
            java.lang.String[] r8 = new java.lang.String[]{r6}     // Catch:{ SQLiteException -> 0x0072 }
            java.lang.String r9 = "app_id = ? and metadata_fingerprint = ?"
            java.lang.String[] r10 = new java.lang.String[]{r4, r0}     // Catch:{ SQLiteException -> 0x0072 }
            java.lang.String r18 = "rowid"
            java.lang.String r19 = "2"
            r11 = 0
            r12 = 0
            r6 = r15
            r13 = r18
            r1 = r14
            r14 = r19
            android.database.Cursor r5 = r6.query(r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ SQLiteException -> 0x0072 }
            boolean r6 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x0072 }
            if (r6 != 0) goto L_0x00ee
            T1.Z r0 = r3.f3496r     // Catch:{ SQLiteException -> 0x0072 }
            T1.C0212u0.k(r0)     // Catch:{ SQLiteException -> 0x0072 }
            T1.X r0 = r0.f3172f     // Catch:{ SQLiteException -> 0x0072 }
            java.lang.String r1 = "Raw event metadata record is missing. appId"
            T1.Y r2 = T1.Z.w(r4)     // Catch:{ SQLiteException -> 0x0072 }
            r0.b(r2, r1)     // Catch:{ SQLiteException -> 0x0072 }
            goto L_0x01d5
        L_0x00ee:
            r14 = 0
            byte[] r6 = r5.getBlob(r14)     // Catch:{ SQLiteException -> 0x0072 }
            com.google.android.gms.internal.measurement.zzhw r7 = com.google.android.gms.internal.measurement.zzhx.zzz()     // Catch:{ IOException -> 0x01b1 }
            com.google.android.gms.internal.measurement.zzng r6 = T1.C0162d0.U(r7, r6)     // Catch:{ IOException -> 0x01b1 }
            com.google.android.gms.internal.measurement.zzhw r6 = (com.google.android.gms.internal.measurement.zzhw) r6     // Catch:{ IOException -> 0x01b1 }
            com.google.android.gms.internal.measurement.zzmd r6 = r6.zzba()     // Catch:{ IOException -> 0x01b1 }
            com.google.android.gms.internal.measurement.zzhx r6 = (com.google.android.gms.internal.measurement.zzhx) r6     // Catch:{ IOException -> 0x01b1 }
            boolean r7 = r5.moveToNext()     // Catch:{ SQLiteException -> 0x0072 }
            if (r7 == 0) goto L_0x0119
            T1.Z r7 = r3.f3496r     // Catch:{ SQLiteException -> 0x0072 }
            T1.C0212u0.k(r7)     // Catch:{ SQLiteException -> 0x0072 }
            T1.X r7 = r7.f3175r     // Catch:{ SQLiteException -> 0x0072 }
            java.lang.String r8 = "Get multiple raw event metadata records, expected one. appId"
            T1.Y r9 = T1.Z.w(r4)     // Catch:{ SQLiteException -> 0x0072 }
            r7.b(r9, r8)     // Catch:{ SQLiteException -> 0x0072 }
        L_0x0119:
            r5.close()     // Catch:{ SQLiteException -> 0x0072 }
            com.google.android.gms.common.internal.I.g(r6)     // Catch:{ SQLiteException -> 0x0072 }
            r2.f490b = r6     // Catch:{ SQLiteException -> 0x0072 }
            int r6 = (r24 > r16 ? 1 : (r24 == r16 ? 0 : -1))
            if (r6 == 0) goto L_0x0132
            java.lang.String r6 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?"
            java.lang.String r7 = java.lang.String.valueOf(r24)     // Catch:{ SQLiteException -> 0x0072 }
            java.lang.String[] r0 = new java.lang.String[]{r4, r0, r7}     // Catch:{ SQLiteException -> 0x0072 }
        L_0x012f:
            r10 = r0
            r9 = r6
            goto L_0x0139
        L_0x0132:
            java.lang.String r6 = "app_id = ? and metadata_fingerprint = ?"
            java.lang.String[] r0 = new java.lang.String[]{r4, r0}     // Catch:{ SQLiteException -> 0x0072 }
            goto L_0x012f
        L_0x0139:
            java.lang.String r7 = "raw_events"
            java.lang.String r0 = "rowid"
            java.lang.String r6 = "name"
            java.lang.String r8 = "timestamp"
            java.lang.String r11 = "data"
            java.lang.String[] r8 = new java.lang.String[]{r0, r6, r8, r11}     // Catch:{ SQLiteException -> 0x0072 }
            java.lang.String r13 = "rowid"
            r11 = 0
            r12 = 0
            r0 = 0
            r6 = r15
            r15 = r14
            r14 = r0
            android.database.Cursor r5 = r6.query(r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ SQLiteException -> 0x0072 }
            boolean r0 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x0072 }
            if (r0 == 0) goto L_0x01a0
        L_0x0159:
            long r6 = r5.getLong(r15)     // Catch:{ SQLiteException -> 0x0072 }
            r0 = 3
            byte[] r0 = r5.getBlob(r0)     // Catch:{ SQLiteException -> 0x0072 }
            com.google.android.gms.internal.measurement.zzhl r8 = com.google.android.gms.internal.measurement.zzhm.zze()     // Catch:{ IOException -> 0x0188 }
            com.google.android.gms.internal.measurement.zzng r0 = T1.C0162d0.U(r8, r0)     // Catch:{ IOException -> 0x0188 }
            com.google.android.gms.internal.measurement.zzhl r0 = (com.google.android.gms.internal.measurement.zzhl) r0     // Catch:{ IOException -> 0x0188 }
            java.lang.String r8 = r5.getString(r1)     // Catch:{ SQLiteException -> 0x0072 }
            r0.zzi(r8)     // Catch:{ SQLiteException -> 0x0072 }
            r8 = 2
            long r8 = r5.getLong(r8)     // Catch:{ SQLiteException -> 0x0072 }
            r0.zzm(r8)     // Catch:{ SQLiteException -> 0x0072 }
            com.google.android.gms.internal.measurement.zzmd r0 = r0.zzba()     // Catch:{ SQLiteException -> 0x0072 }
            com.google.android.gms.internal.measurement.zzhm r0 = (com.google.android.gms.internal.measurement.zzhm) r0     // Catch:{ SQLiteException -> 0x0072 }
            boolean r0 = r2.c(r0, r6)     // Catch:{ SQLiteException -> 0x0072 }
            if (r0 != 0) goto L_0x0199
            goto L_0x01d5
        L_0x0188:
            r0 = move-exception
            T1.Z r6 = r3.f3496r     // Catch:{ SQLiteException -> 0x0072 }
            T1.C0212u0.k(r6)     // Catch:{ SQLiteException -> 0x0072 }
            T1.X r6 = r6.f3172f     // Catch:{ SQLiteException -> 0x0072 }
            java.lang.String r7 = "Data loss. Failed to merge raw event. appId"
            T1.Y r8 = T1.Z.w(r4)     // Catch:{ SQLiteException -> 0x0072 }
            r6.c(r7, r8, r0)     // Catch:{ SQLiteException -> 0x0072 }
        L_0x0199:
            boolean r0 = r5.moveToNext()     // Catch:{ SQLiteException -> 0x0072 }
            if (r0 != 0) goto L_0x0159
            goto L_0x01d5
        L_0x01a0:
            T1.Z r0 = r3.f3496r     // Catch:{ SQLiteException -> 0x0072 }
            T1.C0212u0.k(r0)     // Catch:{ SQLiteException -> 0x0072 }
            T1.X r0 = r0.f3175r     // Catch:{ SQLiteException -> 0x0072 }
            java.lang.String r1 = "Raw event data disappeared while in transaction. appId"
            T1.Y r2 = T1.Z.w(r4)     // Catch:{ SQLiteException -> 0x0072 }
            r0.b(r2, r1)     // Catch:{ SQLiteException -> 0x0072 }
            goto L_0x01d5
        L_0x01b1:
            r0 = move-exception
            T1.Z r1 = r3.f3496r     // Catch:{ SQLiteException -> 0x0072 }
            T1.C0212u0.k(r1)     // Catch:{ SQLiteException -> 0x0072 }
            T1.X r1 = r1.f3172f     // Catch:{ SQLiteException -> 0x0072 }
            java.lang.String r2 = "Data loss. Failed to merge raw event metadata. appId"
            T1.Y r6 = T1.Z.w(r4)     // Catch:{ SQLiteException -> 0x0072 }
            r1.c(r2, r6, r0)     // Catch:{ SQLiteException -> 0x0072 }
            goto L_0x01d5
        L_0x01c3:
            r0 = move-exception
        L_0x01c4:
            r4 = r8
        L_0x01c5:
            T1.Z r1 = r3.f3496r     // Catch:{ all -> 0x006f }
            T1.C0212u0.k(r1)     // Catch:{ all -> 0x006f }
            T1.X r1 = r1.f3172f     // Catch:{ all -> 0x006f }
            java.lang.String r2 = "Data loss. Error selecting raw event. appId"
            T1.Y r3 = T1.Z.w(r4)     // Catch:{ all -> 0x006f }
            r1.c(r2, r3, r0)     // Catch:{ all -> 0x006f }
        L_0x01d5:
            if (r5 == 0) goto L_0x01da
            r5.close()
        L_0x01da:
            return
        L_0x01db:
            if (r5 == 0) goto L_0x01e0
            r5.close()
        L_0x01e0:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.C0191n.d0(java.lang.String, long, long, D0.d):void");
    }

    public final long f0(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            cursor = k0().rawQuery(str, strArr);
            if (cursor.moveToFirst()) {
                long j6 = cursor.getLong(0);
                cursor.close();
                return j6;
            }
            throw new SQLiteException("Database returned empty set");
        } catch (SQLiteException e6) {
            Z z3 = ((C0212u0) this.f398a).f3496r;
            C0212u0.k(z3);
            z3.f3172f.c("Database error", str, e6);
            throw e6;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final long g0(String str, String[] strArr, long j6) {
        Cursor cursor = null;
        try {
            Cursor rawQuery = k0().rawQuery(str, strArr);
            if (rawQuery.moveToFirst()) {
                j6 = rawQuery.getLong(0);
            }
            rawQuery.close();
            return j6;
        } catch (SQLiteException e6) {
            Z z3 = ((C0212u0) this.f398a).f3496r;
            C0212u0.k(z3);
            z3.f3172f.c("Database error", str, e6);
            throw e6;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final long h0(String str, zzhv zzhv, String str2, Map map, C0178i1 i1Var, Long l6) {
        int delete;
        String str3 = str;
        Long l7 = l6;
        o();
        p();
        I.g(zzhv);
        I.d(str);
        C0212u0 u0Var = (C0212u0) this.f398a;
        if (!u0Var.f3494p.B((String) null, H.f2867M0)) {
            return -1;
        }
        o();
        p();
        boolean Z5 = Z();
        b bVar = u0Var.f3501w;
        Z z3 = u0Var.f3496r;
        if (Z5) {
            T1 t12 = this.f2982b;
            long a6 = t12.f3067r.f3545f.a();
            bVar.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(elapsedRealtime - a6) > ((Long) H.f2865L.a((Object) null)).longValue()) {
                t12.f3067r.f3545f.b(elapsedRealtime);
                o();
                p();
                if (Z() && (delete = k0().delete("upload_queue", S(), new String[0])) > 0) {
                    C0212u0.k(z3);
                    z3.f3180w.b(Integer.valueOf(delete), "Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted");
                }
                G g = H.f2872P0;
                C0170g gVar = u0Var.f3494p;
                if (gVar.B((String) null, g)) {
                    I.d(str);
                    o();
                    p();
                    try {
                        int u6 = gVar.u(str3, H.f2844A);
                        if (u6 > 0) {
                            k0().delete("upload_queue", "rowid in (SELECT rowid FROM upload_queue WHERE app_id=? ORDER BY rowid DESC LIMIT -1 OFFSET ?)", new String[]{str3, String.valueOf(u6)});
                        }
                    } catch (SQLiteException e6) {
                        C0212u0.k(z3);
                        z3.f3172f.c("Error deleting over the limit queued batches. appId", Z.w(str), e6);
                    }
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(((String) entry.getKey()) + "=" + ((String) entry.getValue()));
        }
        byte[] zzcd = zzhv.zzcd();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str3);
        contentValues.put("measurement_batch", zzcd);
        contentValues.put("upload_uri", str2);
        StringBuilder sb = new StringBuilder();
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            while (true) {
                sb.append((CharSequence) it2.next());
                if (!it2.hasNext()) {
                    break;
                }
                sb.append("\r\n");
            }
        }
        contentValues.put("upload_headers", sb.toString());
        contentValues.put("upload_type", Integer.valueOf(i1Var.f3347a));
        bVar.getClass();
        contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("retry_count", 0);
        if (l7 != null) {
            contentValues.put("associated_row_id", l7);
        }
        try {
            long insert = k0().insert("upload_queue", (String) null, contentValues);
            if (insert != -1) {
                return insert;
            }
            C0212u0.k(z3);
            z3.f3172f.b(str3, "Failed to insert MeasurementBatch (got -1) to upload_queue. appId");
            return -1;
        } catch (SQLiteException e7) {
            C0212u0.k(z3);
            z3.f3172f.c("Error storing MeasurementBatch to upload_queue. appId", str3, e7);
            return -1;
        }
    }

    public final long i0(String str) {
        long j6;
        String str2 = str;
        C0212u0 u0Var = (C0212u0) this.f398a;
        I.d(str);
        I.d("first_open_count");
        o();
        p();
        SQLiteDatabase k02 = k0();
        k02.beginTransaction();
        long j7 = 0;
        try {
            j6 = -1;
            long g02 = g0("select first_open_count from app2 where app_id=?", new String[]{str}, -1);
            if (g02 == -1) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str2);
                contentValues.put("first_open_count", 0);
                contentValues.put("previous_install_count", 0);
                if (k02.insertWithOnConflict("app2", (String) null, contentValues, 5) == -1) {
                    Z z3 = u0Var.f3496r;
                    C0212u0.k(z3);
                    z3.f3172f.c("Failed to insert column (got -1). appId", Z.w(str), "first_open_count");
                    k02.endTransaction();
                    return j6;
                }
                g02 = 0;
            }
            try {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("app_id", str2);
                contentValues2.put("first_open_count", Long.valueOf(1 + g02));
                if (((long) k02.update("app2", contentValues2, "app_id = ?", new String[]{str})) == 0) {
                    Z z4 = u0Var.f3496r;
                    C0212u0.k(z4);
                    z4.f3172f.c("Failed to update column (got 0). appId", Z.w(str), "first_open_count");
                } else {
                    k02.setTransactionSuccessful();
                    j6 = g02;
                }
            } catch (SQLiteException e6) {
                e = e6;
                j7 = g02;
                try {
                    Z z5 = u0Var.f3496r;
                    C0212u0.k(z5);
                    z5.f3172f.d("Error inserting column. appId", Z.w(str), "first_open_count", e);
                    j6 = j7;
                    k02.endTransaction();
                    return j6;
                } catch (Throwable th) {
                    k02.endTransaction();
                    throw th;
                }
            }
        } catch (SQLiteException e7) {
            e = e7;
            Z z52 = u0Var.f3496r;
            C0212u0.k(z52);
            z52.f3172f.d("Error inserting column. appId", Z.w(str), "first_open_count", e);
            j6 = j7;
            k02.endTransaction();
            return j6;
        }
        k02.endTransaction();
        return j6;
    }

    public final long j0(String str) {
        I.d(str);
        return g0("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0);
    }

    public final SQLiteDatabase k0() {
        o();
        try {
            return this.d.getWritableDatabase();
        } catch (SQLiteException e6) {
            Z z3 = ((C0212u0) this.f398a).f3496r;
            C0212u0.k(z3);
            z3.f3175r.b(e6, "Error opening database");
            throw e6;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:127:0x03fe  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0407  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T1.V l0(java.lang.String r53) {
        /*
            r52 = this;
            r1 = r52
            r2 = r53
            java.lang.Object r3 = r1.f398a
            T1.u0 r3 = (T1.C0212u0) r3
            com.google.android.gms.common.internal.I.d(r53)
            r52.o()
            r52.p()
            r4 = 0
            android.database.sqlite.SQLiteDatabase r5 = r52.k0()     // Catch:{ SQLiteException -> 0x03e9, all -> 0x03e6 }
            java.lang.String r6 = "apps"
            java.lang.String r7 = "app_instance_id"
            java.lang.String r8 = "gmp_app_id"
            java.lang.String r9 = "resettable_device_id_hash"
            java.lang.String r10 = "last_bundle_index"
            java.lang.String r11 = "last_bundle_start_timestamp"
            java.lang.String r12 = "last_bundle_end_timestamp"
            java.lang.String r13 = "app_version"
            java.lang.String r14 = "app_store"
            java.lang.String r15 = "gmp_version"
            java.lang.String r16 = "dev_cert_hash"
            java.lang.String r17 = "measurement_enabled"
            java.lang.String r18 = "day"
            java.lang.String r19 = "daily_public_events_count"
            java.lang.String r20 = "daily_events_count"
            java.lang.String r21 = "daily_conversions_count"
            java.lang.String r22 = "config_fetched_time"
            java.lang.String r23 = "failed_config_fetch_time"
            java.lang.String r24 = "app_version_int"
            java.lang.String r25 = "firebase_instance_id"
            java.lang.String r26 = "daily_error_events_count"
            java.lang.String r27 = "daily_realtime_events_count"
            java.lang.String r28 = "health_monitor_sample"
            java.lang.String r29 = "android_id"
            java.lang.String r30 = "adid_reporting_enabled"
            java.lang.String r31 = "admob_app_id"
            java.lang.String r32 = "dynamite_version"
            java.lang.String r33 = "safelisted_events"
            java.lang.String r34 = "ga_app_id"
            java.lang.String r35 = "session_stitching_token"
            java.lang.String r36 = "sgtm_upload_enabled"
            java.lang.String r37 = "target_os_version"
            java.lang.String r38 = "session_stitching_token_hash"
            java.lang.String r39 = "ad_services_version"
            java.lang.String r40 = "unmatched_first_open_without_ad_id"
            java.lang.String r41 = "npa_metadata_value"
            java.lang.String r42 = "attribution_eligibility_status"
            java.lang.String r43 = "sgtm_preview_key"
            java.lang.String r44 = "dma_consent_state"
            java.lang.String r45 = "daily_realtime_dcu_count"
            java.lang.String r46 = "bundle_delivery_index"
            java.lang.String r47 = "serialized_npa_metadata"
            java.lang.String r48 = "unmatched_pfo"
            java.lang.String r49 = "unmatched_uwa"
            java.lang.String r50 = "ad_campaign_info"
            java.lang.String r51 = "client_upload_eligibility"
            java.lang.String[] r7 = new java.lang.String[]{r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51}     // Catch:{ SQLiteException -> 0x03e9, all -> 0x03e6 }
            java.lang.String r8 = "app_id=?"
            java.lang.String[] r9 = new java.lang.String[]{r53}     // Catch:{ SQLiteException -> 0x03e9, all -> 0x03e6 }
            r12 = 0
            r10 = 0
            r11 = 0
            android.database.Cursor r5 = r5.query(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ SQLiteException -> 0x03e9, all -> 0x03e6 }
            boolean r6 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            if (r6 != 0) goto L_0x008b
            goto L_0x03fc
        L_0x008b:
            T1.V r6 = new T1.V     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            T1.T1 r7 = r1.f2982b     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            T1.u0 r8 = r7.f3070u     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r6.<init>(r8, r2)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            T1.u0 r8 = r6.f3103a     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            T1.J0 r9 = r7.n0(r2)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            T1.I0 r10 = T1.I0.ANALYTICS_STORAGE     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            boolean r9 = r9.k(r10)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r11 = 0
            if (r9 == 0) goto L_0x00af
            java.lang.String r9 = r5.getString(r11)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r6.l(r9)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            goto L_0x00af
        L_0x00ab:
            r0 = move-exception
        L_0x00ac:
            r2 = r0
            goto L_0x03e4
        L_0x00af:
            r9 = 1
            java.lang.String r12 = r5.getString(r9)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r6.H(r12)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            T1.J0 r12 = r7.n0(r2)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            T1.I0 r13 = T1.I0.AD_STORAGE     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            boolean r12 = r12.k(r13)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            if (r12 == 0) goto L_0x00cb
            r12 = 2
            java.lang.String r12 = r5.getString(r12)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r6.P(r12)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
        L_0x00cb:
            r12 = 3
            long r12 = r5.getLong(r12)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r6.M(r12)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r12 = 4
            long r12 = r5.getLong(r12)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r6.N(r12)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r12 = 5
            long r12 = r5.getLong(r12)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r6.L(r12)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r12 = 6
            java.lang.String r12 = r5.getString(r12)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r6.n(r12)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r12 = 7
            java.lang.String r12 = r5.getString(r12)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r6.m(r12)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r12 = 8
            long r12 = r5.getLong(r12)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r6.I(r12)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r12 = 9
            long r12 = r5.getLong(r12)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r6.C(r12)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r12 = 10
            boolean r13 = r5.isNull(r12)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            if (r13 != 0) goto L_0x0113
            int r12 = r5.getInt(r12)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            if (r12 == 0) goto L_0x0115
        L_0x0113:
            r12 = r9
            goto L_0x0116
        L_0x0115:
            r12 = r11
        L_0x0116:
            r6.O(r12)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r12 = 11
            long r12 = r5.getLong(r12)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r6.B(r12)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r12 = 12
            long r12 = r5.getLong(r12)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r6.y(r12)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r12 = 13
            long r12 = r5.getLong(r12)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r6.x(r12)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r12 = 14
            long r12 = r5.getLong(r12)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r6.v(r12)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r12 = 15
            long r12 = r5.getLong(r12)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r6.u(r12)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r12 = 16
            long r12 = r5.getLong(r12)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r6.F(r12)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r12 = 17
            boolean r13 = r5.isNull(r12)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            if (r13 == 0) goto L_0x015b
            r12 = -2147483648(0xffffffff80000000, double:NaN)
            goto L_0x0160
        L_0x015b:
            int r12 = r5.getInt(r12)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            long r12 = (long) r12     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
        L_0x0160:
            r6.o(r12)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r12 = 18
            java.lang.String r12 = r5.getString(r12)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r6.G(r12)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r12 = 19
            long r12 = r5.getLong(r12)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r6.w(r12)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r12 = 20
            long r12 = r5.getLong(r12)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r6.A(r12)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r12 = 21
            java.lang.String r12 = r5.getString(r12)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r6.J(r12)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r12 = 23
            boolean r13 = r5.isNull(r12)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            if (r13 != 0) goto L_0x0195
            int r12 = r5.getInt(r12)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            if (r12 == 0) goto L_0x0197
        L_0x0195:
            r12 = r9
            goto L_0x0198
        L_0x0197:
            r12 = r11
        L_0x0198:
            T1.r0 r13 = r8.f3497s     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            T1.C0212u0.k(r13)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r13.o()     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            boolean r13 = r6.f3100R     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            boolean r14 = r6.f3115p     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            if (r14 == r12) goto L_0x01a8
            r14 = r9
            goto L_0x01a9
        L_0x01a8:
            r14 = r11
        L_0x01a9:
            r13 = r13 | r14
            r6.f3100R = r13     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r6.f3115p = r12     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r12 = 24
            java.lang.String r12 = r5.getString(r12)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r6.k(r12)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r12 = 25
            boolean r13 = r5.isNull(r12)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            if (r13 == 0) goto L_0x01c2
            r12 = 0
            goto L_0x01c6
        L_0x01c2:
            long r12 = r5.getLong(r12)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
        L_0x01c6:
            r6.E(r12)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r12 = 26
            boolean r13 = r5.isNull(r12)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            if (r13 != 0) goto L_0x01e3
            java.lang.String r12 = r5.getString(r12)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            java.lang.String r13 = ","
            r14 = -1
            java.lang.String[] r12 = r12.split(r13, r14)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            java.util.List r12 = java.util.Arrays.asList(r12)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r6.Q(r12)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
        L_0x01e3:
            T1.J0 r7 = r7.n0(r2)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            boolean r7 = r7.k(r10)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            if (r7 == 0) goto L_0x020f
            r7 = 28
            java.lang.String r7 = r5.getString(r7)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            T1.r0 r10 = r8.f3497s     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            T1.C0212u0.k(r10)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r10.o()     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            boolean r10 = r6.f3100R     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            java.lang.String r12 = r6.f3120u     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            boolean r12 = java.util.Objects.equals(r12, r7)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r12 = r12 ^ r9
            r10 = r10 | r12
            r6.f3100R = r10     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r6.f3120u = r7     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            goto L_0x020f
        L_0x020a:
            r6 = r0
            goto L_0x03ec
        L_0x020d:
            r0 = move-exception
            goto L_0x020a
        L_0x020f:
            r7 = 29
            boolean r10 = r5.isNull(r7)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            if (r10 != 0) goto L_0x021f
            int r7 = r5.getInt(r7)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            if (r7 == 0) goto L_0x021f
            r7 = r9
            goto L_0x0220
        L_0x021f:
            r7 = r11
        L_0x0220:
            T1.r0 r10 = r8.f3497s     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            T1.C0212u0.k(r10)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r10.o()     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            boolean r10 = r6.f3100R     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            boolean r12 = r6.f3121v     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            if (r12 == r7) goto L_0x0230
            r12 = r9
            goto L_0x0231
        L_0x0230:
            r12 = r11
        L_0x0231:
            r10 = r10 | r12
            r6.f3100R = r10     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r6.f3121v = r7     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r7 = 39
            long r12 = r5.getLong(r7)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r6.K(r12)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r7 = 36
            java.lang.String r7 = r5.getString(r7)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            T1.r0 r10 = r8.f3497s     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            T1.C0212u0.k(r10)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r10.o()     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            boolean r10 = r6.f3100R     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            java.lang.String r12 = r6.f3087D     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            if (r12 == r7) goto L_0x0255
            r12 = r9
            goto L_0x0256
        L_0x0255:
            r12 = r11
        L_0x0256:
            r10 = r10 | r12
            r6.f3100R = r10     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r6.f3087D = r7     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r7 = 30
            long r12 = r5.getLong(r7)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r6.r(r12)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r7 = 31
            long r12 = r5.getLong(r7)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r6.q(r12)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            com.google.android.gms.internal.measurement.zzqr.zzb()     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            T1.g r7 = r3.f3494p     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            T1.G r10 = T1.H.f2884V0     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            boolean r7 = r7.B(r2, r10)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            if (r7 == 0) goto L_0x029f
            r7 = 32
            int r7 = r5.getInt(r7)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            T1.r0 r10 = r8.f3497s     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            T1.C0212u0.k(r10)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r10.o()     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            boolean r10 = r6.f3100R     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            int r12 = r6.f3124y     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            if (r12 == r7) goto L_0x0290
            r12 = r9
            goto L_0x0291
        L_0x0290:
            r12 = r11
        L_0x0291:
            r10 = r10 | r12
            r6.f3100R = r10     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r6.f3124y = r7     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r7 = 35
            long r12 = r5.getLong(r7)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r6.p(r12)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
        L_0x029f:
            r7 = 33
            boolean r10 = r5.isNull(r7)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            if (r10 != 0) goto L_0x02af
            int r7 = r5.getInt(r7)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            if (r7 == 0) goto L_0x02af
            r7 = r9
            goto L_0x02b0
        L_0x02af:
            r7 = r11
        L_0x02b0:
            T1.r0 r10 = r8.f3497s     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            T1.C0212u0.k(r10)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r10.o()     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            boolean r10 = r6.f3100R     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            boolean r12 = r6.f3125z     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            if (r12 == r7) goto L_0x02c0
            r12 = r9
            goto L_0x02c1
        L_0x02c0:
            r12 = r11
        L_0x02c1:
            r10 = r10 | r12
            r6.f3100R = r10     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r6.f3125z = r7     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r7 = 34
            boolean r10 = r5.isNull(r7)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            if (r10 == 0) goto L_0x02d0
            r7 = r4
            goto L_0x02dd
        L_0x02d0:
            int r7 = r5.getInt(r7)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            if (r7 == 0) goto L_0x02d8
            r7 = r9
            goto L_0x02d9
        L_0x02d8:
            r7 = r11
        L_0x02d9:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
        L_0x02dd:
            T1.r0 r10 = r8.f3497s     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            T1.C0212u0.k(r10)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r10.o()     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            boolean r10 = r6.f3100R     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            java.lang.Boolean r12 = r6.f3117r     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            boolean r12 = java.util.Objects.equals(r12, r7)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r12 = r12 ^ r9
            r10 = r10 | r12
            r6.f3100R = r10     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r6.f3117r = r7     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r7 = 37
            int r7 = r5.getInt(r7)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r6.D(r7)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r7 = 38
            int r7 = r5.getInt(r7)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r6.z(r7)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r7 = 40
            boolean r10 = r5.isNull(r7)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            if (r10 == 0) goto L_0x0310
            java.lang.String r7 = ""
            goto L_0x0317
        L_0x0310:
            java.lang.String r7 = r5.getString(r7)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            com.google.android.gms.common.internal.I.g(r7)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
        L_0x0317:
            T1.r0 r10 = r8.f3497s     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            T1.C0212u0.k(r10)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r10.o()     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            boolean r10 = r6.f3100R     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            java.lang.String r12 = r6.f3090H     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            if (r12 == r7) goto L_0x0327
            r12 = r9
            goto L_0x0328
        L_0x0327:
            r12 = r11
        L_0x0328:
            r10 = r10 | r12
            r6.f3100R = r10     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r6.f3090H = r7     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r7 = 41
            boolean r10 = r5.isNull(r7)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            if (r10 != 0) goto L_0x0353
            long r12 = r5.getLong(r7)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            java.lang.Long r7 = java.lang.Long.valueOf(r12)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            T1.r0 r10 = r8.f3497s     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            T1.C0212u0.k(r10)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r10.o()     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            boolean r10 = r6.f3100R     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            java.lang.Long r12 = r6.f3084A     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            boolean r12 = java.util.Objects.equals(r12, r7)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r12 = r12 ^ r9
            r10 = r10 | r12
            r6.f3100R = r10     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r6.f3084A = r7     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
        L_0x0353:
            r7 = 42
            boolean r10 = r5.isNull(r7)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            if (r10 != 0) goto L_0x0379
            long r12 = r5.getLong(r7)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            java.lang.Long r7 = java.lang.Long.valueOf(r12)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            T1.r0 r10 = r8.f3497s     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            T1.C0212u0.k(r10)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r10.o()     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            boolean r10 = r6.f3100R     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            java.lang.Long r12 = r6.f3085B     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            boolean r12 = java.util.Objects.equals(r12, r7)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r12 = r12 ^ r9
            r10 = r10 | r12
            r6.f3100R = r10     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r6.f3085B = r7     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
        L_0x0379:
            r7 = 43
            byte[] r7 = r5.getBlob(r7)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            T1.r0 r10 = r8.f3497s     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            T1.C0212u0.k(r10)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r10.o()     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            boolean r10 = r6.f3100R     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            byte[] r12 = r6.f3091I     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            if (r12 == r7) goto L_0x038f
            r12 = r9
            goto L_0x0390
        L_0x038f:
            r12 = r11
        L_0x0390:
            r10 = r10 | r12
            r6.f3100R = r10     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r6.f3091I = r7     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            T1.g r7 = r3.f3494p     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            T1.G r10 = T1.H.f2872P0     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            boolean r7 = r7.B(r2, r10)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            if (r7 == 0) goto L_0x03c0
            r7 = 44
            boolean r10 = r5.isNull(r7)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            if (r10 != 0) goto L_0x03c0
            int r7 = r5.getInt(r7)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            T1.r0 r10 = r8.f3497s     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            T1.C0212u0.k(r10)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r10.o()     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            boolean r10 = r6.f3100R     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            int r12 = r6.f3092J     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            if (r12 == r7) goto L_0x03ba
            goto L_0x03bb
        L_0x03ba:
            r9 = r11
        L_0x03bb:
            r9 = r9 | r10
            r6.f3100R = r9     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r6.f3092J = r7     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
        L_0x03c0:
            T1.r0 r7 = r8.f3497s     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            T1.C0212u0.k(r7)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r7.o()     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r6.f3100R = r11     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            boolean r7 = r5.moveToNext()     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            if (r7 == 0) goto L_0x03e0
            T1.Z r7 = r3.f3496r     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            T1.C0212u0.k(r7)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            T1.X r7 = r7.f3172f     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            java.lang.String r8 = "Got multiple records for app, expected one. appId"
            T1.Y r9 = T1.Z.w(r53)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
            r7.b(r9, r8)     // Catch:{ SQLiteException -> 0x020d, all -> 0x00ab }
        L_0x03e0:
            r5.close()
            return r6
        L_0x03e4:
            r4 = r5
            goto L_0x0405
        L_0x03e6:
            r0 = move-exception
            r2 = r0
            goto L_0x0405
        L_0x03e9:
            r0 = move-exception
            r6 = r0
            r5 = r4
        L_0x03ec:
            T1.Z r3 = r3.f3496r     // Catch:{ all -> 0x0402 }
            T1.C0212u0.k(r3)     // Catch:{ all -> 0x0402 }
            T1.X r3 = r3.f3172f     // Catch:{ all -> 0x0402 }
            java.lang.String r7 = "Error querying app. appId"
            T1.Y r2 = T1.Z.w(r53)     // Catch:{ all -> 0x0402 }
            r3.c(r7, r2, r6)     // Catch:{ all -> 0x0402 }
        L_0x03fc:
            if (r5 == 0) goto L_0x0401
            r5.close()
        L_0x0401:
            return r4
        L_0x0402:
            r0 = move-exception
            goto L_0x00ac
        L_0x0405:
            if (r4 == 0) goto L_0x040a
            r4.close()
        L_0x040a:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.C0191n.l0(java.lang.String):T1.V");
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0118  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T1.C0164e m0(java.lang.String r28, java.lang.String r29) {
        /*
            r27 = this;
            r1 = r27
            r8 = r29
            java.lang.Object r0 = r1.f398a
            r9 = r0
            T1.u0 r9 = (T1.C0212u0) r9
            com.google.android.gms.common.internal.I.d(r28)
            com.google.android.gms.common.internal.I.d(r29)
            r27.o()
            r27.p()
            r10 = 0
            android.database.sqlite.SQLiteDatabase r11 = r27.k0()     // Catch:{ SQLiteException -> 0x00f8, all -> 0x00f6 }
            java.lang.String r12 = "conditional_properties"
            java.lang.String r13 = "origin"
            java.lang.String r14 = "value"
            java.lang.String r15 = "active"
            java.lang.String r16 = "trigger_event_name"
            java.lang.String r17 = "trigger_timeout"
            java.lang.String r18 = "timed_out_event"
            java.lang.String r19 = "creation_timestamp"
            java.lang.String r20 = "triggered_event"
            java.lang.String r21 = "triggered_timestamp"
            java.lang.String r22 = "time_to_live"
            java.lang.String r23 = "expired_event"
            java.lang.String[] r13 = new java.lang.String[]{r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23}     // Catch:{ SQLiteException -> 0x00f8, all -> 0x00f6 }
            java.lang.String r14 = "app_id=? and name=?"
            java.lang.String[] r15 = new java.lang.String[]{r28, r29}     // Catch:{ SQLiteException -> 0x00f8, all -> 0x00f6 }
            r18 = 0
            r16 = 0
            r17 = 0
            android.database.Cursor r11 = r11.query(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ SQLiteException -> 0x00f8, all -> 0x00f6 }
            boolean r0 = r11.moveToFirst()     // Catch:{ SQLiteException -> 0x00ee }
            if (r0 != 0) goto L_0x004e
            goto L_0x0110
        L_0x004e:
            r0 = 0
            java.lang.String r2 = r11.getString(r0)     // Catch:{ SQLiteException -> 0x00ee }
            if (r2 != 0) goto L_0x0057
            java.lang.String r2 = ""
        L_0x0057:
            r14 = r2
            goto L_0x005c
        L_0x0059:
            r0 = move-exception
            goto L_0x00f4
        L_0x005c:
            r2 = 1
            java.lang.Object r5 = r1.v0(r11, r2)     // Catch:{ SQLiteException -> 0x00ee }
            r3 = 2
            int r3 = r11.getInt(r3)     // Catch:{ SQLiteException -> 0x00ee }
            if (r3 == 0) goto L_0x006b
            r18 = r2
            goto L_0x006d
        L_0x006b:
            r18 = r0
        L_0x006d:
            r0 = 3
            java.lang.String r19 = r11.getString(r0)     // Catch:{ SQLiteException -> 0x00ee }
            r0 = 4
            long r21 = r11.getLong(r0)     // Catch:{ SQLiteException -> 0x00ee }
            T1.T1 r0 = r1.f2982b     // Catch:{ SQLiteException -> 0x00ee }
            T1.d0 r0 = r0.f3065p     // Catch:{ SQLiteException -> 0x00ee }
            T1.T1.L(r0)     // Catch:{ SQLiteException -> 0x00ee }
            r2 = 5
            byte[] r2 = r11.getBlob(r2)     // Catch:{ SQLiteException -> 0x00ee }
            android.os.Parcelable$Creator<T1.v> r3 = T1.C0214v.CREATOR     // Catch:{ SQLiteException -> 0x00ee }
            android.os.Parcelable r2 = r0.Q(r2, r3)     // Catch:{ SQLiteException -> 0x00ee }
            r20 = r2
            T1.v r20 = (T1.C0214v) r20     // Catch:{ SQLiteException -> 0x00ee }
            r2 = 6
            long r16 = r11.getLong(r2)     // Catch:{ SQLiteException -> 0x00ee }
            T1.T1.L(r0)     // Catch:{ SQLiteException -> 0x00ee }
            r2 = 7
            byte[] r2 = r11.getBlob(r2)     // Catch:{ SQLiteException -> 0x00ee }
            android.os.Parcelable r2 = r0.Q(r2, r3)     // Catch:{ SQLiteException -> 0x00ee }
            r23 = r2
            T1.v r23 = (T1.C0214v) r23     // Catch:{ SQLiteException -> 0x00ee }
            r2 = 8
            long r6 = r11.getLong(r2)     // Catch:{ SQLiteException -> 0x00ee }
            r2 = 9
            long r24 = r11.getLong(r2)     // Catch:{ SQLiteException -> 0x00ee }
            T1.T1.L(r0)     // Catch:{ SQLiteException -> 0x00ee }
            r2 = 10
            byte[] r2 = r11.getBlob(r2)     // Catch:{ SQLiteException -> 0x00ee }
            android.os.Parcelable r0 = r0.Q(r2, r3)     // Catch:{ SQLiteException -> 0x00ee }
            r26 = r0
            T1.v r26 = (T1.C0214v) r26     // Catch:{ SQLiteException -> 0x00ee }
            T1.W1 r15 = new T1.W1     // Catch:{ SQLiteException -> 0x00ee }
            r2 = r15
            r3 = r6
            r6 = r29
            r7 = r14
            r2.<init>(r3, r5, r6, r7)     // Catch:{ SQLiteException -> 0x00ee }
            T1.e r0 = new T1.e     // Catch:{ SQLiteException -> 0x00ee }
            r12 = r0
            r13 = r28
            r12.<init>(r13, r14, r15, r16, r18, r19, r20, r21, r23, r24, r26)     // Catch:{ SQLiteException -> 0x00ee }
            boolean r2 = r11.moveToNext()     // Catch:{ SQLiteException -> 0x00ee }
            if (r2 == 0) goto L_0x00f0
            T1.Z r2 = r9.f3496r     // Catch:{ SQLiteException -> 0x00ee }
            T1.C0212u0.k(r2)     // Catch:{ SQLiteException -> 0x00ee }
            T1.X r2 = r2.f3172f     // Catch:{ SQLiteException -> 0x00ee }
            java.lang.String r3 = "Got multiple records for conditional property, expected one"
            T1.Y r4 = T1.Z.w(r28)     // Catch:{ SQLiteException -> 0x00ee }
            T1.S r5 = r9.f3500v     // Catch:{ SQLiteException -> 0x00ee }
            java.lang.String r5 = r5.f(r8)     // Catch:{ SQLiteException -> 0x00ee }
            r2.c(r3, r4, r5)     // Catch:{ SQLiteException -> 0x00ee }
            goto L_0x00f0
        L_0x00ee:
            r0 = move-exception
            goto L_0x00fa
        L_0x00f0:
            r11.close()
            return r0
        L_0x00f4:
            r10 = r11
            goto L_0x0116
        L_0x00f6:
            r0 = move-exception
            goto L_0x0116
        L_0x00f8:
            r0 = move-exception
            r11 = r10
        L_0x00fa:
            T1.Z r2 = r9.f3496r     // Catch:{ all -> 0x0059 }
            T1.C0212u0.k(r2)     // Catch:{ all -> 0x0059 }
            T1.X r2 = r2.f3172f     // Catch:{ all -> 0x0059 }
            java.lang.String r3 = "Error querying conditional property"
            T1.Y r4 = T1.Z.w(r28)     // Catch:{ all -> 0x0059 }
            T1.S r5 = r9.f3500v     // Catch:{ all -> 0x0059 }
            java.lang.String r5 = r5.f(r8)     // Catch:{ all -> 0x0059 }
            r2.d(r3, r4, r5, r0)     // Catch:{ all -> 0x0059 }
        L_0x0110:
            if (r11 == 0) goto L_0x0115
            r11.close()
        L_0x0115:
            return r10
        L_0x0116:
            if (r10 == 0) goto L_0x011b
            r10.close()
        L_0x011b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.C0191n.m0(java.lang.String, java.lang.String):T1.e");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0089  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final B0.C0009h n0(java.lang.String r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f398a
            T1.u0 r0 = (T1.C0212u0) r0
            com.google.android.gms.common.internal.I.d(r11)
            r10.o()
            r10.p()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r10.k0()     // Catch:{ SQLiteException -> 0x006e, all -> 0x006c }
            java.lang.String r3 = "apps"
            java.lang.String r4 = "remote_config"
            java.lang.String r5 = "config_last_modified_time"
            java.lang.String r6 = "e_tag"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5, r6}     // Catch:{ SQLiteException -> 0x006e, all -> 0x006c }
            java.lang.String r5 = "app_id=?"
            java.lang.String[] r6 = new java.lang.String[]{r11}     // Catch:{ SQLiteException -> 0x006e, all -> 0x006c }
            r9 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SQLiteException -> 0x006e, all -> 0x006c }
            boolean r3 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x005a }
            if (r3 != 0) goto L_0x0032
            goto L_0x0081
        L_0x0032:
            r3 = 0
            byte[] r3 = r2.getBlob(r3)     // Catch:{ SQLiteException -> 0x005a }
            r4 = 1
            java.lang.String r4 = r2.getString(r4)     // Catch:{ SQLiteException -> 0x005a }
            r5 = 2
            java.lang.String r5 = r2.getString(r5)     // Catch:{ SQLiteException -> 0x005a }
            boolean r6 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x005a }
            if (r6 == 0) goto L_0x005c
            T1.Z r6 = r0.f3496r     // Catch:{ SQLiteException -> 0x005a }
            T1.C0212u0.k(r6)     // Catch:{ SQLiteException -> 0x005a }
            T1.X r6 = r6.f3172f     // Catch:{ SQLiteException -> 0x005a }
            java.lang.String r7 = "Got multiple records for app config, expected one. appId"
            T1.Y r8 = T1.Z.w(r11)     // Catch:{ SQLiteException -> 0x005a }
            r6.b(r8, r7)     // Catch:{ SQLiteException -> 0x005a }
            goto L_0x005c
        L_0x0058:
            r11 = move-exception
            goto L_0x006a
        L_0x005a:
            r3 = move-exception
            goto L_0x0071
        L_0x005c:
            if (r3 != 0) goto L_0x005f
            goto L_0x0081
        L_0x005f:
            B0.h r6 = new B0.h     // Catch:{ SQLiteException -> 0x005a }
            r7 = 21
            r6.<init>((java.lang.Object) r3, (java.lang.Object) r4, (java.lang.Object) r5, (int) r7)     // Catch:{ SQLiteException -> 0x005a }
            r2.close()
            return r6
        L_0x006a:
            r1 = r2
            goto L_0x0087
        L_0x006c:
            r11 = move-exception
            goto L_0x0087
        L_0x006e:
            r2 = move-exception
            r3 = r2
            r2 = r1
        L_0x0071:
            T1.Z r0 = r0.f3496r     // Catch:{ all -> 0x0058 }
            T1.C0212u0.k(r0)     // Catch:{ all -> 0x0058 }
            T1.X r0 = r0.f3172f     // Catch:{ all -> 0x0058 }
            java.lang.String r4 = "Error querying remote config. appId"
            T1.Y r11 = T1.Z.w(r11)     // Catch:{ all -> 0x0058 }
            r0.c(r4, r11, r3)     // Catch:{ all -> 0x0058 }
        L_0x0081:
            if (r2 == 0) goto L_0x0086
            r2.close()
        L_0x0086:
            return r1
        L_0x0087:
            if (r1 == 0) goto L_0x008c
            r1.close()
        L_0x008c:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.C0191n.n0(java.lang.String):B0.h");
    }

    public final C0179j o0(boolean z3, boolean z4, boolean z5, boolean z6, String str, long j6) {
        return p0(j6, str, 1, false, false, z3, false, z4, z5, z6);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, T1.j] */
    public final C0179j p0(long j6, String str, long j7, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        C0212u0 u0Var = (C0212u0) this.f398a;
        I.d(str);
        o();
        p();
        String[] strArr = {str};
        ? obj = new Object();
        Cursor cursor = null;
        try {
            SQLiteDatabase k02 = k0();
            cursor = k02.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new String[]{str}, (String) null, (String) null, (String) null);
            if (!cursor.moveToFirst()) {
                Z z10 = u0Var.f3496r;
                C0212u0.k(z10);
                z10.f3175r.b(Z.w(str), "Not updating daily counts, app is not known. appId");
            } else {
                if (cursor.getLong(0) == j6) {
                    obj.f3349b = cursor.getLong(1);
                    obj.f3348a = cursor.getLong(2);
                    obj.f3350c = cursor.getLong(3);
                    obj.d = cursor.getLong(4);
                    obj.f3351e = cursor.getLong(5);
                    obj.f3352f = cursor.getLong(6);
                    obj.g = cursor.getLong(7);
                }
                if (z3) {
                    obj.f3349b += j7;
                }
                if (z4) {
                    obj.f3348a += j7;
                }
                if (z5) {
                    obj.f3350c += j7;
                }
                if (z6) {
                    obj.d += j7;
                }
                if (z7) {
                    obj.f3351e += j7;
                }
                if (z8) {
                    obj.f3352f += j7;
                }
                if (z9) {
                    obj.g += j7;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("day", Long.valueOf(j6));
                contentValues.put("daily_public_events_count", Long.valueOf(obj.f3348a));
                contentValues.put("daily_events_count", Long.valueOf(obj.f3349b));
                contentValues.put("daily_conversions_count", Long.valueOf(obj.f3350c));
                contentValues.put("daily_error_events_count", Long.valueOf(obj.d));
                contentValues.put("daily_realtime_events_count", Long.valueOf(obj.f3351e));
                contentValues.put("daily_realtime_dcu_count", Long.valueOf(obj.f3352f));
                contentValues.put("daily_registered_triggers_count", Long.valueOf(obj.g));
                k02.update("apps", contentValues, "app_id=?", strArr);
            }
        } catch (SQLiteException e6) {
            Z z11 = u0Var.f3496r;
            C0212u0.k(z11);
            z11.f3172f.c("Error updating daily counts. appId", Z.w(str), e6);
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        if (cursor != null) {
            cursor.close();
        }
        return obj;
    }

    public final C0205s q0(String str, zzhm zzhm, String str2) {
        C0205s Q5 = Q("events", str, zzhm.zzh());
        if (Q5 == null) {
            C0212u0 u0Var = (C0212u0) this.f398a;
            Z z3 = u0Var.f3496r;
            C0212u0.k(z3);
            z3.f3175r.c("Event aggregate wasn't created during raw event logging. appId, event", Z.w(str), u0Var.f3500v.d(str2));
            return new C0205s(str, zzhm.zzh(), 1, 1, 1, zzhm.zzd(), 0, (Long) null, (Long) null, (Long) null, (Boolean) null);
        }
        long j6 = Q5.f3459e + 1;
        long j7 = Q5.d + 1;
        Long l6 = Q5.h;
        Long l7 = Q5.f3461i;
        return new C0205s(Q5.f3456a, Q5.f3457b, Q5.f3458c + 1, j7, j6, Q5.f3460f, Q5.g, l6, l7, Q5.f3462j, Q5.f3463k);
    }

    public final J0 r0(String str) {
        I.g(str);
        o();
        p();
        return J0.e(100, T("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}));
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String s() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.k0()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch:{ SQLiteException -> 0x0024, all -> 0x0022 }
            boolean r2 = r0.moveToFirst()     // Catch:{ SQLiteException -> 0x001c }
            if (r2 == 0) goto L_0x0037
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch:{ SQLiteException -> 0x001c }
            r0.close()
            return r1
        L_0x001a:
            r1 = move-exception
            goto L_0x001e
        L_0x001c:
            r2 = move-exception
            goto L_0x0027
        L_0x001e:
            r5 = r1
            r1 = r0
            r0 = r5
            goto L_0x003d
        L_0x0022:
            r0 = move-exception
            goto L_0x003d
        L_0x0024:
            r0 = move-exception
            r2 = r0
            r0 = r1
        L_0x0027:
            java.lang.Object r3 = r6.f398a     // Catch:{ all -> 0x001a }
            T1.u0 r3 = (T1.C0212u0) r3     // Catch:{ all -> 0x001a }
            T1.Z r3 = r3.f3496r     // Catch:{ all -> 0x001a }
            T1.C0212u0.k(r3)     // Catch:{ all -> 0x001a }
            T1.X r3 = r3.f3172f     // Catch:{ all -> 0x001a }
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.b(r2, r4)     // Catch:{ all -> 0x001a }
        L_0x0037:
            if (r0 == 0) goto L_0x003c
            r0.close()
        L_0x003c:
            return r1
        L_0x003d:
            if (r1 == 0) goto L_0x0042
            r1.close()
        L_0x0042:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.C0191n.s():java.lang.String");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: T1.J0} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0059, code lost:
        if (r5 != null) goto L_0x002e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0064  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T1.J0 s0(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f398a
            T1.u0 r0 = (T1.C0212u0) r0
            com.google.android.gms.common.internal.I.g(r5)
            r4.o()
            r4.p()
            java.lang.String[] r5 = new java.lang.String[]{r5}
            java.lang.String r1 = "select consent_state, consent_source from consent_settings where app_id=? limit 1;"
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r4.k0()     // Catch:{ SQLiteException -> 0x004a, all -> 0x0047 }
            android.database.Cursor r5 = r3.rawQuery(r1, r5)     // Catch:{ SQLiteException -> 0x004a, all -> 0x0047 }
            boolean r1 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x0034 }
            if (r1 != 0) goto L_0x0036
            T1.Z r1 = r0.f3496r     // Catch:{ SQLiteException -> 0x0034 }
            T1.C0212u0.k(r1)     // Catch:{ SQLiteException -> 0x0034 }
            T1.X r1 = r1.f3180w     // Catch:{ SQLiteException -> 0x0034 }
            java.lang.String r3 = "No data found"
            r1.a(r3)     // Catch:{ SQLiteException -> 0x0034 }
        L_0x002e:
            r5.close()
            goto L_0x005c
        L_0x0032:
            r0 = move-exception
            goto L_0x0045
        L_0x0034:
            r1 = move-exception
            goto L_0x004d
        L_0x0036:
            r1 = 0
            java.lang.String r1 = r5.getString(r1)     // Catch:{ SQLiteException -> 0x0034 }
            r3 = 1
            int r3 = r5.getInt(r3)     // Catch:{ SQLiteException -> 0x0034 }
            T1.J0 r2 = T1.J0.e(r3, r1)     // Catch:{ SQLiteException -> 0x0034 }
            goto L_0x002e
        L_0x0045:
            r2 = r5
            goto L_0x0062
        L_0x0047:
            r5 = move-exception
            r0 = r5
            goto L_0x0062
        L_0x004a:
            r5 = move-exception
            r1 = r5
            r5 = r2
        L_0x004d:
            T1.Z r0 = r0.f3496r     // Catch:{ all -> 0x0032 }
            T1.C0212u0.k(r0)     // Catch:{ all -> 0x0032 }
            T1.X r0 = r0.f3172f     // Catch:{ all -> 0x0032 }
            java.lang.String r3 = "Error querying database."
            r0.b(r1, r3)     // Catch:{ all -> 0x0032 }
            if (r5 == 0) goto L_0x005c
            goto L_0x002e
        L_0x005c:
            if (r2 != 0) goto L_0x0061
            T1.J0 r5 = T1.J0.f2969c
            return r5
        L_0x0061:
            return r2
        L_0x0062:
            if (r2 == 0) goto L_0x0067
            r2.close()
        L_0x0067:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.C0191n.s0(java.lang.String):T1.J0");
    }

    public final List t(String str, String str2, String str3) {
        I.d(str);
        o();
        p();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return u(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0124  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T1.U1 t0(java.lang.String r28) {
        /*
            r27 = this;
            r14 = r27
            r15 = r28
            java.lang.String r0 = "app_id=? AND NOT "
            com.google.android.gms.common.internal.I.d(r28)
            r27.o()
            r27.p()
            java.lang.Object r1 = r14.f398a
            r12 = r1
            T1.u0 r12 = (T1.C0212u0) r12
            T1.g r1 = r12.f3494p
            T1.G r2 = T1.H.f2867M0
            r13 = 0
            boolean r1 = r1.B(r13, r2)
            if (r1 == 0) goto L_0x0128
            T1.G r1 = T1.H.f2872P0
            T1.g r2 = r12.f3494p
            boolean r1 = r2.B(r13, r1)
            r2 = 0
            if (r1 == 0) goto L_0x0058
            T1.i1 r0 = T1.C0178i1.GOOGLE_SIGNAL
            T1.i1[] r0 = new T1.C0178i1[]{r0}
            java.util.ArrayList r1 = new java.util.ArrayList
            r3 = 1
            r1.<init>(r3)
            r0 = r0[r2]
            int r0 = r0.f3347a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.add(r0)
            T1.M1 r0 = new T1.M1
            r0.<init>(r1)
            java.util.List r0 = r14.v(r15, r0, r3)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x0051
            return r13
        L_0x0051:
            java.lang.Object r0 = r0.get(r2)
            T1.U1 r0 = (T1.U1) r0
            return r0
        L_0x0058:
            android.database.sqlite.SQLiteDatabase r3 = r27.k0()     // Catch:{ SQLiteException -> 0x0100, all -> 0x00fc }
            java.lang.String r4 = "upload_queue"
            java.lang.String r16 = "rowId"
            java.lang.String r17 = "app_id"
            java.lang.String r18 = "measurement_batch"
            java.lang.String r19 = "upload_uri"
            java.lang.String r20 = "upload_headers"
            java.lang.String r21 = "upload_type"
            java.lang.String r22 = "retry_count"
            java.lang.String r23 = "creation_timestamp"
            java.lang.String r24 = "associated_row_id"
            java.lang.String r25 = "last_upload_timestamp"
            java.lang.String[] r5 = new java.lang.String[]{r16, r17, r18, r19, r20, r21, r22, r23, r24, r25}     // Catch:{ SQLiteException -> 0x0100, all -> 0x00fc }
            java.lang.String r1 = r27.S()     // Catch:{ SQLiteException -> 0x0100, all -> 0x00fc }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0100, all -> 0x00fc }
            r6.<init>(r0)     // Catch:{ SQLiteException -> 0x0100, all -> 0x00fc }
            r6.append(r1)     // Catch:{ SQLiteException -> 0x0100, all -> 0x00fc }
            java.lang.String r6 = r6.toString()     // Catch:{ SQLiteException -> 0x0100, all -> 0x00fc }
            java.lang.String[] r7 = new java.lang.String[]{r28}     // Catch:{ SQLiteException -> 0x0100, all -> 0x00fc }
            java.lang.String r10 = "creation_timestamp ASC"
            java.lang.String r11 = "1"
            r8 = 0
            r9 = 0
            android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ SQLiteException -> 0x0100, all -> 0x00fc }
            boolean r0 = r10.moveToFirst()     // Catch:{ SQLiteException -> 0x00ec, all -> 0x00e8 }
            if (r0 != 0) goto L_0x009e
            r16 = r13
            goto L_0x011b
        L_0x009e:
            long r3 = r10.getLong(r2)     // Catch:{ SQLiteException -> 0x00ec, all -> 0x00e8 }
            r0 = 2
            byte[] r5 = r10.getBlob(r0)     // Catch:{ SQLiteException -> 0x00ec, all -> 0x00e8 }
            r0 = 3
            java.lang.String r6 = r10.getString(r0)     // Catch:{ SQLiteException -> 0x00ec, all -> 0x00e8 }
            r0 = 4
            java.lang.String r7 = r10.getString(r0)     // Catch:{ SQLiteException -> 0x00ec, all -> 0x00e8 }
            r0 = 5
            int r8 = r10.getInt(r0)     // Catch:{ SQLiteException -> 0x00ec, all -> 0x00e8 }
            r0 = 6
            int r9 = r10.getInt(r0)     // Catch:{ SQLiteException -> 0x00ec, all -> 0x00e8 }
            r0 = 7
            long r16 = r10.getLong(r0)     // Catch:{ SQLiteException -> 0x00ec, all -> 0x00e8 }
            r0 = 8
            long r18 = r10.getLong(r0)     // Catch:{ SQLiteException -> 0x00ec, all -> 0x00e8 }
            r0 = 9
            long r20 = r10.getLong(r0)     // Catch:{ SQLiteException -> 0x00ec, all -> 0x00e8 }
            r1 = r27
            r2 = r28
            r22 = r10
            r10 = r16
            r26 = r12
            r16 = r13
            r12 = r18
            r14 = r20
            T1.U1 r0 = r1.R(r2, r3, r5, r6, r7, r8, r9, r10, r12, r14)     // Catch:{ SQLiteException -> 0x00e6, all -> 0x00e4 }
            r22.close()
            return r0
        L_0x00e4:
            r0 = move-exception
            goto L_0x00f4
        L_0x00e6:
            r0 = move-exception
            goto L_0x00f7
        L_0x00e8:
            r0 = move-exception
            r22 = r10
            goto L_0x00f4
        L_0x00ec:
            r0 = move-exception
            r22 = r10
            r26 = r12
            r16 = r13
            goto L_0x00f7
        L_0x00f4:
            r13 = r22
            goto L_0x0122
        L_0x00f7:
            r13 = r22
        L_0x00f9:
            r1 = r26
            goto L_0x010c
        L_0x00fc:
            r0 = move-exception
            r16 = r13
            goto L_0x0106
        L_0x0100:
            r0 = move-exception
            r26 = r12
            r16 = r13
            goto L_0x0109
        L_0x0106:
            r13 = r16
            goto L_0x0122
        L_0x0109:
            r13 = r16
            goto L_0x00f9
        L_0x010c:
            T1.Z r1 = r1.f3496r     // Catch:{ all -> 0x0121 }
            T1.C0212u0.k(r1)     // Catch:{ all -> 0x0121 }
            T1.X r1 = r1.f3172f     // Catch:{ all -> 0x0121 }
            java.lang.String r2 = "Error to querying MeasurementBatch from upload_queue. appId"
            r3 = r28
            r1.c(r2, r3, r0)     // Catch:{ all -> 0x0121 }
            r10 = r13
        L_0x011b:
            if (r10 == 0) goto L_0x0120
            r10.close()
        L_0x0120:
            return r16
        L_0x0121:
            r0 = move-exception
        L_0x0122:
            if (r13 == 0) goto L_0x0127
            r13.close()
        L_0x0127:
            throw r0
        L_0x0128:
            r16 = r13
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.C0191n.t0(java.lang.String):T1.U1");
    }

    public final List u(String str, String[] strArr) {
        List list;
        boolean z3;
        C0212u0 u0Var = (C0212u0) this.f398a;
        o();
        p();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            u0Var.getClass();
            cursor = k0().query("conditional_properties", new String[]{"app_id", "origin", "name", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, str, strArr, (String) null, (String) null, "rowid", "1001");
            list = arrayList;
            if (cursor.moveToFirst()) {
                while (true) {
                    if (arrayList.size() < 1000) {
                        String string = cursor.getString(0);
                        String string2 = cursor.getString(1);
                        String string3 = cursor.getString(2);
                        Object v02 = v0(cursor, 3);
                        if (cursor.getInt(4) != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        String string4 = cursor.getString(5);
                        long j6 = cursor.getLong(6);
                        C0162d0 d0Var = this.f2982b.f3065p;
                        T1.L(d0Var);
                        byte[] blob = cursor.getBlob(7);
                        Parcelable.Creator<C0214v> creator = C0214v.CREATOR;
                        long j7 = cursor.getLong(8);
                        T1.L(d0Var);
                        long j8 = cursor.getLong(10);
                        long j9 = cursor.getLong(11);
                        T1.L(d0Var);
                        arrayList.add(new C0164e(string, string2, new W1(j8, v02, string3, string2), j7, z3, string4, (C0214v) d0Var.Q(blob, creator), j6, (C0214v) d0Var.Q(cursor.getBlob(9), creator), j9, (C0214v) d0Var.Q(cursor.getBlob(12), creator)));
                        if (!cursor.moveToNext()) {
                            list = arrayList;
                            break;
                        }
                    } else {
                        Z z4 = u0Var.f3496r;
                        C0212u0.k(z4);
                        z4.f3172f.b(1000, "Read more than the max allowed conditional properties, ignoring extra");
                        list = arrayList;
                        break;
                    }
                }
            }
        } catch (SQLiteException e6) {
            Z z5 = u0Var.f3496r;
            C0212u0.k(z5);
            z5.f3172f.b(e6, "Error querying conditional user property value");
            list = Collections.emptyList();
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        if (cursor != null) {
            cursor.close();
        }
        return list;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0093  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T1.X1 u0(java.lang.String r12, java.lang.String r13) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.f398a
            T1.u0 r0 = (T1.C0212u0) r0
            com.google.android.gms.common.internal.I.d(r12)
            com.google.android.gms.common.internal.I.d(r13)
            r11.o()
            r11.p()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r11.k0()     // Catch:{ SQLiteException -> 0x0072, all -> 0x0070 }
            java.lang.String r3 = "user_attributes"
            java.lang.String r4 = "set_timestamp"
            java.lang.String r5 = "value"
            java.lang.String r6 = "origin"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5, r6}     // Catch:{ SQLiteException -> 0x0072, all -> 0x0070 }
            java.lang.String r5 = "app_id=? and name=?"
            java.lang.String[] r6 = new java.lang.String[]{r12, r13}     // Catch:{ SQLiteException -> 0x0072, all -> 0x0070 }
            r9 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SQLiteException -> 0x0072, all -> 0x0070 }
            boolean r3 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x0068 }
            if (r3 != 0) goto L_0x0035
            goto L_0x008b
        L_0x0035:
            r3 = 0
            long r8 = r2.getLong(r3)     // Catch:{ SQLiteException -> 0x0068 }
            r3 = 1
            java.lang.Object r10 = r11.v0(r2, r3)     // Catch:{ SQLiteException -> 0x0068 }
            if (r10 != 0) goto L_0x0042
            goto L_0x008b
        L_0x0042:
            r3 = 2
            java.lang.String r6 = r2.getString(r3)     // Catch:{ SQLiteException -> 0x0068 }
            T1.X1 r3 = new T1.X1     // Catch:{ SQLiteException -> 0x0068 }
            r4 = r3
            r5 = r12
            r7 = r13
            r4.<init>(r5, r6, r7, r8, r10)     // Catch:{ SQLiteException -> 0x0068 }
            boolean r4 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x0068 }
            if (r4 == 0) goto L_0x006a
            T1.Z r4 = r0.f3496r     // Catch:{ SQLiteException -> 0x0068 }
            T1.C0212u0.k(r4)     // Catch:{ SQLiteException -> 0x0068 }
            T1.X r4 = r4.f3172f     // Catch:{ SQLiteException -> 0x0068 }
            java.lang.String r5 = "Got multiple records for user property, expected one. appId"
            T1.Y r6 = T1.Z.w(r12)     // Catch:{ SQLiteException -> 0x0068 }
            r4.b(r6, r5)     // Catch:{ SQLiteException -> 0x0068 }
            goto L_0x006a
        L_0x0066:
            r12 = move-exception
            goto L_0x006e
        L_0x0068:
            r3 = move-exception
            goto L_0x0075
        L_0x006a:
            r2.close()
            return r3
        L_0x006e:
            r1 = r2
            goto L_0x0091
        L_0x0070:
            r12 = move-exception
            goto L_0x0091
        L_0x0072:
            r2 = move-exception
            r3 = r2
            r2 = r1
        L_0x0075:
            T1.Z r4 = r0.f3496r     // Catch:{ all -> 0x0066 }
            T1.C0212u0.k(r4)     // Catch:{ all -> 0x0066 }
            T1.X r4 = r4.f3172f     // Catch:{ all -> 0x0066 }
            java.lang.String r5 = "Error querying user property. appId"
            T1.Y r12 = T1.Z.w(r12)     // Catch:{ all -> 0x0066 }
            T1.S r0 = r0.f3500v     // Catch:{ all -> 0x0066 }
            java.lang.String r13 = r0.f(r13)     // Catch:{ all -> 0x0066 }
            r4.d(r5, r12, r13, r3)     // Catch:{ all -> 0x0066 }
        L_0x008b:
            if (r2 == 0) goto L_0x0090
            r2.close()
        L_0x0090:
            return r1
        L_0x0091:
            if (r1 == 0) goto L_0x0096
            r1.close()
        L_0x0096:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.C0191n.u0(java.lang.String, java.lang.String):T1.X1");
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0106  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List v(java.lang.String r28, T1.M1 r29, int r30) {
        /*
            r27 = this;
            java.lang.String r0 = "app_id=?"
            r14 = r27
            java.lang.Object r1 = r14.f398a
            r15 = r1
            T1.u0 r15 = (T1.C0212u0) r15
            T1.g r1 = r15.f3494p
            T1.G r2 = T1.H.f2872P0
            r3 = 0
            boolean r1 = r1.B(r3, r2)
            if (r1 != 0) goto L_0x0019
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
        L_0x0019:
            com.google.android.gms.common.internal.I.d(r28)
            r27.o()
            r27.p()
            android.database.sqlite.SQLiteDatabase r4 = r27.k0()     // Catch:{ SQLiteException -> 0x006e }
            java.lang.String r5 = "upload_queue"
            java.lang.String r16 = "rowId"
            java.lang.String r17 = "app_id"
            java.lang.String r18 = "measurement_batch"
            java.lang.String r19 = "upload_uri"
            java.lang.String r20 = "upload_headers"
            java.lang.String r21 = "upload_type"
            java.lang.String r22 = "retry_count"
            java.lang.String r23 = "creation_timestamp"
            java.lang.String r24 = "associated_row_id"
            java.lang.String r25 = "last_upload_timestamp"
            java.lang.String[] r6 = new java.lang.String[]{r16, r17, r18, r19, r20, r21, r22, r23, r24, r25}     // Catch:{ SQLiteException -> 0x006e }
            r1 = r29
            java.util.ArrayList r1 = r1.f2989a     // Catch:{ SQLiteException -> 0x006e }
            java.lang.String r1 = X(r1)     // Catch:{ SQLiteException -> 0x006e }
            java.lang.String r2 = r27.S()     // Catch:{ SQLiteException -> 0x006e }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x006e }
            r7.<init>(r0)     // Catch:{ SQLiteException -> 0x006e }
            r7.append(r1)     // Catch:{ SQLiteException -> 0x006e }
            java.lang.String r0 = " AND NOT "
            r7.append(r0)     // Catch:{ SQLiteException -> 0x006e }
            r7.append(r2)     // Catch:{ SQLiteException -> 0x006e }
            java.lang.String r7 = r7.toString()     // Catch:{ SQLiteException -> 0x006e }
            java.lang.String[] r8 = new java.lang.String[]{r28}     // Catch:{ SQLiteException -> 0x006e }
            java.lang.String r11 = "creation_timestamp ASC"
            if (r30 <= 0) goto L_0x0073
            java.lang.String r0 = java.lang.String.valueOf(r30)     // Catch:{ SQLiteException -> 0x006e }
            r12 = r0
            goto L_0x0074
        L_0x006e:
            r0 = move-exception
            r26 = r15
            goto L_0x00e6
        L_0x0073:
            r12 = r3
        L_0x0074:
            r9 = 0
            r10 = 0
            android.database.Cursor r12 = r4.query(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ SQLiteException -> 0x006e }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x00d8, all -> 0x00d4 }
            r0.<init>()     // Catch:{ SQLiteException -> 0x00d8, all -> 0x00d4 }
        L_0x007f:
            boolean r1 = r12.moveToNext()     // Catch:{ SQLiteException -> 0x00d8, all -> 0x00d4 }
            if (r1 == 0) goto L_0x00de
            r1 = 0
            long r3 = r12.getLong(r1)     // Catch:{ SQLiteException -> 0x00d8, all -> 0x00d4 }
            r1 = 2
            byte[] r5 = r12.getBlob(r1)     // Catch:{ SQLiteException -> 0x00d8, all -> 0x00d4 }
            r1 = 3
            java.lang.String r6 = r12.getString(r1)     // Catch:{ SQLiteException -> 0x00d8, all -> 0x00d4 }
            r1 = 4
            java.lang.String r7 = r12.getString(r1)     // Catch:{ SQLiteException -> 0x00d8, all -> 0x00d4 }
            r1 = 5
            int r8 = r12.getInt(r1)     // Catch:{ SQLiteException -> 0x00d8, all -> 0x00d4 }
            r1 = 6
            int r9 = r12.getInt(r1)     // Catch:{ SQLiteException -> 0x00d8, all -> 0x00d4 }
            r1 = 7
            long r10 = r12.getLong(r1)     // Catch:{ SQLiteException -> 0x00d8, all -> 0x00d4 }
            r1 = 8
            long r16 = r12.getLong(r1)     // Catch:{ SQLiteException -> 0x00d8, all -> 0x00d4 }
            r1 = 9
            long r18 = r12.getLong(r1)     // Catch:{ SQLiteException -> 0x00d8, all -> 0x00d4 }
            r1 = r27
            r2 = r28
            r20 = r12
            r12 = r16
            r26 = r15
            r14 = r18
            T1.U1 r1 = r1.R(r2, r3, r5, r6, r7, r8, r9, r10, r12, r14)     // Catch:{ SQLiteException -> 0x00d2, all -> 0x00d0 }
            if (r1 == 0) goto L_0x00c9
            r0.add(r1)     // Catch:{ SQLiteException -> 0x00d2, all -> 0x00d0 }
        L_0x00c9:
            r14 = r27
            r12 = r20
            r15 = r26
            goto L_0x007f
        L_0x00d0:
            r0 = move-exception
            goto L_0x00e1
        L_0x00d2:
            r0 = move-exception
            goto L_0x00e4
        L_0x00d4:
            r0 = move-exception
            r20 = r12
            goto L_0x00e1
        L_0x00d8:
            r0 = move-exception
            r20 = r12
            r26 = r15
            goto L_0x00e4
        L_0x00de:
            r20 = r12
            goto L_0x00fe
        L_0x00e1:
            r3 = r20
            goto L_0x0104
        L_0x00e4:
            r3 = r20
        L_0x00e6:
            r1 = r26
            goto L_0x00eb
        L_0x00e9:
            r0 = move-exception
            goto L_0x0104
        L_0x00eb:
            T1.Z r1 = r1.f3496r     // Catch:{ all -> 0x00e9 }
            T1.C0212u0.k(r1)     // Catch:{ all -> 0x00e9 }
            T1.X r1 = r1.f3172f     // Catch:{ all -> 0x00e9 }
            java.lang.String r2 = "Error to querying MeasurementBatch from upload_queue. appId"
            r4 = r28
            r1.c(r2, r4, r0)     // Catch:{ all -> 0x00e9 }
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x00e9 }
            r12 = r3
        L_0x00fe:
            if (r12 == 0) goto L_0x0103
            r12.close()
        L_0x0103:
            return r0
        L_0x0104:
            if (r3 == 0) goto L_0x0109
            r3.close()
        L_0x0109:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.C0191n.v(java.lang.String, T1.M1, int):java.util.List");
    }

    public final Object v0(Cursor cursor, int i2) {
        int type = cursor.getType(i2);
        C0212u0 u0Var = (C0212u0) this.f398a;
        if (type == 0) {
            Z z3 = u0Var.f3496r;
            C0212u0.k(z3);
            z3.f3172f.a("Loaded invalid null value from database");
            return null;
        } else if (type == 1) {
            return Long.valueOf(cursor.getLong(i2));
        } else {
            if (type == 2) {
                return Double.valueOf(cursor.getDouble(i2));
            }
            if (type == 3) {
                return cursor.getString(i2);
            }
            if (type != 4) {
                Z z4 = u0Var.f3496r;
                C0212u0.k(z4);
                z4.f3172f.b(Integer.valueOf(type), "Loaded invalid unknown value type, ignoring it");
                return null;
            }
            Z z5 = u0Var.f3496r;
            C0212u0.k(z5);
            z5.f3172f.a("Loaded invalid blob type value, ignoring it");
            return null;
        }
    }

    public final List w(String str) {
        List list;
        C0212u0 u0Var = (C0212u0) this.f398a;
        I.d(str);
        o();
        p();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            u0Var.getClass();
            cursor = k0().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, (String) null, (String) null, "rowid", "1000");
            list = arrayList;
            if (cursor.moveToFirst()) {
                do {
                    String string = cursor.getString(0);
                    String string2 = cursor.getString(1);
                    if (string2 == null) {
                        string2 = "";
                    }
                    String str2 = string2;
                    long j6 = cursor.getLong(2);
                    Object v02 = v0(cursor, 3);
                    if (v02 == null) {
                        Z z3 = u0Var.f3496r;
                        C0212u0.k(z3);
                        z3.f3172f.b(Z.w(str), "Read invalid user property value, ignoring it. appId");
                    } else {
                        arrayList.add(new X1(str, str2, string, j6, v02));
                    }
                } while (cursor.moveToNext());
                list = arrayList;
            }
        } catch (SQLiteException e6) {
            Z z4 = u0Var.f3496r;
            C0212u0.k(z4);
            z4.f3172f.c("Error querying user properties. appId", Z.w(str), e6);
            list = Collections.emptyList();
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        if (cursor != null) {
            cursor.close();
        }
        return list;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        T1.C0212u0.k(r7);
        r7.f3172f.b(1000, "Read more than the max allowed user properties, ignoring excess");
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00fa, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00fb, code lost:
        r15 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00fe, code lost:
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x011f, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003b, code lost:
        r0 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x003b A[Catch:{ SQLiteException -> 0x003e, all -> 0x003b }, ExcHandler: all (th java.lang.Throwable), Splitter:B:1:0x0018] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List x(java.lang.String r18, java.lang.String r19, java.lang.String r20) {
        /*
            r17 = this;
            r1 = r17
            r0 = r20
            java.lang.Object r2 = r1.f398a
            T1.u0 r2 = (T1.C0212u0) r2
            com.google.android.gms.common.internal.I.d(r18)
            r17.o()
            r17.p()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.String r12 = "1001"
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x00fa, all -> 0x003b }
            r14 = 3
            r4.<init>(r14)     // Catch:{ SQLiteException -> 0x00fa, all -> 0x003b }
            r15 = r18
            r4.add(r15)     // Catch:{ SQLiteException -> 0x003e, all -> 0x003b }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x003e, all -> 0x003b }
            java.lang.String r6 = "app_id=?"
            r5.<init>(r6)     // Catch:{ SQLiteException -> 0x003e, all -> 0x003b }
            boolean r6 = android.text.TextUtils.isEmpty(r19)     // Catch:{ SQLiteException -> 0x003e, all -> 0x003b }
            if (r6 != 0) goto L_0x0041
            r11 = r19
            r4.add(r11)     // Catch:{ SQLiteException -> 0x003e, all -> 0x003b }
            java.lang.String r6 = " and origin=?"
            r5.append(r6)     // Catch:{ SQLiteException -> 0x003e, all -> 0x003b }
            goto L_0x0043
        L_0x003b:
            r0 = move-exception
            goto L_0x00fe
        L_0x003e:
            r0 = move-exception
            goto L_0x0100
        L_0x0041:
            r11 = r19
        L_0x0043:
            boolean r6 = android.text.TextUtils.isEmpty(r20)     // Catch:{ SQLiteException -> 0x003e, all -> 0x003b }
            if (r6 != 0) goto L_0x0062
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x003e, all -> 0x003b }
            r6.<init>()     // Catch:{ SQLiteException -> 0x003e, all -> 0x003b }
            r6.append(r0)     // Catch:{ SQLiteException -> 0x003e, all -> 0x003b }
            java.lang.String r7 = "*"
            r6.append(r7)     // Catch:{ SQLiteException -> 0x003e, all -> 0x003b }
            java.lang.String r6 = r6.toString()     // Catch:{ SQLiteException -> 0x003e, all -> 0x003b }
            r4.add(r6)     // Catch:{ SQLiteException -> 0x003e, all -> 0x003b }
            java.lang.String r6 = " and name glob ?"
            r5.append(r6)     // Catch:{ SQLiteException -> 0x003e, all -> 0x003b }
        L_0x0062:
            int r6 = r4.size()     // Catch:{ SQLiteException -> 0x003e, all -> 0x003b }
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x003e, all -> 0x003b }
            java.lang.Object[] r4 = r4.toArray(r6)     // Catch:{ SQLiteException -> 0x003e, all -> 0x003b }
            r8 = r4
            java.lang.String[] r8 = (java.lang.String[]) r8     // Catch:{ SQLiteException -> 0x003e, all -> 0x003b }
            android.database.sqlite.SQLiteDatabase r4 = r17.k0()     // Catch:{ SQLiteException -> 0x003e, all -> 0x003b }
            java.lang.String r6 = "user_attributes"
            java.lang.String r7 = "name"
            java.lang.String r9 = "set_timestamp"
            java.lang.String r10 = "value"
            java.lang.String r13 = "origin"
            java.lang.String[] r7 = new java.lang.String[]{r7, r9, r10, r13}     // Catch:{ SQLiteException -> 0x003e, all -> 0x003b }
            java.lang.String r9 = r5.toString()     // Catch:{ SQLiteException -> 0x003e, all -> 0x003b }
            java.lang.String r13 = "rowid"
            r2.getClass()     // Catch:{ SQLiteException -> 0x003e, all -> 0x003b }
            r10 = 0
            r16 = 0
            r5 = r6
            r6 = r7
            r7 = r9
            r9 = r10
            r10 = r16
            r11 = r13
            android.database.Cursor r13 = r4.query(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ SQLiteException -> 0x003e, all -> 0x003b }
            boolean r4 = r13.moveToFirst()     // Catch:{ SQLiteException -> 0x00f6 }
            if (r4 != 0) goto L_0x00a0
            goto L_0x0117
        L_0x00a0:
            r4 = r19
        L_0x00a2:
            int r5 = r3.size()     // Catch:{ SQLiteException -> 0x00bd }
            r6 = 1000(0x3e8, float:1.401E-42)
            T1.Z r7 = r2.f3496r
            if (r5 < r6) goto L_0x00bf
            T1.C0212u0.k(r7)     // Catch:{ SQLiteException -> 0x00bd }
            T1.X r0 = r7.f3172f     // Catch:{ SQLiteException -> 0x00bd }
            java.lang.String r5 = "Read more than the max allowed user properties, ignoring excess"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ SQLiteException -> 0x00bd }
            r0.b(r6, r5)     // Catch:{ SQLiteException -> 0x00bd }
            goto L_0x0117
        L_0x00bb:
            r0 = move-exception
            goto L_0x011d
        L_0x00bd:
            r0 = move-exception
            goto L_0x0103
        L_0x00bf:
            r5 = 0
            java.lang.String r8 = r13.getString(r5)     // Catch:{ SQLiteException -> 0x00bd }
            r5 = 1
            long r9 = r13.getLong(r5)     // Catch:{ SQLiteException -> 0x00bd }
            r5 = 2
            java.lang.Object r11 = r1.v0(r13, r5)     // Catch:{ SQLiteException -> 0x00bd }
            java.lang.String r4 = r13.getString(r14)     // Catch:{ SQLiteException -> 0x00bd }
            if (r11 != 0) goto L_0x00e3
            T1.C0212u0.k(r7)     // Catch:{ SQLiteException -> 0x00bd }
            T1.X r5 = r7.f3172f     // Catch:{ SQLiteException -> 0x00bd }
            java.lang.String r6 = "(2)Read invalid user property value, ignoring it"
            T1.Y r7 = T1.Z.w(r18)     // Catch:{ SQLiteException -> 0x00bd }
            r5.d(r6, r7, r4, r0)     // Catch:{ SQLiteException -> 0x00bd }
            goto L_0x00ef
        L_0x00e3:
            T1.X1 r12 = new T1.X1     // Catch:{ SQLiteException -> 0x00bd }
            r5 = r12
            r6 = r18
            r7 = r4
            r5.<init>(r6, r7, r8, r9, r11)     // Catch:{ SQLiteException -> 0x00bd }
            r3.add(r12)     // Catch:{ SQLiteException -> 0x00bd }
        L_0x00ef:
            boolean r5 = r13.moveToNext()     // Catch:{ SQLiteException -> 0x00bd }
            if (r5 != 0) goto L_0x00a2
            goto L_0x0117
        L_0x00f6:
            r0 = move-exception
            r4 = r19
            goto L_0x0103
        L_0x00fa:
            r0 = move-exception
            r15 = r18
            goto L_0x0100
        L_0x00fe:
            r13 = 0
            goto L_0x011d
        L_0x0100:
            r4 = r19
            r13 = 0
        L_0x0103:
            T1.Z r2 = r2.f3496r     // Catch:{ all -> 0x00bb }
            T1.C0212u0.k(r2)     // Catch:{ all -> 0x00bb }
            T1.X r2 = r2.f3172f     // Catch:{ all -> 0x00bb }
            java.lang.String r3 = "(2)Error querying user properties"
            T1.Y r5 = T1.Z.w(r18)     // Catch:{ all -> 0x00bb }
            r2.d(r3, r5, r4, r0)     // Catch:{ all -> 0x00bb }
            java.util.List r3 = java.util.Collections.emptyList()     // Catch:{ all -> 0x00bb }
        L_0x0117:
            if (r13 == 0) goto L_0x011c
            r13.close()
        L_0x011c:
            return r3
        L_0x011d:
            if (r13 == 0) goto L_0x0122
            r13.close()
        L_0x0122:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.C0191n.x(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v5, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v7, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v11, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: com.google.android.gms.internal.measurement.zzhx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v12, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: com.google.android.gms.internal.measurement.zzhx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: com.google.android.gms.internal.measurement.zzhx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: com.google.android.gms.internal.measurement.zzhx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: java.lang.Object} */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f0, code lost:
        if (r2 != null) goto L_0x00c5;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x011c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void y(java.lang.String r27, java.lang.Long r28, java.lang.String r29, android.os.Bundle r30) {
        /*
            r26 = this;
            r1 = r26
            r12 = r27
            com.google.android.gms.common.internal.I.g(r30)
            r26.o()
            r26.p()
            java.lang.Object r0 = r1.f398a
            r13 = r0
            T1.u0 r13 = (T1.C0212u0) r13
            T1.g r0 = r13.f3494p
            T1.G r2 = T1.H.f2905e1
            r14 = 0
            boolean r0 = r0.B(r14, r2)
            if (r0 == 0) goto L_0x002a
            if (r28 == 0) goto L_0x002a
            T1.l r0 = new T1.l
            long r2 = r28.longValue()
            r0.<init>((T1.C0191n) r1, (java.lang.String) r12, (long) r2)
        L_0x0028:
            r15 = r0
            goto L_0x0030
        L_0x002a:
            T1.l r0 = new T1.l
            r0.<init>(r1, r12)
            goto L_0x0028
        L_0x0030:
            java.util.List r0 = r15.a()
        L_0x0034:
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L_0x02a8
            java.util.Iterator r16 = r0.iterator()
        L_0x003e:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x029b
            java.lang.Object r0 = r16.next()
            r11 = r0
            T1.k r11 = (T1.C0182k) r11
            boolean r0 = android.text.TextUtils.isEmpty(r29)
            T1.Z r9 = r13.f3496r
            if (r0 != 0) goto L_0x0117
            long r2 = r11.f3361b
            android.database.sqlite.SQLiteDatabase r17 = r26.k0()     // Catch:{ SQLiteException -> 0x00df, all -> 0x00dd }
            java.lang.String r18 = "raw_events_metadata"
            java.lang.String r0 = "metadata"
            java.lang.String[] r19 = new java.lang.String[]{r0}     // Catch:{ SQLiteException -> 0x00df, all -> 0x00dd }
            java.lang.String r20 = "app_id = ? and metadata_fingerprint = ?"
            java.lang.String r0 = java.lang.Long.toString(r2)     // Catch:{ SQLiteException -> 0x00df, all -> 0x00dd }
            java.lang.String[] r21 = new java.lang.String[]{r12, r0}     // Catch:{ SQLiteException -> 0x00df, all -> 0x00dd }
            java.lang.String r24 = "rowid"
            java.lang.String r25 = "2"
            r22 = 0
            r23 = 0
            android.database.Cursor r2 = r17.query(r18, r19, r20, r21, r22, r23, r24, r25)     // Catch:{ SQLiteException -> 0x00df, all -> 0x00dd }
            boolean r0 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x0093 }
            if (r0 != 0) goto L_0x0095
            T1.C0212u0.k(r9)     // Catch:{ SQLiteException -> 0x0093 }
            T1.X r0 = r9.f3172f     // Catch:{ SQLiteException -> 0x0093 }
            java.lang.String r3 = "Raw event metadata record is missing. appId"
            T1.Y r4 = T1.Z.w(r27)     // Catch:{ SQLiteException -> 0x0093 }
            r0.b(r4, r3)     // Catch:{ SQLiteException -> 0x0093 }
        L_0x008b:
            r2.close()
            r3 = r14
            goto L_0x00f3
        L_0x0091:
            r0 = move-exception
            goto L_0x00d9
        L_0x0093:
            r0 = move-exception
            goto L_0x00db
        L_0x0095:
            r0 = 0
            byte[] r0 = r2.getBlob(r0)     // Catch:{ SQLiteException -> 0x0093 }
            com.google.android.gms.internal.measurement.zzhw r3 = com.google.android.gms.internal.measurement.zzhx.zzz()     // Catch:{ IOException -> 0x00c9 }
            com.google.android.gms.internal.measurement.zzng r0 = T1.C0162d0.U(r3, r0)     // Catch:{ IOException -> 0x00c9 }
            com.google.android.gms.internal.measurement.zzhw r0 = (com.google.android.gms.internal.measurement.zzhw) r0     // Catch:{ IOException -> 0x00c9 }
            com.google.android.gms.internal.measurement.zzmd r0 = r0.zzba()     // Catch:{ IOException -> 0x00c9 }
            r3 = r0
            com.google.android.gms.internal.measurement.zzhx r3 = (com.google.android.gms.internal.measurement.zzhx) r3     // Catch:{ IOException -> 0x00c9 }
            boolean r0 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x00c0 }
            if (r0 == 0) goto L_0x00c2
            T1.C0212u0.k(r9)     // Catch:{ SQLiteException -> 0x00c0 }
            T1.X r0 = r9.f3175r     // Catch:{ SQLiteException -> 0x00c0 }
            java.lang.String r4 = "Get multiple raw event metadata records, expected one. appId"
            T1.Y r5 = T1.Z.w(r27)     // Catch:{ SQLiteException -> 0x00c0 }
            r0.b(r5, r4)     // Catch:{ SQLiteException -> 0x00c0 }
            goto L_0x00c2
        L_0x00c0:
            r0 = move-exception
            goto L_0x00e2
        L_0x00c2:
            r2.close()     // Catch:{ SQLiteException -> 0x00c0 }
        L_0x00c5:
            r2.close()
            goto L_0x00f3
        L_0x00c9:
            r0 = move-exception
            T1.C0212u0.k(r9)     // Catch:{ SQLiteException -> 0x0093 }
            T1.X r3 = r9.f3172f     // Catch:{ SQLiteException -> 0x0093 }
            java.lang.String r4 = "Data loss. Failed to merge raw event metadata. appId"
            T1.Y r5 = T1.Z.w(r27)     // Catch:{ SQLiteException -> 0x0093 }
            r3.c(r4, r5, r0)     // Catch:{ SQLiteException -> 0x0093 }
            goto L_0x008b
        L_0x00d9:
            r14 = r2
            goto L_0x011a
        L_0x00db:
            r3 = r14
            goto L_0x00e2
        L_0x00dd:
            r0 = move-exception
            goto L_0x011a
        L_0x00df:
            r0 = move-exception
            r2 = r14
            r3 = r2
        L_0x00e2:
            T1.C0212u0.k(r9)     // Catch:{ all -> 0x0091 }
            T1.X r4 = r9.f3172f     // Catch:{ all -> 0x0091 }
            java.lang.String r5 = "Data loss. Error selecting raw event. appId"
            T1.Y r6 = T1.Z.w(r27)     // Catch:{ all -> 0x0091 }
            r4.c(r5, r6, r0)     // Catch:{ all -> 0x0091 }
            if (r2 == 0) goto L_0x00f3
            goto L_0x00c5
        L_0x00f3:
            if (r3 == 0) goto L_0x0117
            java.util.List r0 = r3.zzY()
            java.util.Iterator r0 = r0.iterator()
        L_0x00fd:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0117
            java.lang.Object r2 = r0.next()
            com.google.android.gms.internal.measurement.zzio r2 = (com.google.android.gms.internal.measurement.zzio) r2
            java.lang.String r2 = r2.zzg()
            r10 = r29
            boolean r2 = r2.equals(r10)
            if (r2 == 0) goto L_0x00fd
            goto L_0x003e
        L_0x0117:
            r10 = r29
            goto L_0x0120
        L_0x011a:
            if (r14 == 0) goto L_0x011f
            r14.close()
        L_0x011f:
            throw r0
        L_0x0120:
            T1.T1 r0 = r1.f2982b
            T1.d0 r2 = r0.f3065p
            T1.T1.L(r2)
            com.google.android.gms.internal.measurement.zzhm r3 = r11.d
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
            java.util.List r4 = r3.zzi()
            java.util.Iterator r4 = r4.iterator()
        L_0x0136:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01bc
            java.lang.Object r5 = r4.next()
            com.google.android.gms.internal.measurement.zzhq r5 = (com.google.android.gms.internal.measurement.zzhq) r5
            boolean r6 = r5.zzu()
            if (r6 == 0) goto L_0x0159
            java.lang.String r6 = r5.zzg()
            r28 = r15
            double r14 = r5.zza()
            r7.putDouble(r6, r14)
        L_0x0155:
            r15 = r28
            r14 = 0
            goto L_0x0136
        L_0x0159:
            r28 = r15
            boolean r6 = r5.zzv()
            if (r6 == 0) goto L_0x016d
            java.lang.String r6 = r5.zzg()
            float r5 = r5.zzb()
            r7.putFloat(r6, r5)
            goto L_0x0155
        L_0x016d:
            boolean r6 = r5.zzw()
            if (r6 == 0) goto L_0x017f
            java.lang.String r6 = r5.zzg()
            long r14 = r5.zzd()
            r7.putLong(r6, r14)
            goto L_0x0155
        L_0x017f:
            boolean r6 = r5.zzy()
            if (r6 == 0) goto L_0x0191
            java.lang.String r6 = r5.zzg()
            java.lang.String r5 = r5.zzh()
            r7.putString(r6, r5)
            goto L_0x0155
        L_0x0191:
            java.util.List r6 = r5.zzi()
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L_0x01ab
            java.lang.String r6 = r5.zzg()
            java.util.List r5 = r5.zzi()
            android.os.Bundle[] r5 = T1.C0162d0.u(r5)
            r7.putParcelableArray(r6, r5)
            goto L_0x0155
        L_0x01ab:
            java.lang.Object r6 = r2.f398a
            T1.u0 r6 = (T1.C0212u0) r6
            T1.Z r6 = r6.f3496r
            T1.C0212u0.k(r6)
            java.lang.String r8 = "Unexpected parameter type for parameter"
            T1.X r6 = r6.f3172f
            r6.b(r5, r8)
            goto L_0x0155
        L_0x01bc:
            r28 = r15
            java.lang.String r2 = "_o"
            java.lang.String r4 = r7.getString(r2)
            r7.remove(r2)
            r3.zzh()
            if (r4 != 0) goto L_0x01cf
            java.lang.String r2 = ""
            r4 = r2
        L_0x01cf:
            r3.zzd()
            T1.Y1 r2 = r13.f3499u
            T1.C0212u0.i(r2)
            r14 = r30
            r2.F(r7, r14)
            T1.r r15 = new T1.r
            java.lang.String r6 = r3.zzh()
            long r18 = r3.zzd()
            long r20 = r3.zzc()
            java.lang.Object r2 = r1.f398a
            r3 = r2
            T1.u0 r3 = (T1.C0212u0) r3
            r2 = r15
            r5 = r27
            r22 = r7
            r7 = r18
            r18 = r9
            r9 = r20
            r1 = r11
            r11 = r22
            r2.<init>((T1.C0212u0) r3, (java.lang.String) r4, (java.lang.String) r5, (java.lang.String) r6, (long) r7, (long) r9, (android.os.Bundle) r11)
            long r2 = r1.f3360a
            r26.o()
            r26.p()
            java.lang.String r4 = r15.f3439a
            com.google.android.gms.common.internal.I.d(r4)
            T1.d0 r0 = r0.f3065p
            T1.T1.L(r0)
            com.google.android.gms.internal.measurement.zzhm r0 = r0.T(r15)
            byte[] r0 = r0.zzcd()
            android.content.ContentValues r5 = new android.content.ContentValues
            r5.<init>()
            java.lang.String r6 = "app_id"
            r5.put(r6, r4)
            java.lang.String r6 = r15.f3440b
            java.lang.String r7 = "name"
            r5.put(r7, r6)
            long r6 = r15.d
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            java.lang.String r7 = "timestamp"
            r5.put(r7, r6)
            long r6 = r1.f3361b
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            java.lang.String r7 = "metadata_fingerprint"
            r5.put(r7, r6)
            java.lang.String r6 = "data"
            r5.put(r6, r0)
            boolean r0 = r1.f3362c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "realtime"
            r5.put(r1, r0)
            android.database.sqlite.SQLiteDatabase r0 = r26.k0()     // Catch:{ SQLiteException -> 0x0289 }
            java.lang.String r1 = "raw_events"
            java.lang.String r6 = "rowid = ?"
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ SQLiteException -> 0x0289 }
            java.lang.String[] r2 = new java.lang.String[]{r2}     // Catch:{ SQLiteException -> 0x0289 }
            int r0 = r0.update(r1, r5, r6, r2)     // Catch:{ SQLiteException -> 0x0289 }
            long r0 = (long) r0     // Catch:{ SQLiteException -> 0x0289 }
            r2 = 1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0280
            T1.C0212u0.k(r18)     // Catch:{ SQLiteException -> 0x0289 }
            r2 = r18
            T1.X r3 = r2.f3172f     // Catch:{ SQLiteException -> 0x0287 }
            java.lang.String r5 = "Failed to update raw event. appId, updatedRows"
            T1.Y r6 = T1.Z.w(r4)     // Catch:{ SQLiteException -> 0x0287 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ SQLiteException -> 0x0287 }
            r3.c(r5, r6, r0)     // Catch:{ SQLiteException -> 0x0287 }
        L_0x0280:
            r1 = r26
            r15 = r28
            r14 = 0
            goto L_0x003e
        L_0x0287:
            r0 = move-exception
            goto L_0x028c
        L_0x0289:
            r0 = move-exception
            r2 = r18
        L_0x028c:
            T1.C0212u0.k(r2)
            T1.Y r1 = T1.Z.w(r4)
            T1.X r2 = r2.f3172f
            java.lang.String r3 = "Error updating raw event. appId"
            r2.c(r3, r1, r0)
            goto L_0x0280
        L_0x029b:
            r14 = r30
            r28 = r15
            java.util.List r0 = r28.a()
            r1 = r26
            r14 = 0
            goto L_0x0034
        L_0x02a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.C0191n.y(java.lang.String, java.lang.Long, java.lang.String, android.os.Bundle):void");
    }

    public final void z() {
        p();
        k0().beginTransaction();
    }

    public final void r() {
    }
}
