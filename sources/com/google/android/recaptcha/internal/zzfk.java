package com.google.android.recaptcha.internal;

import F5.i;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.j;
import n5.C0876h;
import n5.C0877i;

public final class zzfk {
    private final List zza;

    public zzfk() {
        this(true);
    }

    public static final boolean zzc(Uri uri) {
        return zze(uri);
    }

    private final boolean zzd(String str) {
        List<String> list = this.zza;
        if (list != null && list.isEmpty()) {
            return false;
        }
        for (String W02 : list) {
            if (i.W0(str, W02)) {
                return true;
            }
        }
        return false;
    }

    private static final boolean zze(Uri uri) {
        if (TextUtils.isEmpty(uri.toString()) || !"https".equals(uri.getScheme()) || TextUtils.isEmpty(uri.getHost())) {
            return false;
        }
        return true;
    }

    private static final List zzf(List list) {
        ArrayList arrayList = new ArrayList(C0877i.T0(list));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add("https://" + ((String) it2.next()) + "/");
        }
        return arrayList;
    }

    public final boolean zza(Uri uri) {
        if (!zze(uri) || !zzd(uri.toString())) {
            return false;
        }
        return true;
    }

    public final boolean zzb(String str) {
        Uri parse = Uri.parse(str);
        j.b(parse);
        if (!zze(parse) || !zzd(parse.toString())) {
            return false;
        }
        return true;
    }

    public zzfk(boolean z3) {
        this.zza = zzf(C0876h.S0("www.recaptcha.net", "www.gstatic.com/recaptcha", "www.gstatic.cn/recaptcha"));
    }
}
