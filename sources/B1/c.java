package B1;

import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.C0370y;
import com.google.android.gms.common.api.internal.C0371z;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.internal.C0392v;
import com.google.android.gms.internal.base.zaf;
import com.google.android.gms.tasks.Task;
import z1.d;

public final class c extends l {

    /* renamed from: a  reason: collision with root package name */
    public static final i f339a = new i("ClientTelemetry.API", new b(0), new Object());

    public final Task c(C0392v vVar) {
        C0370y a6 = C0371z.a();
        a6.f6115e = new d[]{zaf.zaa};
        a6.f6114c = false;
        a6.d = new U3.c((Object) vVar, 5);
        return doBestEffortWrite((C0371z) a6.a());
    }
}
