package Z3;

import c4.g;
import c4.o;
import c4.q;
import h4.C0567b;
import java.io.IOException;
import java.io.StringWriter;

public abstract class f {
    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            C0567b bVar = new C0567b(stringWriter);
            bVar.f8173e = true;
            o oVar = q.f5670a;
            g.d(bVar, this);
            return stringWriter.toString();
        } catch (IOException e6) {
            throw new AssertionError(e6);
        }
    }
}
