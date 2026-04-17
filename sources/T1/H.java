package T1;

import H3.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import s2.e;

public abstract class H {

    /* renamed from: A  reason: collision with root package name */
    public static final G f2844A = a("measurement.sgtm.upload.max_queued_batches", 5000, new C0223y(19), false);

    /* renamed from: A0  reason: collision with root package name */
    public static final G f2845A0 = a("measurement.rb.attribution.notify_app_delay_millis", 3000, new C(20), false);

    /* renamed from: B  reason: collision with root package name */
    public static final G f2846B = a("measurement.sgtm.upload.batches_retrieval_limit", 5, new C0220x(20), false);

    /* renamed from: B0  reason: collision with root package name */
    public static final G f2847B0;

    /* renamed from: C  reason: collision with root package name */
    public static final G f2848C = a("measurement.sgtm.upload.min_delay_after_startup", 5000L, new C0223y(20), false);

    /* renamed from: C0  reason: collision with root package name */
    public static final G f2849C0;

    /* renamed from: D  reason: collision with root package name */
    public static final G f2850D = a("measurement.sgtm.upload.min_delay_after_broadcast", 1000L, new C0220x(21), false);

    /* renamed from: D0  reason: collision with root package name */
    public static final G f2851D0;

    /* renamed from: E  reason: collision with root package name */
    public static final G f2852E = a("measurement.sgtm.upload.min_delay_after_background", 600000L, new C0223y(21), false);

    /* renamed from: E0  reason: collision with root package name */
    public static final G f2853E0;
    public static final G F = a("measurement.upload.backoff_period", 43200000L, new C0223y(22), false);

    /* renamed from: F0  reason: collision with root package name */
    public static final G f2854F0;

    /* renamed from: G  reason: collision with root package name */
    public static final G f2855G = a("measurement.upload.interval", 3600000L, new C0220x(24), false);

    /* renamed from: G0  reason: collision with root package name */
    public static final G f2856G0;

    /* renamed from: H  reason: collision with root package name */
    public static final G f2857H = a("measurement.upload.realtime_upload_interval", 10000L, new C0223y(24), false);

    /* renamed from: H0  reason: collision with root package name */
    public static final G f2858H0;

    /* renamed from: I  reason: collision with root package name */
    public static final G f2859I = a("measurement.upload.debug_upload_interval", 1000L, new C0220x(25), false);

    /* renamed from: I0  reason: collision with root package name */
    public static final G f2860I0 = a("measurement.service.storage_consent_support_version", 203600, new f(23), false);

    /* renamed from: J  reason: collision with root package name */
    public static final G f2861J = a("measurement.upload.minimum_delay", 500L, new C0223y(25), false);

    /* renamed from: J0  reason: collision with root package name */
    public static final G f2862J0;

    /* renamed from: K  reason: collision with root package name */
    public static final G f2863K = a("measurement.alarm_manager.minimum_interval", 60000L, new C0220x(26), false);

    /* renamed from: K0  reason: collision with root package name */
    public static final G f2864K0;

    /* renamed from: L  reason: collision with root package name */
    public static final G f2865L = a("measurement.upload.stale_data_deletion_interval", 86400000L, new C0223y(26), false);
    public static final G L0;

    /* renamed from: M  reason: collision with root package name */
    public static final G f2866M = a("measurement.upload.refresh_blacklisted_config_interval", 604800000L, new C0220x(27), false);

    /* renamed from: M0  reason: collision with root package name */
    public static final G f2867M0;

    /* renamed from: N  reason: collision with root package name */
    public static final G f2868N = a("measurement.upload.initial_upload_delay_time", 15000L, new C0223y(27), false);

    /* renamed from: N0  reason: collision with root package name */
    public static final G f2869N0;

    /* renamed from: O  reason: collision with root package name */
    public static final G f2870O = a("measurement.upload.retry_time", 1800000L, new C0223y(28), false);
    public static final G O0;

    /* renamed from: P  reason: collision with root package name */
    public static final G f2871P = a("measurement.upload.retry_count", 6, new C0223y(29), false);

    /* renamed from: P0  reason: collision with root package name */
    public static final G f2872P0;

    /* renamed from: Q  reason: collision with root package name */
    public static final G f2873Q = a("measurement.upload.max_queue_time", 518400000L, new B(0), false);

    /* renamed from: Q0  reason: collision with root package name */
    public static final G f2874Q0;

