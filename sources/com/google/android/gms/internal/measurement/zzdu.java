package com.google.android.gms.internal.measurement;

import J1.b;
import K1.d;
import T1.K0;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;

final class zzdu extends zzeu {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ Context zzc;
    final /* synthetic */ Bundle zzd;
    final /* synthetic */ zzff zze;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzdu(zzff zzff, String str, String str2, Context context, Bundle bundle) {
        super(zzff, true);
        this.zza = str;
        this.zzb = str2;
        this.zzc = context;
        this.zzd = bundle;
        this.zze = zzff;
    }

    public final void zza() {
        String str;
        String str2;
        String str3;
        boolean z3;
        try {
            zzff zzff = this.zze;
            String str4 = this.zza;
            String str5 = this.zzb;
            if (zzff.zzX(str4, str5)) {
                str2 = str4;
                str = str5;
                str3 = zzff.zzd;
            } else {
                str3 = null;
                str2 = null;
                str = null;
            }
            Context context = this.zzc;
            I.g(context);
            zzff.zzj = zzff.zzf(context, true);
            if (zzff.zzj == null) {
                Log.w(zzff.zzd, "Failed to connect to measurement client.");
                return;
            }
            int a6 = d.a(context, ModuleDescriptor.MODULE_ID);
            int d = d.d(context, ModuleDescriptor.MODULE_ID, false);
            int max = Math.max(a6, d);
            if (d < a6) {
                z3 = true;
            } else {
                z3 = false;
            }
            zzdh zzdh = new zzdh(119002, (long) max, z3, str3, str2, str, this.zzd, K0.b(context));
            zzcv zze2 = zzff.zzj;
            I.g(zze2);
            zze2.initialize(new b(context), zzdh, this.zzh);
        } catch (Exception e6) {
            this.zze.zzU(e6, true, false);
        }
    }
}
