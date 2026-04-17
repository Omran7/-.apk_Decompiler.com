package com.google.android.play.core.integrity;

final class b extends bq {

    /* renamed from: a  reason: collision with root package name */
    private String f6672a;

    /* renamed from: b  reason: collision with root package name */
    private y f6673b;

    public final bq a(y yVar) {
        this.f6673b = yVar;
        return this;
    }

    public final bq b(String str) {
        if (str != null) {
            this.f6672a = str;
            return this;
        }
        throw new NullPointerException("Null token");
    }

    public final br c() {
        y yVar;
        String str = this.f6672a;
        if (str != null && (yVar = this.f6673b) != null) {
            return new br(str, yVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f6672a == null) {
            sb.append(" token");
        }
        if (this.f6673b == null) {
            sb.append(" integrityDialogWrapper");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