    /* renamed from: R  reason: collision with root package name */
    public static final G f2875R = a("measurement.upload.google_signal_max_queue_time", 300000L, new C(0), false);

    /* renamed from: R0  reason: collision with root package name */
    public static final G f2876R0;

    /* renamed from: S  reason: collision with root package name */
    public static final G f2877S = a("measurement.lifetimevalue.max_currency_tracked", 4, new B(1), false);

    /* renamed from: S0  reason: collision with root package name */
    public static final G f2878S0;

    /* renamed from: T  reason: collision with root package name */
    public static final G f2879T = a("measurement.audience.filter_result_max_count", 200, new C(1), false);

    /* renamed from: T0  reason: collision with root package name */
    public static final G f2880T0;

    /* renamed from: U  reason: collision with root package name */
    public static final G f2881U = a("measurement.upload.max_public_user_properties", 100, (F) null, false);

    /* renamed from: U0  reason: collision with root package name */
    public static final G f2882U0;

    /* renamed from: V  reason: collision with root package name */
    public static final G f2883V = a("measurement.upload.max_event_name_cardinality", 2000, (F) null, false);

    /* renamed from: V0  reason: collision with root package name */
    public static final G f2884V0;

    /* renamed from: W  reason: collision with root package name */
    public static final G f2885W = a("measurement.upload.max_public_event_params", 100, (F) null, false);

    /* renamed from: W0  reason: collision with root package name */
    public static final G f2886W0;

    /* renamed from: X  reason: collision with root package name */
    public static final G f2887X = a("measurement.service_client.idle_disconnect_millis", 5000L, new B(2), false);
    public static final G X0;

    /* renamed from: Y  reason: collision with root package name */
    public static final G f2888Y = a("measurement.service_client.reconnect_millis", 1000L, new C(2), false);

    /* renamed from: Y0  reason: collision with root package name */
    public static final G f2889Y0;

    /* renamed from: Z  reason: collision with root package name */
    public static final G f2890Z;

    /* renamed from: Z0  reason: collision with root package name */
    public static final G f2891Z0;

    /* renamed from: a  reason: collision with root package name */
    public static final List f2892a = Collections.synchronizedList(new ArrayList());

    /* renamed from: a0  reason: collision with root package name */
    public static final G f2893a0 = a("measurement.test.string_flag", "---", new C(3), false);

    /* renamed from: a1  reason: collision with root package name */
    public static final G f2894a1;

    /* renamed from: b  reason: collision with root package name */
    public static final G f2895b = a("measurement.ad_id_cache_time", 10000L, new C0220x(7), false);

    /* renamed from: b0  reason: collision with root package name */
    public static final G f2896b0 = a("measurement.test.long_flag", -1L, new B(5), false);

    /* renamed from: b1  reason: collision with root package name */
    public static final G f2897b1;

    /* renamed from: c  reason: collision with root package name */
    public static final G f2898c = a("measurement.app_uninstalled_additional_ad_id_cache_time", 3600000L, new C0220x(16), false);

    /* renamed from: c0  reason: collision with root package name */
    public static final G f2899c0 = a("measurement.test.int_flag", -2, new B(6), false);

    /* renamed from: c1  reason: collision with root package name */
    public static final G f2900c1;
    public static final G d = a("measurement.monitoring.sample_period_millis", 86400000L, new C0220x(22), false);

    /* renamed from: d0  reason: collision with root package name */
    public static final G f2901d0 = a("measurement.test.double_flag", Double.valueOf(-3.0d), new C(6), false);

    /* renamed from: d1  reason: collision with root package name */
    public static final G f2902d1;

    /* renamed from: e  reason: collision with root package name */
    public static final G f2903e = a("measurement.config.cache_time", 86400000L, new C0220x(28), false);

    /* renamed from: e0  reason: collision with root package name */
    public static final G f2904e0 = a("measurement.experiment.max_ids", 50, new B(7), false);

    /* renamed from: e1  reason: collision with root package name */
    public static final G f2905e1;

    /* renamed from: f  reason: collision with root package name */
    public static final G f2906f = a("measurement.config.url_scheme", "https", new B(4), false);

    /* renamed from: f0  reason: collision with root package name */
    public static final G f2907f0 = a("measurement.upload.max_item_scoped_custom_parameters", 27, new C(7), false);

    /* renamed from: f1  reason: collision with root package name */
    public static final G f2908f1;
    public static final G g = a("measurement.config.url_authority", "app-measurement.com", new C(10), false);

