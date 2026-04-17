package com.google.android.gms.internal.p002firebaseauthapi;

import R2.i;
import android.app.Activity;
import android.app.PendingIntent;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.d;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import e3.C0492C;
import e3.C0493a;
import e3.C0495c;
import e3.C0496d;
import e3.m;
import e3.n;
import e3.s;
import e3.u;
import e3.w;
import e3.y;
import f3.C0523A;
import f3.C0528e;
import f3.C0529f;
import f3.C0530g;
import f3.C0532i;
import f3.C0533j;
import f3.C0534k;
import f3.t;
import f3.v;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import z1.C1132b;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzach  reason: invalid package */
public final class zzach extends zzafg {
    public zzach(i iVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.zza = new zzaef(iVar, scheduledExecutorService);
        this.zzb = executor;
    }

    public final Task<Void> zza(i iVar, String str, String str2) {
        return zza((zzack) new zzack(str, str2).zza(iVar));
    }

    public final Task<Object> zzb(i iVar, String str, String str2) {
        return zza((zzacj) new zzacj(str, str2).zza(iVar));
    }

    public final Task<C0532i> zzc(i iVar, String str, String str2) {
        return zza((zzacn) new zzacn(str, str2).zza(iVar));
    }

    public final Task<Void> zzd(i iVar, m mVar, String str, t tVar) {
        return zza((zzadx) new zzadx(str).zza(iVar).zza(mVar).zza(tVar).zza((C0533j) tVar));
    }

    public final Task<Void> zza(i iVar, String str, String str2, String str3) {
        return zza((zzacm) new zzacm(str, str2, str3).zza(iVar));
    }

    public final Task<Void> zzb(i iVar, String str, C0493a aVar, String str2, String str3) {
        aVar.f7634r = 6;
        return zza((zzadk) new zzadk(str, aVar, str2, str3, "sendSignInLinkToEmail").zza(iVar));
    }

    public final Task<C0523A> zzc(i iVar, m mVar, C0495c cVar, String str, t tVar) {
        return zza((zzada) new zzada(cVar, str).zza(iVar).zza(mVar).zza(tVar).zza((C0533j) tVar));
    }

    public final Task<C0523A> zza(i iVar, String str, String str2, String str3, String str4, v vVar) {
        return zza((zzacl) new zzacl(str, str2, str3, str4).zza(iVar).zza(vVar));
    }

    public final Task<String> zzd(i iVar, String str, String str2) {
        return zza((zzaeb) new zzaeb(str, str2).zza(iVar));
    }

    public final Task<Void> zzb(i iVar, m mVar, C0495c cVar, String str, t tVar) {
        return zza((zzacx) new zzacx(cVar, str).zza(iVar).zza(mVar).zza(tVar).zza((C0533j) tVar));
    }

    public final Task<Void> zzc(i iVar, m mVar, String str, t tVar) {
        return zza((zzady) new zzady(str).zza(iVar).zza(mVar).zza(tVar).zza((C0533j) tVar));
    }

    public final Task<Void> zza(m mVar, C0534k kVar) {
        return zza((zzaco) new zzaco().zza(mVar).zza(kVar).zza((C0533j) kVar));
    }

    public final Task<C0523A> zzb(i iVar, m mVar, C0496d dVar, String str, t tVar) {
        return zza((zzadc) new zzadc(dVar, str).zza(iVar).zza(mVar).zza(tVar).zza((C0533j) tVar));
    }

    public final Task<Void> zza(i iVar, e3.v vVar, m mVar, String str, v vVar2) {
        zzaft.zza();
        zzacq zzacq = new zzacq(vVar, ((C0528e) mVar).f7920a.zzf(), str, (String) null);
        zzacq.zza(iVar).zza(vVar2);
        return zza(zzacq);
    }

    public final Task<C0523A> zzb(i iVar, m mVar, String str, String str2, String str3, String str4, t tVar) {
        return zza((zzade) new zzade(str, str2, str3, str4).zza(iVar).zza(mVar).zza(tVar).zza((C0533j) tVar));
    }

    public final Task<Void> zza(i iVar, y yVar, m mVar, String str, String str2, v vVar) {
        zzacq zzacq = new zzacq(yVar, ((C0528e) mVar).f7920a.zzf(), str, str2);
        zzacq.zza(iVar).zza(vVar);
        return zza(zzacq);
    }

    public final Task<C0523A> zzb(i iVar, m mVar, s sVar, String str, t tVar) {
        zzaft.zza();
        return zza((zzadg) new zzadg(sVar, str).zza(iVar).zza(mVar).zza(tVar).zza((C0533j) tVar));
    }

    public final Task<C0523A> zza(i iVar, m mVar, e3.v vVar, String str, v vVar2) {
        zzaft.zza();
        zzacp zzacp = new zzacp(vVar, str, (String) null);
        zzacp.zza(iVar).zza(vVar2);
        if (mVar != null) {
            zzacp.zza(mVar);
        }
        return zza(zzacp);
    }

