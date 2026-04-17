package com.google.android.recaptcha.internal;

import G5.C;
import I1.b;
import android.content.ContentValues;
import m5.C0849h;
import n5.C0875g;
import o5.d;
import p5.a;
import q5.h;
import x5.p;

final class zzer extends h implements p {
    final /* synthetic */ zzes zza;
    final /* synthetic */ zztx zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzer(zzes zzes, zztx zztx, d dVar) {
        super(2, dVar);
        this.zza = zzes;
        this.zzb = zztx;
    }

    public final d create(Object obj, d dVar) {
        return new zzer(this.zza, this.zzb, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzer) create((C) obj, (d) obj2)).invokeSuspend(C0849h.f10203c);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.f11033a;
        b.I0(obj);
        zztx zztx = this.zzb;
        zzes zzes = this.zza;
        synchronized (zzeo.class) {
            try {
                if (zzes.zze != null) {
                    byte[] zzd = zztx.zzd();
                    zzej zzej = new zzej(zzkh.zzg().zzi(zzd, 0, zzd.length), System.currentTimeMillis(), 0);
                    zzei zzb2 = zzes.zze;
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("ss", zzej.zzc());
                    contentValues.put("ts", Long.valueOf(zzej.zzb()));
                    zzb2.getWritableDatabase().insert("ce", (String) null, contentValues);
                    int zzb3 = zzes.zze.zzb() - 500;
                    if (zzb3 > 0) {
                        zzes.zze.zza(C0875g.V0(zzb3, zzes.zze.zzd()));
                    }
                    if (zzes.zze.zzb() >= 20) {
                        zzes.zzg();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return C0849h.f10203c;
    }
}
