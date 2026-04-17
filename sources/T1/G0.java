package T1;

public enum G0 {
    UNINITIALIZED("uninitialized"),
    POLICY("eu_consent_policy"),
    DENIED("denied"),
    GRANTED("granted");
    

    /* renamed from: a  reason: collision with root package name */
    public final String f2840a;

    /* access modifiers changed from: public */
    G0(String str) {
        this.f2840a = str;
    }

    public final String toString() {
        return this.f2840a;
    }
}
