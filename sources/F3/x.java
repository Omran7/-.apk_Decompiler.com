package f3;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzbg;
import com.google.android.gms.internal.p002firebaseauthapi.zzbh;
import com.google.android.gms.internal.p002firebaseauthapi.zzbx;
import com.google.android.gms.internal.p002firebaseauthapi.zzks;
import com.google.android.gms.internal.p002firebaseauthapi.zzkv;
import com.google.android.gms.internal.p002firebaseauthapi.zzlg;
import com.google.android.gms.internal.p002firebaseauthapi.zzmy;
import com.google.android.gms.internal.p002firebaseauthapi.zzp;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

public final class x {

    /* renamed from: c  reason: collision with root package name */
    public static x f7961c;

    /* renamed from: a  reason: collision with root package name */
    public final String f7962a;

    /* renamed from: b  reason: collision with root package name */
    public final zzmy f7963b;

    public x(Context context, String str) {
        zzmy zzmy;
        this.f7962a = str;
        try {
            zzks.zza();
            zzmy.zza zza = new zzmy.zza();
            zzmy.zza zza2 = zza.zza(context, "GenericIdpKeyset", "com.google.firebase.auth.api.crypto." + str).zza(zzlg.zza);
            zza2.zza("android-keystore://firebear_master_key_id." + str);
            zzmy = zza2.zza();
        } catch (IOException | GeneralSecurityException e6) {
            String message = e6.getMessage();
            Log.e("FirebearCryptoHelper", "Exception encountered during crypto setup:\n" + message);
            zzmy = null;
        }
        this.f7963b = zzmy;
    }

    public static x a(Context context, String str) {
        x xVar = f7961c;
        if (xVar == null || !zzp.zza(xVar.f7962a, str)) {
            f7961c = new x(context, str);
        }
        return f7961c;
    }

    public final String b() {
        if (this.f7963b == null) {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to get Public key");
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        zzbx zza = zzbg.zza((OutputStream) byteArrayOutputStream);
        try {
            synchronized (this.f7963b) {
                this.f7963b.zza().zzb().zza(zza);
            }
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 8);
        } catch (IOException | GeneralSecurityException e6) {
            String message = e6.getMessage();
            Log.e("FirebearCryptoHelper", "Exception encountered when attempting to get Public Key:\n" + message);
            return null;
        }
    }

    public final String c(String str) {
        String str2;
        zzmy zzmy = this.f7963b;
        if (zzmy == null) {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to decrypt payload");
            return null;
        }
        try {
            synchronized (zzmy) {
                str2 = new String(((zzbh) this.f7963b.zza().zza(zzkv.zza(), zzbh.class)).zza(Base64.decode(str, 8), (byte[]) null), "UTF-8");
            }
            return str2;
        } catch (UnsupportedEncodingException | GeneralSecurityException e6) {
            String message = e6.getMessage();
            Log.e("FirebearCryptoHelper", "Exception encountered while decrypting bytes:\n" + message);
            return null;
        }
    }
}
