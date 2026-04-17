package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzami  reason: invalid package */
final class zzami<T> implements zzamv<T> {
    private final zzamc zza;
    private final zzano<?, ?> zzb;
    private final boolean zzc;
    private final zzakm<?> zzd;

    private zzami(zzano<?, ?> zzano, zzakm<?> zzakm, zzamc zzamc) {
        this.zzb = zzano;
        this.zzc = zzakm.zza(zzamc);
        this.zzd = zzakm;
        this.zza = zzamc;
    }

    public final int zza(T t6) {
        zzano<?, ?> zzano = this.zzb;
        int zzb2 = zzano.zzb(zzano.zzd(t6));
        return this.zzc ? zzb2 + this.zzd.zza((Object) t6).zza() : zzb2;
    }

    public final int zzb(T t6) {
        int hashCode = this.zzb.zzd(t6).hashCode();
        return this.zzc ? (hashCode * 53) + this.zzd.zza((Object) t6).hashCode() : hashCode;
    }

    public final void zzd(T t6) {
        this.zzb.zzf(t6);
        this.zzd.zzc(t6);
    }

    public final boolean zze(T t6) {
        return this.zzd.zza((Object) t6).zzg();
    }

    public final boolean zzb(T t6, T t7) {
        if (!this.zzb.zzd(t6).equals(this.zzb.zzd(t7))) {
            return false;
        }
        if (this.zzc) {
            return this.zzd.zza((Object) t6).equals(this.zzd.zza((Object) t7));
        }
        return true;
    }

    public static <T> zzami<T> zza(zzano<?, ?> zzano, zzakm<?> zzakm, zzamc zzamc) {
        return new zzami<>(zzano, zzakm, zzamc);
    }

    public final T zza() {
        zzamc zzamc = this.zza;
        if (zzamc instanceof zzaky) {
            return ((zzaky) zzamc).zzo();
        }
        return zzamc.zzq().zzf();
    }

    public final void zza(T t6, T t7) {
        zzamx.zza(this.zzb, t6, t7);
        if (this.zzc) {
            zzamx.zza(this.zzd, t6, t7);
        }
    }