    /* renamed from: g0  reason: collision with root package name */
    public static final G f2909g0 = a("measurement.upload.max_event_parameter_value_length", 500, new B(8), true);
    public static final G g1;
    public static final G h = a("measurement.upload.max_bundles", 100, new C(16), false);

    /* renamed from: h0  reason: collision with root package name */
    public static final G f2910h0 = a("measurement.max_bundles_per_iteration", 100, new C(8), false);

    /* renamed from: h1  reason: collision with root package name */
    public static final G f2911h1;

    /* renamed from: i  reason: collision with root package name */
    public static final G f2912i = a("measurement.upload.max_batch_size", 65536, new e(20), false);

    /* renamed from: i0  reason: collision with root package name */
    public static final G f2913i0 = a("measurement.sdk.attribution.cache.ttl", 604800000L, new B(9), false);

    /* renamed from: i1  reason: collision with root package name */
    public static final G f2914i1;

    /* renamed from: j  reason: collision with root package name */
    public static final G f2915j = a("measurement.upload.max_bundle_size", 65536, new e(26), false);

    /* renamed from: j0  reason: collision with root package name */
    public static final G f2916j0 = a("measurement.redaction.app_instance_id.ttl", 7200000L, new C(9), false);

    /* renamed from: j1  reason: collision with root package name */
    public static final G f2917j1;

    /* renamed from: k  reason: collision with root package name */
    public static final G f2918k = a("measurement.upload.max_events_per_bundle", 1000, new C0223y(2), false);

    /* renamed from: k0  reason: collision with root package name */
    public static final G f2919k0 = a("measurement.rb.attribution.client.min_ad_services_version", 7, new B(11), false);

    /* renamed from: k1  reason: collision with root package name */
    public static final G f2920k1;

    /* renamed from: l  reason: collision with root package name */
    public static final G f2921l = a("measurement.upload.max_events_per_day", 100000, new C0220x(3), false);

    /* renamed from: l0  reason: collision with root package name */
    public static final G f2922l0 = a("measurement.dma_consent.max_daily_dcu_realtime_events", 1, new C(11), false);

    /* renamed from: l1  reason: collision with root package name */
    public static final G f2923l1;

    /* renamed from: m  reason: collision with root package name */
    public static final G f2924m = a("measurement.upload.max_error_events_per_day", 1000, new C0220x(9), false);

    /* renamed from: m0  reason: collision with root package name */
    public static final G f2925m0 = a("measurement.rb.attribution.uri_scheme", "https", new B(12), false);

    /* renamed from: m1  reason: collision with root package name */
    public static final G f2926m1;

    /* renamed from: n  reason: collision with root package name */
    public static final G f2927n = a("measurement.upload.max_public_events_per_day", 50000, new C0223y(11), false);

    /* renamed from: n0  reason: collision with root package name */
    public static final G f2928n0 = a("measurement.rb.attribution.uri_authority", "google-analytics.com", new C(12), false);

    /* renamed from: n1  reason: collision with root package name */
    public static final G f2929n1;

    /* renamed from: o  reason: collision with root package name */
    public static final G f2930o = a("measurement.upload.max_conversions_per_day", 10000, new C0220x(12), false);

    /* renamed from: o0  reason: collision with root package name */
    public static final G f2931o0 = a("measurement.rb.attribution.uri_path", "privacy-sandbox/register-app-conversion", new B(13), false);

    /* renamed from: o1  reason: collision with root package name */
    public static final G f2932o1;

    /* renamed from: p  reason: collision with root package name */
    public static final G f2933p = a("measurement.upload.max_realtime_events_per_day", 10, new C0220x(13), false);

    /* renamed from: p0  reason: collision with root package name */
    public static final G f2934p0 = a("measurement.session.engagement_interval", 3600000L, new C(13), false);

    /* renamed from: p1  reason: collision with root package name */
    public static final G f2935p1;

    /* renamed from: q  reason: collision with root package name */
    public static final G f2936q = a("measurement.store.max_stored_events_per_app", 100000, new C0223y(13), false);

    /* renamed from: q0  reason: collision with root package name */
    public static final G f2937q0 = a("measurement.rb.attribution.app_allowlist", "*", new B(14), false);

    /* renamed from: q1  reason: collision with root package name */
    public static final G f2938q1;

