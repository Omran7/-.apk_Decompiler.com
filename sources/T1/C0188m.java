package T1;

import C0.a;
import G1.b;
import K4.u;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import com.google.android.gms.internal.measurement.zzca;
import com.google.android.gms.internal.measurement.zzqr;

/* renamed from: T1.m  reason: case insensitive filesystem */
public final class C0188m extends zzca {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3377a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a f3378b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0188m(C0191n nVar, Context context) {
        super(context, "google_app_measurement.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.f3378b = nVar;
    }

    public final SQLiteDatabase getWritableDatabase() {
        switch (this.f3377a) {
            case 0:
                C0191n nVar = (C0191n) this.f3378b;
                u uVar = nVar.f3400e;
                C0212u0 u0Var = (C0212u0) nVar.f398a;
                u0Var.getClass();
                if (uVar.f1611b != 0) {
                    ((b) uVar.f1612c).getClass();
                    if (SystemClock.elapsedRealtime() - uVar.f1611b < 3600000) {
                        throw new SQLiteException("Database open failed");
                    }
                }
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteException unused) {
                    u uVar2 = nVar.f3400e;
                    ((b) uVar2.f1612c).getClass();
                    uVar2.f1611b = SystemClock.elapsedRealtime();
                    Z z3 = u0Var.f3496r;
                    C0212u0.k(z3);
                    z3.f3172f.a("Opening the database failed, dropping and recreating it");
                    if (!u0Var.f3489a.getDatabasePath("google_app_measurement.db").delete()) {
                        Z z4 = u0Var.f3496r;
                        C0212u0.k(z4);
                        z4.f3172f.b("google_app_measurement.db", "Failed to delete corrupted db file");
                    }
                    try {
                        SQLiteDatabase writableDatabase = super.getWritableDatabase();
                        uVar2.f1611b = 0;
                        return writableDatabase;
                    } catch (SQLiteException e6) {
                        Z z5 = u0Var.f3496r;
                        C0212u0.k(z5);
                        z5.f3172f.b(e6, "Failed to open freshly created database");
                        throw e6;
                    }
                }
            default:
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteDatabaseLockedException e7) {
                    throw e7;
                } catch (SQLiteException unused2) {
                    Q q6 = (Q) this.f3378b;
                    C0212u0 u0Var2 = (C0212u0) q6.f398a;
                    Z z6 = u0Var2.f3496r;
                    C0212u0.k(z6);
                    z6.f3172f.a("Opening the local database failed, dropping and recreating it");
                    if (!u0Var2.f3489a.getDatabasePath("google_app_measurement_local.db").delete()) {
                        Z z7 = u0Var2.f3496r;
                        C0212u0.k(z7);
                        z7.f3172f.b("google_app_measurement_local.db", "Failed to delete corrupted local db file");
                    }
                    try {
                        return super.getWritableDatabase();
                    } catch (SQLiteException e8) {
                        Z z8 = ((C0212u0) q6.f398a).f3496r;
                        C0212u0.k(z8);
                        z8.f3172f.b(e8, "Failed to open local database. Events will bypass local storage");
                        return null;
                    }
                }
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        switch (this.f3377a) {
            case 0:
                Z z3 = ((C0212u0) ((C0191n) this.f3378b).f398a).f3496r;
                C0212u0.k(z3);
                K0.f(z3, sQLiteDatabase);
                return;
            default:
                Z z4 = ((C0212u0) ((Q) this.f3378b).f398a).f3496r;
                C0212u0.k(z4);
                K0.f(z4, sQLiteDatabase);
                return;
        }
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i5) {
        int i6 = this.f3377a;
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        switch (this.f3377a) {
            case 0:
                C0212u0 u0Var = (C0212u0) ((C0191n) this.f3378b).f398a;
                Z z3 = u0Var.f3496r;
                C0212u0.k(z3);
                K0.d(z3, sQLiteDatabase, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", C0191n.f3389f);
                Z z4 = u0Var.f3496r;
                C0212u0.k(z4);
                K0.d(z4, sQLiteDatabase, "events_snapshot", "CREATE TABLE IF NOT EXISTS events_snapshot ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, last_bundled_timestamp INTEGER, last_bundled_day INTEGER, last_sampled_complex_event_id INTEGER, last_sampling_rate INTEGER, last_exempt_from_sampling INTEGER, current_session_count INTEGER, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp,last_bundled_timestamp,last_bundled_day,last_sampled_complex_event_id,last_sampling_rate,last_exempt_from_sampling,current_session_count", (String[]) null);
                C0212u0.k(z4);
                K0.d(z4, sQLiteDatabase, "conditional_properties", "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;", "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event", (String[]) null);
                C0212u0.k(z4);
                K0.d(z4, sQLiteDatabase, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", C0191n.f3391q);
                C0212u0.k(z4);
                K0.d(z4, sQLiteDatabase, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", C0191n.f3392r);
                C0212u0.k(z4);
                K0.d(z4, sQLiteDatabase, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", C0191n.f3394t);
                C0212u0.k(z4);
                K0.d(z4, sQLiteDatabase, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", (String[]) null);
                C0212u0.k(z4);
                K0.d(z4, sQLiteDatabase, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", C0191n.f3393s);
                C0212u0.k(z4);
                K0.d(z4, sQLiteDatabase, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", C0191n.f3395u);
                C0212u0.k(z4);
                K0.d(z4, sQLiteDatabase, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", C0191n.f3396v);
                C0212u0.k(z4);
                K0.d(z4, sQLiteDatabase, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", (String[]) null);
                C0212u0.k(z4);
                K0.d(z4, sQLiteDatabase, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", C0191n.f3397w);
                C0212u0.k(z4);
                K0.d(z4, sQLiteDatabase, "main_event_params", "CREATE TABLE IF NOT EXISTS main_event_params ( app_id TEXT NOT NULL, event_id TEXT NOT NULL, children_to_process INTEGER NOT NULL, main_event BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,event_id,children_to_process,main_event", (String[]) null);
                C0212u0.k(z4);
                K0.d(z4, sQLiteDatabase, "default_event_params", "CREATE TABLE IF NOT EXISTS default_event_params ( app_id TEXT NOT NULL, parameters BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,parameters", (String[]) null);
                C0212u0.k(z4);
                K0.d(z4, sQLiteDatabase, "consent_settings", "CREATE TABLE IF NOT EXISTS consent_settings ( app_id TEXT NOT NULL, consent_state TEXT NOT NULL, PRIMARY KEY (app_id));", "app_id,consent_state", C0191n.f3398x);
                zzqr.zzb();
                C0212u0.k(z4);
                K0.d(z4, sQLiteDatabase, "trigger_uris", "CREATE TABLE IF NOT EXISTS trigger_uris ( app_id TEXT NOT NULL, trigger_uri TEXT NOT NULL, timestamp_millis INTEGER NOT NULL, source INTEGER NOT NULL);", "app_id,trigger_uri,source,timestamp_millis", C0191n.f3399y);
                C0212u0.k(z4);
                K0.d(z4, sQLiteDatabase, "upload_queue", "CREATE TABLE IF NOT EXISTS upload_queue ( app_id TEXT NOT NULL, upload_uri TEXT NOT NULL, upload_headers TEXT NOT NULL, upload_type INTEGER NOT NULL, measurement_batch BLOB NOT NULL, retry_count INTEGER NOT NULL, creation_timestamp INTEGER NOT NULL );", "app_id,upload_uri,upload_headers,upload_type,measurement_batch,retry_count,creation_timestamp", C0191n.f3390p);
                return;
            default:
                Z z5 = ((C0212u0) ((Q) this.f3378b).f398a).f3496r;
                C0212u0.k(z5);
                K0.d(z5, sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", Q.f3023e);
                return;
        }
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i5) {
        int i6 = this.f3377a;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0188m(Q q6, Context context) {
        super(context, "google_app_measurement_local.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.f3378b = q6;
    }

    private final void c(SQLiteDatabase sQLiteDatabase, int i2, int i5) {
    }

    private final void d(SQLiteDatabase sQLiteDatabase, int i2, int i5) {
    }

    private final void j(SQLiteDatabase sQLiteDatabase, int i2, int i5) {
    }

    private final void k(SQLiteDatabase sQLiteDatabase, int i2, int i5) {
    }
}
