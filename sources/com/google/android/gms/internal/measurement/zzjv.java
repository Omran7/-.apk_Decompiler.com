package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import n.j;
import z2.C1134a;
import z2.C1136c;
import z2.C1137d;

public final class zzjv {
    private static volatile C1136c zza;

    private zzjv() {
    }

    public static C1136c zza(Context context) {
        C1136c cVar;
        StrictMode.ThreadPolicy allowThreadDiskReads;
        C1136c cVar2;
        BufferedReader bufferedReader;
        C1136c cVar3 = zza;
        if (cVar3 == null) {
            synchronized (zzjv.class) {
                try {
                    cVar3 = zza;
                    if (cVar3 == null) {
                        String str = Build.TYPE;
                        String str2 = Build.TAGS;
                        int i2 = zzjx.zza;
                        if (!str.equals("eng")) {
                            if (str.equals("userdebug")) {
                            }
                            cVar = C1134a.f12854a;
                            zza = cVar;
                            cVar3 = cVar;
                        }
                        if (!str2.contains("dev-keys")) {
                            if (str2.contains("test-keys")) {
                            }
                            cVar = C1134a.f12854a;
                            zza = cVar;
                            cVar3 = cVar;
                        }
                        if (zzji.zzc() && !context.isDeviceProtectedStorage()) {
                            context = context.createDeviceProtectedStorageContext();
                        }
                        allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        StrictMode.allowThreadDiskWrites();
                        try {
                            File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
                            if (file.exists()) {
                                cVar2 = new C1137d(file);
                            } else {
                                cVar2 = C1134a.f12854a;
                            }
                        } catch (RuntimeException e6) {
                            Log.e("HermeticFileOverrides", "no data dir", e6);
                            cVar2 = C1134a.f12854a;
                        }
                        if (cVar2.b()) {
                            File file2 = (File) cVar2.a();
                            try {
                                bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
                                j jVar = new j(0);
                                HashMap hashMap = new HashMap();
                                while (true) {
                                    String readLine = bufferedReader.readLine();
                                    if (readLine == null) {
                                        break;
                                    }
                                    String[] split = readLine.split(" ", 3);
                                    if (split.length != 3) {
                                        Log.e("HermeticFileOverrides", "Invalid: " + readLine);
                                    } else {
                                        String str3 = new String(split[0]);
                                        String decode = Uri.decode(new String(split[1]));
                                        String str4 = (String) hashMap.get(split[2]);
                                        if (str4 == null) {
                                            String str5 = new String(split[2]);
                                            str4 = Uri.decode(str5);
                                            if (str4.length() < 1024 || str4 == str5) {
                                                hashMap.put(str5, str4);
                                            }
                                        }
                                        j jVar2 = (j) jVar.get(str3);
                                        if (jVar2 == null) {
                                            jVar2 = new j(0);
                                            jVar.put(str3, jVar2);
                                        }
                                        jVar2.put(decode, str4);
                                    }
                                }
                                String obj = file2.toString();
                                String packageName = context.getPackageName();
                                Log.w("HermeticFileOverrides", "Parsed " + obj + " for Android package " + packageName);
                                zzjo zzjo = new zzjo(jVar);
                                bufferedReader.close();
                                cVar = new C1137d(zzjo);
                            } catch (IOException e7) {
                                throw new RuntimeException(e7);
                            } catch (Throwable th) {
                                th.addSuppressed(th);
                            }
                        } else {
                            cVar = C1134a.f12854a;
                        }
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        zza = cVar;
                        cVar3 = cVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return cVar3;
        throw th;
    }
}
