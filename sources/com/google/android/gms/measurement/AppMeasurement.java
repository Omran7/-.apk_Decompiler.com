package com.google.android.gms.measurement;

import R1.a;
import R1.b;
import R1.c;
import T1.C0160c1;
import T1.C0212u0;
import T1.K0;
import android.os.Bundle;
import com.google.android.gms.common.internal.I;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Deprecated
public class AppMeasurement {

    /* renamed from: b  reason: collision with root package name */
    public static volatile AppMeasurement f6261b;

    /* renamed from: a  reason: collision with root package name */
    public final c f6262a;

    public static class ConditionalUserProperty {
        public boolean mActive;
        public String mAppId;
        public long mCreationTimestamp;
        public String mExpiredEventName;
        public Bundle mExpiredEventParams;
        public String mName;
        public String mOrigin;
        public long mTimeToLive;
        public String mTimedOutEventName;
        public Bundle mTimedOutEventParams;
        public String mTriggerEventName;
        public long mTriggerTimeout;
        public String mTriggeredEventName;
        public Bundle mTriggeredEventParams;
        public long mTriggeredTimestamp;
        public Object mValue;
    }

    public AppMeasurement(C0212u0 u0Var) {
        this.f6262a = new a(u0Var);
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.measurement.AppMeasurement getInstance(android.content.Context r14) {
        /*
            com.google.android.gms.measurement.AppMeasurement r0 = f6261b
            if (r0 != 0) goto L_0x0053
            java.lang.Class<com.google.android.gms.measurement.AppMeasurement> r0 = com.google.android.gms.measurement.AppMeasurement.class
            monitor-enter(r0)
            com.google.android.gms.measurement.AppMeasurement r1 = f6261b     // Catch:{ all -> 0x0027 }
            if (r1 != 0) goto L_0x004f
            r1 = 0
            java.lang.Class<com.google.firebase.analytics.FirebaseAnalytics> r2 = com.google.firebase.analytics.FirebaseAnalytics.class
            java.lang.String r3 = "getScionFrontendApiImplementation"
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            java.lang.Class<android.os.Bundle> r5 = android.os.Bundle.class
            java.lang.Class[] r4 = new java.lang.Class[]{r4, r5}     // Catch:{  }
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r4)     // Catch:{  }
            java.lang.Object[] r3 = new java.lang.Object[]{r14, r1}     // Catch:{  }
            java.lang.Object r2 = r2.invoke(r1, r3)     // Catch:{  }
            T1.c1 r2 = (T1.C0160c1) r2     // Catch:{  }
            goto L_0x002a
        L_0x0027:
            r14 = move-exception
            goto L_0x0051
        L_0x0029:
            r2 = r1
        L_0x002a:
            if (r2 == 0) goto L_0x0034
            com.google.android.gms.measurement.AppMeasurement r14 = new com.google.android.gms.measurement.AppMeasurement     // Catch:{ all -> 0x0027 }
            r14.<init>((T1.C0160c1) r2)     // Catch:{ all -> 0x0027 }
            f6261b = r14     // Catch:{ all -> 0x0027 }
            goto L_0x004f
        L_0x0034:
            com.google.android.gms.internal.measurement.zzdh r13 = new com.google.android.gms.internal.measurement.zzdh     // Catch:{ all -> 0x0027 }
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r3 = 0
            r5 = 0
            r7 = 1
            r8 = 0
            r2 = r13
            r2.<init>(r3, r5, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0027 }
            T1.u0 r14 = T1.C0212u0.q(r14, r13, r1)     // Catch:{ all -> 0x0027 }
            com.google.android.gms.measurement.AppMeasurement r1 = new com.google.android.gms.measurement.AppMeasurement     // Catch:{ all -> 0x0027 }
            r1.<init>((T1.C0212u0) r14)     // Catch:{ all -> 0x0027 }
            f6261b = r1     // Catch:{ all -> 0x0027 }
        L_0x004f:
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            goto L_0x0053
        L_0x0051:
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            throw r14
        L_0x0053:
            com.google.android.gms.measurement.AppMeasurement r14 = f6261b
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.AppMeasurement.getInstance(android.content.Context):com.google.android.gms.measurement.AppMeasurement");
    }

    public void beginAdUnitExposure(String str) {
        this.f6262a.a(str);
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.f6262a.b(str, str2, bundle);
    }

    public void endAdUnitExposure(String str) {
        this.f6262a.e(str);
    }

    public long generateEventId() {
        return this.f6262a.zzb();
    }

    public String getAppInstanceId() {
        return this.f6262a.zzh();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty, java.lang.Object] */
    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        int i2;
        List<Bundle> c3 = this.f6262a.c(str, str2);
        if (c3 == null) {
            i2 = 0;
        } else {
            i2 = c3.size();
        }
        ArrayList arrayList = new ArrayList(i2);
        for (Bundle bundle : c3) {
            ? obj = new Object();
            I.g(bundle);
            Class<String> cls = String.class;
            obj.mAppId = (String) K0.a(bundle, "app_id", cls, (Object) null);
            obj.mOrigin = (String) K0.a(bundle, "origin", cls, (Object) null);
            obj.mName = (String) K0.a(bundle, "name", cls, (Object) null);
            obj.mValue = K0.a(bundle, "value", Object.class, (Object) null);
            obj.mTriggerEventName = (String) K0.a(bundle, "trigger_event_name", cls, (Object) null);
            Class<Long> cls2 = Long.class;
            obj.mTriggerTimeout = ((Long) K0.a(bundle, "trigger_timeout", cls2, 0L)).longValue();
            obj.mTimedOutEventName = (String) K0.a(bundle, "timed_out_event_name", cls, (Object) null);
            Class<Bundle> cls3 = Bundle.class;
            obj.mTimedOutEventParams = (Bundle) K0.a(bundle, "timed_out_event_params", cls3, (Object) null);
            obj.mTriggeredEventName = (String) K0.a(bundle, "triggered_event_name", cls, (Object) null);
            obj.mTriggeredEventParams = (Bundle) K0.a(bundle, "triggered_event_params", cls3, (Object) null);
            obj.mTimeToLive = ((Long) K0.a(bundle, "time_to_live", cls2, 0L)).longValue();
            obj.mExpiredEventName = (String) K0.a(bundle, "expired_event_name", cls, (Object) null);
            obj.mExpiredEventParams = (Bundle) K0.a(bundle, "expired_event_params", cls3, (Object) null);
            obj.mActive = ((Boolean) K0.a(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            obj.mCreationTimestamp = ((Long) K0.a(bundle, "creation_timestamp", cls2, 0L)).longValue();
            obj.mTriggeredTimestamp = ((Long) K0.a(bundle, "triggered_timestamp", cls2, 0L)).longValue();
            arrayList.add(obj);
        }
        return arrayList;
    }

    public String getCurrentScreenClass() {
        return this.f6262a.zzi();
    }

    public String getCurrentScreenName() {
        return this.f6262a.zzj();
    }

    public String getGmpAppId() {
        return this.f6262a.zzk();
    }

    public int getMaxUserProperties(String str) {
        return this.f6262a.zza(str);
    }

    public Map<String, Object> getUserProperties(String str, String str2, boolean z3) {
        return this.f6262a.d(str, str2, z3);
    }

    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.f6262a.g(str, str2, bundle);
    }

    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        I.g(conditionalUserProperty);
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            K0.g(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        this.f6262a.f(bundle);
    }

    public AppMeasurement(C0160c1 c1Var) {
        this.f6262a = new b(c1Var);
    }
}
