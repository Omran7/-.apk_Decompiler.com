package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.Map;

final class zzom implements zzow {
    private final zzoi zza;
    private final zzpl zzb;
    private final boolean zzc;
    private final zzmp zzd;

    private zzom(zzpl zzpl, zzmp zzmp, zzoi zzoi) {
        this.zzb = zzpl;
        this.zzc = zzoi instanceof zzna;
        this.zzd = zzmp;
        this.zza = zzoi;
    }

    public static zzom zzc(zzpl zzpl, zzmp zzmp, zzoi zzoi) {
        return new zzom(zzpl, zzmp, zzoi);
    }

    public final int zza(Object obj) {
        int zzb2 = ((zznd) obj).zzc.zzb();
        if (this.zzc) {
            return zzb2 + ((zzna) obj).zzb.zzb();
        }
        return zzb2;
    }

    public final int zzb(Object obj) {
        int hashCode = ((zznd) obj).zzc.hashCode();
        if (this.zzc) {
            return (hashCode * 53) + ((zzna) obj).zzb.zza.hashCode();
        }
        return hashCode;
    }

    public final Object zze() {
        zzoi zzoi = this.zza;
        if (zzoi instanceof zznd) {
            return ((zznd) zzoi).zzv();
        }
        return zzoi.zzad().zzl();
    }

    public final void zzf(Object obj) {
        this.zzb.zzi(obj);
        this.zzd.zza(obj);
    }

    public final void zzg(Object obj, Object obj2) {
        zzoy.zzq(this.zzb, obj, obj2);
        if (this.zzc) {
            zzoy.zzp(this.zzd, obj, obj2);
        }
    }

    public final void zzh(Object obj, zzov zzov, zzmo zzmo) {
        boolean z3;
        zzpl zzpl = this.zzb;
        Object zza2 = zzpl.zza(obj);
        ((zzna) obj).zzi();
        while (true) {
            if (zzov.zzc() == Integer.MAX_VALUE) {
                break;
            }
            int zzd2 = zzov.zzd();
            int i2 = 0;
            if (zzd2 != 11) {
                if ((zzd2 & 7) != 2) {
                    z3 = zzov.zzO();
                } else if (zzmo.zza(this.zza, zzd2 >>> 3) == null) {
                    z3 = zzpl.zzk(zza2, zzov, 0);
                } else {
                    throw null;
                }
                if (!z3) {
                    break;
                }
            } else {
                zznc zznc = null;
                zzle zzle = null;
                while (true) {
                    try {
                        if (zzov.zzc() == Integer.MAX_VALUE) {
                            break;
                        }
                        int zzd3 = zzov.zzd();
                        if (zzd3 == 16) {
                            i2 = zzov.zzj();
                            zznc = zzmo.zza(this.zza, i2);
                        } else if (zzd3 == 26) {
                            if (zznc == null) {
                                zzle = zzov.zzp();
                            } else {
                                throw null;
                            }
                        } else if (!zzov.zzO()) {
                            break;
                        }
                    } catch (Throwable th) {
                        zzpl.zzj(obj, zza2);
                        throw th;
                    }
                }
                if (zzov.zzd() != 12) {
                    throw new zznn("Protocol message end-group tag did not match expected tag.");
                } else if (zzle == null) {
                    continue;
                } else if (zznc == null) {
                    zzpl.zzg(zza2, i2, zzle);
                } else {
                    throw null;
                }
            }
        }
        zzpl.zzj(obj, zza2);
    }

    public final void zzi(Object obj, byte[] bArr, int i2, int i5, zzkt zzkt) {
        zznd zznd = (zznd) obj;
        zzpm zzpm = zznd.zzc;
        if (zzpm == zzpm.zzc()) {
            zzpm = zzpm.zzf();
            zznd.zzc = zzpm;
        }
        ((zzna) obj).zzi();
        zznc zznc = null;
        while (i2 < i5) {
            int zzi = zzku.zzi(bArr, i2, zzkt);
            int i6 = zzkt.zza;
            if (i6 == 11) {
                int i7 = 0;
                zzle zzle = null;
                while (zzi < i5) {
                    zzi = zzku.zzi(bArr, zzi, zzkt);
                    int i8 = zzkt.zza;
                    int i9 = i8 >>> 3;
                    int i10 = i8 & 7;
                    if (i9 != 2) {
                        if (i9 == 3) {
                            if (zznc != null) {
                                int i11 = zzos.zza;
                                throw null;
                            } else if (i10 == 2) {
                                zzi = zzku.zza(bArr, zzi, zzkt);
                                zzle = (zzle) zzkt.zzc;
                            }
                        }
                    } else if (i10 == 0) {
                        zzi = zzku.zzi(bArr, zzi, zzkt);
                        i7 = zzkt.zza;
                        zznc = zzkt.zzd.zza(this.zza, i7);
                    }
                    if (i8 == 12) {
                        break;
                    }
                    zzi = zzku.zzo(i8, bArr, zzi, i5, zzkt);
                }
                if (zzle != null) {
                    zzpm.zzj((i7 << 3) | 2, zzle);
                }
                i2 = zzi;
            } else if ((i6 & 7) == 2) {
                zznc = zzkt.zzd.zza(this.zza, i6 >>> 3);
                if (zznc == null) {
                    i2 = zzku.zzh(i6, bArr, zzi, i5, zzpm, zzkt);
                } else {
                    int i12 = zzos.zza;
                    throw null;
                }
            } else {
                i2 = zzku.zzo(i6, bArr, zzi, i5, zzkt);
            }
        }
        if (i2 != i5) {
            throw new zznn("Failed to parse the message.");
        }
    }

    public final void zzj(Object obj, zzpy zzpy) {
        Iterator zzf = ((zzna) obj).zzb.zzf();
        while (zzf.hasNext()) {
            Map.Entry entry = (Map.Entry) zzf.next();
            zzms zzms = (zzms) entry.getKey();
            if (zzms.zze() == zzpx.MESSAGE) {
                zzms.zzg();
                zzms.zzf();
                if (entry instanceof zznp) {
                    zzpy.zzw(zzms.zza(), ((zznp) entry).zza().zzb());
                } else {
                    zzpy.zzw(zzms.zza(), entry.getValue());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        ((zznd) obj).zzc.zzk(zzpy);
    }

    public final boolean zzk(Object obj, Object obj2) {
        if (!((zznd) obj).zzc.equals(((zznd) obj2).zzc)) {
            return false;
        }
        if (this.zzc) {
            return ((zzna) obj).zzb.equals(((zzna) obj2).zzb);
        }
        return true;
    }

    public final boolean zzl(Object obj) {
        return ((zzna) obj).zzb.zzk();
    }
}
