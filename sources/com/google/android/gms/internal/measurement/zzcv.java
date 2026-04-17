package com.google.android.gms.internal.measurement;

import J1.a;
import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;

public interface zzcv extends IInterface {
    void beginAdUnitExposure(String str, long j6);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j6);

    void endAdUnitExposure(String str, long j6);

    void generateEventId(zzcy zzcy);

    void getAppInstanceId(zzcy zzcy);

    void getCachedAppInstanceId(zzcy zzcy);

    void getConditionalUserProperties(String str, String str2, zzcy zzcy);

    void getCurrentScreenClass(zzcy zzcy);

    void getCurrentScreenName(zzcy zzcy);

    void getGmpAppId(zzcy zzcy);

    void getMaxUserProperties(String str, zzcy zzcy);

    void getSessionId(zzcy zzcy);

    void getTestFlag(zzcy zzcy, int i2);

    void getUserProperties(String str, String str2, boolean z3, zzcy zzcy);

    void initForTests(Map map);

    void initialize(a aVar, zzdh zzdh, long j6);

    void isDataCollectionEnabled(zzcy zzcy);

    void logEvent(String str, String str2, Bundle bundle, boolean z3, boolean z4, long j6);

    void logEventAndBundle(String str, String str2, Bundle bundle, zzcy zzcy, long j6);

    void logHealthData(int i2, String str, a aVar, a aVar2, a aVar3);

    void onActivityCreated(a aVar, Bundle bundle, long j6);

    void onActivityCreatedByScionActivityInfo(zzdj zzdj, Bundle bundle, long j6);

    void onActivityDestroyed(a aVar, long j6);

    void onActivityDestroyedByScionActivityInfo(zzdj zzdj, long j6);

    void onActivityPaused(a aVar, long j6);

    void onActivityPausedByScionActivityInfo(zzdj zzdj, long j6);

    void onActivityResumed(a aVar, long j6);

    void onActivityResumedByScionActivityInfo(zzdj zzdj, long j6);

    void onActivitySaveInstanceState(a aVar, zzcy zzcy, long j6);

    void onActivitySaveInstanceStateByScionActivityInfo(zzdj zzdj, zzcy zzcy, long j6);

    void onActivityStarted(a aVar, long j6);

    void onActivityStartedByScionActivityInfo(zzdj zzdj, long j6);

    void onActivityStopped(a aVar, long j6);

    void onActivityStoppedByScionActivityInfo(zzdj zzdj, long j6);

    void performAction(Bundle bundle, zzcy zzcy, long j6);

    void registerOnMeasurementEventListener(zzde zzde);

    void resetAnalyticsData(long j6);

    void retrieveAndUploadBatches(zzdb zzdb);

    void setConditionalUserProperty(Bundle bundle, long j6);

    void setConsent(Bundle bundle, long j6);

    void setConsentThirdParty(Bundle bundle, long j6);

    void setCurrentScreen(a aVar, String str, String str2, long j6);

    void setCurrentScreenByScionActivityInfo(zzdj zzdj, String str, String str2, long j6);

    void setDataCollectionEnabled(boolean z3);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(zzde zzde);

    void setInstanceIdProvider(zzdg zzdg);

    void setMeasurementEnabled(boolean z3, long j6);

    void setMinimumSessionDuration(long j6);

    void setSessionTimeoutDuration(long j6);

    void setSgtmDebugInfo(Intent intent);

    void setUserId(String str, long j6);

    void setUserProperty(String str, String str2, a aVar, boolean z3, long j6);

    void unregisterOnMeasurementEventListener(zzde zzde);
}
