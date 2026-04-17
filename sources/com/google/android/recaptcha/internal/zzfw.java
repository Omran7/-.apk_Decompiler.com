package com.google.android.recaptcha.internal;

import G5.A;
import G5.C;
import G5.F;
import android.webkit.WebView;
import java.util.Arrays;
import o5.d;

public final class zzfw {
    /* access modifiers changed from: private */
    public final WebView zza;
    private final C zzb;

    public zzfw(WebView webView, C c3) {
        this.zza = webView;
        this.zzb = c3;
    }

    public final void zzb(String str, String... strArr) {
        F.q(this.zzb, (A) null, new zzfv((String[]) Arrays.copyOf(strArr, strArr.length), this, str, (d) null), 3);
    }
}