    public final Task<C0523A> zzb(i iVar, String str, String str2, String str3, String str4, v vVar) {
        return zza((zzadn) new zzadn(str, str2, str3, str4).zza(iVar).zza(vVar));
    }

    public final Task<C0523A> zza(i iVar, m mVar, y yVar, String str, String str2, v vVar) {
        zzacp zzacp = new zzacp(yVar, str, str2);
        zzacp.zza(iVar).zza(vVar);
        if (mVar != null) {
            zzacp.zza(mVar);
        }
        return zza(zzacp);
    }

    public final Task<C0523A> zzb(i iVar, m mVar, String str, t tVar) {
        I.g(iVar);
        I.d(str);
        I.g(mVar);
        I.g(tVar);
        ArrayList arrayList = ((C0528e) mVar).f7924f;
        if ((arrayList != null && !arrayList.contains(str)) || mVar.w()) {
            return Tasks.forException(zzaei.zza(new Status(17016, str, (PendingIntent) null, (C1132b) null)));
        }
        str.getClass();
        if (!str.equals("password")) {
            return zza((zzadv) new zzadv(str).zza(iVar).zza(mVar).zza(tVar).zza((C0533j) tVar));
        }
        return zza((zzadw) new zzadw().zza(iVar).zza(mVar).zza(tVar).zza((C0533j) tVar));
    }

    public final Task<Void> zza(i iVar, String str, C0493a aVar, String str2, String str3) {
        aVar.f7634r = 1;
        return zza((zzadk) new zzadk(str, aVar, str2, str3, "sendPasswordResetEmail").zza(iVar));
    }

    public final Task<Void> zza(String str, String str2, C0493a aVar) {
        aVar.f7634r = 7;
        return zza(new zzaec(str, str2, aVar));
    }

    public final Task<n> zza(i iVar, m mVar, String str, t tVar) {
        return zza((zzacs) new zzacs(str).zza(iVar).zza(mVar).zza(tVar).zza((C0533j) tVar));
    }

    public final Task<zzahj> zza() {
        return zza(new zzacr());
    }

    public final Task<zzahk> zza(String str, String str2) {
        return zza(new zzacu(str, str2));
    }

    public final Task<C0523A> zza(i iVar, m mVar, C0495c cVar, String str, t tVar) {
        I.g(iVar);
        I.g(cVar);
        I.g(mVar);
        I.g(tVar);
        ArrayList arrayList = ((C0528e) mVar).f7924f;
        if (arrayList != null && arrayList.contains(cVar.v())) {
            return Tasks.forException(zzaei.zza(new Status(17015, (String) null, (PendingIntent) null, (C1132b) null)));
        }
        if (cVar instanceof C0496d) {
            C0496d dVar = (C0496d) cVar;
            if (TextUtils.isEmpty(dVar.f7642c)) {
                return zza((zzact) new zzact(dVar, str).zza(iVar).zza(mVar).zza(tVar).zza((C0533j) tVar));
            }
            return zza((zzacy) new zzacy(dVar).zza(iVar).zza(mVar).zza(tVar).zza((C0533j) tVar));
        } else if (!(cVar instanceof s)) {
            return zza((zzacw) new zzacw(cVar).zza(iVar).zza(mVar).zza(tVar).zza((C0533j) tVar));
        } else {
            zzaft.zza();
            return zza((zzacv) new zzacv((s) cVar).zza(iVar).zza(mVar).zza(tVar).zza((C0533j) tVar));
        }
    }

    public final Task<Void> zza(i iVar, m mVar, C0496d dVar, String str, t tVar) {
        return zza((zzacz) new zzacz(dVar, str).zza(iVar).zza(mVar).zza(tVar).zza((C0533j) tVar));
    }

    public final Task<Void> zza(i iVar, m mVar, String str, String str2, String str3, String str4, t tVar) {
        return zza((zzadb) new zzadb(str, str2, str3, str4).zza(iVar).zza(mVar).zza(tVar).zza((C0533j) tVar));
    }

    public final Task<Void> zza(i iVar, m mVar, s sVar, String str, t tVar) {
        zzaft.zza();
        return zza((zzadd) new zzadd(sVar, str).zza(iVar).zza(mVar).zza(tVar).zza((C0533j) tVar));
    }

    public final Task<Void> zza(i iVar, m mVar, t tVar) {
        return zza((zzadf) new zzadf().zza(iVar).zza(mVar).zza(tVar).zza((C0533j) tVar));
    }

    public final Task<Void> zza(String str, String str2, String str3, String str4) {
        return zza(new zzadi(str, str2, str3, str4));
    }

    public final Task<Void> zza(i iVar, C0493a aVar, String str) {
        return zza((zzadh) new zzadh(str, aVar).zza(iVar));
    }

    public final Task<Void> zza(String str) {
        return zza(new zzadj(str));
    }

    public final Task<C0523A> zza(i iVar, v vVar, String str) {
        return zza((zzadm) new zzadm(str).zza(iVar).zza(vVar));
    }

