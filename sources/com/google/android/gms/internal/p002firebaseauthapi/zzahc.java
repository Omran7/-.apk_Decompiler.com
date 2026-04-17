package com.google.android.gms.internal.p002firebaseauthapi;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.internal.I;
import e3.F;
import e3.G;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzahc  reason: invalid package */
public final class zzahc {
    private String zza;
    private String zzb;
    private boolean zzc;
    private String zzd;
    private String zze;
    private zzahs zzf;
    private String zzg;
    private long zzh;
    private long zzi;
    private boolean zzj;
    private G zzk;
    private List<zzahq> zzl;
    private zzaj<F> zzm;

    public zzahc() {
        this.zzf = new zzahs();
        this.zzm = zzaj.zzh();
    }

    public final long zza() {
        return this.zzh;
    }

    public final long zzb() {
        return this.zzi;
    }

    public final Uri zzc() {
        if (!TextUtils.isEmpty(this.zze)) {
            return Uri.parse(this.zze);
        }
        return null;
    }

    public final zzaj<F> zzd() {
        return this.zzm;
    }

    public final G zze() {
        return this.zzk;
    }

    public final zzahs zzf() {
        return this.zzf;
    }

    public final String zzg() {
        return this.zzd;
    }

    public final String zzh() {
        return this.zzb;
    }

    public final String zzi() {
        return this.zza;
    }

    public final String zzj() {
        return this.zzg;
    }

    public final List<zzahq> zzk() {
        return this.zzl;
    }

    public final List<zzaht> zzl() {
        return this.zzf.zza();
    }

    public final boolean zzm() {
        return this.zzc;
    }

    public final boolean zzn() {
        return this.zzj;
    }

    public final zzahc zza(G g) {
        this.zzk = g;
        return this;
    }

    public final zzahc zzb(String str) {
        this.zzb = str;
        return this;
    }

    public final zzahc zza(String str) {
        this.zzd = str;
        return this;
    }

    public final zzahc zzc(String str) {
        this.zze = str;
        return this;
    }

    public zzahc(String str, String str2, boolean z3, String str3, String str4, zzahs zzahs, String str5, String str6, long j6, long j7, boolean z4, G g, List<zzahq> list, zzaj<F> zzaj) {
        zzahs zzahs2;
        this.zza = str;
        this.zzb = str2;
        this.zzc = z3;
        this.zzd = str3;
        this.zze = str4;
        if (zzahs == null) {
            zzahs2 = new zzahs();
        } else {
            List<zzaht> zza2 = zzahs.zza();
            zzahs zzahs3 = new zzahs();
            if (zza2 != null) {
                zzahs3.zza().addAll(zza2);
            }
            zzahs2 = zzahs3;
        }
        this.zzf = zzahs2;
        this.zzg = str6;
        this.zzh = j6;
        this.zzi = j7;
        this.zzj = false;
        this.zzk = null;
        this.zzl = list == null ? new ArrayList<>() : list;
        this.zzm = zzaj;
    }

    public final zzahc zza(boolean z3) {
        this.zzj = z3;
        return this;
    }

    public final zzahc zza(zzaj<F> zzaj) {
        I.g(zzaj);
        this.zzm = zzaj;
        return this;
    }

    public final zzahc zza(List<zzaht> list) {
        I.g(list);
        zzahs zzahs = new zzahs();
        this.zzf = zzahs;
        zzahs.zza().addAll(list);
        return this;
    }
}
