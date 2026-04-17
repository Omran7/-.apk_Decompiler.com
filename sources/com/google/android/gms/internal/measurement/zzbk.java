package com.google.android.gms.internal.measurement;

import h0.C0552a;
import java.util.Iterator;
import java.util.List;
import o3.d;

public final class zzbk extends zzaw {
    public zzbk() {
        this.zza.add(zzbl.ASSIGN);
        this.zza.add(zzbl.CONST);
        this.zza.add(zzbl.CREATE_ARRAY);
        this.zza.add(zzbl.CREATE_OBJECT);
        this.zza.add(zzbl.EXPRESSION_LIST);
        this.zza.add(zzbl.GET);
        this.zza.add(zzbl.GET_INDEX);
        this.zza.add(zzbl.GET_PROPERTY);
        this.zza.add(zzbl.NULL);
        this.zza.add(zzbl.SET_PROPERTY);
        this.zza.add(zzbl.TYPEOF);
        this.zza.add(zzbl.UNDEFINED);
        this.zza.add(zzbl.VAR);
    }

    public final zzap zza(String str, zzg zzg, List list) {
        zzap zzb;
        String str2;
        zzbl zzbl = zzbl.ADD;
        int ordinal = zzh.zze(str).ordinal();
        int i2 = 0;
        if (ordinal == 3) {
            zzap zzb2 = zzg.zzb((zzap) C0552a.j(zzbl.ASSIGN, 2, list, 0));
            if (!(zzb2 instanceof zzat)) {
                throw new IllegalArgumentException(d.i("Expected string for assign var. got ", zzb2.getClass().getCanonicalName()));
            } else if (zzg.zzh(zzb2.zzi())) {
                zzap zzb3 = zzg.zzb((zzap) list.get(1));
                zzg.zzg(zzb2.zzi(), zzb3);
                return zzb3;
            } else {
                throw new IllegalArgumentException(d.i("Attempting to assign undefined value ", zzb2.zzi()));
            }
        } else if (ordinal == 14) {
            zzh.zzi(zzbl.CONST.name(), 2, list);
            if (list.size() % 2 == 0) {
                while (i2 < list.size() - 1) {
                    zzap zzb4 = zzg.zzb((zzap) list.get(i2));
                    if (zzb4 instanceof zzat) {
                        zzg.zzf(zzb4.zzi(), zzg.zzb((zzap) list.get(i2 + 1)));
                        i2 += 2;
                    } else {
                        throw new IllegalArgumentException(d.i("Expected string for const name. got ", zzb4.getClass().getCanonicalName()));
                    }
                }
                return zzap.zzf;
            }
            throw new IllegalArgumentException(a.f(list.size(), "CONST requires an even number of arguments, found "));
        } else if (ordinal == 24) {
            zzh.zzi(zzbl.EXPRESSION_LIST.name(), 1, list);
            zzap zzap = zzap.zzf;
            while (i2 < list.size()) {
                zzap = zzg.zzb((zzap) list.get(i2));
                if (!(zzap instanceof zzag)) {
                    i2++;
                } else {
                    throw new IllegalStateException("ControlValue cannot be in an expression list");
                }
            }
            return zzap;
        } else if (ordinal == 33) {
            zzap zzb5 = zzg.zzb((zzap) C0552a.j(zzbl.GET, 1, list, 0));
            if (zzb5 instanceof zzat) {
                return zzg.zzd(zzb5.zzi());
            }
            throw new IllegalArgumentException(d.i("Expected string for get var. got ", zzb5.getClass().getCanonicalName()));
        } else if (ordinal != 49) {
            if (ordinal == 58) {
                zzap zzb6 = zzg.zzb((zzap) C0552a.j(zzbl.SET_PROPERTY, 3, list, 0));
                zzap zzb7 = zzg.zzb((zzap) list.get(1));
                zzb = zzg.zzb((zzap) list.get(2));
                if (zzb6 == zzap.zzf || zzb6 == zzap.zzg) {
                    throw new IllegalStateException(C0552a.p("Can't set property ", zzb7.zzi(), " of ", zzb6.zzi()));
                } else if ((zzb6 instanceof zzae) && (zzb7 instanceof zzah)) {
                    ((zzae) zzb6).zzq(zzb7.zzh().intValue(), zzb);
                } else if (zzb6 instanceof zzal) {
                    ((zzal) zzb6).zzr(zzb7.zzi(), zzb);
                    return zzb;
                }
            } else if (ordinal != 17) {
                if (ordinal != 18) {
                    if (ordinal == 35 || ordinal == 36) {
                        zzap zzb8 = zzg.zzb((zzap) C0552a.j(zzbl.GET_PROPERTY, 2, list, 0));
                        zzap zzb9 = zzg.zzb((zzap) list.get(1));
                        if ((zzb8 instanceof zzae) && zzh.zzk(zzb9)) {
                            return ((zzae) zzb8).zze(zzb9.zzh().intValue());
                        }
                        if (zzb8 instanceof zzal) {
                            return ((zzal) zzb8).zzf(zzb9.zzi());
                        }
                        if (zzb8 instanceof zzat) {
                            if ("length".equals(zzb9.zzi())) {
                                zzb = new zzah(Double.valueOf((double) zzb8.zzi().length()));
                            } else if (zzh.zzk(zzb9) && zzb9.zzh().doubleValue() < ((double) zzb8.zzi().length())) {
                                return new zzat(String.valueOf(zzb8.zzi().charAt(zzb9.zzh().intValue())));
                            }
                        }
                        return zzap.zzf;
                    }
                    switch (ordinal) {
                        case 62:
                            zzap zzb10 = zzg.zzb((zzap) C0552a.j(zzbl.TYPEOF, 1, list, 0));
                            if (zzb10 instanceof zzau) {
                                str2 = "undefined";
                            } else if (zzb10 instanceof zzaf) {
                                str2 = "boolean";
                            } else if (zzb10 instanceof zzah) {
                                str2 = "number";
                            } else if (zzb10 instanceof zzat) {
                                str2 = "string";
                            } else if (zzb10 instanceof zzao) {
                                str2 = "function";
                            } else if ((zzb10 instanceof zzaq) || (zzb10 instanceof zzag)) {
                                throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", new Object[]{zzb10}));
                            } else {
                                str2 = "object";
                            }
                            return new zzat(str2);
                        case 63:
                            zzh.zzh(zzbl.UNDEFINED.name(), 0, list);
                            return zzap.zzf;
                        case 64:
                            zzh.zzi(zzbl.VAR.name(), 1, list);
                            Iterator it2 = list.iterator();
                            while (it2.hasNext()) {
                                zzap zzb11 = zzg.zzb((zzap) it2.next());
                                if (zzb11 instanceof zzat) {
                                    zzg.zze(zzb11.zzi(), zzap.zzf);
                                } else {
                                    throw new IllegalArgumentException(d.i("Expected string for var name. got ", zzb11.getClass().getCanonicalName()));
                                }
                            }
                            return zzap.zzf;
                        default:
                            return zzb(str);
                    }
                } else if (list.isEmpty()) {
                    return new zzam();
                } else {
                    if (list.size() % 2 == 0) {
                        zzam zzam = new zzam();
                        while (i2 < list.size() - 1) {
                            zzap zzb12 = zzg.zzb((zzap) list.get(i2));
                            zzap zzb13 = zzg.zzb((zzap) list.get(i2 + 1));
                            if ((zzb12 instanceof zzag) || (zzb13 instanceof zzag)) {
                                throw new IllegalStateException("Failed to evaluate map entry");
                            }
                            zzam.zzr(zzb12.zzi(), zzb13);
                            i2 += 2;
                        }
                        return zzam;
                    }
                    throw new IllegalArgumentException(a.f(list.size(), "CREATE_OBJECT requires an even number of arguments, found "));
                }
            } else if (list.isEmpty()) {
                return new zzae();
            } else {
                zzae zzae = new zzae();
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    zzap zzb14 = zzg.zzb((zzap) it3.next());
                    if (!(zzb14 instanceof zzag)) {
                        zzae.zzq(i2, zzb14);
                        i2++;
                    } else {
                        throw new IllegalStateException("Failed to evaluate array element");
                    }
                }
                return zzae;
            }
            return zzb;
        } else {
            zzh.zzh(zzbl.NULL.name(), 0, list);
            return zzap.zzg;
        }
    }
}