    public final void zza(T t6, zzams zzams, zzakk zzakk) {
        boolean z3;
        zzano<?, ?> zzano = this.zzb;
        zzakm<?> zzakm = this.zzd;
        Object zzc2 = zzano.zzc(t6);
        zzakr<?> zzb2 = zzakm.zzb(t6);
        do {
            try {
                if (zzams.zzc() == Integer.MAX_VALUE) {
                    zzano.zzb((Object) t6, zzc2);
                    return;
                }
                int zzd2 = zzams.zzd();
                int i2 = 0;
                if (zzd2 == 11) {
                    Object obj = null;
                    zzajp zzajp = null;
                    while (zzams.zzc() != Integer.MAX_VALUE) {
                        int zzd3 = zzams.zzd();
                        if (zzd3 != 16) {
                            if (zzd3 != 26) {
                                if (zzd3 == 12 || !zzams.zzt()) {
                                    break;
                                }
                            } else if (obj != null) {
                                zzakm.zza(zzams, obj, zzakk, zzb2);
                            } else {
                                zzajp = zzams.zzp();
                            }
                        } else {
                            i2 = zzams.zzj();
                            obj = zzakm.zza(zzakk, this.zza, i2);
                        }
                    }
                    if (zzams.zzd() != 12) {
                        throw zzalf.zzb();
                    } else if (zzajp != null) {
                        if (obj != null) {
                            zzakm.zza(zzajp, obj, zzakk, zzb2);
                        } else {
                            zzano.zza(zzc2, i2, zzajp);
                        }
                    }
                } else if ((zzd2 & 7) == 2) {
                    Object zza2 = zzakm.zza(zzakk, this.zza, zzd2 >>> 3);
                    if (zza2 != null) {
                        zzakm.zza(zzams, zza2, zzakk, zzb2);
                    } else {
                        z3 = zzano.zza(zzc2, zzams, 0);
                        continue;
                    }
                } else {
                    z3 = zzams.zzt();
                    continue;
                }
                z3 = true;
                continue;
            } catch (Throwable th) {
                zzano.zzb((Object) t6, zzc2);
                throw th;
            }
        } while (z3);
        zzano.zzb((Object) t6, zzc2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: com.google.android.gms.internal.firebase-auth-api.zzaky$zzd} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(T r10, byte[] r11, int r12, int r13, com.google.android.gms.internal.p002firebaseauthapi.zzajk r14) {
        /*
            r9 = this;
            r0 = r10
            com.google.android.gms.internal.firebase-auth-api.zzaky r0 = (com.google.android.gms.internal.p002firebaseauthapi.zzaky) r0
            com.google.android.gms.internal.firebase-auth-api.zzann r1 = r0.zzb
            com.google.android.gms.internal.firebase-auth-api.zzann r2 = com.google.android.gms.internal.p002firebaseauthapi.zzann.zzc()
            if (r1 != r2) goto L_0x0011
            com.google.android.gms.internal.firebase-auth-api.zzann r1 = com.google.android.gms.internal.p002firebaseauthapi.zzann.zzd()
            r0.zzb = r1
        L_0x0011:
            com.google.android.gms.internal.firebase-auth-api.zzaky$zzb r10 = (com.google.android.gms.internal.p002firebaseauthapi.zzaky.zzb) r10
            r10.zza()
            r10 = 0
            r0 = r10
        L_0x0018:
            if (r12 >= r13) goto L_0x00a4
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzajl.zzc(r11, r12, r14)
            int r2 = r14.zza
            r12 = 11
            r3 = 2
            if (r2 == r12) goto L_0x0051
            r12 = r2 & 7
            if (r12 != r3) goto L_0x004c
            com.google.android.gms.internal.firebase-auth-api.zzakm<?> r12 = r9.zzd
            com.google.android.gms.internal.firebase-auth-api.zzakk r0 = r14.zzd
            com.google.android.gms.internal.firebase-auth-api.zzamc r3 = r9.zza
            int r5 = r2 >>> 3
            java.lang.Object r12 = r12.zza(r0, r3, r5)
            r0 = r12
            com.google.android.gms.internal.firebase-auth-api.zzaky$zzd r0 = (com.google.android.gms.internal.p002firebaseauthapi.zzaky.zzd) r0
            if (r0 != 0) goto L_0x0043
            r3 = r11
            r5 = r13
            r6 = r1
            r7 = r14
            int r12 = com.google.android.gms.internal.p002firebaseauthapi.zzajl.zza((int) r2, (byte[]) r3, (int) r4, (int) r5, (com.google.android.gms.internal.p002firebaseauthapi.zzann) r6, (com.google.android.gms.internal.p002firebaseauthapi.zzajk) r7)
            goto L_0x0018
        L_0x0043:
            com.google.android.gms.internal.p002firebaseauthapi.zzamr.zza()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L_0x004c:
            int r12 = com.google.android.gms.internal.p002firebaseauthapi.zzajl.zza((int) r2, (byte[]) r11, (int) r4, (int) r13, (com.google.android.gms.internal.p002firebaseauthapi.zzajk) r14)
            goto L_0x0018
        L_0x0051:
            r12 = 0
            r2 = r10
        L_0x0053:
            if (r4 >= r13) goto L_0x0099
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzajl.zzc(r11, r4, r14)
            int r5 = r14.zza
            int r6 = r5 >>> 3
            r7 = r5 & 7
            if (r6 == r3) goto L_0x007b
            r8 = 3
            if (r6 == r8) goto L_0x0065
            goto L_0x0090
        L_0x0065:
            if (r0 != 0) goto L_0x0072
            if (r7 != r3) goto L_0x0090
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzajl.zza(r11, r4, r14)
            java.lang.Object r2 = r14.zzc
            com.google.android.gms.internal.firebase-auth-api.zzajp r2 = (com.google.android.gms.internal.p002firebaseauthapi.zzajp) r2
            goto L_0x0053
        L_0x0072:
            com.google.android.gms.internal.p002firebaseauthapi.zzamr.zza()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L_0x007b:
            if (r7 != 0) goto L_0x0090
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzajl.zzc(r11, r4, r14)
            int r12 = r14.zza
            com.google.android.gms.internal.firebase-auth-api.zzakm<?> r0 = r9.zzd
            com.google.android.gms.internal.firebase-auth-api.zzakk r5 = r14.zzd
            com.google.android.gms.internal.firebase-auth-api.zzamc r6 = r9.zza
            java.lang.Object r0 = r0.zza(r5, r6, r12)
            com.google.android.gms.internal.firebase-auth-api.zzaky$zzd r0 = (com.google.android.gms.internal.p002firebaseauthapi.zzaky.zzd) r0
            goto L_0x0053
        L_0x0090:
            r6 = 12
            if (r5 == r6) goto L_0x0099
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzajl.zza((int) r5, (byte[]) r11, (int) r4, (int) r13, (com.google.android.gms.internal.p002firebaseauthapi.zzajk) r14)
            goto L_0x0053
        L_0x0099:
            if (r2 == 0) goto L_0x00a1
            int r12 = r12 << 3
            r12 = r12 | r3
            r1.zza((int) r12, (java.lang.Object) r2)
        L_0x00a1:
            r12 = r4
            goto L_0x0018
        L_0x00a4:
            if (r12 != r13) goto L_0x00a7
            return
        L_0x00a7:
            com.google.android.gms.internal.firebase-auth-api.zzalf r10 = com.google.android.gms.internal.p002firebaseauthapi.zzalf.zzg()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzami.zza(java.lang.Object, byte[], int, int, com.google.android.gms.internal.firebase-auth-api.zzajk):void");
    }

    public final void zza(T t6, zzaof zzaof) {
        Iterator<Map.Entry<?, Object>> zzd2 = this.zzd.zza((Object) t6).zzd();
        while (zzd2.hasNext()) {
            Map.Entry next = zzd2.next();
            zzakt zzakt = (zzakt) next.getKey();
            if (zzakt.zzc() != zzaod.MESSAGE || zzakt.zze() || zzakt.zzd()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (next instanceof zzalj) {
                zzaof.zza(zzakt.zza(), (Object) ((zzalj) next).zza().zzb());
            } else {
                zzaof.zza(zzakt.zza(), next.getValue());
            }
        }
        zzano<?, ?> zzano = this.zzb;
        zzano.zza(zzano.zzd(t6), zzaof);
    }
}
