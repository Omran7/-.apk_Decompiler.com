package com.google.android.recaptcha.internal;

import G5.A;
import G5.C;
import G5.F;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Timer;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.j;
import n5.C0882n;
import n5.C0889u;
import o5.d;

public final class zzes implements zzeo {
    /* access modifiers changed from: private */
    public static Timer zza;
    private final Context zzb;
    private final zzet zzc;
    /* access modifiers changed from: private */
    public final C zzd;
    /* access modifiers changed from: private */
    public final zzei zze;

    public zzes(Context context, zzet zzet, C c3) {
        this.zzb = context;
        this.zzc = zzet;
        this.zzd = c3;
        zzei zzei = null;
        try {
            zzei zzc2 = zzei.zzd;
            zzc2 = zzc2 == null ? new zzei(context, (f) null) : zzc2;
            zzei.zzd = zzc2;
            zzei = zzc2;
        } catch (Exception unused) {
        }
        this.zze = zzei;
        zzh();
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [E5.e, java.lang.Object, o5.d] */
    /* access modifiers changed from: private */
    public final void zzg() {
        ArrayList<List> arrayList;
        zzei zzei;
        C0882n nVar;
        int i2;
        zzei zzei2 = this.zze;
        if (zzei2 != null) {
            List zzd2 = zzei2.zzd();
            j.e(zzd2, "<this>");
            if (zzd2 instanceof RandomAccess) {
                int size = zzd2.size();
                int i5 = size / 20;
                if (size % 20 == 0) {
                    i2 = 0;
                } else {
                    i2 = 1;
                }
                arrayList = new ArrayList<>(i5 + i2);
                int i6 = 0;
                while (i6 >= 0 && i6 < size) {
                    int i7 = size - i6;
                    if (20 <= i7) {
                        i7 = 20;
                    }
                    ArrayList arrayList2 = new ArrayList(i7);
                    for (int i8 = 0; i8 < i7; i8++) {
                        arrayList2.add(zzd2.get(i8 + i6));
                    }
                    arrayList.add(arrayList2);
                    i6 += 20;
                }
            } else {
                arrayList = new ArrayList<>();
                Iterator it2 = zzd2.iterator();
                j.e(it2, "iterator");
                if (!it2.hasNext()) {
                    nVar = C0882n.f10397a;
                } else {
                    C0889u uVar = new C0889u(it2, (d) null);
                    ? obj = new Object();
                    obj.f661c = uVar.create(obj, obj);
                    nVar = obj;
                }
                while (nVar.hasNext()) {
                    arrayList.add((List) nVar.next());
                }
            }
            for (List<zzej> it3 : arrayList) {
                zzrd zzi = zzrf.zzi();
                ArrayList arrayList3 = new ArrayList();
                for (zzej zzej : it3) {
                    try {
                        zztx zzk = zztx.zzk(zzkh.zzg().zzj(zzej.zzc()));
                        int zzN = zzk.zzN();
                        int i9 = zzN - 1;
                        if (zzN != 0) {
                            if (i9 == 0) {
                                zzi.zzq(zzk.zzf());
                            } else if (i9 == 1) {
                                zzi.zzr(zzk.zzg());
                            } else if (i9 != 2) {
                                throw new RuntimeException();
                            }
                            arrayList3.add(zzej);
                        } else {
                            throw null;
                        }
                    } catch (Exception unused) {
                        zzei zzei3 = this.zze;
                        if (zzei3 != null) {
                            zzei3.zzf(zzej);
                        }
                    }
                }
                if (zzi.zzf() + zzi.zze() != 0) {
                    if (this.zzc.zza(((zzrf) zzi.zzk()).zzd()) && (zzei = this.zze) != null) {
                        zzei.zza(arrayList3);
                    }
                }
            }
        }
    }

    private final void zzh() {
        if (zza == null) {
            Timer timer = new Timer();
            zza = timer;
            timer.schedule(new zzep(this), 120000, 120000);
        }
    }

    public final void zza(zztx zztx) {
        F.q(this.zzd, (A) null, new zzer(this, zztx, (d) null), 3);
        zzh();
    }
}
