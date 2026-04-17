package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.f;
import java.util.List;

public final class zzhx extends zzmd implements zzni {
    /* access modifiers changed from: private */
    public static final zzhx zzb;
    private long zzA;
    private int zzB;
    private String zzC = "";
    private String zzD = "";
    private boolean zzE;
    /* access modifiers changed from: private */
    public zzmj zzF = zzmd.zzcn();
    private String zzG = "";
    private int zzH;
    private int zzI;
    private int zzJ;
    private String zzK = "";
    private long zzL;
    private long zzM;
    private String zzN = "";
    private String zzO = "";
    private int zzP;
    private String zzQ = "";
    private zzia zzR;
    private zzmh zzS = zzmd.zzck();
    private long zzT;
    private long zzU;
    private String zzV = "";
    private String zzW = "";
    private int zzX;
    private boolean zzY;
    private String zzZ = "";
    private boolean zzaa;
    private zzhs zzab;
    private String zzac = "";
    private zzmj zzad = zzmd.zzcn();
    private String zzae = "";
    private long zzaf;
    private boolean zzag;
    private String zzah = "";
    private boolean zzai;
    private String zzaj = "";
    private int zzak;
    private String zzal = "";
    private zzhg zzam;
    private int zzan;
    private zzhc zzao;
    private String zzap = "";
    private zzim zzaq;
    private long zzar;
    private String zzas = "";
    private int zzd;
    private int zze;
    private int zzf;
    /* access modifiers changed from: private */
    public zzmj zzg = zzmd.zzcn();
    private zzmj zzh = zzmd.zzcn();
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private String zzn = "";
    private String zzo = "";
    private String zzp = "";
    private String zzq = "";
    private int zzr;
    private String zzs = "";
    private String zzt = "";
    private String zzu = "";
    private long zzv;
    private long zzw;
    private String zzx = "";
    private boolean zzy;
    private String zzz = "";

    static {
        zzhx zzhx = new zzhx();
        zzb = zzhx;
        zzmd.zzct(zzhx.class, zzhx);
    }

    private zzhx() {
    }

    public static zzhw zzA(zzhx zzhx) {
        zzlz zzcg = zzb.zzcg();
        zzcg.zzaY(zzhx);
        return (zzhw) zzcg;
    }

    public static /* synthetic */ void zzZ(zzhx zzhx, Iterable iterable) {
        zzmj zzmj = zzhx.zzF;
        if (!zzmj.zzc()) {
            zzhx.zzF = zzmd.zzco(zzmj);
        }
        zzko.zzcc(iterable, zzhx.zzF);
    }

    public static /* synthetic */ void zzaA(zzhx zzhx, String str) {
        str.getClass();
        zzhx.zzd |= 2048;
        zzhx.zzs = str;
    }

    public static /* synthetic */ void zzaB(zzhx zzhx, String str) {
        str.getClass();
        zzhx.zzd |= 8192;
        zzhx.zzu = str;
    }

    public static /* synthetic */ void zzaC(zzhx zzhx, int i2) {
        zzhx.zzd |= 33554432;
        zzhx.zzH = i2;
    }

    public static /* synthetic */ void zzaD(zzhx zzhx, zzhg zzhg) {
        zzhg.getClass();
        zzhx.zzam = zzhg;
        zzhx.zze |= 4194304;
    }

    public static /* synthetic */ void zzaE(zzhx zzhx, long j6) {
        zzhx.zze |= 134217728;
        zzhx.zzar = j6;
    }

    public static /* synthetic */ void zzaF(zzhx zzhx, int i2) {
        zzhx.zzd |= 1048576;
        zzhx.zzB = i2;
    }

    public static /* synthetic */ void zzaG(zzhx zzhx, long j6) {
        zzhx.zze |= 32;
        zzhx.zzU = j6;
    }

    public static /* synthetic */ void zzaH(zzhx zzhx, long j6) {
        zzhx.zzd |= 536870912;
        zzhx.zzL = j6;
    }

    public static /* synthetic */ void zzaI(zzhx zzhx, String str) {
        zzhx.zze |= 131072;
        zzhx.zzah = str;
    }

    public static /* synthetic */ void zzaJ(zzhx zzhx, String str) {
        zzhx.zze |= 128;
        zzhx.zzW = str;
    }

    public static /* synthetic */ void zzaK(zzhx zzhx, String str) {
        str.getClass();
        zzhx.zze |= 524288;
        zzhx.zzaj = str;
    }