    public final Task<C0523A> zza(i iVar, C0495c cVar, String str, v vVar) {
        return zza((zzadl) new zzadl(cVar, str).zza(iVar).zza(vVar));
    }

    public final Task<C0523A> zza(i iVar, String str, String str2, v vVar) {
        return zza((zzado) new zzado(str, str2).zza(iVar).zza(vVar));
    }

    public final Task<C0523A> zza(i iVar, C0496d dVar, String str, v vVar) {
        return zza((zzadq) new zzadq(dVar, str).zza(iVar).zza(vVar));
    }

    public final Task<C0523A> zza(i iVar, s sVar, String str, v vVar) {
        zzaft.zza();
        return zza((zzadp) new zzadp(sVar, str).zza(iVar).zza(vVar));
    }

    public final Task<Void> zza(C0530g gVar, String str, String str2, long j6, boolean z3, boolean z4, String str3, String str4, String str5, boolean z5, u uVar, Executor executor, Activity activity) {
        zzads zzads = new zzads(gVar, str, str2, j6, z3, z4, str3, str4, str5, z5);
        String str6 = str;
        zzads.zza(uVar, activity, executor, str);
        return zza(zzads);
    }

    public final Task<zzaij> zza(C0530g gVar, String str) {
        return zza(new zzadr(gVar, str));
    }

    public final Task<Void> zza(C0530g gVar, w wVar, String str, long j6, boolean z3, boolean z4, String str2, String str3, String str4, boolean z5, u uVar, Executor executor, Activity activity) {
        String str5 = gVar.f7935b;
        I.d(str5);
        zzadu zzadu = new zzadu(wVar, str5, str, j6, z3, z4, str2, str3, str4, z5);
        Activity activity2 = activity;
        zzadu.zza(uVar, activity2, executor, wVar.f7658a);
        return zza(zzadu);
    }

    public final Task<Void> zza(i iVar, m mVar, String str, String str2, t tVar) {
        return zza((zzadt) new zzadt(((C0528e) mVar).f7920a.zzf(), str, str2).zza(iVar).zza(mVar).zza(tVar).zza((C0533j) tVar));
    }

    public final Task<Void> zza(i iVar, m mVar, s sVar, t tVar) {
        zzaft.zza();
        return zza((zzaea) new zzaea(sVar).zza(iVar).zza(mVar).zza(tVar).zza((C0533j) tVar));
    }

    public final Task<Void> zza(i iVar, m mVar, C0492C c3, t tVar) {
        return zza((zzadz) new zzadz(c3).zza(iVar).zza(mVar).zza(tVar).zza((C0533j) tVar));
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, f3.c] */
    /* JADX WARNING: type inference failed for: r4v2, types: [java.lang.Object, f3.c] */
    public static C0528e zza(i iVar, zzahc zzahc) {
        I.g(iVar);
        I.g(zzahc);
        ArrayList arrayList = new ArrayList();
        ? obj = new Object();
        I.d("firebase");
        String zzi = zzahc.zzi();
        I.d(zzi);
        obj.f7913a = zzi;
        obj.f7914b = "firebase";
        obj.f7916e = zzahc.zzh();
        obj.f7915c = zzahc.zzg();
        Uri zzc = zzahc.zzc();
        if (zzc != null) {
            obj.d = zzc.toString();
        }
        obj.f7918p = zzahc.zzm();
        obj.f7919q = null;
        obj.f7917f = zzahc.zzj();
        arrayList.add(obj);
        List<zzaht> zzl = zzahc.zzl();
        if (zzl != null && !zzl.isEmpty()) {
            for (int i2 = 0; i2 < zzl.size(); i2++) {
                zzaht zzaht = zzl.get(i2);
                ? obj2 = new Object();
                I.g(zzaht);
                obj2.f7913a = zzaht.zzd();
                String zzf = zzaht.zzf();
                I.d(zzf);
                obj2.f7914b = zzf;
                obj2.f7915c = zzaht.zzb();
                Uri zza = zzaht.zza();
                if (zza != null) {
                    obj2.d = zza.toString();
                }
                obj2.f7916e = zzaht.zzc();
                obj2.f7917f = zzaht.zze();
                obj2.f7918p = false;
                obj2.f7919q = zzaht.zzg();
                arrayList.add(obj2);
            }
        }
        C0528e eVar = new C0528e(iVar, arrayList);
        eVar.f7927r = new C0529f(zzahc.zzb(), zzahc.zza());
        eVar.f7928s = zzahc.zzn();
        eVar.f7929t = zzahc.zze();
        eVar.z(d.s1(zzahc.zzk()));
        List zzd = zzahc.zzd();
        if (zzd == null) {
            zzd = new ArrayList();
        }
        eVar.f7931v = zzd;
        return eVar;
    }

    public final void zza(i iVar, zzaib zzaib, u uVar, Activity activity, Executor executor) {
        zza((zzaee) new zzaee(zzaib).zza(iVar).zza(uVar, activity, executor, zzaib.zzd()));
    }
}