    /* renamed from: r  reason: collision with root package name */
    public static final G f2939r = a("measurement.upload.url", "https://app-measurement.com/a", new C0220x(14), false);

    /* renamed from: r0  reason: collision with root package name */
    public static final G f2940r0 = a("measurement.rb.attribution.user_properties", "_npa,npa|_fot,fot", new C(14), false);

    /* renamed from: r1  reason: collision with root package name */
    public static final G f2941r1;

    /* renamed from: s  reason: collision with root package name */
    public static final G f2942s = a("measurement.sgtm.google_signal.url", "https://app-measurement.com/s/d", new C0223y(14), false);
    public static final G s0 = a("measurement.rb.attribution.event_params", "value|currency", new B(15), false);

    /* renamed from: t  reason: collision with root package name */
    public static final G f2943t = a("measurement.sgtm.service_upload_apps_list", "", new C0220x(15), false);

    /* renamed from: t0  reason: collision with root package name */
    public static final G f2944t0 = a("measurement.rb.attribution.query_parameters_to_remove", "", new B(16), false);

    /* renamed from: u  reason: collision with root package name */
    public static final G f2945u = a("measurement.sgtm.upload.backoff_http_codes", "404,429,503,504", new C0223y(15), false);

    /* renamed from: u0  reason: collision with root package name */
    public static final G f2946u0 = a("measurement.rb.attribution.max_queue_time", 864000000L, new B(17), false);

    /* renamed from: v  reason: collision with root package name */
    public static final G f2947v = a("measurement.sgtm.upload.retry_interval", 600000L, new C0223y(16), false);

    /* renamed from: v0  reason: collision with root package name */
    public static final G f2948v0 = a("measurement.rb.attribution.max_retry_delay_seconds", 16, new C(17), false);

    /* renamed from: w  reason: collision with root package name */
    public static final G f2949w = a("measurement.sgtm.upload.retry_max_wait", 21600000L, new C0220x(17), false);

    /* renamed from: w0  reason: collision with root package name */
    public static final G f2950w0 = a("measurement.rb.attribution.client.min_time_after_boot_seconds", 90, new B(18), false);

    /* renamed from: x  reason: collision with root package name */
    public static final G f2951x = a("measurement.sgtm.batch.retry_interval", 1800000L, new C0223y(17), false);

    /* renamed from: x0  reason: collision with root package name */
    public static final G f2952x0 = a("measurement.rb.max_trigger_registrations_per_day", 1000, new B(19), false);

    /* renamed from: y  reason: collision with root package name */
    public static final G f2953y = a("measurement.sgtm.batch.retry_max_wait", 21600000L, new C0223y(18), false);

    /* renamed from: y0  reason: collision with root package name */
    public static final G f2954y0;

    /* renamed from: z  reason: collision with root package name */
    public static final G f2955z = a("measurement.sgtm.batch.retry_max_count", 10, new C0220x(19), false);

    /* renamed from: z0  reason: collision with root package name */
    public static final G f2956z0;

