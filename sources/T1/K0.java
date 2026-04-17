package T1;

import android.content.Context;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.measurement.zzbx;
import com.google.android.gms.internal.measurement.zzcc;
import com.mtma.criminal.city.R;
import h0.C0552a;
import java.io.File;
import s2.e;

public abstract class K0 {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f2974a = {"ad_activeview", "ad_click", "ad_exposure", "ad_query", "ad_reward", "adunit_exposure", "app_clear_data", "app_exception", "app_remove", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "app_upgrade", "app_update", "ga_campaign", "error", "first_open", "first_visit", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "session_start_with_rollout", "user_engagement", "ad_impression", "screen_view", "ga_extra_parameter", "app_background", "firebase_campaign"};

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f2975b = {"ad_impression"};

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f2976c = {"_aa", "_ac", "_xa", "_aq", "_ar", "_xu", "_cd", "_ae", "_ui", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "_ug", "_au", "_cmp", "_err", "_f", "_v", "_iap", "_nd", "_nf", "_no", "_nr", "_ou", "_s", "_ssr", "_e", "_ai", "_vs", "_ep", "_ab", "_cmp"};
    public static final String[] d = {"purchase", "refund", "add_payment_info", "add_shipping_info", "add_to_cart", "add_to_wishlist", "begin_checkout", "remove_from_cart", "select_item", "select_promotion", "view_cart", "view_item", "view_item_list", "view_promotion", "ecommerce_purchase", "purchase_refund", "set_checkout_option", "checkout_progress", "select_content", "view_search_results"};

    /* renamed from: e  reason: collision with root package name */
    public static final String[] f2977e = {"ga_conversion", "engagement_time_msec", "exposure_time", "ad_event_id", "ad_unit_id", "ga_error", "ga_error_value", "ga_error_length", "ga_event_origin", "ga_screen", "ga_screen_class", "ga_screen_id", "ga_previous_screen", "ga_previous_class", "ga_previous_id", "manual_tracking", "message_device_time", "message_id", "message_name", "message_time", "message_tracking_id", "message_type", "previous_app_version", "previous_os_version", "topic", "update_with_analytics", "previous_first_open_count", "system_app", "system_app_update", "previous_install_count", "ga_event_id", "ga_extra_params_ct", "ga_group_name", "ga_list_length", "ga_index", "ga_event_name", "campaign_info_source", "cached_campaign", "deferred_analytics_collection", "ga_session_number", "ga_session_id", "campaign_extra_referrer", "app_in_background", "firebase_feature_rollouts", "customer_buyer_stage", "firebase_conversion", "firebase_error", "firebase_error_value", "firebase_error_length", "firebase_event_origin", "firebase_screen", "firebase_screen_class", "firebase_screen_id", "firebase_previous_screen", "firebase_previous_class", "firebase_previous_id", "session_number", "session_id"};

    /* renamed from: f  reason: collision with root package name */
    public static final String[] f2978f = {"_c", "_et", "_xt", "_aeid", "_ai", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_mst", "_ndt", "_nmid", "_nmn", "_nmt", "_nmtid", "_nmc", "_pv", "_po", "_nt", "_uwa", "_pfo", "_sys", "_sysu", "_pin", "_eid", "_epc", "_gn", "_ll", "_i", "_en", "_cis", "_cc", "_dac", "_sno", "_sid", "_cer", "_aib", "_ffr", "_cbs", "_c", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_sno", "_sid"};
    public static final String[] g = {"items"};
    public static final String[] h = {"affiliation", "coupon", "creative_name", "creative_slot", "currency", "_cbs", "discount", "index", "item_id", "item_brand", "item_category", "item_category2", "item_category3", "item_category4", "item_category5", "item_list_name", "item_list_id", "item_name", "item_variant", "location_id", "payment_type", "price", "promotion_id", "promotion_name", "quantity", "shipping", "shipping_tier", "tax", "transaction_id", "value", "item_list", "checkout_step", "checkout_option", "item_location_id"};

    /* renamed from: i  reason: collision with root package name */
    public static final String[] f2979i = {"firebase_last_notification", "first_open_time", "first_visit_time", "last_deep_link_referrer", "user_id", "last_advertising_id_reset", "first_open_after_install", "lifetime_user_engagement", "session_user_engagement", "non_personalized_ads", "ga_session_number", "ga_session_id", "last_gclid", "session_number", "session_id"};

    /* renamed from: j  reason: collision with root package name */
    public static final String[] f2980j = {"_ln", "_fot", "_fvt", "_ldl", "_id", "_lair", "_fi", "_lte", "_se", "_npa", "_sno", "_sid", "_lgclid", "_sno", "_sid"};

