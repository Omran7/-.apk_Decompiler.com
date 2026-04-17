package com.google.android.recaptcha.internal;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import kotlin.jvm.internal.j;
import z1.m;

public final class zzew {
    private final HttpURLConnection zza;

    public zzew(HttpURLConnection httpURLConnection) {
        this.zza = httpURLConnection;
    }

    private final InputStream zzf() {
        try {
            return this.zza.getInputStream();
        } catch (UnknownServiceException e6) {
            throw new zzbd(zzbb.zzc, zzba.zzaf, e6.getMessage());
        } catch (IOException e7) {
            throw new zzbd(zzbb.zzc, zzba.zzae, e7.getMessage());
        } catch (Exception e8) {
            throw new zzbd(zzbb.zzc, zzba.zzak, e8.getMessage());
        }
    }

    private final OutputStream zzg() {
        try {
            return this.zza.getOutputStream();
        } catch (UnknownServiceException e6) {
            throw new zzbd(zzbb.zzc, zzba.zzaf, e6.getMessage());
        } catch (IOException e7) {
            throw new zzbd(zzbb.zzc, zzba.zzae, e7.getMessage());
        } catch (Exception e8) {
            throw new zzbd(zzbb.zzc, zzba.zzak, e8.getMessage());
        }
    }

    public final zzoi zza(zzoi zzoi) {
        zzbd zzbd;
        try {
            int responseCode = this.zza.getResponseCode();
            if (responseCode != 200) {
                if (responseCode == 400) {
                    zzbd = new zzbd(zzbb.zzc, zzba.zzau, (String) null);
                } else if (responseCode == 503) {
                    zzbd = new zzbd(zzbb.zzi, zzba.zzJ, (String) null);
                } else if (responseCode == 403) {
                    zzbd = new zzbd(zzbb.zzi, zzba.zzJ, (String) null);
                } else if (responseCode != 404) {
                    zzbd = new zzbd(zzbb.zzc, zzba.zzK, (String) null);
                } else {
                    zzbd = new zzbd(zzbb.zzc, zzba.zzi, (String) null);
                }
                throw zzbd;
            }
            InputStream zzf = zzf();
            j.e(zzf, "<this>");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, zzf.available()));
            m.a(zzf, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            j.d(byteArray, "toByteArray(...)");
            if (byteArray.length != 0) {
                try {
                    Object zzb = zzoi.zzD().zzb(byteArray);
                    j.c(zzb, "null cannot be cast to non-null type T of com.google.android.libraries.abuse.recaptcha.network.CaptchaFeConnection.getResponse");
                    return (zzoi) zzb;
                } catch (Exception e6) {
                    throw new zzbd(zzbb.zzc, zzba.zzG, e6.getMessage());
                }
            } else {
                throw new zzbd(zzbb.zzc, zzba.zzat, (String) null);
            }
        } catch (Exception e7) {
            throw new zzbd(zzbb.zzc, zzba.zzah, e7.getMessage());
        }
    }

    public final HttpURLConnection zzb() {
        return this.zza;
    }

    public final void zzc() {
        try {
            this.zza.connect();
        } catch (SocketTimeoutException e6) {
            throw new zzbd(zzbb.zzc, zzba.zzac, e6.getMessage());
        } catch (IOException e7) {
            throw new zzbd(zzbb.zzc, zzba.zzad, e7.getMessage());
        } catch (Exception e8) {
            throw new zzbd(zzbb.zzc, zzba.zzaj, e8.getMessage());
        }
    }

    public final void zzd() {
        this.zza.disconnect();
    }

    public final void zze(byte[] bArr) {
        try {
            zzg().write(bArr);
        } catch (zzbd e6) {
            throw e6;
        } catch (IOException e7) {
            throw new zzbd(zzbb.zzc, zzba.zzag, e7.getMessage());
        } catch (Exception e8) {
            throw new zzbd(zzbb.zzc, zzba.zzal, e8.getMessage());
        }
    }
}
