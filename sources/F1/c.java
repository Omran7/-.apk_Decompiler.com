package f1;

public enum c implements D3.c {
    REASON_UNKNOWN(0),
    MESSAGE_TOO_OLD(1),
    CACHE_FULL(2),
    PAYLOAD_TOO_BIG(3),
    MAX_RETRIES_REACHED(4),
    INVALID_PAYLOD(5),
    SERVER_ERROR(6);
    

    /* renamed from: a  reason: collision with root package name */
    public final int f7891a;

    /* access modifiers changed from: public */
    c(int i2) {
        this.f7891a = i2;
    }

    public final int a() {
        return this.f7891a;
    }
}
