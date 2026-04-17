package com.google.android.recaptcha.internal;

import com.bumptech.glide.d;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.zip.GZIPInputStream;
import kotlin.jvm.internal.j;
import m5.C0844c;
import m5.C0848g;

public final class zzfa implements zzey {
    private final C0844c zza = d.N0(zzez.zza);

    public zzfa() {
        int i2 = zzav.zza;
    }

    public final zzsc zza(String str, zzto zzto) {
        zzew zzew = null;
        try {
            zzew = ((zzex) ((C0848g) this.zza).a()).zza(str);
            zzew.zzc();
            zzew.zze(zzto.zzd());
            zzsc zzsc = (zzsc) zzew.zza(zzsc.zzi());
            zzew.zzd();
            return zzsc;
        } catch (zzbd e6) {
            e = e6;
            if (zzew != null) {
                if (j.a(e.zza(), zzba.zzau)) {
                    try {
                        e = zzbc.zza(zztu.zzg(zzew.zzb().getErrorStream()).zzi());
                    } catch (Exception e7) {
                        e = new zzbd(zzbb.zzc, zzba.zzG, e7.getMessage());
                    }
                }
                throw e;
            }
            throw e;
        } catch (Exception e8) {
            throw new zzbd(zzbb.zzc, zzba.zzF, e8.getMessage());
        } catch (Throwable th) {
            if (zzew != null) {
                zzew.zzd();
            }
            throw th;
        }
    }

    public final String zzb(String str) {
        InputStreamReader inputStreamReader;
        try {
            try {
                URLConnection openConnection = new URL(str).openConnection();
                j.c(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setDoInput(true);
                httpURLConnection.setRequestProperty("Accept", "application/x-protobuffer");
                httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
                httpURLConnection.connect();
                if (httpURLConnection.getResponseCode() == 200) {
                    try {
                        if ("gzip".equals(httpURLConnection.getContentEncoding())) {
                            inputStreamReader = new InputStreamReader(new GZIPInputStream(httpURLConnection.getInputStream()));
                        } else {
                            inputStreamReader = new InputStreamReader(httpURLConnection.getInputStream());
                        }
                        StringWriter stringWriter = new StringWriter();
                        char[] cArr = new char[8192];
                        for (int read = inputStreamReader.read(cArr); read >= 0; read = inputStreamReader.read(cArr)) {
                            stringWriter.write(cArr, 0, read);
                        }
                        String stringWriter2 = stringWriter.toString();
                        j.d(stringWriter2, "toString(...)");
                        return stringWriter2;
                    } catch (Exception unused) {
                        throw new zzbd(zzbb.zzc, zzba.zzP, (String) null);
                    }
                } else {
                    throw new zzbd(zzbb.zzc, new zzba(httpURLConnection.getResponseCode()), (String) null);
                }
            } catch (Exception unused2) {
                throw new zzbd(zzbb.zzc, zzba.zzO, (String) null);
            }
        } catch (Exception unused3) {
            throw new zzbd(zzbb.zzb, zzba.zzN, (String) null);
        }
    }
}
