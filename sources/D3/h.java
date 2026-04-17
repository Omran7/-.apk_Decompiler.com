package D3;

import A3.c;
import A3.g;

public final class h implements g {

    /* renamed from: a  reason: collision with root package name */
    public boolean f574a = false;

    /* renamed from: b  reason: collision with root package name */
    public boolean f575b = false;

    /* renamed from: c  reason: collision with root package name */
    public c f576c;
    public final f d;

    public h(f fVar) {
        this.d = fVar;
    }

    public final g b(String str) {
        if (!this.f574a) {
            this.f574a = true;
            this.d.c(this.f576c, str, this.f575b);
            return this;
        }
        throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
    }

    public final g c(boolean z3) {
        if (!this.f574a) {
            this.f574a = true;
            this.d.b(this.f576c, z3 ? 1 : 0, this.f575b);
            return this;
        }
        throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
    }
}
