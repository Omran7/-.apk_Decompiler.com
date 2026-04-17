package com.google.android.recaptcha.internal;

import com.google.android.gms.common.api.f;
import java.util.List;

final class zzlj implements zzov {
    private final zzli zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzlj(zzli zzli) {
        byte[] bArr = zznl.zzb;
        this.zza = zzli;
        zzli.zzc = this;
    }

    private final void zzP(Object obj, zzow zzow, zzmo zzmo) {
        int i2 = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            zzow.zzh(obj, this, zzmo);
            if (this.zzb != this.zzc) {
                throw new zznn("Failed to parse the message.");
            }
        } finally {
            this.zzc = i2;
        }
    }

    private final void zzQ(Object obj, zzow zzow, zzmo zzmo) {
        zzli zzli = this.zza;
        int zzn = zzli.zzn();
        if (zzli.zza < zzli.zzb) {
            int zze = zzli.zze(zzn);
            this.zza.zza++;
            zzow.zzh(obj, this, zzmo);
            this.zza.zzz(0);
            zzli zzli2 = this.zza;
            zzli2.zza--;
            zzli2.zzA(zze);
            return;
        }
        throw new zznn("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    private final void zzR(int i2) {
        if (this.zza.zzd() != i2) {
            throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private final void zzS(int i2) {
        if ((this.zzb & 7) != i2) {
            throw new zznm("Protocol message tag had invalid wire type.");
        }
    }

    private static final void zzT(int i2) {
        if ((i2 & 3) != 0) {
            throw new zznn("Failed to parse the message.");
        }
    }

    private static final void zzU(int i2) {
        if ((i2 & 7) != 0) {
            throw new zznn("Failed to parse the message.");
        }
    }

    public static zzlj zzq(zzli zzli) {
        zzlj zzlj = zzli.zzc;
        if (zzlj != null) {
            return zzlj;
        }
        return new zzlj(zzli);
    }

    public final void zzA(List list) {
        int i2;
        int zzm;
        if (list instanceof zznx) {
            zznx zznx = (zznx) list;
            int i5 = this.zzb & 7;
            if (i5 == 1) {
                do {
                    zznx.zzg(this.zza.zzo());
                    if (!this.zza.zzC()) {
                        i2 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (i2 == this.zzb);
            } else if (i5 == 2) {
                int zzn = this.zza.zzn();
                zzU(zzn);
                int zzd2 = zzn + this.zza.zzd();
                do {
                    zznx.zzg(this.zza.zzo());
                } while (this.zza.zzd() < zzd2);
                return;
            } else {
                throw new zznm("Protocol message tag had invalid wire type.");
            }
        } else {
            int i6 = this.zzb & 7;
            if (i6 == 1) {
                do {
                    list.add(Long.valueOf(this.zza.zzo()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                i2 = zzm;
            } else if (i6 == 2) {
                int zzn2 = this.zza.zzn();
                zzU(zzn2);
                int zzd3 = zzn2 + this.zza.zzd();
                do {
                    list.add(Long.valueOf(this.zza.zzo()));
                } while (this.zza.zzd() < zzd3);
                return;
            } else {
                throw new zznm("Protocol message tag had invalid wire type.");
            }
        }
        this.zzd = i2;
    }

    public final void zzB(List list) {
        int i2;
        int zzm;
        if (list instanceof zzmv) {
            zzmv zzmv = (zzmv) list;
            int i5 = this.zzb & 7;
            if (i5 == 2) {
                int zzn = this.zza.zzn();
                zzT(zzn);
                int zzd2 = this.zza.zzd() + zzn;
                do {
                    zzmv.zzf(this.zza.zzc());
                } while (this.zza.zzd() < zzd2);
                return;
            } else if (i5 == 5) {
                do {
                    zzmv.zzf(this.zza.zzc());
                    if (!this.zza.zzC()) {
                        i2 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (i2 == this.zzb);
            } else {
                throw new zznm("Protocol message tag had invalid wire type.");
            }
        } else {
            int i6 = this.zzb & 7;
            if (i6 == 2) {
                int zzn2 = this.zza.zzn();
                zzT(zzn2);
                int zzd3 = this.zza.zzd() + zzn2;
                do {
                    list.add(Float.valueOf(this.zza.zzc()));
                } while (this.zza.zzd() < zzd3);
                return;
            } else if (i6 == 5) {
                do {
                    list.add(Float.valueOf(this.zza.zzc()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                i2 = zzm;
            } else {
                throw new zznm("Protocol message tag had invalid wire type.");
            }
        }
        this.zzd = i2;
    }

    @Deprecated
    public final void zzC(List list, zzow zzow, zzmo zzmo) {
        int zzm;
        int i2 = this.zzb;
        if ((i2 & 7) == 3) {
            do {
                Object zze = zzow.zze();
                zzP(zze, zzow, zzmo);
                zzow.zzf(zze);
                list.add(zze);
                if (!this.zza.zzC() && this.zzd == 0) {
                    zzm = this.zza.zzm();
                } else {
                    return;
                }
            } while (zzm == i2);
            this.zzd = zzm;
            return;
        }
        throw new zznm("Protocol message tag had invalid wire type.");
    }

    public final void zzD(List list) {
        int i2;
        int zzm;
        if (list instanceof zzne) {
            zzne zzne = (zzne) list;
            int i5 = this.zzb & 7;
            if (i5 == 0) {
                do {
                    zzne.zzh(this.zza.zzh());
                    if (!this.zza.zzC()) {
                        i2 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (i2 == this.zzb);
            } else if (i5 == 2) {
                zzli zzli = this.zza;
                int zzd2 = zzli.zzd() + zzli.zzn();
                do {
                    zzne.zzh(this.zza.zzh());
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
                return;
            } else {
                throw new zznm("Protocol message tag had invalid wire type.");
            }
        } else {
            int i6 = this.zzb & 7;
            if (i6 == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzh()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                i2 = zzm;
            } else if (i6 == 2) {
                zzli zzli2 = this.zza;
                int zzd3 = zzli2.zzd() + zzli2.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzh()));
                } while (this.zza.zzd() < zzd3);
                zzR(zzd3);
                return;
            } else {
                throw new zznm("Protocol message tag had invalid wire type.");
            }
        }
        this.zzd = i2;
    }

    public final void zzE(List list) {
        int i2;
        int zzm;
        if (list instanceof zznx) {
            zznx zznx = (zznx) list;
            int i5 = this.zzb & 7;
            if (i5 == 0) {
                do {
                    zznx.zzg(this.zza.zzp());
                    if (!this.zza.zzC()) {
                        i2 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (i2 == this.zzb);
            } else if (i5 == 2) {
                zzli zzli = this.zza;
                int zzd2 = zzli.zzd() + zzli.zzn();
                do {
                    zznx.zzg(this.zza.zzp());
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
                return;
            } else {
                throw new zznm("Protocol message tag had invalid wire type.");
            }
        } else {
            int i6 = this.zzb & 7;
            if (i6 == 0) {
                do {
                    list.add(Long.valueOf(this.zza.zzp()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                i2 = zzm;
            } else if (i6 == 2) {
                zzli zzli2 = this.zza;
                int zzd3 = zzli2.zzd() + zzli2.zzn();
                do {
                    list.add(Long.valueOf(this.zza.zzp()));
                } while (this.zza.zzd() < zzd3);
                zzR(zzd3);
                return;
            } else {
                throw new zznm("Protocol message tag had invalid wire type.");
            }
        }
        this.zzd = i2;
    }

    public final void zzF(List list, zzow zzow, zzmo zzmo) {
        int zzm;
        int i2 = this.zzb;
        if ((i2 & 7) == 2) {
            do {
                Object zze = zzow.zze();
                zzQ(zze, zzow, zzmo);
                zzow.zzf(zze);
                list.add(zze);
                if (!this.zza.zzC() && this.zzd == 0) {
                    zzm = this.zza.zzm();
                } else {
                    return;
                }
            } while (zzm == i2);
            this.zzd = zzm;
            return;
        }
        throw new zznm("Protocol message tag had invalid wire type.");
    }

    public final void zzG(List list) {
        int i2;
        int zzm;
        if (list instanceof zzne) {
            zzne zzne = (zzne) list;
            int i5 = this.zzb & 7;
            if (i5 == 2) {
                int zzn = this.zza.zzn();
                zzT(zzn);
                int zzd2 = this.zza.zzd() + zzn;
                do {
                    zzne.zzh(this.zza.zzk());
                } while (this.zza.zzd() < zzd2);
                return;
            } else if (i5 == 5) {
                do {
                    zzne.zzh(this.zza.zzk());
                    if (!this.zza.zzC()) {
                        i2 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (i2 == this.zzb);
            } else {
                throw new zznm("Protocol message tag had invalid wire type.");
            }
        } else {
            int i6 = this.zzb & 7;
            if (i6 == 2) {
                int zzn2 = this.zza.zzn();
                zzT(zzn2);
                int zzd3 = this.zza.zzd() + zzn2;
                do {
                    list.add(Integer.valueOf(this.zza.zzk()));
                } while (this.zza.zzd() < zzd3);
                return;
            } else if (i6 == 5) {
                do {
                    list.add(Integer.valueOf(this.zza.zzk()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                i2 = zzm;
            } else {
                throw new zznm("Protocol message tag had invalid wire type.");
            }
        }
        this.zzd = i2;
    }

    public final void zzH(List list) {
        int i2;
        int zzm;
        if (list instanceof zznx) {
            zznx zznx = (zznx) list;
            int i5 = this.zzb & 7;
            if (i5 == 1) {
                do {
                    zznx.zzg(this.zza.zzt());
                    if (!this.zza.zzC()) {
                        i2 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (i2 == this.zzb);
            } else if (i5 == 2) {
                int zzn = this.zza.zzn();
                zzU(zzn);
                int zzd2 = zzn + this.zza.zzd();
                do {
                    zznx.zzg(this.zza.zzt());
                } while (this.zza.zzd() < zzd2);
                return;
            } else {
                throw new zznm("Protocol message tag had invalid wire type.");
            }
        } else {
            int i6 = this.zzb & 7;
            if (i6 == 1) {
                do {
                    list.add(Long.valueOf(this.zza.zzt()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                i2 = zzm;
            } else if (i6 == 2) {
                int zzn2 = this.zza.zzn();
                zzU(zzn2);
                int zzd3 = zzn2 + this.zza.zzd();
                do {
                    list.add(Long.valueOf(this.zza.zzt()));
                } while (this.zza.zzd() < zzd3);
                return;
            } else {
                throw new zznm("Protocol message tag had invalid wire type.");
            }
        }
        this.zzd = i2;
    }

    public final void zzI(List list) {
        int i2;
        int zzm;
        if (list instanceof zzne) {
            zzne zzne = (zzne) list;
            int i5 = this.zzb & 7;
            if (i5 == 0) {
                do {
                    zzne.zzh(this.zza.zzl());
                    if (!this.zza.zzC()) {
                        i2 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (i2 == this.zzb);
            } else if (i5 == 2) {
                zzli zzli = this.zza;
                int zzd2 = zzli.zzd() + zzli.zzn();
                do {
                    zzne.zzh(this.zza.zzl());
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
                return;
            } else {
                throw new zznm("Protocol message tag had invalid wire type.");
            }
        } else {
            int i6 = this.zzb & 7;
            if (i6 == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzl()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                i2 = zzm;
            } else if (i6 == 2) {
                zzli zzli2 = this.zza;
                int zzd3 = zzli2.zzd() + zzli2.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzl()));
                } while (this.zza.zzd() < zzd3);
                zzR(zzd3);
                return;
            } else {
                throw new zznm("Protocol message tag had invalid wire type.");
            }
        }
        this.zzd = i2;
    }

    public final void zzJ(List list) {
        int i2;
        int zzm;
        if (list instanceof zznx) {
            zznx zznx = (zznx) list;
            int i5 = this.zzb & 7;
            if (i5 == 0) {
                do {
                    zznx.zzg(this.zza.zzu());
                    if (!this.zza.zzC()) {
                        i2 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (i2 == this.zzb);
            } else if (i5 == 2) {
                zzli zzli = this.zza;
                int zzd2 = zzli.zzd() + zzli.zzn();
                do {
                    zznx.zzg(this.zza.zzu());
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
                return;
            } else {
                throw new zznm("Protocol message tag had invalid wire type.");
            }
        } else {
            int i6 = this.zzb & 7;
            if (i6 == 0) {
                do {
                    list.add(Long.valueOf(this.zza.zzu()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                i2 = zzm;
            } else if (i6 == 2) {
                zzli zzli2 = this.zza;
                int zzd3 = zzli2.zzd() + zzli2.zzn();
                do {
                    list.add(Long.valueOf(this.zza.zzu()));
                } while (this.zza.zzd() < zzd3);
                zzR(zzd3);
                return;
            } else {
                throw new zznm("Protocol message tag had invalid wire type.");
            }
        }
        this.zzd = i2;
    }

    public final void zzK(List list, boolean z3) {
        String str;
        int zzm;
        int i2;
        if ((this.zzb & 7) == 2) {
            if ((list instanceof zznu) && !z3) {
                zznu zznu = (zznu) list;
                do {
                    zzp();
                    zznu.zzb();
                    if (!this.zza.zzC()) {
                        i2 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (i2 == this.zzb);
            } else {
                do {
                    if (z3) {
                        str = zzs();
                    } else {
                        str = zzr();
                    }
                    list.add(str);
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                i2 = zzm;
            }
            this.zzd = i2;
            return;
        }
        throw new zznm("Protocol message tag had invalid wire type.");
    }

    public final void zzL(List list) {
        int i2;
        int zzm;
        if (list instanceof zzne) {
            zzne zzne = (zzne) list;
            int i5 = this.zzb & 7;
            if (i5 == 0) {
                do {
                    zzne.zzh(this.zza.zzn());
                    if (!this.zza.zzC()) {
                        i2 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (i2 == this.zzb);
            } else if (i5 == 2) {
                zzli zzli = this.zza;
                int zzd2 = zzli.zzd() + zzli.zzn();
                do {
                    zzne.zzh(this.zza.zzn());
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
                return;
            } else {
                throw new zznm("Protocol message tag had invalid wire type.");
            }
        } else {
            int i6 = this.zzb & 7;
            if (i6 == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzn()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                i2 = zzm;
            } else if (i6 == 2) {
                zzli zzli2 = this.zza;
                int zzd3 = zzli2.zzd() + zzli2.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzn()));
                } while (this.zza.zzd() < zzd3);
                zzR(zzd3);
                return;
            } else {
                throw new zznm("Protocol message tag had invalid wire type.");
            }
        }
        this.zzd = i2;
    }

    public final void zzM(List list) {
        int i2;
        int zzm;
        if (list instanceof zznx) {
            zznx zznx = (zznx) list;
            int i5 = this.zzb & 7;
            if (i5 == 0) {
                do {
                    zznx.zzg(this.zza.zzv());
                    if (!this.zza.zzC()) {
                        i2 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (i2 == this.zzb);
            } else if (i5 == 2) {
                zzli zzli = this.zza;
                int zzd2 = zzli.zzd() + zzli.zzn();
                do {
                    zznx.zzg(this.zza.zzv());
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
                return;
            } else {
                throw new zznm("Protocol message tag had invalid wire type.");
            }
        } else {
            int i6 = this.zzb & 7;
            if (i6 == 0) {
                do {
                    list.add(Long.valueOf(this.zza.zzv()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                i2 = zzm;
            } else if (i6 == 2) {
                zzli zzli2 = this.zza;
                int zzd3 = zzli2.zzd() + zzli2.zzn();
                do {
                    list.add(Long.valueOf(this.zza.zzv()));
                } while (this.zza.zzd() < zzd3);
                zzR(zzd3);
                return;
            } else {
                throw new zznm("Protocol message tag had invalid wire type.");
            }
        }
        this.zzd = i2;
    }

    public final boolean zzN() {
        zzS(0);
        return this.zza.zzD();
    }

    public final boolean zzO() {
        int i2;
        if (this.zza.zzC() || (i2 = this.zzb) == this.zzc) {
            return false;
        }
        return this.zza.zzE(i2);
    }

    public final double zza() {
        zzS(1);
        return this.zza.zzb();
    }

    public final float zzb() {
        zzS(5);
        return this.zza.zzc();
    }

    public final int zzc() {
        int i2 = this.zzd;
        if (i2 != 0) {
            this.zzb = i2;
            this.zzd = 0;
        } else {
            i2 = this.zza.zzm();
            this.zzb = i2;
        }
        if (i2 == 0 || i2 == this.zzc) {
            return f.API_PRIORITY_OTHER;
        }
        return i2 >>> 3;
    }

    public final int zzd() {
        return this.zzb;
    }

    public final int zze() {
        zzS(0);
        return this.zza.zzf();
    }

    public final int zzf() {
        zzS(5);
        return this.zza.zzg();
    }

    public final int zzg() {
        zzS(0);
        return this.zza.zzh();
    }

    public final int zzh() {
        zzS(5);
        return this.zza.zzk();
    }

    public final int zzi() {
        zzS(0);
        return this.zza.zzl();
    }

    public final int zzj() {
        zzS(0);
        return this.zza.zzn();
    }

    public final long zzk() {
        zzS(1);
        return this.zza.zzo();
    }

    public final long zzl() {
        zzS(0);
        return this.zza.zzp();
    }

    public final long zzm() {
        zzS(1);
        return this.zza.zzt();
    }

    public final long zzn() {
        zzS(0);
        return this.zza.zzu();
    }

    public final long zzo() {
        zzS(0);
        return this.zza.zzv();
    }

    public final zzle zzp() {
        zzS(2);
        return this.zza.zzw();
    }

    public final String zzr() {
        zzS(2);
        return this.zza.zzx();
    }

    public final String zzs() {
        zzS(2);
        return this.zza.zzy();
    }

    public final void zzt(Object obj, zzow zzow, zzmo zzmo) {
        zzS(3);
        zzP(obj, zzow, zzmo);
    }

    public final void zzu(Object obj, zzow zzow, zzmo zzmo) {
        zzS(2);
        zzQ(obj, zzow, zzmo);
    }

    public final void zzv(List list) {
        int i2;
        int zzm;
        if (list instanceof zzkv) {
            zzkv zzkv = (zzkv) list;
            int i5 = this.zzb & 7;
            if (i5 == 0) {
                do {
                    zzkv.zze(this.zza.zzD());
                    if (!this.zza.zzC()) {
                        i2 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (i2 == this.zzb);
            } else if (i5 == 2) {
                zzli zzli = this.zza;
                int zzd2 = zzli.zzd() + zzli.zzn();
                do {
                    zzkv.zze(this.zza.zzD());
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
                return;
            } else {
                throw new zznm("Protocol message tag had invalid wire type.");
            }
        } else {
            int i6 = this.zzb & 7;
            if (i6 == 0) {
                do {
                    list.add(Boolean.valueOf(this.zza.zzD()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                i2 = zzm;
            } else if (i6 == 2) {
                zzli zzli2 = this.zza;
                int zzd3 = zzli2.zzd() + zzli2.zzn();
                do {
                    list.add(Boolean.valueOf(this.zza.zzD()));
                } while (this.zza.zzd() < zzd3);
                zzR(zzd3);
                return;
            } else {
                throw new zznm("Protocol message tag had invalid wire type.");
            }
        }
        this.zzd = i2;
    }

    public final void zzw(List list) {
        int zzm;
        if ((this.zzb & 7) == 2) {
            do {
                list.add(zzp());
                if (!this.zza.zzC()) {
                    zzm = this.zza.zzm();
                } else {
                    return;
                }
            } while (zzm == this.zzb);
            this.zzd = zzm;
            return;
        }
        throw new zznm("Protocol message tag had invalid wire type.");
    }

    public final void zzx(List list) {
        int i2;
        int zzm;
        if (list instanceof zzmi) {
            zzmi zzmi = (zzmi) list;
            int i5 = this.zzb & 7;
            if (i5 == 1) {
                do {
                    zzmi.zzf(this.zza.zzb());
                    if (!this.zza.zzC()) {
                        i2 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (i2 == this.zzb);
            } else if (i5 == 2) {
                int zzn = this.zza.zzn();
                zzU(zzn);
                int zzd2 = zzn + this.zza.zzd();
                do {
                    zzmi.zzf(this.zza.zzb());
                } while (this.zza.zzd() < zzd2);
                return;
            } else {
                throw new zznm("Protocol message tag had invalid wire type.");
            }
        } else {
            int i6 = this.zzb & 7;
            if (i6 == 1) {
                do {
                    list.add(Double.valueOf(this.zza.zzb()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                i2 = zzm;
            } else if (i6 == 2) {
                int zzn2 = this.zza.zzn();
                zzU(zzn2);
                int zzd3 = zzn2 + this.zza.zzd();
                do {
                    list.add(Double.valueOf(this.zza.zzb()));
                } while (this.zza.zzd() < zzd3);
                return;
            } else {
                throw new zznm("Protocol message tag had invalid wire type.");
            }
        }
        this.zzd = i2;
    }

    public final void zzy(List list) {
        int i2;
        int zzm;
        if (list instanceof zzne) {
            zzne zzne = (zzne) list;
            int i5 = this.zzb & 7;
            if (i5 == 0) {
                do {
                    zzne.zzh(this.zza.zzf());
                    if (!this.zza.zzC()) {
                        i2 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (i2 == this.zzb);
            } else if (i5 == 2) {
                zzli zzli = this.zza;
                int zzd2 = zzli.zzd() + zzli.zzn();
                do {
                    zzne.zzh(this.zza.zzf());
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
                return;
            } else {
                throw new zznm("Protocol message tag had invalid wire type.");
            }
        } else {
            int i6 = this.zzb & 7;
            if (i6 == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzf()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                i2 = zzm;
            } else if (i6 == 2) {
                zzli zzli2 = this.zza;
                int zzd3 = zzli2.zzd() + zzli2.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzf()));
                } while (this.zza.zzd() < zzd3);
                zzR(zzd3);
                return;
            } else {
                throw new zznm("Protocol message tag had invalid wire type.");
            }
        }
        this.zzd = i2;
    }

    public final void zzz(List list) {
        int i2;
        int zzm;
        if (list instanceof zzne) {
            zzne zzne = (zzne) list;
            int i5 = this.zzb & 7;
            if (i5 == 2) {
                int zzn = this.zza.zzn();
                zzT(zzn);
                int zzd2 = this.zza.zzd() + zzn;
                do {
                    zzne.zzh(this.zza.zzg());
                } while (this.zza.zzd() < zzd2);
                return;
            } else if (i5 == 5) {
                do {
                    zzne.zzh(this.zza.zzg());
                    if (!this.zza.zzC()) {
                        i2 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (i2 == this.zzb);
            } else {
                throw new zznm("Protocol message tag had invalid wire type.");
            }
        } else {
            int i6 = this.zzb & 7;
            if (i6 == 2) {
                int zzn2 = this.zza.zzn();
                zzT(zzn2);
                int zzd3 = this.zza.zzd() + zzn2;
                do {
                    list.add(Integer.valueOf(this.zza.zzg()));
                } while (this.zza.zzd() < zzd3);
                return;
            } else if (i6 == 5) {
                do {
                    list.add(Integer.valueOf(this.zza.zzg()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                i2 = zzm;
            } else {
                throw new zznm("Protocol message tag had invalid wire type.");
            }
        }
        this.zzd = i2;
    }
}
