package com.google.android.play.core.integrity;

final class a extends ap {

    /* renamed from: a  reason: collision with root package name */
    private String f6624a;

    /* renamed from: b  reason: collision with root package name */
    private y f6625b;

    public final ap a(y yVar) {
        this.f6625b = yVar;
        return this;
    }

    public final ap b(String str) {
        this.f6624a = str;
        return this;
    }

    public final aq c() {
        y yVar;
        String str = this.f6624a;
        if (str != null && (yVar = this.f6625b) != null) {
            return new aq(str, yVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f6624a == null) {
            sb.append(" token");
        }
        if (this.f6625b == null) {
            sb.append(" integrityDialogWrapper");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
