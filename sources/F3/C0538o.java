package f3;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p002firebaseauthapi.zzaj;

/* renamed from: f3.o  reason: case insensitive filesystem */
public final class C0538o {

    /* renamed from: a  reason: collision with root package name */
    public static final zzaj f7948a = zzaj.zza("firebaseAppName", "firebaseUserUid", "operation", "tenantId", "verifyAssertionRequest", "statusCode", "statusMessage", "timestamp");

    /* renamed from: b  reason: collision with root package name */
    public static final C0538o f7949b = new Object();

    public static void a(Context context, Status status) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putInt("statusCode", status.f6007a);
        edit.putString("statusMessage", status.f6008b);
        edit.putLong("timestamp", System.currentTimeMillis());
        edit.commit();
    }

    public static void b(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        zzaj zzaj = f7948a;
        int size = zzaj.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = zzaj.get(i2);
            i2++;
            edit.remove((String) obj);
        }
        edit.commit();
    }
}