    /* renamed from: k  reason: collision with root package name */
    public static e f2981k;

    public static Object a(Bundle bundle, String str, Class cls, Object obj) {
        Object obj2 = bundle.get(str);
        if (obj2 == null) {
            return obj;
        }
        if (cls.isAssignableFrom(obj2.getClass())) {
            return obj2;
        }
        String canonicalName = cls.getCanonicalName();
        throw new IllegalStateException(C0552a.r(C0552a.u("Invalid conditional user property field type. '", str, "' expected [", canonicalName, "] but was ["), obj2.getClass().getCanonicalName(), "]"));
    }

    public static String b(Context context) {
        try {
            return context.getResources().getResourcePackageName(R.string.common_google_play_services_unknown_issue);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
        if (r3 == false) goto L_0x003d;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006f A[Catch:{ all -> 0x00c6, SQLiteException -> 0x0099 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009d A[Catch:{ all -> 0x00c6, SQLiteException -> 0x0099 }, LOOP:1: B:35:0x009d->B:40:0x00af, LOOP_START, PHI: r1 
      PHI: (r1v4 int) = (r1v3 int), (r1v5 int) binds: [B:34:0x009b, B:40:0x00af] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b8 A[Catch:{ all -> 0x00c6, SQLiteException -> 0x0099 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:60:? A[Catch:{  }, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void d(T1.Z r10, android.database.sqlite.SQLiteDatabase r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String[] r15) {
        /*
            java.lang.String r0 = "SELECT * FROM "
            if (r10 == 0) goto L_0x00d9
            r1 = 0
            java.lang.String r3 = "SQLITE_MASTER"
            java.lang.String r2 = "name"
            java.lang.String[] r4 = new java.lang.String[]{r2}     // Catch:{ SQLiteException -> 0x002e, all -> 0x002b }
            java.lang.String r5 = "name=?"
            java.lang.String[] r6 = new java.lang.String[]{r12}     // Catch:{ SQLiteException -> 0x002e, all -> 0x002b }
            r9 = 0
            r7 = 0
            r8 = 0
            r2 = r11
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SQLiteException -> 0x002e, all -> 0x002b }
            boolean r3 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x0029 }
            r2.close()
            if (r3 != 0) goto L_0x0040
            goto L_0x003d
        L_0x0025:
            r10 = move-exception
            r1 = r2
            goto L_0x00d3
        L_0x0029:
            r3 = move-exception
            goto L_0x0031
        L_0x002b:
            r10 = move-exception
            goto L_0x00d3
        L_0x002e:
            r2 = move-exception
            r3 = r2
            r2 = r1
        L_0x0031:
            T1.X r4 = r10.f3175r     // Catch:{ all -> 0x0025 }
            java.lang.String r5 = "Error querying for table"
            r4.c(r5, r12, r3)     // Catch:{ all -> 0x0025 }
            if (r2 == 0) goto L_0x003d
            r2.close()
        L_0x003d:
            r11.execSQL(r13)
        L_0x0040:
            java.util.HashSet r13 = new java.util.HashSet     // Catch:{ SQLiteException -> 0x0099 }
            r13.<init>()     // Catch:{ SQLiteException -> 0x0099 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0099 }
            r2.<init>(r0)     // Catch:{ SQLiteException -> 0x0099 }
            r2.append(r12)     // Catch:{ SQLiteException -> 0x0099 }
            java.lang.String r0 = " LIMIT 0"
            r2.append(r0)     // Catch:{ SQLiteException -> 0x0099 }
            java.lang.String r0 = r2.toString()     // Catch:{ SQLiteException -> 0x0099 }
            android.database.Cursor r0 = r11.rawQuery(r0, r1)     // Catch:{ SQLiteException -> 0x0099 }
            java.lang.String[] r1 = r0.getColumnNames()     // Catch:{ all -> 0x00c6 }
            java.util.Collections.addAll(r13, r1)     // Catch:{ all -> 0x00c6 }
            r0.close()     // Catch:{ SQLiteException -> 0x0099 }
            java.lang.String r0 = ","
            java.lang.String[] r14 = r14.split(r0)     // Catch:{ SQLiteException -> 0x0099 }
            int r0 = r14.length     // Catch:{ SQLiteException -> 0x0099 }
            r1 = 0
            r2 = r1
        L_0x006d:
            if (r2 >= r0) goto L_0x009b
            r3 = r14[r2]     // Catch:{ SQLiteException -> 0x0099 }
            boolean r4 = r13.remove(r3)     // Catch:{ SQLiteException -> 0x0099 }
            if (r4 == 0) goto L_0x007a
            int r2 = r2 + 1
            goto L_0x006d
        L_0x007a:
            android.database.sqlite.SQLiteException r11 = new android.database.sqlite.SQLiteException     // Catch:{ SQLiteException -> 0x0099 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0099 }
            r13.<init>()     // Catch:{ SQLiteException -> 0x0099 }
            java.lang.String r14 = "Table "
            r13.append(r14)     // Catch:{ SQLiteException -> 0x0099 }
            r13.append(r12)     // Catch:{ SQLiteException -> 0x0099 }
            java.lang.String r14 = " is missing required column: "
            r13.append(r14)     // Catch:{ SQLiteException -> 0x0099 }
            r13.append(r3)     // Catch:{ SQLiteException -> 0x0099 }
            java.lang.String r13 = r13.toString()     // Catch:{ SQLiteException -> 0x0099 }
            r11.<init>(r13)     // Catch:{ SQLiteException -> 0x0099 }
            throw r11     // Catch:{ SQLiteException -> 0x0099 }
        L_0x0099:
            r11 = move-exception
            goto L_0x00cb
        L_0x009b:
            if (r15 == 0) goto L_0x00b2
        L_0x009d:
            int r14 = r15.length     // Catch:{ SQLiteException -> 0x0099 }
            if (r1 >= r14) goto L_0x00b2
            r14 = r15[r1]     // Catch:{ SQLiteException -> 0x0099 }
            boolean r14 = r13.remove(r14)     // Catch:{ SQLiteException -> 0x0099 }
            if (r14 != 0) goto L_0x00af
            int r14 = r1 + 1
            r14 = r15[r14]     // Catch:{ SQLiteException -> 0x0099 }
            r11.execSQL(r14)     // Catch:{ SQLiteException -> 0x0099 }
        L_0x00af:
            int r1 = r1 + 2
            goto L_0x009d
        L_0x00b2:
            boolean r11 = r13.isEmpty()     // Catch:{ SQLiteException -> 0x0099 }
            if (r11 != 0) goto L_0x00c5
            T1.X r11 = r10.f3175r     // Catch:{ SQLiteException -> 0x0099 }
            java.lang.String r14 = "Table has extra columns. table, columns"
            java.lang.String r15 = ", "
            java.lang.String r13 = android.text.TextUtils.join(r15, r13)     // Catch:{ SQLiteException -> 0x0099 }
            r11.c(r14, r12, r13)     // Catch:{ SQLiteException -> 0x0099 }
        L_0x00c5:
            return
        L_0x00c6:
            r11 = move-exception
            r0.close()     // Catch:{ SQLiteException -> 0x0099 }
            throw r11     // Catch:{ SQLiteException -> 0x0099 }
        L_0x00cb:
            T1.X r10 = r10.f3172f
            java.lang.String r13 = "Failed to verify columns on table that was just created"
            r10.b(r12, r13)
            throw r11
        L_0x00d3:
            if (r1 == 0) goto L_0x00d8
            r1.close()
        L_0x00d8:
            throw r10
        L_0x00d9:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "Monitor must not be null"
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.K0.d(T1.Z, android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String, java.lang.String, java.lang.String[]):void");
    }

    public static String e(String str, String[] strArr, String[] strArr2) {
        int min = Math.min(strArr.length, strArr2.length);
        for (int i2 = 0; i2 < min; i2++) {
            String str2 = strArr[i2];
            if ((str == null && str2 == null) || (str != null && str.equals(str2))) {
                return strArr2[i2];
            }
        }
        return null;
    }

    public static void f(Z z3, SQLiteDatabase sQLiteDatabase) {
        if (z3 != null) {
            zzbx.zza();
            String path = sQLiteDatabase.getPath();
            int i2 = zzcc.zzb;
            File file = new File(path);
            boolean readable = file.setReadable(false, false);
            X x6 = z3.f3175r;
            if (!readable) {
                x6.a("Failed to turn off database read permission");
            }
            if (!file.setWritable(false, false)) {
                x6.a("Failed to turn off database write permission");
            }
            if (!file.setReadable(true, true)) {
                x6.a("Failed to turn on database read permission for owner");
            }
            if (!file.setWritable(true, true)) {
                x6.a("Failed to turn on database write permission for owner");
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Monitor must not be null");
    }

    public static void g(Bundle bundle, Object obj) {
        if (obj instanceof Double) {
            bundle.putDouble("value", ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bundle.putLong("value", ((Long) obj).longValue());
        } else {
            bundle.putString("value", obj.toString());
        }
    }

    public static String h(Context context, String str) {
        I.g(context);
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(str)) {
            str = b(context);
        }
        int identifier = resources.getIdentifier("google_app_id", "string", str);
        if (identifier == 0) {
            return null;
        }
        try {
            return resources.getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }
}
