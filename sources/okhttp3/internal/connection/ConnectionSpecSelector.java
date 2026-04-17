package okhttp3.internal.connection;

import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.ConnectionSpec;
import okhttp3.internal.Internal;

public final class ConnectionSpecSelector {

    /* renamed from: a  reason: collision with root package name */
    public final List f10705a;

    /* renamed from: b  reason: collision with root package name */
    public int f10706b = 0;

    /* renamed from: c  reason: collision with root package name */
    public boolean f10707c;
    public boolean d;

    public ConnectionSpecSelector(List list) {
        this.f10705a = list;
    }

    public final ConnectionSpec a(SSLSocket sSLSocket) {
        boolean z3;
        ConnectionSpec connectionSpec;
        int i2 = this.f10706b;
        List list = this.f10705a;
        int size = list.size();
        while (true) {
            z3 = true;
            if (i2 >= size) {
                connectionSpec = null;
                break;
            }
            connectionSpec = (ConnectionSpec) list.get(i2);
            if (connectionSpec.a(sSLSocket)) {
                this.f10706b = i2 + 1;
                break;
            }
            i2++;
        }
        if (connectionSpec != null) {
            int i5 = this.f10706b;
            while (true) {
                if (i5 >= list.size()) {
                    z3 = false;
                    break;
                } else if (((ConnectionSpec) list.get(i5)).a(sSLSocket)) {
                    break;
                } else {
                    i5++;
                }
            }
            this.f10707c = z3;
            Internal.f10681a.c(connectionSpec, sSLSocket, this.d);
            return connectionSpec;
        }
        throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.d + ", modes=" + list + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
    }
}
