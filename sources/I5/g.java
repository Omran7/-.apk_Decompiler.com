package I5;

import o5.i;

public final class g extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    public final transient i f1255a;

    public g(i iVar) {
        this.f1255a = iVar;
    }

    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final String getLocalizedMessage() {
        return this.f1255a.toString();
    }
}
