package okhttp3.internal.http2;

public enum ErrorCode {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    REFUSED_STREAM(7),
    CANCEL(8);
    

    /* renamed from: a  reason: collision with root package name */
    public final int f10787a;

    /* access modifiers changed from: public */
    ErrorCode(int i2) {
        this.f10787a = i2;
    }
}
