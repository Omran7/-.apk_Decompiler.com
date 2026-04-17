package e3;

import A1.a;
import R2.i;
import android.app.PendingIntent;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.p002firebaseauthapi.zzaei;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import f3.C0528e;
import java.util.ArrayList;
import z1.C1132b;

public abstract class m extends a implements C0491B {
    public abstract String v();

    public abstract boolean w();

    public final Task x(C0496d dVar) {
        String str;
        FirebaseAuth instance = FirebaseAuth.getInstance(i.f(((C0528e) this).f7922c));
        instance.getClass();
        C0496d dVar2 = new C0496d(dVar.f7640a, dVar.f7641b, dVar.f7642c, dVar.d, dVar.f7643e);
        if (!TextUtils.isEmpty(dVar2.f7641b)) {
            str = "password";
        } else {
            str = "emailLink";
        }
        if ("password".equals(str)) {
            return new D(instance, false, this, dVar2, 1).Q0(instance, instance.f6867i, instance.f6870l);
        }
        String str2 = dVar2.f7642c;
        I.d(str2);
        if (instance.g(str2)) {
            return Tasks.forException(zzaei.zza(new Status(17072, (String) null, (PendingIntent) null, (C1132b) null)));
        }
        return new D(instance, true, this, dVar2, 1).Q0(instance, instance.f6867i, instance.f6869k);
    }

    public abstract C0528e y(ArrayList arrayList);

    public abstract void z(ArrayList arrayList);
}
