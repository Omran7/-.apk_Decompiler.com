package P4;

import G.l;
import R2.b;
import android.os.Trace;
import androidx.emoji2.text.j;
import com.bumptech.glide.c;
import com.google.android.gms.internal.measurement.zzki;
import com.google.firebase.auth.FirebaseAuth;
import com.mtma.criminal.city.utils.r0;
import com.mtma.criminal.city.utils.v0;
import d5.o;

public final class q implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2269a;

    public /* synthetic */ q(int i2) {
        this.f2269a = i2;
    }

    public final void run() {
        boolean z3 = true;
        switch (this.f2269a) {
            case 0:
                o.clearData();
                b.w(true);
                FirebaseAuth.getInstance().b();
                return;
            case 1:
                zzki.zzc();
                return;
            case 2:
                try {
                    int i2 = l.f807a;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (j.f4933k == null) {
                        z3 = false;
                    }
                    if (z3) {
                        j.a().c();
                    }
                    Trace.endSection();
                    return;
                } catch (Throwable th) {
                    int i5 = l.f807a;
                    Trace.endSection();
                    throw th;
                }
            case 3:
                if (c.f5747r) {
                    c.f5744o++;
                    c.f5743n++;
                    c.f5745p.postDelayed(c.f5746q, 1000);
                    if (c.f5743n >= 55 && !c.f5748s) {
                        c.f5748s = true;
                        c.s(false, (r0) null);
                        return;
                    }
                    return;
                }
                c.B0();
                return;
            default:
                v0.f7482a = false;
                return;
        }
    }
}
