package com.google.android.recaptcha.internal;

import C5.a;
import C5.b;
import F5.i;
import android.content.Context;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.j;
import n5.C0875g;
import n5.C0877i;
import x5.l;

public final class zzbm implements zzaq {
    private final Context zza;
    private final String zzb = "rce_";

    public zzbm(Context context) {
        this.zza = context;
        new zzcd(context);
    }

    public final String zza(String str) {
        File file = new File(this.zza.getCacheDir(), this.zzb.concat(String.valueOf(str)));
        if (file.exists()) {
            return new String(zzcd.zza(file), StandardCharsets.UTF_8);
        }
        return null;
    }

    public final void zzb() {
        try {
            File[] listFiles = this.zza.getCacheDir().listFiles();
            if (listFiles != null) {
                ArrayList arrayList = new ArrayList();
                for (File file : listFiles) {
                    if (i.W0(file.getName(), this.zzb)) {
                        arrayList.add(file);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((File) it2.next()).delete();
                }
            }
        } catch (Exception unused) {
        }
    }

    public final void zzc(String str, String str2) {
        a aVar = new a('A', 'z');
        ArrayList arrayList = new ArrayList(C0877i.T0(aVar));
        Iterator it2 = aVar.iterator();
        while (((b) it2).f479c) {
            b bVar = (b) it2;
            int i2 = bVar.d;
            if (i2 != bVar.f478b) {
                bVar.d = bVar.f477a + i2;
            } else if (bVar.f479c) {
                bVar.f479c = false;
            } else {
                throw new NoSuchElementException();
            }
            arrayList.add(Character.valueOf((char) i2));
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        Collections.shuffle(arrayList2);
        String U02 = C0875g.U0(arrayList2.subList(0, 8), "", (String) null, (String) null, (l) null, 62);
        File file = new File(this.zza.getCacheDir(), this.zzb.concat(U02));
        zzcd.zzb(file, String.valueOf(str2).getBytes(StandardCharsets.UTF_8));
        file.renameTo(new File(this.zza.getCacheDir(), this.zzb.concat(String.valueOf(str))));
    }

    public final boolean zzd(String str) {
        try {
            File[] listFiles = this.zza.getCacheDir().listFiles();
            File file = null;
            if (listFiles != null) {
                int length = listFiles.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    File file2 = listFiles[i2];
                    if (j.a(file2.getName(), this.zzb + str)) {
                        file = file2;
                        break;
                    }
                    i2++;
                }
            }
            if (file != null) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
