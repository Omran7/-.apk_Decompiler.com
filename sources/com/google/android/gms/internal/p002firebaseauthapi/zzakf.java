package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.f;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzakf  reason: invalid package */
final class zzakf implements zzams {
    private final zzakb zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzakf(zzakb zzakb) {
        zzakb zzakb2 = (zzakb) zzalb.zza(zzakb, "input");
        this.zza = zzakb2;
        zzakb2.zzc = this;
    }

    public final double zza() {
        zzb(1);
        return this.zza.zza();
    }

    public final float zzb() {
        zzb(5);
        return this.zza.zzb();
    }

    public final int zzc() {
        int i2 = this.zzd;
        if (i2 != 0) {
            this.zzb = i2;
            this.zzd = 0;
        } else {
            this.zzb = this.zza.zzi();
        }
        int i5 = this.zzb;
        return (i5 == 0 || i5 == this.zzc) ? f.API_PRIORITY_OTHER : i5 >>> 3;
    }

    public final int zzd() {
        return this.zzb;
    }

    public final int zze() {
        zzb(0);
        return this.zza.zzd();
    }

    public final int zzf() {
        zzb(5);
        return this.zza.zze();
    }

    public final int zzg() {
        zzb(0);
        return this.zza.zzf();
    }

    public final int zzh() {
        zzb(5);
        return this.zza.zzg();
    }

    public final int zzi() {
        zzb(0);
        return this.zza.zzh();
    }

    public final int zzj() {
        zzb(0);
        return this.zza.zzj();
    }

    public final long zzk() {
        zzb(1);
        return this.zza.zzk();
    }

    public final long zzl() {
        zzb(0);
        return this.zza.zzl();
    }

    public final long zzm() {
        zzb(1);
        return this.zza.zzn();
    }

    public final long zzn() {
        zzb(0);
        return this.zza.zzo();
    }

    public final long zzo() {
        zzb(0);
        return this.zza.zzp();
    }

    public final zzajp zzp() {
        zzb(2);
        return this.zza.zzq();
    }

    public final String zzq() {
        zzb(2);
        return this.zza.zzr();
    }

    public final String zzr() {
        zzb(2);
        return this.zza.zzs();
    }

    public final boolean zzs() {
        zzb(0);
        return this.zza.zzu();
    }

    public final boolean zzt() {
        int i2;
        if (this.zza.zzt() || (i2 = this.zzb) == this.zzc) {
            return false;
        }
        return this.zza.zzd(i2);
    }

    private final <T> void zzd(T t6, zzamv<T> zzamv, zzakk zzakk) {
        int zzj = this.zza.zzj();
        this.zza.zzv();
        int zza2 = this.zza.zza(zzj);
        this.zza.zza++;
        zzamv.zza(t6, this, zzakk);
        this.zza.zzb(0);
        zzakb zzakb = this.zza;
        zzakb.zza--;
        zzakb.zzc(zza2);
    }

    public static zzakf zza(zzakb zzakb) {
        zzakf zzakf = zzakb.zzc;
        if (zzakf != null) {
            return zzakf;
        }
        return new zzakf(zzakb);
    }

    private final <T> T zzb(zzamv<T> zzamv, zzakk zzakk) {
        T zza2 = zzamv.zza();
        zzd(zza2, zzamv, zzakk);
        zzamv.zzd(zza2);
        return zza2;
    }

