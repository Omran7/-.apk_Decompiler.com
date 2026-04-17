package T1;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.internal.C0377f;

public final class T extends C0377f {
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        if (queryLocalInterface instanceof J) {
            return (J) queryLocalInterface;
        }
        return new I(iBinder);
    }

    public final int getMinApkVersion() {
        return 12451000;
    }

    public final String getServiceDescriptor() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    public final String getStartServiceAction() {
        return "com.google.android.gms.measurement.START";
    }
}
