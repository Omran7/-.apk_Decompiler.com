package com.google.android.gms.internal.play_billing;

import h0.C0552a;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import o3.d;

public class zzq implements zzeu {
    static final boolean zza = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    static final zzf zzb;
    public static final /* synthetic */ int zzf = 0;
    private static final Logger zzg;
    private static final Object zzh = new Object();
    volatile Object zzc;
    volatile zzj zzd;
    volatile zzo zze;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: com.google.android.gms.internal.play_billing.zzn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: com.google.android.gms.internal.play_billing.zzl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: com.google.android.gms.internal.play_billing.zzl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: com.google.android.gms.internal.play_billing.zzl} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.String r0 = "zzc"
            java.lang.Class<com.google.android.gms.internal.play_billing.zzo> r1 = com.google.android.gms.internal.play_billing.zzo.class
            java.lang.String r2 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r3 = "false"
            java.lang.String r2 = java.lang.System.getProperty(r2, r3)
            boolean r2 = java.lang.Boolean.parseBoolean(r2)
            zza = r2
            java.lang.Class<com.google.android.gms.internal.play_billing.zzq> r2 = com.google.android.gms.internal.play_billing.zzq.class
            java.lang.String r3 = r2.getName()
            java.util.logging.Logger r3 = java.util.logging.Logger.getLogger(r3)
            zzg = r3
            com.google.android.gms.internal.play_billing.zzl r3 = new com.google.android.gms.internal.play_billing.zzl     // Catch:{ all -> 0x0047 }
            java.lang.Class<java.lang.Thread> r4 = java.lang.Thread.class
            java.lang.String r5 = "zzb"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r4, r5)     // Catch:{ all -> 0x0047 }
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r1, r0)     // Catch:{ all -> 0x0047 }
            java.lang.String r4 = "zze"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r1, r4)     // Catch:{ all -> 0x0047 }
            java.lang.Class<com.google.android.gms.internal.play_billing.zzj> r1 = com.google.android.gms.internal.play_billing.zzj.class
            java.lang.String r4 = "zzd"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r1, r4)     // Catch:{ all -> 0x0047 }
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r9 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r1, r0)     // Catch:{ all -> 0x0047 }
            r4 = r3
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0047 }
            r0 = 0
        L_0x0045:
            r9 = r0
            goto L_0x004e
        L_0x0047:
            r0 = move-exception
            com.google.android.gms.internal.play_billing.zzn r3 = new com.google.android.gms.internal.play_billing.zzn
            r3.<init>()
            goto L_0x0045
        L_0x004e:
            zzb = r3
            if (r9 == 0) goto L_0x005f
            java.util.logging.Logger r4 = zzg
            java.util.logging.Level r5 = java.util.logging.Level.SEVERE
            java.lang.String r7 = "<clinit>"
            java.lang.String r8 = "SafeAtomicHelper is broken!"
            java.lang.String r6 = "com.android.billingclient.util.concurrent.AbstractResolvableFuture"
            r4.logp(r5, r6, r7, r8, r9)
        L_0x005f:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            zzh = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzq.<clinit>():void");
    }

    public static void zzc(zzq zzq) {
        zzo zzo;
        zzj zzj;
        do {
            zzo = zzq.zze;
        } while (!zzb.zze(zzq, zzo, zzo.zza));
        while (zzo != null) {
            Thread thread = zzo.zzb;
            if (thread != null) {
                zzo.zzb = null;
                LockSupport.unpark(thread);
            }
            zzo = zzo.zzc;
        }
        do {
            zzj = zzq.zzd;
        } while (!zzb.zzc(zzq, zzj, zzj.zza));
        zzj zzj2 = null;
        while (zzj != null) {
            zzj zzj3 = zzj.zzd;
            zzj.zzd = zzj2;
            zzj2 = zzj;
            zzj = zzj3;
        }
        while (zzj2 != null) {
            Runnable runnable = zzj2.zzb;
            zzj zzj4 = zzj2.zzd;
            if (!(runnable instanceof zzm)) {
                zzf(runnable, zzj2.zzc);
                zzj2 = zzj4;
            } else {
                zzq zzq2 = ((zzm) runnable).zza;
                throw null;
            }
        }
    }

    private final void zze(StringBuilder sb) {
        Object obj;
        String str;
        boolean z3 = false;
        while (true) {
            try {
                obj = get();
                break;
            } catch (InterruptedException unused) {
                z3 = true;
            } catch (ExecutionException e6) {
                sb.append("FAILURE, cause=[");
                sb.append(e6.getCause());
                sb.append("]");
                return;
            } catch (CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (RuntimeException e7) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e7.getClass());
                sb.append(" thrown from get()]");
                return;
            } catch (Throwable th) {
                if (z3) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z3) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        if (obj == this) {
            str = "this future";
        } else {
            str = String.valueOf(obj);
        }
        sb.append(str);
        sb.append("]");
    }

    private static void zzf(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e6) {
            zzg.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "executeListener", C0552a.p("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), e6);
        }
    }

    private final void zzg(zzo zzo) {
        zzo.zzb = null;
        while (true) {
            zzo zzo2 = this.zze;
            if (zzo2 != zzo.zza) {
                zzo zzo3 = null;
                while (zzo2 != null) {
                    zzo zzo4 = zzo2.zzc;
                    if (zzo2.zzb != null) {
                        zzo3 = zzo2;
                    } else if (zzo3 != null) {
                        zzo3.zzc = zzo4;
                        if (zzo3.zzb == null) {
                        }
                    } else if (!zzb.zze(this, zzo2, zzo4)) {
                    }
                    zzo2 = zzo4;
                }
                return;
            }
            return;
        }
    }

    private static final Object zzh(Object obj) {
        if (obj instanceof zzg) {
            Throwable th = ((zzg) obj).zzc;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof zzi) {
            throw new ExecutionException(((zzi) obj).zza);
        } else if (obj == zzh) {
            return null;
        } else {
            return obj;
        }
    }

    public final boolean cancel(boolean z3) {
        boolean z4;
        zzg zzg2;
        Object obj = this.zzc;
        boolean z5 = obj instanceof zzm;
        if (obj == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z5 || z4) {
            if (zza) {
                zzg2 = new zzg(z3, new CancellationException("Future.cancel() was called."));
            } else if (z3) {
                zzg2 = zzg.zza;
            } else {
                zzg2 = zzg.zzb;
            }
            while (!zzb.zzd(this, obj, zzg2)) {
                obj = this.zzc;
                if (!(obj instanceof zzm)) {
                }
            }
            zzc(this);
            if (!(obj instanceof zzm)) {
                return true;
            }
            zzeu zzeu = ((zzm) obj).zzb;
            throw null;
        }
        return false;
    }

    public final Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.zzc;
            if ((obj2 != null) && (!(obj2 instanceof zzm))) {
                return zzh(obj2);
            }
            zzo zzo = this.zze;
            if (zzo != zzo.zza) {
                zzo zzo2 = new zzo();
                do {
                    zzf zzf2 = zzb;
                    zzf2.zza(zzo2, zzo);
                    if (zzf2.zze(this, zzo, zzo2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.zzc;
                            } else {
                                zzg(zzo2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof zzm))));
                        return zzh(obj);
                    }
                    zzo = this.zze;
                } while (zzo != zzo.zza);
            }
            return zzh(this.zzc);
        }
        throw new InterruptedException();
    }

    public final boolean isCancelled() {
        return this.zzc instanceof zzg;
    }

    public final boolean isDone() {
        Object obj = this.zzc;
        return (obj != null) & (!(obj instanceof zzm));
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.zzc instanceof zzg) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            zze(sb);
        } else {
            try {
                str = zza();
            } catch (RuntimeException e6) {
                str = "Exception thrown from implementation: ".concat(String.valueOf(e6.getClass()));
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                zze(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public String zza() {
        Object obj = this.zzc;
        if (obj instanceof zzm) {
            zzeu zzeu = ((zzm) obj).zzb;
            return "setFuture=[null]";
        } else if (!(this instanceof ScheduledFuture)) {
            return null;
        } else {
            long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
            return "remaining delay=[" + delay + " ms]";
        }
    }

    public final void zzb(Runnable runnable, Executor executor) {
        executor.getClass();
        zzj zzj = this.zzd;
        if (zzj != zzj.zza) {
            zzj zzj2 = new zzj(runnable, executor);
            do {
                zzj2.zzd = zzj;
                if (!zzb.zzc(this, zzj, zzj2)) {
                    zzj = this.zzd;
                } else {
                    return;
                }
            } while (zzj != zzj.zza);
        }
        zzf(runnable, executor);
    }

    public boolean zzd(Object obj) {
        if (obj == null) {
            obj = zzh;
        }
        if (!zzb.zzd(this, (Object) null, obj)) {
            return false;
        }
        zzc(this);
        return true;
    }

    public final Object get(long j6, TimeUnit timeUnit) {
        long j7 = j6;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j7);
        if (!Thread.interrupted()) {
            Object obj = this.zzc;
            boolean z3 = true;
            if ((obj != null) && (!(obj instanceof zzm))) {
                return zzh(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                zzo zzo = this.zze;
                if (zzo != zzo.zza) {
                    zzo zzo2 = new zzo();
                    do {
                        zzf zzf2 = zzb;
                        zzf2.zza(zzo2, zzo);
                        if (zzf2.zze(this, zzo, zzo2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.zzc;
                                    if ((obj2 != null) && (!(obj2 instanceof zzm))) {
                                        return zzh(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    zzg(zzo2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            zzg(zzo2);
                        } else {
                            zzo = this.zze;
                        }
                    } while (zzo != zzo.zza);
                }
                return zzh(this.zzc);
            }
            while (nanos > 0) {
                Object obj3 = this.zzc;
                if ((obj3 != null) && (!(obj3 instanceof zzm))) {
                    return zzh(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String zzq = toString();
            String obj4 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj4.toLowerCase(locale);
            String str = "Waited " + j7 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String concat = str.concat(" (plus ");
                long j8 = -nanos;
                long convert = timeUnit2.convert(j8, TimeUnit.NANOSECONDS);
                long nanos2 = j8 - timeUnit2.toNanos(convert);
                int i2 = (convert > 0 ? 1 : (convert == 0 ? 0 : -1));
                if (i2 != 0 && nanos2 <= 1000) {
                    z3 = false;
                }
                if (i2 > 0) {
                    String str2 = concat + convert + " " + lowerCase;
                    if (z3) {
                        str2 = str2.concat(",");
                    }
                    concat = str2.concat(" ");
                }
                if (z3) {
                    concat = concat + nanos2 + " nanoseconds ";
                }
                str = concat.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(str.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(d.g(str, " for ", zzq));
        }
        throw new InterruptedException();
    }
}
