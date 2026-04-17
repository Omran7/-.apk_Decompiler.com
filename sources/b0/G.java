package B0;

import android.os.Handler;
import android.os.Message;

public final class G implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f198a;

    public /* synthetic */ G(int i2) {
        this.f198a = i2;
    }

    public final boolean handleMessage(Message message) {
        switch (this.f198a) {
            case 0:
                if (message.what != 1) {
                    return false;
                }
                ((D) message.obj).d();
                return true;
            default:
                int i2 = message.what;
                if (i2 == 0) {
                    message.obj.getClass();
                    throw new ClassCastException();
                } else if (i2 != 1) {
                    return false;
                } else {
                    message.obj.getClass();
                    throw new ClassCastException();
                }
        }
    }
}