    public static /* synthetic */ void zzaL(zzhx zzhx, int i2) {
        zzhx.zze |= 8388608;
        zzhx.zzan = i2;
    }

    public static /* synthetic */ void zzaM(zzhx zzhx, long j6) {
        zzhx.zzd |= 524288;
        zzhx.zzA = j6;
    }

    public static /* synthetic */ void zzaN(zzhx zzhx, String str) {
        str.getClass();
        zzhx.zzd |= 256;
        zzhx.zzp = str;
    }

    public static /* synthetic */ void zzaO(zzhx zzhx, String str) {
        str.getClass();
        zzhx.zzd |= Integer.MIN_VALUE;
        zzhx.zzN = str;
    }

    public static /* synthetic */ void zzaP(zzhx zzhx, long j6) {
        zzhx.zze |= 16;
        zzhx.zzT = j6;
    }

    public static /* synthetic */ void zzaQ(zzhx zzhx, boolean z3) {
        zzhx.zze |= 65536;
        zzhx.zzag = z3;
    }

    public static /* synthetic */ void zzaR(zzhx zzhx, long j6) {
        zzhx.zzd |= 8;
        zzhx.zzk = j6;
    }

    public static /* synthetic */ void zzaS(zzhx zzhx, String str) {
        str.getClass();
        zzhx.zze |= 16384;
        zzhx.zzae = str;
    }

    public static /* synthetic */ void zzaT(zzhx zzhx, int i2, zzhm zzhm) {
        zzhm.getClass();
        zzhx.zzcx();
        zzhx.zzg.set(i2, zzhm);
    }

    public static /* synthetic */ void zzaU(zzhx zzhx, String str) {
        zzhx.zze |= 268435456;
        zzhx.zzas = "";
    }

    public static /* synthetic */ void zzaV(zzhx zzhx, String str) {
        str.getClass();
        zzhx.zzd |= 16777216;
        zzhx.zzG = str;
    }

    public static /* synthetic */ void zzaW(zzhx zzhx, String str) {
        str.getClass();
        zzhx.zzd |= 4194304;
        zzhx.zzD = str;
    }

    public static /* synthetic */ void zzaX(zzhx zzhx, long j6) {
        zzhx.zzd |= 16384;
        zzhx.zzv = j6;
    }

    public static /* synthetic */ void zzaY(zzhx zzhx, String str) {
        zzhx.zzd |= 2097152;
        zzhx.zzC = str;
    }

    public static /* synthetic */ void zzaZ(zzhx zzhx, boolean z3) {
        zzhx.zze |= 262144;
        zzhx.zzai = z3;
    }

    public static /* synthetic */ void zzaa(zzhx zzhx, Iterable iterable) {
        zzhx.zzcx();
        zzko.zzcc(iterable, zzhx.zzg);
    }

    public static /* synthetic */ void zzab(zzhx zzhx, Iterable iterable) {
        zzmh zzmh = zzhx.zzS;
        if (!zzmh.zzc()) {
            int size = zzmh.size();
            zzhx.zzS = zzmh.zzg(size + size);
        }
        zzko.zzcc(iterable, zzhx.zzS);
    }

    public static /* synthetic */ void zzac(zzhx zzhx, Iterable iterable) {
        zzmj zzmj = zzhx.zzad;
        if (!zzmj.zzc()) {
            zzhx.zzad = zzmd.zzco(zzmj);
        }
        zzko.zzcc(iterable, zzhx.zzad);
    }

    public static /* synthetic */ void zzad(zzhx zzhx, Iterable iterable) {
        zzhx.zzcy();
        zzko.zzcc(iterable, zzhx.zzh);
    }

    public static /* synthetic */ void zzae(zzhx zzhx, zzhm zzhm) {
        zzhm.getClass();
        zzhx.zzcx();
        zzhx.zzg.add(zzhm);
    }

    public static /* synthetic */ void zzaf(zzhx zzhx, zzio zzio) {
        zzio.getClass();
        zzhx.zzcy();
        zzhx.zzh.add(zzio);
    }

    public static /* synthetic */ void zzag(zzhx zzhx) {
        zzhx.zzd &= -262145;
        zzhx.zzz = zzb.zzz;
    }

    public static /* synthetic */ void zzai(zzhx zzhx) {
        zzhx.zzd &= -257;
        zzhx.zzp = zzb.zzp;
    }

