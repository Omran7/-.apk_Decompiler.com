package com.google.android.gms.internal.measurement;

import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import h0.C0552a;
import java.util.ArrayList;
import java.util.List;
import o3.d;

public final class zzaz extends zzaw {
    public zzaz() {
        this.zza.add(zzbl.APPLY);
        this.zza.add(zzbl.BLOCK);
        this.zza.add(zzbl.BREAK);
        this.zza.add(zzbl.CASE);
        this.zza.add(zzbl.DEFAULT);
        this.zza.add(zzbl.CONTINUE);
        this.zza.add(zzbl.DEFINE_FUNCTION);
        this.zza.add(zzbl.FN);
        this.zza.add(zzbl.IF);
        this.zza.add(zzbl.QUOTE);
        this.zza.add(zzbl.RETURN);
        this.zza.add(zzbl.SWITCH);
        this.zza.add(zzbl.TERNARY);
    }

    private static zzap zzc(zzg zzg, List list) {
        zzh.zzi(zzbl.FN.name(), 2, list);
        zzap zzb = zzg.zzb((zzap) list.get(0));
        zzap zzb2 = zzg.zzb((zzap) list.get(1));
        if (zzb2 instanceof zzae) {
            List zzm = ((zzae) zzb2).zzm();
            List arrayList = new ArrayList();
            if (list.size() > 2) {
                arrayList = list.subList(2, list.size());
            }
            return new zzao(zzb.zzi(), zzm, arrayList, zzg);
        }
        throw new IllegalArgumentException(d.i("FN requires an ArrayValue of parameter names found ", zzb2.getClass().getCanonicalName()));
    }

    public final zzap zza(String str, zzg zzg, List list) {
        zzap zzap;
        zzap zzap2;
        zzbl zzbl = zzbl.ADD;
        int ordinal = zzh.zze(str).ordinal();
        if (ordinal == 2) {
            zzap zzb = zzg.zzb((zzap) C0552a.j(zzbl.APPLY, 3, list, 0));
            String zzi = zzg.zzb((zzap) list.get(1)).zzi();
            zzap zzb2 = zzg.zzb((zzap) list.get(2));
            if (!(zzb2 instanceof zzae)) {
                throw new IllegalArgumentException(d.i("Function arguments for Apply are not a list found ", zzb2.getClass().getCanonicalName()));
            } else if (!zzi.isEmpty()) {
                return zzb.zzcz(zzi, zzg, ((zzae) zzb2).zzm());
            } else {
                throw new IllegalArgumentException("Function name for apply is undefined");
            }
        } else if (ordinal == 15) {
            zzh.zzh(zzbl.BREAK.name(), 0, list);
            return zzap.zzh;
        } else if (ordinal == 25) {
            return zzc(zzg, list);
        } else {
            if (ordinal == 41) {
                zzh.zzi(zzbl.IF.name(), 2, list);
                zzap zzb3 = zzg.zzb((zzap) list.get(0));
                zzap zzb4 = zzg.zzb((zzap) list.get(1));
                if (list.size() > 2) {
                    zzap = zzg.zzb((zzap) list.get(2));
                } else {
                    zzap = null;
                }
                zzap zzap3 = zzap.zzf;
                if (zzb3.zzg().booleanValue()) {
                    zzap2 = zzg.zzc((zzae) zzb4);
                } else if (zzap != null) {
                    zzap2 = zzg.zzc((zzae) zzap);
                } else {
                    zzap2 = zzap3;
                }
                if (zzap2 instanceof zzag) {
                    return zzap2;
                }
            } else if (ordinal == 54) {
                return new zzae(list);
            } else {
                if (ordinal != 57) {
                    if (ordinal != 19) {
                        if (ordinal == 20) {
                            zzh.zzi(zzbl.DEFINE_FUNCTION.name(), 2, list);
                            zzao zzao = (zzao) zzc(zzg, list);
                            if (zzao.zzc() == null) {
                                zzg.zzg("", zzao);
                                return zzao;
                            }
                            zzg.zzg(zzao.zzc(), zzao);
                            return zzao;
                        } else if (ordinal == 60) {
                            zzap zzb5 = zzg.zzb((zzap) C0552a.j(zzbl.SWITCH, 3, list, 0));
                            zzap zzb6 = zzg.zzb((zzap) list.get(1));
                            zzap zzb7 = zzg.zzb((zzap) list.get(2));
                            if (!(zzb6 instanceof zzae)) {
                                throw new IllegalArgumentException("Malformed SWITCH statement, cases are not a list");
                            } else if (zzb7 instanceof zzae) {
                                zzae zzae = (zzae) zzb6;
                                zzae zzae2 = (zzae) zzb7;
                                int i2 = 0;
                                boolean z3 = false;
                                while (true) {
                                    if (i2 < zzae.zzc()) {
                                        if (z3 || zzb5.equals(zzg.zzb(zzae.zze(i2)))) {
                                            zzap zzb8 = zzg.zzb(zzae2.zze(i2));
                                            if (!(zzb8 instanceof zzag)) {
                                                z3 = true;
                                            } else if (!((zzag) zzb8).zzc().equals("break")) {
                                                return zzb8;
                                            }
                                        } else {
                                            z3 = false;
                                        }
                                        i2++;
                                    } else if (zzae.zzc() + 1 == zzae2.zzc()) {
                                        zzap zzb9 = zzg.zzb(zzae2.zze(zzae.zzc()));
                                        if (zzb9 instanceof zzag) {
                                            String zzc = ((zzag) zzb9).zzc();
                                            if (zzc.equals("return") || zzc.equals("continue")) {
                                                return zzb9;
                                            }
                                        }
                                    }
                                }
                            } else {
                                throw new IllegalArgumentException("Malformed SWITCH statement, case statements are not a list");
                            }
                        } else if (ordinal != 61) {
                            switch (ordinal) {
                                case ModuleDescriptor.MODULE_VERSION:
                                    return zzg.zza().zzc(new zzae(list));
                                case 12:
                                    zzh.zzh(zzbl.BREAK.name(), 0, list);
                                    return zzap.zzi;
                                case 13:
                                    break;
                                default:
                                    return zzb(str);
                            }
                        } else if (zzg.zzb((zzap) C0552a.j(zzbl.TERNARY, 3, list, 0)).zzg().booleanValue()) {
                            return zzg.zzb((zzap) list.get(1));
                        } else {
                            return zzg.zzb((zzap) list.get(2));
                        }
                    }
                    if (list.isEmpty()) {
                        return zzap.zzf;
                    }
                    zzap zzb10 = zzg.zzb((zzap) list.get(0));
                    if (zzb10 instanceof zzae) {
                        return zzg.zzc((zzae) zzb10);
                    }
                    return zzap.zzf;
                } else if (list.isEmpty()) {
                    return zzap.zzj;
                } else {
                    return new zzag("return", zzg.zzb((zzap) C0552a.j(zzbl.RETURN, 1, list, 0)));
                }
            }
            return zzap.zzf;
        }
    }
}
