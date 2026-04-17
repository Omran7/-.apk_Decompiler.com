package j3;

import Q3.a;
import R2.c;
import com.google.android.gms.tasks.OnFailureListener;
import l3.C0782a;
import m0.a0;
import n3.C0863d;
import q3.b;

public final /* synthetic */ class d implements OnFailureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8825a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a0 f8826b;

    public /* synthetic */ d(a0 a0Var, int i2) {
        this.f8825a = i2;
        this.f8826b = a0Var;
    }

    public final void onFailure(Exception exc) {
        switch (this.f8825a) {
            case 0:
                String message = exc.getMessage();
                a0 a0Var = this.f8826b;
                ((b) a0Var.f9925b).execute(new C0863d((C0782a) a0Var.f9926c, message, 1));
                return;
            default:
                boolean z3 = exc instanceof c;
                a0 a0Var2 = this.f8826b;
                if (z3 || (exc instanceof a)) {
                    a0Var2.q((String) null);
                    return;
                }
                ((b) a0Var2.f9925b).execute(new C0863d((C0782a) a0Var2.f9926c, exc.getMessage(), 1));
                return;
        }
    }
}