    public static /* synthetic */ void zzaj(zzhx zzhx) {
        zzhx.zzd &= f.API_PRIORITY_OTHER;
        zzhx.zzN = zzb.zzN;
    }

    public static /* synthetic */ void zzal(zzhx zzhx) {
        zzhx.zzd &= -2097153;
        zzhx.zzC = zzb.zzC;
    }

    public static /* synthetic */ void zzam(zzhx zzhx) {
        zzhx.zzd &= -131073;
        zzhx.zzy = false;
    }

    public static /* synthetic */ void zzan(zzhx zzhx) {
        zzhx.zzd &= -33;
        zzhx.zzm = 0;
    }

    public static /* synthetic */ void zzao(zzhx zzhx) {
        zzhx.zzd &= -17;
        zzhx.zzl = 0;
    }

    public static /* synthetic */ void zzap(zzhx zzhx) {
        zzhx.zzd &= -65537;
        zzhx.zzx = zzb.zzx;
    }

    public static /* synthetic */ void zzaq(zzhx zzhx) {
        zzhx.zze &= -8193;
        zzhx.zzac = zzb.zzac;
    }

    public static /* synthetic */ void zzar(zzhx zzhx) {
        zzhx.zzd &= -268435457;
        zzhx.zzK = zzb.zzK;
    }

    public static /* synthetic */ void zzas(zzhx zzhx) {
        zzhx.zzd &= -3;
        zzhx.zzi = 0;
    }

    public static /* synthetic */ void zzat(zzhx zzhx, int i2) {
        zzhx.zzcx();
        zzhx.zzg.remove(i2);
    }

    public static /* synthetic */ void zzau(zzhx zzhx, int i2) {
        zzhx.zzcy();
        zzhx.zzh.remove(i2);
    }

    public static /* synthetic */ void zzav(zzhx zzhx, zzhc zzhc) {
        zzhc.getClass();
        zzhx.zzao = zzhc;
        zzhx.zze |= 16777216;
    }

    public static /* synthetic */ void zzaw(zzhx zzhx, int i2) {
        zzhx.zze |= 1048576;
        zzhx.zzak = i2;
    }

    public static /* synthetic */ void zzax(zzhx zzhx, String str) {
        str.getClass();
        zzhx.zze |= 4;
        zzhx.zzQ = str;
    }

    public static /* synthetic */ void zzay(zzhx zzhx, String str) {
        str.getClass();
        zzhx.zzd |= 4096;
        zzhx.zzt = str;
    }

    public static /* synthetic */ void zzaz(zzhx zzhx, String str) {
        str.getClass();
        zzhx.zzd |= 262144;
        zzhx.zzz = str;
    }

    public static /* synthetic */ void zzba(zzhx zzhx, boolean z3) {
        zzhx.zzd |= 131072;
        zzhx.zzy = z3;
    }

    public static /* synthetic */ void zzbb(zzhx zzhx, String str) {
        str.getClass();
        zzhx.zzd |= 128;
        zzhx.zzo = str;
    }

    public static /* synthetic */ void zzbc(zzhx zzhx, String str) {
        zzhx.zzd |= 64;
        zzhx.zzn = "android";
    }

    public static /* synthetic */ void zzbd(zzhx zzhx, zzia zzia) {
        zzia.getClass();
        zzhx.zzR = zzia;
        zzhx.zze |= 8;
    }

    public static /* synthetic */ void zzbe(zzhx zzhx, long j6) {
        zzhx.zzd |= 32;
        zzhx.zzm = j6;
    }

    public static /* synthetic */ void zzbf(zzhx zzhx, long j6) {
        zzhx.zzd |= 16;
        zzhx.zzl = j6;
    }

    public static /* synthetic */ void zzbg(zzhx zzhx, int i2) {
        zzhx.zzd |= 1;
        zzhx.zzf = 1;
    }

    public static /* synthetic */ void zzbh(zzhx zzhx, String str) {
        str.getClass();
        zzhx.zzd |= 65536;
        zzhx.zzx = str;
    }

    public static /* synthetic */ void zzbi(zzhx zzhx, int i2) {
        zzhx.zze |= 2;
        zzhx.zzP = i2;
    }

    public static /* synthetic */ void zzbj(zzhx zzhx, boolean z3) {
        zzhx.zzd |= 8388608;
        zzhx.zzE = z3;
    }

