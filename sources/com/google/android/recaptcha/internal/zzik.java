package com.google.android.recaptcha.internal;

import G5.C0046s;
import android.net.Uri;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.io.ByteArrayInputStream;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.j;

public final class zzik extends WebViewClient {
    final /* synthetic */ zzja zza;

    public zzik(zzja zzja) {
        this.zza = zzja;
    }

    public final void onLoadResource(WebView webView, String str) {
        System.currentTimeMillis();
    }

    public final void onPageFinished(WebView webView, String str) {
        long zza2 = this.zza.zzh.zza(TimeUnit.MICROSECONDS);
        int i2 = zzbk.zza;
        zzbk.zza(zzbl.zzg.zza(), zza2);
    }

    public final void onReceivedError(WebView webView, int i2, String str, String str2) {
        super.onReceivedError(webView, i2, str, str2);
        zzbb zzbb = zzbb.zzc;
        zzba zzba = (zzba) this.zza.zzd.get(Integer.valueOf(i2));
        if (zzba == null) {
            zzba = zzba.zzM;
        }
        zzbd zzbd = new zzbd(zzbb, zzba, (String) null);
        this.zza.zzA().hashCode();
        zzbd.getMessage();
        ((C0046s) this.zza.zzA()).L(zzbd);
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        zzja zzja = this.zza;
        Uri parse = Uri.parse(str);
        zzja.zzp(zzja);
        j.b(parse);
        if (!zzfk.zzc(parse) || zzja.zzp(this.zza).zza(parse)) {
            return super.shouldInterceptRequest(webView, str);
        }
        zzbd zzbd = new zzbd(zzbb.zzb, zzba.zzQ, (String) null);
        this.zza.zzA().hashCode();
        parse.toString();
        ((C0046s) this.zza.zzA()).L(zzbd);
        return new WebResourceResponse("text/plain", "UTF-8", new ByteArrayInputStream(new byte[0]));
    }
}
