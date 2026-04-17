package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import h0.C0552a;
import java.io.CharConversionException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzmy  reason: invalid package */
public final class zzmy {
    /* access modifiers changed from: private */
    public static final Object zza = new Object();
    /* access modifiers changed from: private */
    public static final String zzb = "zzmy";
    private zzbv zzc;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzmy$zza */
    public static final class zza {
        /* access modifiers changed from: private */
        public Context zza = null;
        /* access modifiers changed from: private */
        public String zzb = null;
        /* access modifiers changed from: private */
        public String zzc = null;
        private String zzd = null;
        private zzbe zze = null;
        private boolean zzf = true;
        private zzbn zzg = null;
        private zzww zzh = null;
        /* access modifiers changed from: private */
        public zzbv zzi;

        private static zzbv zza(byte[] bArr) {
            return zzbv.zza(zzcc.zza(zzbd.zza(bArr), zzbj.zza()));
        }

        private final zzbe zzb() {
            zzmy.zzd();
            zznd zznd = new zznd();
            try {
                boolean zzc2 = zznd.zzc(this.zzd);
                try {
                    return zznd.zza(this.zzd);
                } catch (GeneralSecurityException | ProviderException e6) {
                    if (zzc2) {
                        Log.w(zzmy.zzb, "cannot use Android Keystore, it'll be disabled", e6);
                        return null;
                    }
                    throw new KeyStoreException(C0552a.o("the master key ", this.zzd, " exists but is unusable"), e6);
                }
            } catch (GeneralSecurityException | ProviderException e7) {
                Log.w(zzmy.zzb, "cannot use Android Keystore, it'll be disabled", e7);
                return null;
            }
        }

        public final zza zza(zzww zzww) {
            this.zzh = zzww;
            return this;
        }

        public final zza zza(String str) {
            if (!str.startsWith("android-keystore://")) {
                throw new IllegalArgumentException("key URI must start with android-keystore://");
            } else if (this.zzf) {
                this.zzd = str;
                return this;
            } else {
                throw new IllegalArgumentException("cannot call withMasterKeyUri() after calling doNotUseKeystore()");
            }
        }

        public final zza zza(Context context, String str, String str2) {
            if (context != null) {
                this.zza = context;
                this.zzb = str;
                this.zzc = str2;
                return this;
            }
            throw new IllegalArgumentException("need an Android context");
        }

        public final synchronized zzmy zza() {
            zzmy zzmy;
            try {
                if (this.zzb != null) {
                    zzww zzww = this.zzh;
                    if (zzww != null && this.zzg == null) {
                        this.zzg = zzbn.zza(zzcm.zza(zzww.zzk()));
                    }
                    synchronized (zzmy.zza) {
                        byte[] zzb2 = zzb(this.zza, this.zzb, this.zzc);
                        if (zzb2 == null) {
                            if (this.zzd != null) {
                                this.zze = zzb();
                            }
                            zzbn zzbn = this.zzg;
                            if (zzbn != null) {
                                zzbq zza2 = zzbq.zza(zzbn);
                                zzmy.zza(zza2, new zznf(this.zza, this.zzb, this.zzc), this.zze);
                                this.zzi = zzbv.zza(zza2);
                            } else {
                                throw new GeneralSecurityException("cannot read or generate keyset");
                            }
                        } else if (this.zzd != null) {
                            zzmy.zzd();
                            this.zzi = zzb(zzb2);
                        } else {
                            this.zzi = zza(zzb2);
                        }
                        zzmy = new zzmy(this);
                    }
                } else {
                    throw new IllegalArgumentException("keysetName cannot be null");
                }
            } catch (Throwable th) {
                throw th;
            } finally {
                while (true) {
                }
            }
            return zzmy;
        }

        private final zzbv zzb(byte[] bArr) {
            try {
                this.zze = new zznd().zza(this.zzd);
                try {
                    return zzbv.zza(zzbq.zza(zzbd.zza(bArr), this.zze, new byte[0]));
                } catch (IOException | GeneralSecurityException e6) {
                    try {
                        return zza(bArr);
                    } catch (IOException unused) {
                        throw e6;
                    }
                }
            } catch (GeneralSecurityException | ProviderException e7) {
                try {
                    zzbv zza2 = zza(bArr);
                    Log.w(zzmy.zzb, "cannot use Android Keystore, it'll be disabled", e7);
                    return zza2;
                } catch (IOException unused2) {
                    throw e7;
                }
            }
        }

        private static byte[] zzb(Context context, String str, String str2) {
            SharedPreferences sharedPreferences;
            if (str != null) {
                Context applicationContext = context.getApplicationContext();
                if (str2 == null) {
                    sharedPreferences = PreferenceManager.getDefaultSharedPreferences(applicationContext);
                } else {
                    sharedPreferences = applicationContext.getSharedPreferences(str2, 0);
                }
                try {
                    String string = sharedPreferences.getString(str, (String) null);
                    if (string == null) {
                        return null;
                    }
                    return zzzr.zza(string);
                } catch (ClassCastException | IllegalArgumentException unused) {
                    throw new CharConversionException(C0552a.o("can't read keyset; the pref value ", str, " is not a valid hex string"));
                }
            } else {
                throw new IllegalArgumentException("keysetName cannot be null");
            }
        }
    }

    public static /* synthetic */ boolean zzd() {
        return true;
    }

    public final synchronized zzbq zza() {
        return this.zzc.zza();
    }

    private zzmy(zza zza2) {
        new zznf(zza2.zza, zza2.zzb, zza2.zzc);
        this.zzc = zza2.zzi;
    }

    public static /* synthetic */ void zza(zzbq zzbq, zzbx zzbx, zzbe zzbe) {
        if (zzbe != null) {
            try {
                zzbq.zza(zzbx, zzbe, new byte[0]);
            } catch (IOException e6) {
                throw new GeneralSecurityException(e6);
            }
        } else {
            zzcc.zza(zzbq, zzbx, zzbj.zza());
        }
    }
}