    public static /* synthetic */ void zzbk(zzhx zzhx, String str) {
        str.getClass();
        zzhx.zze |= 8192;
        zzhx.zzac = str;
    }

    public static /* synthetic */ void zzbl(zzhx zzhx, zzim zzim) {
        zzhx.zzaq = zzim;
        zzhx.zze |= 67108864;
    }

    public static /* synthetic */ void zzbm(zzhx zzhx, long j6) {
        zzhx.zzd |= 4;
        zzhx.zzj = j6;
    }

    public static /* synthetic */ void zzbn(zzhx zzhx, long j6) {
        zzhx.zze |= 32768;
        zzhx.zzaf = j6;
    }

    public static /* synthetic */ void zzbo(zzhx zzhx, int i2) {
        zzhx.zzd |= 1024;
        zzhx.zzr = i2;
    }

    public static /* synthetic */ void zzbp(zzhx zzhx, long j6) {
        zzhx.zzd |= 2;
        zzhx.zzi = j6;
    }

    public static /* synthetic */ void zzbq(zzhx zzhx, long j6) {
        zzhx.zzd |= 32768;
        zzhx.zzw = 119002;
    }

    public static /* synthetic */ void zzbr(zzhx zzhx, int i2, zzio zzio) {
        zzio.getClass();
        zzhx.zzcy();
        zzhx.zzh.set(i2, zzio);
    }

    public static /* synthetic */ void zzbs(zzhx zzhx, String str) {
        str.getClass();
        zzhx.zzd |= 512;
        zzhx.zzq = str;
    }

    private final void zzcx() {
        zzmj zzmj = this.zzg;
        if (!zzmj.zzc()) {
            this.zzg = zzmd.zzco(zzmj);
        }
    }

    private final void zzcy() {
        zzmj zzmj = this.zzh;
        if (!zzmj.zzc()) {
            this.zzh = zzmd.zzco(zzmj);
        }
    }

    public static zzhw zzz() {
        return (zzhw) zzb.zzcg();
    }

    public final zzim zzC() {
        zzim zzim = this.zzaq;
        if (zzim == null) {
            return zzim.zzd();
        }
        return zzim;
    }

    public final zzio zzD(int i2) {
        return (zzio) this.zzh.get(i2);
    }

    public final String zzE() {
        return this.zzQ;
    }

    public final String zzF() {
        return this.zzt;
    }

    public final String zzG() {
        return this.zzz;
    }

    public final String zzH() {
        return this.zzs;
    }

    public final String zzI() {
        return this.zzu;
    }

    public final String zzJ() {
        return this.zzah;
    }

    public final String zzK() {
        return this.zzW;
    }

    public final String zzL() {
        return this.zzaj;
    }

    public final String zzM() {
        return this.zzp;
    }

    public final String zzN() {
        return this.zzN;
    }

    public final String zzO() {
        return this.zzG;
    }

    public final String zzP() {
        return this.zzD;
    }

    public final String zzQ() {
        return this.zzC;
    }

    public final String zzR() {
        return this.zzo;
    }

    public final String zzS() {
        return this.zzn;
    }

    public final String zzT() {
        return this.zzx;
    }

    public final String zzU() {
        return this.zzac;
    }

    public final String zzV() {
        return this.zzq;
    }

    public final List zzW() {
        return this.zzF;
    }

    public final List zzX() {
        return this.zzg;
    }

    public final List zzY() {
        return this.zzh;
    }

    public final int zza() {
        return this.zzak;
    }

    public final int zzb() {
        return this.zzH;
    }

    public final boolean zzbA() {
        return (this.zze & 134217728) != 0;
    }

    public final boolean zzbB() {
        return (this.zzd & 1048576) != 0;
    }

    public final boolean zzbC() {
        return (this.zzd & 536870912) != 0;
    }

    public final boolean zzbD() {
        return (this.zze & 131072) != 0;
    }

    public final boolean zzbE() {
        return (this.zze & 128) != 0;
    }

    public final boolean zzbF() {
        return (this.zze & 524288) != 0;
    }

    public final boolean zzbG() {
        return (this.zze & 8388608) != 0;
    }

    public final boolean zzbH() {
        return (this.zzd & 524288) != 0;
    }

    public final boolean zzbI() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public final boolean zzbJ() {
        return (this.zze & 16) != 0;
    }

    public final boolean zzbK() {
        return (this.zzd & 8) != 0;
    }

    public final boolean zzbL() {
        return (this.zzd & 16384) != 0;
    }

