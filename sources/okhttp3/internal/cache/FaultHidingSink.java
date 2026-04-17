package okhttp3.internal.cache;

import N5.d;
import N5.h;
import java.io.IOException;

class FaultHidingSink extends h {

    /* renamed from: b  reason: collision with root package name */
    public boolean f10703b;

    public final void close() {
        if (!this.f10703b) {
            try {
                super.close();
            } catch (IOException unused) {
                this.f10703b = true;
                c();
            }
        }
    }

    public final void f(long j6, d dVar) {
        if (this.f10703b) {
            dVar.a(j6);
            return;
        }
        try {
            super.f(j6, dVar);
        } catch (IOException unused) {
            this.f10703b = true;
            c();
        }
    }

    public final void flush() {
        if (!this.f10703b) {
            try {
                super.flush();
            } catch (IOException unused) {
                this.f10703b = true;
                c();
            }
        }
    }

    public void c() {
    }
}
