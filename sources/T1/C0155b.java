package T1;

import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.measurement.zzfp;
import com.google.android.gms.internal.measurement.zzfv;
import com.google.android.gms.internal.measurement.zzmd;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* renamed from: T1.b  reason: case insensitive filesystem */
public final class C0155b {

    /* renamed from: a  reason: collision with root package name */
    public final String f3233a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3234b;

    /* renamed from: c  reason: collision with root package name */
    public Boolean f3235c;
    public Boolean d;

    /* renamed from: e  reason: collision with root package name */
    public Long f3236e;

    /* renamed from: f  reason: collision with root package name */
    public Long f3237f;
    public final /* synthetic */ int g;
    public final /* synthetic */ C0158c h;

    /* renamed from: i  reason: collision with root package name */
    public final zzmd f3238i;

    public C0155b(C0158c cVar, String str, int i2, zzmd zzmd, int i5) {
        this.g = i5;
        this.h = cVar;
        this.f3233a = str;
        this.f3234b = i2;
        this.f3238i = zzmd;
    }

    public static Boolean c(BigDecimal bigDecimal, zzfp zzfp, double d6) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        I.g(zzfp);
        if (zzfp.zzg()) {
            boolean z3 = true;
            if (zzfp.zzm() != 1) {
                if (zzfp.zzm() == 5) {
                    if (!zzfp.zzk() || !zzfp.zzj()) {
                        return null;
                    }
                } else if (!zzfp.zzh()) {
                    return null;
                }
                int zzm = zzfp.zzm();
                if (zzfp.zzm() == 5) {
                    if (C0162d0.s(zzfp.zze()) && C0162d0.s(zzfp.zzd())) {
                        try {
                            BigDecimal bigDecimal5 = new BigDecimal(zzfp.zze());
                            bigDecimal3 = new BigDecimal(zzfp.zzd());
                            bigDecimal2 = bigDecimal5;
                            bigDecimal4 = null;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    return null;
                } else if (!C0162d0.s(zzfp.zzc())) {
                    return null;
                } else {
                    try {
                        bigDecimal4 = new BigDecimal(zzfp.zzc());
                        bigDecimal2 = null;
                        bigDecimal3 = null;
                    } catch (NumberFormatException unused2) {
                    }
                }
                if (zzm == 5) {
                    if (bigDecimal2 == null) {
                        return null;
                    }
                } else if (bigDecimal4 == null) {
                    return null;
                }
                int i2 = zzm - 1;
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 != 4 || bigDecimal2 == null) {
                                return null;
                            }
                            if (bigDecimal.compareTo(bigDecimal2) < 0 || bigDecimal.compareTo(bigDecimal3) > 0) {
                                z3 = false;
                            }
                            return Boolean.valueOf(z3);
                        } else if (bigDecimal4 == null) {
                            return null;
                        } else {
                            if (d6 != 0.0d) {
                                if (bigDecimal.compareTo(bigDecimal4.subtract(new BigDecimal(d6).multiply(new BigDecimal(2)))) <= 0 || bigDecimal.compareTo(bigDecimal4.add(new BigDecimal(d6).multiply(new BigDecimal(2)))) >= 0) {
                                    z3 = false;
                                }
                                return Boolean.valueOf(z3);
                            }
                            if (bigDecimal.compareTo(bigDecimal4) != 0) {
                                z3 = false;
                            }
                            return Boolean.valueOf(z3);
                        }
                    } else if (bigDecimal4 == null) {
                        return null;
                    } else {
                        if (bigDecimal.compareTo(bigDecimal4) <= 0) {
                            z3 = false;
                        }
                        return Boolean.valueOf(z3);
                    }
                } else if (bigDecimal4 == null) {
                    return null;
                } else {
                    if (bigDecimal.compareTo(bigDecimal4) >= 0) {
                        z3 = false;
                    }
                    return Boolean.valueOf(z3);
                }
            }
        }
        return null;
    }

    public static Boolean d(String str, zzfv zzfv, Z z3) {
        String str2;
        List<String> list;
        String str3;
        int i2;
        I.g(zzfv);
        if (str == null || !zzfv.zzi() || zzfv.zzj() == 1) {
            return null;
        }
        if (zzfv.zzj() == 7) {
            if (zzfv.zza() == 0) {
                return null;
            }
        } else if (!zzfv.zzh()) {
            return null;
        }
        int zzj = zzfv.zzj();
        boolean zzf = zzfv.zzf();
        if (zzf || zzj == 2 || zzj == 7) {
            str2 = zzfv.zzd();
        } else {
            str2 = zzfv.zzd().toUpperCase(Locale.ENGLISH);
        }
        if (zzfv.zza() == 0) {
            list = null;
        } else {
            list = zzfv.zze();
            if (!zzf) {
                ArrayList arrayList = new ArrayList(list.size());
                for (String upperCase : list) {
                    arrayList.add(upperCase.toUpperCase(Locale.ENGLISH));
                }
                list = Collections.unmodifiableList(arrayList);
            }
        }
        if (zzj == 2) {
            str3 = str2;
        } else {
            str3 = null;
        }
        if (zzj == 7) {
            if (list == null || list.isEmpty()) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!zzf && zzj != 2) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (zzj - 1) {
            case 1:
                if (str3 == null) {
                    return null;
                }
                if (true != zzf) {
                    i2 = 66;
                } else {
                    i2 = 0;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(str3, i2).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (z3 == null) {
                        return null;
                    }
                    z3.f3175r.b(str3, "Invalid regular expression in REGEXP audience filter. expression");
                    return null;
                }
            case 2:
                return Boolean.valueOf(str.startsWith(str2));
            case 3:
                return Boolean.valueOf(str.endsWith(str2));
            case 4:
                return Boolean.valueOf(str.contains(str2));
            case 5:
                return Boolean.valueOf(str.equals(str2));
            case zzaky.zzf.zzf /*6*/:
                if (list == null) {
                    return null;
                }
                return Boolean.valueOf(list.contains(str));
            default:
                return null;
        }
    }

    public static Boolean e(long j6, zzfp zzfp) {
        try {
            return c(new BigDecimal(j6), zzfp, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Boolean f(Boolean bool, boolean z3) {
        boolean z4;
        if (bool == null) {
            return null;
        }
        if (bool.booleanValue() != z3) {
            z4 = true;
        } else {
            z4 = false;
        }
        return Boolean.valueOf(z4);
    }

    /* JADX WARNING: Removed duplicated region for block: B:153:0x0392  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0395  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x039d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x039f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(java.lang.Long r19, java.lang.Long r20, com.google.android.gms.internal.measurement.zzhm r21, long r22, T1.C0205s r24, boolean r25) {
        /*
            r18 = this;
            r0 = r18
            com.google.android.gms.internal.measurement.zzpq.zzb()
            T1.c r1 = r0.h
            java.lang.Object r2 = r1.f398a
            T1.u0 r2 = (T1.C0212u0) r2
            T1.g r3 = r2.f3494p
            T1.G r4 = T1.H.f2853E0
            java.lang.String r5 = r0.f3233a
            boolean r3 = r3.B(r5, r4)
            com.google.android.gms.internal.measurement.zzmd r4 = r0.f3238i
            com.google.android.gms.internal.measurement.zzfj r4 = (com.google.android.gms.internal.measurement.zzfj) r4
            boolean r6 = r4.zzn()
            if (r6 == 0) goto L_0x0024
            r6 = r24
            long r6 = r6.f3459e
            goto L_0x0026
        L_0x0024:
            r6 = r22
        L_0x0026:
            T1.Z r8 = r2.f3496r
            T1.C0212u0.k(r8)
            java.lang.String r9 = r8.z()
            r10 = 2
            boolean r9 = android.util.Log.isLoggable(r9, r10)
            r11 = 0
            T1.X r13 = r8.f3180w
            int r14 = r0.f3234b
            T1.S r2 = r2.f3500v
            if (r9 == 0) goto L_0x00fe
            T1.C0212u0.k(r8)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r14)
            boolean r16 = r4.zzp()
            if (r16 == 0) goto L_0x0055
            int r16 = r4.zzb()
            java.lang.Integer r16 = java.lang.Integer.valueOf(r16)
            r12 = r16
            goto L_0x0056
        L_0x0055:
            r12 = 0
        L_0x0056:
            java.lang.String r10 = r4.zzg()
            java.lang.String r10 = r2.d(r10)
            java.lang.String r15 = "Evaluating filter. audience, filter, event"
            r13.d(r15, r9, r12, r10)
            T1.C0212u0.k(r8)
            T1.T1 r1 = r1.f2982b
            T1.d0 r1 = r1.f3065p
            T1.T1.L(r1)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "\nevent_filter {\n"
            r9.append(r10)
            boolean r10 = r4.zzp()
            if (r10 == 0) goto L_0x008a
            int r10 = r4.zzb()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.String r12 = "filter_id"
            T1.C0162d0.G(r9, r11, r12, r10)
        L_0x008a:
            java.lang.Object r10 = r1.f398a
            T1.u0 r10 = (T1.C0212u0) r10
            T1.S r10 = r10.f3500v
            java.lang.String r12 = r4.zzg()
            java.lang.String r10 = r10.d(r12)
            java.lang.String r12 = "event_name"
            T1.C0162d0.G(r9, r11, r12, r10)
            boolean r10 = r4.zzk()
            boolean r12 = r4.zzm()
            boolean r15 = r4.zzn()
            java.lang.String r10 = T1.C0162d0.D(r10, r12, r15)
            boolean r12 = r10.isEmpty()
            if (r12 != 0) goto L_0x00b8
            java.lang.String r12 = "filter_type"
            T1.C0162d0.G(r9, r11, r12, r10)
        L_0x00b8:
            boolean r10 = r4.zzo()
            if (r10 == 0) goto L_0x00c8
            com.google.android.gms.internal.measurement.zzfp r10 = r4.zzf()
            java.lang.String r12 = "event_count_filter"
            r15 = 1
            T1.C0162d0.H(r9, r15, r12, r10)
        L_0x00c8:
            int r10 = r4.zza()
            if (r10 <= 0) goto L_0x00ec
            java.lang.String r10 = "  filters {\n"
            r9.append(r10)
            java.util.List r10 = r4.zzh()
            java.util.Iterator r10 = r10.iterator()
        L_0x00db:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L_0x00ec
            java.lang.Object r12 = r10.next()
            com.google.android.gms.internal.measurement.zzfl r12 = (com.google.android.gms.internal.measurement.zzfl) r12
            r15 = 2
            r1.A(r9, r15, r12)
            goto L_0x00db
        L_0x00ec:
            r1 = 1
            T1.C0162d0.B(r1, r9)
            java.lang.String r1 = "}\n}\n"
            r9.append(r1)
            java.lang.String r1 = r9.toString()
            java.lang.String r9 = "Filter definition"
            r13.b(r1, r9)
        L_0x00fe:
            boolean r1 = r4.zzp()
            T1.X r9 = r8.f3175r
            if (r1 == 0) goto L_0x03e1
            int r1 = r4.zzb()
            r10 = 256(0x100, float:3.59E-43)
            if (r1 <= r10) goto L_0x0110
            goto L_0x03e1
        L_0x0110:
            boolean r1 = r4.zzk()
            boolean r5 = r4.zzm()
            boolean r10 = r4.zzn()
            if (r1 != 0) goto L_0x0122
            if (r5 != 0) goto L_0x0122
            if (r10 == 0) goto L_0x0124
        L_0x0122:
            r15 = 1
            goto L_0x0125
        L_0x0124:
            r15 = r11
        L_0x0125:
            if (r25 == 0) goto L_0x0147
            if (r15 != 0) goto L_0x0147
            T1.C0212u0.k(r8)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            boolean r2 = r4.zzp()
            if (r2 == 0) goto L_0x013f
            int r2 = r4.zzb()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r2)
            goto L_0x0140
        L_0x013f:
            r12 = 0
        L_0x0140:
            java.lang.String r2 = "Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID"
            r13.c(r2, r1, r12)
            r1 = 1
            return r1
        L_0x0147:
            java.lang.String r1 = r21.zzh()
            boolean r5 = r4.zzo()
            if (r5 == 0) goto L_0x0168
            com.google.android.gms.internal.measurement.zzfp r5 = r4.zzf()
            java.lang.Boolean r5 = e(r6, r5)
            if (r5 != 0) goto L_0x015e
        L_0x015b:
            r12 = 0
            goto L_0x038d
        L_0x015e:
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L_0x0168
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            goto L_0x038d
        L_0x0168:
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            java.util.List r6 = r4.zzh()
            java.util.Iterator r6 = r6.iterator()
        L_0x0175:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x01a0
            java.lang.Object r7 = r6.next()
            com.google.android.gms.internal.measurement.zzfl r7 = (com.google.android.gms.internal.measurement.zzfl) r7
            java.lang.String r10 = r7.zze()
            boolean r10 = r10.isEmpty()
            if (r10 == 0) goto L_0x0198
            T1.C0212u0.k(r8)
            java.lang.String r1 = r2.d(r1)
            java.lang.String r2 = "null or empty param name in filter. event"
            r9.b(r1, r2)
            goto L_0x015b
        L_0x0198:
            java.lang.String r7 = r7.zze()
            r5.add(r7)
            goto L_0x0175
        L_0x01a0:
            n.e r6 = new n.e
            r6.<init>(r11)
            java.util.List r7 = r21.zzi()
            java.util.Iterator r7 = r7.iterator()
        L_0x01ad:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L_0x0227
            java.lang.Object r10 = r7.next()
            com.google.android.gms.internal.measurement.zzhq r10 = (com.google.android.gms.internal.measurement.zzhq) r10
            java.lang.String r12 = r10.zzg()
            boolean r12 = r5.contains(r12)
            if (r12 == 0) goto L_0x01ad
            boolean r12 = r10.zzw()
            if (r12 == 0) goto L_0x01e1
            java.lang.String r12 = r10.zzg()
            boolean r14 = r10.zzw()
            if (r14 == 0) goto L_0x01dc
            long r16 = r10.zzd()
            java.lang.Long r10 = java.lang.Long.valueOf(r16)
            goto L_0x01dd
        L_0x01dc:
            r10 = 0
        L_0x01dd:
            r6.put(r12, r10)
            goto L_0x01ad
        L_0x01e1:
            boolean r12 = r10.zzu()
            if (r12 == 0) goto L_0x01ff
            java.lang.String r12 = r10.zzg()
            boolean r14 = r10.zzu()
            if (r14 == 0) goto L_0x01fa
            double r16 = r10.zza()
            java.lang.Double r10 = java.lang.Double.valueOf(r16)
            goto L_0x01fb
        L_0x01fa:
            r10 = 0
        L_0x01fb:
            r6.put(r12, r10)
            goto L_0x01ad
        L_0x01ff:
            boolean r12 = r10.zzy()
            if (r12 == 0) goto L_0x0211
            java.lang.String r12 = r10.zzg()
            java.lang.String r10 = r10.zzh()
            r6.put(r12, r10)
            goto L_0x01ad
        L_0x0211:
            T1.C0212u0.k(r8)
            java.lang.String r1 = r2.d(r1)
            java.lang.String r5 = r10.zzg()
            java.lang.String r2 = r2.e(r5)
            java.lang.String r5 = "Unknown value for param. event, param"
            r9.c(r5, r1, r2)
            goto L_0x015b
        L_0x0227:
            java.util.List r5 = r4.zzh()
            java.util.Iterator r5 = r5.iterator()
        L_0x022f:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x038b
            java.lang.Object r7 = r5.next()
            com.google.android.gms.internal.measurement.zzfl r7 = (com.google.android.gms.internal.measurement.zzfl) r7
            boolean r10 = r7.zzh()
            if (r10 == 0) goto L_0x0249
            boolean r10 = r7.zzg()
            if (r10 == 0) goto L_0x0249
            r10 = 1
            goto L_0x024a
        L_0x0249:
            r10 = r11
        L_0x024a:
            java.lang.String r12 = r7.zze()
            boolean r14 = r12.isEmpty()
            if (r14 == 0) goto L_0x0262
            T1.C0212u0.k(r8)
            java.lang.String r1 = r2.d(r1)
            java.lang.String r2 = "Event has empty param name. event"
            r9.b(r1, r2)
            goto L_0x015b
        L_0x0262:
            java.lang.Object r14 = r6.get(r12)
            boolean r11 = r14 instanceof java.lang.Long
            if (r11 == 0) goto L_0x02a0
            boolean r11 = r7.zzi()
            if (r11 != 0) goto L_0x0282
            T1.C0212u0.k(r8)
            java.lang.String r1 = r2.d(r1)
            java.lang.String r2 = r2.e(r12)
            java.lang.String r5 = "No number filter for long param. event, param"
            r9.c(r5, r1, r2)
            goto L_0x015b
        L_0x0282:
            java.lang.Long r14 = (java.lang.Long) r14
            long r11 = r14.longValue()
            com.google.android.gms.internal.measurement.zzfp r7 = r7.zzc()
            java.lang.Boolean r7 = e(r11, r7)
            if (r7 != 0) goto L_0x0294
            goto L_0x015b
        L_0x0294:
            boolean r7 = r7.booleanValue()
            if (r7 != r10) goto L_0x029e
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            goto L_0x038d
        L_0x029e:
            r11 = 0
            goto L_0x022f
        L_0x02a0:
            boolean r11 = r14 instanceof java.lang.Double
            if (r11 == 0) goto L_0x02e3
            boolean r11 = r7.zzi()
            if (r11 != 0) goto L_0x02bc
            T1.C0212u0.k(r8)
            java.lang.String r1 = r2.d(r1)
            java.lang.String r2 = r2.e(r12)
            java.lang.String r5 = "No number filter for double param. event, param"
            r9.c(r5, r1, r2)
            goto L_0x015b
        L_0x02bc:
            java.lang.Double r14 = (java.lang.Double) r14
            double r11 = r14.doubleValue()
            com.google.android.gms.internal.measurement.zzfp r7 = r7.zzc()
            java.math.BigDecimal r14 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x02d4 }
            r14.<init>(r11)     // Catch:{ NumberFormatException -> 0x02d4 }
            double r11 = java.lang.Math.ulp(r11)     // Catch:{ NumberFormatException -> 0x02d4 }
            java.lang.Boolean r7 = c(r14, r7, r11)     // Catch:{ NumberFormatException -> 0x02d4 }
            goto L_0x02d5
        L_0x02d4:
            r7 = 0
        L_0x02d5:
            if (r7 != 0) goto L_0x02d9
            goto L_0x015b
        L_0x02d9:
            boolean r7 = r7.booleanValue()
            if (r7 != r10) goto L_0x029e
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            goto L_0x038d
        L_0x02e3:
            boolean r11 = r14 instanceof java.lang.String
            if (r11 == 0) goto L_0x0364
            boolean r11 = r7.zzk()
            if (r11 == 0) goto L_0x02ff
            java.lang.String r14 = (java.lang.String) r14
            com.google.android.gms.internal.measurement.zzfv r7 = r7.zzd()
            T1.C0212u0.k(r8)
            java.lang.Boolean r7 = d(r14, r7, r8)
            r16 = r5
            r25 = r6
            goto L_0x032d
        L_0x02ff:
            boolean r11 = r7.zzi()
            if (r11 == 0) goto L_0x0352
            java.lang.String r14 = (java.lang.String) r14
            boolean r11 = T1.C0162d0.s(r14)
            if (r11 == 0) goto L_0x0340
            com.google.android.gms.internal.measurement.zzfp r7 = r7.zzc()
            boolean r11 = T1.C0162d0.s(r14)
            if (r11 != 0) goto L_0x031d
        L_0x0317:
            r16 = r5
            r25 = r6
        L_0x031b:
            r7 = 0
            goto L_0x032d
        L_0x031d:
            java.math.BigDecimal r11 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0317 }
            r11.<init>(r14)     // Catch:{ NumberFormatException -> 0x0317 }
            r16 = r5
            r25 = r6
            r5 = 0
            java.lang.Boolean r5 = c(r11, r7, r5)     // Catch:{ NumberFormatException -> 0x031b }
            r7 = r5
        L_0x032d:
            if (r7 != 0) goto L_0x0331
            goto L_0x015b
        L_0x0331:
            boolean r5 = r7.booleanValue()
            if (r5 != r10) goto L_0x033a
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            goto L_0x038d
        L_0x033a:
            r6 = r25
            r5 = r16
            goto L_0x029e
        L_0x0340:
            T1.C0212u0.k(r8)
            java.lang.String r1 = r2.d(r1)
            java.lang.String r2 = r2.e(r12)
            java.lang.String r5 = "Invalid param value for number filter. event, param"
            r9.c(r5, r1, r2)
            goto L_0x015b
        L_0x0352:
            T1.C0212u0.k(r8)
            java.lang.String r1 = r2.d(r1)
            java.lang.String r2 = r2.e(r12)
            java.lang.String r5 = "No filter for String param. event, param"
            r9.c(r5, r1, r2)
            goto L_0x015b
        L_0x0364:
            if (r14 != 0) goto L_0x0379
            T1.C0212u0.k(r8)
            java.lang.String r1 = r2.d(r1)
            java.lang.String r2 = r2.e(r12)
            java.lang.String r5 = "Missing param for filter. event, param"
            r13.c(r5, r1, r2)
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            goto L_0x038d
        L_0x0379:
            T1.C0212u0.k(r8)
            java.lang.String r1 = r2.d(r1)
            java.lang.String r2 = r2.e(r12)
            java.lang.String r5 = "Unknown param type. event, param"
            r9.c(r5, r1, r2)
            goto L_0x015b
        L_0x038b:
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
        L_0x038d:
            T1.C0212u0.k(r8)
            if (r12 != 0) goto L_0x0395
            java.lang.String r1 = "null"
            goto L_0x0396
        L_0x0395:
            r1 = r12
        L_0x0396:
            java.lang.String r2 = "Event filter result"
            r13.b(r1, r2)
            if (r12 != 0) goto L_0x039f
            r1 = 0
            return r1
        L_0x039f:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.f3235c = r1
            boolean r2 = r12.booleanValue()
            if (r2 != 0) goto L_0x03ab
            r2 = 1
            return r2
        L_0x03ab:
            r0.d = r1
            if (r15 == 0) goto L_0x03d0
            boolean r1 = r21.zzu()
            if (r1 == 0) goto L_0x03d0
            long r1 = r21.zzd()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            boolean r2 = r4.zzm()
            if (r2 == 0) goto L_0x03d2
            if (r3 == 0) goto L_0x03ce
            boolean r2 = r4.zzo()
            if (r2 != 0) goto L_0x03cc
            goto L_0x03ce
        L_0x03cc:
            r1 = r19
        L_0x03ce:
            r0.f3237f = r1
        L_0x03d0:
            r1 = 1
            goto L_0x03e0
        L_0x03d2:
            if (r3 == 0) goto L_0x03dd
            boolean r2 = r4.zzo()
            if (r2 != 0) goto L_0x03db
            goto L_0x03dd
        L_0x03db:
            r1 = r20
        L_0x03dd:
            r0.f3236e = r1
            goto L_0x03d0
        L_0x03e0:
            return r1
        L_0x03e1:
            T1.C0212u0.k(r8)
            T1.Y r1 = T1.Z.w(r5)
            boolean r2 = r4.zzp()
            if (r2 == 0) goto L_0x03f7
            int r2 = r4.zzb()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r2)
            goto L_0x03f8
        L_0x03f7:
            r12 = 0
        L_0x03f8:
            java.lang.String r2 = java.lang.String.valueOf(r12)
            java.lang.String r3 = "Invalid event filter ID. appId, id"
            r9.c(r3, r1, r2)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.C0155b.a(java.lang.Long, java.lang.Long, com.google.android.gms.internal.measurement.zzhm, long, T1.s, boolean):boolean");
    }

    /* JADX WARNING: type inference failed for: r5v13, types: [java.lang.Integer] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean b(java.lang.Long r16, java.lang.Long r17, com.google.android.gms.internal.measurement.zzio r18, boolean r19) {
        /*
            r15 = this;
            r0 = r15
            com.google.android.gms.internal.measurement.zzpq.zzb()
            T1.c r1 = r0.h
            java.lang.Object r1 = r1.f398a
            T1.u0 r1 = (T1.C0212u0) r1
            T1.g r2 = r1.f3494p
            java.lang.String r3 = r0.f3233a
            T1.G r4 = T1.H.f2849C0
            boolean r2 = r2.B(r3, r4)
            com.google.android.gms.internal.measurement.zzmd r3 = r0.f3238i
            com.google.android.gms.internal.measurement.zzfr r3 = (com.google.android.gms.internal.measurement.zzfr) r3
            boolean r4 = r3.zzg()
            boolean r5 = r3.zzh()
            boolean r6 = r3.zzi()
            r7 = 0
            r8 = 1
            if (r4 != 0) goto L_0x002c
            if (r5 != 0) goto L_0x002c
            if (r6 == 0) goto L_0x002e
        L_0x002c:
            r4 = r8
            goto L_0x002f
        L_0x002e:
            r4 = r7
        L_0x002f:
            r5 = 0
            T1.Z r9 = r1.f3496r
            if (r19 == 0) goto L_0x0055
            if (r4 != 0) goto L_0x0055
            T1.C0212u0.k(r9)
            int r1 = r0.f3234b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r2 = r3.zzj()
            if (r2 == 0) goto L_0x004d
            int r2 = r3.zza()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
        L_0x004d:
            java.lang.String r2 = "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID"
            T1.X r3 = r9.f3180w
            r3.c(r2, r1, r5)
            return r8
        L_0x0055:
            com.google.android.gms.internal.measurement.zzfl r10 = r3.zzb()
            boolean r11 = r10.zzg()
            boolean r12 = r18.zzt()
            T1.S r1 = r1.f3500v
            if (r12 == 0) goto L_0x0091
            boolean r12 = r10.zzi()
            if (r12 != 0) goto L_0x007f
            T1.C0212u0.k(r9)
            java.lang.String r10 = r18.zzg()
            java.lang.String r1 = r1.f(r10)
            java.lang.String r10 = "No number filter for long property. property"
            T1.X r11 = r9.f3175r
            r11.b(r1, r10)
            goto L_0x0157
        L_0x007f:
            long r12 = r18.zzc()
            com.google.android.gms.internal.measurement.zzfp r1 = r10.zzc()
            java.lang.Boolean r1 = e(r12, r1)
            java.lang.Boolean r5 = f(r1, r11)
            goto L_0x0157
        L_0x0091:
            boolean r12 = r18.zzr()
            if (r12 == 0) goto L_0x00cc
            boolean r12 = r10.zzi()
            if (r12 != 0) goto L_0x00b1
            T1.C0212u0.k(r9)
            java.lang.String r10 = r18.zzg()
            java.lang.String r1 = r1.f(r10)
            java.lang.String r10 = "No number filter for double property. property"
            T1.X r11 = r9.f3175r
            r11.b(r1, r10)
            goto L_0x0157
        L_0x00b1:
            double r12 = r18.zza()
            com.google.android.gms.internal.measurement.zzfp r1 = r10.zzc()
            java.math.BigDecimal r10 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x00c6 }
            r10.<init>(r12)     // Catch:{ NumberFormatException -> 0x00c6 }
            double r12 = java.lang.Math.ulp(r12)     // Catch:{ NumberFormatException -> 0x00c6 }
            java.lang.Boolean r5 = c(r10, r1, r12)     // Catch:{ NumberFormatException -> 0x00c6 }
        L_0x00c6:
            java.lang.Boolean r5 = f(r5, r11)
            goto L_0x0157
        L_0x00cc:
            boolean r12 = r18.zzv()
            if (r12 == 0) goto L_0x0145
            boolean r12 = r10.zzk()
            if (r12 != 0) goto L_0x0131
            boolean r12 = r10.zzi()
            if (r12 != 0) goto L_0x00f1
            T1.C0212u0.k(r9)
            java.lang.String r10 = r18.zzg()
            java.lang.String r1 = r1.f(r10)
            java.lang.String r10 = "No string or number filter defined. property"
            T1.X r11 = r9.f3175r
            r11.b(r1, r10)
            goto L_0x0157
        L_0x00f1:
            java.lang.String r12 = r18.zzh()
            boolean r12 = T1.C0162d0.s(r12)
            if (r12 == 0) goto L_0x011a
            java.lang.String r1 = r18.zzh()
            com.google.android.gms.internal.measurement.zzfp r10 = r10.zzc()
            boolean r12 = T1.C0162d0.s(r1)
            if (r12 != 0) goto L_0x010a
            goto L_0x0115
        L_0x010a:
            java.math.BigDecimal r12 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0115 }
            r12.<init>(r1)     // Catch:{ NumberFormatException -> 0x0115 }
            r13 = 0
            java.lang.Boolean r5 = c(r12, r10, r13)     // Catch:{ NumberFormatException -> 0x0115 }
        L_0x0115:
            java.lang.Boolean r5 = f(r5, r11)
            goto L_0x0157
        L_0x011a:
            T1.C0212u0.k(r9)
            java.lang.String r10 = r18.zzg()
            java.lang.String r1 = r1.f(r10)
            java.lang.String r10 = r18.zzh()
            java.lang.String r11 = "Invalid user property value for Numeric number filter. property, value"
            T1.X r12 = r9.f3175r
            r12.c(r11, r1, r10)
            goto L_0x0157
        L_0x0131:
            java.lang.String r1 = r18.zzh()
            com.google.android.gms.internal.measurement.zzfv r5 = r10.zzd()
            T1.C0212u0.k(r9)
            java.lang.Boolean r1 = d(r1, r5, r9)
            java.lang.Boolean r5 = f(r1, r11)
            goto L_0x0157
        L_0x0145:
            T1.C0212u0.k(r9)
            java.lang.String r10 = r18.zzg()
            java.lang.String r1 = r1.f(r10)
            java.lang.String r10 = "User property has no value, property"
            T1.X r11 = r9.f3175r
            r11.b(r1, r10)
        L_0x0157:
            T1.C0212u0.k(r9)
            if (r5 != 0) goto L_0x015f
            java.lang.String r1 = "null"
            goto L_0x0160
        L_0x015f:
            r1 = r5
        L_0x0160:
            java.lang.String r10 = "Property filter result"
            T1.X r9 = r9.f3180w
            r9.b(r1, r10)
            if (r5 != 0) goto L_0x016a
            return r7
        L_0x016a:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.f3235c = r1
            if (r6 == 0) goto L_0x0178
            boolean r1 = r5.booleanValue()
            if (r1 == 0) goto L_0x0177
            goto L_0x0178
        L_0x0177:
            return r8
        L_0x0178:
            if (r19 == 0) goto L_0x0180
            boolean r1 = r3.zzg()
            if (r1 == 0) goto L_0x0182
        L_0x0180:
            r0.d = r5
        L_0x0182:
            boolean r1 = r5.booleanValue()
            if (r1 == 0) goto L_0x01c1
            if (r4 == 0) goto L_0x01c1
            boolean r1 = r18.zzu()
            if (r1 == 0) goto L_0x01c1
            long r4 = r18.zzd()
            if (r16 == 0) goto L_0x019a
            long r4 = r16.longValue()
        L_0x019a:
            if (r2 == 0) goto L_0x01ae
            boolean r1 = r3.zzg()
            if (r1 == 0) goto L_0x01ae
            boolean r1 = r3.zzh()
            if (r1 != 0) goto L_0x01ae
            if (r17 == 0) goto L_0x01ae
            long r4 = r17.longValue()
        L_0x01ae:
            boolean r1 = r3.zzh()
            if (r1 == 0) goto L_0x01bb
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            r0.f3237f = r1
            goto L_0x01c1
        L_0x01bb:
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            r0.f3236e = r1
        L_0x01c1:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.C0155b.b(java.lang.Long, java.lang.Long, com.google.android.gms.internal.measurement.zzio, boolean):boolean");
    }
}
