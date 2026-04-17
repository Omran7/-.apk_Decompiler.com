package com.google.android.gms.internal.measurement;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import q.C0928e;

final class zznj {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static String zza(zznh zznh, String str) {
        StringBuilder b6 = C0928e.b("# ", str);
        zzd(zznh, b6, 0);
        return b6.toString();
    }

    public static void zzb(StringBuilder sb, int i2, String str, Object obj) {
        if (obj instanceof List) {
            for (Object zzb : (List) obj) {
                zzb(sb, i2, str, zzb);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry zzb2 : ((Map) obj).entrySet()) {
                zzb(sb, i2, str, zzb2);
            }
        } else {
            sb.append(10);
            zzc(i2, sb);
            if (!str.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Character.toLowerCase(str.charAt(0)));
                for (int i5 = 1; i5 < str.length(); i5++) {
                    char charAt = str.charAt(i5);
                    if (Character.isUpperCase(charAt)) {
                        sb2.append("_");
                    }
                    sb2.append(Character.toLowerCase(charAt));
                }
                str = sb2.toString();
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                zzld zzld = zzld.zzb;
                sb.append(zzoc.zza(new zzlb(((String) obj).getBytes(zzmk.zza))));
                sb.append('\"');
            } else if (obj instanceof zzld) {
                sb.append(": \"");
                sb.append(zzoc.zza((zzld) obj));
                sb.append('\"');
            } else if (obj instanceof zzmd) {
                sb.append(" {");
                zzd((zzmd) obj, sb, i2 + 2);
                sb.append("\n");
                zzc(i2, sb);
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                int i6 = i2 + 2;
                sb.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                zzb(sb, i6, "key", entry.getKey());
                zzb(sb, i6, "value", entry.getValue());
                sb.append("\n");
                zzc(i2, sb);
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj);
            }
        }
    }

    private static void zzc(int i2, StringBuilder sb) {
        while (i2 > 0) {
            int i5 = 80;
            if (i2 <= 80) {
                i5 = i2;
            }
            sb.append(zza, 0, i5);
            i2 -= i5;
        }
    }

    private static void zzd(zznh zznh, StringBuilder sb, int i2) {
        int i5;
        boolean z3;
        Method method;
        Method method2;
        zznh zznh2 = zznh;
        StringBuilder sb2 = sb;
        int i6 = i2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zznh.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i7 = 0;
        while (true) {
            i5 = 3;
            if (i7 >= length) {
                break;
            }
            Method method3 = declaredMethods[i7];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i7++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i5);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                zzb(sb2, i6, substring.substring(0, substring.length() - 4), zzmd.zzcp(method2, zznh2, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                zzb(sb2, i6, substring.substring(0, substring.length() - 3), zzmd.zzcp(method, zznh2, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object zzcp = zzmd.zzcp(method4, zznh2, new Object[0]);
                    if (method5 == null) {
                        if (zzcp instanceof Boolean) {
                            if (!((Boolean) zzcp).booleanValue()) {
                            }
                        } else if (zzcp instanceof Integer) {
                            if (((Integer) zzcp).intValue() == 0) {
                            }
                        } else if (zzcp instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) zzcp).floatValue()) == 0) {
                            }
                        } else if (!(zzcp instanceof Double)) {
                            if (zzcp instanceof String) {
                                z3 = zzcp.equals("");
                            } else if (zzcp instanceof zzld) {
                                z3 = zzcp.equals(zzld.zzb);
                            } else if (zzcp instanceof zznh) {
                                if (zzcp == ((zznh) zzcp).zzcC()) {
                                }
                            } else if ((zzcp instanceof Enum) && ((Enum) zzcp).ordinal() == 0) {
                            }
                            if (z3) {
                            }
                        } else if (Double.doubleToRawLongBits(((Double) zzcp).doubleValue()) == 0) {
                        }
                    } else if (!((Boolean) zzmd.zzcp(method5, zznh2, new Object[0])).booleanValue()) {
                    }
                    zzb(sb2, i6, substring, zzcp);
                }
            }
            i5 = 3;
        }
        if (zznh2 instanceof zzma) {
            Iterator zze = ((zzma) zznh2).zzb.zze();
            if (zze.hasNext()) {
                zzmb zzmb = (zzmb) ((Map.Entry) zze.next()).getKey();
                throw null;
            }
        }
        zzof zzof = ((zzmd) zznh2).zzc;
        if (zzof != null) {
            zzof.zzi(sb2, i6);
        }
    }
}
