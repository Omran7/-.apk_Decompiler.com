package com.google.android.gms.internal.p002firebaseauthapi;

import A.h;
import C1.a;
import I1.c;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Base64;
import com.google.android.gms.internal.p000authapiphone.zzab;
import e3.s;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o3.d;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafu  reason: invalid package */
final class zzafu {
    /* access modifiers changed from: private */
    public static final a zza = new a("FirebaseAuth", "SmsRetrieverHelper");
    private final Context zzb;
    private final ScheduledExecutorService zzc;
    /* access modifiers changed from: private */
    public final HashMap<String, zzagb> zzd = new HashMap<>();

    public zzafu(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.zzb = context;
        this.zzc = scheduledExecutorService;
    }

    /* access modifiers changed from: private */
    public final void zze(String str) {
        zzagb zzagb = this.zzd.get(str);
        if (zzagb != null) {
            if (!zzagb.zzi) {
                zzd(str);
            }
            zzb(str);
        }
    }

    public final String zzb() {
        Signature[] signatureArr;
        try {
            String packageName = this.zzb.getPackageName();
            if (Build.VERSION.SDK_INT < 28) {
                signatureArr = c.a(this.zzb).i(64, packageName).signatures;
            } else {
                signatureArr = c.a(this.zzb).i(134217728, packageName).signingInfo.getApkContentsSigners();
            }
            String zza2 = zza(packageName, signatureArr[0].toCharsString());
            if (zza2 != null) {
                return zza2;
            }
            zza.c("Hash generation failed.", new Object[0]);
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            zza.c("Unable to find package to obtain hash.", new Object[0]);
            return null;
        }
    }

    /* access modifiers changed from: private */
    public final void zzd(String str) {
        zzagb zzagb = this.zzd.get(str);
        if (zzagb != null && !zzagb.zzh && !zzae.zzc(zzagb.zzd)) {
            zza.f("Timed out waiting for SMS.", new Object[0]);
            for (zzaeg zza2 : zzagb.zzb) {
                zza2.zza(zzagb.zzd);
            }
            zzagb.zzi = true;
        }
    }

    public final boolean zzc(String str) {
        return this.zzd.get(str) != null;
    }

    public final zzaeg zza(zzaeg zzaeg, String str) {
        return new zzafz(this, zzaeg, str);
    }

    public static String zza(String str) {
        Matcher matcher = Pattern.compile("(?<!\\d)\\d{6}(?!\\d)").matcher(str);
        if (matcher.find()) {
            return matcher.group();
        }
        return null;
    }

    private static String zza(String str, String str2) {
        String g = d.g(str, " ", str2);
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(g.getBytes(StandardCharsets.UTF_8));
            String substring = Base64.encodeToString(Arrays.copyOf(instance.digest(), 9), 3).substring(0, 11);
            a aVar = zza;
            aVar.a("Package: " + str + " -- Hash: " + substring, new Object[0]);
            return substring;
        } catch (NoSuchAlgorithmException e6) {
            zza.c(d.i("NoSuchAlgorithm: ", e6.getMessage()), new Object[0]);
            return null;
        }
    }

    public static void zzb(zzafu zzafu, String str) {
        zzagb zzagb = zzafu.zzd.get(str);
        if (zzagb != null && !zzae.zzc(zzagb.zzd) && !zzae.zzc(zzagb.zze) && !zzagb.zzb.isEmpty()) {
            for (zzaeg zza2 : zzagb.zzb) {
                zza2.zza(new s(zzagb.zzd, zzagb.zze, (String) null, (String) null, true));
            }
            zzagb.zzh = true;
        }
    }

    public final void zzb(zzaeg zzaeg, String str) {
        zzagb zzagb = this.zzd.get(str);
        if (zzagb != null) {
            zzagb.zzb.add(zzaeg);
            if (zzagb.zzg) {
                zzaeg.zzb(zzagb.zzd);
            }
            if (zzagb.zzh) {
                zzaeg.zza(new s(zzagb.zzd, zzagb.zze, (String) null, (String) null, true));
            }
            if (zzagb.zzi) {
                zzaeg.zza(zzagb.zzd);
            }
        }
    }

    public final void zza(String str, zzaeg zzaeg, long j6, boolean z3) {
        this.zzd.put(str, new zzagb(j6, z3));
        zzb(zzaeg, str);
        zzagb zzagb = this.zzd.get(str);
        if (zzagb.zza <= 0) {
            zza.f("Timeout of 0 specified; SmsRetriever will not start.", new Object[0]);
            return;
        }
        zzagb.zzf = this.zzc.schedule(new zzafx(this, str), zzagb.zza, TimeUnit.SECONDS);
        if (!zzagb.zzc) {
            zza.f("SMS auto-retrieval unavailable; SmsRetriever will not start.", new Object[0]);
            return;
        }
        zzafy zzafy = new zzafy(this, str);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.gms.auth.api.phone.SMS_RETRIEVED");
        h.registerReceiver(this.zzb.getApplicationContext(), zzafy, intentFilter, 2);
        new zzab(this.zzb).startSmsRetriever().addOnFailureListener(new zzafw(this));
    }

    public final void zzb(String str) {
        zzagb zzagb = this.zzd.get(str);
        if (zzagb != null) {
            ScheduledFuture<?> scheduledFuture = zzagb.zzf;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                zzagb.zzf.cancel(false);
            }
            zzagb.zzb.clear();
            this.zzd.remove(str);
        }
    }
}
