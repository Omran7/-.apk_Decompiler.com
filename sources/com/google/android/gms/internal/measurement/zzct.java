package com.google.android.gms.internal.measurement;

import J1.a;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.Map;

public final class zzct extends zzbm implements zzcv {
    public zzct(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public final void beginAdUnitExposure(String str, long j6) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeLong(j6);
        zzc(23, zza);
    }

    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbo.zzd(zza, bundle);
        zzc(9, zza);
    }

    public final void clearMeasurementEnabled(long j6) {
        throw null;
    }

    public final void endAdUnitExposure(String str, long j6) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeLong(j6);
        zzc(24, zza);
    }

    public final void generateEventId(zzcy zzcy) {
        Parcel zza = zza();
        zzbo.zze(zza, zzcy);
        zzc(22, zza);
    }

    public final void getAppInstanceId(zzcy zzcy) {
        Parcel zza = zza();
        zzbo.zze(zza, zzcy);
        zzc(20, zza);
    }

    public final void getCachedAppInstanceId(zzcy zzcy) {
        Parcel zza = zza();
        zzbo.zze(zza, zzcy);
        zzc(19, zza);
    }

    public final void getConditionalUserProperties(String str, String str2, zzcy zzcy) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbo.zze(zza, zzcy);
        zzc(10, zza);
    }

    public final void getCurrentScreenClass(zzcy zzcy) {
        Parcel zza = zza();
        zzbo.zze(zza, zzcy);
        zzc(17, zza);
    }

    public final void getCurrentScreenName(zzcy zzcy) {
        Parcel zza = zza();
        zzbo.zze(zza, zzcy);
        zzc(16, zza);
    }

    public final void getGmpAppId(zzcy zzcy) {
        Parcel zza = zza();
        zzbo.zze(zza, zzcy);
        zzc(21, zza);
    }

    public final void getMaxUserProperties(String str, zzcy zzcy) {
        Parcel zza = zza();
        zza.writeString(str);
        zzbo.zze(zza, zzcy);
        zzc(6, zza);
    }

    public final void getSessionId(zzcy zzcy) {
        Parcel zza = zza();
        zzbo.zze(zza, zzcy);
        zzc(46, zza);
    }

    public final void getTestFlag(zzcy zzcy, int i2) {
        Parcel zza = zza();
        zzbo.zze(zza, zzcy);
        zza.writeInt(i2);
        zzc(38, zza);
    }

    public final void getUserProperties(String str, String str2, boolean z3, zzcy zzcy) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        int i2 = zzbo.zza;
        zza.writeInt(z3 ? 1 : 0);
        zzbo.zze(zza, zzcy);
        zzc(5, zza);
    }

    public final void initForTests(Map map) {
        throw null;
    }

    public final void initialize(a aVar, zzdh zzdh, long j6) {
        Parcel zza = zza();
        zzbo.zze(zza, aVar);
        zzbo.zzd(zza, zzdh);
        zza.writeLong(j6);
        zzc(1, zza);
    }

    public final void isDataCollectionEnabled(zzcy zzcy) {
        throw null;
    }

    public final void logEvent(String str, String str2, Bundle bundle, boolean z3, boolean z4, long j6) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbo.zzd(zza, bundle);
        zza.writeInt(z3 ? 1 : 0);
        zza.writeInt(z4 ? 1 : 0);
        zza.writeLong(j6);
        zzc(2, zza);
    }

    public final void logEventAndBundle(String str, String str2, Bundle bundle, zzcy zzcy, long j6) {
        throw null;
    }

    public final void logHealthData(int i2, String str, a aVar, a aVar2, a aVar3) {
        Parcel zza = zza();
        zza.writeInt(5);
        zza.writeString(str);
        zzbo.zze(zza, aVar);
        zzbo.zze(zza, aVar2);
        zzbo.zze(zza, aVar3);
        zzc(33, zza);
    }

    public final void onActivityCreated(a aVar, Bundle bundle, long j6) {
        throw null;
    }

    public final void onActivityCreatedByScionActivityInfo(zzdj zzdj, Bundle bundle, long j6) {
        Parcel zza = zza();
        zzbo.zzd(zza, zzdj);
        zzbo.zzd(zza, bundle);
        zza.writeLong(j6);
        zzc(53, zza);
    }

    public final void onActivityDestroyed(a aVar, long j6) {
        throw null;
    }

    public final void onActivityDestroyedByScionActivityInfo(zzdj zzdj, long j6) {
        Parcel zza = zza();
        zzbo.zzd(zza, zzdj);
        zza.writeLong(j6);
        zzc(54, zza);
    }

    public final void onActivityPaused(a aVar, long j6) {
        throw null;
    }

    public final void onActivityPausedByScionActivityInfo(zzdj zzdj, long j6) {
        Parcel zza = zza();
        zzbo.zzd(zza, zzdj);
        zza.writeLong(j6);
        zzc(55, zza);
    }

    public final void onActivityResumed(a aVar, long j6) {
        throw null;
    }

    public final void onActivityResumedByScionActivityInfo(zzdj zzdj, long j6) {
        Parcel zza = zza();
        zzbo.zzd(zza, zzdj);
        zza.writeLong(j6);
        zzc(56, zza);
    }

    public final void onActivitySaveInstanceState(a aVar, zzcy zzcy, long j6) {
        throw null;
    }

    public final void onActivitySaveInstanceStateByScionActivityInfo(zzdj zzdj, zzcy zzcy, long j6) {
        Parcel zza = zza();
        zzbo.zzd(zza, zzdj);
        zzbo.zze(zza, zzcy);
        zza.writeLong(j6);
        zzc(57, zza);
    }

    public final void onActivityStarted(a aVar, long j6) {
        throw null;
    }

    public final void onActivityStartedByScionActivityInfo(zzdj zzdj, long j6) {
        Parcel zza = zza();
        zzbo.zzd(zza, zzdj);
        zza.writeLong(j6);
        zzc(51, zza);
    }

    public final void onActivityStopped(a aVar, long j6) {
        throw null;
    }

    public final void onActivityStoppedByScionActivityInfo(zzdj zzdj, long j6) {
        Parcel zza = zza();
        zzbo.zzd(zza, zzdj);
        zza.writeLong(j6);
        zzc(52, zza);
    }

    public final void performAction(Bundle bundle, zzcy zzcy, long j6) {
        Parcel zza = zza();
        zzbo.zzd(zza, bundle);
        zzbo.zze(zza, zzcy);
        zza.writeLong(j6);
        zzc(32, zza);
    }

    public final void registerOnMeasurementEventListener(zzde zzde) {
        Parcel zza = zza();
        zzbo.zze(zza, zzde);
        zzc(35, zza);
    }

    public final void resetAnalyticsData(long j6) {
        Parcel zza = zza();
        zza.writeLong(j6);
        zzc(12, zza);
    }

    public final void retrieveAndUploadBatches(zzdb zzdb) {
        Parcel zza = zza();
        zzbo.zze(zza, zzdb);
        zzc(58, zza);
    }

    public final void setConditionalUserProperty(Bundle bundle, long j6) {
        Parcel zza = zza();
        zzbo.zzd(zza, bundle);
        zza.writeLong(j6);
        zzc(8, zza);
    }

    public final void setConsent(Bundle bundle, long j6) {
        throw null;
    }

    public final void setConsentThirdParty(Bundle bundle, long j6) {
        Parcel zza = zza();
        zzbo.zzd(zza, bundle);
        zza.writeLong(j6);
        zzc(45, zza);
    }

    public final void setCurrentScreen(a aVar, String str, String str2, long j6) {
        throw null;
    }

    public final void setCurrentScreenByScionActivityInfo(zzdj zzdj, String str, String str2, long j6) {
        Parcel zza = zza();
        zzbo.zzd(zza, zzdj);
        zza.writeString(str);
        zza.writeString(str2);
        zza.writeLong(j6);
        zzc(50, zza);
    }

    public final void setDataCollectionEnabled(boolean z3) {
        Parcel zza = zza();
        int i2 = zzbo.zza;
        zza.writeInt(z3 ? 1 : 0);
        zzc(39, zza);
    }

    public final void setDefaultEventParameters(Bundle bundle) {
        Parcel zza = zza();
        zzbo.zzd(zza, bundle);
        zzc(42, zza);
    }

    public final void setEventInterceptor(zzde zzde) {
        Parcel zza = zza();
        zzbo.zze(zza, zzde);
        zzc(34, zza);
    }

    public final void setInstanceIdProvider(zzdg zzdg) {
        throw null;
    }

    public final void setMeasurementEnabled(boolean z3, long j6) {
        Parcel zza = zza();
        int i2 = zzbo.zza;
        zza.writeInt(z3 ? 1 : 0);
        zza.writeLong(j6);
        zzc(11, zza);
    }

    public final void setMinimumSessionDuration(long j6) {
        throw null;
    }

    public final void setSessionTimeoutDuration(long j6) {
        Parcel zza = zza();
        zza.writeLong(j6);
        zzc(14, zza);
    }

    public final void setSgtmDebugInfo(Intent intent) {
        Parcel zza = zza();
        zzbo.zzd(zza, intent);
        zzc(48, zza);
    }

    public final void setUserId(String str, long j6) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeLong(j6);
        zzc(7, zza);
    }

    public final void setUserProperty(String str, String str2, a aVar, boolean z3, long j6) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbo.zze(zza, aVar);
        zza.writeInt(z3 ? 1 : 0);
        zza.writeLong(j6);
        zzc(4, zza);
    }

    public final void unregisterOnMeasurementEventListener(zzde zzde) {
        Parcel zza = zza();
        zzbo.zze(zza, zzde);
        zzc(36, zza);
    }
}
