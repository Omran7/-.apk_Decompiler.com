package androidx.credentials.playservices;

import R.a;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import kotlin.jvm.internal.j;

public final class CredentialProviderMetadataHolder extends Service {

    /* renamed from: a  reason: collision with root package name */
    public final a f4916a = new Binder();

    public final IBinder onBind(Intent intent) {
        j.e(intent, "intent");
        return this.f4916a;
    }
}
