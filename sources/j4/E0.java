package j4;

import R2.b;
import Y4.D;
import android.support.v4.media.session.a;
import com.google.android.gms.tasks.OnSuccessListener;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.Q;
import com.mtma.criminal.city.utils.v0;
import d5.C0470c;
import d5.o;
import java.util.List;
import r4.j;

public final /* synthetic */ class E0 implements OnSuccessListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8866a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f8867b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f8868c;

    public /* synthetic */ E0(Object obj, int i2, int i5) {
        this.f8866a = i5;
        this.f8868c = obj;
        this.f8867b = i2;
    }

    public final void onSuccess(Object obj) {
        Void voidR = (Void) obj;
        switch (this.f8866a) {
            case 0:
                M0 m02 = ((F0) this.f8868c).f8873b;
                List list = m02.f8920b;
                int i2 = this.f8867b;
                list.remove(i2);
                m02.f8920b.add(i2, D.f());
                m02.notifyDataSetChanged();
                b.w(false);
                v0.e(m02.f8919a, MyApplication.f7090a.getApplicationContext().getString(R.string.toast_successfully));
                b.M0(R.raw.add_new_item);
                return;
            default:
                j jVar = (j) this.f8868c;
                jVar.getClass();
                C0470c chatObject = o.getChatObject();
                int i5 = this.f8867b;
                chatObject.setSpeakersNumber((long) i5);
                jVar.f11252k0.setText(String.valueOf(i5));
                jVar.f11251j0.setText("");
                b.w(false);
                Q.b(6, o.getAccountObject().getId(), (long) 1);
                a.C0(0, 3, 1, o.getAccountObject().getId());
                return;
        }
    }
}