    public final void zze(List<Integer> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzakz) {
            zzakz zzakz = (zzakz) list;
            int i2 = this.zzb & 7;
            if (i2 == 2) {
                int zzj = this.zza.zzj();
                zzc(zzj);
                int zzc2 = this.zza.zzc() + zzj;
                do {
                    zzakz.zzc(this.zza.zze());
                } while (this.zza.zzc() < zzc2);
            } else if (i2 == 5) {
                do {
                    zzakz.zzc(this.zza.zze());
                    if (!this.zza.zzt()) {
                        zzi2 = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
            } else {
                throw zzalf.zza();
            }
        } else {
            int i5 = this.zzb & 7;
            if (i5 == 2) {
                int zzj2 = this.zza.zzj();
                zzc(zzj2);
                int zzc3 = this.zza.zzc() + zzj2;
                do {
                    list.add(Integer.valueOf(this.zza.zze()));
                } while (this.zza.zzc() < zzc3);
            } else if (i5 == 5) {
                do {
                    list.add(Integer.valueOf(this.zza.zze()));
                    if (!this.zza.zzt()) {
                        zzi = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi == this.zzb);
                this.zzd = zzi;
            } else {
                throw zzalf.zza();
            }
        }
    }

    public final void zzf(List<Long> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzalr) {
            zzalr zzalr = (zzalr) list;
            int i2 = this.zzb & 7;
            if (i2 == 1) {
                do {
                    zzalr.zza(this.zza.zzk());
                    if (!this.zza.zzt()) {
                        zzi2 = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
            } else if (i2 == 2) {
                int zzj = this.zza.zzj();
                zzd(zzj);
                int zzc2 = this.zza.zzc() + zzj;
                do {
                    zzalr.zza(this.zza.zzk());
                } while (this.zza.zzc() < zzc2);
            } else {
                throw zzalf.zza();
            }
        } else {
            int i5 = this.zzb & 7;
            if (i5 == 1) {
                do {
                    list.add(Long.valueOf(this.zza.zzk()));
                    if (!this.zza.zzt()) {
                        zzi = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi == this.zzb);
                this.zzd = zzi;
            } else if (i5 == 2) {
                int zzj2 = this.zza.zzj();
                zzd(zzj2);
                int zzc3 = this.zza.zzc() + zzj2;
                do {
                    list.add(Long.valueOf(this.zza.zzk()));
                } while (this.zza.zzc() < zzc3);
            } else {
                throw zzalf.zza();
            }
        }
    }

    public final void zzg(List<Float> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzakx) {
            zzakx zzakx = (zzakx) list;
            int i2 = this.zzb & 7;
            if (i2 == 2) {
                int zzj = this.zza.zzj();
                zzc(zzj);
                int zzc2 = this.zza.zzc() + zzj;
                do {
                    zzakx.zza(this.zza.zzb());
                } while (this.zza.zzc() < zzc2);
            } else if (i2 == 5) {
                do {
                    zzakx.zza(this.zza.zzb());
                    if (!this.zza.zzt()) {
                        zzi2 = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
            } else {
                throw zzalf.zza();
            }
        } else {
            int i5 = this.zzb & 7;
            if (i5 == 2) {
                int zzj2 = this.zza.zzj();
                zzc(zzj2);
                int zzc3 = this.zza.zzc() + zzj2;
                do {
                    list.add(Float.valueOf(this.zza.zzb()));
                } while (this.zza.zzc() < zzc3);
            } else if (i5 == 5) {
                do {
                    list.add(Float.valueOf(this.zza.zzb()));
                    if (!this.zza.zzt()) {
                        zzi = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi == this.zzb);
                this.zzd = zzi;
            } else {
                throw zzalf.zza();
            }
        }
    }

    public final void zzh(List<Integer> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzakz) {
            zzakz zzakz = (zzakz) list;
            int i2 = this.zzb & 7;
            if (i2 == 0) {
                do {
                    zzakz.zzc(this.zza.zzf());
                    if (!this.zza.zzt()) {
                        zzi2 = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
            } else if (i2 == 2) {
                int zzc2 = this.zza.zzc() + this.zza.zzj();
                do {
                    zzakz.zzc(this.zza.zzf());
                } while (this.zza.zzc() < zzc2);
                zza(zzc2);
            } else {
                throw zzalf.zza();
            }
        } else {
            int i5 = this.zzb & 7;
            if (i5 == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzf()));
                    if (!this.zza.zzt()) {
                        zzi = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi == this.zzb);
                this.zzd = zzi;
            } else if (i5 == 2) {
                int zzc3 = this.zza.zzc() + this.zza.zzj();
                do {
                    list.add(Integer.valueOf(this.zza.zzf()));
                } while (this.zza.zzc() < zzc3);
                zza(zzc3);
            } else {
                throw zzalf.zza();
            }
        }
    }

    public final void zzi(List<Long> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzalr) {
            zzalr zzalr = (zzalr) list;
            int i2 = this.zzb & 7;
            if (i2 == 0) {
                do {
                    zzalr.zza(this.zza.zzl());
                    if (!this.zza.zzt()) {
                        zzi2 = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
            } else if (i2 == 2) {
                int zzc2 = this.zza.zzc() + this.zza.zzj();
                do {
                    zzalr.zza(this.zza.zzl());
                } while (this.zza.zzc() < zzc2);
                zza(zzc2);
            } else {
                throw zzalf.zza();
            }
        } else {
            int i5 = this.zzb & 7;
            if (i5 == 0) {
                do {
                    list.add(Long.valueOf(this.zza.zzl()));
                    if (!this.zza.zzt()) {
                        zzi = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi == this.zzb);
                this.zzd = zzi;
            } else if (i5 == 2) {
                int zzc3 = this.zza.zzc() + this.zza.zzj();
                do {
                    list.add(Long.valueOf(this.zza.zzl()));
                } while (this.zza.zzc() < zzc3);
                zza(zzc3);
            } else {
                throw zzalf.zza();
            }
        }
    }

    public final void zzj(List<Integer> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzakz) {
            zzakz zzakz = (zzakz) list;
            int i2 = this.zzb & 7;
            if (i2 == 2) {
                int zzj = this.zza.zzj();
                zzc(zzj);
                int zzc2 = this.zza.zzc() + zzj;
                do {
                    zzakz.zzc(this.zza.zzg());
                } while (this.zza.zzc() < zzc2);
            } else if (i2 == 5) {
                do {
                    zzakz.zzc(this.zza.zzg());
                    if (!this.zza.zzt()) {
                        zzi2 = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
            } else {
                throw zzalf.zza();
            }
        } else {
            int i5 = this.zzb & 7;
            if (i5 == 2) {
                int zzj2 = this.zza.zzj();
                zzc(zzj2);
                int zzc3 = this.zza.zzc() + zzj2;
                do {
                    list.add(Integer.valueOf(this.zza.zzg()));
                } while (this.zza.zzc() < zzc3);
            } else if (i5 == 5) {
                do {
                    list.add(Integer.valueOf(this.zza.zzg()));
                    if (!this.zza.zzt()) {
                        zzi = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi == this.zzb);
                this.zzd = zzi;
            } else {
                throw zzalf.zza();
            }
        }
    }

    public final void zzk(List<Long> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzalr) {
            zzalr zzalr = (zzalr) list;
            int i2 = this.zzb & 7;
            if (i2 == 1) {
                do {
                    zzalr.zza(this.zza.zzn());
                    if (!this.zza.zzt()) {
                        zzi2 = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
            } else if (i2 == 2) {
                int zzj = this.zza.zzj();
                zzd(zzj);
                int zzc2 = this.zza.zzc() + zzj;
                do {
                    zzalr.zza(this.zza.zzn());
                } while (this.zza.zzc() < zzc2);
            } else {
                throw zzalf.zza();
            }
        } else {
            int i5 = this.zzb & 7;
            if (i5 == 1) {
                do {
                    list.add(Long.valueOf(this.zza.zzn()));
                    if (!this.zza.zzt()) {
                        zzi = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi == this.zzb);
                this.zzd = zzi;
            } else if (i5 == 2) {
                int zzj2 = this.zza.zzj();
                zzd(zzj2);
                int zzc3 = this.zza.zzc() + zzj2;
                do {
                    list.add(Long.valueOf(this.zza.zzn()));
                } while (this.zza.zzc() < zzc3);
            } else {
                throw zzalf.zza();
            }
        }
    }

    public final void zzl(List<Integer> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzakz) {
            zzakz zzakz = (zzakz) list;
            int i2 = this.zzb & 7;
            if (i2 == 0) {
                do {
                    zzakz.zzc(this.zza.zzh());
                    if (!this.zza.zzt()) {
                        zzi2 = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
            } else if (i2 == 2) {
                int zzc2 = this.zza.zzc() + this.zza.zzj();
                do {
                    zzakz.zzc(this.zza.zzh());
                } while (this.zza.zzc() < zzc2);
                zza(zzc2);
            } else {
                throw zzalf.zza();
            }
        } else {
            int i5 = this.zzb & 7;
            if (i5 == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzh()));
                    if (!this.zza.zzt()) {
                        zzi = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi == this.zzb);
                this.zzd = zzi;
            } else if (i5 == 2) {
                int zzc3 = this.zza.zzc() + this.zza.zzj();
                do {
                    list.add(Integer.valueOf(this.zza.zzh()));
                } while (this.zza.zzc() < zzc3);
                zza(zzc3);
            } else {
                throw zzalf.zza();
            }
        }
    }

    public final void zzm(List<Long> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzalr) {
            zzalr zzalr = (zzalr) list;
            int i2 = this.zzb & 7;
            if (i2 == 0) {
                do {
                    zzalr.zza(this.zza.zzo());
                    if (!this.zza.zzt()) {
                        zzi2 = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
            } else if (i2 == 2) {
                int zzc2 = this.zza.zzc() + this.zza.zzj();
                do {
                    zzalr.zza(this.zza.zzo());
                } while (this.zza.zzc() < zzc2);
                zza(zzc2);
            } else {
                throw zzalf.zza();
            }
        } else {
            int i5 = this.zzb & 7;
            if (i5 == 0) {
                do {
                    list.add(Long.valueOf(this.zza.zzo()));
                    if (!this.zza.zzt()) {
                        zzi = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi == this.zzb);
                this.zzd = zzi;
            } else if (i5 == 2) {
                int zzc3 = this.zza.zzc() + this.zza.zzj();
                do {
                    list.add(Long.valueOf(this.zza.zzo()));
                } while (this.zza.zzc() < zzc3);
                zza(zzc3);
            } else {
                throw zzalf.zza();
            }
        }
    }

    public final void zzn(List<String> list) {
        zza(list, false);
    }

    public final void zzo(List<String> list) {
        zza(list, true);
    }

    public final void zzp(List<Integer> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzakz) {
            zzakz zzakz = (zzakz) list;
            int i2 = this.zzb & 7;
            if (i2 == 0) {
                do {
                    zzakz.zzc(this.zza.zzj());
                    if (!this.zza.zzt()) {
                        zzi2 = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
            } else if (i2 == 2) {
                int zzc2 = this.zza.zzc() + this.zza.zzj();
                do {
                    zzakz.zzc(this.zza.zzj());
                } while (this.zza.zzc() < zzc2);
                zza(zzc2);
            } else {
                throw zzalf.zza();
            }
        } else {
            int i5 = this.zzb & 7;
            if (i5 == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzj()));
                    if (!this.zza.zzt()) {
                        zzi = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi == this.zzb);
                this.zzd = zzi;
            } else if (i5 == 2) {
                int zzc3 = this.zza.zzc() + this.zza.zzj();
                do {
                    list.add(Integer.valueOf(this.zza.zzj()));
                } while (this.zza.zzc() < zzc3);
                zza(zzc3);
            } else {
                throw zzalf.zza();
            }
        }
    }

    public final void zzq(List<Long> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzalr) {
            zzalr zzalr = (zzalr) list;
            int i2 = this.zzb & 7;
            if (i2 == 0) {
                do {
                    zzalr.zza(this.zza.zzp());
                    if (!this.zza.zzt()) {
                        zzi2 = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
            } else if (i2 == 2) {
                int zzc2 = this.zza.zzc() + this.zza.zzj();
                do {
                    zzalr.zza(this.zza.zzp());
                } while (this.zza.zzc() < zzc2);
                zza(zzc2);
            } else {
                throw zzalf.zza();
            }
        } else {
            int i5 = this.zzb & 7;
            if (i5 == 0) {
                do {
                    list.add(Long.valueOf(this.zza.zzp()));
                    if (!this.zza.zzt()) {
                        zzi = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi == this.zzb);
                this.zzd = zzi;
            } else if (i5 == 2) {
                int zzc3 = this.zza.zzc() + this.zza.zzj();
                do {
                    list.add(Long.valueOf(this.zza.zzp()));
                } while (this.zza.zzc() < zzc3);
                zza(zzc3);
            } else {
                throw zzalf.zza();
            }
        }
    }

    private final Object zza(zzanw zzanw, Class<?> cls, zzakk zzakk) {
        switch (zzake.zza[zzanw.ordinal()]) {
            case 1:
                return Boolean.valueOf(zzs());
            case 2:
                return zzp();
            case 3:
                return Double.valueOf(zza());
            case 4:
                return Integer.valueOf(zze());
            case 5:
                return Integer.valueOf(zzf());
            case zzaky.zzf.zzf /*6*/:
                return Long.valueOf(zzk());
            case zzaky.zzf.zzg /*7*/:
                return Float.valueOf(zzb());
            case 8:
                return Integer.valueOf(zzg());
            case 9:
                return Long.valueOf(zzl());
            case 10:
                zzb(2);
                return zzb(zzamr.zza().zza(cls), zzakk);
            case ModuleDescriptor.MODULE_VERSION:
                return Integer.valueOf(zzh());
            case 12:
                return Long.valueOf(zzm());
            case 13:
                return Integer.valueOf(zzi());
            case 14:
                return Long.valueOf(zzn());
            case 15:
                return zzr();
            case 16:
                return Integer.valueOf(zzj());
            case 17:
                return Long.valueOf(zzo());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    private final <T> void zzc(T t6, zzamv<T> zzamv, zzakk zzakk) {
        int i2 = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            zzamv.zza(t6, this, zzakk);
            if (this.zzb != this.zzc) {
                throw zzalf.zzg();
            }
        } finally {
            this.zzc = i2;
        }
    }

    public final <T> void zzb(T t6, zzamv<T> zzamv, zzakk zzakk) {
        zzb(2);
        zzd(t6, zzamv, zzakk);
    }

    public final void zzb(List<zzajp> list) {
        int zzi;
        if ((this.zzb & 7) == 2) {
            do {
                list.add(zzp());
                if (!this.zza.zzt()) {
                    zzi = this.zza.zzi();
                } else {
                    return;
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        throw zzalf.zza();
    }

    public final void zzd(List<Integer> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzakz) {
            zzakz zzakz = (zzakz) list;
            int i2 = this.zzb & 7;
            if (i2 == 0) {
                do {
                    zzakz.zzc(this.zza.zzd());
                    if (!this.zza.zzt()) {
                        zzi2 = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
            } else if (i2 == 2) {
                int zzc2 = this.zza.zzc() + this.zza.zzj();
                do {
                    zzakz.zzc(this.zza.zzd());
                } while (this.zza.zzc() < zzc2);
                zza(zzc2);
            } else {
                throw zzalf.zza();
            }
        } else {
            int i5 = this.zzb & 7;
            if (i5 == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzd()));
                    if (!this.zza.zzt()) {
                        zzi = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi == this.zzb);
                this.zzd = zzi;
            } else if (i5 == 2) {
                int zzc3 = this.zza.zzc() + this.zza.zzj();
                do {
                    list.add(Integer.valueOf(this.zza.zzd()));
                } while (this.zza.zzc() < zzc3);
                zza(zzc3);
            } else {
                throw zzalf.zza();
            }
        }
    }

    public final <T> void zzb(List<T> list, zzamv<T> zzamv, zzakk zzakk) {
        int zzi;
        int i2 = this.zzb;
        if ((i2 & 7) == 2) {
            do {
                list.add(zzb(zzamv, zzakk));
                if (!this.zza.zzt() && this.zzd == 0) {
                    zzi = this.zza.zzi();
                } else {
                    return;
                }
            } while (zzi == i2);
            this.zzd = zzi;
            return;
        }
        throw zzalf.zza();
    }

    public final void zzc(List<Double> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzaki) {
            zzaki zzaki = (zzaki) list;
            int i2 = this.zzb & 7;
            if (i2 == 1) {
                do {
                    zzaki.zza(this.zza.zza());
                    if (!this.zza.zzt()) {
                        zzi2 = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
            } else if (i2 == 2) {
                int zzj = this.zza.zzj();
                zzd(zzj);
                int zzc2 = this.zza.zzc() + zzj;
                do {
                    zzaki.zza(this.zza.zza());
                } while (this.zza.zzc() < zzc2);
            } else {
                throw zzalf.zza();
            }
        } else {
            int i5 = this.zzb & 7;
            if (i5 == 1) {
                do {
                    list.add(Double.valueOf(this.zza.zza()));
                    if (!this.zza.zzt()) {
                        zzi = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi == this.zzb);
                this.zzd = zzi;
            } else if (i5 == 2) {
                int zzj2 = this.zza.zzj();
                zzd(zzj2);
                int zzc3 = this.zza.zzc() + zzj2;
                do {
                    list.add(Double.valueOf(this.zza.zza()));
                } while (this.zza.zzc() < zzc3);
            } else {
                throw zzalf.zza();
            }
        }
    }

    private final void zzb(int i2) {
        if ((this.zzb & 7) != i2) {
            throw zzalf.zza();
        }
    }

    private final <T> T zza(zzamv<T> zzamv, zzakk zzakk) {
        T zza2 = zzamv.zza();
        zzc(zza2, zzamv, zzakk);
        zzamv.zzd(zza2);
        return zza2;
    }

    public final <T> void zza(T t6, zzamv<T> zzamv, zzakk zzakk) {
        zzb(3);
        zzc(t6, zzamv, zzakk);
    }

    public final void zza(List<Boolean> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzajn) {
            zzajn zzajn = (zzajn) list;
            int i2 = this.zzb & 7;
            if (i2 == 0) {
                do {
                    zzajn.zza(this.zza.zzu());
                    if (!this.zza.zzt()) {
                        zzi2 = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
            } else if (i2 == 2) {
                int zzc2 = this.zza.zzc() + this.zza.zzj();
                do {
                    zzajn.zza(this.zza.zzu());
                } while (this.zza.zzc() < zzc2);
                zza(zzc2);
            } else {
                throw zzalf.zza();
            }
        } else {
            int i5 = this.zzb & 7;
            if (i5 == 0) {
                do {
                    list.add(Boolean.valueOf(this.zza.zzu()));
                    if (!this.zza.zzt()) {
                        zzi = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi == this.zzb);
                this.zzd = zzi;
            } else if (i5 == 2) {
                int zzc3 = this.zza.zzc() + this.zza.zzj();
                do {
                    list.add(Boolean.valueOf(this.zza.zzu()));
                } while (this.zza.zzc() < zzc3);
                zza(zzc3);
            } else {
                throw zzalf.zza();
            }
        }
    }

    private static void zzd(int i2) {
        if ((i2 & 7) != 0) {
            throw zzalf.zzg();
        }
    }

    private static void zzc(int i2) {
        if ((i2 & 3) != 0) {
            throw zzalf.zzg();
        }
    }

    @Deprecated
    public final <T> void zza(List<T> list, zzamv<T> zzamv, zzakk zzakk) {
        int zzi;
        int i2 = this.zzb;
        if ((i2 & 7) == 3) {
            do {
                list.add(zza(zzamv, zzakk));
                if (!this.zza.zzt() && this.zzd == 0) {
                    zzi = this.zza.zzi();
                } else {
                    return;
                }
            } while (zzi == i2);
            this.zzd = zzi;
            return;
        }
        throw zzalf.zza();
    }

    public final <K, V> void zza(Map<K, V> map, zzalx<K, V> zzalx, zzakk zzakk) {
        String str;
        zzb(2);
        int zza2 = this.zza.zza(this.zza.zzj());
        K k6 = zzalx.zzb;
        V v6 = zzalx.zzd;
        while (true) {
            try {
                int zzc2 = zzc();
                if (zzc2 == Integer.MAX_VALUE || this.zza.zzt()) {
                    map.put(k6, v6);
                } else {
                    str = "Unable to parse map entry.";
                    if (zzc2 == 1) {
                        k6 = zza(zzalx.zza, (Class<?>) null, (zzakk) null);
                    } else if (zzc2 == 2) {
                        v6 = zza(zzalx.zzc, zzalx.zzd.getClass(), zzakk);
                    } else if (!zzt()) {
                        throw new zzalf(str);
                    }
                }
            } catch (zzale e6) {
                if (!zzt()) {
                    throw new zzalf(str, e6);
                }
            } catch (Throwable th) {
                this.zza.zzc(zza2);
                throw th;
            }
        }
        map.put(k6, v6);
        this.zza.zzc(zza2);
    }

    private final void zza(List<String> list, boolean z3) {
        int zzi;
        int zzi2;
        if ((this.zzb & 7) != 2) {
            throw zzalf.zza();
        } else if (!(list instanceof zzaln) || z3) {
            do {
                list.add(z3 ? zzr() : zzq());
                if (!this.zza.zzt()) {
                    zzi = this.zza.zzi();
                } else {
                    return;
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
        } else {
            zzaln zzaln = (zzaln) list;
            do {
                zzaln.zza(zzp());
                if (!this.zza.zzt()) {
                    zzi2 = this.zza.zzi();
                } else {
                    return;
                }
            } while (zzi2 == this.zzb);
            this.zzd = zzi2;
        }
    }

    private final void zza(int i2) {
        if (this.zza.zzc() != i2) {
            throw zzalf.zzj();
        }
    }
}
