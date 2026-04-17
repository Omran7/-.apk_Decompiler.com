package com.google.android.gms.internal.play_billing;

import h0.C0552a;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;
import o3.d;

abstract class zzes extends AtomicReference implements Runnable {
    private static final Runnable zza = new zzeq((zzer) null);
    private static final Runnable zzb = new zzeq((zzer) null);

    private final void zzg(Thread thread) {
        Runnable runnable = (Runnable) get();
        zzep zzep = null;
        boolean z3 = false;
        int i2 = 0;
        while (true) {
            if (!(runnable instanceof zzep)) {
                if (runnable != zzb) {
                    break;
                }
            } else {
                zzep = (zzep) runnable;
            }
            i2++;
            if (i2 > 1000) {
                Runnable runnable2 = zzb;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    if (Thread.interrupted() || z3) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    LockSupport.park(zzep);
                }
            } else {
                Thread.yield();
            }
            runnable = (Runnable) get();
        }
        if (z3) {
            thread.interrupt();
        }
    }

    public final void run() {
        Thread currentThread = Thread.currentThread();
        Object obj = null;
        if (compareAndSet((Object) null, currentThread)) {
            boolean zzf = zzf();
            if (!zzf) {
                try {
                    obj = zza();
                } catch (Throwable th) {
                    if (!compareAndSet(currentThread, zza)) {
                        zzg(currentThread);
                    }
                    zzd((Object) null);
                    throw th;
                }
            }
            if (!compareAndSet(currentThread, zza)) {
                zzg(currentThread);
            }
            if (!zzf) {
                zzd(obj);
            }
        }
    }

    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == zza) {
            str = "running=[DONE]";
        } else if (runnable instanceof zzep) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = C0552a.o("running=[RUNNING ON ", ((Thread) runnable).getName(), "]");
        } else {
            str = "running=[NOT STARTED YET]";
        }
        return d.g(str, ", ", zzb());
    }

    public abstract Object zza();

    public abstract String zzb();

    public abstract void zzc(Throwable th);

    public abstract void zzd(Object obj);

    public final void zze() {
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            zzep zzep = new zzep(this, (zzer) null);
            zzep.setExclusiveOwnerThread(Thread.currentThread());
            if (compareAndSet(runnable, zzep)) {
                try {
                    Thread thread = (Thread) runnable;
                    thread.interrupt();
                    if (((Runnable) getAndSet(zza)) == zzb) {
                        LockSupport.unpark(thread);
                    }
                } catch (Throwable th) {
                    if (((Runnable) getAndSet(zza)) == zzb) {
                        LockSupport.unpark((Thread) runnable);
                    }
                    throw th;
                }
            }
        }
    }

    public abstract boolean zzf();
}
