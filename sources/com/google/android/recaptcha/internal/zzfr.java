package com.google.android.recaptcha.internal;

import F5.i;
import G5.C;
import G5.F;
import I1.b;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.n;
import m5.C0849h;
import o5.d;
import p5.a;
import q5.h;
import x5.p;

final class zzfr extends h implements p {
    final /* synthetic */ Exception zza;
    final /* synthetic */ zzgd zzb;
    final /* synthetic */ zzft zzc;
    private /* synthetic */ Object zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzfr(Exception exc, zzgd zzgd, zzft zzft, d dVar) {
        super(2, dVar);
        this.zza = exc;
        this.zzb = zzgd;
        this.zzc = zzft;
    }

    public final d create(Object obj, d dVar) {
        zzfr zzfr = new zzfr(this.zza, this.zzb, this.zzc, dVar);
        zzfr.zzd = obj;
        return zzfr;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfr) create((C) obj, (d) obj2)).invokeSuspend(C0849h.f10203c);
    }

    public final Object invokeSuspend(Object obj) {
        zztd zztd;
        String str;
        a aVar = a.f11033a;
        b.I0(obj);
        C c3 = (C) this.zzd;
        Exception exc = this.zza;
        if (exc instanceof zzce) {
            zztd = ((zzce) exc).zza();
            zztd.zze(this.zzb.zza());
        } else {
            zzgd zzgd = this.zzb;
            zztd zzf = zzte.zzf();
            zzf.zze(zzgd.zza());
            zzf.zzr(2);
            zzf.zzq(2);
            zztd = zzf;
        }
        zzte zzte = (zzte) zztd.zzk();
        zzte.zzl();
        zzte.zzk();
        Class<?> cls = this.zza.getClass();
        n.f9657a.getClass();
        new e(cls);
        if (!cls.isAnonymousClass()) {
            if (cls.isLocalClass()) {
                String simpleName = cls.getSimpleName();
                Method enclosingMethod = cls.getEnclosingMethod();
                if (enclosingMethod != null) {
                    i.X0(simpleName, enclosingMethod.getName() + '$', simpleName);
                } else {
                    Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
                    if (enclosingConstructor != null) {
                        i.X0(simpleName, enclosingConstructor.getName() + '$', simpleName);
                    } else {
                        int indexOf = simpleName.indexOf(36, 0);
                        if (indexOf != -1) {
                            j.d(simpleName.substring(indexOf + 1, simpleName.length()), "substring(...)");
                        }
                    }
                }
            } else {
                boolean isArray = cls.isArray();
                LinkedHashMap linkedHashMap = e.f9652c;
                if (isArray) {
                    Class<?> componentType = cls.getComponentType();
                    if (componentType.isPrimitive() && (str = (String) linkedHashMap.get(componentType.getName())) != null) {
                        str.concat("Array");
                    }
                } else {
                    String str2 = (String) linkedHashMap.get(cls.getName());
                }
            }
        }
        this.zza.getMessage();
        zzgd zzgd2 = this.zzb;
        zzbn zzb2 = zzgd2.zzb();
        zzbn zzbn = zzgd2.zza;
        if (zzbn == null) {
            zzbn = null;
        }
        zzrl zza2 = zzev.zza(zzb2, zzbn);
        String zzd2 = this.zzb.zzd();
        if (zzd2.length() == 0) {
            zzd2 = "recaptcha.m.Main.rge";
        }
        if (F.m(c3)) {
            zzft zzft = this.zzc;
            zzkh zzh = zzkh.zzh();
            byte[] zzd3 = zzte.zzd();
            String zzi = zzh.zzi(zzd3, 0, zzd3.length);
            zzkh zzh2 = zzkh.zzh();
            byte[] zzd4 = zza2.zzd();
            zzft.zzb.zzd().zzb(zzd2, (String[]) Arrays.copyOf(new String[]{zzi, zzh2.zzi(zzd4, 0, zzd4.length)}, 2));
        }
        return C0849h.f10203c;
    }
}
