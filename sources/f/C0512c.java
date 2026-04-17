package f;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.media.session.a;
import f0.C0520a;
import java.lang.ref.WeakReference;

/* renamed from: f.c  reason: case insensitive filesystem */
public final class C0512c extends Handler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7758a = 0;

    /* renamed from: b  reason: collision with root package name */
    public Object f7759b;

    public /* synthetic */ C0512c() {
    }

    public final void handleMessage(Message message) {
        int size;
        a[] aVarArr;
        switch (this.f7758a) {
            case 0:
                int i2 = message.what;
                if (i2 == -3 || i2 == -2 || i2 == -1) {
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) ((WeakReference) this.f7759b).get(), message.what);
                    return;
                } else if (i2 == 1) {
                    ((DialogInterface) message.obj).dismiss();
                    return;
                } else {
                    return;
                }
            default:
                if (message.what != 1) {
                    super.handleMessage(message);
                    return;
                }
                C0520a aVar = (C0520a) this.f7759b;
                do {
                    synchronized (aVar.f7877b) {
                        try {
                            size = aVar.d.size();
                            if (size > 0) {
                                aVarArr = new a[size];
                                aVar.d.toArray(aVarArr);
                                aVar.d.clear();
                            } else {
                                return;
                            }
                        } catch (Throwable th) {
                            while (true) {
                                throw th;
                                break;
                            }
                        }
                    }
                } while (size <= 0);
                a aVar2 = aVarArr[0];
                throw null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0512c(C0520a aVar, Looper looper) {
        super(looper);
        this.f7759b = aVar;
    }
}
