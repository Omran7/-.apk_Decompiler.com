package G5;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.j;

/* renamed from: G5.i0  reason: case insensitive filesystem */
public final class C0036i0 extends CancellationException {

    /* renamed from: a  reason: collision with root package name */
    public final transient v0 f918a;

    public C0036i0(String str, Throwable th, v0 v0Var) {
        super(str);
        this.f918a = v0Var;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C0036i0) {
                C0036i0 i0Var = (C0036i0) obj;
                if (!j.a(i0Var.getMessage(), getMessage()) || !j.a(i0Var.f918a, this.f918a) || !j.a(i0Var.getCause(), getCause())) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        int i2;
        String message = getMessage();
        j.b(message);
        int hashCode = (this.f918a.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        if (cause != null) {
            i2 = cause.hashCode();
        } else {
            i2 = 0;
        }
        return hashCode + i2;
    }

    public final String toString() {
        return super.toString() + "; job=" + this.f918a;
    }
}
