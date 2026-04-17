package F0;

import U0.c;
import android.util.Log;
import com.bumptech.glide.f;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.data.e;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: F0.d  reason: case insensitive filesystem */
public final class C0014d implements e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f680a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f681b;

    public /* synthetic */ C0014d(Object obj, int i2) {
        this.f680a = i2;
        this.f681b = obj;
    }

    public final Class b() {
        switch (this.f680a) {
            case 0:
                return ByteBuffer.class;
            default:
                return this.f681b.getClass();
        }
    }

    public final void c() {
        int i2 = this.f680a;
    }

    public final void cancel() {
        int i2 = this.f680a;
    }

    public final int e() {
        switch (this.f680a) {
            case 0:
                return 1;
            default:
                return 1;
        }
    }

    public final void f(f fVar, d dVar) {
        switch (this.f680a) {
            case 0:
                try {
                    dVar.d(c.a((File) this.f681b));
                    return;
                } catch (IOException e6) {
                    if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                        Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e6);
                    }
                    dVar.a(e6);
                    return;
                }
            default:
                dVar.d(this.f681b);
                return;
        }
    }

    private final void a() {
    }

    private final void d() {
    }

    private final void g() {
    }

    private final void h() {
    }
}
