package com.google.android.gms.internal.p002firebaseauthapi;

import C1.a;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.I;
import e3.s;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaeg  reason: invalid package */
public class zzaeg {
    private final zzaed zza;
    private final a zzb;

    public zzaeg(zzaeg zzaeg) {
        this(zzaeg.zza, zzaeg.zzb);
    }

    public final void zza(String str) {
        try {
            this.zza.zza(str);
        } catch (RemoteException e6) {
            this.zzb.b("RemoteException when sending auto retrieval timeout response.", e6, new Object[0]);
        }
    }

    public void zzb(String str) {
        try {
            this.zza.zzb(str);
        } catch (RemoteException e6) {
            this.zzb.b("RemoteException when sending send verification code response.", e6, new Object[0]);
        }
    }

    public final void zzc(String str) {
        try {
            this.zza.zzc(str);
        } catch (RemoteException e6) {
            this.zzb.b("RemoteException when sending set account info response.", e6, new Object[0]);
        }
    }

    public final void zza(zzagn zzagn) {
        try {
            this.zza.zza(zzagn);
        } catch (RemoteException e6) {
            this.zzb.b("RemoteException when sending create auth uri response.", e6, new Object[0]);
        }
    }

    public final void zzb() {
        try {
            this.zza.zzb();
        } catch (RemoteException e6) {
            this.zzb.b("RemoteException when sending email verification response.", e6, new Object[0]);
        }
    }

    public final void zzc() {
        try {
            this.zza.zzc();
        } catch (RemoteException e6) {
            this.zzb.b("RemoteException when setting FirebaseUI Version", e6, new Object[0]);
        }
    }

    public zzaeg(zzaed zzaed, a aVar) {
        I.g(zzaed);
        this.zza = zzaed;
        I.g(aVar);
        this.zzb = aVar;
    }

    public final void zza() {
        try {
            this.zza.zza();
        } catch (RemoteException e6) {
            this.zzb.b("RemoteException when sending delete account response.", e6, new Object[0]);
        }
    }

    public final void zza(zzaak zzaak) {
        try {
            this.zza.zza(zzaak);
        } catch (RemoteException e6) {
            this.zzb.b("RemoteException when sending failure result with credential", e6, new Object[0]);
        }
    }

    public final void zza(zzaaj zzaaj) {
        try {
            this.zza.zza(zzaaj);
        } catch (RemoteException e6) {
            this.zzb.b("RemoteException when sending failure result for mfa", e6, new Object[0]);
        }
    }

    public final void zza(Status status, s sVar) {
        try {
            this.zza.zza(status, sVar);
        } catch (RemoteException e6) {
            this.zzb.b("RemoteException when sending failure result.", e6, new Object[0]);
        }
    }

    public void zza(Status status) {
        try {
            this.zza.zza(status);
        } catch (RemoteException e6) {
            this.zzb.b("RemoteException when sending failure result.", e6, new Object[0]);
        }
    }

    public final void zza(zzahj zzahj) {
        try {
            this.zza.zza(zzahj);
        } catch (RemoteException e6) {
            this.zzb.b("RemoteException when sending Play Integrity Producer project response.", e6, new Object[0]);
        }
    }

    public final void zza(zzahk zzahk) {
        try {
            this.zza.zza(zzahk);
        } catch (RemoteException e6) {
            this.zzb.b("RemoteException when sending get recaptcha config response.", e6, new Object[0]);
        }
    }

    public final void zza(zzahn zzahn, zzahc zzahc) {
        try {
            this.zza.zza(zzahn, zzahc);
        } catch (RemoteException e6) {
            this.zzb.b("RemoteException when sending get token and account info user response", e6, new Object[0]);
        }
    }

    public final void zza(zzahx zzahx) {
        try {
            this.zza.zza(zzahx);
        } catch (RemoteException e6) {
            this.zzb.b("RemoteException when sending password reset response.", e6, new Object[0]);
        }
    }

    public final void zza(zzahy zzahy) {
        try {
            this.zza.zza(zzahy);
        } catch (RemoteException e6) {
            this.zzb.b("RemoteException when sending revoke token response.", e6, new Object[0]);
        }
    }

    public final void zza(zzaij zzaij) {
        try {
            this.zza.zza(zzaij);
        } catch (RemoteException e6) {
            this.zzb.b("RemoteException when sending start mfa enrollment response.", e6, new Object[0]);
        }
    }

    public final void zza(zzahn zzahn) {
        try {
            this.zza.zza(zzahn);
        } catch (RemoteException e6) {
            this.zzb.b("RemoteException when sending token result.", e6, new Object[0]);
        }
    }

    public final void zza(s sVar) {
        try {
            this.zza.zza(sVar);
        } catch (RemoteException e6) {
            this.zzb.b("RemoteException when sending verification completed response.", e6, new Object[0]);
        }
    }
}