    /* JADX WARNING: type inference failed for: r1v62, types: [T1.F, java.lang.Object] */
    static {
        Collections.synchronizedSet(new HashSet());
        a("measurement.upload.window_interval", 3600000L, new C0220x(23), false);
        Boolean bool = Boolean.FALSE;
        f2890Z = a("measurement.test.boolean_flag", bool, new B(3), false);
        a("measurement.test.cached_long_flag", -1L, new C(5), true);
        a("measurement.rb.attribution.max_trigger_uris_queried_at_once", 0, new C(18), false);
        Boolean bool2 = Boolean.TRUE;
        f2954y0 = a("measurement.config.bundle_for_all_apps_on_backgrounded", bool2, new C(19), false);
        f2956z0 = a("measurement.config.notify_trigger_uris_on_backgrounded", bool2, new B(20), false);
        f2847B0 = a("measurement.quality.checksum", bool, (F) null, false);
        f2849C0 = a("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", bool, new e(19), false);
        f2851D0 = a("measurement.audience.refresh_event_count_filters_timestamp", bool, new f(20), false);
        f2853E0 = a("measurement.audience.use_bundle_timestamp_for_event_count_filters", bool, new f(21), true);
        f2854F0 = a("measurement.sdk.collection.last_deep_link_referrer_campaign2", bool, new e(21), false);
        f2856G0 = a("measurement.integration.disable_firebase_instance_id", bool, new f(22), false);
        f2858H0 = a("measurement.collection.service.update_with_analytics_fix", bool, new e(22), false);
        f2862J0 = a("measurement.service.store_null_safelist", bool2, new e(23), false);
        f2864K0 = a("measurement.service.store_safelist", bool2, new f(24), false);
        L0 = a("measurement.session_stitching_token_enabled", bool, new f(25), false);
        f2867M0 = a("measurement.sgtm.upload_queue", bool2, new e(25), false);
        f2869N0 = a("measurement.sgtm.google_signal.enable", bool2, new f(26), false);
        O0 = a("measurement.sgtm.upload_on_uninstall", bool2, new f(27), false);
        f2872P0 = a("measurement.sgtm.no_proxy.service", bool, new e(27), false);
        f2874Q0 = a("measurement.sgtm.service.batching_on_backgrounded", bool, new f(28), false);
        f2876R0 = a("measurement.sgtm.no_proxy.client2", bool, new e(28), true);
        f2878S0 = a("measurement.sgtm.client.upload_on_backgrounded.dev", bool, new f(29), true);
        f2880T0 = a("measurement.sgtm.client.scion_upload_action", bool2, new Object(), true);
        f2882U0 = a("measurement.gmscore_client_telemetry", bool, new C0223y(0), false);
        f2884V0 = a("measurement.rb.attribution.service", bool2, new C0220x(1), true);
        f2886W0 = a("measurement.rb.attribution.client2", bool2, new C0223y(1), true);
        X0 = a("measurement.rb.attribution.uuid_generation", bool2, new C0220x(2), false);
        f2889Y0 = a("measurement.rb.attribution.enable_trigger_redaction", bool2, new C0223y(12), false);
        a("measurement.rb.attribution.followup1.service", bool, new C0220x(18), false);
        f2891Z0 = a("measurement.rb.attribution.retry_disposition", bool, new C0223y(23), false);
        f2894a1 = a("measurement.client.sessions.enable_fix_background_engagement", bool, new C0220x(29), false);
        f2897b1 = a("measurement.fix_engagement_on_reset_analytics_data", bool2, new C(4), false);
        f2900c1 = a("measurement.set_default_event_parameters_propagate_clear.service.dev", bool, new B(10), false);
        f2902d1 = a("measurement.set_default_event_parameters_propagate_clear.client.dev", bool, new C(15), false);
        f2905e1 = a("measurement.set_default_event_parameters.fix_deferred_analytics_collection", bool2, new B(21), false);
        f2908f1 = a("measurement.chimera.parameter.service", bool2, new e(24), false);
        g1 = a("measurement.service.ad_impression.convert_value_to_double", bool2, new C0220x(0), false);
        a("measurement.rb.attribution.service.enable_max_trigger_uris_queried_at_once", bool2, new C0223y(3), false);
        a("measurement.remove_conflicting_first_party_apis.dev", bool, new C0220x(4), false);
        f2911h1 = a("measurement.rb.attribution.service.trigger_uris_high_priority", bool2, new C0223y(4), false);
        f2914i1 = a("measurement.backfill_session_ids.service", bool, new C0220x(5), false);
        f2917j1 = a("measurement.tcf.consent_fix", bool, new C0223y(5), false);
        f2920k1 = a("measurement.experiment.enable_phenotype_experiment_reporting", bool2, new C0220x(6), false);
        f2923l1 = a("measurement.set_default_event_parameters.fix_service_request_ordering", bool, new C0223y(6), false);
        f2926m1 = a("measurement.set_default_event_parameters.fix_app_update_logging", bool2, new C0223y(7), false);
        f2929n1 = a("measurement.fix_high_memory.prune_ees_config", bool, new C0220x(8), false);
        f2932o1 = a("measurement.upload_controller.wait_initialization", bool, new C0223y(8), true);
        f2935p1 = a("measurement.admob_plus_removal.client.dev", bool, new C0223y(9), false);
        a("measurement.admob_plus_removal.service", bool, new C0220x(10), false);
        f2938q1 = a("measurement.service.fix_stop_bundling_bug", bool, new C0223y(10), false);
        f2941r1 = a("measurement.fix_params_logcat_spam", bool2, new C0220x(11), false);
    }

    public static G a(String str, Object obj, F f6, boolean z3) {
        G g5 = new G(str, obj, f6);
        if (z3) {
            f2892a.add(g5);
        }
        return g5;
    }
}