    public final boolean zzbM() {
        return (this.zze & 262144) != 0;
    }

    public final boolean zzbN() {
        return (this.zzd & 131072) != 0;
    }

    public final boolean zzbO() {
        return (this.zzd & 32) != 0;
    }

    public final boolean zzbP() {
        return (this.zzd & 16) != 0;
    }

    public final boolean zzbQ() {
        return (this.zzd & 1) != 0;
    }

    public final boolean zzbR() {
        return (this.zze & 2) != 0;
    }

    public final boolean zzbS() {
        return (this.zzd & 8388608) != 0;
    }

    public final boolean zzbT() {
        return (this.zze & 8192) != 0;
    }

    public final boolean zzbU() {
        return (this.zze & 67108864) != 0;
    }

    public final boolean zzbV() {
        return (this.zzd & 4) != 0;
    }

    public final boolean zzbW() {
        return (this.zze & 32768) != 0;
    }

    public final boolean zzbX() {
        return (this.zzd & 1024) != 0;
    }

    public final boolean zzbY() {
        return (this.zzd & 2) != 0;
    }

    public final boolean zzbZ() {
        return (this.zzd & 32768) != 0;
    }

    public final boolean zzbt() {
        return this.zzag;
    }

    public final boolean zzbu() {
        return this.zzai;
    }

    public final boolean zzbv() {
        return this.zzy;
    }

    public final boolean zzbw() {
        return this.zzE;
    }

    public final boolean zzbx() {
        return (this.zze & 16777216) != 0;
    }

    public final boolean zzby() {
        return (this.zzd & 33554432) != 0;
    }

    public final boolean zzbz() {
        return (this.zze & 4194304) != 0;
    }

    public final int zzc() {
        return this.zzB;
    }

    public final int zzd() {
        return this.zzan;
    }

    public final int zze() {
        return this.zzg.size();
    }

    public final int zzf() {
        return this.zzf;
    }

    public final int zzg() {
        return this.zzP;
    }

    public final int zzh() {
        return this.zzr;
    }

    public final int zzi() {
        return this.zzh.size();
    }

    public final long zzj() {
        return this.zzar;
    }

    public final long zzk() {
        return this.zzL;
    }

    public final Object zzl(int i2, Object obj, Object obj2) {
        int i5 = i2 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzmd.zzcq(zzb, "\u0004B\u0000\u0002\u0001SB\u0000\u0005\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5᠌(7ဇ)9ဈ*:ဇ+;ဉ,?ဈ-@\u001aAဈ.Cဂ/Dဇ0Gဈ1Hဇ2Iဈ3Jင4Kဈ5Lဉ6Mင7Oဉ8Pဈ9Qဉ:Rဂ;Sဈ<", new Object[]{"zzd", "zze", "zzf", "zzg", zzhm.class, "zzh", zzio.class, "zzi", "zzj", "zzk", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzl", "zzE", "zzF", zzhi.class, "zzG", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", "zzX", zzha.zza, "zzY", "zzZ", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzaf", "zzag", "zzah", "zzai", "zzaj", "zzak", "zzal", "zzam", "zzan", "zzao", "zzap", "zzaq", "zzar", "zzas"});
        } else if (i5 == 3) {
            return new zzhx();
        } else {
            if (i5 == 4) {
                return new zzhw((zzip) null);
            }
            if (i5 == 5) {
                return zzb;
            }
            throw null;
        }
    }

    public final long zzm() {
        return this.zzA;
    }

    public final long zzn() {
        return this.zzT;
    }

    public final long zzo() {
        return this.zzk;
    }

    public final long zzp() {
        return this.zzv;
    }

    public final long zzq() {
        return this.zzm;
    }

    public final long zzr() {
        return this.zzl;
    }

    public final long zzs() {
        return this.zzj;
    }

    public final long zzt() {
        return this.zzaf;
    }

    public final long zzu() {
        return this.zzi;
    }

    public final long zzv() {
        return this.zzw;
    }

    public final zzhc zzw() {
        zzhc zzhc = this.zzao;
        if (zzhc == null) {
            return zzhc.zze();
        }
        return zzhc;
    }

    public final zzhg zzx() {
        zzhg zzhg = this.zzam;
        if (zzhg == null) {
            return zzhg.zzc();
        }
        return zzhg;
    }

    public final zzhm zzy(int i2) {
        return (zzhm) this.zzg.get(i2);
    }
}
