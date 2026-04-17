package E2;

import F0.s;
import F0.t;
import F0.y;
import G.d;
import I3.j;
import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.support.v4.media.session.a;
import android.view.MenuItem;
import androidx.fragment.app.U;
import f.z;
import j.r;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.HashSet;
import javax.crypto.AEADBadTagException;

public abstract class f implements t {

    /* renamed from: a  reason: collision with root package name */
    public Object f620a;

    /* renamed from: b  reason: collision with root package name */
    public Object f621b;

    public /* synthetic */ f(Object obj, Object obj2) {
        this.f620a = obj;
        this.f621b = obj2;
    }

    public static byte[] k(byte[] bArr, ByteBuffer byteBuffer) {
        int i2;
        int i5;
        if (bArr.length % 16 == 0) {
            i2 = bArr.length;
        } else {
            i2 = (bArr.length + 16) - (bArr.length % 16);
        }
        int remaining = byteBuffer.remaining();
        int i6 = remaining % 16;
        if (i6 == 0) {
            i5 = remaining;
        } else {
            i5 = (remaining + 16) - i6;
        }
        int i7 = i5 + i2;
        ByteBuffer order = ByteBuffer.allocate(i7 + 16).order(ByteOrder.LITTLE_ENDIAN);
        order.put(bArr);
        order.position(i2);
        order.put(byteBuffer);
        order.position(i7);
        order.putLong((long) bArr.length);
        order.putLong((long) remaining);
        return order.array();
    }

    public void c() {
        j jVar = (j) this.f620a;
        if (jVar != null) {
            try {
                ((z) this.f621b).f7867t.unregisterReceiver(jVar);
            } catch (IllegalArgumentException unused) {
            }
            this.f620a = null;
        }
    }

    public void d() {
        U u6 = (U) this.f620a;
        HashSet hashSet = u6.f5067e;
        if (hashSet.remove((d) this.f621b) && hashSet.isEmpty()) {
            u6.b();
        }
    }

    public s e(y yVar) {
        Class cls = (Class) this.f621b;
        return new G0.d((Context) this.f620a, yVar.a(File.class, cls), yVar.a(Uri.class, cls), cls);
    }

    public abstract IntentFilter f();

    public byte[] g(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
        if (byteBuffer.remaining() >= 16) {
            int position = byteBuffer.position();
            byte[] bArr3 = new byte[16];
            byteBuffer.position(byteBuffer.limit() - 16);
            byteBuffer.get(bArr3);
            byteBuffer.position(position);
            byteBuffer.limit(byteBuffer.limit() - 16);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            try {
                byte[] bArr4 = new byte[32];
                ((d) this.f621b).a(bArr, 0).get(bArr4);
                if (MessageDigest.isEqual(a.h(bArr4, k(bArr2, byteBuffer)), bArr3)) {
                    byteBuffer.position(position);
                    d dVar = (d) this.f620a;
                    dVar.getClass();
                    ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
                    dVar.k(bArr, allocate, byteBuffer);
                    return allocate.array();
                }
                throw new GeneralSecurityException("invalid MAC");
            } catch (GeneralSecurityException e6) {
                throw new AEADBadTagException(e6.toString());
            }
        } else {
            throw new GeneralSecurityException("ciphertext too short");
        }
    }

    public void h(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (byteBuffer.remaining() >= bArr2.length + 16) {
            int position = byteBuffer.position();
            d dVar = (d) this.f620a;
            dVar.getClass();
            if (byteBuffer.remaining() >= bArr2.length) {
                dVar.k(bArr, byteBuffer, ByteBuffer.wrap(bArr2));
                byteBuffer.position(position);
                byteBuffer.limit(byteBuffer.limit() - 16);
                if (bArr3 == null) {
                    bArr3 = new byte[0];
                }
                byte[] bArr4 = new byte[32];
                ((d) this.f621b).a(bArr, 0).get(bArr4);
                byte[] h = a.h(bArr4, k(bArr3, byteBuffer));
                byteBuffer.limit(byteBuffer.limit() + 16);
                byteBuffer.put(h);
                return;
            }
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }

    public abstract int i();

    public MenuItem j(MenuItem menuItem) {
        if (!(menuItem instanceof E.a)) {
            return menuItem;
        }
        E.a aVar = (E.a) menuItem;
        if (((n.j) this.f621b) == null) {
            this.f621b = new n.j(0);
        }
        MenuItem menuItem2 = (MenuItem) ((n.j) this.f621b).get(aVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        r rVar = new r((Context) this.f620a, aVar);
        ((n.j) this.f621b).put(aVar, rVar);
        return rVar;
    }

    public abstract d l(byte[] bArr, int i2);

    public abstract void m();

    public void n() {
        c();
        IntentFilter f6 = f();
        if (f6.countActions() != 0) {
            if (((j) this.f620a) == null) {
                this.f620a = new j(this);
            }
            ((z) this.f621b).f7867t.registerReceiver((j) this.f620a, f6);
        }
    }

    public f(Context context) {
        this.f620a = context;
    }

    public f(z zVar) {
        this.f621b = zVar;
    }
}
