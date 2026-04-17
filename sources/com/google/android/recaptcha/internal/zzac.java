package com.google.android.recaptcha.internal;

import G5.C;
import I1.b;
import com.google.android.play.core.integrity.StandardIntegrityException;
import com.google.android.play.core.integrity.model.StandardIntegrityErrorCode;
import m5.C0849h;
import o5.d;
import p5.a;
import q5.h;
import x5.p;

final class zzac extends h implements p {
    Object zza;
    int zzb;
    final /* synthetic */ zzae zzc;
    final /* synthetic */ String zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzac(zzae zzae, String str, d dVar) {
        super(2, dVar);
        this.zzc = zzae;
        this.zzd = str;
    }

    public final d create(Object obj, d dVar) {
        return new zzac(this.zzc, this.zzd, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzac) create((C) obj, (d) obj2)).invokeSuspend(C0849h.f10203c);
    }

    public final Object invokeSuspend(Object obj) {
        zzy zzy;
        zzen zzen;
        a aVar = a.f11033a;
        int i2 = this.zzb;
        if (i2 == 0) {
            b.I0(obj);
            zzen = zzz.zzb(this.zzc, this.zzd);
            zzae zzae = this.zzc;
            zzan zzg = zzae.zzc;
            String zzh = zzae.zze;
            this.zza = zzen;
            this.zzb = 1;
            obj = zzg.zzc(zzh, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i2 != 1) {
            zzy = (zzy) this.zza;
            b.I0(obj);
            int zza2 = zzy.zza();
            zztd zztd = (zztd) ((zzte) obj).zzr();
            zztd.zzf(zzy.zza());
            return new zzw(zza2, (zzte) zztd.zzk());
        } else {
            zzen = (zzen) this.zza;
            try {
                b.I0(obj);
            } catch (Exception e6) {
                zzen.zzb(new zzbd(zzbb.zzb, zzba.zzaa, e6.getMessage()));
                zzae zzae2 = this.zzc;
                this.zza = zzae2;
                int i5 = 2;
                this.zzb = 2;
                if (e6 instanceof StandardIntegrityException) {
                    int errorCode = ((StandardIntegrityException) e6).getErrorCode();
                    if (errorCode == -100) {
                        i5 = 44;
                    } else if (errorCode == -12) {
                        i5 = 39;
                    } else if (errorCode == -3) {
                        i5 = 30;
                    } else if (errorCode == -2) {
                        i5 = 29;
                    } else if (errorCode != -1) {
                        switch (errorCode) {
                            case StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID:
                                i5 = 54;
                                break;
                            case StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR:
                                i5 = 53;
                                break;
                            case -17:
                                i5 = 52;
                                break;
                            case -16:
                                i5 = 43;
                                break;
                            case -15:
                                i5 = 42;
                                break;
                            case -14:
                                i5 = 41;
                                break;
                            default:
                                switch (errorCode) {
                                    case -9:
                                        i5 = 36;
                                        break;
                                    case -8:
                                        i5 = 35;
                                        break;
                                    case -7:
                                        i5 = 34;
                                        break;
                                    case -6:
                                        i5 = 33;
                                        break;
                                    case -5:
                                        i5 = 32;
                                        break;
                                }
                        }
                    } else {
                        i5 = 28;
                    }
                } else {
                    i5 = 45;
                }
                zztd zzf = zzte.zzf();
                zzf.zzq(i5);
                zzf.zzr(15);
                obj = zzf.zzk();
                if (obj == aVar) {
                    return aVar;
                }
                zzy = zzae2;
            }
        }
        zzen.zza();
        zzae zzae3 = this.zzc;
        zztf zzf2 = zzti.zzf();
        zztg zzf3 = zzth.zzf();
        zzf3.zzw((String) obj);
        zzf2.zzf((zzth) zzf3.zzk());
        return zzz.zza(zzae3, (zzti) zzf2.zzk());
    }
}
