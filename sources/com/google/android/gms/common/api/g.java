package com.google.android.gms.common.api;

import com.google.android.gms.common.internal.C0375d;
import com.google.android.gms.common.internal.C0376e;
import com.google.android.gms.common.internal.C0386o;
import java.util.Set;
import z1.d;

public interface g extends b {
    void connect(C0375d dVar);

    void disconnect();

    void disconnect(String str);

    d[] getAvailableFeatures();

    String getEndpointPackageName();

    String getLastDisconnectMessage();

    int getMinApkVersion();

    void getRemoteService(C0386o oVar, Set set);

    Set getScopesForConnectionlessNonSignIn();

    boolean isConnected();

    boolean isConnecting();

    void onUserSignOut(C0376e eVar);

    boolean requiresGooglePlayServices();

    boolean requiresSignIn();
}
