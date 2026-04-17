package f3;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzco;
import com.google.android.gms.internal.p002firebaseauthapi.zzcy;
import com.google.android.gms.internal.p002firebaseauthapi.zzmy;
import com.google.android.gms.internal.p002firebaseauthapi.zzp;
import java.io.IOException;
import java.security.GeneralSecurityException;

/* renamed from: f3.q  reason: case insensitive filesystem */
public final class C0540q {

    /* renamed from: c  reason: collision with root package name */
    public static C0540q f7950c;

    /* renamed from: a  reason: collision with root package name */
    public final String f7951a;

    /* renamed from: b  reason: collision with root package name */
    public final zzmy f7952b;

    public C0540q(String str, zzmy zzmy) {
        this.f7951a = str;
        this.f7952b = zzmy;
    }

    public static C0540q a(Context context, String str) {
        zzmy zzmy;
        C0540q qVar = f7950c;
        if (qVar == null || !zzp.zza(qVar.f7951a, str)) {
            try {
                zzco.zza();
                zzmy.zza zza = new zzmy.zza();
                zzmy.zza zza2 = zza.zza(context, "StorageCryptoKeyset", "com.google.firebase.auth.api.crypto." + str).zza(zzcy.zzb);
                zzmy = zza2.zza("android-keystore://firebear_main_key_id_for_storage_crypto." + str).zza();
            } catch (IOException | GeneralSecurityException e6) {
                String message = e6.getMessage();
                Log.e("FirebearStorageCryptoHelper", "Exception encountered during crypto setup:\n" + message);
                zzmy = null;
            }
            f7950c = new C0540q(str, zzmy);
        }
        return f7950c;
    }
}
